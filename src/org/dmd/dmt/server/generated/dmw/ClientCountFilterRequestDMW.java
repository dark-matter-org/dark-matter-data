package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                                  // Support for MULTI attribute - (BaseDMWGenerator.java:2150)
import java.util.Iterator;                                                   // Support copy of MV objects - (BaseDMWGenerator.java:2164)
import org.dmd.dmc.*;                                                        // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmp.server.extended.Request;                                  // Derived class - (BaseDMWGenerator.java:1172)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                            // Attribute requestID from the dmp schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.ClassDefinition;                                          // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor - (BaseDMWGenerator.java:996)
import org.dmd.dms.generated.dmw.IntegerIterableDMW;                         // For multi-valued Integer - (BaseDMWGenerator.java:2027)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dmt.server.extended.ClientCountFilter;                        // Is reference type - (BaseDMWGenerator.java:1031)
import org.dmd.dmt.server.extended.ClientCountFilterRequest;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1000)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;                // Reference to unnamed object - (BaseDMWGenerator.java:1036)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class ClientCountFilterRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public ClientCountFilterRequestDMW() {
        super(new ClientCountFilterRequestDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public ClientCountFilterRequestDMW(DmcTypeModifierMV mods) {
        super(new ClientCountFilterRequestDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:509)
    public ClientCountFilterRequest getModificationRecorder(){
        ClientCountFilterRequest rc = new ClientCountFilterRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public ClientCountFilterRequestDMW(ClientCountFilterRequestDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    public ClientCountFilterRequest cloneIt() {
        ClientCountFilterRequest rc = new ClientCountFilterRequest();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ClientCountFilterRequestDMO getDMO() {
        return((ClientCountFilterRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected ClientCountFilterRequestDMW(ClientCountFilterRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ClientCountFilter object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1325)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1443)
    public void setClientCountFilter(ClientCountFilter value) {
        ((ClientCountFilterRequestDMO) core).setClientCountFilter(value.getDMO());
    }

    /**
     * Sets the clientCountFilter to the specified value.
     * @param value A value compatible with ClientCountFilterREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1452)
    public void setClientCountFilter(Object value) throws DmcValueException {
        ((ClientCountFilterRequestDMO) core).setClientCountFilter(value);
    }

    /**
     * Removes the clientCountFilter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remClientCountFilter(){
        ((ClientCountFilterRequestDMO) core).remClientCountFilter();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1595)
    public int getRequestIDSize(){
        return(((ClientCountFilterRequestDMO) core).getRequestIDSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1603)
    public boolean getRequestIDIsEmpty(){
        if (((ClientCountFilterRequestDMO) core).getRequestIDSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1613)
    public boolean getRequestIDHasValue(){
        if (((ClientCountFilterRequestDMO) core).getRequestIDSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2057)
    public void addRequestID(Object value) throws DmcValueException {
        ((ClientCountFilterRequestDMO) core).addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2067)
    public void addRequestID(Integer value){
        ((ClientCountFilterRequestDMO) core).addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2124)
    public boolean requestIDContains(Integer value){
        return(((ClientCountFilterRequestDMO) core).requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2195)
    public void delRequestID(Object value) throws DmcValueException {
        ((ClientCountFilterRequestDMO) core).delRequestID(value);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2204)
    public void delRequestID(Integer value){
        ((ClientCountFilterRequestDMO) core).delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2216)
    public void remRequestID(){
        ((ClientCountFilterRequestDMO) core).remRequestID();
    }


}
