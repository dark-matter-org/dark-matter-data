package org.dmd.dms.tools.generation.meta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DMParsingFeedback;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.core.util.NamedStringArray;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.parsing.DMUncheckedObjectManager;
import org.dmd.util.runtime.DebugInfo;


public class DmwFormatter {

	static TreeMap<String,DMUncheckedObject>	ucoAttributeDefs;
	static TreeMap<String,DMUncheckedObject>	ucoClassDefs;

	public static void dumpDMWClasses(DMUncheckedObjectManager ucoManager, String dmwdir, String LGPL) throws DMFeedbackSet {
		ucoClassDefs 		= ucoManager.getObjects("ClassDefinition");
		ucoAttributeDefs 	= ucoManager.getObjects("AttributeDefinition");

//		DMUncheckedObject go;
		DMUncheckedObject attrObj;
		NamedStringArray must;
		NamedStringArray may;
		ArrayList<String> atlist;
		String currAttr;
		String cn;
		String classType;
		String baseClass;
		String derivedFrom;
		String isNamedBy;
		String isDSDefinition;
		String isDSModule;

//		for (int i = 0; i < origOrderClasses.size(); i++) {
//			go = (DMUncheckedObject) classDefs.get(origOrderClasses.get(i));
		for(DMUncheckedObject go: ucoClassDefs.values()){

			derivedFrom = go.getSV("derivedFrom");
			isNamedBy = go.getSV("isNamedBy");
			isDSDefinition = go.getSV("isDSDefinition");
			isDSModule = go.getSV("isDSModule");

			// System.out.println("*** Formatting class definition for: " +
			// origOrderClasses.get(i));

			if ((cn = go.getSV("name")) == null) {
				System.out.println("Couldn't get name for class definition:\n"
						+ go);
			} else {
				try {

					// BufferedWriter out = new BufferedWriter(new
					// FileWriter(dmwdir + File.separator + cn + "DMW.java"));
					BufferedWriter out = FileUpdateManager.instance().getWriter(dmwdir, cn + "DMW.java");

					out.write(LGPL);
					
					out.write("package org.dmd.dms.server.generated.dmw;\n\n");
					
					ImportManager imports = new ImportManager();
					imports.addImport("java.util.*", "To support access functions");
					imports.addImport("org.dmd.dms.shared.types.*", "Blanket import because at the meta level it's tricky to determine the exact pieces we need");
					imports.addImport("org.dmd.core.*", "Basic dark-matter infrastructure");
					imports.addImport("org.dmd.dmw.*", "Base wrapper capabilities");
					imports.addImport("org.dmd.dms.server.extended.*", "Blanket import because at the meta level it's tricky to determine the exact pieces we need");
					imports.addImport("org.dmd.dms.shared.generated.dmo.*", "Blanket import because at the meta level it's tricky to determine the exact pieces we need");
					imports.addImport("org.dmd.dms.shared.generated.enums.*", "Blanket import because at the meta level it's tricky to determine the exact pieces we need");
					imports.addImport("org.dmd.dms.shared.generated.types.*", "Blanket import because at the meta level it's tricky to determine the exact pieces we need");
					imports.addImport("org.dmd.core.feedback.*", "Blanket import because at the meta level it's tricky to determine the exact pieces we need");
//					imports.addImport("org.dmd.dms.*", "Blanket import because at the meta level it's tricky to determine the exact pieces we need");

					if (cn.equals("EnumDefinition")) {
						imports.addImport("org.dmd.dms.shared.types.*", "Required for EnumDefinition");
					}
					
					if (isDSDefinition != null){
						imports.addImport("org.dmd.core.interfaces.DmcDefinitionIF", "Because this is a DS definition");
					}
					if (isDSModule != null){
						imports.addImport("org.dmd.core.interfaces.DmcModuleIF", "Because this is a DS module");
					}

//					if (cn.equals("ActionTriggerInfo")) {
//						imports.addImport("org.dmd.dms.extended.ActionTriggerInfo", "A hack that should go away! ");
//					}

					out.write("\n");
					
					out.write(imports.getFormattedImports());
					
					///////////////////////////////////////////////////////////

					out.write("/**\n");
					dumpCodeComment(go.get("description"), out, " * ");

					out.write(" * @author Auto Generated\n");
					out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					out.write(" */\n");
					out.write("@SuppressWarnings(\"unused\")\n");
					
					String additionalInterfaces = "";
					if (isDSDefinition != null)
						additionalInterfaces = " implements DmcDefinitionIF";
					if (isDSModule != null)
						additionalInterfaces = " implements DmcModuleIF";

					// See if we're derived from anything. If not, just use
					// DmwWrapper as the base class
					// If we're named, use DmwNamedObjectWrapper.
					if (derivedFrom == null) {
						baseClass = "DmwWrapper" + additionalInterfaces;

						if (isNamedBy != null)
							baseClass = "DmwNamedObjectWrapper" + additionalInterfaces;
					} else {
						// Otherwise, we look up the derived from class and use
						// its javaClass
						// as the base class
						DMUncheckedObject bc = ucoClassDefs.get(derivedFrom);

						if (bc == null) {
							DMParsingFeedback dpf = new DMParsingFeedback("Unknown base class: " + derivedFrom + " for class: " + cn, go.getFile(), go.getLineNumber());
							throw(new DMFeedbackSet(dpf));
						}
						baseClass = bc.getSV("javaClass") + additionalInterfaces;
					}

					classType = go.getSV("classType");

					if (classType.equals("ABSTRACT"))
						out.write("public abstract class " + cn
								+ "DMW extends " + baseClass + " {\n\n");
					else{
						if (cn.equals("SchemaDefinition")){
							// Have to make this abstract because we need to manually overload the DmcModuleIF methods
							out.write("public abstract class " + cn + "DMW extends " + baseClass + " {\n\n");							
						}
						else{
							out.write("public class " + cn + "DMW extends " + baseClass + " {\n\n");
						}
					}

					out.write("    private " + cn + "DMO mycore;\n\n");

					// All dark matter wrappers have to have a standard
					// constructor that takes no
					// arguments and constructs the appropriate DMO for the
					// wrapper.
					out.write("    protected " + cn + "DMW() {\n");
					out.write("        super(new " + cn + "DMO());\n");
					out.write("        mycore = (" + cn + "DMO) core;\n");
					out.write("        mycore.setContainer(this);\n");
					out.write("    }\n\n");

					out.write("    protected " + cn + "DMW(DmcObject obj) {\n");
					out.write("        super(obj);\n");
					out.write("        mycore = (" + cn + "DMO) core;\n");
					out.write("        mycore.setContainer(this);\n");
					out.write("    }\n\n");

					out.write("    protected " + cn
							+ "DMW(DmcObject obj, ClassDefinition cd) {\n");
					out.write("        super(obj,cd);\n");
					out.write("        mycore = (" + cn + "DMO) core;\n");
					out.write("        mycore.setContainer(this);\n");
					out.write("    }\n\n");

					out.write("    public  " + cn + "DMO getDMO() {\n");
					out.write("        return(mycore);\n");
					out.write("    }\n\n");

					// out.write("    @SuppressWarnings(\"unchecked\")\n");
					// out.write("    @Override\n");
					// out.write("    protected ArrayList getAuxDataHolder() {\n");
					// out.write("        return(new ArrayList<" + cn +
					// ">());\n");
					// out.write("    }\n\n");

					// NOTE: tricky bit here, for all derived classes of
					// DmsDefinition (but not for DmsDefinition itself)
					// we provide constructors that take the name of the
					// definition so that the metaname
					// in org.dmd.dms.DmsDefinition gets a value. See
					// DmsDefinition for more info.
					if ((derivedFrom != null)
							&& derivedFrom.equals("DmsDefinition")) {
						out.write("    protected " + cn + "DMW(ClassDefinition cd) {\n");
						out.write("        super(cd);\n");
						out.write("    }\n\n");

						out.write("    protected " + cn + "DMW(String mn) throws DMFeedbackSet {\n");
						out.write("        super(new " + cn + "DMO());\n");
						out.write("        mycore = (" + cn + "DMO) core;\n");
						out.write("        mycore.setContainer(this);\n");
						out.write("        mycore.setName(mn);\n");
						out.write("        metaname = mn;\n");
						out.write("    }\n\n");
					}

					// Gather the attributes together
					must = go.get("must");
					may = go.get("may");
					atlist = new ArrayList<String>();

					if (must != null) {
						for (String attrName : must)
							atlist.add(attrName);
					}

					if (may != null) {
						for (String attrName : may)
							atlist.add(attrName);
					}

					// Write the attribute access functions
					for (int j = 0; j < atlist.size(); j++) {
						currAttr = ((String) atlist.get(j)).trim();

						out.write("    /**\n");

						if ((attrObj = (DMUncheckedObject) ucoAttributeDefs.get(currAttr.trim())) == null) {
							System.err.println("Missing attribute definition for: " + currAttr.trim() + " in class definition: " + cn);
							System.exit(1);
						}

						// MULTIVALUED 2
						String multiValued = attrObj.getSV("valueType");

						dumpCodeComment(attrObj.get("description"), out, "     * ");

						if (multiValued != null) {
							AccessFunctionFormatter.dumpMVAccessFunction(ucoManager, out, currAttr, false);
						} else {
							out.write("     */\n");
							AccessFunctionFormatter.dumpSVAccessFunction(ucoManager, out, currAttr, false);
						}

					}
					out.write("\n");

					if (isNamedBy != null) {
						String nameType = "DefinitionName";
						if (cn.equals("RuleData"))
							nameType = "RuleName";

						out.write("    ////////////////////////////////////////////////////////////////////////////////\n");
						out.write("    // DmcNamedObjectIF implementation\n");
						out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n\n");
						
						out.write("    /**\n");
						out.write("     * @return The name of this object from the "
								+ isNamedBy + " attribute.\n");
						out.write("     */\n");

						out.write("    public " + nameType
								+ " getObjectName(){\n");
						out.write("        return(mycore.getObjectName());\n");
						out.write("    }\n\n");
						out.write("\n");
						out.write("    /**\n");
						out.write("     * @return The " + isNamedBy
								+ " attribute.\n");
						out.write("     */\n");

						out.write("    public DmcAttribute<?> getObjectNameAttribute(){\n");
						out.write("        return(mycore.getObjectNameAttribute());\n");
						out.write("    }\n\n");
					}

					out.write("}\n");

					out.close();

					if (isNamedBy != null) {
						dumpIterableREF(dmwdir, "org.dmd.dms", cn, true, "org.dmd.dms.server.extended", LGPL.toString(), System.out);
					}

				} catch (IOException e) {
					System.out.println("IO Error:\n" + e);
				}
			}
		}
	}

