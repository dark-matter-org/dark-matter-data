package org.dmd.dms.tools.generation.meta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DmcNameClashException;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.ManagedFileWriter;
import org.dmd.util.artifact.Manipulator;
import org.dmd.util.artifact.java.ImplementsManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.artifact.java.MemberManager;
import org.dmd.util.parsing.DMUncheckedObjectManager;
import org.dmd.util.runtime.DebugInfo;

/**
 * There's a fair amount of tricky work required to gather the information needed
 * to generate the DSD management infrastructure for the meta schema. Much of that
 * tricky work is done here.
 */
public class MetaDSDHelper {
	
	// This is the name of the DSDefinitionModule for the dark-matter schema 
	// DON'T confuse this with the name of the instance of the meta schema!
	// ALSO: we don't put in the leading "meta." here because it's added
	// automatically when formatting reference attributes in MetaSchemaFormatter.dumpAttrValues
	static String metaModuleDefinitionName = "DmsModule";
	
	DMUncheckedObjectManager 	ucoManager;
	DMUncheckedObject			ucoModule;
	TreeMap<String,DMUncheckedObject>	ucoClassDefs;
	
	TreeMap<String,ClassInfo>	classes = new TreeMap<String, ClassInfo>();

	public MetaDSDHelper(DMUncheckedObjectManager ucm, DMUncheckedObject mod) throws DMFeedbackSet{
		ucoManager		= ucm;
		ucoClassDefs 	= ucoManager.getObjects("ClassDefinition");
		ucoModule		= mod;

		for(DMUncheckedObject uco: ucoClassDefs.values()){
			ClassInfo ci = new ClassInfo(uco);
			classes.put(uco.getSV("name"), ci);
		}
		
		for(ClassInfo ci: classes.values()){
			ci.resolve(classes);
		}
		
		// Comment from the original SchemaManager:
    	///////////////////////////////////////////////////////////////////////
    	// Some additional work required to allow for name clash resolution
    	// mechanisms in auto generated definition managers. All structural 
    	// DSDefinition derived classes must have a standard mechanism to get
    	// the name of the  module from which they were loaded. In order to
    	// do this, we have to know the DSDModule with which they are associated
    	// so that we can get the definedInModuleAttribute. Tricky!
    	// We find the base definition for the module and then add the partOfDefinitionModule
    	// attribute so that we can use this information in the DMWGenerator later.
		
		DMUncheckedObject base = ucoClassDefs.get(ucoModule.getSV("baseDefinition"));
		base.addValue("partOfDefinitionModule", metaModuleDefinitionName);
		
		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			ci.cd.addValue("partOfDefinitionModule", metaModuleDefinitionName);
		}
		
//		// All objects that are based on classes derived from the baseDefinition
//		// will be marked as having been defined in meta DmsModule, this includes
//		// the base definition itself
//		TreeMap<String,DMUncheckedObject> allDerivedFromBase = new TreeMap<String, DMUncheckedObject>();
//		allDerivedFromBase.put(base.getSV("name"), base);
//		for(ClassInfo ci: derived){
//			allDerivedFromBase.put(ci.cd.getSV("name"), ci.cd);
//		}
		
//		// All objects are marked as being defined in the meta DmsModule
//		Iterator<DMUncheckedObject> allIT = ucoManager.getAllObjectsIterator();
//		while(allIT.hasNext()){
//			DMUncheckedObject obj = allIT.next();
//			obj.addValue("definedInDmsModule", "meta");
//		}
		
	}
	
	public ArrayList<ClassInfo> getAllDerived(String cn) throws DMFeedbackSet {
		ArrayList<ClassInfo>	rc = new ArrayList<ClassInfo>();
		
		ClassInfo ci = classes.get(cn);
		
		if (ci == null)
			throw(new DMFeedbackSet("Couldn't find base class: " + cn));
		
		ci.getAllDerived(rc);
		
		return(rc);
	}
	
	/**
	 * This method generates an interface that has the methods required to store and retrieve
	 * the definitions associated with a particular DSD module, including the module type itself.
	 * This interface is implemented by any definition manager that manages the definitions of a
	 * particular DSD module. This approach allows for the injection of a definition manager
	 * into the type specific DSD module parsers.
	 * @param dsddir
	 * @param LGPL
	 * @throws IOException  
	 */
	public void generateGlobalInterface(String dsddir, String LGPL) throws IOException, DMFeedbackSet{
		ImportManager imports = new ImportManager();

		imports.addImport("java.util.Iterator", "To provide iterators over definitions");
		imports.addImport("org.dmd.dms.shared.types.DotName", "To support the find method for definitions");
		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "To handle errors/warnings");
		
		imports.addImport("org.dmd.dms.server.extended." + ucoModule.getSV("baseDefinition"), "A definition from the " + ucoModule.getSV("name") + " Module");		
		
		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			// If the class has the same name as this module definition, it's the 
			// internally generated class to represent the module and we don't want
			// that in the case of the scoped interface.
//			if (ci.cd.getSV("name").equals(module.getSV("name")))
//				continue;
			imports.addImport("org.dmd.dms.server.extended." + ci.cd.getSV("name"), "A definition from the " + ucoModule.getSV("name") + " Module");
		}
		
		BufferedWriter out = FileUpdateManager.instance().getWriter(dsddir, ucoModule.getSV("name") + "GlobalInterface.java");

		out.write(LGPL);

		out.write("package org.dmd.dms.server.generated.dsd;\n\n");

		out.write(imports.getFormattedImports());
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("/**\n");
		out.write(" * This interface is implemented by definition managers that store definitions from the " + ucoModule.getSV("name") + " module.\n");
		out.write(" */\n");
		out.write("public interface " + ucoModule.getSV("name") + "GlobalInterface {\n\n");

		out.write(getInterfaceMethods(false));
		
		out.write("\n");

		out.write("}\n\n");

		out.close();
	}

	
	/**
	 * This method generates an interface that has the methods required to store and retrieve
	 * just the definitions associated with a particular DSD module, NOT including the module
	 * type itself. This interface is implemented by the module class so that we can, from 
	 * a paticular module, access the definitions defined as part of that module.
	 * @param dsddir
	 * @param LGPL
	 * @throws IOException  
	 */
	public void generateScopedInterface(String dsddir, String LGPL) throws IOException, DMFeedbackSet{
		ImportManager imports = new ImportManager();

		imports.addImport("java.util.Iterator", "To provide iterators over definitions");
		imports.addImport("org.dmd.dms.shared.types.DotName", "To support the find method for definitions");
		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "To handle errors/warnings");
		
		imports.addImport("org.dmd.dms.server.extended." + ucoModule.getSV("baseDefinition"), "A definition from the " + ucoModule.getSV("name") + " Module");		
		
		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			// If the class has the same name as this module definition, it's the 
			// internally generated class to represent the module and we don't want
			// that in the case of the scoped interface.
			if (ci.cd.getSV("name").equals(ucoModule.getSV("name")))
				continue;
			imports.addImport("org.dmd.dms.server.extended." + ci.cd.getSV("name"), "A definition from the " + ucoModule.getSV("name") + " Module");
		}
		
		BufferedWriter out = FileUpdateManager.instance().getWriter(dsddir, ucoModule.getSV("name") + "ScopedInterface.java");

		out.write(LGPL);

		out.write("package org.dmd.dms.server.generated.dsd;\n\n");

		out.write(imports.getFormattedImports());
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("/**\n");
		out.write(" * This interface is implemented by the generated wrapper class for the " + ucoModule.getSV("name") + " module.\n");
		out.write(" */\n");
		out.write("public interface " + ucoModule.getSV("name") + "ScopedInterface {\n\n");

		out.write(getInterfaceMethods(true));
		
		out.write("\n");

		out.write("}\n\n");

		out.close();
	}
	
	String getInterfaceMethods(boolean scoped) throws DMFeedbackSet {
		StringBuffer sb = new StringBuffer();
		String baseDefName = ucoModule.getSV("baseDefinition");
		
		// We don't advertise adding to the base definition set
//		sb.append("    public void add" + dsd.getName() + "(" + dsd.getName() +" def);\n");
		sb.append("    public int get" + baseDefName + "Count();\n");
		sb.append("    public " + baseDefName + " get" + baseDefName + "(DotName name);\n");
		sb.append("    public Iterator<" + baseDefName + "> getAll" + baseDefName + "();\n\n");

		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (ci.cd.getSV("name").equals(ucoModule.getSV("name")))
					continue;
			}
			
			String cn = ci.cd.getSV("name");
			sb.append("    public void add" + cn + "(" + cn +" def) throws DMFeedbackSet;\n");
			sb.append("    public int get" + cn + "Count();\n");
			sb.append("    public " + cn + " get" + cn + "(DotName name);\n");
			sb.append("    public Iterator<" + cn + "> getAll" + cn + "();\n\n");
		}
		
		return(sb.toString());
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public void generateDefinitionManager(String dir, String LGPL) throws IOException, DMFeedbackSet {
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dir, ucoModule.getSV("name") + "DefinitionManager.java");
		
		ImportManager imports = new ImportManager();
		ImplementsManager impl = new ImplementsManager();
		
