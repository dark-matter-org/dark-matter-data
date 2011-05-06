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
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;
import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.AttributeValidatorDefinition;
import org.dmd.dms.ObjectValidatorDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SliceDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.dmo.SchemaDefinitionDMO;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedObject;

public class DmoValidatorCollectionFormatter {

	PrintStream	progress;
	
	public DmoValidatorCollectionFormatter(PrintStream p){
		progress = p;
	}
	
	/**
	 * For all Validators defined in the schema that have a DMO operational context,
	 * we dump them to [schema]VCAG
	 * to the DMO subdirectory.
	 * @param sd     The schema.
	 * @param dmodir The output directory.
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ResultException 
	 */
	public void dumpSchema(SchemaDefinition sd, String dmodir) throws IOException{
		String collectionName = GeneratorUtils.dotNameToCamelCase(sd.getName().getNameString()) + "VCAG";
		
		TreeMap<String,AttributeValidatorDefinition> 	avdmap = new TreeMap<String, AttributeValidatorDefinition>();
		TreeMap<String,ObjectValidatorDefinition> 		ovdmap = new TreeMap<String, ObjectValidatorDefinition>();
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, collectionName + ".java");
        
//        dumpHeaderASAG(out,sd.getSchemaPackage(), sd);
        dumpHeader(out, sd.getSchemaPackage(), collectionName);
        
        out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + collectionName + " implements DmcDMOValidatorCollectionIF {\n\n");

        out.write("\n");
        out.write("    static String schemaName = \"" + sd.getName().getNameString() + "\";\n");
        out.write("\n");

        Iterator<AttributeValidatorDefinition>	avds = sd.getAttributeValidatorDefList();
        if (avds != null){
        	while(avds.hasNext()){
        		AttributeValidatorDefinition avd = avds.next();
        		avdmap.put(avd.getName().getNameString(), avd);
        	}
        }
        
        Iterator<ObjectValidatorDefinition>	ovds = sd.getObjectValidatorDefList();
        if (ovds != null){
        	while(ovds.hasNext()){
        		ObjectValidatorDefinition ovd = ovds.next();
        		ovdmap.put(ovd.getName().getNameString(), ovd);
				out.write("    public final static DmcObjectValidator __" + ovd.getName().getNameString() + " = new " + ovd.getValidatorClass() + "();");
        	}
        }
        
        
	        
//	        writeCommonPart1(out);
//	        
//	        // Inside the static initializer
//	        
//	        for(AttributeDefinition ad: attributes.values()){
//	            // _SmAp.put(__jobName.name,__jobName);
//				out.write("        _SmAp.put(__" + ad.getName().getNameString() + ".id,__" + ad.getName().getNameString() + ");\n");
//			}
//	        
//	        out.write(nameBuilders.toString());
//	        
//	        for(SliceDefinition slice: sd.getSliceDefList()){
//		        out.write("\n");
//	            // _SmAp.put(__jobName.name,__jobName);
//	        	for(AttributeDefinition ad: slice.getSelectAttribute()){
//					out.write("        __" + slice.getName().getNameString() + ".addAttributeID(" + ad.getDmdID() + ");\n");
//	        	}
//	        	
//				out.write("        _SImAp.put(\"" + slice.getName() + "\",__" + slice.getName().getNameString() + ");\n");
//			}
//	        
//	        // End of static initializer
//
//	        writeCommonPart2(out, schemaName);
//	        
		
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
	public void dumpSchema(String sn, String schemaPackage, TreeMap<String,DmcUncheckedObject> avdmap, TreeMap<String,DmcUncheckedObject> ovdmap, String dmodir) throws IOException, ResultException{
		String collectionName = GeneratorUtils.dotNameToCamelCase(sn) + "VCAG";
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmodir, collectionName + ".java");

        dumpHeader(out,schemaPackage,collectionName);
        
        StringBuilder avdAdditions = new StringBuilder();
        
