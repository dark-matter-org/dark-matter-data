package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:288)
import java.util.ArrayList;                               // Storage for the rules - (RuleFormatter.java:271)
import java.util.HashMap;                                 // Storage for the rules - (RuleFormatter.java:278)
import java.util.TreeMap;                                 // Storage for the rules - (RuleFormatter.java:272)
import org.dmd.dmc.DmcAttribute;                          // Required for attribute - (RuleFormatter.java:217)
import org.dmd.dmc.DmcAttributeInfo;                      // Organizing global attribute rules - (RuleFormatter.java:277)
import org.dmd.dmc.DmcObject;                             // Required for obj - (RuleFormatter.java:217)
import org.dmd.dmc.rules.AttributeRuleCollection;         // Attribute rule - (RuleFormatter.java:276)
import org.dmd.dmc.rules.DmcRuleExceptionSet;             // Rule type - (RuleFormatter.java:206)
import org.dmd.dmc.rules.RuleIF;                          // All rules implement this - (RuleFormatter.java:207)
import org.dmd.dmc.rules.RuleKey;                         // Generic rule key - (RuleFormatter.java:273)
public class AttributeValidationRuleCollection extends AttributeRuleCollection<AttributeValidationIF> {

    public AttributeValidationRuleCollection(){
        globalRules = new HashMap<DmcAttributeInfo, ArrayList<AttributeValidationIF>>();
        rules = new TreeMap<RuleKey,ArrayList<AttributeValidationIF>>();
    }

    @Override
    public void addRule(RuleIF r){

        if (r instanceof AttributeValidationIF){
            AttributeValidationIF rule = (AttributeValidationIF)r;

            if (rule.getApplyToClass() == null){
                ArrayList<AttributeValidationIF> grl = globalRules.get(rule.getApplyToAttribute());
                if (grl == null){
                    grl = new ArrayList<AttributeValidationIF>();
                    globalRules.put(rule.getApplyToAttribute(), grl);
                }
                grl.add(rule);
            }
            else{
            }
        }
    }

    /**
     * @param obj The object in which the attribute exists
,      * @param attribute The attribute to be validated
     */
    public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
    }

}

