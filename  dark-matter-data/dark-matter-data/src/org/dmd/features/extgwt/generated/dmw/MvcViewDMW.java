package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;

import org.dmd.dmc.DmcValueException;
// import 1
import org.dmd.features.extgwt.extended.MvcEvent;
// import 1
import org.dmd.features.extgwt.extended.MvcRegistryItem;

import org.dmd.dmc.DmcNamedObjectIF;
// import 4
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;

import org.dmd.dmc.DmcObject;

public class MvcViewDMW extends org.dmd.features.extgwt.extended.MvcDefinition implements DmcNamedObjectIF {

    private MvcViewDMO mycore;

    public MvcViewDMW() {
        super(new MvcViewDMO());
        mycore = (MvcViewDMO) core;
        mycore.setContainer(this);
    }

    protected MvcViewDMW(DmcObject obj) {
        super(obj);
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
    public void delHandlesEvent(Object value){
        mycore.delHandlesEvent(value);
    }

    /**
     * @returns An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getEmitsEvent(){
        DmcAttribute attr = mycore.get(MvcViewDMO._emitsEvent);
        if (attr == null)
            return(null);
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another emitsEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addEmitsEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.addEmitsEvent(value.getDmcObject());
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcEvent>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a emitsEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    public void delEmitsEvent(Object value){
        mycore.delEmitsEvent(value);
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
    public void delUsesRegistryItem(Object value){
        mycore.delUsesRegistryItem(value);
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
    public void delCreatesRegistryItem(Object value){
        mycore.delCreatesRegistryItem(value);
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
