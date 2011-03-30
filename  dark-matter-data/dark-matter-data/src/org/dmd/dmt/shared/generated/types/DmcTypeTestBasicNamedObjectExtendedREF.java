package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectExtendedREF;

import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectExtendedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestBasicNamedObjectExtended
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:606)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTestBasicNamedObjectExtendedREF extends DmcTypeNamedObjectREF<TestBasicNamedObjectExtendedREF, StringName> {

    public DmcTypeTestBasicNamedObjectExtendedREF(){
    
    }

    public DmcTypeTestBasicNamedObjectExtendedREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestBasicNamedObjectExtendedREF getNewHelper(){
        return(new TestBasicNamedObjectExtendedREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestBasicNamedObjectExtendedDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestBasicNamedObjectExtendedDMO)
            return(true);
        return(false);
    }

    @Override
    protected TestBasicNamedObjectExtendedREF typeCheck(Object value) throws DmcValueException {
        TestBasicNamedObjectExtendedREF rc = null;

        if (value instanceof TestBasicNamedObjectExtendedREF)
            rc = (TestBasicNamedObjectExtendedREF)value;
        else if (value instanceof TestBasicNamedObjectExtendedDMO)
            rc = new TestBasicNamedObjectExtendedREF((TestBasicNamedObjectExtendedDMO)value);
        else if (value instanceof String)
            rc = new TestBasicNamedObjectExtendedREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestBasicNamedObjectExtendedREF, TestBasicNamedObjectExtendedDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TestBasicNamedObjectExtendedREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TestBasicNamedObjectExtendedREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TestBasicNamedObjectExtendedREF rc = new TestBasicNamedObjectExtendedREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TestBasicNamedObjectExtendedREF cloneValue(TestBasicNamedObjectExtendedREF value){
        return(new TestBasicNamedObjectExtendedREF(value));
    }



}
