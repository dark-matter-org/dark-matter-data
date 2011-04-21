package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:885)
import java.util.ArrayList;                                       // To support getMVCopy()
import java.util.Iterator;                                        // To support getMVCopy()
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmc.types.StringName;                              // Primitive type
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;               // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor
import org.dmd.features.extgwt.extended.MvcDefinition;            // Derived class
import org.dmd.features.extgwt.extended.MvcEvent;                 // Required for getModificationRecorder()
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;         // Class not auxiliary or abstract

/**
 * The MvcEvent class allows for the definition of events that are  handled
 * or emitted by Views and Controllers. By providing a description, you help
 * to document your application.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class MvcEventDMW extends MvcDefinition implements DmcNamedObjectIF {

    public MvcEventDMW() {
        super(new MvcEventDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcEvent);
    }

    public MvcEventDMW(DmcTypeModifierMV mods) {
        super(new MvcEventDMO(mods), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcEvent);
    }

    public MvcEvent getModificationRecorder(){
        MvcEvent rc = new MvcEvent();
        rc.setDmcObject(new MvcEventDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public MvcEventDMW(MvcEventDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcEvent);
    }

    public MvcEventDMO getDMO() {
        return((MvcEventDMO) core);
    }

    protected MvcEventDMW(MvcEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:913)
    public StringName getObjectName(){
        return(((MvcEventDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvcEventDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcEventDMW){
            return( getObjectName().equals( ((MvcEventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public String getDescription(){
        return(((MvcEventDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setDescription(Object value) throws DmcValueException {
        ((MvcEventDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setDescription(String value){
        ((MvcEventDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remDescription(){
        ((MvcEventDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public String getUserDataType(){
        return(((MvcEventDMO) core).getUserDataType());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setUserDataType(Object value) throws DmcValueException {
        ((MvcEventDMO) core).setUserDataType(value);
    }

    /**
     * Sets userDataType to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setUserDataType(String value){
        ((MvcEventDMO) core).setUserDataType(value);
    }

    /**
     * Removes the userDataType attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remUserDataType(){
        ((MvcEventDMO) core).remUserDataType();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public Boolean isIsHistoryEvent(){
        return(((MvcEventDMO) core).isIsHistoryEvent());
    }

    /**
     * Sets isHistoryEvent to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setIsHistoryEvent(Object value) throws DmcValueException {
        ((MvcEventDMO) core).setIsHistoryEvent(value);
    }

    /**
     * Sets isHistoryEvent to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setIsHistoryEvent(Boolean value){
        ((MvcEventDMO) core).setIsHistoryEvent(value);
    }

    /**
     * Removes the isHistoryEvent attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remIsHistoryEvent(){
        ((MvcEventDMO) core).remIsHistoryEvent();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public String getUserDataCollection(){
        return(((MvcEventDMO) core).getUserDataCollection());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setUserDataCollection(Object value) throws DmcValueException {
        ((MvcEventDMO) core).setUserDataCollection(value);
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setUserDataCollection(String value){
        ((MvcEventDMO) core).setUserDataCollection(value);
    }

    /**
     * Removes the userDataCollection attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remUserDataCollection(){
        ((MvcEventDMO) core).remUserDataCollection();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public String getUserDataGenericSpec(){
        return(((MvcEventDMO) core).getUserDataGenericSpec());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        ((MvcEventDMO) core).setUserDataGenericSpec(value);
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setUserDataGenericSpec(String value){
        ((MvcEventDMO) core).setUserDataGenericSpec(value);
    }

    /**
     * Removes the userDataGenericSpec attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remUserDataGenericSpec(){
        ((MvcEventDMO) core).remUserDataGenericSpec();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1184)
    public int getEmittedBySize(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__emittedBy);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1196)
    public boolean getEmittedByIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__emittedBy);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1208)
    public boolean getEmittedByHasValue(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__emittedBy);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1319)
    public StringIterableDMW getEmittedByIterable(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__emittedBy);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((MvcEventDMO) core).getEmittedBy()));
    }

    /**
     * Adds another emittedBy value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1335)
    public void addEmittedBy(Object value) throws DmcValueException {
        ((MvcEventDMO) core).addEmittedBy(value);
    }

    /**
     * Adds another emittedBy value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1344)
    public void addEmittedBy(String value){
        ((MvcEventDMO) core).addEmittedBy(value);
    }

    /**
     * Returns true if the collection contains the emittedBy value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1356)
    public boolean emittedByContains(String value){
        return(((MvcEventDMO) core).emittedByContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1384)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getEmittedByCopy(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__emittedBy);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a emittedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1411)
    public void delEmittedBy(Object value) throws DmcValueException {
        ((MvcEventDMO) core).delEmittedBy(value);
    }

    /**
     * Removes the emittedBy attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1423)
    public void remEmittedBy(){
        ((MvcEventDMO) core).remEmittedBy();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public String getUpperConstantName(){
        return(((MvcEventDMO) core).getUpperConstantName());
    }

    /**
     * Sets upperConstantName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setUpperConstantName(Object value) throws DmcValueException {
        ((MvcEventDMO) core).setUpperConstantName(value);
    }

    /**
     * Sets upperConstantName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setUpperConstantName(String value){
        ((MvcEventDMO) core).setUpperConstantName(value);
    }

    /**
     * Removes the upperConstantName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remUpperConstantName(){
        ((MvcEventDMO) core).remUpperConstantName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1050)
    public StringName getName(){
        return(((MvcEventDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1097)
    public void setName(Object value) throws DmcValueException {
        ((MvcEventDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1106)
    public void setName(StringName value){
        ((MvcEventDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1132)
    public void remName(){
        ((MvcEventDMO) core).remName();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1184)
    public int getDefinedBySize(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__definedBy);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1196)
    public boolean getDefinedByIsEmpty(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__definedBy);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1208)
    public boolean getDefinedByHasValue(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__definedBy);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1319)
    public StringIterableDMW getDefinedByIterable(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__definedBy);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((MvcEventDMO) core).getDefinedBy()));
    }

    /**
     * Adds another definedBy value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1335)
    public void addDefinedBy(Object value) throws DmcValueException {
        ((MvcEventDMO) core).addDefinedBy(value);
    }

    /**
     * Adds another definedBy value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1344)
    public void addDefinedBy(String value){
        ((MvcEventDMO) core).addDefinedBy(value);
    }

    /**
     * Returns true if the collection contains the definedBy value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1356)
    public boolean definedByContains(String value){
        return(((MvcEventDMO) core).definedByContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1384)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDefinedByCopy(){
        DmcAttribute<?> attr = core.get(MvcEventDMO.__definedBy);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a definedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1411)
    public void delDefinedBy(Object value) throws DmcValueException {
        ((MvcEventDMO) core).delDefinedBy(value);
    }

    /**
     * Removes the definedBy attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1423)
    public void remDefinedBy(){
        ((MvcEventDMO) core).remDefinedBy();
    }


}
