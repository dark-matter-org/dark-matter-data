package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO; // primitive type
import org.dmd.dmc.types.IntegerName;
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type IntegerNamedObject
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:351)
 */
@SuppressWarnings("serial")
public class IntegerNamedObjectREF extends DmcNamedObjectNontransportableREF<IntegerNamedObjectDMO> {

    public final static DmcAttributeInfo __integerName = new DmcAttributeInfo("integerName",100,"IntegerName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeIntegerNameSV myName;    
    
    public IntegerNamedObjectREF(){
    }

    public IntegerNamedObjectREF(IntegerNamedObjectDMO o){
         object = o;
         myName = (DmcTypeIntegerNameSV)o.getObjectNameAttribute();
    }

    public IntegerNamedObjectREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeIntegerNameSV();
         myName.set(n);
    }

    public IntegerNamedObjectREF(IntegerNamedObjectREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(IntegerNamedObjectDMO o){
         object = o;
         myName = (DmcTypeIntegerNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public IntegerNamedObjectREF cloneMe(){
        IntegerNamedObjectREF rc = new IntegerNamedObjectREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null);
            myName = new DmcTypeIntegerNameSV(__integerName);
        myName.set(n);
    }

    @Override
    public DmcObjectName getObjectName(){
        return(myName.getSV());
    }

    public IntegerName getName(){
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
        myName = (DmcTypeIntegerNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
