package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:838)
import org.dmd.dmc.*;                                                    // If any attributes
import org.dmd.dmc.types.StringName;                                     // Primitive type
import org.dmd.dms.*;                                                    // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcAction;                       // Is reference type aux
import org.dmd.features.extgwt.extended.MvcController;                   // Is reference type aux
import org.dmd.features.extgwt.extended.MvcDefinition;                   // Derived class
import org.dmd.features.extgwt.extended.MvcMenu;                         // Is reference type aux
import org.dmd.features.extgwt.extended.MvcMenuItem;                     // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcMenuItemDMO;             // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.types.MvcActionREF;             // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcControllerREF;         // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcMenuREF;               // To support getMVCopy() for REFs

/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class MvcMenuItemDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcMenuItemDMO mycore;

    public MvcMenuItemDMW() {
        super(new MvcMenuItemDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuItem);
        mycore = (MvcMenuItemDMO) core;
        mycore.setContainer(this);
    }

    public MvcMenuItemDMW(DmcTypeModifierMV mods) {
        super(new MvcMenuItemDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuItem);
        mycore = (MvcMenuItemDMO) core;
        mycore.setContainer(this);
    }

    public MvcMenuItem getModificationRecorder(){
        MvcMenuItem rc = new MvcMenuItem();
        rc.setDmcObject(new MvcMenuItemDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcMenuItemDMW(MvcMenuItemDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuItem);
        mycore = (MvcMenuItemDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcMenuItemDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public MvcMenuItemDMO getDMO() {
        return(mycore);
    }

    protected MvcMenuItemDMW(MvcMenuItemDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuItemDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuItemDMW){
            return( getObjectName().equals( ((MvcMenuItemDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getDisplayLabel(){
        return(mycore.getDisplayLabel());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setDisplayLabel(Object value) throws DmcValueException {
        mycore.setDisplayLabel(value);
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setDisplayLabel(String value){
        mycore.setDisplayLabel(value);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remDisplayLabel(){
        mycore.remDisplayLabel();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public Boolean isCustomRender(){
        return(mycore.isCustomRender());
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setCustomRender(Object value) throws DmcValueException {
        mycore.setCustomRender(value);
    }

    /**
     * Sets customRender to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setCustomRender(Boolean value){
        mycore.setCustomRender(value);
    }

    /**
     * Removes the customRender attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remCustomRender(){
        mycore.remCustomRender();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcAction object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:968)
    public MvcAction getTriggersAction(){
        MvcActionREF ref = mycore.getTriggersAction();
        if (ref == null)
            return(null);
        
        return((MvcAction)ref.getObject().getContainer());
    }

    /**
     * Sets the triggersAction to the specified value.
     * @param value A value compatible with MvcActionREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1013)
    public void setTriggersAction(MvcAction value) {
        mycore.setTriggersAction(value.getDMO());
    }

    /**
     * Removes the triggersAction attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remTriggersAction(){
        mycore.remTriggersAction();
    }

    /**
     * @return A MvcMenu object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:968)
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
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1013)
    public void setAddToMenu(MvcMenu value) {
        mycore.setAddToMenu(value.getDMO());
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remAddToMenu(){
        mycore.remAddToMenu();
    }

    /**
     * @return A MvcController object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:968)
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
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1013)
    public void setAssociatedController(MvcController value) {
        mycore.setAssociatedController(value.getDMO());
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public Integer getMenuOrder(){
        return(mycore.getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setMenuOrder(Object value) throws DmcValueException {
        mycore.setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setMenuOrder(Integer value){
        mycore.setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remMenuOrder(){
        mycore.remMenuOrder();
    }


}
