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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 Boolean
import org.dmd.dmc.types.DmcTypeBoolean;
// import 2
import org.dmd.dmp.shared.generated.enums.ResponseCategoryEnum;
// import 3 ResponseCategoryEnum
import org.dmd.dmp.shared.generated.types.DmcTypeResponseCategoryEnum;
// import 2
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
// import 3 ResponseTypeEnum
import org.dmd.dmp.shared.generated.types.DmcTypeResponseTypeEnum;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;

@SuppressWarnings("serial")
/**
 * The Response class serves as a common base for all response messages. It
 * used to be that the Response was abstract, but because we could receive a
 * completely unknown request (for instance via a JSON/XML interface), we had
 * to have the ability to return a generic error response.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:537)
 */
public class ResponseDMO  extends DMPMessageDMO  {

    public final static String _responseText = "responseText";
    public final static String _responseCategory = "responseCategory";
    public final static String _lastResponse = "lastResponse";
    public final static String _responseType = "responseType";

    public ResponseDMO() {
        super("Response");
    }

    protected ResponseDMO(String oc) {
        super(oc);
    }

    public ResponseDMO(ResponseDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public ResponseDMO getOneOfMe() {
        ResponseDMO rc = new ResponseDMO(this.getConstructionClassName());
        return(rc);
    }

    public String getResponseText(){
        DmcTypeString attr = (DmcTypeString) get(_responseText);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseText to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setResponseText(Object value) throws DmcValueException {
        DmcAttribute attr = get(_responseText);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_responseText,attr);
    }

    /**
     * Removes the responseText attribute value.
     */
    public void remResponseText(){
         rem(_responseText);
    }

    public ResponseCategoryEnum getResponseCategory(){
        DmcTypeResponseCategoryEnum attr = (DmcTypeResponseCategoryEnum) get(_responseCategory);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value A value compatible with DmcTypeResponseCategoryEnum
     */
    @SuppressWarnings("unchecked")
    public void setResponseCategory(Object value) throws DmcValueException {
        DmcAttribute attr = get(_responseCategory);
        if (attr == null)
            attr = new DmcTypeResponseCategoryEnum();
        
        attr.set(value);
        set(_responseCategory,attr);
    }

    /**
     * Removes the responseCategory attribute value.
     */
    public void remResponseCategory(){
         rem(_responseCategory);
    }

    public Boolean getLastResponse(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_lastResponse);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setLastResponse(Object value) throws DmcValueException {
        DmcAttribute attr = get(_lastResponse);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_lastResponse,attr);
    }

    /**
     * Removes the lastResponse attribute value.
     */
    public void remLastResponse(){
         rem(_lastResponse);
    }

    public ResponseTypeEnum getResponseType(){
        DmcTypeResponseTypeEnum attr = (DmcTypeResponseTypeEnum) get(_responseType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseType to the specified value.
     * @param value A value compatible with DmcTypeResponseTypeEnum
     */
    @SuppressWarnings("unchecked")
    public void setResponseType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_responseType);
        if (attr == null)
            attr = new DmcTypeResponseTypeEnum();
        
        attr.set(value);
        set(_responseType,attr);
    }

    /**
     * Removes the responseType attribute value.
     */
    public void remResponseType(){
         rem(_responseType);
    }




}
