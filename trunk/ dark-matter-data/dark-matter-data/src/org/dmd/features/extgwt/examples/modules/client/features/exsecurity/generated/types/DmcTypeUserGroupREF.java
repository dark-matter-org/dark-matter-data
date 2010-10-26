package org.dmd.features.extgwt.examples.modules.client.features.exsecurity.generated.types;

import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.features.extgwt.examples.modules.client.features.exsecurity.generated.types.UserGroupREF;

import org.dmd.features.extgwt.examples.modules.client.features.exsecurity.generated.dmo.UserGroupDMO;

/**
 * This is the generated DmcAttribute derivative for values of type UserGroup
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:298)
 */
@SuppressWarnings("serial")
public class DmcTypeUserGroupREF extends DmcTypeNamedObjectREF<UserGroupREF> {

    public DmcTypeUserGroupREF(){
    }

    @Override
    protected UserGroupREF getNewHelper(){
        return( new UserGroupREF());
    }

    @Override
    protected String getDMOClassName(){
        return( UserGroupDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof UserGroupDMO)
            return(true);
        return(false);
    }



}
