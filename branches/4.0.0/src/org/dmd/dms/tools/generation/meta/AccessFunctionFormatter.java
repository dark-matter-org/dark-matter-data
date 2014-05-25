package org.dmd.dms.tools.generation.meta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DMParsingFeedback;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.util.artifact.Manipulator;
import org.dmd.util.parsing.DMUncheckedObjectManager;
import org.dmd.util.runtime.DebugInfo;


public class AccessFunctionFormatter {
	
	static TreeMap<String,DMUncheckedObject>	ucoTypeDefs;
	static TreeMap<String,DMUncheckedObject>	ucoClassDefs;
	static TreeMap<String,DMUncheckedObject>	ucoAttributeDefs;
	static TreeMap<String,DMUncheckedObject>	ucoEnumDefs;
	static TreeMap<String,DMUncheckedObject>	ucoComplexDefs;
	
	static public void dumpSVAccessFunction(DMUncheckedObjectManager ucoManager, BufferedWriter out, String attrname, boolean DMO) throws IOException, DMFeedbackSet {
		ucoTypeDefs 		= ucoManager.getObjects("TypeDefinition");
		ucoClassDefs 		= ucoManager.getObjects("ClassDefinition");
		ucoAttributeDefs 	= ucoManager.getObjects("AttributeDefinition");
		ucoEnumDefs 		= ucoManager.getObjects("EnumDefinition");
		ucoComplexDefs 		= ucoManager.getObjects("ComplexTypeDefinition");

		DMUncheckedObject attributeDef = ucoAttributeDefs.get(attrname);
		String typeName = attributeDef.getSV("type");
		boolean isObjREF = false;

		if (typeName == null) {
			DMParsingFeedback dfp = new DMParsingFeedback("No type specified for attribute: " + attrname, attributeDef.getFile(), attributeDef.getLineNumber());
			throw(new DMFeedbackSet(dfp));
		}
		
		DMUncheckedObject typeDef = ucoTypeDefs.get(typeName);

		if ((typeDef != null) && (typeDef.getSV("isRefType") != null))
				isObjREF = true;

		// If we can't find this as a type def, look for it as an enum def
		if (typeDef == null) {
			typeDef = ucoEnumDefs.get(typeName);
		}

		// Or, look for it as a class - it may be a reference
		if (typeDef == null) {
			typeDef = ucoClassDefs.get(typeName);
			if (typeDef != null)
				isObjREF = true;
		}

		if (typeDef == null) {
			DMParsingFeedback dfp = new DMParsingFeedback("Unknown type: " + typeName + " for attribute: " + attrname, attributeDef.getFile(), attributeDef.getLineNumber());
			throw(new DMFeedbackSet(dfp));
		}
		
		String typeClassName = typeDef.getSV("typeClassName");
		String attrType = "DmcType" + typeName;

		if (isObjREF)
			attrType = attrType + "REF";

		if (typeClassName != null) {
			int lastPeriod = typeClassName.lastIndexOf('.');
			if (lastPeriod != -1) {
				attrType = typeClassName.substring(lastPeriod + 1);
			}
		}

		attrType = attrType + "SV";

//		StringBuffer functionName = new StringBuffer();
//		functionName.append(attrname);
//		functionName.setCharAt(0, Character.toUpperCase(functionName.charAt(0)));
		String functionName = Manipulator.capFirstChar(attrname);

		if (DMO) {
			out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (isObjREF)
				out.write("    public " + typeName + "REF get" + functionName + "(){\n");
			else
				out.write("    public " + typeName + " get" + functionName + "(){\n");

			out.write("        " + attrType + " attr = (" + attrType + ") get(MetaDMSAG.__" + attrname + ");\n");
			out.write("        if (attr == null)\n");

			String nullReturnValue = typeDef.getSV("nullReturnValue");

			String attrNulReturnValue = attributeDef.getSV("nullReturnValue");

			if (attrNulReturnValue != null)
				nullReturnValue = attrNulReturnValue;

			if (nullReturnValue == null)
				out.write("            return(null);\n");
			else
				out.write("            return(" + nullReturnValue + ");\n");

			out.write("\n");
			out.write("        return(attr.getSV());\n");
			out.write("    }\n\n");
			
			
			///////////////////////////////////////////////////////////////////
			String preserveNewlines = attributeDef.getSV("preserveNewlines");

			if (preserveNewlines != null){
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public " + typeName + " get" + functionName + "WithNewlines(){\n");
	
				out.write("        " + attrType + " attr = (" + attrType + ") get(MetaDMSAG.__" + attrname + ");\n");
				out.write("        if (attr == null)\n");
	
				if (attrNulReturnValue != null)
					nullReturnValue = attrNulReturnValue;
	
				if (nullReturnValue == null)
					out.write("            return(null);\n");
				else
					out.write("            return(" + nullReturnValue + ");\n");
	
				out.write("\n");
				out.write("        return(attr.getSV().replaceAll(\"\\\\\\\\n\",\"\\\\\\n\"));\n");
				out.write("    }\n\n");
			}
		} else {
			out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (isObjREF) {
				out.write("    public " + typeName + " get" + functionName + "(){\n");
				out.write("        " + attrType + " attr = (" + attrType + ") mycore.get(MetaDMSAG.__" + attrname + ");\n");

				out.write("        if (attr == null)\n");
				out.write("            return(null);\n");

				out.write("        " + typeName + "DMO obj = attr.getSV().getObject();\n");
				out.write("        return((" + typeName + ")obj.getContainer());\n");
				out.write("    }\n\n");
			} else {
				out.write("    public " + typeName + " get" + functionName + "(){\n");
				out.write("        return(mycore.get" + functionName + "());\n");
				out.write("    }\n\n");
				
				///////////////////////////////////////////////////////////////
				String preserveNewlines = attributeDef.getSV("preserveNewlines");

				if (preserveNewlines != null){
					out.write("    public " + typeName + " get" + functionName + "WithNewlines(){\n");
					out.write("        return(mycore.get" + functionName + "WithNewlines());\n");
					out.write("    }\n\n");
				}
				
			}
		}

		if (DMO) {
			out.write("    /**\n");
			out.write("     * Sets " + attrname + " to the specified value.\n");
			out.write("     * @param value A value compatible with " + attrType + "\n");
			out.write("     */\n");
			out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			// out.write("    @SuppressWarnings(\"unchecked\")\n");
			out.write("    public void set" + functionName + "(Object value) throws DMFeedbackSet {\n");
			out.write("        DmcAttribute<?> attr = get(MetaDMSAG.__" + attrname + ");\n");
			out.write("        if (attr == null)\n");
			out.write("            attr = new " + attrType + "(MetaDMSAG.__" + attrname + ");\n");
			out.write("        \n");
			out.write("        attr.set(value);\n");
			out.write("        set(MetaDMSAG.__" + attrname + ",attr);\n");
			out.write("    }\n\n");
		} else {
			if (isObjREF) {
				out.write("    /**\n");
				out.write("     * Sets " + attrname + " to the specified value.\n");
				out.write("     * @param value A value compatible with " + typeName + "\n");
				out.write("     */\n");
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public void set" + functionName + "(" + typeName + " value) throws DMFeedbackSet {\n");
				out.write("        mycore.set" + functionName + "(value.getDmcObject());\n");
				out.write("    }\n\n");
			} else {
				out.write("    /**\n");
				out.write("     * Sets " + attrname + " to the specified value.\n");
				out.write("     * @param value A value compatible with " + attrType + "\n");
				out.write("     */\n");
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public void set" + functionName + "(Object value) throws DMFeedbackSet {\n");
				out.write("        mycore.set" + functionName + "(value);\n");
				out.write("    }\n\n");
			}
		}
	}


	/**
	 * Formats a multi-valued access function for the specified attribute.
	 * @param ucoManager provides access to our definitions
	 * @param out		the output file
	 * @param attrname	the attribute for which we're dumping the function
	 * @param DMO		flag to indicate if we're formatting for a DMO or a DMW
	 */
	static public void dumpMVAccessFunction(DMUncheckedObjectManager ucoManager, BufferedWriter out, String attrname, boolean DMO) throws IOException, DMFeedbackSet {
		ucoTypeDefs 		= ucoManager.getObjects("TypeDefinition");
		ucoClassDefs 		= ucoManager.getObjects("ClassDefinition");
		ucoAttributeDefs 	= ucoManager.getObjects("AttributeDefinition");
		ucoEnumDefs 		= ucoManager.getObjects("EnumDefinition");
		ucoComplexDefs 		= ucoManager.getObjects("ComplexTypeDefinition");

		DMUncheckedObject attributeDef = ucoAttributeDefs.get(attrname);
		String typeName = attributeDef.getSV("type");
		boolean isObjREF = false;

		if (typeName == null) {
			DMParsingFeedback dfp = new DMParsingFeedback("No type specified for attribute: " + attrname, attributeDef.getFile(), attributeDef.getLineNumber());
			throw(new DMFeedbackSet(dfp));
		}

		DMUncheckedObject typeDef = ucoTypeDefs.get(typeName);

		// If we can't find this as a type def, look for it as an enum def
		if (typeDef == null) {
			typeDef = ucoEnumDefs.get(typeName);
		}

		// Or, look for it as a class - it may be a reference
		if (typeDef == null) {
			typeDef = ucoClassDefs.get(typeName);
			if (typeDef != null)
				isObjREF = true;
		}
		
		boolean isComplexType = false;
		if (ucoComplexDefs.get(typeName) != null){
			isComplexType = true;
		}

		if (typeDef == null) {
			DMParsingFeedback dfp = new DMParsingFeedback("Unknown type: " + typeName + " for attribute: " + attrname, attributeDef.getFile(), attributeDef.getLineNumber());
			throw(new DMFeedbackSet(dfp));
		}
		
		if ((typeDef != null) && (typeDef.getSV("isRefType") != null))
			isObjREF = true;

		String attrType = "DmcType" + typeName;

		if (isObjREF)
			attrType = attrType + "REF";

		attrType = attrType + "MV";

		String functionName = Manipulator.capFirstChar(attrname);

		if (DMO) {
			if (isObjREF) {
				out.write("     * @return An Iterator of " + typeName + "DMO objects.\n");
				out.write("     */\n");
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
			} else {
				out.write("     * @return An Iterator of " + typeName + " objects.\n");
				out.write("     */\n");
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			}
			out.write("        " + attrType + " attr = (" + attrType + ") get(MetaDMSAG.__" + attrname + ");\n");
			out.write("        if (attr == null)\n");
			out.write("            return(null);\n");
			out.write("\n");
			out.write("        return(attr.getMV());\n");
			out.write("    }\n\n");
			
			String preserveNewlines = attributeDef.getSV("preserveNewlines");

			if ( (preserveNewlines != null) && !isComplexType){
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public Iterator<" + typeName + "> get" + functionName + "WithNewlines(){\n");
	
				out.write("        " + attrType + " attr = (" + attrType + ") get(MetaDMSAG.__" + attrname + ");\n");
				out.write("        if (attr == null)\n");
				out.write("            return(null);\n");
	
				out.write("\n");
				out.write("        " + attrType + " withNewLines = new " + attrType + "();\n");
				out.write("        Iterator<" + typeName + "> it = attr.getMV();\n");
				out.write("        while(it.hasNext()){\n");
				out.write("            try{\n");
				out.write("                withNewLines.add(it.next().replaceAll(\"\\\\\\\\n\",\"\\\\\\n\"));\n");
				out.write("            } catch (DMFeedbackSet e) {\n");
				out.write("                e.printStackTrace();\n");
				out.write("            }\n");
				out.write("        }\n");
				out.write("\n");
				out.write("        return(withNewLines.getMV());\n");
				out.write("    }\n\n");
			}
		} else {
			if (isObjREF) {
				out.write("     * @return An Iterator of " + typeName + " objects.\n");
				out.write("     */\n");
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public " + typeName + "IterableDMW get" + functionName + "(){\n");
				out.write("        " + attrType + " attr = (" + attrType + ") mycore.get(MetaDMSAG.__" + attrname + ");\n");
				out.write("        if (attr == null)\n");
				out.write("            return(" + typeName + "IterableDMW.emptyList);\n");
				out.write("\n");
				out.write("        return(new " + typeName + "IterableDMW(attr.getMV()));\n");
				out.write("    }\n\n");
			} else {
				if (DMO){
					out.write("     * @return An Iterator of " + typeName + " objects.\n");
					out.write("     */\n");
					out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					out.write("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
					out.write("        " + attrType + " attr = (" + attrType + ") mycore.get(MetaDMSAG.__" + attrname + ");\n");
					out.write("        if (attr == null)\n");
					out.write("            return(null);\n");
					out.write("\n");
					out.write("        return(attr.getMV());\n");
					out.write("    }\n\n");
				}
				else{
					out.write("     * @return An Iterator of " + typeName + " objects.\n");
					out.write("     */\n");
					out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					out.write("    public " + typeName + "IterableDMW get" + functionName + "Iterable(){\n");
					out.write("        " + attrType + " attr = (" + attrType + ") mycore.get(MetaDMSAG.__" + attrname + ");\n");
					out.write("        if (attr == null)\n");
					out.write("            return(" + typeName + "IterableDMW.emptyList);\n");
					out.write("\n");
					out.write("        return(new " + typeName + "IterableDMW(attr.getMV()));\n");
					out.write("    }\n\n");
				}
				
				String preserveNewlines = attributeDef.getSV("preserveNewlines");

				if ( (preserveNewlines != null) && !isComplexType){
					out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					out.write("    public Iterator<" + typeName + "> get" + functionName + "WithNewlines(){\n");
		
					out.write("        " + attrType + " attr = (" + attrType + ") mycore.get(MetaDMSAG.__" + attrname + ");\n");
					out.write("        if (attr == null)\n");
					out.write("            return(null);\n");
		
					out.write("\n");
					out.write("        " + attrType + " withNewLines = new " + attrType + "();\n");
					out.write("        Iterator<" + typeName + "> it = attr.getMV();\n");
					out.write("        while(it.hasNext()){\n");
					out.write("            try{\n");
					out.write("                withNewLines.add(it.next().replaceAll(\"\\\\\\\\n\",\"\\\\\\n\"));\n");
					out.write("            } catch (DMFeedbackSet e) {\n");
					out.write("                e.printStackTrace();\n");
					out.write("            }\n");
					out.write("        }\n");
					out.write("\n");
					out.write("        return(withNewLines.getMV());\n");
					out.write("    }\n\n");
				}
			}
		}

		if (DMO) {
			out.write("    /**\n");
			out.write("     * Adds another " + attrname + " value.\n");
			out.write("     * @param value A value compatible with " + attrType + "\n");
			out.write("     */\n");
			out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    public DmcAttribute<?> add" + functionName + "(Object value) throws DMFeedbackSet {\n");
			out.write("        DmcAttribute<?> attr = get(MetaDMSAG.__" + attrname + ");\n");
			out.write("        if (attr == null)\n");
			out.write("            attr = new " + attrType + "(MetaDMSAG.__" + attrname + ");\n");
			out.write("        \n");
			out.write("        attr.add(value);\n");
			out.write("        add(MetaDMSAG.__" + attrname + ",attr);\n");
			out.write("        return(attr);\n");
			out.write("    }\n\n");
		} else {
			if (isObjREF) {
				out.write("    /**\n");
				out.write("     * Adds another " + attrname + " value.\n");
				out.write("     * @param value A value compatible with " + typeName + "\n");
				out.write("     */\n");
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public DmcAttribute<?> add" + functionName + "(" + typeName + " value) throws DMFeedbackSet {\n");
				out.write("        DmcAttribute<?> attr = mycore.add" + functionName + "(value.getDmcObject());\n");
				out.write("        return(attr);\n");
				out.write("    }\n\n");
			} else {
				out.write("    /**\n");
				out.write("     * Adds another " + attrname + " value.\n");
				out.write("     * @param value A value compatible with " + attrType + "\n");
				out.write("     */\n");
				out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    public void add" + functionName + "(Object value) throws DMFeedbackSet {\n");
				out.write("        mycore.add" + functionName + "(value);\n");
				out.write("    }\n\n");
			}

			out.write("    /**\n");
			out.write("     * Returns the number of " + attrname + " values.\n");
			out.write("     */\n");
			out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    public int get" + functionName + "Size(){\n");
			out.write("        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__" + attrname + ");\n");
			out.write("        if (attr == null)\n");
			out.write("            return(0);\n");
			out.write("        return(attr.getMVSize());\n");
			out.write("    }\n\n");

			out.write("    /**\n");
			out.write("     * Returns true if " + attrname + " has values.\n");
			out.write("     */\n");
			out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("    public boolean get" + functionName + "HasValue(){\n");
			out.write("        return(get" + functionName + "Size() > 0);\n");
			out.write("    }\n\n");

		}

	}


}
