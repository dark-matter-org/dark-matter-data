package org.dmd.dms.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.types.DefinitionName;
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
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The DmoCacheFormatter is used to generate a GWT compatible cache using only
 * raw DMOs. It is similar in behaviour to the definition manager generated for the
 * server side of things.
 */
public class DmoCacheFormatter {

	String						fileHeader;

	public DmoCacheFormatter() {
		
	}
	
	public void dumpCache(String dir, ConfigLocation loc, SchemaDefinition sd, SchemaManager sm) throws IOException{
		if (sm.getDSDefinitionModulesCount() > 0){
			
			// The call to generateDefinitionManager will populate this map with the complete
			// set of modules from which we'll need definitions.			
			TreeMap<String,DSDefinitionModule> includedModules = new TreeMap<String, DSDefinitionModule>();
			
			Iterator<DSDefinitionModule> it =  sm.getDSDefinitionModules();
			while(it.hasNext()){
				DSDefinitionModule module = it.next();
				DebugInfo.debug("DSDMODULE " + module.getName().getNameString());
				
				// We only generate code for modules defined in the schema that
				// was specified as part of the DMG config
				if (module.getDefinedIn().getName().equals(sd.getName())){
					generateDefinitionManager(sd.getSchemaPackage(), dir, module, includedModules);
					generateGlobalInterface(sd.getSchemaPackage(), dir, module);
				}
			}
		}
	}
	
	private void generateDefinitionManager(String genpackage, String dir, DSDefinitionModule ddm, TreeMap<String, DSDefinitionModule> includedModules) throws IOException {
		if (fileHeader != null)
			FileUpdateManager.instance().fileHeader(fileHeader);
		
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "DefinitionDMOCache.java");
		
		ImportManager imports = new ImportManager();
		ImplementsManager impl = new ImplementsManager();
		
//		// When we build up the set of imports we'll need, we also build the complete set of
//		// modules from which we'll need definitions.
//		TreeMap<String,DSDefinitionModule> includedModules = new TreeMap<String, DSDefinitionModule>();
		
		getImportsForDefinitions(imports, impl, ddm, includedModules);
		
		impl.addImplements("DmcNameResolverWithClashSupportIF");
		impl.addImplements("DmcNameClashResolverIF");
		
		out.write("package " + genpackage + ".generated.dsd;\n\n");
		
