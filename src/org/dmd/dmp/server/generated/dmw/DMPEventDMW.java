package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                         // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import java.util.Iterator;                                          // Support copy of MV objects - (BaseDMWGenerator.java:2159)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.DmcObject;                                       // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmc.DmcObjectName;                                   // Alternative type for NameContainer values - (BaseDMWGenerator.java:1077)
import org.dmd.dmc.types.Modifier;                                  // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmc.types.NameContainer;                             // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmp.server.extended.DMPEvent;                        // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.dmp.server.extended.DMPMessage;                      // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;                // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;         // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Attribute modify from the meta schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.generated.dmw.ModifierIterableDMW;               // For multi-valued Modifier - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.types.ClassDefinitionREF;              // Is reference type REF - (BaseDMWGenerator.java:1034)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (BaseDMWGenerator.java:994)



/**
 * The Event class allows for the asynchronous notification of noteworthy
 * system events.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class DMPEventDMW extends DMPMessage {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public DMPEventDMW() {
        super(new DMPEventDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public DMPEventDMW(DmcTypeModifierMV mods) {
        super(new DMPEventDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:509)
    public DMPEvent getModificationRecorder(){
        DMPEvent rc = new DMPEvent();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public DMPEventDMW(DMPEventDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
    }

    public DMPEvent cloneIt() {
        DMPEvent rc = new DMPEvent();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public DMPEventDMO getDMO() {
        return((DMPEventDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected DMPEventDMW(DMPEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public DMPEventTypeEnum getEventTypeDMP(){
        return(((DMPEventDMO) core).getEventTypeDMP());
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value A value compatible with DmcTypeDMPEventTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setEventTypeDMP(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setEventTypeDMP(value);
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value DMPEventTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setEventTypeDMP(DMPEventTypeEnum value){
        ((DMPEventDMO) core).setEventTypeDMP(value);
    }

    /**
     * Removes the eventTypeDMP attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remEventTypeDMP(){
        ((DMPEventDMO) core).remEventTypeDMP();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Integer getHandlerID(){
        return(((DMPEventDMO) core).getHandlerID());
    }

    /**
     * Sets handlerID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setHandlerID(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setHandlerID(value);
    }

    /**
     * Sets handlerID to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setHandlerID(Integer value){
        ((DMPEventDMO) core).setHandlerID(value);
    }

    /**
     * Removes the handlerID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remHandlerID(){
        ((DMPEventDMO) core).remHandlerID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Long getListenerID(){
        return(((DMPEventDMO) core).getListenerID());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setListenerID(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setListenerID(value);
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setListenerID(Long value){
        ((DMPEventDMO) core).setListenerID(value);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remListenerID(){
        ((DMPEventDMO) core).remListenerID();
    }

    /**
     * @return The number of Modifier items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getModifySize(){
        return(((DMPEventDMO) core).getModifySize());
    }

    /**
     * @return true if there are no ModifierDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getModifyIsEmpty(){
        if (((DMPEventDMO) core).getModifySize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ModifierDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getModifyHasValue(){
        if (((DMPEventDMO) core).getModifySize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public ModifierIterableDMW getModifyIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__modify);
        if (attr == null)
            return(ModifierIterableDMW.emptyList);
        
        return(new ModifierIterableDMW(((DMPEventDMO) core).getModify()));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addModify(Object value) throws DmcValueException {
        ((DMPEventDMO) core).addModify(value);
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addModify(Modifier value){
        ((DMPEventDMO) core).addModify(value);
    }

    /**
     * Returns true if the collection contains the modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean modifyContains(Modifier value){
        return(((DMPEventDMO) core).modifyContains(value));
    }

    /**
     * @return A COPY of the collection of Modifier objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    @SuppressWarnings("unchecked")
    public ArrayList<Modifier> getModifyCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__modify);
        if (attr == null)
            return(new ArrayList<Modifier>());
        
        ArrayList<Modifier> rc = new ArrayList<Modifier>(attr.getMVSize());
        
        Iterator<Modifier> it = (Iterator<Modifier>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delModify(Object value) throws DmcValueException {
        ((DMPEventDMO) core).delModify(value);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delModify(Modifier value){
        ((DMPEventDMO) core).delModify(value);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remModify(){
        ((DMPEventDMO) core).remModify();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Boolean isMyOwnEvent(){
        return(((DMPEventDMO) core).isMyOwnEvent());
    }

    /**
     * Sets myOwnEvent to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setMyOwnEvent(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setMyOwnEvent(value);
    }

    /**
     * Sets myOwnEvent to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setMyOwnEvent(Boolean value){
        ((DMPEventDMO) core).setMyOwnEvent(value);
    }

    /**
     * Removes the myOwnEvent attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remMyOwnEvent(){
        ((DMPEventDMO) core).remMyOwnEvent();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Boolean isNotifyOriginator(){
        return(((DMPEventDMO) core).isNotifyOriginator());
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setNotifyOriginator(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setNotifyOriginator(value);
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setNotifyOriginator(Boolean value){
        ((DMPEventDMO) core).setNotifyOriginator(value);
    }

    /**
     * Removes the notifyOriginator attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remNotifyOriginator(){
        ((DMPEventDMO) core).remNotifyOriginator();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Integer getOriginatorID(){
        return(((DMPEventDMO) core).getOriginatorID());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setOriginatorID(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setOriginatorID(value);
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setOriginatorID(Integer value){
        ((DMPEventDMO) core).setOriginatorID(value);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remOriginatorID(){
        ((DMPEventDMO) core).remOriginatorID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getSlice(){
        return(((DMPEventDMO) core).getSlice());
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setSlice(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setSlice(value);
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setSlice(String value){
        ((DMPEventDMO) core).setSlice(value);
    }

    /**
     * Removes the slice attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remSlice(){
        ((DMPEventDMO) core).remSlice();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public NameContainer getSource(){
        return(((DMPEventDMO) core).getSource());
    }

    /**
     * Sets source to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setSource(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setSource(value);
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setSource(NameContainer value){
        ((DMPEventDMO) core).setSource(value);
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1526)
    public void setSource(DmcObjectName value){
        ((DMPEventDMO) core).setSource(value);
    }

    /**
     * Removes the source attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remSource(){
        ((DMPEventDMO) core).remSource();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public DmcObject getSourceObject(){
        return(((DMPEventDMO) core).getSourceObject());
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setSourceObject(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setSourceObject(value);
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setSourceObject(DmcObject value){
        ((DMPEventDMO) core).setSourceObject(value);
    }

    /**
     * Removes the sourceObject attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remSourceObject(){
        ((DMPEventDMO) core).remSourceObject();
    }

    /**
     * @return A ClassDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1353)
    public ClassDefinition getSourceObjectClass(){
        ClassDefinitionREF ref = ((DMPEventDMO) core).getSourceObjectClass();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ClassDefinition)ref.getObject().getContainer());
    }

    /**
     * Sets the sourceObjectClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1438)
    public void setSourceObjectClass(ClassDefinition value) {
        ((DMPEventDMO) core).setSourceObjectClass(value.getDMO());
    }

    /**
     * Sets the sourceObjectClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1447)
    public void setSourceObjectClass(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setSourceObjectClass(value);
    }

    /**
     * Removes the sourceObjectClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remSourceObjectClass(){
        ((DMPEventDMO) core).remSourceObjectClass();
    }


}
