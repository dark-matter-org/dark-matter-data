package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                              // To support getMVCopy() - (BaseDMWGenerator.java:1071)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.extended.ObjWithRefs;                          // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dmt.server.generated.dmw.SomeRelationIterableDMW;         // For multi-valued SomeRelation - (BaseDMWGenerator.java:1600)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                        // Attribute from the dmt schema - (BaseDMWGenerator.java:1601)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefMVDMO;                // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // For addition of MV SomeRelation - (BaseDMWGenerator.java:1644)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class ExtendedRefMVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public ExtendedRefMVDMW() {
        super(new ExtendedRefMVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public ExtendedRefMVDMW(DmcTypeModifierMV mods) {
        super(new ExtendedRefMVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public ExtendedRefMVDMW getModificationRecorder(){
        ExtendedRefMVDMW rc = new ExtendedRefMVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public ExtendedRefMVDMW(ExtendedRefMVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefMV);
    }

    public ExtendedRefMVDMW cloneIt() {
        ExtendedRefMVDMW rc = new ExtendedRefMVDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ExtendedRefMVDMO getDMO() {
        return((ExtendedRefMVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected ExtendedRefMVDMW(ExtendedRefMVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of SomeRelation items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getMvExtendedRefSize(){
        return(((ExtendedRefMVDMO) core).getMvExtendedRefSize());
    }

    /**
     * @return true if there are no SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getMvExtendedRefIsEmpty(){
        if (((ExtendedRefMVDMO) core).getMvExtendedRefSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any SomeRelationDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getMvExtendedRefHasValue(){
        if (((ExtendedRefMVDMO) core).getMvExtendedRefSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1607)
    public SomeRelationIterableDMW getMvExtendedRefIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvExtendedRef);
        if (attr == null)
            return(SomeRelationIterableDMW.emptyList);
        
        return(new SomeRelationIterableDMW(((ExtendedRefMVDMO) core).getMvExtendedRef()));
    }

    /**
     * Adds another mvExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1650)
    public DmcAttribute<?> addMvExtendedRef(SomeRelation value){
        DmcAttribute<?> attr = ((ExtendedRefMVDMO) core).addMvExtendedRef(value);
        return(attr);
    }

    /**
     * Deletes a mvExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1705)
    public void delMvExtendedRef(SomeRelation value){
        ((ExtendedRefMVDMO) core).delMvExtendedRef(value);
    }

    /**
     * @return A COPY of the collection of SomeRelation objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1779)
    public ArrayList<ObjWithRefs> getMvExtendedRefCopy(){
        DmcAttribute<?> attr = ((ExtendedRefMVDMO) core).get(DmtDMSAG.__mvExtendedRef);
        if (attr == null)
            return(new ArrayList<ObjWithRefs>());
        
        ArrayList<ObjWithRefs> rc = new ArrayList<ObjWithRefs>(attr.getMVSize());
        
        SomeRelationIterableDMW it = getMvExtendedRefIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the mvExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remMvExtendedRef(){
        ((ExtendedRefMVDMO) core).remMvExtendedRef();
    }


}