		imports.addImport("org.dmd.dms.generated.dmo.DSDefinitionDMO", "The base of all definitions");
		imports.addImport("org.dmd.dmc.definitions.DMODefinitionSet", "Our base to provide definition set storage");
		imports.addImport("java.util.Iterator", "To allow access to our definitions");
		imports.addImport("org.dmd.dmc.types.DotName", "To support the find method for definitions");
		imports.addImport("org.dmd.dmc.DmcNameClashResolverIF", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcNameResolverWithClashSupportIF", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcNamedObjectIF", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcObject", "To support object resolution");
		imports.addImport("org.dmd.dmc.DmcObjectName", "To support object resolution");
//		imports.addImport("org.dmd.dmc.DmcOmni", "To support class resolution");
		imports.addImport("org.dmd.dmc.DmcValueExceptionSet", "Can be thrown when we try to resolve references");
		imports.addImport("org.dmd.dmc.DmcValueException", "Can be thrown when we try to resolve references");
		imports.addImport("org.dmd.dmc.DmcAttributeInfo", "Used when resolving clashes");
		imports.addImport("org.dmd.dmc.DmcNameClashObjectSet", "Used when resolving clashes");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "Used when resolving clashes");
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + ddm.getName() + "DefinitionDMOCache " + impl.getFormattedImplementations() + "{\n\n");
		
		out.write("    DMODefinitionSet<DSDefinitionDMO>	allDefinitions;\n");
		out.write("\n");
		
		dumpDefinitionManagerMembers(out, includedModules);
		
		out.write("    public " + ddm.getName() + "DefinitionDMOCache(){\n\n");
		
		out.write("        // This will be populated as a result of adding definitions to the definition sets for each definition type\n");
		out.write("        allDefinitions = new DMODefinitionSet<DSDefinitionDMO>(\"allDefinitions\");\n\n");

		initializeDefinitionManagerMembers(out, includedModules);
		
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void resolveReferences() throws DmcValueExceptionSet {\n");
		out.write("        for(DSDefinitionDMO def: allDefinitions.values()){\n");
		out.write("            def.resolveReferencesExceptClass(this,this);\n");
		out.write("        }\n");
		out.write("    }\n");
		out.write("\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {\n");
		out.write("        DSDefinitionDMO def = null;\n");
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
//    	out.write("        if (def == null) {\n");
//    	out.write("            // Fall back to the schema\n");
//    	out.write("            return(DmcOmni.instance().findNamedObject(name));\n");
//    	out.write("        }\n");
    	out.write("        return(def);\n");
    	out.write("\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {\n");
		out.write("        throw(new IllegalStateException(\"This method is not supported on generated definition managers\"));\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public DmcObject findNamedDMO(DmcObjectName name) {\n");
		out.write("        DSDefinitionDMO def = null;\n");
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
//    	out.write("        if (def == null) {\n");
//    	out.write("            // Fall back to the schema\n");
//    	out.write("            return(DmcOmni.instance().findNamedDMO(name));\n");
//    	out.write("        }\n");
//    	out.write("\n");
    	out.write("        return(def);\n");
		out.write("    }\n\n");

		ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
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
		out.write("                if (rc == null){\n");
		out.write("                    DmcValueException ex = new DmcValueException(\"The reference to : \" + name.getNameString() + \" is ambiguous. You must specify the module name as a prefix to the name. Here are your options:\");\n");
		out.write("                    Iterator<DmcNamedObjectIF> it = e.getMatches();\n");
		out.write("                    while(it.hasNext()){\n");
		out.write("                        " + dsd.getName() + "DMO def = (" + dsd.getName() + "DMO) it.next();\n");
		out.write("                        ex.addMoreInfo(def.getDefinedIn" + ddm.getName() + "().getName().getNameString() + \".\" + name.getNameString());\n");
		out.write("                    }\n");
		out.write("                    throw(ex);\n");
		out.write("                }\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        else{\n");
		out.write("            rc = allDefinitions.getDefinition(dn);\n");
		out.write("        }\n");
		out.write("    \n");
//		out.write("        if (rc == null) {\n");
//		out.write("            // Fall back to the schema\n");
//		out.write("            return(DmcOmni.instance().findNamedObject(name));\n");
//		out.write("        }\n");
//		out.write("    \n");
		out.write("        return(rc);\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {\n");
		out.write("        DmcNamedObjectIF rc = null;\n");
		out.write("        DSDefinitionDMO resolving = (DSDefinitionDMO) obj.getContainer();\n");
		out.write("    \n");
		out.write("        Iterator<DmcNamedObjectIF> it = ncos.getMatches();\n");
		out.write("        while(it.hasNext()){\n");
		out.write("            DSDefinitionDMO def = (DSDefinitionDMO) it.next();\n");
		out.write("            if (resolving.getDmoFromModule().equals(def.getDmoFromModule())){\n");
		out.write("                rc = def;\n");
		out.write("                break;\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        return(rc);\n");
		out.write("    }\n\n");
		
		
		dumpDefinitionInterfaceMethods(out, includedModules);
		
		dumpAddMethod(out, ddm);
		
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
		
		imports.addImport(ddm.getDMOGlobalInterfaceImport(), "Interface for " + ddm.getName() + " definitions");
		impl.addImplements(ddm.getGlobalInterfaceName());
		
		imports.addImport(dsd.getDmoImport(), "A definition from the " + ddm.getName() + " Module");
		
		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
			imports.addImport(cd.getDmoImport(), "A definition from the " + ddm.getName() + " Module");
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
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * This dumps a single add() method that will add the specified definition to the appropriate
	 * indices.
	 * @param out the place we're writing
	 * @throws IOException
	 */
	void dumpAddMethod(ManagedFileWriter out, DSDefinitionModule ddm) throws IOException {
		ImportManager imports = new ImportManager();
		TreeMap<Integer, ArrayList<ClassDefinition>>	structuralDefs = new TreeMap<Integer, ArrayList<ClassDefinition>>(Collections.reverseOrder());
		getImportsForDefinitionsInSingleModule(imports, ddm, structuralDefs);

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void addDefinition(DSDefinitionDMO definition){\n");

		boolean first = true;
		String condition = "if";
		
		for(Integer depth: structuralDefs.keySet()){
			ArrayList<ClassDefinition>	atDepth = structuralDefs.get(depth);

			for(ClassDefinition cd: atDepth){
				out.write("            " + condition + " (definition instanceof " + cd.getName() + "DMO){\n");
				out.write("                add" + cd.getName() + "((" + cd.getName() + "DMO)definition);\n");
				out.write("            }\n");
				if (first)
					condition = "else if";
			}
		}
		
		// NOTE NOTE NOTE
		// And then, we also add the module itself, since the module isn't derived from the
		// base definition and doesn't show up in the structuralDefs
		out.write("            " + condition + " (definition instanceof " + ddm.getModuleClassName() + "DMO){\n");
		out.write("                add" + ddm.getModuleClassName() + "((" + ddm.getModuleClassName() + "DMO)definition);\n");
		out.write("            }\n");
		
		out.write("\n");
		
		out.write("    }\n\n");
		
	}

	/**
	 * We populate the imports with the base definition and the various derived definitions that are structural.
	 * We don't bother with abstract defs because they'll never be specified in a config. We also hold on to
	 * the structural classes so that we can generate the object handling code later.
	 * @param imports the import manager to populate
	 * @param ddm the DDM we're generating for
	 * @param structuralDefs place to store the structural definition classes
	 */
	void getImportsForDefinitionsInSingleModule(ImportManager imports, DSDefinitionModule ddm, TreeMap<Integer, ArrayList<ClassDefinition>> structuralDefs){
		ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
		
		imports.addImport(dsd.getDmeImport(), "The base definition from the " + ddm.getName() + " Module");
		
		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
//		for(ClassDefinition cd : dsd.getDerivedClasses()){
			if (cd.getClassType() == ClassTypeEnum.STRUCTURAL){
				// Add the structural classes except for the one that represents the module
				if (!cd.getName().getNameString().equals(ddm.getName().getNameString())){
					imports.addImport(cd.getDmeImport(), "A definition from the " + ddm.getName() + " Module");
					int depth = cd.derivationDepth();
					
					ArrayList<ClassDefinition> atDepth = structuralDefs.get(depth);
					if (atDepth == null){
						atDepth = new ArrayList<ClassDefinition>();
						structuralDefs.put(depth, atDepth);
					}
					atDepth.add(cd);
				}
			}
		}
				
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
	void generateGlobalInterface(String genpackage, String dir, DSDefinitionModule ddm) throws IOException {
		ImportManager imports = new ImportManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ddm.getName() + "GlobalInterface.java");
		out.write("package " + genpackage + ".generated.dsd;\n\n");
		
		imports.addImport("java.util.Iterator", "To provide iterators over definitions");
		imports.addImport("org.dmd.dmc.DmcNameClashException", "May be thrown when finding definitions");
		imports.addImport("org.dmd.dmc.DmcValueException", "May be thrown when finding definitions");
		ddm.getDMOImportsForInterface(imports, false);
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("/**\n");
		out.write(" * This interface is implemented by definition managers that store definitions from the " + ddm.getName() + " module.\n");
		out.write(" */\n");
		out.write("public interface " + ddm.getName() + "GlobalInterface {\n\n");
		
		out.write(ddm.getDMOInterfaceMethods(false));
		
		out.write("}\n\n");

		out.close();
	}

	void dumpDefinitionManagerMembers(ManagedFileWriter out, TreeMap<String,DSDefinitionModule> modules) throws IOException {
		for(DSDefinitionModule ddm : modules.values()){
			ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
			
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    DMODefinitionSet<" + dsd.getName() + "DMO> " + dsd.getName() + "Defs;\n");
			
			TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
			for(ClassDefinition cd : allDerived.values()){
				out.write("    DMODefinitionSet<" + cd.getName() + "DMO> " + cd.getName() + "Defs;\n");			
			}
		}
		out.write("\n");
	}

	void initializeDefinitionManagerMembers(ManagedFileWriter out, TreeMap<String,DSDefinitionModule> modules) throws IOException {
		out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		for(DSDefinitionModule ddm : modules.values()){
			ClassDefinition dsd = (ClassDefinition) ddm.getBaseDefinition();
			
			out.write("        " + dsd.getName() + "Defs = new DMODefinitionSet<" + dsd.getName() + "DMO>(\"" + dsd.getName() + "\", allDefinitions);\n");
			
			TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
			for(ClassDefinition cd : allDerived.values()){
				out.write("        " + cd.getName() + "Defs = new DMODefinitionSet<" + cd.getName() + "DMO>(\"" + cd.getName() + "\", allDefinitions);\n");
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
			out.write(ddm.getDMOInterfaceMethodsImplementations(false));
		}
		out.write("\n");
	}	



	/**
	 * sets the standard header information to be included on generated files.
	 * @param fh the header info.
	 */
	public void setFileHeader(String fh) {
		fileHeader = fh;
	}

}
