package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:855)
import java.util.ArrayList;                                                                       // To support getMVCopy()
import java.util.Iterator;                                                                        // To support getMVCopy()
import org.dmd.dmc.*;                                                                             // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                                           // Primitive type
import org.dmd.dms.*;                                                                             // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                       // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                             // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                                     // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuImplementationConfig;                    // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuImplementationConfigDMO;                  // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                                     // Attribute from mvw schema
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementTypeAndCommentIterableDMW;         // For multi-valued MenuElementTypeAndComment
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuElementTypeAndComment;                  // For multi-valued containsMenuElementTypeAndComment

/**
 * The MenuImplementationConfig is used to define the various classes that
 * will  be used to implement an actual menu structure based the MVW menu
 * definitions. <p /> The class specified by useClass must be derived from
 * org.dmd.mvw.client.mvwmenus.base.MvwMenuFactory and have a zero arg
 * constructor.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:290)
 */
abstract public class MenuImplementationConfigDMW extends MvwDefinition implements DmcNamedObjectIF {

    public MenuImplementationConfigDMW() {
        super(new MenuImplementationConfigDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuImplementationConfig);
    }

    public MenuImplementationConfigDMW(DmcTypeModifierMV mods) {
        super(new MenuImplementationConfigDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuImplementationConfig);
    }

