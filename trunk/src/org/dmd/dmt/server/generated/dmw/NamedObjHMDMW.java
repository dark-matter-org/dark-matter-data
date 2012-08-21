package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.HashMap;                                         // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1002)
import java.util.Iterator;                                        // Support MV object get() - (BaseDMWGeneratorNewest.java:2243)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.StringName;                              // Name type - (BaseDMWGeneratorNewest.java:2349)
import org.dmd.dms.*;                                             // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                 // Attribute hmNamedObj from the dmt schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.dmt.shared.generated.dmo.NamedObjHMDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // To support getMVCopy() for REFs ObjWithRefs-HASHMAPPED - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class NamedObjHMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public NamedObjHMDMW() {
        super(new NamedObjHMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public NamedObjHMDMW(DmcTypeModifierMV mods) {
        super(new NamedObjHMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public NamedObjHMDMW getModificationRecorder(){
        NamedObjHMDMW rc = new NamedObjHMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public NamedObjHMDMW(NamedObjHMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjHM);
    }

    public NamedObjHMDMO getDMO() {
        return((NamedObjHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected NamedObjHMDMW(NamedObjHMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2156)
    public int getHmNamedObjSize(){
        DmcAttribute<?> attr = ((NamedObjHMDMO) core).get(DmtDMSAG.__hmNamedObj);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2168)
    public boolean getHmNamedObjIsEmpty(){
        DmcAttribute<?> attr = ((NamedObjHMDMO) core).get(DmtDMSAG.__hmNamedObj);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2180)
    public boolean getHmNamedObjHasValue(){
        DmcAttribute<?> attr = ((NamedObjHMDMO) core).get(DmtDMSAG.__hmNamedObj);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2196)
    public ObjWithRefs getHmNamedObj(Object key){
        DmcAttribute<?> attr = ((NamedObjHMDMO) core).get(DmtDMSAG.__hmNamedObj);
        if (attr == null)
            return(null);
        
        return((ObjWithRefs)attr.getByKey(key));
    }

    /**
     * @return An Iterable of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2251)
    public ObjWithRefsIterableDMW getHmNamedObjIterable(){
        DmcAttribute<?> attr = ((NamedObjHMDMO) core).get(DmtDMSAG.__hmNamedObj);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        Iterator<ObjWithRefsREF> it = ((NamedObjHMDMO) core).getHmNamedObj();
        
        if (it == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(it));
    }

    /**
     * Adds another hmNamedObj value.
     * @param value ObjWithRefsDMW
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2285)
    public DmcAttribute<?> addHmNamedObj(ObjWithRefs value) {
        return(((NamedObjHMDMO) core).addHmNamedObj(value.getDMO()));
    }

    /**
     * Deletes a hmNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2309)
    public void delHmNamedObj(ObjWithRefs value){
        ((NamedObjHMDMO) core).delHmNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2353)
    public HashMap<StringName,ObjWithRefs> getHmNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjHMDMO) core).get(DmtDMSAG.__hmNamedObj);
        if (attr == null)
            return(new HashMap<StringName,ObjWithRefs>());
        
        HashMap<StringName,ObjWithRefs> rc = new HashMap<StringName,ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getHmNamedObjIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((StringName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the hmNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2507)
    public void remHmNamedObj(){
        ((NamedObjHMDMO) core).remHmNamedObj();
    }


}
