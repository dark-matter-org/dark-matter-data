package org.dmd.dmv.shared.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:237)
import java.util.ArrayList;                                      // To store category IDs - (RuleFormatter.java:218)
import java.util.Iterator;                                       // To access category IDs - (RuleFormatter.java:219)
import org.dmd.dmc.rules.RuleIF;                                 // All rules implement this - (RuleFormatter.java:217)
import org.dmd.dms.generated.enums.RuleScopeEnum;                // Rule scope - (RuleFormatter.java:215)
import org.dmd.dms.generated.enums.RuleTypeEnum;                 // Rule type - (RuleFormatter.java:216)
import org.dmd.dms.shared.interfaces.InitializationIF;           // The interface for the Initialization category - (RuleFormatter.java:228)
import org.dmd.dmv.shared.generated.dmo.InitRuleDataDMO;         // Rule parameters object - (RuleFormatter.java:222)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:239)
abstract public class InitRuleBaseImpl implements RuleIF,InitializationIF {

    static RuleScopeEnum      scope = RuleScopeEnum.PERCLASS;
    static RuleTypeEnum       type  = RuleTypeEnum.CLASS;

    static ArrayList<Integer> categories;

    protected InitRuleDataDMO ruleDMO;

    protected InitRuleBaseImpl(){
        ruleDMO = null;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(-3499999);
        }
    }

    protected InitRuleBaseImpl(InitRuleDataDMO dmo){
        ruleDMO = dmo;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(-3499999);
        }
    }

    @Override
    public String getRuleTitle() {
        return(ruleDMO.getRuleTitle());
    }

    @Override
    public RuleScopeEnum getRuleScope() {
        return(scope);
    }

    @Override
    public RuleTypeEnum getRuleType() {
        return(type);
    }

    @Override
    public Iterator<Integer> getCategories() {
        return(categories.iterator());
    }

}

