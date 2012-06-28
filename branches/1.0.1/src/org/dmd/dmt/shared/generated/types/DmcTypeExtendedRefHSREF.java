package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ExtendedRefHSDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ExtendedRefHS
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:197)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeExtendedRefHSREF extends DmcAttribute<ExtendedRefHSDMO> implements Serializable {

    public DmcTypeExtendedRefHSREF(){
    }

    public DmcTypeExtendedRefHSREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected ExtendedRefHSDMO typeCheck(Object value) throws DmcValueException {
        if (value instanceof ExtendedRefHSDMO)
            return((ExtendedRefHSDMO)value);
        
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ExtendedRefHSDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ExtendedRefHSDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ExtendedRefHSDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        ExtendedRefHSDMO rc = (ExtendedRefHSDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ExtendedRefHSDMO cloneValue(ExtendedRefHSDMO value){
        return((ExtendedRefHSDMO)value.cloneIt());
    }

}
