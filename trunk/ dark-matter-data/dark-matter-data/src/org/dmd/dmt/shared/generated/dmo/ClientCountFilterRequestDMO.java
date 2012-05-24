package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:363)
import java.io.Serializable;                                                     // Always required - (GenUtility.java:197)
import java.util.*;                                                              // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                                 // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcSliceInfo;                                                 // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                            // Any attributes - (GenUtility.java:214)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                                // Attribute from dmp schema - (GenUtility.java:176)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                              // Base class - (GenUtility.java:323)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeIntegerMV;                             // Required type - (GenUtility.java:296)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;                    // Type specific set/add - (GenUtility.java:275)
import org.dmd.dmt.shared.generated.types.DmcTypeClientCountFilterREFSV;         // Reference type - (GenUtility.java:273)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ClientCountFilterRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "ClientCountFilterRequest";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ClientCountFilterRequestDMO() {
        super("ClientCountFilterRequest");
    }

    protected ClientCountFilterRequestDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public ClientCountFilterRequestDMO getNew(){
        ClientCountFilterRequestDMO rc = new ClientCountFilterRequestDMO();
        return(rc);
    }

    @Override
    public ClientCountFilterRequestDMO getSlice(DmcSliceInfo info){
        ClientCountFilterRequestDMO rc = new ClientCountFilterRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ClientCountFilterRequestDMO(DmcTypeModifierMV mods) {
        super("ClientCountFilterRequest");
        modrec(true);
        setModifier(mods);
    }

    public ClientCountFilterRequestDMO getModificationRecorder(){
        ClientCountFilterRequestDMO rc = new ClientCountFilterRequestDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:614)
    public ClientCountFilterDMO getClientCountFilter(){
        DmcTypeClientCountFilterREFSV attr = (DmcTypeClientCountFilterREFSV) get(DmtDMSAG.__clientCountFilter);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets clientCountFilter to the specified value.
     * @param value ClientCountFilterDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setClientCountFilter(ClientCountFilterDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__clientCountFilter);
        if (attr == null)
            attr = new DmcTypeClientCountFilterREFSV(DmtDMSAG.__clientCountFilter);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__clientCountFilter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets clientCountFilter to the specified value.
     * @param value A value compatible with DmcTypeClientCountFilterREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:783)
    public void setClientCountFilter(Object value) throws DmcValueException {
        DmcTypeClientCountFilterREFSV attr  = (DmcTypeClientCountFilterREFSV) get(DmtDMSAG.__clientCountFilter);
        if (attr == null)
            attr = new DmcTypeClientCountFilterREFSV(DmtDMSAG.__clientCountFilter);
        
        attr.set(value);
        set(DmtDMSAG.__clientCountFilter,attr);
    }

    /**
     * Removes the clientCountFilter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:803)
    public void remClientCountFilter(){
         rem(DmtDMSAG.__clientCountFilter);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1018)
    public Iterator<Integer> getRequestID(){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmpDMSAG.__requestID);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Integer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1030)
    public Integer getNthRequestID(int i){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmpDMSAG.__requestID);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another requestID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1044)
    public DmcAttribute<?> addRequestID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmpDMSAG.__requestID);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__requestID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Integer.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1119)
    public boolean requestIDContains(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1151)
    public DmcAttribute<?> addRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmpDMSAG.__requestID);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__requestID,attr);
        return(attr);
    }

    /**
     * Returns the number of values in requestID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1168)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null){
            if (DmpDMSAG.__requestID.indexSize == 0)
                return(0);
            else
                return(DmpDMSAG.__requestID.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1226)
    public DmcAttribute<?> delRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmpDMSAG.__requestID), value);
        else
            attr = del(DmpDMSAG.__requestID, value);
        
        return(attr);
    }

    /**
     * Deletes a requestID from the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> delRequestID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmpDMSAG.__requestID), value);
        else
            attr = del(DmpDMSAG.__requestID, value);
        
        return(attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1261)
    public void remRequestID(){
         rem(DmpDMSAG.__requestID);
    }




}
