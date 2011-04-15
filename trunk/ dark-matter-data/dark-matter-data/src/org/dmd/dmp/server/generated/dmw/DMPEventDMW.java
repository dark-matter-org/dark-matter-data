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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:838)
import java.util.ArrayList;                                         // To support getMVCopy()
import java.util.Iterator;                                          // To support getMVCopy()
import org.dmd.dmc.*;                                               // If any attributes
import org.dmd.dmc.DmcAttribute;                                    // Primitive type
import org.dmd.dmc.DmcObject;                                       // Primitive type
import org.dmd.dmc.DmcObjectNameIF;                                 // Generic args import
import org.dmd.dmc.types.IntegerName;                               // Primitive type
import org.dmd.dmc.types.Modifier;                                  // For multi-valued containsModifier
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
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class DMPEventDMW extends DMPMessage implements DmcNamedObjectIF {

    private DMPEventDMO mycore;

    public DMPEventDMW() {
        super(new DMPEventDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
        mycore = (DMPEventDMO) core;
        mycore.setContainer(this);
    }

    public DMPEventDMW(DmcTypeModifierMV mods) {
        super(new DMPEventDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
        mycore = (DMPEventDMO) core;
        mycore.setContainer(this);
    }

    public DMPEvent getModificationRecorder(){
        DMPEvent rc = new DMPEvent();
        rc.setDmcObject(new DMPEventDMO(new DmcTypeModifierMV()));
        rc.setRequestID(getRequestID());
        return(rc);
    }

    public DMPEventDMW(DMPEventDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DMPEvent);
        mycore = (DMPEventDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (DMPEventDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public DMPEventDMO getDMO() {
        return(mycore);
    }

    protected DMPEventDMW(DMPEventDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DMPEventDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof DMPEventDMW){
            return( getObjectName().equals( ((DMPEventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public DmcAttribute<DmcObjectNameIF> getObjName(){
        return(mycore.getObjName());
    }

    /**
     * Sets objName to the specified value.
     * @param value A value compatible with DmcTypeDmcAttribute
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setObjName(Object value) throws DmcValueException {
        mycore.setObjName(value);
    }

    /**
     * Sets objName to the specified value.
     * @param value DmcAttribute
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setObjName(DmcAttribute<DmcObjectNameIF> value){
        mycore.setObjName(value);
    }

    /**
     * Removes the objName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remObjName(){
        mycore.remObjName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getObjClass(){
        return(mycore.getObjClass());
    }

    /**
     * Sets objClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setObjClass(Object value) throws DmcValueException {
        mycore.setObjClass(value);
    }

    /**
     * Sets objClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setObjClass(String value){
        mycore.setObjClass(value);
    }

    /**
     * Removes the objClass attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remObjClass(){
        mycore.remObjClass();
    }

    /**
     * @return The number of ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getModifySize(){
        DmcAttribute<?> attr = mycore.get(DMPEventDMO.__modify);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getModifyIsEmpty(){
        DmcAttribute<?> attr = mycore.get(DMPEventDMO.__modify);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getModifyHasValue(){
        DmcAttribute<?> attr = mycore.get(DMPEventDMO.__modify);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public ModifierIterableDMW getModifyIterable(){
        DmcAttribute<?> attr = mycore.get(DMPEventDMO.__modify);
        if (attr == null)
            return(ModifierIterableDMW.emptyList);
        
        return(new ModifierIterableDMW(mycore.getModify()));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1261)
    public void addModify(Object value) throws DmcValueException {
        mycore.addModify(value);
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1270)
    public void addModify(Modifier value){
        mycore.addModify(value);
    }

    /**
     * Returns true if the collection contains the modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1282)
    public boolean modifyContains(Modifier value){
        return(mycore.modifyContains(value));
    }

    /**
     * @return A COPY of the collection of Modifier objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1310)
    @SuppressWarnings("unchecked")
    public ArrayList<Modifier> getModifyCopy(){
        DmcAttribute<?> attr = mycore.get(DMPEventDMO.__modify);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void delModify(Object value) throws DmcValueException {
        mycore.delModify(value);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remModify(){
        mycore.remModify();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public DmcObject getEventObject(){
        return(mycore.getEventObject());
    }

    /**
     * Sets eventObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setEventObject(Object value) throws DmcValueException {
        mycore.setEventObject(value);
    }

    /**
     * Sets eventObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setEventObject(DmcObject value){
        mycore.setEventObject(value);
    }

    /**
     * Removes the eventObject attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remEventObject(){
        mycore.remEventObject();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public Integer getOriginatorID(){
        return(mycore.getOriginatorID());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setOriginatorID(Object value) throws DmcValueException {
        mycore.setOriginatorID(value);
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setOriginatorID(Integer value){
        mycore.setOriginatorID(value);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remOriginatorID(){
        mycore.remOriginatorID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public Boolean isNotifyOriginator(){
        return(mycore.isNotifyOriginator());
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setNotifyOriginator(Object value) throws DmcValueException {
        mycore.setNotifyOriginator(value);
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setNotifyOriginator(Boolean value){
        mycore.setNotifyOriginator(value);
    }

    /**
     * Removes the notifyOriginator attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remNotifyOriginator(){
        mycore.remNotifyOriginator();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remRequestID(){
        mycore.remRequestID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public DMPEventTypeEnum getEventTypeDMP(){
        return(mycore.getEventTypeDMP());
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value A value compatible with DmcTypeDMPEventTypeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setEventTypeDMP(Object value) throws DmcValueException {
        mycore.setEventTypeDMP(value);
    }

    /**
     * Sets eventTypeDMP to the specified value.
     * @param value DMPEventTypeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setEventTypeDMP(DMPEventTypeEnum value){
        mycore.setEventTypeDMP(value);
    }

    /**
     * Removes the eventTypeDMP attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remEventTypeDMP(){
        mycore.remEventTypeDMP();
    }


}
