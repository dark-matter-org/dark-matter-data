package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:285)
import java.util.TreeMap;                                 // Storage for the rules - (RuleFormatter.java:272)
import org.dmd.dmc.DmcAttribute;                          // Required for attribute - (RuleFormatter.java:218)
import org.dmd.dmc.DmcObject;                             // Required for obj - (RuleFormatter.java:218)
import org.dmd.dmc.rules.AttributeRuleCollection;         // Attribute rule - (RuleFormatter.java:276)
import org.dmd.dmc.rules.DmcRuleExceptionSet;             // Rule type - (RuleFormatter.java:207)
import org.dmd.dmc.rules.RuleIF;                          // All rules implement this - (RuleFormatter.java:208)
import org.dmd.dmc.rules.RuleKey;                         // Generic rule key - (RuleFormatter.java:273)
public class AttributeValidationRuleCollection extends AttributeRuleCollection<AttributeValidationIF> {

    public AttributeValidationRuleCollection(){
        rules = new TreeMap<RuleKey,AttributeValidationIF>();
    }

    @Override
    public void addRule(RuleIF rule) {

        if (rule instanceof AttributeValidationIF){
            
        }
    }

    /**
     * @param obj The object in which the attribute exists,      * @param attribute The attribute to be validated
     */
    public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
    }

}

