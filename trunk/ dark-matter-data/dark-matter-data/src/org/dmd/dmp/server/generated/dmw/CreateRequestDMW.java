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
import org.dmd.dmc.DmcObject;

// import 8
import org.dmd.dmp.server.extended.Request;
// import 9
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;

abstract public class CreateRequestDMW extends Request {

    private CreateRequestDMO mycore;

    public CreateRequestDMW() {
        super(new CreateRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._CreateRequest);
        mycore = (CreateRequestDMO) core;
        mycore.setContainer(this);
    }

    public CreateRequestDMW(CreateRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._CreateRequest);
        mycore = (CreateRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (CreateRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected CreateRequestDMW(CreateRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (CreateRequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.CreateRequest>());
    }

    public String getParentFQN(){
        return(mycore.getParentFQN());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setParentFQN(Object value) throws DmcValueException {
        mycore.setParentFQN(value);
    }

    /**
     * Removes the parentFQN attribute value.
     */
    public void remParentFQN(){
        mycore.remParentFQN();
    }

    public DmcObject getNewObject(){
        return(mycore.getNewObject());
    }

    /**
     * Sets newObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    public void setNewObject(Object value) throws DmcValueException {
        mycore.setNewObject(value);
    }

    /**
     * Removes the newObject attribute value.
     */
    public void remNewObject(){
        mycore.remNewObject();
    }


}
