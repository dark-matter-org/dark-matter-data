package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.Iterator;                                        // Support MV object get() - (BaseDMWGeneratorNewest.java:2243)
import java.util.TreeMap;                                         // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1006)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.StringName;                              // Name type - (BaseDMWGeneratorNewest.java:2221)
import org.dmd.dms.*;                                             // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                 // Attribute tmNamedObj from the dmt schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.dmt.shared.generated.dmo.NamedObjTMDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // To support getMVCopy() for REFs ObjWithRefs-TREEMAPPED - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class NamedObjTMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public NamedObjTMDMW() {
        super(new NamedObjTMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public NamedObjTMDMW(DmcTypeModifierMV mods) {
        super(new NamedObjTMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public NamedObjTMDMW getModificationRecorder(){
        NamedObjTMDMW rc = new NamedObjTMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public NamedObjTMDMW(NamedObjTMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    public NamedObjTMDMO getDMO() {
        return((NamedObjTMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected NamedObjTMDMW(NamedObjTMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2156)
    public int getTmNamedObjSize(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2168)
    public boolean getTmNamedObjIsEmpty(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2180)
    public boolean getTmNamedObjHasValue(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2196)
    public ObjWithRefs getTmNamedObj(Object key){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(null);
        
        return((ObjWithRefs)attr.getByKey(key));
    }

    /**
     * @return the first key of the map.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2227)
    public StringName getTmNamedObjFirstKey(){
        return(((NamedObjTMDMO) core).getTmNamedObjFirstKey());
    }

    /**
     * @return An Iterable of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2251)
    public ObjWithRefsIterableDMW getTmNamedObjIterable(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        Iterator<ObjWithRefsREF> it = ((NamedObjTMDMO) core).getTmNamedObj();
        
        if (it == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(it));
    }

    /**
     * Adds another tmNamedObj value.
     * @param value ObjWithRefsDMW
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2285)
    public DmcAttribute<?> addTmNamedObj(ObjWithRefs value) {
        return(((NamedObjTMDMO) core).addTmNamedObj(value.getDMO()));
    }

    /**
     * Deletes a tmNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2309)
    public void delTmNamedObj(ObjWithRefs value){
        ((NamedObjTMDMO) core).delTmNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2353)
    public TreeMap<StringName,ObjWithRefs> getTmNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(new TreeMap<StringName,ObjWithRefs>());
        
        TreeMap<StringName,ObjWithRefs> rc = new TreeMap<StringName,ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getTmNamedObjIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((StringName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the tmNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2507)
    public void remTmNamedObj(){
        ((NamedObjTMDMO) core).remTmNamedObj();
    }


}
