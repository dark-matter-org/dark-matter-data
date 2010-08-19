package org.dmd.dmp.generated.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeBoolean;
import org.dmd.dmc.types.DmcTypeInteger;
import org.dmd.dmc.types.DmcTypeString;

import org.dmd.dmc.DmcObject;

@SuppressWarnings("serial")
/**
 * The request class provides a common base for request messages.
 * 
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:185)
 */
abstract public class RequestDMO  extends DmcObject  {

    public final static String _userName = "userName";
    public final static String _sessionID = "sessionID";
    public final static String _objClass = "objClass";
    public final static String _readableFormat = "readableFormat";
    public final static String _requestID = "requestID";

    public RequestDMO() {
    }

    public String getUserName(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_userName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUserName(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_userName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_userName,attr);
    }

    public String getSessionID(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setSessionID(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_sessionID);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_sessionID,attr);
    }

    public String getObjClass(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_objClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets objClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setObjClass(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_objClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_objClass,attr);
    }

    public Boolean getReadableFormat(){
        DmcTypeBoolean attr = (DmcTypeBoolean) attributes.get(_readableFormat);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setReadableFormat(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_readableFormat);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_readableFormat,attr);
    }

    public Integer getRequestID(){
        DmcTypeInteger attr = (DmcTypeInteger) attributes.get(_requestID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    @SuppressWarnings("unchecked")
    public void setRequestID(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_requestID);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(_requestID,attr);
    }




}
