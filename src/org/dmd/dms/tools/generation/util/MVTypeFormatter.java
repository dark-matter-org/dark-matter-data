package org.dmd.dms.tools.generation.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;


public class MVTypeFormatter {

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
	static public void dumpMVType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String dmcTypeImport, String nameAttrImport, String nameAttr, String genericArgs, boolean isRef, String fileHeader) throws IOException {
		String DMO = "";
		String REF = "";
		boolean dmoREF = false;
		
		if ( (nameAttr == null) && isRef){
			DMO = "DMO";
			REF = "REF";
			dmoREF = true;
		}
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + REF + "MV.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        ImportManager imports = new ImportManager();
        
        imports.addImport("java.io.Serializable","Standard marker interface");
        imports.addImport("java.util.ArrayList","Storage of values");
        imports.addImport("java.util.Iterator","Access to values");
        imports.addImport("org.dmd.core.DmcAttribute","What we're derived from");
        imports.addImport("org.dmd.core.schema.DmcAttributeInfo","To allow construction");
        imports.addImport("org.dmd.core.feedback.DMFeedbackSet","To handle errors");
        
        if (typeName.equals("Modifier"))
        	imports.addImport("org.dmd.dms.shared.generated.dmo.MetaCompactSchema","");
        	

        if ( (baseTypeImport != null) && (!baseTypeImport.endsWith("DmcAttribute")))
        	imports.addImport(baseTypeImport,"Base type import");
                 	                
        if (dmcTypeImport != null){
        	if (dmcTypeImport.indexOf("dms.types") != -1)
        			DebugInfo.debug("HERE");
        	imports.addImport(dmcTypeImport + DMO,"DmcType import");
        }
                 	                
        out.write(imports.getFormattedImports() + "\n");
         
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + REF + "MV provides storage for a multi-valued " + typeName+ "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        out.write("@SuppressWarnings(\"serial\")\n");

        out.write("public class DmcType" + typeName + REF + "MV extends DmcType" + typeName + REF + " implements Serializable {\n");
        out.write("    \n");
        out.write("    private final static Iterator<" + typeName + DMO + genericArgs + "> emptyList = (new ArrayList<" + typeName + DMO + genericArgs + ">()).iterator();\n");
        out.write("    \n");
        out.write("    protected ArrayList<" + typeName + DMO + genericArgs + "> value;\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "MV(){\n");
        if (typeName.equals("Modifier"))
            out.write("        super(MetaCompactSchema.__modify);\n");
        out.write("    \n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + REF + "MV(DmcAttributeInfo ai){\n");
        out.write("        super(ai);\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public DmcType" + typeName + REF + "MV getNew(){\n");
        out.write("        return(new DmcType" + typeName + REF + "MV(getAttributeInfo()));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        if (dmoREF)
        	out.write("    public DmcAttribute<" + typeName + DMO + genericArgs + "> cloneIt(){\n");
        else
        	out.write("    public DmcAttribute<" + typeName + REF + genericArgs + "> cloneIt(){\n");
        out.write("        synchronized(this){\n");
        out.write("            DmcType" + typeName + REF + "MV rc = getNew();\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("    \n");
        out.write("            if (getAttributeInfo().indexSize == 0){\n");
        out.write("                for(" + typeName + DMO + genericArgs + " val: value)\n");
        out.write("                try {\n");
        out.write("                    rc.add(val);\n");
        out.write("                } catch (DMFeedbackSet e) {\n");
        out.write("                    throw(new IllegalStateException(\"typeCheck() should never fail here!\",e));\n");
        out.write("                }\n");
        out.write("            }\n");
        out.write("            else{\n");
        out.write("                for(int index=0; index<value.size(); index++)\n");
        out.write("                    try {\n");
        out.write("                        rc.setMVnth(index, value.get(index));\n");
        out.write("                    } catch (DMFeedbackSet e) {\n");
        out.write("                        throw(new IllegalStateException(\"typeCheck() should never fail here!\",e));\n");
        out.write("                    }\n");
        out.write("            }\n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " add(Object v) throws DMFeedbackSet {\n");
        out.write("        synchronized(this){\n");
        out.write("            " + typeName + DMO + genericArgs + " rc = typeCheck(v);\n");
        out.write("            if (value == null)\n");
        out.write("                value = new ArrayList<" + typeName + DMO + genericArgs + ">();\n");
        out.write("            value.add(rc);\n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " del(Object v){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(null);\n");
        out.write("    \n");
        out.write("            " + typeName + DMO + genericArgs + " key = null;\n");
        out.write("            " + typeName + DMO + genericArgs + " rc = null;\n");
        out.write("            try {\n");
        out.write("                key = typeCheck(v);\n");
        out.write("            } catch (DMFeedbackSet e) {\n");
        out.write("                throw(new IllegalStateException(\"Incompatible type passed to del():\" + getName(),e));\n");
        out.write("            }\n");
        
        
        out.write("            int indexof = value.indexOf(key);\n");
        out.write("            if (indexof != -1){\n");
        out.write("                rc = value.get(indexof);\n");
        out.write("                value.remove(rc);\n");
        out.write("            }\n\n");
        
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
        out.write("    \n");
        out.write("            ArrayList<" + typeName + DMO + genericArgs + "> clone = new ArrayList<" + typeName + DMO + genericArgs + ">(value);\n");
        out.write("            return(clone.iterator());\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public ArrayList<" + typeName + DMO + genericArgs + "> getMVCopy(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(new ArrayList<" + typeName + DMO + genericArgs + ">());\n");
        out.write("            else \n");
        out.write("                return(new ArrayList<" + typeName + DMO + genericArgs + ">(value));\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public int getMVSize(){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (getAttributeInfo().indexSize == 0){\n");
        out.write("                if (value == null)\n");
        out.write("                    return(0);\n");
        out.write("                return(value.size());\n");
        out.write("            }\n");
        out.write("            else\n");
        out.write("                return(getAttributeInfo().indexSize);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " getMVnth(int index){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(null);\n");
        out.write("            return(value.get(index));\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + DMO + genericArgs + " setMVnth(int index, Object v) throws DMFeedbackSet {\n");
        out.write("        synchronized(this){\n");
        out.write("            if (getAttributeInfo().indexSize == 0)\n");
        out.write("                throw(new IllegalStateException(\"Attribute: \" + getAttributeInfo().name + \" is not indexed. You can't use setMVnth().\"));\n");
        out.write("            \n");
        out.write("            if ( (index < 0) || (index >= getAttributeInfo().indexSize))\n");
        out.write("                throw(new IllegalStateException(\"Index \" + index + \" for attribute: \" + getAttributeInfo().name + \" is out of range: 0 <= index < \" + getAttributeInfo().indexSize));\n");
        out.write("            \n");
        out.write("            " + typeName + DMO + genericArgs + " rc = null;\n");
        out.write("            \n");
        out.write("            if (v != null)\n");
        out.write("                rc = typeCheck(v);\n");
        out.write("            \n");
        out.write("            if (value == null){\n");
        out.write("                value = new ArrayList<" + typeName + DMO + genericArgs + ">(getAttributeInfo().indexSize);\n");
        out.write("                for(int i=0;i<getAttributeInfo().indexSize;i++)\n");
        out.write("                    value.add(null);\n");
        out.write("            }\n");
        out.write("            \n");
        out.write("            value.set(index, rc);\n");
        out.write("            \n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean hasValue(){\n");
        out.write("        synchronized(this){\n");
        out.write("            boolean rc = false;\n");
        out.write("            \n");
        out.write("            if (getAttributeInfo().indexSize == 0)\n");
        out.write("                throw(new IllegalStateException(\"Attribute: \" + getAttributeInfo().name + \" is not indexed. You can't use hasValue().\"));\n");
        out.write("            \n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("            \n");
        out.write("            for(int i=0; i<value.size(); i++){\n");
        out.write("                if (value.get(i) != null){\n");
        out.write("                    rc = true;\n");
        out.write("                    break;\n");
        out.write("                }\n");
        out.write("            }\n");
        out.write("            \n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");

        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean contains(Object v){\n");
        out.write("        synchronized(this){\n");
        out.write("            if (value == null)\n");
        out.write("                return(false);\n");
        out.write("\n");
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
        
    	AdapterFormatter.dumpAdapterMV(dmotypedir, typeName, basePackage, REF);
	}


}
