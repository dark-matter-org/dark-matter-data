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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:279)
import java.io.Serializable;                                                     // Always required
import java.util.*;                                                              // Always required
import org.dmd.dmc.DmcAttribute;                                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                             // Always required
import org.dmd.dmc.DmcSliceInfo;                                                 // Required for object slicing
import org.dmd.dmc.DmcValueException;                                            // Any attributes
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;                           // Base class
import org.dmd.dmp.shared.generated.enums.ResponseCategoryEnum;                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                      // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeResponseCategoryEnumSV;         // Required type
import org.dmd.dmp.shared.generated.types.DmcTypeResponseTypeEnumSV;             // Required type
import org.dmd.dms.generated.enums.ValueTypeEnum;                                // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                             // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                             // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                              // Required type

/**
 * The Response class serves as a common base for all response messages. It
 * used to be that the Response was abstract, but because we could receive a
 * completely unknown request (for instance via a JSON/XML interface), we had
 * to have the ability to return a generic error response.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class ResponseDMO  extends DMPMessageDMO  implements de.novanic.eventservice.client.event.Event, Serializable  {

    public final static String constructionClassName = "Response";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("lastResponse",510,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("responseCategory",505,"ResponseCategoryEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("responseText",506,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("responseType",504,"ResponseTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__lastResponse.id,__lastResponse);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseCategory.id,__responseCategory);
        _ImAp.put(__responseText.id,__responseText);
        _ImAp.put(__responseType.id,__responseType);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__lastResponse.name,__lastResponse);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseCategory.name,__responseCategory);
        _SmAp.put(__responseText.name,__responseText);
        _SmAp.put(__responseType.name,__responseType);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public ResponseDMO() {
        super("Response");
    }

    protected ResponseDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ResponseDMO getNew(){
        ResponseDMO rc = new ResponseDMO();
        return(rc);
    }

    @Override
    public ResponseDMO getSlice(DmcSliceInfo info){
        ResponseDMO rc = new ResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ResponseDMO(DmcTypeModifierMV mods) {
        super("Response");
        modrec(true);
        setModifier(mods);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remHandlerID(){
         rem(__handlerID);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public String getResponseText(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__responseText);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseText to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setResponseText(String value) {
        DmcAttribute<?> attr = get(__responseText);
        if (attr == null)
            attr = new DmcTypeStringSV(__responseText);
        
        try{
            attr.set(value);
            set(__responseText,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets responseText to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setResponseText(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__responseText);
        if (attr == null)
            attr = new DmcTypeStringSV(__responseText);
        
        attr.set(value);
        set(__responseText,attr);
    }

    /**
     * Removes the responseText attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remResponseText(){
         rem(__responseText);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public ResponseCategoryEnum getResponseCategory(){
        DmcTypeResponseCategoryEnumSV attr = (DmcTypeResponseCategoryEnumSV) get(__responseCategory);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value ResponseCategoryEnum
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setResponseCategory(ResponseCategoryEnum value) {
        DmcAttribute<?> attr = get(__responseCategory);
        if (attr == null)
            attr = new DmcTypeResponseCategoryEnumSV(__responseCategory);
        
        try{
            attr.set(value);
            set(__responseCategory,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value A value compatible with DmcTypeResponseCategoryEnumSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setResponseCategory(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__responseCategory);
        if (attr == null)
            attr = new DmcTypeResponseCategoryEnumSV(__responseCategory);
        
        attr.set(value);
        set(__responseCategory,attr);
    }

    /**
     * Removes the responseCategory attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remResponseCategory(){
         rem(__responseCategory);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public Boolean isLastResponse(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__lastResponse);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setLastResponse(Boolean value) {
        DmcAttribute<?> attr = get(__lastResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__lastResponse);
        
        try{
            attr.set(value);
            set(__lastResponse,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setLastResponse(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__lastResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__lastResponse);
        
        attr.set(value);
        set(__lastResponse,attr);
    }

    /**
     * Removes the lastResponse attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remLastResponse(){
         rem(__lastResponse);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:581)
    public ResponseTypeEnum getResponseType(){
        DmcTypeResponseTypeEnumSV attr = (DmcTypeResponseTypeEnumSV) get(__responseType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseType to the specified value.
     * @param value ResponseTypeEnum
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:618)
    public void setResponseType(ResponseTypeEnum value) {
        DmcAttribute<?> attr = get(__responseType);
        if (attr == null)
            attr = new DmcTypeResponseTypeEnumSV(__responseType);
        
        try{
            attr.set(value);
            set(__responseType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets responseType to the specified value.
     * @param value A value compatible with DmcTypeResponseTypeEnumSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:666)
    public void setResponseType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__responseType);
        if (attr == null)
            attr = new DmcTypeResponseTypeEnumSV(__responseType);
        
        attr.set(value);
        set(__responseType,attr);
    }

    /**
     * Removes the responseType attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void remResponseType(){
         rem(__responseType);
    }




}
