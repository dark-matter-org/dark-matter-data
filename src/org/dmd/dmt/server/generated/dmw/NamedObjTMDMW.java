package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.Iterator;                                        // Support MV object get() - (BaseDMWGeneratorNewest.java:2300)
import java.util.TreeMap;                                         // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1059)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.types.DefinitionName;                          // Name type - (BaseDMWGeneratorNewest.java:2278)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGeneratorNewest.java:976)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                 // Attribute tmNamedObj from the dmt schema - (BaseDMWGeneratorNewest.java:771)
import org.dmd.dmt.shared.generated.dmo.NamedObjTMDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // To support getMVCopy() for REFs ObjWithRefs-TREEMAPPED - (BaseDMWGeneratorNewest.java:995)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1104)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class NamedObjTMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public NamedObjTMDMW() {
        super(new NamedObjTMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public NamedObjTMDMW(DmcTypeModifierMV mods) {
        super(new NamedObjTMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public NamedObjTMDMW getModificationRecorder(){
        NamedObjTMDMW rc = new NamedObjTMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public NamedObjTMDMW(NamedObjTMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTM);
    }

    public NamedObjTMDMW cloneIt() {
        NamedObjTMDMW rc = new NamedObjTMDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NamedObjTMDMO getDMO() {
        return((NamedObjTMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected NamedObjTMDMW(NamedObjTMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2213)
    public int getTmNamedObjSize(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2225)
    public boolean getTmNamedObjIsEmpty(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2237)
    public boolean getTmNamedObjHasValue(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2253)
    public ObjWithRefs getTmNamedObj(Object key){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(null);
        
        return((ObjWithRefs)attr.getByKey(key));
    }

    /**
     * @return the first key of the map.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2284)
    public DefinitionName getTmNamedObjFirstKey(){
        return(((NamedObjTMDMO) core).getTmNamedObjFirstKey());
    }

    /**
     * @return An Iterable of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2308)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2342)
    public DmcAttribute<?> addTmNamedObj(ObjWithRefs value) {
        return(((NamedObjTMDMO) core).addTmNamedObj(value.getDMO()));
    }

    /**
     * Deletes a tmNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2366)
    public void delTmNamedObj(ObjWithRefs value){
        ((NamedObjTMDMO) core).delTmNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2412)
    public TreeMap<DefinitionName,ObjWithRefs> getTmNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjTMDMO) core).get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(new TreeMap<DefinitionName,ObjWithRefs>());
        
        TreeMap<DefinitionName,ObjWithRefs> rc = new TreeMap<DefinitionName,ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getTmNamedObjIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((DefinitionName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the tmNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2568)
    public void remTmNamedObj(){
        ((NamedObjTMDMO) core).remTmNamedObj();
    }


}
