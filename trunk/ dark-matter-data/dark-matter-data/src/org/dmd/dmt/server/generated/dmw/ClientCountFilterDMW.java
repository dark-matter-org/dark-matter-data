package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dms.*;                                                 // Always 2
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
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
public class ClientCountFilterDMW extends DmwWrapper {

    public ClientCountFilterDMW() {
        super(new ClientCountFilterDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    public ClientCountFilterDMW(DmcTypeModifierMV mods) {
        super(new ClientCountFilterDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    public ClientCountFilter getModificationRecorder(){
        ClientCountFilter rc = new ClientCountFilter();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public ClientCountFilterDMW(ClientCountFilterDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilter);
    }

    public ClientCountFilterDMO getDMO() {
        return((ClientCountFilterDMO) core);
    }

    protected ClientCountFilterDMW(ClientCountFilterDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public String getOUIFilter(){
        return(((ClientCountFilterDMO) core).getOUIFilter());
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setOUIFilter(Object value) throws DmcValueException {
        ((ClientCountFilterDMO) core).setOUIFilter(value);
    }

    /**
     * Sets OUIFilter to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setOUIFilter(String value){
        ((ClientCountFilterDMO) core).setOUIFilter(value);
    }

    /**
     * Removes the OUIFilter attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remOUIFilter(){
        ((ClientCountFilterDMO) core).remOUIFilter();
    }


}
