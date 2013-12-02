package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.TreeSet;                                               // To support getMVCopy() - (BaseDMWGenerator.java:1130)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGenerator.java:996)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dmt.server.extended.ObjWithRefs;                         // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.dmt.server.generated.dmw.ObjWithRefsIterableDMW;         // For multi-valued ObjWithRefs - (BaseDMWGenerator.java:1633)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                       // Attribute tsNamedObj from the dmt schema - (BaseDMWGenerator.java:821)
import org.dmd.dmt.shared.generated.dmo.NamedObjTSDMO;                  // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                 // For multi-valued adds of ObjWithRefs - (BaseDMWGenerator.java:1691)
import org.dmd.dmw.DmwWrapper;                                          // Unnamed object wrapper - (BaseDMWGenerator.java:1159)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
public class NamedObjTSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public NamedObjTSDMW() {
        super(new NamedObjTSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public NamedObjTSDMW(DmcTypeModifierMV mods) {
        super(new NamedObjTSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:517)
    public NamedObjTSDMW getModificationRecorder(){
        NamedObjTSDMW rc = new NamedObjTSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public NamedObjTSDMW(NamedObjTSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjTS);
    }

    public NamedObjTSDMW cloneIt() {
        NamedObjTSDMW rc = new NamedObjTSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public NamedObjTSDMO getDMO() {
        return((NamedObjTSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected NamedObjTSDMW(NamedObjTSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getTsNamedObjSize(){
        return(((NamedObjTSDMO) core).getTsNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getTsNamedObjIsEmpty(){
        if (((NamedObjTSDMO) core).getTsNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getTsNamedObjHasValue(){
        if (((NamedObjTSDMO) core).getTsNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1640)
    public ObjWithRefsIterableDMW getTsNamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            return(ObjWithRefsIterableDMW.emptyList);
        
        return(new ObjWithRefsIterableDMW(((NamedObjTSDMO) core).getTsNamedObj()));
    }

    /**
     * Adds another tsNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1697)
    public DmcAttribute<?> addTsNamedObj(ObjWithRefs value){
        DmcAttribute<?> attr = ((NamedObjTSDMO) core).addTsNamedObj(((ObjWithRefsDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a tsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1747)
    public void delTsNamedObj(ObjWithRefs value){
        ((NamedObjTSDMO) core).delTsNamedObj(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ObjWithRefs objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1811)
    public TreeSet<ObjWithRefs> getTsNamedObjCopy(){
        DmcAttribute<?> attr = ((NamedObjTSDMO) core).get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            return(new TreeSet<ObjWithRefs>());
        
        TreeSet<ObjWithRefs> rc = new TreeSet<ObjWithRefs>();
        
        ObjWithRefsIterableDMW it = getTsNamedObjIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the tsNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remTsNamedObj(){
        ((NamedObjTSDMO) core).remTsNamedObj();
    }


}
