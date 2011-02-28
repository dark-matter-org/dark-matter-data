package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo.UserDMO;

/**
 * This is the generated DmcAttribute derivative for values of type User
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:357)
 */
@SuppressWarnings("serial")
public class UserREF extends DmcNamedObjectNontransportableREF<UserDMO> {

    public UserREF(){
    }

    public UserREF(UserREF original){
        name   = original.name;
        object = original.object;
    }

    public void setObject(UserDMO o){
         object = o;
    }

    /**
     * Clones this reference.
     */
    public UserREF cloneMe(){
        UserREF rc = new UserREF();
        rc.name   = name;
        rc.object = object;
        return(rc);
    }



}
