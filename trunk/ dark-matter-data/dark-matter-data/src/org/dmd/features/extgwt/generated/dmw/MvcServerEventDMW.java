package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                                   // If any attributes
import org.dmd.dmc.types.StringName;                                    // Primitive type
import org.dmd.dms.*;                                                   // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcDefinition;                  // Derived class
import org.dmd.features.extgwt.extended.MvcServerEvent;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcServerEventDMO;         // Class not auxiliary or abstract

/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcServerEventDMW extends MvcDefinition implements DmcNamedObjectIF {

    public MvcServerEventDMW() {
        super(new MvcServerEventDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcServerEvent);
    }

    public MvcServerEventDMW(DmcTypeModifierMV mods) {
        super(new MvcServerEventDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcServerEvent);
    }

    public MvcServerEvent getModificationRecorder(){
        MvcServerEvent rc = new MvcServerEvent();
        rc.setDmcObject(new MvcServerEventDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcServerEventDMW(MvcServerEventDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcServerEvent);
    }

    public MvcServerEventDMO getDMO() {
        return((MvcServerEventDMO) core);
    }

    protected MvcServerEventDMW(MvcServerEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:875)
    public StringName getObjectName(){
        return(((MvcServerEventDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcServerEventDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcServerEventDMW){
            return( getObjectName().equals( ((MvcServerEventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public String getDescription(){
        return(((MvcServerEventDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setDescription(Object value) throws DmcValueException {
        ((MvcServerEventDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setDescription(String value){
        ((MvcServerEventDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remDescription(){
        ((MvcServerEventDMO) core).remDescription();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public StringName getName(){
        return(((MvcServerEventDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setName(Object value) throws DmcValueException {
        ((MvcServerEventDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setName(StringName value){
        ((MvcServerEventDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remName(){
        ((MvcServerEventDMO) core).remName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public String getEventDataType(){
        return(((MvcServerEventDMO) core).getEventDataType());
    }

    /**
     * Sets eventDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setEventDataType(Object value) throws DmcValueException {
        ((MvcServerEventDMO) core).setEventDataType(value);
    }

    /**
     * Sets eventDataType to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setEventDataType(String value){
        ((MvcServerEventDMO) core).setEventDataType(value);
    }

    /**
     * Removes the eventDataType attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remEventDataType(){
        ((MvcServerEventDMO) core).remEventDataType();
    }


}
