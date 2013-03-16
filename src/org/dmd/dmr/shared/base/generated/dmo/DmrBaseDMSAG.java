package org.dmd.dmr.shared.base.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:565)
import org.dmd.dms.generated.dmo.MetaDMSAG;               // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:546)
import org.dmd.dms.generated.enums.ClassTypeEnum;         // Have class definitions - (DmoCompactSchemaFormatter.java:538)
import org.dmd.dms.generated.enums.DataTypeEnum;          // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:539)
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Have attribute definitions - (DmoCompactSchemaFormatter.java:560)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:95)
public class DmrBaseDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmr.base";


    static int schemaBaseID = 400;


    static int schemaIDRange = 50;


    static int schemaMaxID = 450;

    public final static DmcAttributeInfo __password = new DmcAttributeInfo("password", 401, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName", 400, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcClassInfo __HierarchicObject = new DmcClassInfo("HierarchicObject", 401, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__FQN);
    public final static DmcClassInfo __DotNamedObject = new DmcClassInfo("DotNamedObject", 402, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__HierarchicObject,MetaDMSAG.__FQN);


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
        _CmAp.put(__DotNamedObject.id,__DotNamedObject);
        _CmAp.put(__HierarchicObject.id,__HierarchicObject);

        __HierarchicObject.addMust(MetaDMSAG.__FQN);
        __HierarchicObject.addMay(MetaDMSAG.__lineNumber);
        __HierarchicObject.addMay(MetaDMSAG.__file);

        __DotNamedObject.addMust(MetaDMSAG.__FQN);


    }

    static  DmrBaseDMSAG instance;

    protected DmrBaseDMSAG (){
    }

    public synchronized static DmrBaseDMSAG instance(){
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


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


}

