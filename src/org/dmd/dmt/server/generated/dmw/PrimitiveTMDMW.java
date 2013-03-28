package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.Iterator;                                          // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2514)
import java.util.TreeMap;                                           // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1059)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.types.StringToString;                            // Primitive type - (BaseDMWGeneratorNewest.java:1019)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.dmw.StringToStringIterableDMW;         // For multi-valued StringToString - (BaseDMWGeneratorNewest.java:2429)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                   // Attribute tmString from the dmt schema - (BaseDMWGeneratorNewest.java:771)
import org.dmd.dmt.shared.generated.dmo.PrimitiveTMDMO;             // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmw.DmwWrapper;                                      // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1104)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class PrimitiveTMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public PrimitiveTMDMW() {
        super(new PrimitiveTMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public PrimitiveTMDMW(DmcTypeModifierMV mods) {
        super(new PrimitiveTMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveTM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public PrimitiveTMDMW getModificationRecorder(){
        PrimitiveTMDMW rc = new PrimitiveTMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public PrimitiveTMDMW(PrimitiveTMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveTM);
    }

    public PrimitiveTMDMW cloneIt() {
        PrimitiveTMDMW rc = new PrimitiveTMDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PrimitiveTMDMO getDMO() {
        return((PrimitiveTMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected PrimitiveTMDMW(PrimitiveTMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2209)
    public int getTmStringSize(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2221)
    public boolean getTmStringIsEmpty(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2233)
    public boolean getTmStringHasValue(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed StringToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2249)
    public StringToString getTmString(Object key){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(null);
        
        return((StringToString)attr.getByKey(key));
    }

    /**
     * @return the first key of the map.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2280)
    public String getTmStringFirstKey(){
        return(((PrimitiveTMDMO) core).getTmStringFirstKey());
    }

    /**
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2434)
    public StringToStringIterableDMW getTmStringIterable(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(StringToStringIterableDMW.emptyList);
        
        return(new StringToStringIterableDMW(((PrimitiveTMDMO) core).getTmString()));
    }

    /**
     * Adds another tmString value.
     * @param value A value compatible with StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2461)
    public void addTmString(Object value) throws DmcValueException {
        ((PrimitiveTMDMO) core).addTmString(value);
    }

    /**
     * Adds another tmString value.
     * @param value StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2470)
    public void addTmString(StringToString value) {
        ((PrimitiveTMDMO) core).addTmString(value);
    }

    /**
     * Deletes a tmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2482)
    public void delTmString(Object value){
        ((PrimitiveTMDMO) core).delTmString(value);
    }

    /**
     * Deletes a tmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2491)
    public void delTmString(String value){
        ((PrimitiveTMDMO) core).delTmString(value);
    }

    /**
     * @return A COPY of the collection of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2519)
    @SuppressWarnings("unchecked")
    public TreeMap<String,StringToString> getTmStringCopy(){
        DmcAttribute<?> attr = ((PrimitiveTMDMO) core).get(DmtDMSAG.__tmString);
        if (attr == null)
            return(new TreeMap<String,StringToString>());
        
        TreeMap<String,StringToString> rc = new TreeMap<String,StringToString>();
        
        Iterator<StringToString> it = (Iterator<StringToString>) attr.getMV();
        while(it.hasNext()){
            StringToString obj = it.next();
            rc.put((String)obj.getKey(),obj);
        }
        
        return(rc);
    }

    /**
     * Removes the tmString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMAPPED(BaseDMWGeneratorNewest.java:2560)
    public void remTmString(){
        ((PrimitiveTMDMO) core).remTmString();
    }


}
