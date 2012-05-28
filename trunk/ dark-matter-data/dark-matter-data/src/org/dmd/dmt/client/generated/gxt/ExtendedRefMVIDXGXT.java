package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dms.generated.dmo.MetaDMSAG;                          // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVIDXDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmt.shared.generated.types.SomeRelation;              // DMO reference - (BaseDMWGeneratorNewest.java:958)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                        // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class ExtendedRefMVIDXGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:455)
    public ExtendedRefMVIDXGXT() {
        super(new ExtendedRefMVIDXDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:460)
    public ExtendedRefMVIDXGXT(DmcTypeModifierMV mods) {
        super(new ExtendedRefMVIDXDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public ExtendedRefMVIDXGXT getModificationRecorder(){
        ExtendedRefMVIDXGXT rc = new ExtendedRefMVIDXGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public ExtendedRefMVIDXDMO getDMO() {
        return((ExtendedRefMVIDXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:540)
    public ExtendedRefMVIDXGXT(ExtendedRefMVIDXDMO obj) {
        super(obj);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getMvIdxExtendedRefSize(){
        return(((ExtendedRefMVIDXDMO) core).getMvIdxExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getMvIdxExtendedRefIsEmpty(){
        if (((ExtendedRefMVIDXDMO) core).getMvIdxExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getMvIdxExtendedRefHasValue(){
        if (((ExtendedRefMVIDXDMO) core).getMvIdxExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the mvIdxExtendedRef value at the specified index.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1756)
    public DmcAttribute<?> setNthMvIdxExtendedRef(int index, SomeRelation value){
        return(((ExtendedRefMVIDXDMO) core).setNthMvIdxExtendedRef(index, value));
    }

    /**
     * @return The reference to the SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1855)
    public SomeRelation getNthMvIdxExtendedRef(int index){
        return(((ExtendedRefMVIDXDMO) core).getNthMvIdxExtendedRef(index));
    }

    /**
     * @return The reference to the SomeRelation object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1889)
    public SomeRelation getNthMvIdxExtendedRefREF(int index){
        return(((ExtendedRefMVIDXDMO) core).getNthMvIdxExtendedRefREF(index));
    }

    /**
     * Removes the mvIdxExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remMvIdxExtendedRef(){
        ((ExtendedRefMVIDXDMO) core).remMvIdxExtendedRef();
    }


}
