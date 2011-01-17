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
import org.dmd.dmp.shared.generated.enums.ScopeEnum;

// import 8
import org.dmd.dmp.server.extended.Request;
// import 9
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;

abstract public class DeleteRequestDMW extends Request {

    private DeleteRequestDMO mycore;

    public DeleteRequestDMW() {
        super(new DeleteRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
        mycore = (DeleteRequestDMO) core;
        mycore.setContainer(this);
    }

    public DeleteRequestDMW(DeleteRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
        mycore = (DeleteRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (DeleteRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected DeleteRequestDMW(DeleteRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DeleteRequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.DeleteRequest>());
    }

    public ScopeEnum getScope(){
        return(mycore.getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    public void setScope(Object value) throws DmcValueException {
        mycore.setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    public void remScope(){
        mycore.remScope();
    }

    /**
     * @return An Iterator of String objects.
     */
    public Iterator<String> getFQNList(){
        return(mycore.getFQNList());
    }

    /**
     * Adds another FQNList value.
     * @param value A value compatible with String
     */
    public void addFQNList(Object value) throws DmcValueException {
        mycore.addFQNList(value);
    }

    /**
     * Deletes a FQNList value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delFQNList(Object value){
        mycore.delFQNList(value);
    }

    /**
     * Removes the FQNList attribute value.
     */
    public void remFQNList(){
        mycore.remFQNList();
    }


}
