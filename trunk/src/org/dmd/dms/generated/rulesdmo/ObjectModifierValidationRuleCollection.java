package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:300)
import java.util.ArrayList;                                   // Storage for the rules - (RuleFormatter.java:276)
import org.dmd.dmc.DmcClassInfo;                              // Handle to class info - (RuleFormatter.java:280)
import org.dmd.dmc.DmcObject;                                 // Required for obj - (RuleFormatter.java:221)
import org.dmd.dmc.DmcOmni;                                   // Rule tracing support - (RuleFormatter.java:279)
import org.dmd.dmc.rules.ClassRuleCollection;                 // Class rule - (RuleFormatter.java:293)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                 // Rule type - (RuleFormatter.java:209)
import org.dmd.dmc.rules.RuleIF;                              // All rules implement this - (RuleFormatter.java:210)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for mods - (RuleFormatter.java:221)

public class ObjectModifierValidationRuleCollection extends ClassRuleCollection<ObjectModifierValidationIF> {

    public ObjectModifierValidationRuleCollection(){
    }

    // Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:378)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof ObjectModifierValidationIF){
            super.addThisRule((ObjectModifierValidationIF)r);
        }
    }

    /**
     * @param obj The object being modified
     * @param mods The set of modifications being performed
     */
    public void execute(DmcObject obj, DmcTypeModifierMV mods) throws DmcRuleExceptionSet {
        DmcRuleExceptionSet rc = null;
        DmcClassInfo        cI = obj.getConstructionClassInfo();
        ArrayList<ObjectModifierValidationIF> ruleList = super.getRules(cI);

        if (ruleList != null){
            for(ObjectModifierValidationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
                try {
                    rule.execute(obj, mods);
                } catch (DmcRuleExceptionSet e) {
                    if (rc == null)
                        rc = e;
                    else
                        rc.add(e);
                    
                    if (DmcOmni.instance().ruleTracing())
                        DmcOmni.instance().ruleFailed(e);
                    
                    if (rc.immediateHalt())
                        throw(rc);
                }
            }
        }

        for(ObjectModifierValidationIF rule: globalRules){
            if (DmcOmni.instance().ruleTracing())
                DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name);
            try {
                rule.execute(obj, mods);
            } catch (DmcRuleExceptionSet e) {
                if (rc == null)
                    rc = e;
                else
                    rc.add(e);

                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleFailed(e);

                 if (rc.immediateHalt())
                    throw(rc);
            }
        }
    }

}

