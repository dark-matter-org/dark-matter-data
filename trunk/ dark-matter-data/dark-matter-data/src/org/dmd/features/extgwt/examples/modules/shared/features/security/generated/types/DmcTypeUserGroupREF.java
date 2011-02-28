package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types.UserGroupREF;

import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo.UserGroupDMO;

/**
 * This is the generated DmcAttribute derivative for values of type UserGroup
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:421)
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

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeUserGroupREF cloneMe(){
        DmcTypeUserGroupREF rc = new DmcTypeUserGroupREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<UserGroupREF>();
            for(UserGroupREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeUserGroupREF getOneOfMe(){
        DmcTypeUserGroupREF rc = new DmcTypeUserGroupREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public UserGroupREF cloneValue(UserGroupREF val){
        UserGroupREF rc = new UserGroupREF(val);
        return(rc);
    }



}
