package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.ArrayList;                                                  // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1050)
import java.util.Iterator;                                                   // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2105)
import org.dmd.dmc.*;                                                        // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.types.DefinitionName;                                     // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.ClassDefinition;                                          // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.dmw.StringIterableDMW;                          // For multi-valued String - (BaseDMWGeneratorNewest.java:1970)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmt.server.generated.dmw.TestMultiLevelSubpackageDMW;         // Derived class - (BaseDMWGeneratorNewest.java:1117)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                            // Attribute mvString from the dmt schema - (BaseDMWGeneratorNewest.java:771)
import org.dmd.dmt.shared.generated.dmo.TestDerivedSubpackageDMO;            // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)


/**
 * The TestDerivedSubpackage tests derivation within the same subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class TestDerivedSubpackageDMW extends TestMultiLevelSubpackageDMW implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public TestDerivedSubpackageDMW() {
        super(new TestDerivedSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedSubpackage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public TestDerivedSubpackageDMW(DmcTypeModifierMV mods) {
        super(new TestDerivedSubpackageDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedSubpackage);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:504)
    public TestDerivedSubpackageDMW getModificationRecorder(){
        TestDerivedSubpackageDMW rc = new TestDerivedSubpackageDMW();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public TestDerivedSubpackageDMW(TestDerivedSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedSubpackage);
    }

    public TestDerivedSubpackageDMW cloneIt() {
        TestDerivedSubpackageDMW rc = new TestDerivedSubpackageDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public TestDerivedSubpackageDMO getDMO() {
        return((TestDerivedSubpackageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected TestDerivedSubpackageDMW(TestDerivedSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1166)
    public DefinitionName getObjectName(){
        return(((TestDerivedSubpackageDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestDerivedSubpackageDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestDerivedSubpackageDMW){
            return( getObjectName().equals( ((TestDerivedSubpackageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1540)
    public int getMvStringSize(){
        return(((TestDerivedSubpackageDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1548)
    public boolean getMvStringIsEmpty(){
        if (((TestDerivedSubpackageDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1558)
    public boolean getMvStringHasValue(){
        if (((TestDerivedSubpackageDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1974)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestDerivedSubpackageDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2000)
    public void addMvString(Object value) throws DmcValueException {
        ((TestDerivedSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2010)
    public void addMvString(String value){
        ((TestDerivedSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2067)
    public boolean mvStringContains(String value){
        return(((TestDerivedSubpackageDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2109)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2136)
    public void delMvString(Object value) throws DmcValueException {
        ((TestDerivedSubpackageDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2145)
    public void delMvString(String value){
        ((TestDerivedSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2157)
    public void remMvString(){
        ((TestDerivedSubpackageDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public DefinitionName getName(){
        return(((TestDerivedSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setName(Object value) throws DmcValueException {
        ((TestDerivedSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setName(DefinitionName value){
        ((TestDerivedSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remName(){
        ((TestDerivedSubpackageDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getSvString(){
        return(((TestDerivedSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setSvString(Object value) throws DmcValueException {
        ((TestDerivedSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setSvString(String value){
        ((TestDerivedSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remSvString(){
        ((TestDerivedSubpackageDMO) core).remSvString();
    }


}
