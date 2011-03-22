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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:697)
import java.util.*;                                              // If not auxiliary
import org.dmd.dmc.*;                                            // If any attributes
import org.dmd.dmc.DmcAttribute;                                 // Primitive type
import org.dmd.dmc.DmcObject;                                    // Primitive type
import org.dmd.dmc.types.IntegerName;                            // Primitive type
import org.dmd.dmp.server.extended.DMPMessage;                   // Derived class
import org.dmd.dmp.shared.generated.dmo.EventDMO;                // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.EventTypeEnum;         // Primitive type
import org.dmd.dms.*;                                            // Always 2
import org.dmd.dms.generated.dmw.ModifierIterableDMW;            // For multi-valued Modifier

/**
 * The Event class allows for the asynchronous notification of noteworthy
 * system events.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:342)
 */
abstract public class EventDMW extends DMPMessage implements DmcNamedObjectIF {

    private EventDMO mycore;

    public EventDMW() {
        super(new EventDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._Event);
        mycore = (EventDMO) core;
        mycore.setContainer(this);
    }

    public EventDMW(EventDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._Event);
        mycore = (EventDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (EventDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected EventDMW(EventDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (EventDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.Event>());
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:723)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof EventDMW){
            return( getObjectName().equals( ((EventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public DmcAttribute<?> getObjName(){
        return(mycore.getObjName());
    }

    /**
     * Sets objName to the specified value.
     * @param value A value compatible with DmcTypeDmcAttribute
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setObjName(Object value) throws DmcValueException {
        mycore.setObjName(value);
    }

    /**
     * Sets objName to the specified value.
     * @param value DmcAttribute
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setObjName(DmcAttribute<?> value){
        mycore.setObjName(value);
    }

    /**
     * Removes the objName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remObjName(){
        mycore.remObjName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public String getObjClass(){
        return(mycore.getObjClass());
    }

    /**
     * Sets objClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setObjClass(Object value) throws DmcValueException {
        mycore.setObjClass(value);
    }

    /**
     * Sets objClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setObjClass(String value){
        mycore.setObjClass(value);
    }

    /**
     * Removes the objClass attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remObjClass(){
        mycore.remObjClass();
    }

    /**
     * @return The number of ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:930)
    public int getModifySize(){
        DmcAttribute<?> attr = mycore.get(EventDMO.__modify);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:942)
    public boolean getModifyIsEmpty(){
        DmcAttribute<?> attr = mycore.get(EventDMO.__modify);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:954)
    public boolean getModifyHasValue(){
        DmcAttribute<?> attr = mycore.get(EventDMO.__modify);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1026)
    public ModifierIterableDMW getModifyIterable(){
        DmcAttribute<?> attr = mycore.get(EventDMO.__modify);
        if (attr == null)
            return(ModifierIterableDMW.emptyList);
        
        return(new ModifierIterableDMW(mycore.getModify()));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1064)
    public void addModify(Object value) throws DmcValueException {
        mycore.addModify(value);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1076)
    public void delModify(Object value) throws DmcValueException {
        mycore.delModify(value);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1088)
    public void remModify(){
        mycore.remModify();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public DmcObject getEventObject(){
        return(mycore.getEventObject());
    }

    /**
     * Sets eventObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setEventObject(Object value) throws DmcValueException {
        mycore.setEventObject(value);
    }

    /**
     * Sets eventObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setEventObject(DmcObject value){
        mycore.setEventObject(value);
    }

    /**
     * Removes the eventObject attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remEventObject(){
        mycore.remEventObject();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remRequestID(){
        mycore.remRequestID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public EventTypeEnum getEventType(){
        return(mycore.getEventType());
    }

    /**
     * Sets eventType to the specified value.
     * @param value A value compatible with DmcTypeEventTypeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setEventType(Object value) throws DmcValueException {
        mycore.setEventType(value);
    }

    /**
     * Sets eventType to the specified value.
     * @param value EventTypeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setEventType(EventTypeEnum value){
        mycore.setEventType(value);
    }

    /**
     * Removes the eventType attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remEventType(){
        mycore.remEventType();
    }


}
