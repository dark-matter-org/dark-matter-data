package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                        // Support for MULTI attribute - (BaseDMWGenerator.java:2119)
import java.util.Iterator;                                         // Support copy of MV objects - (BaseDMWGenerator.java:2133)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.DmcObject;                                      // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values - (BaseDMWGenerator.java:1048)
import org.dmd.dmc.types.NameContainer;                            // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dmp.server.extended.GetResponse;                    // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmp.server.extended.Response;                       // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute objectList from the dmp schema - (BaseDMWGenerator.java:910)
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;             // For multi-valued DmcObject - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.dmw.NameContainerIterableDMW;         // For multi-valued NameContainer - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGenerator.java:948)



/**
 * The GetResponse returns a set of objects. If you had set
 * registerForEvents\n to true in the GetRequest, the listenerID will be the
 * identifier that you will need to\n specify in the DenotifyRequest in order
 * to denotify for events on the objects you\n initially retrieved.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class GetResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public GetResponseDMW() {
        super(new GetResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public GetResponseDMW(DmcTypeModifierMV mods) {
        super(new GetResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:604)
    public GetResponse getModificationRecorder(){
        GetResponse rc = new GetResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public GetResponseDMW(GetResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
    }

    public GetResponse cloneIt() {
        GetResponse rc = new GetResponse();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GetResponseDMO getDMO() {
        return((GetResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected GetResponseDMW(GetResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isCacheResponse(){
        return(((GetResponseDMO) core).isCacheResponse());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setCacheResponse(Object value) throws DmcValueException {
        ((GetResponseDMO) core).setCacheResponse(value);
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setCacheResponse(Boolean value){
        ((GetResponseDMO) core).setCacheResponse(value);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remCacheResponse(){
        ((GetResponseDMO) core).remCacheResponse();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Long getListenerID(){
        return(((GetResponseDMO) core).getListenerID());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setListenerID(Object value) throws DmcValueException {
        ((GetResponseDMO) core).setListenerID(value);
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setListenerID(Long value){
        ((GetResponseDMO) core).setListenerID(value);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remListenerID(){
        ((GetResponseDMO) core).remListenerID();
    }

    /**
     * @return The number of DmcObject items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getObjectListSize(){
        return(((GetResponseDMO) core).getObjectListSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getObjectListIsEmpty(){
        if (((GetResponseDMO) core).getObjectListSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getObjectListHasValue(){
        if (((GetResponseDMO) core).getObjectListSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public DmcObjectIterableDMW getObjectListIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(DmcObjectIterableDMW.emptyList);
        
        return(new DmcObjectIterableDMW(((GetResponseDMO) core).getObjectList()));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addObjectList(Object value) throws DmcValueException {
        ((GetResponseDMO) core).addObjectList(value);
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addObjectList(DmcObject value){
        ((GetResponseDMO) core).addObjectList(value);
    }

    /**
     * @param value A value compatible with DmcObject
     * @return true if the collection contains the objectList value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean objectListContains(DmcObject value){
        return(((GetResponseDMO) core).objectListContains(value));
    }

    /**
     * @return A COPY of the collection of DmcObject objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delObjectList(Object value) throws DmcValueException {
        ((GetResponseDMO) core).delObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delObjectList(DmcObject value){
        ((GetResponseDMO) core).delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remObjectList(){
        ((GetResponseDMO) core).remObjectList();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Long getObjectsToCome(){
        return(((GetResponseDMO) core).getObjectsToCome());
    }

    /**
     * Sets objectsToCome to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setObjectsToCome(Object value) throws DmcValueException {
        ((GetResponseDMO) core).setObjectsToCome(value);
    }

    /**
     * Sets objectsToCome to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setObjectsToCome(Long value){
        ((GetResponseDMO) core).setObjectsToCome(value);
    }

    /**
     * Removes the objectsToCome attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remObjectsToCome(){
        ((GetResponseDMO) core).remObjectsToCome();
    }

    /**
     * @return The number of NameContainer items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1562)
    public int getTargetsSize(){
        return(((GetResponseDMO) core).getTargetsSize());
    }

    /**
     * @return true if there are no NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1570)
    public boolean getTargetsIsEmpty(){
        if (((GetResponseDMO) core).getTargetsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1580)
    public boolean getTargetsHasValue(){
        if (((GetResponseDMO) core).getTargetsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public NameContainerIterableDMW getTargetsIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(NameContainerIterableDMW.emptyList);
        
        return(new NameContainerIterableDMW(((GetResponseDMO) core).getTargets()));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public void addTargets(Object value) throws DmcValueException {
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2036)
    public void addTargets(NameContainer value){
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * Adds another DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2069)
    public void addTargets(DmcObjectName value){
        ((GetResponseDMO) core).addTargets(value);
    }

    /**
     * @param value A value compatible with NameContainer
     * @return true if the collection contains the targets value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2093)
    public boolean targetsContains(NameContainer value){
        return(((GetResponseDMO) core).targetsContains(value));
    }

    /**
     * @param value A value compatible with DmcObjectName
     * @return true if the collection contains the DmcObjectName value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2104)
    public boolean targetsContains(DmcObjectName value){
        return(((GetResponseDMO) core).targetsContains(value));
    }

    /**
     * @return A COPY of the collection of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2137)
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
     * @throws DmcValueException if value is incorrect
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2165)
    public void delTargets(Object value) throws DmcValueException {
        ((GetResponseDMO) core).delTargets(value);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2174)
    public void delTargets(NameContainer value){
        ((GetResponseDMO) core).delTargets(value);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2186)
    public void remTargets(){
        ((GetResponseDMO) core).remTargets();
    }


}
