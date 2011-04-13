package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:835)
import org.dmd.dmc.*;                                               // If any attributes
import org.dmd.dmc.types.StringName;                                // Primitive type
import org.dmd.dms.*;                                               // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcMenu;                    // Derived class
import org.dmd.features.extgwt.extended.MvcSubMenu;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcSubMenuDMO;         // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.types.MvcMenuREF;          // To support getMVCopy() for REFs

/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class MvcSubMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcSubMenuDMO mycore;

    public MvcSubMenuDMW() {
        super(new MvcSubMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcSubMenu);
        mycore = (MvcSubMenuDMO) core;
        mycore.setContainer(this);
    }

    public MvcSubMenuDMW(DmcTypeModifierMV mods) {
        super(new MvcSubMenuDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcSubMenu);
        mycore = (MvcSubMenuDMO) core;
        mycore.setContainer(this);
    }

    public MvcSubMenu getModificationRecorder(){
        MvcSubMenu rc = new MvcSubMenu();
        rc.setDmcObject(new MvcSubMenuDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcSubMenuDMW(MvcSubMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcSubMenu);
        mycore = (MvcSubMenuDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcSubMenuDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public MvcSubMenuDMO getDMO() {
        return(mycore);
    }

    protected MvcSubMenuDMW(MvcSubMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcSubMenuDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:861)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcSubMenuDMW){
            return( getObjectName().equals( ((MvcSubMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public String getDisplayLabel(){
        return(mycore.getDisplayLabel());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setDisplayLabel(Object value) throws DmcValueException {
        mycore.setDisplayLabel(value);
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setDisplayLabel(String value){
        mycore.setDisplayLabel(value);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remDisplayLabel(){
        mycore.remDisplayLabel();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcMenu object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:965)
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
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1010)
    public void setAddToMenu(MvcMenu value) {
        mycore.setAddToMenu(value.getDMO());
    }

    /**
     * Removes the addToMenu attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remAddToMenu(){
        mycore.remAddToMenu();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public Integer getMenuOrder(){
        return(mycore.getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setMenuOrder(Object value) throws DmcValueException {
        mycore.setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setMenuOrder(Integer value){
        mycore.setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remMenuOrder(){
        mycore.remMenuOrder();
    }


}
