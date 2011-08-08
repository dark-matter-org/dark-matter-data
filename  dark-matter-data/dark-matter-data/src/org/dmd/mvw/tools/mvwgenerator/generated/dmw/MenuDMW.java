package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:855)
import org.dmd.dmc.*;                                                                 // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                               // Primitive type
import org.dmd.dms.*;                                                                 // Always 2
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Menu;                            // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuDMO;                          // Abstract class
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementDefinitionDMW;         // Derived class

/**
 * The Menu is a common base for all definitions associated with the
 * definition of menus of different types e.g. toolbars, menubars, popups etc.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:290)
 */
abstract public class MenuDMW extends MenuElementDefinitionDMW implements DmcNamedObjectIF {

    protected MenuDMW() {
        super();
    }

    abstract public Menu getModificationRecorder();

    public MenuDMO getDMO() {
        return((MenuDMO) core);
    }

    protected MenuDMW(MenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:882)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public CamelCaseName getElementName(){
        return(((MenuDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setElementName(Object value) throws DmcValueException {
        ((MenuDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setElementName(CamelCaseName value){
        ((MenuDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remElementName(){
        ((MenuDMO) core).remElementName();
    }


}
