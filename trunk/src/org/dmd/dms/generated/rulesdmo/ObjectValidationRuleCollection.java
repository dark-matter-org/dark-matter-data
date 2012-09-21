package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:300)
import java.util.ArrayList;                           // Storage for the rules - (RuleFormatter.java:276)
import java.util.TreeMap;                             // Storage for the rules - (RuleFormatter.java:277)
import org.dmd.dmc.DmcClassInfo;                      // Handle to class info - (RuleFormatter.java:280)
import org.dmd.dmc.DmcObject;                         // Required for obj - (RuleFormatter.java:221)
import org.dmd.dmc.DmcOmni;                           // Rule tracing support - (RuleFormatter.java:279)
import org.dmd.dmc.rules.ClassRuleCollection;         // Class rule - (RuleFormatter.java:293)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:209)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:210)
import org.dmd.dmc.rules.RuleKey;                     // Generic rule key - (RuleFormatter.java:278)
import org.dmd.dmc.rules.RuleList;                    // Rules with flag to indicate that we've gathered info up the class hierarchy - (RuleFormatter.java:272)

public class ObjectValidationRuleCollection extends ClassRuleCollection<ObjectValidationIF> {

    public ObjectValidationRuleCollection(){
        globalRules = new ArrayList<ObjectValidationIF>();
        rules = new TreeMap<RuleKey,RuleList<ObjectValidationIF>>();
    }

    // Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:368)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof ObjectValidationIF){
            ObjectValidationIF rule = (ObjectValidationIF)r;
            if (rule.getApplyToClass() == null){
                globalRules.add(rule);
            }
            else{
                RuleList<ObjectValidationIF> classRules = rules.get(rule.getKey());
                if (classRules == null)
                    classRules = new RuleList<ObjectValidationIF>();
                classRules.addRule(rule);
            }
        }
    }

    /**
     * @param obj The object to be validated
     */
    public void execute(DmcObject obj) throws DmcRuleExceptionSet {
        DmcClassInfo     cI = obj.getConstructionClassInfo();
        ArrayList<ObjectValidationIF> ruleList = super.getRules(cI);

        if (ruleList != null){
            for(ObjectValidationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
                rule.execute(obj);
            }
        }

        for(ObjectValidationIF rule: globalRules){
            if (DmcOmni.instance().ruleTracing())
                DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
            rule.execute(obj);
        }
    }

}

