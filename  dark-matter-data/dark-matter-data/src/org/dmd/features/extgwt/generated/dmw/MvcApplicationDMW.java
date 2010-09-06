package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;

import org.dmd.dmc.DmcValueException;
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW;
import org.dmd.features.extgwt.generated.dmo.MvcApplicationDMO;

import org.dmd.dmc.DmcObject;

public class MvcApplicationDMW extends org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW implements DmcNamedObjectIF {

    private MvcApplicationDMO mycore;

    protected MvcApplicationDMW() {
        super(new MvcApplicationDMO());
        mycore = (MvcApplicationDMO) core;
        mycore.setContainer(this);
    }

    protected MvcApplicationDMW(DmcObject obj) {
        super(obj);
        mycore = (MvcApplicationDMO) core;
        mycore.setContainer(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.generated.dmw.MvcApplicationDMW>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcApplicationDMW){
            return( getObjectName().equals( ((MvcApplicationDMW) obj).getObjectName()) );
        }
        return(false);
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

    /**
     * @returns An Iterator of MvcControllerDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcControllerDMW> getControllers(){
        DmcAttribute attr = mycore.get(MvcApplicationDMO._controllers);
        if (attr == null)
            return(null);
        
        ArrayList<MvcControllerDMW> refs = (ArrayList<MvcControllerDMW>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another controllers value.
     * @param value A value compatible with MvcController
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addControllers(MvcControllerDMW value) throws DmcValueException {
        DmcAttribute attr = mycore.addControllers(value.getDmcObject());
        ArrayList<MvcControllerDMW> refs = (ArrayList<MvcControllerDMW>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcControllerDMW>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a controllers value.
     * @param value The MvcController to be deleted from set of attribute values.
     */
    public void delControllers(Object value){
        mycore.delControllers(value);
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
