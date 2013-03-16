package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.ArrayList;                                                   // Support for MULTI attribute - (BaseDMWGeneratorNewest.java:2087)
import java.util.Iterator;                                                    // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2099)
import org.dmd.dmc.*;                                                         // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dmc.types.StringName;                                          // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // To allow overload of GxtWrapper.set() - (GxtDMWGenerator.java:120)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:942)
import org.dmd.dmt.client.generated.gxt.TestOneLevelSubpackageGXT;            // Derived class - (BaseDMWGeneratorNewest.java:1115)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                             // Attribute mvString from the dmt schema - (BaseDMWGeneratorNewest.java:784)
import org.dmd.dmt.shared.generated.dmo.TestDerivedDiffSubpackageDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1119)


/**
 * The TestDerivedDiffSubpackage test derivation from a different subpackage.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class TestDerivedDiffSubpackageGXT extends TestOneLevelSubpackageGXT implements DmcNamedObjectIF {


    static final int nameID = 2;
    static final int svStringID = 10141;

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:459)
    public TestDerivedDiffSubpackageGXT() {
        super(new TestDerivedDiffSubpackageDMO());
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:464)
    public TestDerivedDiffSubpackageGXT(DmcTypeModifierMV mods) {
        super(new TestDerivedDiffSubpackageDMO(mods));
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:504)
    public TestDerivedDiffSubpackageGXT getModificationRecorder(){
        TestDerivedDiffSubpackageGXT rc = new TestDerivedDiffSubpackageGXT();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public TestDerivedDiffSubpackageDMO getDMO() {
        return((TestDerivedDiffSubpackageDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:544)
    public TestDerivedDiffSubpackageGXT(TestDerivedDiffSubpackageDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1164)
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
        if (obj instanceof TestDerivedDiffSubpackageGXT){
            return( getObjectName().equals( ((TestDerivedDiffSubpackageGXT) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public int getMvStringSize(){
        return(((TestDerivedDiffSubpackageDMO) core).getMvStringSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1542)
    public boolean getMvStringIsEmpty(){
        if (((TestDerivedDiffSubpackageDMO) core).getMvStringSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1552)
    public boolean getMvStringHasValue(){
        if (((TestDerivedDiffSubpackageDMO) core).getMvStringSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1981)
    public Iterator<String> getMvString(){
        return(((TestDerivedDiffSubpackageDMO) core).getMvString());
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1994)
    public void addMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2004)
    public void addMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).addMvString(value);
    }

    /**
     * Returns true if the collection contains the mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2061)
    public boolean mvStringContains(String value){
        return(((TestDerivedDiffSubpackageDMO) core).mvStringContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2103)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2130)
    public void delMvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2139)
    public void delMvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).delMvString(value);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2151)
    public void remMvString(){
        ((TestDerivedDiffSubpackageDMO) core).remMvString();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public StringName getName(){
        return(((TestDerivedDiffSubpackageDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setName(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setName(StringName value){
        ((TestDerivedDiffSubpackageDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remName(){
        ((TestDerivedDiffSubpackageDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public String getSvString(){
        return(((TestDerivedDiffSubpackageDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setSvString(Object value) throws DmcValueException {
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setSvString(String value){
        ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remSvString(){
        ((TestDerivedDiffSubpackageDMO) core).remSvString();
    }

    @Override
    public <X> X set(String property, X value) {
        DmcAttributeInfo ai = core.getAttributeInfo(property);
			
			if (ai == null)
				throw(new IllegalStateException("Unknown attribute: " + property + " for class: " + core.getConstructionClassName()));

			if (ai.valueType != ValueTypeEnum.SINGLE)
				throw(new IllegalStateException("The set() method only supports single-valued attributes. This attribute is multi-valued: " + property));

			X oldValue = get(property);
			
			try {
				switch(ai.id){

				case nameID:
				    ((TestDerivedDiffSubpackageDMO) core).setName(value);
				    break;
				case svStringID:
				    ((TestDerivedDiffSubpackageDMO) core).setSvString(value);
				    break;

			    }
	        } catch (DmcValueException e) {
		        throw(new IllegalStateException(e));
	        }

			notifyPropertyChanged(property, value, oldValue);
			return(oldValue);
		}

}
