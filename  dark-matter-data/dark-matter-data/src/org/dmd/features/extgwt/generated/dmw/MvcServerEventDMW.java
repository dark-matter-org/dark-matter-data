package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:613)
import java.util.*;                                                     // If not auxiliary
import org.dmd.dmc.*;                                                   // Always 2
import org.dmd.dmc.types.StringName;                                    // Primitive type
import org.dmd.dms.*;                                                   // Always 3
import org.dmd.features.extgwt.extended.MvcDefinition;                  // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcServerEventDMO;         // Class not auxiliary or abstract

/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:291)
 */
abstract public class MvcServerEventDMW extends MvcDefinition implements DmcNamedObjectIF {

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

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcServerEventDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
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

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:639)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcServerEventDMW){
            return( getObjectName().equals( ((MvcServerEventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remDescription(){
        mycore.remDescription();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remName(){
        mycore.remName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public String getEventDataType(){
        return(mycore.getEventDataType());
    }

    /**
     * Sets eventDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setEventDataType(Object value) throws DmcValueException {
        mycore.setEventDataType(value);
    }

    /**
     * Removes the eventDataType attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remEventDataType(){
        mycore.remEventDataType();
    }


}
