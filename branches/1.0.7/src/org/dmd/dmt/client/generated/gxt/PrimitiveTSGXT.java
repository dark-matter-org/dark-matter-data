package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.Iterator;                                      // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2099)
import java.util.TreeSet;                                       // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1077)
import org.dmd.dmc.*;                                           // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;               // Attribute tsString from the dmt schema - (BaseDMWGeneratorNewest.java:784)
import org.dmd.dmt.shared.generated.dmo.PrimitiveTSDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                   // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1102)


/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class PrimitiveTSGXT extends GxtWrapper {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:459)
    public PrimitiveTSGXT() {
        super(new PrimitiveTSDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:464)
    public PrimitiveTSGXT(DmcTypeModifierMV mods) {
        super(new PrimitiveTSDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:482)
    public PrimitiveTSGXT getModificationRecorder(){
        PrimitiveTSGXT rc = new PrimitiveTSGXT(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public PrimitiveTSDMO getDMO() {
        return((PrimitiveTSDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:544)
    public PrimitiveTSGXT(PrimitiveTSDMO obj) {
        super(obj);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getTsStringSize(){
        return(((PrimitiveTSDMO) core).getTsStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getTsStringIsEmpty(){
        if (((PrimitiveTSDMO) core).getTsStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getTsStringHasValue(){
        if (((PrimitiveTSDMO) core).getTsStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1981)
    public Iterator<String> getTsString(){
        return(((PrimitiveTSDMO) core).getTsString());
    }

    /**
     * Adds another tsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1994)
    public void addTsString(Object value) throws DmcValueException {
        ((PrimitiveTSDMO) core).addTsString(value);
    }

    /**
     * Adds another tsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2004)
    public void addTsString(String value){
        ((PrimitiveTSDMO) core).addTsString(value);
    }

    /**
     * Returns true if the collection contains the tsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2061)
    public boolean tsStringContains(String value){
        return(((PrimitiveTSDMO) core).tsStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2103)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getTsStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__tsString);
        if (attr == null)
            return(new TreeSet<String>());
        
        TreeSet<String> rc = new TreeSet<String>();
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a tsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2130)
    public void delTsString(Object value) throws DmcValueException {
        ((PrimitiveTSDMO) core).delTsString(value);
    }

    /**
     * Deletes a tsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2139)
    public void delTsString(String value){
        ((PrimitiveTSDMO) core).delTsString(value);
    }

    /**
     * Removes the tsString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remTsString(){
        ((PrimitiveTSDMO) core).remTsString();
    }


}