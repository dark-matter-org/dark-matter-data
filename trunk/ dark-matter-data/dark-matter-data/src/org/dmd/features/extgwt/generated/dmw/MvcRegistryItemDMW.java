package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dms.ClassDefinition;

import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmc.DmcObject;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 4
import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;

public class MvcRegistryItemDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcRegistryItemDMO mycore;

    public MvcRegistryItemDMW() {
        super(new MvcRegistryItemDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcRegistryItem);
        mycore = (MvcRegistryItemDMO) core;
        mycore.setContainer(this);
    }

    protected MvcRegistryItemDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcRegistryItemDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcRegistryItem>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcRegistryItemDMW){
            return( getObjectName().equals( ((MvcRegistryItemDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public String getUserDataCollection(){
        return(mycore.getUserDataCollection());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setUserDataCollection(Object value) throws DmcValueException {
        mycore.setUserDataCollection(value);
    }

    public String getUserDataGenericSpec(){
        return(mycore.getUserDataGenericSpec());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        mycore.setUserDataGenericSpec(value);
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

    public String getCamelCaseName(){
        return(mycore.getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setCamelCaseName(Object value) throws DmcValueException {
        mycore.setCamelCaseName(value);
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

    public String getUserDataType(){
        return(mycore.getUserDataType());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setUserDataType(Object value) throws DmcValueException {
        mycore.setUserDataType(value);
    }


}
