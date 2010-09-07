package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;

import org.dmd.dmc.DmcValueException;
// import 1
import org.dmd.features.extgwt.generated.dmw.MvcRegistryItemDMW;

import org.dmd.dmc.DmcNamedObjectIF;
// import 4
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;

import org.dmd.dmc.DmcObject;

public class MvcViewDMW extends org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW implements DmcNamedObjectIF {

    private MvcViewDMO mycore;

    protected MvcViewDMW() {
        super(new MvcViewDMO());
        mycore = (MvcViewDMO) core;
        mycore.setContainer(this);
    }

    protected MvcViewDMW(DmcObject obj) {
        super(obj);
        mycore = (MvcViewDMO) core;
        mycore.setContainer(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.generated.dmw.MvcViewDMW>());
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
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getEmitsEvent(){
        return(mycore.getEmitsEvent());
    }

    /**
     * Adds another emitsEvent value.
     * @param value A value compatible with String
     */
    public void addEmitsEvent(Object value) throws DmcValueException {
        mycore.addEmitsEvent(value);
    }

    /**
     * Deletes a emitsEvent value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delEmitsEvent(Object value){
        mycore.delEmitsEvent(value);
    }

    /**
     * @returns An Iterator of MvcRegistryItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcRegistryItemDMW> getUsesRegistryItem(){
        DmcAttribute attr = mycore.get(MvcViewDMO._usesRegistryItem);
        if (attr == null)
            return(null);
        
        ArrayList<MvcRegistryItemDMW> refs = (ArrayList<MvcRegistryItemDMW>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addUsesRegistryItem(MvcRegistryItemDMW value) throws DmcValueException {
        DmcAttribute attr = mycore.addUsesRegistryItem(value.getDmcObject());
        ArrayList<MvcRegistryItemDMW> refs = (ArrayList<MvcRegistryItemDMW>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcRegistryItemDMW>();
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
    public Iterator<MvcRegistryItemDMW> getCreatesRegistryItem(){
        DmcAttribute attr = mycore.get(MvcViewDMO._createsRegistryItem);
        if (attr == null)
            return(null);
        
        ArrayList<MvcRegistryItemDMW> refs = (ArrayList<MvcRegistryItemDMW>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addCreatesRegistryItem(MvcRegistryItemDMW value) throws DmcValueException {
        DmcAttribute attr = mycore.addCreatesRegistryItem(value.getDmcObject());
        ArrayList<MvcRegistryItemDMW> refs = (ArrayList<MvcRegistryItemDMW>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcRegistryItemDMW>();
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
