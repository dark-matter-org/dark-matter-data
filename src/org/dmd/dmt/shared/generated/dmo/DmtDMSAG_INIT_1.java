package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Required attribute from DmpDMSAG - (DmoCompactSchemaFormatter.java:562)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;         // Optional attribute (1): userName from DmrbaseDMSAG - (DmoCompactSchemaFormatter.java:566)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // For Meta references - (DmoCompactSchemaFormatter.java:552)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                  // Required attribute from DmtDMSAG - (DmoCompactSchemaFormatter.java:562)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DmtDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- TestAbstractFixed
        DmtDMSAG.__TestAbstractFixed.addMust(DmtDMSAG.__svString);

    // 2 -- TestAbstractExtended
        DmtDMSAG.__TestAbstractExtended.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__TestAbstractExtended.addMay(DmtDMSAG.__clientCountFilters);
        DmtDMSAG.__TestAbstractExtended.addMay(DmtDMSAG.__hsStringName);
        DmtDMSAG.__TestAbstractExtended.addMay(DmtDMSAG.__intToStringMAP);
        DmtDMSAG.__TestAbstractExtended.addMay(DmtDMSAG.__someRelationMVI);
        DmtDMSAG.__TestAbstractExtended.addMay(DmtDMSAG.__someRelationSV);

    // 3 -- TestBasicObjectFixed
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__hsDate);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__hsDouble);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__hsFloat);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__hsInteger);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__hsLong);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__hsString);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__hsTestEnum);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__intToString);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__mvBoolean);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__mvDate);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__mvDouble);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__mvFloat);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__mvIdxUnnamedObj);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__mvInteger);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__mvLong);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__mvString);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__svBoolean);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__svDate);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__svDouble);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__svFloat);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__svInteger);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__svLong);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__svString);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__svTestBasicNamedObjectFixed);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__tsDate);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__tsDouble);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__tsFloat);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__tsInteger);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__tsLong);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmtDMSAG.__tsString);
        DmtDMSAG.__TestBasicObjectFixed.addMay(DmrbaseDMSAG.__userName);

    // 4 -- TestBasicNamedObjectFixed
        DmtDMSAG.__TestBasicNamedObjectFixed.addMust(MetaDMSAG.__name);
        DmtDMSAG.__TestBasicNamedObjectFixed.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__TestBasicNamedObjectFixed.addMay(DmtDMSAG.__mvIdxUnnamedObj);
        DmtDMSAG.__TestBasicNamedObjectFixed.addMay(DmtDMSAG.__mvString);
        DmtDMSAG.__TestBasicNamedObjectFixed.addMay(DmtDMSAG.__mvTestBasicNamedObjectFixed);

    // 5 -- TestBasicNamedObjectExtended
        DmtDMSAG.__TestBasicNamedObjectExtended.addMust(MetaDMSAG.__name);
        DmtDMSAG.__TestBasicNamedObjectExtended.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__TestBasicNamedObjectExtended.addMay(DmtDMSAG.__mvString);
        DmtDMSAG.__TestBasicNamedObjectExtended.addMay(DmtDMSAG.__mvTestBasicNamedObjectFixed);

    // 6 -- TestBasicAuxiliary
        DmtDMSAG.__TestBasicAuxiliary.addMay(DmtDMSAG.__svString);

    // 7 -- TestOneLevelSubpackage
        DmtDMSAG.__TestOneLevelSubpackage.addMust(MetaDMSAG.__name);
        DmtDMSAG.__TestOneLevelSubpackage.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__TestOneLevelSubpackage.addMay(DmtDMSAG.__mvString);

    // 8 -- TestOneLevelSubpackageExtended
        DmtDMSAG.__TestOneLevelSubpackageExtended.addMust(MetaDMSAG.__name);
        DmtDMSAG.__TestOneLevelSubpackageExtended.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__TestOneLevelSubpackageExtended.addMay(DmtDMSAG.__mvString);

    // 9 -- TestMultiLevelSubpackage
        DmtDMSAG.__TestMultiLevelSubpackage.addMust(MetaDMSAG.__name);
        DmtDMSAG.__TestMultiLevelSubpackage.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__TestMultiLevelSubpackage.addMay(DmtDMSAG.__mvString);

    // 10 -- TestDerivedSubpackage
        DmtDMSAG.__TestDerivedSubpackage.addMust(MetaDMSAG.__name);
        DmtDMSAG.__TestDerivedSubpackage.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__TestDerivedSubpackage.addMay(DmtDMSAG.__mvString);

    // 11 -- TestDerivedDiffSubpackage
        DmtDMSAG.__TestDerivedDiffSubpackage.addMust(MetaDMSAG.__name);
        DmtDMSAG.__TestDerivedDiffSubpackage.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__TestDerivedDiffSubpackage.addMay(DmtDMSAG.__mvString);

    // 12 -- UUIDNamedObject
        DmtDMSAG.__UUIDNamedObject.addMust(MetaDMSAG.__uuidName);
        DmtDMSAG.__UUIDNamedObject.addMay(DmtDMSAG.__mvBoolean);
        DmtDMSAG.__UUIDNamedObject.addMay(DmtDMSAG.__mvDate);
        DmtDMSAG.__UUIDNamedObject.addMay(DmtDMSAG.__mvDouble);
        DmtDMSAG.__UUIDNamedObject.addMay(DmtDMSAG.__mvString);
        DmtDMSAG.__UUIDNamedObject.addMay(DmtDMSAG.__svBoolean);
        DmtDMSAG.__UUIDNamedObject.addMay(DmtDMSAG.__svDate);
        DmtDMSAG.__UUIDNamedObject.addMay(DmtDMSAG.__svDouble);
        DmtDMSAG.__UUIDNamedObject.addMay(DmtDMSAG.__svString);

    // 13 -- IntegerNamedObject
        DmtDMSAG.__IntegerNamedObject.addMust(MetaDMSAG.__integerName);
        DmtDMSAG.__IntegerNamedObject.addMay(DmtDMSAG.__svString);

    // 14 -- NameContainerTest
        DmtDMSAG.__NameContainerTest.addMust(DmtDMSAG.__anObjName);
        DmtDMSAG.__NameContainerTest.addMust(DmtDMSAG.__dmtStringName);
        DmtDMSAG.__NameContainerTest.addMay(DmtDMSAG.__anotherDmtName);

    // 15 -- BaseObj
        DmtDMSAG.__BaseObj.addMust(MetaDMSAG.__name);
        DmtDMSAG.__BaseObj.addMay(DmtDMSAG.__svDate);

    // 16 -- ObjWithRefs
        DmtDMSAG.__ObjWithRefs.addMust(DmtDMSAG.__mvTestEnum);
        DmtDMSAG.__ObjWithRefs.addMust(MetaDMSAG.__name);
        DmtDMSAG.__ObjWithRefs.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__anotherSVString);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__attrIDs);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__clientCountFilters);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__enabledDisabled);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__hsDate);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__hsNames);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__hsString);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__hsStringName);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__hsTestEnum);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__indexedObjRef);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__indexedPlainObjRef);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__indexedString);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__intToString);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__intToStringMAP);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__limitedStringMV);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__limitedStringSV);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__mvString);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__nonperString);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__objRef);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__objRefHM);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__objRefMV);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__onOff);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__plainObjRef);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__someRelationMV);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__someRelationMVI);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__someRelationSV);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__svBoolean);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__svDate);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__svTestEnum);
        DmtDMSAG.__ObjWithRefs.addMay(DmtDMSAG.__transString);

    // 17 -- ClientCountFilter
        DmtDMSAG.__ClientCountFilter.addMay(DmtDMSAG.__OUIFilter);

    // 18 -- ClientCountFilterRequest
        DmtDMSAG.__ClientCountFilterRequest.addMust(DmpDMSAG.__requestID);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmtDMSAG.__clientCountFilter);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__handlerID);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__notifyOriginator);
        DmtDMSAG.__ClientCountFilterRequest.addMay(MetaDMSAG.__nvp);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__originatorID);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__readableFormat);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__responseFormat);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__sessionID);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__timeMS);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__timeoutSeconds);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmpDMSAG.__trackingEnabled);
        DmtDMSAG.__ClientCountFilterRequest.addMay(DmrbaseDMSAG.__userName);

    // 19 -- UsingIndexedAttributes
        DmtDMSAG.__UsingIndexedAttributes.addMay(DmtDMSAG.__indexedString);
        DmtDMSAG.__UsingIndexedAttributes.addMay(DmtDMSAG.__someRelationIndexed);

    // 20 -- UsingObjRefHM
        DmtDMSAG.__UsingObjRefHM.addMay(DmtDMSAG.__objRefHM);

    // 21 -- ObjWithRefsDerivedA
        DmtDMSAG.__ObjWithRefsDerivedA.addMust(DmtDMSAG.__mvTestEnum);
        DmtDMSAG.__ObjWithRefsDerivedA.addMust(MetaDMSAG.__name);
        DmtDMSAG.__ObjWithRefsDerivedA.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__anotherSVString);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__attrIDs);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__clientCountFilters);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__enabledDisabled);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__hsDate);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__hsNames);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__hsString);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__hsStringName);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__hsTestEnum);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__indexedObjRef);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__indexedPlainObjRef);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__indexedString);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__intToString);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__intToStringMAP);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__limitedStringMV);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__limitedStringSV);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__mvString);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__nonperString);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__objRef);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__objRefHM);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__objRefMV);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__onOff);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__plainObjRef);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__someRelationMV);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__someRelationMVI);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__someRelationSV);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__svBoolean);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__svDate);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__svTestEnum);
        DmtDMSAG.__ObjWithRefsDerivedA.addMay(DmtDMSAG.__transString);

    // 22 -- ObjWithRefsDerivedB
        DmtDMSAG.__ObjWithRefsDerivedB.addMust(DmtDMSAG.__mvTestEnum);
        DmtDMSAG.__ObjWithRefsDerivedB.addMust(MetaDMSAG.__name);
        DmtDMSAG.__ObjWithRefsDerivedB.addMust(DmtDMSAG.__svString);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__anotherSVString);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__attrIDs);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__clientCountFilters);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__enabledDisabled);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__hsDate);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__hsNames);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__hsString);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__hsStringName);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__hsTestEnum);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__indexedObjRef);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__indexedPlainObjRef);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__indexedString);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__intToString);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__intToStringMAP);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__limitedStringMV);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__limitedStringSV);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__mvString);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__nonperString);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__objRef);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__objRefHM);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__objRefMV);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__onOff);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__plainObjRef);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__someRelationMV);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__someRelationMVI);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__someRelationSV);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__svBoolean);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__svDate);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__svTestEnum);
        DmtDMSAG.__ObjWithRefsDerivedB.addMay(DmtDMSAG.__transString);

    // 23 -- PrimitiveSV
        DmtDMSAG.__PrimitiveSV.addMay(DmtDMSAG.__svString);

    // 24 -- PrimitiveMV
        DmtDMSAG.__PrimitiveMV.addMay(DmtDMSAG.__mvString);

    // 25 -- PrimitiveMVIDX
        DmtDMSAG.__PrimitiveMVIDX.addMay(DmtDMSAG.__mvIdxString);

    // 26 -- PrimitiveHM
        DmtDMSAG.__PrimitiveHM.addMay(DmtDMSAG.__hmString);

    // 27 -- PrimitiveTM
        DmtDMSAG.__PrimitiveTM.addMay(DmtDMSAG.__tmString);

    // 28 -- PrimitiveHS
        DmtDMSAG.__PrimitiveHS.addMay(DmtDMSAG.__hsString);

    // 29 -- PrimitiveTS
        DmtDMSAG.__PrimitiveTS.addMay(DmtDMSAG.__tsString);

    // 30 -- NamedObjSV
        DmtDMSAG.__NamedObjSV.addMay(DmtDMSAG.__svNamedObj);

    // 31 -- NamedObjMV
        DmtDMSAG.__NamedObjMV.addMay(DmtDMSAG.__mvNamedObj);

    // 32 -- NamedObjMVIDX
        DmtDMSAG.__NamedObjMVIDX.addMay(DmtDMSAG.__mvIdxNamedObj);

    // 33 -- NamedObjHM
        DmtDMSAG.__NamedObjHM.addMay(DmtDMSAG.__hmNamedObj);

    // 34 -- NamedObjTM
        DmtDMSAG.__NamedObjTM.addMay(DmtDMSAG.__tmNamedObj);

    // 35 -- NamedObjHS
        DmtDMSAG.__NamedObjHS.addMay(DmtDMSAG.__hsNamedObj);

    // 36 -- NamedObjTS
        DmtDMSAG.__NamedObjTS.addMay(DmtDMSAG.__tsNamedObj);

    // 37 -- UnnamedObjSV
        DmtDMSAG.__UnnamedObjSV.addMay(DmtDMSAG.__svUnnamedObj);

    // 38 -- UnnamedObjMV
        DmtDMSAG.__UnnamedObjMV.addMay(DmtDMSAG.__mvUnnamedObj);

    // 39 -- UnnamedObjMVIDX
        DmtDMSAG.__UnnamedObjMVIDX.addMay(DmtDMSAG.__mvIdxUnnamedObj);

    // 40 -- UnnamedObjHS
        DmtDMSAG.__UnnamedObjHS.addMay(DmtDMSAG.__hsUnnamedObj);

    // 41 -- UnnamedObjTS
        DmtDMSAG.__UnnamedObjTS.addMay(DmtDMSAG.__tsUnnamedObj);

    // 42 -- ExtendedRefSV
        DmtDMSAG.__ExtendedRefSV.addMay(DmtDMSAG.__svExtendedRef);

    // 43 -- ExtendedRefMV
        DmtDMSAG.__ExtendedRefMV.addMay(DmtDMSAG.__mvExtendedRef);

    // 44 -- ExtendedRefMVIDX
        DmtDMSAG.__ExtendedRefMVIDX.addMay(DmtDMSAG.__mvIdxExtendedRef);

    // 45 -- ExtendedRefHS
        DmtDMSAG.__ExtendedRefHS.addMay(DmtDMSAG.__hsExtendedRef);

    // 46 -- ExtendedRefTS
        DmtDMSAG.__ExtendedRefTS.addMay(DmtDMSAG.__tsExtendedRef);

    // 47 -- ParseTest
        DmtDMSAG.__ParseTest.addMay(DmtDMSAG.__mvIdxNamedObj);
        DmtDMSAG.__ParseTest.addMay(DmtDMSAG.__mvIdxUnnamedObj);
        DmtDMSAG.__ParseTest.addMay(DmtDMSAG.__mvUnnamedObj);
        DmtDMSAG.__ParseTest.addMay(DmtDMSAG.__svBoolean);
        DmtDMSAG.__ParseTest.addMay(DmtDMSAG.__svUnnamedObj);

    // 48 -- ComplexTypeTest
        DmtDMSAG.__ComplexTypeTest.addMay(DmtDMSAG.__mvComplex);
        DmtDMSAG.__ComplexTypeTest.addMay(DmtDMSAG.__svComplex);


    }

}

