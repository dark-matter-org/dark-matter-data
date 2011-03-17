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

import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.types.EnumValue;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.CodeFormatter;

/**
 * The DmoTypeFormatter will generate the various types associated with schema defined
 * enumerations and the object reference types.
 */
public class DmoEnumFormatter {
	
	String fileHeader;
	
	PrintStream	progress;

	public DmoEnumFormatter(){
		progress = null;
	}
	
	public DmoEnumFormatter(PrintStream o){
		progress = o;
	}
	
	public void setFileHeader(String fh){
		fileHeader = fh;
	}
	
	/**
	 * This method will generate the enum classes for all EnumDefinitions in the
	 * specified schema.
	 * @param sd     The schema.
	 * @param outdir Where to dump the class.
	 * @throws IOException
	 */
	public void dumpEnums(SchemaDefinition sd, String outdir) throws IOException{
		if (progress != null)
			progress.println("");

		Iterator<EnumDefinition> enums = sd.getEnumDefList();
		if (enums != null){
			while(enums.hasNext())
				dumpEnum(enums.next(),outdir);
		}
	}
	
	private void dumpEnum(EnumDefinition ed, String outdir) throws IOException{
		String cn = ed.getName().getNameString();
		String ofn = outdir + File.separator + cn + ".java";
      	String schemaPackage = ed.getDefinedIn().getSchemaPackage();
		
		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
      
		if (progress != null){
			progress.println("    Generating " + ofn);
//			progress.println(ed.toOIF(15));
		}
      
        out = new BufferedWriter(new FileWriter(outdir + File.separator + cn + ".java"));

        if (fileHeader != null)
        	out.write(fileHeader);

      	out.write("package " + schemaPackage + ".generated.enums;\n\n");

        out.write("import java.util.*;\n\n");
        out.write("import org.dmd.dmc.DmcEnumIF;\n\n");
        
        out.write("/**\n");
        CodeFormatter.dumpCodeComment(ed.getDescription(),out," * ");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + ed.getDefinedIn().getName() + " schema at version " + ed.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
        out.write("public enum " + cn + " implements DmcEnumIF\n{\n");

        Iterator<EnumValue> enumit = ed.getEnumValue();
        while(enumit.hasNext()){
        	EnumValue ev = enumit.next();
        	
//            out.write("    /**\n");
//            CodeFormatter.dumpCodeComment(ev.getDescription(),out,"     * ");
//            out.write("     */\n");
            
            out.write("    " + ev.getName() + "(" + ev.getId() + ",\"" + ev.getDescription() + "\")");
            if (enumit.hasNext())
            	out.write(",\n\n");
            else
            	out.write(";\n\n");
        }
        
        out.write("    // Maps our integer value to the enumeration value\n");
        out.write("    private static final Map<Integer," + cn + "> lookup = new HashMap<Integer," + cn + ">();\n\n");

        out.write("    static {\n");
      	out.write("        for(" + cn + " s : EnumSet.allOf(" + cn + ".class))\n");
      	out.write("            lookup.put(s.intValue(), s);\n");
     	out.write("    }\n\n");
        
        out.write("    // Maps our enumeration (string) value to the enumeration value\n");
        out.write("    private static final Map<String," + cn + "> lookupString = new HashMap<String, " + cn + ">();\n\n");

        out.write("    static {\n");
      	out.write("        for(" + cn + " s : EnumSet.allOf(" + cn + ".class))\n");
      	out.write("            lookupString.put(s.name(), s);\n");
     	out.write("    }\n\n");
        
        out.write("    // Our current value as an int - normally, this isn't available in an enum\n");
        out.write("    private int ival;\n\n");
        
        out.write("    // Our current display value as a String\n");
        out.write("    private String dval;\n\n");
        
        out.write("    /**\n");
        out.write("     * This private constructor allows us to access our int value when required.\n");
        out.write("     */\n");
        out.write("    private " + cn + "(int i, String d){\n");
        out.write("        ival = i;\n");
        out.write("        dval = d;\n");
        out.write("    }\n\n");
        
        out.write("    /**\n");
        out.write("     * Returns the value of this enum value as an int.\n");
        out.write("     */\n");
        out.write("    public int intValue(){\n");
        out.write("        return(ival);\n");
        out.write("    }\n\n");
        
        out.write("    /**\n");
        out.write("     * Returns the display value of this enum value as a String.\n");
        out.write("     */\n");
        out.write("    public String displayValue(){\n");
        out.write("        return(dval);\n");
        out.write("    }\n\n");
        
        out.write("    /**\n");
        out.write("     * Returns the enum value of the specified int or null if it's not valid.\n");
        out.write("     */\n");
        out.write("    public static " + cn + " get(int code) {\n");
        out.write("        return(lookup.get(code));\n"); 
        out.write("    }\n\n");
       
        out.write("    /**\n");
        out.write("     * Returns a value for this enum or throws an exception if the String value isn't\n");
        out.write("     * a valid member of this enum.\n");
        out.write("     */\n");
        out.write("    public static " + cn + " get(String str) {\n");
        out.write("        return(lookupString.get(str));\n");
      	out.write("    }\n\n");
        
        out.write("}");
        out.close();
      
		out.close();
	}
	
}