package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
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
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class MvcApplicationDMW extends MvcDefinition implements DmcNamedObjectIF {

    public MvcApplicationDMW() {
        super(new MvcApplicationDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcApplication);
    }

    public MvcApplicationDMW(DmcTypeModifierMV mods) {
        super(new MvcApplicationDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcApplication);
    }

    public MvcApplication getModificationRecorder(){
        MvcApplication rc = new MvcApplication();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public MvcApplicationDMW(MvcApplicationDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcApplication);
    }

    public MvcApplicationDMO getDMO() {
        return((MvcApplicationDMO) core);
    }

    protected MvcApplicationDMW(MvcApplicationDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:953)
    public StringName getObjectName(){
        return(((MvcApplicationDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcApplicationDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcApplicationDMW){
            return( getObjectName().equals( ((MvcApplicationDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of MvcEvent items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1224)
    public int getStartEventsSize(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1236)
    public boolean getStartEventsIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getStartEventsHasValue(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1268)
    public MvcEventIterableDMW getStartEventsIterable(){
        DmcAttribute attr = ((MvcApplicationDMO) core).get(MvcApplicationDMO.__startEvents);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another startEvents value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1284)
    public DmcAttribute<?> addStartEvents(MvcEvent value){
        DmcAttribute<?> attr = ((MvcApplicationDMO) core).addStartEvents(((MvcEventDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a startEvents value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public void delStartEvents(MvcEvent value){
        ((MvcApplicationDMO) core).delStartEvents(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1332)
    public ArrayList<MvcEvent> getStartEventsCopy(){
        DmcAttribute<?> attr = ((MvcApplicationDMO) core).get(MvcApplicationDMO.__startEvents);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1497)
    public void remStartEvents(){
        ((MvcApplicationDMO) core).remStartEvents();
    }

    /**
     * @return The number of MvcEvent items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1224)
    public int getDefinesEventSize(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1236)
    public boolean getDefinesEventIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcEventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getDefinesEventHasValue(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1268)
    public MvcEventIterableDMW getDefinesEventIterable(){
        DmcAttribute attr = ((MvcApplicationDMO) core).get(MvcApplicationDMO.__definesEvent);
        if (attr == null)
            return(MvcEventIterableDMW.emptyList);
        
        return(new MvcEventIterableDMW(attr.getMV()));
    }

    /**
     * Adds another definesEvent value.
     * @param value A value compatible with MvcEvent
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1284)
    public DmcAttribute<?> addDefinesEvent(MvcEvent value){
        DmcAttribute<?> attr = ((MvcApplicationDMO) core).addDefinesEvent(((MvcEventDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a definesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public void delDefinesEvent(MvcEvent value){
        ((MvcApplicationDMO) core).delDefinesEvent(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcEvent objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1332)
    public ArrayList<MvcEvent> getDefinesEventCopy(){
        DmcAttribute<?> attr = ((MvcApplicationDMO) core).get(MvcApplicationDMO.__definesEvent);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1497)
    public void remDefinesEvent(){
        ((MvcApplicationDMO) core).remDefinesEvent();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public StringName getName(){
        return(((MvcApplicationDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setName(Object value) throws DmcValueException {
        ((MvcApplicationDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setName(StringName value){
        ((MvcApplicationDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remName(){
        ((MvcApplicationDMO) core).remName();
    }

    /**
     * @return The number of MvcController items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1224)
    public int getControllersSize(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvcControllerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1236)
    public boolean getControllersIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvcControllerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getControllersHasValue(){
        DmcAttribute<?> attr = core.get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of MvcControllerDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1268)
    public MvcControllerIterableDMW getControllersIterable(){
        DmcAttribute attr = ((MvcApplicationDMO) core).get(MvcApplicationDMO.__controllers);
        if (attr == null)
            return(MvcControllerIterableDMW.emptyList);
        
        return(new MvcControllerIterableDMW(attr.getMV()));
    }

    /**
     * Adds another controllers value.
     * @param value A value compatible with MvcController
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1284)
    public DmcAttribute<?> addControllers(MvcController value){
        DmcAttribute<?> attr = ((MvcApplicationDMO) core).addControllers(((MvcControllerDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a controllers value.
     * @param value The MvcController to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public void delControllers(MvcController value){
        ((MvcApplicationDMO) core).delControllers(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvcController objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1332)
    public ArrayList<MvcController> getControllersCopy(){
        DmcAttribute<?> attr = ((MvcApplicationDMO) core).get(MvcApplicationDMO.__controllers);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1497)
    public void remControllers(){
        ((MvcApplicationDMO) core).remControllers();
    }


}
