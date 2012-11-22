package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.types.StringName;
import org.dmd.dms.RuleDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;
import org.dmd.util.exceptions.DebugInfo;

public class RuleInstanceFormatter {

	static public void dumpRuleInstanceDetails(BufferedWriter out, SchemaManager sm, SchemaDefinition sd) throws IOException {
		if (sd.hasParsedRules()){
			TreeMap<String,ArrayList<RuleDataDMO>>	sortedRules = new TreeMap<String, ArrayList<RuleDataDMO>>();
			
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
			
			out.write("<div class=\"ruleInstances\">\n\n");
			
			out.write("<h2> Rule Instances </h2>\n\n");
			
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
			out.write("  <table>\n\n");

			
			Iterator<RuleDataDMO> rules = sd.getParsedRulesDMOs(sm);
			while(rules.hasNext()){
				RuleDataDMO rule = rules.next();
				ArrayList<RuleDataDMO> collection = sortedRules.get(rule.getConstructionClassName());
				
				if (collection == null){
					collection = new ArrayList<RuleDataDMO>();
					sortedRules.put(rule.getConstructionClassName(), collection);
				}
				collection.add(rule);
			}
			
			for(String key: sortedRules.keySet()){
				ArrayList<RuleDataDMO> ruleset = sortedRules.get(key);
				String base = key.substring(0, key.length()-4);
				StringName rdn = new StringName(base);
				RuleDefinition rd = sm.ruleDefs.get(rdn);
				dumpRuleInstances(out, rd, ruleset);
			}
			
			
			out.write("  </table>\n\n");
			out.write("</div> <!-- ruleInstances -->\n\n");
		}
	}
	
	
	static void dumpRuleInstances(BufferedWriter out, RuleDefinition rd, ArrayList<RuleDataDMO> rules) throws IOException {
		out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
		
		definitionName(out, rd);
		
		for(RuleDataDMO rule: rules){
			
			out.write("    <tr>\n");

			out.write("      <td class=\"spacer\"> </td>\n");
			
			out.write("      <td colspan=\"3\">\n");
			out.write("      <a name =\"" + rule.getRuleName() + "\">\n");
			out.write("        " + rule.getRuleTitle() + "\n");
			out.write("      </a>\n");
			out.write("      </td>\n");
			
			out.write("    </tr>\n");
			
			DmcTypeClassDefinitionREFSV 	applyToClass 	= (DmcTypeClassDefinitionREFSV) rule.get(MetaDMSAG.__applyToClass);
			DmcTypeAttributeDefinitionREFSV	applyToAttr 	= (DmcTypeAttributeDefinitionREFSV) rule.get(MetaDMSAG.__applyToAttribute);
			
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
			
		}
		
	}
	
	static void definitionName(BufferedWriter out, RuleDefinition rd) throws IOException {
		out.write("    <tr> <td class=\"ruleDefName\" colspan=\"4\"> " + rd.getName() + " </td></tr>\n");
	}

}
