package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.features.extgwt.extended.MvcDefinition;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcServerEventDMO;

public class MvcServerEventDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcServerEventDMO mycore;

    public MvcServerEventDMW() {
        super(new MvcServerEventDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcServerEvent);
        mycore = (MvcServerEventDMO) core;
        mycore.setContainer(this);
    }

    public MvcServerEventDMW(MvcServerEventDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcServerEvent);
        mycore = (MvcServerEventDMO) core;
        mycore.setContainer(this);
    }

    protected MvcServerEventDMW(MvcServerEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcServerEventDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcServerEvent>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcServerEventDMW){
            return( getObjectName().equals( ((MvcServerEventDMW) obj).getObjectName()) );
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

    public String getEventDataType(){
        return(mycore.getEventDataType());
    }

    /**
     * Sets eventDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setEventDataType(Object value) throws DmcValueException {
        mycore.setEventDataType(value);
    }

    /**
     * Removes the eventDataType attribute value.
     */
    public void remEventDataType(){
        mycore.remEventDataType();
    }


}
