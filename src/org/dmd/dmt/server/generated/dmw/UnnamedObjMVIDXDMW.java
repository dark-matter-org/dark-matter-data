package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;         // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;         // For setNth of TestBasicObjectFixed - (BaseDMWGenerator.java:1806)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjMVIDXDMO;              // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGenerator.java:1125)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class UnnamedObjMVIDXDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public UnnamedObjMVIDXDMW() {
        super(new UnnamedObjMVIDXDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjMVIDX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public UnnamedObjMVIDXDMW(DmcTypeModifierMV mods) {
        super(new UnnamedObjMVIDXDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjMVIDX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:612)
    public UnnamedObjMVIDXDMW getModificationRecorder(){
        UnnamedObjMVIDXDMW rc = new UnnamedObjMVIDXDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public UnnamedObjMVIDXDMW(UnnamedObjMVIDXDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjMVIDX);
    }

    public UnnamedObjMVIDXDMW cloneIt() {
        UnnamedObjMVIDXDMW rc = new UnnamedObjMVIDXDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UnnamedObjMVIDXDMO getDMO() {
        return((UnnamedObjMVIDXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected UnnamedObjMVIDXDMW(UnnamedObjMVIDXDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getMvIdxUnnamedObjSize(){
        return(((UnnamedObjMVIDXDMO) core).getMvIdxUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getMvIdxUnnamedObjIsEmpty(){
        if (((UnnamedObjMVIDXDMO) core).getMvIdxUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getMvIdxUnnamedObjHasValue(){
        if (((UnnamedObjMVIDXDMO) core).getMvIdxUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the mvIdxUnnamedObj value at the specified index.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1823)
    public DmcAttribute<?> setNthMvIdxUnnamedObj(int index, TestBasicObjectFixedDMW value){
        if (value == null)
            return(((UnnamedObjMVIDXDMO) core).setNthMvIdxUnnamedObj(index, null));
        else
            return(((UnnamedObjMVIDXDMO) core).setNthMvIdxUnnamedObj(index, ((TestBasicObjectFixedDMO)value.getDmcObject())));
    }

    /**
     * @return The TestBasicObjectFixedDMW object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1867)
    public TestBasicObjectFixedDMW getNthMvIdxUnnamedObj(int index){
        TestBasicObjectFixedDMO dmo = ((UnnamedObjMVIDXDMO) core).getNthMvIdxUnnamedObj(index);
        if (dmo == null)
            return(null);
        
        return((TestBasicObjectFixedDMW)dmo.getContainer());
    }

    /**
     * Removes the mvIdxUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remMvIdxUnnamedObj(){
        ((UnnamedObjMVIDXDMO) core).remMvIdxUnnamedObj();
    }


}
