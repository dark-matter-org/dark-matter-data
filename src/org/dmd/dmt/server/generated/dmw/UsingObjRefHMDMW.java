package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.HashMap;                                         // To support getMVCopy() - (BaseDMWGenerator.java:1105)
import java.util.Iterator;                                        // Support MV object get() - (BaseDMWGenerator.java:2350)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.types.DefinitionName;                          // Name type - (BaseDMWGenerator.java:2458)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:994)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                 // Attribute objRefHM from the dmt schema - (BaseDMWGenerator.java:821)
import org.dmd.dmt.shared.generated.dmo.UsingObjRefHMDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // To support getMVCopy() for REFs ObjWithRefs-HASHMAPPED - (BaseDMWGenerator.java:1045)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGenerator.java:1154)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class UsingObjRefHMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public UsingObjRefHMDMW() {
        super(new UsingObjRefHMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public UsingObjRefHMDMW(DmcTypeModifierMV mods) {
        super(new UsingObjRefHMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:517)
    public UsingObjRefHMDMW getModificationRecorder(){
        UsingObjRefHMDMW rc = new UsingObjRefHMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public UsingObjRefHMDMW(UsingObjRefHMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UsingObjRefHM);
    }

    public UsingObjRefHMDMW cloneIt() {
        UsingObjRefHMDMW rc = new UsingObjRefHMDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UsingObjRefHMDMO getDMO() {
        return((UsingObjRefHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected UsingObjRefHMDMW(UsingObjRefHMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2263)
    public int getObjRefHMSize(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2275)
    public boolean getObjRefHMIsEmpty(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2287)
    public boolean getObjRefHMHasValue(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed ObjWithRefs object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2303)
    public ObjWithRefs getObjRefHM(Object key){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(null);
        
        return((ObjWithRefs)attr.getByKey(key));
    }

    /**
     * @return An Iterable of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2358)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2392)
    public DmcAttribute<?> addObjRefHM(ObjWithRefs value) {
        return(((UsingObjRefHMDMO) core).addObjRefHM(value.getDMO()));
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2416)
    public void delObjRefHM(ObjWithRefs value){
        ((UsingObjRefHMDMO) core).delObjRefHM(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2462)
    public HashMap<DefinitionName,ObjWithRefs> getObjRefHMCopy(){
        DmcAttribute<?> attr = ((UsingObjRefHMDMO) core).get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(new HashMap<DefinitionName,ObjWithRefs>());
        
        HashMap<DefinitionName,ObjWithRefs> rc = new HashMap<DefinitionName,ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getObjRefHMIterable();
        while(it.hasNext()){
            ObjWithRefs obj = it.next();
            rc.put((DefinitionName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2618)
    public void remObjRefHM(){
        ((UsingObjRefHMDMO) core).remObjRefHM();
    }


}
