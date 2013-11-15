package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import org.dmd.dmc.*;                                                            // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dms.ClassDefinition;                                              // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                      // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                            // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.server.extended.ObjWithRefs;                                  // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW;                 // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedIterableDMW;         // For multi-valued TestBasicObjectFixed - (BaseDMWGeneratorNewest.java:1601)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                // Attribute mvUnnamedObj from the dmt schema - (BaseDMWGeneratorNewest.java:794)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                          // For setNth of ObjWithRefs - (BaseDMWGeneratorNewest.java:1806)
import org.dmd.dmt.shared.generated.dmo.ParseTestDMO;                            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                 // Reference to unnamed object - (BaseDMWGeneratorNewest.java:1004)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                        // To support getMVCopy() for REFs ObjWithRefs-MULTI - (BaseDMWGeneratorNewest.java:1018)
import org.dmd.dmw.DmwWrapper;                                                   // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1127)


/**
 * Used to test the DmcUncheckedOIFParser in the creation of
 * DmcUncheckedObjects within DmcUncheckedObjects.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class ParseTestDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public ParseTestDMW() {
        super(new ParseTestDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ParseTest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public ParseTestDMW(DmcTypeModifierMV mods) {
        super(new ParseTestDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ParseTest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:505)
    public ParseTestDMW getModificationRecorder(){
        ParseTestDMW rc = new ParseTestDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public ParseTestDMW(ParseTestDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ParseTest);
    }

    public ParseTestDMW cloneIt() {
        ParseTestDMW rc = new ParseTestDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ParseTestDMO getDMO() {
        return((ParseTestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected ParseTestDMW(ParseTestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of ObjWithRefs items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getMvIdxNamedObjSize(){
        return(((ParseTestDMO) core).getMvIdxNamedObjSize());
    }

    /**
     * @return true if there are no ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getMvIdxNamedObjIsEmpty(){
        if (((ParseTestDMO) core).getMvIdxNamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ObjWithRefsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getMvIdxNamedObjHasValue(){
        if (((ParseTestDMO) core).getMvIdxNamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the mvIdxNamedObj value at the specified index.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1823)
    public DmcAttribute<?> setNthMvIdxNamedObj(int index, ObjWithRefs value){
        if (value == null)
            return(((ParseTestDMO) core).setNthMvIdxNamedObj(index, null));
        else
            return(((ParseTestDMO) core).setNthMvIdxNamedObj(index, ((ObjWithRefsDMO)value.getDmcObject())));
    }

    /**
     * @return The ObjWithRefs object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1919)
    public ObjWithRefs getNthMvIdxNamedObj(int index){
        ObjWithRefsREF ref = ((ParseTestDMO) core).getNthMvIdxNamedObj(index);
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ObjWithRefs)ref.getObject().getContainer());
    }

    /**
     * @return The reference to the ObjWithRefs object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1959)
    public ObjWithRefsREF getNthMvIdxNamedObjREF(int index){
        ObjWithRefsREF ref = ((ParseTestDMO) core).getNthMvIdxNamedObjREF(index);
        return(ref);
    }

    /**
     * Removes the mvIdxNamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remMvIdxNamedObj(){
        ((ParseTestDMO) core).remMvIdxNamedObj();
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getMvIdxUnnamedObjSize(){
        return(((ParseTestDMO) core).getMvIdxUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getMvIdxUnnamedObjIsEmpty(){
        if (((ParseTestDMO) core).getMvIdxUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getMvIdxUnnamedObjHasValue(){
        if (((ParseTestDMO) core).getMvIdxUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * Sets the mvIdxUnnamedObj value at the specified index.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1823)
    public DmcAttribute<?> setNthMvIdxUnnamedObj(int index, TestBasicObjectFixedDMW value){
        if (value == null)
            return(((ParseTestDMO) core).setNthMvIdxUnnamedObj(index, null));
        else
            return(((ParseTestDMO) core).setNthMvIdxUnnamedObj(index, ((TestBasicObjectFixedDMO)value.getDmcObject())));
    }

    /**
     * @return The TestBasicObjectFixedDMW object at the specified index.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1867)
    public TestBasicObjectFixedDMW getNthMvIdxUnnamedObj(int index){
        TestBasicObjectFixedDMO dmo = ((ParseTestDMO) core).getNthMvIdxUnnamedObj(index);
        if (dmo == null)
            return(null);
        
        return((TestBasicObjectFixedDMW)dmo.getContainer());
    }

    /**
     * Removes the mvIdxUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remMvIdxUnnamedObj(){
        ((ParseTestDMO) core).remMvIdxUnnamedObj();
    }

    /**
     * @return The number of TestBasicObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getMvUnnamedObjSize(){
        return(((ParseTestDMO) core).getMvUnnamedObjSize());
    }

    /**
     * @return true if there are no TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getMvUnnamedObjIsEmpty(){
        if (((ParseTestDMO) core).getMvUnnamedObjSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getMvUnnamedObjHasValue(){
        if (((ParseTestDMO) core).getMvUnnamedObjSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1608)
    public TestBasicObjectFixedIterableDMW getMvUnnamedObjIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            return(TestBasicObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicObjectFixedIterableDMW(((ParseTestDMO) core).getMvUnnamedObj()));
    }

    /**
     * Adds another mvUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1665)
    public DmcAttribute<?> addMvUnnamedObj(TestBasicObjectFixedDMW value){
        DmcAttribute<?> attr = ((ParseTestDMO) core).addMvUnnamedObj(((TestBasicObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mvUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1715)
    public void delMvUnnamedObj(TestBasicObjectFixedDMW value){
        ((ParseTestDMO) core).delMvUnnamedObj(value.getDMO());
    }

    /**
     * Removes the mvUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remMvUnnamedObj(){
        ((ParseTestDMO) core).remMvUnnamedObj();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public Boolean isSvBoolean(){
        return(((ParseTestDMO) core).isSvBoolean());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setSvBoolean(Object value) throws DmcValueException {
        ((ParseTestDMO) core).setSvBoolean(value);
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setSvBoolean(Boolean value){
        ((ParseTestDMO) core).setSvBoolean(value);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remSvBoolean(){
        ((ParseTestDMO) core).remSvBoolean();
    }

    /**
     * @return A TestBasicObjectFixedDMW object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1293)
    public TestBasicObjectFixedDMW getSvUnnamedObj(){
        TestBasicObjectFixedDMO dmo = ((ParseTestDMO) core).getSvUnnamedObj();
        if (dmo == null)
            return(null);
        
        return((TestBasicObjectFixedDMW)dmo.getContainer());
    }

    /**
     * Sets the svUnnamedObj to the specified value.
     * @param value A value compatible with TestBasicObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setSvUnnamedObj(TestBasicObjectFixedDMW value) {
        ((ParseTestDMO) core).setSvUnnamedObj(value.getDMO());
    }

    /**
     * Sets the svUnnamedObj to the specified value.
     * @param value A value compatible with TestBasicObjectFixedREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1420)
    public void setSvUnnamedObj(Object value) throws DmcValueException {
        ((ParseTestDMO) core).setSvUnnamedObj(value);
    }

    /**
     * Removes the svUnnamedObj attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remSvUnnamedObj(){
        ((ParseTestDMO) core).remSvUnnamedObj();
    }


}
