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
// import 3 MvcRegistryItem
import org.dmd.features.extgwt.generated.types.DmcTypeMvcRegistryItemREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;
// import 3 MvcView
import org.dmd.features.extgwt.generated.types.DmcTypeMvcViewREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcViewREF;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The MvcController class allows for the definition of controllers. The
 * abstract controller generated by this definition will automatically
 * register for the events you specify via the handlesEvent attribute.
 * Likewise, it will have a standard handleEvent() method that forwards typed
 * events to abstract handler functions that you'll have to write. <P> The
 * definesEvent is populated automatically by the MVC generator based on what
 * event names start with the controllers prefix i.e. app.init is assumed to
 * be defined by the controller whose prefix is "app".
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:380)
 */
public class MvcControllerDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    public final static String _controlsView = "controlsView";
    public final static String _handlesEvent = "handlesEvent";
    public final static String _dispatchesEvent = "dispatchesEvent";
    public final static String _usesRegistryItem = "usesRegistryItem";
    public final static String _createsRegistryItem = "createsRegistryItem";
    public final static String _parentController = "parentController";
    public final static String _definesEvent = "definesEvent";
    public final static String _name = "name";
    public final static String _prefix = "prefix";

    public MvcControllerDMO() {
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcControllerDMO){
            return( getObjectName().equals( ((MvcControllerDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @returns An Iterator of MvcViewDMO objects.
     */
    public Iterator<MvcViewREF> getControlsView(){
        DmcTypeMvcViewREF attr = (DmcTypeMvcViewREF) get(_controlsView);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another controlsView value.
     * @param value A value compatible with MvcView
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addControlsView(Object value) throws DmcValueException {
        DmcAttribute attr = get(_controlsView);
        if (attr == null)
            attr = new DmcTypeMvcViewREF();
        
        attr.add(value);
        add(_controlsView,attr);
        return(attr);
    }

    /**
     * Deletes a controlsView value.
     * @param value The MvcView to be deleted from set of attribute values.
     */
    public void delControlsView(Object value){
        try{
            del(_controlsView, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * @returns An Iterator of MvcEventDMO objects.
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
    public void delHandlesEvent(Object value){
        try{
            del(_handlesEvent, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * @returns An Iterator of MvcEventDMO objects.
     */
    public Iterator<MvcEventREF> getDispatchesEvent(){
        DmcTypeMvcEventREF attr = (DmcTypeMvcEventREF) get(_dispatchesEvent);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dispatchesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDispatchesEvent(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dispatchesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREF();
        
        attr.add(value);
        add(_dispatchesEvent,attr);
        return(attr);
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    public void delDispatchesEvent(Object value){
        try{
            del(_dispatchesEvent, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * @returns An Iterator of MvcRegistryItemDMO objects.
     */
    public Iterator<MvcRegistryItemREF> getUsesRegistryItem(){
        DmcTypeMvcRegistryItemREF attr = (DmcTypeMvcRegistryItemREF) get(_usesRegistryItem);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addUsesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute attr = get(_usesRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREF();
        
        attr.add(value);
        add(_usesRegistryItem,attr);
        return(attr);
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    public void delUsesRegistryItem(Object value){
        try{
            del(_usesRegistryItem, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * @returns An Iterator of MvcRegistryItemDMO objects.
     */
    public Iterator<MvcRegistryItemREF> getCreatesRegistryItem(){
        DmcTypeMvcRegistryItemREF attr = (DmcTypeMvcRegistryItemREF) get(_createsRegistryItem);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addCreatesRegistryItem(Object value) throws DmcValueException {
        DmcAttribute attr = get(_createsRegistryItem);
        if (attr == null)
            attr = new DmcTypeMvcRegistryItemREF();
        
        attr.add(value);
        add(_createsRegistryItem,attr);
        return(attr);
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    public void delCreatesRegistryItem(Object value){
        try{
            del(_createsRegistryItem, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public MvcControllerREF getParentController(){
        DmcTypeMvcControllerREF attr = (DmcTypeMvcControllerREF) get(_parentController);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets parentController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREF
     */
    @SuppressWarnings("unchecked")
    public void setParentController(Object value) throws DmcValueException {
        DmcAttribute attr = get(_parentController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREF();
        
        attr.set(value);
        set(_parentController,attr);
    }

    /**
     * @returns An Iterator of MvcEventDMO objects.
     */
    public Iterator<MvcEventREF> getDefinesEvent(){
        DmcTypeMvcEventREF attr = (DmcTypeMvcEventREF) get(_definesEvent);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another definesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesEvent(Object value) throws DmcValueException {
        DmcAttribute attr = get(_definesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREF();
        
        attr.add(value);
        add(_definesEvent,attr);
        return(attr);
    }

    /**
     * Deletes a definesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    public void delDefinesEvent(Object value){
        try{
            del(_definesEvent, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
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

    public String getPrefix(){
        DmcTypeString attr = (DmcTypeString) get(_prefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets prefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setPrefix(Object value) throws DmcValueException {
        DmcAttribute attr = get(_prefix);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_prefix,attr);
    }




}
