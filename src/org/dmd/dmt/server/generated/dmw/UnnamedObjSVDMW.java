package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;         // Is reference type - (BaseDMWGeneratorNewest.java:976)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;         // Reference to unnamed object - (BaseDMWGeneratorNewest.java:981)
import org.dmd.dmt.shared.generated.dmo.UnnamedObjSVDMO;                 // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1104)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class UnnamedObjSVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public UnnamedObjSVDMW() {
        super(new UnnamedObjSVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public UnnamedObjSVDMW(DmcTypeModifierMV mods) {
        super(new UnnamedObjSVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._UnnamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public UnnamedObjSVDMW getModificationRecorder(){
        UnnamedObjSVDMW rc = new UnnamedObjSVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected UnnamedObjSVDMW(UnnamedObjSVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A TestBasicObjectFixedDMW object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1270)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1388)
    public void setSvUnnamedObj(TestBasicObjectFixedDMW value) {
        ((UnnamedObjSVDMO) core).setSvUnnamedObj(value.getDMO());
    }

    /**
     * Sets the svUnnamedObj to the specified value.
     * @param value A value compatible with TestBasicObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1397)
    public void setSvUnnamedObj(Object value) throws DmcValueException {
        ((UnnamedObjSVDMO) core).setSvUnnamedObj(value);
    }

    /**
     * Removes the svUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remSvUnnamedObj(){
        ((UnnamedObjSVDMO) core).remSvUnnamedObj();
    }


}