package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.HashMap;                                         // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1002)
import java.util.Iterator;                                        // Support MV object get() - (BaseDMWGeneratorNewest.java:2239)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.StringName;                              // Name type - (BaseDMWGeneratorNewest.java:2345)
import org.dmd.dms.*;                                             // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                 // Attribute objRefHM from the dmt schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.dmt.shared.generated.dmo.UsingObjRefHMDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
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
public class UsingObjRefHMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public UsingObjRefHMDMW() {
        super(new UsingObjRefHMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public UsingObjRefHMDMW(DmcTypeModifierMV mods) {
        super(new UsingObjRefHMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public UsingObjRefHMDMW getModificationRecorder(){
        UsingObjRefHMDMW rc = new UsingObjRefHMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public UsingObjRefHMDMW(UsingObjRefHMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    public UsingObjRefHMDMO getDMO() {
        return((UsingObjRefHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected UsingObjRefHMDMW(UsingObjRefHMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2152)
    public int getObjRefHMSize(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2164)
    public boolean getObjRefHMIsEmpty(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2176)
    public boolean getObjRefHMHasValue(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2192)
    public ObjWithRefs getObjRefHM(Object key){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(null);
        
        return((ObjWithRefs)attr.getByKey(key));
    }

    /**
     * @return An Iterable of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2247)
    public ObjWithRefsIterableDMW getObjRefHMIterable(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        Iterator<ObjWithRefsREF> it = ((UsingObjRefHMDMO) core).getObjRefHM();
        
        if (it == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(it));
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefsDMW
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2281)
    public DmcAttribute<?> addObjRefHM(ObjWithRefs value) {
        return(((UsingObjRefHMDMO) core).addObjRefHM(value.getDMO()));
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2305)
    public void delObjRefHM(ObjWithRefs value){
        ((UsingObjRefHMDMO) core).delObjRefHM(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2349)
    public HashMap<StringName,ObjWithRefs> getObjRefHMCopy(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(new HashMap<StringName,ObjWithRefs>());
        
        HashMap<StringName,ObjWithRefs> rc = new HashMap<StringName,ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getObjRefHMIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((StringName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2503)
    public void remObjRefHM(){
        ((UsingObjRefHMDMO) core).remObjRefHM();
    }


}
