package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import org.dmd.dmc.*;                                                   // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                 // Primitive type
import org.dmd.dms.*;                                                   // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Menu;              // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuBar;           // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuBarDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;           // Attribute from mvw schema

/**
 * The MenuImplementationConfig is used to define the various classes that
 * will
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class MenuBarDMW extends Menu implements DmcNamedObjectIF {

    public MenuBarDMW() {
        super(new MenuBarDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuBar);
    }

    public MenuBarDMW(DmcTypeModifierMV mods) {
        super(new MenuBarDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuBar);
    }

    public MenuBar getModificationRecorder(){
        MenuBar rc = new MenuBar();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MenuBarDMW(MenuBarDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuBar);
    }

    public MenuBarDMO getDMO() {
        return((MenuBarDMO) core);
    }

    protected MenuBarDMW(MenuBarDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:961)
    public CamelCaseName getObjectName(){
        return(((MenuBarDMO) core).getElementName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MenuBarDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MenuBarDMW){
            return( getObjectName().equals( ((MenuBarDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public CamelCaseName getUseImpl(){
        return(((MenuBarDMO) core).getUseImpl());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setUseImpl(Object value) throws DmcValueException {
        ((MenuBarDMO) core).setUseImpl(value);
    }

    /**
     * Sets useImpl to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setUseImpl(CamelCaseName value){
        ((MenuBarDMO) core).setUseImpl(value);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remUseImpl(){
        ((MenuBarDMO) core).remUseImpl();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public CamelCaseName getElementName(){
        return(((MenuBarDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setElementName(Object value) throws DmcValueException {
        ((MenuBarDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setElementName(CamelCaseName value){
        ((MenuBarDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remElementName(){
        ((MenuBarDMO) core).remElementName();
    }


}