//		// When we build up the set of imports we'll need, we also build the complete set of
//		// modules from which we'll need definitions.
//		TreeMap<String,DSDefinitionModule> includedModules = new TreeMap<String, DSDefinitionModule>();
		
		imports.addImport("org.dmd.dms.server.extended." + ucoModule.getSV("baseDefinition"), "The base definition of the " + ucoModule.getSV("name") + " Module");		
		
		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			imports.addImport("org.dmd.dms.server.extended." + ci.cd.getSV("name"), "A definition from the " + ucoModule.getSV("name") + " Module");
		}
		
		imports.addImport(DSModule.getGlobalInterfaceImport(ucoModule), "Interface for " + ucoModule.getSV("name") + "definitions");
		impl.addImplements(DSModule.getGlobalInterfaceName(ucoModule));
		
		impl.addImplements("DmcNameResolverWithClashSupportIF");
		impl.addImplements("DmcNameClashResolverIF");
		
		out.write(LGPL);

		out.write("package org.dmd.dms.server.generated.dsd;\n\n");
		
		imports.addImport("org.dmd.dms.server.extended.DSDefinition", "The base of all definitions");
		imports.addImport("org.dmd.dms.server.util.DmcDefinitionSet", "Our base to provide definition set storage");
		imports.addImport("org.dmd.dms.server.util.DmcDefinitionSetNew", "Our base to provide definition set storage");
		imports.addImport("java.util.Iterator", "To allow access to our definitions");
		imports.addImport("org.dmd.dms.shared.types.DotName", "To support the find method for definitions");
		imports.addImport("org.dmd.core.interfaces.DmcNameClashResolverIF", "To support object resolution");
		imports.addImport("org.dmd.core.interfaces.DmcNameResolverWithClashSupportIF", "To support object resolution");
		imports.addImport("org.dmd.core.interfaces.DmcNamedObjectIF", "To support object resolution");
		imports.addImport("org.dmd.core.DmcObject", "To support object resolution");
		imports.addImport("org.dmd.core.DmcObjectName", "To support object resolution");
		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "Can be thrown when we try to resolve references");
		imports.addImport("org.dmd.core.schema.DmcAttributeInfo", "Used when resolving clashes");
		imports.addImport("org.dmd.core.DmcNameClashObjectSet", "Used when resolving clashes");
		imports.addImport("org.dmd.core.feedback.DmcNameClashException", "Used when resolving clashes");
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + ucoModule.getSV("name") + "DefinitionManager " + impl.getFormattedImplementations() + "{\n\n");
		
		dumpDefinitionManagerMembers(out, ucoModule);
		
		out.write("    public " + ucoModule.getSV("name") + "DefinitionManager(){\n\n");
		
//		out.write("        // This will be populated as a result of adding definitions to the definition sets for each definition type\n");
//		out.write("        allDefinitions = new DmcDefinitionSet<DSDefinition>(\"allDefinitions\");\n\n");
//		initializeDefinitionManagerMembers(out);
		
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void resolveReferences() throws DMFeedbackSet {\n");
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
    	out.write("        } catch (DMFeedbackSet e) {\n");
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
    	out.write("        } catch (DMFeedbackSet e) {\n");
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
		out.write("    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DMFeedbackSet {\n");
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
		out.write("    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DMFeedbackSet {\n");
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
		
		dumpDefinitionInterfaceMethods(out);
		
		out.write("}\n\n");
		
		out.close();
	}

	private void dumpDefinitionInterfaceMethods(ManagedFileWriter out) throws DMFeedbackSet, IOException {
		out.write(getInterfaceMethodsImplementations(false));
	}

//	private void initializeDefinitionManagerMembers(ManagedFileWriter out) throws IOException, DMFeedbackSet {
//		out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//		out.write("        " + ucoModule.getSV("baseDefinition") + "Defs = new DmcDefinitionSet<" + ucoModule.getSV("baseDefinition") + ">(\"" + ucoModule.getSV("baseDefinition") + "\", allDefinitions);\n");
//		
//		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
//		for(ClassInfo ci: derived){
//			out.write("        " + ci.cd.getSV("name") + "Defs = new DmcDefinitionSet<" + ci.cd.getSV("name") + ">(\"" + ci.cd.getSV("name") + "\", allDefinitions);\n");
//		}
//		
//		out.write("\n");
//	}

