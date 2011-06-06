package org.dmd.features.extgwt.examples.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.features.extgwt.generated.types.MvcActionREF;
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
import org.dmd.features.extgwt.generated.types.MvcEventREF;
import org.dmd.features.extgwt.generated.types.MvcMenuREF;
import org.dmd.features.extgwt.generated.types.MvcMenuItemREF;
import org.dmd.features.extgwt.generated.types.MvcMenuSeparatorREF;
import org.dmd.features.extgwt.generated.types.MvcMultiViewREF;
import org.dmd.features.extgwt.generated.types.MvcRegistryItemREF;
import org.dmd.features.extgwt.generated.types.MvcServerEventREF;
import org.dmd.features.extgwt.generated.types.MvcViewREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;

/**
 * The MvcController class allows for the definition of controllers. The
 * abstract controller generated by this definition will automatically
 * register for the events you specify via the handlesEvent attribute.
 * Likewise, it will have a standard handleEvent() method that forwards typed
 * events to abstract handler functions that you'll have to write.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.dumpWrapper(ExtGWTWrapperGenerator.java:168)
 */
public class MvcControllerDMW extends DmoExtGWTWrapperBase<MvcControllerDMO> implements DmcNamedObjectIF{

    public MvcControllerDMW(){
        core = new MvcControllerDMO();
    }

    public MvcControllerDMW(MvcControllerDMO obj){
        super(obj);
    }

    public MvcControllerDMO getDMO(){
        return((MvcControllerDMO)core);
    }

