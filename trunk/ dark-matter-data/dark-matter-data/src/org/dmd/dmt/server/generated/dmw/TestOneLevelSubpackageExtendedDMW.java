package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                                        // To support getMVCopy() - (BaseDMWGeneratorNewest.java:980)
import java.util.Iterator;                                                         // Support copy of MV objects - (BaseDMWGeneratorNewest.java:1986)
import org.dmd.dmc.*;                                                              // If any attributes - (BaseDMWGeneratorNewest.java:887)
import org.dmd.dmc.types.StringName;                                               // Is named by - (BaseDMWGeneratorNewest.java:868)
import org.dmd.dms.*;                                                              // Always 2 - (BaseDMWGeneratorNewest.java:872)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:876)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                // For multi-valued String - (BaseDMWGeneratorNewest.java:1851)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:875)
import org.dmd.dmt.server.extended.subpack.TestOneLevelSubpackageExtended;         // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:880)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                  // Attribute mvString from the dmt schema - (BaseDMWGeneratorNewest.java:719)
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1047)
import org.dmd.dmw.DmwNamedObjectWrapper;                                          // Named object wrapper - (BaseDMWGeneratorNewest.java:1037)


/**
 * The TestOneLevelSubpackage class provides a test bed for generating DMWs
 * in different subpackages.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class TestOneLevelSubpackageExtendedDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public TestOneLevelSubpackageExtendedDMW() {
        super(new TestOneLevelSubpackageExtendedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public TestOneLevelSubpackageExtendedDMW(DmcTypeModifierMV mods) {
        super(new TestOneLevelSubpackageExtendedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public TestOneLevelSubpackageExtended getModificationRecorder(){
        TestOneLevelSubpackageExtended rc = new TestOneLevelSubpackageExtended();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public TestOneLevelSubpackageExtendedDMW(TestOneLevelSubpackageExtendedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestOneLevelSubpackageExtended);
    }

    public TestOneLevelSubpackageExtendedDMO getDMO() {
        return((TestOneLevelSubpackageExtendedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected TestOneLevelSubpackageExtendedDMW(TestOneLevelSubpackageExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1092)
    public StringName getObjectName(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestOneLevelSubpackageExtendedDMW){
            return( getObjectName().equals( ((TestOneLevelSubpackageExtendedDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1453)
    public int getMvStringSize(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1461)
    public boolean getMvStringIsEmpty(){
        if (((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1471)
    public boolean getMvStringHasValue(){
        if (((TestOneLevelSubpackageExtendedDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1855)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestOneLevelSubpackageExtendedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1881)
    public void addMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1891)
    public void addMvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1948)
    public boolean mvStringContains(String value){
        return(((TestOneLevelSubpackageExtendedDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1990)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
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
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2017)
    public void delMvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2026)
    public void delMvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2038)
    public void remMvString(){
        ((TestOneLevelSubpackageExtendedDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public StringName getName(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setName(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setName(StringName value){
        ((TestOneLevelSubpackageExtendedDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remName(){
        ((TestOneLevelSubpackageExtendedDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1265)
    public String getSvString(){
        return(((TestOneLevelSubpackageExtendedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public void setSvString(Object value) throws DmcValueException {
        ((TestOneLevelSubpackageExtendedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1375)
    public void setSvString(String value){
        ((TestOneLevelSubpackageExtendedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remSvString(){
        ((TestOneLevelSubpackageExtendedDMO) core).remSvString();
    }


}
