package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjMVIDXDMO;

/**
 * This is the generated DmcAttribute derivative for values of type NamedObjMVIDX
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:197)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeNamedObjMVIDXREF extends DmcAttribute<NamedObjMVIDXDMO> implements Serializable {

    public DmcTypeNamedObjMVIDXREF(){
    }

    public DmcTypeNamedObjMVIDXREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected NamedObjMVIDXDMO typeCheck(Object value) throws DmcValueException {
        if (value instanceof NamedObjMVIDXDMO)
            return((NamedObjMVIDXDMO)value);
        
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NamedObjMVIDXDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, NamedObjMVIDXDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public NamedObjMVIDXDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        NamedObjMVIDXDMO rc = (NamedObjMVIDXDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public NamedObjMVIDXDMO cloneValue(NamedObjMVIDXDMO value){
        return((NamedObjMVIDXDMO)value.cloneIt());
    }

}