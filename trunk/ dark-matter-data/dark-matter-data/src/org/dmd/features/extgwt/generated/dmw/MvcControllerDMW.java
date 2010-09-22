package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dms.ClassDefinition;

import org.dmd.dmc.DmcAttribute;

import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmc.DmcObject;
// import 1
import org.dmd.features.extgwt.extended.MvcController;
// import 1
import org.dmd.features.extgwt.extended.MvcEvent;
// import 1
import org.dmd.features.extgwt.extended.MvcRegistryItem;
// import 1
import org.dmd.features.extgwt.extended.MvcView;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 4
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;

public class MvcControllerDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcControllerDMO mycore;

    public MvcControllerDMW() {
        super(new MvcControllerDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcController);
        mycore = (MvcControllerDMO) core;
        mycore.setContainer(this);
    }

    protected MvcControllerDMW(DmcObject obj, ClassDefinition cd) {
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

    /**
     * @returns An Iterator of MvcViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcView> getControlsView(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._controlsView);
        if (attr == null)
            return(null);
        
        ArrayList<MvcView> refs = (ArrayList<MvcView>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
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
    public void delControlsView(Object value){
        mycore.delControlsView(value);
    }

    /**
     * @returns An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getHandlesEvent(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._handlesEvent);
        if (attr == null)
            return(null);
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
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
    public void delHandlesEvent(Object value){
        mycore.delHandlesEvent(value);
    }

    /**
     * @returns An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getDispatchesEvent(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._dispatchesEvent);
        if (attr == null)
            return(null);
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
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
    public void delDispatchesEvent(Object value){
        mycore.delDispatchesEvent(value);
    }

    /**
     * @returns An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcRegistryItem> getUsesRegistryItem(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._usesRegistryItem);
        if (attr == null)
            return(null);
        
        ArrayList<MvcRegistryItem> refs = (ArrayList<MvcRegistryItem>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
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
    public void delUsesRegistryItem(Object value){
        mycore.delUsesRegistryItem(value);
    }

    /**
     * @returns An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcRegistryItem> getCreatesRegistryItem(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._createsRegistryItem);
        if (attr == null)
            return(null);
        
        ArrayList<MvcRegistryItem> refs = (ArrayList<MvcRegistryItem>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
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
    public void delCreatesRegistryItem(Object value){
        mycore.delCreatesRegistryItem(value);
    }

    /**
     * @returns A MvcController object.
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
     * @returns An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getDefinesEvent(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._definesEvent);
        if (attr == null)
            return(null);
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another definesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.addDefinesEvent(value.getDmcObject());
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcEvent>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a definesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    public void delDefinesEvent(Object value){
        mycore.delDefinesEvent(value);
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

    public String getPrefix(){
        return(mycore.getPrefix());
    }

    /**
     * Sets prefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setPrefix(Object value) throws DmcValueException {
        mycore.setPrefix(value);
    }


}
