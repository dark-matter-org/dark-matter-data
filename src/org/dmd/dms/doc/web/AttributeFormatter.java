package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.RuleDefinition;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.dmw.DmwWrapper;
import org.dmd.util.exceptions.DebugInfo;

public class AttributeFormatter {
	
	static public void dumpDetails(BufferedWriter out, AttributeDefinition ad) throws IOException {
		out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
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
//		if (ad.getDescription() != null){
		if (ad.getDescriptionSize() > 0){
//			ArrayList<DmwWrapper> referring = ad.getReferringObjects();
			
			ArrayList<DmcObject> referring = ad.getDMO().getReferringObjects();

			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Description</td>\n");
			out.write("      <td>\n");
			
			if (ad.getDescription() != null){
				out.write("      " + Converter.convert(ad.getDescriptionWithNewlines()) + "\n");
			}
			out.write("      </td>\n");
			out.write("    </tr>\n\n");

			//			Iterator<String> descr = ad.getDescription();
//			while(descr.hasNext()){
//				out.write(descr.next() + "\n");
//				if (descr.hasNext())
//					out.write("<p/>\n");
//			}
			
//			if (referring != null){
//				out.write("<p/>\n");
//				for(DmcObject obj: referring){
//					if (obj instanceof RuleDataDMO){
//						RuleDataDMO rd = (RuleDataDMO) obj;
//						out.write(rd.getRuleTitle() + "\n<p/>");
//					}
//					
//				}
//				
//			}
			
			if (referring != null){
				StringBuilder sb = new StringBuilder();
				for(DmcObject obj: referring){
					if (obj instanceof RuleDataDMO){
						
						RuleDataDMO rd = (RuleDataDMO) obj;

						sb.append("<tr> <td class=\"spacer\"> <td> </td> </td> <td class=\"attributeRule\">\n");
						sb.append("<a class=\"blackText\" href=\"" + rd.getDefinedIn().getObjectName() + ".html#" + rd.getRuleName() + "\"> " + rd.getRuleTitle() + " </a>");
						sb.append("</td> </tr>\n\n");

					}
				}
				if (sb.length() > 0)
					out.write(sb.toString());
			}
			
		}
	}

	static void usage(BufferedWriter out, AttributeDefinition ad) throws IOException {
		ArrayList<DmwWrapper> referring = ad.getReferringObjects();
		
		// There's always one reference because the schema refers to its attributes
		if ( (referring != null) && (referring.size() > 1) ){
			TreeMap<DefinitionName,ClassDefinition>	classes = new TreeMap<DefinitionName, ClassDefinition>();
			TreeMap<DefinitionName,RuleDefinition>	rules = new TreeMap<DefinitionName, RuleDefinition>();
			TreeMap<DefinitionName,ActionDefinition>	actions = new TreeMap<DefinitionName, ActionDefinition>();
			
			out.write("    <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td class=\"label\">Used in:</td>\n");
			out.write("      <td>\n");
			
			for(DmwWrapper wrapper: referring){
				if (wrapper instanceof ClassDefinition){
					ClassDefinition cd = (ClassDefinition) wrapper;
					classes.put(cd.getName(), cd);
				}
//				else if (wrapper instanceof RuleDefinition){
//					RuleDefinition rd = (RuleDefinition) wrapper;
//					rules.put(rd.getName(), rd);
//				}
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

	static String formatUsage(TreeMap<DefinitionName,ClassDefinition> cds, TreeMap<DefinitionName,RuleDefinition> rds, TreeMap<DefinitionName,ActionDefinition> ads){
		StringBuffer sb = new StringBuffer();
		
		sb.append("        <table>\n");
		
		int count = 0;
		
		if (cds.size() > 0){
			count = 0;
			for(ClassDefinition ad: cds.values()){
				if ((count % 3) == 0){
					if (count > 3){
						sb.append("        </tr>\n");
					}
					sb.append("        <tr>\n");
				}
				String ref = "<a href=\"" + ad.getDefinedIn().getName() + ".html#" + ad.getName() + "\">" + ad.getDefinedIn().getName() + "</a>";
				sb.append("          <td> " + ad.getName().getNameString() + " (" + ref + ") </td>\n" );
				
				count++;
			}
			sb.append("        </tr>\n");
		}
		
		if (rds.size() > 0){
			count = 0;
			for(RuleDefinition ad: rds.values()){
				if ((count % 3) == 0){
					if (count > 3){
						sb.append("        </tr>\n");
					}
					sb.append("        <tr>\n");
				}
				String ref = "<a href=\"" + ad.getDefinedIn().getName() + ".html#" + ad.getName() + "\">" + ad.getDefinedIn().getName() + "</a>";
				sb.append("          <td> " + ad.getName().getNameString() + " (" + ref + ") </td>\n" );
				
				count++;
			}
			sb.append("        </tr>\n");
		}
		
		if (ads.size() > 0){
			count = 0;
			for(ActionDefinition ad: ads.values()){
				if ((count % 3) == 0){
					if (count > 3){
						sb.append("      </tr>\n");
					}
					sb.append("      <tr>\n");
				}
				String ref = "<a href=\"" + ad.getDefinedIn().getName() + ".html#" + ad.getName() + "\">" + ad.getDefinedIn().getName() + "</a>";
				sb.append("          <td> " + ad.getName().getNameString() + " (" + ref + ") </td>\n" );
				
				count++;
			}
			sb.append("      </tr>\n");
		}
		
		sb.append("        </table>\n");
		
		return(sb.toString());
	}


}
