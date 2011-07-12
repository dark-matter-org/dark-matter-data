package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import java.util.ArrayList;                                                              // To support getMVCopy()
import java.util.Iterator;                                                               // To support getMVCopy()
import org.dmd.dmc.*;                                                                    // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                                  // Primitive type
import org.dmd.dms.*;                                                                    // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                    // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                            // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuImplementationConfig;           // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuImplementationConfigDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                            // Attribute from mvw schema
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ImplAndClassIterableDMW;             // For multi-valued ImplAndClass
import org.dmd.mvw.tools.mvwgenerator.generated.types.ImplAndClass;                      // For multi-valued containsImplAndClass

/**
 * The MenuImplementationConfig is used to define the various classes that
 * will  be used to implement an actual menu structure based the MVW menu
 * definitions.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
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
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MenuImplementationConfigDMW(MenuImplementationConfigDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuImplementationConfig);
    }

    public MenuImplementationConfigDMO getDMO() {
        return((MenuImplementationConfigDMO) core);
    }

    protected MenuImplementationConfigDMW(MenuImplementationConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:961)
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
     * @return The number of ImplAndClass items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1235)
    public int getAlternateMenuBarSize(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ImplAndClassDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getAlternateMenuBarIsEmpty(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ImplAndClassDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1260)
    public boolean getAlternateMenuBarHasValue(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of ImplAndClass objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public ImplAndClassIterableDMW getAlternateMenuBarIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(ImplAndClassIterableDMW.emptyList);
        
        return(new ImplAndClassIterableDMW(((MenuImplementationConfigDMO) core).getAlternateMenuBar()));
    }

    /**
     * Adds another alternateMenuBar value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1474)
    public void addAlternateMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateMenuBar(value);
    }

    /**
     * Adds another alternateMenuBar value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1484)
    public void addAlternateMenuBar(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).addAlternateMenuBar(value);
    }

    /**
     * Returns true if the collection contains the alternateMenuBar value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1542)
    public boolean alternateMenuBarContains(ImplAndClass value){
        return(((MenuImplementationConfigDMO) core).alternateMenuBarContains(value));
    }

    /**
     * @return A COPY of the collection of ImplAndClass objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1582)
    @SuppressWarnings("unchecked")
    public ArrayList<ImplAndClass> getAlternateMenuBarCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(new ArrayList<ImplAndClass>());
        
        ArrayList<ImplAndClass> rc = new ArrayList<ImplAndClass>(attr.getMVSize());
        
        Iterator<ImplAndClass> it = (Iterator<ImplAndClass>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a alternateMenuBar value.
     * @param value The ImplAndClass to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1609)
    public void delAlternateMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateMenuBar(value);
    }

    /**
     * Deletes a alternateMenuBar value.
     * @param value The ImplAndClass to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1618)
    public void delAlternateMenuBar(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).delAlternateMenuBar(value);
    }

    /**
     * Removes the alternateMenuBar attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1630)
    public void remAlternateMenuBar(){
        ((MenuImplementationConfigDMO) core).remAlternateMenuBar();
    }

    /**
     * @return The number of ImplAndClass items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1235)
    public int getAlternateSubMenuSize(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ImplAndClassDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getAlternateSubMenuIsEmpty(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ImplAndClassDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1260)
    public boolean getAlternateSubMenuHasValue(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of ImplAndClass objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public ImplAndClassIterableDMW getAlternateSubMenuIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(ImplAndClassIterableDMW.emptyList);
        
        return(new ImplAndClassIterableDMW(((MenuImplementationConfigDMO) core).getAlternateSubMenu()));
    }

    /**
     * Adds another alternateSubMenu value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1474)
    public void addAlternateSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateSubMenu(value);
    }

    /**
     * Adds another alternateSubMenu value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1484)
    public void addAlternateSubMenu(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).addAlternateSubMenu(value);
    }

    /**
     * Returns true if the collection contains the alternateSubMenu value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1542)
    public boolean alternateSubMenuContains(ImplAndClass value){
        return(((MenuImplementationConfigDMO) core).alternateSubMenuContains(value));
    }

    /**
     * @return A COPY of the collection of ImplAndClass objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1582)
    @SuppressWarnings("unchecked")
    public ArrayList<ImplAndClass> getAlternateSubMenuCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(new ArrayList<ImplAndClass>());
        
        ArrayList<ImplAndClass> rc = new ArrayList<ImplAndClass>(attr.getMVSize());
        
        Iterator<ImplAndClass> it = (Iterator<ImplAndClass>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a alternateSubMenu value.
     * @param value The ImplAndClass to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1609)
    public void delAlternateSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateSubMenu(value);
    }

    /**
     * Deletes a alternateSubMenu value.
     * @param value The ImplAndClass to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1618)
    public void delAlternateSubMenu(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).delAlternateSubMenu(value);
    }

    /**
     * Removes the alternateSubMenu attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1630)
    public void remAlternateSubMenu(){
        ((MenuImplementationConfigDMO) core).remAlternateSubMenu();
    }

    /**
     * @return The number of ImplAndClass items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1235)
    public int getAlternateMenuItemSize(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ImplAndClassDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getAlternateMenuItemIsEmpty(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ImplAndClassDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1260)
    public boolean getAlternateMenuItemHasValue(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of ImplAndClass objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public ImplAndClassIterableDMW getAlternateMenuItemIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(ImplAndClassIterableDMW.emptyList);
        
        return(new ImplAndClassIterableDMW(((MenuImplementationConfigDMO) core).getAlternateMenuItem()));
    }

    /**
     * Adds another alternateMenuItem value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1474)
    public void addAlternateMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).addAlternateMenuItem(value);
    }

    /**
     * Adds another alternateMenuItem value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1484)
    public void addAlternateMenuItem(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).addAlternateMenuItem(value);
    }

    /**
     * Returns true if the collection contains the alternateMenuItem value.
     * @param value A value compatible with ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1542)
    public boolean alternateMenuItemContains(ImplAndClass value){
        return(((MenuImplementationConfigDMO) core).alternateMenuItemContains(value));
    }

    /**
     * @return A COPY of the collection of ImplAndClass objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1582)
    @SuppressWarnings("unchecked")
    public ArrayList<ImplAndClass> getAlternateMenuItemCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(new ArrayList<ImplAndClass>());
        
        ArrayList<ImplAndClass> rc = new ArrayList<ImplAndClass>(attr.getMVSize());
        
        Iterator<ImplAndClass> it = (Iterator<ImplAndClass>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a alternateMenuItem value.
     * @param value The ImplAndClass to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1609)
    public void delAlternateMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).delAlternateMenuItem(value);
    }

    /**
     * Deletes a alternateMenuItem value.
     * @param value The ImplAndClass to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1618)
    public void delAlternateMenuItem(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).delAlternateMenuItem(value);
    }

    /**
     * Removes the alternateMenuItem attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1630)
    public void remAlternateMenuItem(){
        ((MenuImplementationConfigDMO) core).remAlternateMenuItem();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public CamelCaseName getConfigName(){
        return(((MenuImplementationConfigDMO) core).getConfigName());
    }

    /**
     * Sets configName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setConfigName(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Sets configName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setConfigName(CamelCaseName value){
        ((MenuImplementationConfigDMO) core).setConfigName(value);
    }

    /**
     * Removes the configName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remConfigName(){
        ((MenuImplementationConfigDMO) core).remConfigName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public ImplAndClass getDefaultMenuBar(){
        return(((MenuImplementationConfigDMO) core).getDefaultMenuBar());
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value A value compatible with DmcTypeImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setDefaultMenuBar(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultMenuBar(value);
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setDefaultMenuBar(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).setDefaultMenuBar(value);
    }

    /**
     * Removes the defaultMenuBar attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remDefaultMenuBar(){
        ((MenuImplementationConfigDMO) core).remDefaultMenuBar();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public ImplAndClass getDefaultSubMenu(){
        return(((MenuImplementationConfigDMO) core).getDefaultSubMenu());
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value A value compatible with DmcTypeImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setDefaultSubMenu(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultSubMenu(value);
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setDefaultSubMenu(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).setDefaultSubMenu(value);
    }

    /**
     * Removes the defaultSubMenu attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remDefaultSubMenu(){
        ((MenuImplementationConfigDMO) core).remDefaultSubMenu();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public ImplAndClass getDefaultMenuItem(){
        return(((MenuImplementationConfigDMO) core).getDefaultMenuItem());
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value A value compatible with DmcTypeImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setDefaultMenuItem(Object value) throws DmcValueException {
        ((MenuImplementationConfigDMO) core).setDefaultMenuItem(value);
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value ImplAndClass
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setDefaultMenuItem(ImplAndClass value){
        ((MenuImplementationConfigDMO) core).setDefaultMenuItem(value);
    }

    /**
     * Removes the defaultMenuItem attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remDefaultMenuItem(){
        ((MenuImplementationConfigDMO) core).remDefaultMenuItem();
    }


}
