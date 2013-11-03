package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                                         // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmc.types.CamelCaseName;                                       // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.*;                                                         // Always 2 - (BaseDMWGeneratorNewest.java:939)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                     // Is reference type - (BaseDMWGeneratorNewest.java:974)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                 // Derived class - (BaseDMWGeneratorNewest.java:1115)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.ActionBinding;           // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:947)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionBindingDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ComponentREF;           // Is reference type REF - (BaseDMWGeneratorNewest.java:982)


/**
 * The ActionBinding class allows for the definition of an intermediate
 * component that binds behavioural triggers e.g. menu items, toolbar buttons
 * etc. to action implementors e.g. Controllers, Presenters and Activities.
 * The ActionBinding serves the same purpose as the
 * com.google.gwt.user.client.Command interface, but provides some additional
 * useful functionality. The implementation of the ActionBinding (see
 * org.dmd.mvw.client.mvwmenus.base.ActionBinding) maintains a set of
 * TriggerIF interfaces, which are the various implementations of the menu
 * items, toolbar buttons etc. An implementing component can enable/disable
 * its Actions which, in turn, can enable/disable its triggers.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class ActionBindingDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public ActionBindingDMW() {
        super(new ActionBindingDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._ActionBinding);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public ActionBindingDMW(DmcTypeModifierMV mods) {
        super(new ActionBindingDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._ActionBinding);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:495)
    public ActionBinding getModificationRecorder(){
        ActionBinding rc = new ActionBinding();
        rc.setActionBindingName(getActionBindingName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public ActionBindingDMW(ActionBindingDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._ActionBinding);
    }

    public ActionBinding cloneIt() {
        ActionBinding rc = new ActionBinding();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ActionBindingDMO getDMO() {
        return((ActionBindingDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected ActionBindingDMW(ActionBindingDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1164)
    public CamelCaseName getObjectName(){
        return(((ActionBindingDMO) core).getActionBindingName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ActionBindingDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ActionBindingDMW){
            return( getObjectName().equals( ((ActionBindingDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public CamelCaseName getActionBindingName(){
        return(((ActionBindingDMO) core).getActionBindingName());
    }

    /**
     * Sets actionBindingName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setActionBindingName(Object value) throws DmcValueException {
        ((ActionBindingDMO) core).setActionBindingName(value);
    }

    /**
     * Sets actionBindingName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setActionBindingName(CamelCaseName value){
        ((ActionBindingDMO) core).setActionBindingName(value);
    }

    /**
     * Removes the actionBindingName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remActionBindingName(){
        ((ActionBindingDMO) core).remActionBindingName();
    }

    /**
     * @return A Component object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1297)
    public Component getImplementedBy(){
        ComponentREF ref = ((ActionBindingDMO) core).getImplementedBy();
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1382)
    public void setImplementedBy(Component value) {
        ((ActionBindingDMO) core).setImplementedBy(value.getDMO());
    }

    /**
     * Sets the implementedBy to the specified value.
     * @param value A value compatible with ComponentREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1391)
    public void setImplementedBy(Object value) throws DmcValueException {
        ((ActionBindingDMO) core).setImplementedBy(value);
    }

    /**
     * Removes the implementedBy attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remImplementedBy(){
        ((ActionBindingDMO) core).remImplementedBy();
    }


}