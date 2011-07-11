package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import org.dmd.dmc.*;                                                  // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                // Primitive type
import org.dmd.dms.*;                                                  // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;          // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Action;           // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionDMO;         // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;          // Attribute from mvw schema

/**
 * null
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class ActionDMW extends MvwDefinition implements DmcNamedObjectIF {

    public ActionDMW() {
        super(new ActionDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Action);
    }

    public ActionDMW(DmcTypeModifierMV mods) {
        super(new ActionDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Action);
    }

    public Action getModificationRecorder(){
        Action rc = new Action();
        rc.setActionName(getActionName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public ActionDMW(ActionDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Action);
    }

    public ActionDMO getDMO() {
        return((ActionDMO) core);
    }

    protected ActionDMW(ActionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:961)
    public CamelCaseName getObjectName(){
        return(((ActionDMO) core).getActionName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ActionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ActionDMW){
            return( getObjectName().equals( ((ActionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public CamelCaseName getActionName(){
        return(((ActionDMO) core).getActionName());
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setActionName(Object value) throws DmcValueException {
        ((ActionDMO) core).setActionName(value);
    }

    /**
     * Sets actionName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setActionName(CamelCaseName value){
        ((ActionDMO) core).setActionName(value);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remActionName(){
        ((ActionDMO) core).remActionName();
    }


}
