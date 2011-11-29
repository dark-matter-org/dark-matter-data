package org.dmd.dmt.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:515)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;         // DmpDMSAG
import org.dmd.dms.generated.dmo.MetaDMSAG;               // MetaDMSAG
import org.dmd.dms.generated.enums.ClassTypeEnum;         // Have class definitions
import org.dmd.dms.generated.enums.DataTypeEnum;          // Have class/attribute definitions
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Have attribute definitions

import org.dmd.dmt.shared.generated.types.*;


// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:95)
public class DmtDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmt";

    public final static DmcAttributeInfo __OUIFilter = new DmcAttributeInfo("OUIFilter", 10407, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __anObjName = new DmcAttributeInfo("anObjName", 10400, "NameContainer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __anotherDmtName = new DmcAttributeInfo("anotherDmtName", 10402, "DmtStringName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __anotherSVString = new DmcAttributeInfo("anotherSVString", 10143, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __attrIDs = new DmcAttributeInfo("attrIDs", 10406, "AttributeID", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __clientCountFilter = new DmcAttributeInfo("clientCountFilter", 10408, "ClientCountFilter", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmtStringName = new DmcAttributeInfo("dmtStringName", 10401, "DmtStringName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __enabledDisabled = new DmcAttributeInfo("enabledDisabled", 10420, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsDate = new DmcAttributeInfo("hsDate", 10012, "Date", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsDouble = new DmcAttributeInfo("hsDouble", 10042, "Double", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsFloat = new DmcAttributeInfo("hsFloat", 10052, "Float", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsInteger = new DmcAttributeInfo("hsInteger", 10062, "Integer", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsLong = new DmcAttributeInfo("hsLong", 10112, "Long", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsNames = new DmcAttributeInfo("hsNames", 10411, "NameContainer", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsString = new DmcAttributeInfo("hsString", 10142, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __hsTestEnum = new DmcAttributeInfo("hsTestEnum", 10410, "DmtTestEnum", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __indexedObjRef = new DmcAttributeInfo("indexedObjRef", 10415, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10);
    public final static DmcAttributeInfo __indexedPlainObjRef = new DmcAttributeInfo("indexedPlainObjRef", 10416, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 10);
    public final static DmcAttributeInfo __indexedString = new DmcAttributeInfo("indexedString", 10414, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 5);
    public final static DmcAttributeInfo __intToString = new DmcAttributeInfo("intToString", 10080, "IntegerToString", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvBoolean = new DmcAttributeInfo("mvBoolean", 10001, "Boolean", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvDate = new DmcAttributeInfo("mvDate", 10011, "Date", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvDmcObject = new DmcAttributeInfo("mvDmcObject", 10021, "DmcObject", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvDouble = new DmcAttributeInfo("mvDouble", 10041, "Double", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvFloat = new DmcAttributeInfo("mvFloat", 10051, "Float", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvInteger = new DmcAttributeInfo("mvInteger", 10061, "Integer", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvLong = new DmcAttributeInfo("mvLong", 10111, "Long", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvString = new DmcAttributeInfo("mvString", 10141, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvTestBasicNamedObjectFixed = new DmcAttributeInfo("mvTestBasicNamedObjectFixed", 10301, "TestBasicNamedObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mvTestEnum = new DmcAttributeInfo("mvTestEnum", 10409, "DmtTestEnum", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nonperString = new DmcAttributeInfo("nonperString", 10413, "String", ValueTypeEnum.HASHSET, DataTypeEnum.NONPERSISTENT);
    public final static DmcAttributeInfo __objRef = new DmcAttributeInfo("objRef", 10403, "ObjWithRefs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __objRefHM = new DmcAttributeInfo("objRefHM", 10405, "ObjWithRefs", ValueTypeEnum.HASHMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __objRefMV = new DmcAttributeInfo("objRefMV", 10404, "ObjWithRefs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __onOff = new DmcAttributeInfo("onOff", 10419, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __plainObjRef = new DmcAttributeInfo("plainObjRef", 10417, "TestBasicObjectFixed", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __someRelation = new DmcAttributeInfo("someRelation", 10421, "SomeRelation", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svBoolean = new DmcAttributeInfo("svBoolean", 10000, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svDate = new DmcAttributeInfo("svDate", 10010, "Date", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svDmcObject = new DmcAttributeInfo("svDmcObject", 10020, "DmcObject", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svDouble = new DmcAttributeInfo("svDouble", 10040, "Double", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svFloat = new DmcAttributeInfo("svFloat", 10050, "Float", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svInteger = new DmcAttributeInfo("svInteger", 10060, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svLong = new DmcAttributeInfo("svLong", 10110, "Long", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString", 10140, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svTestBasicNamedObjectFixed = new DmcAttributeInfo("svTestBasicNamedObjectFixed", 10300, "TestBasicNamedObjectFixed", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __svTestEnum = new DmcAttributeInfo("svTestEnum", 10418, "DmtTestEnum", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __transString = new DmcAttributeInfo("transString", 10412, "String", ValueTypeEnum.HASHSET, DataTypeEnum.TRANSIENT);
    public final static DmcAttributeInfo __tsDate = new DmcAttributeInfo("tsDate", 10013, "Date", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsDouble = new DmcAttributeInfo("tsDouble", 10043, "Double", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsFloat = new DmcAttributeInfo("tsFloat", 10053, "Float", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsInteger = new DmcAttributeInfo("tsInteger", 10063, "Integer", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsLong = new DmcAttributeInfo("tsLong", 10113, "Long", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tsString = new DmcAttributeInfo("tsString", 10153, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcClassInfo __BaseObj = new DmcClassInfo("BaseObj", 10015, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __ObjWithRefs = new DmcClassInfo("ObjWithRefs", 10016, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__BaseObj,MetaDMSAG.__name);
    public final static DmcClassInfo __ClientCountFilter = new DmcClassInfo("ClientCountFilter", 10017, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __ClientCountFilterRequest = new DmcClassInfo("ClientCountFilterRequest", 10018, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,DmpDMSAG.__Request,null);
    public final static DmcClassInfo __IntegerNamedObject = new DmcClassInfo("IntegerNamedObject", 10013, ClassTypeEnum.STRUCTURAL, DataTypeEnum.NONPERSISTENT,null,MetaDMSAG.__integerName);
    public final static DmcClassInfo __NameContainerTest = new DmcClassInfo("NameContainerTest", 10014, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
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
        _SmAp.put(__dmtStringName.id,__dmtStringName);
        _SmAp.put(__enabledDisabled.id,__enabledDisabled);
        _SmAp.put(__hsDate.id,__hsDate);
        _SmAp.put(__hsDouble.id,__hsDouble);
        _SmAp.put(__hsFloat.id,__hsFloat);
        _SmAp.put(__hsInteger.id,__hsInteger);
        _SmAp.put(__hsLong.id,__hsLong);
        _SmAp.put(__hsNames.id,__hsNames);
        _SmAp.put(__hsString.id,__hsString);
        _SmAp.put(__hsTestEnum.id,__hsTestEnum);
        _SmAp.put(__indexedObjRef.id,__indexedObjRef);
        _SmAp.put(__indexedPlainObjRef.id,__indexedPlainObjRef);
        _SmAp.put(__indexedString.id,__indexedString);
        _SmAp.put(__intToString.id,__intToString);
        _SmAp.put(__mvBoolean.id,__mvBoolean);
        _SmAp.put(__mvDate.id,__mvDate);
        _SmAp.put(__mvDmcObject.id,__mvDmcObject);
        _SmAp.put(__mvDouble.id,__mvDouble);
        _SmAp.put(__mvFloat.id,__mvFloat);
        _SmAp.put(__mvInteger.id,__mvInteger);
        _SmAp.put(__mvLong.id,__mvLong);
        _SmAp.put(__mvString.id,__mvString);
        _SmAp.put(__mvTestBasicNamedObjectFixed.id,__mvTestBasicNamedObjectFixed);
        _SmAp.put(__mvTestEnum.id,__mvTestEnum);
        _SmAp.put(__nonperString.id,__nonperString);
        _SmAp.put(__objRef.id,__objRef);
        _SmAp.put(__objRefHM.id,__objRefHM);
        _SmAp.put(__objRefMV.id,__objRefMV);
        _SmAp.put(__onOff.id,__onOff);
        _SmAp.put(__plainObjRef.id,__plainObjRef);
        _SmAp.put(__someRelation.id,__someRelation);
        _SmAp.put(__svBoolean.id,__svBoolean);
        _SmAp.put(__svDate.id,__svDate);
        _SmAp.put(__svDmcObject.id,__svDmcObject);
        _SmAp.put(__svDouble.id,__svDouble);
        _SmAp.put(__svFloat.id,__svFloat);
        _SmAp.put(__svInteger.id,__svInteger);
        _SmAp.put(__svLong.id,__svLong);
        _SmAp.put(__svString.id,__svString);
        _SmAp.put(__svTestBasicNamedObjectFixed.id,__svTestBasicNamedObjectFixed);
        _SmAp.put(__svTestEnum.id,__svTestEnum);
        _SmAp.put(__transString.id,__transString);
        _SmAp.put(__tsDate.id,__tsDate);
        _SmAp.put(__tsDouble.id,__tsDouble);
        _SmAp.put(__tsFloat.id,__tsFloat);
        _SmAp.put(__tsInteger.id,__tsInteger);
        _SmAp.put(__tsLong.id,__tsLong);
        _SmAp.put(__tsString.id,__tsString);
        _CmAp.put(__BaseObj.id,__BaseObj);
        _CmAp.put(__ClientCountFilter.id,__ClientCountFilter);
        _CmAp.put(__ClientCountFilterRequest.id,__ClientCountFilterRequest);
        _CmAp.put(__IntegerNamedObject.id,__IntegerNamedObject);
        _CmAp.put(__NameContainerTest.id,__NameContainerTest);
        _CmAp.put(__ObjWithRefs.id,__ObjWithRefs);
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
        _NmAp.put(DmcTypeDmtStringNameSTATIC.instance.getNameClass(),DmcTypeDmtStringNameSTATIC.instance);

        __slice1.addAttributeID(10000);
        __slice1.addAttributeID(10051);
        _SImAp.put("slice1",__slice1);

        __sliceOfNamed.addAttributeID(10140);
        __sliceOfNamed.addAttributeID(10141);
        __sliceOfNamed.addAttributeID(10409);
        _SImAp.put("sliceOfNamed",__sliceOfNamed);

        __TestAbstractFixed.addMust(__svString);

        __TestAbstractExtended.addMust(__svString);

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

        __TestBasicNamedObjectFixed.addMust(MetaDMSAG.__name);
        __TestBasicNamedObjectFixed.addMust(__svString);
        __TestBasicNamedObjectFixed.addMay(__mvString);
        __TestBasicNamedObjectFixed.addMay(__mvTestBasicNamedObjectFixed);

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
        __ObjWithRefs.addMay(__someRelation);

        __ClientCountFilter.addMay(__OUIFilter);

        __ClientCountFilterRequest.addMust(DmpDMSAG.__requestID);
        __ClientCountFilterRequest.addMay(__clientCountFilter);


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


}