    public StringName getObjectName(){
        return(core.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(core.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcControllerDMW){
            return( getObjectName().equals( ((MvcControllerDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public String getAlias(){
        return(core.getAlias());
    }

    /**
     * Sets alias to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setAlias(Object value) throws DmcValueException {
        core.setAlias(value);
    }

    /**
     * @returns An Iterator of MvcMultiViewREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcMultiViewREF> getControlsMultiView(){
        return(core.getControlsMultiView());
    }

    /**
     * Adds another controlsMultiView value.
     * @param value A value compatible with MvcMultiView
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addControlsMultiView(Object value) throws DmcValueException {
        core.addControlsMultiView(value);
    }

    /**
     * Deletes a controlsMultiView value.
     * @param value The MvcMultiView to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delControlsMultiView(Object value) throws DmcValueException {
        core.delControlsMultiView(value);
    }

    /**
     * @returns An Iterator of MvcViewREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcViewREF> getControlsView(){
        return(core.getControlsView());
    }

    /**
     * Adds another controlsView value.
     * @param value A value compatible with MvcView
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addControlsView(Object value) throws DmcValueException {
        core.addControlsView(value);
    }

    /**
     * Deletes a controlsView value.
     * @param value The MvcView to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delControlsView(Object value) throws DmcValueException {
        core.delControlsView(value);
    }

    /**
     * @returns An Iterator of MvcRegistryItemREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcRegistryItemREF> getCreatesRegistryItem(){
        return(core.getCreatesRegistryItem());
    }

    /**
     * Adds another createsRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addCreatesRegistryItem(Object value) throws DmcValueException {
        core.addCreatesRegistryItem(value);
    }

    /**
     * Deletes a createsRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delCreatesRegistryItem(Object value) throws DmcValueException {
        core.delCreatesRegistryItem(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public MvcConfigREF getDefinedInMVCConfig(){
        return(core.getDefinedInMVCConfig());
    }

    /**
     * Sets definedInMVCConfig to the specified value.
     * @param value A value compatible with DmcTypeMvcConfigREF
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setDefinedInMVCConfig(Object value) throws DmcValueException {
        core.setDefinedInMVCConfig(value);
    }

    /**
     * @returns An Iterator of MvcActionREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcActionREF> getDefinesAction(){
        return(core.getDefinesAction());
    }

    /**
     * Adds another definesAction value.
     * @param value A value compatible with MvcAction
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addDefinesAction(Object value) throws DmcValueException {
        core.addDefinesAction(value);
    }

    /**
     * Deletes a definesAction value.
     * @param value The MvcAction to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delDefinesAction(Object value) throws DmcValueException {
        core.delDefinesAction(value);
    }

    /**
     * @returns An Iterator of MvcMenuREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcMenuREF> getDefinesMenu(){
        return(core.getDefinesMenu());
    }

    /**
     * Adds another definesMenu value.
     * @param value A value compatible with MvcMenu
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addDefinesMenu(Object value) throws DmcValueException {
        core.addDefinesMenu(value);
    }

    /**
     * Deletes a definesMenu value.
     * @param value The MvcMenu to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delDefinesMenu(Object value) throws DmcValueException {
        core.delDefinesMenu(value);
    }

    /**
     * @returns An Iterator of MvcMenuItemREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcMenuItemREF> getDefinesMenuItem(){
        return(core.getDefinesMenuItem());
    }

    /**
     * Adds another definesMenuItem value.
     * @param value A value compatible with MvcMenuItem
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addDefinesMenuItem(Object value) throws DmcValueException {
        core.addDefinesMenuItem(value);
    }

    /**
     * Deletes a definesMenuItem value.
     * @param value The MvcMenuItem to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delDefinesMenuItem(Object value) throws DmcValueException {
        core.delDefinesMenuItem(value);
    }

    /**
     * @returns An Iterator of MvcMenuSeparatorREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcMenuSeparatorREF> getDefinesMenuSeparator(){
        return(core.getDefinesMenuSeparator());
    }

    /**
     * Adds another definesMenuSeparator value.
     * @param value A value compatible with MvcMenuSeparator
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addDefinesMenuSeparator(Object value) throws DmcValueException {
        core.addDefinesMenuSeparator(value);
    }

    /**
     * Deletes a definesMenuSeparator value.
     * @param value The MvcMenuSeparator to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delDefinesMenuSeparator(Object value) throws DmcValueException {
        core.delDefinesMenuSeparator(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public String getDescription(){
        return(core.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setDescription(Object value) throws DmcValueException {
        core.setDescription(value);
    }

    /**
     * @returns An Iterator of MvcEventREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcEventREF> getDispatchesEvent(){
        return(core.getDispatchesEvent());
    }

    /**
     * Adds another dispatchesEvent value.
     * @param value A value compatible with MvcEvent
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addDispatchesEvent(Object value) throws DmcValueException {
        core.addDispatchesEvent(value);
    }

    /**
     * Deletes a dispatchesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delDispatchesEvent(Object value) throws DmcValueException {
        core.delDispatchesEvent(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public String getFile(){
        return(core.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setFile(Object value) throws DmcValueException {
        core.setFile(value);
    }

    /**
     * @returns An Iterator of MvcEventREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcEventREF> getHandlesEvent(){
        return(core.getHandlesEvent());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addHandlesEvent(Object value) throws DmcValueException {
        core.addHandlesEvent(value);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delHandlesEvent(Object value) throws DmcValueException {
        core.delHandlesEvent(value);
    }

    /**
     * @returns An Iterator of MvcServerEventREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcServerEventREF> getHandlesServerEvent(){
        return(core.getHandlesServerEvent());
    }

    /**
     * Adds another handlesServerEvent value.
     * @param value A value compatible with MvcServerEvent
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addHandlesServerEvent(Object value) throws DmcValueException {
        core.addHandlesServerEvent(value);
    }

    /**
     * Deletes a handlesServerEvent value.
     * @param value The MvcServerEvent to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delHandlesServerEvent(Object value) throws DmcValueException {
        core.delHandlesServerEvent(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public Integer getLineNumber(){
        return(core.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setLineNumber(Object value) throws DmcValueException {
        core.setLineNumber(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public StringName getName(){
        return(core.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setName(Object value) throws DmcValueException {
        core.setName(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public MvcControllerREF getParentController(){
        return(core.getParentController());
    }

    /**
     * Sets parentController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREF
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setParentController(Object value) throws DmcValueException {
        core.setParentController(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public String getSubpackage(){
        return(core.getSubpackage());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setSubpackage(Object value) throws DmcValueException {
        core.setSubpackage(value);
    }

    /**
     * @returns An Iterator of MvcRegistryItemREF objects.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:481)
    public Iterator<MvcRegistryItemREF> getUsesRegistryItem(){
        return(core.getUsesRegistryItem());
    }

    /**
     * Adds another usesRegistryItem value.
     * @param value A value compatible with MvcRegistryItem
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:500)
    public void addUsesRegistryItem(Object value) throws DmcValueException {
        core.addUsesRegistryItem(value);
    }

    /**
     * Deletes a usesRegistryItem value.
     * @param value The MvcRegistryItem to be deleted from set of attribute values.
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:512)
    public void delUsesRegistryItem(Object value) throws DmcValueException {
        core.delUsesRegistryItem(value);
    }





}