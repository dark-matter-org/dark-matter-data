package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                                                       // To support getMVCopy() - (BaseDMWGeneratorNewest.java:997)
import java.util.Iterator;                                                                        // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2048)
import org.dmd.dmc.*;                                                                             // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.CamelCaseName;                                                           // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.*;                                                                             // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                                     // Derived class - (BaseDMWGeneratorNewest.java:1064)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuImplementationConfig;                    // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:896)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuImplementationConfigDMO;                  // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                                     // Attribute alternateMenuBar from the mvw schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementTypeAndCommentIterableDMW;         // For multi-valued MenuElementTypeAndComment - (BaseDMWGeneratorNewest.java:1913)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuElementTypeAndComment;                  // Primitive type - (BaseDMWGeneratorNewest.java:966)


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
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class MenuImplementationConfigDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public MenuImplementationConfigDMW() {
        super(new MenuImplementationConfigDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuImplementationConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public MenuImplementationConfigDMW(DmcTypeModifierMV mods) {
        super(new MenuImplementationConfigDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuImplementationConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public MenuImplementationConfig getModificationRecorder(){
        MenuImplementationConfig rc = new MenuImplementationConfig();
        rc.setConfigName(getConfigName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected MenuImplementationConfigDMW(MenuImplementationConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1113)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getAlternateMenuBarSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateMenuBarSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getAlternateMenuBarIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuBarSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getAlternateMenuBarHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuBarSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1917)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1943)
    public void addAlternateMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateMenuBar(value);
    }

    /**
     * Adds another alternateMenuBar value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1953)
    public void addAlternateMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateMenuBar(value);
    }

    /**
     * Returns true if the collection contains the alternateMenuBar value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public boolean alternateMenuBarContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateMenuBarContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2052)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2079)
    public void delAlternateMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateMenuBar(value);
    }

    /**
     * Deletes a alternateMenuBar value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2088)
    public void delAlternateMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateMenuBar(value);
    }

    /**
     * Removes the alternateMenuBar attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remAlternateMenuBar(){
        ((MenuImplementationConfigDMO) core).remAlternateMenuBar();
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getAlternateMenuItemSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateMenuItemSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getAlternateMenuItemIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuItemSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getAlternateMenuItemHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuItemSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1917)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1943)
    public void addAlternateMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateMenuItem(value);
    }

    /**
     * Adds another alternateMenuItem value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1953)
    public void addAlternateMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateMenuItem(value);
    }

    /**
     * Returns true if the collection contains the alternateMenuItem value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public boolean alternateMenuItemContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateMenuItemContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2052)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2079)
    public void delAlternateMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateMenuItem(value);
    }

    /**
     * Deletes a alternateMenuItem value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2088)
    public void delAlternateMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateMenuItem(value);
    }

    /**
     * Removes the alternateMenuItem attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remAlternateMenuItem(){
        ((MenuImplementationConfigDMO) core).remAlternateMenuItem();
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getAlternateSubMenuSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateSubMenuSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getAlternateSubMenuIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateSubMenuSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getAlternateSubMenuHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateSubMenuSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1917)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1943)
    public void addAlternateSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateSubMenu(value);
    }

    /**
     * Adds another alternateSubMenu value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1953)
    public void addAlternateSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateSubMenu(value);
    }

    /**
     * Returns true if the collection contains the alternateSubMenu value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public boolean alternateSubMenuContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateSubMenuContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2052)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2079)
    public void delAlternateSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateSubMenu(value);
    }

    /**
     * Deletes a alternateSubMenu value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2088)
    public void delAlternateSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateSubMenu(value);
    }

    /**
     * Removes the alternateSubMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remAlternateSubMenu(){
        ((MenuImplementationConfigDMO) core).remAlternateSubMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public CamelCaseName getConfigName(){
        return(((MenuImplementationConfigDMO) core).getConfigName());
    }

    /**
     * Sets configName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setConfigName(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Sets configName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setConfigName(CamelCaseName value){
        ((MenuImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Removes the configName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remConfigName(){
        ((MenuImplementationConfigDMO) core).remConfigName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public MenuElementTypeAndComment getDefaultMenuBar(){
        return(((MenuImplementationConfigDMO) core).getDefaultMenuBar());
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setDefaultMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultMenuBar(value);
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setDefaultMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultMenuBar(value);
    }

    /**
     * Removes the defaultMenuBar attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remDefaultMenuBar(){
        ((MenuImplementationConfigDMO) core).remDefaultMenuBar();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public MenuElementTypeAndComment getDefaultMenuItem(){
        return(((MenuImplementationConfigDMO) core).getDefaultMenuItem());
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setDefaultMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultMenuItem(value);
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setDefaultMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultMenuItem(value);
    }

    /**
     * Removes the defaultMenuItem attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remDefaultMenuItem(){
        ((MenuImplementationConfigDMO) core).remDefaultMenuItem();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public MenuElementTypeAndComment getDefaultSeparator(){
        return(((MenuImplementationConfigDMO) core).getDefaultSeparator());
    }

    /**
     * Sets defaultSeparator to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setDefaultSeparator(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultSeparator(value);
    }

    /**
     * Sets defaultSeparator to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setDefaultSeparator(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultSeparator(value);
    }

    /**
     * Removes the defaultSeparator attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remDefaultSeparator(){
        ((MenuImplementationConfigDMO) core).remDefaultSeparator();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public MenuElementTypeAndComment getDefaultSubMenu(){
        return(((MenuImplementationConfigDMO) core).getDefaultSubMenu());
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setDefaultSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultSubMenu(value);
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setDefaultSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultSubMenu(value);
    }

    /**
     * Removes the defaultSubMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remDefaultSubMenu(){
        ((MenuImplementationConfigDMO) core).remDefaultSubMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getUseClass(){
        return(((MenuImplementationConfigDMO) core).getUseClass());
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setUseClass(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setUseClass(value);
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setUseClass(String value){
        ((MenuImplementationConfigDMO) core).setUseClass(value);
    }

    /**
     * Removes the useClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remUseClass(){
        ((MenuImplementationConfigDMO) core).remUseClass();
    }


}