package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo.UserGroupDMO;

/**
 * This is the generated DmcAttribute derivative for values of type UserGroup
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:359)
 */
@SuppressWarnings("serial")
public class UserGroupREF extends DmcNamedObjectNontransportableREF<UserGroupDMO> {

    public UserGroupREF(){
    }

    public UserGroupREF(UserGroupREF original){
        name   = original.name;
        object = original.object;
    }

    public void setObject(UserGroupDMO o){
         object = o;
    }

    /**
     * Clones this reference.
     */
    public UserGroupREF cloneMe(){
        UserGroupREF rc = new UserGroupREF();
        rc.name   = name;
        rc.object = object;
        return(rc);
    }



}
