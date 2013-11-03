package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGeneratorNewest.java:976)
import org.dmd.dmt.shared.generated.dmo.NamedObjMVIDXDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;           // For setNth of ObjWithRefs - (BaseDMWGeneratorNewest.java:1783)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // To support getMVCopy() for REFs ObjWithRefs-MULTI - (BaseDMWGeneratorNewest.java:995)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1104)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class NamedObjMVIDXDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public NamedObjMVIDXDMW() {
        super(new NamedObjMVIDXDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjMVIDX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public NamedObjMVIDXDMW(DmcTypeModifierMV mods) {
        super(new NamedObjMVIDXDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjMVIDX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public NamedObjMVIDXDMW getModificationRecorder(){
        NamedObjMVIDXDMW rc = new NamedObjMVIDXDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public NamedObjMVIDXDMW(NamedObjMVIDXDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjMVIDX);
    }

    public NamedObjMVIDXDMW cloneIt() {
        NamedObjMVIDXDMW rc = new NamedObjMVIDXDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NamedObjMVIDXDMO getDMO() {
        return((NamedObjMVIDXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected NamedObjMVIDXDMW(NamedObjMVIDXDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1540)
    public int getMvIdxNamedObjSize(){
        return(((NamedObjMVIDXDMO) core).getMvIdxNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1548)
    public boolean getMvIdxNamedObjIsEmpty(){
        if (((NamedObjMVIDXDMO) core).getMvIdxNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1558)
    public boolean getMvIdxNamedObjHasValue(){
        if (((NamedObjMVIDXDMO) core).getMvIdxNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the mvIdxNamedObj value at the specified index.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1800)
    public DmcAttribute<?> setNthMvIdxNamedObj(int index, ObjWithRefs value){
        if (value == null)
            return(((NamedObjMVIDXDMO) core).setNthMvIdxNamedObj(index, null));
        else
            return(((NamedObjMVIDXDMO) core).setNthMvIdxNamedObj(index, ((ObjWithRefsDMO)value.getDmcObject())));
    }

    /**
     * @return The ObjWithRefs object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1896)
    public ObjWithRefs getNthMvIdxNamedObj(int index){
        ObjWithRefsREF ref = ((NamedObjMVIDXDMO) core).getNthMvIdxNamedObj(index);
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * @return The reference to the ObjWithRefs object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1936)
    public ObjWithRefsREF getNthMvIdxNamedObjREF(int index){
        ObjWithRefsREF ref = ((NamedObjMVIDXDMO) core).getNthMvIdxNamedObjREF(index);
        return(ref);
    }

    /**
     * Removes the mvIdxNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2161)
    public void remMvIdxNamedObj(){
        ((NamedObjMVIDXDMO) core).remMvIdxNamedObj();
    }


}
