package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestBasicObjectFixed
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:144)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTestBasicObjectFixedREF extends DmcAttribute<TestBasicObjectFixedDMO> implements Serializable {

    public DmcTypeTestBasicObjectFixedREF(){
    }

    public DmcTypeTestBasicObjectFixedREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected TestBasicObjectFixedDMO typeCheck(Object value) throws DmcValueException {
        TestBasicObjectFixedDMO rc = null;

        if (value instanceof TestBasicObjectFixedDMO){
            rc = (TestBasicObjectFixedDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestBasicObjectFixedDMO expected."));
        }
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TestBasicObjectFixedDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TestBasicObjectFixedDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        TestBasicObjectFixedDMO rc = new TestBasicObjectFixedDMO();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public TestBasicObjectFixedDMO cloneValue(TestBasicObjectFixedDMO value){
        return((TestBasicObjectFixedDMO)value.cloneIt());
    }

}
