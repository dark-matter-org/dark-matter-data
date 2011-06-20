package org.dmd.dmp.server.servlet.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dmr.shared.base.generated.dmo.DmrBaseDMSAG;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:92)
public class DmpServerDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmp.server";

    public final static DmcClassInfo __PluginConfig = new DmcClassInfo("PluginConfig", 701, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null);
    public final static DmcClassInfo __SessionFolderRI = new DmcClassInfo("SessionFolderRI", 704, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null);
    public final static DmcClassInfo __SessionRI = new DmcClassInfo("SessionRI", 705, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null);
    public final static DmcClassInfo __UserFolderRI = new DmcClassInfo("UserFolderRI", 702, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null);
    public final static DmcClassInfo __UserRI = new DmcClassInfo("UserRI", 703, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null);
    public final static DmcAttributeInfo __idRI = new DmcAttributeInfo("idRI", 705, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __pluginClass = new DmcAttributeInfo("pluginClass", 703, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __pluginName = new DmcAttributeInfo("pluginName", 701, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __runnable = new DmcAttributeInfo("runnable", 709, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sessionHostRI = new DmcAttributeInfo("sessionHostRI", 707, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __sessionIDRI = new DmcAttributeInfo("sessionIDRI", 706, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __startOrder = new DmcAttributeInfo("startOrder", 702, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __useSchemaClass = new DmcAttributeInfo("useSchemaClass", 704, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userRefRI = new DmcAttributeInfo("userRefRI", 708, "UserRI", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _SmAp.put(__idRI.id,__idRI);
        _SmAp.put(__pluginClass.id,__pluginClass);
        _SmAp.put(__pluginName.id,__pluginName);
        _SmAp.put(__runnable.id,__runnable);
        _SmAp.put(__sessionHostRI.id,__sessionHostRI);
        _SmAp.put(__sessionIDRI.id,__sessionIDRI);
        _SmAp.put(__startOrder.id,__startOrder);
        _SmAp.put(__useSchemaClass.id,__useSchemaClass);
        _SmAp.put(__userRefRI.id,__userRefRI);

    }

    static  DmpServerDMSAG instance;

    protected DmpServerDMSAG (){
    }

    public static DmpServerDMSAG instance(){
        if (instance == null)
            instance = new DmpServerDMSAG();
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


}

