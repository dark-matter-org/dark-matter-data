package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:300)
import java.util.ArrayList;                                   // Storage for the rules - (RuleFormatter.java:276)
import java.util.TreeMap;                                     // Storage for the rules - (RuleFormatter.java:277)
import org.dmd.dmc.DmcClassInfo;                              // Handle to class info - (RuleFormatter.java:280)
import org.dmd.dmc.DmcObject;                                 // Required for obj - (RuleFormatter.java:221)
import org.dmd.dmc.DmcOmni;                                   // Rule tracing support - (RuleFormatter.java:279)
import org.dmd.dmc.rules.ClassRuleCollection;                 // Class rule - (RuleFormatter.java:293)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                 // Rule type - (RuleFormatter.java:209)
import org.dmd.dmc.rules.RuleIF;                              // All rules implement this - (RuleFormatter.java:210)
import org.dmd.dmc.rules.RuleKey;                             // Generic rule key - (RuleFormatter.java:278)
import org.dmd.dmc.rules.RuleList;                            // Rules with flag to indicate that we've gathered info up the class hierarchy - (RuleFormatter.java:272)
import org.dmd.dmc.types.Modifier;                            // Required for mod - (RuleFormatter.java:221)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for mods - (RuleFormatter.java:221)

public class ObjectModifierValidationRuleCollection extends ClassRuleCollection<ObjectModifierValidationIF> {

    public ObjectModifierValidationRuleCollection(){
        globalRules = new ArrayList<ObjectModifierValidationIF>();
        rules = new TreeMap<RuleKey,RuleList<ObjectModifierValidationIF>>();
    }

    // Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:368)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof ObjectModifierValidationIF){
            ObjectModifierValidationIF rule = (ObjectModifierValidationIF)r;
            if (rule.getApplyToClass() == null){
                globalRules.add(rule);
            }
            else{
                RuleList<ObjectModifierValidationIF> classRules = rules.get(rule.getKey());
                if (classRules == null)
                    classRules = new RuleList<ObjectModifierValidationIF>();
                classRules.addRule(rule);
            }
        }
    }

    /**
     * @param obj The object being modified
     * @param mods The set of modifications being performed
     * @param mod The particular modification being validated
     */
    public void execute(DmcObject obj, DmcTypeModifierMV mods, Modifier mod) throws DmcRuleExceptionSet {
        DmcClassInfo     cI = obj.getConstructionClassInfo();
        ArrayList<ObjectModifierValidationIF> ruleList = super.getRules(cI);

        if (ruleList != null){
            for(ObjectModifierValidationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
                rule.execute(obj, mods, mod);
            }
        }

        for(ObjectModifierValidationIF rule: globalRules){
            if (DmcOmni.instance().ruleTracing())
                DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
            rule.execute(obj, mods, mod);
        }
    }

}

