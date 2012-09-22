package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;

/**
 * This is the generated DmcAttribute derivative for values of type ClientCountFilter
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:197)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeClientCountFilterREF extends DmcAttribute<ClientCountFilterDMO> implements Serializable {

    public DmcTypeClientCountFilterREF(){
    }

    public DmcTypeClientCountFilterREF(DmcAttributeInfo ai){
        super(ai);
    }

    protected ClientCountFilterDMO typeCheck(Object value) throws DmcValueException {
        if (value instanceof ClientCountFilterDMO)
            return((ClientCountFilterDMO)value);
        
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ClientCountFilterDMO expected."));
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ClientCountFilterDMO value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ClientCountFilterDMO deserializeValue(DmcInputStreamIF dis) throws Exception {
        ClientCountFilterDMO rc = (ClientCountFilterDMO)dis.getDMOInstance(dis);
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public ClientCountFilterDMO cloneValue(ClientCountFilterDMO value){
        return((ClientCountFilterDMO)value.cloneIt());
    }

}
