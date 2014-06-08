package org.dmd.dms.tools.generation.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;

/**
 * The SVTypeFormatter is used to format the single value type representation of a given type.
 * The class is used by both the MetaGen mechanisms and the mechanisms that format this information
 * for other dark-matter schemas.
 */
public class SVTypeFormatter {

	/**
	 * 
	 * @param dmotypedir
	 * @param basePackage
	 * @param baseTypeImport
	 * @param typeName
	 * @param dmcTypeImport
	 * @param nameAttrImport
	 * @param nameAttr
	 * @param nameAttrID
	 * @param genericArgs
	 * @param isRef
	 * @param isNameType
	 * @param isFilterType	if this is a filter type, we overload the nameAttrID to have the ID of the filterAttributeDef from the TypeDefinition
	 * @param fileHeader
	 * @param progress
	 * @throws IOException
	 */
	static public void dumpSVType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String dmcTypeImport, String nameAttrImport, String nameAttr, String nameAttrID, String genericArgs, boolean isRef, boolean isNameType, boolean isFilterType, String fileHeader) throws IOException {

		String DMO = "";
		String REF = "";
		boolean dmoREF = false;
		
		if ( (nameAttr == null) && isRef){
			DMO = "DMO";
			REF = "REF";
			dmoREF = true;
		}
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + REF + "SV.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        ImportManager imports = new ImportManager();
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        imports.addImport("java.io.Serializable","Serialization marker interface");
        imports.addImport("org.dmd.core.DmcAttribute","To support cloning");
        imports.addImport("org.dmd.core.schema.DmcAttributeInfo","To support new instances");
        imports.addImport("org.dmd.core.feedback.DMFeedbackSet","Error support");

        if ( (baseTypeImport != null) && (!baseTypeImport.endsWith("DmcAttribute")))
        	imports.addImport(baseTypeImport, "Base type import");
                 	                
        if (dmcTypeImport != null)
        	imports.addImport(dmcTypeImport + DMO, "DmcType import");

        out.write(imports.getFormattedImports() + "\n");
                 	                
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + REF + "SV provides storage for a single-valued " + typeName+ "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        out.write("@SuppressWarnings(\"serial\")\n");
        
        out.write("public class DmcType" + typeName + REF + "SV extends DmcType" + typeName + REF + " implements Serializable {\n");
        
        out.write("    \n");
        out.write("    protected " + typeName + DMO + genericArgs + " value;\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SV(){\n");
        out.write("    \n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SV(DmcAttributeInfo ai){\n");
        out.write("        super(ai);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SV getNew(){\n");
        out.write("        return(new DmcType" + typeName + REF + "SV(getAttributeInfo()));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SV getNew(DmcAttributeInfo ai){\n");
        out.write("        return(new DmcType" + typeName + REF + "SV(ai));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        if (dmoREF)
            out.write("    public DmcAttribute<" + typeName + DMO + genericArgs + "> cloneIt(){\n");
        else
        	out.write("    public DmcAttribute<" + typeName + REF + genericArgs + "> cloneIt(){\n");
        out.write("        DmcType" + typeName + REF + "SV rc = getNew();\n");
        out.write("        rc.value = value;\n");
        out.write("        return(rc);\n");
        out.write("    }\n");
        out.write("    \n");

		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        if (dmoREF)
            out.write("    public " + typeName + DMO + genericArgs + " getSVCopy(){\n");
        else
        	out.write("    public " + typeName + REF + genericArgs + " getSVCopy(){\n");
        out.write("        if (value == null)\n");
        out.write("            return(null);\n");
        out.write("        return(cloneValue(value));\n");
        out.write("    }\n");
        out.write("    \n");

        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " set(Object v) throws DMFeedbackSet {\n");
        out.write("        " + typeName + DMO + genericArgs + " rc = typeCheck(v);\n");
        out.write("        // We only return a value if the value actually changed. This supports\n");
        out.write("        // the applyModifier() mechanism on DmcObject where we only return true\n");
        out.write("        // if something changed as a result of the modifier\n");
        out.write("        if (value == null)\n");
        out.write("            value = rc;\n");
        out.write("        else{\n");
        out.write("            if (value.equals(rc))\n");
        out.write("                rc = null;\n");
        out.write("            else\n");
        out.write("                value = rc;\n");
        out.write("        }\n");
        out.write("        return(rc);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public " + typeName + DMO + genericArgs + " getSV(){\n");
        out.write("        return(value);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public int getMVSize(){\n");
        out.write("        return(0);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("}\n\n");
        
        out.close();

        STATICTypeFormatter.dumpSTATICType(dmotypedir, basePackage, baseTypeImport, typeName, dmcTypeImport, nameAttrImport, nameAttr, nameAttrID, genericArgs, isRef, isNameType, isFilterType, fileHeader);

        AdapterFormatter.dumpAdapterSV(dmotypedir, typeName, basePackage, REF);

	}

}
