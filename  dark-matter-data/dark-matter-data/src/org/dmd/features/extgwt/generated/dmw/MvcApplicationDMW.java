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
import org.dmd.features.extgwt.generated.dmo.MvcApplicationDMO;

public class MvcApplicationDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcApplicationDMO mycore;

    public MvcApplicationDMW() {
        super(new MvcApplicationDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcApplication);
        mycore = (MvcApplicationDMO) core;
        mycore.setContainer(this);
    }

    public MvcApplicationDMW(MvcApplicationDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcApplication);
        mycore = (MvcApplicationDMO) core;
        mycore.setContainer(this);
    }

    protected MvcApplicationDMW(MvcApplicationDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcApplicationDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcApplication>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcApplicationDMW){
            return( getObjectName().equals( ((MvcApplicationDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcEvent> getDefinesEvent(){
        DmcAttribute attr = mycore.get(MvcApplicationDMO._definesEvent);
        if (attr == null)
            return(null);
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another definesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute attr = mycore.addDefinesEvent(value.getDmcObject());
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcEvent>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a definesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delDefinesEvent(MvcEvent value){
        DmcAttribute attr = mycore.delDefinesEvent(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcEvent> refs = (ArrayList<MvcEvent>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the definesEvent attribute value.
     */
    public void remDefinesEvent(){
        mycore.remDefinesEvent();
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
     * @return An Iterator of MvcControllerDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcController> getControllers(){
        DmcAttribute attr = mycore.get(MvcApplicationDMO._controllers);
        if (attr == null)
            return(null);
        
        ArrayList<MvcController> refs = (ArrayList<MvcController>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another controllers value.
     * @param value A value compatible with MvcController
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addControllers(MvcController value) throws DmcValueException {
        DmcAttribute attr = mycore.addControllers(value.getDmcObject());
        ArrayList<MvcController> refs = (ArrayList<MvcController>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcController>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a controllers value.
     * @param value The MvcController to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delControllers(MvcController value){
        DmcAttribute attr = mycore.delControllers(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcController> refs = (ArrayList<MvcController>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the controllers attribute value.
     */
    public void remControllers(){
        mycore.remControllers();
    }

    public String getPrefix(){
        return(mycore.getPrefix());
    }

    /**
     * Sets prefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setPrefix(Object value) throws DmcValueException {
        mycore.setPrefix(value);
    }

    /**
     * Removes the prefix attribute value.
     */
    public void remPrefix(){
        mycore.remPrefix();
    }


}
