package org.dmd.dmr.shared.base.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;


public class DmrBaseAttributeSchemaAG implements DmcAttributeSchemaIF {

    public final static DmcAttributeInfo __password = new DmcAttributeInfo("password", 401, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName", 400, "String", ValueTypeEnum.SINGLE, true);

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();
        _SmAp.put(__password.id,__password);
        _SmAp.put(__userName.id,__userName);

    }

    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getInfo(){
        return(_SmAp.values().iterator());
    }


}

