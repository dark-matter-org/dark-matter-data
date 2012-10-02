package org.dmd.dmt.client.generated;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapperNEW(GxtDMWGenerator.java:211)
import org.dmd.dmc.DmcObject;                                  // The object we wrap - (GxtDMWGenerator.java:252)
import org.dmd.dmt.client.generated.gxt.*;                     // Access to the wrappers for the dmt schema - (GxtDMWGenerator.java:310)
import org.dmd.dmt.shared.generated.dmo.*;                     // Access to the DMOs for the dmt schema - (GxtDMWGenerator.java:311)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                  // The wrapper we return - (GxtDMWGenerator.java:253)
import org.dmd.mvw.client.gxt.dmw.GxtWrapperFactoryIF;         // The standard wrapper util interface - (GxtDMWGenerator.java:254)

// Generated from: org.dmd.mvw.gxt.dmw.generators.GxtDMWGenerator.createAutoWrapperNEW(GxtDMWGenerator.java:214)
public class DmtGxtWrapperFactory implements GxtWrapperFactoryIF {

    static final int ClientCountFilterID = 10017;
    static final int ExtendedRefHSID = 10406;
    static final int ExtendedRefMVID = 10402;
    static final int ExtendedRefMVIDXID = 10403;
    static final int ExtendedRefSVID = 10401;
    static final int ExtendedRefTSID = 10407;
    static final int IntegerNamedObjectID = 10013;
    static final int NameContainerTestID = 10014;
    static final int NamedObjHMID = 10204;
    static final int NamedObjHSID = 10206;
    static final int NamedObjMVID = 10202;
    static final int NamedObjMVIDXID = 10203;
    static final int NamedObjSVID = 10201;
    static final int NamedObjTMID = 10205;
    static final int NamedObjTSID = 10207;
    static final int ObjWithRefsID = 10016;
    static final int PrimitiveHMID = 10104;
    static final int PrimitiveHSID = 10106;
    static final int PrimitiveMVID = 10102;
    static final int PrimitiveMVIDXID = 10103;
    static final int PrimitiveSVID = 10101;
    static final int PrimitiveTMID = 10105;
    static final int PrimitiveTSID = 10107;
    static final int TestBasicAuxiliaryID = 10006;
    static final int TestBasicNamedObjectExtendedID = 10005;
    static final int TestBasicNamedObjectFixedID = 10004;
    static final int TestBasicObjectFixedID = 10003;
    static final int TestDerivedDiffSubpackageID = 10011;
    static final int TestDerivedSubpackageID = 10010;
    static final int TestMultiLevelSubpackageID = 10009;
    static final int TestOneLevelSubpackageID = 10007;
    static final int TestOneLevelSubpackageExtendedID = 10008;
    static final int UUIDNamedObjectID = 10012;
    static final int UnnamedObjHSID = 10306;
    static final int UnnamedObjMVID = 10302;
    static final int UnnamedObjMVIDXID = 10303;
    static final int UnnamedObjSVID = 10301;
    static final int UnnamedObjTSID = 10307;
    static final int UsingIndexedAttributesID = 10019;
    static final int UsingObjRefHMID = 10020;


    static DmtGxtWrapperFactory instance;

    private DmtGxtWrapperFactory(){

    }

    static public DmtGxtWrapperFactory instance(){
        if (instance == null)
            instance = new DmtGxtWrapperFactory();
        return(instance);
    }

