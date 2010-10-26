package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcEvent;
// import 1
import org.dmd.features.extgwt.extended.MvcRegistryItem;
// import 1
import org.dmd.features.extgwt.extended.MvcServerEvent;

// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;

public class MvcViewDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcViewDMO mycore;

    public MvcViewDMW() {
        super(new MvcViewDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcView);
        mycore = (MvcViewDMO) core;
        mycore.setContainer(this);
    }

    public MvcViewDMW(MvcViewDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcView);
        mycore = (MvcViewDMO) core;
        mycore.setContainer(this);
    }

    protected MvcViewDMW(MvcViewDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcViewDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcView>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcViewDMW){
            return( getObjectName().equals( ((MvcViewDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getHandlesEvent(){
        DmcAttribute attr = mycore.get(MvcViewDMO._handlesEvent);
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
     * @return An Iterator of MvcServerEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcServerEvent> getHandlesServerEvent(){
        DmcAttribute attr = mycore.get(MvcViewDMO._handlesServerEvent);
        if (attr == null)
            return(null);
        
        ArrayList<MvcServerEvent> refs = (ArrayList<MvcServerEvent>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
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
    public void delHandlesServerEvent(MvcServerEvent value){
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
     * @return A MvcEvent object.
     */
    @SuppressWarnings("unchecked")
    public MvcEvent getFiresEvent(){
        DmcAttribute attr = mycore.get(MvcViewDMO._firesEvent);
        if (attr == null)
            return(null);
        
        MvcEvent ref = (MvcEvent) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the firesEvent to the specified value.
     * @param value A value compatible with MvcEventREF
     */
    @SuppressWarnings("unchecked")
    public void setFiresEvent(MvcEvent value) throws DmcValueException {
        mycore.setFiresEvent(value.getDmcObject());
        DmcAttribute attr = mycore.get(MvcViewDMO._firesEvent);
        attr.setAuxData(value);
    }

    /**
     * Removes the firesEvent attribute value.
     */
    public void remFiresEvent(){
        mycore.remFiresEvent();
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getDispatchesEvent(){
        DmcAttribute attr = mycore.get(MvcViewDMO._dispatchesEvent);
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
        DmcAttribute attr = mycore.get(MvcViewDMO._usesRegistryItem);
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
        DmcAttribute attr = mycore.get(MvcViewDMO._createsRegistryItem);
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

    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    public void remDescription(){
        mycore.remDescription();
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
