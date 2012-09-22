package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import org.dmd.dmc.*;                                                      // If any attributes
import org.dmd.dmc.types.StringName;                                       // Primitive type
import org.dmd.dms.*;                                                      // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcBackgroundMenu;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.extended.MvcMenu;                           // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcBackgroundMenuDMO;         // Class not auxiliary or abstract

/**
 * The MvcBackgroundMenu class is meant to allow for popup menus on the
 * background of components like DmdTreePanel and DmdGrid. In these cases,
 * objects displayed in the component are not selected, the menu is meant to
 * apply to tree/grid. This is useful for menus that have things like Add
 * Node or Add Row etc.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class MvcBackgroundMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    public MvcBackgroundMenuDMW() {
        super(new MvcBackgroundMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcBackgroundMenu);
    }

    public MvcBackgroundMenuDMW(DmcTypeModifierMV mods) {
        super(new MvcBackgroundMenuDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcBackgroundMenu);
    }

    public MvcBackgroundMenu getModificationRecorder(){
        MvcBackgroundMenu rc = new MvcBackgroundMenu();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MvcBackgroundMenuDMW(MvcBackgroundMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcBackgroundMenu);
    }

    public MvcBackgroundMenuDMO getDMO() {
        return((MvcBackgroundMenuDMO) core);
    }

    protected MvcBackgroundMenuDMW(MvcBackgroundMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:961)
    public StringName getObjectName(){
        return(((MvcBackgroundMenuDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcBackgroundMenuDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcBackgroundMenuDMW){
            return( getObjectName().equals( ((MvcBackgroundMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public StringName getName(){
        return(((MvcBackgroundMenuDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1145)
    public void setName(Object value) throws DmcValueException {
        ((MvcBackgroundMenuDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1154)
    public void setName(StringName value){
        ((MvcBackgroundMenuDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1180)
    public void remName(){
        ((MvcBackgroundMenuDMO) core).remName();
    }


}
