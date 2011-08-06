package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:813)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;         // Abstract class
import org.dmd.dmw.DmwWrapper;                                        // Unnamed object wrapper

/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:284)
 */
abstract public class TestAbstractFixedDMW extends DmwWrapper {

    protected TestAbstractFixedDMW() {
        super();
    }

    abstract public TestAbstractFixedDMW getModificationRecorder();

    public TestAbstractFixedDMO getDMO() {
        return((TestAbstractFixedDMO) core);
    }

    protected TestAbstractFixedDMW(TestAbstractFixedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:985)
    public String getSvString(){
        return(((TestAbstractFixedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1032)
    public void setSvString(Object value) throws DmcValueException {
        ((TestAbstractFixedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1041)
    public void setSvString(String value){
        ((TestAbstractFixedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1067)
    public void remSvString(){
        ((TestAbstractFixedDMO) core).remSvString();
    }


}
