//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SliceDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.SchemaDefinitionDMO;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedObject;

/**
 * The DmoCompactSchemaFormatter is used to generate a compact form of the Dark Matter Schema
 * for use in restricted Java environments, such as GWT.
 */
public class DmoCompactSchemaFormatter {

	PrintStream	progress;
	
	public DmoCompactSchemaFormatter(PrintStream p){
		progress = p;
	}
	
	/**
	 * For all AttributeDefinitions in the schema, this method dumps a [schema]ASAG
	 * to the DMO subdirectory.
	 * @param sd     The schema.
	 * @param dmodir The output directory.
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ResultException 
	 */
	public void dumpSchema(SchemaDefinition sd, String dmodir) throws IOException{
		String schemaName = GeneratorUtils.dotNameToCamelCase(sd.getName().getNameString()) + "DMSAG";
		
		TreeMap<String,ClassDefinition> classes = new TreeMap<String, ClassDefinition>();
		
		TreeMap<String,AttributeDefinition> attributes = new TreeMap<String, AttributeDefinition>();
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + ".java");

        StringBuffer nameBuilders = new StringBuffer();
        
        StringBuffer filterBuilders = new StringBuffer();
        
        dumpHeaderDMSAG(out, sd.getSchemaPackage(), sd, nameBuilders, filterBuilders);
        
        Iterator<ClassDefinition> cds = sd.getClassDefList();
		if (cds != null){
			while(cds.hasNext()){
				ClassDefinition cd = cds.next();
				classes.put(cd.getName().getNameString(), cd);
			}
		}
			
        Iterator<AttributeDefinition> ads = sd.getAttributeDefList();
		if (ads != null){
			while(ads.hasNext()){
				AttributeDefinition ad = ads.next();
				attributes.put(ad.getName().getNameString(), ad);
			}
		}
			
