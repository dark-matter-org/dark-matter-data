package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:697)
import java.util.*;                                                                   // If not auxiliary
import org.dmd.dmc.*;                                                                 // If any attributes
import org.dmd.dmc.types.StringName;                                                  // Primitive type
import org.dmd.dms.*;                                                                 // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                                   // For multi-valued String
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedDMW;                 // Is reference type
import org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectFixedIterableDMW;         // For multi-valued TestBasicNamedObjectFixed
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectExtendedDMO;              // Class not auxiliary or abstract

/**
 * The TestBasicNamedObjectExtended class provides a test bed for a named
 * object that's extended.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:342)
 */
public class TestBasicNamedObjectExtendedDMW extends DmwWrapper implements DmcNamedObjectIF {

    private TestBasicNamedObjectExtendedDMO mycore;

    public TestBasicNamedObjectExtendedDMW() {
        super(new TestBasicNamedObjectExtendedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectExtended);
        mycore = (TestBasicNamedObjectExtendedDMO) core;
        mycore.setContainer(this);
    }

    public TestBasicNamedObjectExtendedDMW(TestBasicNamedObjectExtendedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicNamedObjectExtended);
        mycore = (TestBasicNamedObjectExtendedDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (TestBasicNamedObjectExtendedDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected TestBasicNamedObjectExtendedDMW(TestBasicNamedObjectExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (TestBasicNamedObjectExtendedDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmt.server.generated.dmw.TestBasicNamedObjectExtendedDMW>());
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:723)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestBasicNamedObjectExtendedDMW){
            return( getObjectName().equals( ((TestBasicNamedObjectExtendedDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:930)
    public int getMvStringSize(){
        DmcAttribute<?> attr = mycore.get(TestBasicNamedObjectExtendedDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:942)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = mycore.get(TestBasicNamedObjectExtendedDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:954)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = mycore.get(TestBasicNamedObjectExtendedDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1026)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = mycore.get(TestBasicNamedObjectExtendedDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(mycore.getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1064)
    public void addMvString(Object value) throws DmcValueException {
        mycore.addMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1076)
    public void delMvString(Object value) throws DmcValueException {
        mycore.delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1088)
    public void remMvString(){
        mycore.remMvString();
    }

    /**
     * @return The number of TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:930)
    public int getMvTestBasicNamedObjectFixedSize(){
        DmcAttribute<?> attr = mycore.get(TestBasicNamedObjectExtendedDMO.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:942)
    public boolean getMvTestBasicNamedObjectFixedIsEmpty(){
        DmcAttribute<?> attr = mycore.get(TestBasicNamedObjectExtendedDMO.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any TestBasicNamedObjectFixedDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:954)
    public boolean getMvTestBasicNamedObjectFixedHasValue(){
        DmcAttribute<?> attr = mycore.get(TestBasicNamedObjectExtendedDMO.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of TestBasicNamedObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:973)
    public TestBasicNamedObjectFixedIterableDMW getMvTestBasicNamedObjectFixedIterable(){
        DmcAttribute attr = mycore.get(TestBasicNamedObjectExtendedDMO.__mvTestBasicNamedObjectFixed);
        if (attr == null)
            return(TestBasicNamedObjectFixedIterableDMW.emptyList);
        
        return(new TestBasicNamedObjectFixedIterableDMW(attr.getMV()));
    }

    /**
     * Adds another mvTestBasicNamedObjectFixed value.
     * @param value A value compatible with TestBasicNamedObjectFixed
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:989)
    public DmcAttribute<?> addMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMvTestBasicNamedObjectFixed(value.getDmcObject());
        return(attr);
    }

    /**
     * Deletes a mvTestBasicNamedObjectFixed value.
     * @param value The TestBasicNamedObjectFixed to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1003)
    public void delMvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMW value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.delMvTestBasicNamedObjectFixed(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<TestBasicNamedObjectFixedDMW> refs = (ArrayList<TestBasicNamedObjectFixedDMW>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the mvTestBasicNamedObjectFixed attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1088)
    public void remMvTestBasicNamedObjectFixed(){
        mycore.remMvTestBasicNamedObjectFixed();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remName(){
        mycore.remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public String getSvString(){
        return(mycore.getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setSvString(Object value) throws DmcValueException {
        mycore.setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setSvString(String value){
        mycore.setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remSvString(){
        mycore.remSvString();
    }


}
