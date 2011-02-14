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
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;

abstract public class MvcEventDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcEventDMO mycore;

    public MvcEventDMW() {
        super(new MvcEventDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcEvent);
        mycore = (MvcEventDMO) core;
        mycore.setContainer(this);
    }

    public MvcEventDMW(MvcEventDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcEvent);
        mycore = (MvcEventDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcEventDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcEventDMW(MvcEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
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

    /**
     * Removes the description attribute value.
     */
    public void remDescription(){
        mycore.remDescription();
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
     * Removes the isHistoryEvent attribute value.
     */
    public void remIsHistoryEvent(){
        mycore.remIsHistoryEvent();
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

    /**
     * @return An Iterator of String objects.
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
    public void delEmittedBy(Object value) throws DmcValueException {
        mycore.delEmittedBy(value);
    }

    /**
     * Removes the emittedBy attribute value.
     */
    public void remEmittedBy(){
        mycore.remEmittedBy();
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

    /**
     * Removes the upperConstantName attribute value.
     */
    public void remUpperConstantName(){
        mycore.remUpperConstantName();
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

    /**
     * @return An Iterator of String objects.
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
    public void delDefinedBy(Object value) throws DmcValueException {
        mycore.delDefinedBy(value);
    }

    /**
     * Removes the definedBy attribute value.
     */
    public void remDefinedBy(){
        mycore.remDefinedBy();
    }


}
