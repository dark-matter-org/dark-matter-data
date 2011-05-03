package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectFixedREF;

import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestBasicNamedObjectFixed
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:518)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTestBasicNamedObjectFixedREF extends DmcTypeNamedObjectREF<TestBasicNamedObjectFixedREF, StringName> {

    public DmcTypeTestBasicNamedObjectFixedREF(){
    
    }

    public DmcTypeTestBasicNamedObjectFixedREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestBasicNamedObjectFixedREF getNewHelper(){
        return(new TestBasicNamedObjectFixedREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestBasicNamedObjectFixedDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestBasicNamedObjectFixedDMO)
            return(true);
        return(false);
    }

    @Override
    protected TestBasicNamedObjectFixedREF typeCheck(Object value) throws DmcValueException {
        TestBasicNamedObjectFixedREF rc = null;

        if (value instanceof TestBasicNamedObjectFixedREF)
            rc = (TestBasicNamedObjectFixedREF)value;
        else if (value instanceof TestBasicNamedObjectFixedDMO)
            rc = new TestBasicNamedObjectFixedREF((TestBasicNamedObjectFixedDMO)value);
        else if (value instanceof String)
            rc = new TestBasicNamedObjectFixedREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestBasicNamedObjectFixedREF, TestBasicNamedObjectFixedDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TestBasicNamedObjectFixedREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TestBasicNamedObjectFixedREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TestBasicNamedObjectFixedREF rc = new TestBasicNamedObjectFixedREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TestBasicNamedObjectFixedREF cloneValue(TestBasicNamedObjectFixedREF value){
        return(new TestBasicNamedObjectFixedREF(value));
    }



}
