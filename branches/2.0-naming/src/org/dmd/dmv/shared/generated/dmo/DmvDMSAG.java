package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1079)
import java.util.ArrayList;                                                              // For storage of schema info - (DmoCompactSchemaFormatter.java:1013)
import java.util.HashMap;                                                                // For storage of schema info - (DmoCompactSchemaFormatter.java:1012)
import java.util.Iterator;                                                               // For access of schema info - (DmoCompactSchemaFormatter.java:1014)
import org.dmd.dmc.*;                                                                    // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1015)
import org.dmd.dmc.rules.RuleIF;                                                         // For rule info - (DmoCompactSchemaFormatter.java:1016)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1032)
import org.dmd.dms.generated.enums.ClassTypeEnum;                                        // Have class definitions - (DmoCompactSchemaFormatter.java:1020)
import org.dmd.dms.generated.enums.DataTypeEnum;                                         // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1021)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                                     // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1026)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                        // Have attribute definitions - (DmoCompactSchemaFormatter.java:1047)
import org.dmd.dmv.shared.extended.rulesdmo.AllowedAttributesRule;                       // To support instantiations of AllowedAttributesRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.CheckAttributesBasedOnValueRule;             // To support instantiations of CheckAttributesBasedOnValueRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.InitRule;                                    // To support instantiations of InitRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.NumericRangeRule;                            // To support instantiations of NumericRangeRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.OneOfTheseAttributesRequiredRule;            // To support instantiations of OneOfTheseAttributesRequiredRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.OnlyOneOfTheseAttributesAllowedRule;         // To support instantiations of OnlyOneOfTheseAttributesAllowedRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.PatternMatchRule;                            // To support instantiations of PatternMatchRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.ReferencedAttributeTypeRule;                 // To support instantiations of ReferencedAttributeTypeRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.RelatedNumbersRule;                          // To support instantiations of RelatedNumbersRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.UCOAllowedAttributesRule;                    // To support instantiations of UCOAllowedAttributesRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.extended.rulesdmo.ValueLengthRule;                             // To support instantiations of ValueLengthRule - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;                    // To instantiate AllowedAttributesRuleData rule data - (DmoCompactSchemaFormatter.java:1072)
import org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO;          // To instantiate CheckAttributesBasedOnValueRuleData rule data - (DmoCompactSchemaFormatter.java:1072)
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;                         // To instantiate NumericRangeRuleData rule data - (DmoCompactSchemaFormatter.java:1072)
import org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO;         // To instantiate OneOfTheseAttributesRequiredRuleData rule data - (DmoCompactSchemaFormatter.java:1072)
import org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO;                         // To instantiate PatternMatchRuleData rule data - (DmoCompactSchemaFormatter.java:1072)
import org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO;              // To instantiate ReferencedAttributeTypeRuleData rule data - (DmoCompactSchemaFormatter.java:1072)
import org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO;                       // To instantiate RelatedNumbersRuleData rule data - (DmoCompactSchemaFormatter.java:1072)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:137)
public class DmvDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmv";


    static int schemaBaseID = -480000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -479950;

    public final static DmcAttributeInfo __allowedType = new DmcAttributeInfo("dmv", "allowedType", -479994, "TypeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __allowedValueType = new DmcAttributeInfo("dmv", "allowedValueType", -479984, "ValueTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __andOnlyOne = new DmcAttributeInfo("dmv", "andOnlyOne", -479988, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __basedOnAttribute = new DmcAttributeInfo("dmv", "basedOnAttribute", -479993, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __basedOnValue = new DmcAttributeInfo("dmv", "basedOnValue", -479992, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __excludeThisAttribute = new DmcAttributeInfo("dmv", "excludeThisAttribute", -479991, "AttributeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __includeThisAttribute = new DmcAttributeInfo("dmv", "includeThisAttribute", -479990, "AttributeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __lhs = new DmcAttributeInfo("dmv", "lhs", -479996, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __matchesPattern = new DmcAttributeInfo("dmv", "matchesPattern", -479987, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __maxLength = new DmcAttributeInfo("dmv", "maxLength", -479986, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __minLength = new DmcAttributeInfo("dmv", "minLength", -479985, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __nrrMaximum = new DmcAttributeInfo("dmv", "nrrMaximum", -479998, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __nrrMinimum = new DmcAttributeInfo("dmv", "nrrMinimum", -479999, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __numericRelation = new DmcAttributeInfo("dmv", "numericRelation", -479997, "NumericRelationEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __onePossibility = new DmcAttributeInfo("dmv", "onePossibility", -479989, "AttributeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __rhs = new DmcAttributeInfo("dmv", "rhs", -479995, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:183)
    public final static DmcTypeInfo __type_AllowedAttributesRuleData = new DmcTypeInfo("AllowedAttributesRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_CheckAttributesBasedOnValueRuleData = new DmcTypeInfo("CheckAttributesBasedOnValueRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_InitRuleData = new DmcTypeInfo("InitRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_NumericRangeRuleData = new DmcTypeInfo("NumericRangeRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_NumericRelationEnum = new DmcTypeInfo("NumericRelationEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_OneOfTheseAttributesRequiredRuleData = new DmcTypeInfo("OneOfTheseAttributesRequiredRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_OnlyOneOfTheseAttributesAllowedRuleData = new DmcTypeInfo("OnlyOneOfTheseAttributesAllowedRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_PatternMatchRuleData = new DmcTypeInfo("PatternMatchRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ReferencedAttributeTypeRuleData = new DmcTypeInfo("ReferencedAttributeTypeRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RelatedNumbersRuleData = new DmcTypeInfo("RelatedNumbersRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UCOAllowedAttributesRuleData = new DmcTypeInfo("UCOAllowedAttributesRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ValueLengthRuleData = new DmcTypeInfo("ValueLengthRuleData", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:224)
    public final static DmcClassInfo __AllowedAttributesRuleData = new DmcClassInfo("AllowedAttributesRuleData","org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO", -959999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __CheckAttributesBasedOnValueRuleData = new DmcClassInfo("CheckAttributesBasedOnValueRuleData","org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO", -959993, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __InitRuleData = new DmcClassInfo("InitRuleData","org.dmd.dmv.shared.generated.dmo.InitRuleDataDMO", -959998, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __NumericRangeRuleData = new DmcClassInfo("NumericRangeRuleData","org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO", -959997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __OneOfTheseAttributesRequiredRuleData = new DmcClassInfo("OneOfTheseAttributesRequiredRuleData","org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO", -959992, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __OnlyOneOfTheseAttributesAllowedRuleData = new DmcClassInfo("OnlyOneOfTheseAttributesAllowedRuleData","org.dmd.dmv.shared.generated.dmo.OnlyOneOfTheseAttributesAllowedRuleDataDMO", -959988, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __PatternMatchRuleData = new DmcClassInfo("PatternMatchRuleData","org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO", -959991, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __ReferencedAttributeTypeRuleData = new DmcClassInfo("ReferencedAttributeTypeRuleData","org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO", -959989, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __RelatedNumbersRuleData = new DmcClassInfo("RelatedNumbersRuleData","org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO", -959994, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __UCOAllowedAttributesRuleData = new DmcClassInfo("UCOAllowedAttributesRuleData","org.dmd.dmv.shared.generated.dmo.UCOAllowedAttributesRuleDataDMO", -959996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __ValueLengthRuleData = new DmcClassInfo("ValueLengthRuleData","org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO", -959990, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:253)
    public final static AllowedAttributesRule __dmvAllowedAttributes;
    public final static ReferencedAttributeTypeRule __dmvBasedOnAttribute;
    public final static OneOfTheseAttributesRequiredRule __dmvComplexTypeAttributeCheck;
    public final static ReferencedAttributeTypeRule __dmvDefinedInModuleAttribute;
    public final static PatternMatchRule __dmvDefinitionNameCheck;
    public final static PatternMatchRule __dmvEnumDefinitionNameCheck;
    public final static PatternMatchRule __dmvFileExtensionCheck;
    public final static OneOfTheseAttributesRequiredRule __dmvIncludeOrExclude;
    public final static ReferencedAttributeTypeRule __dmvLhs;
    public final static OneOfTheseAttributesRequiredRule __dmvMaxOrMin;
    public final static NumericRangeRule __dmvMaximumLength;
    public final static RelatedNumbersRule __dmvMinLessThanMax;
    public final static NumericRangeRule __dmvMinimumLength;
    public final static OneOfTheseAttributesRequiredRule __dmvMinimumOrMaximum;
    public final static ReferencedAttributeTypeRule __dmvModuleDependenceAttribute;
    public final static ReferencedAttributeTypeRule __dmvNRRApplyToAttribute;
    public final static CheckAttributesBasedOnValueRule __dmvNoMustInExtensible;
    public final static ReferencedAttributeTypeRule __dmvRATRApplyToAttribute;
    public final static ReferencedAttributeTypeRule __dmvRhs;
    public final static PatternMatchRule __dmvTagsCheck;
    public final static OneOfTheseAttributesRequiredRule __dmvValueorAttribute;

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

        DmvDMSAGAMAP.initSmAp(_SmAp);

        DmvDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:307)
    static {


        __AllowedAttributesRuleData.addMust(MetaDMSAG.__ruleName);
        __AllowedAttributesRuleData.addMust(MetaDMSAG.__ruleTitle);
        __AllowedAttributesRuleData.addMay(MetaDMSAG.__description);

        __InitRuleData.addMust(MetaDMSAG.__ruleName);
        __InitRuleData.addMust(MetaDMSAG.__ruleTitle);
        __InitRuleData.addMay(MetaDMSAG.__description);

        __NumericRangeRuleData.addMust(MetaDMSAG.__ruleName);
        __NumericRangeRuleData.addMust(MetaDMSAG.__ruleTitle);
        __NumericRangeRuleData.addMust(MetaDMSAG.__applyToAttribute);
        __NumericRangeRuleData.addMay(MetaDMSAG.__description);
        __NumericRangeRuleData.addMay(__nrrMinimum);
        __NumericRangeRuleData.addMay(__nrrMaximum);

        __UCOAllowedAttributesRuleData.addMust(MetaDMSAG.__ruleName);
        __UCOAllowedAttributesRuleData.addMust(MetaDMSAG.__ruleTitle);
        __UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__description);

        __RelatedNumbersRuleData.addMust(MetaDMSAG.__ruleName);
        __RelatedNumbersRuleData.addMust(MetaDMSAG.__ruleTitle);
        __RelatedNumbersRuleData.addMust(__lhs);
        __RelatedNumbersRuleData.addMust(__rhs);
        __RelatedNumbersRuleData.addMust(__numericRelation);
        __RelatedNumbersRuleData.addMay(MetaDMSAG.__description);

        __CheckAttributesBasedOnValueRuleData.addMust(MetaDMSAG.__ruleName);
        __CheckAttributesBasedOnValueRuleData.addMust(MetaDMSAG.__ruleTitle);
        __CheckAttributesBasedOnValueRuleData.addMust(__basedOnAttribute);
        __CheckAttributesBasedOnValueRuleData.addMust(__basedOnValue);
        __CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__description);
        __CheckAttributesBasedOnValueRuleData.addMay(__excludeThisAttribute);
        __CheckAttributesBasedOnValueRuleData.addMay(__includeThisAttribute);

        __OneOfTheseAttributesRequiredRuleData.addMust(MetaDMSAG.__ruleName);
        __OneOfTheseAttributesRequiredRuleData.addMust(MetaDMSAG.__ruleTitle);
        __OneOfTheseAttributesRequiredRuleData.addMust(__onePossibility);
        __OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__description);
        __OneOfTheseAttributesRequiredRuleData.addMay(__andOnlyOne);

        __PatternMatchRuleData.addMust(MetaDMSAG.__ruleName);
        __PatternMatchRuleData.addMust(MetaDMSAG.__ruleTitle);
        __PatternMatchRuleData.addMust(MetaDMSAG.__applyToAttribute);
        __PatternMatchRuleData.addMust(__matchesPattern);
        __PatternMatchRuleData.addMay(MetaDMSAG.__description);

        __ValueLengthRuleData.addMust(MetaDMSAG.__ruleName);
        __ValueLengthRuleData.addMust(MetaDMSAG.__ruleTitle);
        __ValueLengthRuleData.addMust(MetaDMSAG.__applyToAttribute);
        __ValueLengthRuleData.addMay(MetaDMSAG.__description);
        __ValueLengthRuleData.addMay(__maxLength);
        __ValueLengthRuleData.addMay(__minLength);

        __ReferencedAttributeTypeRuleData.addMust(MetaDMSAG.__ruleName);
        __ReferencedAttributeTypeRuleData.addMust(MetaDMSAG.__ruleTitle);
        __ReferencedAttributeTypeRuleData.addMust(MetaDMSAG.__applyToAttribute);
        __ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__description);
        __ReferencedAttributeTypeRuleData.addMay(__allowedType);
        __ReferencedAttributeTypeRuleData.addMay(__allowedValueType);

        __OnlyOneOfTheseAttributesAllowedRuleData.addMust(MetaDMSAG.__ruleName);
        __OnlyOneOfTheseAttributesAllowedRuleData.addMust(MetaDMSAG.__ruleTitle);
        __OnlyOneOfTheseAttributesAllowedRuleData.addMust(__onePossibility);
        __OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__description);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:351)
    static {

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:355)
        // These instantiations are merely meant to ensure that you've overloaded
        // the base rule implementations
        @SuppressWarnings("unused")
        AllowedAttributesRule AllowedAttributesRuleInstance = new AllowedAttributesRule(new AllowedAttributesRuleDataDMO());
        @SuppressWarnings("unused")
        InitRule InitRuleInstance = new InitRule(new InitRuleDataDMO());
        @SuppressWarnings("unused")
        NumericRangeRule NumericRangeRuleInstance = new NumericRangeRule(new NumericRangeRuleDataDMO());
        @SuppressWarnings("unused")
        UCOAllowedAttributesRule UCOAllowedAttributesRuleInstance = new UCOAllowedAttributesRule(new UCOAllowedAttributesRuleDataDMO());
        @SuppressWarnings("unused")
        RelatedNumbersRule RelatedNumbersRuleInstance = new RelatedNumbersRule(new RelatedNumbersRuleDataDMO());
        @SuppressWarnings("unused")
        CheckAttributesBasedOnValueRule CheckAttributesBasedOnValueRuleInstance = new CheckAttributesBasedOnValueRule(new CheckAttributesBasedOnValueRuleDataDMO());
        @SuppressWarnings("unused")
        OneOfTheseAttributesRequiredRule OneOfTheseAttributesRequiredRuleInstance = new OneOfTheseAttributesRequiredRule(new OneOfTheseAttributesRequiredRuleDataDMO());
        @SuppressWarnings("unused")
        PatternMatchRule PatternMatchRuleInstance = new PatternMatchRule(new PatternMatchRuleDataDMO());
        @SuppressWarnings("unused")
        ValueLengthRule ValueLengthRuleInstance = new ValueLengthRule(new ValueLengthRuleDataDMO());
        @SuppressWarnings("unused")
        ReferencedAttributeTypeRule ReferencedAttributeTypeRuleInstance = new ReferencedAttributeTypeRule(new ReferencedAttributeTypeRuleDataDMO());
        @SuppressWarnings("unused")
        OnlyOneOfTheseAttributesAllowedRule OnlyOneOfTheseAttributesAllowedRuleInstance = new OnlyOneOfTheseAttributesAllowedRule(new OnlyOneOfTheseAttributesAllowedRuleDataDMO());

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:370)
        try{
            AllowedAttributesRuleDataDMO _dmvAllowedAttributesData = new AllowedAttributesRuleDataDMO();
            _dmvAllowedAttributesData    .setRuleName("dmvAllowedAttributes");
            _dmvAllowedAttributesData    .setRuleTitle("An object's attributes must conform to its schema.");
            _dmvAllowedAttributesData    .addDescription("Ensures that must/may attribute rules are followed. For classes of\n type EXTENSIBLE, only the must have attributes are checked.");
            _dmvAllowedAttributesData    .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvAllowedAttributesData    .setDefinedIn("dmv");
            _dmvAllowedAttributesData    .setLineNumber("28");

            __dmvAllowedAttributes = new AllowedAttributesRule(_dmvAllowedAttributesData);

            _RmAp.add(__dmvAllowedAttributes);

            ReferencedAttributeTypeRuleDataDMO _dmvBasedOnAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvBasedOnAttributeData     .setRuleName("dmvBasedOnAttribute");
            _dmvBasedOnAttributeData     .setApplyToClass("CheckAttributesBasedOnValueRuleData");
            _dmvBasedOnAttributeData     .setRuleTitle("The basedOnAttribute attribute must refer to a single-valued attribute");
            _dmvBasedOnAttributeData     .setApplyToAttribute("basedOnAttribute");
            _dmvBasedOnAttributeData     .setAllowedValueType("SINGLE");
            _dmvBasedOnAttributeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvBasedOnAttributeData     .setDefinedIn("dmv");
            _dmvBasedOnAttributeData     .setLineNumber("464");

            __dmvBasedOnAttribute = new ReferencedAttributeTypeRule(_dmvBasedOnAttributeData);

            _RmAp.add(__dmvBasedOnAttribute);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvComplexTypeAttributeCheckData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvComplexTypeAttributeCheckData.setRuleName("dmvComplexTypeAttributeCheck");
            _dmvComplexTypeAttributeCheckData.setApplyToClass("ComplexTypeDefinition");
            _dmvComplexTypeAttributeCheckData.setRuleTitle("At least one of the field or requiredPart/optionalPart attributes must be specified.");
            _dmvComplexTypeAttributeCheckData.addOnePossibility("field");
            _dmvComplexTypeAttributeCheckData.addOnePossibility("requiredPart");
            _dmvComplexTypeAttributeCheckData.addOnePossibility("optionalPart");
            _dmvComplexTypeAttributeCheckData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvComplexTypeAttributeCheckData.setDefinedIn("dmv");
            _dmvComplexTypeAttributeCheckData.setLineNumber("323");

            __dmvComplexTypeAttributeCheck = new OneOfTheseAttributesRequiredRule(_dmvComplexTypeAttributeCheckData);

            _RmAp.add(__dmvComplexTypeAttributeCheck);

            ReferencedAttributeTypeRuleDataDMO _dmvDefinedInModuleAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvDefinedInModuleAttributeData.setRuleName("dmvDefinedInModuleAttribute");
            _dmvDefinedInModuleAttributeData.setApplyToClass("DSDefinitionModule");
            _dmvDefinedInModuleAttributeData.setRuleTitle("The attribute referred to by the definedInModuleAttribute attribute must be single-valued.");
            _dmvDefinedInModuleAttributeData.addDescription("We have sections of generated code that will access the module\n dependence attribute of a DDM module instance and being able to assume that the\n module dependence attribute is multi-valued just makes things easier.");
            _dmvDefinedInModuleAttributeData.setApplyToAttribute("definedInModuleAttribute");
            _dmvDefinedInModuleAttributeData.setAllowedValueType("SINGLE");
            _dmvDefinedInModuleAttributeData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvDefinedInModuleAttributeData.setDefinedIn("dmv");
            _dmvDefinedInModuleAttributeData.setLineNumber("509");

            __dmvDefinedInModuleAttribute = new ReferencedAttributeTypeRule(_dmvDefinedInModuleAttributeData);

            _RmAp.add(__dmvDefinedInModuleAttribute);

            PatternMatchRuleDataDMO _dmvDefinitionNameCheckData = new PatternMatchRuleDataDMO();
            _dmvDefinitionNameCheckData  .setRuleName("dmvDefinitionNameCheck");
            _dmvDefinitionNameCheckData  .setRuleTitle("The name attribute must start with a letter, followed by a mix of letters and numbers.");
            _dmvDefinitionNameCheckData  .addDescription("Although the name attribute is defined as type DotName, when\n the value is used as the value for the name attribute, it must not contain the \n dot character. This is because we allow for references to definitions to be\n either the flat name of the definition, or its fully qualified name that includes\n the definition set name, for example, meta.must - which indicates the must attribute\n from the meta schema.\n <p/>\n This allows for the convention of referring to definitions in the most general\n way possible without having to fully qualify every reference.");
            _dmvDefinitionNameCheckData  .setMatchesPattern("[a-zA-Z][a-zA-Z0-9_]*");
            _dmvDefinitionNameCheckData  .setApplyToAttribute("name");
            _dmvDefinitionNameCheckData  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvDefinitionNameCheckData  .setDefinedIn("dmv");
            _dmvDefinitionNameCheckData  .setLineNumber("254");

            __dmvDefinitionNameCheck = new PatternMatchRule(_dmvDefinitionNameCheckData);

            _RmAp.add(__dmvDefinitionNameCheck);

            PatternMatchRuleDataDMO _dmvEnumDefinitionNameCheckData = new PatternMatchRuleDataDMO();
            _dmvEnumDefinitionNameCheckData.setRuleName("dmvEnumDefinitionNameCheck");
            _dmvEnumDefinitionNameCheckData.setApplyToClass("EnumDefinition");
            _dmvEnumDefinitionNameCheckData.setRuleTitle("An EnumDefinition's name must end with Enum");
            _dmvEnumDefinitionNameCheckData.addDescription("This is really just a convention, but the generation of\n autogenerated static types depends on knowing if a type is an enum so that\n the enum can be imported in the static implementation. The dumpSTATICType()\n method in GenUtility checks to see if the type ends with Enum and adds\n the appropriate import if that's the case.");
            _dmvEnumDefinitionNameCheckData.setMatchesPattern("^.*Enum");
            _dmvEnumDefinitionNameCheckData.setApplyToAttribute("name");
            _dmvEnumDefinitionNameCheckData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvEnumDefinitionNameCheckData.setDefinedIn("dmv");
            _dmvEnumDefinitionNameCheckData.setLineNumber("239");

            __dmvEnumDefinitionNameCheck = new PatternMatchRule(_dmvEnumDefinitionNameCheckData);

            _RmAp.add(__dmvEnumDefinitionNameCheck);

            PatternMatchRuleDataDMO _dmvFileExtensionCheckData = new PatternMatchRuleDataDMO();
            _dmvFileExtensionCheckData   .setRuleName("dmvFileExtensionCheck");
            _dmvFileExtensionCheckData   .setRuleTitle("A file extension should be comprised of alpha-numeric characters.");
            _dmvFileExtensionCheckData   .addDescription("Didn't want to be too restrictive with this. Definitely didn't want special characters.");
            _dmvFileExtensionCheckData   .setMatchesPattern("[a-zA-Z][a-zA-Z0-9]*");
            _dmvFileExtensionCheckData   .setApplyToAttribute("fileExtension");
            _dmvFileExtensionCheckData   .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvFileExtensionCheckData   .setDefinedIn("dmv");
            _dmvFileExtensionCheckData   .setLineNumber("480");

            __dmvFileExtensionCheck = new PatternMatchRule(_dmvFileExtensionCheckData);

            _RmAp.add(__dmvFileExtensionCheck);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvIncludeOrExcludeData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvIncludeOrExcludeData     .setRuleName("dmvIncludeOrExclude");
            _dmvIncludeOrExcludeData     .setApplyToClass("CheckAttributesBasedOnValueRuleData");
            _dmvIncludeOrExcludeData     .setRuleTitle("At least one of the excludeThisAttribute or includeThisAttribute attributes must be specified.");
            _dmvIncludeOrExcludeData     .addOnePossibility("excludeThisAttribute");
            _dmvIncludeOrExcludeData     .addOnePossibility("includeThisAttribute");
            _dmvIncludeOrExcludeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvIncludeOrExcludeData     .setDefinedIn("dmv");
            _dmvIncludeOrExcludeData     .setLineNumber("206");

            __dmvIncludeOrExclude = new OneOfTheseAttributesRequiredRule(_dmvIncludeOrExcludeData);

            _RmAp.add(__dmvIncludeOrExclude);

            ReferencedAttributeTypeRuleDataDMO _dmvLhsData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvLhsData                  .setRuleName("dmvLhs");
            _dmvLhsData                  .setApplyToClass("RelatedNumbersRuleData");
            _dmvLhsData                  .setRuleTitle("The lhs attribute must be a single valued Integer, Long, Float or Double");
            _dmvLhsData                  .setApplyToAttribute("lhs");
            _dmvLhsData                  .setAllowedValueType("SINGLE");
            _dmvLhsData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvLhsData                  .setDefinedIn("dmv");
            _dmvLhsData                  .addAllowedType("Integer");
            _dmvLhsData                  .addAllowedType("Long");
            _dmvLhsData                  .addAllowedType("Float");
            _dmvLhsData                  .addAllowedType("Double");
            _dmvLhsData                  .setLineNumber("439");

            __dmvLhs = new ReferencedAttributeTypeRule(_dmvLhsData);

            _RmAp.add(__dmvLhs);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvMaxOrMinData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvMaxOrMinData             .setRuleName("dmvMaxOrMin");
            _dmvMaxOrMinData             .setApplyToClass("ValueLengthRuleData");
            _dmvMaxOrMinData             .setRuleTitle("At least one of the maxLength or minLength attributes must be specified.");
            _dmvMaxOrMinData             .addOnePossibility("maxLength");
            _dmvMaxOrMinData             .addOnePossibility("minLength");
            _dmvMaxOrMinData             .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMaxOrMinData             .setDefinedIn("dmv");
            _dmvMaxOrMinData             .setLineNumber("315");

            __dmvMaxOrMin = new OneOfTheseAttributesRequiredRule(_dmvMaxOrMinData);

            _RmAp.add(__dmvMaxOrMin);

            NumericRangeRuleDataDMO _dmvMaximumLengthData = new NumericRangeRuleDataDMO();
            _dmvMaximumLengthData        .setRuleName("dmvMaximumLength");
            _dmvMaximumLengthData        .setRuleTitle("The maxLength must be 1 or more");
            _dmvMaximumLengthData        .setApplyToAttribute("maxLength");
            _dmvMaximumLengthData        .setNrrMinimum("1.0");
            _dmvMaximumLengthData        .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMaximumLengthData        .setDefinedIn("dmv");
            _dmvMaximumLengthData        .setLineNumber("344");

            __dmvMaximumLength = new NumericRangeRule(_dmvMaximumLengthData);

            _RmAp.add(__dmvMaximumLength);

            RelatedNumbersRuleDataDMO _dmvMinLessThanMaxData = new RelatedNumbersRuleDataDMO();
            _dmvMinLessThanMaxData       .setRuleName("dmvMinLessThanMax");
            _dmvMinLessThanMaxData       .setApplyToClass("ValueLengthRuleData");
            _dmvMinLessThanMaxData       .setRuleTitle("The minLength must be less than the maxLength.");
            _dmvMinLessThanMaxData       .setNumericRelation("LT");
            _dmvMinLessThanMaxData       .setLhs("minLength");
            _dmvMinLessThanMaxData       .setRhs("maxLength");
            _dmvMinLessThanMaxData       .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinLessThanMaxData       .setDefinedIn("dmv");
            _dmvMinLessThanMaxData       .setLineNumber("331");

            __dmvMinLessThanMax = new RelatedNumbersRule(_dmvMinLessThanMaxData);

            _RmAp.add(__dmvMinLessThanMax);

            NumericRangeRuleDataDMO _dmvMinimumLengthData = new NumericRangeRuleDataDMO();
            _dmvMinimumLengthData        .setRuleName("dmvMinimumLength");
            _dmvMinimumLengthData        .setApplyToClass("ValueLengthRuleData");
            _dmvMinimumLengthData        .setRuleTitle("The minLength must be 1 or more");
            _dmvMinimumLengthData        .setApplyToAttribute("minLength");
            _dmvMinimumLengthData        .setNrrMinimum("1.0");
            _dmvMinimumLengthData        .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinimumLengthData        .setDefinedIn("dmv");
            _dmvMinimumLengthData        .setLineNumber("338");

            __dmvMinimumLength = new NumericRangeRule(_dmvMinimumLengthData);

            _RmAp.add(__dmvMinimumLength);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvMinimumOrMaximumData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvMinimumOrMaximumData     .setRuleName("dmvMinimumOrMaximum");
            _dmvMinimumOrMaximumData     .setApplyToClass("NumericRangeRuleData");
            _dmvMinimumOrMaximumData     .setRuleTitle("Either nrrMinimum or nrrMaximum must be specified.");
            _dmvMinimumOrMaximumData     .addOnePossibility("nrrMinimum");
            _dmvMinimumOrMaximumData     .addOnePossibility("nrrMaximum");
            _dmvMinimumOrMaximumData     .addDescription("The NumericRangeRule can operate with one or both of the minimum\n and maximum values.");
            _dmvMinimumOrMaximumData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinimumOrMaximumData     .setDefinedIn("dmv");
            _dmvMinimumOrMaximumData     .setLineNumber("473");

            __dmvMinimumOrMaximum = new OneOfTheseAttributesRequiredRule(_dmvMinimumOrMaximumData);

            _RmAp.add(__dmvMinimumOrMaximum);

            ReferencedAttributeTypeRuleDataDMO _dmvModuleDependenceAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvModuleDependenceAttributeData.setRuleName("dmvModuleDependenceAttribute");
            _dmvModuleDependenceAttributeData.setApplyToClass("DSDefinitionModule");
            _dmvModuleDependenceAttributeData.setRuleTitle("The attribute referred to by the moduleDependenceAttribute attribute must be multi-valued.");
            _dmvModuleDependenceAttributeData.addDescription("We have sections of generated code that will access the module\n dependence attribute of a DDM module instance and being able to assume that the\n module dependence attribute is multi-valued just makes things easier.");
            _dmvModuleDependenceAttributeData.setApplyToAttribute("moduleDependenceAttribute");
            _dmvModuleDependenceAttributeData.setAllowedValueType("MULTI");
            _dmvModuleDependenceAttributeData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvModuleDependenceAttributeData.setDefinedIn("dmv");
            _dmvModuleDependenceAttributeData.setLineNumber("500");

            __dmvModuleDependenceAttribute = new ReferencedAttributeTypeRule(_dmvModuleDependenceAttributeData);

            _RmAp.add(__dmvModuleDependenceAttribute);

            ReferencedAttributeTypeRuleDataDMO _dmvNRRApplyToAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvNRRApplyToAttributeData  .setRuleName("dmvNRRApplyToAttribute");
            _dmvNRRApplyToAttributeData  .setApplyToClass("NumericRangeRuleData");
            _dmvNRRApplyToAttributeData  .setRuleTitle("The applyToAttribute attribute in a NumericRangeRuleData instance must refer to an Integer, Long, Float or Double attribute");
            _dmvNRRApplyToAttributeData  .setApplyToAttribute("applyToAttribute");
            _dmvNRRApplyToAttributeData  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvNRRApplyToAttributeData  .setDefinedIn("dmv");
            _dmvNRRApplyToAttributeData  .addAllowedType("Integer");
            _dmvNRRApplyToAttributeData  .addAllowedType("Long");
            _dmvNRRApplyToAttributeData  .addAllowedType("Float");
            _dmvNRRApplyToAttributeData  .addAllowedType("Double");
            _dmvNRRApplyToAttributeData  .setLineNumber("428");

            __dmvNRRApplyToAttribute = new ReferencedAttributeTypeRule(_dmvNRRApplyToAttributeData);

            _RmAp.add(__dmvNRRApplyToAttribute);

            CheckAttributesBasedOnValueRuleDataDMO _dmvNoMustInExtensibleData = new CheckAttributesBasedOnValueRuleDataDMO();
            _dmvNoMustInExtensibleData   .addBasedOnValue("AUXILIARY");
            _dmvNoMustInExtensibleData   .setRuleName("dmvNoMustInExtensible");
            _dmvNoMustInExtensibleData   .addExcludeThisAttribute("must");
            _dmvNoMustInExtensibleData   .setApplyToClass("ClassDefinition");
            _dmvNoMustInExtensibleData   .setRuleTitle("If a ClassDefinition's classType is AUXILIARY, it can't have mandatory attributes");
            _dmvNoMustInExtensibleData   .addDescription("An AUXILIARY class can be added to an object dynamically and\n we don't allow mandatory attributes in such classes.");
            _dmvNoMustInExtensibleData   .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvNoMustInExtensibleData   .setDefinedIn("dmv");
            _dmvNoMustInExtensibleData   .setLineNumber("174");
            _dmvNoMustInExtensibleData   .setBasedOnAttribute("classType");

            __dmvNoMustInExtensible = new CheckAttributesBasedOnValueRule(_dmvNoMustInExtensibleData);

            _RmAp.add(__dmvNoMustInExtensible);

            ReferencedAttributeTypeRuleDataDMO _dmvRATRApplyToAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvRATRApplyToAttributeData .setRuleName("dmvRATRApplyToAttribute");
            _dmvRATRApplyToAttributeData .setApplyToClass("ReferencedAttributeTypeRuleData");
            _dmvRATRApplyToAttributeData .setRuleTitle("The applyToAttribute attribute in a ReferencedAttributeTypeRuleData must refer to a single valued AttributeDefinition");
            _dmvRATRApplyToAttributeData .addDescription("This might look a little funny, applying the rule to the applyToattribute, but\n if you think about it, it makes sense. You might think, hey, applyToAttribute is an AttributeDefinition\n so why validate that. However, it's not the applyToAttribute that we're validating, but the attribute\n that it refers to. It just happens that we're");
            _dmvRATRApplyToAttributeData .setApplyToAttribute("applyToAttribute");
            _dmvRATRApplyToAttributeData .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvRATRApplyToAttributeData .setDefinedIn("dmv");
            _dmvRATRApplyToAttributeData .addAllowedType("AttributeDefinition");
            _dmvRATRApplyToAttributeData .setLineNumber("418");

            __dmvRATRApplyToAttribute = new ReferencedAttributeTypeRule(_dmvRATRApplyToAttributeData);

            _RmAp.add(__dmvRATRApplyToAttribute);

            ReferencedAttributeTypeRuleDataDMO _dmvRhsData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvRhsData                  .setRuleName("dmvRhs");
            _dmvRhsData                  .setApplyToClass("RelatedNumbersRuleData");
            _dmvRhsData                  .setRuleTitle("The rhs attribute must be a single valued Integer, Long, Float or Double");
            _dmvRhsData                  .setApplyToAttribute("rhs");
            _dmvRhsData                  .setAllowedValueType("SINGLE");
            _dmvRhsData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvRhsData                  .setDefinedIn("dmv");
            _dmvRhsData                  .addAllowedType("Integer");
            _dmvRhsData                  .addAllowedType("Long");
            _dmvRhsData                  .addAllowedType("Float");
            _dmvRhsData                  .addAllowedType("Double");
            _dmvRhsData                  .setLineNumber("450");

            __dmvRhs = new ReferencedAttributeTypeRule(_dmvRhsData);

            _RmAp.add(__dmvRhs);

            PatternMatchRuleDataDMO _dmvTagsCheckData = new PatternMatchRuleDataDMO();
            _dmvTagsCheckData            .setRuleName("dmvTagsCheck");
            _dmvTagsCheckData            .setRuleTitle("The tags attribute must be a mix of letters, numbers and spaces.");
            _dmvTagsCheckData            .addDescription("Considered having tags with spaces, but it gets tricky when you \n want to represent things like San Franciso. So spaces are allowed in tags, but no\n other special characters.");
            _dmvTagsCheckData            .setMatchesPattern("[a-zA-Z0-9][a-zA-Z0-9 ]*");
            _dmvTagsCheckData            .setApplyToAttribute("tags");
            _dmvTagsCheckData            .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvTagsCheckData            .setDefinedIn("dmv");
            _dmvTagsCheckData            .setLineNumber("263");

            __dmvTagsCheck = new PatternMatchRule(_dmvTagsCheckData);

            _RmAp.add(__dmvTagsCheck);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvValueorAttributeData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvValueorAttributeData     .setRuleName("dmvValueorAttribute");
            _dmvValueorAttributeData     .setApplyToClass("ReferencedAttributeTypeRuleData");
            _dmvValueorAttributeData     .setRuleTitle("Either allowedType or allowedValueType must be specified");
            _dmvValueorAttributeData     .addOnePossibility("allowedType");
            _dmvValueorAttributeData     .addOnePossibility("allowedValueType");
            _dmvValueorAttributeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvValueorAttributeData     .setDefinedIn("dmv");
            _dmvValueorAttributeData     .setLineNumber("457");

            __dmvValueorAttribute = new OneOfTheseAttributesRequiredRule(_dmvValueorAttributeData);

            _RmAp.add(__dmvValueorAttribute);

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


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
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

