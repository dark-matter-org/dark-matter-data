package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:697)
import java.util.*;                                                       // If not auxiliary
import org.dmd.dmc.*;                                                     // If any attributes
import org.dmd.dmc.types.StringName;                                      // Primitive type
import org.dmd.dms.*;                                                     // Always 2
import org.dmd.features.extgwt.extended.MvcController;                    // Is reference type
import org.dmd.features.extgwt.extended.MvcDefinition;                    // Derived class
import org.dmd.features.extgwt.extended.MvcMenu;                          // Is reference type
import org.dmd.features.extgwt.generated.dmo.MvcMenuSeparatorDMO;         // Class not auxiliary or abstract

/**
 * The menu separator indicates where a separator should be  placed between
 * menu items.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:342)
 */
abstract public class MvcMenuSeparatorDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcMenuSeparatorDMO mycore;

    public MvcMenuSeparatorDMW() {
        super(new MvcMenuSeparatorDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuSeparator);
        mycore = (MvcMenuSeparatorDMO) core;
        mycore.setContainer(this);
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

    protected MvcMenuSeparatorDMW(MvcMenuSeparatorDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMenuSeparatorDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMenuSeparator>());
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:723)
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

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcMenu object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:804)
    public MvcMenu getAddToMenu(){
        DmcAttribute<?> attr = mycore.get(MvcMenuSeparatorDMO.__addToMenu);
        if (attr == null)
            return(null);
        
        MvcMenu ref = (MvcMenu) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MvcMenuREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:836)
    public void setAddToMenu(MvcMenu value) throws DmcValueException {
        mycore.setAddToMenu(value.getDmcObject());
        DmcAttribute<?> attr = mycore.get(MvcMenuSeparatorDMO.__addToMenu);
        attr.setAuxData(value);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remAddToMenu(){
        mycore.remAddToMenu();
    }

    /**
     * @return A MvcController object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:804)
    public MvcController getAssociatedController(){
        DmcAttribute<?> attr = mycore.get(MvcMenuSeparatorDMO.__associatedController);
        if (attr == null)
            return(null);
        
        MvcController ref = (MvcController) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:836)
    public void setAssociatedController(MvcController value) throws DmcValueException {
        mycore.setAssociatedController(value.getDmcObject());
        DmcAttribute<?> attr = mycore.get(MvcMenuSeparatorDMO.__associatedController);
        attr.setAuxData(value);
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public Integer getMenuOrder(){
        return(mycore.getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setMenuOrder(Object value) throws DmcValueException {
        mycore.setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setMenuOrder(Integer value){
        mycore.setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remMenuOrder(){
        mycore.remMenuOrder();
    }


}
