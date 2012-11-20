package org.dmd.dms.doc.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.util.exceptions.DebugInfo;

public class RuleInstanceFormatter {

	static public void dumpRuleInstanceDetails(BufferedWriter out, SchemaManager sm, SchemaDefinition sd) throws IOException {
		if (sd.hasParsedRules()){
			TreeMap<String,ArrayList<RuleDataDMO>>	sortedRules = new TreeMap<String, ArrayList<RuleDataDMO>>();
			
			out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
			
			out.write("<div class=\"ruleInstances\">\n\n");
			
			out.write("<h2> Rule Instances </h2>\n\n");
			
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
				
			}
			
			out.write("</div> <!-- ruleInstances -->\n\n");
		}
	}
	
	static void dumpRuleInstance(BufferedWriter out, RuleDataDMO rule) throws IOException {
		out.write("<!-- " + DebugInfo.getWhereWeAreNow() + " -->\n");
		out.write("  <table>\n\n");
		
		out.write("    <tr>\n");
		
		out.write("      <td>\n");
		out.write("      <a name =\"" + rule.getRuleName().getNameString()+ "\">\n");
		out.write("        " + rule.getRuleTitle() + "\n");
		out.write("      </a>\n");
		out.write("      </td>\n");
		
		out.write("    </tr>\n");
		
		out.write("  </table>\n\n");
	}
}
