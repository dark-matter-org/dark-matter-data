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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                                   // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                                               // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcValueException;                                          // Any attributes - (GenUtility.java:237)
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;                         // Base class - (GenUtility.java:351)
import org.dmd.dmp.shared.generated.enums.ResponseFormatEnum;                  // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dmp.shared.generated.types.DmcTypeResponseFormatEnumSV;         // Required type - (GenUtility.java:324)
import org.dmd.dmr.shared.base.generated.dmo.DmrBaseDMSAG;                     // Attribute from dmr.base schema - (GenUtility.java:134)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                           // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                           // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSV;                            // Required type - (GenUtility.java:324)

/**
 * The request class provides a common base for all request messages.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class RequestDMO  extends DMPMessageDMO  implements Serializable  {

    public final static String constructionClassName = "Request";


    static {
    }

    public RequestDMO() {
        super("Request");
    }

    protected RequestDMO(String oc) {
        super(oc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remHandlerID(){
         rem(DmpDMSAG.__handlerID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getSessionID(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSessionID(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__sessionID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__sessionID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSessionID(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__sessionID);
        
        attr.set(value);
        set(DmpDMSAG.__sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSessionID(){
         rem(DmpDMSAG.__sessionID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isReadableFormat(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__readableFormat);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setReadableFormat(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__readableFormat);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__readableFormat);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__readableFormat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setReadableFormat(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__readableFormat);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__readableFormat);
        
        attr.set(value);
        set(DmpDMSAG.__readableFormat,attr);
    }

    /**
     * Removes the readableFormat attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remReadableFormat(){
         rem(DmpDMSAG.__readableFormat);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public ResponseFormatEnum getResponseFormat(){
        DmcTypeResponseFormatEnumSV attr = (DmcTypeResponseFormatEnumSV) get(DmpDMSAG.__responseFormat);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value ResponseFormatEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setResponseFormat(ResponseFormatEnum value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__responseFormat);
        if (attr == null)
            attr = new DmcTypeResponseFormatEnumSV(DmpDMSAG.__responseFormat);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__responseFormat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value A value compatible with DmcTypeResponseFormatEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setResponseFormat(Object value) throws DmcValueException {
        DmcTypeResponseFormatEnumSV attr  = (DmcTypeResponseFormatEnumSV) get(DmpDMSAG.__responseFormat);
        if (attr == null)
            attr = new DmcTypeResponseFormatEnumSV(DmpDMSAG.__responseFormat);
        
        attr.set(value);
        set(DmpDMSAG.__responseFormat,attr);
    }

    /**
     * Removes the responseFormat attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remResponseFormat(){
         rem(DmpDMSAG.__responseFormat);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Integer getOriginatorID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpDMSAG.__originatorID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setOriginatorID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__originatorID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__originatorID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setOriginatorID(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpDMSAG.__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__originatorID);
        
        attr.set(value);
        set(DmpDMSAG.__originatorID,attr);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remOriginatorID(){
         rem(DmpDMSAG.__originatorID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Integer getTimeoutSeconds(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpDMSAG.__timeoutSeconds);
        if (attr == null)
            return(2);

        return(attr.getSV());
    }

    /**
     * Sets timeoutSeconds to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setTimeoutSeconds(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__timeoutSeconds);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__timeoutSeconds);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__timeoutSeconds,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets timeoutSeconds to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setTimeoutSeconds(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpDMSAG.__timeoutSeconds);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__timeoutSeconds);
        
        attr.set(value);
        set(DmpDMSAG.__timeoutSeconds,attr);
    }

    /**
     * Removes the timeoutSeconds attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remTimeoutSeconds(){
         rem(DmpDMSAG.__timeoutSeconds);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isNotifyOriginator(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__notifyOriginator);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setNotifyOriginator(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__notifyOriginator);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__notifyOriginator);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__notifyOriginator,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setNotifyOriginator(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__notifyOriginator);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__notifyOriginator);
        
        attr.set(value);
        set(DmpDMSAG.__notifyOriginator,attr);
    }

    /**
     * Removes the notifyOriginator attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remNotifyOriginator(){
         rem(DmpDMSAG.__notifyOriginator);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getUserName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmrBaseDMSAG.__userName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setUserName(String value) {
        DmcAttribute<?> attr = get(DmrBaseDMSAG.__userName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmrBaseDMSAG.__userName);
        
        try{
            attr.set(value);
            set(DmrBaseDMSAG.__userName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setUserName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmrBaseDMSAG.__userName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmrBaseDMSAG.__userName);
        
        attr.set(value);
        set(DmrBaseDMSAG.__userName,attr);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remUserName(){
         rem(DmrBaseDMSAG.__userName);
    }




}
