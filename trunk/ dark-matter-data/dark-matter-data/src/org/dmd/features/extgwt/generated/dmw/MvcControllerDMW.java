package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;

import org.dmd.dmc.DmcValueException;
// import 1
import org.dmd.features.extgwt.generated.dmw.MvcRegistryItemDMW;
// import 1
import org.dmd.features.extgwt.generated.dmw.MvcViewDMW;

import org.dmd.dmc.DmcNamedObjectIF;
// import 4
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;

import org.dmd.dmc.DmcObject;

public class MvcControllerDMW extends org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW implements DmcNamedObjectIF {

    private MvcControllerDMO mycore;

    protected MvcControllerDMW() {
        super(new MvcControllerDMO());
        mycore = (MvcControllerDMO) core;
        mycore.setContainer(this);
    }

    protected MvcControllerDMW(DmcObject obj) {
        super(obj);
        mycore = (MvcControllerDMO) core;
        mycore.setContainer(this);
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
    public Iterator<MvcViewDMW> getControlsView(){
        DmcAttribute attr = mycore.get(MvcControllerDMO._controlsView);
        if (attr == null)
            return(null);
        
        ArrayList<MvcViewDMW> refs = (ArrayList<MvcViewDMW>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another controlsView value.
     * @param value A value compatible with MvcView
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addControlsView(MvcViewDMW value) throws DmcValueException {
        DmcAttribute attr = mycore.addControlsView(value.getDmcObject());
        ArrayList<MvcViewDMW> refs = (ArrayList<MvcViewDMW>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcViewDMW>();
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
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getHandlesEvent(){
        return(mycore.getHandlesEvent());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with String
     */
    public void addHandlesEvent(Object value) throws DmcValueException {
        mycore.addHandlesEvent(value);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delHandlesEvent(Object value){
        mycore.delHandlesEvent(value);
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
        DmcAttribute attr = mycore.get(MvcControllerDMO._usesRegistryItem);
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
        DmcAttribute attr = mycore.get(MvcControllerDMO._createsRegistryItem);
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

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDefinesEvent(){
        return(mycore.getDefinesEvent());
    }

    /**
     * Adds another definesEvent value.
     * @param value A value compatible with String
     */
    public void addDefinesEvent(Object value) throws DmcValueException {
        mycore.addDefinesEvent(value);
    }

    /**
     * Deletes a definesEvent value.
     * @param value The String to be deleted from set of attribute values.
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
