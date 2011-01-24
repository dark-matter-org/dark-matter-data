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
// import 3
import org.dmd.dmp.shared.generated.enums.ScopeEnum;

// import 8
import org.dmd.dmp.server.extended.Request;
// import 9
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;

abstract public class ActionRequestDMW extends Request {

    private ActionRequestDMO mycore;

    public ActionRequestDMW() {
        super(new ActionRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
        mycore = (ActionRequestDMO) core;
        mycore.setContainer(this);
    }

    public ActionRequestDMW(ActionRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
        mycore = (ActionRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (ActionRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected ActionRequestDMW(ActionRequestDMO obj, ClassDefinition cd) {
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

    /**
     * Removes the scope attribute value.
     */
    public void remScope(){
        mycore.remScope();
    }

    /**
     * @return An Iterator of DmcObject objects.
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
    public void delObjectList(Object value) throws DmcValueException {
        mycore.delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    public void remObjectList(){
        mycore.remObjectList();
    }

    public DmcObject getActionTrigger(){
        return(mycore.getActionTrigger());
    }

    /**
     * Sets actionTrigger to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    public void setActionTrigger(Object value) throws DmcValueException {
        mycore.setActionTrigger(value);
    }

    /**
     * Removes the actionTrigger attribute value.
     */
    public void remActionTrigger(){
        mycore.remActionTrigger();
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

    /**
     * Removes the actionName attribute value.
     */
    public void remActionName(){
        mycore.remActionName();
    }


}
