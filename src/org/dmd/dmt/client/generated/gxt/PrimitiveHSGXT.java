package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.HashSet;                                       // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1016)
import java.util.Iterator;                                      // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2048)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;               // Attribute hsString from the dmt schema - (BaseDMWGeneratorNewest.java:733)
import org.dmd.dmt.shared.generated.dmo.PrimitiveHSDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                   // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1051)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class PrimitiveHSGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:455)
    public PrimitiveHSGXT() {
        super(new PrimitiveHSDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:460)
    public PrimitiveHSGXT(DmcTypeModifierMV mods) {
        super(new PrimitiveHSDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:478)
    public PrimitiveHSGXT getModificationRecorder(){
        PrimitiveHSGXT rc = new PrimitiveHSGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public PrimitiveHSDMO getDMO() {
        return((PrimitiveHSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:540)
    public PrimitiveHSGXT(PrimitiveHSDMO obj) {
        super(obj);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1483)
    public int getHsStringSize(){
        return(((PrimitiveHSDMO) core).getHsStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1491)
    public boolean getHsStringIsEmpty(){
        if (((PrimitiveHSDMO) core).getHsStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1501)
    public boolean getHsStringHasValue(){
        if (((PrimitiveHSDMO) core).getHsStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1930)
    public Iterator<String> getHsString(){
        return(((PrimitiveHSDMO) core).getHsString());
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1943)
    public void addHsString(Object value) throws DmcValueException {
        ((PrimitiveHSDMO) core).addHsString(value);
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1953)
    public void addHsString(String value){
        ((PrimitiveHSDMO) core).addHsString(value);
    }

    /**
     * Returns true if the collection contains the hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public boolean hsStringContains(String value){
        return(((PrimitiveHSDMO) core).hsStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2052)
    @SuppressWarnings("unchecked")
    public HashSet<String> getHsStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__hsString);
        if (attr == null)
            return(new HashSet<String>());
        
        HashSet<String> rc = new HashSet<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2079)
    public void delHsString(Object value) throws DmcValueException {
        ((PrimitiveHSDMO) core).delHsString(value);
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2088)
    public void delHsString(String value){
        ((PrimitiveHSDMO) core).delHsString(value);
    }

    /**
     * Removes the hsString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2100)
    public void remHsString(){
        ((PrimitiveHSDMO) core).remHsString();
    }


}
