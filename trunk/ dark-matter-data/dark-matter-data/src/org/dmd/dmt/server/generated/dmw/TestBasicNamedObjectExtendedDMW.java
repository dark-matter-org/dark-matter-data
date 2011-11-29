package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:879)
import java.util.ArrayList;                                                           // To support getMVCopy()
import java.util.Iterator;                                                            // To support getMVCopy()
import org.dmd.dmc.*;                                                                 // If any attributes
import org.dmd.dmc.types.StringName;                                                  // Primitive type
import org.dmd.dms.*;                                                                 // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor
import org.dmd.dms.generated.dmw.StringIterableDMW;                                   // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedDMW;                 // Is reference type aux
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedIterableDMW;         // For multi-valued TestBasicNamedObjectFixed
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                     // Attribute from dmt schema
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectExtendedDMO;              // Class not auxiliary or abstract
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;                 // For multi-valued containsTestBasicNamedObjectFixed
import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectFixedREF;               // To support getMVCopy() for REFs
import org.dmd.dmw.DmwNamedObjectWrapper;                                             // Named object wrapper

/**
 * The TestBasicNamedObjectExtended class provides a test bed for a named
 * object that's extended.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:293)
 */
public class TestBasicNamedObjectExtendedDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:370)
    public TestBasicNamedObjectExtendedDMW() {
        super(new TestBasicNamedObjectExtendedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectExtended);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:376)
    public TestBasicNamedObjectExtendedDMW(DmcTypeModifierMV mods) {
        super(new TestBasicNamedObjectExtendedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectExtended);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:427)
    public TestBasicNamedObjectExtendedDMW getModificationRecorder(){
        TestBasicNamedObjectExtendedDMW rc = new TestBasicNamedObjectExtendedDMW();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:439)
    public TestBasicNamedObjectExtendedDMW(TestBasicNamedObjectExtendedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectExtended);
    }

    public TestBasicNamedObjectExtendedDMO getDMO() {
        return((TestBasicNamedObjectExtendedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:456)
    protected TestBasicNamedObjectExtendedDMW(TestBasicNamedObjectExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:906)
    public StringName getObjectName(){
        return(((TestBasicNamedObjectExtendedDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestBasicNamedObjectExtendedDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestBasicNamedObjectExtendedDMW){
            return( getObjectName().equals( ((TestBasicNamedObjectExtendedDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1204)
    public int getMvStringSize(){
        return(((TestBasicNamedObjectExtendedDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1220)
    public boolean getMvStringIsEmpty(){
        if (((TestBasicNamedObjectExtendedDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1235)
    public boolean getMvStringHasValue(){
        if (((TestBasicNamedObjectExtendedDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1499)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestBasicNamedObjectExtendedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1525)
    public void addMvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectExtendedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1535)
    public void addMvString(String value){
        ((TestBasicNamedObjectExtendedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1592)
    public boolean mvStringContains(String value){
        return(((TestBasicNamedObjectExtendedDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1632)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1659)
    public void delMvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectExtendedDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1668)
    public void delMvString(String value){
        ((TestBasicNamedObjectExtendedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1680)
    public void remMvString(){
        ((TestBasicNamedObjectExtendedDMO) core).remMvString();
    }

    /**
     * @return The number of TestBasicNamedObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1204)
    public int getMvTestBasicNamedObjectFixedSize(){
        return(((TestBasicNamedObjectExtendedDMO) core).getMvTestBasicNamedObjectFixedSize());
    }

    /**
     * @return true if there are no TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1220)
    public boolean getMvTestBasicNamedObjectFixedIsEmpty(){
        if (((TestBasicNamedObjectExtendedDMO) core).getMvTestBasicNamedObjectFixedSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1235)
    public boolean getMvTestBasicNamedObjectFixedHasValue(){
        if (((TestBasicNamedObjectExtendedDMO) core).getMvTestBasicNamedObjectFixedSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicNamedObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1260)
    public TestBasicNamedObjectFixedIterableDMW getMvTestBasicNamedObjectFixedIterable(){
        DmcAttribute attr = ((TestBasicNamedObjectExtendedDMO) core).get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(TestBasicNamedObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicNamedObjectFixedIterableDMW(((TestBasicNamedObjectExtendedDMO) core).getMvTestBasicNamedObjectFixed()));
    }

    /**
     * Adds another mvTestBasicNamedObjectFixed value.
     * @param value A value compatible with TestBasicNamedObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1291)
    public DmcAttribute<?> addMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value){
        DmcAttribute<?> attr = ((TestBasicNamedObjectExtendedDMO) core).addMvTestBasicNamedObjectFixed(((TestBasicNamedObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mvTestBasicNamedObjectFixed value.
     * @param value The TestBasicNamedObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1316)
    public void delMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value){
        ((TestBasicNamedObjectExtendedDMO) core).delMvTestBasicNamedObjectFixed(value.getDMO());
    }

    /**
     * @return A COPY of the collection of TestBasicNamedObjectFixed objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1363)
    public ArrayList<TestBasicNamedObjectFixedDMW> getMvTestBasicNamedObjectFixedCopy(){
        DmcAttribute<?> attr = ((TestBasicNamedObjectExtendedDMO) core).get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(new ArrayList<TestBasicNamedObjectFixedDMW>());
        
        ArrayList<TestBasicNamedObjectFixedDMW> rc = new ArrayList<TestBasicNamedObjectFixedDMW>(attr.getMVSize());
        
        TestBasicNamedObjectFixedIterableDMW it = getMvTestBasicNamedObjectFixedIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the mvTestBasicNamedObjectFixed attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1680)
    public void remMvTestBasicNamedObjectFixed(){
        ((TestBasicNamedObjectExtendedDMO) core).remMvTestBasicNamedObjectFixed();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1058)
    public StringName getName(){
        return(((TestBasicNamedObjectExtendedDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1117)
    public void setName(Object value) throws DmcValueException {
        ((TestBasicNamedObjectExtendedDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1126)
    public void setName(StringName value){
        ((TestBasicNamedObjectExtendedDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1152)
    public void remName(){
        ((TestBasicNamedObjectExtendedDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1058)
    public String getSvString(){
        return(((TestBasicNamedObjectExtendedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1117)
    public void setSvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectExtendedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1126)
    public void setSvString(String value){
        ((TestBasicNamedObjectExtendedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1152)
    public void remSvString(){
        ((TestBasicNamedObjectExtendedDMO) core).remSvString();
    }


}
