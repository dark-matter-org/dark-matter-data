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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                                     // Always required - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                 // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcSliceInfo;                                                 // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                            // Any attributes - (GenUtility.java:241)
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;                           // Base class - (GenUtility.java:355)
import org.dmd.dmp.shared.generated.enums.ResponseCategoryEnum;                  // Primitive type and !auxiliary class - (GenUtility.java:271)
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                      // Primitive type and !auxiliary class - (GenUtility.java:271)
import org.dmd.dmp.shared.generated.types.DmcTypeResponseCategoryEnumSV;         // Required type - (GenUtility.java:328)
import org.dmd.dmp.shared.generated.types.DmcTypeResponseTypeEnumSV;             // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                             // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                             // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.generated.types.DmcTypeStringSV;                              // Required type - (GenUtility.java:328)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * The Response class serves as a common base for all response messages. It
 * used to be\n that the Response was abstract, but because we could receive
 * a completely unknown request (for instance\n via a JSON/XML interface), we
 * had to have the ability to return a generic error response.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ResponseDMO  extends DMPMessageDMO  implements de.novanic.eventservice.client.event.Event, Serializable  {

    public final static String constructionClassName = "Response";


    static {
    }

    public ResponseDMO() {
        super("Response");
    }

    protected ResponseDMO(String oc) {
        super(oc);
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

    public ResponseDMO getModificationRecorder(){
        ResponseDMO rc = new ResponseDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public Integer getHandlerID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpDMSAG.__handlerID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets handlerID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setHandlerID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__handlerID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__handlerID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__handlerID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets handlerID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setHandlerID(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpDMSAG.__handlerID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__handlerID);
        
        attr.set(value);
        set(DmpDMSAG.__handlerID,attr);
    }

    /**
     * Removes the handlerID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remHandlerID(){
         rem(DmpDMSAG.__handlerID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public String getResponseText(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__responseText);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseText to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setResponseText(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__responseText);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__responseText);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__responseText,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets responseText to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setResponseText(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__responseText);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__responseText);
        
        attr.set(value);
        set(DmpDMSAG.__responseText,attr);
    }

    /**
     * Removes the responseText attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remResponseText(){
         rem(DmpDMSAG.__responseText);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public ResponseCategoryEnum getResponseCategory(){
        DmcTypeResponseCategoryEnumSV attr = (DmcTypeResponseCategoryEnumSV) get(DmpDMSAG.__responseCategory);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value ResponseCategoryEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setResponseCategory(ResponseCategoryEnum value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__responseCategory);
        if (attr == null)
            attr = new DmcTypeResponseCategoryEnumSV(DmpDMSAG.__responseCategory);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__responseCategory,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value A value compatible with DmcTypeResponseCategoryEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setResponseCategory(Object value) throws DmcValueException {
        DmcTypeResponseCategoryEnumSV attr  = (DmcTypeResponseCategoryEnumSV) get(DmpDMSAG.__responseCategory);
        if (attr == null)
            attr = new DmcTypeResponseCategoryEnumSV(DmpDMSAG.__responseCategory);
        
        attr.set(value);
        set(DmpDMSAG.__responseCategory,attr);
    }

    /**
     * Removes the responseCategory attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remResponseCategory(){
         rem(DmpDMSAG.__responseCategory);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public Boolean isLastResponse(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__lastResponse);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setLastResponse(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__lastResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__lastResponse);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__lastResponse,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setLastResponse(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__lastResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__lastResponse);
        
        attr.set(value);
        set(DmpDMSAG.__lastResponse,attr);
    }

    /**
     * Removes the lastResponse attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remLastResponse(){
         rem(DmpDMSAG.__lastResponse);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public ResponseTypeEnum getResponseType(){
        DmcTypeResponseTypeEnumSV attr = (DmcTypeResponseTypeEnumSV) get(DmpDMSAG.__responseType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseType to the specified value.
     * @param value ResponseTypeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setResponseType(ResponseTypeEnum value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__responseType);
        if (attr == null)
            attr = new DmcTypeResponseTypeEnumSV(DmpDMSAG.__responseType);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__responseType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets responseType to the specified value.
     * @param value A value compatible with DmcTypeResponseTypeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setResponseType(Object value) throws DmcValueException {
        DmcTypeResponseTypeEnumSV attr  = (DmcTypeResponseTypeEnumSV) get(DmpDMSAG.__responseType);
        if (attr == null)
            attr = new DmcTypeResponseTypeEnumSV(DmpDMSAG.__responseType);
        
        attr.set(value);
        set(DmpDMSAG.__responseType,attr);
    }

    /**
     * Removes the responseType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remResponseType(){
         rem(DmpDMSAG.__responseType);
    }




}
