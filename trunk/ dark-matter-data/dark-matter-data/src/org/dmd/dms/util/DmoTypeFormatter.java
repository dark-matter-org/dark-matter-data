package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The DmoTypeFormatter will generate the various types associated with schema defined
 * enumerations and the object reference types.
 */
public class DmoTypeFormatter {
	
	String fileHeader;
	
	// The package (beneath the schema's schemaPackage) where the code should be generated
	String subPackage;
	
	String enumPackage;

	PrintStream	progress;

	public DmoTypeFormatter(){
		
	}
	
	public DmoTypeFormatter(PrintStream o){
		progress = o;
	}
	
	public void setSubPackage(String sub){
		subPackage = sub;
	}
	
	public void setEnumPackage(String sub){
		enumPackage = sub;
	}
	
	public void setFileHeader(String fh){
		fileHeader = fh;
	}
	
	public void dumpTypes(SchemaDefinition sd, String outdir) throws IOException{
		if (progress != null){
			progress.println("\n");
		}

		Iterator<TypeDefinition> tdl = sd.getInternalTypeDefList();
		if (tdl != null){
			while(tdl.hasNext()){
				TypeDefinition td = tdl.next();
				
				if (td.getIsEnumType())
					dumpEnumType(td,outdir);
				else{
					dumpType(td, outdir);
				}
					
			}
		}

	}
	
	private void dumpEnumType(TypeDefinition td, String outdir) throws IOException{
		String ofn = outdir + File.separator + "DmcType" + td.getName() + ".java";
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + "." + subPackage + ";\n\n");
      
      	out.write("import org.dmd.dmc.DmcAttribute;\n");
      	out.write("import org.dmd.dmc.DmcValueException;\n");
      	out.write("import " + schemaPackage + "." + enumPackage + ";\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("public class DmcType" + td.getName() + " extends DmcAttribute<" + td.getName() + "> {\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "(){\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    protected " + td.getName() + " typeCheck(Object value) throws DmcValueException {\n");
      	out.write("        " + td.getName() + " rc = null;\n");
      	out.write("\n");
      	out.write("        if (value instanceof " + td.getName() + "){\n");
      	out.write("            rc = (" + td.getName() + ")value;\n");
      	out.write("        }\n");
      	out.write("        else if (value instanceof String){\n");
      	out.write("            rc = " + td.getName() + ".get((String)value);\n");
      	out.write("            if (rc == null){\n");
      	out.write("                throw(new DmcValueException(\"Value: \" + value.toString() + \" is not a valid " + td.getName() + " value.\"));\n");
      	out.write("            }\n");
      	out.write("        }\n");
      	out.write("        else{\n");
      	out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + td.getName() + " expected.\"));\n");
      	out.write("        }\n");
      	out.write("        return(rc);\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    public String getString(){\n");
      	out.write("        if (sv == null){\n");
      	out.write("            StringBuffer sb = new StringBuffer();\n");
      	out.write("            for (" + td.getName() + " t : mv){\n");
      	out.write("                sb.append(t + \", \");\n");
      	out.write("            }\n");
      	out.write("            return(sb.toString());\n");
      	out.write("        }\n");
      	out.write("        else\n");
      	out.write("            return(sv.toString());\n");
      	out.write("\n");
      	out.write("    }\n\n");
      	out.write("\n");
      	out.write("}\n");

      
		out.close();
	}
	
	/**
	 * Dumps a file named <class name>DMO.java to the specified output directory.
	 * @param cd     The definition of the type.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	private void dumpType(TypeDefinition td, String outdir) throws IOException {
//		String ofn = outdir + File.separator + td.getName() + "REF.java";
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
//        
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
//
//        out.write("package " + td.getDefinedIn().getSchemaPackage() + ".generated.shared.types;\n\n");
//        
//        out.write(getImports(cd));
//        
//        out.write(getClassHeader(cd));
//        
//        out.write(" {\n");
//        
//        out.write(staticNames.toString());
//        
//        out.write("\n\n}\n");
//        
//        out.close();
	}
	

}
