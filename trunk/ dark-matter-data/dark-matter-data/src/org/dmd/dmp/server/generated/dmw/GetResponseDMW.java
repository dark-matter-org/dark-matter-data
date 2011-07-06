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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import java.util.ArrayList;                                        // To support getMVCopy()
import java.util.Iterator;                                         // To support getMVCopy()
import org.dmd.dmc.*;                                              // If any attributes
import org.dmd.dmc.DmcObject;                                      // For multi-valued containsDmcObject
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values
import org.dmd.dmc.types.NameContainer;                            // For multi-valued containsNameContainer
import org.dmd.dmp.server.extended.GetResponse;                    // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Response;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute from dmp schema
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;            // Class not auxiliary or abstract
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;             // For multi-valued DmcObject
import org.dmd.dms.generated.dmw.NameContainerIterableDMW;         // For multi-valued NameContainer
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor

/**
 * The GetResponse returns a set of objects. If you had set registerForEvents
 * to true in the GetRequest, the listenerID will be the identifier that you
 * will need to specify in the DenotifyRequest in order to denotify for
 * events on the objects you initially retrieved.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class GetResponseDMW extends Response {

    public GetResponseDMW() {
        super(new GetResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    public GetResponseDMW(DmcTypeModifierMV mods) {
        super(new GetResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    public GetResponse getModificationRecorder(){
        GetResponse rc = new GetResponse();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public GetResponseDMW(GetResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    public GetResponseDMO getDMO() {
        return((GetResponseDMO) core);
    }

    protected GetResponseDMW(GetResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of NameContainer items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1232)
    public int getTargetsSize(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no NameContainerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public boolean getTargetsIsEmpty(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any NameContainerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1257)
    public boolean getTargetsHasValue(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1452)
    public NameContainerIterableDMW getTargetsIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(NameContainerIterableDMW.emptyList);
        
        return(new NameContainerIterableDMW(((GetResponseDMO) core).getTargets()));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1468)
    public void addTargets(Object value) throws DmcValueException {
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1478)
    public void addTargets(NameContainer value){
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * Adds another DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1501)
    public void addTargets(DmcObjectName value){
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * Returns true if the collection contains the targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1525)
    public boolean targetsContains(NameContainer value){
        return(((GetResponseDMO) core).targetsContains(value));
    }

    /**
     * Returns true if the collection contains the DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1536)
    public boolean targetsContains(DmcObjectName value){
        return(((GetResponseDMO) core).targetsContains(value));
    }

    /**
     * @return A COPY of the collection of NameContainer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1565)
    @SuppressWarnings("unchecked")
    public ArrayList<NameContainer> getTargetsCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(new ArrayList<NameContainer>());
        
        ArrayList<NameContainer> rc = new ArrayList<NameContainer>(attr.getMVSize());
        
        Iterator<NameContainer> it = (Iterator<NameContainer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1592)
    public void delTargets(Object value) throws DmcValueException {
        ((GetResponseDMO) core).delTargets(value);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1601)
    public void delTargets(NameContainer value){
        ((GetResponseDMO) core).delTargets(value);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1613)
    public void remTargets(){
        ((GetResponseDMO) core).remTargets();
    }

    /**
     * @return The number of DmcObject items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1232)
    public int getObjectListSize(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public boolean getObjectListIsEmpty(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1257)
    public boolean getObjectListHasValue(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1452)
    public DmcObjectIterableDMW getObjectListIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(DmcObjectIterableDMW.emptyList);
        
        return(new DmcObjectIterableDMW(((GetResponseDMO) core).getObjectList()));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1468)
    public void addObjectList(Object value) throws DmcValueException {
        ((GetResponseDMO) core).addObjectList(value);
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1478)
    public void addObjectList(DmcObject value){
        ((GetResponseDMO) core).addObjectList(value);
    }

    /**
     * Returns true if the collection contains the objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1525)
    public boolean objectListContains(DmcObject value){
        return(((GetResponseDMO) core).objectListContains(value));
    }

    /**
     * @return A COPY of the collection of DmcObject objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1565)
    @SuppressWarnings("unchecked")
    public ArrayList<DmcObject> getObjectListCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(new ArrayList<DmcObject>());
        
        ArrayList<DmcObject> rc = new ArrayList<DmcObject>(attr.getMVSize());
        
        Iterator<DmcObject> it = (Iterator<DmcObject>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1592)
    public void delObjectList(Object value) throws DmcValueException {
        ((GetResponseDMO) core).delObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1601)
    public void delObjectList(DmcObject value){
        ((GetResponseDMO) core).delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1613)
    public void remObjectList(){
        ((GetResponseDMO) core).remObjectList();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public Boolean isCacheResponse(){
        return(((GetResponseDMO) core).isCacheResponse());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1145)
    public void setCacheResponse(Object value) throws DmcValueException {
        ((GetResponseDMO) core).setCacheResponse(value);
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1154)
    public void setCacheResponse(Boolean value){
        ((GetResponseDMO) core).setCacheResponse(value);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1180)
    public void remCacheResponse(){
        ((GetResponseDMO) core).remCacheResponse();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public Long getListenerID(){
        return(((GetResponseDMO) core).getListenerID());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1145)
    public void setListenerID(Object value) throws DmcValueException {
        ((GetResponseDMO) core).setListenerID(value);
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1154)
    public void setListenerID(Long value){
        ((GetResponseDMO) core).setListenerID(value);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1180)
    public void remListenerID(){
        ((GetResponseDMO) core).remListenerID();
    }


}
