package org.dmd.features.extgwt.examples.generated.dmw;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.generated.dmo.MvcPopupMenuDMO;

/**
 * The MvcPopupMenu class is meant to allow for the definition of menus that
 * can be popped up on a variety components, for instance tree nodes and
 * table rows. Although implemented as standard
 * com.extjs.gxt.ui.client.widget.menu.Menu instances, the display of popup
 * menus is controlled by the MenuController infrastructure.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.dumpWrapper(ExtGWTWrapperGenerator.java:169)
 */
public class MvcPopupMenuDMW extends DmoExtGWTWrapperBase<MvcPopupMenuDMO> implements DmcNamedObjectIF{

    public MvcPopupMenuDMW(){
        core = new MvcPopupMenuDMO();
    }

    public MvcPopupMenuDMW(MvcPopupMenuDMO obj){
        super(obj);
    }

    public MvcPopupMenuDMO getDMO(){
        return((MvcPopupMenuDMO)core);
    }

    public StringName getObjectName(){
        return(core.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(core.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcPopupMenuDMW){
            return( getObjectName().equals( ((MvcPopupMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:435)
    public MvcControllerREF getAssociatedController(){
        return(core.getAssociatedController());
    }

    /**
     * Sets associatedController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREF
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setAssociatedController(Object value) throws DmcValueException {
        core.setAssociatedController(value);
    }

    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:429)
    public Boolean isCustomRender(){
        return(core.isCustomRender());
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setCustomRender(Object value) throws DmcValueException {
        core.setCustomRender(value);
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
    public String getUseForModelClass(){
        return(core.getUseForModelClass());
    }

    /**
     * Sets useForModelClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //org.dmd.features.extgwt.generators.ExtGWTWrapperGenerator.formatSV(ExtGWTWrapperGenerator.java:448)
    public void setUseForModelClass(Object value) throws DmcValueException {
        core.setUseForModelClass(value);
    }





}
