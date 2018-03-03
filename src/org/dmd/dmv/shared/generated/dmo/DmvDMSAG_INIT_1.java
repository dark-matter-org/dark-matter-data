package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dms.generated.dmo.MetaDMSAG;               // For Meta references - (DmoCompactSchemaFormatter.java:552)
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;         // Optional attribute (1): nrrMinimum from DmvDMSAG - (DmoCompactSchemaFormatter.java:566)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DmvDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- AllowedAttributesRuleData
        DmvDMSAG.__AllowedAttributesRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__AllowedAttributesRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__AllowedAttributesRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__AllowedAttributesRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__AllowedAttributesRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__AllowedAttributesRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__AllowedAttributesRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__AllowedAttributesRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__AllowedAttributesRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__AllowedAttributesRuleData.addMay(MetaDMSAG.__msgParam);

    // 2 -- InitRuleData
        DmvDMSAG.__InitRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__InitRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__InitRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__InitRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__InitRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__InitRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__InitRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__InitRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__InitRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__InitRuleData.addMay(MetaDMSAG.__msgParam);

    // 3 -- NumericRangeRuleData
        DmvDMSAG.__NumericRangeRuleData.addMust(MetaDMSAG.__applyToAttribute);
        DmvDMSAG.__NumericRangeRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__NumericRangeRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__NumericRangeRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__NumericRangeRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__NumericRangeRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__NumericRangeRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__NumericRangeRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__NumericRangeRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__NumericRangeRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__NumericRangeRuleData.addMay(MetaDMSAG.__msgParam);
        DmvDMSAG.__NumericRangeRuleData.addMay(DmvDMSAG.__nrrMaximum);
        DmvDMSAG.__NumericRangeRuleData.addMay(DmvDMSAG.__nrrMinimum);

    // 4 -- UCOAllowedAttributesRuleData
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__UCOAllowedAttributesRuleData.addMay(MetaDMSAG.__msgParam);

    // 5 -- RelatedNumbersRuleData
        DmvDMSAG.__RelatedNumbersRuleData.addMust(DmvDMSAG.__lhs);
        DmvDMSAG.__RelatedNumbersRuleData.addMust(DmvDMSAG.__numericRelation);
        DmvDMSAG.__RelatedNumbersRuleData.addMust(DmvDMSAG.__rhs);
        DmvDMSAG.__RelatedNumbersRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__RelatedNumbersRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__RelatedNumbersRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__RelatedNumbersRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__RelatedNumbersRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__RelatedNumbersRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__RelatedNumbersRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__RelatedNumbersRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__RelatedNumbersRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__RelatedNumbersRuleData.addMay(MetaDMSAG.__msgParam);

    // 6 -- CheckAttributesBasedOnValueRuleData
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMust(DmvDMSAG.__basedOnAttribute);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMust(DmvDMSAG.__basedOnValue);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(DmvDMSAG.__excludeThisAttribute);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(DmvDMSAG.__includeThisAttribute);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__CheckAttributesBasedOnValueRuleData.addMay(MetaDMSAG.__msgParam);

    // 7 -- OneOfTheseAttributesRequiredRuleData
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMust(DmvDMSAG.__onePossibility);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(DmvDMSAG.__andOnlyOne);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__OneOfTheseAttributesRequiredRuleData.addMay(MetaDMSAG.__msgParam);

    // 8 -- PatternMatchRuleData
        DmvDMSAG.__PatternMatchRuleData.addMust(MetaDMSAG.__applyToAttribute);
        DmvDMSAG.__PatternMatchRuleData.addMust(DmvDMSAG.__matchesPattern);
        DmvDMSAG.__PatternMatchRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__PatternMatchRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__PatternMatchRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__PatternMatchRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__PatternMatchRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__PatternMatchRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__PatternMatchRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__PatternMatchRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__PatternMatchRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__PatternMatchRuleData.addMay(MetaDMSAG.__msgParam);

    // 9 -- ValueLengthRuleData
        DmvDMSAG.__ValueLengthRuleData.addMust(MetaDMSAG.__applyToAttribute);
        DmvDMSAG.__ValueLengthRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__ValueLengthRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__ValueLengthRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__ValueLengthRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__ValueLengthRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__ValueLengthRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__ValueLengthRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__ValueLengthRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__ValueLengthRuleData.addMay(DmvDMSAG.__maxLength);
        DmvDMSAG.__ValueLengthRuleData.addMay(DmvDMSAG.__minLength);
        DmvDMSAG.__ValueLengthRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__ValueLengthRuleData.addMay(MetaDMSAG.__msgParam);

    // 10 -- ReferencedAttributeTypeRuleData
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMust(MetaDMSAG.__applyToAttribute);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(DmvDMSAG.__allowedType);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(DmvDMSAG.__allowedValueType);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__ReferencedAttributeTypeRuleData.addMay(MetaDMSAG.__msgParam);

    // 11 -- OnlyOneOfTheseAttributesAllowedRuleData
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMust(DmvDMSAG.__onePossibility);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__OnlyOneOfTheseAttributesAllowedRuleData.addMay(MetaDMSAG.__msgParam);

    // 12 -- PartCheckerRuleData
        DmvDMSAG.__PartCheckerRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__PartCheckerRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__PartCheckerRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__PartCheckerRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__PartCheckerRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__PartCheckerRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__PartCheckerRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__PartCheckerRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__PartCheckerRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__PartCheckerRuleData.addMay(MetaDMSAG.__msgParam);

    // 13 -- NamedObjectRuleData
        DmvDMSAG.__NamedObjectRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__NamedObjectRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__NamedObjectRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__NamedObjectRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__NamedObjectRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__NamedObjectRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__NamedObjectRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__NamedObjectRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__NamedObjectRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__NamedObjectRuleData.addMay(MetaDMSAG.__msgParam);

    // 14 -- RestrictReferencesRuleData
        DmvDMSAG.__RestrictReferencesRuleData.addMust(DmvDMSAG.__allowedReference);
        DmvDMSAG.__RestrictReferencesRuleData.addMust(MetaDMSAG.__applyToAttribute);
        DmvDMSAG.__RestrictReferencesRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__RestrictReferencesRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__RestrictReferencesRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__RestrictReferencesRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__RestrictReferencesRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__RestrictReferencesRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__RestrictReferencesRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__RestrictReferencesRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__RestrictReferencesRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__RestrictReferencesRuleData.addMay(MetaDMSAG.__msgParam);

    // 15 -- CardinalityRuleData
        DmvDMSAG.__CardinalityRuleData.addMust(MetaDMSAG.__applyToAttribute);
        DmvDMSAG.__CardinalityRuleData.addMust(DmvDMSAG.__crMaximum);
        DmvDMSAG.__CardinalityRuleData.addMust(DmvDMSAG.__crMinimum);
        DmvDMSAG.__CardinalityRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__CardinalityRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__CardinalityRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__CardinalityRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__CardinalityRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__CardinalityRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__CardinalityRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__CardinalityRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__CardinalityRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__CardinalityRuleData.addMay(MetaDMSAG.__msgParam);

    // 16 -- StringSetRuleData
        DmvDMSAG.__StringSetRuleData.addMust(DmvDMSAG.__allowedString);
        DmvDMSAG.__StringSetRuleData.addMust(MetaDMSAG.__applyToAttribute);
        DmvDMSAG.__StringSetRuleData.addMust(MetaDMSAG.__ruleName);
        DmvDMSAG.__StringSetRuleData.addMust(MetaDMSAG.__ruleTitle);
        DmvDMSAG.__StringSetRuleData.addMay(MetaDMSAG.__applyToClass);
        DmvDMSAG.__StringSetRuleData.addMay(MetaDMSAG.__definedIn);
        DmvDMSAG.__StringSetRuleData.addMay(MetaDMSAG.__description);
        DmvDMSAG.__StringSetRuleData.addMay(MetaDMSAG.__file);
        DmvDMSAG.__StringSetRuleData.addMay(MetaDMSAG.__immediateHalt);
        DmvDMSAG.__StringSetRuleData.addMay(MetaDMSAG.__lineNumber);
        DmvDMSAG.__StringSetRuleData.addMay(MetaDMSAG.__msgKey);
        DmvDMSAG.__StringSetRuleData.addMay(MetaDMSAG.__msgParam);


    }

}

