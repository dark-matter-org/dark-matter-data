package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.ArrayList;                                                  // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1048)
import java.util.Iterator;                                                   // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2099)
import org.dmd.dmc.*;                                                        // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmp.server.extended.Request;                                  // Derived class - (BaseDMWGeneratorNewest.java:1115)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                            // Attribute requestID from the dmp schema - (BaseDMWGeneratorNewest.java:771)
import org.dmd.dms.*;                                                        // Always 2 - (BaseDMWGeneratorNewest.java:939)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.dmw.IntegerIterableDMW;                         // For multi-valued Integer - (BaseDMWGeneratorNewest.java:1964)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmt.server.extended.ClientCountFilter;                        // Is reference type - (BaseDMWGeneratorNewest.java:974)
import org.dmd.dmt.server.extended.ClientCountFilterRequest;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:947)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;                // Reference to unnamed object - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class ClientCountFilterRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public ClientCountFilterRequestDMW() {
        super(new ClientCountFilterRequestDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public ClientCountFilterRequestDMW(DmcTypeModifierMV mods) {
        super(new ClientCountFilterRequestDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:474)
    public ClientCountFilterRequest getModificationRecorder(){
        ClientCountFilterRequest rc = new ClientCountFilterRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public ClientCountFilterRequestDMW(ClientCountFilterRequestDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    public ClientCountFilterRequestDMO getDMO() {
        return((ClientCountFilterRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected ClientCountFilterRequestDMW(ClientCountFilterRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ClientCountFilter object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1268)
    public ClientCountFilter getClientCountFilter(){
        ClientCountFilterDMO dmo = ((ClientCountFilterRequestDMO) core).getClientCountFilter();
        if (dmo == null)
            return(null);
        
        return((ClientCountFilter)dmo.getContainer());
    }

    /**
     * Sets the clientCountFilter to the specified value.
     * @param value A value compatible with ClientCountFilterREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1382)
    public void setClientCountFilter(ClientCountFilter value) {
        ((ClientCountFilterRequestDMO) core).setClientCountFilter(value.getDMO());
    }

    /**
     * Sets the clientCountFilter to the specified value.
     * @param value A value compatible with ClientCountFilterREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1391)
    public void setClientCountFilter(Object value) throws DmcValueException {
        ((ClientCountFilterRequestDMO) core).setClientCountFilter(value);
    }

    /**
     * Removes the clientCountFilter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remClientCountFilter(){
        ((ClientCountFilterRequestDMO) core).remClientCountFilter();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getRequestIDSize(){
        return(((ClientCountFilterRequestDMO) core).getRequestIDSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getRequestIDIsEmpty(){
        if (((ClientCountFilterRequestDMO) core).getRequestIDSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getRequestIDHasValue(){
        if (((ClientCountFilterRequestDMO) core).getRequestIDSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1968)
    public IntegerIterableDMW getRequestIDIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__requestID);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(((ClientCountFilterRequestDMO) core).getRequestID()));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1994)
    public void addRequestID(Object value) throws DmcValueException {
        ((ClientCountFilterRequestDMO) core).addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2004)
    public void addRequestID(Integer value){
        ((ClientCountFilterRequestDMO) core).addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2061)
    public boolean requestIDContains(Integer value){
        return(((ClientCountFilterRequestDMO) core).requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2103)
    @SuppressWarnings("unchecked")
    public ArrayList<Integer> getRequestIDCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__requestID);
        if (attr == null)
            return(new ArrayList<Integer>());
        
        ArrayList<Integer> rc = new ArrayList<Integer>(attr.getMVSize());
        
        Iterator<Integer> it = (Iterator<Integer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2130)
    public void delRequestID(Object value) throws DmcValueException {
        ((ClientCountFilterRequestDMO) core).delRequestID(value);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2139)
    public void delRequestID(Integer value){
        ((ClientCountFilterRequestDMO) core).delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remRequestID(){
        ((ClientCountFilterRequestDMO) core).remRequestID();
    }


}
