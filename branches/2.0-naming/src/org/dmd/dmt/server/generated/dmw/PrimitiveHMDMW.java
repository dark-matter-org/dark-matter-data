package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.HashMap;                                           // To support getMVCopy() - (BaseDMWGenerator.java:1186)
import java.util.Iterator;                                          // Support copy of MV objects - (BaseDMWGenerator.java:2653)
import org.dmd.dmc.*;                                               // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.StringToString;                            // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dms.ClassDefinition;                                 // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.dmw.StringToStringIterableDMW;         // For multi-valued StringToString - (BaseDMWGenerator.java:2566)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                   // Attribute hmString from the dmt schema - (BaseDMWGenerator.java:897)
import org.dmd.dmt.shared.generated.dmo.PrimitiveHMDMO;             // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmw.DmwWrapper;                                      // Unnamed object wrapper - (BaseDMWGenerator.java:1235)



/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class PrimitiveHMDMW extends DmwWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public PrimitiveHMDMW() {
        super(new PrimitiveHMDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public PrimitiveHMDMW(DmcTypeModifierMV mods) {
        super(new PrimitiveHMDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHM);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:593)
    public PrimitiveHMDMW getModificationRecorder(){
        PrimitiveHMDMW rc = new PrimitiveHMDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public PrimitiveHMDMW(PrimitiveHMDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._PrimitiveHM);
    }

    public PrimitiveHMDMW cloneIt() {
        PrimitiveHMDMW rc = new PrimitiveHMDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PrimitiveHMDMO getDMO() {
        return((PrimitiveHMDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected PrimitiveHMDMW(PrimitiveHMDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2344)
    public int getHmStringSize(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2356)
    public boolean getHmStringIsEmpty(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringToStringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2368)
    public boolean getHmStringHasValue(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return The keyed StringToString object if it's available and null otherwise.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2384)
    public StringToString getHmString(Object key){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(null);
        
        return((StringToString)attr.getByKey(key));
    }

    /**
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2571)
    public StringToStringIterableDMW getHmStringIterable(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(StringToStringIterableDMW.emptyList);
        
        return(new StringToStringIterableDMW(((PrimitiveHMDMO) core).getHmString()));
    }

    /**
     * Adds another hmString value.
     * @param value A value compatible with StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2598)
    public void addHmString(Object value) throws DmcValueException {
        ((PrimitiveHMDMO) core).addHmString(value);
    }

    /**
     * Adds another hmString value.
     * @param value StringToString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2607)
    public void addHmString(StringToString value) {
        ((PrimitiveHMDMO) core).addHmString(value);
    }

    /**
     * Deletes a hmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2619)
    public void delHmString(Object value){
        ((PrimitiveHMDMO) core).delHmString(value);
    }

    /**
     * Deletes a hmString value.
     * @param value The StringToString to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2628)
    public void delHmString(String value){
        ((PrimitiveHMDMO) core).delHmString(value);
    }

    /**
     * @return A COPY of the collection of StringToString objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2658)
    @SuppressWarnings("unchecked")
    public HashMap<String,StringToString> getHmStringCopy(){
        DmcAttribute<?> attr = ((PrimitiveHMDMO) core).get(DmtDMSAG.__hmString);
        if (attr == null)
            return(new HashMap<String,StringToString>());
        
        HashMap<String,StringToString> rc = new HashMap<String,StringToString>(attr.getMVSize());
        
        Iterator<StringToString> it = (Iterator<StringToString>) attr.getMV();
        while(it.hasNext()){
            StringToString obj = it.next();
            rc.put((String)obj.getKey(),obj);
        }
        
        return(rc);
    }

    /**
     * Removes the hmString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMAPPED(BaseDMWGenerator.java:2699)
    public void remHmString(){
        ((PrimitiveHMDMO) core).remHmString();
    }


}