//	private void dumpDefinitionManagerMembers(ManagedFileWriter out, DMUncheckedObject boing) throws IOException, DMFeedbackSet {
//		String defname = null;
//		String construct = null;
//		
//		MemberManager	members = new MemberManager();
//		members.addComment("This will be populated as a result of adding definitions to the definition sets for each definition type");
//		members.addMember("protected DmcDefinitionSet<DSDefinition>", "allDefinitions", "new DmcDefinitionSet<DSDefinition>(\"allDefinitions\")", "Maintains all definitions");
//		members.addSpacer();
//		
//		defname = ucoModule.getSV("baseDefinition");
//		construct = "new DmcDefinitionSet<" + defname + ">(\"" + defname + "\", allDefinitions)";
//		members.addMember("protected DmcDefinitionSet<" + defname + ">", defname + "Defs", construct, "The set of all " + defname + " definitions");
//		
//		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
//		for(ClassInfo ci: derived){
//			defname = ci.cd.getSV("name");
//			construct = "new DmcDefinitionSet<" + defname + ">(\"" + defname + "\", allDefinitions)";
//			members.addMember("protected DmcDefinitionSet<" + defname + ">", defname + "Defs", construct, "The set of all " + defname + " definitions");
//		}
//		
//		out.write(members.getFormattedMembers());
//		out.write("\n");
//	}
	
	private void dumpDefinitionManagerMembers(ManagedFileWriter out, DMUncheckedObject boing) throws IOException, DMFeedbackSet {
		String defname = null;
		String construct = null;
		
		MemberManager	members = new MemberManager();
		members.addComment("This will be populated as a result of adding definitions to the definition sets for each definition type");
		members.addMember("protected DmcDefinitionSetNew<DSDefinition>", "allDefinitions", "new DmcDefinitionSetNew<DSDefinition>(\"DSDefinition\")", "Maintains all definitions");
		members.addSpacer();
		
		defname = ucoModule.getSV("baseDefinition");
		String derivedFrom = "";
		
		construct = "new DmcDefinitionSetNew<" + defname + ">(\"" + defname + "\", false, allDefinitions,allDefinitions)";
		members.addMember("protected DmcDefinitionSetNew<" + defname + ">", defname + "Defs", construct, "The set of all " + defname + " definitions");
		
		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			defname = ci.cd.getSV("name");
			derivedFrom = ci.cd.getSV("derivedFrom");
			
			String classType = ci.cd.getSV("classType");
			String structural = "true";
			if (classType.equals("ABSTRACT"))
				structural = "false";
			
			construct = "new DmcDefinitionSetNew<" + defname + ">(\"" + defname + "\", " + structural + ", " + derivedFrom + "Defs,allDefinitions)";
			members.addMember("protected DmcDefinitionSetNew<" + defname + ">", defname + "Defs", construct, "The set of all " + defname + " definitions");
		}
		
		out.write(members.getFormattedMembers());
		out.write("\n");
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * @return the implementations of the definitions interface for this module.
	 * @throws DMFeedbackSet 
	 */
	private String getInterfaceMethodsImplementations(boolean scoped) throws DMFeedbackSet{
		String dsdName = ucoModule.getSV("baseDefinition");
		StringBuffer sb = new StringBuffer();
		
		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    // " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
		sb.append("    /**\n");
		sb.append("     * All definitions are added to the base definition collection.\n");
		sb.append("     */\n");
		sb.append("    void add" + dsdName + "(" + dsdName + " def) throws DMFeedbackSet {\n");
		sb.append("        " + dsdName + "Defs.add(def);\n");
		sb.append("    }\n\n");
		
		sb.append("    public int get" + dsdName + "Count(){\n");
		sb.append("        return(" + dsdName + "Defs.size());\n");
		sb.append("    }\n\n");
		
		sb.append("    public " + dsdName + " get" + dsdName + "(DotName name){\n");
		sb.append("        return(" + dsdName + "Defs.getDefinition(name));\n");
		sb.append("    }\n\n");
		
		sb.append("    public Iterator<" + dsdName + "> getAll" + dsdName + "(){\n");
		sb.append("        return(" + dsdName + "Defs.values().iterator());\n");
		sb.append("    }\n\n");

		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (ci.cd.getSV("name").equals(ucoModule.getSV("name")))
					continue;
			}
			sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void add" + ci.cd.getSV("name") + "(" + ci.cd.getSV("name") + " def) throws DMFeedbackSet {\n");
			sb.append("        " + ci.cd.getSV("name") + "Defs.add(def);\n");
//			if (ci.cd.getSV("name").equals("DSDefinitionModule"))
//				sb.append("        // We don't add the DSDefinitionModule (DmsModule) because it would clash with the DmsModule ClassDefinition\n");
//			else
//				getBaseClassAddCall(ci, ci.cd.getSV("derivedFrom"), sb);
			sb.append("    }\n\n");
			
			sb.append("    public int get" + ci.cd.getSV("name") + "Count(){\n");
			sb.append("        return(" + ci.cd.getSV("name") + "Defs.size());\n");
			sb.append("    }\n\n");
			
			sb.append("    public " + ci.cd.getSV("name") + " get" + ci.cd.getSV("name") + "(DotName name){\n");
			sb.append("        return(" + ci.cd.getSV("name") + "Defs.getDefinition(name));\n");
			sb.append("    }\n\n");
			
			sb.append("    public Iterator<" + ci.cd.getSV("name") + "> getAll" + ci.cd.getSV("name") + "(){\n");
			sb.append("        return(" + ci.cd.getSV("name") + "Defs.values().iterator());\n");
			sb.append("    }\n\n");
		}
		
		return(sb.toString());
	}
	
	/**
	 * If we have a base class, we add this definition to its index as well. This allows us
	 * to access all instances of any particular class type, even if it's abstract.
	 * @param ci the class info for the class at the current level of the definition chain
	 * @param cd the class from we're derived, or null
	 * @param sb
	 */
	void getBaseClassAddCall(ClassInfo ci, String cd, StringBuffer sb){
		if (cd == null)
			return;
		
		String mayBeInternallyGenerated = ci.cd.getSV("mayBeInternallyGenerated");
		
		if (mayBeInternallyGenerated != null){
			sb.append("        // We only add the definition up the chain if it isn't internally generated\n");
			sb.append("        // this prevents clashing names further up the definition set hierarchy\n");
			sb.append("        if (!def.getInternallyGenerated())\n");
			sb.append("            add" + cd + "(def);\n");
		}
		else
			sb.append("        add" + cd + "(def);\n");
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
	public void generateGeneratorInterface(String dsddir, String LGPL) throws IOException, DMFeedbackSet {
		ImportManager 	imports = new ImportManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dsddir, ucoModule.getSV("name") + "GeneratorInterface.java");
		
		out.write(LGPL);

		out.write("package org.dmd.dms.server.generated.dsd;\n\n");
		
		imports.addImport("org.dmd.dms.server.extended." + ucoModule.getSV("name"), "The base module for generation");

		imports.addImport("java.io.IOException", "May occur during artifact generation");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Where the config was loaded from");
		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "For problems found after parsing");
		imports.addImport("org.dmd.dms.server.generated.dsd." + ucoModule.getSV("name") + "DefinitionManager", "All parsed definition");
		
		out.write(imports.getFormattedImports() + "\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public interface " +  ucoModule.getSV("name") + "GeneratorInterface {\n");
		out.write("\n");
		out.write("    /**\n");
		out.write("     * Called prior to the object resolution phase so that derived classes can perform intermediate \n");
		out.write("     * processing such as generation of internal types.\n");
		out.write("     * @param module the module that was just parsed\n");
		out.write("     * @param location the module's location\n");
		out.write("     * @param definitions the current set of definitions\n");
		out.write("     */\n");
		out.write("    public void parsingComplete(" + ucoModule.getSV("name") + " module, ConfigLocation location, " + ucoModule.getSV("name") + "DefinitionManager definitions) throws DMFeedbackSet;\n");
		out.write("\n");
		out.write("    /**\n");
		out.write("     * Called after object resolution has completely succsessfully. This allows for \n");
		out.write("     * application of business logic not defined as part of rules etc.\n");
		out.write("     * @param module the module that was just parsed\n");
		out.write("     * @param location the module's location\n");
		out.write("     * @param definitions the current set of definitions\n");
		out.write("     */\n");
		out.write("    public void objectResolutionComplete(" + ucoModule.getSV("name") + " module, ConfigLocation location, " + ucoModule.getSV("name") + "DefinitionManager definitions) throws DMFeedbackSet;\n");
		out.write("\n");
		out.write("    /**\n");
		out.write("     * Derived classes should overload this method to perform artifact generation.\n");
		out.write("     * @param module the module for which generation is being performed\n");
		out.write("     * @param location where the module was found\n");
		out.write("     * @param definitions the current set of definitions\n");
		out.write("     */\n");
		out.write("    public void generate(" + ucoModule.getSV("name") + " module, ConfigLocation location, " + ucoModule.getSV("name") + "DefinitionManager definitions) throws IOException;\n");
		out.write("\n");
		out.write("    /**\n");
		out.write("     * Derived classes should overload this method to perform artifact generation when no target module\n");
		out.write("     * has been specified on the commandline. This is useful when doing things like generating documentation \n");
		out.write("     * where you want to load and resolve objects across many modules.\n");
		out.write("     * @param definitions the current set of definitions\n");
		out.write("     */\n");
		out.write("    public void generate(" + ucoModule.getSV("name") + "DefinitionManager definitions) throws IOException;\n");
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
	
	public void generateParser(String dsddir, String LGPL) throws IOException, DMFeedbackSet {
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dsddir, ucoModule.getSV("name") + "Parser.java");
		
		ImportManager imports = new ImportManager();
		
		imports.addImport("org.dmd.dms.server.extended.SchemaManager", "Manages the schemas we use");
		imports.addImport("org.dmd.util.parsing.DMUncheckedObjectParser", "Basic parsing of objects");
		imports.addImport("org.dmd.util.parsing.DMUncheckedObjectHandlerIF", "Basic parsing of objects");
		imports.addImport("org.dmd.core.util.DMUncheckedObject", "Basic parsing of objects");
		imports.addImport("org.dmd.dms.server.util.DsdParserInterface", "Standard parser interface");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Config file location info");
		imports.addImport("org.dmd.dmw.DmwObjectFactory", "Constructs wrapped objects");
		imports.addImport("org.dmd.dms.server.generated.dsd." + ucoModule.getSV("name") + "GlobalInterface", "Interface to our definition storage");
		
