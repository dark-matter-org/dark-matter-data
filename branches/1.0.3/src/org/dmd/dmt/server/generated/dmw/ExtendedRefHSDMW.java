package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.HashSet;                                                // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1012)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dms.*;                                                    // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.server.extended.ObjWithRefs;                          // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.dmt.server.generated.dmw.SomeRelationIterableDMW;         // For multi-valued SomeRelation - (BaseDMWGeneratorNewest.java:1521)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                        // Attribute from the dmt schema - (BaseDMWGeneratorNewest.java:1522)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefHSDMO;                // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // For addition of MV SomeRelation - (BaseDMWGeneratorNewest.java:1565)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class ExtendedRefHSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public ExtendedRefHSDMW() {
        super(new ExtendedRefHSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public ExtendedRefHSDMW(DmcTypeModifierMV mods) {
        super(new ExtendedRefHSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public ExtendedRefHSDMW getModificationRecorder(){
        ExtendedRefHSDMW rc = new ExtendedRefHSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public ExtendedRefHSDMW(ExtendedRefHSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefHS);
    }

    public ExtendedRefHSDMO getDMO() {
        return((ExtendedRefHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected ExtendedRefHSDMW(ExtendedRefHSDMO obj, ClassDefinition cd) {
        super(obj,cd);
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1528)
    public SomeRelationIterableDMW getHsExtendedRefIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsExtendedRef);
        if (attr == null)
            return(SomeRelationIterableDMW.emptyList);
        
        return(new SomeRelationIterableDMW(((ExtendedRefHSDMO) core).getHsExtendedRef()));
    }

    /**
     * Adds another hsExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public DmcAttribute<?> addHsExtendedRef(SomeRelation value){
        DmcAttribute<?> attr = ((ExtendedRefHSDMO) core).addHsExtendedRef(value);
        return(attr);
    }

    /**
     * Deletes a hsExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1625)
    public void delHsExtendedRef(SomeRelation value){
        ((ExtendedRefHSDMO) core).delHsExtendedRef(value);
    }

    /**
     * @return A COPY of the collection of SomeRelation objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1697)
    public HashSet<ObjWithRefs> getHsExtendedRefCopy(){
        DmcAttribute<?> attr = ((ExtendedRefHSDMO) core).get(DmtDMSAG.__hsExtendedRef);
        if (attr == null)
            return(new HashSet<ObjWithRefs>());
        
        HashSet<ObjWithRefs> rc = new HashSet<ObjWithRefs>();
        
        SomeRelationIterableDMW it = getHsExtendedRefIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the hsExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remHsExtendedRef(){
        ((ExtendedRefHSDMO) core).remHsExtendedRef();
    }


}
