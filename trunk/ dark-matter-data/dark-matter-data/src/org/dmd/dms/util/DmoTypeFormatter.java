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
	
	PrintStream	progress;

	public DmoTypeFormatter(){
		
	}
	
	public DmoTypeFormatter(PrintStream o){
		progress = o;
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
					if (td.getHelperClassName() == null){
						dumpNormalREFType(td, outdir);
					}
					else{
					dumpNamedREF(td, outdir);
					dumpNamedREFHelperType(td,outdir);
					}
				}
					
			}
		}

	}
	
	private void dumpNormalREFType(TypeDefinition td, String outdir) throws IOException{
		String ofn = outdir + File.separator + "DmcType" + td.getName() + "REF.java";
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
      	out.write("import org.dmd.dmc.DmcAttribute;\n");
      	out.write("import org.dmd.dmc.DmcValueException;\n");
      	out.write("import " + schemaPackage + ".generated.dmo." + td.getName() + "DMO;\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedIn().getName() + " schema at version " + td.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("public class DmcType" + td.getName() + "REF extends DmcAttribute<" + td.getName() + "DMO> {\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "REF(){\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    protected " + td.getName() + "DMO typeCheck(Object value) throws DmcValueException {\n");
      	out.write("        " + td.getName() + "DMO rc = null;\n");
      	out.write("\n");
      	out.write("        if (value instanceof " + td.getName() + "DMO){\n");
      	out.write("            rc = (" + td.getName() + "DMO)value;\n");
      	out.write("        }\n");
      	out.write("        else{\n");
      	out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + td.getName() + "DMO expected.\"));\n");
      	out.write("        }\n");
      	out.write("        return(rc);\n");
      	out.write("    }\n");
      	out.write("\n");
      	out.write("    public String getString(){\n");
      	out.write("        if (sv == null){\n");
      	out.write("            StringBuffer sb = new StringBuffer();\n");
      	out.write("            for (" + td.getName() + "DMO t : mv){\n");
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
	
	
	private void dumpEnumType(TypeDefinition td, String outdir) throws IOException{
		String ofn = outdir + File.separator + "DmcType" + td.getName() + ".java";
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
      	out.write("import org.dmd.dmc.DmcAttribute;\n");
      	out.write("import org.dmd.dmc.DmcValueException;\n");
      	out.write("import " + schemaPackage + ".generated.enums.*;\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedIn().getName() + " schema at version " + td.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
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
	 * Dumps the helper class <class name>REF.java for classes that used isNamedBy 
	 * to the specified output directory.
	 * @param cd     The definition of the type.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	private void dumpNamedREF(TypeDefinition td, String outdir) throws IOException {
		String ofn = outdir + File.separator + td.getName() + "REF.java";
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
      
      	String base = "DmcNamedObjectNontransportableREF";
      	String baseImport = "org.dmd.dmc.DmcNamedObjectNontransportableREF";
      	
      	if (td.getIsTransportable()){
      		base = "DmcNamedObjectTransportableREF";
      		baseImport = "org.dmd.dmc.DmcNamedObjectTransportableREF";
      	}
      	
      	out.write("import " + baseImport + ";\n");
      	out.write("import " + td.getPrimitiveType() + ";\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedIn().getName() + " schema at version " + td.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("public class " + td.getName() + "REF extends " + base + "<" + td.getName() + "DMO> {\n");
      	out.write("\n");
      	out.write("    public " + td.getName() + "REF(){\n");
      	out.write("    }\n\n");

      	out.write("    public void setObject(" + td.getName() + "DMO o){\n");
      	out.write("         object = o;\n");
      	out.write("    }\n\n");

        
        out.write("\n\n}\n");
        
        out.close();
	}
	
	/**
	 * Dumps the type class DmcType<class name>REF.java to the specified output directory.
	 * @param cd     The definition of the type.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	private void dumpNamedREFHelperType(TypeDefinition td, String outdir) throws IOException {
		String ofn = outdir + File.separator + "DmcType" + td.getName() + "REF.java";
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		
		if (progress != null)
			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = td.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.types;\n\n");
            	
      	out.write("import org.dmd.dmc.types.DmcTypeNamedObjectREF;\n");
      	out.write("import " + td.getHelperClassName() + ";\n\n");
      	out.write("import " + schemaPackage + ".generated.dmo." + td.getName() + "DMO;\n\n");
      	
        out.write("/**\n");
        out.write(" * This is the generated DmcAttribute derivative for values of type " + td.getName() + "\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + td.getDefinedIn().getName() + " schema at version " + td.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("public class DmcType" + td.getName() + "REF extends DmcTypeNamedObjectREF<" + td.getName() + "REF> {\n");
      	out.write("\n");
      	out.write("    public DmcType" + td.getName() + "REF(){\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    protected " + td.getName() + "REF getNewHelper(){\n");
      	out.write("        return( new " + td.getName() + "REF());\n");
      	out.write("    }\n\n");

      	out.write("    @Override\n");
      	out.write("    protected String getDMOClassName(){\n");
      	out.write("        return( " + td.getName() + "DMO.class.getName());\n");
      	out.write("    }\n\n");
      	
      	out.write("    @Override\n");
      	out.write("    protected boolean isDMO(Object value){\n");
      	out.write("        if (value instanceof " + td.getName() + "DMO)\n");
      	out.write("            return(true);\n");
      	out.write("        return(false);\n");
      	out.write("    }\n\n");

        out.write("\n\n}\n");
        
        out.close();
	}
	

}
