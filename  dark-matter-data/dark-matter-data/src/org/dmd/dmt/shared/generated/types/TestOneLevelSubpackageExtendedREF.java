package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO;
import org.dmd.dms.generated.types.DmcTypeStringNameSV;

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type TestOneLevelSubpackageExtended
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:350)
 */
@SuppressWarnings("serial")
public class TestOneLevelSubpackageExtendedREF extends DmcNamedObjectNontransportableREF<TestOneLevelSubpackageExtendedDMO> {

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeStringNameSV myName;    
    
    public TestOneLevelSubpackageExtendedREF(){
    }

    public TestOneLevelSubpackageExtendedREF(TestOneLevelSubpackageExtendedDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    public TestOneLevelSubpackageExtendedREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeStringNameSV();
         myName.set(n);
    }

    public TestOneLevelSubpackageExtendedREF(TestOneLevelSubpackageExtendedREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(TestOneLevelSubpackageExtendedDMO o){
         object = o;
         myName = (DmcTypeStringNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public TestOneLevelSubpackageExtendedREF cloneMe(){
        TestOneLevelSubpackageExtendedREF rc = new TestOneLevelSubpackageExtendedREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectNameIF n) throws DmcValueException {
        if (myName == null);
            myName = new DmcTypeStringNameSV(__name);
        myName.set(n);
    }

    @Override
    public DmcObjectNameIF getObjectName(){
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
