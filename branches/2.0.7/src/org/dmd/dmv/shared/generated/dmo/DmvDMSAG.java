package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:969)
import java.util.ArrayList;                                                              // For storage of schema info - (DmoCompactSchemaFormatter.java:903)
import java.util.HashMap;                                                                // For storage of schema info - (DmoCompactSchemaFormatter.java:902)
import java.util.Iterator;                                                               // For access of schema info - (DmoCompactSchemaFormatter.java:904)
import org.dmd.dmc.*;                                                                    // Basic DMC stuff - (DmoCompactSchemaFormatter.java:905)
import org.dmd.dmc.rules.RuleIF;                                                         // For rule info - (DmoCompactSchemaFormatter.java:906)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:922)
import org.dmd.dms.generated.enums.ClassTypeEnum;                                        // Have class definitions - (DmoCompactSchemaFormatter.java:910)
import org.dmd.dms.generated.enums.DataTypeEnum;                                         // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:911)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                                     // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:916)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                        // Have attribute definitions - (DmoCompactSchemaFormatter.java:937)
import org.dmd.dmv.shared.extended.rulesdmo.AllowedAttributesRule;                       // To support instantiations of AllowedAttributesRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.CheckAttributesBasedOnValueRule;             // To support instantiations of CheckAttributesBasedOnValueRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.InitRule;                                    // To support instantiations of InitRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.NumericRangeRule;                            // To support instantiations of NumericRangeRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.OneOfTheseAttributesRequiredRule;            // To support instantiations of OneOfTheseAttributesRequiredRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.PatternMatchRule;                            // To support instantiations of PatternMatchRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.ReferencedAttributeTypeRule;                 // To support instantiations of ReferencedAttributeTypeRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.RelatedNumbersRule;                          // To support instantiations of RelatedNumbersRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.UCOAllowedAttributesRule;                    // To support instantiations of UCOAllowedAttributesRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.extended.rulesdmo.ValueLengthRule;                             // To support instantiations of ValueLengthRule - (DmoCompactSchemaFormatter.java:946)
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;                    // To instantiate AllowedAttributesRuleData rule data - (DmoCompactSchemaFormatter.java:962)
import org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO;          // To instantiate CheckAttributesBasedOnValueRuleData rule data - (DmoCompactSchemaFormatter.java:962)
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;                         // To instantiate NumericRangeRuleData rule data - (DmoCompactSchemaFormatter.java:962)
import org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO;         // To instantiate OneOfTheseAttributesRequiredRuleData rule data - (DmoCompactSchemaFormatter.java:962)
import org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO;                         // To instantiate PatternMatchRuleData rule data - (DmoCompactSchemaFormatter.java:962)
import org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO;              // To instantiate ReferencedAttributeTypeRuleData rule data - (DmoCompactSchemaFormatter.java:962)
import org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO;                       // To instantiate RelatedNumbersRuleData rule data - (DmoCompactSchemaFormatter.java:962)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:129)
public class DmvDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmv";


    static int schemaBaseID = -480000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -479950;

    public final static DmcAttributeInfo __allowedType = new DmcAttributeInfo("allowedType", -479994, "TypeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __allowedValueType = new DmcAttributeInfo("allowedValueType", -479984, "ValueTypeEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __andOnlyOne = new DmcAttributeInfo("andOnlyOne", -479988, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __basedOnAttribute = new DmcAttributeInfo("basedOnAttribute", -479993, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __basedOnValue = new DmcAttributeInfo("basedOnValue", -479992, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __excludeThisAttribute = new DmcAttributeInfo("excludeThisAttribute", -479991, "AttributeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __includeThisAttribute = new DmcAttributeInfo("includeThisAttribute", -479990, "AttributeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __lhs = new DmcAttributeInfo("lhs", -479996, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __matchesPattern = new DmcAttributeInfo("matchesPattern", -479987, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __maxLength = new DmcAttributeInfo("maxLength", -479986, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __minLength = new DmcAttributeInfo("minLength", -479985, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nrrMaximum = new DmcAttributeInfo("nrrMaximum", -479998, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nrrMinimum = new DmcAttributeInfo("nrrMinimum", -479999, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __numericRelation = new DmcAttributeInfo("numericRelation", -479997, "NumericRelationEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __onePossibility = new DmcAttributeInfo("onePossibility", -479989, "AttributeDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __rhs = new DmcAttributeInfo("rhs", -479995, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:167)
    public final static DmcTypeInfo __type_AllowedAttributesRuleData = new DmcTypeInfo("AllowedAttributesRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_CheckAttributesBasedOnValueRuleData = new DmcTypeInfo("CheckAttributesBasedOnValueRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_InitRuleData = new DmcTypeInfo("InitRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_NumericRangeRuleData = new DmcTypeInfo("NumericRangeRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_NumericRelationEnum = new DmcTypeInfo("NumericRelationEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_OneOfTheseAttributesRequiredRuleData = new DmcTypeInfo("OneOfTheseAttributesRequiredRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_PatternMatchRuleData = new DmcTypeInfo("PatternMatchRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ReferencedAttributeTypeRuleData = new DmcTypeInfo("ReferencedAttributeTypeRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RelatedNumbersRuleData = new DmcTypeInfo("RelatedNumbersRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UCOAllowedAttributesRuleData = new DmcTypeInfo("UCOAllowedAttributesRuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ValueLengthRuleData = new DmcTypeInfo("ValueLengthRuleData", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:208)
    public final static DmcClassInfo __AllowedAttributesRuleData = new DmcClassInfo("AllowedAttributesRuleData","org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO", -959999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __CheckAttributesBasedOnValueRuleData = new DmcClassInfo("CheckAttributesBasedOnValueRuleData","org.dmd.dmv.shared.generated.dmo.CheckAttributesBasedOnValueRuleDataDMO", -959993, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __InitRuleData = new DmcClassInfo("InitRuleData","org.dmd.dmv.shared.generated.dmo.InitRuleDataDMO", -959998, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __NumericRangeRuleData = new DmcClassInfo("NumericRangeRuleData","org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO", -959997, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __OneOfTheseAttributesRequiredRuleData = new DmcClassInfo("OneOfTheseAttributesRequiredRuleData","org.dmd.dmv.shared.generated.dmo.OneOfTheseAttributesRequiredRuleDataDMO", -959992, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __PatternMatchRuleData = new DmcClassInfo("PatternMatchRuleData","org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO", -959991, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __ReferencedAttributeTypeRuleData = new DmcClassInfo("ReferencedAttributeTypeRuleData","org.dmd.dmv.shared.generated.dmo.ReferencedAttributeTypeRuleDataDMO", -959989, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __RelatedNumbersRuleData = new DmcClassInfo("RelatedNumbersRuleData","org.dmd.dmv.shared.generated.dmo.RelatedNumbersRuleDataDMO", -959994, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __UCOAllowedAttributesRuleData = new DmcClassInfo("UCOAllowedAttributesRuleData","org.dmd.dmv.shared.generated.dmo.UCOAllowedAttributesRuleDataDMO", -959996, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);
    public final static DmcClassInfo __ValueLengthRuleData = new DmcClassInfo("ValueLengthRuleData","org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO", -959990, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,MetaDMSAG.__ruleName);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:237)
    public final static AllowedAttributesRule __dmvAllowedAttributes;
    public final static ReferencedAttributeTypeRule __dmvBasedOnAttribute;
    public final static PatternMatchRule __dmvEnumDefinitionNameCheck;
    public final static OneOfTheseAttributesRequiredRule __dmvIncludeOrExclude;
    public final static ReferencedAttributeTypeRule __dmvLhs;
    public final static OneOfTheseAttributesRequiredRule __dmvMaxOrMin;
    public final static NumericRangeRule __dmvMaximumLength;
    public final static RelatedNumbersRule __dmvMinLessThanMax;
    public final static NumericRangeRule __dmvMinimumLength;
    public final static OneOfTheseAttributesRequiredRule __dmvMinimumOrMaximum;
    public final static ReferencedAttributeTypeRule __dmvNRRApplyToAttribute;
    public final static CheckAttributesBasedOnValueRule __dmvNoMustInExtensible;
    public final static ReferencedAttributeTypeRule __dmvRATRApplyToAttribute;
    public final static ReferencedAttributeTypeRule __dmvRhs;
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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:291)
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

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:335)
    static {

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:339)
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

        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:352)
        try{
            AllowedAttributesRuleDataDMO _dmvAllowedAttributesData = new AllowedAttributesRuleDataDMO();
            _dmvAllowedAttributesData    .setDefinedIn("dmv");
            _dmvAllowedAttributesData    .setDescription("Ensures that must/may attribute rules are followed. For classes of\n type EXTENSIBLE, only the must have attributes are checked.");
            _dmvAllowedAttributesData    .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvAllowedAttributesData    .setLineNumber("28");
            _dmvAllowedAttributesData    .setRuleName("dmvAllowedAttributes");
            _dmvAllowedAttributesData    .setRuleTitle("An object's attributes must conform to its schema.");

            __dmvAllowedAttributes = new AllowedAttributesRule(_dmvAllowedAttributesData);

            _RmAp.add(__dmvAllowedAttributes);

            ReferencedAttributeTypeRuleDataDMO _dmvBasedOnAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvBasedOnAttributeData     .setAllowedValueType("SINGLE");
            _dmvBasedOnAttributeData     .setApplyToAttribute("basedOnAttribute");
            _dmvBasedOnAttributeData     .setApplyToClass("CheckAttributesBasedOnValueRuleData");
            _dmvBasedOnAttributeData     .setDefinedIn("dmv");
            _dmvBasedOnAttributeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvBasedOnAttributeData     .setLineNumber("407");
            _dmvBasedOnAttributeData     .setRuleName("dmvBasedOnAttribute");
            _dmvBasedOnAttributeData     .setRuleTitle("The basedOnAttribute attribute must refer to a single-valued attribute");

            __dmvBasedOnAttribute = new ReferencedAttributeTypeRule(_dmvBasedOnAttributeData);

            _RmAp.add(__dmvBasedOnAttribute);

            PatternMatchRuleDataDMO _dmvEnumDefinitionNameCheckData = new PatternMatchRuleDataDMO();
            _dmvEnumDefinitionNameCheckData.setApplyToAttribute("name");
            _dmvEnumDefinitionNameCheckData.setApplyToClass("EnumDefinition");
            _dmvEnumDefinitionNameCheckData.setDefinedIn("dmv");
            _dmvEnumDefinitionNameCheckData.setDescription("This is really just a convention, but the generation of\n autogenerated static types depends on knowing if a type is an enum so that\n the enum can be imported in the static implementation. The dumpSTATICType()\n method in GenUtility checks to see if the type ends with Enum and adds\n the appropriate import if that's the case.");
            _dmvEnumDefinitionNameCheckData.setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvEnumDefinitionNameCheckData.setLineNumber("239");
            _dmvEnumDefinitionNameCheckData.setMatchesPattern("^.*Enum");
            _dmvEnumDefinitionNameCheckData.setRuleName("dmvEnumDefinitionNameCheck");
            _dmvEnumDefinitionNameCheckData.setRuleTitle("An EnumDefinition's name must end with Enum");

            __dmvEnumDefinitionNameCheck = new PatternMatchRule(_dmvEnumDefinitionNameCheckData);

            _RmAp.add(__dmvEnumDefinitionNameCheck);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvIncludeOrExcludeData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvIncludeOrExcludeData     .setApplyToClass("CheckAttributesBasedOnValueRuleData");
            _dmvIncludeOrExcludeData     .setDefinedIn("dmv");
            _dmvIncludeOrExcludeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvIncludeOrExcludeData     .setLineNumber("206");
            _dmvIncludeOrExcludeData     .addOnePossibility("excludeThisAttribute");
            _dmvIncludeOrExcludeData     .addOnePossibility("includeThisAttribute");
            _dmvIncludeOrExcludeData     .setRuleName("dmvIncludeOrExclude");
            _dmvIncludeOrExcludeData     .setRuleTitle("At least one of the excludeThisAttribute or includeThisAttribute attributes must be specified.");

            __dmvIncludeOrExclude = new OneOfTheseAttributesRequiredRule(_dmvIncludeOrExcludeData);

            _RmAp.add(__dmvIncludeOrExclude);

            ReferencedAttributeTypeRuleDataDMO _dmvLhsData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvLhsData                  .addAllowedType("Integer");
            _dmvLhsData                  .addAllowedType("Long");
            _dmvLhsData                  .addAllowedType("Float");
            _dmvLhsData                  .addAllowedType("Double");
            _dmvLhsData                  .setAllowedValueType("SINGLE");
            _dmvLhsData                  .setApplyToAttribute("lhs");
            _dmvLhsData                  .setApplyToClass("RelatedNumbersRuleData");
            _dmvLhsData                  .setDefinedIn("dmv");
            _dmvLhsData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvLhsData                  .setLineNumber("382");
            _dmvLhsData                  .setRuleName("dmvLhs");
            _dmvLhsData                  .setRuleTitle("The lhs attribute must be a single valued Integer, Long, Float or Double");

            __dmvLhs = new ReferencedAttributeTypeRule(_dmvLhsData);

            _RmAp.add(__dmvLhs);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvMaxOrMinData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvMaxOrMinData             .setApplyToClass("ValueLengthRuleData");
            _dmvMaxOrMinData             .setDefinedIn("dmv");
            _dmvMaxOrMinData             .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMaxOrMinData             .setLineNumber("291");
            _dmvMaxOrMinData             .addOnePossibility("maxLength");
            _dmvMaxOrMinData             .addOnePossibility("minLength");
            _dmvMaxOrMinData             .setRuleName("dmvMaxOrMin");
            _dmvMaxOrMinData             .setRuleTitle("At least one of the maxLength or minLength attributes must be specified.");

            __dmvMaxOrMin = new OneOfTheseAttributesRequiredRule(_dmvMaxOrMinData);

            _RmAp.add(__dmvMaxOrMin);

            NumericRangeRuleDataDMO _dmvMaximumLengthData = new NumericRangeRuleDataDMO();
            _dmvMaximumLengthData        .setApplyToAttribute("maxLength");
            _dmvMaximumLengthData        .setDefinedIn("dmv");
            _dmvMaximumLengthData        .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMaximumLengthData        .setLineNumber("312");
            _dmvMaximumLengthData        .setNrrMinimum("1");
            _dmvMaximumLengthData        .setRuleName("dmvMaximumLength");
            _dmvMaximumLengthData        .setRuleTitle("The maxLength must be 1 or more");

            __dmvMaximumLength = new NumericRangeRule(_dmvMaximumLengthData);

            _RmAp.add(__dmvMaximumLength);

            RelatedNumbersRuleDataDMO _dmvMinLessThanMaxData = new RelatedNumbersRuleDataDMO();
            _dmvMinLessThanMaxData       .setApplyToClass("ValueLengthRuleData");
            _dmvMinLessThanMaxData       .setDefinedIn("dmv");
            _dmvMinLessThanMaxData       .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinLessThanMaxData       .setLhs("minLength");
            _dmvMinLessThanMaxData       .setLineNumber("299");
            _dmvMinLessThanMaxData       .setNumericRelation("LT");
            _dmvMinLessThanMaxData       .setRhs("maxLength");
            _dmvMinLessThanMaxData       .setRuleName("dmvMinLessThanMax");
            _dmvMinLessThanMaxData       .setRuleTitle("The minLength must be less than the maxLength.");

            __dmvMinLessThanMax = new RelatedNumbersRule(_dmvMinLessThanMaxData);

            _RmAp.add(__dmvMinLessThanMax);

            NumericRangeRuleDataDMO _dmvMinimumLengthData = new NumericRangeRuleDataDMO();
            _dmvMinimumLengthData        .setApplyToAttribute("minLength");
            _dmvMinimumLengthData        .setApplyToClass("ValueLengthRuleData");
            _dmvMinimumLengthData        .setDefinedIn("dmv");
            _dmvMinimumLengthData        .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinimumLengthData        .setLineNumber("306");
            _dmvMinimumLengthData        .setNrrMinimum("1");
            _dmvMinimumLengthData        .setRuleName("dmvMinimumLength");
            _dmvMinimumLengthData        .setRuleTitle("The minLength must be 1 or more");

            __dmvMinimumLength = new NumericRangeRule(_dmvMinimumLengthData);

            _RmAp.add(__dmvMinimumLength);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvMinimumOrMaximumData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvMinimumOrMaximumData     .setApplyToClass("NumericRangeRuleData");
            _dmvMinimumOrMaximumData     .setDefinedIn("dmv");
            _dmvMinimumOrMaximumData     .setDescription("The NumericRangeRule can operate with one or both of the minimum\n and maximum values.");
            _dmvMinimumOrMaximumData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvMinimumOrMaximumData     .setLineNumber("416");
            _dmvMinimumOrMaximumData     .addOnePossibility("nrrMinimum");
            _dmvMinimumOrMaximumData     .addOnePossibility("nrrMaximum");
            _dmvMinimumOrMaximumData     .setRuleName("dmvMinimumOrMaximum");
            _dmvMinimumOrMaximumData     .setRuleTitle("Either nrrMinimum or nrrMaximum must be specified.");

            __dmvMinimumOrMaximum = new OneOfTheseAttributesRequiredRule(_dmvMinimumOrMaximumData);

            _RmAp.add(__dmvMinimumOrMaximum);

            ReferencedAttributeTypeRuleDataDMO _dmvNRRApplyToAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvNRRApplyToAttributeData  .addAllowedType("Integer");
            _dmvNRRApplyToAttributeData  .addAllowedType("Long");
            _dmvNRRApplyToAttributeData  .addAllowedType("Float");
            _dmvNRRApplyToAttributeData  .addAllowedType("Double");
            _dmvNRRApplyToAttributeData  .setApplyToAttribute("applyToAttribute");
            _dmvNRRApplyToAttributeData  .setApplyToClass("NumericRangeRuleData");
            _dmvNRRApplyToAttributeData  .setDefinedIn("dmv");
            _dmvNRRApplyToAttributeData  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvNRRApplyToAttributeData  .setLineNumber("371");
            _dmvNRRApplyToAttributeData  .setRuleName("dmvNRRApplyToAttribute");
            _dmvNRRApplyToAttributeData  .setRuleTitle("The applyToAttribute attribute in a NumericRangeRuleData instance must refer to an Integer, Long, Float or Double attribute");

            __dmvNRRApplyToAttribute = new ReferencedAttributeTypeRule(_dmvNRRApplyToAttributeData);

            _RmAp.add(__dmvNRRApplyToAttribute);

            CheckAttributesBasedOnValueRuleDataDMO _dmvNoMustInExtensibleData = new CheckAttributesBasedOnValueRuleDataDMO();
            _dmvNoMustInExtensibleData   .setApplyToClass("ClassDefinition");
            _dmvNoMustInExtensibleData   .setBasedOnAttribute("classType");
            _dmvNoMustInExtensibleData   .addBasedOnValue("AUXILIARY");
            _dmvNoMustInExtensibleData   .setDefinedIn("dmv");
            _dmvNoMustInExtensibleData   .setDescription("An AUXILIARY class can be added to an object dynamically and\n we don't allow mandatory attributes in such classes.");
            _dmvNoMustInExtensibleData   .addExcludeThisAttribute("must");
            _dmvNoMustInExtensibleData   .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvNoMustInExtensibleData   .setLineNumber("174");
            _dmvNoMustInExtensibleData   .setRuleName("dmvNoMustInExtensible");
            _dmvNoMustInExtensibleData   .setRuleTitle("If a ClassDefinition's classType is AUXILIARY, it can't have mandatory attributes");

            __dmvNoMustInExtensible = new CheckAttributesBasedOnValueRule(_dmvNoMustInExtensibleData);

            _RmAp.add(__dmvNoMustInExtensible);

            ReferencedAttributeTypeRuleDataDMO _dmvRATRApplyToAttributeData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvRATRApplyToAttributeData .addAllowedType("AttributeDefinition");
            _dmvRATRApplyToAttributeData .setApplyToAttribute("applyToAttribute");
            _dmvRATRApplyToAttributeData .setApplyToClass("ReferencedAttributeTypeRuleData");
            _dmvRATRApplyToAttributeData .setDefinedIn("dmv");
            _dmvRATRApplyToAttributeData .setDescription("This might look a little funny, applying the rule to the applyToattribute, but\n if you think about it, it makes sense. You might think, hey, applyToToAttribute is an AttributeDefinition\n so why validate that. However, it's not the applyToAttribute that we're validating, but the attribute\n that it refers to. It just happens that we're");
            _dmvRATRApplyToAttributeData .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvRATRApplyToAttributeData .setLineNumber("361");
            _dmvRATRApplyToAttributeData .setRuleName("dmvRATRApplyToAttribute");
            _dmvRATRApplyToAttributeData .setRuleTitle("The applyToAttribute attribute in a ReferencedAttributeTypeRuleData must refer to a single valued AttributeDefinition");

            __dmvRATRApplyToAttribute = new ReferencedAttributeTypeRule(_dmvRATRApplyToAttributeData);

            _RmAp.add(__dmvRATRApplyToAttribute);

            ReferencedAttributeTypeRuleDataDMO _dmvRhsData = new ReferencedAttributeTypeRuleDataDMO();
            _dmvRhsData                  .addAllowedType("Integer");
            _dmvRhsData                  .addAllowedType("Long");
            _dmvRhsData                  .addAllowedType("Float");
            _dmvRhsData                  .addAllowedType("Double");
            _dmvRhsData                  .setAllowedValueType("SINGLE");
            _dmvRhsData                  .setApplyToAttribute("rhs");
            _dmvRhsData                  .setApplyToClass("RelatedNumbersRuleData");
            _dmvRhsData                  .setDefinedIn("dmv");
            _dmvRhsData                  .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvRhsData                  .setLineNumber("393");
            _dmvRhsData                  .setRuleName("dmvRhs");
            _dmvRhsData                  .setRuleTitle("The rhs attribute must be a single valued Integer, Long, Float or Double");

            __dmvRhs = new ReferencedAttributeTypeRule(_dmvRhsData);

            _RmAp.add(__dmvRhs);

            OneOfTheseAttributesRequiredRuleDataDMO _dmvValueorAttributeData = new OneOfTheseAttributesRequiredRuleDataDMO();
            _dmvValueorAttributeData     .setApplyToClass("ReferencedAttributeTypeRuleData");
            _dmvValueorAttributeData     .setDefinedIn("dmv");
            _dmvValueorAttributeData     .setFile("/src/org/dmd/dmv/shared/dmdconfig/v0dot1/rules.dmd");
            _dmvValueorAttributeData     .setLineNumber("400");
            _dmvValueorAttributeData     .addOnePossibility("allowedType");
            _dmvValueorAttributeData     .addOnePossibility("allowedValueType");
            _dmvValueorAttributeData     .setRuleName("dmvValueorAttribute");
            _dmvValueorAttributeData     .setRuleTitle("Either allowedType or allowedValueType must be specified");

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
