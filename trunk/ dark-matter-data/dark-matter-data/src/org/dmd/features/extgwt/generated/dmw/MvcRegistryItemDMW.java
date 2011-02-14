package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;

abstract public class MvcRegistryItemDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcRegistryItemDMO mycore;

    public MvcRegistryItemDMW() {
        super(new MvcRegistryItemDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcRegistryItem);
        mycore = (MvcRegistryItemDMO) core;
        mycore.setContainer(this);
    }

    public MvcRegistryItemDMW(MvcRegistryItemDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcRegistryItem);
        mycore = (MvcRegistryItemDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcRegistryItemDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcRegistryItemDMW(MvcRegistryItemDMO obj, ClassDefinition cd) {
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

    /**
     * Removes the userDataCollection attribute value.
     */
    public void remUserDataCollection(){
        mycore.remUserDataCollection();
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

    /**
     * Removes the userDataGenericSpec attribute value.
     */
    public void remUserDataGenericSpec(){
        mycore.remUserDataGenericSpec();
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
     * Removes the description attribute value.
     */
    public void remDescription(){
        mycore.remDescription();
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
     * Removes the name attribute value.
     */
    public void remName(){
        mycore.remName();
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

    /**
     * Removes the userDataType attribute value.
     */
    public void remUserDataType(){
        mycore.remUserDataType();
    }


}
