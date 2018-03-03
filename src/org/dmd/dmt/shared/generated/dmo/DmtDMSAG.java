package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1219)
import java.util.ArrayList;                                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:1145)
import java.util.HashMap;                                                      // For storage of schema info - (DmoCompactSchemaFormatter.java:1144)
import java.util.Iterator;                                                     // For access of schema info - (DmoCompactSchemaFormatter.java:1146)
import org.dmd.dmc.*;                                                          // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1147)
import org.dmd.dmc.rules.RuleIF;                                               // For rule info - (DmoCompactSchemaFormatter.java:1148)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                              // Required attribute from DmpDMSAG - (DmoCompactSchemaFormatter.java:1172)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;                     // Optional attribute: userName from DmrbaseDMSAG - (DmoCompactSchemaFormatter.java:1176)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                    // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1172)
import org.dmd.dms.generated.enums.ClassTypeEnum;                              // Have class definitions - (DmoCompactSchemaFormatter.java:1152)
import org.dmd.dms.generated.enums.DataTypeEnum;                               // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1153)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                           // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1158)
import org.dmd.dms.generated.enums.ValueTypeEnum;                              // Have attribute definitions - (DmoCompactSchemaFormatter.java:1187)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                           // Support for addition of svInteger values to the extensible InitRuleData class - (ClassDefinition.java:969)
import org.dmd.dms.generated.types.DmcTypeStringMV;                            // Support for addition of mvString values to the extensible InitRuleData class - (ClassDefinition.java:969)
import org.dmd.dms.generated.types.DmcTypeStringSV;                            // Support for addition of svString values to the extensible InitRuleData class - (ClassDefinition.java:969)
import org.dmd.dmt.shared.generated.types.DmcTypeDmtTestEnumSET;               // Support for addition of hsTestEnum values to the extensible InitRuleData class - (ClassDefinition.java:969)
import org.dmd.dmv.shared.extended.rulesdmo.CardinalityRule;                   // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1213)
import org.dmd.dmv.shared.extended.rulesdmo.InitRule;                          // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1213)
import org.dmd.dmv.shared.extended.rulesdmo.NumericRangeRule;                  // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1213)
import org.dmd.dmv.shared.extended.rulesdmo.RestrictReferencesRule;            // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1213)
import org.dmd.dmv.shared.extended.rulesdmo.StringSetRule;                     // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1213)
import org.dmd.dmv.shared.generated.dmo.CardinalityRuleDataDMO;                // To instantiate CardinalityRuleData rule data - (DmoCompactSchemaFormatter.java:1212)
import org.dmd.dmv.shared.generated.dmo.InitRuleDataDMO;                       // To instantiate InitRuleData rule data - (DmoCompactSchemaFormatter.java:1212)
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;               // To instantiate NumericRangeRuleData rule data - (DmoCompactSchemaFormatter.java:1212)
import org.dmd.dmv.shared.generated.dmo.RestrictReferencesRuleDataDMO;         // To instantiate RestrictReferencesRuleData rule data - (DmoCompactSchemaFormatter.java:1212)
import org.dmd.dmv.shared.generated.dmo.StringSetRuleDataDMO;                  // To instantiate StringSetRuleData rule data - (DmoCompactSchemaFormatter.java:1212)


import org.dmd.dmt.shared.generated.types.*;


// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DmtDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmt";


    static int schemaBaseID = 10000;


    static int schemaIDRange = 2000;


    static int schemaMaxID = 12000;

    public final static DmcAttributeInfo __OUIFilter = new DmcAttributeInfo("dmt", "OUIFilter", 10907, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __anObjName = new DmcAttributeInfo("dmt", "anObjName", 10900, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __anotherDmtName = new DmcAttributeInfo("dmt", "anotherDmtName", 10902, "DmtStringName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __anotherSVString = new DmcAttributeInfo("dmt", "anotherSVString", 10148, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __attrIDs = new DmcAttributeInfo("dmt", "attrIDs", 10906, "AttributeID", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __clientCountFilter = new DmcAttributeInfo("dmt", "clientCountFilter", 10908, "ClientCountFilter", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __clientCountFilters = new DmcAttributeInfo("dmt", "clientCountFilters", 10926, "ClientCountFilter", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 8, false);
    public final static DmcAttributeInfo __dmtStringName = new DmcAttributeInfo("dmt", "dmtStringName", 10901, "DmtStringName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __enabledDisabled = new DmcAttributeInfo("dmt", "enabledDisabled", 10920, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hmNamedObj = new DmcAttributeInfo("dmt", "hmNamedObj", 10244, "ObjWithRefs", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hmString = new DmcAttributeInfo("dmt", "hmString", 10144, "StringToString", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsDate = new DmcAttributeInfo("dmt", "hsDate", 10012, "Date", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsDouble = new DmcAttributeInfo("dmt", "hsDouble", 10042, "Double", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsExtendedRef = new DmcAttributeInfo("dmt", "hsExtendedRef", 10446, "SomeRelation", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsFloat = new DmcAttributeInfo("dmt", "hsFloat", 10052, "Float", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsInteger = new DmcAttributeInfo("dmt", "hsInteger", 10062, "Integer", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsLong = new DmcAttributeInfo("dmt", "hsLong", 10112, "Long", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsNamedObj = new DmcAttributeInfo("dmt", "hsNamedObj", 10246, "ObjWithRefs", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsNames = new DmcAttributeInfo("dmt", "hsNames", 10911, "NameContainer", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsString = new DmcAttributeInfo("dmt", "hsString", 10146, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsStringName = new DmcAttributeInfo("dmt", "hsStringName", 10925, "StringName", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsTestEnum = new DmcAttributeInfo("dmt", "hsTestEnum", 10910, "DmtTestEnum", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hsUnnamedObj = new DmcAttributeInfo("dmt", "hsUnnamedObj", 10346, "TestBasicObjectFixed", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __indexedObjRef = new DmcAttributeInfo("dmt", "indexedObjRef", 10915, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10, false);
    public final static DmcAttributeInfo __indexedPlainObjRef = new DmcAttributeInfo("dmt", "indexedPlainObjRef", 10916, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10, false);
    public final static DmcAttributeInfo __indexedString = new DmcAttributeInfo("dmt", "indexedString", 10914, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 5, false);
    public final static DmcAttributeInfo __intToString = new DmcAttributeInfo("dmt", "intToString", 10080, "IntegerToString", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __intToStringMAP = new DmcAttributeInfo("dmt", "intToStringMAP", 10924, "IntegerToString", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __limitedStringMV = new DmcAttributeInfo("dmt", "limitedStringMV", 10015, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __limitedStringSV = new DmcAttributeInfo("dmt", "limitedStringSV", 10014, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvBoolean = new DmcAttributeInfo("dmt", "mvBoolean", 10001, "Boolean", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvComplex = new DmcAttributeInfo("dmt", "mvComplex", 10929, "MenuElementTypeAndComment", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvDate = new DmcAttributeInfo("dmt", "mvDate", 10011, "Date", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvDmcObject = new DmcAttributeInfo("dmt", "mvDmcObject", 10021, "DmcObject", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvDouble = new DmcAttributeInfo("dmt", "mvDouble", 10041, "Double", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvExtendedRef = new DmcAttributeInfo("dmt", "mvExtendedRef", 10442, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvFloat = new DmcAttributeInfo("dmt", "mvFloat", 10051, "Float", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvIdxExtendedRef = new DmcAttributeInfo("dmt", "mvIdxExtendedRef", 10443, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10, false);
    public final static DmcAttributeInfo __mvIdxNamedObj = new DmcAttributeInfo("dmt", "mvIdxNamedObj", 10243, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10, false);
    public final static DmcAttributeInfo __mvIdxString = new DmcAttributeInfo("dmt", "mvIdxString", 10143, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10, false);
    public final static DmcAttributeInfo __mvIdxUnnamedObj = new DmcAttributeInfo("dmt", "mvIdxUnnamedObj", 10343, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10, false);
    public final static DmcAttributeInfo __mvInteger = new DmcAttributeInfo("dmt", "mvInteger", 10061, "Integer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvLong = new DmcAttributeInfo("dmt", "mvLong", 10111, "Long", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvNamedObj = new DmcAttributeInfo("dmt", "mvNamedObj", 10242, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvString = new DmcAttributeInfo("dmt", "mvString", 10142, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvTestBasicNamedObjectFixed = new DmcAttributeInfo("dmt", "mvTestBasicNamedObjectFixed", 10801, "TestBasicNamedObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvTestEnum = new DmcAttributeInfo("dmt", "mvTestEnum", 10909, "DmtTestEnum", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mvUnnamedObj = new DmcAttributeInfo("dmt", "mvUnnamedObj", 10342, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __nonperString = new DmcAttributeInfo("dmt", "nonperString", 10913, "String", ValueTypeEnum.HASHSET, DataTypeEnum.NONPERSISTENT, 0, false);
    public final static DmcAttributeInfo __objRef = new DmcAttributeInfo("dmt", "objRef", 10903, "ObjWithRefs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __objRefHM = new DmcAttributeInfo("dmt", "objRefHM", 10905, "ObjWithRefs", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __objRefMV = new DmcAttributeInfo("dmt", "objRefMV", 10904, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __onOff = new DmcAttributeInfo("dmt", "onOff", 10919, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __plainObjRef = new DmcAttributeInfo("dmt", "plainObjRef", 10917, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __someRelationIndexed = new DmcAttributeInfo("dmt", "someRelationIndexed", 10927, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 8, false);
    public final static DmcAttributeInfo __someRelationMV = new DmcAttributeInfo("dmt", "someRelationMV", 10922, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __someRelationMVI = new DmcAttributeInfo("dmt", "someRelationMVI", 10923, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 8, false);
    public final static DmcAttributeInfo __someRelationSV = new DmcAttributeInfo("dmt", "someRelationSV", 10921, "SomeRelation", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svBoolean = new DmcAttributeInfo("dmt", "svBoolean", 10000, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svComplex = new DmcAttributeInfo("dmt", "svComplex", 10928, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svDate = new DmcAttributeInfo("dmt", "svDate", 10010, "Date", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svDmcObject = new DmcAttributeInfo("dmt", "svDmcObject", 10020, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svDouble = new DmcAttributeInfo("dmt", "svDouble", 10040, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svExtendedRef = new DmcAttributeInfo("dmt", "svExtendedRef", 10441, "SomeRelation", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svFloat = new DmcAttributeInfo("dmt", "svFloat", 10050, "Float", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svInteger = new DmcAttributeInfo("dmt", "svInteger", 10060, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svLong = new DmcAttributeInfo("dmt", "svLong", 10110, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svNamedObj = new DmcAttributeInfo("dmt", "svNamedObj", 10241, "ObjWithRefs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("dmt", "svString", 10141, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svTestBasicNamedObjectFixed = new DmcAttributeInfo("dmt", "svTestBasicNamedObjectFixed", 10800, "TestBasicNamedObjectFixed", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svTestEnum = new DmcAttributeInfo("dmt", "svTestEnum", 10918, "DmtTestEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __svUnnamedObj = new DmcAttributeInfo("dmt", "svUnnamedObj", 10341, "TestBasicObjectFixed", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tmNamedObj = new DmcAttributeInfo("dmt", "tmNamedObj", 10245, "ObjWithRefs", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tmString = new DmcAttributeInfo("dmt", "tmString", 10145, "StringToString", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __transString = new DmcAttributeInfo("dmt", "transString", 10912, "String", ValueTypeEnum.HASHSET, DataTypeEnum.TRANSIENT, 0, false);
    public final static DmcAttributeInfo __tsDate = new DmcAttributeInfo("dmt", "tsDate", 10013, "Date", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tsDouble = new DmcAttributeInfo("dmt", "tsDouble", 10043, "Double", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tsExtendedRef = new DmcAttributeInfo("dmt", "tsExtendedRef", 10447, "SomeRelation", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tsFloat = new DmcAttributeInfo("dmt", "tsFloat", 10053, "Float", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tsInteger = new DmcAttributeInfo("dmt", "tsInteger", 10063, "Integer", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tsLong = new DmcAttributeInfo("dmt", "tsLong", 10113, "Long", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tsNamedObj = new DmcAttributeInfo("dmt", "tsNamedObj", 10247, "ObjWithRefs", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tsString = new DmcAttributeInfo("dmt", "tsString", 10147, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tsUnnamedObj = new DmcAttributeInfo("dmt", "tsUnnamedObj", 10347, "TestBasicObjectFixed", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("dmt", "userName", 11000, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_BaseObj = new DmcTypeInfo("BaseObj", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ClientCountFilter = new DmcTypeInfo("ClientCountFilter", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ClientCountFilterRequest = new DmcTypeInfo("ClientCountFilterRequest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ComplexTypeTest = new DmcTypeInfo("ComplexTypeTest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_DmtField = new DmcTypeInfo("DmtField", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DmtMultiValuedRequiredPartPrimitive = new DmcTypeInfo("DmtMultiValuedRequiredPartPrimitive", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DmtMultiValuedRequiredPartWithReferences = new DmcTypeInfo("DmtMultiValuedRequiredPartWithReferences", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DmtOptionalValueFieldWithColons = new DmcTypeInfo("DmtOptionalValueFieldWithColons", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DmtOptionalValueFieldWithSpaces = new DmcTypeInfo("DmtOptionalValueFieldWithSpaces", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DmtStringName = new DmcTypeInfo("DmtStringName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_DmtTestEnum = new DmcTypeInfo("DmtTestEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ExtendedRefHS = new DmcTypeInfo("ExtendedRefHS", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ExtendedRefMV = new DmcTypeInfo("ExtendedRefMV", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ExtendedRefMVIDX = new DmcTypeInfo("ExtendedRefMVIDX", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ExtendedRefSV = new DmcTypeInfo("ExtendedRefSV", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ExtendedRefTS = new DmcTypeInfo("ExtendedRefTS", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_IntegerNamedObject = new DmcTypeInfo("IntegerNamedObject", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_MenuElementTypeAndComment = new DmcTypeInfo("MenuElementTypeAndComment", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_NameContainerTest = new DmcTypeInfo("NameContainerTest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NamedObjHM = new DmcTypeInfo("NamedObjHM", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NamedObjHS = new DmcTypeInfo("NamedObjHS", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NamedObjMV = new DmcTypeInfo("NamedObjMV", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NamedObjMVIDX = new DmcTypeInfo("NamedObjMVIDX", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NamedObjSV = new DmcTypeInfo("NamedObjSV", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NamedObjTM = new DmcTypeInfo("NamedObjTM", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_NamedObjTS = new DmcTypeInfo("NamedObjTS", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_ObjWithRefs = new DmcTypeInfo("ObjWithRefs", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ObjWithRefsDerivedA = new DmcTypeInfo("ObjWithRefsDerivedA", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ObjWithRefsDerivedB = new DmcTypeInfo("ObjWithRefsDerivedB", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ParseTest = new DmcTypeInfo("ParseTest", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PrimitiveHM = new DmcTypeInfo("PrimitiveHM", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PrimitiveHS = new DmcTypeInfo("PrimitiveHS", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PrimitiveMV = new DmcTypeInfo("PrimitiveMV", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PrimitiveMVIDX = new DmcTypeInfo("PrimitiveMVIDX", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PrimitiveSV = new DmcTypeInfo("PrimitiveSV", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PrimitiveTM = new DmcTypeInfo("PrimitiveTM", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_PrimitiveTS = new DmcTypeInfo("PrimitiveTS", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_SomeRelation = new DmcTypeInfo("SomeRelation", OriginalTypeEnum.EXTREF);
    public final static DmcTypeInfo __type_TestAbstractExtended = new DmcTypeInfo("TestAbstractExtended", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_TestAbstractFixed = new DmcTypeInfo("TestAbstractFixed", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_TestBasicNamedObjectExtended = new DmcTypeInfo("TestBasicNamedObjectExtended", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TestBasicNamedObjectFixed = new DmcTypeInfo("TestBasicNamedObjectFixed", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TestBasicObjectFixed = new DmcTypeInfo("TestBasicObjectFixed", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_TestDerivedDiffSubpackage = new DmcTypeInfo("TestDerivedDiffSubpackage", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TestDerivedSubpackage = new DmcTypeInfo("TestDerivedSubpackage", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TestMultiLevelSubpackage = new DmcTypeInfo("TestMultiLevelSubpackage", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TestOneLevelSubpackage = new DmcTypeInfo("TestOneLevelSubpackage", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TestOneLevelSubpackageExtended = new DmcTypeInfo("TestOneLevelSubpackageExtended", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UUIDNamedObject = new DmcTypeInfo("UUIDNamedObject", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UnnamedObjHS = new DmcTypeInfo("UnnamedObjHS", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_UnnamedObjMV = new DmcTypeInfo("UnnamedObjMV", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_UnnamedObjMVIDX = new DmcTypeInfo("UnnamedObjMVIDX", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_UnnamedObjSV = new DmcTypeInfo("UnnamedObjSV", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_UnnamedObjTS = new DmcTypeInfo("UnnamedObjTS", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_UsingIndexedAttributes = new DmcTypeInfo("UsingIndexedAttributes", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_UsingObjRefHM = new DmcTypeInfo("UsingObjRefHM", OriginalTypeEnum.OBJECT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __BaseObj = new DmcClassInfo("BaseObj","org.dmd.dmt.shared.generated.dmo.BaseObjDMO", 20015, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __ObjWithRefs = new DmcClassInfo("ObjWithRefs","org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO", 20016, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__BaseObj,MetaDMSAG.__name);
    public final static DmcClassInfo __ObjWithRefsDerivedA = new DmcClassInfo("ObjWithRefsDerivedA","org.dmd.dmt.shared.generated.dmo.ObjWithRefsDerivedADMO", 20021, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ObjWithRefs,MetaDMSAG.__name);
    public final static DmcClassInfo __ObjWithRefsDerivedB = new DmcClassInfo("ObjWithRefsDerivedB","org.dmd.dmt.shared.generated.dmo.ObjWithRefsDerivedBDMO", 20022, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ObjWithRefs,MetaDMSAG.__name);
    public final static DmcClassInfo __ClientCountFilter = new DmcClassInfo("ClientCountFilter","org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO", 20017, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ClientCountFilterRequest = new DmcClassInfo("ClientCountFilterRequest","org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO", 20018, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,DmpDMSAG.__Request,null);
    public final static DmcClassInfo __ComplexTypeTest = new DmcClassInfo("ComplexTypeTest","org.dmd.dmt.shared.generated.dmo.ComplexTypeTestDMO", 20409, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefHS = new DmcClassInfo("ExtendedRefHS","org.dmd.dmt.shared.generated.dmo.ExtendedRefHSDMO", 20406, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefMV = new DmcClassInfo("ExtendedRefMV","org.dmd.dmt.shared.generated.dmo.ExtendedRefMVDMO", 20402, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefMVIDX = new DmcClassInfo("ExtendedRefMVIDX","org.dmd.dmt.shared.generated.dmo.ExtendedRefMVIDXDMO", 20403, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefSV = new DmcClassInfo("ExtendedRefSV","org.dmd.dmt.shared.generated.dmo.ExtendedRefSVDMO", 20401, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefTS = new DmcClassInfo("ExtendedRefTS","org.dmd.dmt.shared.generated.dmo.ExtendedRefTSDMO", 20407, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __IntegerNamedObject = new DmcClassInfo("IntegerNamedObject","org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO", 20013, ClassTypeEnum.STRUCTURAL, DataTypeEnum.NONPERSISTENT,null,MetaDMSAG.__integerName);
    public final static DmcClassInfo __NameContainerTest = new DmcClassInfo("NameContainerTest","org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO", 20014, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjHM = new DmcClassInfo("NamedObjHM","org.dmd.dmt.shared.generated.dmo.NamedObjHMDMO", 20204, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjHS = new DmcClassInfo("NamedObjHS","org.dmd.dmt.shared.generated.dmo.NamedObjHSDMO", 20206, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjMV = new DmcClassInfo("NamedObjMV","org.dmd.dmt.shared.generated.dmo.NamedObjMVDMO", 20202, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjMVIDX = new DmcClassInfo("NamedObjMVIDX","org.dmd.dmt.shared.generated.dmo.NamedObjMVIDXDMO", 20203, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjSV = new DmcClassInfo("NamedObjSV","org.dmd.dmt.shared.generated.dmo.NamedObjSVDMO", 20201, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjTM = new DmcClassInfo("NamedObjTM","org.dmd.dmt.shared.generated.dmo.NamedObjTMDMO", 20205, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjTS = new DmcClassInfo("NamedObjTS","org.dmd.dmt.shared.generated.dmo.NamedObjTSDMO", 20207, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ParseTest = new DmcClassInfo("ParseTest","org.dmd.dmt.shared.generated.dmo.ParseTestDMO", 20408, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveHM = new DmcClassInfo("PrimitiveHM","org.dmd.dmt.shared.generated.dmo.PrimitiveHMDMO", 20104, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveHS = new DmcClassInfo("PrimitiveHS","org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO", 20106, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveMV = new DmcClassInfo("PrimitiveMV","org.dmd.dmt.shared.generated.dmo.PrimitiveMVDMO", 20102, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveMVIDX = new DmcClassInfo("PrimitiveMVIDX","org.dmd.dmt.shared.generated.dmo.PrimitiveMVIDXDMO", 20103, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveSV = new DmcClassInfo("PrimitiveSV","org.dmd.dmt.shared.generated.dmo.PrimitiveSVDMO", 20101, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveTM = new DmcClassInfo("PrimitiveTM","org.dmd.dmt.shared.generated.dmo.PrimitiveTMDMO", 20105, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveTS = new DmcClassInfo("PrimitiveTS","org.dmd.dmt.shared.generated.dmo.PrimitiveTSDMO", 20107, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestAbstractExtended = new DmcClassInfo("TestAbstractExtended","org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO", 20002, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestAbstractFixed = new DmcClassInfo("TestAbstractFixed","org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO", 20001, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestBasicAuxiliary = new DmcClassInfo("TestBasicAuxiliary","org.dmd.dmt.shared.generated.dmo.TestBasicAuxiliaryDMO", 20006, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestBasicNamedObjectExtended = new DmcClassInfo("TestBasicNamedObjectExtended","org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectExtendedDMO", 20005, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __TestBasicNamedObjectFixed = new DmcClassInfo("TestBasicNamedObjectFixed","org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO", 20004, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __TestBasicObjectFixed = new DmcClassInfo("TestBasicObjectFixed","org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO", 20003, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestMultiLevelSubpackage = new DmcClassInfo("TestMultiLevelSubpackage","org.dmd.dmt.shared.generated.dmo.TestMultiLevelSubpackageDMO", 20009, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __TestDerivedSubpackage = new DmcClassInfo("TestDerivedSubpackage","org.dmd.dmt.shared.generated.dmo.TestDerivedSubpackageDMO", 20010, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__TestMultiLevelSubpackage,MetaDMSAG.__name);
    public final static DmcClassInfo __TestOneLevelSubpackage = new DmcClassInfo("TestOneLevelSubpackage","org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageDMO", 20007, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __TestDerivedDiffSubpackage = new DmcClassInfo("TestDerivedDiffSubpackage","org.dmd.dmt.shared.generated.dmo.TestDerivedDiffSubpackageDMO", 20011, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__TestOneLevelSubpackage,MetaDMSAG.__name);
    public final static DmcClassInfo __TestOneLevelSubpackageExtended = new DmcClassInfo("TestOneLevelSubpackageExtended","org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO", 20008, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __UUIDNamedObject = new DmcClassInfo("UUIDNamedObject","org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO", 20012, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__uuidName);
    public final static DmcClassInfo __UnnamedObjHS = new DmcClassInfo("UnnamedObjHS","org.dmd.dmt.shared.generated.dmo.UnnamedObjHSDMO", 20306, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UnnamedObjMV = new DmcClassInfo("UnnamedObjMV","org.dmd.dmt.shared.generated.dmo.UnnamedObjMVDMO", 20302, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UnnamedObjMVIDX = new DmcClassInfo("UnnamedObjMVIDX","org.dmd.dmt.shared.generated.dmo.UnnamedObjMVIDXDMO", 20303, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UnnamedObjSV = new DmcClassInfo("UnnamedObjSV","org.dmd.dmt.shared.generated.dmo.UnnamedObjSVDMO", 20301, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UnnamedObjTS = new DmcClassInfo("UnnamedObjTS","org.dmd.dmt.shared.generated.dmo.UnnamedObjTSDMO", 20307, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UsingIndexedAttributes = new DmcClassInfo("UsingIndexedAttributes","org.dmd.dmt.shared.generated.dmo.UsingIndexedAttributesDMO", 20019, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UsingObjRefHM = new DmcClassInfo("UsingObjRefHM","org.dmd.dmt.shared.generated.dmo.UsingObjRefHMDMO", 20020, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:243)
    public final static DmcSliceInfo __slice1 = new DmcSliceInfo("slice1");
    // svBoolean
    // mvFloat

    public final static DmcSliceInfo __sliceOfNamed = new DmcSliceInfo("sliceOfNamed");
    // svString
    // mvString
    // mvTestEnum


    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:261)
    public final static CardinalityRule __canOnlyHavemvInteger;
    public final static StringSetRule __dmtCheckLimitedMV;
    public final static StringSetRule __dmtCheckLimitedSV;
    public final static InitRule __dmtInitTestBasicObjectFixed;
    public final static NumericRangeRule __dmtSvFloatNumericRange;
    public final static NumericRangeRule __dmtSvIntegerNumericRange;
    public final static RestrictReferencesRule __rrrDerivedA;
    public final static RestrictReferencesRule __rrrDerivedA2;
    public final static RestrictReferencesRule __rrrDerivedB;
    public final static RestrictReferencesRule __rrrDerivedB2;

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

        DmtDMSAGAMAP.initSmAp(_SmAp);

        DmtDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {

        _NmAp.put(DmcTypeDmtStringNameSTATIC.instance.getNameClass(),DmcTypeDmtStringNameSTATIC.instance);

        __slice1.addAttributeID(10000);
        __slice1.addAttributeID(10051);
        _SImAp.put("slice1",__slice1);

        __sliceOfNamed.addAttributeID(10141);
        __sliceOfNamed.addAttributeID(10142);
        __sliceOfNamed.addAttributeID(10909);
        _SImAp.put("sliceOfNamed",__sliceOfNamed);

        DmtDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:391)
        try{
            CardinalityRuleDataDMO _canOnlyHavemvIntegerData = new CardinalityRuleDataDMO();
            _canOnlyHavemvIntegerData    .setRuleName("canOnlyHavemvInteger");
            _canOnlyHavemvIntegerData    .setApplyToClass("TestBasicObjectFixed");
            _canOnlyHavemvIntegerData    .setCrMinimum("1.0");
            _canOnlyHavemvIntegerData    .setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _canOnlyHavemvIntegerData    .setRuleTitle("The mvInteger attribute must between 2 and 5 things in it.");
            _canOnlyHavemvIntegerData    .setCrMaximum("5.0");
            _canOnlyHavemvIntegerData    .setLineNumber("86");
            _canOnlyHavemvIntegerData    .setApplyToAttribute("mvInteger");
            _canOnlyHavemvIntegerData    .setDefinedIn("dmt");

            __canOnlyHavemvInteger = new CardinalityRule(_canOnlyHavemvIntegerData);

            _RmAp.add(__canOnlyHavemvInteger);

            StringSetRuleDataDMO _dmtCheckLimitedMVData = new StringSetRuleDataDMO();
            _dmtCheckLimitedMVData       .setRuleName("dmtCheckLimitedMV");
            _dmtCheckLimitedMVData       .setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _dmtCheckLimitedMVData       .setRuleTitle("The limitedStringMV attribute must be one of: left, right, over there.");
            _dmtCheckLimitedMVData       .setLineNumber("290");
            _dmtCheckLimitedMVData       .addAllowedString("left");
            _dmtCheckLimitedMVData       .addAllowedString("over there");
            _dmtCheckLimitedMVData       .addAllowedString("right");
            _dmtCheckLimitedMVData       .setApplyToAttribute("limitedStringMV");
            _dmtCheckLimitedMVData       .setDefinedIn("dmt");

            __dmtCheckLimitedMV = new StringSetRule(_dmtCheckLimitedMVData);

            _RmAp.add(__dmtCheckLimitedMV);

            StringSetRuleDataDMO _dmtCheckLimitedSVData = new StringSetRuleDataDMO();
            _dmtCheckLimitedSVData       .setRuleName("dmtCheckLimitedSV");
            _dmtCheckLimitedSVData       .setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _dmtCheckLimitedSVData       .setRuleTitle("The limitedStringSV attribute must be one of: Uno, Dos Fish, Hasta la vista.");
            _dmtCheckLimitedSVData       .setLineNumber("282");
            _dmtCheckLimitedSVData       .addAllowedString("Dos Fish");
            _dmtCheckLimitedSVData       .addAllowedString("Uno");
            _dmtCheckLimitedSVData       .addAllowedString("Hasta la vista");
            _dmtCheckLimitedSVData       .setApplyToAttribute("limitedStringSV");
            _dmtCheckLimitedSVData       .setDefinedIn("dmt");

            __dmtCheckLimitedSV = new StringSetRule(_dmtCheckLimitedSVData);

            _RmAp.add(__dmtCheckLimitedSV);

            InitRuleDataDMO _dmtInitTestBasicObjectFixedData = new InitRuleDataDMO();
            _dmtInitTestBasicObjectFixedData.setRuleName("dmtInitTestBasicObjectFixed");
            _dmtInitTestBasicObjectFixedData.setApplyToClass("TestBasicObjectFixed");
            _dmtInitTestBasicObjectFixedData.setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _dmtInitTestBasicObjectFixedData.setRuleTitle("Initialize TestBasicObjectFixed");
            _dmtInitTestBasicObjectFixedData.setLineNumber("78");
            DmcTypeIntegerSV svIntegerValue1 = null;
            svIntegerValue1 = new DmcTypeIntegerSV(DmtDMSAG.__svInteger);
            svIntegerValue1.set("8");
            _dmtInitTestBasicObjectFixedData.set(DmtDMSAG.__svInteger, svIntegerValue1);
            _dmtInitTestBasicObjectFixedData.setDefinedIn("dmt");
            DmcTypeStringSV svStringValue2 = null;
            svStringValue2 = new DmcTypeStringSV(DmtDMSAG.__svString);
            svStringValue2.set("the single valued string");
            _dmtInitTestBasicObjectFixedData.set(DmtDMSAG.__svString, svStringValue2);
            DmcTypeDmtTestEnumSET hsTestEnumValue3 = new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum);
            hsTestEnumValue3.add("TEST2");
            hsTestEnumValue3.add("TEST1");
            _dmtInitTestBasicObjectFixedData.add(DmtDMSAG.__hsTestEnum, hsTestEnumValue3);
            DmcTypeStringMV mvStringValue4 = new DmcTypeStringMV(DmtDMSAG.__mvString);
            mvStringValue4.add("first value");
            mvStringValue4.add("second value");
            _dmtInitTestBasicObjectFixedData.add(DmtDMSAG.__mvString, mvStringValue4);

            __dmtInitTestBasicObjectFixed = new InitRule(_dmtInitTestBasicObjectFixedData);

            _RmAp.add(__dmtInitTestBasicObjectFixed);

            NumericRangeRuleDataDMO _dmtSvFloatNumericRangeData = new NumericRangeRuleDataDMO();
            _dmtSvFloatNumericRangeData  .setNrrMinimum("1.5");
            _dmtSvFloatNumericRangeData  .setRuleName("dmtSvFloatNumericRange");
            _dmtSvFloatNumericRangeData  .setApplyToClass("TestBasicObjectFixed");
            _dmtSvFloatNumericRangeData  .setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _dmtSvFloatNumericRangeData  .setNrrMaximum("2.5");
            _dmtSvFloatNumericRangeData  .setRuleTitle("svFloat must be in the range 1.5 - 2.5");
            _dmtSvFloatNumericRangeData  .setLineNumber("102");
            _dmtSvFloatNumericRangeData  .setApplyToAttribute("svFloat");
            _dmtSvFloatNumericRangeData  .setDefinedIn("dmt");

            __dmtSvFloatNumericRange = new NumericRangeRule(_dmtSvFloatNumericRangeData);

            _RmAp.add(__dmtSvFloatNumericRange);

            NumericRangeRuleDataDMO _dmtSvIntegerNumericRangeData = new NumericRangeRuleDataDMO();
            _dmtSvIntegerNumericRangeData.setNrrMinimum("1.0");
            _dmtSvIntegerNumericRangeData.setRuleName("dmtSvIntegerNumericRange");
            _dmtSvIntegerNumericRangeData.setApplyToClass("TestBasicObjectFixed");
            _dmtSvIntegerNumericRangeData.setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _dmtSvIntegerNumericRangeData.setNrrMaximum("10.0");
            _dmtSvIntegerNumericRangeData.setRuleTitle("svInteger must be in the range 1-10");
            _dmtSvIntegerNumericRangeData.setLineNumber("94");
            _dmtSvIntegerNumericRangeData.setApplyToAttribute("svInteger");
            _dmtSvIntegerNumericRangeData.setDefinedIn("dmt");

            __dmtSvIntegerNumericRange = new NumericRangeRule(_dmtSvIntegerNumericRangeData);

            _RmAp.add(__dmtSvIntegerNumericRange);

            RestrictReferencesRuleDataDMO _rrrDerivedAData = new RestrictReferencesRuleDataDMO();
            _rrrDerivedAData             .addAllowedReference("ObjWithRefsDerivedA");
            _rrrDerivedAData             .setRuleName("rrrDerivedA");
            _rrrDerivedAData             .setApplyToClass("ObjWithRefsDerivedA");
            _rrrDerivedAData             .setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _rrrDerivedAData             .setRuleTitle("The objRefMV attribute can only refer to other objects of type ObjWithRefsDerivedA when used in a ObjWithRefsDerivedA instance.");
            _rrrDerivedAData             .setLineNumber("336");
            _rrrDerivedAData             .setApplyToAttribute("objRefMV");
            _rrrDerivedAData             .setDefinedIn("dmt");

            __rrrDerivedA = new RestrictReferencesRule(_rrrDerivedAData);

            _RmAp.add(__rrrDerivedA);

            RestrictReferencesRuleDataDMO _rrrDerivedA2Data = new RestrictReferencesRuleDataDMO();
            _rrrDerivedA2Data            .addAllowedReference("ObjWithRefsDerivedA");
            _rrrDerivedA2Data            .setRuleName("rrrDerivedA2");
            _rrrDerivedA2Data            .setApplyToClass("ObjWithRefsDerivedA");
            _rrrDerivedA2Data            .setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _rrrDerivedA2Data            .setRuleTitle("The objRef attribute can only refer to other objects of type ObjWithRefsDerivedA when used in a ObjWithRefsDerivedA instance.");
            _rrrDerivedA2Data            .setLineNumber("343");
            _rrrDerivedA2Data            .setApplyToAttribute("objRef");
            _rrrDerivedA2Data            .setDefinedIn("dmt");

            __rrrDerivedA2 = new RestrictReferencesRule(_rrrDerivedA2Data);

            _RmAp.add(__rrrDerivedA2);

            RestrictReferencesRuleDataDMO _rrrDerivedBData = new RestrictReferencesRuleDataDMO();
            _rrrDerivedBData             .addAllowedReference("ObjWithRefsDerivedB");
            _rrrDerivedBData             .setRuleName("rrrDerivedB");
            _rrrDerivedBData             .setApplyToClass("ObjWithRefsDerivedB");
            _rrrDerivedBData             .setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _rrrDerivedBData             .setRuleTitle("The objRefMV attribute can only refer to other objects of type ObjWithRefsDerivedB when used in a ObjWithRefsDerivedB instance.");
            _rrrDerivedBData             .setLineNumber("360");
            _rrrDerivedBData             .setApplyToAttribute("objRefMV");
            _rrrDerivedBData             .setDefinedIn("dmt");

            __rrrDerivedB = new RestrictReferencesRule(_rrrDerivedBData);

            _RmAp.add(__rrrDerivedB);

            RestrictReferencesRuleDataDMO _rrrDerivedB2Data = new RestrictReferencesRuleDataDMO();
            _rrrDerivedB2Data            .addAllowedReference("ObjWithRefsDerivedB");
            _rrrDerivedB2Data            .setRuleName("rrrDerivedB2");
            _rrrDerivedB2Data            .setApplyToClass("ObjWithRefsDerivedB");
            _rrrDerivedB2Data            .setFile("/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _rrrDerivedB2Data            .setRuleTitle("The objRef attribute can only refer to other objects of type ObjWithRefsDerivedB when used in a ObjWithRefsDerivedB instance.");
            _rrrDerivedB2Data            .setLineNumber("367");
            _rrrDerivedB2Data            .setApplyToAttribute("objRef");
            _rrrDerivedB2Data            .setDefinedIn("dmt");

            __rrrDerivedB2 = new RestrictReferencesRule(_rrrDerivedB2Data);

            _RmAp.add(__rrrDerivedB2);

        } catch(DmcValueException ex){
            throw(new IllegalStateException(ex));
        }

    }

    static  DmtDMSAG instance;

    protected DmtDMSAG (){
    }

    public synchronized static DmtDMSAG instance(){
        if (instance == null)
            instance = new DmtDMSAG();
        
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

