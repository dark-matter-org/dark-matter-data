package org.dmd.dmp.server.servlet.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from:  org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class DmpServerASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmp.server";

    public final static DmcAttributeInfo __idRI = new DmcAttributeInfo("idRI", 705, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __pluginClass = new DmcAttributeInfo("pluginClass", 703, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __pluginName = new DmcAttributeInfo("pluginName", 701, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __runnable = new DmcAttributeInfo("runnable", 709, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sessHostRI = new DmcAttributeInfo("sessHostRI", 707, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sessIDRI = new DmcAttributeInfo("sessIDRI", 706, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __startOrder = new DmcAttributeInfo("startOrder", 702, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __useSchemaClass = new DmcAttributeInfo("useSchemaClass", 704, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userRefRI = new DmcAttributeInfo("userRefRI", 708, "UserRI", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__idRI.id,__idRI);
        _SmAp.put(__pluginClass.id,__pluginClass);
        _SmAp.put(__pluginName.id,__pluginName);
        _SmAp.put(__runnable.id,__runnable);
        _SmAp.put(__sessHostRI.id,__sessHostRI);
        _SmAp.put(__sessIDRI.id,__sessIDRI);
        _SmAp.put(__startOrder.id,__startOrder);
        _SmAp.put(__useSchemaClass.id,__useSchemaClass);
        _SmAp.put(__userRefRI.id,__userRefRI);

    }

    static  DmpServerASAG instance;

    protected DmpServerASAG (){
    }

    public static DmpServerASAG instance(){
        if (instance == null)
            instance = new DmpServerASAG();
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