//        if (avdmap != null){
//	        for(DmcUncheckedObject avd: avdmap.values()){
//	        	String tname = avd.getSV("name");
//	        	String isNameType = td.getSV("isNameType");
//	        	
//	        	if (isNameType != null){
//	        		String nameAttributeDef = td.getSV("nameAttributeDef");
//	        		
//	        		if (nameAttributeDef == null)
//						throw(new IllegalStateException("TypeDefinition " + tname + "  does not have a designated naming attribute."));
//	        		
//					nameBuilders.append("        _NmAp.put(DmcType" + tname + "STATIC.instance.getNameClass(),DmcType" + tname + "STATIC.instance);\n");
//	        		
//	        	}
//	        }
//        }
        
        StringBuilder ovdAdditions = new StringBuilder();
        
        if (ovdmap != null){
        	for (DmcUncheckedObject ovd: ovdmap.values()){
        		String ovdname = ovd.getSV("name");
        		String ovdclass = ovd.getSV("validatorClass");
				out.write("    public final static DmcObjectValidator __" + ovdname + "Validator = new " + ovdclass + "();");
				
				ovdAdditions.append("        _OvDmAp.put(__" + ovdname + "Validator.getName(), __" + ovdname + "Validator);\n");
        	}
        }
        
        writeCommonPart1(out);
        
        out.write(avdAdditions.toString());
        
        out.write(ovdAdditions.toString());

        writeCommonPart2(out, collectionName);

		out.write("}\n\n");
		
		out.close();
	}
	
	void writeCommonPart1(BufferedWriter out) throws IOException{
        out.write("\n\n");
        out.write("    static  HashMap<String, DmcAttributeValidator> _AvDmAp;\n");
        out.write("    static  HashMap<String, DmcObjectValidator> _OvDmAp;\n");
        out.write("\n");
        
        out.write("    static {\n");
        out.write("        _AvDmAp = new HashMap<String, DmcAttributeValidator>();\n");
        out.write("        _OvDmAp = new HashMap<String, DmcObjectValidator>();\n");
                
	}
	
	void writeCommonPart2(BufferedWriter out, String collectionName) throws IOException{
        out.write("\n");
        out.write("    }\n");

        out.write("\n");
        out.write("    static  " + collectionName + " instance;\n");
        

        out.write("\n");
        out.write("    protected " + collectionName + " (){\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("    public static " + collectionName + " instance(){\n");
        out.write("        if (instance == null)\n");
        out.write("            instance = new " + collectionName + "();\n");
        out.write("        return(instance);\n");
        out.write("    }\n");
        out.write("\n");

//        out.write("\n");
//        out.write("    public DmcAttributeInfo getAttributeInfo(Integer id){\n");
//        out.write("        return(_SmAp.get(id));\n");
//        out.write("    }\n");
//        out.write("\n");
//        
        out.write("\n");
        out.write("    @Override\n");
        out.write("    public Iterator<DmcAttributeValidator> getAttributeValidators(){\n");
        out.write("        return(_AvDmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("\n");
        out.write("    @Override\n");
        out.write("    public Iterator<DmcObjectValidator> getObjectValidators(){\n");
        out.write("        return(_OvDmAp.values().iterator());\n");
        out.write("    }\n");
        out.write("\n");
        
//        out.write("\n");
//        out.write("    public Iterator<DmcSliceInfo> getSliceInfo(){\n");
//        out.write("        return(_SImAp.values().iterator());\n");
//        out.write("    }\n");
//        out.write("\n");
//        
//        out.write("\n");
//        out.write("    public String getSchemaName(){\n");
//        out.write("        return(schemaName);\n");
//        out.write("    }\n");
//        out.write("\n");
        
        out.write("\n");
		
	}
	
	void dumpHeader(BufferedWriter out, String schemaPackage, String collectionName) throws IOException {
        out.write("package " + schemaPackage + ".generated.dmo;\n\n");

        out.write("import java.util.HashMap;\n");
        out.write("import java.util.Iterator;\n");
        out.write("import org.dmd.dmc.*;\n");
        out.write("import org.dmd.dms.generated.types.*;\n");
        out.write("\n");
        
        out.write("\n");

		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + collectionName + " implements DmcDMOValidatorCollectionIF {\n\n");

        
	}
	
//	void dumpHeaderASAG(BufferedWriter out, String schemaPackage, SchemaDefinition sd) throws IOException {
//        out.write("package " + schemaPackage + ".generated.dmo;\n\n");
//
//        out.write("import java.util.HashMap;\n");
//        out.write("import java.util.Iterator;\n");
//        out.write("import org.dmd.dmc.*;\n");
//        
//        DmcAttribute<?> adef = sd.getDMO().get(SchemaDefinitionDMO.__attributeDefList);
//        if (adef != null){
//        	out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
//        	out.write("import org.dmd.dms.generated.enums.DataTypeEnum;\n");
//        }
//        
//        Iterator<TypeDefinition> tds = sd.getTypeDefList();
//		if (tds != null){
//			while(tds.hasNext()){
//				TypeDefinition td = tds.next();
//				if (td.getIsNameType()){
//					if (td.getNameAttributeDef() == null)
//						throw(new IllegalStateException("TypeDefinition " + td.getName() + "  does not have a designated naming attribute."));
//					
//					String adn = td.getName().getNameString();
//					nameBuilders.append("        _NmAp.put(DmcType" + adn + "STATIC.instance.getNameClass(),DmcType" + adn + "STATIC.instance);\n");
//				}
//			}
//		}
//		
//		if (nameBuilders.length() > 0)
//	        out.write("import " + schemaPackage + ".generated.types.*;\n");			
//
//        out.write("\n");
//        
//	}
	

			
}