    public MenuImplementationConfig getModificationRecorder(){
        MenuImplementationConfig rc = new MenuImplementationConfig();
        rc.setConfigName(getConfigName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public MenuImplementationConfigDMW(MenuImplementationConfigDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuImplementationConfig);
    }

    public MenuImplementationConfig cloneIt() {
        MenuImplementationConfig rc = new MenuImplementationConfig();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public MenuImplementationConfigDMO getDMO() {
        return((MenuImplementationConfigDMO) core);
    }

    protected MenuImplementationConfigDMW(MenuImplementationConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:882)
    public CamelCaseName getObjectName(){
        return(((MenuImplementationConfigDMO) core).getConfigName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MenuImplementationConfigDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MenuImplementationConfigDMW){
            return( getObjectName().equals( ((MenuImplementationConfigDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1173)
    public int getAlternateMenuBarSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateMenuBarSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1189)
    public boolean getAlternateMenuBarIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuBarSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1204)
    public boolean getAlternateMenuBarHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuBarSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1468)
    public MenuElementTypeAndCommentIterableDMW getAlternateMenuBarIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(MenuElementTypeAndCommentIterableDMW.emptyList);
        
        return(new MenuElementTypeAndCommentIterableDMW(((MenuImplementationConfigDMO) core).getAlternateMenuBar()));
    }

    /**
     * Adds another alternateMenuBar value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1494)
    public void addAlternateMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateMenuBar(value);
    }

    /**
     * Adds another alternateMenuBar value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1504)
    public void addAlternateMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateMenuBar(value);
    }

    /**
     * Returns true if the collection contains the alternateMenuBar value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1561)
    public boolean alternateMenuBarContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateMenuBarContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1601)
    @SuppressWarnings("unchecked")
    public ArrayList<MenuElementTypeAndComment> getAlternateMenuBarCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(new ArrayList<MenuElementTypeAndComment>());
        
        ArrayList<MenuElementTypeAndComment> rc = new ArrayList<MenuElementTypeAndComment>(attr.getMVSize());
        
        Iterator<MenuElementTypeAndComment> it = (Iterator<MenuElementTypeAndComment>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a alternateMenuBar value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1628)
    public void delAlternateMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateMenuBar(value);
    }

    /**
     * Deletes a alternateMenuBar value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1637)
    public void delAlternateMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateMenuBar(value);
    }

    /**
     * Removes the alternateMenuBar attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1649)
    public void remAlternateMenuBar(){
        ((MenuImplementationConfigDMO) core).remAlternateMenuBar();
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1173)
    public int getAlternateSubMenuSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateSubMenuSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1189)
    public boolean getAlternateSubMenuIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateSubMenuSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1204)
    public boolean getAlternateSubMenuHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateSubMenuSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1468)
    public MenuElementTypeAndCommentIterableDMW getAlternateSubMenuIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(MenuElementTypeAndCommentIterableDMW.emptyList);
        
        return(new MenuElementTypeAndCommentIterableDMW(((MenuImplementationConfigDMO) core).getAlternateSubMenu()));
    }

    /**
     * Adds another alternateSubMenu value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1494)
    public void addAlternateSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateSubMenu(value);
    }

    /**
     * Adds another alternateSubMenu value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1504)
    public void addAlternateSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateSubMenu(value);
    }

    /**
     * Returns true if the collection contains the alternateSubMenu value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1561)
    public boolean alternateSubMenuContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateSubMenuContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1601)
    @SuppressWarnings("unchecked")
    public ArrayList<MenuElementTypeAndComment> getAlternateSubMenuCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(new ArrayList<MenuElementTypeAndComment>());
        
        ArrayList<MenuElementTypeAndComment> rc = new ArrayList<MenuElementTypeAndComment>(attr.getMVSize());
        
        Iterator<MenuElementTypeAndComment> it = (Iterator<MenuElementTypeAndComment>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a alternateSubMenu value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1628)
    public void delAlternateSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateSubMenu(value);
    }

    /**
     * Deletes a alternateSubMenu value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1637)
    public void delAlternateSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateSubMenu(value);
    }

    /**
     * Removes the alternateSubMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1649)
    public void remAlternateSubMenu(){
        ((MenuImplementationConfigDMO) core).remAlternateSubMenu();
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1173)
    public int getAlternateMenuItemSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateMenuItemSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1189)
    public boolean getAlternateMenuItemIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuItemSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1204)
    public boolean getAlternateMenuItemHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuItemSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1468)
    public MenuElementTypeAndCommentIterableDMW getAlternateMenuItemIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(MenuElementTypeAndCommentIterableDMW.emptyList);
        
        return(new MenuElementTypeAndCommentIterableDMW(((MenuImplementationConfigDMO) core).getAlternateMenuItem()));
    }

    /**
     * Adds another alternateMenuItem value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1494)
    public void addAlternateMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateMenuItem(value);
    }

    /**
     * Adds another alternateMenuItem value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1504)
    public void addAlternateMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateMenuItem(value);
    }

    /**
     * Returns true if the collection contains the alternateMenuItem value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1561)
    public boolean alternateMenuItemContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateMenuItemContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1601)
    @SuppressWarnings("unchecked")
    public ArrayList<MenuElementTypeAndComment> getAlternateMenuItemCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(new ArrayList<MenuElementTypeAndComment>());
        
        ArrayList<MenuElementTypeAndComment> rc = new ArrayList<MenuElementTypeAndComment>(attr.getMVSize());
        
        Iterator<MenuElementTypeAndComment> it = (Iterator<MenuElementTypeAndComment>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a alternateMenuItem value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1628)
    public void delAlternateMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateMenuItem(value);
    }

    /**
     * Deletes a alternateMenuItem value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1637)
    public void delAlternateMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateMenuItem(value);
    }

    /**
     * Removes the alternateMenuItem attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1649)
    public void remAlternateMenuItem(){
        ((MenuImplementationConfigDMO) core).remAlternateMenuItem();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public CamelCaseName getConfigName(){
        return(((MenuImplementationConfigDMO) core).getConfigName());
    }

    /**
     * Sets configName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setConfigName(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Sets configName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setConfigName(CamelCaseName value){
        ((MenuImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Removes the configName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remConfigName(){
        ((MenuImplementationConfigDMO) core).remConfigName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public String getUseClass(){
        return(((MenuImplementationConfigDMO) core).getUseClass());
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setUseClass(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setUseClass(value);
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setUseClass(String value){
        ((MenuImplementationConfigDMO) core).setUseClass(value);
    }

    /**
     * Removes the useClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remUseClass(){
        ((MenuImplementationConfigDMO) core).remUseClass();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public MenuElementTypeAndComment getDefaultMenuBar(){
        return(((MenuImplementationConfigDMO) core).getDefaultMenuBar());
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setDefaultMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultMenuBar(value);
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setDefaultMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultMenuBar(value);
    }

    /**
     * Removes the defaultMenuBar attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remDefaultMenuBar(){
        ((MenuImplementationConfigDMO) core).remDefaultMenuBar();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public MenuElementTypeAndComment getDefaultSubMenu(){
        return(((MenuImplementationConfigDMO) core).getDefaultSubMenu());
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setDefaultSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultSubMenu(value);
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setDefaultSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultSubMenu(value);
    }

    /**
     * Removes the defaultSubMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remDefaultSubMenu(){
        ((MenuImplementationConfigDMO) core).remDefaultSubMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public MenuElementTypeAndComment getDefaultMenuItem(){
        return(((MenuImplementationConfigDMO) core).getDefaultMenuItem());
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setDefaultMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultMenuItem(value);
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setDefaultMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultMenuItem(value);
    }

    /**
     * Removes the defaultMenuItem attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remDefaultMenuItem(){
        ((MenuImplementationConfigDMO) core).remDefaultMenuItem();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public MenuElementTypeAndComment getDefaultSeparator(){
        return(((MenuImplementationConfigDMO) core).getDefaultSeparator());
    }

    /**
     * Sets defaultSeparator to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setDefaultSeparator(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultSeparator(value);
    }

    /**
     * Sets defaultSeparator to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setDefaultSeparator(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultSeparator(value);
    }

    /**
     * Removes the defaultSeparator attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remDefaultSeparator(){
        ((MenuImplementationConfigDMO) core).remDefaultSeparator();
    }


}
