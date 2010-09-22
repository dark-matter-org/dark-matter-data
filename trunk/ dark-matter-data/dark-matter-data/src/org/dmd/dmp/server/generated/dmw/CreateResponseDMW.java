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

import org.dmd.dms.ClassDefinition;

import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmc.DmcObject;

import org.dmd.dmp.server.extended.Response;
// import 4
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;

public class CreateResponseDMW extends Response {

    private CreateResponseDMO mycore;

    public CreateResponseDMW() {
        super(new CreateResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._CreateResponse);
        mycore = (CreateResponseDMO) core;
        mycore.setContainer(this);
    }

    protected CreateResponseDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (CreateResponseDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.CreateResponse>());
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


}
