package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmt.shared.generated.dmo.IntegerNamedObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type IntegerNamedObject
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:369)
 */
@SuppressWarnings("serial")
public class IntegerNamedObjectREF extends DmcNamedObjectNontransportableREF<IntegerNamedObjectDMO> {

    public IntegerNamedObjectREF(){
    }

    public IntegerNamedObjectREF(IntegerNamedObjectREF original){
        name   = original.name;
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
        rc.name   = name;
        rc.object = object;
        return(rc);
    }



}
