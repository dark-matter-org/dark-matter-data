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
package org.dmd.dmp.server.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 3
import org.dmd.dmp.shared.generated.enums.ResponseFormatEnum;

// import 6
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
// import 8
import org.dmd.dmp.server.extended.DMPMessage;

public class RequestDMW extends DMPMessage {

    private RequestDMO mycore;

    protected RequestDMW(RequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (RequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.Request>());
    }

    public String getSessionID(){
        return(mycore.getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setSessionID(Object value) throws DmcValueException {
        mycore.setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    public void remSessionID(){
        mycore.remSessionID();
    }

    public Boolean getReadableFormat(){
        return(mycore.getReadableFormat());
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setReadableFormat(Object value) throws DmcValueException {
        mycore.setReadableFormat(value);
    }

    /**
     * Removes the readableFormat attribute value.
     */
    public void remReadableFormat(){
        mycore.remReadableFormat();
    }

    public ResponseFormatEnum getResponseFormat(){
        return(mycore.getResponseFormat());
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value A value compatible with DmcTypeResponseFormatEnum
     */
    public void setResponseFormat(Object value) throws DmcValueException {
        mycore.setResponseFormat(value);
    }

    /**
     * Removes the responseFormat attribute value.
     */
    public void remResponseFormat(){
        mycore.remResponseFormat();
    }


}
