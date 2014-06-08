package org.dmd.dms.tools.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;

public class SETTypeFormatter {

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
	static public void dumpSETType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String dmcTypeImport, String nameAttrImport, String nameAttr, String genericArgs, boolean isRef, String fileHeader) throws IOException {
		String DMO = "";
		String REF = "";
		boolean dmoREF = false;
		
		if ( (nameAttr == null) && isRef){
			DMO = "DMO";
			REF = "REF";
			dmoREF = true;
		}
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + REF + "SET.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        ImportManager imports = new ImportManager();
        
        imports.addImport("java.io.Serializable","");
        imports.addImport("java.util.Set","");
        imports.addImport("java.util.HashSet","");
        imports.addImport("java.util.TreeSet","");
        imports.addImport("java.util.Iterator","");
        imports.addImport("org.dmd.core.DmcAttribute","");
        imports.addImport("org.dmd.core.schema.DmcAttributeInfo","");
        imports.addImport("org.dmd.core.feedback.DMFeedbackSet","");
        imports.addImport("org.dmd.dms.shared.generated.enums.ValueTypeEnum","");

        if ( (baseTypeImport != null) && (!baseTypeImport.endsWith("DmcAttribute")))
        	imports.addImport(baseTypeImport,"Base type import");
                 	                
        if (dmcTypeImport != null && (!dmcTypeImport.endsWith("ValueTypeEnum")))
        	imports.addImport(dmcTypeImport + DMO,"DmcType import");

        out.write(imports.getFormattedImports() + "\n");
         
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + REF + "SET provides storage for a set of " + typeName + DMO + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        out.write("@SuppressWarnings(\"serial\")\n");

        out.write("public class DmcType" + typeName + REF + "SET extends DmcType" + typeName + REF + " implements Serializable {\n");
        
        out.write("    \n");
        out.write("     private final static Iterator<" + typeName + DMO + genericArgs + "> emptyList =  (new HashSet<" + typeName + DMO + genericArgs + ">()).iterator();\n");
        out.write("    \n");

        out.write("    \n");
        out.write("    protected Set<" + typeName + DMO + genericArgs + "> value;\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SET(){\n");
        out.write("        value = null;\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "SET(DmcAttributeInfo ai){\n");
        out.write("        super(ai);\n");
        out.write("        initValue();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    void initValue(){\n");
        out.write("        if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)\n");
        out.write("            value = new HashSet<" + typeName + DMO + genericArgs + ">();\n");
        out.write("        else\n");
        out.write("            value = new TreeSet<" + typeName + DMO + genericArgs + ">();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public DmcType" + typeName + REF + "SET getNew(){\n");
        out.write("        return(new DmcType" + typeName + REF + "SET(getAttributeInfo()));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        if (dmoREF)
            out.write("    public DmcAttribute<" + typeName + DMO + genericArgs + "> cloneIt(){\n");
        else
        	out.write("    public DmcAttribute<" + typeName + REF + genericArgs + "> cloneIt(){\n");
        out.write("        synchronized(this){\n");
        out.write("            DmcType" + typeName + REF + "SET rc = getNew();\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("    \n");
        out.write("            for(" + typeName + DMO + genericArgs + " val: value)\n");
        out.write("            try {\n");
        out.write("                rc.add(val);\n");
        out.write("            } catch (DMFeedbackSet e) {\n");
        out.write("                throw(new IllegalStateException(\"typeCheck() should never fail here!\",e));\n");
        out.write("            }\n");
        out.write("            return(rc);\n");
        out.write("       }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " add(Object v) throws DMFeedbackSet {\n");
        out.write("        synchronized(this){\n");
        out.write("            " + typeName + DMO + genericArgs + " rc = typeCheck(v);\n");
        out.write("            if (value == null)\n");
        out.write("                initValue();\n");
        out.write("        \n");
        out.write("            // If false is returned, we didn't modify the set, so return null\n");
        out.write("            if (!value.add(rc))\n");
        out.write("                rc = null;\n");
        out.write("        \n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " del(Object v){\n");
        out.write("        synchronized(this){\n");
        out.write("            " + typeName + DMO + genericArgs + " rc = null;\n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("            \n");
        out.write("            try {\n");
        out.write("                rc = typeCheck(v);\n");
        out.write("            } catch (DMFeedbackSet e) {\n");
        out.write("                throw(new IllegalStateException(\"Incompatible type passed to del():\" + getName(),e));\n");
        out.write("            }\n");
        out.write("            if (value.contains(rc)){\n");
        out.write("                value.remove(rc);\n");
        out.write("                if (value.size() == 0)\n");
        out.write("                    value = null;\n");
        out.write("            }\n");
        out.write("            else\n");
        out.write("                rc = null;\n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Iterator<" + typeName + DMO + genericArgs + "> getMV(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(emptyList);\n");
        out.write("\n");
        out.write("            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET)\n");
        out.write("                return( (new HashSet<" + typeName + DMO + genericArgs + ">(value)).iterator() );\n");
        out.write("            else\n");
        out.write("                return( (new TreeSet<" + typeName + DMO + genericArgs + ">(value)).iterator() );\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Set<" + typeName + DMO + genericArgs + "> getMVCopy(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (getAttributeInfo().valueType == ValueTypeEnum.HASHSET){\n");
        out.write("                if (value == null)\n");
        out.write("                    return(new HashSet<" + typeName + DMO + genericArgs + ">());\n");
        out.write("                else\n");
        out.write("                    return(new HashSet<" + typeName + DMO + genericArgs + ">(value));\n");
        out.write("            }\n");
        out.write("            else{\n");
        out.write("                if (value == null)\n");
        out.write("                    return(new TreeSet<" + typeName + DMO + genericArgs + ">(value));\n");
        out.write("                else\n");
        out.write("                    return(new TreeSet<" + typeName + DMO + genericArgs + ">(value));\n");
        out.write("            }\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public int getMVSize(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(0);\n");
        out.write("            return(value.size());\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean contains(Object v){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(false);\n");
        out.write("            \n");
        out.write("            try {\n");
        out.write("                " + typeName + DMO + genericArgs + " val = typeCheck(v);\n");
        out.write("                return(value.contains(val));\n");
        out.write("            } catch (DMFeedbackSet e) {\n");
        out.write("                return(false);\n");
        out.write("            }\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("}\n\n");
        
        out.close();

    	AdapterFormatter.dumpAdapterSET(dmotypedir, typeName, basePackage, REF);

	}


}
