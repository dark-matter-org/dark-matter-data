package org.dmd.dmv.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;


// Generated from:  org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:73)
public class DmvASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmv";

    public final static DmcAttributeInfo __applyToAttribute = new DmcAttributeInfo("applyToAttribute", 303, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __applyToClass = new DmcAttributeInfo("applyToClass", 302, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __loadedFrom = new DmcAttributeInfo("loadedFrom", 301, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("ruleTitle", 300, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, true);


    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__applyToAttribute.id,__applyToAttribute);
        _SmAp.put(__applyToClass.id,__applyToClass);
        _SmAp.put(__loadedFrom.id,__loadedFrom);
        _SmAp.put(__ruleTitle.id,__ruleTitle);

    }

    static  DmvASAG instance;

    protected DmvASAG (){
    }

    public static DmvASAG instance(){
        if (instance == null)
            instance = new DmvASAG();
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
