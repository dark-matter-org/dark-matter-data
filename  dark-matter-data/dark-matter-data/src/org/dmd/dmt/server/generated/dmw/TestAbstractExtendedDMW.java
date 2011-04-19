package org.dmd.dmt.server.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                                    // If any attributes
import org.dmd.dms.*;                                                    // Always 2
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;         // Abstract class

/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class TestAbstractExtendedDMW extends DmwWrapper {

    protected TestAbstractExtendedDMW() {
        super();
    }

    public TestAbstractExtendedDMO getDMO() {
        return((TestAbstractExtendedDMO) core);
    }

    protected TestAbstractExtendedDMW(TestAbstractExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1008)
    public String getSvString(){
        return(((TestAbstractExtendedDMO) core).getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1055)
    public void setSvString(Object value) throws DmcValueException {
        ((TestAbstractExtendedDMO) core).setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1064)
    public void setSvString(String value){
        ((TestAbstractExtendedDMO) core).setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public void remSvString(){
        ((TestAbstractExtendedDMO) core).remSvString();
    }


}
