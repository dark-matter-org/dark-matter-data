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
// import 2
import org.dmd.dmp.shared.generated.enums.ScopeEnum;

import org.dmd.dmp.server.extended.Request;
// import 4
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;

public class ActionRequestDMW extends Request {

    private ActionRequestDMO mycore;

    public ActionRequestDMW() {
        super(new ActionRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
        mycore = (ActionRequestDMO) core;
        mycore.setContainer(this);
    }

    protected ActionRequestDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ActionRequestDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.ActionRequest>());
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

    public String getActionName(){
        return(mycore.getActionName());
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setActionName(Object value) throws DmcValueException {
        mycore.setActionName(value);
    }


}
