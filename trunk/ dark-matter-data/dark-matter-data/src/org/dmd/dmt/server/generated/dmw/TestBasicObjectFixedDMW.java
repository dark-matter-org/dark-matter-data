package org.dmd.dmt.server.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:613)
import java.util.*;                                                      // If not auxiliary
import org.dmd.dmc.*;                                                    // Always 2
import org.dmd.dmc.types.IntegerToString;                                // Primitive type
import org.dmd.dms.*;                                                    // Always 3
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;         // Class not auxiliary or abstract

/**
 * The TestBasicObjectFixed class provides a test bed for all types of basic
 * attribute values.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:291)
 */
public class TestBasicObjectFixedDMW extends DmwWrapper {

    private TestBasicObjectFixedDMO mycore;

    public TestBasicObjectFixedDMW() {
        super(new TestBasicObjectFixedDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicObjectFixed);
        mycore = (TestBasicObjectFixedDMO) core;
        mycore.setContainer(this);
    }

    public TestBasicObjectFixedDMW(TestBasicObjectFixedDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestBasicObjectFixed);
        mycore = (TestBasicObjectFixedDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (TestBasicObjectFixedDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected TestBasicObjectFixedDMW(TestBasicObjectFixedDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (TestBasicObjectFixedDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmt.server.generated.dmw.TestBasicObjectFixedDMW>());
    }

    /**
     * @return The number of StringDMO items.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:818)
    public int getMvStringValueSize(){
        DmcAttribute attr = mycore.get(TestBasicObjectFixedDMO.__mvStringValue);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:831)
    public boolean getMvStringValueIsEmpty(){
        DmcAttribute attr = mycore.get(TestBasicObjectFixedDMO.__mvStringValue);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return An Iterator of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:928)
    public Iterator<String> getMvStringValue(){
        return(mycore.getMvStringValue());
    }

    /**
     * Adds another mvStringValue value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:940)
    public void addMvStringValue(Object value) throws DmcValueException {
        mycore.addMvStringValue(value);
    }

    /**
     * Deletes a mvStringValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:952)
    public void delMvStringValue(Object value) throws DmcValueException {
        mycore.delMvStringValue(value);
    }

    /**
     * Removes the mvStringValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:964)
    public void remMvStringValue(){
        mycore.remMvStringValue();
    }

    /**
     * @return The number of IntegerToStringDMO items.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:818)
    public int getIntToStringSize(){
        DmcAttribute attr = mycore.get(TestBasicObjectFixedDMO.__intToString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerToStringDMO items.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:831)
    public boolean getIntToStringIsEmpty(){
        DmcAttribute attr = mycore.get(TestBasicObjectFixedDMO.__intToString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:928)
    public Iterator<IntegerToString> getIntToString(){
        return(mycore.getIntToString());
    }

    /**
     * Adds another intToString value.
     * @param value A value compatible with IntegerToString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:940)
    public void addIntToString(Object value) throws DmcValueException {
        mycore.addIntToString(value);
    }

    /**
     * Deletes a intToString value.
     * @param value The IntegerToString to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:952)
    public void delIntToString(Object value) throws DmcValueException {
        mycore.delIntToString(value);
    }

    /**
     * Removes the intToString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:964)
    public void remIntToString(){
        mycore.remIntToString();
    }

    /**
     * @return The number of LongDMO items.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:818)
    public int getMvLongValueSize(){
        DmcAttribute attr = mycore.get(TestBasicObjectFixedDMO.__mvLongValue);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no LongDMO items.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:831)
    public boolean getMvLongValueIsEmpty(){
        DmcAttribute attr = mycore.get(TestBasicObjectFixedDMO.__mvLongValue);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return An Iterator of Long objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:928)
    public Iterator<Long> getMvLongValue(){
        return(mycore.getMvLongValue());
    }

    /**
     * Adds another mvLongValue value.
     * @param value A value compatible with Long
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:940)
    public void addMvLongValue(Object value) throws DmcValueException {
        mycore.addMvLongValue(value);
    }

    /**
     * Deletes a mvLongValue value.
     * @param value The Long to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:952)
    public void delMvLongValue(Object value) throws DmcValueException {
        mycore.delMvLongValue(value);
    }

    /**
     * Removes the mvLongValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:964)
    public void remMvLongValue(){
        mycore.remMvLongValue();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public String getSvStringValue(){
        return(mycore.getSvStringValue());
    }

    /**
     * Sets svStringValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setSvStringValue(Object value) throws DmcValueException {
        mycore.setSvStringValue(value);
    }

    /**
     * Removes the svStringValue attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remSvStringValue(){
        mycore.remSvStringValue();
    }


}
