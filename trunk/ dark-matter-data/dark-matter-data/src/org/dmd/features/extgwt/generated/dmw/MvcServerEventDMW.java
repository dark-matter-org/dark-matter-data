package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:842)
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

    private MvcServerEventDMO mycore;

    public MvcServerEventDMW() {
        super(new MvcServerEventDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcServerEvent);
        mycore = (MvcServerEventDMO) core;
        mycore.setContainer(this);
    }

    public MvcServerEventDMW(DmcTypeModifierMV mods) {
        super(new MvcServerEventDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcServerEvent);
        mycore = (MvcServerEventDMO) core;
        mycore.setContainer(this);
    }

    public MvcServerEvent getModificationRecorder(){
        MvcServerEvent rc = new MvcServerEvent();
        rc.setDmcObject(new MvcServerEventDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
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

    public MvcServerEventDMO getDMO() {
        return(mycore);
    }

    protected MvcServerEventDMW(MvcServerEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcServerEventDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:868)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcServerEventDMW){
            return( getObjectName().equals( ((MvcServerEventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setDescription(String value){
        mycore.setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remDescription(){
        mycore.remDescription();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remName(){
        mycore.remName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public String getEventDataType(){
        return(mycore.getEventDataType());
    }

    /**
     * Sets eventDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setEventDataType(Object value) throws DmcValueException {
        mycore.setEventDataType(value);
    }

    /**
     * Sets eventDataType to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setEventDataType(String value){
        mycore.setEventDataType(value);
    }

    /**
     * Removes the eventDataType attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remEventDataType(){
        mycore.remEventDataType();
    }


}
