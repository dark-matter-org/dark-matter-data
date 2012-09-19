package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:736)
import java.util.ArrayList;                                                          // For storage of schema info - (DmoCompactSchemaFormatter.java:674)
import java.util.HashMap;                                                            // For storage of schema info - (DmoCompactSchemaFormatter.java:673)
import java.util.Iterator;                                                           // For access of schema info - (DmoCompactSchemaFormatter.java:675)
import org.dmd.dmc.*;                                                                // Basic DMC stuff - (DmoCompactSchemaFormatter.java:676)
import org.dmd.dmc.rules.RuleIF;                                                     // For rule info - (DmoCompactSchemaFormatter.java:677)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                          // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:689)
import org.dmd.dms.generated.enums.ClassTypeEnum;                                    // Have class definitions - (DmoCompactSchemaFormatter.java:681)
import org.dmd.dms.generated.enums.DataTypeEnum;                                     // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:682)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                    // Have attribute definitions - (DmoCompactSchemaFormatter.java:704)
import org.dmd.dmv.shared.extended.rulesdmo.AllowedAttributesRule;                   // To support instantiations of AllowedAttributesRule - (DmoCompactSchemaFormatter.java:713)
import org.dmd.dmv.shared.extended.rulesdmo.AttributeTypeRule;                       // To support instantiations of AttributeTypeRule - (DmoCompactSchemaFormatter.java:713)
import org.dmd.dmv.shared.extended.rulesdmo.CheckAttributesBasedOnValueRule;         // To support instantiations of CheckAttributesBasedOnValueRule - (DmoCompactSchemaFormatter.java:713)
import org.dmd.dmv.shared.extended.rulesdmo.InitRule;                                // To support instantiations of InitRule - (DmoCompactSchemaFormatter.java:713)
import org.dmd.dmv.shared.extended.rulesdmo.IntegerRangeRule;                        // To support instantiations of IntegerRangeRule - (DmoCompactSchemaFormatter.java:713)
import org.dmd.dmv.shared.extended.rulesdmo.RelatedNumbersRule;                      // To support instantiations of RelatedNumbersRule - (DmoCompactSchemaFormatter.java:713)
import org.dmd.dmv.shared.extended.rulesdmo.UCOAllowedAttributesRule;                // To support instantiations of UCOAllowedAttributesRule - (DmoCompactSchemaFormatter.java:713)
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;                // To instantiate AllowedAttributesRuleData rule data - (DmoCompactSchemaFormatter.java:729)
import org.dmd.dmv.shared.generated.dmo.AttributeTypeRuleDataDMO;                    // To instantiate AttributeTypeRuleData rule data - (DmoCompactSchemaFormatter.java:729)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:100)
public class DmvDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmv";


    static int schemaBaseID = -480000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -479950;

    public final static DmcAttributeInfo __allowedType = new DmcAttributeInfo("allowedType", -479994, "TypeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __basedOnAttribute = new DmcAttributeInfo("basedOnAttribute", -479993, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __basedOnValue = new DmcAttributeInfo("basedOnValue", -479992, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __excludeThisAttribute = new DmcAttributeInfo("excludeThisAttribute", -479991, "AttributeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __includeThisAttribute = new DmcAttributeInfo("includeThisAttribute", -479990, "AttributeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __irrMaximum = new DmcAttributeInfo("irrMaximum", -479998, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __irrMinimum = new DmcAttributeInfo("irrMinimum", -479999, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __lhs = new DmcAttributeInfo("lhs", -479996, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __numericRelation = new DmcAttributeInfo("numericRelation", -479997, "NumericRelationEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __rhs = new DmcAttributeInfo("rhs", -479995, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcClassInfo __AllowedAttributesRuleData = new DmcClassInfo("AllowedAttributesRuleData","org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO", -959999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __AttributeTypeRuleData = new DmcClassInfo("AttributeTypeRuleData","org.dmd.dmv.shared.generated.dmo.AttributeTypeRuleDataDMO", -959995, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __CheckAttributesBasedOnValueRuleData = new DmcClassInfo("CheckAttributesBasedOnValueRuleData","org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO", -959993, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __InitRuleData = new DmcClassInfo("InitRuleData","org.dmd.dmv.shared.generated.dmo.InitRuleDataDMO", -959998, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __IntegerRangeRuleData = new DmcClassInfo("IntegerRangeRuleData","org.dmd.dmv.shared.generated.dmo.IntegerRangeRuleDataDMO", -959997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __RelatedNumbersRuleData = new DmcClassInfo("RelatedNumbersRuleData","org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO", -959994, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __UCOAllowedAttributesRuleData = new DmcClassInfo("UCOAllowedAttributesRuleData","org.dmd.dmv.shared.generated.dmo.UCOAllowedAttributesRuleDataDMO", -959996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:163)
    public final static AllowedAttributesRule __dmvAllowedAttributes;
    public final static AttributeTypeRule __dmvLhs;
    public final static AttributeTypeRule __dmvRhs;

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

        _SmAp.put(__allowedType.id,__allowedType);
        _SmAp.put(__basedOnAttribute.id,__basedOnAttribute);
        _SmAp.put(__basedOnValue.id,__basedOnValue);
        _SmAp.put(__excludeThisAttribute.id,__excludeThisAttribute);
        _SmAp.put(__includeThisAttribute.id,__includeThisAttribute);
        _SmAp.put(__irrMaximum.id,__irrMaximum);
        _SmAp.put(__irrMinimum.id,__irrMinimum);
        _SmAp.put(__lhs.id,__lhs);
        _SmAp.put(__numericRelation.id,__numericRelation);
        _SmAp.put(__rhs.id,__rhs);
        _CmAp.put(__AllowedAttributesRuleData.id,__AllowedAttributesRuleData);
        _CmAp.put(__AttributeTypeRuleData.id,__AttributeTypeRuleData);
        _CmAp.put(__CheckAttributesBasedOnValueRuleData.id,__CheckAttributesBasedOnValueRuleData);
        _CmAp.put(__InitRuleData.id,__InitRuleData);
        _CmAp.put(__IntegerRangeRuleData.id,__IntegerRangeRuleData);
        _CmAp.put(__RelatedNumbersRuleData.id,__RelatedNumbersRuleData);
        _CmAp.put(__UCOAllowedAttributesRuleData.id,__UCOAllowedAttributesRuleData);

        __AllowedAttributesRuleData.addMust(MetaDMSAG.__ruleName);
        __AllowedAttributesRuleData.addMust(MetaDMSAG.__ruleTitle);
        __AllowedAttributesRuleData.addMay(MetaDMSAG.__description);
        __AllowedAttributesRuleData.addMay(MetaDMSAG.__applyToClass);

        __InitRuleData.addMust(MetaDMSAG.__ruleName);
        __InitRuleData.addMust(MetaDMSAG.__ruleTitle);
        __InitRuleData.addMay(MetaDMSAG.__description);
        __InitRuleData.addMay(MetaDMSAG.__applyToClass);

        __IntegerRangeRuleData.addMust(MetaDMSAG.__ruleName);
        __IntegerRangeRuleData.addMust(MetaDMSAG.__ruleTitle);
        __IntegerRangeRuleData.addMust(MetaDMSAG.__applyToAttribute);
        __IntegerRangeRuleData.addMust(__irrMinimum);
        __IntegerRangeRuleData.addMust(__irrMaximum);
        __IntegerRangeRuleData.addMay(MetaDMSAG.__description);
        __IntegerRangeRuleData.addMay(MetaDMSAG.__applyToClass);

        __UCOAllowedAttributesRuleData.addMust(MetaDMSAG.__ruleName);
        __UCOAllowedAttributesRuleData.addMust(MetaDMSAG.__ruleTitle);
        __UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__description);
        __UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__applyToClass);

        __AttributeTypeRuleData.addMust(MetaDMSAG.__ruleName);
        __AttributeTypeRuleData.addMust(MetaDMSAG.__ruleTitle);
        __AttributeTypeRuleData.addMust(MetaDMSAG.__applyToAttribute);
        __AttributeTypeRuleData.addMust(__allowedType);
        __AttributeTypeRuleData.addMay(MetaDMSAG.__description);
        __AttributeTypeRuleData.addMay(MetaDMSAG.__applyToClass);

        __RelatedNumbersRuleData.addMust(MetaDMSAG.__ruleName);
        __RelatedNumbersRuleData.addMust(MetaDMSAG.__ruleTitle);
        __RelatedNumbersRuleData.addMust(__lhs);
        __RelatedNumbersRuleData.addMust(__rhs);
        __RelatedNumbersRuleData.addMust(__numericRelation);
        __RelatedNumbersRuleData.addMay(MetaDMSAG.__description);
        __RelatedNumbersRuleData.addMay(MetaDMSAG.__applyToClass);

        __CheckAttributesBasedOnValueRuleData.addMust(MetaDMSAG.__ruleName);
        __CheckAttributesBasedOnValueRuleData.addMust(MetaDMSAG.__ruleTitle);
        __CheckAttributesBasedOnValueRuleData.addMust(__basedOnAttribute);
        __CheckAttributesBasedOnValueRuleData.addMust(__basedOnValue);
        __CheckAttributesBasedOnValueRuleData.addMust(__excludeThisAttribute);
        __CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__description);
        __CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__applyToClass);

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:245)
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
        @SuppressWarnings("unused")
        AttributeTypeRule AttributeTypeRuleInstance = new AttributeTypeRule(new AttributeTypeRuleDataDMO());
        @SuppressWarnings("unused")
        RelatedNumbersRule RelatedNumbersRuleInstance = new RelatedNumbersRule(new RelatedNumbersRuleDataDMO());
        @SuppressWarnings("unused")
        CheckAttributesBasedOnValueRule CheckAttributesBasedOnValueRuleInstance = new CheckAttributesBasedOnValueRule(new CheckAttributesBasedOnValueRuleDataDMO());

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:258)
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

            AttributeTypeRuleDataDMO _dmvLhsData = new AttributeTypeRuleDataDMO();
            _dmvLhsData                  .addAllowedType("Integer");
            _dmvLhsData                  .addAllowedType("Float");
            _dmvLhsData                  .addAllowedType("Double");
            _dmvLhsData                  .setApplyToAttribute("lhs");
            _dmvLhsData                  .setApplyToClass("RelatedNumbersRule");
            _dmvLhsData                  .setDefinedIn("dmv");
            _dmvLhsData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvLhsData                  .setLineNumber("133");
            _dmvLhsData                  .setRuleName("dmvLhs");
            _dmvLhsData                  .setRuleTitle("The lhs attribute can be Integer, Float or Double");

            __dmvLhs = new AttributeTypeRule(_dmvLhsData);

            _RmAp.add(__dmvLhs);

            AttributeTypeRuleDataDMO _dmvRhsData = new AttributeTypeRuleDataDMO();
            _dmvRhsData                  .addAllowedType("Integer");
            _dmvRhsData                  .addAllowedType("Float");
            _dmvRhsData                  .addAllowedType("Double");
            _dmvRhsData                  .setApplyToAttribute("rhs");
            _dmvRhsData                  .setApplyToClass("RelatedNumbersRule");
            _dmvRhsData                  .setDefinedIn("dmv");
            _dmvRhsData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvRhsData                  .setLineNumber("142");
            _dmvRhsData                  .setRuleName("dmvRhs");
            _dmvRhsData                  .setRuleTitle("The rhs attribute can be Integer, Float or Double");

            __dmvRhs = new AttributeTypeRule(_dmvRhsData);

            _RmAp.add(__dmvRhs);

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

