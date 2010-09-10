package org.dmd.features.extgwt.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcValueException;

import org.dmd.dmc.DmcNamedObjectIF;
// import 4
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;

import org.dmd.dmc.DmcObject;

public class MvcEventDMW extends org.dmd.features.extgwt.extended.MvcDefinition implements DmcNamedObjectIF {

    private MvcEventDMO mycore;

    public MvcEventDMW() {
        super(new MvcEventDMO());
        mycore = (MvcEventDMO) core;
        mycore.setContainer(this);
    }

    protected MvcEventDMW(DmcObject obj) {
        super(obj);
        mycore = (MvcEventDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcEvent>());
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

    public Boolean getIsHistoryEvent(){
        return(mycore.getIsHistoryEvent());
    }

    /**
     * Sets isHistoryEvent to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setIsHistoryEvent(Object value) throws DmcValueException {
        mycore.setIsHistoryEvent(value);
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
