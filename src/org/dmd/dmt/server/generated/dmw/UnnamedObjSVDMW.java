package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGenerator.java:967)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;         // Is reference type - (BaseDMWGenerator.java:999)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;         // Reference to unnamed object - (BaseDMWGenerator.java:1004)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjSVDMO;                 // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGenerator.java:1127)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
public class UnnamedObjSVDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public UnnamedObjSVDMW() {
        super(new UnnamedObjSVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public UnnamedObjSVDMW(DmcTypeModifierMV mods) {
        super(new UnnamedObjSVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:505)
    public UnnamedObjSVDMW getModificationRecorder(){
        UnnamedObjSVDMW rc = new UnnamedObjSVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public UnnamedObjSVDMW(UnnamedObjSVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjSV);
    }

    public UnnamedObjSVDMW cloneIt() {
        UnnamedObjSVDMW rc = new UnnamedObjSVDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UnnamedObjSVDMO getDMO() {
        return((UnnamedObjSVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected UnnamedObjSVDMW(UnnamedObjSVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A TestBasicObjectFixedDMW object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1293)
    public TestBasicObjectFixedDMW getSvUnnamedObj(){
        TestBasicObjectFixedDMO dmo = ((UnnamedObjSVDMO) core).getSvUnnamedObj();
        if (dmo == null)
            return(null);
        
        return((TestBasicObjectFixedDMW)dmo.getContainer());
    }

    /**
     * Sets the svUnnamedObj to the specified value.
     * @param value A value compatible with TestBasicObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1411)
    public void setSvUnnamedObj(TestBasicObjectFixedDMW value) {
        ((UnnamedObjSVDMO) core).setSvUnnamedObj(value.getDMO());
    }

    /**
     * Sets the svUnnamedObj to the specified value.
     * @param value A value compatible with TestBasicObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1420)
    public void setSvUnnamedObj(Object value) throws DmcValueException {
        ((UnnamedObjSVDMO) core).setSvUnnamedObj(value);
    }

    /**
     * Removes the svUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remSvUnnamedObj(){
        ((UnnamedObjSVDMO) core).remSvUnnamedObj();
    }


}
