package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo.UserDMO;
import org.dmd.dms.generated.types.DmcTypeStringNameSV;

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type User
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:350)
 */
@SuppressWarnings("serial")
public class UserREF extends DmcNamedObjectNontransportableREF<UserDMO> {

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeStringNameSV myName;    
    
    public UserREF(){
    }

    public UserREF(UserDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    public UserREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeStringNameSV();
         myName.set(n);
    }

    public UserREF(UserREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(UserDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public UserREF cloneMe(){
        UserREF rc = new UserREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null);
            myName = new DmcTypeStringNameSV(__name);
        myName.set(n);
    }

    @Override
    public DmcObjectName getObjectName(){
        return(myName.getSV());
    }

    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        return(myName);
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        myName.serializeIt(dos);
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeStringNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
