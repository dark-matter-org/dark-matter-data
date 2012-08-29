package org.dmd.dmv.shared.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:241)
import java.util.ArrayList;                                                // To store category IDs - (RuleFormatter.java:219)
import java.util.Iterator;                                                 // To access category IDs - (RuleFormatter.java:220)
import org.dmd.dmc.DmcAttributeInfo;                                       // To support retrieval of attribute info - (RuleFormatter.java:223)
import org.dmd.dmc.DmcClassInfo;                                           // To support retrieval of rule class - (RuleFormatter.java:222)
import org.dmd.dmc.DmcOmni;                                                // To map class and attribute names to info - (RuleFormatter.java:221)
import org.dmd.dmc.rules.RuleIF;                                           // All rules implement this - (RuleFormatter.java:218)
import org.dmd.dms.generated.enums.RuleTypeEnum;                           // Rule type - (RuleFormatter.java:217)
import org.dmd.dms.shared.interfaces.ObjectValidationIF;                   // The interface for the ObjectValidation category - (RuleFormatter.java:232)
import org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO;         // Rule parameters object - (RuleFormatter.java:226)


// Generated from: org.dmd.dms.util.RuleFormatter.dumpBaseImplementations(RuleFormatter.java:243)
abstract public class RelatedNumbersRuleBaseImpl implements RuleIF,ObjectValidationIF {

    static RuleTypeEnum       type  = RuleTypeEnum.CLASS;

    static ArrayList<Integer> categories;

    private DmcClassInfo      classInfo;
    private DmcAttributeInfo  attrInfo;

    protected RelatedNumbersRuleDataDMO ruleDMO;

    protected RelatedNumbersRuleBaseImpl(){
        ruleDMO = null;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(-3499998);
        }
    }

    protected RelatedNumbersRuleBaseImpl(RelatedNumbersRuleDataDMO dmo){
        ruleDMO = dmo;
        if (categories == null){
            categories = new ArrayList<Integer>();
            categories.add(-3499998);
        }
    }

    @Override
    public String getRuleTitle() {
        return(ruleDMO.getRuleTitle());
    }

    @Override
    public DmcClassInfo getRuleClass() {
        return(ruleDMO.getConstructionClassInfo());
    }

    @Override
    public RuleTypeEnum getRuleType() {
        return(type);
    }

    @Override
    public Iterator<Integer> getCategories() {
        return(categories.iterator());
    }

    @Override
    public DmcClassInfo getApplyToClass() {
        if (classInfo != null)
            return(classInfo);
        
        if (ruleDMO == null)
            return(null);
        
        if (ruleDMO.getApplyToClass() != null)
            classInfo = DmcOmni.instance().getClassInfo(ruleDMO.getApplyToClass().getObjectName().getNameString());
        
        return(classInfo);
    }

    @Override
    public DmcAttributeInfo getApplyToAttribute() {
        if (attrInfo != null)
            return(attrInfo);
        
        if (ruleDMO == null)
            return(null);
        if (ruleDMO.getApplyToAttribute() != null)
            attrInfo = DmcOmni.instance().getAttributeInfo(ruleDMO.getApplyToAttribute().getObjectName().getNameString());
        
        return(attrInfo);
    }

}

