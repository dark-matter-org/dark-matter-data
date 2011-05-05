package org.dmd.mvw.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class MvwASAG implements DmcAttributeSchemaIF {


    static String schemaName = "mvw";

    public final static DmcAttributeInfo __definedInMvwConfig = new DmcAttributeInfo("definedInMvwConfig", 800, "MvwConfig", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __dependsOnMvw = new DmcAttributeInfo("dependsOnMvw", 805, "MvwConfig", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent", 801, "MvwEvent", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent", 802, "MvwEvent", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userDataImport = new DmcAttributeInfo("userDataImport", 804, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userDataType = new DmcAttributeInfo("userDataType", 803, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__definedInMvwConfig.id,__definedInMvwConfig);
        _SmAp.put(__dependsOnMvw.id,__dependsOnMvw);
        _SmAp.put(__firesEvent.id,__firesEvent);
        _SmAp.put(__handlesEvent.id,__handlesEvent);
        _SmAp.put(__userDataImport.id,__userDataImport);
        _SmAp.put(__userDataType.id,__userDataType);

    }

    static  MvwASAG instance;

    protected MvwASAG (){
    }

    public static MvwASAG instance(){
        if (instance == null)
            instance = new MvwASAG();
        return(instance);
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


}

