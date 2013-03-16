package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dms.*;                                             // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.shared.generated.dmo.ExtendedRefSVDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmt.shared.generated.types.SomeRelation;           // For get() of SomeRelation - (BaseDMWGeneratorNewest.java:1240)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class ExtendedRefSVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public ExtendedRefSVDMW() {
        super(new ExtendedRefSVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public ExtendedRefSVDMW(DmcTypeModifierMV mods) {
        super(new ExtendedRefSVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public ExtendedRefSVDMW getModificationRecorder(){
        ExtendedRefSVDMW rc = new ExtendedRefSVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public ExtendedRefSVDMW(ExtendedRefSVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ExtendedRefSV);
    }

    public ExtendedRefSVDMO getDMO() {
        return((ExtendedRefSVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected ExtendedRefSVDMW(ExtendedRefSVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A SomeRelation object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1246)
    public SomeRelation getSvExtendedRef(){
        SomeRelation ref = ((ExtendedRefSVDMO) core).getSvExtendedRef();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((SomeRelation)ref.getObject().getContainer());
    }

    /**
     * Sets the svExtendedRef to the specified value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1312)
    public void setSvExtendedRef(SomeRelation value) {
        ((ExtendedRefSVDMO) core).setSvExtendedRef(value);
    }

    /**
     * Sets the svExtendedRef to the specified value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1321)
    public void setSvExtendedRef(Object value) throws DmcValueException {
        ((ExtendedRefSVDMO) core).setSvExtendedRef(value);
    }

    /**
     * Removes the svExtendedRef attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remSvExtendedRef(){
        ((ExtendedRefSVDMO) core).remSvExtendedRef();
    }


}
