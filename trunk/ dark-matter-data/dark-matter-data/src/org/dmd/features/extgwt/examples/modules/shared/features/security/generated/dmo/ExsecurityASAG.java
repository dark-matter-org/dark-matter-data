package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;


public class ExsecurityASAG implements DmcAttributeSchemaIF {


    static String schemaName = "exsecurity";


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

    }

    static  ExsecurityASAG instance;

    protected ExsecurityASAG (){
    }

    public static ExsecurityASAG instance(){
        if (instance == null)
            instance = new ExsecurityASAG();
        return(instance);
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getInfo(){
        return(_SmAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


}

