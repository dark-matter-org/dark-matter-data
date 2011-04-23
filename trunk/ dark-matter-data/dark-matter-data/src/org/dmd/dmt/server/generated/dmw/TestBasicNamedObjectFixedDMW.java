package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import java.util.ArrayList;                                                           // To support getMVCopy()
import java.util.Iterator;                                                            // To support getMVCopy()
import org.dmd.dmc.*;                                                                 // If any attributes
import org.dmd.dmc.types.StringName;                                                  // Primitive type
import org.dmd.dms.*;                                                                 // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                                   // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedDMW;                 // Is reference type aux
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedIterableDMW;         // For multi-valued TestBasicNamedObjectFixed
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;                 // Class not auxiliary or abstract
import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectFixedREF;               // To support getMVCopy() for REFs

/**
 * The TestBasicNamedObjectFixed class provides a test bed for a named object.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class TestBasicNamedObjectFixedDMW extends DmwWrapper implements DmcNamedObjectIF {

    public TestBasicNamedObjectFixedDMW() {
        super(new TestBasicNamedObjectFixedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectFixed);
    }

    public TestBasicNamedObjectFixedDMW(DmcTypeModifierMV mods) {
        super(new TestBasicNamedObjectFixedDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectFixed);
    }

    public TestBasicNamedObjectFixedDMW getModificationRecorder(){
        TestBasicNamedObjectFixedDMW rc = new TestBasicNamedObjectFixedDMW();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
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

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getMvStringSize(){
        DmcAttribute<?> attr = core.get(TestBasicNamedObjectFixedDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = core.get(TestBasicNamedObjectFixedDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = core.get(TestBasicNamedObjectFixedDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1321)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(TestBasicNamedObjectFixedDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestBasicNamedObjectFixedDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void addMvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    public void addMvString(String value){
        ((TestBasicNamedObjectFixedDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1358)
    public boolean mvStringContains(String value){
        return(((TestBasicNamedObjectFixedDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1386)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(TestBasicNamedObjectFixedDMO.__mvString);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1413)
    public void delMvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1425)
    public void remMvString(){
        ((TestBasicNamedObjectFixedDMO) core).remMvString();
    }

    /**
     * @return The number of TestBasicNamedObjectFixed items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1185)
    public int getMvTestBasicNamedObjectFixedSize(){
        DmcAttribute<?> attr = core.get(TestBasicNamedObjectFixedDMO.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1197)
    public boolean getMvTestBasicNamedObjectFixedIsEmpty(){
        DmcAttribute<?> attr = core.get(TestBasicNamedObjectFixedDMO.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1209)
    public boolean getMvTestBasicNamedObjectFixedHasValue(){
        DmcAttribute<?> attr = core.get(TestBasicNamedObjectFixedDMO.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of TestBasicNamedObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1229)
    public TestBasicNamedObjectFixedIterableDMW getMvTestBasicNamedObjectFixedIterable(){
        DmcAttribute attr = ((TestBasicNamedObjectFixedDMO) core).get(TestBasicNamedObjectFixedDMO.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(TestBasicNamedObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicNamedObjectFixedIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mvTestBasicNamedObjectFixed value.
     * @param value A value compatible with TestBasicNamedObjectFixed
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcAttribute<?> addMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value){
        DmcAttribute<?> attr = ((TestBasicNamedObjectFixedDMO) core).addMvTestBasicNamedObjectFixed(((TestBasicNamedObjectFixedDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a mvTestBasicNamedObjectFixed value.
     * @param value The TestBasicNamedObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1258)
    public void delMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value){
        ((TestBasicNamedObjectFixedDMO) core).delMvTestBasicNamedObjectFixed(value.getDMO());
    }

    /**
     * @return A COPY of the collection of TestBasicNamedObjectFixed objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1293)
    public ArrayList<TestBasicNamedObjectFixedDMW> getMvTestBasicNamedObjectFixedCopy(){
        DmcAttribute<?> attr = ((TestBasicNamedObjectFixedDMO) core).get(TestBasicNamedObjectFixedDMO.__mvTestBasicNamedObjectFixed);
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
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1425)
    public void remMvTestBasicNamedObjectFixed(){
        ((TestBasicNamedObjectFixedDMO) core).remMvTestBasicNamedObjectFixed();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public StringName getName(){
        return(((TestBasicNamedObjectFixedDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setName(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setName(StringName value){
        ((TestBasicNamedObjectFixedDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remName(){
        ((TestBasicNamedObjectFixedDMO) core).remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getSvString(){
        return(((TestBasicNamedObjectFixedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSvString(Object value) throws DmcValueException {
        ((TestBasicNamedObjectFixedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSvString(String value){
        ((TestBasicNamedObjectFixedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSvString(){
        ((TestBasicNamedObjectFixedDMO) core).remSvString();
    }


}
