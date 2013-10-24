package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.ArrayList;                                                                       // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1048)
import java.util.Iterator;                                                                        // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2099)
import org.dmd.dmc.*;                                                                             // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmc.types.CamelCaseName;                                                           // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.*;                                                                             // Always 2 - (BaseDMWGeneratorNewest.java:939)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                       // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                                     // Derived class - (BaseDMWGeneratorNewest.java:1115)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuImplementationConfig;                    // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:947)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuImplementationConfigDMO;                  // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                                     // Attribute alternateMenuBar from the mvw schema - (BaseDMWGeneratorNewest.java:771)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementTypeAndCommentIterableDMW;         // For multi-valued MenuElementTypeAndComment - (BaseDMWGeneratorNewest.java:1964)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuElementTypeAndComment;                  // Primitive type - (BaseDMWGeneratorNewest.java:1017)


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
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class MenuImplementationConfigDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public MenuImplementationConfigDMW() {
        super(new MenuImplementationConfigDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuImplementationConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public MenuImplementationConfigDMW(DmcTypeModifierMV mods) {
        super(new MenuImplementationConfigDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuImplementationConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:495)
    public MenuImplementationConfig getModificationRecorder(){
        MenuImplementationConfig rc = new MenuImplementationConfig();
        rc.setConfigName(getConfigName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected MenuImplementationConfigDMW(MenuImplementationConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1164)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getAlternateMenuBarSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateMenuBarSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getAlternateMenuBarIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuBarSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getAlternateMenuBarHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuBarSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1968)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1994)
    public void addAlternateMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateMenuBar(value);
    }

    /**
     * Adds another alternateMenuBar value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2004)
    public void addAlternateMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateMenuBar(value);
    }

    /**
     * Returns true if the collection contains the alternateMenuBar value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2061)
    public boolean alternateMenuBarContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateMenuBarContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2103)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2130)
    public void delAlternateMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateMenuBar(value);
    }

    /**
     * Deletes a alternateMenuBar value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2139)
    public void delAlternateMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateMenuBar(value);
    }

    /**
     * Removes the alternateMenuBar attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remAlternateMenuBar(){
        ((MenuImplementationConfigDMO) core).remAlternateMenuBar();
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getAlternateMenuItemSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateMenuItemSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getAlternateMenuItemIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuItemSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getAlternateMenuItemHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateMenuItemSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1968)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1994)
    public void addAlternateMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateMenuItem(value);
    }

    /**
     * Adds another alternateMenuItem value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2004)
    public void addAlternateMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateMenuItem(value);
    }

    /**
     * Returns true if the collection contains the alternateMenuItem value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2061)
    public boolean alternateMenuItemContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateMenuItemContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2103)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2130)
    public void delAlternateMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateMenuItem(value);
    }

    /**
     * Deletes a alternateMenuItem value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2139)
    public void delAlternateMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateMenuItem(value);
    }

    /**
     * Removes the alternateMenuItem attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remAlternateMenuItem(){
        ((MenuImplementationConfigDMO) core).remAlternateMenuItem();
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getAlternateSubMenuSize(){
        return(((MenuImplementationConfigDMO) core).getAlternateSubMenuSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getAlternateSubMenuIsEmpty(){
        if (((MenuImplementationConfigDMO) core).getAlternateSubMenuSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getAlternateSubMenuHasValue(){
        if (((MenuImplementationConfigDMO) core).getAlternateSubMenuSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1968)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1994)
    public void addAlternateSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateSubMenu(value);
    }

    /**
     * Adds another alternateSubMenu value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2004)
    public void addAlternateSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).addAlternateSubMenu(value);
    }

    /**
     * Returns true if the collection contains the alternateSubMenu value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2061)
    public boolean alternateSubMenuContains(MenuElementTypeAndComment value){
        return(((MenuImplementationConfigDMO) core).alternateSubMenuContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2103)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2130)
    public void delAlternateSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateSubMenu(value);
    }

    /**
     * Deletes a alternateSubMenu value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2139)
    public void delAlternateSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).delAlternateSubMenu(value);
    }

    /**
     * Removes the alternateSubMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remAlternateSubMenu(){
        ((MenuImplementationConfigDMO) core).remAlternateSubMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public CamelCaseName getConfigName(){
        return(((MenuImplementationConfigDMO) core).getConfigName());
    }

    /**
     * Sets configName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setConfigName(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Sets configName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setConfigName(CamelCaseName value){
        ((MenuImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Removes the configName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remConfigName(){
        ((MenuImplementationConfigDMO) core).remConfigName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public MenuElementTypeAndComment getDefaultMenuBar(){
        return(((MenuImplementationConfigDMO) core).getDefaultMenuBar());
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setDefaultMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultMenuBar(value);
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setDefaultMenuBar(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultMenuBar(value);
    }

    /**
     * Removes the defaultMenuBar attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remDefaultMenuBar(){
        ((MenuImplementationConfigDMO) core).remDefaultMenuBar();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public MenuElementTypeAndComment getDefaultMenuItem(){
        return(((MenuImplementationConfigDMO) core).getDefaultMenuItem());
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setDefaultMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultMenuItem(value);
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setDefaultMenuItem(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultMenuItem(value);
    }

    /**
     * Removes the defaultMenuItem attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remDefaultMenuItem(){
        ((MenuImplementationConfigDMO) core).remDefaultMenuItem();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public MenuElementTypeAndComment getDefaultSeparator(){
        return(((MenuImplementationConfigDMO) core).getDefaultSeparator());
    }

    /**
     * Sets defaultSeparator to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setDefaultSeparator(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultSeparator(value);
    }

    /**
     * Sets defaultSeparator to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setDefaultSeparator(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultSeparator(value);
    }

    /**
     * Removes the defaultSeparator attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remDefaultSeparator(){
        ((MenuImplementationConfigDMO) core).remDefaultSeparator();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public MenuElementTypeAndComment getDefaultSubMenu(){
        return(((MenuImplementationConfigDMO) core).getDefaultSubMenu());
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setDefaultSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultSubMenu(value);
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setDefaultSubMenu(MenuElementTypeAndComment value){
        ((MenuImplementationConfigDMO) core).setDefaultSubMenu(value);
    }

    /**
     * Removes the defaultSubMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remDefaultSubMenu(){
        ((MenuImplementationConfigDMO) core).remDefaultSubMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public String getUseClass(){
        return(((MenuImplementationConfigDMO) core).getUseClass());
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setUseClass(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setUseClass(value);
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setUseClass(String value){
        ((MenuImplementationConfigDMO) core).setUseClass(value);
    }

    /**
     * Removes the useClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remUseClass(){
        ((MenuImplementationConfigDMO) core).remUseClass();
    }


}
