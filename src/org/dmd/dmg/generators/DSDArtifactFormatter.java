//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmg.generators;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DSDefinitionModule;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmw.DSDefinitionModuleIterableDMW;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.ManagedFileWriter;
import org.dmd.util.codegen.ImplementsManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The DSDArtifactFormatter will generate a variety of artifacts based on the specification of
 * a DSDefinitionModule. This includes a definition manager for the DSD and a DSD parser.
 */
public class DSDArtifactFormatter {

	String						fileHeader;
	PrintStream					progress;
	
	public DSDArtifactFormatter(){
		
	}
	
	/**
	 * This method will determine if the schema for which we're generating artifacts
	 * includes any DSD module definitions and, if so, will generate the classes
	 * that provide base DSD functionality.
	 * @param config
	 * @param loc
	 * @param f
	 * @param sd the schema to load from the DMG config
	 * @param sm
	 * @throws IOException  
	 * @throws DmcNameClashException 
	 * @throws DmcValueException 
	 */
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaDefinition sd, SchemaManager sm) throws IOException, DmcNameClashException, DmcValueException {
		DebugInfo.debug(loc.toString());
		
		DebugInfo.debug(config.toOIF());
		
		if (sm.getDSDefinitionModulesCount() > 0){
			
			String dirname = checkOutputDirectory(loc);
			
			// The call to generateDefinitionManager will populate this map with the complete
			// set of modules from which we'll need definitions. This is used later when we
			// we build the generation coordinator
			TreeMap<String,DSDefinitionModule> includedModules = new TreeMap<String, DSDefinitionModule>();

			
			Iterator<DSDefinitionModule> it =  sm.getDSDefinitionModules();
			while(it.hasNext()){
				DSDefinitionModule module = it.next();
				DebugInfo.debug("DSDMODULE " + module.getName().getNameString());
				
				// We only generate code for modules defined in the schema that
				// was specified as part of the DMG config
				if (module.getDefinedIn().getName().equals(sd.getName())){
					generateDefinitionManager(config, dirname, module, includedModules);
					generateGlobalInterface(config, dirname, module);
					generateScopedInterface(config, dirname, module);
					generateParsingCoordinator(config, dirname, module, includedModules, sm);
					generateParser(config, dirname, module, sm);
					generateGeneratorInterface(config, dirname, module, sm);
					
					generateBaseUtility(config, dirname, module, includedModules);
				}
			}
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	void generateDefinitionManager(DmgConfigDMO config, String dir, DSDefinitionModule ddm, TreeMap<String, DSDefinitionModule> includedModules) throws IOException {
		if (fileHeader != null)
			FileUpdateManager.instance().fileHeader(fileHeader);
		
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "DefinitionManager.java");
		
		ImportManager imports = new ImportManager();
		ImplementsManager impl = new ImplementsManager();
		
//		// When we build up the set of imports we'll need, we also build the complete set of
//		// modules from which we'll need definitions.
//		TreeMap<String,DSDefinitionModule> includedModules = new TreeMap<String, DSDefinitionModule>();
		
		getImportsForDefinitions(imports, impl, ddm, includedModules);
		
		impl.addImplements("DmcNameResolverWithClashSupportIF");
		impl.addImplements("DmcNameClashResolverIF");
		
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		imports.addImport("org.dmd.dms.DSDefinition", "The base of all definitions");
		imports.addImport("org.dmd.dmc.definitions.DmcDefinitionSet", "Our base to provide definition set storage");
		imports.addImport("java.util.Iterator", "To allow access to our definitions");
		imports.addImport("org.dmd.dmc.types.DotName", "To support the find method for definitions");
		imports.addImport("org.dmd.dmc.DmcNameClashResolverIF", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcNameResolverWithClashSupportIF", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcNamedObjectIF", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcObject", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcObjectName", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcValueExceptionSet", "Can be thrown when we try to resolve references");
		imports.addImport("org.dmd.dmc.DmcValueException", "Can be thrown when we try to resolve references");
		imports.addImport("org.dmd.dmc.DmcAttributeInfo", "Used when resolving clashes");
		imports.addImport("org.dmd.dmc.DmcNameClashObjectSet", "Used when resolving clashes");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "Used when resolving clashes");
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + ddm.getName() + "DefinitionManager " + impl.getFormattedImplementations() + "{\n\n");
		
		out.write("    DmcDefinitionSet<DSDefinition>	allDefinitions;\n");
		out.write("\n");
		
		dumpDefinitionManagerMembers(out, includedModules);
		
		out.write("    public " + ddm.getName() + "DefinitionManager(){\n\n");
		
		out.write("        // This will be populated as a result of adding definitions to the definition sets for each definition type\n");
		out.write("        allDefinitions = new DmcDefinitionSet<DSDefinition>(\"allDefinitions\");\n\n");
		initializeDefinitionManagerMembers(out, includedModules);
		
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void resolveReferences() throws DmcValueExceptionSet {\n");
		out.write("        for(DSDefinition def: allDefinitions.values()){\n");
		out.write("            def.resolveReferences(this,this);\n");
		out.write("        }\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    @Override\n");
		out.write("    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {\n");
		out.write("        DSDefinition def = null;\n");
    	out.write("        try {\n");
    	out.write("    	       def = allDefinitions.getDefinition(name.toString());\n");
    	out.write("        } catch (DmcNameClashException e) {\n");
    	out.write("    	       // TODO Auto-generated catch block\n");
    	out.write("    	       e.printStackTrace();\n");
    	out.write("        } catch (DmcValueException e) {\n");
    	out.write("    	       // TODO Auto-generated catch block\n");
    	out.write("    	       e.printStackTrace();\n");
    	out.write("        }\n");
    	out.write("\n");
    	out.write("        return(def);\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    @Override\n");
		out.write("    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {\n");
		out.write("        throw(new IllegalStateException(\"This method is not supported on generated definition managers\"));\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    @Override\n");
		out.write("    public DmcObject findNamedDMO(DmcObjectName name) {\n");
		out.write("        DSDefinition def = null;\n");
    	out.write("        try {\n");
    	out.write("    	       def = allDefinitions.getDefinition(name.toString());\n");
    	out.write("        } catch (DmcNameClashException e) {\n");
    	out.write("    	       // TODO Auto-generated catch block\n");
    	out.write("    	       e.printStackTrace();\n");
    	out.write("        } catch (DmcValueException e) {\n");
    	out.write("    	       // TODO Auto-generated catch block\n");
    	out.write("    	       e.printStackTrace();\n");
    	out.write("        }\n");
    	out.write("\n");
    	out.write("        if (def==null)\n");
    	out.write("            return(null);\n");
    	out.write("\n");
    	out.write("        return(def.getDMO());\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    @Override\n");
		out.write("    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {\n");
		out.write("        DmcNamedObjectIF rc = null;\n");
		out.write("        DotName dn = new DotName(name.getNameString() + \".\" + ai.type);\n");
		out.write("    \n");
		out.write("        // The name might contain module.defname, in which case we'll try to look it up\n");
		out.write("        // using a fully qualified DotName of the form module.defname.type. Otherwise,\n");
		out.write("        // we use the getDefinitionByNameAndType() form of the lookup.\n");
		out.write("        if (name.getNameString().indexOf(\".\") == -1){\n");
		out.write("            try{\n");
		out.write("                rc = allDefinitions.getDefinitionByNameAndType(dn);\n");
		out.write("            } catch (DmcNameClashException e) {\n");
		out.write("                rc = resolver.resolveClash(object, ai, e.getClashSet());\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        else{\n");
		out.write("            rc = allDefinitions.getDefinition(dn);\n");
		out.write("        }\n");
		out.write("    \n");
		out.write("        return(rc);\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    @Override\n");
		out.write("    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {\n");
		out.write("        DmcNamedObjectIF rc = null;\n");
		out.write("        DSDefinition resolving = (DSDefinition) obj.getContainer();\n");
		out.write("    \n");
		out.write("        Iterator<DmcNamedObjectIF> it = ncos.getMatches();\n");
		out.write("        while(it.hasNext()){\n");
		out.write("            DSDefinition def = (DSDefinition) it.next();\n");
		out.write("            if (resolving.getNameOfModuleWhereThisCameFrom().equals(def.getNameOfModuleWhereThisCameFrom())){\n");
		out.write("                rc = def;\n");
		out.write("                break;\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        return(rc);\n");
		out.write("    }\n\n");
		
		
		
		dumpDefinitionInterfaceMethods(out, includedModules);
		
		out.write("}\n\n");
		
		out.close();
	}
	
	/**
	 * This method will call itself recursively until we've progressed through all
	 * dependencies of a given DSD module via the refersToDefsFromDSD attribute.
	 * @param imports place to gather imports
	 * @param ddm the definition for which we're gathering imports
	 * @param includedModules the names of modules from which we've already gathered import info
	 */
	void getImportsForDefinitions(ImportManager imports, ImplementsManager impl, DSDefinitionModule ddm, TreeMap<String, DSDefinitionModule> includedModules){
		ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
		
		imports.addImport(ddm.getGlobalInterfaceImport(), "Interface for " + ddm.getName() + " definitions");
		impl.addImplements(ddm.getGlobalInterfaceName());
		
		imports.addImport(dsd.getDmeImport(), "A definition from the " + ddm.getName() + " Module");
		
		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
			imports.addImport(cd.getDmeImport(), "A definition from the " + ddm.getName() + " Module");
		}
		
		includedModules.put(ddm.getName().getNameString(),ddm);
		
		if (ddm.getRefersToDefsFromDSDSize() > 0){
			DSDefinitionModuleIterableDMW it = ddm.getRefersToDefsFromDSD();
			while(it.hasNext()){
				DSDefinitionModule module = it.next();
				if (includedModules.get(module.getName().getNameString()) == null)
					getImportsForDefinitions(imports, impl, module, includedModules);
			}
		}
	}
	
	void dumpDefinitionManagerMembers(ManagedFileWriter out, TreeMap<String,DSDefinitionModule> modules) throws IOException {
		for(DSDefinitionModule ddm : modules.values()){
			ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
			
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    DmcDefinitionSet<" + dsd.getName() + "> " + dsd.getName() + "Defs;\n");
			
			TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
			for(ClassDefinition cd : allDerived.values()){
				out.write("    DmcDefinitionSet<" + cd.getName() + "> " + cd.getName() + "Defs;\n");			
			}
		}
		out.write("\n");
	}
	

	
	/**
	 * 
	 * @param out
	 * @param modules
	 * @throws IOException
	 */
	void dumpDefinitionInterfaceMethods(ManagedFileWriter out, TreeMap<String,DSDefinitionModule> modules) throws IOException {
		for(DSDefinitionModule ddm : modules.values()){
			out.write(ddm.getInterfaceMethodsImplementations(false));
		}
		out.write("\n");
	}	
	
	void initializeDefinitionManagerMembers(ManagedFileWriter out, TreeMap<String,DSDefinitionModule> modules) throws IOException {
		out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		for(DSDefinitionModule ddm : modules.values()){
			ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
			
			out.write("        " + dsd.getName() + "Defs = new DmcDefinitionSet<" + dsd.getName() + ">(\"" + dsd.getName() + "\", allDefinitions);\n");
			
			TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
			for(ClassDefinition cd : allDerived.values()){
				out.write("        " + cd.getName() + "Defs = new DmcDefinitionSet<" + cd.getName() + ">(\"" + cd.getName() + "\", allDefinitions);\n");
			}
		}
		out.write("\n");
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * This method generates an interface that has the methods required to store and retrieve
	 * the definitions associated with a particular DSD module, including the module type itself.
	 * This interface is implemented by any definition manager that manages the definitions of a
	 * particular DSD module. This approach allows for the injection of a definition manager
	 * into the type specific DSD module parsers.
	 * @param config
	 * @param dir
	 * @param ddm
	 * @throws IOException  
	 */
	void generateGlobalInterface(DmgConfigDMO config, String dir, DSDefinitionModule ddm) throws IOException {
		ImportManager imports = new ImportManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "GlobalInterface.java");
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		imports.addImport("java.util.Iterator", "To provide iterators over definitions");
		ddm.getImportsForInterface(imports, false);
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("/**\n");
		out.write(" * This interface is implemented by definition managers that store definitions from the " + ddm.getName() + " module.\n");
		out.write(" */\n");
		out.write("public interface " + ddm.getName() + "GlobalInterface {\n\n");
		
		out.write(ddm.getInterfaceMethods(false));
		
		out.write("}\n\n");

		out.close();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * This method generates an interface that has the methods required to store and retrieve
	 * just the definitions associated with a particular DSD module, NOT including the module
	 * type itself. This interface is implemented by the module class so that we can, from 
	 * a paticular module, access the definitions defined as part of that module.
	 * @param config
	 * @param dir
	 * @param ddm
	 * @throws IOException  
	 */
	void generateScopedInterface(DmgConfigDMO config, String dir, DSDefinitionModule ddm) throws IOException {
		ImportManager imports = new ImportManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "ScopedInterface.java");
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		imports.addImport("java.util.Iterator", "To provide iterators over definitions");
		ddm.getImportsForInterface(imports, true);
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("/**\n");
		out.write(" * This interface is implemented by the generated wrapper class for the " + ddm.getName() + " module.\n");
		out.write(" */\n");
		out.write("public interface " + ddm.getName() + "ScopedInterface {\n\n");
		
		out.write(ddm.getInterfaceMethods(true));
		
		out.write("}\n\n");

		out.close();
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////
	
	
	void generateParser(DmgConfigDMO config, String dir, DSDefinitionModule ddm, SchemaManager sm) throws IOException, DmcNameClashException, DmcValueException {
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "Parser.java");
		
		ImportManager imports = new ImportManager();
		
		imports.addImport("org.dmd.dms.SchemaManager", "Manages the schemas we use");
//		imports.addImport("org.dmd.util.parsing.ConfigFinder", "Used to find definition config files");
		imports.addImport("org.dmd.util.parsing.DmcUncheckedOIFParser", "Basic parsing of objects");
		imports.addImport("org.dmd.util.parsing.DmcUncheckedOIFHandlerIF", "Basic parsing of objects");
		imports.addImport("org.dmd.dmc.util.DmcUncheckedObject", "Basic parsing of objects");
		imports.addImport("org.dmd.dmc.definitions.DsdParserInterface", "Standard parser interface");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Config file location info");
		imports.addImport("org.dmd.dmw.DmwObjectFactory", "Constructs wrapped objects");
		imports.addImport(ddm.getGlobalInterfaceImport(), "Interface to our definition storage");
		
		if (ddm.getSupportDynamicSchemaLoading()){
			imports.addImport("java.util.Iterator", "To iterate over collections");
			imports.addImport("org.dmd.dms.SchemaDefinition", "To support dynamic loading of schemas");
		}
				
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		SchemaDefinition sd = ddm.getDefinedIn();
		String schemaName = GeneratorUtils.dotNameToCamelCase(sd.getName().getNameString());
		
		imports.addImport(sd.getDmwPackage() + ".generated." + schemaName + "SchemaAG", "The schema recognized by this parser");
		imports.addImport("org.dmd.dmc.DmcValueException", "May be thrown when parsing objects");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "May be thrown when instantiating objects");
		imports.addImport("org.dmd.util.exceptions.ResultException", "May be thrown by schema management");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "May be thrown by rule manager");
		imports.addImport("org.dmd.dmv.shared.DmvRuleManager", "The injected rule manager used for initializations");
		imports.addImport("org.dmd.dms.generated.dmw.StringIterableDMW", "To iterate over defFiles");
		imports.addImport("org.dmd.dmc.rules.SourceInfo", "To indicate the source of rule problems");
		imports.addImport("org.dmd.dmw.DmwWrapper", "To handle factory created objects");
		
		// Get the class that was generated for the module
		ClassDefinition ddmClass = sm.isClass(ddm.getName().getNameString());
		imports.addImport(ddmClass.getDmeImport(), "The kind of DDM we're reading");
		
		// The get the imports for each definition type and populate the structural definitions list
		// that we'll use later
		ArrayList<ClassDefinition> structuralDefs = new ArrayList<ClassDefinition>();
		getImportsForDefinitionsInSingleModule(imports, ddm, structuralDefs);
		
		out.write(imports.getFormattedImports() + "\n");
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + ddm.getName() + "Parser implements DsdParserInterface, DmcUncheckedOIFHandlerIF {\n\n");
		
		out.write("    final static String fileExtension = \"" + ddm.getFileExtension() + "\";\n\n");
		
		MemberManager members = new MemberManager();
		members.addMember("SchemaManager",                   "schema", "Manages the schema for this DSD");
		members.addMember("DmcUncheckedOIFParser",           "parser", "new DmcUncheckedOIFParser(this)", "Parses objects from the config file");
		members.addMember("DmwObjectFactory",                "factory", "Instantiates wrapped objects");
		members.addMember(ddm.getGlobalInterfaceName(),      "definitions", "Place to store parsed definitions");
		members.addMember("DmvRuleManager", 				 "rules", "The overall rule manager");
		members.addMember("ConfigLocation",					 "location", "The location of the config being parsed");
		members.addMember(ddmClass.getName().getNameString(),"module", "The DDM module");
		
		out.write(members.getFormattedMembers());
		out.write("\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public " + ddm.getName() + "Parser(" + ddm.getGlobalInterfaceName() + " d, DmvRuleManager r) throws ResultException, DmcValueException, DmcNameClashException {\n");
		out.write("        schema = new SchemaManager();\n");
		out.write("        schema.manageSchema(new " + schemaName + "SchemaAG());\n");
		out.write("        \n");
		out.write("        factory      = new DmwObjectFactory(schema);\n");
		out.write("        \n");
		out.write("        definitions  = d;\n");
		out.write("        rules        = r;\n");
		out.write("    }\n\n");
		
		out.write("    public String getFileExtension(){\n");
		out.write("        return(fileExtension);\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public " + ddm.getName() + " parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("        location = l;\n");
		out.write("\n");
		out.write("        // We're starting to parse a new config. Reset the module to null so that we only parse one module per config.\n");
		out.write("        module = null;\n");
		out.write("\n");
		out.write("        if (location.isFromJAR()){\n");
		out.write("            System.out.println(\"Reading: \" + location.getFileName() + \" - from \" + location.getJarFilename());\n");
		out.write("            parser.parseFile(location.getFileName(),true);\n");
		out.write("        }\n");
		out.write("        else{\n");
		out.write("            System.out.println(\"Reading: \" + location.getFileName());\n");
		out.write("            parser.parseFile(location.getFileName());\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        if (module.getDefFilesHasValue()){\n");
		out.write("            StringIterableDMW it = module.getDefFilesIterable();\n");
		out.write("            while(it.hasNext()){\n");
		out.write("                String fn = location.getDirectory() + \"/\" + it.next();\n");
		out.write("\n");
		out.write("                if (location.isFromJAR())\n");
		out.write("                    parser.parseFile(fn,true);\n");
		out.write("                else\n");
		out.write("                    parser.parseFile(fn);\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        return(module);\n");
		out.write("    }\n\n");
		
		String definedInModuleMethod = "set" + GeneratorUtils.dotNameToCamelCase(ddm.getDefinedInModuleAttribute().getName().getNameString());
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		ClassDefinition baseClass = (ClassDefinition) ddm.getBaseDefinition();
		out.write("    @Override\n");
		out.write("    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("        " + baseClass.getName() + " definition = null;\n");
		out.write("        DmwWrapper wrapper = null;\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            wrapper = factory.createWrapper(uco);\n");
		out.write("            definition = (" + baseClass.getName() + ") wrapper;\n");
		out.write("        } catch (ClassNotFoundException e) {\n");
		out.write("            ResultException ex = new ResultException(\"Unknown object class: \" + uco.classes.get(0));\n");
		out.write("            ex.result.lastResult().fileName(infile);\n");
		out.write("            ex.result.lastResult().lineNumber(lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch (ResultException ex){\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch(DmcValueException e){\n");
		out.write("            ResultException ex = new ResultException();\n");
		out.write("            ex.addError(e.getMessage());\n");
		out.write("            if (e.getAttributeName() != null)\n");
		out.write("                ex.result.lastResult().moreMessages(\"Attribute: \" + e.getAttributeName());\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch(ClassCastException e){\n");
		out.write("            ResultException ex = new ResultException();\n");
		out.write("            ex.addError(\"The following object is not valid in a ." + ddm.getFileExtension() + " file:\\n\\n\" + wrapper.toOIF());\n");
		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        definition.setLineNumber(lineNumber);\n");
		out.write("        definition.setFile(infile);\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            // Run the rules against the definition\n");
		out.write("            rules.executeInitializers(definition.getDmcObject());\n");
		out.write("            rules.executeAttributeValidation(definition.getDmcObject());\n");
		out.write("            rules.executeObjectValidation(definition.getDmcObject());\n");
		out.write("        }\n");
		out.write("        catch(DmcRuleExceptionSet ex){\n");
		out.write("            ex.source(new SourceInfo(infile, lineNumber));\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        // The first definition we expect is the module definition\n");
		out.write("        if (module == null){\n");
		out.write("            if (definition instanceof " + ddm.getName() + "){\n");
		out.write("                module = (" + ddm.getName() + ")definition;\n");
		out.write("            \n");
		out.write("                definition.setDotName(module.getName() + \".\" + definition.getConstructionClassName());\n");
		out.write("                definition.setNameAndTypeName(module.getName() + \".\" + definition.getConstructionClassName());\n");
		out.write("            \n");
		out.write("                module." + definedInModuleMethod + "(module);\n");
		out.write("                definitions.add" + ddm.getName() + "(module);\n");
		
		if (ddm.getSupportDynamicSchemaLoading()){
			out.write("                if (module.getLoadSchemaClassHasValue()){\n");
			out.write("                    loadSchemas(module);\n");
			out.write("                }\n");
		}

		out.write("            }\n");
		out.write("            else{\n");
		out.write("                ResultException ex = new ResultException(\"Expecting a " + ddm.getName() + " module definition\");\n");
		out.write("                ex.setLocationInfo(infile, lineNumber);\n");
		out.write("                throw(ex);\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        else{\n");
		out.write("            // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("            if (definition instanceof " + ddm.getName() + "){\n");
		out.write("                ResultException ex = new ResultException(\"Multiple " + ddm.getName() + " definitions while parsing config: \" + location.getFileName());\n");
		out.write("                ex.setLocationInfo(infile, lineNumber);\n");
		out.write("                throw(ex);\n");
		out.write("            }\n");
		out.write("            \n");
		out.write("            definition." + definedInModuleMethod + "(module);\n");
		out.write("            definition.setDotName(module.getName() + \".\" + definition.getName() + \".\" + definition.getConstructionClassName());\n");
		out.write("            definition.setNameAndTypeName(definition.getName() + \".\" + definition.getConstructionClassName());\n");
		out.write("            \n");
		
		boolean first = true;
		String condition = "if";
		for(ClassDefinition cd: structuralDefs){
			out.write("            " + condition + " (definition instanceof " + cd.getName() + "){\n");
			out.write("                definitions.add" + cd.getName() + "((" + cd.getName() + ")definition);\n");
			out.write("                module.add" + cd.getName() + "((" + cd.getName() + ")definition);\n");
			out.write("            }\n");
			if (first)
				condition = "else if";
		}
		out.write("\n");
		
		out.write("        }\n");
		out.write("\n");
		out.write("    }\n");
		
		if (ddm.getSupportDynamicSchemaLoading()){
			writeLoadSchemasFunction(out, ddm);
		}
		
		out.write("}\n\n");
		
		out.close();		
	}
	
	void writeLoadSchemasFunction(ManagedFileWriter out, DSDefinitionModule ddm) throws IOException {
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    void loadSchemas(GpbModule module) throws ResultException {\n");
		out.write("    	   Class<?> schemaClass = null;\n");
		out.write("    	   SchemaDefinition sd	= null;\n");
		out.write("    	   Iterator<String> it = module.getDMO().getLoadSchemaClass();\n");
		out.write("        while(it.hasNext()){\n");
		out.write("		       String cn = it.next();\n");
		out.write("		       try {\n");
		out.write("			       schemaClass = Class.forName(cn);\n");
		out.write("            } catch (ClassNotFoundException e) {\n");
		out.write("                ResultException ex = new ResultException(e);\n");
		out.write("                ex.addError(\"Couldn't load schema class: \" + cn);\n");
		out.write("                ex.setLocationInfo(module.getFile(), module.getLineNumber());\n");
		out.write("                throw(ex);\n");
		out.write("            }\n");
		out.write("\n");
		out.write("            try {\n");
		out.write("                Object obj = schemaClass.newInstance();\n");
		out.write("\n");
		out.write("                if (obj instanceof SchemaDefinition){\n");
		out.write("                    sd = (SchemaDefinition) obj;\n");
		out.write("                }\n");
		out.write("                else{\n");
		out.write("                    ResultException ex = new ResultException(\"The specified class is not a SchemaDefinition: \" + cn);\n");
		out.write("                    ex.setLocationInfo(module.getFile(), module.getLineNumber());\n");
		out.write("                    throw(ex);\n");
		out.write("                }\n");
		out.write("            } catch (Exception e) {\n");
		out.write("                ResultException ex = new ResultException(e);\n");
		out.write("                ex.addError(\"Couldn't instantiate schema class: \" + cn);\n");
		out.write("                ex.setLocationInfo(module.getFile(), module.getLineNumber());\n");
		out.write("                throw(ex);\n");
		out.write("            }\n");
		out.write("\n");
		out.write("                try {\n");
		out.write("                    if (schema.isSchema(sd.getInstance().getName().getNameString()) == null){\n");
		out.write("                        schema.manageSchema(sd);\n");
		out.write("                    }\n");
		out.write("                } catch (DmcValueException e) {\n");
		out.write("                    // TODO Auto-generated catch block\n");
		out.write("                    e.printStackTrace();\n");
		out.write("                } catch (DmcNameClashException e) {\n");
		out.write("                    // TODO Auto-generated catch block\n");
		out.write("                    e.printStackTrace();\n");
		out.write("                }\n");
		out.write("\n");
		out.write("        }\n");
		out.write("    }\n");
		
	}
	
	/**
	 * We populate the imports with the base definition and the various derived definitions that are structural.
	 * We don't bother with abstract defs because they'll never be specified in a config. We also hold on to
	 * the structural classes so that we can generate the object handling code later.
	 * @param imports the import manager to populate
	 * @param ddm the DDM we're generating for
	 * @param structuralDefs place to store the structural definition classes
	 */
	void getImportsForDefinitionsInSingleModule(ImportManager imports, DSDefinitionModule ddm, ArrayList<ClassDefinition> structuralDefs){
		ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
		
		imports.addImport(dsd.getDmeImport(), "The base definition from the " + ddm.getName() + " Module");
		
		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
//		for(ClassDefinition cd : dsd.getDerivedClasses()){
			if (cd.getClassType() == ClassTypeEnum.STRUCTURAL){
				// Add the structural classes except for the one that represents the module
				if (!cd.getName().getNameString().equals(ddm.getName().getNameString())){
					imports.addImport(cd.getDmeImport(), "A definition from the " + ddm.getName() + " Module");
					structuralDefs.add(cd);
				}
			}
		}
				
	}
	
	/**
	 * This method generates the overall generation coordinator for a particular DSD module. The
	 * generation coordinator will find all config files associated with a particular DSD type
	 * on the basis of its file extension (and the file extensions of other DSDs on which the
	 * base DSD depends). 
	 * @param config
	 * @param dir
	 * @param ddm
	 * @throws IOException  
	 * @throws DmcNameClashException 
	 * @throws DmcValueException 
	 */
	void generateParsingCoordinator(DmgConfigDMO config, String dir, DSDefinitionModule ddm, TreeMap<String, DSDefinitionModule> includedModules, SchemaManager sm) throws IOException, DmcNameClashException, DmcValueException {
		ImportManager 	imports = new ImportManager();
		MemberManager	members	= new MemberManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "ParsingCoordinator.java");
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		imports.addImport("java.io.IOException", "If we run it to problems finding configs");
		imports.addImport("java.util.Iterator", "To iterate over collections");
		imports.addImport("java.util.ArrayList", "To handle lists of things");
		imports.addImport("java.util.TreeMap", "To handle loaded configs");
		
		imports.addImport("org.dmd.dmc.types.DefinitionName", "Allows storage of parsed configs by name");
		imports.addImport("org.dmd.dms.DSDefinition", "The common base for all modules - so that we can get error location info");
		imports.addImport("org.dmd.dmc.DmcValueException", "To handle exceptions from value handling");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "To handle exceptions from parsing objects");
		imports.addImport("org.dmd.util.exceptions.ResultException", "To handle processing exceptions");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "In case we have rule failures");
		
		imports.addImport("org.dmd.util.parsing.ConfigFinder", "Finds configs we may need to parse");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Handle to a discovered configuration");
		imports.addImport("org.dmd.util.parsing.ConfigVersion", "Handle to a particular config version");
		imports.addImport("org.dmd.dmc.DmcValueExceptionSet", "May occur when resolving objects");
		
		imports.addImport("org.dmd.dmv.shared.DmvRuleManager", "Allows for application of rules to our definitions");
		members.addMember("DmvRuleManager", "rules", "new DmvRuleManager()", "Rule manager");
		
		imports.addImport(ddm.getDefinitionManagerImport(), "Maintains all parsed definitions");
		members.addMember(ddm.getDefinitionManagerName(), "definitions", "new " + ddm.getDefinitionManagerName() + "()", "Maintains all parsed definitions");
		
		imports.addImport(ddm.getGeneratorInterfaceImport(), "The generator we call");
		members.addMember(ddm.getGeneratorInterfaceName(), "generator", "Injected generator that we call when config loading is complete");
		members.addMember("TreeMap<String, ModuleInfoBase>", "loadedConfigs", "new TreeMap<String, ModuleInfoBase>()", "Stores all loaded configs based on the name of the file that was parsed.");
		
		for(DSDefinitionModule mod: includedModules.values()){
			ClassDefinition ddmClass = sm.isClass(mod.getName().getNameString());
			imports.addImport(ddmClass.getDmeImport(), "One of the DDS modules we might load");
			
			imports.addImport(ddmClass.getDmtREFImport(), "To access references to " + ddm.getName());

			imports.addImport(mod.getDefinitionParserImport(), "Required to parse " + mod.getName() + " definitions");
			members.addMember(mod.getDefinitionParserName(), "parserFor" + mod.getName(), "Parser for " + mod.getName() + " definitions");
			imports.addImport(mod.getDefinedIn().getDMSASGImport(),"To allow loading of rules from the " + mod.getDefinedIn().getName() + " schema");
			members.addMember("ConfigFinder", "finderFor" + mod.getName(), "new ConfigFinder(\"" + mod.getFileExtension() + "\")", "Config finder for " + mod.getName() + " config files ending with ." + mod.getFileExtension());
			members.addMember("TreeMap<DefinitionName, " + mod.getName() + "Info>", "loaded" + mod.getName() + "Configs", "new TreeMap<DefinitionName, " + mod.getName() + "Info>()", "The names/location of the " + mod.getName() + " modules that have been loaded\n");
		}
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("/**\n");
		out.write(" * The parsing coordinator will find all config files associated with the " + ddm.getName()+ " DSD\n");
		out.write(" * and coordinate the parsing of the initial config file and all files on which it depends.\n");
		out.write(" */\n");
		out.write("public class " + ddm.getName() + "ParsingCoordinator {\n\n");
		
		out.write(members.getFormattedMembers() + "\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public " + ddm.getName() + "ParsingCoordinator(" + ddm.getGeneratorInterfaceName() + " g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {\n");

		out.write("\n");
		out.write("        generator = g;\n");
		out.write("\n");
		
		for(DSDefinitionModule mod: includedModules.values()){
			out.write("        rules.loadRules(" + mod.getDefinedIn().getDMSASGName() + ".instance());\n");			
			out.write("        parserFor" + mod.getName() + " = new " + mod.getDefinitionParserName() + "(definitions, rules);\n");		
			out.write("        finderFor" + mod.getName() + ".setSourceAndJarInfo(sourceDirs,jars);\n");	
			out.write("        finderFor" + mod.getName() + ".findConfigs();\n");
			out.write("\n");
		}
		
		StringBuffer baseModuleLoaderFunctions = new StringBuffer();
		
		for(DSDefinitionModule mod: includedModules.values()){
			if (mod.getRequiredBaseModuleSize() > 0){
				baseModuleLoaderFunctions.append("\n");
				baseModuleLoaderFunctions.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				baseModuleLoaderFunctions.append("    void loadBaseModule" + mod.getName() + "(String config) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {\n");
				baseModuleLoaderFunctions.append("        ConfigVersion version = finderFor" + ddm.getName() + ".getConfig(config);\n");
				baseModuleLoaderFunctions.append("        \n");
				baseModuleLoaderFunctions.append("        if (version == null){\n");
				baseModuleLoaderFunctions.append("            ResultException ex = new ResultException(\"Could not find the specified base configuration file: \" + config);\n");
				baseModuleLoaderFunctions.append("            ex.moreMessages(\"This is a base module required by the " + mod.getName() + " DSD\");\n");
				baseModuleLoaderFunctions.append("            ex.moreMessages(finderFor" + ddm.getName() + ".getSearchInfo());\n");
				baseModuleLoaderFunctions.append("            throw(ex);\n");
				baseModuleLoaderFunctions.append("        }\n");
				baseModuleLoaderFunctions.append("        \n");
				baseModuleLoaderFunctions.append("        ConfigLocation location = version.getLatestVersion();\n");
				baseModuleLoaderFunctions.append("        \n");
				baseModuleLoaderFunctions.append("        load" + mod.getName() + "Module(location);\n");
				baseModuleLoaderFunctions.append("    }\n\n");
				
				Iterator<String> bases = mod.getRequiredBaseModule();
				while(bases.hasNext()){
					out.write("        loadBaseModule" + mod.getName() + "(\"" + bases.next() + "\");\n");			
				}
			}
			
			
		}
		
		out.write("    }\n\n");
		out.write("\n");
		
		if (baseModuleLoaderFunctions.length() > 0){
			out.write(baseModuleLoaderFunctions.toString());
		}
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {\n");
		out.write("        ConfigVersion version = finderFor" + ddm.getName() + ".getConfig(configName);\n");
		out.write("        \n");
		out.write("        if (version == null){\n");
		out.write("            ResultException ex = new ResultException(\"Could not find the specified configuration file: \" + configName);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        ConfigLocation location = version.getLatestVersion();\n");
		out.write("        \n");
		out.write("        " + ddm.getName() + " loaded = load" + ddm.getName() + "Module(location);\n");
		out.write("        \n");
		out.write("        if (location.isFromJAR()){\n");
		out.write("            ResultException ex = new ResultException(\"We can't run generation for a config loaded from a JAR: \" + configName);\n");
		out.write("            ex.moreMessages(location.toString());\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        generator.parsingComplete(loaded, location, definitions);\n");
		out.write("        \n");
		out.write("        definitions.resolveReferences();\n");
		out.write("        \n");
		out.write("        generator.generate(loaded,location,definitions);\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void generateForAllConfigs() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("        " + ddm.getName() + " loaded = null;\n");
		out.write("        " + ddm.getName() + "Info loadedInfo = null;\n");
		out.write("\n");
		out.write("        Iterator<ConfigLocation> it = finderFor" + ddm.getName() + ".getLocations();\n");
		out.write("        while(it.hasNext()){\n");
		out.write("            ConfigLocation location = it.next();\n");
		out.write("\n");
		out.write("            loadedInfo = (" + ddm.getName() + "Info)loadedConfigs.get(location.getFileName());\n");
		out.write("\n");
		out.write("            if (loadedInfo == null){\n");
		out.write("                loaded = load" + ddm.getName() + "Module(location);\n");
//		out.write("                loaded = parserFor" + ddm.getName() + ".parseConfig(location);\n");
//		out.write("                loadedInfo = new " + ddm.getName() + "Info(loaded,location);\n");
//		out.write("                loaded" + ddm.getName() + "Configs.put(loaded.getName(), loadedInfo);\n");
//		out.write("                loadedConfigs.put(location.getFileName(), loadedInfo);\n");
//		out.write("\n");
//		out.write("                // We've loaded the base configuration file, now load any other modules on which it depends\n");
//		out.write("                loadModuleDependencies(loadedInfo);\n");
		out.write("            }\n");
		out.write("            else{\n");
		out.write("                loaded = loadedInfo.module;\n");
		out.write("            }\n");
		out.write("\n");
		out.write("            generator.parsingComplete(loaded, location, definitions);\n");
		out.write("\n");
		out.write("            if (!location.isFromJAR())\n");
		out.write("                generator.generate(loaded,location,definitions);\n");
		out.write("\n");
		out.write("        }\n");
		out.write("    }\n\n");
		
		
		for(DSDefinitionModule mod: includedModules.values()){
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    " + mod.getName() + " load" + mod.getName() + "Module(ConfigLocation location)  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");			
			out.write("        // If we've already loaded the file, skip it\n");
			out.write("        " + mod.getName() + "Info info = loaded" + mod.getName() + "Configs.get(new DefinitionName(location.getConfigName()));\n");
			out.write("        if (info != null)\n");
			out.write("            return(info.module);\n");
			out.write("\n");
			out.write("        " + mod.getName() + " loaded = parserFor" + mod.getName() + ".parseConfig(location);\n");
			out.write("        " + mod.getName()+ "Info loadedInfo = new " + mod.getName() + "Info(loaded,location);\n");
			out.write("        loaded" + mod.getName() + "Configs.put(loaded.getName(), loadedInfo);\n");
			out.write("        loadedConfigs.put(location.getFileName(), loadedInfo);\n");
			out.write("\n");
			out.write("        loadModuleDependencies(loadedInfo);\n");
			out.write("\n");
			out.write("        return(loaded);\n");
			out.write("    }\n\n");
		}
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    void loadModuleDependencies(ModuleInfoBase mi) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("\n");
		out.write("        if (mi.dependenciesLoaded)\n");
		out.write("            return;\n");
		out.write("\n");
		boolean first = true;
		for(DSDefinitionModule mod: includedModules.values()){
			Iterator<DSDefinitionModule> modit = mod.getDDMDependencies();
			
			if (first){
				out.write("        if (mi instanceof " + mod.getName() + "Info){\n");
				first = false;
			}
			else
				out.write("        else if (mi instanceof " + mod.getName() + "Info){\n");
			
			out.write("            " + mod.getName() + "Info info = (" + mod.getName() + "Info)mi;\n");
			
			formatModuleLoadDependencies(mod, modit, out);

			out.write("            info.dependenciesLoaded = true;\n");
			out.write("        }\n");
		}
		out.write("\n");
		out.write("\n");
		out.write("\n");
		out.write("\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    void missingConfigError(String missing) throws ResultException {\n");
		out.write("        ResultException ex = new ResultException(\"Could not find config: \" + missing);\n");
		out.write("        throw(ex);\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    void missingConfigError(DSDefinition module, String missing) throws ResultException {\n");
		out.write("        ResultException ex = new ResultException(\"Could not find config: \" + missing);\n");
		out.write("        ex.setLocationInfo(module.getFile(), module.getLineNumber());\n");
		out.write("        throw(ex);\n");
		out.write("    }\n\n");
		
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    class ModuleInfoBase {\n");
		out.write("        ConfigLocation location;\n");
		out.write("        boolean        dependenciesLoaded;\n");
		out.write("    }\n\n");
		
		for(DSDefinitionModule mod: includedModules.values()){
			out.write("    class " + mod.getName() + "Info extends ModuleInfoBase {\n");			
			out.write("        " + mod.getName() + " module;\n");
//			out.write("        ConfigLocation location;\n");
			out.write("\n");
			out.write("        " + mod.getName() + "Info(" + mod.getName() + " m, ConfigLocation l){\n");
			out.write("            module   = m;\n");
			out.write("            location = l;\n");
			out.write("        }\n");
			out.write("    }\n");
			out.write("\n");
		}

		out.write("}\n\n");

		out.close();
	}
	
	/**
	 * 
	 * @param module
	 * @param modit
	 * @param out
	 * @throws IOException
	 */
	void formatModuleLoadDependencies(DSDefinitionModule module, Iterator<DSDefinitionModule> modit, ManagedFileWriter out) throws IOException {
		while(modit.hasNext()){
			DSDefinitionModule dependsOn = modit.next();
			String getMethod = ".get" + GeneratorUtils.dotNameToCamelCase(dependsOn.getModuleDependenceAttribute().getName().getNameString() + "()");
			String hasValueMethod = ".get" + GeneratorUtils.dotNameToCamelCase(dependsOn.getModuleDependenceAttribute().getName().getNameString() + "HasValue()");

			out.write("            if (info.module" + hasValueMethod + "){\n");
			out.write("                Iterator<" + dependsOn.getName() + "REF> it = info.module.getDMO()" + getMethod + ";\n");
			out.write("                while(it.hasNext()){\n");
			out.write("                    " + dependsOn.getName() + "REF ref = it.next();\n");
			out.write("                    ConfigVersion version = finderFor" + dependsOn.getName() + ".getConfig(ref.toString());\n");
			out.write("                    \n");
			out.write("                    if (version == null)\n");
			out.write("                        missingConfigError(info.module,ref.toString() + \"." + dependsOn.getFileExtension() + "\");\n");
			out.write("            \n");
			out.write("                    load" + dependsOn.getName() + "Module(version.getLatestVersion());\n");
			out.write("                }\n");
			out.write("            }\n");
		}
	}
	
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Generates the base generation utility from which a tool builder can
	 * derive and specialize.
	 * @throws IOException 
	 */
	void generateBaseUtility(DmgConfigDMO config, String dir, DSDefinitionModule ddm, TreeMap<String, DSDefinitionModule> includedModules) throws IOException{
		ImportManager 	imports = new ImportManager();
		MemberManager	members	= new MemberManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "GenUtility.java");
		
		imports.addImport(ddm.getGeneratedDsdPackage() + "." + ddm.getName() + "ParsingCoordinator", "Parses modules required for generation");
		imports.addImport(ddm.getGeneratedDsdPackage() + "." + ddm.getName() + "GeneratorInterface", "Called by the parsing coordinator as configs are read");
		imports.addImport("org.dmd.util.parsing.CommandLine", "Commandline parsing");
		imports.addImport("org.dmd.util.BooleanVar", "Commandline flags");
		imports.addImport("org.dmd.util.parsing.StringArrayList", "Commandline string values");
		imports.addImport("java.io.IOException", "In case we have problems opening/writin got files");
		imports.addImport("org.dmd.util.exceptions.ResultException", "To handle parsing exceptions");
		imports.addImport("org.dmd.dmc.DmcValueException", "To handle fundamental value errors");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "To handle parsing errors");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "To handle rule errors");
		imports.addImport("org.dmd.dmc.DmcValueExceptionSet", "May occur when resolving objects");
		
		members.addMember(ddm.getName() + "ParsingCoordinator", "parser", "Module parser");
		members.addMember("CommandLine", "commandLine", "new CommandLine()", "Commandline parser");
		members.addMember("BooleanVar", "helpFlag", "new BooleanVar()", "The help flag value");
		members.addMember("StringArrayList", "srcdir", "new StringArrayList()", "The source directories we'll search");
		members.addMember("StringBuffer", "workspace", "new StringBuffer()", "The workspace base directory, this is appended to all srcdir directories");
		members.addMember("StringBuffer", "target", "new StringBuffer()", "The target config on which to base generation");
// The standard behaviour should be to autogenerate
//		members.addMember("BooleanVar", "autogen", "new BooleanVar()", "Indicates that you want to generate from all configs automatically.");
		members.addMember("BooleanVar", "debug", "new BooleanVar()", "Dumps debug info if specified");
		members.addMember("StringArrayList", "jars", "new StringArrayList()", "The jars that will be searched for ." + ddm.getFileExtension() + " config files");
		
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		out.write(imports.getFormattedImports() + "\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public abstract class " + ddm.getName() + "GenUtility implements " + ddm.getName() + "GeneratorInterface {\n\n");
		
		out.write(members.getFormattedMembers() + "\n");
		
		out.write("    protected " + ddm.getName() + "GenUtility() {\n");
		out.write("\n");
		out.write("        commandLine.addOption(\"-h\",         helpFlag,  \"Dumps the help message.\");\n");
		out.write("        commandLine.addOption(\"-srcdir\",    srcdir,    \"The source directories to search.\");\n");
		out.write("        commandLine.addOption(\"-workspace\", workspace, \"The workspace base directory, this is appended to all srcdir directories.\");\n");
		out.write("        commandLine.addOption(\"-target\",    target, \"The name of the target config. If this isn't specified, we generate for all configs.\");\n");
		out.write("        commandLine.addOption(\"-debug\",     debug,     \"Dump debug information.\");\n");
		out.write("        commandLine.addOption(\"-jars\",      jars,     	\"The prefixs of jars to search for ." + ddm.getFileExtension() + " config files.\");\n");
		out.write("\n");
		out.write("    }\n\n");
		
		out.write("    /**\n");
		out.write("     * Based on the command line arguments, we hunt for \n");
		out.write("     *\n");
		out.write("     * @param args the command line arguments\n");
		out.write("     */\n");
		out.write("    public void run(String[] args) throws ResultException, DmcValueException, IOException, DmcRuleExceptionSet, DmcNameClashException, DmcValueExceptionSet {\n");
		out.write("\n");
		out.write("        commandLine.parseArgs(args);\n");
		out.write("\n");
		out.write("        if (helpFlag.booleanValue()){\n");
		out.write("            displayHelp();\n");
		out.write("            return;\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        parser = new " + ddm.getName() + "ParsingCoordinator(this, srcdir,jars);\n");
		out.write("\n");
		out.write("        if (target.length() > 0)\n");
		out.write("            parser.generateForConfig(target.toString());\n");
		out.write("        else\n");
		out.write("            parser.generateForAllConfigs();\n");
		out.write("    }\n\n");
		
		out.write("}\n\n");
		
		out.close();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	
	/**
	 * Generates the base generation utility from which a tool builder can
	 * derive and specialize.
	 * @param sm 
	 * @throws IOException 
	 * @throws DmcNameClashException 
	 * @throws DmcValueException 
	 */
	void generateGeneratorInterface(DmgConfigDMO config, String dir, DSDefinitionModule ddm, SchemaManager sm) throws IOException, DmcNameClashException, DmcValueException {
		ImportManager 	imports = new ImportManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "GeneratorInterface.java");
		
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		ClassDefinition ddmClass = sm.isClass(ddm.getName().getNameString());
		imports.addImport(ddmClass.getDmeImport(), "The base module for generation");

		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Where the config was loaded from");
		imports.addImport("org.dmd.util.exceptions.ResultException", "For problems found after parsing");
		imports.addImport(ddm.getDefinitionManagerImport(), "All parsed definition");
		
		out.write(imports.getFormattedImports() + "\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public interface " +  ddm.getName() + "GeneratorInterface {\n");
		out.write("\n");
		out.write("    /**\n");
		out.write("     * Called prior to generate() method so that derived classes can perform intermediate \n");
		out.write("     * processing such as generation of internal types, application of business logic not defined\n");
		out.write("     * defined as part of rules etc.\n");
		out.write("     * @param module the module that was just parsed\n");
		out.write("     * @param location the module's location\n");
		out.write("     * @param definitions the current set of definitions\n");
		out.write("     */\n");
		out.write("    public void parsingComplete(" + ddm.getName() + " module, ConfigLocation location, " + ddm.getName() + "DefinitionManager definitions) throws ResultException;\n");
		out.write("\n");
		out.write("    /**\n");
		out.write("     * Derived classes should overload this method to perform artifact generation.\n");
		out.write("     * @param module the module for which generation is being performed\n");
		out.write("     * @param location where the module was found\n");
		out.write("     * @param definitions the current set of definitions\n");
		out.write("     */\n");
		out.write("    public void generate(" + ddm.getName() + " module, ConfigLocation location, " + ddm.getName() + "DefinitionManager definitions);\n");
		out.write("\n");
		out.write("    /**\n");
		out.write("     * Called if the help flag is found anywhere on the commandline.\n");
		out.write("     */\n");
		out.write("    public void displayHelp();\n");
		out.write("\n");
		out.write("}\n");
		out.write("\n");
		out.write("\n");
		out.write("\n");
		
		out.close();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates the output directory if required
	 * @param loc the config location
	 * @return the full name of the output directory
	 */
	String checkOutputDirectory(ConfigLocation loc){
		String dirname = loc.getConfigParentDirectory() + "/generated/dsd";
		
		File outdir= new File(dirname);
		if (!outdir.exists()){
			outdir.mkdirs();
		}
		
		return(dirname);
	}
	
	
	/**
	 * Set the stream where we'll report progress.
	 * @param ps the stream.
	 */
	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}
	
	/**
	 * sets the standard header information to be included on generated files.
	 * @param fh the header info.
	 */
	public void setFileHeader(String fh) {
		fileHeader = fh;
	}


}
