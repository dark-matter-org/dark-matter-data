package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.dmt.shared.generated.dmo.TestDerivedDiffSubpackageDMO; // primitive type
import org.dmd.dmc.types.StringName;
import org.dmd.dms.generated.types.DmcTypeStringNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type TestDerivedDiffSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:420)
 */
@SuppressWarnings("serial")
public class TestDerivedDiffSubpackageREF extends DmcNamedObjectNontransportableREF<TestDerivedDiffSubpackageDMO> {

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    
    DmcTypeStringNameSV myName;    
    
    public TestDerivedDiffSubpackageREF(){
    }

    public TestDerivedDiffSubpackageREF(TestDerivedDiffSubpackageDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    public TestDerivedDiffSubpackageREF(StringName n) throws DmcValueException {
         object = null;
         myName = new DmcTypeStringNameSV(__name);
         myName.set(n);
    }

    public TestDerivedDiffSubpackageREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeStringNameSV(__name);
         myName.set(n);
    }

    public TestDerivedDiffSubpackageREF(TestDerivedDiffSubpackageREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(TestDerivedDiffSubpackageDMO o){
         object = o;
         if (object != null)
             myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public TestDerivedDiffSubpackageREF cloneMe(){
        TestDerivedDiffSubpackageREF rc = new TestDerivedDiffSubpackageREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null)
            myName = new DmcTypeStringNameSV(__name);
        myName.set(n);
    }

    @Override
    public DmcObjectName getObjectName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public StringName getName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
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
