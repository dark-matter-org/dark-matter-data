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
import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.util.BooleanVar;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmoActionFormatter generates ActionTriggerInfo derivative classes that
 * are tailored to represent the parameters required to trigger actions on
 * remote objects.
 */
public class DmoActionFormatter {

	String fileHeader;
	
	PrintStream	progress;

	public DmoActionFormatter(){
		
	}
	
	public DmoActionFormatter(PrintStream o){
		progress = o;
	}
	
	public void setFileHeader(String fh){
		fileHeader = fh;
	}
	
	public void dumpActions(SchemaDefinition sd, String outdir) throws IOException, ResultException{
//		if (progress != null){
//			progress.println("\n");
//		}
		
		Iterator<ActionDefinition>	actions = sd.getActionDefList();
		if (actions != null){
			while(actions.hasNext()){
				ActionDefinition action = actions.next();
				dumpAction(action,outdir);
			}
		}
	}
	
	private void dumpAction(ActionDefinition ad, String outdir) throws IOException, ResultException {
		String cappedName = capTheName(ad.getName().getNameString());
		String ofn = outdir + File.separator + cappedName + "ATI.java";
		ArrayList<AttributeDefinition> allAttr = new ArrayList<AttributeDefinition>();
		
		
//		BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
		BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cappedName + "ATI.java");
		
//		if (progress != null)
//			progress.println("    Generating " + ofn);
      
        if (fileHeader != null)
        	out.write(fileHeader);

      	String schemaPackage = ad.getDefinedIn().getSchemaPackage();
      	out.write("package " + schemaPackage + ".generated.dmo;\n\n");
      
      	out.write("import java.io.Serializable;\n");
      	out.write("import org.dmd.dms.extended.ActionTriggerInfo;\n");
      	
		BooleanVar	anyMVAttributes = new BooleanVar(false);
		BooleanVar	anySVAttributes = new BooleanVar(false);

      	
      	out.write(GenUtility.getImports(ad, allAttr, anySVAttributes, anyMVAttributes) + "\n");
      	
//      	out.write("import org.dmd.dmc.DmcValueException;\n");
//      	out.write("import " + schemaPackage + ".generated.dmo." + td.getName() + "DMO;\n\n");
//      	
        out.write("/**\n");
        out.write(" * This is the generated ActionTriggerInfo derivative for the " + ad.getName() + " action.\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + ad.getDefinedIn().getName() + " schema at version " + ad.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
      	out.write("@SuppressWarnings(\"serial\")\n");
      	out.write("public class " + cappedName + "ATI extends ActionTriggerInfo implements Serializable {\n\n");
      	
      	out.write(GenUtility.attributeInfo.toString());
      	
      	out.write("\n");
      	out.write("    public " + cappedName + "ATI(){\n");
      	out.write("        super(\"" + cappedName + "\",\"" + ad.getName() + "\");\n");
      	out.write("    }\n");
      	out.write("\n");
      	
      	StringBuffer sb = new StringBuffer();
      	for(AttributeDefinition attr : allAttr){
			switch(attr.getValueType()){
			case SINGLE:
				GenUtility.formatSV(attr, sb);
				break;
			case MULTI:
			case HASHSET:
			case TREESET:
				GenUtility.formatMV(attr, sb);
				break;
			case HASHMAPPED:
				break;
			case TREEMAPPED:
				break;
			}

//      		if (attr.getIsMultiValued())
//      			GenUtility.formatMV(attr, sb);
//      		else
//      			GenUtility.formatSV(attr, sb);
      	}
      	
      	out.write(sb.toString());
      	
//      	out.write("    protected " + td.getName() + "DMO typeCheck(Object value) throws DmcValueException {\n");
//      	out.write("        " + td.getName() + "DMO rc = null;\n");
//      	out.write("\n");
//      	out.write("        if (value instanceof " + td.getName() + "DMO){\n");
//      	out.write("            rc = (" + td.getName() + "DMO)value;\n");
//      	out.write("        }\n");
//      	out.write("        else{\n");
//      	out.write("            throw(new DmcValueException(\"Object of class: \" + value.getClass().getName() + \" passed where object compatible with " + td.getName() + "DMO expected.\"));\n");
//      	out.write("        }\n");
//      	out.write("        return(rc);\n");
//      	out.write("    }\n");
//      	out.write("\n");
//      	out.write("    public String getString(){\n");
//      	out.write("        if (sv == null){\n");
//      	out.write("            StringBuffer sb = new StringBuffer();\n");
//      	out.write("            for (" + td.getName() + "DMO t : mv){\n");
//      	out.write("                sb.append(t + \", \");\n");
//      	out.write("            }\n");
//      	out.write("            return(sb.toString());\n");
//      	out.write("        }\n");
//      	out.write("        else\n");
//      	out.write("            return(sv.toString());\n");
//      	out.write("\n");
//      	out.write("    }\n\n");
//      	
//        out.write("    /**\n");
//        out.write("     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.\n");
//        out.write("     */\n");
//        out.write("    public DmcType" + td.getName() + "REF getOneOfMe(){\n");
//    	out.write("        DmcType" + td.getName() + "REF rc = new DmcType" + td.getName() + "REF();\n");
//    	out.write("        return(rc);\n");
//    	out.write("    }\n\n");
//        		
//        out.write("    /**\n");
//        out.write("     * Returns a clone of a value associated with this type.\n");
//        out.write("     */\n");
//        out.write("    public " + td.getName() + "DMO cloneValue(" + td.getName() + "DMO val){\n");
//        	out.write("        return(null);\n");
//    	out.write("    }\n\n");
//        		
//      	out.write("\n");
      	out.write("}\n");

      
		out.close();
	}
	
	String capTheName(String value){
    	StringBuffer 	name 	= new StringBuffer();
    	name.append(value);
    	name.setCharAt(0,Character.toUpperCase(name.charAt(0)));
    	return(name.toString());
	}

}
