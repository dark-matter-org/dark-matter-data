package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
import org.dmd.dmc.*;                                                     // If any attributes
import org.dmd.dmc.types.StringName;                                      // Primitive type
import org.dmd.dms.*;                                                     // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcController;                    // Is reference type aux
import org.dmd.features.extgwt.extended.MvcDefinition;                    // Derived class
import org.dmd.features.extgwt.extended.MvcMenu;                          // Is reference type aux
import org.dmd.features.extgwt.extended.MvcMenuSeparator;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcMenuSeparatorDMO;         // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.types.MvcControllerREF;          // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcMenuREF;                // To support getMVCopy() for REFs

/**
 * The menu separator indicates where a separator should be  placed between
 * menu items.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class MvcMenuSeparatorDMW extends MvcDefinition implements DmcNamedObjectIF {

    public MvcMenuSeparatorDMW() {
        super(new MvcMenuSeparatorDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
    }

    public MvcMenuSeparatorDMW(DmcTypeModifierMV mods) {
        super(new MvcMenuSeparatorDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
    }

    public MvcMenuSeparator getModificationRecorder(){
        MvcMenuSeparator rc = new MvcMenuSeparator();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MvcMenuSeparatorDMW(MvcMenuSeparatorDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
    }

    public MvcMenuSeparatorDMO getDMO() {
        return((MvcMenuSeparatorDMO) core);
    }

    protected MvcMenuSeparatorDMW(MvcMenuSeparatorDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:953)
    public StringName getObjectName(){
        return(((MvcMenuSeparatorDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcMenuSeparatorDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuSeparatorDMW){
            return( getObjectName().equals( ((MvcMenuSeparatorDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public StringName getName(){
        return(((MvcMenuSeparatorDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setName(Object value) throws DmcValueException {
        ((MvcMenuSeparatorDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setName(StringName value){
        ((MvcMenuSeparatorDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remName(){
        ((MvcMenuSeparatorDMO) core).remName();
    }

    /**
     * @return A MvcMenu object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1069)
    public MvcMenu getAddToMenu(){
        MvcMenuREF ref = ((MvcMenuSeparatorDMO) core).getAddToMenu();
        if (ref == null)
            return(null);
        
        return((MvcMenu)ref.getObject().getContainer());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MvcMenuREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1114)
    public void setAddToMenu(MvcMenu value) {
        ((MvcMenuSeparatorDMO) core).setAddToMenu(value.getDMO());
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remAddToMenu(){
        ((MvcMenuSeparatorDMO) core).remAddToMenu();
    }

    /**
     * @return A MvcController object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1069)
    public MvcController getAssociatedController(){
        MvcControllerREF ref = ((MvcMenuSeparatorDMO) core).getAssociatedController();
        if (ref == null)
            return(null);
        
        return((MvcController)ref.getObject().getContainer());
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1114)
    public void setAssociatedController(MvcController value) {
        ((MvcMenuSeparatorDMO) core).setAssociatedController(value.getDMO());
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remAssociatedController(){
        ((MvcMenuSeparatorDMO) core).remAssociatedController();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public Integer getMenuOrder(){
        return(((MvcMenuSeparatorDMO) core).getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setMenuOrder(Object value) throws DmcValueException {
        ((MvcMenuSeparatorDMO) core).setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setMenuOrder(Integer value){
        ((MvcMenuSeparatorDMO) core).setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remMenuOrder(){
        ((MvcMenuSeparatorDMO) core).remMenuOrder();
    }


}
