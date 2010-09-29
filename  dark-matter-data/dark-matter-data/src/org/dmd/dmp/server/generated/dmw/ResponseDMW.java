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
import org.dmd.dmp.shared.generated.enums.ResponseCategoryEnum;
// import 3
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;

// import 8
import org.dmd.dmp.server.extended.DMPMessage;
// import 9
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

public class ResponseDMW extends DMPMessage {

    private ResponseDMO mycore;

    public ResponseDMW() {
        super(new ResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._Response);
        mycore = (ResponseDMO) core;
        mycore.setContainer(this);
    }

    public ResponseDMW(ResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._Response);
        mycore = (ResponseDMO) core;
        mycore.setContainer(this);
    }

    protected ResponseDMW(ResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ResponseDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.Response>());
    }

    public String getResponseText(){
        return(mycore.getResponseText());
    }

    /**
     * Sets responseText to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setResponseText(Object value) throws DmcValueException {
        mycore.setResponseText(value);
    }

    public ResponseCategoryEnum getResponseCategory(){
        return(mycore.getResponseCategory());
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value A value compatible with DmcTypeResponseCategoryEnum
     */
    public void setResponseCategory(Object value) throws DmcValueException {
        mycore.setResponseCategory(value);
    }

    public Boolean getLastResponse(){
        return(mycore.getLastResponse());
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setLastResponse(Object value) throws DmcValueException {
        mycore.setLastResponse(value);
    }

    public ResponseTypeEnum getResponseType(){
        return(mycore.getResponseType());
    }

    /**
     * Sets responseType to the specified value.
     * @param value A value compatible with DmcTypeResponseTypeEnum
     */
    public void setResponseType(Object value) throws DmcValueException {
        mycore.setResponseType(value);
    }


}
