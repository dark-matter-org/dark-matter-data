package org.dmd.dmp.server.servlet.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from:  org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class DmpServerASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmp.server";

    public final static DmcAttributeInfo __dependsOnPlugin = new DmcAttributeInfo("dependsOnPlugin", 702, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __pluginClass = new DmcAttributeInfo("pluginClass", 703, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __pluginName = new DmcAttributeInfo("pluginName", 701, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__dependsOnPlugin.id,__dependsOnPlugin);
        _SmAp.put(__pluginClass.id,__pluginClass);
        _SmAp.put(__pluginName.id,__pluginName);

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

