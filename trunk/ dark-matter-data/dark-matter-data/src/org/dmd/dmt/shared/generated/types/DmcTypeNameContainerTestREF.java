package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREF;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;

/**
 * This is the generated DmcAttribute derivative for values of type NameContainerTest
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:165)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeNameContainerTestREF extends DmcAttribute<NameContainerTestDMO> implements Serializable {

    public DmcTypeNameContainerTestREF(){
    }

    public DmcTypeNameContainerTestREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected NameContainerTestDMO typeCheck(Object value) throws DmcValueException {
        NameContainerTestDMO rc = null;

        if (value instanceof NameContainerTestDMO){
            rc = (NameContainerTestDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NameContainerTestDMO expected."));
        }
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, NameContainerTestDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public NameContainerTestDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        DmcTypeClassDefinitionREF	oc   = (DmcTypeClassDefinitionREF) dis.getAttributeInstance();
        oc.deserializeIt(dis);
        NameContainerTestDMO rc = (NameContainerTestDMO)dis.getDMOInstance(oc.getMVnth(0).getObjectName().getNameString());
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public NameContainerTestDMO cloneValue(NameContainerTestDMO value){
        return((NameContainerTestDMO)value.cloneIt());
    }

}
