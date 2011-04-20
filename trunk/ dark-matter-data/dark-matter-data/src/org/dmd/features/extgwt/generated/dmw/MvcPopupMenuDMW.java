package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dmc.types.StringName;                                  // Primitive type
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcMenu;                      // Derived class
import org.dmd.features.extgwt.extended.MvcPopupMenu;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcPopupMenuDMO;         // Class not auxiliary or abstract

/**
 * The MvcPopupMenu class is meant to allow for the definition of menus that
 * can be popped up on a variety components, for instance tree nodes and
 * table rows. Although implemented as standard
 * com.extjs.gxt.ui.client.widget.menu.Menu instances, the display of popup
 * menus is controlled by the MenuController infrastructure.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcPopupMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    public MvcPopupMenuDMW() {
        super(new MvcPopupMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcPopupMenu);
    }

    public MvcPopupMenuDMW(DmcTypeModifierMV mods) {
        super(new MvcPopupMenuDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcPopupMenu);
    }

    public MvcPopupMenu getModificationRecorder(){
        MvcPopupMenu rc = new MvcPopupMenu();
        rc.setDmcObject(new MvcPopupMenuDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcPopupMenuDMW(MvcPopupMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcPopupMenu);
    }

    public MvcPopupMenuDMO getDMO() {
        return((MvcPopupMenuDMO) core);
    }

    protected MvcPopupMenuDMW(MvcPopupMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:875)
    public StringName getObjectName(){
        return(((MvcPopupMenuDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcPopupMenuDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcPopupMenuDMW){
            return( getObjectName().equals( ((MvcPopupMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public StringName getName(){
        return(((MvcPopupMenuDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setName(Object value) throws DmcValueException {
        ((MvcPopupMenuDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setName(StringName value){
        ((MvcPopupMenuDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remName(){
        ((MvcPopupMenuDMO) core).remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public String getUseForModelClass(){
        return(((MvcPopupMenuDMO) core).getUseForModelClass());
    }

    /**
     * Sets useForModelClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setUseForModelClass(Object value) throws DmcValueException {
        ((MvcPopupMenuDMO) core).setUseForModelClass(value);
    }

    /**
     * Sets useForModelClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setUseForModelClass(String value){
        ((MvcPopupMenuDMO) core).setUseForModelClass(value);
    }

    /**
     * Removes the useForModelClass attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remUseForModelClass(){
        ((MvcPopupMenuDMO) core).remUseForModelClass();
    }


}
