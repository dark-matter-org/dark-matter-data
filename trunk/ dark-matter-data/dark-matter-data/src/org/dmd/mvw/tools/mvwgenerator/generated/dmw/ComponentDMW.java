package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.Iterator;                                                       // To support getMVCopy()
import java.util.TreeMap;                                                        // To support getMVCopy()
import org.dmd.dmc.*;                                                            // If any attributes
import org.dmd.dmc.types.CamelCaseName;                                          // Primitive type
import org.dmd.dms.*;                                                            // Always 2
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                        // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                    // Derived class
import org.dmd.mvw.tools.mvwgenerator.extended.MvwEvent;                         // Is reference type aux
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;                // Abstract class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwEventDMO;                 // For multi-valued containsMvwEvent
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MvwEventIterableDMW;         // For multi-valued MvwEvent
import org.dmd.mvw.tools.mvwgenerator.generated.types.MvwEventREF;               // To support getMVCopy() for REFs

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
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
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

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public CamelCaseName getObjectName(){
        return(((ComponentDMO) core).getCamelCaseName());
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
     * @return The number of MvwEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1510)
    public int getFiresEventSize(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvwEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1522)
    public boolean getFiresEventIsEmpty(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvwEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1534)
    public boolean getFiresEventHasValue(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed MvwEvent object if it's available and null otherwise.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1549)
    public MvwEvent getFiresEvent(Object key){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(null);
        
        return((MvwEvent)attr.getByKey(key));
    }

    /**
     * @return An Iterable of MvwEvent objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1573)
    public MvwEventIterableDMW getFiresEventIterable(){
        DmcAttribute attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(MvwEventIterableDMW.emptyList);
        
        Iterator<MvwEventREF> it = ((ComponentDMO) core).getFiresEvent();
        
        if (it == null)
            return(MvwEventIterableDMW.emptyList);
        
        return(new MvwEventIterableDMW(it));
    }

    /**
     * Adds another firesEvent value.
     * @param value MvwEventDMW
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1595)
    public DmcAttribute<?> addFiresEvent(MvwEvent value) {
        return(((ComponentDMO) core).addFiresEvent(value.getDMO()));
    }

    /**
     * Deletes a firesEvent value.
     * @param value The MvwEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1607)
    public void delFiresEvent(MvwEvent value){
        ((ComponentDMO) core).delFiresEvent(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvwEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1641)
    public TreeMap<CamelCaseName,MvwEvent> getFiresEventCopy(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__firesEvent);
        if (attr == null)
            return(new TreeMap<CamelCaseName,MvwEvent>());
        
        TreeMap<CamelCaseName,MvwEvent> rc = new TreeMap<CamelCaseName,MvwEvent>();
        
        MvwEventIterableDMW it = getFiresEventIterable();
        while(it.hasNext()){
            MvwEvent obj = it.next();
            rc.put((CamelCaseName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the firesEvent attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1778)
    public void remFiresEvent(){
        ((ComponentDMO) core).remFiresEvent();
    }

    /**
     * @return The number of MvwEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1510)
    public int getHandlesEventSize(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no MvwEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1522)
    public boolean getHandlesEventIsEmpty(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any MvwEventDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1534)
    public boolean getHandlesEventHasValue(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed MvwEvent object if it's available and null otherwise.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1549)
    public MvwEvent getHandlesEvent(Object key){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(null);
        
        return((MvwEvent)attr.getByKey(key));
    }

    /**
     * @return An Iterable of MvwEvent objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1573)
    public MvwEventIterableDMW getHandlesEventIterable(){
        DmcAttribute attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(MvwEventIterableDMW.emptyList);
        
        Iterator<MvwEventREF> it = ((ComponentDMO) core).getHandlesEvent();
        
        if (it == null)
            return(MvwEventIterableDMW.emptyList);
        
        return(new MvwEventIterableDMW(it));
    }

    /**
     * Adds another handlesEvent value.
     * @param value MvwEventDMW
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1595)
    public DmcAttribute<?> addHandlesEvent(MvwEvent value) {
        return(((ComponentDMO) core).addHandlesEvent(value.getDMO()));
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvwEvent to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1607)
    public void delHandlesEvent(MvwEvent value){
        ((ComponentDMO) core).delHandlesEvent(value.getDMO());
    }

    /**
     * @return A COPY of the collection of MvwEvent objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1641)
    public TreeMap<CamelCaseName,MvwEvent> getHandlesEventCopy(){
        DmcAttribute<?> attr = ((ComponentDMO) core).get(ComponentDMO.__handlesEvent);
        if (attr == null)
            return(new TreeMap<CamelCaseName,MvwEvent>());
        
        TreeMap<CamelCaseName,MvwEvent> rc = new TreeMap<CamelCaseName,MvwEvent>();
        
        MvwEventIterableDMW it = getHandlesEventIterable();
        while(it.hasNext()){
            MvwEvent obj = it.next();
            rc.put((CamelCaseName) obj.getObjectName(),obj);
        }
        return(rc);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMAPPED(DMWGenerator.java:1778)
    public void remHandlesEvent(){
        ((ComponentDMO) core).remHandlesEvent();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public CamelCaseName getCamelCaseName(){
        return(((ComponentDMO) core).getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setCamelCaseName(Object value) throws DmcValueException {
        ((ComponentDMO) core).setCamelCaseName(value);
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setCamelCaseName(CamelCaseName value){
        ((ComponentDMO) core).setCamelCaseName(value);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remCamelCaseName(){
        ((ComponentDMO) core).remCamelCaseName();
    }


}
