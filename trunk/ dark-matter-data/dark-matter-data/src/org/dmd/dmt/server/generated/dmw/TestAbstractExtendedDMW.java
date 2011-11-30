package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:950)
import org.dmd.dmc.*;                                                    // If any attributes
import org.dmd.dms.*;                                                    // Always 2
import org.dmd.dmt.server.extended.TestAbstractExtended;                 // Required for getModificationRecorder()
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;         // Abstract class
import org.dmd.dmw.DmwWrapper;                                           // Unnamed object wrapper

/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:364)
 */
abstract public class TestAbstractExtendedDMW extends DmwWrapper {

    protected TestAbstractExtendedDMW() {
        super();
    }

    abstract public TestAbstractExtended getModificationRecorder();

    public TestAbstractExtendedDMO getDMO() {
        return((TestAbstractExtendedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:527)
    protected TestAbstractExtendedDMW(TestAbstractExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1129)
    public String getSvString(){
        return(((TestAbstractExtendedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1188)
    public void setSvString(Object value) throws DmcValueException {
        ((TestAbstractExtendedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1197)
    public void setSvString(String value){
        ((TestAbstractExtendedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1223)
    public void remSvString(){
        ((TestAbstractExtendedDMO) core).remSvString();
    }


}
