package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1237)
import java.util.ArrayList;                                                              // For storage of schema info - (DmoCompactSchemaFormatter.java:1152)
import java.util.HashMap;                                                                // For storage of schema info - (DmoCompactSchemaFormatter.java:1151)
import java.util.Iterator;                                                               // For access of schema info - (DmoCompactSchemaFormatter.java:1153)
import org.dmd.dmc.*;                                                                    // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1154)
import org.dmd.dmc.rules.RuleIF;                                                         // For rule info - (DmoCompactSchemaFormatter.java:1155)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Base class from MetaDMSAG - (DmoCompactSchemaFormatter.java:1190)
import org.dmd.dms.generated.enums.ClassTypeEnum;                                        // Have class definitions - (DmoCompactSchemaFormatter.java:1159)
import org.dmd.dms.generated.enums.DataTypeEnum;                                         // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1160)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                                     // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1165)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                        // Have attribute definitions - (DmoCompactSchemaFormatter.java:1205)
import org.dmd.dmv.shared.extended.rulesdmo.AllowedAttributesRule;                       // To support instantiations of AllowedAttributesRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.CardinalityRule;                             // To support instantiations of CardinalityRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.CheckAttributesBasedOnValueRule;             // To support instantiations of CheckAttributesBasedOnValueRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.InitRule;                                    // To support instantiations of InitRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.NamedObjectRule;                             // To support instantiations of NamedObjectRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.NumericRangeRule;                            // To support instantiations of NumericRangeRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.OneOfTheseAttributesRequiredRule;            // To support instantiations of OneOfTheseAttributesRequiredRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.OnlyOneOfTheseAttributesAllowedRule;         // To support instantiations of OnlyOneOfTheseAttributesAllowedRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.PartCheckerRule;                             // To support instantiations of PartCheckerRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.PatternMatchRule;                            // To support instantiations of PatternMatchRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.ReferencedAttributeTypeRule;                 // To support instantiations of ReferencedAttributeTypeRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.RelatedNumbersRule;                          // To support instantiations of RelatedNumbersRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.RestrictReferencesRule;                      // To support instantiations of RestrictReferencesRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.StringSetRule;                               // To support instantiations of StringSetRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.UCOAllowedAttributesRule;                    // To support instantiations of UCOAllowedAttributesRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.extended.rulesdmo.ValueLengthRule;                             // To support instantiations of ValueLengthRule - (DmoCompactSchemaFormatter.java:1214)
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;                    // To instantiate AllowedAttributesRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO;          // To instantiate CheckAttributesBasedOnValueRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.NamedObjectRuleDataDMO;                          // To instantiate NamedObjectRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;                         // To instantiate NumericRangeRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO;         // To instantiate OneOfTheseAttributesRequiredRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.PartCheckerRuleDataDMO;                          // To instantiate PartCheckerRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO;                         // To instantiate PatternMatchRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO;              // To instantiate ReferencedAttributeTypeRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO;                       // To instantiate RelatedNumbersRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO;                          // To instantiate ValueLengthRuleData rule data - (DmoCompactSchemaFormatter.java:1230)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DmvDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmv";


    static int schemaBaseID = -480000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -479950;

    public final static DmcAttributeInfo __allowedReference = new DmcAttributeInfo("dmv", "allowedReference", -479983, "ClassDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __allowedString = new DmcAttributeInfo("dmv", "allowedString", -479980, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __allowedType = new DmcAttributeInfo("dmv", "allowedType", -479994, "TypeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __allowedValueType = new DmcAttributeInfo("dmv", "allowedValueType", -479984, "ValueTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __andOnlyOne = new DmcAttributeInfo("dmv", "andOnlyOne", -479988, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __basedOnAttribute = new DmcAttributeInfo("dmv", "basedOnAttribute", -479993, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __basedOnValue = new DmcAttributeInfo("dmv", "basedOnValue", -479992, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __crMaximum = new DmcAttributeInfo("dmv", "crMaximum", -479981, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __crMinimum = new DmcAttributeInfo("dmv", "crMinimum", -479982, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_AllowedAttributesRuleData = new DmcTypeInfo("AllowedAttributesRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_CardinalityRuleData = new DmcTypeInfo("CardinalityRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_CheckAttributesBasedOnValueRuleData = new DmcTypeInfo("CheckAttributesBasedOnValueRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_InitRuleData = new DmcTypeInfo("InitRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_NamedObjectRuleData = new DmcTypeInfo("NamedObjectRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_NumericRangeRuleData = new DmcTypeInfo("NumericRangeRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_NumericRelationEnum = new DmcTypeInfo("NumericRelationEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_OneOfTheseAttributesRequiredRuleData = new DmcTypeInfo("OneOfTheseAttributesRequiredRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_OnlyOneOfTheseAttributesAllowedRuleData = new DmcTypeInfo("OnlyOneOfTheseAttributesAllowedRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_PartCheckerRuleData = new DmcTypeInfo("PartCheckerRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_PatternMatchRuleData = new DmcTypeInfo("PatternMatchRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ReferencedAttributeTypeRuleData = new DmcTypeInfo("ReferencedAttributeTypeRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RelatedNumbersRuleData = new DmcTypeInfo("RelatedNumbersRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RestrictReferencesRuleData = new DmcTypeInfo("RestrictReferencesRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_StringSetRuleData = new DmcTypeInfo("StringSetRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UCOAllowedAttributesRuleData = new DmcTypeInfo("UCOAllowedAttributesRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ValueLengthRuleData = new DmcTypeInfo("ValueLengthRuleData", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __AllowedAttributesRuleData = new DmcClassInfo("AllowedAttributesRuleData","org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO", -959999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __CardinalityRuleData = new DmcClassInfo("CardinalityRuleData","org.dmd.dmv.shared.generated.dmo.CardinalityRuleDataDMO", -959983, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __CheckAttributesBasedOnValueRuleData = new DmcClassInfo("CheckAttributesBasedOnValueRuleData","org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO", -959993, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __InitRuleData = new DmcClassInfo("InitRuleData","org.dmd.dmv.shared.generated.dmo.InitRuleDataDMO", -959998, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __NamedObjectRuleData = new DmcClassInfo("NamedObjectRuleData","org.dmd.dmv.shared.generated.dmo.NamedObjectRuleDataDMO", -959985, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __NumericRangeRuleData = new DmcClassInfo("NumericRangeRuleData","org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO", -959997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __OneOfTheseAttributesRequiredRuleData = new DmcClassInfo("OneOfTheseAttributesRequiredRuleData","org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO", -959992, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __OnlyOneOfTheseAttributesAllowedRuleData = new DmcClassInfo("OnlyOneOfTheseAttributesAllowedRuleData","org.dmd.dmv.shared.generated.dmo.OnlyOneOfTheseAttributesAllowedRuleDataDMO", -959988, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __PartCheckerRuleData = new DmcClassInfo("PartCheckerRuleData","org.dmd.dmv.shared.generated.dmo.PartCheckerRuleDataDMO", -959986, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __PatternMatchRuleData = new DmcClassInfo("PatternMatchRuleData","org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO", -959991, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __ReferencedAttributeTypeRuleData = new DmcClassInfo("ReferencedAttributeTypeRuleData","org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO", -959989, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __RelatedNumbersRuleData = new DmcClassInfo("RelatedNumbersRuleData","org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO", -959994, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __RestrictReferencesRuleData = new DmcClassInfo("RestrictReferencesRuleData","org.dmd.dmv.shared.generated.dmo.RestrictReferencesRuleDataDMO", -959984, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __StringSetRuleData = new DmcClassInfo("StringSetRuleData","org.dmd.dmv.shared.generated.dmo.StringSetRuleDataDMO", -959982, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __UCOAllowedAttributesRuleData = new DmcClassInfo("UCOAllowedAttributesRuleData","org.dmd.dmv.shared.generated.dmo.UCOAllowedAttributesRuleDataDMO", -959996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __ValueLengthRuleData = new DmcClassInfo("ValueLengthRuleData","org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO", -959990, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:261)
    public final static AllowedAttributesRule __dmvAllowedAttributes;
    public final static ReferencedAttributeTypeRule __dmvBasedOnAttribute;
    public final static OneOfTheseAttributesRequiredRule __dmvComplexTypeAttributeCheck;
    public final static ReferencedAttributeTypeRule __dmvDefinedInModuleAttribute;
    public final static PatternMatchRule __dmvDefinitionNameCheck;
    public final static PatternMatchRule __dmvEnumDefinitionNameCheck;
    public final static PatternMatchRule __dmvFileExtensionCheck;
    public final static ValueLengthRule __dmvHintLength;
    public final static OneOfTheseAttributesRequiredRule __dmvIncludeOrExclude;
    public final static ReferencedAttributeTypeRule __dmvLhs;
    public final static OneOfTheseAttributesRequiredRule __dmvMaxOrMin;
    public final static NumericRangeRule __dmvMaximumLength;
    public final static RelatedNumbersRule __dmvMinLessThanMax;
    public final static NumericRangeRule __dmvMinimumLength;
    public final static OneOfTheseAttributesRequiredRule __dmvMinimumOrMaximum;
    public final static ReferencedAttributeTypeRule __dmvModuleDependenceAttribute;
    public final static ReferencedAttributeTypeRule __dmvNRRApplyToAttribute;
    public final static NamedObjectRule __dmvNamedObject;
    public final static CheckAttributesBasedOnValueRule __dmvNoMustInExtensible;
    public final static PartCheckerRule __dmvPartChecker;
    public final static ReferencedAttributeTypeRule __dmvRATRApplyToAttribute;
    public final static ReferencedAttributeTypeRule __dmvRhs;
    public final static ReferencedAttributeTypeRule __dmvSSR;
    public final static PatternMatchRule __dmvTagsCheck;
    public final static OneOfTheseAttributesRequiredRule __dmvValueorAttribute;
    public final static ReferencedAttributeTypeRule __dmvcrAttributeMustBeMultivalued;
    public final static RelatedNumbersRule __dmvcrMinLessThanMax;
    public final static OneOfTheseAttributesRequiredRule __dmvcrMinimumOrMaximum;

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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DmvDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:376)
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
        @SuppressWarnings("unused")
        PartCheckerRule PartCheckerRuleInstance = new PartCheckerRule(new PartCheckerRuleDataDMO());
        @SuppressWarnings("unused")
        NamedObjectRule NamedObjectRuleInstance = new NamedObjectRule(new NamedObjectRuleDataDMO());
        @SuppressWarnings("unused")
        RestrictReferencesRule RestrictReferencesRuleInstance = new RestrictReferencesRule(new RestrictReferencesRuleDataDMO());
        @SuppressWarnings("unused")
        CardinalityRule CardinalityRuleInstance = new CardinalityRule(new CardinalityRuleDataDMO());
        @SuppressWarnings("unused")
        StringSetRule StringSetRuleInstance = new StringSetRule(new StringSetRuleDataDMO());

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:391)
        try{
            AllowedAttributesRuleDataDMO _dmvAllowedAttributesData = new AllowedAttributesRuleDataDMO();
            _dmvAllowedAttributesData    .addDescription("Ensures that must/may attribute rules are followed. For classes of\n type EXTENSIBLE, only the must have attributes are checked.");
            _dmvAllowedAttributesData    .setRuleName("dmvAllowedAttributes");
            _dmvAllowedAttributesData    .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvAllowedAttributesData    .setRuleTitle("An object's attributes must conform to its schema.");
            _dmvAllowedAttributesData    .setLineNumber("23");
            _dmvAllowedAttributesData    .setDefinedIn("dmv");

            __dmvAllowedAttributes = new AllowedAttributesRule(_dmvAllowedAttributesData);

            _RmAp.add(__dmvAllowedAttributes);

            ReferencedAttributeTypeRuleDataDMO _dmvBasedOnAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvBasedOnAttributeData     .setAllowedValueType("SINGLE");
            _dmvBasedOnAttributeData     .setRuleName("dmvBasedOnAttribute");
            _dmvBasedOnAttributeData     .setApplyToClass("CheckAttributesBasedOnValueRuleData");
            _dmvBasedOnAttributeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvBasedOnAttributeData     .setRuleTitle("The basedOnAttribute attribute must refer to a single-valued attribute");
            _dmvBasedOnAttributeData     .setLineNumber("593");
            _dmvBasedOnAttributeData     .setApplyToAttribute("basedOnAttribute");
            _dmvBasedOnAttributeData     .setDefinedIn("dmv");

            __dmvBasedOnAttribute = new ReferencedAttributeTypeRule(_dmvBasedOnAttributeData);

            _RmAp.add(__dmvBasedOnAttribute);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvComplexTypeAttributeCheckData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvComplexTypeAttributeCheckData.addOnePossibility("field");
            _dmvComplexTypeAttributeCheckData.addOnePossibility("requiredPart");
            _dmvComplexTypeAttributeCheckData.addOnePossibility("optionalPart");
            _dmvComplexTypeAttributeCheckData.setRuleName("dmvComplexTypeAttributeCheck");
            _dmvComplexTypeAttributeCheckData.setApplyToClass("ComplexTypeDefinition");
            _dmvComplexTypeAttributeCheckData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvComplexTypeAttributeCheckData.setRuleTitle("At least one of the field or requiredPart/optionalPart attributes must be specified.");
            _dmvComplexTypeAttributeCheckData.setLineNumber("317");
            _dmvComplexTypeAttributeCheckData.setDefinedIn("dmv");

            __dmvComplexTypeAttributeCheck = new OneOfTheseAttributesRequiredRule(_dmvComplexTypeAttributeCheckData);

            _RmAp.add(__dmvComplexTypeAttributeCheck);

            ReferencedAttributeTypeRuleDataDMO _dmvDefinedInModuleAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvDefinedInModuleAttributeData.addDescription("We have sections of generated code that will access the module\n dependence attribute of a DDM module instance and being able to assume that the\n module dependence attribute is multi-valued just makes things easier.");
            _dmvDefinedInModuleAttributeData.setAllowedValueType("SINGLE");
            _dmvDefinedInModuleAttributeData.setRuleName("dmvDefinedInModuleAttribute");
            _dmvDefinedInModuleAttributeData.setApplyToClass("DSDefinitionModule");
            _dmvDefinedInModuleAttributeData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvDefinedInModuleAttributeData.setRuleTitle("The attribute referred to by the definedInModuleAttribute attribute must be single-valued.");
            _dmvDefinedInModuleAttributeData.setLineNumber("636");
            _dmvDefinedInModuleAttributeData.setApplyToAttribute("definedInModuleAttribute");
            _dmvDefinedInModuleAttributeData.setDefinedIn("dmv");

            __dmvDefinedInModuleAttribute = new ReferencedAttributeTypeRule(_dmvDefinedInModuleAttributeData);

            _RmAp.add(__dmvDefinedInModuleAttribute);

            PatternMatchRuleDataDMO _dmvDefinitionNameCheckData = new PatternMatchRuleDataDMO();
            _dmvDefinitionNameCheckData  .addDescription("Although the name attribute is defined as type DotName, when\n the value is used as the value for the name attribute, it must not contain the \n dot character. This is because we allow for references to definitions to be\n either the flat name of the definition, or its fully qualified name that includes\n the definition set name, for example, meta.must - which indicates the must attribute\n from the meta schema.\n <p>\n This allows for the convention of referring to definitions in the most general\n way possible without having to fully qualify every reference.");
            _dmvDefinitionNameCheckData  .setMatchesPattern("[a-zA-Z][a-zA-Z0-9_]*");
            _dmvDefinitionNameCheckData  .setRuleName("dmvDefinitionNameCheck");
            _dmvDefinitionNameCheckData  .setApplyToClass("DmsDefinition");
            _dmvDefinitionNameCheckData  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvDefinitionNameCheckData  .setRuleTitle("The name attribute must start with a letter, followed by a mix of letters and numbers.");
            _dmvDefinitionNameCheckData  .setLineNumber("240");
            _dmvDefinitionNameCheckData  .setApplyToAttribute("name");
            _dmvDefinitionNameCheckData  .setDefinedIn("dmv");

            __dmvDefinitionNameCheck = new PatternMatchRule(_dmvDefinitionNameCheckData);

            _RmAp.add(__dmvDefinitionNameCheck);

            PatternMatchRuleDataDMO _dmvEnumDefinitionNameCheckData = new PatternMatchRuleDataDMO();
            _dmvEnumDefinitionNameCheckData.addDescription("This is really just a convention, but the generation of\n autogenerated static types depends on knowing if a type is an enum so that\n the enum can be imported in the static implementation. The dumpSTATICType()\n method in GenUtility checks to see if the type ends with Enum and adds\n the appropriate import if that's the case.");
            _dmvEnumDefinitionNameCheckData.setMatchesPattern("^.*Enum");
            _dmvEnumDefinitionNameCheckData.setRuleName("dmvEnumDefinitionNameCheck");
            _dmvEnumDefinitionNameCheckData.setApplyToClass("EnumDefinition");
            _dmvEnumDefinitionNameCheckData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvEnumDefinitionNameCheckData.setRuleTitle("An EnumDefinition's name must end with Enum");
            _dmvEnumDefinitionNameCheckData.setLineNumber("228");
            _dmvEnumDefinitionNameCheckData.setApplyToAttribute("name");
            _dmvEnumDefinitionNameCheckData.setDefinedIn("dmv");

            __dmvEnumDefinitionNameCheck = new PatternMatchRule(_dmvEnumDefinitionNameCheckData);

            _RmAp.add(__dmvEnumDefinitionNameCheck);

            PatternMatchRuleDataDMO _dmvFileExtensionCheckData = new PatternMatchRuleDataDMO();
            _dmvFileExtensionCheckData   .addDescription("Didn't want to be too restrictive with this. Definitely didn't want special characters.");
            _dmvFileExtensionCheckData   .setMatchesPattern("[a-zA-Z][a-zA-Z0-9]*");
            _dmvFileExtensionCheckData   .setRuleName("dmvFileExtensionCheck");
            _dmvFileExtensionCheckData   .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvFileExtensionCheckData   .setRuleTitle("A file extension should be comprised of alpha-numeric characters.");
            _dmvFileExtensionCheckData   .setLineNumber("609");
            _dmvFileExtensionCheckData   .setApplyToAttribute("fileExtension");
            _dmvFileExtensionCheckData   .setDefinedIn("dmv");

            __dmvFileExtensionCheck = new PatternMatchRule(_dmvFileExtensionCheckData);

            _RmAp.add(__dmvFileExtensionCheck);

            ValueLengthRuleDataDMO _dmvHintLengthData = new ValueLengthRuleDataDMO();
            _dmvHintLengthData           .setMaxLength("80");
            _dmvHintLengthData           .setRuleName("dmvHintLength");
            _dmvHintLengthData           .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvHintLengthData           .setRuleTitle("The hint for something should be at most 80 characters.");
            _dmvHintLengthData           .setLineNumber("646");
            _dmvHintLengthData           .setApplyToAttribute("hint");
            _dmvHintLengthData           .setDefinedIn("dmv");

            __dmvHintLength = new ValueLengthRule(_dmvHintLengthData);

            _RmAp.add(__dmvHintLength);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvIncludeOrExcludeData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvIncludeOrExcludeData     .addOnePossibility("excludeThisAttribute");
            _dmvIncludeOrExcludeData     .addOnePossibility("includeThisAttribute");
            _dmvIncludeOrExcludeData     .setRuleName("dmvIncludeOrExclude");
            _dmvIncludeOrExcludeData     .setApplyToClass("CheckAttributesBasedOnValueRuleData");
            _dmvIncludeOrExcludeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvIncludeOrExcludeData     .setRuleTitle("At least one of the excludeThisAttribute or includeThisAttribute attributes must be specified.");
            _dmvIncludeOrExcludeData     .setLineNumber("200");
            _dmvIncludeOrExcludeData     .setDefinedIn("dmv");

            __dmvIncludeOrExclude = new OneOfTheseAttributesRequiredRule(_dmvIncludeOrExcludeData);

            _RmAp.add(__dmvIncludeOrExclude);

            ReferencedAttributeTypeRuleDataDMO _dmvLhsData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvLhsData                  .setAllowedValueType("SINGLE");
            _dmvLhsData                  .setRuleName("dmvLhs");
            _dmvLhsData                  .setApplyToClass("RelatedNumbersRuleData");
            _dmvLhsData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvLhsData                  .setRuleTitle("The lhs attribute must be a single valued Integer, Long, Float or Double");
            _dmvLhsData                  .setLineNumber("564");
            _dmvLhsData                  .setApplyToAttribute("lhs");
            _dmvLhsData                  .setDefinedIn("dmv");
            _dmvLhsData                  .addAllowedType("Integer");
            _dmvLhsData                  .addAllowedType("Long");
            _dmvLhsData                  .addAllowedType("Float");
            _dmvLhsData                  .addAllowedType("Double");

            __dmvLhs = new ReferencedAttributeTypeRule(_dmvLhsData);

            _RmAp.add(__dmvLhs);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvMaxOrMinData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvMaxOrMinData             .addOnePossibility("maxLength");
            _dmvMaxOrMinData             .addOnePossibility("minLength");
            _dmvMaxOrMinData             .setRuleName("dmvMaxOrMin");
            _dmvMaxOrMinData             .setApplyToClass("ValueLengthRuleData");
            _dmvMaxOrMinData             .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMaxOrMinData             .setRuleTitle("At least one of the maxLength or minLength attributes must be specified.");
            _dmvMaxOrMinData             .setLineNumber("310");
            _dmvMaxOrMinData             .setDefinedIn("dmv");

            __dmvMaxOrMin = new OneOfTheseAttributesRequiredRule(_dmvMaxOrMinData);

            _RmAp.add(__dmvMaxOrMin);

            NumericRangeRuleDataDMO _dmvMaximumLengthData = new NumericRangeRuleDataDMO();
            _dmvMaximumLengthData        .setNrrMinimum("1.0");
            _dmvMaximumLengthData        .setRuleName("dmvMaximumLength");
            _dmvMaximumLengthData        .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMaximumLengthData        .setRuleTitle("The maxLength must be 1 or more");
            _dmvMaximumLengthData        .setLineNumber("340");
            _dmvMaximumLengthData        .setApplyToAttribute("maxLength");
            _dmvMaximumLengthData        .setDefinedIn("dmv");

            __dmvMaximumLength = new NumericRangeRule(_dmvMaximumLengthData);

            _RmAp.add(__dmvMaximumLength);

            RelatedNumbersRuleDataDMO _dmvMinLessThanMaxData = new RelatedNumbersRuleDataDMO();
            _dmvMinLessThanMaxData       .setRuleName("dmvMinLessThanMax");
            _dmvMinLessThanMaxData       .setApplyToClass("ValueLengthRuleData");
            _dmvMinLessThanMaxData       .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinLessThanMaxData       .setRuleTitle("The minLength must be less than the maxLength.");
            _dmvMinLessThanMaxData       .setLineNumber("325");
            _dmvMinLessThanMaxData       .setNumericRelation("LT");
            _dmvMinLessThanMaxData       .setLhs("minLength");
            _dmvMinLessThanMaxData       .setDefinedIn("dmv");
            _dmvMinLessThanMaxData       .setRhs("maxLength");

            __dmvMinLessThanMax = new RelatedNumbersRule(_dmvMinLessThanMaxData);

            _RmAp.add(__dmvMinLessThanMax);

            NumericRangeRuleDataDMO _dmvMinimumLengthData = new NumericRangeRuleDataDMO();
            _dmvMinimumLengthData        .setNrrMinimum("1.0");
            _dmvMinimumLengthData        .setRuleName("dmvMinimumLength");
            _dmvMinimumLengthData        .setApplyToClass("ValueLengthRuleData");
            _dmvMinimumLengthData        .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinimumLengthData        .setRuleTitle("The minLength must be 1 or more");
            _dmvMinimumLengthData        .setLineNumber("333");
            _dmvMinimumLengthData        .setApplyToAttribute("minLength");
            _dmvMinimumLengthData        .setDefinedIn("dmv");

            __dmvMinimumLength = new NumericRangeRule(_dmvMinimumLengthData);

            _RmAp.add(__dmvMinimumLength);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvMinimumOrMaximumData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvMinimumOrMaximumData     .addDescription("The NumericRangeRule can operate with one or both of the minimum\n and maximum values.");
            _dmvMinimumOrMaximumData     .addOnePossibility("nrrMinimum");
            _dmvMinimumOrMaximumData     .addOnePossibility("nrrMaximum");
            _dmvMinimumOrMaximumData     .setRuleName("dmvMinimumOrMaximum");
            _dmvMinimumOrMaximumData     .setApplyToClass("NumericRangeRuleData");
            _dmvMinimumOrMaximumData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinimumOrMaximumData     .setRuleTitle("Either nrrMinimum or nrrMaximum must be specified.");
            _dmvMinimumOrMaximumData     .setLineNumber("600");
            _dmvMinimumOrMaximumData     .setDefinedIn("dmv");

            __dmvMinimumOrMaximum = new OneOfTheseAttributesRequiredRule(_dmvMinimumOrMaximumData);

            _RmAp.add(__dmvMinimumOrMaximum);

            ReferencedAttributeTypeRuleDataDMO _dmvModuleDependenceAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvModuleDependenceAttributeData.addDescription("We have sections of generated code that will access the module\n dependence attribute of a DDM module instance and being able to assume that the\n module dependence attribute is multi-valued just makes things easier.");
            _dmvModuleDependenceAttributeData.setAllowedValueType("MULTI");
            _dmvModuleDependenceAttributeData.setRuleName("dmvModuleDependenceAttribute");
            _dmvModuleDependenceAttributeData.setApplyToClass("DSDefinitionModule");
            _dmvModuleDependenceAttributeData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvModuleDependenceAttributeData.setRuleTitle("The attribute referred to by the moduleDependenceAttribute attribute must be multi-valued.");
            _dmvModuleDependenceAttributeData.setLineNumber("626");
            _dmvModuleDependenceAttributeData.setApplyToAttribute("moduleDependenceAttribute");
            _dmvModuleDependenceAttributeData.setDefinedIn("dmv");

            __dmvModuleDependenceAttribute = new ReferencedAttributeTypeRule(_dmvModuleDependenceAttributeData);

            _RmAp.add(__dmvModuleDependenceAttribute);

            ReferencedAttributeTypeRuleDataDMO _dmvNRRApplyToAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvNRRApplyToAttributeData  .setRuleName("dmvNRRApplyToAttribute");
            _dmvNRRApplyToAttributeData  .setApplyToClass("NumericRangeRuleData");
            _dmvNRRApplyToAttributeData  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvNRRApplyToAttributeData  .setRuleTitle("The applyToAttribute attribute in a NumericRangeRuleData instance must refer to an Integer, Long, Float or Double attribute");
            _dmvNRRApplyToAttributeData  .setLineNumber("554");
            _dmvNRRApplyToAttributeData  .setApplyToAttribute("applyToAttribute");
            _dmvNRRApplyToAttributeData  .setDefinedIn("dmv");
            _dmvNRRApplyToAttributeData  .addAllowedType("Integer");
            _dmvNRRApplyToAttributeData  .addAllowedType("Long");
            _dmvNRRApplyToAttributeData  .addAllowedType("Float");
            _dmvNRRApplyToAttributeData  .addAllowedType("Double");

            __dmvNRRApplyToAttribute = new ReferencedAttributeTypeRule(_dmvNRRApplyToAttributeData);

            _RmAp.add(__dmvNRRApplyToAttribute);

            NamedObjectRuleDataDMO _dmvNamedObjectData = new NamedObjectRuleDataDMO();
            _dmvNamedObjectData          .addDescription("If you're naming an object, you've got to have its name attribute.");
            _dmvNamedObjectData          .setRuleName("dmvNamedObject");
            _dmvNamedObjectData          .setApplyToClass("ClassDefinition");
            _dmvNamedObjectData          .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvNamedObjectData          .setRuleTitle("The naming attribute must be a must have attribute.");
            _dmvNamedObjectData          .setLineNumber("436");
            _dmvNamedObjectData          .setDefinedIn("dmv");

            __dmvNamedObject = new NamedObjectRule(_dmvNamedObjectData);

            _RmAp.add(__dmvNamedObject);

            CheckAttributesBasedOnValueRuleDataDMO _dmvNoMustInExtensibleData = new CheckAttributesBasedOnValueRuleDataDMO();
            _dmvNoMustInExtensibleData   .addBasedOnValue("AUXILIARY");
            _dmvNoMustInExtensibleData   .addExcludeThisAttribute("must");
            _dmvNoMustInExtensibleData   .addDescription("An AUXILIARY class can be added to an object dynamically and\n we don't allow mandatory attributes in such classes.");
            _dmvNoMustInExtensibleData   .setRuleName("dmvNoMustInExtensible");
            _dmvNoMustInExtensibleData   .setApplyToClass("ClassDefinition");
            _dmvNoMustInExtensibleData   .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvNoMustInExtensibleData   .setRuleTitle("If a ClassDefinition's classType is AUXILIARY, it can't have mandatory attributes");
            _dmvNoMustInExtensibleData   .setLineNumber("165");
            _dmvNoMustInExtensibleData   .setDefinedIn("dmv");
            _dmvNoMustInExtensibleData   .setBasedOnAttribute("classType");

            __dmvNoMustInExtensible = new CheckAttributesBasedOnValueRule(_dmvNoMustInExtensibleData);

            _RmAp.add(__dmvNoMustInExtensible);

            PartCheckerRuleDataDMO _dmvPartCheckerData = new PartCheckerRuleDataDMO();
            _dmvPartCheckerData          .addDescription("There are no parameters. The logic is completely internal to the rule.");
            _dmvPartCheckerData          .setRuleName("dmvPartChecker");
            _dmvPartCheckerData          .setApplyToClass("ComplexTypeDefinition");
            _dmvPartCheckerData          .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvPartCheckerData          .setRuleTitle("The greedy flag is only allowed on the final requiredPart of a ComplexTypeDefinition composed of requiredParts.");
            _dmvPartCheckerData          .setLineNumber("421");
            _dmvPartCheckerData          .setDefinedIn("dmv");

            __dmvPartChecker = new PartCheckerRule(_dmvPartCheckerData);

            _RmAp.add(__dmvPartChecker);

            ReferencedAttributeTypeRuleDataDMO _dmvRATRApplyToAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvRATRApplyToAttributeData .addDescription("This might look a little funny, applying the rule to the applyToattribute, but\n if you think about it, it makes sense. You might think, hey, applyToAttribute is an AttributeDefinition\n so why validate that. However, it's not the applyToAttribute that we're validating, but the attribute\n that it refers to. It just happens that we're");
            _dmvRATRApplyToAttributeData .setRuleName("dmvRATRApplyToAttribute");
            _dmvRATRApplyToAttributeData .setApplyToClass("ReferencedAttributeTypeRuleData");
            _dmvRATRApplyToAttributeData .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvRATRApplyToAttributeData .setRuleTitle("The applyToAttribute attribute in a ReferencedAttributeTypeRuleData must refer to a single valued AttributeDefinition");
            _dmvRATRApplyToAttributeData .setLineNumber("543");
            _dmvRATRApplyToAttributeData .setApplyToAttribute("applyToAttribute");
            _dmvRATRApplyToAttributeData .setDefinedIn("dmv");
            _dmvRATRApplyToAttributeData .addAllowedType("AttributeDefinition");

            __dmvRATRApplyToAttribute = new ReferencedAttributeTypeRule(_dmvRATRApplyToAttributeData);

            _RmAp.add(__dmvRATRApplyToAttribute);

            ReferencedAttributeTypeRuleDataDMO _dmvRhsData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvRhsData                  .setAllowedValueType("SINGLE");
            _dmvRhsData                  .setRuleName("dmvRhs");
            _dmvRhsData                  .setApplyToClass("RelatedNumbersRuleData");
            _dmvRhsData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvRhsData                  .setRuleTitle("The rhs attribute must be a single valued Integer, Long, Float or Double");
            _dmvRhsData                  .setLineNumber("575");
            _dmvRhsData                  .setApplyToAttribute("rhs");
            _dmvRhsData                  .setDefinedIn("dmv");
            _dmvRhsData                  .addAllowedType("Integer");
            _dmvRhsData                  .addAllowedType("Long");
            _dmvRhsData                  .addAllowedType("Float");
            _dmvRhsData                  .addAllowedType("Double");

            __dmvRhs = new ReferencedAttributeTypeRule(_dmvRhsData);

            _RmAp.add(__dmvRhs);

            ReferencedAttributeTypeRuleDataDMO _dmvSSRData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvSSRData                  .setRuleName("dmvSSR");
            _dmvSSRData                  .setApplyToClass("StringSetRuleData");
            _dmvSSRData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvSSRData                  .setRuleTitle("The applyToAttribute attribute in a StringSetRule instance must refer to a String attribute");
            _dmvSSRData                  .setLineNumber("668");
            _dmvSSRData                  .setApplyToAttribute("applyToAttribute");
            _dmvSSRData                  .setDefinedIn("dmv");
            _dmvSSRData                  .addAllowedType("String");

            __dmvSSR = new ReferencedAttributeTypeRule(_dmvSSRData);

            _RmAp.add(__dmvSSR);

            PatternMatchRuleDataDMO _dmvTagsCheckData = new PatternMatchRuleDataDMO();
            _dmvTagsCheckData            .addDescription("Considered having tags without spaces, but it gets tricky when you \n want to represent things like San Franciso. So spaces are allowed in tags, but no\n other special characters.");
            _dmvTagsCheckData            .setMatchesPattern("[a-zA-Z0-9][a-zA-Z0-9 ]*");
            _dmvTagsCheckData            .setRuleName("dmvTagsCheck");
            _dmvTagsCheckData            .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvTagsCheckData            .setRuleTitle("The tags attribute must be a mix of letters, numbers and spaces.");
            _dmvTagsCheckData            .setLineNumber("256");
            _dmvTagsCheckData            .setApplyToAttribute("tags");
            _dmvTagsCheckData            .setDefinedIn("dmv");

            __dmvTagsCheck = new PatternMatchRule(_dmvTagsCheckData);

            _RmAp.add(__dmvTagsCheck);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvValueorAttributeData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvValueorAttributeData     .addOnePossibility("allowedType");
            _dmvValueorAttributeData     .addOnePossibility("allowedValueType");
            _dmvValueorAttributeData     .setRuleName("dmvValueorAttribute");
            _dmvValueorAttributeData     .setApplyToClass("ReferencedAttributeTypeRuleData");
            _dmvValueorAttributeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvValueorAttributeData     .setRuleTitle("Either allowedType or allowedValueType must be specified");
            _dmvValueorAttributeData     .setLineNumber("586");
            _dmvValueorAttributeData     .setDefinedIn("dmv");

            __dmvValueorAttribute = new OneOfTheseAttributesRequiredRule(_dmvValueorAttributeData);

            _RmAp.add(__dmvValueorAttribute);

            ReferencedAttributeTypeRuleDataDMO _dmvcrAttributeMustBeMultivaluedData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvcrAttributeMustBeMultivaluedData.addDescription("It only makes sense to apply the CardinalityRule to multi-valued attributes.");
            _dmvcrAttributeMustBeMultivaluedData.setAllowedValueType("MULTI");
            _dmvcrAttributeMustBeMultivaluedData.setRuleName("dmvcrAttributeMustBeMultivalued");
            _dmvcrAttributeMustBeMultivaluedData.setApplyToClass("CardinalityRuleData");
            _dmvcrAttributeMustBeMultivaluedData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvcrAttributeMustBeMultivaluedData.setRuleTitle("The attribute referred to by a CardinalityRule must be multi-valued.");
            _dmvcrAttributeMustBeMultivaluedData.setLineNumber("521");
            _dmvcrAttributeMustBeMultivaluedData.setApplyToAttribute("applyToAttribute");
            _dmvcrAttributeMustBeMultivaluedData.setDefinedIn("dmv");

            __dmvcrAttributeMustBeMultivalued = new ReferencedAttributeTypeRule(_dmvcrAttributeMustBeMultivaluedData);

            _RmAp.add(__dmvcrAttributeMustBeMultivalued);

            RelatedNumbersRuleDataDMO _dmvcrMinLessThanMaxData = new RelatedNumbersRuleDataDMO();
            _dmvcrMinLessThanMaxData     .addDescription("Checks that the lower bound specified on the cardinality is less than or equal the maximum cardinality.");
            _dmvcrMinLessThanMaxData     .setRuleName("dmvcrMinLessThanMax");
            _dmvcrMinLessThanMaxData     .setApplyToClass("CardinalityRuleData");
            _dmvcrMinLessThanMaxData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvcrMinLessThanMaxData     .setRuleTitle("The crMinimum must be less than or equal to the crMaximum.");
            _dmvcrMinLessThanMaxData     .setLineNumber("512");
            _dmvcrMinLessThanMaxData     .setNumericRelation("LTE");
            _dmvcrMinLessThanMaxData     .setLhs("crMinimum");
            _dmvcrMinLessThanMaxData     .setDefinedIn("dmv");
            _dmvcrMinLessThanMaxData     .setRhs("crMaximum");

            __dmvcrMinLessThanMax = new RelatedNumbersRule(_dmvcrMinLessThanMaxData);

            _RmAp.add(__dmvcrMinLessThanMax);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvcrMinimumOrMaximumData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvcrMinimumOrMaximumData   .addDescription("The CardinalityRuleData can operate with one or both of the crMinimum and crMaximum values.");
            _dmvcrMinimumOrMaximumData   .addOnePossibility("crMinimum");
            _dmvcrMinimumOrMaximumData   .addOnePossibility("crMaximum");
            _dmvcrMinimumOrMaximumData   .setRuleName("dmvcrMinimumOrMaximum");
            _dmvcrMinimumOrMaximumData   .setApplyToClass("CardinalityRuleData");
            _dmvcrMinimumOrMaximumData   .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvcrMinimumOrMaximumData   .setRuleTitle("Either crMinimum or crMaximum or both must be specified.");
            _dmvcrMinimumOrMaximumData   .setLineNumber("533");
            _dmvcrMinimumOrMaximumData   .setDefinedIn("dmv");

            __dmvcrMinimumOrMaximum = new OneOfTheseAttributesRequiredRule(_dmvcrMinimumOrMaximumData);

            _RmAp.add(__dmvcrMinimumOrMaximum);

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