    public GxtWrapper wrapObject(DmcObject obj){

        GxtWrapper rc = null;

        switch(obj.getConstructionClassInfo().id){
        case ClientCountFilterID:
            rc = new ClientCountFilterGXT((ClientCountFilterDMO)obj);
            break;
        case ExtendedRefHSID:
            rc = new ExtendedRefHSGXT((ExtendedRefHSDMO)obj);
            break;
        case ExtendedRefMVID:
            rc = new ExtendedRefMVGXT((ExtendedRefMVDMO)obj);
            break;
        case ExtendedRefMVIDXID:
            rc = new ExtendedRefMVIDXGXT((ExtendedRefMVIDXDMO)obj);
            break;
        case ExtendedRefSVID:
            rc = new ExtendedRefSVGXT((ExtendedRefSVDMO)obj);
            break;
        case ExtendedRefTSID:
            rc = new ExtendedRefTSGXT((ExtendedRefTSDMO)obj);
            break;
        case IntegerNamedObjectID:
            rc = new IntegerNamedObjectGXT((IntegerNamedObjectDMO)obj);
            break;
        case NameContainerTestID:
            rc = new NameContainerTestGXT((NameContainerTestDMO)obj);
            break;
        case NamedObjHMID:
            rc = new NamedObjHMGXT((NamedObjHMDMO)obj);
            break;
        case NamedObjHSID:
            rc = new NamedObjHSGXT((NamedObjHSDMO)obj);
            break;
        case NamedObjMVID:
            rc = new NamedObjMVGXT((NamedObjMVDMO)obj);
            break;
        case NamedObjMVIDXID:
            rc = new NamedObjMVIDXGXT((NamedObjMVIDXDMO)obj);
            break;
        case NamedObjSVID:
            rc = new NamedObjSVGXT((NamedObjSVDMO)obj);
            break;
        case NamedObjTMID:
            rc = new NamedObjTMGXT((NamedObjTMDMO)obj);
            break;
        case NamedObjTSID:
            rc = new NamedObjTSGXT((NamedObjTSDMO)obj);
            break;
        case ObjWithRefsID:
            rc = new ObjWithRefsGXT((ObjWithRefsDMO)obj);
            break;
        case PrimitiveHMID:
            rc = new PrimitiveHMGXT((PrimitiveHMDMO)obj);
            break;
        case PrimitiveHSID:
            rc = new PrimitiveHSGXT((PrimitiveHSDMO)obj);
            break;
        case PrimitiveMVID:
            rc = new PrimitiveMVGXT((PrimitiveMVDMO)obj);
            break;
        case PrimitiveMVIDXID:
            rc = new PrimitiveMVIDXGXT((PrimitiveMVIDXDMO)obj);
            break;
        case PrimitiveSVID:
            rc = new PrimitiveSVGXT((PrimitiveSVDMO)obj);
            break;
        case PrimitiveTMID:
            rc = new PrimitiveTMGXT((PrimitiveTMDMO)obj);
            break;
        case PrimitiveTSID:
            rc = new PrimitiveTSGXT((PrimitiveTSDMO)obj);
            break;
        case TestBasicNamedObjectExtendedID:
            rc = new TestBasicNamedObjectExtendedGXT((TestBasicNamedObjectExtendedDMO)obj);
            break;
        case TestBasicNamedObjectFixedID:
            rc = new TestBasicNamedObjectFixedGXT((TestBasicNamedObjectFixedDMO)obj);
            break;
        case TestBasicObjectFixedID:
            rc = new TestBasicObjectFixedGXT((TestBasicObjectFixedDMO)obj);
            break;
        case TestDerivedDiffSubpackageID:
            rc = new TestDerivedDiffSubpackageGXT((TestDerivedDiffSubpackageDMO)obj);
            break;
        case TestDerivedSubpackageID:
            rc = new TestDerivedSubpackageGXT((TestDerivedSubpackageDMO)obj);
            break;
        case TestMultiLevelSubpackageID:
            rc = new TestMultiLevelSubpackageGXT((TestMultiLevelSubpackageDMO)obj);
            break;
        case TestOneLevelSubpackageID:
            rc = new TestOneLevelSubpackageGXT((TestOneLevelSubpackageDMO)obj);
            break;
        case TestOneLevelSubpackageExtendedID:
            rc = new TestOneLevelSubpackageExtendedGXT((TestOneLevelSubpackageExtendedDMO)obj);
            break;
        case UUIDNamedObjectID:
            rc = new UUIDNamedObjectGXT((UUIDNamedObjectDMO)obj);
            break;
        case UnnamedObjHSID:
            rc = new UnnamedObjHSGXT((UnnamedObjHSDMO)obj);
            break;
        case UnnamedObjMVID:
            rc = new UnnamedObjMVGXT((UnnamedObjMVDMO)obj);
            break;
        case UnnamedObjMVIDXID:
            rc = new UnnamedObjMVIDXGXT((UnnamedObjMVIDXDMO)obj);
            break;
        case UnnamedObjSVID:
            rc = new UnnamedObjSVGXT((UnnamedObjSVDMO)obj);
            break;
        case UnnamedObjTSID:
            rc = new UnnamedObjTSGXT((UnnamedObjTSDMO)obj);
            break;
        case UsingIndexedAttributesID:
            rc = new UsingIndexedAttributesGXT((UsingIndexedAttributesDMO)obj);
            break;
        case UsingObjRefHMID:
            rc = new UsingObjRefHMGXT((UsingObjRefHMDMO)obj);
            break;
        }

        return(rc);
    }

}

