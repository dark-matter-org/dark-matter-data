package org.dmd.dmt.client.generated.gxt;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGeneratorNewest.java:954)
import org.dmd.dms.generated.enums.ValueTypeEnum;                     // To allow overload of GxtWrapper.set() - (GxtDMWGenerator.java:120)
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;         // Abstract class - (BaseDMWGeneratorNewest.java:1097)
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;                         // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:1102)


/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class TestAbstractFixedGXT extends GxtWrapper {


    static final int svStringID = 10141;

    protected TestAbstractFixedGXT() {
        super();
    }

    abstract public TestAbstractFixedGXT getModificationRecorder();

    public TestAbstractFixedDMO getDMO() {
        return((TestAbstractFixedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:538)
    protected TestAbstractFixedGXT(TestAbstractFixedDMO obj) {
        super(obj);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public String getSvString(){
        return(((TestAbstractFixedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1447)
    public void setSvString(Object value) throws DmcValueException {
        ((TestAbstractFixedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1456)
    public void setSvString(String value){
        ((TestAbstractFixedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1482)
    public void remSvString(){
        ((TestAbstractFixedDMO) core).remSvString();
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

				case svStringID:
				    ((TestAbstractFixedDMO) core).setSvString(value);
				    break;

			    }
	        } catch (DmcValueException e) {
		        throw(new IllegalStateException(e));
	        }

			notifyPropertyChanged(property, value, oldValue);
			return(oldValue);
		}

}
