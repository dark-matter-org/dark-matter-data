package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:878)
import org.dmd.dmc.*;                                                                 // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                               // Primitive type
import org.dmd.dms.*;                                                                 // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                         // Derived class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuElementDefinitionDMO;         // Class not auxiliary or abstract

/**
 * The MenuElementDefinition is common base for all definitions associated
 * with the definition of menu elements.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:293)
 */
public class MenuElementDefinitionDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:370)
    public MenuElementDefinitionDMW() {
        super(new MenuElementDefinitionDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuElementDefinition);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:376)
    public MenuElementDefinitionDMW(DmcTypeModifierMV mods) {
        super(new MenuElementDefinitionDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuElementDefinition);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:427)
    public MenuElementDefinitionDMW getModificationRecorder(){
        MenuElementDefinitionDMW rc = new MenuElementDefinitionDMW();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:439)
    public MenuElementDefinitionDMW(MenuElementDefinitionDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._MenuElementDefinition);
    }

    public MenuElementDefinitionDMW cloneIt() {
        MenuElementDefinitionDMW rc = new MenuElementDefinitionDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public MenuElementDefinitionDMO getDMO() {
        return((MenuElementDefinitionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:456)
    protected MenuElementDefinitionDMW(MenuElementDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:905)
    public CamelCaseName getObjectName(){
        return(((MenuElementDefinitionDMO) core).getElementName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MenuElementDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MenuElementDefinitionDMW){
            return( getObjectName().equals( ((MenuElementDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1057)
    public String getUseImpl(){
        return(((MenuElementDefinitionDMO) core).getUseImpl());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1116)
    public void setUseImpl(Object value) throws DmcValueException {
        ((MenuElementDefinitionDMO) core).setUseImpl(value);
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1125)
    public void setUseImpl(String value){
        ((MenuElementDefinitionDMO) core).setUseImpl(value);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1151)
    public void remUseImpl(){
        ((MenuElementDefinitionDMO) core).remUseImpl();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1057)
    public CamelCaseName getElementName(){
        return(((MenuElementDefinitionDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1116)
    public void setElementName(Object value) throws DmcValueException {
        ((MenuElementDefinitionDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1125)
    public void setElementName(CamelCaseName value){
        ((MenuElementDefinitionDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1151)
    public void remElementName(){
        ((MenuElementDefinitionDMO) core).remElementName();
    }


}
