//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.features.extgwt.generators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmg.DarkMatterGeneratorIF;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The ExtGWTWrapperGenerator class is used to generate wrappers for Dark Matter Objects
 * that allow the to be used in various ExtGWT data models. To facilitate this, the
 * wrappers are derived from a parameterized base class: DmoExtGWTWrapperBase. This
 * class implements the com.extjs.gxt.ui.client.data.Model and com.extjs.gxt.ui.client.data.ModelData
 * interfaces so that it behaves in the same way as the com.extjs.gxt.ui.client.data.BaseModel
 * class.
 */
public class ExtGWTWrapperGenerator implements DarkMatterGeneratorIF {
	
	String gendir;
	String dmwdir;

	ArrayList<AttributeDefinition>	allAttr;
	
	@Override
	public void gatherUserInput(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException {
		gendir = loc.getConfigParentDirectory() + File.separator + "generated";
		dmwdir = gendir + File.separator + "dmw";
		
		createGenDirs();
		
		createWrappers(config, loc, f, sm);
	}
	
	void createWrappers(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException {
		Iterator<String> schemas = config.getSchemaToLoad();
		if (schemas != null){
			while(schemas.hasNext()){
				String s = schemas.next();
				SchemaDefinition sd = sm.isSchema(s);
				Iterator<ClassDefinition> cdefs = sd.getClassDefList();
				
				if (cdefs != null){
					while(cdefs.hasNext()){
						dumpWrapper(config, loc, f, sm, cdefs.next());
					}
				}
			}
		}
	}
	
	void dumpWrapper(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd) throws IOException {
		allAttr = new ArrayList<AttributeDefinition>();
		
		String ofn = dmwdir + File.separator + cd.getName() + "DMW.java";
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        out.write("package " + config.getGenPackage() + ".generated.dmw;\n\n");
        
        out.write(getImports(cd));
        
        out.write("public class " + cd.getName() + "DMW extends DmoExtGWTWrapperBase<" + cd.getName() + "DMO> {\n");
        out.write("\n");
        out.write("    public " + cd.getName() + "DMW(){\n");
        out.write("\n");
        out.write("    }\n");
        out.write("\n");
        out.write("    public " + cd.getName() + "DMW(" + cd.getName() + "DMO obj){\n");
        out.write("        super(obj);\n");
        out.write("    }\n");
        out.write("\n");
        out.write(getAccessFunctions(cd));
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("}\n");

		
        out.close();
	}
	
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd
	 * @return
	 */
	String getImports(ClassDefinition cd){
		StringBuffer 	sb 				= new StringBuffer();
		boolean			needJavaUtil	= false;
		TreeMap<String,TypeDefinition>	types = new TreeMap<String,TypeDefinition>();
		
		Iterator<AttributeDefinition> may = cd.getMay();
		if (may != null){
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued())
					needJavaUtil = true;
				
				// Add this attribute to our static names
//				staticNames.append("    public final static String _" + ad.getName() + " = \"" + ad.getName() + "\";\n");
				
				allAttr.add(ad);
			}
		}
		
		Iterator<AttributeDefinition> must = cd.getMust();
		if (must != null){
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				if (ad.getIsMultiValued())
					needJavaUtil = true;
				
				// Add this attribute to our static names
//				staticNames.append("    public final static String _" + ad.getName() + " = \"" + ad.getName() + "\";\n");
				
				allAttr.add(ad);
			}
		}
		
		if (needJavaUtil)
			sb.append("import java.util.*;\n\n");
		
		sb.append("import org.dmd.dmc.DmcValueException;\n");
		
		Iterator<TypeDefinition> t = types.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();
			if (td.getPrimitiveType() != null){
				sb.append("import " + td.getPrimitiveType() + ";\n");
			}
//			sb.append("import " + td.getTypeClassName() + ";\n");
		}
		
		sb.append("\n");
		
//		if (cd.getDerivedFrom() == null){
//			sb.append("import org.dmd.dmc.DmcObject;\n");
//		}
//		else{
//			sb.append("import " + cd.getDerivedFrom().getDmoClass() + ";\n");
//		}
		
		if (cd.getIsNamedBy() != null){
			sb.append("import org.dmd.dmc.DmcNamedObjectIF;\n");
		}

		sb.append("import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;\n");

		sb.append("import " + cd.getDmoClass() + ";\n");
		
		sb.append("\n");
		
		return(sb.toString());
	}
	
	String getAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
		
		// provide the getObjectName() method to support DmcNamedObjectIF
		if (cd.getIsNamedBy() != null){
	    	StringBuffer 	attrNameCapped 	= new StringBuffer();
	    	attrNameCapped.append(cd.getIsNamedBy().getName());
	    	attrNameCapped.setCharAt(0,Character.toUpperCase(attrNameCapped.charAt(0)));

			sb.append("    public String getObjectName(){\n");
			sb.append("        return(core.get" + attrNameCapped.toString() + "());\n");
			sb.append("    }\n\n");
		}
		
		for(AttributeDefinition ad : allAttr){
			if (ad.getIsMultiValued())
				formatMV(ad,sb);
			else
				formatSV(ad,sb);
		}
		
		return(sb.toString());
	}
	
	void formatSV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    		typeName = typeName + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
		
		sb.append("    public " + typeName + " get" + functionName + "(){\n");
		sb.append("        return(core.get" + functionName + "());\n");
    	sb.append("    }\n\n");
		
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	sb.append("    /**\n");
    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
    	sb.append("     * @param value A value compatible with " + attrType + "\n");
    	sb.append("     */\n");
    	sb.append("    public void set" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        core.set" + functionName + "(value);\n");
    	sb.append("    }\n\n");
	}
	
	void formatMV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	sb.append("    /**\n");
		
		if (ad.getType().getIsRefType()){
			sb.append("     * @returns An Iterator of " + typeName + "DMO objects.\n");
			sb.append("     */\n");
			sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
		}
		else{
			sb.append("     * @returns An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
		}
		sb.append("        return(core.get" + functionName + "());\n");
		sb.append("    }\n\n");
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
		sb.append("    public void add" + functionName + "(Object value) throws DmcValueException {\n");
    	sb.append("        core.add" + functionName + "(value);\n");
		sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		sb.append("    /**\n");
		sb.append("     * Deletes a " + ad.getName() + " value.\n");
		sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
		sb.append("     */\n");
		sb.append("    public void del" + functionName + "(Object value){\n");
		sb.append("        core.del" + functionName + "(value);\n");
		sb.append("    }\n\n");

		
	}


	/**
	 * Creates the output directory structure for our code.
	 */
	void createGenDirs(){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
		File ddf = new File(dmwdir);
		if (!ddf.exists())
			ddf.mkdir();
		
	}

}
