package org.dmd.dmr.shared.base.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:92)
public class DmrBaseDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmr.base";

    public final static DmcClassInfo __HierarchicObject = new DmcClassInfo("HierarchicObject", 401, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null);
    public final static DmcClassInfo __DotNamedObject = new DmcClassInfo("DotNamedObject", 402, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__HierarchicObject);
    public final static DmcAttributeInfo __password = new DmcAttributeInfo("password", 401, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName", 400, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


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

        _SmAp.put(__password.id,__password);
        _SmAp.put(__userName.id,__userName);

    }

    static  DmrBaseDMSAG instance;

    protected DmrBaseDMSAG (){
    }

    public static DmrBaseDMSAG instance(){
        if (instance == null)
            instance = new DmrBaseDMSAG();
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

