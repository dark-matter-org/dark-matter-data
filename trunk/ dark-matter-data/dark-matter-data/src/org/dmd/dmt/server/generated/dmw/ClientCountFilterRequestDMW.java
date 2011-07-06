package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import java.util.ArrayList;                                                  // To support getMVCopy()
import java.util.Iterator;                                                   // To support getMVCopy()
import org.dmd.dmc.*;                                                        // If any attributes
import org.dmd.dmp.server.extended.Request;                                  // Derived class
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                            // Attribute from dmp schema
import org.dmd.dms.*;                                                        // Always 2
import org.dmd.dms.generated.dmw.IntegerIterableDMW;                         // For multi-valued Integer
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor
import org.dmd.dmt.server.extended.ClientCountFilter;                        // Is reference type aux
import org.dmd.dmt.server.extended.ClientCountFilterRequest;                 // Required for getModificationRecorder()
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;                // Reference to unnamed object
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                            // Attribute from dmt schema

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class ClientCountFilterRequestDMW extends Request {

    public ClientCountFilterRequestDMW() {
        super(new ClientCountFilterRequestDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    public ClientCountFilterRequestDMW(DmcTypeModifierMV mods) {
        super(new ClientCountFilterRequestDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    public ClientCountFilterRequest getModificationRecorder(){
        ClientCountFilterRequest rc = new ClientCountFilterRequest();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public ClientCountFilterRequestDMW(ClientCountFilterRequestDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ClientCountFilterRequest);
    }

    public ClientCountFilterRequestDMO getDMO() {
        return((ClientCountFilterRequestDMO) core);
    }

    protected ClientCountFilterRequestDMW(ClientCountFilterRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ClientCountFilter object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1058)
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
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1122)
    public void setClientCountFilter(ClientCountFilter value) {
        ((ClientCountFilterRequestDMO) core).setClientCountFilter(value.getDMO());
    }

    /**
     * Removes the clientCountFilter attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1180)
    public void remClientCountFilter(){
        ((ClientCountFilterRequestDMO) core).remClientCountFilter();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1232)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__requestID);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public boolean getRequestIDIsEmpty(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__requestID);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1257)
    public boolean getRequestIDHasValue(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__requestID);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1452)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1468)
    public void addRequestID(Object value) throws DmcValueException {
        ((ClientCountFilterRequestDMO) core).addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1478)
    public void addRequestID(Integer value){
        ((ClientCountFilterRequestDMO) core).addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1525)
    public boolean requestIDContains(Integer value){
        return(((ClientCountFilterRequestDMO) core).requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1565)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1592)
    public void delRequestID(Object value) throws DmcValueException {
        ((ClientCountFilterRequestDMO) core).delRequestID(value);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1601)
    public void delRequestID(Integer value){
        ((ClientCountFilterRequestDMO) core).delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1613)
    public void remRequestID(){
        ((ClientCountFilterRequestDMO) core).remRequestID();
    }


}
