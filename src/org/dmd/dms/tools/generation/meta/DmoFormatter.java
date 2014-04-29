package org.dmd.dms.tools.generation.meta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DMParsingFeedback;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.core.util.NamedStringArray;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.parsing.DMUncheckedObjectManager;
import org.dmd.util.runtime.DebugInfo;



public class DmoFormatter {
	
	static TreeMap<String,DMUncheckedObject>	ucoTypeDefs;
	static TreeMap<String,DMUncheckedObject>	ucoClassDefs;
	static TreeMap<String,DMUncheckedObject>	ucoAttributeDefs;
	static TreeMap<String,DMUncheckedObject>	ucoEnumDefs;

	static public void formatDMOForClass(DMUncheckedObjectManager ucoManager, String od, DMUncheckedObject cdef, String LGPL) throws DMFeedbackSet, IOException {

		ucoTypeDefs 		= ucoManager.getObjects("TypeDefinition");
		ucoClassDefs 		= ucoManager.getObjects("ClassDefinition");
		ucoAttributeDefs 	= ucoManager.getObjects("AttributeDefinition");
		ucoEnumDefs 		= ucoManager.getObjects("EnumDefinition");

		DMUncheckedObject attrObj;
		ArrayList<String> atlist;
		String currAttr;
		String cn	= cdef.getSV("name");
		String baseClass;
		String derivedFrom;
		String isNamedBy;
		String isDSDefinition;
		boolean isDmsDefinition = false;

		TreeSet<String> must = new TreeSet<String>();
		TreeSet<String> may = new TreeSet<String>();

		derivedFrom = cdef.getSV("derivedFrom");
		isNamedBy = cdef.getSV("isNamedBy");
		isDSDefinition = cdef.getSV("isDSDefinition");

		BufferedWriter out = FileUpdateManager.instance().getWriter(od, cn + "DMO.java");

		out.write(LGPL);
		out.write("package org.dmd.dms.shared.generated.dmo;\n\n");

		ImportManager imports = new ImportManager();

		imports.addImport("java.io.Serializable", "Serializable marker interface");
		imports.addImport("java.util.*", "Attribute info support");
		
		if (derivedFrom == null){
			if (!cn.equals("ActionTriggerInfo"))
				imports.addImport("org.dmd.core.interfaces.DmcNamedObjectIF", "Required for our base definition");
		}
			

		boolean needBasicTypes = getAllMustAndMay(cdef, must, may);

		// HACK HACK HACK
		if (!cn.equals("DmwWrapper")){
			// Only include if the type of an attribute has a primitive type specified
			if (needBasicTypes)
				imports.addImport("org.dmd.dms.shared.types.*", "Basic type access");
		}
		if (cn.endsWith("RuleData")) {
			imports.addImport("org.dmd.dms.shared.types.*", "Basic type access");
		}

		imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "To allow error feedback");
		imports.addImport("org.dmd.core.*", "dark-matter core");
		imports.addImport("org.dmd.core.schema.DmcAttributeInfo", "To access attribute info");
		imports.addImport("org.dmd.core.schema.DmcSliceInfo", "To allow object slicing");
		imports.addImport("org.dmd.dms.shared.types.*", "For common types");

		if (cn.equals("EnumDefinition")){
			imports.addImport("org.dmd.dms.shared.generated.types.*", "Enum support");
		}
		
		if (isDSDefinition != null){
			imports.addImport("org.dmd.core.interfaces.DmcDefinitionIF", "This is a domain specific definition");
		}

		imports.addImport("org.dmd.dms.shared.generated.types.*", "Generated type access");

		if (hasAnyEnumAttributes(cdef)) {
			imports.addImport("org.dmd.dms.shared.generated.enums.*", "Has enum attributes");
			// out.write("import org.dmd.dms.generated.enums.*;\n");
		}

		out.write(imports.getFormattedImports() + "\n");

		out.write("\n");

		out.write("/**\n");

		dumpCodeComment(cdef.get("description"), out, " * ");

		out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write(" */\n");

		out.write("@SuppressWarnings(\"serial\")\n");
		
		String additionalInterfaces = " ";
		if (isDSDefinition != null){
			additionalInterfaces = ", DmcDefinitionIF";
		}

