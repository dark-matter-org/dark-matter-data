package org.dmd.dmt.server.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:750)
import org.dmd.dmc.*;                                                        // If any attributes
import org.dmd.dmc.types.StringName;                                         // Primitive type
import org.dmd.dms.*;                                                        // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                          // For multi-valued String
import org.dmd.dmt.server.generated.dmw.TestMultiLevelSubpackageDMW;         // Derived class
import org.dmd.dmt.shared.generated.dmo.TestDerivedSubpackageDMO;            // Class not auxiliary or abstract

/**
 * The TestDerivedSubpackage tests derivation within the same subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:342)
 */
public class TestDerivedSubpackageDMW extends TestMultiLevelSubpackageDMW implements DmcNamedObjectIF {

    private TestDerivedSubpackageDMO mycore;

    public TestDerivedSubpackageDMW() {
        super(new TestDerivedSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedSubpackage);
        mycore = (TestDerivedSubpackageDMO) core;
        mycore.setContainer(this);
    }

    public TestDerivedSubpackageDMW(TestDerivedSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedSubpackage);
        mycore = (TestDerivedSubpackageDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (TestDerivedSubpackageDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public TestDerivedSubpackageDMO getDMO() {
        return(mycore);
    }

    protected TestDerivedSubpackageDMW(TestDerivedSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (TestDerivedSubpackageDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:776)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestDerivedSubpackageDMW){
            return( getObjectName().equals( ((TestDerivedSubpackageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:994)
    public int getMvStringSize(){
        DmcAttribute<?> attr = mycore.get(TestDerivedSubpackageDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1006)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = mycore.get(TestDerivedSubpackageDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1018)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = mycore.get(TestDerivedSubpackageDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1090)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = mycore.get(TestDerivedSubpackageDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(mycore.getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1106)
    public void addMvString(Object value) throws DmcValueException {
        mycore.addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1118)
    public boolean mvStringContains(String value){
        return(mycore.mvStringContains(value));
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1130)
    public void delMvString(Object value) throws DmcValueException {
        mycore.delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1142)
    public void remMvString(){
        mycore.remMvString();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:920)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:929)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:944)
    public void remName(){
        mycore.remName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public String getSvString(){
        return(mycore.getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:920)
    public void setSvString(Object value) throws DmcValueException {
        mycore.setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:929)
    public void setSvString(String value){
        mycore.setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:944)
    public void remSvString(){
        mycore.remSvString();
    }


}
