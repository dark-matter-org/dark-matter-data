package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.dmt.shared.generated.dmo.TestMultiLevelSubpackageDMO; // primitive type
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type TestMultiLevelSubpackage
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:420)
 */
@SuppressWarnings("serial")
public class TestMultiLevelSubpackageREF extends DmcNamedObjectNontransportableREF<TestMultiLevelSubpackageDMO> {

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"DefinitionName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    
    DmcTypeDefinitionNameSV myName;    
    
    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:437)
    public TestMultiLevelSubpackageREF(){
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:441)
    public TestMultiLevelSubpackageREF(TestMultiLevelSubpackageDMO o){
         object = o;
         myName = (DmcTypeDefinitionNameSV)o.getObjectNameAttribute();
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:447)
    public TestMultiLevelSubpackageREF(DefinitionName n) throws DmcValueException {
         object = null;
         myName = new DmcTypeDefinitionNameSV(__name);
         myName.set(n);
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:454)
    public TestMultiLevelSubpackageREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeDefinitionNameSV(__name);
         myName.set(n);
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:461)
    public TestMultiLevelSubpackageREF(TestMultiLevelSubpackageREF original){
        myName = original.myName;
        object = original.object;
    }

    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:467)
    public void setObject(TestMultiLevelSubpackageDMO o){
         object = o;
         if (object != null)
             myName = (DmcTypeDefinitionNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    // Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:477)
    public TestMultiLevelSubpackageREF cloneMe(){
        TestMultiLevelSubpackageREF rc = new TestMultiLevelSubpackageREF();
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
