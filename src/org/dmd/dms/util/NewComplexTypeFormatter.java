package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.dms.ComplexTypeDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.types.Part;
//import org.dmd.dms.generated.types.Field;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class NewComplexTypeFormatter {
	
//	public static void dumpComplexTypes(String fileHeader, SchemaDefinition sd, String typedir) throws IOException, ResultException{
//		for(ComplexTypeDefinition ctd: sd.getComplexTypeDefList()){
//			dumpComplexType(fileHeader,typedir,ctd);
//		}
//	}
	
	// Don't want to get in trouble if someone specifies a java keyword as a value
	// name, so we put a standard suffix on all variables.
	final static String valSuffix = "V";

    static void dumpComplexType(String header, String od, ComplexTypeDefinition ctd) throws IOException, ResultException {
    	String 			ctn 			= ctd.getName().getNameString();
    	String 			fieldSeparator 	= ctd.getFieldSeparator();
        Iterator<Part>	parts 			= null;
        ArrayList<Part>	combinedParts	= new ArrayList<Part>();
        int				requiredCount		= ctd.getRequiredPartSize();
        boolean			whiteSpaceSeparator = false;
        boolean			anyMultiValued		= false;
    	
    	if (fieldSeparator == null){
    		whiteSpaceSeparator = true;
    		fieldSeparator = " ";
    	}
    	
        BufferedWriter out = FileUpdateManager.instance().getWriter(od, ctn + ".java");
        
        if (ctd.getRequiredPartSize() > 0){
	        parts = ctd.getRequiredPart();
	        while(parts.hasNext()){
	        	Part p = parts.next();
	        	combinedParts.add(p);
	        	if ((p.getMultivalued() != null) && p.getMultivalued())
	        		anyMultiValued = true;
	        }
        }
        
        if (ctd.getOptionalPartSize() > 0){
	        parts = ctd.getOptionalPart();
	        while(parts.hasNext()){
	        	Part p = parts.next();
	        	combinedParts.add(p);
	        	if ((p.getMultivalued() != null) && p.getMultivalued())
	        		anyMultiValued = true;
	        }
        }
        
        // Determine if we have any reference fields
        boolean hasRefs = false;
        boolean isGreedy = false;
        ArrayList<Part> 	refFields 	= new ArrayList<Part>();
        ArrayList<Part> 	mvrefFields = new ArrayList<Part>();
        for(Part part: combinedParts){
        	TypeDefinition type = (TypeDefinition) part.getType().getObject().getContainer();
        	
        	if (type == null){
        		DebugInfo.debug("Unknown type in ComplexTypeDefinition: " + part.getType().getObjectName());
        		System.exit(1);
        	}

        	if (type.getIsRefType()){
        		hasRefs = true;
        		
        		if ((part.getMultivalued() != null) && part.getMultivalued())
        			mvrefFields.add(part);
        		else
        			refFields.add(part);
        	}
        	
        	if (type.getComplexType() != null){
        		if (type.getComplexType().hasReferenceTypeParts()){
            		if ((part.getMultivalued() != null) && part.getMultivalued()){
//            			DebugInfo.debug(part.getName() + " - is multi-valued and has references");
            			mvrefFields.add(part);
            		}
            		else{
//            			DebugInfo.debug(part.getName() + " - is single-valued and has references");
            			refFields.add(part);
            		}
        		}
        	}

        	if ( (part.getGreedy() != null) && part.getGreedy()){
        		isGreedy = true;
        	}
        }
        
        if (header != null)
        	out.write(header);
        
        out.write("package " + ctd.getDefinedIn().getSchemaPackage() + ".generated.types;\n\n");

		ImportManager imports = new ImportManager();

		imports.addImport("java.io.Serializable", "To prevent serialization warnings");
		imports.addImport("org.dmd.dmc.DmcInputStreamIF", "Standard serialization techniques");
		imports.addImport("org.dmd.dmc.DmcOutputStreamIF", "Standard serialization techniques");
		imports.addImport("org.dmd.dms.generated.enums.DataTypeEnum","For fake DmcAttributeInfo");
		imports.addImport("org.dmd.dms.generated.enums.ValueTypeEnum","For fake DmcAttributeInfo");
		imports.addImport("org.dmd.dmc.DmcAttributeInfo","For fake DmcAttributeInfo");
		imports.addImport("org.dmd.dmc.util.ComplexTypeSplitter","For parsing initial input");
		imports.addImport("java.util.ArrayList","To store ParsedNameValuePairs");
		imports.addImport("org.dmd.dmc.util.ParsedNameValuePair","To store values parsed from initial input");
		imports.addImport("org.dmd.dmc.util.JSONUtil","To perform escaping of things in JSON");
		
		if (anyMultiValued)
			imports.addImport("java.util.Iterator","To support multi-valued optional parts");
        
        if (hasRefs){
    		imports.addImport("org.dmd.dmc.DmcNameResolverIF", "To support object references");
    		imports.addImport("org.dmd.dmc.DmcNamedObjectIF", "To support object references");
    		imports.addImport("org.dmd.dmc.DmcNamedObjectREF", "To support object references");
    		imports.addImport("org.dmd.dmc.DmcContainerIF", "To support object references");
    		
    		imports.addImport("org.dmd.dmc.DmcNameResolverWithClashSupportIF", "To support possible clashing object references");
    		imports.addImport("org.dmd.dmc.DmcAttributeInfo", "To support possible clashing object references");
    		imports.addImport("org.dmd.dmc.DmcNameClashResolverIF", "To support possible clashing object references");
    		imports.addImport("org.dmd.dmc.DmcObject", "To support possible clashing object references");
    		imports.addImport("org.dmd.dmc.DmcValueExceptionSet", "To support possible clashing object references");
    		imports.addImport("org.dmd.dmc.DmcOmni","To enable back reference tracking");
    		imports.addImport("org.dmd.dmc.types.Modifier","To enable back reference tracking");
    		imports.addImport("org.dmd.dmc.DmcContainerIF","To enable back reference tracking");
        }

		imports.addImport("org.dmd.dmc.DmcValueException", "Standard value exception");

//		getComplexTypeImports(ctd, imports);
		getComplexTypeImports(combinedParts, imports);
		
		out.write(imports.getFormattedImports() + "\n\n");
        
        out.write("@SuppressWarnings(\"serial\")\n");

        out.write("/**\n * The " + ctn + " class.\n");
        out.write(" * This code was auto-generated and shouldn't be alterred manually.\n");
        out.write(" * \n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");

        out.write("public class " + ctn + " implements Serializable {\n\n");
        
		out.write("    final static int requiredParts = " + requiredCount + ";\n\n");

        out.write(getComplexTypeFieldInstances(combinedParts));
        	
        out.write("    /**\n");
        out.write("     * Default constructor.\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(){\n");
    	out.write("    }\n\n");
        		            	
        out.write("    /**\n");
        out.write("     * Copy constructor.\n");
        out.write("     */\n");
        if (anyMultiValued)
            out.write("    @SuppressWarnings(\"unchecked\")\n");
        	
        out.write("    public " + ctn + "(" + ctn + " original){\n");
        
        out.write(getCopyConstructorAssignments(combinedParts));

    	out.write("    }\n\n");
        
    	///////////////////////////////////////////////////////////////////////
    	
        out.write("    /**\n");
        out.write("     * All fields constructor.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(");
        int fnum = 1;
        
        for(Part part: combinedParts){
        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
        	
    		// For multivalued optional parts
    		String	mvs = "";
    		String	mve = "";
    		
    		if ((part.getMultivalued() != null) && part.getMultivalued()){
    			mvs = "ArrayList<";
    			mve = ">";
    		}


        	if (type.getIsRefType()){
        		out.write(mvs + part.getType().getObjectName() + "REF" + mve + " " + part.getName() + "_");
        	}
        	else{
        		out.write(mvs + part.getType().getObjectName() + mve + " "  + part.getName() + "_");
        	}

        	fnum++;
        	if (fnum <= combinedParts.size())
        		out.write(", ");
        }
        
        out.write(") throws DmcValueException {\n");
        
        fnum = 1;
        for(Part part: combinedParts){
        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
        	String assignment = null;
        	String ref = "";
        	String pn = part.getName() + valSuffix;
        	String pt = part.getType().getObjectName().getNameString();
        	
        	if (type.getIsRefType()){
        		ref = "REF";
        		assignment = "        " + pn + " = DmcType" + pt + "REFSTATIC.instance.typeCheck("  + part.getName() + "_" + ");\n";
        	}
        	else{
        		assignment = "        " + pn + " = DmcType" + pt + "STATIC.instance.typeCheck("  + part.getName() + "_" + ");\n";
        	}
        	
        	if (fnum > requiredCount){
        		if ((part.getMultivalued() != null) && part.getMultivalued()){
					out.write("        if ("  + part.getName() + "_" + " != null){\n");
					out.write("            " + pn + " = new ArrayList<" + pt + ref + ">();\n");
        			out.write("            for(" + pt + ref + " v: " + part.getName() + "_){\n");
        			out.write("                " + pn + ".add(DmcType" + pt + ref + "STATIC.instance.typeCheck(v));\n");
        			out.write("            }\n");
        			out.write("        }\n");
        		}
        		else{
					out.write("        if ("  + part.getName() + "_" + " != null)\n");
	        		out.write("    " + assignment);
        		}
        	}
        	else{
        		if ((part.getMultivalued() != null) && part.getMultivalued()){
					out.write("        if ("  + part.getName() + "_" + " != null){\n");
					out.write("            " + pn + " = new ArrayList<" + pt + ref + ">();\n");
        			out.write("            for(" + pt + ref + " v: " + part.getName() + "_){\n");
        			out.write("                " + pn + ".add(DmcType" + pt + ref + "STATIC.instance.typeCheck(v));\n");
        			out.write("            }\n");
        			out.write("        }\n");
        		}
        		else 
        			out.write(assignment);
        	}
        	
        	fnum++;
        }
    	out.write("    }\n\n");
    	
    	///////////////////////////////////////////////////////////////////////
    	
        out.write("    /**\n");
        out.write("     * String based constructor.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    public " + ctn + "(String initialInput) throws DmcValueException {\n");
        out.write("        initialize(initialInput);\n");
        out.write("    }\n");
    	
        out.write("    /**\n");
        out.write("     * Initialize content based on string form.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    void initialize(String initialInput) throws DmcValueException {\n");
//        out.write("        IntegerVar seppos = new IntegerVar(-1);\n");

        int stopAfter = combinedParts.size() - 1;
		if (whiteSpaceSeparator){
			if (isGreedy)
				out.write("        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput, ' ', " + stopAfter + ");\n\n");
			else
				out.write("        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);\n\n");
		}
		else{
			if (isGreedy)
				out.write("        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput,'" + fieldSeparator + "', " + stopAfter + ");\n\n");
			else
				out.write("        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput,'" + fieldSeparator + "');\n\n");
		}
		
		out.write("        if (nvp.size() < requiredParts)\n");
		out.write("            throw(new DmcValueException(\"Missing required values for complex type: " + ctn + "\\nValue: \" + initialInput));\n");
		out.write("\n");

		fnum = 0;
		String indent = "                    ";
		
		boolean firstOptional = true;
        for(Part part: combinedParts){
//        	Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
        	String REF = "";
        	String openBrace = "";
        	String pn = part.getName() + valSuffix;
        	
        	boolean	isMulti = false;
        	if (type.getIsRefType())
        		REF = "REF";
        	if ((part.getMultivalued() != null) && part.getMultivalued()){
        		isMulti = true;
        		openBrace = "{";
        	}
        		
			if (fnum < requiredCount){
				if (isMulti){
					// This is a multi-valued required part, which means it's the only part
					// 20140603 - fix to handle a single value - >= requiredParts and i=0
					out.write("\n");
					out.write("        if (nvp.size() >= requiredParts){\n");
					out.write("            for(int i=0; i<nvp.size(); i++){\n");
//					out.write("                if (nvp.get(i).getName() == null){\n");
//					out.write("                    if (nvp.get(i).getValue() == null)\n");
//					out.write("                        throw(new DmcValueException(\"Expecting a partname=\\\"some value\\\" in complex type: " + ctn + "\"));\n");
//					out.write("                    else\n");
//					out.write("                        throw(new DmcValueException(\"Expecting a partname=\\\"\" + nvp.get(i).getValue() + \"\\\" in complex type: " + ctn + "\"));\n");
//					out.write("                }\n");
					out.write("                if (" + pn + " == null)\n");
					out.write("                    " + pn + " = new ArrayList<" + part.getType().getObjectName() + REF + ">();\n");
					out.write("                " + pn + ".add(DmcType" + part.getType().getObjectName() + REF + "STATIC.instance.typeCheck(nvp.get(i).getValue()));\n");
					out.write("            }\n");
					out.write("        }\n");
				}
				else
					out.write("        " + part.getName() + valSuffix + " = DmcType" + part.getType().getObjectName() + REF + "STATIC.instance.typeCheck(nvp.get(" + fnum + ").getValue());\n");
			}
			else{
				
				if (firstOptional){
					out.write("\n");
					out.write("        if (nvp.size() > requiredParts){\n");
					out.write("            for(int i=" + requiredCount + "; i<nvp.size(); i++){\n");
					out.write("                if (nvp.get(i).getName() == null){\n");
					out.write("                    if (nvp.get(i).getValue() == null)\n");
					out.write("                        throw(new DmcValueException(\"Expecting a partname=\\\"some value\\\" in complex type: " + ctn + "\\nValue: \" + initialInput));\n");
					out.write("                    else\n");
					out.write("                        throw(new DmcValueException(\"Expecting a partname=\\\"\" + nvp.get(i).getValue() + \"\\\" in complex type: " + ctn + "\\nValue: \" + initialInput));\n");
					out.write("                }\n");
					firstOptional = false;
					out.write("                if (nvp.get(i).getName().equals(\"" + part.getName() + "\"))" + openBrace +"\n");
				}
				else{
					out.write("                else if (nvp.get(i).getName().equals(\"" + part.getName() + "\"))" + openBrace + "\n");
				}
				
				if (isMulti){
					out.write(indent + "if (" + pn + " == null)\n");
					out.write(indent + "    " + pn + " = new ArrayList<" + part.getType().getObjectName() + REF + ">();\n");
					out.write(indent + pn + ".add(DmcType" + part.getType().getObjectName() + REF + "STATIC.instance.typeCheck(nvp.get(i).getValue()));\n");
					out.write("                }\n");
				}
				else{
					out.write(indent + pn + " = DmcType" + part.getType().getObjectName() + REF + "STATIC.instance.typeCheck(nvp.get(i).getValue());\n");
				}
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
        
		for (Part part : combinedParts) {
			boolean isMulti = false;
			boolean isQuoted = false;
			String pn = part.getName() + valSuffix;
			
			if ((part.getMultivalued() != null) && part.getMultivalued())
				isMulti = true;
			
			if ((part.getQuoted() != null) && part.getQuoted())
				isQuoted = true;
			
			String appendStatement = null;
			if (isQuoted)
				appendStatement = "        sb.append(\"\\\"\" + " + pn + ".toString() + \"\\\"\");\n";
			else
				appendStatement = "        sb.append(" + pn + ".toString());\n";
			
			if (fnum < requiredCount){
				// Required field, no need to test existence
				if (isMulti){
		        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
		        	String REF = "";
		        	if (type.getIsRefType())
		        		REF = "REF";

					out.write("            boolean first = true;\n");
					out.write("            for(" + type.getName() + REF + " v: " + pn + "){\n");
					out.write("                if (first)\n");
					out.write("                    first = false;\n");
					out.write("                else\n");
					out.write("                    sb.append('" + fieldSeparator +"');\n");
					if (isQuoted)
						out.write("                sb.append(\"\\\"\" + v.toString() + \"\\\"\");\n");
					else
						out.write("                sb.append(v.toString());\n");
					out.write("            }\n");					
				}
				else{
					if (fnum == 0){
							out.write(appendStatement);
					}
					else{
						out.write("        sb.append('" + fieldSeparator +"');\n");
						out.write(appendStatement);
					}
				}
			}
			else{
				// Optional fields always displayed as name=value
				if (isQuoted)
					appendStatement = "        sb.append(\"" + part.getName() + "=\" + \"\\\"\" + " + part.getName() + valSuffix + ".toString() + \"\\\"\");\n";
				else
					appendStatement = "        sb.append(\"" + part.getName() + "=\" + " + part.getName() + valSuffix + ".toString());\n";
				
				out.write("        if (" + part.getName() + valSuffix + " != null){\n");
				
				if (isMulti){
		        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
		        	String REF = "";
		        	if (type.getIsRefType())
		        		REF = "REF";

					out.write("            for(" + type.getName() + REF + " v: " + pn + "){\n");
					out.write("                sb.append('" + fieldSeparator +"');\n");
					if (isQuoted)
						out.write("                sb.append(\"" + part.getName() + "=\" + \"\\\"\" + v.toString() + \"\\\"\");\n");
					else
						out.write("                sb.append(\"" + part.getName() + "=\" + v.toString());\n");
					out.write("            }\n");
				}
				else{
					if (fnum == 0){
						out.write("    " + appendStatement);
					}
					else{
						out.write("            sb.append('" + fieldSeparator +"');\n");
						out.write("    " + appendStatement);
					}
				}
				
				out.write("        }\n\n");
			}

			fnum++;
		}
		out.write("        return(sb.toString());\n");

		out.write("    }\n\n");
		
		
		///////////////////////////////////////////////////////////////////////
		// EQUALS
		
		out.write("    @Override\n");
		out.write("    public boolean equals(Object obj) {\n");
		out.write("        if (obj instanceof " + ctn + ") {\n");
		out.write("            return(this.toString().equals(((" + ctn + ")obj).toString()));\n");
		out.write("        }\n");
		out.write("        return(false);\n");
		out.write("    }\n");
		
		
		///////////////////////////////////////////////////////////////////////
		// JSON
    	
        out.write("    /**\n");
        out.write("     * JSON form.\n");
        out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("     */\n");
        out.write("    public void toJSON(StringBuffer sb, int padding, String indent){\n");
        fnum = 0;

        out.write("        sb.append(indent + \"{\\n\");\n");

        Iterator<Part> partIT = combinedParts.iterator();
        while(partIT.hasNext()){
        	Part part = partIT.next();
        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
        	
//		for (Part part : combinedParts) {
			boolean isMulti = false;
			String key = part.getName();
			String pn = part.getName() + valSuffix;
			boolean isComplex = false;
			
			if (type.getComplexType() != null)
				isComplex = true;
			
			if ((part.getMultivalued() != null) && part.getMultivalued())
				isMulti = true;
			
			if (fnum < requiredCount){
	        	String ENDING = "";
				if ((fnum+1) < requiredCount)
					ENDING = ",\\n";
				
				// Required field, no need to test existence
				if (isMulti){		        		
		        	String REF = "";
		        	if (type.getIsRefType())
		        		REF = "REF";
		        	
		        	////
		        	if (isComplex){
		        		out.write("            sb.append(indent + \"  \\\"" + key + "\\\": [\\n\");\n");
						out.write("            Iterator<" + type.getName() + REF + "> it = " + pn + ".iterator();\n");
						out.write("            while(it.hasNext()){\n");
						out.write("                " + type.getName() + REF + " v = it.next();\n");
//						out.write("                sb.append(indent + \"\\\"" + key + "\\\": \");\n");
						out.write("                v.toJSON(sb, padding, indent + \"    \");\n");
						out.write("                if (it.hasNext())\n");
						out.write("                    sb.append(\",\\n\");\n");
						out.write("            }" + ENDING + "\n");
						out.write("            sb.append(\"\\n\" + indent + \"  ]\");\n");
		        	}
		        	else{
						////
		        		out.write("            sb.append(indent + \"  \\\"" + key + "\\\": [\\n\");\n");
						out.write("            Iterator<" + type.getName() + REF + "> it = " + pn + ".iterator();\n");
						out.write("            while(it.hasNext()){\n");
						out.write("                " + type.getName() + REF + " v = it.next();\n");
						out.write("                sb.append(indent + \"  \\\"\" + JSONUtil.escape(v.toString()) + \"\\\"\");\n");
//						out.write("                sb.append(indent + \"  \\\"\" + v.toString().replace(\"\\\"\", \"\\\\\\\"\") + \"\\\"\");\n");
//						out.write("                sb.append(indent + \"\\\"" + key + "\\\": \\\"\" + v.toString().replace(\"\\\"\", \"\\\\\\\"\") + \"\\\"\");\n");
						out.write("                if (it.hasNext())\n");
						out.write("                    sb.append(\",\");\n");
						out.write("            }" + ENDING + "\n");
						out.write("            sb.append(\"\\n\" + indent + \"]\");\n");
		        	}
					////
				}
				else{
					if (isComplex){
						out.write("        sb.append(indent + \"  \\\"" + key + "\\\": \");\n");
						out.write("        " + pn + ".toJSON(sb, padding, indent);\n");
						out.write("        sb.append(\"" + ENDING + "\");\n");
					}
					else
								out.write("        sb.append(indent + \"  \\\"" + key + "\\\": \\\"\" + JSONUtil.escape(" + pn + ".toString()) + \"\\\"" + ENDING + "\");\n");
//								out.write("        sb.append(indent + \"  \\\"" + key + "\\\": \\\"\" + " + pn + ".toString().replace(\"\\\"\", \"\\\\\\\"\") + \"\\\"" + ENDING + "\");\n");
				}
					
			}
			else{
				out.write("        if (" + part.getName() + valSuffix + " != null){\n");
				out.write("            sb.append(\",\\n\");\n");
				
				if (isMulti){
		        	String REF = "";
		        	if (type.getIsRefType())
		        		REF = "REF";

		        	if (isComplex){
		        		out.write("            sb.append(indent + \"  \\\"" + key + "\\\": [\\n\");\n");
						out.write("            Iterator<" + type.getName() + REF + "> it = " + pn + ".iterator();\n");
						out.write("            while(it.hasNext()){\n");
						out.write("                " + type.getName() + REF + " v = it.next();\n");
//						out.write("                sb.append(indent + \"\\\"" + key + "\\\": \");\n");
						out.write("                v.toJSON(sb, padding, indent + \"    \");\n");
						out.write("                if (it.hasNext())\n");
						out.write("                    sb.append(\",\\n\");\n");
						out.write("            }\n");
						out.write("            sb.append(\"\\n\" + indent + \"  ]\");\n");
		        	}
		        	else{
						////
		        		out.write("            sb.append(indent + \"  \\\"" + key + "\\\": [\\n\");\n");
						out.write("            Iterator<" + type.getName() + REF + "> it = " + pn + ".iterator();\n");
						out.write("            while(it.hasNext()){\n");
						out.write("                " + type.getName() + REF + " v = it.next();\n");
						out.write("                sb.append(indent + \"  \\\"\" + JSONUtil.escape(v.toString()) + \"\\\"\");\n");
//						out.write("                sb.append(indent + \"  \\\"\" + v.toString().replace(\"\\\"\", \"\\\\\\\"\") + \"\\\"\");\n");
//						out.write("                sb.append(indent + \"\\\"" + key + "\\\": \\\"\" + v.toString().replace(\"\\\"\", \"\\\\\\\"\") + \"\\\"\");\n");
						out.write("                if (it.hasNext())\n");
						out.write("                    sb.append(\",\");\n");
						out.write("            }\n");
						out.write("            sb.append(\"\\n\" + indent + \"]\");\n");
		        	}
					////
				}
				else{
					if (isComplex){
						out.write("        sb.append(indent + \"  \\\"" + key + "\\\": \");\n");
						out.write("        " + pn + ".toJSON(sb, padding, indent);\n");
					}
					
					out.write("            sb.append(indent + \"  \\\"" + key + "\\\": \\\"\" + JSONUtil.escape(" + pn + ".toString()) + \"\\\"\");\n");
//					out.write("            sb.append(indent + \"  \\\"" + key + "\\\": \\\"\" + " + pn + ".toString().replace(\"\\\"\", \"\\\\\\\"\") + \"\\\"\");\n");
				}
				
				out.write("        }\n\n");
			}

			fnum++;
		}
		
		out.write("        sb.append(\"\\n\" + indent + \"}\");\n");

		out.write("    }\n\n");
		
		///////////////////////////////////////////////////////////////////////
    	
        for(Part part: combinedParts){
//        	Field field = fields.next();
        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
			boolean isMulti = false;
			String pn = part.getName() + valSuffix;
			String ref = "";
			
			if (type.getIsRefType())
				ref = "REF";
			
			if ((part.getMultivalued() != null) && part.getMultivalued())
				isMulti = true;
        	
			if (isMulti){
		        out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
                out.write("    public Iterator<" + part.getType().getObjectName() + ref + "> get" + Manipulator.capFirstChar(part.getName()) + "(){\n");
            	out.write("        if (" + pn + " == null)\n");
            	out.write("            return(null);\n");
            	out.write("        return(" + pn + ".iterator());\n");
            	out.write("    }\n\n");
            	
		        out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
                out.write("    public boolean has" + Manipulator.capFirstChar(part.getName()) + "(){\n");
            	out.write("        if (" + pn + " == null)\n");
            	out.write("            return(false);\n");
            	out.write("        return(true);\n");
            	out.write("    }\n\n");
            	
		        out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
                out.write("    public int get" + Manipulator.capFirstChar(part.getName()) + "Size(){\n");
            	out.write("        if (" + pn + " == null)\n");
            	out.write("            return(0);\n");
            	out.write("        return(" + pn + ".size());\n");
            	out.write("    }\n\n");
            	
		        out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
                out.write("    public " + part.getType().getObjectName() + ref + " get" + Manipulator.capFirstChar(part.getName()) + "(int index){\n");
            	out.write("        if (" + pn + " == null)\n");
            	out.write("            return(null);\n");
            	out.write("        return(" + pn + ".get(index));\n");
            	out.write("    }\n\n");
			}
			else{
                out.write("    public " + part.getType().getObjectName() + ref + " get" + Manipulator.capFirstChar(part.getName()) + "(){\n");
            	out.write("        return(" + pn + ");\n");
            	out.write("    }\n\n");
			}
			
        }
        
        ///////////////////////////////////////////////////////////////////////
        
        if (hasRefs){
            out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        	out.write("    @SuppressWarnings({\"unchecked\", \"rawtypes\"})\n");
            out.write("    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {\n");
        	out.write("        DmcNamedObjectIF  obj = null;\n\n");
            
            for(Part part: refFields){
            	String pn = part.getName();
            	TypeDefinition type = (TypeDefinition) part.getType().getObject().getContainer();
            	
            	if (type.getComplexType() == null){
	            	out.write("        if ((" + pn + valSuffix + " != null) && (!" + pn + valSuffix + ".isResolved())){\n");
	            	out.write("            obj = resolver.findNamedObject(" + pn + valSuffix + ".getObjectName());\n");
	            	out.write("            if (" + pn + "AI.weakReference)\n");
	            	out.write("                return;\n");
	            	out.write("            if (obj == null)\n");
	            	out.write("                throw(new DmcValueException(\"Could not resolve reference to: \" + " + pn + valSuffix + ".getObjectName() + \"(part: " + part.getName() + " - of type: " + type.getName() + ") via attribute: \" + attrName));\n");
	            	out.write("        \n");
	            	out.write("            if (obj instanceof DmcContainerIF)\n");
	            	out.write("                ((DmcNamedObjectREF)" + pn + valSuffix + ").setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());\n");
	            	out.write("            else\n");
	            	out.write("                ((DmcNamedObjectREF)" + pn + valSuffix + ").setObject(obj);\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            	else{
	            	out.write("        if (" + pn + valSuffix + " != null){\n");
	            	out.write("            " + pn + valSuffix + ".resolve(resolver, attrName);\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            }

            for(Part part: mvrefFields){
            	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
            	String pn = part.getName() + valSuffix;
            	
            	if (type.getComplexType() == null){
	            	out.write("        if (" + pn + " != null){\n");
	            	out.write("            for(" + type.getName() + "REF v: " + pn + "){\n");
	            	out.write("                if (v.isResolved())\n");
	            	out.write("                    continue;\n");
	            	out.write("                obj = resolver.findNamedObject(v.getObjectName());\n");
	            	out.write("                if (" + part.getName() + "AI.weakReference)\n");
	            	out.write("                    return;\n");
	            	out.write("                if (obj == null)\n");
	            	out.write("                    throw(new DmcValueException(\"Could not resolve reference to: \" + v.getObjectName() + \" (part: " + part.getName() + " - of type: " + type.getName() + ") via attribute: \" + attrName));\n");
	            	out.write("        \n");
	            	out.write("                if (obj instanceof DmcContainerIF)\n");
	            	out.write("                    ((DmcNamedObjectREF)v).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());\n");
	            	out.write("                else\n");
	            	out.write("                    ((DmcNamedObjectREF)v).setObject(obj);\n");
	            	out.write("            }\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            	else{
//            		throw(new IllegalStateException("No support yet for multi-valued parts that are complex types with refs!"));
	            	out.write("        if (" + pn + " != null){\n");
	            	out.write("            for(" + type.getName() + " v: " + pn + "){\n");
	            	out.write("                v.resolve(resolver, attrName);\n");
	            	out.write("            }\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            }

        	out.write("    }\n\n");
        	
        	
        	
        	
            out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        	out.write("    @SuppressWarnings({\"unchecked\", \"rawtypes\"})\n");
            out.write("    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {\n");
        	out.write("        DmcNamedObjectIF  obj = null;\n\n");
            
            for(Part part: refFields){
            	TypeDefinition type = (TypeDefinition) part.getType().getObject().getContainer();
            	String pn = part.getName();
            	
            	if (type.getComplexType() == null){
	            	out.write("        if ((" + pn + valSuffix + " != null) && (!" + pn + valSuffix + ".isResolved())){\n");
	            	out.write("            obj = resolver.findNamedObjectMayClash(object, " + pn + valSuffix + ".getObjectName(), ncr, " + pn + "AI);\n");
	            	out.write("            if (" + pn + "AI.weakReference)\n");
	            	out.write("                return;\n");
	            	out.write("            if (obj == null)\n");
	            	out.write("                throw(new DmcValueException(\"Could not resolve reference to: \" + " + pn + valSuffix + ".getObjectName() + \"(part: " + part.getName() + " - of type: " + type.getName() + ") via attribute: \" + ai.name));\n");
	            	out.write("        \n");
	            	out.write("            if (obj instanceof DmcContainerIF)\n");
	            	out.write("                ((DmcNamedObjectREF)" + pn + valSuffix + ").setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());\n");
	            	out.write("            else\n");
	            	out.write("                ((DmcNamedObjectREF)" + pn + valSuffix + ").setObject(obj);\n");
	            	out.write("        \n");
	            	out.write("            if (DmcOmni.instance().backRefTracking()){\n");
	            	out.write("                Modifier backrefMod = new Modifier(\"" + pn + "\", object, " + pn + valSuffix + ", ai.id, ai.name);\n");
	            	out.write("                if (obj instanceof DmcContainerIF)\n");
	            	out.write("                    ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);\n");
	            	out.write("                else\n");
	            	out.write("                    ((DmcObject)obj).addBackref(backrefMod);\n");
	            	out.write("                " + pn + valSuffix + ".setBackrefModifier(backrefMod);\n");
	            	out.write("            }\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            	else{
	            	out.write("        if (" + pn + valSuffix + " != null){\n");
	            	out.write("            " + pn + valSuffix + ".resolve(resolver, object, ncr, ai);\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            }
            
            for(Part part: mvrefFields){
            	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
            	String pn = part.getName() + valSuffix;
            	
            	if (type.getComplexType() == null){
	            	out.write("        if (" + pn + " != null){\n");
	            	out.write("            for(" + type.getName() + "REF v: " + pn + "){\n");
	            	out.write("                if (v.isResolved())\n");
	            	out.write("                    continue;\n");
	            	out.write("                obj = resolver.findNamedObjectMayClash(object, v.getObjectName(), ncr, " + part.getName() + "AI);\n");
	            	out.write("                if (" + part.getName() + "AI.weakReference)\n");
	            	out.write("                    return;\n");
	            	out.write("                if (obj == null)\n");
	            	out.write("                    throw(new DmcValueException(\"Could not resolve reference to: \" + v.getObjectName() + \" via attribute: \" + ai.name));\n");
	            	out.write("        \n");
	            	out.write("                if (obj instanceof DmcContainerIF)\n");
	            	out.write("                    ((DmcNamedObjectREF)v).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());\n");
	            	out.write("                else\n");
	            	out.write("                    ((DmcNamedObjectREF)v).setObject(obj);\n");
	            	out.write("        \n");
	            	out.write("                if (DmcOmni.instance().backRefTracking()){\n");
	            	out.write("                    Modifier backrefMod = new Modifier(\"" + part.getName() + "\", object, v, ai.id);\n");
	            	out.write("                    if (obj instanceof DmcContainerIF)\n");
	            	out.write("                        ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);\n");
	            	out.write("                    else\n");
	            	out.write("                        ((DmcObject)obj).addBackref(backrefMod);\n");
	            	out.write("                    v.setBackrefModifier(backrefMod);\n");
	            	out.write("                }\n");
	            	out.write("            }\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            	else{
	            	out.write("        if (" + pn + " != null){\n");
	            	out.write("            for(" + type.getName() + " v: " + pn + "){\n");
	            	out.write("                v.resolve(resolver, object, ncr, ai);\n");
	            	out.write("            }\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            }


        	out.write("    }\n\n");
        	
        	
    /////////////////////// BACKREF REMOVAL
        	
	        out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    public void removeBackRefsFromValue(){\n");
            for(Part part: refFields){
            	String pn = part.getName();
            	TypeDefinition type = (TypeDefinition) part.getType().getObject().getContainer();
            	
            	if (type.getComplexType() == null){
        	        out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	            	out.write("        if (" + pn + valSuffix + " != null){\n");
	            	out.write("            " + pn + valSuffix + ".removeBackref();\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            	else{
        	        out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	            	out.write("        if (" + pn + valSuffix + " != null){\n");
	            	out.write("            " + pn + valSuffix + ".removeBackref();\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            }
            
            for(Part part: mvrefFields){
            	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
            	String pn = part.getName() + valSuffix;
            	
            	if (type.getComplexType() == null){
        	        out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	            	out.write("        if (" + pn + " != null){\n");
	            	out.write("            for(" + type.getName() + "REF v: " + pn + "){\n");
	            	out.write("                v.removeBackref();\n");
	            	out.write("            }\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            	else{
        	        out.write("        // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	            	out.write("        if (" + pn + " != null){\n");
	            	out.write("            for(" + type.getName() + " v: " + pn + "){\n");
	            	out.write("                v.removeBackref();\n");
	            	out.write("            }\n");
	            	out.write("        }\n");
	            	out.write("        \n");
            	}
            }
            
			out.write("    }\n\n");


        }
    	
//        if (whiteSpaceSeparator){
//            out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//            if (ctd.getMandatoryFields() == null){
//            	out.write("    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {\n");
//    	    	out.write("    	   String rc = null;\n");
//    	    	out.write("    	   int start = seppos.intValue();\n");
//    	    	out.write("\n");
//    	    	out.write("    	   if ( (start+1) >= input.length()){\n");
//    		    out.write("            throw (new DmcValueException(\"Missing value for field: \" + fn + \" in complex type: " + ctn + "\"));\n");
//    	    	out.write("        }\n");
//    	    	out.write("\n");
//    	    	out.write("    	   if (last){\n");
//    		    out.write("    	       rc = input.substring(start+1);\n");
//    		    out.write("    	   }\n");
//    		    out.write("    	   else{\n");
//    	    	out.write("    	       int pos = -1;\n");
//    	    	out.write("    	       if (start > 0)\n");
//    	    	out.write("    		       pos = input.indexOf(\"" + fieldSeparator + "\", start+1);\n");
//    	    	out.write("    	       else\n");
//    	    	out.write("    		       pos = input.indexOf(\"" + fieldSeparator + "\");\n");
//    	    	out.write("\n");
//    	    	out.write("    	       if (pos == -1){\n");
//    	    	out.write("    		       rc = input.substring(start+1);\n");
//    	    	out.write("                seppos.set(input.length());\n");
//    	    	out.write("                return(rc);\n");
//    	    	out.write("            }\n");
//    	    	out.write("\n");
//    	    	out.write("    		   while(pos < (input.length()-1)){\n");
//    	    	out.write("    		       if ( input.charAt(pos+1) == '" + fieldSeparator + "')\n");
//    	    	out.write("    		           pos++;\n");
//    	    	out.write("    		       else\n");
//    	    	out.write("    		           break;\n");
//    	    	out.write("    		   }\n");
//    	    	out.write("\n");
//    	    	out.write("    	       rc = input.substring(start+1, pos).trim();\n");
//    	    	out.write("\n");
//    	    	out.write("    	       seppos.set(pos);\n");
//    	    	out.write("        }\n");
//    	    	out.write("\n");
//    	    	out.write("        return(rc);\n");
//    	    	out.write("    }\n\n");
//            }
//            else{
//            	out.write("    String getNextField(String input, IntegerVar seppos, String fn, int fnum, boolean last) throws DmcValueException {\n");
//    	    	out.write("    	   String rc = null;\n");
//    	    	out.write("    	   int start = seppos.intValue();\n");
//    	    	out.write("\n");
//    	    	out.write("    	   if ( (start+1) >= input.length()){\n");
//    	    	out.write("            if (fnum > mandatoryFields)\n");
//    	    	out.write("                return(null);\n");
//    		    out.write("            throw (new DmcValueException(\"Missing value for field: \" + fn + \" in complex type: " + ctn + "\"));\n");
//    	    	out.write("        }\n");
//    	    	out.write("\n");
//    	    	out.write("    	   if (last){\n");
//    		    out.write("    	       rc = input.substring(start+1);\n");
//    		    out.write("    	   }\n");
//    		    out.write("    	   else{\n");
//    	    	out.write("    	       int pos = -1;\n");
//    	    	out.write("    	       if (start > 0)\n");
//    	    	out.write("    		       pos = input.indexOf(\"" + fieldSeparator + "\", start+1);\n");
//    	    	out.write("    	       else\n");
//    	    	out.write("    		       pos = input.indexOf(\"" + fieldSeparator + "\");\n");
//    	    	out.write("\n");
//    	    	out.write("    	       if (pos == -1){\n");
//    	    	out.write("                rc = input.substring(start+1);\n");
//    	    	out.write("                seppos.set(input.length());\n");
//    	    	out.write("                return(rc);\n");
//    	    	out.write("            }\n");
//    	    	out.write("\n");
//    	    	out.write("    		   while(pos < (input.length()-1)){\n");
//    	    	out.write("    		       if ( input.charAt(pos+1) == '" + fieldSeparator + "')\n");
//    	    	out.write("    		           pos++;\n");
//    	    	out.write("    		       else\n");
//    	    	out.write("    		           break;\n");
//    	    	out.write("    		   }\n");
//    	    	out.write("\n");
//    	    	out.write("    	       rc = input.substring(start+1, pos).trim();\n");
//    	    	out.write("\n");
//    	    	out.write("    	       seppos.set(pos);\n");
//    	    	out.write("        }\n");
//    	    	out.write("\n");
//    	    	out.write("        return(rc);\n");
//    	    	out.write("    }\n\n");
//            }
//        }
//        else{
//            out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//            if (ctd.getMandatoryFields() == null){
//            	out.write("    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {\n");
//    			out.write("    	   String rc = null;\n");
//    			out.write("    	   int start = seppos.intValue();\n");
//    			out.write("   	   \n");
//    			out.write("    	   if (last){\n");
//    			out.write("            if ( (start+1) >= input.length())\n");
//    			out.write("                rc = \"\";\n");
//    			out.write("            else\n");
//    			out.write("                rc = input.substring(start+1);\n");
//    			out.write(" 	   }\n");
//    			out.write("	       else{\n");
//    			out.write("    	       if ( (start+1) >= input.length())\n");
//    			out.write("        		   throw (new DmcValueException(\"Missing value for field: \" + fn + \" in complex type: RuleParam\"));\n");
//    			out.write("   		   \n");
//    			out.write("        	   int pos = -1;\n");
//    			out.write("	           if (start > -1){\n");
//    			out.write("	        	   start = start + 1;\n");
//    			out.write("	    	       pos = input.indexOf(\"" + fieldSeparator + "\", start);\n");
//    			out.write("	           }\n");
//    			out.write("	           else{\n");
//    			out.write("	        	   start = 0;\n");
//    			out.write("	    	       pos = input.indexOf(\"" + fieldSeparator + "\");\n");
//    			out.write("	           }\n");
//    			out.write("	       \n");
//    			out.write("	           if (pos == start){\n");
//    			out.write("	        	   seppos.set(pos);\n");
//    			out.write("	        	   return(\"\");\n");
//    			out.write("	           }\n");
//    			out.write("	       \n");
//    			out.write("	           if (pos == -1)\n");
//    			out.write("		           throw (new DmcValueException(\"Missing value for field: \" + fn + \" in complex type: RuleParam\"));\n");
//    			out.write("		       \n");
//    			out.write("	           rc = input.substring(start, pos).trim();\n");
//    			out.write("	       \n");
//    			out.write("	           seppos.set(pos);\n");
//    			out.write("        }\n");
//    			out.write("    \n");
//    			out.write("        return(rc);\n");
//    			out.write("    }\n");
//    			out.write("\n");
//            }
//            else{
//            	out.write("    String getNextField(String input, IntegerVar seppos, String fn, int fnum, boolean last) throws DmcValueException {\n");
//    			out.write("    	   String rc = null;\n");
//    			out.write("    	   int start = seppos.intValue();\n");
//    			out.write("   	   \n");
//    			out.write("    	   if (last){\n");
//    			out.write("            if ( (start+1) >= input.length())\n");
//    			out.write("                rc = null;\n");
//    			out.write("            else\n");
//    			out.write("                rc = input.substring(start+1);\n");
//    			out.write(" 	   }\n");
//    			out.write("	       else{\n");
//    	    	out.write("    	       if ( (start+1) >= input.length()){\n");
//    	    	out.write("                if (fnum > mandatoryFields)\n");
//    	    	out.write("                    return(null);\n");
//    		    out.write("                throw (new DmcValueException(\"Missing value for field: \" + fn + \" in complex type: " + ctn + "\"));\n");
//    	    	out.write("            }\n");
//    			out.write("   		   \n");
//    			out.write("        	   int pos = -1;\n");
//    			out.write("	           if (start > -1){\n");
//    			out.write("	        	   start = start + 1;\n");
//    			out.write("	    	       pos = input.indexOf(\"" + fieldSeparator + "\", start);\n");
//    			out.write("	           }\n");
//    			out.write("	           else{\n");
//    			out.write("	        	   start = 0;\n");
//    			out.write("	    	       pos = input.indexOf(\"" + fieldSeparator + "\");\n");
//    			out.write("	           }\n");
//    			out.write("	       \n");
//    			out.write("	           if (pos == start){\n");
//    			out.write("	        	   seppos.set(pos);\n");
//    			out.write("	        	   return(\"\");\n");
//    			out.write("	           }\n");
//    			out.write("	       \n");
//    	    	out.write("    	       if (pos == -1){\n");
//    	    	out.write("                rc = input.substring(start+1);\n");
//    	    	out.write("                seppos.set(input.length());\n");
//    	    	out.write("                return(rc);\n");
//    	    	out.write("            }\n");
//    			out.write("		       \n");
//    			out.write("	           rc = input.substring(start, pos).trim();\n");
//    			out.write("	       \n");
//    			out.write("	           seppos.set(pos);\n");
//    			out.write("        }\n");
//    			out.write("    \n");
//    			out.write("        return(rc);\n");
//    			out.write("    }\n");
//    			out.write("\n");
//            }
//        }

        		            	
        out.write("}\n");

        out.close();
        
        GenUtility.dumpComplexTypeDmcType(header, ctd.getDefinedIn().getSchemaPackage(), od, ctn, hasRefs);

    }
    
    static String getComplexTypeFieldInstances(ArrayList<Part> combinedParts){
    	StringBuffer sb = new StringBuffer();
    	    	
    	for(Part part: combinedParts){
        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
    		sb.append("    // " + part.getDescription() + "\n");
    		
    		// For multivalued optional parts
    		String	mvs = "";
    		String	mve = "";
    		
    		if ((part.getMultivalued() != null) && part.getMultivalued()){
    			mvs = "ArrayList<";
    			mve = ">";
    		}
    		
    		String indexSize = ", 0";
    		String weakReference = ", false";
    		
    		if ((part.getWeakref() != null) && part.getWeakref())
    			weakReference = ", true";
    		
    		if (type.getIsRefType())
        		sb.append("    " + mvs + part.getType().getObjectName() + "REF" + mve + " " + part.getName() + valSuffix + ";\n\n");
    		else
    			sb.append("    " + mvs + part.getType().getObjectName() + mve + " " + part.getName() + valSuffix + ";\n\n");
    		
//    		if (part.)
    		
    		sb.append("    final static DmcAttributeInfo " + part.getName() + "AI = new DmcAttributeInfo(\""+ part.getName() + "\",0,\"" + part.getType().getObjectName() + "\",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN" + indexSize + weakReference + ");\n\n");
    	}
    	
    	return(sb.toString());
    }
    
    static String getCopyConstructorAssignments(ArrayList<Part> combinedParts){
    	StringBuffer sb = new StringBuffer();
    	    	
		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    	for(Part part: combinedParts){
        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
        	String ts = part.getType().getObjectName().getNameString();
    		
    		// For multivalued optional parts
    		String	cast = "";
    		String clone = "";
    		
    		if ((part.getMultivalued() != null) && part.getMultivalued()){
        		if (type.getIsRefType())
        			ts = ts + "REF";
        		
    			cast = "(ArrayList<" + ts + ">)";
    			clone = ".clone()";
    		}
    		
    		sb.append("        " + part.getName() + valSuffix + " = " + cast + " original." + part.getName() + valSuffix + clone + ";\n");
    		
    	}
    	
    	return(sb.toString());
    }
    

    
    static void getComplexTypeImports(ArrayList<Part> combinedParts, ImportManager imports) throws ResultException{
    	for(Part part: combinedParts){
    		
        	TypeDefinition	type = (TypeDefinition) part.getType().getObject().getContainer();
        	
        	String primitiveType = type.getPrimitiveType();
        	
        	if (type.getInternallyGenerated()){
        		if (type.getIsEnumType()){
        		}
        		else if (type.getIsRefType()){
        			// 20140602 - added check for ref type because this would fail if the type was another complex type. 
        			imports.addImport(type.getOriginalClass().getDmtREFImport(), "Object reference");
        		}
        	}
        	
        	if (primitiveType == null){
        	}
        	else{
        		if (!type.getIsRefType())
        			imports.addImport(primitiveType, "Primitive type");
        	}
        	
        	if (type.getTypeClassName() != null){
        		String sp = type.getDefinedIn().getSchemaPackage();
        		String imp = null;
        		String comment = "";

        		if (type.getInternallyGenerated()){
        			imp = type.getTypeClassName() + "STATIC";
        			comment = "Internally generated type";
        		}
        		else{
        			imp = sp + ".generated.types.DmcType" + type.getName() + "STATIC";
        			comment = "Standard type";
        		}
        		
    			imports.addImport(imp, comment);
        	}
        	
    	}
    	
    }
    

}
