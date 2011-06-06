package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:922)
import java.util.Iterator;                                            // To support getMVCopy()
import java.util.TreeSet;                                             // To support getMVCopy()
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dmc.types.CamelCaseName;                               // Primitive type
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                   // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.extended.Event;                 // Required for getModificationRecorder()
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;         // Derived class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO;         // Class not auxiliary or abstract

/**
 * The specification of an Event definition will result in the creation of a
 * gwtEvent and its associated handler interface.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class EventDMW extends MvwDefinition implements DmcNamedObjectIF {

    public EventDMW() {
        super(new EventDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    public EventDMW(DmcTypeModifierMV mods) {
        super(new EventDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    public Event getModificationRecorder(){
        Event rc = new Event();
        rc.setEventName(getEventName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public EventDMW(EventDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    public EventDMO getDMO() {
        return((EventDMO) core);
    }

    protected EventDMW(EventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:950)
    public CamelCaseName getObjectName(){
        return(((EventDMO) core).getEventName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((EventDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof EventDMW){
            return( getObjectName().equals( ((EventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getArgVector(){
        return(((EventDMO) core).getArgVector());
    }

    /**
     * Sets argVector to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setArgVector(Object value) throws DmcValueException {
        ((EventDMO) core).setArgVector(value);
    }

    /**
     * Sets argVector to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setArgVector(String value){
        ((EventDMO) core).setArgVector(value);
    }

    /**
     * Removes the argVector attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remArgVector(){
        ((EventDMO) core).remArgVector();
    }

    /**
     * @return The number of String items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1221)
    public int getImportThisSize(){
        DmcAttribute<?> attr = core.get(EventDMO.__importThis);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1233)
    public boolean getImportThisIsEmpty(){
        DmcAttribute<?> attr = core.get(EventDMO.__importThis);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public boolean getImportThisHasValue(){
        DmcAttribute<?> attr = core.get(EventDMO.__importThis);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1357)
    public StringIterableDMW getImportThisIterable(){
        DmcAttribute<?> attr = core.get(EventDMO.__importThis);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((EventDMO) core).getImportThis()));
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1373)
    public void addImportThis(Object value) throws DmcValueException {
        ((EventDMO) core).addImportThis(value);
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1382)
    public void addImportThis(String value){
        ((EventDMO) core).addImportThis(value);
    }

    /**
     * Returns true if the collection contains the importThis value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1406)
    public boolean importThisContains(String value){
        return(((EventDMO) core).importThisContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getImportThisCopy(){
        DmcAttribute<?> attr = core.get(EventDMO.__importThis);
        if (attr == null)
            return(new TreeSet<String>());
        
        TreeSet<String> rc = new TreeSet<String>();
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1473)
    public void delImportThis(Object value) throws DmcValueException {
        ((EventDMO) core).delImportThis(value);
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1482)
    public void delImportThis(String value){
        ((EventDMO) core).delImportThis(value);
    }

    /**
     * Removes the importThis attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1494)
    public void remImportThis(){
        ((EventDMO) core).remImportThis();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public CamelCaseName getEventName(){
        return(((EventDMO) core).getEventName());
    }

    /**
     * Sets eventName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setEventName(Object value) throws DmcValueException {
        ((EventDMO) core).setEventName(value);
    }

    /**
     * Sets eventName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setEventName(CamelCaseName value){
        ((EventDMO) core).setEventName(value);
    }

    /**
     * Removes the eventName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remEventName(){
        ((EventDMO) core).remEventName();
    }


}
