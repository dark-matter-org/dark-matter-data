package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ClientCountFilterRequest
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:168)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeClientCountFilterRequestREF extends DmcAttribute<ClientCountFilterRequestDMO> implements Serializable {

    public DmcTypeClientCountFilterRequestREF(){
    }

    public DmcTypeClientCountFilterRequestREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected ClientCountFilterRequestDMO typeCheck(Object value) throws DmcValueException {
        ClientCountFilterRequestDMO rc = null;

        if (value instanceof ClientCountFilterRequestDMO){
            rc = (ClientCountFilterRequestDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ClientCountFilterRequestDMO expected."));
        }
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ClientCountFilterRequestDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ClientCountFilterRequestDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        ClientCountFilterRequestDMO rc = (ClientCountFilterRequestDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ClientCountFilterRequestDMO cloneValue(ClientCountFilterRequestDMO value){
        return((ClientCountFilterRequestDMO)value.cloneIt());
    }

}
