package org.dmd.dmt.server.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:826)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;         // Abstract class

/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:340)
 */
public class TestAbstractFixedDMW extends DmwWrapper {

    private TestAbstractFixedDMO mycore;

    protected TestAbstractFixedDMW() {
        super();
    }

    public TestAbstractFixedDMO getDMO() {
        return(mycore);
    }

    protected TestAbstractFixedDMW(TestAbstractFixedDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (TestAbstractFixedDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:956)
    public String getSvString(){
        return(mycore.getSvString());
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1003)
    public void setSvString(Object value) throws DmcValueException {
        mycore.setSvString(value);
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1012)
    public void setSvString(String value){
        mycore.setSvString(value);
    }

    /**
     * Removes the svString attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1027)
    public void remSvString(){
        mycore.remSvString();
    }


}
