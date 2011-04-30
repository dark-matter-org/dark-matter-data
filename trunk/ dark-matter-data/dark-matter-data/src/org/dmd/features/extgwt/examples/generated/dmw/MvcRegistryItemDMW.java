package org.dmd.features.extgwt.examples.generated.dmw;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;

/**
 * The MvcRegistryItem defines something that's stored in the Registry.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.dumpWrapper(ExtGWTWrapperGenerator.java:168)
 */
public class MvcRegistryItemDMW extends DmoExtGWTWrapperBase<MvcRegistryItemDMO> implements DmcNamedObjectIF{

    public MvcRegistryItemDMW(){
        core = new MvcRegistryItemDMO();
    }

    public MvcRegistryItemDMW(MvcRegistryItemDMO obj){
        super(obj);
    }

    public MvcRegistryItemDMO getDMO(){
        return((MvcRegistryItemDMO)core);
    }

    public StringName getObjectName(){
        return(core.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(core.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcRegistryItemDMW){
            return( getObjectName().equals( ((MvcRegistryItemDMW) obj).getObjectName()) );
        }
        return(false);
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
    public String getUserDataCollection(){
        return(core.getUserDataCollection());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setUserDataCollection(Object value) throws DmcValueException {
        core.setUserDataCollection(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public String getUserDataGenericSpec(){
        return(core.getUserDataGenericSpec());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        core.setUserDataGenericSpec(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:434)
    public String getUserDataType(){
        return(core.getUserDataType());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:447)
    public void setUserDataType(Object value) throws DmcValueException {
        core.setUserDataType(value);
    }





}
