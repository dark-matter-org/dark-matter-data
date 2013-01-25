package org.dmd.dmr.shared.base.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:860)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:794)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:793)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:795)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:796)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:797)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:813)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:801)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:802)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:807)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:828)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:124)
public class DmrBaseDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmr.base";


    static int schemaBaseID = 400;


    static int schemaIDRange = 50;


    static int schemaMaxID = 450;

    public final static DmcAttributeInfo __password = new DmcAttributeInfo("password", 401, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName", 400, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:162)
    public final static DmcTypeInfo __type_DotNamedObject = new DmcTypeInfo("DotNamedObject", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_HierarchicObject = new DmcTypeInfo("HierarchicObject", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:203)
    public final static DmcClassInfo __HierarchicObject = new DmcClassInfo("HierarchicObject","org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO", 401, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__FQN);
    public final static DmcClassInfo __DotNamedObject = new DmcClassInfo("DotNamedObject","org.dmd.dmr.shared.base.generated.dmo.DotNamedObjectDMO", 402, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__HierarchicObject,MetaDMSAG.__FQN);

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

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


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
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


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

