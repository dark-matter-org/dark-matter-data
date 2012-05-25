package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                                 // If any attributes - (BaseDMWGeneratorNewest.java:887)
import org.dmd.dmc.types.CamelCaseName;                                               // Is named by - (BaseDMWGeneratorNewest.java:868)
import org.dmd.dms.*;                                                                 // Always 2 - (BaseDMWGeneratorNewest.java:872)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:876)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:875)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.ActionBinding;                   // Is reference type - (BaseDMWGeneratorNewest.java:906)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Menu;                            // Is reference type - (BaseDMWGeneratorNewest.java:906)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuItem;                        // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:880)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuItemDMO;                      // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1047)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementDefinitionDMW;         // Derived class - (BaseDMWGeneratorNewest.java:1043)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActionBindingREF;               // Is reference type REF - (BaseDMWGeneratorNewest.java:914)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuREF;                        // Is reference type REF - (BaseDMWGeneratorNewest.java:914)


/**
 * The MenuItem is used to define triggerable menu items. You must specify
 * either a displayLabel or a displayLabelI18N to indicate the label to be
 * used for the menu item.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class MenuItemDMW extends MenuElementDefinitionDMW implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public MenuItemDMW() {
        super(new MenuItemDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuItem);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public MenuItemDMW(DmcTypeModifierMV mods) {
        super(new MenuItemDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuItem);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public MenuItem getModificationRecorder(){
        MenuItem rc = new MenuItem();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public MenuItemDMW(MenuItemDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuItem);
    }

    public MenuItem cloneIt() {
        MenuItem rc = new MenuItem();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public MenuItemDMO getDMO() {
        return((MenuItemDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected MenuItemDMW(MenuItemDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1092)
    public CamelCaseName getObjectName(){
        return(((MenuItemDMO) core).getElementName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MenuItemDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MenuItemDMW){
            return( getObjectName().equals( ((MenuItemDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A Menu object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1225)
    public Menu getAddToMenu(){
        MenuREF ref = ((MenuItemDMO) core).getAddToMenu();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Menu)ref.getObject().getContainer());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MenuREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1310)
    public void setAddToMenu(Menu value) {
        ((MenuItemDMO) core).setAddToMenu(value.getDMO());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MenuREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1319)
    public void setAddToMenu(Object value) throws DmcValueException {
        ((MenuItemDMO) core).setAddToMenu(value);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remAddToMenu(){
        ((MenuItemDMO) core).remAddToMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public String getDisplayLabel(){
        return(((MenuItemDMO) core).getDisplayLabel());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setDisplayLabel(Object value) throws DmcValueException {
        ((MenuItemDMO) core).setDisplayLabel(value);
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setDisplayLabel(String value){
        ((MenuItemDMO) core).setDisplayLabel(value);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remDisplayLabel(){
        ((MenuItemDMO) core).remDisplayLabel();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public String getDisplayLabelI18N(){
        return(((MenuItemDMO) core).getDisplayLabelI18N());
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setDisplayLabelI18N(Object value) throws DmcValueException {
        ((MenuItemDMO) core).setDisplayLabelI18N(value);
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setDisplayLabelI18N(String value){
        ((MenuItemDMO) core).setDisplayLabelI18N(value);
    }

    /**
     * Removes the displayLabelI18N attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remDisplayLabelI18N(){
        ((MenuItemDMO) core).remDisplayLabelI18N();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public CamelCaseName getElementName(){
        return(((MenuItemDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setElementName(Object value) throws DmcValueException {
        ((MenuItemDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setElementName(CamelCaseName value){
        ((MenuItemDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remElementName(){
        ((MenuItemDMO) core).remElementName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public String getMenuOrder(){
        return(((MenuItemDMO) core).getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setMenuOrder(Object value) throws DmcValueException {
        ((MenuItemDMO) core).setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setMenuOrder(String value){
        ((MenuItemDMO) core).setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remMenuOrder(){
        ((MenuItemDMO) core).remMenuOrder();
    }

    /**
     * @return A ActionBinding object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1225)
    public ActionBinding getTriggersAction(){
        ActionBindingREF ref = ((MenuItemDMO) core).getTriggersAction();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ActionBinding)ref.getObject().getContainer());
    }

    /**
     * Sets the triggersAction to the specified value.
     * @param value A value compatible with ActionBindingREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1310)
    public void setTriggersAction(ActionBinding value) {
        ((MenuItemDMO) core).setTriggersAction(value.getDMO());
    }

    /**
     * Sets the triggersAction to the specified value.
     * @param value A value compatible with ActionBindingREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1319)
    public void setTriggersAction(Object value) throws DmcValueException {
        ((MenuItemDMO) core).setTriggersAction(value);
    }

    /**
     * Removes the triggersAction attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remTriggersAction(){
        ((MenuItemDMO) core).remTriggersAction();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public String getUseImpl(){
        return(((MenuItemDMO) core).getUseImpl());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setUseImpl(Object value) throws DmcValueException {
        ((MenuItemDMO) core).setUseImpl(value);
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setUseImpl(String value){
        ((MenuItemDMO) core).setUseImpl(value);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remUseImpl(){
        ((MenuItemDMO) core).remUseImpl();
    }


}
