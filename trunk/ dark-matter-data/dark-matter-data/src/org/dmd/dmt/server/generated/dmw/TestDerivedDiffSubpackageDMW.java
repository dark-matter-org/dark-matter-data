package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:950)
import java.util.ArrayList;                                                         // To support getMVCopy()
import java.util.Iterator;                                                          // To support getMVCopy()
import org.dmd.dmc.*;                                                               // If any attributes
import org.dmd.dmc.types.StringName;                                                // Primitive type
import org.dmd.dms.*;                                                               // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor
import org.dmd.dms.generated.dmw.StringIterableDMW;                                 // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor
import org.dmd.dmt.server.extended.subpack.multi.TestDerivedDiffSubpackage;         // Required for getModificationRecorder()
import org.dmd.dmt.server.generated.dmw.TestOneLevelSubpackageDMW;                  // Derived class
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                   // Attribute from dmt schema
import org.dmd.dmt.shared.generated.dmo.TestDerivedDiffSubpackageDMO;               // Class not auxiliary or abstract

/**
 * The TestDerivedDiffSubpackage test derivation from a different subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:364)
 */
public class TestDerivedDiffSubpackageDMW extends TestOneLevelSubpackageDMW implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:441)
    public TestDerivedDiffSubpackageDMW() {
        super(new TestDerivedDiffSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:447)
    public TestDerivedDiffSubpackageDMW(DmcTypeModifierMV mods) {
        super(new TestDerivedDiffSubpackageDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:489)
    public TestDerivedDiffSubpackage getModificationRecorder(){
        TestDerivedDiffSubpackage rc = new TestDerivedDiffSubpackage();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:510)
    public TestDerivedDiffSubpackageDMW(TestDerivedDiffSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    public TestDerivedDiffSubpackageDMO getDMO() {
        return((TestDerivedDiffSubpackageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:527)
    protected TestDerivedDiffSubpackageDMW(TestDerivedDiffSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:977)
    public StringName getObjectName(){
        return(((TestDerivedDiffSubpackageDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestDerivedDiffSubpackageDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestDerivedDiffSubpackageDMW){
            return( getObjectName().equals( ((TestDerivedDiffSubpackageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1291)
    public int getMvStringSize(){
        return(((TestDerivedDiffSubpackageDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1299)
    public boolean getMvStringIsEmpty(){
        if (((TestDerivedDiffSubpackageDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1309)
    public boolean getMvStringHasValue(){
        if (((TestDerivedDiffSubpackageDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1639)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestDerivedDiffSubpackageDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1665)
    public void addMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1675)
    public void addMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1732)
    public boolean mvStringContains(String value){
        return(((TestDerivedDiffSubpackageDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1772)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1799)
    public void delMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1808)
    public void delMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1820)
    public void remMvString(){
        ((TestDerivedDiffSubpackageDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1133)
    public StringName getName(){
        return(((TestDerivedDiffSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1204)
    public void setName(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1213)
    public void setName(StringName value){
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void remName(){
        ((TestDerivedDiffSubpackageDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1133)
    public String getSvString(){
        return(((TestDerivedDiffSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1204)
    public void setSvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1213)
    public void setSvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void remSvString(){
        ((TestDerivedDiffSubpackageDMO) core).remSvString();
    }


}
