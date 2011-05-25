package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.ArrayList;                                                   // To support getMVCopy()
import java.util.Iterator;                                                    // To support getMVCopy()
import java.util.TreeMap;                                                     // To support getMVCopy()
import org.dmd.dmc.*;                                                         // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                       // Primitive type
import org.dmd.dms.*;                                                         // Always 2
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                     // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.extended.Event;                         // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                 // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.View;                          // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;             // Abstract class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO;                 // For multi-valued containsEvent
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;                  // For multi-valued containsView
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.EventIterableDMW;         // For multi-valued Event
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ViewIterableDMW;          // For multi-valued View
import org.dmd.mvw.tools.mvwgenerator.generated.types.EventREF;               // To support getMVCopy() for REFs
import org.dmd.mvw.tools.mvwgenerator.generated.types.ViewREF;                // To support getMVCopy() for REFs

/**
 * The Component is an abstract base for classes that define the building
 * blocks of Applications. The primary feature of an Component is that it
 * fires and/or handles events. Beyond that, a component can be whatever you
 * require it to be. A variety of derived component types provide more
 * focussed behavioural units.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class ComponentDMW extends MvwDefinition implements DmcNamedObjectIF {

    protected ComponentDMW() {
        super();
    }

    abstract public Component getModificationRecorder();

    public ComponentDMO getDMO() {
        return((ComponentDMO) core);
    }

    protected ComponentDMW(ComponentDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public CamelCaseName getObjectName(){
        return(((ComponentDMO) core).getComponentName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ComponentDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ComponentDMW){
            return( getObjectName().equals( ((ComponentDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of EventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1510)
    public int getFiresEventSize(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no EventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1522)
    public boolean getFiresEventIsEmpty(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any EventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1534)
    public boolean getFiresEventHasValue(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed Event object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1549)
    public Event getFiresEvent(Object key){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(null);
        
        return((Event)attr.getByKey(key));
    }

    /**
     * @return An Iterable of Event objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1573)
    public EventIterableDMW getFiresEventIterable(){
        DmcAttribute attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(EventIterableDMW.emptyList);
        
        Iterator<EventREF> it = ((ComponentDMO) core).getFiresEvent();
        
        if (it == null)
            return(EventIterableDMW.emptyList);
        
        return(new EventIterableDMW(it));
    }

    /**
     * Adds another firesEvent value.
     * @param value EventDMW
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1595)
    public DmcAttribute<?> addFiresEvent(Event value) {
        return(((ComponentDMO) core).addFiresEvent(value.getDMO()));
    }

    /**
     * Deletes a firesEvent value.
     * @param value The Event to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1607)
    public void delFiresEvent(Event value){
        ((ComponentDMO) core).delFiresEvent(value.getDMO());
    }

    /**
     * @return A COPY of the collection of Event objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1641)
    public TreeMap<CamelCaseName,Event> getFiresEventCopy(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(new TreeMap<CamelCaseName,Event>());
        
        TreeMap<CamelCaseName,Event> rc = new TreeMap<CamelCaseName,Event>();
        
        EventIterableDMW it = getFiresEventIterable();
        while(it.hasNext()){
            Event obj = it.next();
            rc.put((CamelCaseName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the firesEvent attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1778)
    public void remFiresEvent(){
        ((ComponentDMO) core).remFiresEvent();
    }

    /**
     * @return The number of EventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1510)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no EventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1522)
    public boolean getHandlesEventIsEmpty(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any EventDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1534)
    public boolean getHandlesEventHasValue(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed Event object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1549)
    public Event getHandlesEvent(Object key){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(null);
        
        return((Event)attr.getByKey(key));
    }

    /**
     * @return An Iterable of Event objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1573)
    public EventIterableDMW getHandlesEventIterable(){
        DmcAttribute attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(EventIterableDMW.emptyList);
        
        Iterator<EventREF> it = ((ComponentDMO) core).getHandlesEvent();
        
        if (it == null)
            return(EventIterableDMW.emptyList);
        
        return(new EventIterableDMW(it));
    }

    /**
     * Adds another handlesEvent value.
     * @param value EventDMW
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1595)
    public DmcAttribute<?> addHandlesEvent(Event value) {
        return(((ComponentDMO) core).addHandlesEvent(value.getDMO()));
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The Event to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1607)
    public void delHandlesEvent(Event value){
        ((ComponentDMO) core).delHandlesEvent(value.getDMO());
    }

    /**
     * @return A COPY of the collection of Event objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1641)
    public TreeMap<CamelCaseName,Event> getHandlesEventCopy(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(new TreeMap<CamelCaseName,Event>());
        
        TreeMap<CamelCaseName,Event> rc = new TreeMap<CamelCaseName,Event>();
        
        EventIterableDMW it = getHandlesEventIterable();
        while(it.hasNext()){
            Event obj = it.next();
            rc.put((CamelCaseName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1778)
    public void remHandlesEvent(){
        ((ComponentDMO) core).remHandlesEvent();
    }

    /**
     * @return The number of View items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getManagesViewSize(){
        DmcAttribute<?> attr = core.get(ComponentDMO.__managesView);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ViewDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getManagesViewIsEmpty(){
        DmcAttribute<?> attr = core.get(ComponentDMO.__managesView);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ViewDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getManagesViewHasValue(){
        DmcAttribute<?> attr = core.get(ComponentDMO.__managesView);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of ViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public ViewIterableDMW getManagesViewIterable(){
        DmcAttribute attr = ((ComponentDMO) core).get(ComponentDMO.__managesView);
        if (attr == null)
            return(ViewIterableDMW.emptyList);
        
        return(new ViewIterableDMW(attr.getMV()));
    }

    /**
     * Adds another managesView value.
     * @param value A value compatible with View
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addManagesView(View value){
        DmcAttribute<?> attr = ((ComponentDMO) core).addManagesView(((ViewDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a managesView value.
     * @param value The View to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delManagesView(View value){
        ((ComponentDMO) core).delManagesView(value.getDMO());
    }

    /**
     * @return A COPY of the collection of View objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<View> getManagesViewCopy(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__managesView);
        if (attr == null)
            return(new ArrayList<View>());
        
        ArrayList<View> rc = new ArrayList<View>(attr.getMVSize());
        
        ViewIterableDMW it = getManagesViewIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the managesView attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remManagesView(){
        ((ComponentDMO) core).remManagesView();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public CamelCaseName getComponentName(){
        return(((ComponentDMO) core).getComponentName());
    }

    /**
     * Sets componentName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setComponentName(Object value) throws DmcValueException {
        ((ComponentDMO) core).setComponentName(value);
    }

    /**
     * Sets componentName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setComponentName(CamelCaseName value){
        ((ComponentDMO) core).setComponentName(value);
    }

    /**
     * Removes the componentName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remComponentName(){
        ((ComponentDMO) core).remComponentName();
    }


}
