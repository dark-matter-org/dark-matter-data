package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.dms.AttributeDefinition;

public class AttributeFormatter {
	
	static public void dumpDetails(BufferedWriter out, AttributeDefinition ad) throws IOException {
		attributeName(out, ad);
		attributeType(out, ad);
		description(out, ad);
	}
	
	static void attributeName(BufferedWriter out, AttributeDefinition ad) throws IOException{
		out.write("    <tr> <td class=\"className\" colspan=\"3\"> <a name=\"" + ad.getName() + "\"> " + ad.getName() + " </a> </td></tr>\n");
	}
	
	/**
	 * @param ad The attribute definition.
	 * @return The abbreviated form of the value type.
	 */
	static public String getValueType(AttributeDefinition ad){
		String vt 		= "";
		switch(ad.getValueType()){
		case SINGLE:
			vt = "SV";
			break;
		case MULTI:
			vt = "MV";
			break;
		case TREEMAPPED:
			vt = "TM";
			break;
		case HASHMAPPED:
			vt = "HM";
			break;
		case TREESET:
			vt = "TS";
			break;
		case HASHSET:
			vt = "HS";
			break;
		}
		return(vt);
	}

	static void attributeType(BufferedWriter out, AttributeDefinition ad) throws IOException{
		String vt 			= "";
		String schema 		= ad.getType().getDefinedIn().getName().getNameString();
		String type 		= TypeFormatter.getTypeName(ad.getType());
		String designated	= "";
		
		if (ad.getDesignatedNameAttribute()){
			designated = "(designated naming attribute)";
		}
		
		switch(ad.getValueType()){
		case SINGLE:
			vt = "SV";
			break;
		case MULTI:
			vt = "MV";
			break;
		case TREEMAPPED:
			vt = "TM";
			break;
		case HASHMAPPED:
			vt = "HM";
			break;
		case TREESET:
			vt = "TS";
			break;
		case HASHSET:
			vt = "HS";
			break;
		}
		out.write("    <tr>\n");
		out.write("      <td class=\"spacer\"> </td>\n");
		out.write("      <td colspan=\"2\"> <div class=\"valueType\"> " + vt + " </div> ");
		out.write("<div class=\"attrType\"> <a href=\"" + schema + ".html#" + type + "\">" + type + "</a> </div> " + designated + "\n");
		out.write("      </td>\n");
		out.write("    </tr>\n\n");
	}

	static void description(BufferedWriter out, AttributeDefinition ad) throws IOException{
		if (ad.getDescription() != null){
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Description</td>\n");
			out.write("      <td>" + ad.getDescription() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}


}
