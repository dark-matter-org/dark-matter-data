package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmt.shared.generated.dmo.TestDerivedSubpackageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestDerivedSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:369)
 */
@SuppressWarnings("serial")
public class TestDerivedSubpackageREF extends DmcNamedObjectNontransportableREF<TestDerivedSubpackageDMO> {

    public TestDerivedSubpackageREF(){
    }

    public TestDerivedSubpackageREF(TestDerivedSubpackageREF original){
        name   = original.name;
        object = original.object;
    }

    public void setObject(TestDerivedSubpackageDMO o){
         object = o;
    }

    /**
     * Clones this reference.
     */
    public TestDerivedSubpackageREF cloneMe(){
        TestDerivedSubpackageREF rc = new TestDerivedSubpackageREF();
        rc.name   = name;
        rc.object = object;
        return(rc);
    }



}
