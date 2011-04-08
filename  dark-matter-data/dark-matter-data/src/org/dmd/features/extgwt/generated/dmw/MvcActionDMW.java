package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:751)
import org.dmd.dmc.*;                                                     // If any attributes
import org.dmd.dmc.types.StringName;                                      // Primitive type
import org.dmd.dms.*;                                                     // Always 2
import org.dmd.features.extgwt.extended.MvcController;                    // Is reference type aux
import org.dmd.features.extgwt.extended.MvcDefinition;                    // Derived class
import org.dmd.features.extgwt.extended.MvcEvent;                         // Is reference type aux
import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;                // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;                 // For multi-valued containsMvcEvent
import org.dmd.features.extgwt.generated.dmw.MvcEventIterableDMW;         // For multi-valued MvcEvent
import org.dmd.features.extgwt.generated.types.MvcControllerREF;          // Is reference type REF

/**
 * The MvcAction class allows for the definition of behaviour that can be
 * associated with menus, buttons and other UI components. Actions are
 * associated with controllers so that they can be informed of events in
 * which they're interested, since only controllers can register for events.
 * Actions may be defined and used by  menu items defined in other
 * Controllers.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:339)
 */
abstract public class MvcActionDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcActionDMO mycore;

    public MvcActionDMW() {
        super(new MvcActionDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcAction);
        mycore = (MvcActionDMO) core;
        mycore.setContainer(this);
    }

    public MvcActionDMW(MvcActionDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcAction);
        mycore = (MvcActionDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcActionDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public MvcActionDMO getDMO() {
        return(mycore);
    }

    protected MvcActionDMW(MvcActionDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcActionDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:777)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcActionDMW){
            return( getObjectName().equals( ((MvcActionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1002)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = mycore.get(MvcActionDMO.__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1014)
    public boolean getHandlesEventIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcActionDMO.__handlesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1026)
    public boolean getHandlesEventHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcActionDMO.__handlesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1045)
    public MvcEventIterableDMW getHandlesEventIterable(){
        DmcAttribute attr = mycore.get(MvcActionDMO.__handlesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1061)
    public DmcAttribute<?> addHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addHandlesEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1075)
    public void delHandlesEvent(MvcEvent value) throws DmcValueException {
        mycore.delHandlesEvent(value);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1150)
    public void remHandlesEvent(){
        mycore.remHandlesEvent();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:881)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:928)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:937)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:952)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcController object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:861)
    public MvcController getAssociatedController(){
        MvcControllerREF ref = mycore.getAssociatedController();
        if (ref == null)
            return(null);
        
        return((MvcController)ref.getObject().getContainer());
    }

    /**
     * Sets the associatedController to the specified value.
     * @param value A value compatible with MvcControllerREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:905)
    public void setAssociatedController(MvcController value) {
        mycore.setAssociatedController(value.getDMO());
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:952)
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }


}
