package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:613)
import java.util.*;                                                      // If not auxiliary
import org.dmd.dmc.*;                                                    // Always 2
import org.dmd.dms.*;                                                    // Always 3
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;         // Abstract class

/**
 * The TestAbstract class just defines an abstract base class from which
 * other test classes can be derived to tes this type of derivation.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:291)
 */
public class TestAbstractExtendedDMW extends DmwWrapper {

    private TestAbstractExtendedDMO mycore;

    protected TestAbstractExtendedDMW(TestAbstractExtendedDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (TestAbstractExtendedDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmt.server.extended.TestAbstractExtended>());
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:728)
    public String getSvStringValue(){
        return(mycore.getSvStringValue());
    }

    /**
     * Sets svStringValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:756)
    public void setSvStringValue(Object value) throws DmcValueException {
        mycore.setSvStringValue(value);
    }

    /**
     * Removes the svStringValue attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:767)
    public void remSvStringValue(){
        mycore.remSvStringValue();
    }


}