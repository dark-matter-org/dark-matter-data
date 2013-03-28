package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dms.ClassDefinition;                                   // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmt.server.extended.ClientCountFilter;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:949)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmw.DmwWrapper;                                        // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1104)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class ClientCountFilterDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public ClientCountFilterDMW() {
        super(new ClientCountFilterDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public ClientCountFilterDMW(DmcTypeModifierMV mods) {
        super(new ClientCountFilterDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:474)
    public ClientCountFilter getModificationRecorder(){
        ClientCountFilter rc = new ClientCountFilter();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public ClientCountFilterDMW(ClientCountFilterDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    public ClientCountFilter cloneIt() {
        ClientCountFilter rc = new ClientCountFilter();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ClientCountFilterDMO getDMO() {
        return((ClientCountFilterDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected ClientCountFilterDMW(ClientCountFilterDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getOUIFilter(){
        return(((ClientCountFilterDMO) core).getOUIFilter());
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setOUIFilter(Object value) throws DmcValueException {
        ((ClientCountFilterDMO) core).setOUIFilter(value);
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setOUIFilter(String value){
        ((ClientCountFilterDMO) core).setOUIFilter(value);
    }

    /**
     * Removes the OUIFilter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remOUIFilter(){
        ((ClientCountFilterDMO) core).remOUIFilter();
    }


}
