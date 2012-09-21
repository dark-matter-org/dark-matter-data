package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:300)
import java.util.ArrayList;                               // Storage for the rules - (RuleFormatter.java:276)
import org.dmd.dmc.DmcAttributeInfo;                      // Organizing global attribute rules - (RuleFormatter.java:289)
import org.dmd.dmc.DmcClassInfo;                          // Handle to class info - (RuleFormatter.java:280)
import org.dmd.dmc.DmcObject;                             // Required for obj - (RuleFormatter.java:221)
import org.dmd.dmc.DmcOmni;                               // Rule tracing support - (RuleFormatter.java:279)
import org.dmd.dmc.rules.AttributeRuleCollection;         // Attribute rule - (RuleFormatter.java:288)
import org.dmd.dmc.rules.DmcRuleExceptionSet;             // Rule type - (RuleFormatter.java:209)
import org.dmd.dmc.rules.RuleIF;                          // All rules implement this - (RuleFormatter.java:210)
import org.dmd.dmc.types.Modifier;                        // Required for mod - (RuleFormatter.java:221)

public class AttributeModifierValidationRuleCollection extends AttributeRuleCollection<AttributeModifierValidationIF> {

    public AttributeModifierValidationRuleCollection(){
    }

    // Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:309)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof AttributeModifierValidationIF){
            super.addThisRule((AttributeModifierValidationIF)r);
        }
    }

    /**
     * @param obj The object being modified
     * @param mod The particular modification being validated
     */
    public void execute(DmcObject obj, Modifier mod) throws DmcRuleExceptionSet {
        DmcAttributeInfo aI = DmcOmni.instance().getAttributeInfo(mod.getAttributeName());
        DmcClassInfo     cI = obj.getConstructionClassInfo();
        ArrayList<AttributeModifierValidationIF> ruleList = super.getRules(aI,cI);

        if (ruleList != null){
            for(AttributeModifierValidationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying " + rule.getRuleTitle() + " to: " + cI.name + "." + aI.name);
                rule.execute(obj, mod);
            }
        }

        ruleList = globalRules.get(aI);
        if (ruleList != null){
            for(AttributeModifierValidationIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying global " + rule.getRuleTitle() + " to: " + cI.name + "." + aI.name);
                rule.execute(obj, mod);
            }
        }
    }

}

