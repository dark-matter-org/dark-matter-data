package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:613)
import java.util.*;                                                  // If not auxiliary
import org.dmd.dmc.*;                                                // Always 2
import org.dmd.dmc.types.StringName;                                 // Primitive type
import org.dmd.dms.*;                                                // Always 3
import org.dmd.features.extgwt.extended.MvcAction;                   // Is reference type
import org.dmd.features.extgwt.extended.MvcController;               // Is reference type
import org.dmd.features.extgwt.extended.MvcDefinition;               // Derived class
import org.dmd.features.extgwt.extended.MvcMenu;                     // Is reference type
import org.dmd.features.extgwt.generated.dmo.MvcMenuItemDMO;         // Class not auxiliary or abstract

/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:291)
 */
abstract public class MvcMenuItemDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcMenuItemDMO mycore;

    public MvcMenuItemDMW() {
        super(new MvcMenuItemDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuItem);
        mycore = (MvcMenuItemDMO) core;
        mycore.setContainer(this);
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

    protected MvcMenuItemDMW(MvcMenuItemDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuItemDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMenuItem>());
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:639)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuItemDMW){
            return( getObjectName().equals( ((MvcMenuItemDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public String getDisplayLabel(){
        return(mycore.getDisplayLabel());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setDisplayLabel(Object value) throws DmcValueException {
        mycore.setDisplayLabel(value);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remDisplayLabel(){
        mycore.remDisplayLabel();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public Boolean getCustomRender(){
        return(mycore.getCustomRender());
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setCustomRender(Object value) throws DmcValueException {
        mycore.setCustomRender(value);
    }

    /**
     * Removes the customRender attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remCustomRender(){
        mycore.remCustomRender();
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

    /**
     * @return A MvcAction object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:714)
    public MvcAction getTriggersAction(){
        DmcAttribute<?> attr = mycore.get(MvcMenuItemDMO.__triggersAction);
        if (attr == null)
            return(null);
        
        MvcAction ref = (MvcAction) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the triggersAction to the specified value.
     * @param value A value compatible with MvcActionREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:743)
    public void setTriggersAction(MvcAction value) throws DmcValueException {
        mycore.setTriggersAction(value.getDmcObject());
        DmcAttribute<?> attr = mycore.get(MvcMenuItemDMO.__triggersAction);
        attr.setAuxData(value);
    }

    /**
     * Removes the triggersAction attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remTriggersAction(){
        mycore.remTriggersAction();
    }

    /**
     * @return A MvcMenu object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:714)
    public MvcMenu getAddToMenu(){
        DmcAttribute<?> attr = mycore.get(MvcMenuItemDMO.__addToMenu);
        if (attr == null)
            return(null);
        
        MvcMenu ref = (MvcMenu) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MvcMenuREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:743)
    public void setAddToMenu(MvcMenu value) throws DmcValueException {
        mycore.setAddToMenu(value.getDmcObject());
        DmcAttribute<?> attr = mycore.get(MvcMenuItemDMO.__addToMenu);
        attr.setAuxData(value);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remAddToMenu(){
        mycore.remAddToMenu();
    }

    /**
     * @return A MvcController object.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:714)
    public MvcController getAssociatedController(){
        DmcAttribute<?> attr = mycore.get(MvcMenuItemDMO.__associatedController);
        if (attr == null)
            return(null);
        
        MvcController ref = (MvcController) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:743)
    public void setAssociatedController(MvcController value) throws DmcValueException {
        mycore.setAssociatedController(value.getDmcObject());
        DmcAttribute<?> attr = mycore.get(MvcMenuItemDMO.__associatedController);
        attr.setAuxData(value);
    }

    /**
     * Removes the associatedController attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public Integer getMenuOrder(){
        return(mycore.getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setMenuOrder(Object value) throws DmcValueException {
        mycore.setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remMenuOrder(){
        mycore.remMenuOrder();
    }


}
