package org.dmd.dmu.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1237)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:1152)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:1151)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:1153)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1154)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1155)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Base class from MetaDMSAG - (DmoCompactSchemaFormatter.java:1190)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1159)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1160)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1165)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1205)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DmuDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmu";


    static int schemaBaseID = -430000;


    static int schemaIDRange = 1000;


    static int schemaMaxID = -429000;

    public final static DmcAttributeInfo __definedInDmuModule = new DmcAttributeInfo("dmu", "definedInDmuModule", -429999, "DmuModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnDmuModule = new DmcAttributeInfo("dmu", "dependsOnDmuModule", -429998, "DmuModule", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __jsonPayload = new DmcAttributeInfo("dmu", "jsonPayload", -429989, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __pathAndKeys = new DmcAttributeInfo("dmu", "pathAndKeys", -429990, "PathAndKey", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useSortInfo = new DmcAttributeInfo("dmu", "useSortInfo", -429988, "PayloadSortInfo", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_DmuDefinition = new DmcTypeInfo("DmuDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DmuModule = new DmcTypeInfo("DmuModule", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_PathAndKey = new DmcTypeInfo("PathAndKey", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_PayloadExample = new DmcTypeInfo("PayloadExample", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_PayloadSortInfo = new DmcTypeInfo("PayloadSortInfo", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __DmuDefinition = new DmcClassInfo("DmuDefinition","org.dmd.dmu.shared.generated.dmo.DmuDefinitionDMO", -859998, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __DmuModule = new DmcClassInfo("DmuModule","org.dmd.dmu.shared.generated.dmo.DmuModuleDMO", -859999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DmuDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __PayloadExample = new DmcClassInfo("PayloadExample","org.dmd.dmu.shared.generated.dmo.PayloadExampleDMO", -859988, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DmuDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __PayloadSortInfo = new DmcClassInfo("PayloadSortInfo","org.dmd.dmu.shared.generated.dmo.PayloadSortInfoDMO", -859990, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__DmuDefinition,MetaDMSAG.__name);

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

        DmuDMSAGAMAP.initSmAp(_SmAp);

        DmuDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DmuDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


    }

    static  DmuDMSAG instance;

    protected DmuDMSAG (){
    }

    public synchronized static DmuDMSAG instance(){
        if (instance == null)
            instance = new DmuDMSAG();
        
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

