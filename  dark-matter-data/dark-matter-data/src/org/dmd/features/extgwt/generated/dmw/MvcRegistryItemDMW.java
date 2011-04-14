package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:838)
import org.dmd.dmc.*;                                                    // If any attributes
import org.dmd.dmc.types.StringName;                                     // Primitive type
import org.dmd.dms.*;                                                    // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcDefinition;                   // Derived class
import org.dmd.features.extgwt.extended.MvcRegistryItem;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcRegistryItemDMO;         // Class not auxiliary or abstract

/**
 * The MvcRegistryItem defines something that's stored in the Registry.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class MvcRegistryItemDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcRegistryItemDMO mycore;

    public MvcRegistryItemDMW() {
        super(new MvcRegistryItemDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcRegistryItem);
        mycore = (MvcRegistryItemDMO) core;
        mycore.setContainer(this);
    }

    public MvcRegistryItemDMW(DmcTypeModifierMV mods) {
        super(new MvcRegistryItemDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcRegistryItem);
        mycore = (MvcRegistryItemDMO) core;
        mycore.setContainer(this);
    }

    public MvcRegistryItem getModificationRecorder(){
        MvcRegistryItem rc = new MvcRegistryItem();
        rc.setDmcObject(new MvcRegistryItemDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
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

    public MvcRegistryItemDMO getDMO() {
        return(mycore);
    }

    protected MvcRegistryItemDMW(MvcRegistryItemDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcRegistryItemDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcRegistryItemDMW){
            return( getObjectName().equals( ((MvcRegistryItemDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getUserDataCollection(){
        return(mycore.getUserDataCollection());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setUserDataCollection(Object value) throws DmcValueException {
        mycore.setUserDataCollection(value);
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setUserDataCollection(String value){
        mycore.setUserDataCollection(value);
    }

    /**
     * Removes the userDataCollection attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remUserDataCollection(){
        mycore.remUserDataCollection();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getUserDataGenericSpec(){
        return(mycore.getUserDataGenericSpec());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        mycore.setUserDataGenericSpec(value);
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setUserDataGenericSpec(String value){
        mycore.setUserDataGenericSpec(value);
    }

    /**
     * Removes the userDataGenericSpec attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remUserDataGenericSpec(){
        mycore.remUserDataGenericSpec();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setDescription(String value){
        mycore.setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remDescription(){
        mycore.remDescription();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remName(){
        mycore.remName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getUserDataType(){
        return(mycore.getUserDataType());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setUserDataType(Object value) throws DmcValueException {
        mycore.setUserDataType(value);
    }

    /**
     * Sets userDataType to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setUserDataType(String value){
        mycore.setUserDataType(value);
    }

    /**
     * Removes the userDataType attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remUserDataType(){
        mycore.remUserDataType();
    }


}
