package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import java.util.ArrayList;                                        // Support for MULTI attribute - (BaseDMWGeneratorNewest.java:2118)
import java.util.Iterator;                                         // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2132)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.dmw.StringIterableDMW;                // For multi-valued String - (BaseDMWGeneratorNewest.java:1995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                  // Attribute mvIdxString from the dmt schema - (BaseDMWGeneratorNewest.java:794)
import org.dmd.dmt.shared.generated.dmo.PrimitiveMVIDXDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)
import org.dmd.dmw.DmwWrapper;                                     // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1127)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
public class PrimitiveMVIDXDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public PrimitiveMVIDXDMW() {
        super(new PrimitiveMVIDXDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveMVIDX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public PrimitiveMVIDXDMW(DmcTypeModifierMV mods) {
        super(new PrimitiveMVIDXDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveMVIDX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:505)
    public PrimitiveMVIDXDMW getModificationRecorder(){
        PrimitiveMVIDXDMW rc = new PrimitiveMVIDXDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public PrimitiveMVIDXDMW(PrimitiveMVIDXDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveMVIDX);
    }

    public PrimitiveMVIDXDMW cloneIt() {
        PrimitiveMVIDXDMW rc = new PrimitiveMVIDXDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PrimitiveMVIDXDMO getDMO() {
        return((PrimitiveMVIDXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected PrimitiveMVIDXDMW(PrimitiveMVIDXDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1563)
    public int getMvIdxStringSize(){
        return(((PrimitiveMVIDXDMO) core).getMvIdxStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1571)
    public boolean getMvIdxStringIsEmpty(){
        if (((PrimitiveMVIDXDMO) core).getMvIdxStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1581)
    public boolean getMvIdxStringHasValue(){
        if (((PrimitiveMVIDXDMO) core).getMvIdxStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1999)
    public StringIterableDMW getMvIdxStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvIdxString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((PrimitiveMVIDXDMO) core).getMvIdxString()));
    }

    /**
     * Adds another mvIdxString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2025)
    public void addMvIdxString(Object value) throws DmcValueException {
        ((PrimitiveMVIDXDMO) core).addMvIdxString(value);
    }

    /**
     * Sets a mvIdxString value at the specified index.
     * @param index The index to set.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2046)
    public void setNthMvIdxString(int index, String value){
        ((PrimitiveMVIDXDMO) core).setNthMvIdxString(index, value);
    }

    /**
     * Gets the mvIdxString value at the specified index.
     * @param index The index to retreive.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2055)
    public String getNthMvIdxString(int index){
        return(((PrimitiveMVIDXDMO) core).getNthMvIdxString(index));
    }

    /**
     * Returns true if the collection contains the mvIdxString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2092)
    public boolean mvIdxStringContains(String value){
        return(((PrimitiveMVIDXDMO) core).mvIdxStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2136)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvIdxStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvIdxString);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvIdxString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2163)
    public void delMvIdxString(Object value) throws DmcValueException {
        ((PrimitiveMVIDXDMO) core).delMvIdxString(value);
    }

    /**
     * Deletes a mvIdxString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2172)
    public void delMvIdxString(String value){
        ((PrimitiveMVIDXDMO) core).delMvIdxString(value);
    }

    /**
     * Removes the mvIdxString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2184)
    public void remMvIdxString(){
        ((PrimitiveMVIDXDMO) core).remMvIdxString();
    }


}
