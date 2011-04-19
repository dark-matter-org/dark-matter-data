//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmp.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:277)
import java.io.Serializable;                                                   // Always required
import java.util.*;                                                            // Always required
import org.dmd.dmc.DmcAttribute;                                               // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                           // Always required
import org.dmd.dmc.DmcValueException;                                          // Any attributes
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;                         // Base class
import org.dmd.dmp.shared.generated.enums.ResponseFormatEnum;                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeResponseFormatEnumSV;         // Required type
import org.dmd.dms.generated.enums.ValueTypeEnum;                              // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                            // Required type

/**
 * The request class provides a common base for all request messages.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
abstract public class RequestDMO  extends DMPMessageDMO  implements Serializable  {

    public final static String constructionClassName = "Request";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public RequestDMO() {
        super("Request");
    }

    protected RequestDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
    public Integer getHandlerID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__handlerID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets handlerID to the specified value.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
    public void setHandlerID(Integer value) {
        DmcAttribute<?> attr = get(__handlerID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__handlerID);
        
        try{
            attr.set(value);
            set(__handlerID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets handlerID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
    public void setHandlerID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__handlerID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__handlerID);
        
        attr.set(value);
        set(__handlerID,attr);
    }

    /**
     * Removes the handlerID attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remHandlerID(){
         rem(__handlerID);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
    public String getSessionID(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
    public void setSessionID(String value) {
        DmcAttribute<?> attr = get(__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(__sessionID);
        
        try{
            attr.set(value);
            set(__sessionID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
    public void setSessionID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(__sessionID);
        
        attr.set(value);
        set(__sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remSessionID(){
         rem(__sessionID);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
    public Boolean isReadableFormat(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__readableFormat);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
    public void setReadableFormat(Boolean value) {
        DmcAttribute<?> attr = get(__readableFormat);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__readableFormat);
        
        try{
            attr.set(value);
            set(__readableFormat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
    public void setReadableFormat(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__readableFormat);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__readableFormat);
        
        attr.set(value);
        set(__readableFormat,attr);
    }

    /**
     * Removes the readableFormat attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remReadableFormat(){
         rem(__readableFormat);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
    public ResponseFormatEnum getResponseFormat(){
        DmcTypeResponseFormatEnumSV attr = (DmcTypeResponseFormatEnumSV) get(__responseFormat);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value ResponseFormatEnum
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
    public void setResponseFormat(ResponseFormatEnum value) {
        DmcAttribute<?> attr = get(__responseFormat);
        if (attr == null)
            attr = new DmcTypeResponseFormatEnumSV(__responseFormat);
        
        try{
            attr.set(value);
            set(__responseFormat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value A value compatible with DmcTypeResponseFormatEnumSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
    public void setResponseFormat(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__responseFormat);
        if (attr == null)
            attr = new DmcTypeResponseFormatEnumSV(__responseFormat);
        
        attr.set(value);
        set(__responseFormat,attr);
    }

    /**
     * Removes the responseFormat attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remResponseFormat(){
         rem(__responseFormat);
    }




}
