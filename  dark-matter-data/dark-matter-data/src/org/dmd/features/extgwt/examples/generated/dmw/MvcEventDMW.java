package org.dmd.features.extgwt.examples.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;

/**
 * The MvcEvent class allows for the definition of events that are  handled
 * or emitted by Views and Controllers. By providing a description, you help
 * to document your application.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.dumpWrapper(ExtGWTWrapperGenerator.java:169)
 */
public class MvcEventDMW extends DmoExtGWTWrapperBase<MvcEventDMO> implements DmcNamedObjectIF{

    public MvcEventDMW(){
        core = new MvcEventDMO();
    }

    public MvcEventDMW(MvcEventDMO obj){
        super(obj);
    }

    public MvcEventDMO getDMO(){
        return((MvcEventDMO)core);
    }

    public StringName getObjectName(){
        return(core.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(core.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcEventDMW){
            return( getObjectName().equals( ((MvcEventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @returns An Iterator of String objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:488)
    public Iterator<String> getDefinedBy(){
        return(core.getDefinedBy());
    }

    /**
     * Adds another definedBy value.
     * @param value A value compatible with String
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:501)
    public void addDefinedBy(Object value) throws DmcValueException {
        core.addDefinedBy(value);
    }

    /**
     * Deletes a definedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:513)
    public void delDefinedBy(Object value) throws DmcValueException {
        core.delDefinedBy(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public MvcConfigREF getDefinedInMVCConfig(){
        return(core.getDefinedInMVCConfig());
    }

    /**
     * Sets definedInMVCConfig to the specified value.
     * @param value A value compatible with DmcTypeMvcConfigREF
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setDefinedInMVCConfig(Object value) throws DmcValueException {
        core.setDefinedInMVCConfig(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public String getDescription(){
        return(core.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setDescription(Object value) throws DmcValueException {
        core.setDescription(value);
    }

    /**
     * @returns An Iterator of String objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:488)
    public Iterator<String> getEmittedBy(){
        return(core.getEmittedBy());
    }

    /**
     * Adds another emittedBy value.
     * @param value A value compatible with String
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:501)
    public void addEmittedBy(Object value) throws DmcValueException {
        core.addEmittedBy(value);
    }

    /**
     * Deletes a emittedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:513)
    public void delEmittedBy(Object value) throws DmcValueException {
        core.delEmittedBy(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public String getFile(){
        return(core.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setFile(Object value) throws DmcValueException {
        core.setFile(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:429)
    public Boolean isIsHistoryEvent(){
        return(core.isIsHistoryEvent());
    }

    /**
     * Sets isHistoryEvent to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setIsHistoryEvent(Object value) throws DmcValueException {
        core.setIsHistoryEvent(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public Integer getLineNumber(){
        return(core.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setLineNumber(Object value) throws DmcValueException {
        core.setLineNumber(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public StringName getName(){
        return(core.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setName(Object value) throws DmcValueException {
        core.setName(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public String getUpperConstantName(){
        return(core.getUpperConstantName());
    }

    /**
     * Sets upperConstantName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setUpperConstantName(Object value) throws DmcValueException {
        core.setUpperConstantName(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public String getUserDataCollection(){
        return(core.getUserDataCollection());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setUserDataCollection(Object value) throws DmcValueException {
        core.setUserDataCollection(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public String getUserDataGenericSpec(){
        return(core.getUserDataGenericSpec());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        core.setUserDataGenericSpec(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public String getUserDataType(){
        return(core.getUserDataType());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setUserDataType(Object value) throws DmcValueException {
        core.setUserDataType(value);
    }





}
