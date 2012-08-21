package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                             // To support getMVCopy() - (BaseDMWGeneratorNewest.java:997)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dms.*;                                                   // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.server.extended.ObjWithRefs;                         // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.dmt.server.generated.dmw.ObjWithRefsIterableDMW;         // For multi-valued ObjWithRefs - (BaseDMWGeneratorNewest.java:1525)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                       // Attribute mvNamedObj from the dmt schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.dmt.shared.generated.dmo.NamedObjMVDMO;                  // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                 // For multi-valued adds of ObjWithRefs - (BaseDMWGeneratorNewest.java:1583)
import org.dmd.dmw.DmwWrapper;                                          // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class NamedObjMVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public NamedObjMVDMW() {
        super(new NamedObjMVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public NamedObjMVDMW(DmcTypeModifierMV mods) {
        super(new NamedObjMVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public NamedObjMVDMW getModificationRecorder(){
        NamedObjMVDMW rc = new NamedObjMVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public NamedObjMVDMW(NamedObjMVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjMV);
    }

    public NamedObjMVDMO getDMO() {
        return((NamedObjMVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected NamedObjMVDMW(NamedObjMVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1487)
    public int getMvNamedObjSize(){
        return(((NamedObjMVDMO) core).getMvNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1495)
    public boolean getMvNamedObjIsEmpty(){
        if (((NamedObjMVDMO) core).getMvNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1505)
    public boolean getMvNamedObjHasValue(){
        if (((NamedObjMVDMO) core).getMvNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1532)
    public ObjWithRefsIterableDMW getMvNamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvNamedObj);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(((NamedObjMVDMO) core).getMvNamedObj()));
    }

    /**
     * Adds another mvNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1589)
    public DmcAttribute<?> addMvNamedObj(ObjWithRefs value){
        DmcAttribute<?> attr = ((NamedObjMVDMO) core).addMvNamedObj(((ObjWithRefsDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mvNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1639)
    public void delMvNamedObj(ObjWithRefs value){
        ((NamedObjMVDMO) core).delMvNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1701)
    public ArrayList<ObjWithRefs> getMvNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjMVDMO) core).get(DmtDMSAG.__mvNamedObj);
        if (attr == null)
            return(new ArrayList<ObjWithRefs>());
        
        ArrayList<ObjWithRefs> rc = new ArrayList<ObjWithRefs>(attr.getMVSize());
        
        ObjWithRefsIterableDMW it = getMvNamedObjIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the mvNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2104)
    public void remMvNamedObj(){
        ((NamedObjMVDMO) core).remMvNamedObj();
    }


}
