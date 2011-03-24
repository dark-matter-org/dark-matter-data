package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmt.shared.generated.dmo.TestOneLevelSubpackageExtendedDMO;
import org.dmd.dmc.types.DmcTypeStringName;

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type TestOneLevelSubpackageExtended
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:428)
 */
@SuppressWarnings("serial")
public class TestOneLevelSubpackageExtendedREF extends DmcNamedObjectNontransportableREF<TestOneLevelSubpackageExtendedDMO> {

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeStringName myName;    

    public TestOneLevelSubpackageExtendedREF(){
    }

    public TestOneLevelSubpackageExtendedREF(TestOneLevelSubpackageExtendedREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(TestOneLevelSubpackageExtendedDMO o){
         object = o;
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
            myName = new  DmcTypeStringName(__name);
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



}
