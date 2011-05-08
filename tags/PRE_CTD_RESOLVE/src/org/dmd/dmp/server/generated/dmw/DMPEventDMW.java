//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.ArrayList;                                         // To support getMVCopy()
import java.util.Iterator;                                          // To support getMVCopy()
import org.dmd.dmc.*;                                               // If any attributes
import org.dmd.dmc.DmcObject;                                       // Primitive type
import org.dmd.dmc.DmcObjectName;                                   // Alternative type for NameContainer values
import org.dmd.dmc.types.Modifier;                                  // For multi-valued containsModifier
import org.dmd.dmc.types.NameContainer;                             // Primitive type
import org.dmd.dmp.server.extended.DMPEvent;                        // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.DMPMessage;                      // Derived class
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;                // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;         // Primitive type
import org.dmd.dms.*;                                               // Always 2
import org.dmd.dms.generated.dmw.ModifierIterableDMW;               // For multi-valued Modifier
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor

/**
 * The Event class allows for the asynchronous notification of noteworthy
 * system events.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class DMPEventDMW extends DMPMessage {

    public DMPEventDMW() {
        super(new DMPEventDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
    }

    public DMPEventDMW(DmcTypeModifierMV mods) {
        super(new DMPEventDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
    }

    public DMPEvent getModificationRecorder(){
        DMPEvent rc = new DMPEvent();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public DMPEventDMW(DMPEventDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
    }

    public DMPEventDMO getDMO() {
        return((DMPEventDMO) core);
    }

    protected DMPEventDMW(DMPEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public NameContainer getSource(){
        return(((DMPEventDMO) core).getSource());
    }

    /**
     * Sets source to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSource(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setSource(value);
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSource(NameContainer value){
        ((DMPEventDMO) core).setSource(value);
    }

    /**
     * Sets source to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1121)
    public void setSource(DmcObjectName value){
        ((DMPEventDMO) core).setSource(value);
    }

    /**
     * Removes the source attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSource(){
        ((DMPEventDMO) core).remSource();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getSourceObjectClass(){
        return(((DMPEventDMO) core).getSourceObjectClass());
    }

    /**
     * Sets sourceObjectClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSourceObjectClass(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setSourceObjectClass(value);
    }

    /**
     * Sets sourceObjectClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSourceObjectClass(String value){
        ((DMPEventDMO) core).setSourceObjectClass(value);
    }

    /**
     * Removes the sourceObjectClass attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSourceObjectClass(){
        ((DMPEventDMO) core).remSourceObjectClass();
    }

    /**
     * @return The number of Modifier items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getModifySize(){
        DmcAttribute<?> attr = core.get(DMPEventDMO.__modify);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getModifyIsEmpty(){
        DmcAttribute<?> attr = core.get(DMPEventDMO.__modify);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getModifyHasValue(){
        DmcAttribute<?> attr = core.get(DMPEventDMO.__modify);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public ModifierIterableDMW getModifyIterable(){
        DmcAttribute<?> attr = core.get(DMPEventDMO.__modify);
        if (attr == null)
            return(ModifierIterableDMW.emptyList);
        
        return(new ModifierIterableDMW(((DMPEventDMO) core).getModify()));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addModify(Object value) throws DmcValueException {
        ((DMPEventDMO) core).addModify(value);
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addModify(Modifier value){
        ((DMPEventDMO) core).addModify(value);
    }

    /**
     * Returns true if the collection contains the modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1370)
    public boolean modifyContains(Modifier value){
        return(((DMPEventDMO) core).modifyContains(value));
    }

    /**
     * @return A COPY of the collection of Modifier objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1410)
    @SuppressWarnings("unchecked")
    public ArrayList<Modifier> getModifyCopy(){
        DmcAttribute<?> attr = core.get(DMPEventDMO.__modify);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1437)
    public void delModify(Object value) throws DmcValueException {
        ((DMPEventDMO) core).delModify(value);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1446)
    public void delModify(Modifier value){
        ((DMPEventDMO) core).delModify(value);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public void remModify(){
        ((DMPEventDMO) core).remModify();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public DmcObject getSourceObject(){
        return(((DMPEventDMO) core).getSourceObject());
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSourceObject(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setSourceObject(value);
    }

    /**
     * Sets sourceObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSourceObject(DmcObject value){
        ((DMPEventDMO) core).setSourceObject(value);
    }

    /**
     * Removes the sourceObject attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSourceObject(){
        ((DMPEventDMO) core).remSourceObject();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Integer getOriginatorID(){
        return(((DMPEventDMO) core).getOriginatorID());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setOriginatorID(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setOriginatorID(value);
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setOriginatorID(Integer value){
        ((DMPEventDMO) core).setOriginatorID(value);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remOriginatorID(){
        ((DMPEventDMO) core).remOriginatorID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Boolean isNotifyOriginator(){
        return(((DMPEventDMO) core).isNotifyOriginator());
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setNotifyOriginator(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setNotifyOriginator(value);
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setNotifyOriginator(Boolean value){
        ((DMPEventDMO) core).setNotifyOriginator(value);
    }

    /**
     * Removes the notifyOriginator attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remNotifyOriginator(){
        ((DMPEventDMO) core).remNotifyOriginator();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getSlice(){
        return(((DMPEventDMO) core).getSlice());
    }

    /**
     * Sets slice to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSlice(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setSlice(value);
    }

    /**
     * Sets slice to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSlice(String value){
        ((DMPEventDMO) core).setSlice(value);
    }

    /**
     * Removes the slice attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSlice(){
        ((DMPEventDMO) core).remSlice();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public DMPEventTypeEnum getEventTypeDMP(){
        return(((DMPEventDMO) core).getEventTypeDMP());
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value A value compatible with DmcTypeDMPEventTypeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setEventTypeDMP(Object value) throws DmcValueException {
        ((DMPEventDMO) core).setEventTypeDMP(value);
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value DMPEventTypeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setEventTypeDMP(DMPEventTypeEnum value){
        ((DMPEventDMO) core).setEventTypeDMP(value);
    }

    /**
     * Removes the eventTypeDMP attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remEventTypeDMP(){
        ((DMPEventDMO) core).remEventTypeDMP();
    }


}