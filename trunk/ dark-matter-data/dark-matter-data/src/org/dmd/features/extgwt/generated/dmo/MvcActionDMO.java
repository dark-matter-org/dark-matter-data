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
package org.dmd.features.extgwt.generated.dmo;

import java.util.*;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 MvcController
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
// import 3 MvcEvent
import org.dmd.features.extgwt.generated.types.DmcTypeMvcEventREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcEventREF;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The MvcAction class allows for the definition of behaviour that can be
 * associated with menus, buttons and other UI components. Actions are
 * associated with controllers so that they can be informed of events in
 * which they're interested, since only controllers can register for events.
 * Actions may be defined and used by  menu items defined in other
 * Controllers.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:466)
 */
public class MvcActionDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    public final static String _handlesEvent = "handlesEvent";
    public final static String _name = "name";
    public final static String _associatedController = "associatedController";

    public MvcActionDMO() {
        super("MvcAction");
    }

    protected MvcActionDMO(String oc) {
        super(oc);
    }

    public MvcActionDMO(MvcActionDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcActionDMO getOneOfMe() {
        MvcActionDMO rc = new MvcActionDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcActionDMO){
            return( getObjectName().equals( ((MvcActionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    public Iterator<MvcEventREF> getHandlesEvent(){
        DmcTypeMvcEventREF attr = (DmcTypeMvcEventREF) get(_handlesEvent);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute attr = get(_handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREF();
        
        attr.add(value);
        add(_handlesEvent,attr);
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delHandlesEvent(Object value){
        return(del(_handlesEvent, value));
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    public void remHandlesEvent(){
         rem(_handlesEvent);
    }

    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
         rem(_name);
    }

    public MvcControllerREF getAssociatedController(){
        DmcTypeMvcControllerREF attr = (DmcTypeMvcControllerREF) get(_associatedController);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets associatedController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREF
     */
    @SuppressWarnings("unchecked")
    public void setAssociatedController(Object value) throws DmcValueException {
        DmcAttribute attr = get(_associatedController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREF();
        
        attr.set(value);
        set(_associatedController,attr);
    }

    /**
     * Removes the associatedController attribute value.
     */
    public void remAssociatedController(){
         rem(_associatedController);
    }




}