	/**
	 * This method should only be called for named object types.
	 * @param dmwdir		The output directory.
	 * @param basePackage   The base package for the generated code.
	 * @param className the for which we're generating the iterator.
	 * @param extended flag indicating if the calss is extended.
	 * @param extendedPackage the package if the class is extended.
	 * @param fileHeader the header to be dumped on the file.
	 * @param progress the progress reporting stream.
	 * @throws IOException
	 */
	static void dumpIterableREF(String dmwdir, String basePackage, String className, boolean extended, String extendedPackage, String fileHeader, PrintStream progress) throws IOException {
//		String ofn = dmwdir + File.separator + className + "IterableDMW.java";
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmwdir, className + "IterableDMW.java");
        
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        String CAST = className + "DMW";
        String REF 	= className + "REF";
        
        out.write("package " + basePackage + ".server.generated.dmw;\n\n");
        
        ImportManager imports = new ImportManager();
        
        imports.addImport("java.util.Iterator", "Because we're iterating!");
        imports.addImport("org.dmd.dmw.DmwContainerIterator", "Because we're extending the parameterized class");
        imports.addImport(basePackage + ".shared.generated.types." + className + "REF", "To access our reference type");
        
//        out.write("import java.util.Iterator;\n\n");
//        out.write("import org.dmd.dmw.DmwContainerIterator;\n");
//        out.write("import " + basePackage + ".generated.types." + className + "REF;\n");
        
