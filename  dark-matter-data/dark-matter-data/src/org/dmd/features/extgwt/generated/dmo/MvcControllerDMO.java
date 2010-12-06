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
// import 3 MvcAction
import org.dmd.features.extgwt.generated.types.DmcTypeMvcActionREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcActionREF;
// import 3 MvcController
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
// import 3 MvcEvent
import org.dmd.features.extgwt.generated.types.DmcTypeMvcEventREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcEventREF;
// import 3 MvcMenu
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcMenuREF;
// import 3 MvcMenuItem
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuItemREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcMenuItemREF;
// import 3 MvcMultiView
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMultiViewREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcMultiViewREF;
// import 3 MvcRegistryItem
import org.dmd.features.extgwt.generated.types.DmcTypeMvcRegistryItemREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;
// import 3 MvcServerEvent
import org.dmd.features.extgwt.generated.types.DmcTypeMvcServerEventREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcServerEventREF;
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
 * events to abstract handler functions that you'll have to write.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:466)
 */
public class MvcControllerDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    public final static String _alias = "alias";
    public final static String _controlsView = "controlsView";
    public final static String _controlsMultiView = "controlsMultiView";
    public final static String _handlesEvent = "handlesEvent";
    public final static String _handlesServerEvent = "handlesServerEvent";
    public final static String _dispatchesEvent = "dispatchesEvent";
    public final static String _usesRegistryItem = "usesRegistryItem";
    public final static String _createsRegistryItem = "createsRegistryItem";
    public final static String _parentController = "parentController";
    public final static String _subpackage = "subpackage";
    public final static String _definesAction = "definesAction";
    public final static String _definesMenu = "definesMenu";
    public final static String _definesMenuItem = "definesMenuItem";
    public final static String _name = "name";

    public MvcControllerDMO() {
        super("MvcController");
    }

    protected MvcControllerDMO(String oc) {
        super(oc);
    }

    public MvcControllerDMO(MvcControllerDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcControllerDMO getOneOfMe() {
        MvcControllerDMO rc = new MvcControllerDMO(this.getConstructionClassName());
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
        if (obj instanceof MvcControllerDMO){
            return( getObjectName().equals( ((MvcControllerDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getAlias(){
        DmcTypeString attr = (DmcTypeString) get(_alias);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets alias to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setAlias(Object value) throws DmcValueException {
        DmcAttribute attr = get(_alias);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_alias,attr);
    }

    /**
     * Removes the alias attribute value.
     */
    public void remAlias(){
         rem(_alias);
    }

    /**
     * @return An Iterator of MvcViewDMO objects.
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
    @SuppressWarnings("unchecked")
    public DmcAttribute delControlsView(Object value){
        return(del(_controlsView, value));
    }

    /**
     * Removes the controlsView attribute value.
     */
    public void remControlsView(){
         rem(_controlsView);
    }

    /**
     * @return An Iterator of MvcMultiViewDMO objects.
     */
    public Iterator<MvcMultiViewREF> getControlsMultiView(){
        DmcTypeMvcMultiViewREF attr = (DmcTypeMvcMultiViewREF) get(_controlsMultiView);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another controlsMultiView value.
     * @param value A value compatible with MvcMultiView
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addControlsMultiView(Object value) throws DmcValueException {
        DmcAttribute attr = get(_controlsMultiView);
        if (attr == null)
            attr = new DmcTypeMvcMultiViewREF();
        
        attr.add(value);
        add(_controlsMultiView,attr);
        return(attr);
    }

    /**
     * Deletes a controlsMultiView value.
     * @param value The MvcMultiView to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delControlsMultiView(Object value){
        return(del(_controlsMultiView, value));
    }

    /**
     * Removes the controlsMultiView attribute value.
     */
    public void remControlsMultiView(){
         rem(_controlsMultiView);
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

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    public Iterator<MvcServerEventREF> getHandlesServerEvent(){
        DmcTypeMvcServerEventREF attr = (DmcTypeMvcServerEventREF) get(_handlesServerEvent);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another handlesServerEvent value.
     * @param value A value compatible with MvcServerEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addHandlesServerEvent(Object value) throws DmcValueException {
        DmcAttribute attr = get(_handlesServerEvent);
        if (attr == null)
            attr = new DmcTypeMvcServerEventREF();
        
        attr.add(value);
        add(_handlesServerEvent,attr);
        return(attr);
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delHandlesServerEvent(Object value){
        return(del(_handlesServerEvent, value));
    }

    /**
     * Removes the handlesServerEvent attribute value.
     */
    public void remHandlesServerEvent(){
         rem(_handlesServerEvent);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
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
    @SuppressWarnings("unchecked")
    public DmcAttribute delDispatchesEvent(Object value){
        return(del(_dispatchesEvent, value));
    }

    /**
     * Removes the dispatchesEvent attribute value.
     */
    public void remDispatchesEvent(){
         rem(_dispatchesEvent);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
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
    @SuppressWarnings("unchecked")
    public DmcAttribute delUsesRegistryItem(Object value){
        return(del(_usesRegistryItem, value));
    }

    /**
     * Removes the usesRegistryItem attribute value.
     */
    public void remUsesRegistryItem(){
         rem(_usesRegistryItem);
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
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
    @SuppressWarnings("unchecked")
    public DmcAttribute delCreatesRegistryItem(Object value){
        return(del(_createsRegistryItem, value));
    }

    /**
     * Removes the createsRegistryItem attribute value.
     */
    public void remCreatesRegistryItem(){
         rem(_createsRegistryItem);
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
     * Removes the parentController attribute value.
     */
    public void remParentController(){
         rem(_parentController);
    }

    public String getSubpackage(){
        DmcTypeString attr = (DmcTypeString) get(_subpackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setSubpackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(_subpackage);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_subpackage,attr);
    }

    /**
     * Removes the subpackage attribute value.
     */
    public void remSubpackage(){
         rem(_subpackage);
    }

    /**
     * @return An Iterator of MvcActionDMO objects.
     */
    public Iterator<MvcActionREF> getDefinesAction(){
        DmcTypeMvcActionREF attr = (DmcTypeMvcActionREF) get(_definesAction);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another definesAction value.
     * @param value A value compatible with MvcAction
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesAction(Object value) throws DmcValueException {
        DmcAttribute attr = get(_definesAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREF();
        
        attr.add(value);
        add(_definesAction,attr);
        return(attr);
    }

    /**
     * Deletes a definesAction value.
     * @param value The MvcAction to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delDefinesAction(Object value){
        return(del(_definesAction, value));
    }

    /**
     * Removes the definesAction attribute value.
     */
    public void remDefinesAction(){
         rem(_definesAction);
    }

    /**
     * @return An Iterator of MvcMenuDMO objects.
     */
    public Iterator<MvcMenuREF> getDefinesMenu(){
        DmcTypeMvcMenuREF attr = (DmcTypeMvcMenuREF) get(_definesMenu);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another definesMenu value.
     * @param value A value compatible with MvcMenu
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesMenu(Object value) throws DmcValueException {
        DmcAttribute attr = get(_definesMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREF();
        
        attr.add(value);
        add(_definesMenu,attr);
        return(attr);
    }

    /**
     * Deletes a definesMenu value.
     * @param value The MvcMenu to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delDefinesMenu(Object value){
        return(del(_definesMenu, value));
    }

    /**
     * Removes the definesMenu attribute value.
     */
    public void remDefinesMenu(){
         rem(_definesMenu);
    }

    /**
     * @return An Iterator of MvcMenuItemDMO objects.
     */
    public Iterator<MvcMenuItemREF> getDefinesMenuItem(){
        DmcTypeMvcMenuItemREF attr = (DmcTypeMvcMenuItemREF) get(_definesMenuItem);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another definesMenuItem value.
     * @param value A value compatible with MvcMenuItem
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesMenuItem(Object value) throws DmcValueException {
        DmcAttribute attr = get(_definesMenuItem);
        if (attr == null)
            attr = new DmcTypeMvcMenuItemREF();
        
        attr.add(value);
        add(_definesMenuItem,attr);
        return(attr);
    }

    /**
     * Deletes a definesMenuItem value.
     * @param value The MvcMenuItem to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delDefinesMenuItem(Object value){
        return(del(_definesMenuItem, value));
    }

    /**
     * Removes the definesMenuItem attribute value.
     */
    public void remDefinesMenuItem(){
         rem(_definesMenuItem);
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




}
