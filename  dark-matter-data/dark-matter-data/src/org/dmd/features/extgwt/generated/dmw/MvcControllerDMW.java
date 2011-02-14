package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcAction;
// import 1
import org.dmd.features.extgwt.extended.MvcController;
// import 1
import org.dmd.features.extgwt.extended.MvcEvent;
// import 1
import org.dmd.features.extgwt.extended.MvcMenu;
// import 1
import org.dmd.features.extgwt.extended.MvcMenuItem;
// import 1
import org.dmd.features.extgwt.extended.MvcMultiView;
// import 1
import org.dmd.features.extgwt.extended.MvcRegistryItem;
// import 1
import org.dmd.features.extgwt.extended.MvcServerEvent;
// import 1
import org.dmd.features.extgwt.extended.MvcView;

// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;

abstract public class MvcControllerDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcControllerDMO mycore;

    public MvcControllerDMW() {
        super(new MvcControllerDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
        mycore = (MvcControllerDMO) core;
        mycore.setContainer(this);
    }

    public MvcControllerDMW(MvcControllerDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
        mycore = (MvcControllerDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcControllerDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcControllerDMW(MvcControllerDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcControllerDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcController>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcControllerDMW){
            return( getObjectName().equals( ((MvcControllerDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public String getAlias(){
        return(mycore.getAlias());
    }

    /**
     * Sets alias to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setAlias(Object value) throws DmcValueException {
        mycore.setAlias(value);
    }

    /**
     * Removes the alias attribute value.
     */
    public void remAlias(){
        mycore.remAlias();
    }

    /**
     * @return An Iterator of MvcViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcView> getControlsView(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._controlsView);
        if (attr == null)
            return(Collections.<MvcView> emptyList().iterator());
        
        ArrayList<MvcView> refs = (ArrayList<MvcView>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcView> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another controlsView value.
     * @param value A value compatible with MvcView
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addControlsView(MvcView value) throws DmcValueException {
        DmcAttribute attr = mycore.addControlsView(value.getDmcObject());
        ArrayList<MvcView> refs = (ArrayList<MvcView>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcView>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a controlsView value.
     * @param value The MvcView to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delControlsView(MvcView value) throws DmcValueException {
        DmcAttribute attr = mycore.delControlsView(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcView> refs = (ArrayList<MvcView>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the controlsView attribute value.
     */
    public void remControlsView(){
        mycore.remControlsView();
    }

    /**
     * @return An Iterator of MvcMultiViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcMultiView> getControlsMultiView(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._controlsMultiView);
        if (attr == null)
            return(Collections.<MvcMultiView> emptyList().iterator());
        
        ArrayList<MvcMultiView> refs = (ArrayList<MvcMultiView>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcMultiView> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another controlsMultiView value.
     * @param value A value compatible with MvcMultiView
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addControlsMultiView(MvcMultiView value) throws DmcValueException {
        DmcAttribute attr = mycore.addControlsMultiView(value.getDmcObject());
        ArrayList<MvcMultiView> refs = (ArrayList<MvcMultiView>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcMultiView>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a controlsMultiView value.
     * @param value The MvcMultiView to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delControlsMultiView(MvcMultiView value) throws DmcValueException {
        DmcAttribute attr = mycore.delControlsMultiView(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcMultiView> refs = (ArrayList<MvcMultiView>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the controlsMultiView attribute value.
     */
    public void remControlsMultiView(){
        mycore.remControlsMultiView();
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getHandlesEvent(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._handlesEvent);
        if (attr == null)
            return(Collections.<MvcEvent> emptyList().iterator());
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcEvent> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.addHandlesEvent(value.getDmcObject());
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcEvent>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.delHandlesEvent(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    public void remHandlesEvent(){
        mycore.remHandlesEvent();
    }

    /**
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcServerEvent> getHandlesServerEvent(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._handlesServerEvent);
        if (attr == null)
            return(Collections.<MvcServerEvent> emptyList().iterator());
        
        ArrayList<MvcServerEvent> refs = (ArrayList<MvcServerEvent>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcServerEvent> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another handlesServerEvent value.
     * @param value A value compatible with MvcServerEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addHandlesServerEvent(MvcServerEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.addHandlesServerEvent(value.getDmcObject());
        ArrayList<MvcServerEvent> refs = (ArrayList<MvcServerEvent>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcServerEvent>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delHandlesServerEvent(MvcServerEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.delHandlesServerEvent(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcServerEvent> refs = (ArrayList<MvcServerEvent>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the handlesServerEvent attribute value.
     */
    public void remHandlesServerEvent(){
        mycore.remHandlesServerEvent();
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getDispatchesEvent(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._dispatchesEvent);
        if (attr == null)
            return(Collections.<MvcEvent> emptyList().iterator());
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcEvent> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another dispatchesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDispatchesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.addDispatchesEvent(value.getDmcObject());
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcEvent>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delDispatchesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.delDispatchesEvent(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the dispatchesEvent attribute value.
     */
    public void remDispatchesEvent(){
        mycore.remDispatchesEvent();
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcRegistryItem> getUsesRegistryItem(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._usesRegistryItem);
        if (attr == null)
            return(Collections.<MvcRegistryItem> emptyList().iterator());
        
        ArrayList<MvcRegistryItem> refs = (ArrayList<MvcRegistryItem>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcRegistryItem> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addUsesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        DmcAttribute attr = mycore.addUsesRegistryItem(value.getDmcObject());
        ArrayList<MvcRegistryItem> refs = (ArrayList<MvcRegistryItem>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcRegistryItem>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delUsesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        DmcAttribute attr = mycore.delUsesRegistryItem(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcRegistryItem> refs = (ArrayList<MvcRegistryItem>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the usesRegistryItem attribute value.
     */
    public void remUsesRegistryItem(){
        mycore.remUsesRegistryItem();
    }

    /**
     * @return An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcRegistryItem> getCreatesRegistryItem(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._createsRegistryItem);
        if (attr == null)
            return(Collections.<MvcRegistryItem> emptyList().iterator());
        
        ArrayList<MvcRegistryItem> refs = (ArrayList<MvcRegistryItem>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcRegistryItem> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addCreatesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        DmcAttribute attr = mycore.addCreatesRegistryItem(value.getDmcObject());
        ArrayList<MvcRegistryItem> refs = (ArrayList<MvcRegistryItem>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcRegistryItem>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delCreatesRegistryItem(MvcRegistryItem value) throws DmcValueException {
        DmcAttribute attr = mycore.delCreatesRegistryItem(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcRegistryItem> refs = (ArrayList<MvcRegistryItem>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the createsRegistryItem attribute value.
     */
    public void remCreatesRegistryItem(){
        mycore.remCreatesRegistryItem();
    }

    /**
     * @return A MvcController object.
     */
    @SuppressWarnings("unchecked")
    public MvcController getParentController(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._parentController);
        if (attr == null)
            return(null);
        
        MvcController ref = (MvcController) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the parentController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    @SuppressWarnings("unchecked")
    public void setParentController(MvcController value) throws DmcValueException {
        mycore.setParentController(value.getDmcObject());
        DmcAttribute attr = mycore.get(MvcControllerDMO._parentController);
        attr.setAuxData(value);
    }

    /**
     * Removes the parentController attribute value.
     */
    public void remParentController(){
        mycore.remParentController();
    }

    public String getSubpackage(){
        return(mycore.getSubpackage());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setSubpackage(Object value) throws DmcValueException {
        mycore.setSubpackage(value);
    }

    /**
     * Removes the subpackage attribute value.
     */
    public void remSubpackage(){
        mycore.remSubpackage();
    }

    /**
     * @return An Iterator of MvcActionDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcAction> getDefinesAction(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._definesAction);
        if (attr == null)
            return(Collections.<MvcAction> emptyList().iterator());
        
        ArrayList<MvcAction> refs = (ArrayList<MvcAction>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcAction> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another definesAction value.
     * @param value A value compatible with MvcAction
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesAction(MvcAction value) throws DmcValueException {
        DmcAttribute attr = mycore.addDefinesAction(value.getDmcObject());
        ArrayList<MvcAction> refs = (ArrayList<MvcAction>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcAction>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a definesAction value.
     * @param value The MvcAction to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delDefinesAction(MvcAction value) throws DmcValueException {
        DmcAttribute attr = mycore.delDefinesAction(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcAction> refs = (ArrayList<MvcAction>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the definesAction attribute value.
     */
    public void remDefinesAction(){
        mycore.remDefinesAction();
    }

    /**
     * @return An Iterator of MvcMenuDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcMenu> getDefinesMenu(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._definesMenu);
        if (attr == null)
            return(Collections.<MvcMenu> emptyList().iterator());
        
        ArrayList<MvcMenu> refs = (ArrayList<MvcMenu>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcMenu> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another definesMenu value.
     * @param value A value compatible with MvcMenu
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesMenu(MvcMenu value) throws DmcValueException {
        DmcAttribute attr = mycore.addDefinesMenu(value.getDmcObject());
        ArrayList<MvcMenu> refs = (ArrayList<MvcMenu>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcMenu>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a definesMenu value.
     * @param value The MvcMenu to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delDefinesMenu(MvcMenu value) throws DmcValueException {
        DmcAttribute attr = mycore.delDefinesMenu(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcMenu> refs = (ArrayList<MvcMenu>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the definesMenu attribute value.
     */
    public void remDefinesMenu(){
        mycore.remDefinesMenu();
    }

    /**
     * @return An Iterator of MvcMenuItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcMenuItem> getDefinesMenuItem(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._definesMenuItem);
        if (attr == null)
            return(Collections.<MvcMenuItem> emptyList().iterator());
        
        ArrayList<MvcMenuItem> refs = (ArrayList<MvcMenuItem>) attr.getAuxData();
        
        if (refs == null)
            return(Collections.<MvcMenuItem> emptyList().iterator());
        
        return(refs.iterator());
    }

    /**
     * Adds another definesMenuItem value.
     * @param value A value compatible with MvcMenuItem
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesMenuItem(MvcMenuItem value) throws DmcValueException {
        DmcAttribute attr = mycore.addDefinesMenuItem(value.getDmcObject());
        ArrayList<MvcMenuItem> refs = (ArrayList<MvcMenuItem>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcMenuItem>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a definesMenuItem value.
     * @param value The MvcMenuItem to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delDefinesMenuItem(MvcMenuItem value) throws DmcValueException {
        DmcAttribute attr = mycore.delDefinesMenuItem(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcMenuItem> refs = (ArrayList<MvcMenuItem>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the definesMenuItem attribute value.
     */
    public void remDefinesMenuItem(){
        mycore.remDefinesMenuItem();
    }

    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
        mycore.remName();
    }


}
