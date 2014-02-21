package org.dmd.dms.meta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.util.ComplexTypeSplitter;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmc.util.NameValuePair;
import org.dmd.dmc.util.NamedStringArray;
import org.dmd.dms.util.GenUtility;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class MetaComplexTypeFormatter {
	
	static MetaGenerator meta;

	static void dumpComplexType(String od, DmcUncheckedObject ct, MetaGenerator mg) throws IOException, ResultException, DmcValueException {
		meta = mg;
		
		String ctn = ct.getSV("name");
		String fieldSeparator = ct.getSV("fieldSeparator");
		boolean	whiteSpaceSeparator = false;

		if (fieldSeparator == null){
			whiteSpaceSeparator = true;
			fieldSeparator = " ";
		}

		// BufferedWriter out = new BufferedWriter(new FileWriter(od + "/" + ctn
		// + ".java"));
		BufferedWriter out = FileUpdateManager.instance().getWriter(od, ctn + ".java");

		DebugInfo.debug("Generating: " + od + File.separator + ctn + ".java");

		ArrayList<Part> parts = new ArrayList<MetaComplexTypeFormatter.Part>();
		getComplexTypeParts("requiredPart", ct, parts);
		int requiredCount = parts.size();
		getComplexTypeParts("optionalPart", ct, parts);
		
		// Determine if we have any reference parts
		boolean hasRefs = false;
		ArrayList<String> refFields = new ArrayList<String>();
		for (Part field : parts) {
			DmcUncheckedObject type = meta.typeDefs.get(field.type);
			if (type == null) {
				type = meta.enumDefs.get(field.type);
				if (type == null) {
					DebugInfo.debug("Unknown type in ComplexTypeDefinition: "
							+ field.type);
					System.exit(1);
				}
			}
			String isRefType = type.getSV("isRefType");
			if (isRefType != null) {
				hasRefs = true;
				refFields.add(field.name);
			}
		}

		out.write(meta.LGPL.toString());
		out.write("package org.dmd.dms.generated.types;\n\n");

		ImportManager imports = new ImportManager();
		
		imports.addImport("java.io.Serializable","Marker interface for serialization");
		imports.addImport("org.dmd.dmc.DmcInputStreamIF","To support serialization");
		imports.addImport("org.dmd.dmc.DmcOutputStreamIF","To support serialization");
		imports.addImport("org.dmd.dms.generated.enums.DataTypeEnum","For fake DmcAttributeInfo");
		imports.addImport("org.dmd.dms.generated.enums.ValueTypeEnum","For fake DmcAttributeInfo");
		imports.addImport("org.dmd.dmc.DmcAttributeInfo","For fake DmcAttributeInfo");
		imports.addImport("org.dmd.dmc.util.ComplexTypeSplitter","For parsing initial input");
		imports.addImport("java.util.ArrayList","To store NameValuePairs");
		imports.addImport("org.dmd.dmc.util.NameValuePair","To store values parsed from initial input");

		if (hasRefs) {
			imports.addImport("org.dmd.dmc.DmcNameResolverWithClashSupportIF","Ambiguous reference resolution");
			imports.addImport("org.dmd.dmc.DmcNameClashResolverIF","Ambiguous reference resolution");
			imports.addImport("org.dmd.dmc.DmcNameResolverIF","Reference resolution");
			imports.addImport("org.dmd.dmc.DmcNamedObjectIF","Reference resolution");
			imports.addImport("org.dmd.dmc.DmcNamedObjectREF","Reference resolution");
			imports.addImport("org.dmd.dmc.DmcContainerIF","Reference resolution");
			imports.addImport("org.dmd.dmc.DmcObject","Ambiguous reference resolution");
			imports.addImport("org.dmd.dmc.DmcValueExceptionSet","Ambiguous reference resolution");
		}

		imports.addImport("org.dmd.dmc.DmcValueException","For type checking");

		getComplexTypeImports(imports, parts);
				
		out.write(imports.getFormattedImports() + "\n\n");

		out.write("@SuppressWarnings(\"serial\")\n");

		out.write("/**\n * The " + ctn + " class.\n");
		out.write(" * This code was auto-generated by the createmeta utility and shouldn't be alterred\n");
		out.write(" * manually.\n");
		out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write(" */\n");

		out.write("public class " + ctn + " implements Serializable {\n\n");

		out.write(getComplexTypeFieldInstances(parts));
		
		out.write("    final static int requiredParts = " + requiredCount + ";\n\n");

		out.write("    /**\n");
		out.write("     * Default constructor.\n");
		out.write("     */\n");
		out.write("    public " + ctn + "(){\n");
		out.write("    }\n\n");

		out.write("    /**\n");
		out.write("     * Copy constructor.\n");
		out.write("     */\n");
		out.write("    public " + ctn + "(" + ctn + " original){\n");
		for (Part field : parts) {
			out.write("        " + field.name + " = original." + field.name
					+ ";\n");
		}
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    /**\n");
		out.write("     * All fields constructor.\n");
		out.write("     */\n");
		out.write("    public " + ctn + "(");
		int fnum = 1;
		for (Part field : parts) {
			out.write(field.type + " f" + fnum);
			fnum++;
			if (fnum <= parts.size())
				out.write(", ");
		}

		out.write(") throws DmcValueException {\n");
		fnum = 1;
		for (Part field : parts) {
			if (fnum > requiredCount){
				out.write("        if (f" + fnum + " != null)\n");
				out.write("            " + field.name + " = DmcType" + field.type + "STATIC.instance.typeCheck(f" + fnum + ");\n");				
			}
			else{
				out.write("        " + field.name + " = DmcType" + field.type + "STATIC.instance.typeCheck(f" + fnum + ");\n");
			}
			fnum++;
		}
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    /**\n");
		out.write("     * String based constructor.\n");
		out.write("     */\n");
		out.write("    public " + ctn + "(String initialInput) throws DmcValueException {\n");
		out.write("        initialize(initialInput);\n");
		out.write("    }\n\n");

		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("    void initialize(String initialInput) throws DmcValueException {\n");
		if (whiteSpaceSeparator){
			out.write("        ArrayList<NameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);\n\n");
		}
		else{
			out.write("        ArrayList<NameValuePair> nvp = ComplexTypeSplitter.parse(initialInput,'" + fieldSeparator + "');\n\n");
		}
		
		out.write("        if (nvp.size() < requiredParts)\n");
		out.write("            throw(new DmcValueException(\"Missing required values for complex type: " + ctn + "\"));\n");
		out.write("\n");
		
		fnum = 0;
		boolean firstOptional = true;
		for (Part field : parts) {
			if (fnum < requiredCount){
				// Required fields
				out.write("        "
						+ field.name
						+ " = DmcType"
						+ field.type
						+ "STATIC.instance.typeCheck(nvp.get(" + fnum + ").getValue());\n");
			}
			else{
				if (firstOptional){
					out.write("\n");
					out.write("        if (nvp.size() > requiredParts){\n");
					out.write("            for(int i=" + requiredCount + "; i<nvp.size(); i++){\n");
					out.write("                if (nvp.get(i).getName() == null){\n");
					out.write("                    if (nvp.get(i).getValue() == null)\n");
					out.write("                        throw(new DmcValueException(\"Expecting a partname=\\\"some value\\\" in complex type: " + ctn + "\"));\n");
					out.write("                    else\n");
					out.write("                        throw(new DmcValueException(\"Expecting a partname=\\\"\" + nvp.get(i).getValue() + \"\\\" in complex type: " + ctn + "\"));\n");
					out.write("                }\n");
					
					firstOptional = false;
					out.write("                if (nvp.get(i).getName().equals(\"" + field.name + "\"))\n");
				}
				else{
					out.write("                else if (nvp.get(i).getName().equals(\"" + field.name + "\"))\n");
				}
				out.write("                    "
						+ field.name
						+ " = DmcType"
						+ field.type
						+ "STATIC.instance.typeCheck(nvp.get(i).getValue());\n");
			}
			fnum++;
		}
		
		if (!firstOptional){
			out.write("                else{\n");
			out.write("                    throw(new DmcValueException(\"Unknown field for complex type " + ctn + ": \"  + nvp.get(i).getName()));\n");			
			out.write("                }\n");
			out.write("            }\n");			
			out.write("        }\n\n");			
		}
		
		
		out.write("    }\n\n");
		
		///////////////////////////////////////////////////////////////////////

		out.write("    /**\n");
		out.write("     * Serialization.\n");
		out.write("     */\n");
		out.write("    public void serializeIt(DmcOutputStreamIF dos) throws Exception {\n");
		out.write("        dos.writeUTF(toString());\n");
		out.write("    }\n\n");

		out.write("    /**\n");
		out.write("     * Deserialization.\n");
		out.write("     */\n");
		out.write("    public void deserializeIt(DmcInputStreamIF dis) throws Exception {\n");
		out.write("        initialize(dis.readUTF());\n");
		out.write("    }\n\n");

		///////////////////////////////////////////////////////////////////////
		
		out.write("    /**\n");
		out.write("     * String form.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write("     */\n");
		out.write("    public String toString(){\n");
		out.write("        StringBuffer sb = new StringBuffer();\n");
		fnum = 0;

		for (Part field : parts) {
			String appendStatement = null;
			if (field.quoted)
				appendStatement = "        sb.append(\"\\\"\" + " + field.name + ".toString() + \"\\\"\");\n";
			else
				appendStatement = "        sb.append(" + field.name + ".toString());\n";
			
			if (fnum < requiredCount){
				// Required field, no need to test existence
				
				if (fnum == 0){
						out.write(appendStatement);
				}
				else{
					out.write("        sb.append('" + fieldSeparator +"');\n");
					out.write(appendStatement);
				}
			}
			else{
				// Optional fields always displayed as name=value
				if (field.quoted)
					appendStatement = "        sb.append(\"" + field.name + "=\" + \"\\\"\" + " + field.name + ".toString() + \"\\\"\");\n";
				else
					appendStatement = "        sb.append(\"" + field.name + "=\" + " + field.name + ".toString());\n";

				out.write("        if (" + field.name + " != null){\n");
				if (fnum == 0){
					out.write("    " + appendStatement);
				}
				else{
					out.write("            sb.append('" + fieldSeparator +"');\n");
					out.write("    " + appendStatement);
				}
				out.write("        }\n\n");
			}

			fnum++;
		}
		out.write("        return(sb.toString());\n");

		out.write("    }\n\n");
		
		///////////////////////////////////////////////////////////////////////

		for (Part field : parts) {
			out.write("    public " + field.type + " get"
					+ GenUtility.capTheName(field.name) + "(){\n");
			out.write("        return(" + field.name + ");\n");
			out.write("    }\n\n");
		}

		if (hasRefs) {
			out.write("    @SuppressWarnings({\"unchecked\", \"rawtypes\"})\n");
			out.write("    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {\n");
			out.write("        DmcNamedObjectIF  obj = null;\n\n");

			for (String fn : refFields) {
				out.write("        if ((" + fn + " != null) && (!" + fn + ".isResolved())){\n");
				out.write("            obj = resolver.findNamedObject(" + fn + ".getObjectName());\n");
				out.write("            if (obj == null)\n");
				out.write("                throw(new DmcValueException(\"Could not resolve reference to: \" + " + fn + ".getObjectName() + \" via attribute: \" + attrName));\n");
				out.write("        \n");
				out.write("            if (obj instanceof DmcContainerIF)\n");
				out.write("                ((DmcNamedObjectREF)" + fn + ").setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());\n");
				out.write("            else\n");
				out.write("                ((DmcNamedObjectREF)" + fn + ").setObject(obj);\n");
				out.write("        }\n");
				out.write("        \n");
			}

			out.write("    }\n\n");
			
			
			out.write("    @SuppressWarnings({\"unchecked\", \"rawtypes\"})\n");
			out.write("    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {\n");
			out.write("        DmcNamedObjectIF  obj = null;\n\n");

			for (String fn : refFields) {
				out.write("        if ((" + fn + " != null) && (!" + fn + ".isResolved())){\n");
				out.write("            obj = resolver.findNamedObjectMayClash(object, " + fn + ".getObjectName(), ncr, " + fn + "AI);\n");
				out.write("            if (obj == null)\n");
				out.write("                throw(new DmcValueException(\"Could not resolve reference to: \" + "
						+ fn
						+ ".getObjectName() + \" via attribute: \" + ai.name));\n");
				out.write("        \n");
				out.write("            if (obj instanceof DmcContainerIF)\n");
				out.write("                ((DmcNamedObjectREF)"
						+ fn
						+ ").setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());\n");
				out.write("            else\n");
				out.write("                ((DmcNamedObjectREF)" + fn
						+ ").setObject(obj);\n");
				out.write("        }\n");
				out.write("        \n");
			}

			out.write("    }\n\n");

		}

		///////////////////////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////////////////

		out.write("}\n");

		out.close();

		GenUtility.dumpComplexTypeDmcType(mg.LGPL.toString(), "org.dmd.dms", od, ctn, hasRefs);

	}
	
	static void getComplexTypeImports(ImportManager imports, ArrayList<Part> fields) throws ResultException {
//		StringBuffer sb = new StringBuffer();
//		TreeMap<String, String> uniqueImports = new TreeMap<String, String>();

		for (Part field : fields) {
			// DebugInfo.debug("field type = " + field.type);

			DmcUncheckedObject typeDef = meta.typeDefs.get(field.type);

			if (typeDef == null) {
				typeDef = meta.enumDefs.get(field.type);
				if (typeDef != null) {
					String imp = "org.dmd.dms.generated.enums." + field.type;
//					uniqueImports.put(imp, imp);
					imports.addImport(imp, "Type for field: " + field.name);
				} else {
					typeDef = meta.typeDefs.get(field.type + "REF");
					String primitiveType = typeDef.getSV("primitiveType");

					if (primitiveType != null){
//						uniqueImports.put(primitiveType, primitiveType);
						imports.addImport(primitiveType, "Type for field: " + field.name);
					}
				}
			}

		}

//		for (String importStr : uniqueImports.values()) {
//			sb.append("import " + importStr + ";\n");
//		}

//		return (sb.toString());
	}

	static String getComplexTypeFieldInstances(ArrayList<Part> fields) {
		StringBuffer sb = new StringBuffer();

		for (Part field : fields) {
			sb.append("    // " + field.descr + "\n");
			sb.append("    " + field.type + " " + field.name + ";\n");
//			DmcAttributeInfo("type",19,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
			
			String type = field.type;
			type = type.replaceAll("REF", "");
			sb.append("    final static DmcAttributeInfo " + field.name + "AI = new DmcAttributeInfo(\""+ field.name + "\",0,\"" + type + "\",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);\n\n");
		}

		return (sb.toString());
	}

	static void getComplexTypeParts(String attrName, DmcUncheckedObject ct, ArrayList<Part> rc) throws DmcValueException {
		ArrayList<NameValuePair> partNVP = null;
		
//		ArrayList<Part> rc = new ArrayList<Part>();

		NamedStringArray parts = ct.get(attrName);
		
		if (parts == null)
			return;
		
		for (String part : parts) {
			partNVP = ComplexTypeSplitter.parse(part);
			
			String type = partNVP.get(0).getValue();
			String name = partNVP.get(1).getValue();
			String descr = partNVP.get(2).getValue();
			String quoted = null;
			if (partNVP.size()>3)
				quoted = partNVP.get(3).getValue();

			DmcUncheckedObject typeDef = meta.typeDefs.get(type);
			if (typeDef == null) {
				if (meta.enumDefs.get(type) == null)
					type = type + "REF";
			}

			rc.add(new Part(type, name, descr, quoted));
		}

//		return (rc);
	}

	static class Part {
		String type;
		String name;
		String descr;
		boolean quoted;

		Part(String t, String n, String d, String q) {
			type = t;
			name = n;
			descr = d;
			if (q != null){
				if (q.toLowerCase().equals("true"))
					quoted = true;
			}
		}

	}

}