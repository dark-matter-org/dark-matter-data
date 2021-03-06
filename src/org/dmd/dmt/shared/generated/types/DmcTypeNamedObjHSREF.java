package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjHSDMO;

/**
 * This is the generated DmcAttribute derivative for values of type NamedObjHS
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:197)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeNamedObjHSREF extends DmcAttribute<NamedObjHSDMO> implements Serializable {

    public DmcTypeNamedObjHSREF(){
    }

    public DmcTypeNamedObjHSREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected NamedObjHSDMO typeCheck(Object value) throws DmcValueException {
        if (value instanceof NamedObjHSDMO)
            return((NamedObjHSDMO)value);
        
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NamedObjHSDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, NamedObjHSDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public NamedObjHSDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        NamedObjHSDMO rc = (NamedObjHSDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public NamedObjHSDMO cloneValue(NamedObjHSDMO value){
        return((NamedObjHSDMO)value.cloneIt());
    }

}
