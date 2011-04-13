package org.dmd.dmui.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;


public class DmuiASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmui";


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

    }

    static  DmuiASAG instance;

    protected DmuiASAG (){
    }

    public static DmuiASAG instance(){
        if (instance == null)
            instance = new DmuiASAG();
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

