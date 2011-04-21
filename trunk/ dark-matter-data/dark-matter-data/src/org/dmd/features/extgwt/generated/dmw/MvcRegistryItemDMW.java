package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:882)
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
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcRegistryItemDMW extends MvcDefinition implements DmcNamedObjectIF {

    public MvcRegistryItemDMW() {
        super(new MvcRegistryItemDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcRegistryItem);
    }

    public MvcRegistryItemDMW(DmcTypeModifierMV mods) {
        super(new MvcRegistryItemDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcRegistryItem);
    }

    public MvcRegistryItem getModificationRecorder(){
        MvcRegistryItem rc = new MvcRegistryItem();
        rc.setDmcObject(new MvcRegistryItemDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcRegistryItemDMW(MvcRegistryItemDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcRegistryItem);
    }

    public MvcRegistryItemDMO getDMO() {
        return((MvcRegistryItemDMO) core);
    }

    protected MvcRegistryItemDMW(MvcRegistryItemDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:910)
    public StringName getObjectName(){
        return(((MvcRegistryItemDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcRegistryItemDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcRegistryItemDMW){
            return( getObjectName().equals( ((MvcRegistryItemDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1047)
    public String getUserDataCollection(){
        return(((MvcRegistryItemDMO) core).getUserDataCollection());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void setUserDataCollection(Object value) throws DmcValueException {
        ((MvcRegistryItemDMO) core).setUserDataCollection(value);
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1103)
    public void setUserDataCollection(String value){
        ((MvcRegistryItemDMO) core).setUserDataCollection(value);
    }

    /**
     * Removes the userDataCollection attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1129)
    public void remUserDataCollection(){
        ((MvcRegistryItemDMO) core).remUserDataCollection();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1047)
    public String getUserDataGenericSpec(){
        return(((MvcRegistryItemDMO) core).getUserDataGenericSpec());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        ((MvcRegistryItemDMO) core).setUserDataGenericSpec(value);
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1103)
    public void setUserDataGenericSpec(String value){
        ((MvcRegistryItemDMO) core).setUserDataGenericSpec(value);
    }

    /**
     * Removes the userDataGenericSpec attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1129)
    public void remUserDataGenericSpec(){
        ((MvcRegistryItemDMO) core).remUserDataGenericSpec();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1047)
    public String getDescription(){
        return(((MvcRegistryItemDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void setDescription(Object value) throws DmcValueException {
        ((MvcRegistryItemDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1103)
    public void setDescription(String value){
        ((MvcRegistryItemDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1129)
    public void remDescription(){
        ((MvcRegistryItemDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1047)
    public StringName getName(){
        return(((MvcRegistryItemDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void setName(Object value) throws DmcValueException {
        ((MvcRegistryItemDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1103)
    public void setName(StringName value){
        ((MvcRegistryItemDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1129)
    public void remName(){
        ((MvcRegistryItemDMO) core).remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1047)
    public String getUserDataType(){
        return(((MvcRegistryItemDMO) core).getUserDataType());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void setUserDataType(Object value) throws DmcValueException {
        ((MvcRegistryItemDMO) core).setUserDataType(value);
    }

    /**
     * Sets userDataType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1103)
    public void setUserDataType(String value){
        ((MvcRegistryItemDMO) core).setUserDataType(value);
    }

    /**
     * Removes the userDataType attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1129)
    public void remUserDataType(){
        ((MvcRegistryItemDMO) core).remUserDataType();
    }


}
