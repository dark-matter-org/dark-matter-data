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
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class DmoAttributeFactoryFormatter {

	PrintStream	progress;
	
	TreeMap<String,AttributeDefinition> attributes;
	
	TreeMap<String,TypeAndAttr>		typeAndAttr;

	public DmoAttributeFactoryFormatter(PrintStream p){
		progress = p;
	}
	
	/**
	 * For all AttributeDefinitions in the schema, this method dumps a [schema]AttributeFactory
	 * to the DMO subdirectory.
	 * @param sd     The schema.
	 * @param dmodir The output directory.
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ResultException 
	 */
	public void dumpFactory(SchemaManager sm, SchemaDefinition sd, String dmodir) throws IOException{
		String factoryName = GeneratorUtils.dotNameToCamelCase(sd.getName().getNameString()) + "AttributeFactoryAG";
		String ofn = dmodir + File.separator + factoryName + ".java";
		
		attributes = new TreeMap<String, AttributeDefinition>();
		typeAndAttr = new TreeMap<String, TypeAndAttr>();
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );

        dumpHeader(out,sd);
        
        Iterator<AttributeDefinition> ads = sd.getAttributeDefList();
		if (ads != null){
			while(ads.hasNext()){
				AttributeDefinition ad = ads.next();
				if (ad.getType().getIsNameType()){
					attributes.put(ad.getName().getNameString(), ad);
					
					TypeAndAttr ta = new TypeAndAttr(ad.getType(), ad.getValueType());
					typeAndAttr.put(ta.name, ta);
					
					DebugInfo.debug(ad.getName().getNameString());
				}
			}
			
			out.write("import java.util.HashMap;\n");

			for(TypeAndAttr ta: typeAndAttr.values()){
				out.write("import " + ta.getImport() + ";\n");
			}
			
	        out.write("\n");

	        out.write("public class " + factoryName + " {\n\n");

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
	        out.write("    static  HashMap<String ,DmcAttributeInfo> _SmAp;\n");
	        out.write("\n");
	        
	        out.write("    static {\n");
	        out.write("        _SmAp = new HashMap<String ,DmcAttributeInfo>();\n");
	        
	        for(AttributeDefinition ad: attributes.values()){
	            // _SmAp.put(__jobName.name,__jobName);
				out.write("        _SmAp.put(__" + ad.getName().getNameString() + ".name,__" + ad.getName().getNameString() + ");\n");
			}
	        
	        out.write("\n");
	        out.write("    }\n");


	        out.write("\n");
	        out.write("    public DmcAttributeInfo getAttributeInfo(String nameClass){\n");
	        out.write("        return(_SmAp.get(nameClass));\n");
	        out.write("    }\n");
	        out.write("\n");
	        
	        out.write("\n");
	        
	        for(AttributeDefinition ad: attributes.values()){
	        	String tn = GeneratorUtils.getClassNameFromImport(ad.getType().getTypeClassName());
				out.write("    public static " + tn + suffix(ad.getValueType()) + " get" + GeneratorUtils.dotNameToCamelCase(ad.getName().getNameString()) + "(){\n");
				out.write("        " + tn + suffix(ad.getValueType()) + " rc = new " + tn + suffix(ad.getValueType()) +"();\n");
				out.write("        rc .setAttributeInfo(__" + ad.getName().getNameString() + ");\n");
				out.write("        return(rc);\n");
				out.write("    }\n\n");
			}
	        
		}
		
		out.write("}\n\n");
		
		out.close();
	}
	
	String suffix(ValueTypeEnum vte){
		String rc = null;
		
        switch(vte){
		case SINGLE:
			rc = "SV";
			break;
		case MULTI:
			rc = "MV";
			break;
		case HASHMAPPED:
		case TREEMAPPED:
			rc = "MAP";
			break;
		case HASHSET:
		case TREESET:
			rc = "SET";
			break;
		}
        
		return(rc);
	}
	
	void dumpHeader(BufferedWriter out, SchemaDefinition sd ) throws IOException {
        out.write("package " + sd.getSchemaPackage() + ".generated.dmo;\n\n");

        out.write("import org.dmd.dmc.*;\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
        out.write("\n");

        
	}
			
}
