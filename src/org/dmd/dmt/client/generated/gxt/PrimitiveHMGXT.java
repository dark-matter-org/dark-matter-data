package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.Iterator;                                      // Multi-valued attribute access - (BaseDMWGeneratorNewest.java:2438)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmc.types.StringToString;                        // Primitive type - (BaseDMWGeneratorNewest.java:1017)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;               // Attribute hmString from the dmt schema - (BaseDMWGeneratorNewest.java:774)
import org.dmd.dmt.shared.generated.dmo.PrimitiveHMDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                   // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1102)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class PrimitiveHMGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:459)
    public PrimitiveHMGXT() {
        super(new PrimitiveHMDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:464)
    public PrimitiveHMGXT(DmcTypeModifierMV mods) {
        super(new PrimitiveHMDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public PrimitiveHMGXT getModificationRecorder(){
        PrimitiveHMGXT rc = new PrimitiveHMGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public PrimitiveHMDMO getDMO() {
        return((PrimitiveHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:544)
    public PrimitiveHMGXT(PrimitiveHMDMO obj) {
        super(obj);
    }

    /**
     * @return The number of StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2203)
    public int getHmStringSize(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2215)
    public boolean getHmStringIsEmpty(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2227)
    public boolean getHmStringHasValue(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed StringToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2256)
    public StringToString getHmString(Object key){
        return(((PrimitiveHMDMO) core).getHmString(key));
    }

    /**
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2442)
    public Iterator<StringToString> getHmString(){
        return(((PrimitiveHMDMO) core).getHmString());
    }

    /**
     * Adds another hmString value.
     * @param value A value compatible with StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2455)
    public void addHmString(Object value) throws DmcValueException {
        ((PrimitiveHMDMO) core).addHmString(value);
    }

    /**
     * Adds another hmString value.
     * @param value StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2464)
    public void addHmString(StringToString value) {
        ((PrimitiveHMDMO) core).addHmString(value);
    }

    /**
     * Deletes a hmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2476)
    public void delHmString(Object value){
        ((PrimitiveHMDMO) core).delHmString(value);
    }

    /**
     * Deletes a hmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2485)
    public void delHmString(String value){
        ((PrimitiveHMDMO) core).delHmString(value);
    }

    /**
     * Removes the hmString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2554)
    public void remHmString(){
        ((PrimitiveHMDMO) core).remHmString();
    }


}