        if (extended){
            imports.addImport(extendedPackage + "." + className, "Because " + className + " uses extended wrappers");
//            out.write("import " + extendedPackage + "." + className + ";\n");
            CAST = className;
        }
        else{
            imports.addImport(basePackage + ".generated.dmw." + className + "DMW", "Because " + className + " is not extended");
//            out.write("import " + basePackage + ".generated.dmw." + className + "DMW;\n");
        }
        
        out.write(imports.getFormattedImports() + "\n");
          	                
        out.write("/**\n");
        out.write(" * The " + className + "IteratorDMW will cast from an underlying " + REF + " class to \n");
        out.write(" * the associated wrapper class: " + CAST + " when accessing object references in a wrapper context.\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
        
        
        out.write("public class " + className + "IterableDMW extends DmwContainerIterator<" + CAST + "," + REF + "> {\n");
        out.write("\n");
        out.write("    public final static " + className + "IterableDMW emptyList = new " + className + "IterableDMW();\n");
        out.write("\n");
        out.write("    protected " + className + "IterableDMW(){\n");
        out.write("        super();\n");
        out.write("    }\n");
        out.write("\n");
        out.write("    public " + className + "IterableDMW(Iterator<" + REF + "> it){\n");
        out.write("        super(it);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("}\n\n");
        
        out.close();

	}

	static private void dumpCodeComment(NamedStringArray namedStringArray, BufferedWriter out, String indent) {
		StringBuffer sb = new StringBuffer();
		int offset;

		if (namedStringArray == null)
			return;
		
		for(String str: namedStringArray){
			sb.append(str + " ");
		}
		
		try {
			while (sb.length() > 75) {
				offset = 74;
				// Move back until we find a space
				while (sb.charAt(offset) != ' ') {
					offset--;
				}

				out.write(indent);
				for (int i = 0; i < offset; i++) {
					out.write(sb.charAt(i));
				}
				out.write("\n");
				// The subString(int,int) method seems to be missing
				// out.write(" * " + sb.subString(start,offset) + "\n");
				sb.delete(0, offset + 1);
			}
			out.write(indent + sb + "\n");
		} catch (IOException e) {
			System.out.println("IO Error:\n" + e);
		}
	}


}