		if (derivedFrom == null) {
			if (isNamedBy == null) {
				baseClass = "DmcObject implements Serializable" + additionalInterfaces;
			} else {
				baseClass = "DmcObject implements DmcNamedObjectIF, Serializable" + additionalInterfaces;
			}
		} else {
			// Otherwise, we look up the derived from class and use its javaClass as the base class
			DMUncheckedObject bc = ucoClassDefs.get(derivedFrom);

			if (bc == null) {
				DMParsingFeedback dpf = new DMParsingFeedback("Unknown base class: " + derivedFrom + " for class: " + cn, cdef.getFile(), cdef.getLineNumber());
				throw(new DMFeedbackSet(dpf));
			}

			baseClass = bc.getSV("dmoImport") + " implements Serializable" + additionalInterfaces;
		}

		out.write("public class " + cn + "DMO extends " + baseClass + " {\n\n");

		atlist = new ArrayList<String>();

		if (must != null) {
			for (String attrName : must)
				atlist.add(attrName);
		}

		if (may != null) {
			for (String attrName : may)
				atlist.add(attrName);
		}

		out.write("\n\n");

		// Dump the DmcAttributeInfo that provides hints for serialization/deserialization
		out.write("    static Map<Integer,DmcAttributeInfo> _ImAp;\n\n");
		out.write("    static Map<String ,DmcAttributeInfo> _SmAp;\n\n");

		out.write("\n");
		out.write("    static {\n");
		out.write("        _ImAp = new HashMap<Integer,DmcAttributeInfo>();\n");

		for (String n : atlist) {
			out.write("        _ImAp.put(MetaDMSAG.__" + n + ".id,MetaDMSAG.__" + n + ");\n");
		}

		out.write("\n");

		out.write("        _SmAp = new HashMap<String ,DmcAttributeInfo>();\n");

		for (String n : atlist) {
			out.write("        _SmAp.put(MetaDMSAG.__" + n
					+ ".name,MetaDMSAG.__" + n + ");\n");
		}

		out.write("    }\n");

		out.write("\n\n");

		// Dump the constructors

		out.write("    public " + cn + "DMO(){\n");
		out.write("        super(\"" + cn + "\");\n");
		out.write("    }\n\n");

		out.write("    public " + cn + "DMO(String oc){\n");
		out.write("        super(oc);\n");
		out.write("    }\n\n");

		out.write("    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){\n");
		out.write("        return(_ImAp);\n");
		out.write("    }\n\n");

		out.write("    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){\n");
		out.write("        return(_SmAp);\n");
		out.write("    }\n\n");

		out.write("    @Override\n");
		out.write("    public " + cn + "DMO getNew(){\n");
		out.write("        " + cn + "DMO rc = new " + cn
				+ "DMO();\n");
		out.write("        return(rc);\n");
		out.write("    }\n\n");

		out.write("    @Override\n");
		out.write("    public " + cn + "DMO getSlice(DmcSliceInfo info){\n");
		out.write("        " + cn + "DMO rc = new " + cn + "DMO();\n");
		out.write("        populateSlice(rc,info);\n");
		out.write("        return(rc);\n");
		out.write("    }\n\n");

		if (isDmsDefinition) {
			out.write("     public String getConstructionClassName(){\n");
			out.write("         return(\"" + cn + "\");\n");
			out.write("     }\n\n");
		}

