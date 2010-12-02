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
import org.dmd.dmp.shared.generated.enums.ResponseFormatEnum;
// import 3 ResponseFormatEnum
import org.dmd.dmp.shared.generated.types.DmcTypeResponseFormatEnum;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;

@SuppressWarnings("serial")
/**
 * The request class provides a common base for all request messages.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:451)
 */
abstract public class RequestDMO  extends DMPMessageDMO  {

    public final static String _sessionID = "sessionID";
    public final static String _readableFormat = "readableFormat";
    public final static String _responseFormat = "responseFormat";

    public RequestDMO() {
        super("Request");
    }

    protected RequestDMO(String oc) {
        super(oc);
    }

    public String getSessionID(){
        DmcTypeString attr = (DmcTypeString) get(_sessionID);
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
        DmcAttribute attr = get(_sessionID);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    public void remSessionID(){
         rem(_sessionID);
    }

    public Boolean getReadableFormat(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_readableFormat);
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
        DmcAttribute attr = get(_readableFormat);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_readableFormat,attr);
    }

    /**
     * Removes the readableFormat attribute value.
     */
    public void remReadableFormat(){
         rem(_readableFormat);
    }

    public ResponseFormatEnum getResponseFormat(){
        DmcTypeResponseFormatEnum attr = (DmcTypeResponseFormatEnum) get(_responseFormat);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value A value compatible with DmcTypeResponseFormatEnum
     */
    @SuppressWarnings("unchecked")
    public void setResponseFormat(Object value) throws DmcValueException {
        DmcAttribute attr = get(_responseFormat);
        if (attr == null)
            attr = new DmcTypeResponseFormatEnum();
        
        attr.set(value);
        set(_responseFormat,attr);
    }

    /**
     * Removes the responseFormat attribute value.
     */
    public void remResponseFormat(){
         rem(_responseFormat);
    }




}
