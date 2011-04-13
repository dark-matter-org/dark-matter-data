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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedObject;

public class DmoAttributeSchemaFormatter {

	PrintStream	progress;
	
	public DmoAttributeSchemaFormatter(PrintStream p){
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
		String schemaName = GeneratorUtils.dotNameToCamelCase(sd.getName().getNameString()) + "ASAG";
		String ofn = dmodir + File.separator + schemaName + ".java";
		
		TreeMap<String,AttributeDefinition> attributes = new TreeMap<String, AttributeDefinition>();
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + ".java");

        dumpHeader(out,sd.getSchemaPackage());
        
        Iterator<AttributeDefinition> ads = sd.getAttributeDefList();
		if (ads != null){
			while(ads.hasNext()){
				AttributeDefinition ad = ads.next();
					attributes.put(ad.getName().getNameString(), ad);
			}
			
	        out.write("\n");

	        out.write("public class " + schemaName + " implements DmcAttributeSchemaIF {\n\n");

	        out.write("\n");
	        out.write("    static String schemaName = \"" + sd.getName().getNameString() + "\";\n");
	        out.write("\n");

	        for(AttributeDefinition ad: attributes.values()){
				//     public final static DmcAttributeInfo __monitoredBy = new DmcAttributeInfo("monitoredBy",2202,"DashboardPrefs",ValueTypeEnum.MULTI,false);
				out.write("    public final static DmcAttributeInfo __" + ad.getName().getNameString() + " = new DmcAttributeInfo(");
				out.write("\"" + ad.getName().getNameString() + "\"");
				out.write(", " + ad.getDmdID());
				out.write(", \"" + ad.getType().getName().getNameString() + "\"");
				out.write(", ValueTypeEnum." + ad.getValueType());
				out.write(", true");
				out.write(");\n");
			}
	        
	        out.write("\n");
	        out.write("    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;\n");
	        out.write("\n");
	        
	        out.write("    static {\n");
	        out.write("        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();\n");
	        
	        for(AttributeDefinition ad: attributes.values()){
	            // _SmAp.put(__jobName.name,__jobName);
				out.write("        _SmAp.put(__" + ad.getName().getNameString() + ".id,__" + ad.getName().getNameString() + ");\n");
			}
	        
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
	        out.write("    public String getSchemaName(){\n");
	        out.write("        return(schemaName);\n");
	        out.write("    }\n");
	        out.write("\n");
	        
	        out.write("\n");
	        
		}
		
		out.write("}\n\n");
		
		out.close();
	}
	
	/**
	 * For all AttributeDefinitions in the schema, this method dumps a [schema]ASAG
	 * to the DMO subdirectory.
	 * @param sn  The schema name.
	 * @param schemaPackage The schema package prefix.
	 * @param attribute The meta schema attributes.
	 * @param dmodir The output directory.
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ResultException 
	 * @throws ResultException 
	 */
	public void dumpSchema(String sn, String schemaPackage, TreeMap<String,DmcUncheckedObject> attributes, String dmodir) throws IOException, ResultException{
		String schemaName = GeneratorUtils.dotNameToCamelCase(sn) + "ASAG";
		String ofn = dmodir + File.separator + schemaName + ".java";
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, schemaName + ".java");

        dumpHeader(out,schemaPackage);
        
		if (attributes != null){
			
	        out.write("\n");

	        out.write("public class " + schemaName + " implements DmcAttributeSchemaIF {\n\n");

	        out.write("\n");
	        out.write("    static String schemaName = \"" + sn + "\";\n");
	        out.write("\n");

	        for(DmcUncheckedObject ad: attributes.values()){
	        	String n	= ad.getSV("name");
            	String t 	= ad.getSV("type");
            	String ID 	= ad.getSV("dmdID");
            	String mv 	= ad.getSV("valueType");
        		
            	writeAttributeInfo(out, n, ID, t, mv, "false");

//				//     public final static DmcAttributeInfo __monitoredBy = new DmcAttributeInfo("monitoredBy",2202,"DashboardPrefs",ValueTypeEnum.MULTI,false);
//				out.write("    public final static DmcAttributeInfo __" + ad.getName().getNameString() + " = new DmcAttributeInfo(");
//				out.write("\"" + ad.getName().getNameString() + "\"");
//				out.write(", " + ad.getDmdID());
//				out.write(", \"" + ad.getType().getName().getNameString() + "\"");
//				out.write(", ValueTypeEnum." + ad.getValueType());
//				out.write(", true");
//				out.write(");\n");
			}
	        
	        out.write("\n");
	        out.write("    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;\n");
	        out.write("\n");
	        
	        out.write("    static {\n");
	        out.write("        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();\n");
	        
	        for(DmcUncheckedObject ad: attributes.values()){
	        	String n	= ad.getSV("name");
	            // _SmAp.put(__jobName.name,__jobName);
				out.write("        _SmAp.put(__" + n + ".id,__" + n + ");\n");
			}
	        
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
	        out.write("    public String getSchemaName(){\n");
	        out.write("        return(schemaName);\n");
	        out.write("    }\n");
	        out.write("\n");
	        
	        out.write("\n");
	        
		}
		
		out.write("}\n\n");
		
		out.close();
	}
	
	void dumpHeader(BufferedWriter out, String schemaPackage) throws IOException {
        out.write("package " + schemaPackage + ".generated.dmo;\n\n");

        out.write("import java.util.HashMap;\n");
        out.write("import java.util.Iterator;\n");
        out.write("import org.dmd.dmc.*;\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
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
    void writeAttributeInfo(BufferedWriter out, String n, String ID, String t, String mv, String opt) throws IOException {
    	out.write("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.write("\"" + n + "\",");
    	out.write(ID + ",");
    	out.write("\"" + t + "\",");
    	
    	if (mv == null)
    		out.write("ValueTypeEnum.SINGLE,");
    	else
    		out.write("ValueTypeEnum.MULTI,");
    	
    	out.write(opt + ");\n");

    }


			
}
