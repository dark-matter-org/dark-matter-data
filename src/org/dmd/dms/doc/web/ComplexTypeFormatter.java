package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ComplexTypeDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.types.Field;
import org.dmd.dmw.DmwWrapper;

public class ComplexTypeFormatter {
	
	static public void dumpDetails(BufferedWriter out, SchemaManager schema, ComplexTypeDefinition td) throws IOException {
		
		typeName(out, td);
		description(out, td);
		fields(out,schema,td);
		usage(out, schema, td);
	}

	static void typeName(BufferedWriter out, ComplexTypeDefinition td) throws IOException {
		out.write("    <tr> <td class=\"typeName\" colspan=\"5\"> <a name=\"" + td.getName() + "\"> " + td.getName() + " </a> </td></tr>\n");
	}
	
	static void description(BufferedWriter out, ComplexTypeDefinition td) throws IOException {
		if (td.getDescription() != null){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Description</td>\n");
			out.write("      <td colspan=\"4\"> " + td.getDescriptionWithNewlines() + " </td>\n");
			out.write("    </tr>\n\n");
		}
	}
	
	static void fields(BufferedWriter out, SchemaManager sm, ComplexTypeDefinition td) throws IOException {
		out.write("    <tr>\n");
		out.write("      <td class=\"spacer\"> </td>\n");
		out.write("      <td class=\"label\" colspan=\"3\">Field Separator: \n");
		
		if (td.getFieldSeparator() == null)
			out.write("SPACE");
		else
			out.write("<strong> " + td.getFieldSeparator() + "</strong>");
		
		out.write("</td>\n");
		out.write("    </tr>\n\n");
		
		Iterator<Field> fields = td.getField();
		int fieldNum = 1;
		while(fields.hasNext()){
			Field field = fields.next();
			
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\"> Field " + fieldNum + "</td>\n");
			out.write("      <td> " + field.getName() + " </td>\n");
			
			TypeDefinition fieldType = sm.tdef(field.getType().getObjectName().getNameString());
			if (fieldType == null){
				try {
					fieldType = sm.findInternalType(new StringName(field.getType().getObjectName().getNameString()));
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			String type 		= TypeFormatter.getTypeName(fieldType);
			String schema 		= fieldType.getDefinedIn().getName().getNameString();

			out.write("      <td class=\"attrType\"> <a href=\"" + schema + ".html#" + type + "\">" + type + "</a> </td>\n");
			
			out.write("      <td> " + field.getDescription() + " </td>\n");
			out.write("    </tr>\n\n");
			
			fieldNum++;
		}
		
	}

	static void usage(BufferedWriter out, SchemaManager schema, ComplexTypeDefinition td) throws IOException {
		// We have to determine the usage from the internally generated type
		TypeDefinition internalType = schema.findInternalType(td.getName());
		ArrayList<DmwWrapper> referring = internalType.getReferringObjects();
		
		// There's always one reference because the schema refers to its complex types
		if ( (referring != null) && (referring.size() > 1) ){
//		if (referring != null){
			TreeMap<StringName,AttributeDefinition>	attributes = new TreeMap<StringName, AttributeDefinition>();
			
			for(DmwWrapper wrapper: referring){
				if (wrapper instanceof AttributeDefinition){
					AttributeDefinition ad = (AttributeDefinition) wrapper;
					attributes.put(ad.getName(), ad);
				}
			}
			
			if (attributes.size() > 0){
				out.write("    <tr>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td class=\"label\">Used in:</td>\n");
				out.write("      <td colspan =\"3\">\n");
				
				out.write(formatUsage(attributes));
				
				out.write("      </td>\n");
				out.write("    </tr>\n\n");
			}
		}
	}

	static String formatUsage(TreeMap<StringName,AttributeDefinition> ads){
		StringBuffer sb = new StringBuffer();
		
		sb.append("<table>\n");
		
		int count = 0;
		for(AttributeDefinition ad: ads.values()){
			if ((count % 3) == 0){
				if (count > 3){
					sb.append("</tr>\n");
				}
				sb.append("  <tr>\n");
			}
			String ref = "<a href=\"" + ad.getDefinedIn().getName() + ".html#" + ad.getName() + "\">" + ad.getDefinedIn().getName() + "</a>";
			sb.append("    <td> " + ad.getName().getNameString() + " (" + ref + ") </td>\n" );
			
			count++;
		}
		sb.append("</tr>\n");
		
		sb.append("</table>\n");
		
		return(sb.toString());
	}


	static public String getTypeName(TypeDefinition td){
		String type = td.getName().getNameString();
		
		if (td.getIsRefType()){
			if (td.getOriginalClass() != null)
				type = td.getOriginalClass().getName().getNameString();
		}
		
		if (td.getIsEnumType()){
			type = td.getEnumName();
		}
		
		return(type);
	}
}
