package org.dmd.dms.tools.meta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.core.util.NamedStringArray;
import org.dmd.dms.shared.generated.types.RuleParam;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.artifact.Manipulator;
import org.dmd.util.artifact.java.ImportManager;
import org.dmd.util.runtime.DebugInfo;


/**
 * The MetaRuleFormatter creates the rule interface definition and rule collection classes
 * for each of the rule category definitions.
 */
public class MetaRuleFormatter {

	/**
	 * Dumps the interfaces and collections.
	 * @param ruleCategoryDefs the category definitions.
	 * @param rulesDir where to dump the generated files.
	 * @param LGPL the LGPL header
	 * @throws DMFeedbackSet
	 * @throws IOException
	 */
    static public void dumpRuleCategoryInterfaces(TreeMap<String,DMUncheckedObject> ruleCategoryDefs, String rulesDir, String LGPL) throws DMFeedbackSet, IOException{
		
		for(DMUncheckedObject category: ruleCategoryDefs.values()){
    		String 				name 					= Manipulator.capFirstChar(category.getSV("name"));
    		String 				ruleType 				= category.getSV("ruleType");
    		String 				classInfoFromParam		= category.getSV("classInfoFromParam");
    		String 				attributeInfoFromParam	= category.getSV("attributeInfoFromParam");
    		NamedStringArray	ruleImports				= category.get("ruleImport");
    		Boolean				isAttributeRule 		= false;
    		
    		if (ruleType.equals("ATTRIBUTE"))
    			isAttributeRule = true;
    		
    		NamedStringArray categories = category.get("ruleParam");
    		    		
    		ImportManager baseImports = new ImportManager();
    				
    		baseImports.addImport("org.dmd.core.rules.DmcRuleExceptionSet", "Rule type");
    		baseImports.addImport("org.dmd.core.rules.RuleIF", "All rules implement this");
    		
    		StringBuffer	params = new StringBuffer();
    		StringBuffer	args = new StringBuffer();
    		StringBuffer	argValues = new StringBuffer();
    		boolean			first = true;
    		
    		for(String p : categories){
    			RuleParam param;
				try {
					param = new RuleParam(p);
	    			baseImports.addImport(param.getImportStatement(), "Required for " + param.getName());
	    			int lastDot = param.getImportStatement().lastIndexOf(".");
	    			String ptype = param.getImportStatement().substring(lastDot + 1);
	    			
	    			if (!first){
//	    				params.append(", ");
	    				args.append(", ");
	    				argValues.append(", ");
	    			}
	    			
	    			params.append("     * @param " + param.getName() + " " + param.getDescription() + "\n");
	    			
	    			args.append(ptype + param.getGenericArgs() + " " + param.getName());
	    			
	    			argValues.append(param.getName());
	    				
	    			first = false;
				} catch (DMFeedbackSet e) {
					System.err.println(e.toString());
					e.printStackTrace();
					System.err.println(category.toOIF());
					System.exit(1);
				}
    			
    			
    		}
    		
			BufferedWriter 	out = FileUpdateManager.instance().getWriter(rulesDir, name + "IF.java");
			
			out.write(LGPL);
			
			out.write("package org.dmd.dms.shared.generated.rulesdmo;\n\n");
			
			out.write(baseImports.getFormattedImports() + "\n\n");
			
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			out.write("public interface " + name + "IF extends RuleIF {\n\n");
			
			out.write("    /**\n");
			out.write(params.toString());
			out.write("     */\n");
			out.write("    public void execute(" + args + ") throws DmcRuleExceptionSet;\n\n");
			
			out.write("}\n\n");
			
			out.close();
			
			///////////////////////////////////////////////////////////////////
			
//			baseImports = new ImportManager();
			
    		baseImports.addImport("org.dmd.core.rules.DmcRuleExceptionSet", "Rule type");
    		baseImports.addImport("org.dmd.core.rules.RuleIF", "All rules implement this");
//    		baseImports.addImport("org.dmd.dmc.rules.RuleList", "Rules with flag to indicate that we've gathered info up the class hierarchy");
//    		baseImports.addImport("org.dmd.dms.generated.enums.RuleTypeEnum", "To determine the type of a rule");
//    		baseImports.addImport("org.dmd.dmc.rules.ClassRuleKey", "To determine the type of a rule");
//    		baseImports.addImport("org.dmd.dmc.rules.AttributeRuleKey", "To determine the type of a rule");
    		baseImports.addImport("java.util.ArrayList", "Storage for the rules");
//    		baseImports.addImport("java.util.TreeMap", "Storage for the rules");
//    		baseImports.addImport("org.dmd.dmc.rules.RuleKey", "Generic rule key");
    		baseImports.addImport("org.dmd.core.DmcOmni", "Rule tracing support");
    		baseImports.addImport("org.dmd.core.schema.DmcClassInfo", "Handle to class info");
    		
    		if (ruleImports != null){
    			for(String ri: ruleImports)
    				baseImports.addImport(ri, "Additional rule import");
    		}
    		
    		if (isAttributeRule){
        		baseImports.addImport("org.dmd.core.rules.AttributeRuleCollection", "Attribute rule");
        		baseImports.addImport("org.dmd.core.schema.DmcAttributeInfo", "Organizing global attribute rules");
//        		baseImports.addImport("java.util.HashMap", "Storage for the rules");
    		}
    		else
        		baseImports.addImport("org.dmd.core.rules.ClassRuleCollection", "Class rule");
    		
    		
    		out = FileUpdateManager.instance().getWriter(rulesDir, name + "RuleCollection.java");
			
			out.write(LGPL);
			
			out.write("package org.dmd.dms.shared.generated.rulesdmo;\n\n");
			
			out.write(baseImports.getFormattedImports() + "\n");
			
			if (isAttributeRule){
				out.write("public class " + name + "RuleCollection extends AttributeRuleCollection<" + name + "IF> {" + "\n\n");
				out.write("    public " + name + "RuleCollection(){\n");
//				out.write("        globalRules = new HashMap<DmcAttributeInfo, ArrayList<" + name + "IF>>();\n");
//				out.write("        rules = new TreeMap<RuleKey,RuleList<" + name + "IF>>();\n");
				out.write("    }\n\n");
				
				out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    @Override\n");
				out.write("    public void addRule(RuleIF r){\n");
				out.write("\n");
				out.write("        if (r instanceof " + name + "IF){\n");
				out.write("            super.addThisRule((" + name + "IF)r);\n");
				out.write("        }\n");
				out.write("    }\n\n");
				
				out.write("    /**\n");
				out.write(params.toString());
				out.write("     */\n");
				out.write("    public void execute(" + args + ") throws DmcRuleExceptionSet {\n");
				out.write("        DmcRuleExceptionSet rc = null;\n");
				out.write("        DmcAttributeInfo    aI = " + attributeInfoFromParam + ";\n");
				out.write("        DmcClassInfo        cI = " + classInfoFromParam + ";\n");
				out.write("        ArrayList<" + name + "IF> ruleList = super.getRules(aI,cI);\n");
				out.write("\n");
				out.write("        if (ruleList != null){\n");
				out.write("            for(" + name + "IF rule: ruleList){\n");
				out.write("                if (DmcOmni.instance().ruleTracing())\n");
				out.write("                    DmcOmni.instance().ruleExecuted(\"Applying: \" + rule.getRuleTitle() + \" to: \" + cI.name + \".\" + aI.name);\n");
				out.write("                try {\n");
				out.write("                    rule.execute(" + argValues + ");\n");
				out.write("                } catch (DmcRuleExceptionSet e) {\n");
				out.write("                    if (rc == null)\n");
				out.write("                        rc = e;\n");
				out.write("                    else\n");
				out.write("                        rc.add(e);\n");
				out.write("                    \n");
				out.write("                    if (DmcOmni.instance().ruleTracing())\n");
				out.write("                        DmcOmni.instance().ruleFailed(e);\n");
				out.write("                    \n");
				out.write("                    if (rc.immediateHalt())\n");
				out.write("                        throw(rc);\n");
				out.write("                }\n");
				out.write("            }\n");
				out.write("        }\n");
				out.write("\n");
				out.write("        ruleList = globalRules.get(aI);\n");
				out.write("        if (ruleList != null){\n");
				out.write("            for(" + name + "IF rule: ruleList){\n");
				out.write("                if (DmcOmni.instance().ruleTracing())\n");
				out.write("                    DmcOmni.instance().ruleExecuted(\"Applying global: \" + rule.getRuleTitle() + \" to: \" + cI.name + \".\" + aI.name);\n");
				out.write("                try {\n");
				out.write("                    rule.execute(" + argValues + ");\n");
				out.write("                } catch (DmcRuleExceptionSet e) {\n");
				out.write("                    if (rc == null)\n");
				out.write("                        rc = e;\n");
				out.write("                    else\n");
				out.write("                        rc.add(e);\n");
				out.write("                    \n");
				out.write("                    if (DmcOmni.instance().ruleTracing())\n");
				out.write("                        DmcOmni.instance().ruleFailed(e);\n");
				out.write("                    \n");
				out.write("                    if (rc.immediateHalt())\n");
				out.write("                        throw(rc);\n");
				out.write("                }\n");
				out.write("            }\n");
				out.write("        }\n");
				out.write("        if (rc != null)\n");
				out.write("            throw(rc);\n");
				out.write("    }\n\n");
				out.write("}\n\n");

			}
			else{
				out.write("public class " + name + "RuleCollection extends ClassRuleCollection<" + name + "IF> {" + "\n\n");
				out.write("    public " + name + "RuleCollection(){\n");
				out.write("    }\n\n");
				
				out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				out.write("    @Override\n");
				out.write("    public void addRule(RuleIF r){\n");
				out.write("\n");
				out.write("        if (r instanceof " + name + "IF){\n");
				out.write("            super.addThisRule((" + name + "IF)r);\n");
				out.write("        }\n");
				out.write("    }\n\n");
				
				out.write("    /**\n");
				out.write(params.toString());
				out.write("     */\n");
				out.write("    public void execute(" + args + ") throws DmcRuleExceptionSet {\n");
				out.write("        DmcRuleExceptionSet rc = null;\n");
				out.write("        DmcClassInfo        cI = " + classInfoFromParam + ";\n");
				out.write("        ArrayList<" + name + "IF> ruleList = super.getRules(cI);\n");
				out.write("\n");
				out.write("        if (ruleList != null){\n");
				out.write("            for(" + name + "IF rule: ruleList){\n");
				out.write("                if (DmcOmni.instance().ruleTracing())\n");
				out.write("                    DmcOmni.instance().ruleExecuted(\"Applying: \" + rule.getRuleTitle() + \" to: \" + cI.name);\n");
				out.write("                try {\n");
				out.write("                    rule.execute(" + argValues + ");\n");
				out.write("                } catch (DmcRuleExceptionSet e) {\n");
				out.write("                    if (rc == null)\n");
				out.write("                        rc = e;\n");
				out.write("                    else\n");
				out.write("                        rc.add(e);\n");
				out.write("                    \n");
				out.write("                    if (DmcOmni.instance().ruleTracing())\n");
				out.write("                        DmcOmni.instance().ruleFailed(e);\n");
				out.write("                    \n");
				out.write("                    if (rc.immediateHalt())\n");
				out.write("                        throw(rc);\n");
				out.write("                }\n");
				out.write("            }\n");
				out.write("        }\n");
				out.write("\n");
				out.write("        for(" + name + "IF rule: globalRules){\n");
				out.write("            if (DmcOmni.instance().ruleTracing())\n");
				out.write("                DmcOmni.instance().ruleExecuted(\"Applying global: \" + rule.getRuleTitle() + \" to: \" + cI.name);\n");
				out.write("            try {\n");
				out.write("                rule.execute(" + argValues + ");\n");
				out.write("            } catch (DmcRuleExceptionSet e) {\n");
				out.write("                if (rc == null)\n");
				out.write("                    rc = e;\n");
				out.write("                else\n");
				out.write("                    rc.add(e);\n");
				out.write("\n");
				out.write("                if (DmcOmni.instance().ruleTracing())\n");
				out.write("                    DmcOmni.instance().ruleFailed(e);\n");
				out.write("\n");
				out.write("                 if (rc.immediateHalt())\n");
				out.write("                    throw(rc);\n");
				out.write("            }\n");
				out.write("        }\n");
				out.write("        if (rc != null)\n");
				out.write("            throw(rc);\n");
				out.write("    }\n\n");
				out.write("}\n\n");
			}
			
			out.close();
		}
		
	}	
		

	
}
