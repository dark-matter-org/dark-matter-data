package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestMultiLevelSubpackageREF;

import org.dmd.dmt.shared.generated.dmo.TestMultiLevelSubpackageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestMultiLevelSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:509)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTestMultiLevelSubpackageREF extends DmcTypeNamedObjectREF<TestMultiLevelSubpackageREF, StringName> {

    public DmcTypeTestMultiLevelSubpackageREF(){
    
    }

    public DmcTypeTestMultiLevelSubpackageREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestMultiLevelSubpackageREF getNewHelper(){
        return(new TestMultiLevelSubpackageREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestMultiLevelSubpackageDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestMultiLevelSubpackageDMO)
            return(true);
        return(false);
    }

    @Override
    protected TestMultiLevelSubpackageREF typeCheck(Object value) throws DmcValueException {
        TestMultiLevelSubpackageREF rc = null;

        if (value instanceof TestMultiLevelSubpackageREF)
            rc = (TestMultiLevelSubpackageREF)value;
        else if (value instanceof TestMultiLevelSubpackageDMO)
            rc = new TestMultiLevelSubpackageREF((TestMultiLevelSubpackageDMO)value);
        else if (value instanceof String)
            rc = new TestMultiLevelSubpackageREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestMultiLevelSubpackageREF, TestMultiLevelSubpackageDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TestMultiLevelSubpackageREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TestMultiLevelSubpackageREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TestMultiLevelSubpackageREF rc = new TestMultiLevelSubpackageREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TestMultiLevelSubpackageREF cloneValue(TestMultiLevelSubpackageREF value){
        return(new TestMultiLevelSubpackageREF(value));
    }



}
