package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestBasicObjectFixed
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:104)
 */
@SuppressWarnings("serial")
public class DmcTypeTestBasicObjectFixedREF extends DmcAttribute<TestBasicObjectFixedDMO> {

    public DmcTypeTestBasicObjectFixedREF(){
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

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (TestBasicObjectFixedDMO t : mv){
                sb.append(t + ", ");
            }
            return(sb.toString());
        }
        else
            return(sv.toString());

    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeTestBasicObjectFixedREF getOneOfMe(){
        DmcTypeTestBasicObjectFixedREF rc = new DmcTypeTestBasicObjectFixedREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestBasicObjectFixedDMO cloneValue(TestBasicObjectFixedDMO val){
        return(null);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    @Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    }
    
    @Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
    }
    
    @Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
    }
}
