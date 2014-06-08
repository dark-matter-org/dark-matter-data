package org.dmd.dms.tools.generation.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;

public class MAPTypeFormatter {

	/**
	 * 
	 * @param dmotypedir
	 * @param basePackage
	 * @param baseTypeImport
	 * @param typeName
	 * @param primitiveImport
	 * @param nameAttrImport
	 * @param nameAttr
	 * @param fileHeader
	 * @param progress
	 * @throws IOException
	 */
	static public void dumpMAPType(String dmotypedir, String basePackage, String baseTypeImport, String typeName, String primitiveImport, String nameAttrImport, String nameAttr, String genericArgs, String keyClass, String keyImport, String fileHeader) throws IOException {		
		AdapterFormatter.dumpAdapterMAP(dmotypedir, typeName, basePackage);
		
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmotypedir, "DmcType" + typeName + "MAP.java");

        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + basePackage + ".generated.types;\n\n");
        
        ImportManager imports = new ImportManager();
        
        imports.addImport("java.io.Serializable","");
        imports.addImport("java.util.Map","");
        imports.addImport("java.util.HashMap","");
        imports.addImport("java.util.TreeMap","");
        imports.addImport("java.util.Iterator","");
        imports.addImport("org.dmd.core.DmcAttribute","");
        imports.addImport("org.dmd.core.schema.DmcAttributeInfo","");
        imports.addImport("org.dmd.core.feedback.DMFeedbackSet","");
        imports.addImport("org.dmd.core.interfaces.DmcMappedAttributeIF","");
        imports.addImport("org.dmd.dms.shared.generated.enums.ValueTypeEnum","");

        if (baseTypeImport != null)
        	imports.addImport(baseTypeImport,"Base type import");
                 	                
        if ((primitiveImport != null) && (!primitiveImport.endsWith("DmcAttribute")))
        	imports.addImport(primitiveImport,"Primitive import");
                 	                
        if (keyImport != null)
        	imports.addImport(keyImport,"Key type import");
                 	                
        out.write(imports.getFormattedImports() + "\n");
         
        out.write("/**\n");
        out.write(" * The DmcType" + typeName + "MAP provides storage for a map of " + typeName+ "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" *    " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
        out.write(" */\n");
        out.write("@SuppressWarnings(\"serial\")\n");
        if(nameAttr == null){
        	out.write("// public class DmcType" + typeName + "MAP extends DmcType" + typeName + "<" + typeName + "> {\n");
            out.write("public class DmcType" + typeName + "MAP extends DmcType" + typeName + " implements Serializable {\n");
        }
        else{
        	out.write("// public class DmcType" + typeName + "MAP extends DmcType" + typeName + "<" + typeName + "," + nameAttr + "> {\n");
            out.write("public class DmcType" + typeName + "MAP extends DmcType" + typeName + " implements Serializable {\n");
        }
        
        out.write("    \n");
        out.write("    private final static Iterator<" + typeName + genericArgs + "> emptyList = (new HashMap<" + keyClass + "," + typeName + genericArgs + ">()).values().iterator();\n");

        out.write("    \n");
        out.write("    protected Map<" + keyClass + "," + typeName + genericArgs + "> value;\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + "MAP(){\n");
        out.write("        value = null;\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public DmcType" + typeName + "MAP(DmcAttributeInfo ai){\n");
        out.write("        super(ai);\n");
        out.write("        initValue();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    void initValue(){\n");
        out.write("        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)\n");
        out.write("            value = new HashMap<" + keyClass + "," + typeName + genericArgs + ">();\n");
        out.write("        else\n");
        out.write("            value = new TreeMap<" + keyClass + "," + typeName + genericArgs + ">();\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    public " + keyClass + " firstKey(){\n");
        out.write("        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){\n");
        out.write("            if (value == null)\n");
        out.write("                return(null);\n");
        out.write("            TreeMap<" + keyClass + "," + typeName + genericArgs + "> map = (TreeMap<" + keyClass + "," + typeName + genericArgs + ">)value;\n");
        out.write("            return(map.firstKey());\n");
        out.write("        }\n");
        out.write("        throw(new IllegalStateException(\"Attribute \" + getAttributeInfo().name + \" is HASHMAPPED and doesn't support firstKey()\"));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
        out.write("    public DmcType" + typeName + "MAP getNew(){\n");
        out.write("        return(new DmcType" + typeName + "MAP(getAttributeInfo()));\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public DmcAttribute<" + typeName + genericArgs + "> cloneIt(){\n");
        out.write("        synchronized(this){\n");
        out.write("            DmcType" + typeName + "MAP rc = getNew();\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(rc);\n");
        out.write("    \n");
        out.write("            for(" + typeName + genericArgs + " val: value.values())\n");
        out.write("            try {\n");
        out.write("                rc.add(val);\n");
        out.write("            } catch (DMFeedbackSet e) {\n");
        out.write("                throw(new IllegalStateException(\"typeCheck() should never fail here!\",e));\n");
        out.write("            }\n");
        out.write("            return(rc);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + genericArgs + " add(Object v) throws DMFeedbackSet {\n");
        out.write("        synchronized(this){\n");
        out.write("            " + typeName + genericArgs + " newval = typeCheck(v);\n");
        out.write("            if (value == null)\n");
        out.write("                initValue();\n");
        out.write("            " + keyClass + " key = (" + keyClass + ")((DmcMappedAttributeIF)newval).getKey();\n");
        out.write("            " + typeName + genericArgs + " oldval = value.put(key,newval);\n");
        out.write("            \n");
        out.write("            if (oldval != null){\n");
        out.write("                // We had a value with this key, ensure that the value actually changed\n");
        out.write("                if (oldval.valuesAreEqual(newval))\n");
        out.write("                    newval = null;\n");
        out.write("            }\n");
        out.write("            \n");
        out.write("            return(newval);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + typeName + genericArgs + " del(Object key){\n");
        out.write("        synchronized(this){\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(null);\n");
        out.write("    \n");
        out.write("           if (key instanceof " + keyClass + ")\n");
        out.write("                return(value.remove(key));\n");
        out.write("            else\n");
        out.write("                throw(new IllegalStateException(\"Incompatible key type: \" + key.getClass().getName() + \" passed to del():\" + getName()));\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Iterator<" + typeName + genericArgs + "> getMV(){\n");
        out.write("        synchronized(this){\n");
        out.write("    \n");
        out.write("            if (value == null)\n");
        out.write("                return(emptyList);\n");
        out.write("    \n");
        out.write("            Map<" + keyClass + "," + typeName + genericArgs + "> clone = null;\n");
        out.write("            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)\n");
        out.write("                clone = new HashMap<" + keyClass + "," + typeName + genericArgs + ">(value);\n");
        out.write("            else\n");
        out.write("                clone = new TreeMap<" + keyClass + "," + typeName + genericArgs + ">(value);\n");
        out.write("            return(clone.values().iterator());\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public Map<" + keyClass + "," + typeName + genericArgs + "> getMVCopy(){\n");
        out.write("        synchronized(this){\n");
        out.write("            Map<" + keyClass + "," + typeName + genericArgs + "> clone = null;\n");
        out.write("            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){\n");
        out.write("                if (value == null)\n");
        out.write("                    clone = new HashMap<" + keyClass + "," + typeName + genericArgs + ">();\n");
        out.write("                else\n");
        out.write("                    clone = new HashMap<" + keyClass + "," + typeName + genericArgs + ">(value);\n");
        out.write("            }\n");
        out.write("            else{\n");
        out.write("                if (value == null)\n");
        out.write("                    clone = new TreeMap<" + keyClass + "," + typeName + genericArgs + ">();\n");
        out.write("                else\n");
        out.write("                    clone = new TreeMap<" + keyClass + "," + typeName + genericArgs + ">(value);\n");
        out.write("            }\n");
        out.write("            return(clone);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    @Override\n");
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
        out.write("    public " + typeName + genericArgs + " getByKey(Object key){\n");
        out.write("        synchronized(this){\n");
        out.write("           if (value == null)\n");
        out.write("               return(null);\n");
        out.write("    \n");
        out.write("            if (key instanceof " + keyClass + ")\n");
        out.write("                return(value.get((" + keyClass + ") key));\n");
        out.write("            else\n");
        out.write("                throw(new IllegalStateException(\"Incompatible type: \" + key.getClass().getName() + \" passed to del():\" + getName()));\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean contains(Object v){\n");
        out.write("        synchronized(this){\n");
        out.write("           if (value == null)\n");
        out.write("               return(false);\n");
        out.write("    \n");
        out.write("            try {\n");
        out.write("                " + typeName + genericArgs + " val = typeCheck(v);\n");
        out.write("                return(value.containsValue(val));\n");
        out.write("            } catch (DMFeedbackSet e) {\n");
        out.write("                return(false);\n");
        out.write("            }\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("    @Override\n");
		out.write("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public boolean containsKey(Object key){\n");
        out.write("        synchronized(this){\n");
        out.write("           if (value == null)\n");
        out.write("               return(false);\n");
        out.write("    \n");
        out.write("           if (key instanceof " + keyClass + ")\n");
        out.write("                return(value.containsKey(key));\n");
        out.write("            return(false);\n");
        out.write("        }\n");
        out.write("    }\n");
        out.write("    \n");
        
        out.write("}\n\n");
        
        out.close();

	}


}