		// Write the attribute access functions
		for (int j = 0; j < atlist.size(); j++) {
			currAttr = ((String) atlist.get(j)).trim();

			out.write("    /**\n");

			if ((attrObj = (DMUncheckedObject) ucoAttributeDefs.get(currAttr.trim())) == null) {
				System.err.println("Missing attribute definition for: " + currAttr.trim() + " in class definition: " + cn);
				System.exit(1);
			}

			// MULTIVALUED 5
			String multiValued = attrObj.getSV("valueType");

			dumpCodeComment(attrObj.get("description"), out, "     * ");

			if (multiValued != null) {
				AccessFunctionFormatter.dumpMVAccessFunction(ucoManager, out, currAttr, true);
			} else {
				out.write("     */\n");
				AccessFunctionFormatter.dumpSVAccessFunction(ucoManager, out, currAttr, true);
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
			out.write("     * @return The name of this object from the " + isNamedBy + " attribute.\n");
			out.write("     */\n");
			out.write("    @Override\n");
			out.write("    public " + nameType + " getObjectName(){\n");
			out.write("        DmcType" + nameType + " attr = (DmcType" + nameType + ") get(MetaDMSAG.__" + isNamedBy + ");\n");
			out.write("        if (attr == null)\n");
			out.write("            return(null);\n");
			out.write("        return(attr.getSV());\n");
			out.write("    }\n\n");
			out.write("\n");
			out.write("    /**\n");
			out.write("     * @return The " + isNamedBy + " attribute.\n");
			out.write("     */\n");

			out.write("    @Override\n");
			out.write("    public DmcAttribute<?> getObjectNameAttribute(){\n");
			out.write("        DmcAttribute<?> attr = (DmcType" + nameType + ") get(MetaDMSAG.__" + isNamedBy + ");\n");
			out.write("        return(attr);\n");
			out.write("    }\n\n");
		}

		out.write("}\n");

		out.close();
			
	
	}
	
	private static boolean hasAnyEnumAttributes(DMUncheckedObject classdef) throws DMFeedbackSet {
		boolean rc = false;
		NamedStringArray must = classdef.get("must");
		NamedStringArray may = classdef.get("may");
		ArrayList<String> atlist = new ArrayList<String>();

		if (must != null) {
			for (String attrName : must)
				atlist.add(attrName);
		}

		if (may != null) {
			for (String attrName : may)
				atlist.add(attrName);
		}

		// Write the attribute access functions
		for (String attrname : atlist) {
			DMUncheckedObject attrdef = ucoAttributeDefs.get(attrname);
			if (attrdef == null) {
				throw(new DMFeedbackSet("Unknown attribute: " + attrname + " in class: " + classdef.getSV("name")));
			}
			if (isEnumAttribute(attrdef)) {
				rc = true;
				break;
			}
		}

		return (rc);
	}
	
	/**
	 * @return true if the object is an enum attribute and false otherwise.
	 */
	static private boolean isEnumAttribute(DMUncheckedObject uco){
		String typeName = uco.getSV("type");
		if (ucoEnumDefs.get(typeName) == null)
			return (false);
		return (true);
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

	static private boolean getAllMustAndMay(DMUncheckedObject uco, TreeSet<String> must, TreeSet<String> may) throws DMFeedbackSet {
		String derivedFrom = uco.getSV("derivedFrom");
		boolean needPrimitiveTypeImport = false;

		if (derivedFrom != null) {
			DMUncheckedObject base = ucoClassDefs.get(derivedFrom);
			getAllMustAndMay(base, must, may);
		}

		NamedStringArray mustAttr = uco.get("must");
		if (mustAttr != null) {
			for (String name : mustAttr) {
				must.add(name);

				DMUncheckedObject attrDef = ucoAttributeDefs.get(name);
				String attrType = attrDef.getSV("type");
				DMUncheckedObject typeDef = ucoTypeDefs.get(attrType);

				// If this is an object reference, the type won't be in types - skip it
				if (typeDef == null)
					continue;

				String primitiveType = typeDef.getSV("primitiveType");

				if (primitiveType != null) {
					if (primitiveType.startsWith("org.dmd.dms.types"))
						needPrimitiveTypeImport = true;
				}
			}
		}

		NamedStringArray mayAttr = uco.get("may");
		if (mayAttr != null) {
			for (String name : mayAttr) {
				may.add(name);

				DMUncheckedObject attrDef = ucoAttributeDefs.get(name);
				if (attrDef == null){
					System.err.println("Couldn't find attribute definition for: " + name + " while getAllMustAndMay() for: \n\n" + uco.toOIF());
				}
				String attrType = attrDef.getSV("type");
				DMUncheckedObject typeDef = ucoTypeDefs.get(attrType);

				// If this is an object reference, the type won't be in types -
				// skip it
				if (typeDef == null)
					continue;

				String primitiveType = typeDef.getSV("primitiveType");

				if (primitiveType != null) {
					if (primitiveType.startsWith("org.dmd.dmc.types"))
						needPrimitiveTypeImport = true;
				}
			}
		}

		return (needPrimitiveTypeImport);
	}


}
