package org.dmd.dms.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.types.*;


// Generated from:  org.dmd.dms.util.DmoValidatorCollectionFormatter.dumpHeader(DmoValidatorCollectionFormatter.java:270)
public class MetaVCAG implements DmcDMOValidatorCollectionIF {

    public final static DmcObjectValidator __AttributeSetValidator = new org.dmd.dmc.validators.AttributeSetValidator();

    static  HashMap<String, DmcAttributeValidator> _AvDmAp;
    static  HashMap<String, DmcObjectValidator> _OvDmAp;

    static {
        _AvDmAp = new HashMap<String, DmcAttributeValidator>();
        _OvDmAp = new HashMap<String, DmcObjectValidator>();
        _OvDmAp.put(__AttributeSetValidator.getName(), __AttributeSetValidator);

    }

    static  MetaVCAG instance;

    protected MetaVCAG (){
    }

    public static MetaVCAG instance(){
        if (instance == null)
            instance = new MetaVCAG();
        return(instance);
    }


    @Override
    public Iterator<DmcAttributeValidator> getAttributeValidators(){
        return(_AvDmAp.values().iterator());
    }


    @Override
    public Iterator<DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp.values().iterator());
    }


}

