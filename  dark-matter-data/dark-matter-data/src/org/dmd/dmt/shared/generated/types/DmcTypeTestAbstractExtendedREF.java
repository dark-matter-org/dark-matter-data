package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;

/**
 * This is the generated DmcAttribute derivative for values of type TestAbstractExtended
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:104)
 */
@SuppressWarnings("serial")
public class DmcTypeTestAbstractExtendedREF extends DmcAttribute<TestAbstractExtendedDMO> {

    public DmcTypeTestAbstractExtendedREF(){
    }

    protected TestAbstractExtendedDMO typeCheck(Object value) throws DmcValueException {
        TestAbstractExtendedDMO rc = null;

        if (value instanceof TestAbstractExtendedDMO){
            rc = (TestAbstractExtendedDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with TestAbstractExtendedDMO expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (TestAbstractExtendedDMO t : mv){
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
    public DmcTypeTestAbstractExtendedREF getOneOfMe(){
        DmcTypeTestAbstractExtendedREF rc = new DmcTypeTestAbstractExtendedREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public TestAbstractExtendedDMO cloneValue(TestAbstractExtendedDMO val){
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
