package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.dmt.shared.generated.types.TestOneLevelSubpackageREF;

import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestOneLevelSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:496)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTestOneLevelSubpackageREF extends DmcTypeNamedObjectREF<TestOneLevelSubpackageREF, StringName> {

    public DmcTypeTestOneLevelSubpackageREF(){
    
    }

    public DmcTypeTestOneLevelSubpackageREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected TestOneLevelSubpackageREF getNewHelper(){
        return(new TestOneLevelSubpackageREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( TestOneLevelSubpackageDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TestOneLevelSubpackageDMO)
            return(true);
        return(false);
    }

    @Override
    protected TestOneLevelSubpackageREF typeCheck(Object value) throws DmcValueException {
        TestOneLevelSubpackageREF rc = null;

        if (value instanceof TestOneLevelSubpackageREF)
            rc = (TestOneLevelSubpackageREF)value;
        else if (value instanceof TestOneLevelSubpackageDMO)
            rc = new TestOneLevelSubpackageREF((TestOneLevelSubpackageDMO)value);
        else if (value instanceof String)
            rc = new TestOneLevelSubpackageREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestOneLevelSubpackageREF, TestOneLevelSubpackageDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TestOneLevelSubpackageREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TestOneLevelSubpackageREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TestOneLevelSubpackageREF rc = new TestOneLevelSubpackageREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TestOneLevelSubpackageREF cloneValue(TestOneLevelSubpackageREF value){
        return(new TestOneLevelSubpackageREF(value));
    }



}
