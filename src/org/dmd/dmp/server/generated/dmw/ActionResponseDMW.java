package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import java.util.ArrayList;                                        // To support getMVCopy() - (BaseDMWGenerator.java:1100)
import java.util.Iterator;                                         // Support copy of MV objects - (BaseDMWGenerator.java:2159)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dmc.DmcObject;                                      // Primitive type - (BaseDMWGenerator.java:1069)
import org.dmd.dmp.server.extended.ActionResponse;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:999)
import org.dmd.dmp.server.extended.Response;                       // Derived class - (BaseDMWGenerator.java:1167)
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1171)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute objectList from the dmp schema - (BaseDMWGenerator.java:821)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGenerator.java:995)
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;             // For multi-valued DmcObject - (BaseDMWGenerator.java:2022)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGenerator.java:994)



/**
 * The ActionResponse returns the results of a particular ActionRequest.
 * Exactly what is\n returned will depend on the efActionDef.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class ActionResponseDMW extends Response {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public ActionResponseDMW() {
        super(new ActionResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._ActionResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public ActionResponseDMW(DmcTypeModifierMV mods) {
        super(new ActionResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._ActionResponse);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:509)
    public ActionResponse getModificationRecorder(){
        ActionResponse rc = new ActionResponse();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public ActionResponseDMW(ActionResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._ActionResponse);
    }

    public ActionResponseDMO getDMO() {
        return((ActionResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected ActionResponseDMW(ActionResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public String getActionName(){
        return(((ActionResponseDMO) core).getActionName());
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setActionName(Object value) throws DmcValueException {
        ((ActionResponseDMO) core).setActionName(value);
    }

    /**
     * Sets actionName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setActionName(String value){
        ((ActionResponseDMO) core).setActionName(value);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remActionName(){
        ((ActionResponseDMO) core).remActionName();
    }

    /**
     * @return The number of DmcObject items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1590)
    public int getObjectListSize(){
        return(((ActionResponseDMO) core).getObjectListSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1598)
    public boolean getObjectListIsEmpty(){
        if (((ActionResponseDMO) core).getObjectListSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1608)
    public boolean getObjectListHasValue(){
        if (((ActionResponseDMO) core).getObjectListSize() == 0)
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
        
        return(new DmcObjectIterableDMW(((ActionResponseDMO) core).getObjectList()));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2052)
    public void addObjectList(Object value) throws DmcValueException {
        ((ActionResponseDMO) core).addObjectList(value);
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2062)
    public void addObjectList(DmcObject value){
        ((ActionResponseDMO) core).addObjectList(value);
    }

    /**
     * Returns true if the collection contains the objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2119)
    public boolean objectListContains(DmcObject value){
        return(((ActionResponseDMO) core).objectListContains(value));
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
        ((ActionResponseDMO) core).delObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2199)
    public void delObjectList(DmcObject value){
        ((ActionResponseDMO) core).delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2211)
    public void remObjectList(){
        ((ActionResponseDMO) core).remObjectList();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1393)
    public Long getTimeMS(){
        return(((ActionResponseDMO) core).getTimeMS());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1503)
    public void setTimeMS(Object value) throws DmcValueException {
        ((ActionResponseDMO) core).setTimeMS(value);
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1512)
    public void setTimeMS(Long value){
        ((ActionResponseDMO) core).setTimeMS(value);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1538)
    public void remTimeMS(){
        ((ActionResponseDMO) core).remTimeMS();
    }


}
