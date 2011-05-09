package org.dmd.dmt.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                                     // Always required
import java.util.*;                                                              // Always required
import org.dmd.dmc.DmcAttribute;                                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                             // Always required
import org.dmd.dmc.DmcSliceInfo;                                                 // Required for object slicing
import org.dmd.dmc.DmcValueException;                                            // Any attributes
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                              // Base class
import org.dmd.dms.generated.enums.DataTypeEnum;                                 // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                                // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerMV;                             // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;                    // Type specific set/add
import org.dmd.dmt.shared.generated.types.DmcTypeClientCountFilterREFSV;         // Reference type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class ClientCountFilterRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "ClientCountFilterRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __clientCountFilter = new DmcAttributeInfo("clientCountFilter",10408,"ClientCountFilter",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("originatorID",526,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__clientCountFilter.id,__clientCountFilter);
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__originatorID.id,__originatorID);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__clientCountFilter.name,__clientCountFilter);
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__originatorID.name,__originatorID);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__timeMS.name,__timeMS);

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

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
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

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:513)
    public ClientCountFilterDMO getClientCountFilter(){
        DmcTypeClientCountFilterREFSV attr = (DmcTypeClientCountFilterREFSV) get(__clientCountFilter);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets clientCountFilter to the specified value.
     * @param value ClientCountFilterDMO
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:566)
    public void setClientCountFilter(ClientCountFilterDMO value) {
        DmcAttribute<?> attr = get(__clientCountFilter);
        if (attr == null)
            attr = new DmcTypeClientCountFilterREFSV(__clientCountFilter);
        
        try{
            attr.set(value);
            set(__clientCountFilter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets clientCountFilter to the specified value.
     * @param value A value compatible with DmcTypeClientCountFilterREFSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setClientCountFilter(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__clientCountFilter);
        if (attr == null)
            attr = new DmcTypeClientCountFilterREFSV(__clientCountFilter);
        
        attr.set(value);
        set(__clientCountFilter,attr);
    }

    /**
     * Removes the clientCountFilter attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remClientCountFilter(){
         rem(__clientCountFilter);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<Integer> getRequestID(){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(__requestID);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Integer value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public Integer getNthRequestID(int i){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(__requestID);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another requestID to the specified value.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addRequestID(Integer value) {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(__requestID);
        
        try{
            setLastValue(attr.add(value));
            add(__requestID,attr);
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean requestIDContains(Integer value) {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(__requestID);
        
        setLastValue(attr.add(value));
        add(__requestID,attr);
        return(attr);
    }

    /**
     * Returns the number of values in requestID
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(__requestID), value);
        else
            attr = del(__requestID, value);
        
        return(attr);
    }

    /**
     * Deletes a requestID from the specified value.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delRequestID(Integer value) {
        DmcAttribute<?> attr = get(__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(__requestID), value);
        else
            attr = del(__requestID, value);
        
        return(attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remRequestID(){
         rem(__requestID);
    }




}
