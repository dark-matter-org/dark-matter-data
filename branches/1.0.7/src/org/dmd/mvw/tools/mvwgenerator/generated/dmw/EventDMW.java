package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.Iterator;                                            // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2099)
import java.util.TreeSet;                                             // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1077)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmc.types.CamelCaseName;                               // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.*;                                                 // Always 2 - (BaseDMWGeneratorNewest.java:939)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.dmw.StringIterableDMW;                   // For multi-valued String - (BaseDMWGeneratorNewest.java:1964)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.mvw.tools.mvwgenerator.extended.Event;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:947)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;         // Derived class - (BaseDMWGeneratorNewest.java:1115)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;         // Attribute importThis from the mvw schema - (BaseDMWGeneratorNewest.java:771)


/**
 * The specification of an Event definition will result in the creation of a
 * gwtEvent and its associated handler interface.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class EventDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public EventDMW() {
        super(new EventDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public EventDMW(DmcTypeModifierMV mods) {
        super(new EventDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:495)
    public Event getModificationRecorder(){
        Event rc = new Event();
        rc.setEventName(getEventName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public EventDMW(EventDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    public Event cloneIt() {
        Event rc = new Event();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public EventDMO getDMO() {
        return((EventDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected EventDMW(EventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1164)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public String getArgVector(){
        return(((EventDMO) core).getArgVector());
    }

    /**
     * Sets argVector to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setArgVector(Object value) throws DmcValueException {
        ((EventDMO) core).setArgVector(value);
    }

    /**
     * Sets argVector to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setArgVector(String value){
        ((EventDMO) core).setArgVector(value);
    }

    /**
     * Removes the argVector attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remArgVector(){
        ((EventDMO) core).remArgVector();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public CamelCaseName getEventName(){
        return(((EventDMO) core).getEventName());
    }

    /**
     * Sets eventName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setEventName(Object value) throws DmcValueException {
        ((EventDMO) core).setEventName(value);
    }

    /**
     * Sets eventName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setEventName(CamelCaseName value){
        ((EventDMO) core).setEventName(value);
    }

    /**
     * Removes the eventName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remEventName(){
        ((EventDMO) core).remEventName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public Boolean isFiredInThisModule(){
        return(((EventDMO) core).isFiredInThisModule());
    }

    /**
     * Sets firedInThisModule to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setFiredInThisModule(Object value) throws DmcValueException {
        ((EventDMO) core).setFiredInThisModule(value);
    }

    /**
     * Sets firedInThisModule to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setFiredInThisModule(Boolean value){
        ((EventDMO) core).setFiredInThisModule(value);
    }

    /**
     * Removes the firedInThisModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remFiredInThisModule(){
        ((EventDMO) core).remFiredInThisModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getImportThisSize(){
        return(((EventDMO) core).getImportThisSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getImportThisIsEmpty(){
        if (((EventDMO) core).getImportThisSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getImportThisHasValue(){
        if (((EventDMO) core).getImportThisSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1968)
    public StringIterableDMW getImportThisIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__importThis);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((EventDMO) core).getImportThis()));
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1994)
    public void addImportThis(Object value) throws DmcValueException {
        ((EventDMO) core).addImportThis(value);
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2004)
    public void addImportThis(String value){
        ((EventDMO) core).addImportThis(value);
    }

    /**
     * Returns true if the collection contains the importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2061)
    public boolean importThisContains(String value){
        return(((EventDMO) core).importThisContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2103)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getImportThisCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__importThis);
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2130)
    public void delImportThis(Object value) throws DmcValueException {
        ((EventDMO) core).delImportThis(value);
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2139)
    public void delImportThis(String value){
        ((EventDMO) core).delImportThis(value);
    }

    /**
     * Removes the importThis attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remImportThis(){
        ((EventDMO) core).remImportThis();
    }


}