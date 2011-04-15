package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:842)
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
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcMenuSeparatorDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcMenuSeparatorDMO mycore;

    public MvcMenuSeparatorDMW() {
        super(new MvcMenuSeparatorDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
        mycore = (MvcMenuSeparatorDMO) core;
        mycore.setContainer(this);
    }

    public MvcMenuSeparatorDMW(DmcTypeModifierMV mods) {
        super(new MvcMenuSeparatorDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
        mycore = (MvcMenuSeparatorDMO) core;
        mycore.setContainer(this);
    }

    public MvcMenuSeparator getModificationRecorder(){
        MvcMenuSeparator rc = new MvcMenuSeparator();
        rc.setDmcObject(new MvcMenuSeparatorDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcMenuSeparatorDMW(MvcMenuSeparatorDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
        mycore = (MvcMenuSeparatorDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcMenuSeparatorDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public MvcMenuSeparatorDMO getDMO() {
        return(mycore);
    }

    protected MvcMenuSeparatorDMW(MvcMenuSeparatorDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuSeparatorDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:868)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuSeparatorDMW){
            return( getObjectName().equals( ((MvcMenuSeparatorDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:999)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1046)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1055)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1070)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcMenu object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:978)
    public MvcMenu getAddToMenu(){
        MvcMenuREF ref = mycore.getAddToMenu();
        if (ref == null)
            return(null);
        
        return((MvcMenu)ref.getObject().getContainer());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MvcMenuREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1023)
    public void setAddToMenu(MvcMenu value) {
        mycore.setAddToMenu(value.getDMO());
    }

    /**
     * Removes the addToMenu attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1070)
    public void remAddToMenu(){
        mycore.remAddToMenu();
    }

    /**
     * @return A MvcController object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:978)
    public MvcController getAssociatedController(){
        MvcControllerREF ref = mycore.getAssociatedController();
        if (ref == null)
            return(null);
        
        return((MvcController)ref.getObject().getContainer());
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1023)
    public void setAssociatedController(MvcController value) {
        mycore.setAssociatedController(value.getDMO());
    }

    /**
     * Removes the associatedController attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1070)
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:999)
    public Integer getMenuOrder(){
        return(mycore.getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1046)
    public void setMenuOrder(Object value) throws DmcValueException {
        mycore.setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1055)
    public void setMenuOrder(Integer value){
        mycore.setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1070)
    public void remMenuOrder(){
        mycore.remMenuOrder();
    }


}
