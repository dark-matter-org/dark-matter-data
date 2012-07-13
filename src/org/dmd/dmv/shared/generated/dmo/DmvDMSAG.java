package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:723)
import java.util.ArrayList;                                                   // For storage of schema info - (DmoCompactSchemaFormatter.java:661)
import java.util.HashMap;                                                     // For storage of schema info - (DmoCompactSchemaFormatter.java:660)
import java.util.Iterator;                                                    // For access of schema info - (DmoCompactSchemaFormatter.java:662)
import org.dmd.dmc.*;                                                         // Basic DMC stuff - (DmoCompactSchemaFormatter.java:663)
import org.dmd.dmc.rules.RuleIF;                                              // For rule info - (DmoCompactSchemaFormatter.java:664)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:676)
import org.dmd.dms.generated.enums.ClassTypeEnum;                             // Have class definitions - (DmoCompactSchemaFormatter.java:668)
import org.dmd.dms.generated.enums.DataTypeEnum;                              // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:669)
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // Have attribute definitions - (DmoCompactSchemaFormatter.java:691)
import org.dmd.dmv.shared.extended.rulesdmo.AllowedAttributesRule;            // To support instantiations of AllowedAttributesRule - (DmoCompactSchemaFormatter.java:700)
import org.dmd.dmv.shared.extended.rulesdmo.InitRule;                         // To support instantiations of InitRule - (DmoCompactSchemaFormatter.java:700)
import org.dmd.dmv.shared.extended.rulesdmo.IntegerRangeRule;                 // To support instantiations of IntegerRangeRule - (DmoCompactSchemaFormatter.java:700)
import org.dmd.dmv.shared.extended.rulesdmo.UCOAllowedAttributesRule;         // To support instantiations of UCOAllowedAttributesRule - (DmoCompactSchemaFormatter.java:700)
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;         // To instantiate AllowedAttributesRuleData rule data - (DmoCompactSchemaFormatter.java:716)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:101)
public class DmvDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmv";


    static int schemaBaseID = -480000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -479950;

    public final static DmcAttributeInfo __irrMaximum = new DmcAttributeInfo("irrMaximum", -479998, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __irrMinimum = new DmcAttributeInfo("irrMinimum", -479999, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcClassInfo __AllowedAttributesRuleData = new DmcClassInfo("AllowedAttributesRuleData", -959999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __InitRuleData = new DmcClassInfo("InitRuleData", -959998, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __IntegerRangeRuleData = new DmcClassInfo("IntegerRangeRuleData", -959997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __UCOAllowedAttributesRuleData = new DmcClassInfo("UCOAllowedAttributesRuleData", -959996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:162)
    public final static AllowedAttributesRule __dmvAllowedAttributes;

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _RmAp = new ArrayList<RuleIF>();

        _SmAp.put(__irrMaximum.id,__irrMaximum);
        _SmAp.put(__irrMinimum.id,__irrMinimum);
        _CmAp.put(__AllowedAttributesRuleData.id,__AllowedAttributesRuleData);
        _CmAp.put(__InitRuleData.id,__InitRuleData);
        _CmAp.put(__IntegerRangeRuleData.id,__IntegerRangeRuleData);
        _CmAp.put(__UCOAllowedAttributesRuleData.id,__UCOAllowedAttributesRuleData);

        __AllowedAttributesRuleData.addMust(MetaDMSAG.__ruleName);
        __AllowedAttributesRuleData.addMust(MetaDMSAG.__ruleTitle);
        __AllowedAttributesRuleData.addMay(MetaDMSAG.__description);

        __InitRuleData.addMust(MetaDMSAG.__ruleName);
        __InitRuleData.addMust(MetaDMSAG.__ruleTitle);
        __InitRuleData.addMust(MetaDMSAG.__applyToClass);
        __InitRuleData.addMay(MetaDMSAG.__description);

        __IntegerRangeRuleData.addMust(MetaDMSAG.__ruleName);
        __IntegerRangeRuleData.addMust(MetaDMSAG.__ruleTitle);
        __IntegerRangeRuleData.addMust(MetaDMSAG.__applyToAttribute);
        __IntegerRangeRuleData.addMust(__irrMinimum);
        __IntegerRangeRuleData.addMust(__irrMaximum);
        __IntegerRangeRuleData.addMay(MetaDMSAG.__description);
        __IntegerRangeRuleData.addMay(MetaDMSAG.__applyToClasses);

        __UCOAllowedAttributesRuleData.addMust(MetaDMSAG.__ruleName);
        __UCOAllowedAttributesRuleData.addMust(MetaDMSAG.__ruleTitle);
        __UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__description);

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
        // These instantiations are merely meant to ensure that you've overloaded
        // the base rule implementations
        @SuppressWarnings("unused")
        AllowedAttributesRule AllowedAttributesRuleInstance = new AllowedAttributesRule(new AllowedAttributesRuleDataDMO());
        @SuppressWarnings("unused")
        InitRule InitRuleInstance = new InitRule(new InitRuleDataDMO());
        @SuppressWarnings("unused")
        IntegerRangeRule IntegerRangeRuleInstance = new IntegerRangeRule(new IntegerRangeRuleDataDMO());
        @SuppressWarnings("unused")
        UCOAllowedAttributesRule UCOAllowedAttributesRuleInstance = new UCOAllowedAttributesRule(new UCOAllowedAttributesRuleDataDMO());

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:245)
        try{
            AllowedAttributesRuleDataDMO _dmvAllowedAttributesData = new AllowedAttributesRuleDataDMO();
            _dmvAllowedAttributesData    .setDefinedIn("dmv");
            _dmvAllowedAttributesData    .setDescription("Ensures that must/may attribute rules are followed.");
            _dmvAllowedAttributesData    .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvAllowedAttributesData    .setLineNumber("24");
            _dmvAllowedAttributesData    .setRuleName("dmvAllowedAttributes");
            _dmvAllowedAttributesData    .setRuleTitle("Validate allowed attributes on objects.");

            __dmvAllowedAttributes = new AllowedAttributesRule(_dmvAllowedAttributesData);

            _RmAp.add(__dmvAllowedAttributes);

        } catch(DmcValueException ex){
            throw(new IllegalStateException(ex));
        }

    }

    static  DmvDMSAG instance;

    protected DmvDMSAG (){
    }

    public synchronized static DmvDMSAG instance(){
        if (instance == null)
            instance = new DmvDMSAG();
        
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

