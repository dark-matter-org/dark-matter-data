package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                              // To support getMVCopy() - (BaseDMWGeneratorNewest.java:980)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGeneratorNewest.java:887)
import org.dmd.dms.*;                                                    // Always 2 - (BaseDMWGeneratorNewest.java:872)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:876)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:875)
import org.dmd.dmt.server.extended.ObjWithRefs;                          // Is reference type - (BaseDMWGeneratorNewest.java:906)
import org.dmd.dmt.server.generated.dmw.SomeRelationIterableDMW;         // For multi-valued SomeRelation - (BaseDMWGeneratorNewest.java:1491)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                        // Attribute from the dmt schema - (BaseDMWGeneratorNewest.java:1492)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVDMO;                // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1047)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // For addition of MV SomeRelation - (BaseDMWGeneratorNewest.java:1528)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1030)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class ExtendedRefMVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public ExtendedRefMVDMW() {
        super(new ExtendedRefMVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public ExtendedRefMVDMW(DmcTypeModifierMV mods) {
        super(new ExtendedRefMVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public ExtendedRefMVDMW getModificationRecorder(){
        ExtendedRefMVDMW rc = new ExtendedRefMVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public ExtendedRefMVDMW(ExtendedRefMVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMV);
    }

    public ExtendedRefMVDMO getDMO() {
        return((ExtendedRefMVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected ExtendedRefMVDMW(ExtendedRefMVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1453)
    public int getMvExtendedRefSize(){
        return(((ExtendedRefMVDMO) core).getMvExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1461)
    public boolean getMvExtendedRefIsEmpty(){
        if (((ExtendedRefMVDMO) core).getMvExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1471)
    public boolean getMvExtendedRefHasValue(){
        if (((ExtendedRefMVDMO) core).getMvExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1498)
    public SomeRelationIterableDMW getMvExtendedRefIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvExtendedRef);
        if (attr == null)
            return(SomeRelationIterableDMW.emptyList);
        
        return(new SomeRelationIterableDMW(((ExtendedRefMVDMO) core).getMvExtendedRef()));
    }

    /**
     * Adds another mvExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public DmcAttribute<?> addMvExtendedRef(SomeRelation value){
        DmcAttribute<?> attr = ((ExtendedRefMVDMO) core).addMvExtendedRef(value);
        return(attr);
    }

    /**
     * Deletes a mvExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1575)
    public void delMvExtendedRef(SomeRelation value){
        ((ExtendedRefMVDMO) core).delMvExtendedRef(value);
    }

    /**
     * @return A COPY of the collection of SomeRelation objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1635)
    public ArrayList<ObjWithRefs> getMvExtendedRefCopy(){
        DmcAttribute<?> attr = ((ExtendedRefMVDMO) core).get(DmtDMSAG.__mvExtendedRef);
        if (attr == null)
            return(new ArrayList<ObjWithRefs>());
        
        ArrayList<ObjWithRefs> rc = new ArrayList<ObjWithRefs>(attr.getMVSize());
        
        SomeRelationIterableDMW it = getMvExtendedRefIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the mvExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2038)
    public void remMvExtendedRef(){
        ((ExtendedRefMVDMO) core).remMvExtendedRef();
    }


}
