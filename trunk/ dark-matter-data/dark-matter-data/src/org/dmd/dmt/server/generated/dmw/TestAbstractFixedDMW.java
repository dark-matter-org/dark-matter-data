package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGeneratorNewest.java:808)
import org.dmd.dms.*;                                                 // Always 2 - (BaseDMWGeneratorNewest.java:793)
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;         // Abstract class - (BaseDMWGeneratorNewest.java:925)
import org.dmd.dmw.DmwWrapper;                                        // Unnamed object wrapper - (BaseDMWGeneratorNewest.java:930)


/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class TestAbstractFixedDMW extends DmwWrapper {

    protected TestAbstractFixedDMW() {
        super();
    }

    abstract public TestAbstractFixedDMW getModificationRecorder();

    public TestAbstractFixedDMO getDMO() {
        return((TestAbstractFixedDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected TestAbstractFixedDMW(TestAbstractFixedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public String getSvString(){
        return(((TestAbstractFixedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setSvString(Object value) throws DmcValueException {
        ((TestAbstractFixedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setSvString(String value){
        ((TestAbstractFixedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remSvString(){
        ((TestAbstractFixedDMO) core).remSvString();
    }


}
