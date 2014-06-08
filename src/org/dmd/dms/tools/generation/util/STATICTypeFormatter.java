package org.dmd.dms.tools.generation.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;


public class STATICTypeFormatter {

	/**
	 * 
	 * @param dmotypedir
	 * @param basePackage
	 * @param baseTypeImport
	 * @param typeName
	 * @param dmcTypeImport
	 * @param nameAttrImport
	 * @param nameAttr
	 * @param fileHeader
	 * @param progress
	 * @throws IOException
	 */
	static public void dumpSTATICType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String dmcTypeImport, String nameAttrImport, String nameAttr, String nameAttrID, String genericArgs, boolean isRef, boolean isNameType, boolean isFilterType, String fileHeader) throws IOException {
		String DMO = "";
		String REF = "";
		
		// If this is a reference type but not for a named object, just return
		if ( (nameAttr == null) && isRef){
			return;
		}
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + REF + "STATIC.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        ImportManager imports = new ImportManager();
        
        imports.addImport("org.dmd.core.feedback.DMFeedbackSet","");
        imports.addImport("org.dmd.core.interfaces.DmcInputStreamIF","");
        imports.addImport("org.dmd.core.interfaces.DmcOutputStreamIF","");
        
        if (isNameType){
        	imports.addImport("org.dmd.core.schema.DmcAttributeInfo","");
        	imports.addImport("org.dmd.core.DmcObjectName","");
        	imports.addImport("org.dmd.core.interfaces.DmcNameBuilderIF","");
        	imports.addImport("org.dmd.dms.shared.types.DmcTypeDmcObjectName","");
        }
        
        if (isFilterType){
        	imports.addImport("org.dmd.core.schema.DmcAttributeInfo","");
        	imports.addImport("org.dmd.core.DmcFilter","");
        	imports.addImport("org.dmd.core.interfaces.DmcFilterBuilderIF","");
        	imports.addImport("org.dmd.dms.shared.types.DmcTypeDmcFilter","");
        }
        	
                 	                
        if (baseTypeImport != null){
        	if (baseTypeImport.indexOf("DmcType") == -1)
        		imports.addImport(baseTypeImport,"Base type import");
        }
                 	                
        if (dmcTypeImport != null){
            if (dmcTypeImport.endsWith("Enum"))
            	imports.addImport(dmcTypeImport + DMO,"DmcType import");
        }
                 	                
        out.write(imports.getFormattedImports() + "\n");
         
        out.write("\n");
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + REF + "STATIC provides static access to functions used to manage values of type " + typeName+ "\n");
        out.write(" * These methods are used to support ComplexTypeDefinitions.\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        
        if (isNameType)
            out.write("public class DmcType" + typeName + REF + "STATIC implements DmcNameBuilderIF {\n");
        else if (isFilterType)
            out.write("public class DmcType" + typeName + REF + "STATIC implements DmcFilterBuilderIF {\n");
        else
        	out.write("public class DmcType" + typeName + REF + "STATIC {\n");
        
        out.write("    \n");
        out.write("    public static DmcType" + typeName + REF + "STATIC instance;\n");
        out.write("    static DmcType" + typeName + REF + "SV typeHelper;\n");
        
        if (isNameType){
            out.write("    static String    nameClass = \"" + typeName + "\";\n");
            out.write("    static final int attrID    = " + nameAttrID + ";\n");
        }
        if (isFilterType){
            out.write("    static String    filterClass = \"" + typeName + "\";\n");
            out.write("    static final int attrID      = " + nameAttrID + ";\n");
        }
        	
        out.write("    \n");
        out.write("    static {\n");
        out.write("        instance = new DmcType" + typeName + REF + "STATIC();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    protected DmcType" + typeName + REF + "STATIC() {\n");
        out.write("        typeHelper = new DmcType" + typeName + REF + "SV();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public " + typeName + REF + genericArgs + " typeCheck(Object value) throws DMFeedbackSet {\n");
        out.write("    	   return(typeHelper.typeCheck(value));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public " + typeName + REF + genericArgs + " cloneValue(" + typeName + REF + genericArgs + " value) throws DMFeedbackSet {\n");
        out.write("    	   return(typeHelper.cloneValue(value));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public void serializeValue(DmcOutputStreamIF dos, " + typeName + REF + genericArgs + " value) throws Exception {\n");
        out.write("    	   typeHelper.serializeValue(dos, value);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public " + typeName + REF + genericArgs + " deserializeValue(DmcInputStreamIF dis) throws Exception {\n");
        out.write("    	   return(typeHelper.deserializeValue(dis));\n");
        out.write("    }\n");
        out.write("    \n");
        
        if (isNameType){
            out.write("    @Override\n");
	        out.write("    public DmcTypeDmcObjectName<?> getNewNameHolder(DmcObjectName name, DmcAttributeInfo ai){\n");
	        out.write("        DmcTypeDmcObjectName<?> rc = typeHelper.getNew(ai);\n");
	        out.write("        try {\n");
	        out.write("            rc.set(name);\n");
	        out.write("        } catch (DMFeedbackSet e) {\n");
	        out.write("            throw(new IllegalStateException(\"Shouldn't throw exception when setting a name attribute value in a DmcNameBuilderIF - occurred for type: \" + name.getNameClass(), e));\n");
	        out.write("        }\n");
	        out.write("        return(rc);\n");
	        out.write("    }\n");
	        out.write("    \n");
	        
            out.write("    @Override\n");
	        out.write("    public String getNameClass(){\n");
	        out.write("    	   return(nameClass);\n");
	        out.write("    }\n");
	        out.write("    \n");
	        
            out.write("    @Override\n");
	        out.write("    public int getNameAttributeID(){\n");
	        out.write("    	   return(attrID);\n");
	        out.write("    }\n");
	        out.write("    \n");
        }
        
        if (isFilterType){
            out.write("    @Override\n");
	        out.write("    public DmcTypeDmcFilter<?> getNewFilterHolder(DmcFilter filter, DmcAttributeInfo ai){\n");
	        out.write("        DmcTypeDmcFilter<?> rc = typeHelper.getNew(ai);\n");
	        out.write("        try {\n");
	        out.write("            rc.set(filter);\n");
	        out.write("        } catch (DMFeedbackSet e) {\n");
	        out.write("            throw(new IllegalStateException(\"Shouldn't throw exception when setting a filter attribute value in a DmcFilterBuilderIF - occurred for type: \" + filter.getFilterClass(), e));\n");
	        out.write("        }\n");
	        out.write("        return(rc);\n");
	        out.write("    }\n");
	        out.write("    \n");
	        
            out.write("    @Override\n");
	        out.write("    public String getFilterClass(){\n");
	        out.write("    	   return(filterClass);\n");
	        out.write("    }\n");
	        out.write("    \n");
	        
            out.write("    @Override\n");
	        out.write("    public int getFilterAttributeID(){\n");
	        out.write("    	   return(attrID);\n");
	        out.write("    }\n");
	        out.write("    \n");
        }
        
        out.write("}\n\n");
        
        out.close();

	}

}
