package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:855)
import java.util.ArrayList;                                                  // To support getMVCopy()
import java.util.Iterator;                                                   // To support getMVCopy()
import org.dmd.dmc.*;                                                        // If any attributes
import org.dmd.dmc.types.StringName;                                         // Primitive type
import org.dmd.dms.*;                                                        // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor
import org.dmd.dms.generated.dmw.StringIterableDMW;                          // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor
import org.dmd.dmt.server.generated.dmw.TestMultiLevelSubpackageDMW;         // Derived class
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                            // Attribute from dmt schema
import org.dmd.dmt.shared.generated.dmo.TestDerivedSubpackageDMO;            // Class not auxiliary or abstract

/**
 * The TestDerivedSubpackage tests derivation within the same subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:290)
 */
public class TestDerivedSubpackageDMW extends TestMultiLevelSubpackageDMW implements DmcNamedObjectIF {

    public TestDerivedSubpackageDMW() {
        super(new TestDerivedSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedSubpackage);
    }

    public TestDerivedSubpackageDMW(DmcTypeModifierMV mods) {
        super(new TestDerivedSubpackageDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedSubpackage);
    }

    public TestDerivedSubpackageDMW getModificationRecorder(){
        TestDerivedSubpackageDMW rc = new TestDerivedSubpackageDMW();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public TestDerivedSubpackageDMW(TestDerivedSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedSubpackage);
    }

    public TestDerivedSubpackageDMO getDMO() {
        return((TestDerivedSubpackageDMO) core);
    }

    protected TestDerivedSubpackageDMW(TestDerivedSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:882)
    public StringName getObjectName(){
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1173)
    public int getMvStringSize(){
        return(((TestDerivedSubpackageDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1189)
    public boolean getMvStringIsEmpty(){
        if (((TestDerivedSubpackageDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1204)
    public boolean getMvStringHasValue(){
        if (((TestDerivedSubpackageDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1468)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1494)
    public void addMvString(Object value) throws DmcValueException {
        ((TestDerivedSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1504)
    public void addMvString(String value){
        ((TestDerivedSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1561)
    public boolean mvStringContains(String value){
        return(((TestDerivedSubpackageDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1601)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1628)
    public void delMvString(Object value) throws DmcValueException {
        ((TestDerivedSubpackageDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1637)
    public void delMvString(String value){
        ((TestDerivedSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1649)
    public void remMvString(){
        ((TestDerivedSubpackageDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public StringName getName(){
        return(((TestDerivedSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setName(Object value) throws DmcValueException {
        ((TestDerivedSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setName(StringName value){
        ((TestDerivedSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remName(){
        ((TestDerivedSubpackageDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public String getSvString(){
        return(((TestDerivedSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setSvString(Object value) throws DmcValueException {
        ((TestDerivedSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setSvString(String value){
        ((TestDerivedSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remSvString(){
        ((TestDerivedSubpackageDMO) core).remSvString();
    }


}
