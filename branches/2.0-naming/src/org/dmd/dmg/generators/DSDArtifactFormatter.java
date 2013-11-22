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
	 */
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaDefinition sd, SchemaManager sm) throws IOException {
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
		
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		imports.addImport("org.dmd.dms.DSDefinition", "The base of all definitions");
		imports.addImport("org.dmd.dmc.definitions.DmcDefinitionSet", "Our base to provide definition set storage");
		imports.addImport("java.util.Iterator", "To allow access to our definitions");
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + ddm.getName() + "DefinitionManager " + impl.getFormattedImplementations() + "{\n\n");
		
		out.write("    DmcDefinitionSet<DSDefinition>	allDefinitions;\n");
		out.write("\n");
		
		dumpDefinitionManagerMembers(out, includedModules);
		
		out.write("    public " + ddm.getName() + "DefinitionManager(){\n\n");
		
		out.write("        allDefinitions = new DmcDefinitionSet<DSDefinition>();\n\n");
		initializeDefinitionManagerMembers(out, includedModules);
		
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
		
		for(ClassDefinition cd : dsd.getDerivedClasses()){
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
			
			for(ClassDefinition cd : dsd.getDerivedClasses()){
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
		for(DSDefinitionModule ddm : modules.values()){
			ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
			
			out.write("        " + dsd.getName() + "Defs = new DmcDefinitionSet<" + dsd.getName() + ">();\n");
			
			for(ClassDefinition cd : dsd.getDerivedClasses()){
				out.write("        " + cd.getName() + "Defs = new DmcDefinitionSet<" + cd.getName() + ">();\n");
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
	
	
	void generateParser(DmgConfigDMO config, String dir, DSDefinitionModule ddm, SchemaManager sm) throws IOException {
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
				
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		SchemaDefinition sd = ddm.getDefinedIn();
		String schemaName = GeneratorUtils.dotNameToCamelCase(sd.getName().getNameString());
		
		imports.addImport(sd.getDmwPackage() + ".generated." + schemaName + "SchemaAG", "The schema recognized by this parser");
		imports.addImport("org.dmd.dmc.DmcValueException", "May be thrown by schema management");
		imports.addImport("org.dmd.util.exceptions.ResultException", "May be thrown by schema management");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "May be thrown by rule manager");
		imports.addImport("org.dmd.dmv.shared.DmvRuleManager", "The injected rule manager used for initializations");
		imports.addImport("org.dmd.dms.generated.dmw.StringIterableDMW", "To iterate over defFiles");
		
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
		members.addMember("SchemaManager",                   "schema", "new SchemaManager()", "Manages the schema for this DSD");
		members.addMember("DmcUncheckedOIFParser",           "parser", "new DmcUncheckedOIFParser(this)", "Parses objects from the config file");
		members.addMember("DmwObjectFactory",                "factory", "new DmwObjectFactory(schema)", "Instantiates wrapped objects");
		members.addMember(ddm.getGlobalInterfaceName(), "definitions", "Place to store parsed definitions");
		members.addMember("DmvRuleManager", 				 "rules", "The overall rule manager");
		members.addMember("ConfigLocation",					 "location", "The location of the config being parsed");
		members.addMember(ddmClass.getName().getNameString(),"module", "The DDM module");
		
		out.write(members.getFormattedMembers());
		out.write("\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public " + ddm.getName() + "Parser(" + ddm.getGlobalInterfaceName() + " d, DmvRuleManager r) throws ResultException, DmcValueException {\n");
		out.write("        schema.manageSchema(new " + schemaName + "SchemaAG());\n");
		out.write("        definitions  = d;\n");
		out.write("        rules        = r;\n");
		out.write("    }\n\n");
		
		out.write("    public String getFileExtension(){\n");
		out.write("        return(fileExtension);\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public " + ddm.getName() + " parseConfig(ConfigLocation l) throws ResultException, DmcValueException, DmcRuleExceptionSet {\n");
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
		out.write("    public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException, DmcRuleExceptionSet {\n");
		out.write("        " + baseClass.getName() + " definition = null;\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            definition = (" + baseClass.getName() + ") factory.createWrapper(uco);\n");
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
		out.write("\n");
		out.write("        definition.setLineNumber(lineNumber);\n");
		out.write("        definition.setFile(infile);\n");
		out.write("\n");
		out.write("        // Run the rules against the definition\n");
		out.write("        rules.executeInitializers(definition.getDmcObject());\n");
		out.write("        rules.executeAttributeValidation(definition.getDmcObject());\n");
		out.write("        rules.executeObjectValidation(definition.getDmcObject());\n");
		out.write("\n");
		out.write("        // The first definition we expect is the module definition\n");
		out.write("        if (module == null){\n");
		out.write("            if (definition instanceof " + ddm.getName() + "){\n");
		out.write("                module = (" + ddm.getName() + ")definition;\n");
		out.write("            \n");
		out.write("                definition.setDotName(module.getName() + \".\" + definition.getConstructionClassName());\n");
		out.write("            \n");
		out.write("                definitions.add" + ddm.getName() + "(module);\n");
		out.write("                module." + definedInModuleMethod + "(module);\n");
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
		
		out.write("}\n\n");
		
		out.close();		
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
		
		for(ClassDefinition cd : dsd.getDerivedClasses()){
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
	 */
	void generateParsingCoordinator(DmgConfigDMO config, String dir, DSDefinitionModule ddm, TreeMap<String, DSDefinitionModule> includedModules, SchemaManager sm) throws IOException {
		ImportManager 	imports = new ImportManager();
		MemberManager	members	= new MemberManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "ParsingCoordinator.java");
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		imports.addImport("java.io.IOException", "If we run it to problems finding configs");
		imports.addImport("java.util.Iterator", "To iterate over collections");
		imports.addImport("java.util.ArrayList", "To handle lists of things");
		imports.addImport("java.util.TreeMap", "To handle loaded configs");
		
		imports.addImport("org.dmd.dmc.types.DefinitionName", "Allows storage of parsed configs by name");
		imports.addImport("org.dmd.dmc.DmcValueException", "To handle exceptions from value handling");
		imports.addImport("org.dmd.util.exceptions.ResultException", "To handle processing exceptions");
		imports.addImport("org.dmd.dmc.rules.DmcRuleExceptionSet", "In case we have rule failures");
		
		imports.addImport("org.dmd.util.parsing.ConfigFinder", "Finds configs we may need to parse");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Handle to a discovered configuration");
		imports.addImport("org.dmd.util.parsing.ConfigVersion", "Handle to a particular config version");
		
		imports.addImport("org.dmd.dmv.shared.DmvRuleManager", "Allows for application of rules to our definitions");
		members.addMember("DmvRuleManager", "rules", "new DmvRuleManager()", "Rule manager");
		
		imports.addImport(ddm.getDefinitionManagerImport(), "Maintains all parsed definitions");
		members.addMember(ddm.getDefinitionManagerName(), "definitions", "new " + ddm.getDefinitionManagerName() + "()", "Maintains all parsed definitions");
		
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
		out.write(" * The generation coordinator will find all config files associated with the " + ddm.getName()+ " DSD\n");
		out.write(" * and coordinate the parsing of the initial config file and all files on which it depends.\n");
		out.write(" */\n");
		out.write("public class " + ddm.getName() + "ParsingCoordinator {\n\n");
		
		out.write(members.getFormattedMembers() + "\n");
		
		out.write("    public " + ddm.getName() + "ParsingCoordinator(ArrayList<String> sourceDirs, ArrayList<String> jars) throws ResultException, DmcValueException, IOException {\n");
		for(DSDefinitionModule mod: includedModules.values()){
			out.write("        rules.loadRules(" + mod.getDefinedIn().getDMSASGName() + ".instance());\n");			
			out.write("        parserFor" + mod.getName() + " = new " + mod.getDefinitionParserName() + "(definitions, rules);\n");		
			out.write("        finderFor" + mod.getName() + ".setSourceAndJarInfo(sourceDirs,jars);\n");	
			out.write("        finderFor" + mod.getName() + ".findConfigs();\n");	
			out.write("\n");
		}
		
		out.write("    }\n\n");
		out.write("\n");
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void generateForConfig(String configName) throws ResultException, DmcValueException, DmcRuleExceptionSet {\n");
		out.write("        ConfigVersion version = finderFor" + ddm.getName() + ".getConfig(configName);\n");
		out.write("        \n");
		out.write("        if (version == null){\n");
		out.write("            ResultException ex = new ResultException(\"Could not find the specified configuration file: \" + configName);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        ConfigLocation location = version.getLatestVersion();\n");
		out.write("        \n");
		out.write("        " + ddm.getName() + " loaded = parserFor" + ddm.getName() + ".parseConfig(location);\n");
		out.write("        loaded" + ddm.getName() + "Configs.put(loaded.getName(), new " + ddm.getName() + "Info(loaded,location));\n");
		out.write("\n");
		out.write("        // We've loaded the base configuration file, now load any other modules on which it depends\n");
		out.write("        loadModuleDependencies(loaded);\n");
		out.write("        \n");
		out.write("\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void generateForAllConfigs(){\n");
		out.write("\n");
		out.write("\n");
		out.write("\n");
		out.write("\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    void loadModuleDependencies(Object obj) throws ResultException {\n");
		boolean first = true;
		for(DSDefinitionModule mod: includedModules.values()){
			Iterator<DSDefinitionModule> modit = mod.getDDMDependencies();
			
			if (first){
				out.write("        if (obj instanceof " + mod.getName() + "){\n");
				first = false;
			}
			else
				out.write("        else if (obj instanceof " + mod.getName() + "){\n");
			
			out.write("            " + mod.getName() + " module = (" + mod.getName() + ")obj;\n");
			
			formatModuleLoadDependencies(mod, modit, out);

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
		for(DSDefinitionModule mod: includedModules.values()){
			out.write("    class " + mod.getName() + "Info {\n");			
			out.write("        " + mod.getName() + " module;\n");
			out.write("        ConfigLocation location;\n");
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

			out.write("            if (module" + hasValueMethod + "){\n");
			out.write("                Iterator<" + dependsOn.getName() + "REF> it = module.getDMO()" + getMethod + ";\n");
			out.write("                while(it.hasNext()){\n");
			out.write("                    " + dependsOn.getName() + "REF ref = it.next();\n");
			out.write("                    ConfigVersion version = finderFor" + dependsOn.getName() + ".getConfig(ref.toString());\n");
			out.write("                    \n");
			out.write("                    if (version == null)\n");
			out.write("                        missingConfigError(ref.toString() + \"." + dependsOn.getFileExtension() + "\");\n");
			out.write("            \n");
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
		
		
		members.addMember(ddm.getName() + "ParsingCoordinator", "parser", "Module parser");
		
		
		out.write("package " + config.getGenPackage() + ".generated.dsd;\n\n");
		
		out.write(imports.getFormattedImports() + "\n");

		out.write("public class " + ddm.getName() + "GenUtility {\n\n");
		
		out.write(members.getFormattedMembers() + "\n");
		
		out.write("    protected " + ddm.getName() + "GenUtility() {\n");
		out.write("    }\n");
		
		out.write("\n");
		
		out.write("}\n\n");
		
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
