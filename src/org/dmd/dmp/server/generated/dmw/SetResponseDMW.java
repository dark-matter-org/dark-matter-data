package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                     // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import java.util.Iterator;                                      // Support copy of MV objects - (BaseDMWGenerator.java:2159)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.DmcObject;                                   // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmc.DmcObjectName;                               // Alternative type for NameContainer values - (BaseDMWGenerator.java:1077)
import org.dmd.dmc.types.NameContainer;                         // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmp.server.extended.Response;                    // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dmp.server.extended.SetResponse;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;               // Attribute objectList from the dmp schema - (BaseDMWGenerator.java:821)
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dms.ClassDefinition;                             // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;          // For multi-valued DmcObject - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGenerator.java:994)



/**
 * The SetResponse returns the results of a particular SetRequest. The
 * objectList will contain\n the objects with the previously specified edits.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class SetResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public SetResponseDMW() {
        super(new SetResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._SetResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public SetResponseDMW(DmcTypeModifierMV mods) {
        super(new SetResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._SetResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:509)
    public SetResponse getModificationRecorder(){
        SetResponse rc = new SetResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public SetResponseDMW(SetResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._SetResponse);
    }

    public SetResponseDMO getDMO() {
        return((SetResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected SetResponseDMW(SetResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of DmcObject items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getObjectListSize(){
        return(((SetResponseDMO) core).getObjectListSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getObjectListIsEmpty(){
        if (((SetResponseDMO) core).getObjectListSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getObjectListHasValue(){
        if (((SetResponseDMO) core).getObjectListSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2026)
    public DmcObjectIterableDMW getObjectListIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(DmcObjectIterableDMW.emptyList);
        
        return(new DmcObjectIterableDMW(((SetResponseDMO) core).getObjectList()));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addObjectList(Object value) throws DmcValueException {
        ((SetResponseDMO) core).addObjectList(value);
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addObjectList(DmcObject value){
        ((SetResponseDMO) core).addObjectList(value);
    }

    /**
     * Returns true if the collection contains the objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean objectListContains(DmcObject value){
        return(((SetResponseDMO) core).objectListContains(value));
    }

    /**
     * @return A COPY of the collection of DmcObject objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2190)
    public void delObjectList(Object value) throws DmcValueException {
        ((SetResponseDMO) core).delObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delObjectList(DmcObject value){
        ((SetResponseDMO) core).delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remObjectList(){
        ((SetResponseDMO) core).remObjectList();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public NameContainer getTarget(){
        return(((SetResponseDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setTarget(Object value) throws DmcValueException {
        ((SetResponseDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setTarget(NameContainer value){
        ((SetResponseDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1526)
    public void setTarget(DmcObjectName value){
        ((SetResponseDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remTarget(){
        ((SetResponseDMO) core).remTarget();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Long getTimeMS(){
        return(((SetResponseDMO) core).getTimeMS());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setTimeMS(Object value) throws DmcValueException {
        ((SetResponseDMO) core).setTimeMS(value);
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setTimeMS(Long value){
        ((SetResponseDMO) core).setTimeMS(value);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remTimeMS(){
        ((SetResponseDMO) core).remTimeMS();
    }


}
