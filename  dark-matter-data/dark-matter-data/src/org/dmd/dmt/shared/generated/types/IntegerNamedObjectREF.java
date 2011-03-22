package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;
import org.dmd.dmc.types.DmcTypeIntegerName;

import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type IntegerNamedObject
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:375)
 */
@SuppressWarnings("serial")
public class IntegerNamedObjectREF extends DmcNamedObjectNontransportableREF<IntegerNamedObjectDMO> {

    public final static DmcAttributeInfo __integerName = new DmcAttributeInfo("integerName",10022,"IntegerName",ValueTypeEnum.SINGLE,false);
    
    DmcTypeIntegerName myName;    

    public IntegerNamedObjectREF(){
    }

    public IntegerNamedObjectREF(IntegerNamedObjectREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(IntegerNamedObjectDMO o){
         object = o;
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
    public void setName(DmcObjectNameIF n) throws DmcValueException {
        if (myName == null);
            myName = new  DmcTypeIntegerName(__integerName);
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
