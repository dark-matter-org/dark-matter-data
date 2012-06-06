package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dms.*;                                           // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.shared.generated.dmo.PrimitiveSVDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmw.DmwWrapper;                                  // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class PrimitiveSVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public PrimitiveSVDMW() {
        super(new PrimitiveSVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public PrimitiveSVDMW(DmcTypeModifierMV mods) {
        super(new PrimitiveSVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public PrimitiveSVDMW getModificationRecorder(){
        PrimitiveSVDMW rc = new PrimitiveSVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public PrimitiveSVDMW(PrimitiveSVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveSV);
    }

    public PrimitiveSVDMO getDMO() {
        return((PrimitiveSVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected PrimitiveSVDMW(PrimitiveSVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getSvString(){
        return(((PrimitiveSVDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setSvString(Object value) throws DmcValueException {
        ((PrimitiveSVDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setSvString(String value){
        ((PrimitiveSVDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remSvString(){
        ((PrimitiveSVDMO) core).remSvString();
    }


}