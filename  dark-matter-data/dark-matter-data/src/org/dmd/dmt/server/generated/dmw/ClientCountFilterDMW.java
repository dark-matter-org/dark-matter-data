package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:950)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.dmt.server.extended.ClientCountFilter;                 // Required for getModificationRecorder()
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;         // Class not auxiliary or abstract
import org.dmd.dmw.DmwWrapper;                                        // Unnamed object wrapper

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:364)
 */
public class ClientCountFilterDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:441)
    public ClientCountFilterDMW() {
        super(new ClientCountFilterDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:447)
    public ClientCountFilterDMW(DmcTypeModifierMV mods) {
        super(new ClientCountFilterDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:468)
    public ClientCountFilter getModificationRecorder(){
        ClientCountFilter rc = new ClientCountFilter();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:510)
    public ClientCountFilterDMW(ClientCountFilterDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    public ClientCountFilterDMO getDMO() {
        return((ClientCountFilterDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:527)
    protected ClientCountFilterDMW(ClientCountFilterDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1129)
    public String getOUIFilter(){
        return(((ClientCountFilterDMO) core).getOUIFilter());
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1188)
    public void setOUIFilter(Object value) throws DmcValueException {
        ((ClientCountFilterDMO) core).setOUIFilter(value);
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1197)
    public void setOUIFilter(String value){
        ((ClientCountFilterDMO) core).setOUIFilter(value);
    }

    /**
     * Removes the OUIFilter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1223)
    public void remOUIFilter(){
        ((ClientCountFilterDMO) core).remOUIFilter();
    }


}
