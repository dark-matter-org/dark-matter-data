package org.dmd.dms.tools.generation.util;

import java.io.BufferedWriter;
import java.io.IOException;

public class CompactSchemaHelper {

	public static void writeCommonPart1(BufferedWriter out) throws IOException{
        out.write("\n");
        out.write("    static  HashMap<Integer, DmcClassInfo> _CmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<Integer, DmcAttributeInfo> _SmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcNameBuilderIF> _NmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcFilterBuilderIF> _FmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcSliceInfo> _SImAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcTypeInfo> _TImAp;\n");
        out.write("\n");
        
        out.write("    static  ArrayList<RuleIF>             _RmAp;\n");
        out.write("\n");
        
        out.write("    static {\n");
        out.write("        _CmAp = new HashMap<Integer, DmcClassInfo>();\n");
        
        out.write("\n");
        out.write("        _SmAp = new HashMap<Integer, DmcAttributeInfo>();\n");
        
        out.write("\n");
        out.write("        _NmAp = new HashMap<String, DmcNameBuilderIF>();\n");
        
        out.write("\n");
        out.write("        _FmAp = new HashMap<String, DmcFilterBuilderIF>();\n");
        
        out.write("\n");
        out.write("        _SImAp = new HashMap<String, DmcSliceInfo>();\n");
        
        out.write("\n");
        out.write("        _TImAp = new HashMap<String, DmcTypeInfo>();\n");
        
        out.write("\n");
        out.write("        _RmAp = new ArrayList<RuleIF>();\n");
        
        out.write("\n");
        
	}
	
	public static void writeCommonPart2(BufferedWriter out, String schemaName) throws IOException{
        out.write("\n");
        out.write("    }\n");

        out.write("\n");
        out.write("    static  " + schemaName + " instance;\n");
        

        out.write("\n");
        out.write("    protected " + schemaName + " (){\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("    public synchronized static " + schemaName + " instance(){\n");
        out.write("        if (instance == null)\n");
        out.write("            instance = new " + schemaName + "();\n");
        out.write("        \n");
        out.write("        return(instance);\n");
        out.write("    }\n");
        out.write("\n");

        out.write("\n");
        out.write("    public DmcClassInfo getClassInfo(Integer id){\n");
        out.write("        return(_CmAp.get(id));\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public DmcAttributeInfo getAttributeInfo(Integer id){\n");
        out.write("        return(_SmAp.get(id));\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcAttributeInfo> getAttributeInfo(){\n");
        out.write("        return(_SmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcClassInfo> getClassInfo(){\n");
        out.write("        return(_CmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcNameBuilderIF> getNameBuilders(){\n");
        out.write("        return(_NmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){\n");
        out.write("        return(_FmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcSliceInfo> getSliceInfo(){\n");
        out.write("        return(_SImAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<DmcTypeInfo> getTypeInfo(){\n");
        out.write("        return(_TImAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public String getSchemaName(){\n");
        out.write("        return(schemaName);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public int getSchemaBaseID(){\n");
        out.write("        return(schemaBaseID);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public int getSchemaIDRange(){\n");
        out.write("        return(schemaIDRange);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public int getSchemaMaxID(){\n");
        out.write("        return(schemaMaxID);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    public Iterator<RuleIF> getRules(){\n");
        out.write("        return(_RmAp.iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
		
	}
	

}
