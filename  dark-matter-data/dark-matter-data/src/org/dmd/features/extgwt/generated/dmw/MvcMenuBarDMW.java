package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                               // If any attributes
import org.dmd.dmc.types.StringName;                                // Primitive type
import org.dmd.dms.*;                                               // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcMenu;                    // Derived class
import org.dmd.features.extgwt.extended.MvcMenuBar;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcMenuBarDMO;         // Class not auxiliary or abstract

/**
 * The MvcMenuBar class represents a toplevel menubar and aligns to the 
 * com.extjs.gxt.ui.client.widget.menu.MenuBar class.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcMenuBarDMW extends MvcMenu implements DmcNamedObjectIF {

    public MvcMenuBarDMW() {
        super(new MvcMenuBarDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuBar);
    }

    public MvcMenuBarDMW(DmcTypeModifierMV mods) {
        super(new MvcMenuBarDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuBar);
    }

    public MvcMenuBar getModificationRecorder(){
        MvcMenuBar rc = new MvcMenuBar();
        rc.setDmcObject(new MvcMenuBarDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcMenuBarDMW(MvcMenuBarDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMenuBar);
    }

    public MvcMenuBarDMO getDMO() {
        return((MvcMenuBarDMO) core);
    }

    protected MvcMenuBarDMW(MvcMenuBarDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:875)
    public StringName getObjectName(){
        return(((MvcMenuBarDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcMenuBarDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuBarDMW){
            return( getObjectName().equals( ((MvcMenuBarDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public StringName getName(){
        return(((MvcMenuBarDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setName(Object value) throws DmcValueException {
        ((MvcMenuBarDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setName(StringName value){
        ((MvcMenuBarDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remName(){
        ((MvcMenuBarDMO) core).remName();
    }


}
