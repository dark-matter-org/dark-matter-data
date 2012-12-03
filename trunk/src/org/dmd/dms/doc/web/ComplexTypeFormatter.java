package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.types.StringName;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ComplexTypeDefinition;
import org.dmd.dms.TypeDefinition;
import org.dmd.dmw.DmwWrapper;

public class ComplexTypeFormatter {
	
	static public void dumpDetails(BufferedWriter out, ComplexTypeDefinition td) throws IOException {
		
		typeName(out, td);
		description(out, td);
//		isNameType(out, td);
//		typeClass(out, td);
//		primitivetype(out, td);
//		keyType(out, td);
//		nullReturnValue(out, td);
		usage(out, td);
	}

	static void typeName(BufferedWriter out, ComplexTypeDefinition td) throws IOException {
		out.write("    <tr> <td class=\"typeName\" colspan=\"3\"> <a name=\"" + td.getName() + "\"> " + td.getName() + " </a> </td></tr>\n");
	}
	
	static void description(BufferedWriter out, ComplexTypeDefinition td) throws IOException {
		if (td.getDescription() != null){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Description</td>\n");
			out.write("      <td> " + td.getDescription() + " </td>\n");
			out.write("    </tr>\n\n");
		}
	}

	static void isNameType(BufferedWriter out, TypeDefinition td) throws IOException {
		if (td.getIsNameType()){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Name type</td>\n");
			if (td.getIsHierarchicName())
				out.write("      <td> Hierarchic </td>\n");
			else
				out.write("      <td> Flat </td>\n");
			out.write("    </tr>\n\n");
			if (td.getNameAttributeDef() != null){
				String schema 	= td.getNameAttributeDef().getDefinedIn().getName().getNameString();
				String an 		= td.getNameAttributeDef().getName().getNameString();
				
				out.write("    <tr>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td class=\"label\">Name attribute</td>\n");
				out.write("      <td> <a href=\"" + schema + ".html#" + an + "\"> " + an + " </a> </td>\n");
				out.write("    </tr>\n\n");
			}

		}
	}

	static void typeClass(BufferedWriter out, TypeDefinition td) throws IOException {
		if (td.getTypeClassName() != null){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Type class</td>\n");
			out.write("      <td>" + td.getTypeClassName() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}

	static void primitivetype(BufferedWriter out, TypeDefinition td) throws IOException {
		if (td.getPrimitiveType() != null){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Primitive type</td>\n");
			out.write("      <td>" + td.getPrimitiveType() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}

	static void keyType(BufferedWriter out, TypeDefinition td) throws IOException {
		if (td.getKeyClass() != null){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Keyed by</td>\n");
			out.write("      <td>" + td.getKeyClass() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}

	static void nullReturnValue(BufferedWriter out, TypeDefinition td) throws IOException {
		if (td.getNullReturnValue() != null){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Null value</td>\n");
			out.write("      <td>" + td.getNullReturnValue() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}

	static void usage(BufferedWriter out, ComplexTypeDefinition td) throws IOException {
		ArrayList<DmwWrapper> referring = td.getReferringObjects();
		
		// There's always one reference because the schema refers to its complex types
//		if ( (referring != null) && (referring.size() > 1) ){
		if (referring != null){
			TreeMap<StringName,AttributeDefinition>	attributes = new TreeMap<StringName, AttributeDefinition>();
			
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Used in:</td>\n");
			out.write("      <td>\n");
			
			for(DmwWrapper wrapper: referring){
				if (wrapper instanceof AttributeDefinition){
					AttributeDefinition ad = (AttributeDefinition) wrapper;
					attributes.put(ad.getName(), ad);
				}
			}
			
			out.write(formatUsage(attributes));
			
			out.write("      </td>\n");
			out.write("    </tr>\n\n");
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