//		if (ddm.getSupportDynamicSchemaLoading()){
//			imports.addImport("java.util.Iterator", "To iterate over collections");
//			imports.addImport("org.dmd.dms.SchemaDefinition", "To support dynamic loading of schemas");
//		}
				
		out.write("package org.dmd.dms.server.generated.dsd;\n\n");
		
//		SchemaDefinition sd = ddm.getDefinedIn();
		String schemaName = "Meta";
		
		imports.addImport("org.dmd.dms.server.generated.MetaSchemaAG", "The schema recognized by this parser");
		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "May be thrown when parsing objects");
		imports.addImport("org.dmd.core.feedback.DmcNameClashException", "May be thrown when instantiating objects");
//		imports.addImport("org.dmd.util.exceptions.ResultException", "May be thrown by schema management");
		imports.addImport("org.dmd.core.rules.DmcRuleExceptionSet", "May be thrown by rule manager");
		imports.addImport("org.dmd.dmv.shared.DmvRuleManager", "The injected rule manager used for initializations");
		imports.addImport("org.dmd.dms.server.generated.dmw.StringIterableDMW", "To iterate over defFiles");
		imports.addImport("org.dmd.core.feedback.SourceInfo", "To indicate the source of rule problems");
		imports.addImport("org.dmd.dmw.DmwWrapper", "To handle factory created objects");
		imports.addImport("org.dmd.dms.server.extended.MetaSchema", "So that we can preserve newlines");
		imports.addImport("org.dmd.dms.shared.generated.dmo.MetaDMSAG","To allow loading of rules from the meta schema");
		
		// Get the class that was generated for the module
//		ClassDefinition ddmClass = sm.isClass(ddm.getName().getNameString());
		imports.addImport("org.dmd.dms.server.extended." + ucoModule.getSV("name"), "The kind of DDM we're reading");
		
		// The get the imports for each definition type and populate the structural definitions list
		// that we'll use later
//		ArrayList<ClassDefinition> structuralDefs = new ArrayList<ClassDefinition>();
		ArrayList<ClassInfo> structuralDefs = new ArrayList<ClassInfo>();
		getImportsForDefinitionsInSingleModule(imports, ucoModule, structuralDefs);
		
		imports.addImport("org.dmd.dms.server.extended.AttributeDefinition", "To allow addition of preserve newline attributes");
		imports.addImport("org.dmd.dms.server.generated.dmw.AttributeDefinitionIterableDMW", "To allow addition of preserve newline attributes");
