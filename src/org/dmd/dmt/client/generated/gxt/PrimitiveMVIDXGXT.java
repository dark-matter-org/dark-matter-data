package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.ArrayList;                                        // Support for MULTI attribute - (BaseDMWGeneratorNewest.java:2087)
import java.util.Iterator;                                         // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2099)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                  // Attribute mvIdxString from the dmt schema - (BaseDMWGeneratorNewest.java:784)
import org.dmd.dmt.shared.generated.dmo.PrimitiveMVIDXDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                      // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1102)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class PrimitiveMVIDXGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:459)
    public PrimitiveMVIDXGXT() {
        super(new PrimitiveMVIDXDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:464)
    public PrimitiveMVIDXGXT(DmcTypeModifierMV mods) {
        super(new PrimitiveMVIDXDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public PrimitiveMVIDXGXT getModificationRecorder(){
        PrimitiveMVIDXGXT rc = new PrimitiveMVIDXGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public PrimitiveMVIDXDMO getDMO() {
        return((PrimitiveMVIDXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:544)
    public PrimitiveMVIDXGXT(PrimitiveMVIDXDMO obj) {
        super(obj);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getMvIdxStringSize(){
        return(((PrimitiveMVIDXDMO) core).getMvIdxStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getMvIdxStringIsEmpty(){
        if (((PrimitiveMVIDXDMO) core).getMvIdxStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getMvIdxStringHasValue(){
        if (((PrimitiveMVIDXDMO) core).getMvIdxStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1981)
    public Iterator<String> getMvIdxString(){
        return(((PrimitiveMVIDXDMO) core).getMvIdxString());
    }

    /**
     * Adds another mvIdxString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1994)
    public void addMvIdxString(Object value) throws DmcValueException {
        ((PrimitiveMVIDXDMO) core).addMvIdxString(value);
    }

    /**
     * Sets a mvIdxString value at the specified index.
     * @param index The index to set.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2015)
    public void setNthMvIdxString(int index, String value){
        ((PrimitiveMVIDXDMO) core).setNthMvIdxString(index, value);
    }

    /**
     * Gets the mvIdxString value at the specified index.
     * @param index The index to retreive.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2024)
    public String getNthMvIdxString(int index){
        return(((PrimitiveMVIDXDMO) core).getNthMvIdxString(index));
    }

    /**
     * Returns true if the collection contains the mvIdxString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2061)
    public boolean mvIdxStringContains(String value){
        return(((PrimitiveMVIDXDMO) core).mvIdxStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2103)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2130)
    public void delMvIdxString(Object value) throws DmcValueException {
        ((PrimitiveMVIDXDMO) core).delMvIdxString(value);
    }

    /**
     * Deletes a mvIdxString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2139)
    public void delMvIdxString(String value){
        ((PrimitiveMVIDXDMO) core).delMvIdxString(value);
    }

    /**
     * Removes the mvIdxString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remMvIdxString(){
        ((PrimitiveMVIDXDMO) core).remMvIdxString();
    }


}
