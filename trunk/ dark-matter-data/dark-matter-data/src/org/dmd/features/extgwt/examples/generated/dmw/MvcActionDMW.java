package org.dmd.features.extgwt.examples.generated.dmw;

import java.util.*;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
import org.dmd.features.extgwt.generated.types.MvcEventREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;

/**
 * The MvcAction class allows for the definition of behaviour that can be
 * associated with menus, buttons and other UI components. Actions are
 * associated with controllers so that they can be informed of events in
 * which they're interested, since only controllers can register for events.
 * Actions may be defined and used by  menu items defined in other
 * Controllers.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.dumpWrapper(ExtGWTWrapperGenerator.java:169)
 */
public class MvcActionDMW extends DmoExtGWTWrapperBase<MvcActionDMO> implements DmcNamedObjectIF{

    public MvcActionDMW(){
        core = new MvcActionDMO();
    }

    public MvcActionDMW(MvcActionDMO obj){
        super(obj);
    }

    public MvcActionDMO getDMO(){
        return((MvcActionDMO)core);
    }

    public StringName getObjectName(){
        return(core.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(core.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcActionDMW){
            return( getObjectName().equals( ((MvcActionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public MvcControllerREF getAssociatedController(){
        return(core.getAssociatedController());
    }

    /**
     * Sets associatedController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREF
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setAssociatedController(Object value) throws DmcValueException {
        core.setAssociatedController(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public MvcConfigREF getDefinedInMVCConfig(){
        return(core.getDefinedInMVCConfig());
    }

    /**
     * Sets definedInMVCConfig to the specified value.
     * @param value A value compatible with DmcTypeMvcConfigREF
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setDefinedInMVCConfig(Object value) throws DmcValueException {
        core.setDefinedInMVCConfig(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public String getDescription(){
        return(core.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setDescription(Object value) throws DmcValueException {
        core.setDescription(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public String getFile(){
        return(core.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setFile(Object value) throws DmcValueException {
        core.setFile(value);
    }

    /**
     * @returns An Iterator of MvcEventREF objects.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:482)
    public Iterator<MvcEventREF> getHandlesEvent(){
        return(core.getHandlesEvent());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:501)
    public void addHandlesEvent(Object value) throws DmcValueException {
        core.addHandlesEvent(value);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatMV(ExtGWTWrapperGenerator.java:513)
    public void delHandlesEvent(Object value) throws DmcValueException {
        core.delHandlesEvent(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public Integer getLineNumber(){
        return(core.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setLineNumber(Object value) throws DmcValueException {
        core.setLineNumber(value);
    }

    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public StringName getName(){
        return(core.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setName(Object value) throws DmcValueException {
        core.setName(value);
    }





}
