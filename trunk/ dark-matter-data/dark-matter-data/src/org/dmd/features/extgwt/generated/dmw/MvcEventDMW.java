package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;

import org.dmd.dmc.DmcValueException;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW;
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;

import org.dmd.dmc.DmcObject;

public class MvcEventDMW extends org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW implements DmcNamedObjectIF {

    private MvcEventDMO mycore;

    protected MvcEventDMW() {
        super(new MvcEventDMO());
        mycore = (MvcEventDMO) core;
        mycore.setContainer(this);
    }

    protected MvcEventDMW(DmcObject obj) {
        super(obj);
        mycore = (MvcEventDMO) core;
        mycore.setContainer(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.generated.dmw.MvcEventDMW>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcEventDMW){
            return( getObjectName().equals( ((MvcEventDMW) obj).getObjectName()) );
        }
        return(false);
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
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getEmittedBy(){
        return(mycore.getEmittedBy());
    }

    /**
     * Adds another emittedBy value.
     * @param value A value compatible with String
     */
    public void addEmittedBy(Object value) throws DmcValueException {
        mycore.addEmittedBy(value);
    }

    /**
     * Deletes a emittedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delEmittedBy(Object value){
        mycore.delEmittedBy(value);
    }

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getUserDataType(){
        return(mycore.getUserDataType());
    }

    /**
     * Adds another userDataType value.
     * @param value A value compatible with String
     */
    public void addUserDataType(Object value) throws DmcValueException {
        mycore.addUserDataType(value);
    }

    /**
     * Deletes a userDataType value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delUserDataType(Object value){
        mycore.delUserDataType(value);
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

    public String getUpperConstantName(){
        return(mycore.getUpperConstantName());
    }

    /**
     * Sets upperConstantName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setUpperConstantName(Object value) throws DmcValueException {
        mycore.setUpperConstantName(value);
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
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDefinedBy(){
        return(mycore.getDefinedBy());
    }

    /**
     * Adds another definedBy value.
     * @param value A value compatible with String
     */
    public void addDefinedBy(Object value) throws DmcValueException {
        mycore.addDefinedBy(value);
    }

    /**
     * Deletes a definedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    public void delDefinedBy(Object value){
        mycore.delDefinedBy(value);
    }


}
