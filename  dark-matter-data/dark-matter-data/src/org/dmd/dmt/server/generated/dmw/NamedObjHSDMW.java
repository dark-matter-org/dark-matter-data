package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.HashSet;                                               // To support getMVCopy() - (BaseDMWGeneratorNewest.java:994)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGeneratorNewest.java:887)
import org.dmd.dms.*;                                                   // Always 2 - (BaseDMWGeneratorNewest.java:872)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:876)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:875)
import org.dmd.dmt.server.extended.ObjWithRefs;                         // Is reference type - (BaseDMWGeneratorNewest.java:906)
import org.dmd.dmt.server.generated.dmw.ObjWithRefsIterableDMW;         // For multi-valued ObjWithRefs - (BaseDMWGeneratorNewest.java:1491)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                       // Attribute hsNamedObj from the dmt schema - (BaseDMWGeneratorNewest.java:719)
import org.dmd.dmt.shared.generated.dmo.NamedObjHSDMO;                  // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1047)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                 // For multi-valued adds of ObjWithRefs - (BaseDMWGeneratorNewest.java:1542)
import org.dmd.dmw.DmwWrapper;                                          // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1030)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class NamedObjHSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public NamedObjHSDMW() {
        super(new NamedObjHSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public NamedObjHSDMW(DmcTypeModifierMV mods) {
        super(new NamedObjHSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public NamedObjHSDMW getModificationRecorder(){
        NamedObjHSDMW rc = new NamedObjHSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public NamedObjHSDMW(NamedObjHSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHS);
    }

    public NamedObjHSDMO getDMO() {
        return((NamedObjHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected NamedObjHSDMW(NamedObjHSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1453)
    public int getHsNamedObjSize(){
        return(((NamedObjHSDMO) core).getHsNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1461)
    public boolean getHsNamedObjIsEmpty(){
        if (((NamedObjHSDMO) core).getHsNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1471)
    public boolean getHsNamedObjHasValue(){
        if (((NamedObjHSDMO) core).getHsNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1498)
    public ObjWithRefsIterableDMW getHsNamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(((NamedObjHSDMO) core).getHsNamedObj()));
    }

    /**
     * Adds another hsNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1548)
    public DmcAttribute<?> addHsNamedObj(ObjWithRefs value){
        DmcAttribute<?> attr = ((NamedObjHSDMO) core).addHsNamedObj(((ObjWithRefsDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a hsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1585)
    public void delHsNamedObj(ObjWithRefs value){
        ((NamedObjHSDMO) core).delHsNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1635)
    public HashSet<ObjWithRefs> getHsNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjHSDMO) core).get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            return(new HashSet<ObjWithRefs>());
        
        HashSet<ObjWithRefs> rc = new HashSet<ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getHsNamedObjIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the hsNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2038)
    public void remHsNamedObj(){
        ((NamedObjHSDMO) core).remHsNamedObj();
    }


}
