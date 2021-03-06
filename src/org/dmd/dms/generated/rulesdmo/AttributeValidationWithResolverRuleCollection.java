package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:301)
import java.util.ArrayList;                               // Storage for the rules - (RuleFormatter.java:277)
import org.dmd.dmc.DmcAttribute;                          // Required for attribute - (RuleFormatter.java:222)
import org.dmd.dmc.DmcAttributeInfo;                      // Organizing global attribute rules - (RuleFormatter.java:290)
import org.dmd.dmc.DmcClassInfo;                          // Handle to class info - (RuleFormatter.java:281)
import org.dmd.dmc.DmcObject;                             // Required for obj - (RuleFormatter.java:222)
import org.dmd.dmc.DmcOmni;                               // Rule tracing support - (RuleFormatter.java:280)
import org.dmd.dmc.DmcUniqueNameResolverIF;               // Required for resolver - (RuleFormatter.java:222)
import org.dmd.dmc.rules.AttributeRuleCollection;         // Attribute rule - (RuleFormatter.java:289)
import org.dmd.dmc.rules.DmcRuleExceptionSet;             // Rule type - (RuleFormatter.java:210)
import org.dmd.dmc.rules.RuleIF;                          // All rules implement this - (RuleFormatter.java:211)


public class AttributeValidationWithResolverRuleCollection extends AttributeRuleCollection<AttributeValidationWithResolverIF> {

    public AttributeValidationWithResolverRuleCollection(){
    }

    // Generated from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:310)
    @Override
    public void addRule(RuleIF r){

        if (r instanceof AttributeValidationWithResolverIF){
            super.addThisRule((AttributeValidationWithResolverIF)r);
        }
    }

    /**
     * @param obj The object in which the attribute exists
     * @param attribute The attribute to be validated
     * @param resolver The name resolver
     */
    public void execute(DmcObject obj, DmcAttribute<?> attribute, DmcUniqueNameResolverIF resolver) throws DmcRuleExceptionSet {
        DmcRuleExceptionSet rc = null;
        DmcAttributeInfo    aI = attribute.getAttributeInfo();
        DmcClassInfo        cI = obj.getConstructionClassInfo();
        ArrayList<AttributeValidationWithResolverIF> ruleList = super.getRules(aI,cI);

        if (ruleList != null){
            for(AttributeValidationWithResolverIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying: " + rule.getRuleTitle() + " to: " + cI.name + "." + aI.name);
                try {
                    rule.execute(obj, attribute, resolver);
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

        ruleList = globalRules.get(aI);
        if (ruleList != null){
            for(AttributeValidationWithResolverIF rule: ruleList){
                if (DmcOmni.instance().ruleTracing())
                    DmcOmni.instance().ruleExecuted("Applying global: " + rule.getRuleTitle() + " to: " + cI.name + "." + aI.name);
                try {
                    rule.execute(obj, attribute, resolver);
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
        if (rc != null)
            throw(rc);
    }

}

