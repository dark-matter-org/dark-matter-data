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
import org.dmd.dmp.shared.generated.enums.EventTypeEnum;

// import 8
import org.dmd.dmp.server.extended.DMPMessage;
// import 9
import org.dmd.dmp.shared.generated.dmo.EventDMO;

public class EventDMW extends DMPMessage {

    private EventDMO mycore;

    public EventDMW() {
        super(new EventDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._Event);
        mycore = (EventDMO) core;
        mycore.setContainer(this);
    }

    public EventDMW(EventDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._Event);
        mycore = (EventDMO) core;
        mycore.setContainer(this);
    }

    protected EventDMW(EventDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (EventDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.Event>());
    }

    public String getObjName(){
        return(mycore.getObjName());
    }

    /**
     * Sets objName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setObjName(Object value) throws DmcValueException {
        mycore.setObjName(value);
    }

    /**
     * Removes the objName attribute value.
     */
    public void remObjName(){
        mycore.remObjName();
    }

    public String getObjClass(){
        return(mycore.getObjClass());
    }

    /**
     * Sets objClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setObjClass(Object value) throws DmcValueException {
        mycore.setObjClass(value);
    }

    /**
     * Removes the objClass attribute value.
     */
    public void remObjClass(){
        mycore.remObjClass();
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

    /**
     * Removes the objectList attribute value.
     */
    public void remObjectList(){
        mycore.remObjectList();
    }

    public EventTypeEnum getEventType(){
        return(mycore.getEventType());
    }

    /**
     * Sets eventType to the specified value.
     * @param value A value compatible with DmcTypeEventTypeEnum
     */
    public void setEventType(Object value) throws DmcValueException {
        mycore.setEventType(value);
    }

    /**
     * Removes the eventType attribute value.
     */
    public void remEventType(){
        mycore.remEventType();
    }


}
