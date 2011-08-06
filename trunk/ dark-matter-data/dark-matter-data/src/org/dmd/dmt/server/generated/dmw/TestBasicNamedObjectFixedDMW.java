package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:813)
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
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;                 // Class not auxiliary or abstract
import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectFixedREF;               // To support getMVCopy() for REFs
import org.dmd.dmw.DmwNamedObjectWrapper;                                             // Named object wrapper

/**
 * The TestBasicNamedObjectFixed class provides a test bed for a named object.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:284)
 */
public class TestBasicNamedObjectFixedDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    public TestBasicNamedObjectFixedDMW() {
        super(new TestBasicNamedObjectFixedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectFixed);
    }

    public TestBasicNamedObjectFixedDMW(DmcTypeModifierMV mods) {
        super(new TestBasicNamedObjectFixedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectFixed);
    }

    public TestBasicNamedObjectFixedDMW getModificationRecorder(){
        TestBasicNamedObjectFixedDMW rc = new TestBasicNamedObjectFixedDMW();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public TestBasicNamedObjectFixedDMW(TestBasicNamedObjectFixedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectFixed);
    }

    public TestBasicNamedObjectFixedDMO getDMO() {
        return((TestBasicNamedObjectFixedDMO) core);
    }

    protected TestBasicNamedObjectFixedDMW(TestBasicNamedObjectFixedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:840)
    public StringName getObjectName(){
        return(((TestBasicNamedObjectFixedDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TestBasicNamedObjectFixedDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestBasicNamedObjectFixedDMW){
            return( getObjectName().equals( ((TestBasicNamedObjectFixedDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1119)
    public int getMvStringSize(){
        return(((TestBasicNamedObjectFixedDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1135)
    public boolean getMvStringIsEmpty(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1150)
    public boolean getMvStringHasValue(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1338)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestBasicNamedObjectFixedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1364)
    public void addMvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1374)
    public void addMvString(String value){
        ((TestBasicNamedObjectFixedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1431)
    public boolean mvStringContains(String value){
        return(((TestBasicNamedObjectFixedDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1471)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1498)
    public void delMvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1507)
    public void delMvString(String value){
        ((TestBasicNamedObjectFixedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1519)
    public void remMvString(){
        ((TestBasicNamedObjectFixedDMO) core).remMvString();
    }

    /**
     * @return The number of TestBasicNamedObjectFixed items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1119)
    public int getMvTestBasicNamedObjectFixedSize(){
        return(((TestBasicNamedObjectFixedDMO) core).getMvTestBasicNamedObjectFixedSize());
    }

    /**
     * @return true if there are no TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1135)
    public boolean getMvTestBasicNamedObjectFixedIsEmpty(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvTestBasicNamedObjectFixedSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1150)
    public boolean getMvTestBasicNamedObjectFixedHasValue(){
        if (((TestBasicNamedObjectFixedDMO) core).getMvTestBasicNamedObjectFixedSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of TestBasicNamedObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1174)
    public TestBasicNamedObjectFixedIterableDMW getMvTestBasicNamedObjectFixedIterable(){
        DmcAttribute attr = ((TestBasicNamedObjectFixedDMO) core).get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(TestBasicNamedObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicNamedObjectFixedIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mvTestBasicNamedObjectFixed value.
     * @param value A value compatible with TestBasicNamedObjectFixed
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1190)
    public DmcAttribute<?> addMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value){
        DmcAttribute<?> attr = ((TestBasicNamedObjectFixedDMO) core).addMvTestBasicNamedObjectFixed(((TestBasicNamedObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mvTestBasicNamedObjectFixed value.
     * @param value The TestBasicNamedObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1203)
    public void delMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value){
        ((TestBasicNamedObjectFixedDMO) core).delMvTestBasicNamedObjectFixed(value.getDMO());
    }

    /**
     * @return A COPY of the collection of TestBasicNamedObjectFixed objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1238)
    public ArrayList<TestBasicNamedObjectFixedDMW> getMvTestBasicNamedObjectFixedCopy(){
        DmcAttribute<?> attr = ((TestBasicNamedObjectFixedDMO) core).get(DmtDMSAG.__mvTestBasicNamedObjectFixed);
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatMV(BaseDMWGeneratorNew.java:1519)
    public void remMvTestBasicNamedObjectFixed(){
        ((TestBasicNamedObjectFixedDMO) core).remMvTestBasicNamedObjectFixed();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public StringName getName(){
        return(((TestBasicNamedObjectFixedDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setName(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setName(StringName value){
        ((TestBasicNamedObjectFixedDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remName(){
        ((TestBasicNamedObjectFixedDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public String getSvString(){
        return(((TestBasicNamedObjectFixedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setSvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setSvString(String value){
        ((TestBasicNamedObjectFixedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remSvString(){
        ((TestBasicNamedObjectFixedDMO) core).remSvString();
    }


}
