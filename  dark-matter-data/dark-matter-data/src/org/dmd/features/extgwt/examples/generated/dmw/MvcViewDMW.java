package org.dmd.features.extgwt.examples.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
import org.dmd.features.extgwt.generated.types.MvcEventREF;
import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;
import org.dmd.features.extgwt.generated.types.MvcServerEventREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;

/**
 * The MvcView class allows for the definition of views. MvcView instance are
 * derived from the ExtGWT View class.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.dumpWrapper(ExtGWTWrapperGenerator.java:168)
 */
public class MvcViewDMW extends DmoExtGWTWrapperBase<MvcViewDMO> implements DmcNamedObjectIF{

    public MvcViewDMW(){
        core = new MvcViewDMO();
    }

    public MvcViewDMW(MvcViewDMO obj){
        super(obj);
    }

    public MvcViewDMO getDMO(){
        return((MvcViewDMO)core);
    }

    public StringName getObjectName(){
        return(core.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(core.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcViewDMW){
            return( getObjectName().equals( ((MvcViewDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @returns An Iterator of MvcRegistryItemREF objects.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcRegistryItemREF> getCreatesRegistryItem(){
        return(core.getCreatesRegistryItem());
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addCreatesRegistryItem(Object value) throws DmcValueException {
        core.addCreatesRegistryItem(value);
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delCreatesRegistryItem(Object value) throws DmcValueException {
        core.delCreatesRegistryItem(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public MvcConfigREF getDefinedInMVCConfig(){
        return(core.getDefinedInMVCConfig());
    }

    /**
     * Sets definedInMVCConfig to the specified value.
     * @param value A value compatible with DmcTypeMvcConfigREF
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setDefinedInMVCConfig(Object value) throws DmcValueException {
        core.setDefinedInMVCConfig(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public String getDescription(){
        return(core.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setDescription(Object value) throws DmcValueException {
        core.setDescription(value);
    }

    /**
     * @returns An Iterator of MvcEventREF objects.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcEventREF> getDispatchesEvent(){
        return(core.getDispatchesEvent());
    }

    /**
     * Adds another dispatchesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addDispatchesEvent(Object value) throws DmcValueException {
        core.addDispatchesEvent(value);
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delDispatchesEvent(Object value) throws DmcValueException {
        core.delDispatchesEvent(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public String getFile(){
        return(core.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setFile(Object value) throws DmcValueException {
        core.setFile(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public MvcEventREF getFiresEvent(){
        return(core.getFiresEvent());
    }

    /**
     * Sets firesEvent to the specified value.
     * @param value A value compatible with DmcTypeMvcEventREF
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setFiresEvent(Object value) throws DmcValueException {
        core.setFiresEvent(value);
    }

    /**
     * @returns An Iterator of MvcEventREF objects.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcEventREF> getHandlesEvent(){
        return(core.getHandlesEvent());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addHandlesEvent(Object value) throws DmcValueException {
        core.addHandlesEvent(value);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delHandlesEvent(Object value) throws DmcValueException {
        core.delHandlesEvent(value);
    }

    /**
     * @returns An Iterator of MvcServerEventREF objects.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcServerEventREF> getHandlesServerEvent(){
        return(core.getHandlesServerEvent());
    }

    /**
     * Adds another handlesServerEvent value.
     * @param value A value compatible with MvcServerEvent
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addHandlesServerEvent(Object value) throws DmcValueException {
        core.addHandlesServerEvent(value);
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delHandlesServerEvent(Object value) throws DmcValueException {
        core.delHandlesServerEvent(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public Integer getLineNumber(){
        return(core.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setLineNumber(Object value) throws DmcValueException {
        core.setLineNumber(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public StringName getName(){
        return(core.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setName(Object value) throws DmcValueException {
        core.setName(value);
    }

    /**
     * @returns An Iterator of MvcRegistryItemREF objects.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcRegistryItemREF> getUsesRegistryItem(){
        return(core.getUsesRegistryItem());
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addUsesRegistryItem(Object value) throws DmcValueException {
        core.addUsesRegistryItem(value);
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delUsesRegistryItem(Object value) throws DmcValueException {
        core.delUsesRegistryItem(value);
    }





}
