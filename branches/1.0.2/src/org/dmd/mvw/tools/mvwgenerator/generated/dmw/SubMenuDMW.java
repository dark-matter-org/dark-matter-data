package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.CamelCaseName;                                 // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.*;                                                   // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Menu;              // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.SubMenu;           // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:896)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubMenuDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuREF;          // Is reference type REF - (BaseDMWGeneratorNewest.java:931)


/**
 * The SubMenu is used to define a submenu that is included as part of a Menu.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class SubMenuDMW extends Menu implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public SubMenuDMW() {
        super(new SubMenuDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubMenu);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public SubMenuDMW(DmcTypeModifierMV mods) {
        super(new SubMenuDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubMenu);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public SubMenu getModificationRecorder(){
        SubMenu rc = new SubMenu();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public SubMenuDMW(SubMenuDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubMenu);
    }

    public SubMenu cloneIt() {
        SubMenu rc = new SubMenu();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public SubMenuDMO getDMO() {
        return((SubMenuDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected SubMenuDMW(SubMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1113)
    public CamelCaseName getObjectName(){
        return(((SubMenuDMO) core).getElementName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((SubMenuDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof SubMenuDMW){
            return( getObjectName().equals( ((SubMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A Menu object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1246)
    public Menu getAddToMenu(){
        MenuREF ref = ((SubMenuDMO) core).getAddToMenu();
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1331)
    public void setAddToMenu(Menu value) {
        ((SubMenuDMO) core).setAddToMenu(value.getDMO());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MenuREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1340)
    public void setAddToMenu(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setAddToMenu(value);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remAddToMenu(){
        ((SubMenuDMO) core).remAddToMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getDisplayLabel(){
        return(((SubMenuDMO) core).getDisplayLabel());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setDisplayLabel(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setDisplayLabel(value);
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setDisplayLabel(String value){
        ((SubMenuDMO) core).setDisplayLabel(value);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remDisplayLabel(){
        ((SubMenuDMO) core).remDisplayLabel();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getDisplayLabelI18N(){
        return(((SubMenuDMO) core).getDisplayLabelI18N());
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setDisplayLabelI18N(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setDisplayLabelI18N(value);
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setDisplayLabelI18N(String value){
        ((SubMenuDMO) core).setDisplayLabelI18N(value);
    }

    /**
     * Removes the displayLabelI18N attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remDisplayLabelI18N(){
        ((SubMenuDMO) core).remDisplayLabelI18N();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public CamelCaseName getElementName(){
        return(((SubMenuDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setElementName(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setElementName(CamelCaseName value){
        ((SubMenuDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remElementName(){
        ((SubMenuDMO) core).remElementName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getMenuOrder(){
        return(((SubMenuDMO) core).getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setMenuOrder(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setMenuOrder(String value){
        ((SubMenuDMO) core).setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remMenuOrder(){
        ((SubMenuDMO) core).remMenuOrder();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getUseImpl(){
        return(((SubMenuDMO) core).getUseImpl());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setUseImpl(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setUseImpl(value);
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setUseImpl(String value){
        ((SubMenuDMO) core).setUseImpl(value);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remUseImpl(){
        ((SubMenuDMO) core).remUseImpl();
    }


}
