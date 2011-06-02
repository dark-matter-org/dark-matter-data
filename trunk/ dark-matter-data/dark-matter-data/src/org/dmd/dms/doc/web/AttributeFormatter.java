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

	static void attributeType(BufferedWriter out, AttributeDefinition ad) throws IOException{
		String vt 		= "";
		String schema 	= ad.getType().getDefinedIn().getName().getNameString();
		String type 	= ad.getType().getName().getNameString();
		String designated	= "";
		
		if (ad.getType().getIsRefType()){
			type = ad.getType().getOriginalClass().getName().getNameString();
		}
		
		if (ad.getType().getIsEnumType()){
			type = ad.getType().getEnumName();
		}
		
		if (ad.getDesignatedNameAttribute()){
			designated = "(designated naming attribute)";
		}
		
		switch(ad.getValueType()){
		case SINGLE:
			vt = "SV";
			break;
		case MULTI:
			vt = "MULTI";
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
			out.write("      <td>Description</td>\n");
			out.write("      <td>" + ad.getDescription() + "</td>\n");
			out.write("    </tr>\n\n");
		}
	}


}
