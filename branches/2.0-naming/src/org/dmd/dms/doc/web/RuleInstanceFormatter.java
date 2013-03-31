package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.RuleIF;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.RuleDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;
import org.dmd.dms.generated.types.DmcTypeStringSV;
import org.dmd.util.exceptions.DebugInfo;

public class RuleInstanceFormatter {
	
	// Attributes that we skip when dump rule instance details - this info is
	// explicitly dumped
	static HashSet<DmcAttributeInfo> skip;
	
	static {
		skip = new HashSet<DmcAttributeInfo>();
		skip.add(MetaDMSAG.__objectClass);
		skip.add(MetaDMSAG.__applyToAttribute);
		skip.add(MetaDMSAG.__applyToClass);
		skip.add(MetaDMSAG.__ruleTitle);
		skip.add(MetaDMSAG.__file);
		skip.add(MetaDMSAG.__definedIn);
		skip.add(MetaDMSAG.__lineNumber);
		skip.add(MetaDMSAG.__ruleName);
		skip.add(MetaDMSAG.__description);
	}

	static public void dumpRuleInstanceDetails(BufferedWriter out, SchemaManager sm, SchemaDefinition sd) throws IOException {
		if (sd.hasParsedRules()){
			TreeMap<String,ArrayList<RuleIF>>	sortedRules = new TreeMap<String, ArrayList<RuleIF>>();
			
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
			
			out.write("<div class=\"ruleInstances\">\n\n");
			
			out.write("<h2> Rule Instances </h2>\n\n");
			
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
			out.write("  <table>\n\n");

			
			Iterator<RuleIF> rules = sd.getRuleInstances(sm).values().iterator();
			while(rules.hasNext()){
				RuleIF rule = rules.next();
				ArrayList<RuleIF> collection = sortedRules.get(rule.getRuleDataDMO().getConstructionClassName());
				
				if (collection == null){
					collection = new ArrayList<RuleIF>();
					sortedRules.put(rule.getRuleDataDMO().getConstructionClassName(), collection);
				}
				collection.add(rule);
			}
			
			for(String key: sortedRules.keySet()){
				ArrayList<RuleIF> ruleset = sortedRules.get(key);
				String base = key.substring(0, key.length()-4);
				DefinitionName rdn = null;
				try {
					rdn = new DefinitionName(base);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				RuleDefinition rd = sm.ruleDefs.get(rdn);
				dumpRuleInstances(out, rd, ruleset);
			}
			
			
			out.write("  </table>\n\n");
			out.write("</div> <!-- ruleInstances -->\n\n");
		}
	}
	
	
	static void dumpRuleInstances(BufferedWriter out, RuleDefinition rd, ArrayList<RuleIF> rules) throws IOException {
		out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
		
		definitionName(out, rd);
		
		for(RuleIF rule: rules){
			RuleDataDMO ruleDMO = rule.getRuleDataDMO();
			
			out.write("    <tr>\n");

			out.write("      <td class=\"spacer\"> </td>\n");
			
			out.write("      <td colspan=\"3\" class=\"ruleDetailTitle\">\n");
			out.write("      <a name =\"" + ruleDMO.getRuleName() + "\">\n");
			out.write("        " + rule.getRuleTitle() + "\n");
			out.write("      </a>\n");
			out.write("      </td>\n");
			
			out.write("    </tr>\n");
			
			DmcTypeClassDefinitionREFSV 	applyToClass 	= (DmcTypeClassDefinitionREFSV) ruleDMO.get(MetaDMSAG.__applyToClass);
			DmcTypeAttributeDefinitionREFSV	applyToAttr 	= (DmcTypeAttributeDefinitionREFSV) ruleDMO.get(MetaDMSAG.__applyToAttribute);
			DmcTypeStringSV					description 	= (DmcTypeStringSV) ruleDMO.get(MetaDMSAG.__description);
			
			if (applyToClass != null){
				out.write("    <tr>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td> Apply to class: </td>\n");
				out.write("      <td> " + applyToClass.getSV().getObjectName() + " </td>\n");
				out.write("    </tr>\n");
			}
			
			if (applyToAttr != null){
				out.write("    <tr>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td> Apply to attribute: </td>\n");
				out.write("      <td> " + applyToAttr.getSV().getObjectName() + " </td>\n");
				out.write("    </tr>\n");
			}
			
			if (description != null){
				out.write("    <tr>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td> Description: </td>\n");
				out.write("      <td> " + ruleDMO.getDescriptionWithNewlines() + " </td>\n");
				out.write("    </tr>\n");
			}
			
			StringBuffer sb = new StringBuffer();
			Iterator<DmcAttribute<?>> attrList = ruleDMO.getAttributeIterator();
			while(attrList.hasNext()){
				DmcAttribute<?> attr = attrList.next();
				
				if (!skip.contains(attr.getAttributeInfo())){
					sb.append("    <tr>\n");
					sb.append("      <td class=\"spacer\"> </td>\n");
					sb.append("      <td class=\"spacer\"> </td>\n");
					sb.append("      <td> " + attr.getName() + " </td>\n");
					
					if (attr.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
						sb.append("      <td> " + attr.getSV() + "</td>");
					}
					else{
						sb.append("      <td>\n");
						boolean first = true;
						Iterator<?> values = attr.getMV();
						while(values.hasNext()){
							Object value = values.next();
							if (first){
								sb.append(value + "\n");
								first = false;
							}
							else{
								sb.append("<br>" + value + "\n");
							}
						}
						sb.append("      </td>\n");
					}
//					out.write("      <td> " + applyToAttr.getSV().getObjectName() + " </td>\n");
					sb.append("    </tr>\n");					
				}
			}
			
			if (sb.length() > 0){
				out.write("    <tr>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td class=\"spacer\"> </td>\n");
				out.write("      <td colspan=\"5\"class=\"attributeSectionLabel\"> Rule arguments </td>\n");
				out.write("    </tr>\n\n");		
				out.write(sb.toString());
			}
			
		}
		
	}
	
	static void definitionName(BufferedWriter out, RuleDefinition rd) throws IOException {
		out.write("    <tr> <td class=\"ruleDefName\" colspan=\"4\"> " + rd.getName() + " (" + rd.getRuleType() + ")</td></tr>\n");
	}

}
