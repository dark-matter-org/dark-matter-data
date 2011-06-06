package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
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
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:543)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeUserREF extends DmcTypeNamedObjectREF<UserREF, StringName> {

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

    @Override
    protected UserREF typeCheck(Object value) throws DmcValueException {
        UserREF rc = null;

        if (value instanceof UserREF)
            rc = (UserREF)value;
        else if (value instanceof UserDMO)
            rc = new UserREF((UserDMO)value);
        else if (value instanceof StringName)
            rc = new UserREF((StringName)value);
        else if (value instanceof String)
            rc = new UserREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with UserREF, UserDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, UserREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public UserREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        UserREF rc = new UserREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public UserREF cloneValue(UserREF value){
        return(new UserREF(value));
    }



}
