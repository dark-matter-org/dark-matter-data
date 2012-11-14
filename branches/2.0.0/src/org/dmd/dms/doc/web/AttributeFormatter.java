package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.types.StringName;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.RuleDefinition;
import org.dmd.dmw.DmwWrapper;

public class AttributeFormatter {
	
	static public void dumpDetails(BufferedWriter out, AttributeDefinition ad) throws IOException {
		attributeName(out, ad);
		attributeType(out, ad);
		description(out, ad);
		usage(out, ad);
	}
	
	static void attributeName(BufferedWriter out, AttributeDefinition ad) throws IOException{
		out.write("    <tr> <td class=\"className\" colspan=\"3\"> <a name=\"" + ad.getName() + "\"> " + ad.getName() + " </a> </td></tr>\n");
	}
	
	/**
	 * @param ad The attribute definition.
	 * @return The abbreviated form of the value type.
	 */
	static public String getValueType(AttributeDefinition ad){
		StringBuffer vt = new StringBuffer();
		
		switch(ad.getDataType()){
		case UNKNOWN:
			vt.append("U ");
			break;
		case PERSISTENT:
			vt.append("P ");
			break;
		case NONPERSISTENT:
			vt.append("N ");
			break;
		case TRANSIENT:
			vt.append("T ");
			break;
		}
		
		switch(ad.getValueType()){
		case SINGLE:
			vt.append("SV");
			break;
		case MULTI:
			if (ad.getIndexSize() == null)
				vt.append("MV");
			else
				vt.append("MV[" + ad.getIndexSize() + "]");
			break;
		case TREEMAPPED:
			vt.append("TM");
			break;
		case HASHMAPPED:
			vt.append("HM");
			break;
		case TREESET:
			vt.append("TS");
			break;
		case HASHSET:
			vt.append("HS");
			break;
		}
		
		return(vt.toString());
	}

	static void attributeType(BufferedWriter out, AttributeDefinition ad) throws IOException{
//		String vt 			= "";
		String vt 			= getValueType(ad);
		String schema 		= ad.getType().getDefinedIn().getName().getNameString();
		String type 		= TypeFormatter.getTypeName(ad.getType());
		String designated	= "";
		
		if (ad.getDesignatedNameAttribute()){
			designated = "(designated naming attribute)";
		}
		
//		switch(ad.getValueType()){
//		case SINGLE:
//			vt = "SV";
//			break;
//		case MULTI:
//			vt = "MV";
//			break;
//		case TREEMAPPED:
//			vt = "TM";
//			break;
//		case HASHMAPPED:
//			vt = "HM";
//			break;
//		case TREESET:
//			vt = "TS";
//			break;
//		case HASHSET:
//			vt = "HS";
//			break;
//		}
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

	static void usage(BufferedWriter out, AttributeDefinition ad) throws IOException {
		ArrayList<DmwWrapper> referring = ad.getReferringObjects();
		
		// There's always one reference because the schema refers to its attributes
		if ( (referring != null) && (referring.size() > 1) ){
			TreeMap<StringName,ClassDefinition>	classes = new TreeMap<StringName, ClassDefinition>();
			TreeMap<StringName,RuleDefinition>	rules = new TreeMap<StringName, RuleDefinition>();
			TreeMap<StringName,ActionDefinition>	actions = new TreeMap<StringName, ActionDefinition>();
			
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Used in:</td>\n");
			out.write("      <td>\n");
			
			for(DmwWrapper wrapper: referring){
				if (wrapper instanceof ClassDefinition){
					ClassDefinition cd = (ClassDefinition) wrapper;
					classes.put(cd.getName(), cd);
				}
				else if (wrapper instanceof RuleDefinition){
					RuleDefinition rd = (RuleDefinition) wrapper;
					rules.put(rd.getName(), rd);
				}
				else if (wrapper instanceof ActionDefinition){
					ActionDefinition actd = (ActionDefinition) wrapper;
					actions.put(actd.getName(), actd);
				}
			}
						
			out.write(formatUsage(classes,rules,actions));
			
			out.write("      </td>\n");
			out.write("    </tr>\n\n");
		}
	}

	static String formatUsage(TreeMap<StringName,ClassDefinition> cds, TreeMap<StringName,RuleDefinition> rds, TreeMap<StringName,ActionDefinition> ads){
		StringBuffer sb = new StringBuffer();
		
		sb.append("<table>\n");
		
		int count = 0;
		
		if (cds.size() > 0){
			count = 0;
			for(ClassDefinition ad: cds.values()){
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
		}
		
		if (rds.size() > 0){
			count = 0;
			for(RuleDefinition ad: rds.values()){
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
		}
		
		if (ads.size() > 0){
			count = 0;
			for(ActionDefinition ad: ads.values()){
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
		}
		
		sb.append("</table>\n");
		
		return(sb.toString());
	}


}
