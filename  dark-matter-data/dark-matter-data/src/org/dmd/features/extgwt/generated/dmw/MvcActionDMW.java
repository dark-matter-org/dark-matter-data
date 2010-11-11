package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcController;
// import 1
import org.dmd.features.extgwt.extended.MvcEvent;

// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;

public class MvcActionDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcActionDMO mycore;

    public MvcActionDMW() {
        super(new MvcActionDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcAction);
        mycore = (MvcActionDMO) core;
        mycore.setContainer(this);
    }

    public MvcActionDMW(MvcActionDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcAction);
        mycore = (MvcActionDMO) core;
        mycore.setContainer(this);
    }

    protected MvcActionDMW(MvcActionDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcActionDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcAction>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcActionDMW){
            return( getObjectName().equals( ((MvcActionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getHandlesEvent(){
        DmcAttribute attr = mycore.get(MvcActionDMO._handlesEvent);
        if (attr == null)
            return(null);
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.addHandlesEvent(value.getDmcObject());
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcEvent>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delHandlesEvent(MvcEvent value){
        DmcAttribute attr = mycore.delHandlesEvent(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    public void remHandlesEvent(){
        mycore.remHandlesEvent();
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

    /**
     * Removes the camelCaseName attribute value.
     */
    public void remCamelCaseName(){
        mycore.remCamelCaseName();
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
     * @return A MvcController object.
     */
    @SuppressWarnings("unchecked")
    public MvcController getAssociatedController(){
        DmcAttribute attr = mycore.get(MvcActionDMO._associatedController);
        if (attr == null)
            return(null);
        
        MvcController ref = (MvcController) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    @SuppressWarnings("unchecked")
    public void setAssociatedController(MvcController value) throws DmcValueException {
        mycore.setAssociatedController(value.getDmcObject());
        DmcAttribute attr = mycore.get(MvcActionDMO._associatedController);
        attr.setAuxData(value);
    }

    /**
     * Removes the associatedController attribute value.
     */
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }


}
