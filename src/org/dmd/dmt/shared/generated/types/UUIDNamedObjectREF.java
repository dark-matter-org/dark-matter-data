package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO; // primitive type
import org.dmd.dmc.types.UUIDName;
import org.dmd.dms.generated.types.DmcTypeUUIDNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type UUIDNamedObject
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:420)
 */
@SuppressWarnings("serial")
public class UUIDNamedObjectREF extends DmcNamedObjectNontransportableREF<UUIDNamedObjectDMO> {

    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("uuidName",101,"UUIDName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    
    DmcTypeUUIDNameSV myName;    
    
    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:437)
    public UUIDNamedObjectREF(){
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:441)
    public UUIDNamedObjectREF(UUIDNamedObjectDMO o){
         object = o;
         myName = (DmcTypeUUIDNameSV)o.getObjectNameAttribute();
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:447)
    public UUIDNamedObjectREF(UUIDName n) throws DmcValueException {
         object = null;
         myName = new DmcTypeUUIDNameSV(__uuidName);
         myName.set(n);
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:454)
    public UUIDNamedObjectREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeUUIDNameSV(__uuidName);
         myName.set(n);
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:461)
    public UUIDNamedObjectREF(UUIDNamedObjectREF original){
        myName = original.myName;
        object = original.object;
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:467)
    public void setObject(UUIDNamedObjectDMO o){
         object = o;
         if (object != null)
             myName = (DmcTypeUUIDNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:477)
    public UUIDNamedObjectREF cloneMe(){
        UUIDNamedObjectREF rc = new UUIDNamedObjectREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null)
            myName = new DmcTypeUUIDNameSV(__uuidName);
        myName.set(n);
    }

    public DmcObjectName getObjectName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public UUIDName getName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName);
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        myName.serializeIt(dos);
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeUUIDNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
