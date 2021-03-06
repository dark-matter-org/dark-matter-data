package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NamedObjMVDMO;

/**
 * This is the generated DmcAttribute derivative for values of type NamedObjMV
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:197)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeNamedObjMVREF extends DmcAttribute<NamedObjMVDMO> implements Serializable {

    public DmcTypeNamedObjMVREF(){
    }

    public DmcTypeNamedObjMVREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected NamedObjMVDMO typeCheck(Object value) throws DmcValueException {
        if (value instanceof NamedObjMVDMO)
            return((NamedObjMVDMO)value);
        
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NamedObjMVDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, NamedObjMVDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public NamedObjMVDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        NamedObjMVDMO rc = (NamedObjMVDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public NamedObjMVDMO cloneValue(NamedObjMVDMO value){
        return((NamedObjMVDMO)value.cloneIt());
    }

}
