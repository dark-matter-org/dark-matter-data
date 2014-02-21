package org.dmd.dmt.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:565)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;         // Required attribute from DmpDMSAG - (DmoCompactSchemaFormatter.java:546)
import org.dmd.dms.generated.dmo.MetaDMSAG;               // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:546)
import org.dmd.dms.generated.enums.ClassTypeEnum;         // Have class definitions - (DmoCompactSchemaFormatter.java:538)
import org.dmd.dms.generated.enums.DataTypeEnum;          // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:539)
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Have attribute definitions - (DmoCompactSchemaFormatter.java:560)

import org.dmd.dmt.shared.generated.types.*;


// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:95)
public class DmtDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmt";


    static int schemaBaseID = 10000;


    static int schemaIDRange = 2000;


    static int schemaMaxID = 12000;

    public final static DmcAttributeInfo __OUIFilter = new DmcAttributeInfo("OUIFilter", 10907, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __anObjName = new DmcAttributeInfo("anObjName", 10900, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __anotherDmtName = new DmcAttributeInfo("anotherDmtName", 10902, "DmtStringName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __anotherSVString = new DmcAttributeInfo("anotherSVString", 10148, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __attrIDs = new DmcAttributeInfo("attrIDs", 10906, "AttributeID", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __clientCountFilter = new DmcAttributeInfo("clientCountFilter", 10908, "ClientCountFilter", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __clientCountFilters = new DmcAttributeInfo("clientCountFilters", 10926, "ClientCountFilter", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 8);
    public final static DmcAttributeInfo __dmtStringName = new DmcAttributeInfo("dmtStringName", 10901, "DmtStringName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __enabledDisabled = new DmcAttributeInfo("enabledDisabled", 10920, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hmNamedObj = new DmcAttributeInfo("hmNamedObj", 10244, "ObjWithRefs", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hmString = new DmcAttributeInfo("hmString", 10144, "StringToString", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsDate = new DmcAttributeInfo("hsDate", 10012, "Date", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsDouble = new DmcAttributeInfo("hsDouble", 10042, "Double", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsExtendedRef = new DmcAttributeInfo("hsExtendedRef", 10446, "SomeRelation", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsFloat = new DmcAttributeInfo("hsFloat", 10052, "Float", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsInteger = new DmcAttributeInfo("hsInteger", 10062, "Integer", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsLong = new DmcAttributeInfo("hsLong", 10112, "Long", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsNamedObj = new DmcAttributeInfo("hsNamedObj", 10246, "ObjWithRefs", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsNames = new DmcAttributeInfo("hsNames", 10911, "NameContainer", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsString = new DmcAttributeInfo("hsString", 10146, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsStringName = new DmcAttributeInfo("hsStringName", 10925, "StringName", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsTestEnum = new DmcAttributeInfo("hsTestEnum", 10910, "DmtTestEnum", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsUnnamedObj = new DmcAttributeInfo("hsUnnamedObj", 10346, "TestBasicObjectFixed", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __indexedObjRef = new DmcAttributeInfo("indexedObjRef", 10915, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10);
    public final static DmcAttributeInfo __indexedPlainObjRef = new DmcAttributeInfo("indexedPlainObjRef", 10916, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10);
    public final static DmcAttributeInfo __indexedString = new DmcAttributeInfo("indexedString", 10914, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 5);
    public final static DmcAttributeInfo __intToString = new DmcAttributeInfo("intToString", 10080, "IntegerToString", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __intToStringMAP = new DmcAttributeInfo("intToStringMAP", 10924, "IntegerToString", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvBoolean = new DmcAttributeInfo("mvBoolean", 10001, "Boolean", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvDate = new DmcAttributeInfo("mvDate", 10011, "Date", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvDmcObject = new DmcAttributeInfo("mvDmcObject", 10021, "DmcObject", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvDouble = new DmcAttributeInfo("mvDouble", 10041, "Double", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvExtendedRef = new DmcAttributeInfo("mvExtendedRef", 10442, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvFloat = new DmcAttributeInfo("mvFloat", 10051, "Float", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvIdxExtendedRef = new DmcAttributeInfo("mvIdxExtendedRef", 10443, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10);
    public final static DmcAttributeInfo __mvIdxNamedObj = new DmcAttributeInfo("mvIdxNamedObj", 10243, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10);
    public final static DmcAttributeInfo __mvIdxString = new DmcAttributeInfo("mvIdxString", 10143, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10);
    public final static DmcAttributeInfo __mvIdxUnnamedObj = new DmcAttributeInfo("mvIdxUnnamedObj", 10343, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10);
    public final static DmcAttributeInfo __mvInteger = new DmcAttributeInfo("mvInteger", 10061, "Integer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvLong = new DmcAttributeInfo("mvLong", 10111, "Long", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvNamedObj = new DmcAttributeInfo("mvNamedObj", 10242, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvString = new DmcAttributeInfo("mvString", 10142, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvTestBasicNamedObjectFixed = new DmcAttributeInfo("mvTestBasicNamedObjectFixed", 10801, "TestBasicNamedObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvTestEnum = new DmcAttributeInfo("mvTestEnum", 10909, "DmtTestEnum", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvUnnamedObj = new DmcAttributeInfo("mvUnnamedObj", 10342, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nonperString = new DmcAttributeInfo("nonperString", 10913, "String", ValueTypeEnum.HASHSET, DataTypeEnum.NONPERSISTENT);
    public final static DmcAttributeInfo __objRef = new DmcAttributeInfo("objRef", 10903, "ObjWithRefs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __objRefHM = new DmcAttributeInfo("objRefHM", 10905, "ObjWithRefs", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __objRefMV = new DmcAttributeInfo("objRefMV", 10904, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __onOff = new DmcAttributeInfo("onOff", 10919, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __plainObjRef = new DmcAttributeInfo("plainObjRef", 10917, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __someRelationIndexed = new DmcAttributeInfo("someRelationIndexed", 10927, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 8);
    public final static DmcAttributeInfo __someRelationMV = new DmcAttributeInfo("someRelationMV", 10922, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __someRelationMVI = new DmcAttributeInfo("someRelationMVI", 10923, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 8);
    public final static DmcAttributeInfo __someRelationSV = new DmcAttributeInfo("someRelationSV", 10921, "SomeRelation", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svBoolean = new DmcAttributeInfo("svBoolean", 10000, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svDate = new DmcAttributeInfo("svDate", 10010, "Date", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svDmcObject = new DmcAttributeInfo("svDmcObject", 10020, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svDouble = new DmcAttributeInfo("svDouble", 10040, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svExtendedRef = new DmcAttributeInfo("svExtendedRef", 10441, "SomeRelation", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svFloat = new DmcAttributeInfo("svFloat", 10050, "Float", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svInteger = new DmcAttributeInfo("svInteger", 10060, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svLong = new DmcAttributeInfo("svLong", 10110, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svNamedObj = new DmcAttributeInfo("svNamedObj", 10241, "ObjWithRefs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString", 10141, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svTestBasicNamedObjectFixed = new DmcAttributeInfo("svTestBasicNamedObjectFixed", 10800, "TestBasicNamedObjectFixed", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svTestEnum = new DmcAttributeInfo("svTestEnum", 10918, "DmtTestEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svUnnamedObj = new DmcAttributeInfo("svUnnamedObj", 10341, "TestBasicObjectFixed", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tmNamedObj = new DmcAttributeInfo("tmNamedObj", 10245, "ObjWithRefs", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tmString = new DmcAttributeInfo("tmString", 10145, "StringToString", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __transString = new DmcAttributeInfo("transString", 10912, "String", ValueTypeEnum.HASHSET, DataTypeEnum.TRANSIENT);
    public final static DmcAttributeInfo __tsDate = new DmcAttributeInfo("tsDate", 10013, "Date", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsDouble = new DmcAttributeInfo("tsDouble", 10043, "Double", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsExtendedRef = new DmcAttributeInfo("tsExtendedRef", 10447, "SomeRelation", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsFloat = new DmcAttributeInfo("tsFloat", 10053, "Float", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsInteger = new DmcAttributeInfo("tsInteger", 10063, "Integer", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsLong = new DmcAttributeInfo("tsLong", 10113, "Long", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsNamedObj = new DmcAttributeInfo("tsNamedObj", 10247, "ObjWithRefs", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsString = new DmcAttributeInfo("tsString", 10147, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsUnnamedObj = new DmcAttributeInfo("tsUnnamedObj", 10347, "TestBasicObjectFixed", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcClassInfo __BaseObj = new DmcClassInfo("BaseObj", 10015, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __ObjWithRefs = new DmcClassInfo("ObjWithRefs", 10016, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__BaseObj,MetaDMSAG.__name);
    public final static DmcClassInfo __ClientCountFilter = new DmcClassInfo("ClientCountFilter", 10017, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ClientCountFilterRequest = new DmcClassInfo("ClientCountFilterRequest", 10018, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,DmpDMSAG.__Request,null);
    public final static DmcClassInfo __ExtendedRefHS = new DmcClassInfo("ExtendedRefHS", 10406, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefMV = new DmcClassInfo("ExtendedRefMV", 10402, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefMVIDX = new DmcClassInfo("ExtendedRefMVIDX", 10403, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefSV = new DmcClassInfo("ExtendedRefSV", 10401, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ExtendedRefTS = new DmcClassInfo("ExtendedRefTS", 10407, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __IntegerNamedObject = new DmcClassInfo("IntegerNamedObject", 10013, ClassTypeEnum.STRUCTURAL, DataTypeEnum.NONPERSISTENT,null,MetaDMSAG.__integerName);
    public final static DmcClassInfo __NameContainerTest = new DmcClassInfo("NameContainerTest", 10014, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjHM = new DmcClassInfo("NamedObjHM", 10204, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjHS = new DmcClassInfo("NamedObjHS", 10206, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjMV = new DmcClassInfo("NamedObjMV", 10202, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjMVIDX = new DmcClassInfo("NamedObjMVIDX", 10203, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjSV = new DmcClassInfo("NamedObjSV", 10201, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjTM = new DmcClassInfo("NamedObjTM", 10205, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __NamedObjTS = new DmcClassInfo("NamedObjTS", 10207, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveHM = new DmcClassInfo("PrimitiveHM", 10104, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveHS = new DmcClassInfo("PrimitiveHS", 10106, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveMV = new DmcClassInfo("PrimitiveMV", 10102, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveMVIDX = new DmcClassInfo("PrimitiveMVIDX", 10103, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveSV = new DmcClassInfo("PrimitiveSV", 10101, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveTM = new DmcClassInfo("PrimitiveTM", 10105, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __PrimitiveTS = new DmcClassInfo("PrimitiveTS", 10107, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestAbstractExtended = new DmcClassInfo("TestAbstractExtended", 10002, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestAbstractFixed = new DmcClassInfo("TestAbstractFixed", 10001, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestBasicAuxiliary = new DmcClassInfo("TestBasicAuxiliary", 10006, ClassTypeEnum.AUXILIARY, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestBasicNamedObjectExtended = new DmcClassInfo("TestBasicNamedObjectExtended", 10005, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __TestBasicNamedObjectFixed = new DmcClassInfo("TestBasicNamedObjectFixed", 10004, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __TestBasicObjectFixed = new DmcClassInfo("TestBasicObjectFixed", 10003, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __TestMultiLevelSubpackage = new DmcClassInfo("TestMultiLevelSubpackage", 10009, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __TestDerivedSubpackage = new DmcClassInfo("TestDerivedSubpackage", 10010, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__TestMultiLevelSubpackage,MetaDMSAG.__name);
    public final static DmcClassInfo __TestOneLevelSubpackage = new DmcClassInfo("TestOneLevelSubpackage", 10007, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __TestDerivedDiffSubpackage = new DmcClassInfo("TestDerivedDiffSubpackage", 10011, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__TestOneLevelSubpackage,MetaDMSAG.__name);
    public final static DmcClassInfo __TestOneLevelSubpackageExtended = new DmcClassInfo("TestOneLevelSubpackageExtended", 10008, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __UUIDNamedObject = new DmcClassInfo("UUIDNamedObject", 10012, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__uuidName);
    public final static DmcClassInfo __UnnamedObjHS = new DmcClassInfo("UnnamedObjHS", 10306, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UnnamedObjMV = new DmcClassInfo("UnnamedObjMV", 10302, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UnnamedObjMVIDX = new DmcClassInfo("UnnamedObjMVIDX", 10303, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UnnamedObjSV = new DmcClassInfo("UnnamedObjSV", 10301, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UnnamedObjTS = new DmcClassInfo("UnnamedObjTS", 10307, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UsingIndexedAttributes = new DmcClassInfo("UsingIndexedAttributes", 10019, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __UsingObjRefHM = new DmcClassInfo("UsingObjRefHM", 10020, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);

    public final static DmcSliceInfo __slice1 = new DmcSliceInfo("slice1");
    // svBoolean
    // mvFloat

    public final static DmcSliceInfo __sliceOfNamed = new DmcSliceInfo("sliceOfNamed");
    // svString
    // mvString
    // mvTestEnum


    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _SmAp.put(__OUIFilter.id,__OUIFilter);
        _SmAp.put(__anObjName.id,__anObjName);
        _SmAp.put(__anotherDmtName.id,__anotherDmtName);
        _SmAp.put(__anotherSVString.id,__anotherSVString);
        _SmAp.put(__attrIDs.id,__attrIDs);
        _SmAp.put(__clientCountFilter.id,__clientCountFilter);
        _SmAp.put(__clientCountFilters.id,__clientCountFilters);
        _SmAp.put(__dmtStringName.id,__dmtStringName);
        _SmAp.put(__enabledDisabled.id,__enabledDisabled);
        _SmAp.put(__hmNamedObj.id,__hmNamedObj);
        _SmAp.put(__hmString.id,__hmString);
        _SmAp.put(__hsDate.id,__hsDate);
        _SmAp.put(__hsDouble.id,__hsDouble);
        _SmAp.put(__hsExtendedRef.id,__hsExtendedRef);
        _SmAp.put(__hsFloat.id,__hsFloat);
        _SmAp.put(__hsInteger.id,__hsInteger);
        _SmAp.put(__hsLong.id,__hsLong);
        _SmAp.put(__hsNamedObj.id,__hsNamedObj);
        _SmAp.put(__hsNames.id,__hsNames);
        _SmAp.put(__hsString.id,__hsString);
        _SmAp.put(__hsStringName.id,__hsStringName);
        _SmAp.put(__hsTestEnum.id,__hsTestEnum);
        _SmAp.put(__hsUnnamedObj.id,__hsUnnamedObj);
        _SmAp.put(__indexedObjRef.id,__indexedObjRef);
        _SmAp.put(__indexedPlainObjRef.id,__indexedPlainObjRef);
        _SmAp.put(__indexedString.id,__indexedString);
        _SmAp.put(__intToString.id,__intToString);
        _SmAp.put(__intToStringMAP.id,__intToStringMAP);
        _SmAp.put(__mvBoolean.id,__mvBoolean);
        _SmAp.put(__mvDate.id,__mvDate);
        _SmAp.put(__mvDmcObject.id,__mvDmcObject);
        _SmAp.put(__mvDouble.id,__mvDouble);
        _SmAp.put(__mvExtendedRef.id,__mvExtendedRef);
        _SmAp.put(__mvFloat.id,__mvFloat);
        _SmAp.put(__mvIdxExtendedRef.id,__mvIdxExtendedRef);
        _SmAp.put(__mvIdxNamedObj.id,__mvIdxNamedObj);
        _SmAp.put(__mvIdxString.id,__mvIdxString);
        _SmAp.put(__mvIdxUnnamedObj.id,__mvIdxUnnamedObj);
        _SmAp.put(__mvInteger.id,__mvInteger);
        _SmAp.put(__mvLong.id,__mvLong);
        _SmAp.put(__mvNamedObj.id,__mvNamedObj);
        _SmAp.put(__mvString.id,__mvString);
        _SmAp.put(__mvTestBasicNamedObjectFixed.id,__mvTestBasicNamedObjectFixed);
        _SmAp.put(__mvTestEnum.id,__mvTestEnum);
        _SmAp.put(__mvUnnamedObj.id,__mvUnnamedObj);
        _SmAp.put(__nonperString.id,__nonperString);
        _SmAp.put(__objRef.id,__objRef);
        _SmAp.put(__objRefHM.id,__objRefHM);
        _SmAp.put(__objRefMV.id,__objRefMV);
        _SmAp.put(__onOff.id,__onOff);
        _SmAp.put(__plainObjRef.id,__plainObjRef);
        _SmAp.put(__someRelationIndexed.id,__someRelationIndexed);
        _SmAp.put(__someRelationMV.id,__someRelationMV);
        _SmAp.put(__someRelationMVI.id,__someRelationMVI);
        _SmAp.put(__someRelationSV.id,__someRelationSV);
        _SmAp.put(__svBoolean.id,__svBoolean);
        _SmAp.put(__svDate.id,__svDate);
        _SmAp.put(__svDmcObject.id,__svDmcObject);
        _SmAp.put(__svDouble.id,__svDouble);
        _SmAp.put(__svExtendedRef.id,__svExtendedRef);
        _SmAp.put(__svFloat.id,__svFloat);
        _SmAp.put(__svInteger.id,__svInteger);
        _SmAp.put(__svLong.id,__svLong);
        _SmAp.put(__svNamedObj.id,__svNamedObj);
        _SmAp.put(__svString.id,__svString);
        _SmAp.put(__svTestBasicNamedObjectFixed.id,__svTestBasicNamedObjectFixed);
        _SmAp.put(__svTestEnum.id,__svTestEnum);
        _SmAp.put(__svUnnamedObj.id,__svUnnamedObj);
        _SmAp.put(__tmNamedObj.id,__tmNamedObj);
        _SmAp.put(__tmString.id,__tmString);
        _SmAp.put(__transString.id,__transString);
        _SmAp.put(__tsDate.id,__tsDate);
        _SmAp.put(__tsDouble.id,__tsDouble);
        _SmAp.put(__tsExtendedRef.id,__tsExtendedRef);
        _SmAp.put(__tsFloat.id,__tsFloat);
        _SmAp.put(__tsInteger.id,__tsInteger);
        _SmAp.put(__tsLong.id,__tsLong);
        _SmAp.put(__tsNamedObj.id,__tsNamedObj);
        _SmAp.put(__tsString.id,__tsString);
        _SmAp.put(__tsUnnamedObj.id,__tsUnnamedObj);
        _CmAp.put(__BaseObj.id,__BaseObj);
        _CmAp.put(__ClientCountFilter.id,__ClientCountFilter);
        _CmAp.put(__ClientCountFilterRequest.id,__ClientCountFilterRequest);
        _CmAp.put(__ExtendedRefHS.id,__ExtendedRefHS);
        _CmAp.put(__ExtendedRefMV.id,__ExtendedRefMV);
        _CmAp.put(__ExtendedRefMVIDX.id,__ExtendedRefMVIDX);
        _CmAp.put(__ExtendedRefSV.id,__ExtendedRefSV);
        _CmAp.put(__ExtendedRefTS.id,__ExtendedRefTS);
        _CmAp.put(__IntegerNamedObject.id,__IntegerNamedObject);
        _CmAp.put(__NameContainerTest.id,__NameContainerTest);
        _CmAp.put(__NamedObjHM.id,__NamedObjHM);
        _CmAp.put(__NamedObjHS.id,__NamedObjHS);
        _CmAp.put(__NamedObjMV.id,__NamedObjMV);
        _CmAp.put(__NamedObjMVIDX.id,__NamedObjMVIDX);
        _CmAp.put(__NamedObjSV.id,__NamedObjSV);
        _CmAp.put(__NamedObjTM.id,__NamedObjTM);
        _CmAp.put(__NamedObjTS.id,__NamedObjTS);
        _CmAp.put(__ObjWithRefs.id,__ObjWithRefs);
        _CmAp.put(__PrimitiveHM.id,__PrimitiveHM);
        _CmAp.put(__PrimitiveHS.id,__PrimitiveHS);
        _CmAp.put(__PrimitiveMV.id,__PrimitiveMV);
        _CmAp.put(__PrimitiveMVIDX.id,__PrimitiveMVIDX);
        _CmAp.put(__PrimitiveSV.id,__PrimitiveSV);
        _CmAp.put(__PrimitiveTM.id,__PrimitiveTM);
        _CmAp.put(__PrimitiveTS.id,__PrimitiveTS);
        _CmAp.put(__TestAbstractExtended.id,__TestAbstractExtended);
        _CmAp.put(__TestAbstractFixed.id,__TestAbstractFixed);
        _CmAp.put(__TestBasicAuxiliary.id,__TestBasicAuxiliary);
        _CmAp.put(__TestBasicNamedObjectExtended.id,__TestBasicNamedObjectExtended);
        _CmAp.put(__TestBasicNamedObjectFixed.id,__TestBasicNamedObjectFixed);
        _CmAp.put(__TestBasicObjectFixed.id,__TestBasicObjectFixed);
        _CmAp.put(__TestDerivedDiffSubpackage.id,__TestDerivedDiffSubpackage);
        _CmAp.put(__TestDerivedSubpackage.id,__TestDerivedSubpackage);
        _CmAp.put(__TestMultiLevelSubpackage.id,__TestMultiLevelSubpackage);
        _CmAp.put(__TestOneLevelSubpackage.id,__TestOneLevelSubpackage);
        _CmAp.put(__TestOneLevelSubpackageExtended.id,__TestOneLevelSubpackageExtended);
        _CmAp.put(__UUIDNamedObject.id,__UUIDNamedObject);
        _CmAp.put(__UnnamedObjHS.id,__UnnamedObjHS);
        _CmAp.put(__UnnamedObjMV.id,__UnnamedObjMV);
        _CmAp.put(__UnnamedObjMVIDX.id,__UnnamedObjMVIDX);
        _CmAp.put(__UnnamedObjSV.id,__UnnamedObjSV);
        _CmAp.put(__UnnamedObjTS.id,__UnnamedObjTS);
        _CmAp.put(__UsingIndexedAttributes.id,__UsingIndexedAttributes);
        _CmAp.put(__UsingObjRefHM.id,__UsingObjRefHM);
        _NmAp.put(DmcTypeDmtStringNameSTATIC.instance.getNameClass(),DmcTypeDmtStringNameSTATIC.instance);

        __slice1.addAttributeID(10000);
        __slice1.addAttributeID(10051);
        _SImAp.put("slice1",__slice1);

        __sliceOfNamed.addAttributeID(10141);
        __sliceOfNamed.addAttributeID(10142);
        __sliceOfNamed.addAttributeID(10909);
        _SImAp.put("sliceOfNamed",__sliceOfNamed);

        __TestAbstractFixed.addMust(__svString);

        __TestAbstractExtended.addMust(__svString);
        __TestAbstractExtended.addMay(__someRelationSV);
        __TestAbstractExtended.addMay(__someRelationMVI);
        __TestAbstractExtended.addMay(__intToStringMAP);
        __TestAbstractExtended.addMay(__hsStringName);
        __TestAbstractExtended.addMay(__clientCountFilters);

        __TestBasicObjectFixed.addMay(__svBoolean);
        __TestBasicObjectFixed.addMay(__mvBoolean);
        __TestBasicObjectFixed.addMay(__svDate);
        __TestBasicObjectFixed.addMay(__mvDate);
        __TestBasicObjectFixed.addMay(__hsDate);
        __TestBasicObjectFixed.addMay(__tsDate);
        __TestBasicObjectFixed.addMay(__svDouble);
        __TestBasicObjectFixed.addMay(__mvDouble);
        __TestBasicObjectFixed.addMay(__hsDouble);
        __TestBasicObjectFixed.addMay(__tsDouble);
        __TestBasicObjectFixed.addMay(__svFloat);
        __TestBasicObjectFixed.addMay(__mvFloat);
        __TestBasicObjectFixed.addMay(__hsFloat);
        __TestBasicObjectFixed.addMay(__tsFloat);
        __TestBasicObjectFixed.addMay(__svInteger);
        __TestBasicObjectFixed.addMay(__mvInteger);
        __TestBasicObjectFixed.addMay(__hsInteger);
        __TestBasicObjectFixed.addMay(__tsInteger);
        __TestBasicObjectFixed.addMay(__intToString);
        __TestBasicObjectFixed.addMay(__svLong);
        __TestBasicObjectFixed.addMay(__mvLong);
        __TestBasicObjectFixed.addMay(__hsLong);
        __TestBasicObjectFixed.addMay(__tsLong);
        __TestBasicObjectFixed.addMay(__svString);
        __TestBasicObjectFixed.addMay(__mvString);
        __TestBasicObjectFixed.addMay(__hsString);
        __TestBasicObjectFixed.addMay(__tsString);
        __TestBasicObjectFixed.addMay(__svTestBasicNamedObjectFixed);
        __TestBasicObjectFixed.addMay(__mvIdxUnnamedObj);

        __TestBasicNamedObjectFixed.addMust(MetaDMSAG.__name);
        __TestBasicNamedObjectFixed.addMust(__svString);
        __TestBasicNamedObjectFixed.addMay(__mvString);
        __TestBasicNamedObjectFixed.addMay(__mvTestBasicNamedObjectFixed);
        __TestBasicNamedObjectFixed.addMay(__mvIdxUnnamedObj);

        __TestBasicNamedObjectExtended.addMust(MetaDMSAG.__name);
        __TestBasicNamedObjectExtended.addMust(__svString);
        __TestBasicNamedObjectExtended.addMay(__mvString);
        __TestBasicNamedObjectExtended.addMay(__mvTestBasicNamedObjectFixed);

        __TestBasicAuxiliary.addMay(__svString);

        __TestOneLevelSubpackage.addMust(MetaDMSAG.__name);
        __TestOneLevelSubpackage.addMust(__svString);
        __TestOneLevelSubpackage.addMay(__mvString);

        __TestOneLevelSubpackageExtended.addMust(MetaDMSAG.__name);
        __TestOneLevelSubpackageExtended.addMust(__svString);
        __TestOneLevelSubpackageExtended.addMay(__mvString);

        __TestMultiLevelSubpackage.addMust(MetaDMSAG.__name);
        __TestMultiLevelSubpackage.addMust(__svString);
        __TestMultiLevelSubpackage.addMay(__mvString);

        __TestDerivedSubpackage.addMust(MetaDMSAG.__name);
        __TestDerivedSubpackage.addMust(__svString);
        __TestDerivedSubpackage.addMay(__mvString);

        __TestDerivedDiffSubpackage.addMust(MetaDMSAG.__name);
        __TestDerivedDiffSubpackage.addMust(__svString);
        __TestDerivedDiffSubpackage.addMay(__mvString);

        __UUIDNamedObject.addMust(MetaDMSAG.__uuidName);
        __UUIDNamedObject.addMay(__svBoolean);
        __UUIDNamedObject.addMay(__mvBoolean);
        __UUIDNamedObject.addMay(__svString);
        __UUIDNamedObject.addMay(__mvString);
        __UUIDNamedObject.addMay(__svDate);
        __UUIDNamedObject.addMay(__mvDate);
        __UUIDNamedObject.addMay(__svDouble);
        __UUIDNamedObject.addMay(__mvDouble);

        __IntegerNamedObject.addMust(MetaDMSAG.__integerName);
        __IntegerNamedObject.addMay(__svString);

        __NameContainerTest.addMust(__dmtStringName);
        __NameContainerTest.addMust(__anObjName);
        __NameContainerTest.addMay(__anotherDmtName);

        __BaseObj.addMust(MetaDMSAG.__name);
        __BaseObj.addMay(__svDate);

        __ObjWithRefs.addMust(MetaDMSAG.__name);
        __ObjWithRefs.addMust(__svString);
        __ObjWithRefs.addMust(__mvTestEnum);
        __ObjWithRefs.addMay(__anotherSVString);
        __ObjWithRefs.addMay(__objRef);
        __ObjWithRefs.addMay(__objRefMV);
        __ObjWithRefs.addMay(__objRefHM);
        __ObjWithRefs.addMay(__mvString);
        __ObjWithRefs.addMay(__intToString);
        __ObjWithRefs.addMay(__attrIDs);
        __ObjWithRefs.addMay(__hsDate);
        __ObjWithRefs.addMay(__hsString);
        __ObjWithRefs.addMay(__hsTestEnum);
        __ObjWithRefs.addMay(__hsNames);
        __ObjWithRefs.addMay(__nonperString);
        __ObjWithRefs.addMay(__transString);
        __ObjWithRefs.addMay(__indexedString);
        __ObjWithRefs.addMay(__indexedObjRef);
        __ObjWithRefs.addMay(__indexedPlainObjRef);
        __ObjWithRefs.addMay(__plainObjRef);
        __ObjWithRefs.addMay(__svTestEnum);
        __ObjWithRefs.addMay(__svBoolean);
        __ObjWithRefs.addMay(__onOff);
        __ObjWithRefs.addMay(__enabledDisabled);
        __ObjWithRefs.addMay(__someRelationSV);
        __ObjWithRefs.addMay(__someRelationMV);
        __ObjWithRefs.addMay(__someRelationMVI);
        __ObjWithRefs.addMay(__intToStringMAP);
        __ObjWithRefs.addMay(__hsStringName);
        __ObjWithRefs.addMay(__clientCountFilters);

        __ClientCountFilter.addMay(__OUIFilter);

        __ClientCountFilterRequest.addMust(DmpDMSAG.__requestID);
        __ClientCountFilterRequest.addMay(__clientCountFilter);

        __UsingIndexedAttributes.addMay(__someRelationIndexed);
        __UsingIndexedAttributes.addMay(__indexedString);

        __UsingObjRefHM.addMay(__objRefHM);

        __PrimitiveSV.addMay(__svString);

        __PrimitiveMV.addMay(__mvString);

        __PrimitiveMVIDX.addMay(__mvIdxString);

        __PrimitiveHM.addMay(__hmString);

        __PrimitiveTM.addMay(__tmString);

        __PrimitiveHS.addMay(__hsString);

        __PrimitiveTS.addMay(__tsString);

        __NamedObjSV.addMay(__svNamedObj);

        __NamedObjMV.addMay(__mvNamedObj);

        __NamedObjMVIDX.addMay(__mvIdxNamedObj);

        __NamedObjHM.addMay(__hmNamedObj);

        __NamedObjTM.addMay(__tmNamedObj);

        __NamedObjHS.addMay(__hsNamedObj);

        __NamedObjTS.addMay(__tsNamedObj);

        __UnnamedObjSV.addMay(__svUnnamedObj);

        __UnnamedObjMV.addMay(__mvUnnamedObj);

        __UnnamedObjMVIDX.addMay(__mvIdxUnnamedObj);

        __UnnamedObjHS.addMay(__hsUnnamedObj);

        __UnnamedObjTS.addMay(__tsUnnamedObj);

        __ExtendedRefSV.addMay(__svExtendedRef);

        __ExtendedRefMV.addMay(__mvExtendedRef);

        __ExtendedRefMVIDX.addMay(__mvIdxExtendedRef);

        __ExtendedRefHS.addMay(__hsExtendedRef);

        __ExtendedRefTS.addMay(__tsExtendedRef);


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


}
