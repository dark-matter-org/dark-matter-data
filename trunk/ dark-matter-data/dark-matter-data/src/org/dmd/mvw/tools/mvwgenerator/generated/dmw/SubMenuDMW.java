package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:840)
import org.dmd.dmc.*;                                                   // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                 // Primitive type
import org.dmd.dms.*;                                                   // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Menu;              // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.menus.SubMenu;           // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubMenuDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuREF;          // To support getMVCopy() for REFs

/**
 * The SubMenu is used to define a submenu that is included as part of a Menu.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:290)
 */
abstract public class SubMenuDMW extends Menu implements DmcNamedObjectIF {

    public SubMenuDMW() {
        super(new SubMenuDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubMenu);
    }

    public SubMenuDMW(DmcTypeModifierMV mods) {
        super(new SubMenuDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubMenu);
    }

    public SubMenu getModificationRecorder(){
        SubMenu rc = new SubMenu();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public SubMenuDMW(SubMenuDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._SubMenu);
    }

    public SubMenuDMO getDMO() {
        return((SubMenuDMO) core);
    }

    protected SubMenuDMW(SubMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:867)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1012)
    public String getDisplayLabel(){
        return(((SubMenuDMO) core).getDisplayLabel());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1071)
    public void setDisplayLabel(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setDisplayLabel(value);
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1080)
    public void setDisplayLabel(String value){
        ((SubMenuDMO) core).setDisplayLabel(value);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1106)
    public void remDisplayLabel(){
        ((SubMenuDMO) core).remDisplayLabel();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1012)
    public String getDisplayLabelI18N(){
        return(((SubMenuDMO) core).getDisplayLabelI18N());
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1071)
    public void setDisplayLabelI18N(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setDisplayLabelI18N(value);
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1080)
    public void setDisplayLabelI18N(String value){
        ((SubMenuDMO) core).setDisplayLabelI18N(value);
    }

    /**
     * Removes the displayLabelI18N attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1106)
    public void remDisplayLabelI18N(){
        ((SubMenuDMO) core).remDisplayLabelI18N();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1012)
    public String getUseImpl(){
        return(((SubMenuDMO) core).getUseImpl());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1071)
    public void setUseImpl(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setUseImpl(value);
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1080)
    public void setUseImpl(String value){
        ((SubMenuDMO) core).setUseImpl(value);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1106)
    public void remUseImpl(){
        ((SubMenuDMO) core).remUseImpl();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1012)
    public CamelCaseName getElementName(){
        return(((SubMenuDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1071)
    public void setElementName(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1080)
    public void setElementName(CamelCaseName value){
        ((SubMenuDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1106)
    public void remElementName(){
        ((SubMenuDMO) core).remElementName();
    }

    /**
     * @return A Menu object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:984)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1037)
    public void setAddToMenu(Menu value) {
        ((SubMenuDMO) core).setAddToMenu(value.getDMO());
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1106)
    public void remAddToMenu(){
        ((SubMenuDMO) core).remAddToMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1012)
    public String getMenuOrder(){
        return(((SubMenuDMO) core).getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1071)
    public void setMenuOrder(Object value) throws DmcValueException {
        ((SubMenuDMO) core).setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1080)
    public void setMenuOrder(String value){
        ((SubMenuDMO) core).setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1106)
    public void remMenuOrder(){
        ((SubMenuDMO) core).remMenuOrder();
    }


}
