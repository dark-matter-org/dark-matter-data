package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types.UserREF;

import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo.UserDMO;

/**
 * This is the generated DmcAttribute derivative for values of type User
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:439)
 */
@SuppressWarnings("serial")
public class DmcTypeUserREF extends DmcTypeNamedObjectREF<UserREF, StringName> {

    public DmcTypeUserREF(){
    
    }

    public DmcTypeUserREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected UserREF getNewHelper(){
        return(new UserREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( UserDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof UserDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of this attribute.
     */
    public DmcTypeUserREF cloneMe(){
        DmcTypeUserREF rc = new DmcTypeUserREF();
        if (mv == null){
            rc.sv = sv.cloneMe();
        }
        else{
            rc.mv = new ArrayList<UserREF>();
            for(UserREF val : mv){
                rc.mv.add(val.cloneMe());
            }
        }
        return(rc);
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeUserREF getOneOfMe(){
        DmcTypeUserREF rc = new DmcTypeUserREF();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public UserREF cloneValue(UserREF val){
        UserREF rc = new UserREF(val);
        return(rc);
    }



}
