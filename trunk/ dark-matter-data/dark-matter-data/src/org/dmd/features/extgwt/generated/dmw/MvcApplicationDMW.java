package org.dmd.features.extgwt.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:835)
import java.util.ArrayList;                                                    // To support getMVCopy()
import java.util.Iterator;                                                     // To support getMVCopy()
import org.dmd.dmc.*;                                                          // If any attributes
import org.dmd.dmc.types.StringName;                                           // Primitive type
import org.dmd.dms.*;                                                          // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                          // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcApplication;                        // Required for getModificationRecorder()
import org.dmd.features.extgwt.extended.MvcController;                         // Is reference type aux
import org.dmd.features.extgwt.extended.MvcDefinition;                         // Derived class
import org.dmd.features.extgwt.extended.MvcEvent;                              // Is reference type aux
import org.dmd.features.extgwt.generated.dmo.MvcApplicationDMO;                // Class not auxiliary or abstract
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;                 // For multi-valued containsMvcController
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;                      // For multi-valued containsMvcEvent
import org.dmd.features.extgwt.generated.dmw.MvcControllerIterableDMW;         // For multi-valued MvcController
import org.dmd.features.extgwt.generated.dmw.MvcEventIterableDMW;              // For multi-valued MvcEvent
import org.dmd.features.extgwt.generated.types.MvcControllerREF;               // To support getMVCopy() for REFs
import org.dmd.features.extgwt.generated.types.MvcEventREF;                    // To support getMVCopy() for REFs

/**
 * The MvcApplication class allows for the definition of an application that
 * makes uses of the ExtGWT MVC framework.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class MvcApplicationDMW extends MvcDefinition implements DmcNamedObjectIF {

    private MvcApplicationDMO mycore;

    public MvcApplicationDMW() {
        super(new MvcApplicationDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcApplication);
        mycore = (MvcApplicationDMO) core;
        mycore.setContainer(this);
    }

    public MvcApplicationDMW(DmcTypeModifierMV mods) {
        super(new MvcApplicationDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcApplication);
        mycore = (MvcApplicationDMO) core;
        mycore.setContainer(this);
    }

    public MvcApplicationDMW getModificationRecorder(){
        MvcApplicationDMW rc = new MvcApplication();
        rc.setDmcObject(new MvcApplicationDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcApplicationDMW(MvcApplicationDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcApplication);
        mycore = (MvcApplicationDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcApplicationDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public MvcApplicationDMO getDMO() {
        return(mycore);
    }

    protected MvcApplicationDMW(MvcApplicationDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcApplicationDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:861)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcApplicationDMW){
            return( getObjectName().equals( ((MvcApplicationDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1107)
    public int getDefinesEventSize(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1119)
    public boolean getDefinesEventIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1131)
    public boolean getDefinesEventHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1150)
    public MvcEventIterableDMW getDefinesEventIterable(){
        DmcAttribute attr = mycore.get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesEvent value.
     * @param value A value compatible with MvcEvent
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1166)
    public DmcAttribute<?> addDefinesEvent(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDefinesEvent(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a definesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1179)
    public void delDefinesEvent(MvcEvent value) throws DmcValueException {
        mycore.delDefinesEvent(value);
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1214)
    public ArrayList<MvcEvent> getDefinesEventCopy(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(new ArrayList<MvcEvent>());
        
        ArrayList<MvcEvent> rc = new ArrayList<MvcEvent>(attr.getMVSize());
        
        MvcEventIterableDMW it = getDefinesEventIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the definesEvent attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void remDefinesEvent(){
        mycore.remDefinesEvent();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remName(){
        mycore.remName();
    }

    /**
     * @return The number of MvcControllerDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1107)
    public int getControllersSize(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcControllerDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1119)
    public boolean getControllersIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcControllerDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1131)
    public boolean getControllersHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcControllerDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1150)
    public MvcControllerIterableDMW getControllersIterable(){
        DmcAttribute attr = mycore.get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(MvcControllerIterableDMW.emptyList);
        
        return(new MvcControllerIterableDMW(attr.getMV()));
    }

    /**
     * Adds another controllers value.
     * @param value A value compatible with MvcController
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1166)
    public DmcAttribute<?> addControllers(MvcController value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addControllers(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a controllers value.
     * @param value The MvcController to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1179)
    public void delControllers(MvcController value) throws DmcValueException {
        mycore.delControllers(value);
    }

    /**
     * @return A COPY of the collection of MvcController objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1214)
    public ArrayList<MvcController> getControllersCopy(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(new ArrayList<MvcController>());
        
        ArrayList<MvcController> rc = new ArrayList<MvcController>(attr.getMVSize());
        
        MvcControllerIterableDMW it = getControllersIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the controllers attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void remControllers(){
        mycore.remControllers();
    }

    /**
     * @return The number of MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1107)
    public int getStartEventsSize(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1119)
    public boolean getStartEventsIsEmpty(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1131)
    public boolean getStartEventsHasValue(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1150)
    public MvcEventIterableDMW getStartEventsIterable(){
        DmcAttribute attr = mycore.get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another startEvents value.
     * @param value A value compatible with MvcEvent
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1166)
    public DmcAttribute<?> addStartEvents(MvcEvent value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addStartEvents(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a startEvents value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1179)
    public void delStartEvents(MvcEvent value) throws DmcValueException {
        mycore.delStartEvents(value);
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1214)
    public ArrayList<MvcEvent> getStartEventsCopy(){
        DmcAttribute<?> attr = mycore.get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(new ArrayList<MvcEvent>());
        
        ArrayList<MvcEvent> rc = new ArrayList<MvcEvent>(attr.getMVSize());
        
        MvcEventIterableDMW it = getStartEventsIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the startEvents attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void remStartEvents(){
        mycore.remStartEvents();
    }


}
