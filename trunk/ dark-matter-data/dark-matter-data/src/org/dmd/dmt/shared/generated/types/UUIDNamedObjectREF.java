package org.dmd.dmt.shared.generated.types;

import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmt.shared.generated.dmo.UUIDNamedObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type UUIDNamedObject
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:369)
 */
@SuppressWarnings("serial")
public class UUIDNamedObjectREF extends DmcNamedObjectNontransportableREF<UUIDNamedObjectDMO> {

    public UUIDNamedObjectREF(){
    }

    public UUIDNamedObjectREF(UUIDNamedObjectREF original){
        name   = original.name;
        object = original.object;
    }

    public void setObject(UUIDNamedObjectDMO o){
         object = o;
    }

    /**
     * Clones this reference.
     */
    public UUIDNamedObjectREF cloneMe(){
        UUIDNamedObjectREF rc = new UUIDNamedObjectREF();
        rc.name   = name;
        rc.object = object;
        return(rc);
    }



}
