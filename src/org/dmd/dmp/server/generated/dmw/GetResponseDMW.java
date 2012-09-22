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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                        // To support getMVCopy() - (BaseDMWGeneratorNewest.java:997)
import java.util.Iterator;                                         // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2048)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.DmcObject;                                      // Primitive type - (BaseDMWGeneratorNewest.java:966)
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values - (BaseDMWGeneratorNewest.java:974)
import org.dmd.dmc.types.NameContainer;                            // Primitive type - (BaseDMWGeneratorNewest.java:966)
import org.dmd.dmp.server.extended.GetResponse;                    // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:896)
import org.dmd.dmp.server.extended.Response;                       // Derived class - (BaseDMWGeneratorNewest.java:1064)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute objectList from the dmp schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dms.*;                                              // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;             // For multi-valued DmcObject - (BaseDMWGeneratorNewest.java:1913)
import org.dmd.dms.generated.dmw.NameContainerIterableDMW;         // For multi-valued NameContainer - (BaseDMWGeneratorNewest.java:1913)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)


/**
 * The GetResponse returns a set of objects. If you had set registerForEvents
 * to true in the GetRequest, the listenerID will be the identifier that you
 * will need to specify in the DenotifyRequest in order to denotify for
 * events on the objects you initially retrieved.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class GetResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public GetResponseDMW() {
        super(new GetResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public GetResponseDMW(DmcTypeModifierMV mods) {
        super(new GetResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public GetResponse getModificationRecorder(){
        GetResponse rc = new GetResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public GetResponseDMW(GetResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    public GetResponseDMO getDMO() {
        return((GetResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected GetResponseDMW(GetResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public Boolean isCacheResponse(){
        return(((GetResponseDMO) core).isCacheResponse());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setCacheResponse(Object value) throws DmcValueException {
        ((GetResponseDMO) core).setCacheResponse(value);
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setCacheResponse(Boolean value){
        ((GetResponseDMO) core).setCacheResponse(value);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remCacheResponse(){
        ((GetResponseDMO) core).remCacheResponse();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public Long getListenerID(){
        return(((GetResponseDMO) core).getListenerID());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setListenerID(Object value) throws DmcValueException {
        ((GetResponseDMO) core).setListenerID(value);
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setListenerID(Long value){
        ((GetResponseDMO) core).setListenerID(value);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remListenerID(){
        ((GetResponseDMO) core).remListenerID();
    }

    /**
     * @return The number of DmcObject items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getObjectListSize(){
        return(((GetResponseDMO) core).getObjectListSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getObjectListIsEmpty(){
        if (((GetResponseDMO) core).getObjectListSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getObjectListHasValue(){
        if (((GetResponseDMO) core).getObjectListSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1917)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1943)
    public void addObjectList(Object value) throws DmcValueException {
        ((GetResponseDMO) core).addObjectList(value);
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1953)
    public void addObjectList(DmcObject value){
        ((GetResponseDMO) core).addObjectList(value);
    }

    /**
     * Returns true if the collection contains the objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public boolean objectListContains(DmcObject value){
        return(((GetResponseDMO) core).objectListContains(value));
    }

    /**
     * @return A COPY of the collection of DmcObject objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2052)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2079)
    public void delObjectList(Object value) throws DmcValueException {
        ((GetResponseDMO) core).delObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2088)
    public void delObjectList(DmcObject value){
        ((GetResponseDMO) core).delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remObjectList(){
        ((GetResponseDMO) core).remObjectList();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public Long getObjectsToCome(){
        return(((GetResponseDMO) core).getObjectsToCome());
    }

    /**
     * Sets objectsToCome to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setObjectsToCome(Object value) throws DmcValueException {
        ((GetResponseDMO) core).setObjectsToCome(value);
    }

    /**
     * Sets objectsToCome to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setObjectsToCome(Long value){
        ((GetResponseDMO) core).setObjectsToCome(value);
    }

    /**
     * Removes the objectsToCome attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remObjectsToCome(){
        ((GetResponseDMO) core).remObjectsToCome();
    }

    /**
     * @return The number of NameContainer items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getTargetsSize(){
        return(((GetResponseDMO) core).getTargetsSize());
    }

    /**
     * @return true if there are no NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getTargetsIsEmpty(){
        if (((GetResponseDMO) core).getTargetsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getTargetsHasValue(){
        if (((GetResponseDMO) core).getTargetsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1917)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1943)
    public void addTargets(Object value) throws DmcValueException {
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1953)
    public void addTargets(NameContainer value){
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * Adds another DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1986)
    public void addTargets(DmcObjectName value){
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * Returns true if the collection contains the targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public boolean targetsContains(NameContainer value){
        return(((GetResponseDMO) core).targetsContains(value));
    }

    /**
     * Returns true if the collection contains the DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2021)
    public boolean targetsContains(DmcObjectName value){
        return(((GetResponseDMO) core).targetsContains(value));
    }

    /**
     * @return A COPY of the collection of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2052)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2079)
    public void delTargets(Object value) throws DmcValueException {
        ((GetResponseDMO) core).delTargets(value);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2088)
    public void delTargets(NameContainer value){
        ((GetResponseDMO) core).delTargets(value);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remTargets(){
        ((GetResponseDMO) core).remTargets();
    }


}
