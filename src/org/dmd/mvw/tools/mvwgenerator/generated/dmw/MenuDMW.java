package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                                 // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.CamelCaseName;                                               // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.*;                                                                 // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Menu;                            // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:896)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuDMO;                          // Abstract class - (BaseDMWGeneratorNewest.java:1046)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementDefinitionDMW;         // Derived class - (BaseDMWGeneratorNewest.java:1064)


/**
 * The Menu is a common base for all definitions associated with the
 * definition of menus of different types e.g. toolbars, menubars, popups etc.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class MenuDMW extends MenuElementDefinitionDMW implements DmcNamedObjectIF {

    protected MenuDMW() {
        super();
    }

    abstract public Menu getModificationRecorder();

    public MenuDMO getDMO() {
        return((MenuDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected MenuDMW(MenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1113)
    public CamelCaseName getObjectName(){
        return(((MenuDMO) core).getElementName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MenuDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MenuDMW){
            return( getObjectName().equals( ((MenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public CamelCaseName getElementName(){
        return(((MenuDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setElementName(Object value) throws DmcValueException {
        ((MenuDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setElementName(CamelCaseName value){
        ((MenuDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remElementName(){
        ((MenuDMO) core).remElementName();
    }


}
