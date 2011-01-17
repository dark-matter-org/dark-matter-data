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
import org.dmd.dmc.types.Modifier;

// import 8
import org.dmd.dmp.server.extended.Request;
// import 9
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;

abstract public class SetRequestDMW extends Request {

    private SetRequestDMO mycore;

    public SetRequestDMW() {
        super(new SetRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._SetRequest);
        mycore = (SetRequestDMO) core;
        mycore.setContainer(this);
    }

    public SetRequestDMW(SetRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._SetRequest);
        mycore = (SetRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (SetRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected SetRequestDMW(SetRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (SetRequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.SetRequest>());
    }

    public String getFQN(){
        return(mycore.getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFQN(Object value) throws DmcValueException {
        mycore.setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    public void remFQN(){
        mycore.remFQN();
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    public Iterator<Modifier> getModify(){
        return(mycore.getModify());
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    public void addModify(Object value) throws DmcValueException {
        mycore.addModify(value);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    public void delModify(Object value){
        mycore.delModify(value);
    }

    /**
     * Removes the modify attribute value.
     */
    public void remModify(){
        mycore.remModify();
    }


}
