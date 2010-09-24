package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.ClassDefinition;

// import 1
import org.dmd.features.extgwt.extended.MvcEvent;
// import 1
import org.dmd.features.extgwt.extended.MvcRegistryItem;

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
     * @returns An Iterator of MvcEventDMO objects.
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
     * @returns A MvcEvent object.
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
     * @returns An Iterator of MvcEventDMO objects.
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
     * @returns An Iterator of MvcRegistryItemDMO objects.
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
     * @returns An Iterator of MvcRegistryItemDMO objects.
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


}
