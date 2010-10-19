package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcController;
// import 1
import org.dmd.features.extgwt.extended.MvcEvent;
// import 1
import org.dmd.features.extgwt.extended.MvcRegistryItem;
// import 1
import org.dmd.features.extgwt.extended.MvcView;

// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;

public class MvcControllerDMW extends MvcDefinition implements DmcNamedObjectIF {

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

    /**
     * @return An Iterator of MvcViewDMO objects.
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
    @SuppressWarnings("unchecked")
    public void delControlsView(MvcView value){
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
     * @return An Iterator of MvcEventDMO objects.
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
    @SuppressWarnings("unchecked")
    public void delHandlesEvent(MvcEvent value){
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
     * @return An Iterator of MvcEventDMO objects.
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
    @SuppressWarnings("unchecked")
    public void delDispatchesEvent(MvcEvent value){
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
    @SuppressWarnings("unchecked")
    public void delUsesRegistryItem(MvcRegistryItem value){
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
    @SuppressWarnings("unchecked")
    public void delCreatesRegistryItem(MvcRegistryItem value){
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

    /**
     * @return An Iterator of MvcEventDMO objects.
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
    @SuppressWarnings("unchecked")
    public void delDefinesEvent(MvcEvent value){
        DmcAttribute attr = mycore.delDefinesEvent(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the definesEvent attribute value.
     */
    public void remDefinesEvent(){
        mycore.remDefinesEvent();
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

    /**
     * Removes the prefix attribute value.
     */
    public void remPrefix(){
        mycore.remPrefix();
    }


}
