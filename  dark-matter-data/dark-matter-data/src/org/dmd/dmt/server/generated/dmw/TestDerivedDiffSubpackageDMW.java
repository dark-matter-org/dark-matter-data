package org.dmd.dmt.server.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import java.util.ArrayList;                                                         // To support getMVCopy()
import java.util.Iterator;                                                          // To support getMVCopy()
import org.dmd.dmc.*;                                                               // If any attributes
import org.dmd.dmc.types.StringName;                                                // Primitive type
import org.dmd.dms.*;                                                               // Always 2
import org.dmd.dms.generated.dmw.StringIterableDMW;                                 // For multi-valued String
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor
import org.dmd.dmt.server.extended.subpack.multi.TestDerivedDiffSubpackage;         // Required for getModificationRecorder()
import org.dmd.dmt.server.generated.dmw.TestOneLevelSubpackageDMW;                  // Derived class
import org.dmd.dmt.shared.generated.dmo.TestDerivedDiffSubpackageDMO;               // Class not auxiliary or abstract

/**
 * The TestDerivedDiffSubpackage test derivation from a different subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class TestDerivedDiffSubpackageDMW extends TestOneLevelSubpackageDMW implements DmcNamedObjectIF {

    public TestDerivedDiffSubpackageDMW() {
        super(new TestDerivedDiffSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    public TestDerivedDiffSubpackageDMW(DmcTypeModifierMV mods) {
        super(new TestDerivedDiffSubpackageDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    public TestDerivedDiffSubpackage getModificationRecorder(){
        TestDerivedDiffSubpackage rc = new TestDerivedDiffSubpackage();
        rc.setDmcObject(new TestDerivedDiffSubpackageDMO(new DmcTypeModifierMV()));
        rc.setName(getName());
        return(rc);
    }

    public TestDerivedDiffSubpackageDMW(TestDerivedDiffSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestDerivedDiffSubpackage);
    }

    public TestDerivedDiffSubpackageDMO getDMO() {
        return((TestDerivedDiffSubpackageDMO) core);
    }

    protected TestDerivedDiffSubpackageDMW(TestDerivedDiffSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:875)
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1146)
    public int getMvStringSize(){
        DmcAttribute<?> attr = core.get(TestDerivedDiffSubpackageDMO.__mvString);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1158)
    public boolean getMvStringIsEmpty(){
        DmcAttribute<?> attr = core.get(TestDerivedDiffSubpackageDMO.__mvString);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1170)
    public boolean getMvStringHasValue(){
        DmcAttribute<?> attr = core.get(TestDerivedDiffSubpackageDMO.__mvString);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1281)
    public StringIterableDMW getMvStringIterable(){
        DmcAttribute<?> attr = core.get(TestDerivedDiffSubpackageDMO.__mvString);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TestDerivedDiffSubpackageDMO) core).getMvString()));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1297)
    public void addMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1306)
    public void addMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1318)
    public boolean mvStringContains(String value){
        return(((TestDerivedDiffSubpackageDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1346)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getMvStringCopy(){
        DmcAttribute<?> attr = core.get(TestDerivedDiffSubpackageDMO.__mvString);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1373)
    public void delMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void remMvString(){
        ((TestDerivedDiffSubpackageDMO) core).remMvString();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public StringName getName(){
        return(((TestDerivedDiffSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setName(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setName(StringName value){
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remName(){
        ((TestDerivedDiffSubpackageDMO) core).remName();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public String getSvString(){
        return(((TestDerivedDiffSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1059)
    public void setSvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1068)
    public void setSvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1094)
    public void remSvString(){
        ((TestDerivedDiffSubpackageDMO) core).remSvString();
    }


}
