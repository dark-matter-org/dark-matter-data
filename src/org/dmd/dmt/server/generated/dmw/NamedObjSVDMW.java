package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.dmt.server.extended.ObjWithRefs;                   // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.dmt.shared.generated.dmo.NamedObjSVDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:933)
import org.dmd.dmw.DmwWrapper;                                    // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1053)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class NamedObjSVDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public NamedObjSVDMW() {
        super(new NamedObjSVDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public NamedObjSVDMW(DmcTypeModifierMV mods) {
        super(new NamedObjSVDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjSV);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public NamedObjSVDMW getModificationRecorder(){
        NamedObjSVDMW rc = new NamedObjSVDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public NamedObjSVDMW(NamedObjSVDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._NamedObjSV);
    }

    public NamedObjSVDMO getDMO() {
        return((NamedObjSVDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected NamedObjSVDMW(NamedObjSVDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ObjWithRefs object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1252)
    public ObjWithRefs getSvNamedObj(){
        ObjWithRefsREF ref = ((NamedObjSVDMO) core).getSvNamedObj();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * Sets the svNamedObj to the specified value.
     * @param value A value compatible with ObjWithRefsREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public void setSvNamedObj(ObjWithRefs value) {
        ((NamedObjSVDMO) core).setSvNamedObj(value.getDMO());
    }

    /**
     * Sets the svNamedObj to the specified value.
     * @param value A value compatible with ObjWithRefsREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1346)
    public void setSvNamedObj(Object value) throws DmcValueException {
        ((NamedObjSVDMO) core).setSvNamedObj(value);
    }

    /**
     * Removes the svNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remSvNamedObj(){
        ((NamedObjSVDMO) core).remSvNamedObj();
    }


}