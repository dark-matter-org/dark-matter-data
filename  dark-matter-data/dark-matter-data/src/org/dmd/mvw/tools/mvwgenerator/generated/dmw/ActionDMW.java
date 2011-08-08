package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:855)
import org.dmd.dmc.*;                                                       // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                     // Primitive type
import org.dmd.dms.*;                                                       // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                   // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;               // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Action;                // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionDMO;              // Class not auxiliary or abstract
import org.dmd.mvw.tools.mvwgenerator.generated.types.ComponentREF;         // To support getMVCopy() for REFs

/**
 * The Action class allows for the definition of an intermediate component
 * that binds behavioural triggers e.g. menu items, toolbar buttons etc. to
 * action implementors e.g. Controllers, Presenters and Activities. The
 * Action serves the same purpose as the com.google.gwt.user.client.Command
 * interface, but provides some additional useful functionality. The
 * implementation of the Action (see org.dmd.mvw.client.mvwmenus.base.Action)
 * maintains a set of TriggerIF interfaces, which are the various
 * implementations of the menu items, toolbar buttons etc. An implementing
 * component can enable/disable its Actions which, in turn, can
 * enable/disable its triggers.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:290)
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
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public ActionDMW(ActionDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Action);
    }

    public Action cloneIt() {
        Action rc = new Action();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ActionDMO getDMO() {
        return((ActionDMO) core);
    }

    protected ActionDMW(ActionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:882)
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

    /**
     * @return A Component object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:999)
    public Component getImplementedBy(){
        ComponentREF ref = ((ActionDMO) core).getImplementedBy();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Component)ref.getObject().getContainer());
    }

    /**
     * Sets the implementedBy to the specified value.
     * @param value A value compatible with ComponentREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1052)
    public void setImplementedBy(Component value) {
        ((ActionDMO) core).setImplementedBy(value.getDMO());
    }

    /**
     * Removes the implementedBy attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remImplementedBy(){
        ((ActionDMO) core).remImplementedBy();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public CamelCaseName getActionName(){
        return(((ActionDMO) core).getActionName());
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setActionName(Object value) throws DmcValueException {
        ((ActionDMO) core).setActionName(value);
    }

    /**
     * Sets actionName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setActionName(CamelCaseName value){
        ((ActionDMO) core).setActionName(value);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remActionName(){
        ((ActionDMO) core).remActionName();
    }


}
