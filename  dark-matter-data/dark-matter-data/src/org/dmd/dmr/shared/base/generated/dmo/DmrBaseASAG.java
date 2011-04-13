package org.dmd.dmr.shared.base.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;


public class DmrBaseASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmr.base";

    public final static DmcAttributeInfo __password = new DmcAttributeInfo("password", 401, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName", 400, "String", ValueTypeEnum.SINGLE, true);

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();
        _SmAp.put(__password.id,__password);
        _SmAp.put(__userName.id,__userName);

    }

    static  DmrBaseASAG instance;

    protected DmrBaseASAG (){
    }

    public static DmrBaseASAG instance(){
        if (instance == null)
            instance = new DmrBaseASAG();
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
