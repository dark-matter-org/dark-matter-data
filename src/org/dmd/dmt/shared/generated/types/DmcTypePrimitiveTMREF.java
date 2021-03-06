package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.PrimitiveTMDMO;

/**
 * This is the generated DmcAttribute derivative for values of type PrimitiveTM
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:197)
 */
@SuppressWarnings("serial")
abstract public class DmcTypePrimitiveTMREF extends DmcAttribute<PrimitiveTMDMO> implements Serializable {

    public DmcTypePrimitiveTMREF(){
    }

    public DmcTypePrimitiveTMREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected PrimitiveTMDMO typeCheck(Object value) throws DmcValueException {
        if (value instanceof PrimitiveTMDMO)
            return((PrimitiveTMDMO)value);
        
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with PrimitiveTMDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, PrimitiveTMDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public PrimitiveTMDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        PrimitiveTMDMO rc = (PrimitiveTMDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public PrimitiveTMDMO cloneValue(PrimitiveTMDMO value){
        return((PrimitiveTMDMO)value.cloneIt());
    }

}
