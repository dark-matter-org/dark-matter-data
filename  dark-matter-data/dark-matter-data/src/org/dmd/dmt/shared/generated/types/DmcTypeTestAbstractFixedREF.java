package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestAbstractFixedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestAbstractFixed
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:106)
 */
@SuppressWarnings("serial")
public class DmcTypeTestAbstractFixedREF extends DmcAttribute<TestAbstractFixedDMO> {

    public DmcTypeTestAbstractFixedREF(){
    }

    public DmcTypeTestAbstractFixedREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected TestAbstractFixedDMO typeCheck(Object value) throws DmcValueException {
        TestAbstractFixedDMO rc = null;

        if (value instanceof TestAbstractFixedDMO){
            rc = (TestAbstractFixedDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestAbstractFixedDMO expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (TestAbstractFixedDMO t : mv){
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
    public DmcTypeTestAbstractFixedREF getOneOfMe(){
        DmcTypeTestAbstractFixedREF rc = new DmcTypeTestAbstractFixedREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestAbstractFixedDMO cloneValue(TestAbstractFixedDMO val){
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