package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.Iterator;                                        // Multi-valued attribute access - (BaseDMWGeneratorNewest.java:1539)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefHSDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmt.shared.generated.types.SomeRelation;           // DMO reference - (BaseDMWGeneratorNewest.java:958)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                     // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class ExtendedRefHSGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:455)
    public ExtendedRefHSGXT() {
        super(new ExtendedRefHSDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:460)
    public ExtendedRefHSGXT(DmcTypeModifierMV mods) {
        super(new ExtendedRefHSDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public ExtendedRefHSGXT getModificationRecorder(){
        ExtendedRefHSGXT rc = new ExtendedRefHSGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public ExtendedRefHSDMO getDMO() {
        return((ExtendedRefHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:540)
    public ExtendedRefHSGXT(ExtendedRefHSDMO obj) {
        super(obj);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getHsExtendedRefSize(){
        return(((ExtendedRefHSDMO) core).getHsExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getHsExtendedRefIsEmpty(){
        if (((ExtendedRefHSDMO) core).getHsExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getHsExtendedRefHasValue(){
        if (((ExtendedRefHSDMO) core).getHsExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1544)
    public Iterator<SomeRelation> getHsExtendedRef(){
        return(((ExtendedRefHSDMO) core).getHsExtendedRef());
    }

    /**
     * Adds another hsExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1599)
    public DmcAttribute<?> addHsExtendedRef(SomeRelation value){
        return(((ExtendedRefHSDMO) core).addHsExtendedRef(value));
    }

    /**
     * Deletes a hsExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1647)
    public void delHsExtendedRef(SomeRelation value){
        ((ExtendedRefHSDMO) core).delHsExtendedRef(value);
    }

    /**
     * Removes the hsExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remHsExtendedRef(){
        ((ExtendedRefHSDMO) core).remHsExtendedRef();
    }


}
