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
import org.dmd.dmp.server.extended.Response;
// import 9
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;

public class ActionResponseDMW extends Response {

    private ActionResponseDMO mycore;

    public ActionResponseDMW() {
        super(new ActionResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._ActionResponse);
        mycore = (ActionResponseDMO) core;
        mycore.setContainer(this);
    }

    public ActionResponseDMW(ActionResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._ActionResponse);
        mycore = (ActionResponseDMO) core;
        mycore.setContainer(this);
    }

    protected ActionResponseDMW(ActionResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ActionResponseDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.ActionResponse>());
    }

    /**
     * @returns An Iterator of DmcObject objects.
     */
    public Iterator<DmcObject> getObjectList(){
        return(mycore.getObjectList());
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    public void addObjectList(Object value) throws DmcValueException {
        mycore.addObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    public void delObjectList(Object value){
        mycore.delObjectList(value);
    }

    public Long getTimeMS(){
        return(mycore.getTimeMS());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    public void setTimeMS(Object value) throws DmcValueException {
        mycore.setTimeMS(value);
    }


}
