package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.TreeSet;                                                // To support getMVCopy() - (BaseDMWGenerator.java:1206)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.server.extended.ObjWithRefs;                          // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dmt.server.generated.dmw.SomeRelationIterableDMW;         // For multi-valued SomeRelation - (BaseDMWGenerator.java:1709)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                        // Attribute from the dmt schema - (BaseDMWGenerator.java:1710)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefTSDMO;                // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // For addition of MV SomeRelation - (BaseDMWGenerator.java:1753)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class ExtendedRefTSDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public ExtendedRefTSDMW() {
        super(new ExtendedRefTSDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public ExtendedRefTSDMW(DmcTypeModifierMV mods) {
        super(new ExtendedRefTSDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefTS);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public ExtendedRefTSDMW getModificationRecorder(){
        ExtendedRefTSDMW rc = new ExtendedRefTSDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public ExtendedRefTSDMW(ExtendedRefTSDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefTS);
    }

    public ExtendedRefTSDMW cloneIt() {
        ExtendedRefTSDMW rc = new ExtendedRefTSDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ExtendedRefTSDMO getDMO() {
        return((ExtendedRefTSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected ExtendedRefTSDMW(ExtendedRefTSDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getTsExtendedRefSize(){
        return(((ExtendedRefTSDMO) core).getTsExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getTsExtendedRefIsEmpty(){
        if (((ExtendedRefTSDMO) core).getTsExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getTsExtendedRefHasValue(){
        if (((ExtendedRefTSDMO) core).getTsExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1716)
    public SomeRelationIterableDMW getTsExtendedRefIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsExtendedRef);
        if (attr == null)
            return(SomeRelationIterableDMW.emptyList);
        
        return(new SomeRelationIterableDMW(((ExtendedRefTSDMO) core).getTsExtendedRef()));
    }

    /**
     * Adds another tsExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1759)
    public DmcAttribute<?> addTsExtendedRef(SomeRelation value){
        DmcAttribute<?> attr = ((ExtendedRefTSDMO) core).addTsExtendedRef(value);
        return(attr);
    }

    /**
     * Deletes a tsExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1813)
    public void delTsExtendedRef(SomeRelation value){
        ((ExtendedRefTSDMO) core).delTsExtendedRef(value);
    }

    /**
     * @return A COPY of the collection of SomeRelation objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1887)
    public TreeSet<ObjWithRefs> getTsExtendedRefCopy(){
        DmcAttribute<?> attr = ((ExtendedRefTSDMO) core).get(DmtDMSAG.__tsExtendedRef);
        if (attr == null)
            return(new TreeSet<ObjWithRefs>());
        
        TreeSet<ObjWithRefs> rc = new TreeSet<ObjWithRefs>();
        
        SomeRelationIterableDMW it = getTsExtendedRefIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the tsExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remTsExtendedRef(){
        ((ExtendedRefTSDMO) core).remTsExtendedRef();
    }


}