        out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + schemaName + " implements DmcAttributeSchemaIF {\n\n");

        out.write("\n");
        out.write("    static String schemaName = \"" + sd.getName().getNameString() + "\";\n");
        out.write("\n");

        for(ClassDefinition cd: classes.values()){
			//     public final static DmcAttributeInfo __monitoredBy = new DmcAttributeInfo("monitoredBy",2202,"DashboardPrefs",ValueTypeEnum.MULTI,false);
			out.write("    public final static DmcClassInfo __" + cd.getName().getNameString() + " = new DmcClassInfo(");
			out.write("\"" + cd.getName().getNameString() + "\"");
			out.write(", " + cd.getDmdID());
			out.write(", ClassTypeEnum." + cd.getClassType());
			out.write(", DataTypeEnum." + cd.getDataType());
			out.write(");\n");
		}
        
        for(AttributeDefinition ad: attributes.values()){
			//     public final static DmcAttributeInfo __monitoredBy = new DmcAttributeInfo("monitoredBy",2202,"DashboardPrefs",ValueTypeEnum.MULTI,false);
			out.write("    public final static DmcAttributeInfo __" + ad.getName().getNameString() + " = new DmcAttributeInfo(");
			out.write("\"" + ad.getName().getNameString() + "\"");
			out.write(", " + ad.getDmdID());
			out.write(", \"" + ad.getType().getName().getNameString() + "\"");
			out.write(", ValueTypeEnum." + ad.getValueType());
			out.write(", DataTypeEnum." + ad.getDataType());
			out.write(", true");
			out.write(");\n");
		}
        
        out.write("\n");
        for(SliceDefinition slice: sd.getSliceDefList()){
			out.write("    public final static DmcSliceInfo __" + slice.getName() + " = new DmcSliceInfo(\"" + slice.getName() + "\");\n");
        }
        
        writeCommonPart1(out);
        
        // Inside the static initializer
        
        for(AttributeDefinition ad: attributes.values()){
            // _SmAp.put(__jobName.name,__jobName);
			out.write("        _SmAp.put(__" + ad.getName().getNameString() + ".id,__" + ad.getName().getNameString() + ");\n");
		}
        
        out.write(nameBuilders.toString());
        
        for(SliceDefinition slice: sd.getSliceDefList()){
	        out.write("\n");
            // _SmAp.put(__jobName.name,__jobName);
        	for(AttributeDefinition ad: slice.getSelectAttribute()){
				out.write("        __" + slice.getName().getNameString() + ".addAttributeID(" + ad.getDmdID() + ");\n");
        	}
        	
			out.write("        _SImAp.put(\"" + slice.getName() + "\",__" + slice.getName().getNameString() + ");\n");
		}
        
        // End of static initializer

        writeCommonPart2(out, schemaName);
		
		out.write("}\n\n");
		
		out.close();
	}
	
	/**
	 * For all AttributeDefinitions in the schema, this method dumps a [schema]ASAG
	 * to the DMO subdirectory. THIS METHOD IS FOR THE METAGENERATOR.
	 * @param sn  The schema name.
	 * @param schemaPackage The schema package prefix.
	 * @param attribute The meta schema attributes.
	 * @param dmodir The output directory.
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ResultException 
	 * @throws ResultException 
	 */
	public void dumpSchema(String sn, String schemaPackage, TreeMap<String,DmcUncheckedObject> attributes, TreeMap<String,DmcUncheckedObject> types, String dmodir) throws IOException, ResultException{
		String schemaName = GeneratorUtils.dotNameToCamelCase(sn) + "DMSAG";
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + ".java");

        dumpHeaderMETA(out,schemaPackage);
        
        StringBuilder nameBuilders = new StringBuilder();
        if (types != null){
	        for(DmcUncheckedObject td: types.values()){
	        	String tname = td.getSV("name");
	        	String isNameType = td.getSV("isNameType");
	        	
	        	if (isNameType != null){
	        		String nameAttributeDef = td.getSV("nameAttributeDef");
	        		
	        		if (nameAttributeDef == null)
						throw(new IllegalStateException("TypeDefinition " + tname + "  does not have a designated naming attribute."));
	        		
					nameBuilders.append("        _NmAp.put(DmcType" + tname + "STATIC.instance.getNameClass(),DmcType" + tname + "STATIC.instance);\n");
	        		
	        	}
	        }
        }
        
        StringBuilder filterBuilders = new StringBuilder();
        if (types != null){
	        for(DmcUncheckedObject td: types.values()){
	        	String tname = td.getSV("name");
	        	String isFilterType = td.getSV("isFilterType");
	        	
	        	if (isFilterType != null){
	        		String filterAttributeDef = td.getSV("filterAttributeDef");
	        		
	        		if (filterAttributeDef == null)
						throw(new IllegalStateException("TypeDefinition " + tname + "  does not have a designated filter attribute."));
	        		
					filterBuilders.append("        _FmAp.put(DmcType" + tname + "STATIC.instance.getFilterClass(),DmcType" + tname + "STATIC.instance);\n");
	        		
	        	}
	        }
        }
        
        out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + schemaName + " implements DmcAttributeSchemaIF {\n\n");

        out.write("\n");
        out.write("    static String schemaName = \"" + sn + "\";\n");
        out.write("\n");

		if (attributes != null){
	        for(DmcUncheckedObject ad: attributes.values()){
	        	String n	= ad.getSV("name");
            	String t 	= ad.getSV("type");
            	String ID 	= ad.getSV("dmdID");
            	String mv 	= ad.getSV("valueType");
        		
            	writeAttributeInfoMETA(out, n, ID, t, mv, "false");
			}
		}
        
        writeCommonPart1(out);
        
        // Inside the static initializer
        
		if (attributes != null){
	        for(DmcUncheckedObject ad: attributes.values()){
	        	String n	= ad.getSV("name");
	            // _SmAp.put(__jobName.name,__jobName);
				out.write("        _SmAp.put(__" + n + ".id,__" + n + ");\n");
			}
		}
        
        out.write(nameBuilders.toString());
        
        out.write(filterBuilders.toString());
        
        // End of static initializer
        
        writeCommonPart2(out, schemaName);
	        
		
		out.write("}\n\n");
		
		out.close();
	}
	
	void writeCommonPart1(BufferedWriter out) throws IOException{
        out.write("\n");
        out.write("    static  HashMap<Integer, DmcClassInfo> _CmAp;\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    static  HashMap<Integer, DmcAttributeInfo> _SmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcNameBuilderIF> _NmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcFilterBuilderIF> _FmAp;\n");
        out.write("\n");
        
        out.write("    static  HashMap<String, DmcSliceInfo> _SImAp;\n");
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
        
	}
	
	void writeCommonPart2(BufferedWriter out, String schemaName) throws IOException{
        out.write("\n");
        out.write("    }\n");

        out.write("\n");
        out.write("    static  " + schemaName + " instance;\n");
        

        out.write("\n");
        out.write("    protected " + schemaName + " (){\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("    public static " + schemaName + " instance(){\n");
        out.write("        if (instance == null)\n");
        out.write("            instance = new " + schemaName + "();\n");
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
        out.write("    public Iterator<DmcAttributeInfo> getInfo(){\n");
        out.write("        return(_SmAp.values().iterator());\n");
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
        out.write("    public String getSchemaName(){\n");
        out.write("        return(schemaName);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
		
	}
	
	void dumpHeaderMETA(BufferedWriter out, String schemaPackage) throws IOException {
        out.write("package " + schemaPackage + ".generated.dmo;\n\n");

        out.write("import java.util.HashMap;\n");
        out.write("import java.util.Iterator;\n");
        out.write("import org.dmd.dmc.*;\n");
        out.write("import org.dmd.dms.generated.enums.ClassTypeEnum;\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
        out.write("import org.dmd.dms.generated.enums.DataTypeEnum;\n");
        out.write("import org.dmd.dms.generated.types.*;\n");
        out.write("\n");
        
	}
	
	void dumpHeaderDMSAG(BufferedWriter out, String schemaPackage, SchemaDefinition sd, StringBuffer nameBuilders, StringBuffer filterBuilders) throws IOException {
        out.write("package " + schemaPackage + ".generated.dmo;\n\n");

        out.write("import java.util.HashMap;\n");
        out.write("import java.util.Iterator;\n");
        out.write("import org.dmd.dmc.*;\n");
        
        DmcAttribute<?> cdef = sd.getDMO().get(SchemaDefinitionDMO.__classDefList);
        if (cdef != null){
        	out.write("import org.dmd.dms.generated.enums.ClassTypeEnum;\n");
        }
        
        DmcAttribute<?> adef = sd.getDMO().get(SchemaDefinitionDMO.__attributeDefList);
        if (adef != null){
        	out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
        	out.write("import org.dmd.dms.generated.enums.DataTypeEnum;\n");
        }
        
        Iterator<TypeDefinition> tds = sd.getTypeDefList();
		if (tds != null){
			while(tds.hasNext()){
				TypeDefinition td = tds.next();
				if (td.getIsNameType()){
					if (td.getNameAttributeDef() == null)
						throw(new IllegalStateException("TypeDefinition " + td.getName() + "  does not have a designated naming attribute."));
					
					String adn = td.getName().getNameString();
					nameBuilders.append("        _NmAp.put(DmcType" + adn + "STATIC.instance.getNameClass(),DmcType" + adn + "STATIC.instance);\n");
				}
				else if (td.getIsFilterType()){
					if (td.getFilterAttributeDef() == null)
						throw(new IllegalStateException("TypeDefinition " + td.getName() + "  does not have a designated filter attribute."));
					
					String adn = td.getName().getNameString();
					nameBuilders.append("        _FmAp.put(DmcType" + adn + "STATIC.instance.getFilterClass(),DmcType" + adn + "STATIC.instance);\n");
				}
			}
		}
		
		if (nameBuilders.length() > 0)
	        out.write("import " + schemaPackage + ".generated.types.*;\n");		

        out.write("\n");
        
	}
	
	/**
	 * 
	 * @param out
	 * @param n   attribute name
	 * @param ID  ID
	 * @param t   type name
	 * @param mv  valueType
	 * @param opt optional
	 * @throws IOException
	 */
    void writeAttributeInfoMETA(BufferedWriter out, String n, String ID, String t, String mv, String opt) throws IOException {
    	out.write("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.write("\"" + n + "\",");
    	out.write(ID + ",");
    	out.write("\"" + t + "\",");
    	
    	if (mv == null)
    		out.write("ValueTypeEnum.SINGLE,");
    	else
    		out.write("ValueTypeEnum.MULTI,");
    	
   		out.write("DataTypeEnum.PERSISTENT,");
    	
    	out.write(opt + ");\n");

    }

	/**
	 * 
	 * @param out
	 * @param n   class name
	 * @param ID  ID
	 * @param ct  class type
	 * @throws IOException
	 */
    void writeClassInfoMETA(BufferedWriter out, String n, String ID, String ct) throws IOException {
    	out.write("    public final static DmcClassInfo __" + n + " = new DmcClassInfo(");
    	out.write("\"" + n + "\",");
    	out.write(ID + ",");
   		out.write("ClassTypeEnum." + ct + ",");
   		out.write("DataTypeEnum.PERSISTENT");
    	
    	out.write(");\n");

    }


			
}
