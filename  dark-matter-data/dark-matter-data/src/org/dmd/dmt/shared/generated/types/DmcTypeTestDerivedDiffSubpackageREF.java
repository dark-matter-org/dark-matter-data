package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestDerivedDiffSubpackageREF;

import org.dmd.dmt.shared.generated.dmo.TestDerivedDiffSubpackageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestDerivedDiffSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:606)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTestDerivedDiffSubpackageREF extends DmcTypeNamedObjectREF<TestDerivedDiffSubpackageREF, StringName> {

    public DmcTypeTestDerivedDiffSubpackageREF(){
    
    }

    public DmcTypeTestDerivedDiffSubpackageREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestDerivedDiffSubpackageREF getNewHelper(){
        return(new TestDerivedDiffSubpackageREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestDerivedDiffSubpackageDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestDerivedDiffSubpackageDMO)
            return(true);
        return(false);
    }

    @Override
    protected TestDerivedDiffSubpackageREF typeCheck(Object value) throws DmcValueException {
        TestDerivedDiffSubpackageREF rc = null;

        if (value instanceof TestDerivedDiffSubpackageREF)
            rc = (TestDerivedDiffSubpackageREF)value;
        else if (value instanceof TestDerivedDiffSubpackageDMO)
            rc = new TestDerivedDiffSubpackageREF((TestDerivedDiffSubpackageDMO)value);
        else if (value instanceof String)
            rc = new TestDerivedDiffSubpackageREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestDerivedDiffSubpackageREF, TestDerivedDiffSubpackageDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TestDerivedDiffSubpackageREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TestDerivedDiffSubpackageREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TestDerivedDiffSubpackageREF rc = new TestDerivedDiffSubpackageREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TestDerivedDiffSubpackageREF cloneValue(TestDerivedDiffSubpackageREF value){
        return(new TestDerivedDiffSubpackageREF(value));
    }



}
