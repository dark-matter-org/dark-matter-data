package org.dmd.dmg.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmg.generated.types.*;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:71)
public class DmgASAG implements DmcAttributeSchemaIF {


    static String schemaName = "dmg";

    public final static DmcAttributeInfo __alias = new DmcAttributeInfo("alias", 206, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName", 204, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __configSuffix = new DmcAttributeInfo("configSuffix", 202, "String", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __genPackage = new DmcAttributeInfo("genPackage", 203, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __generator = new DmcAttributeInfo("generator", 200, "Generator", ValueTypeEnum.MULTI, true);
    public final static DmcAttributeInfo __schemaToLoad = new DmcAttributeInfo("schemaToLoad", 201, "String", ValueTypeEnum.SINGLE, true);
    public final static DmcAttributeInfo __upperConstantName = new DmcAttributeInfo("upperConstantName", 205, "String", ValueTypeEnum.SINGLE, true);

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;


    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();
        _SmAp.put(__alias.id,__alias);
        _SmAp.put(__camelCaseName.id,__camelCaseName);
        _SmAp.put(__configSuffix.id,__configSuffix);
        _SmAp.put(__genPackage.id,__genPackage);
        _SmAp.put(__generator.id,__generator);
        _SmAp.put(__schemaToLoad.id,__schemaToLoad);
        _SmAp.put(__upperConstantName.id,__upperConstantName);

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

    }

    static  DmgASAG instance;

    protected DmgASAG (){
    }

    public static DmgASAG instance(){
        if (instance == null)
            instance = new DmgASAG();
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


    public String getSchemaName(){
        return(schemaName);
    }


}