//		if (ddm.getSupportDynamicSchemaLoading()){
//			imports.addImport("org.dmd.dms.generated.types.SchemaAndReason", "To allow dynamic schema loading");
//		}
		
		out.write(imports.getFormattedImports() + "\n");
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public class " + ucoModule.getSV("name") + "Parser implements DsdParserInterface, DMUncheckedObjectHandlerIF {\n\n");
		
		out.write("    final static String fileExtension = \"" + ucoModule.getSV("fileExtension") + "\";\n\n");
		
		MemberManager members = new MemberManager();
		members.addMember("SchemaManager",                   		"schema", "Manages the schema for this DSD");
		members.addMember("DMUncheckedObjectParser",           		"parser", "new DMUncheckedObjectParser(this)", "Parses objects from the config file");
		members.addMember("DmwObjectFactory",                		"factory", "Instantiates wrapped objects");
		members.addMember(ucoModule.getSV("name") + "GlobalInterface",	"definitions", "Place to store parsed definitions");
		members.addMember("DmvRuleManager", 				 		"rules", "The overall rule manager");
		members.addMember("ConfigLocation",					 		"location", "The location of the config being parsed");
		members.addMember(ucoModule.getSV("name"),						"module", "The DDM module");
		
		out.write(members.getFormattedMembers());
		out.write("\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public " + ucoModule.getSV("name") + "Parser(" + ucoModule.getSV("name") + "GlobalInterface" + " d, DmvRuleManager r) throws DMFeedbackSet, DmcNameClashException {\n");
		out.write("        schema = new SchemaManager();\n");
		out.write("        " + schemaName + "SchemaAG sd = new " + schemaName + "SchemaAG();\n");	
		out.write("        schema.manageSchema(sd.getInstance());\n");
		out.write("        if (sd.getAttributeDefListSize() > 0){\n");
		out.write("            preserveNewLines(sd.getAttributeDefList());\n");
		out.write("        }\n");
		out.write("        preserveNewLines(MetaSchema._metaSchema.getAttributeDefList());\n");
		out.write("        \n");
		out.write("        factory      = new DmwObjectFactory(schema);\n");
		out.write("        \n");
		out.write("        definitions  = d;\n");
		out.write("        rules        = r;\n");
		out.write("        rules.loadRules(" + schemaName + "DMSAG.instance());\n");			
		out.write("    }\n\n");
		
		out.write("    void preserveNewLines(AttributeDefinitionIterableDMW attrs){\n");
		out.write("        while(attrs.hasNext()){\n");
		out.write("            AttributeDefinition ad = attrs.getNext();\n");
		out.write("            if (ad.getPreserveNewlines()){\n");
		out.write("                parser.addPreserveNewlinesAttribute(ad.getName().getNameString());\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("    }\n\n");
		
		out.write("    public String getFileExtension(){\n");
		out.write("        return(fileExtension);\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public " + ucoModule.getSV("name") + " parseConfig(ConfigLocation l) throws DMFeedbackSet, DmcNameClashException {\n");
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
		
		String definedInModuleMethod = "set" + Manipulator.dotNameToCamelCase(ucoModule.getSV("definedInModuleAttribute"));
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		String baseClass = ucoModule.getSV("baseDefinition");
		out.write("    @Override\n");
		out.write("    public void handleObject(DMUncheckedObject uco, String infile, int lineNumber) throws DMFeedbackSet, DmcNameClashException {\n");
		out.write("        " + baseClass + " definition = null;\n");
		out.write("        DmwWrapper wrapper = null;\n");
		out.write("\n");
		out.write("        try{\n");
		out.write("            wrapper = factory.createWrapper(uco);\n");
		out.write("            definition = (" + baseClass + ") wrapper;\n");
		out.write("        } catch (ClassNotFoundException e) {\n");
		out.write("            DMFeedbackSet ex = new DMFeedbackSet(\"Unknown object class: \" + uco.getConstructionClass(),infile,lineNumber);\n");
//		out.write("            ex.result.lastResult().fileName(infile);\n");
//		out.write("            ex.result.lastResult().lineNumber(lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        catch (DMFeedbackSet ex){\n");
		out.write("            ex.setLocation(infile, lineNumber);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
//		out.write("        catch(DmcValueException e){\n");
//		out.write("            ResultException ex = new ResultException();\n");
//		out.write("            ex.addError(e.getMessage());\n");
//		out.write("            if (e.getAttributeName() != null)\n");
//		out.write("                ex.result.lastResult().moreMessages(\"Attribute: \" + e.getAttributeName());\n");
//		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
//		out.write("            throw(ex);\n");
//		out.write("        }\n");
		out.write("        catch(ClassCastException e){\n");
		out.write("            DMFeedbackSet ex = new DMFeedbackSet(\"The following object is not valid in a ." + ucoModule.getSV("fileExtension") + " file:\\n\\n\" + wrapper.toOIF(),infile,lineNumber);\n");
//		out.write("            ex.addError(\"The following object is not valid in a ." + ddm.getSV("fileExtension") + " file:\\n\\n\" + wrapper.toOIF());\n");
//		out.write("            ex.setLocationInfo(infile, lineNumber);\n");
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
		out.write("            if (definition instanceof " + ucoModule.getSV("name") + "){\n");
		out.write("                module = (" + ucoModule.getSV("name") + ")definition;\n");
		out.write("            \n");
		out.write("                definition.setDotName(module.getName() + \".\" + definition.getConstructionClassName());\n");
//		out.write("                definition.setNameAndTypeName(module.getName() + \".\" + definition.getConstructionClassName());\n");
		out.write("            \n");
		out.write("                module." + definedInModuleMethod + "(module);\n");
		out.write("                definitions.add" + ucoModule.getSV("name") + "(module);\n");
		
//		if (ddm.getSupportDynamicSchemaLoading()){
//			out.write("                if (module.getLoadSchemaClassHasValue()){\n");
//			out.write("                    loadSchemas(module);\n");
//			out.write("                }\n");
//		}

		out.write("            }\n");
		out.write("            else{\n");
		out.write("                DMFeedbackSet ex = new DMFeedbackSet(\"Expecting a " + ucoModule.getSV("name") + " module definition\",infile, lineNumber);\n");
//		out.write("                ex.setLocationInfo(infile, lineNumber);\n");
		out.write("                throw(ex);\n");
		out.write("            }\n");
		out.write("        }\n");
		out.write("        else{\n");
		out.write("            // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("            if (definition instanceof " + ucoModule.getSV("name") + "){\n");
		out.write("                DMFeedbackSet ex = new DMFeedbackSet(\"Multiple " + ucoModule.getSV("name") + " definitions while parsing config: \" + location.getFileName(), infile, lineNumber);\n");
//		out.write("                ex.setLocationInfo(infile, lineNumber);\n");
		out.write("                throw(ex);\n");
		out.write("            }\n");
		out.write("            \n");
		out.write("            definition." + definedInModuleMethod + "(module);\n");
		out.write("            definition.setDotName(module.getName() + \".\" + definition.getName() + \".\" + definition.getConstructionClassName());\n");
//		out.write("            definition.setNameAndTypeName(definition.getName() + \".\" + definition.getConstructionClassName());\n");
		out.write("            \n");
		
		boolean first = true;
		String condition = "if";
		for(ClassInfo ci: structuralDefs){
			out.write("            " + condition + " (definition instanceof " + ci.cd.getSV("name") + "){\n");
			out.write("                definitions.add" + ci.cd.getSV("name") + "((" + ci.cd.getSV("name") + ")definition);\n");
			out.write("                module.add" + ci.cd.getSV("name") + "((" + ci.cd.getSV("name") + ")definition);\n");
			out.write("            }\n");
			if (first)
				condition = "else if";
		}
		out.write("\n");
		
		out.write("        }\n");
		out.write("\n");
		out.write("    }\n");
		
//		if (ddm.getSupportDynamicSchemaLoading()){
//			writeLoadSchemasFunction(out, ddm);
//		}
		
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
	 * @throws DMFeedbackSet 
	 */
	void getImportsForDefinitionsInSingleModule(ImportManager imports, DMUncheckedObject ddm, ArrayList<ClassInfo> structuralDefs) throws DMFeedbackSet{
		imports.addImport("org.dmd.dms.server.extended." + ddm.getSV("baseDefinition"), "The base definition from the " + ddm.getSV("name") + " Module");
		
		ArrayList<ClassInfo> derived = getAllDerived(ddm.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			if (ci.cd.getSV("classType").equals("STRUCTURAL")){
				// Add the structural classes except for the one that represents the module
				if (!ci.cd.getSV("name").equals(ddm.getSV("name"))){
					imports.addImport("org.dmd.dms.server.extended." + ci.cd.getSV("name"), "A definition from the " + ddm.getSV("name") + " Module");
					structuralDefs.add(ci);
				}
			}
		}
				
	}
	
	public void getAdditionalWrapperImports(ImportManager imports, DMUncheckedObject cd) throws DMFeedbackSet{
		imports.addImport("org.dmd.dms.server.generated.dsd." + ucoModule.getSV("name") + "ScopedInterface", "Because this is a DS module");
		imports.addImport("org.dmd.dms.server.util.DmcDefinitionSet", "Our base to provide definition set storage");
		getImportsForInterface(imports, true);
	}
	
	/**
	 * This method is from the DSDefinitionModule
	 * @param imports
	 * @param scoped
	 * @throws DMFeedbackSet 
	 */
	void getImportsForInterface(ImportManager imports, boolean scoped) throws DMFeedbackSet{
		String baseDefinition = ucoModule.getSV("baseDefinition");
		imports.addImport("org.dmd.dms.server.extended." + baseDefinition, "A definition from the " + ucoModule.getSV("name") + " Module");
		
		imports.addImport("java.util.Iterator", "To allow access to our definitions");
		imports.addImport("org.dmd.dms.shared.types.DotName", "To support the find method for definitions");

		ArrayList<ClassInfo> derived = getAllDerived(baseDefinition);
		for(ClassInfo ci: derived){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (ci.cd.getSV("name").equals(ucoModule.getSV("name")))
					continue;
			}
			imports.addImport("org.dmd.dms.server.extended." + ci.cd.getSV("name"), "A definition from the " + ucoModule.getSV("name") + " Module");			
		}
	}
	
	// Based on the DMWGenerator function
	public void dumpAdditionalWrapperDefinitions(DMUncheckedObject cd, BufferedWriter out) throws DMFeedbackSet, IOException{
		if (cd.getSV("dsdModuleDefinition") != null){
			MemberManager members = new MemberManager();
			getScopedInterfaceMembers(members);
			out.write(members.getFormattedMembers() + "\n");
		}
	}

	// Based on the DSDefinitionModule function
	public void getScopedInterfaceMembers(MemberManager members) throws DMFeedbackSet{
		members.addMember("DmcDefinitionSet<" + ucoModule.getSV("baseDefinition") + "> ", ucoModule.getSV("baseDefinition") + "Defs", "new " + "DmcDefinitionSet<" + ucoModule.getSV("baseDefinition") + ">(\"" + ucoModule.getSV("name") + "-allDefinitions\")", "All definitions associated with this module");
		ArrayList<ClassInfo> derived = getAllDerived(ucoModule.getSV("baseDefinition"));
		for(ClassInfo ci: derived){
			members.addMember("DmcDefinitionSet<" + ci.cd.getSV("name") + "> ", ci.cd.getSV("name") + "Defs", "new " + "DmcDefinitionSet<" + ci.cd.getSV("name") + ">(\"" + ucoModule.getSV("name") + "-" + ci.cd.getSV("name") + "Defs\")", "All " + ci.cd.getSV("name") + " definitions");			
		}
	}
	
	// Based on the DMWGenerator function
	public void dumpAdditionalWrapperFunctions(DMUncheckedObject cd, BufferedWriter out) throws IOException, DMFeedbackSet{
		if (cd.getSV("dsdModuleDefinition") != null){
			out.write(getInterfaceMethodsImplementations(true));
		}
		if (cd.getSV("partOfDefinitionModule") != null){
			if (cd.getSV("classType").equals("STRUCTURAL")){
				String definedInModuleAttribute = ucoModule.getSV("definedInModuleAttribute");
				String attrNamePart = Manipulator.capFirstChar(definedInModuleAttribute);
//				String temp = cd.getSV("partOfDefinitionModule");
//				int period = temp.indexOf(".");
//				String podm = temp.substring(period+1);
				
				out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    /**\n");
				out.write("     * This method indicates the name of the module from which this definition was loaded.\n");
				out.write("     */\n");
				out.write("    @Override\n");
				out.write("    public String getNameOfModuleWhereThisCameFrom(){\n");
				out.write("        " + ucoModule.getSV("name") + "REF ref = ((" + cd.getSV("name") + "DMO) core).get" + attrNamePart + "();\n");
				out.write("        return(ref.getName().getNameString());\n");
				out.write("    }\n\n");
			}
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	
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
	public void generateParsingCoordinator(String dsdDir, String LGPL) throws IOException, DMFeedbackSet {
		// We're following the same approach as the artifact formatter, and faking out the included modules for
		// now. This just keeps the overall structure intact and will allow for inclusion of other modules
		// later if we find that's necessary.
		TreeMap<String, DMUncheckedObject> includedModules = new TreeMap<String, DMUncheckedObject>();
		includedModules.put(ucoModule.getSV("name"), ucoModule);
		
		
		ImportManager 	imports = new ImportManager();
		MemberManager	members	= new MemberManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dsdDir, ucoModule.getSV("name") + "ParsingCoordinator.java");

		out.write(LGPL);
		
		out.write("package org.dmd.dms.server.generated.dsd;\n\n");
		
		imports.addImport("java.io.IOException", "If we run it to problems finding configs");
		imports.addImport("java.util.Iterator", "To iterate over collections");
		imports.addImport("java.util.ArrayList", "To handle lists of things");
		imports.addImport("java.util.TreeMap", "To handle loaded configs");
		
		imports.addImport("org.dmd.dms.shared.types.DefinitionName", "Allows storage of parsed configs by name");
		imports.addImport("org.dmd.dms.server.extended.DSDefinition", "The common base for all modules - so that we can get error location info");
		imports.addImport("org.dmd.core.feedback.DMFeedback", "To handle exceptions from value handling");
		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "To handle exceptions from value handling");
		imports.addImport("org.dmd.core.feedback.DmcNameClashException", "To handle exceptions from parsing objects");
		
		imports.addImport("org.dmd.util.parsing.ConfigFinder", "Finds configs we may need to parse");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Handle to a discovered configuration");
		
		imports.addImport("org.dmd.dmv.shared.DmvRuleManager", "Allows for application of rules to our definitions");
		members.addMember("DmvRuleManager", "rules", "new DmvRuleManager()", "Rule manager");
		
		imports.addImport(DSModule.getDefinitionManagerImport(ucoModule), "Maintains all parsed definitions");
		members.addMember(DSModule.getDefinitionManagerName(ucoModule), "definitions", "new " + DSModule.getDefinitionManagerName(ucoModule) + "()", "Maintains all parsed definitions");
		
		imports.addImport(DSModule.getGeneratorInterfaceImport(ucoModule), "The generator we call");
		members.addMember(DSModule.getGeneratorInterfaceName(ucoModule), "generator", "Injected generator that we call when config loading is complete");
		members.addMember("TreeMap<String, ModuleInfoBase>", "loadedConfigs", "new TreeMap<String, ModuleInfoBase>()", "Stores all loaded configs based on the name of the file that was parsed.");
		
		for(DMUncheckedObject mod: includedModules.values()){
			DMUncheckedObject ddmClass = ucoClassDefs.get(mod.getSV("name"));
			imports.addImport(DSClass.getDmeImport(ddmClass), "One of the DDS modules we might load");
			
			imports.addImport(DSClass.getDmtREFImport(ddmClass), "To access references to " + ucoModule.getSV("name"));

			imports.addImport(DSModule.getDefinitionParserImport(mod), "Required to parse " + mod.getSV("name") + " definitions");
			members.addMember(DSModule.getDefinitionParserName(mod), "parserFor" + mod.getSV("name"), "Parser for " + mod.getSV("name") + " definitions");
			members.addMember("ConfigFinder", "finderFor" + mod.getSV("name"), "new ConfigFinder(\"." + mod.getSV("fileExtension") + "\")", "Config finder for " + mod.getSV("name") + " config files ending with ." + mod.getSV("fileExtension"));
			members.addMember("TreeMap<DefinitionName, " + mod.getSV("name") + "Info>", "loaded" + mod.getSV("name") + "Configs", "new TreeMap<DefinitionName, " + mod.getSV("name") + "Info>()", "The names/location of the " + mod.getSV("name") + " modules that have been loaded\n");
		}
		
		out.write(imports.getFormattedImports());
		
		out.write("\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("/**\n");
		out.write(" * The parsing coordinator will find all config files associated with the " + ucoModule.getSV("name")+ " DSD\n");
		out.write(" * and coordinate the parsing of the initial config file and all files on which it depends.\n");
		out.write(" */\n");
		out.write("public class " + ucoModule.getSV("name") + "ParsingCoordinator {\n\n");
		
		out.write(members.getFormattedMembers() + "\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public " + ucoModule.getSV("name") + "ParsingCoordinator(" + DSModule.getGeneratorInterfaceName(ucoModule) + " g, ArrayList<String> sourceDirs, ArrayList<String> jars) throws DMFeedbackSet, IOException {\n");

		out.write("\n");
		out.write("        generator = g;\n");
		out.write("\n");
		
		for(DMUncheckedObject mod: includedModules.values()){
			out.write("        parserFor" + mod.getSV("name") + " = new " + DSModule.getDefinitionParserName(mod) + "(definitions, rules);\n");		
			out.write("        finderFor" + mod.getSV("name") + ".setSourceAndJarInfo(sourceDirs,jars);\n");	
			out.write("        finderFor" + mod.getSV("name") + ".findConfigs();\n");
			out.write("\n");
		}
		
		StringBuffer baseModuleLoaderFunctions = new StringBuffer();
	
// NOTE: at the moment - we have no dependencies - and probably won't - this is just here to prevent confusion
// if we make changes in the DSDArtifactFormatter - so that we can follow what's going on
//		for(DMUncheckedObject mod: includedModules.values()){
//			if (mod.getRequiredBaseModuleSize() > 0){
//				baseModuleLoaderFunctions.append("\n");
//				baseModuleLoaderFunctions.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//				baseModuleLoaderFunctions.append("    void loadBaseModule" + mod.getName() + "(String config) throws ResultException, DmcValueException, DmcNameClashException, DmcRuleExceptionSet, IOException {\n");
//				baseModuleLoaderFunctions.append("        ConfigVersion version = finderFor" + ddm.getName() + ".getConfig(config);\n");
//				baseModuleLoaderFunctions.append("        \n");
//				baseModuleLoaderFunctions.append("        if (version == null){\n");
//				baseModuleLoaderFunctions.append("            ResultException ex = new ResultException(\"Could not find the specified base configuration file: \" + config);\n");
//				baseModuleLoaderFunctions.append("            ex.moreMessages(\"This is a base module required by the " + mod.getName() + " DSD\");\n");
//				baseModuleLoaderFunctions.append("            ex.moreMessages(finderFor" + ddm.getName() + ".getSearchInfo());\n");
//				baseModuleLoaderFunctions.append("            throw(ex);\n");
//				baseModuleLoaderFunctions.append("        }\n");
//				baseModuleLoaderFunctions.append("        \n");
//				baseModuleLoaderFunctions.append("        ConfigLocation location = version.getLatestVersion();\n");
//				baseModuleLoaderFunctions.append("        \n");
//				baseModuleLoaderFunctions.append("        load" + mod.getName() + "Module(location);\n");
//				baseModuleLoaderFunctions.append("    }\n\n");
//				
//				Iterator<String> bases = mod.getRequiredBaseModule();
//				while(bases.hasNext()){
//					out.write("        loadBaseModule" + mod.getName() + "(\"" + bases.next() + "\");\n");			
//				}
//			}
//			
//			
//		}
		
		out.write("    }\n\n");
		out.write("\n");
		
		if (baseModuleLoaderFunctions.length() > 0){
//			out.write(baseModuleLoaderFunctions.toString());
		}
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void generateForConfig(String configName) throws DMFeedbackSet, DmcNameClashException, IOException {\n");
		out.write("        ConfigLocation location = finderFor" + ucoModule.getSV("name") + ".getConfig(configName);\n");
		out.write("        \n");
		out.write("        if (location == null){\n");
		out.write("            DMFeedbackSet ex = new DMFeedbackSet(\"Could not find the specified configuration file: \" + configName);\n");
		out.write("            throw(ex);\n");
		out.write("        }\n");
		out.write("        \n");
//		out.write("        ConfigLocation location = version.getLatestVersion();\n");
//		out.write("        \n");
		out.write("        " + ucoModule.getSV("name") + " loaded = load" + ucoModule.getSV("name") + "Module(location);\n");
		out.write("        \n");
		out.write("        if (location.isFromJAR()){\n");
		out.write("            DMFeedback ex = new DMFeedback(\"We can't run generation for a config loaded from a JAR: \" + configName);\n");
		out.write("            ex.addToMessage(location.toString());\n");
		out.write("            throw(new DMFeedbackSet(ex));\n");
		out.write("        }\n");
		out.write("        \n");
		out.write("        generator.parsingComplete(loaded, location, definitions);\n");
		out.write("        \n");
		out.write("        definitions.resolveReferences();\n");
		out.write("        \n");
		out.write("        generator.generate(loaded,location,definitions);\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    public void generateForAllConfigs() throws DMFeedbackSet, DmcNameClashException, IOException {\n");
		out.write("        " + ucoModule.getSV("name") + " loaded = null;\n");
		out.write("        " + ucoModule.getSV("name") + "Info loadedInfo = null;\n");
		out.write("\n");
		out.write("        Iterator<ConfigLocation> it = finderFor" + ucoModule.getSV("name") + ".getLocations();\n");
		out.write("        while(it.hasNext()){\n");
		out.write("            ConfigLocation location = it.next();\n");
		out.write("\n");
		out.write("            loadedInfo = (" + ucoModule.getSV("name") + "Info)loadedConfigs.get(location.getFileName());\n");
		out.write("\n");
		out.write("            if (loadedInfo == null){\n");
		out.write("                loaded = load" + ucoModule.getSV("name") + "Module(location);\n");
		out.write("            }\n");
		out.write("            else{\n");
		out.write("                loaded = loadedInfo.module;\n");
		out.write("            }\n");
		out.write("\n");
		out.write("            generator.parsingComplete(loaded, location, definitions);\n");
		out.write("\n");
		out.write("            definitions.resolveReferences();\n");
		out.write("\n");
		out.write("            generator.objectResolutionComplete(loaded, location, definitions);\n");
		out.write("\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        generator.generate(definitions);\n");
		out.write("\n");
		out.write("    }\n\n");
		
		
		for(DMUncheckedObject mod: includedModules.values()){
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    " + mod.getSV("name") + " load" + mod.getSV("name") + "Module(ConfigLocation location)  throws DMFeedbackSet, DmcNameClashException {\n");			
			out.write("        // If we've already loaded the file, skip it\n");
			out.write("        " + mod.getSV("name") + "Info info = loaded" + mod.getSV("name") + "Configs.get(new DefinitionName(location.getConfigName()));\n");
			out.write("        if (info != null)\n");
			out.write("            return(info.module);\n");
			out.write("\n");
			out.write("        " + mod.getSV("name") + " loaded = parserFor" + mod.getSV("name") + ".parseConfig(location);\n");
			out.write("        " + mod.getSV("name")+ "Info loadedInfo = new " + mod.getSV("name") + "Info(loaded,location);\n");
			out.write("        loaded" + mod.getSV("name") + "Configs.put(loaded.getName(), loadedInfo);\n");
			out.write("        loadedConfigs.put(location.getFileName(), loadedInfo);\n");
			out.write("\n");
			out.write("        loadModuleDependencies(loadedInfo);\n");
			out.write("\n");
			out.write("        return(loaded);\n");
			out.write("    }\n\n");
			
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    public ConfigLocation getLocation(" + mod.getSV("name") + " module){\n");
			out.write("        " + mod.getSV("name") + "Info info = loaded" + mod.getSV("name") + "Configs.get(module.getName());\n");
			out.write("        if (info == null)\n");
			out.write("            throw(new IllegalStateException(\"Couldn't find ConfigLocation for module: \\n\\n\" + module.toOIF()));\n");
			out.write("\n");
			out.write("        return(info.location);\n");
			out.write("    }\n\n");
		}
		
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    void loadModuleDependencies(ModuleInfoBase mi) throws DMFeedbackSet, DmcNameClashException {\n");
		out.write("\n");
		out.write("        if (mi.dependenciesLoaded)\n");
		out.write("            return;\n");
		out.write("\n");
		boolean first = true;
		for(DMUncheckedObject mod: includedModules.values()){
			Iterator<DMUncheckedObject> modit = DSModule.getDDMDependencies(mod);
			
			if (first){
				out.write("        if (mi instanceof " + mod.getSV("name") + "Info){\n");
				first = false;
			}
			else
				out.write("        else if (mi instanceof " + mod.getSV("name") + "Info){\n");
			
			out.write("            " + mod.getSV("name") + "Info info = (" + mod.getSV("name") + "Info)mi;\n");
			
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
		out.write("    void missingConfigError(String missing) throws DMFeedbackSet {\n");
		out.write("        DMFeedbackSet ex = new DMFeedbackSet(\"Could not find config: \" + missing);\n");
		out.write("        throw(ex);\n");
		out.write("    }\n\n");
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    void missingConfigError(DSDefinition module, String missing) throws DMFeedbackSet {\n");
		out.write("        DMFeedbackSet ex = new DMFeedbackSet(\"Could not find config: \" + missing);\n");
		out.write("        ex.setLocation(module.getFile(), module.getLineNumber());\n");
		out.write("        throw(ex);\n");
		out.write("    }\n\n");
		
		
		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    class ModuleInfoBase {\n");
		out.write("        ConfigLocation location;\n");
		out.write("        boolean        dependenciesLoaded;\n");
		out.write("    }\n\n");
		
		for(DMUncheckedObject mod: includedModules.values()){
			out.write("    class " + mod.getSV("name") + "Info extends ModuleInfoBase {\n");			
			out.write("        " + mod.getSV("name") + " module;\n");
			out.write("\n");
			out.write("        " + mod.getSV("name") + "Info(" + mod.getSV("name") + " m, ConfigLocation l){\n");
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
	void formatModuleLoadDependencies(DMUncheckedObject module, Iterator<DMUncheckedObject> modit, ManagedFileWriter out) throws IOException {
		while(modit.hasNext()){
			DMUncheckedObject dependsOn = modit.next();
			String getMethod = ".get" + Manipulator.dotNameToCamelCase(dependsOn.getSV("moduleDependenceAttribute") + "()");
			String hasValueMethod = ".get" + Manipulator.dotNameToCamelCase(dependsOn.getSV("moduleDependenceAttribute") + "HasValue()");

			out.write("            if (info.module" + hasValueMethod + "){\n");
			out.write("                Iterator<" + dependsOn.getSV("name") + "REF> it = info.module.getDMO()" + getMethod + ";\n");
			out.write("                while(it.hasNext()){\n");
			out.write("                    " + dependsOn.getSV("name") + "REF ref = it.next();\n");
			out.write("                    ConfigLocation location = finderFor" + dependsOn.getSV("name") + ".getConfig(ref.toString());\n");
			out.write("                    \n");
			out.write("                    if (location == null)\n");
			out.write("                        missingConfigError(info.module,ref.toString() + \"." + dependsOn.get("fileExtension") + "\");\n");
			out.write("            \n");
			out.write("                    load" + dependsOn.getSV("name") + "Module(location);\n");
			out.write("                }\n");
			out.write("            }\n");
		}
	}
	

	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Generates the base generation utility from which a tool builder can
	 * derive and specialize.
	 * @throws IOException 
	 * @throws DmcValueException 
	 * @throws DmcNameClashException 
	 */
	public void generateBaseUtility(String dsdDir, String LGPL) throws IOException, DmcNameClashException, DMFeedbackSet {
		// We're following the same approach as the artifact formatter, and faking out the included modules for
		// now. This just keeps the overall structure intact and will allow for inclusion of other modules
		// later if we find that's necessary.
		TreeMap<String, DMUncheckedObject> includedModules = new TreeMap<String, DMUncheckedObject>();
		includedModules.put(ucoModule.getSV("name"), ucoModule);

		ImportManager 	imports = new ImportManager();
		MemberManager	members	= new MemberManager();
		ManagedFileWriter out = FileUpdateManager.instance().getWriter(dsdDir, ucoModule.getSV("name") + "GenUtility.java");
		
		imports.addImport(DSModule.getGeneratedDsdPackage(ucoModule) + "." + ucoModule.getSV("name") + "ParsingCoordinator", "Parses modules required for generation");
		imports.addImport(DSModule.getGeneratedDsdPackage(ucoModule) + "." + ucoModule.getSV("name") + "GeneratorInterface", "Called by the parsing coordinator as configs are read");
		imports.addImport("org.dmd.util.parsing.CommandLine", "Commandline parsing");
		imports.addImport("org.dmd.dms.shared.types.BooleanVar", "Commandline flags");
		imports.addImport("org.dmd.util.parsing.StringArrayList", "Commandline string values");
		imports.addImport("java.io.IOException", "In case we have problems opening/writin got files");
		imports.addImport("java.io.File", "To access the separator character");
		imports.addImport("org.dmd.core.feedback.DmcNameClashException", "To handle parsing errors");
		imports.addImport("org.dmd.core.rules.DmcRuleExceptionSet", "To handle rule errors");
		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "Standard feedback mechanism for errors/warnings");
		imports.addImport("org.dmd.util.parsing.ConfigLocation", "Where a module was loaded from");
		
		for(DMUncheckedObject mod: includedModules.values()){
			DMUncheckedObject ddmClass = ucoClassDefs.get(mod.getSV("name"));
			imports.addImport(DSClass.getDmeImport(ddmClass), "One of the DDS modules we might load");
		}
		
		members.addMember(ucoModule.getSV("name") + "ParsingCoordinator", "parser", "Module parser");
		members.addMember("protected CommandLine", "commandLine", "new CommandLine()", "Commandline parser");
		members.addMember("protected BooleanVar", "helpFlag", "new BooleanVar()", "The help flag value");
		members.addMember("protected StringArrayList", "srcdir", "new StringArrayList()", "The source directories we'll search");
		members.addMember("protected StringBuffer", "workspace", "new StringBuffer()", "The workspace base directory, this is appended to all srcdir directories");
		members.addMember("protected StringBuffer", "outdir", "new StringBuffer()", "The output directory for generated artifacts");
		members.addMember("protected StringArrayList", "targets", "new StringArrayList()", "The target configs on which to base generation");
// The standard behaviour should be to autogenerate
//		members.addMember("BooleanVar", "autogen", "new BooleanVar()", "Indicates that you want to generate from all configs automatically.");
		members.addMember("protected BooleanVar", "debug", "new BooleanVar()", "Dumps debug info if specified");
		members.addMember("protected StringArrayList", "jars", "new StringArrayList()", "The jars that will be searched for ." + ucoModule.getSV("fileExtension") + " config files");
		
		members.addMember("protected StringArrayList", "searchPaths", "new StringArrayList()", "The srcdirs prefixed with the workspace - useful to pass to config finders");
		
		out.write("package org.dmd.dms.server.generated.dsd;\n\n");
		
		out.write(imports.getFormattedImports() + "\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("public abstract class " + ucoModule.getSV("name") + "GenUtility implements " + ucoModule.getSV("name") + "GeneratorInterface {\n\n");
		
		out.write(members.getFormattedMembers() + "\n");
		
		out.write("    protected " + ucoModule.getSV("name") + "GenUtility() {\n");
		out.write("\n");
		out.write("        commandLine.addOption(\"-h\",         helpFlag,  \"Dumps the help message.\");\n");
		out.write("        commandLine.addOption(\"-srcdir\",    srcdir,    \"The source directories to search.\");\n");
		out.write("        commandLine.addOption(\"-workspace\", workspace, \"The workspace base directory, this is appended to all srcdir directories.\");\n");
		out.write("        commandLine.addOption(\"-outdir\",    outdir,    \"The output directory for generated artifacts.\");\n");
		out.write("        commandLine.addOption(\"-targets\",   targets,    \"The names of the target configs. If this isn't specified, we generate for all configs.\");\n");
		out.write("        commandLine.addOption(\"-debug\",     debug,     \"Dump debug information.\");\n");
		out.write("        commandLine.addOption(\"-jars\",      jars,     	\"The prefixs of jars to search for ." + ucoModule.getSV("fileExtension") + " config files.\");\n");
		out.write("\n");
		out.write("    }\n\n");
		
		out.write("    /**\n");
		out.write("     * Based on the command line arguments, we hunt for \n");
		out.write("     *\n");
		out.write("     * @param args the command line arguments\n");
		out.write("     */\n");
		out.write("    public void run(String[] args) throws DMFeedbackSet, IOException, DmcRuleExceptionSet, DmcNameClashException {\n");
		out.write("\n");
		out.write("        commandLine.parseArgs(args);\n");
		out.write("\n");
		out.write("        if (helpFlag.booleanValue()){\n");
		out.write("            displayHelp();\n");
		out.write("            return;\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        for(String src: srcdir){\n");
		out.write("            if (workspace.length() > 0)\n");
		out.write("                searchPaths.add(workspace + File.separator + src);\n");
		out.write("            else\n");
		out.write("                searchPaths.add(src);\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        initialize();\n");
		out.write("\n");
		out.write("        parser = new " + ucoModule.getSV("name") + "ParsingCoordinator(this, searchPaths, jars);\n");
		out.write("\n");
		out.write("        if (targets.size() >0){\n");
		out.write("            for(String target: targets)\n");
		out.write("                parser.generateForConfig(target);\n");
		out.write("        }\n");
		out.write("        else\n");
		out.write("            parser.generateForAllConfigs();\n");
		out.write("    }\n\n");

		out.write("    /**\n");
		out.write("     * Derived classes may overload this method to perform additional initialization\n");
		out.write("     * including checking that commandline arguments are appropriate.\n");
		out.write("     */\n");
		out.write("    public void initialize() throws DMFeedbackSet {\n");
		out.write("    	 \n");
		out.write("    }\n\n");
		
		
		for(DMUncheckedObject mod: includedModules.values()){
			out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    public ConfigLocation getLocation(" + mod.getSV("name") + " module){\n");
			out.write("        return(parser.getLocation(module));\n");
			out.write("    }\n\n");
		}

		out.write("}\n\n");
		
		out.close();
	}
	
	
}
