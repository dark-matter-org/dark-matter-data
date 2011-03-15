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
import org.dmd.dms.TypeDefinition;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class DmoAttributeFactoryFormatter {

	PrintStream	progress;
	
	TreeMap<String,AttributeDefinition> attributes;
	
	TreeMap<String,TypeDefinition>		types;

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
		types = new TreeMap<String, TypeDefinition>();
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );

        dumpHeader(out,sd);
        
        Iterator<AttributeDefinition> ads = sd.getAttributeDefList();
		if (ads != null){
			while(ads.hasNext()){
				AttributeDefinition ad = ads.next();
				if (ad.getUseInFactory()){
					attributes.put(ad.getName().getNameString(), ad);
					types.put(ad.getType().getName().getNameString(), ad.getType());
					DebugInfo.debug(ad.getName().getNameString());
				}
			}
			
			for(TypeDefinition td: types.values()){
				out.write("import " + td.getTypeClassName() + ";\n");
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
	        
	        for(AttributeDefinition ad: attributes.values()){
	        	String tn = GeneratorUtils.getClassNameFromImport(ad.getType().getTypeClassName());
				out.write("    public static " + tn + " get" + GeneratorUtils.dotNameToCamelCase(ad.getName().getNameString()) + "(){\n");
				out.write("        " + tn + " rc = new " + tn + "();\n");
				out.write("        rc .setAttributeInfo(__" + ad.getName().getNameString() + ");\n");
				out.write("        return(rc);\n");
				out.write("    }\n\n");
			}
	        
	        
		}
		
		out.write("}\n\n");
		
		out.close();
	}
	
	void dumpHeader(BufferedWriter out, SchemaDefinition sd ) throws IOException {
        out.write("package " + sd.getSchemaPackage() + ".generated.dmo;\n\n");

        out.write("import org.dmd.dmc.*;\n");
        out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
        out.write("\n");

        
	}
			
}
