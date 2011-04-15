package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:842)
import java.util.ArrayList;                                               // To support getMVCopy()
import java.util.Iterator;                                                // To support getMVCopy()
import org.dmd.dmc.*;                                                     // If any attributes
import org.dmd.dmc.types.StringName;                                      // Primitive type
import org.dmd.dms.*;                                                     // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcAction;                        // Required for getModificationRecorder()
import org.dmd.features.extgwt.extended.MvcController;                    // Is reference type aux
import org.dmd.features.extgwt.extended.MvcDefinition;                    // Derived class
import org.dmd.features.extgwt.extended.MvcEvent;                         // Is reference type aux
import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;                // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;                 // For multi-valued containsMvcEvent
import org.dmd.features.extgwt.generated.dmw.MvcEventIterableDMW;         // For multi-valued MvcEvent
import org.dmd.features.extgwt.generated.types.MvcControllerREF;          // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcEventREF;               // To support getMVCopy() for REFs

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
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcActionDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcActionDMO mycore;

    public MvcActionDMW() {
        super(new MvcActionDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcAction);
        mycore = (MvcActionDMO) core;
        mycore.setContainer(this);
    }

    public MvcActionDMW(DmcTypeModifierMV mods) {
        super(new MvcActionDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcAction);
        mycore = (MvcActionDMO) core;
        mycore.setContainer(this);
    }

    public MvcAction getModificationRecorder(){
        MvcAction rc = new MvcAction();
        rc.setDmcObject(new MvcActionDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
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

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:868)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1114)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = mycore.get(MvcActionDMO.__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1126)
    public boolean getHandlesEventIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcActionDMO.__handlesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1138)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1157)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1173)
    public DmcAttribute<?> addHandlesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addHandlesEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1186)
    public void delHandlesEvent(MvcEvent value) throws DmcValueException {
        mycore.delHandlesEvent(value);
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1221)
    public ArrayList<MvcEvent> getHandlesEventCopy(){
        DmcAttribute<?> attr = mycore.get(MvcActionDMO.__handlesEvent);
        if (attr == null)
            return(new ArrayList<MvcEvent>());
        
        ArrayList<MvcEvent> rc = new ArrayList<MvcEvent>(attr.getMVSize());
        
        MvcEventIterableDMW it = getHandlesEventIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1353)
    public void remHandlesEvent(){
        mycore.remHandlesEvent();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:993)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1040)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1049)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return A MvcController object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:972)
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
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1017)
    public void setAssociatedController(MvcController value) {
        mycore.setAssociatedController(value.getDMO());
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void remAssociatedController(){
        mycore.remAssociatedController();
    }


}
