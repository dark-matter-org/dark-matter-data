package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO; // primitive type
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type TestBasicNamedObjectFixed
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:420)
 */
@SuppressWarnings("serial")
public class TestBasicNamedObjectFixedREF extends DmcNamedObjectNontransportableREF<TestBasicNamedObjectFixedDMO> {

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"DefinitionName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    
    DmcTypeDefinitionNameSV myName;    
    
    public TestBasicNamedObjectFixedREF(){
    }

    public TestBasicNamedObjectFixedREF(TestBasicNamedObjectFixedDMO o){
         object = o;
         myName = (DmcTypeDefinitionNameSV)o.getObjectNameAttribute();
    }

    public TestBasicNamedObjectFixedREF(DefinitionName n) throws DmcValueException {
         object = null;
         myName = new DmcTypeDefinitionNameSV(__name);
         myName.set(n);
    }

    public TestBasicNamedObjectFixedREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeDefinitionNameSV(__name);
         myName.set(n);
    }

    public TestBasicNamedObjectFixedREF(TestBasicNamedObjectFixedREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(TestBasicNamedObjectFixedDMO o){
         object = o;
         if (object != null)
             myName = (DmcTypeDefinitionNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public TestBasicNamedObjectFixedREF cloneMe(){
        TestBasicNamedObjectFixedREF rc = new TestBasicNamedObjectFixedREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null)
            myName = new DmcTypeDefinitionNameSV(__name);
        myName.set(n);
    }

    public DmcObjectName getObjectName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public DefinitionName getName(){
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
        myName = (DmcTypeDefinitionNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
