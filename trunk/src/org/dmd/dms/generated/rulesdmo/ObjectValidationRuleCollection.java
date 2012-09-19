package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:288)
import java.util.ArrayList;                           // Storage for the rules - (RuleFormatter.java:271)
import java.util.TreeMap;                             // Storage for the rules - (RuleFormatter.java:272)
import org.dmd.dmc.DmcObject;                         // Required for obj - (RuleFormatter.java:217)
import org.dmd.dmc.rules.ClassRuleCollection;         // Class rule - (RuleFormatter.java:281)
import org.dmd.dmc.rules.DmcRuleExceptionSet;         // Rule type - (RuleFormatter.java:206)
import org.dmd.dmc.rules.RuleIF;                      // All rules implement this - (RuleFormatter.java:207)
import org.dmd.dmc.rules.RuleKey;                     // Generic rule key - (RuleFormatter.java:273)
public class ObjectValidationRuleCollection extends ClassRuleCollection<ObjectValidationIF> {

    public ObjectValidationRuleCollection(){
        globalRules = new ArrayList<ObjectValidationIF>();
        rules = new TreeMap<RuleKey,ArrayList<ObjectValidationIF>>();
    }

    @Override
    public void addRule(RuleIF r){

        if (r instanceof ObjectValidationIF){
            ObjectValidationIF rule = (ObjectValidationIF)r;
            if (rule.getApplyToClass() == null){
                globalRules.add(rule);
            }
            else{
            }
        }
    }

    /**
     * @param obj The object to be validated
     */
    public void execute(DmcObject obj) throws DmcRuleExceptionSet {
    }

}

