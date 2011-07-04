package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.StringName;

import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types.UserGroupREF;

import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo.UserGroupDMO;

/**
 * This is the generated DmcAttribute derivative for values of type UserGroup
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:548)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeUserGroupREF extends DmcTypeNamedObjectREF<UserGroupREF, StringName> {

    public DmcTypeUserGroupREF(){
    
    }

    public DmcTypeUserGroupREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected UserGroupREF getNewHelper(){
        return(new UserGroupREF());
    }

    @Override
    protected StringName getNewName(){
        return(new StringName());
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

    @Override
    protected UserGroupREF typeCheck(Object value) throws DmcValueException {
        UserGroupREF rc = null;

        if (value instanceof UserGroupREF)
            rc = (UserGroupREF)value;
        else if (value instanceof UserGroupDMO)
            rc = new UserGroupREF((UserGroupDMO)value);
        else if (value instanceof StringName)
            rc = new UserGroupREF((StringName)value);
        else if (value instanceof String)
            rc = new UserGroupREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with UserGroupREF, UserGroupDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, UserGroupREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public UserGroupREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        UserGroupREF rc = new UserGroupREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public UserGroupREF cloneValue(UserGroupREF value){
        return(new UserGroupREF(value));
    }



}
