package org.dmd.dmg.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1219)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:1145)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:1144)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:1146)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1147)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1148)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Optional attribute: description from MetaDMSAG - (DmoCompactSchemaFormatter.java:1176)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1152)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1153)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1158)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1187)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DmgDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmg";


    static int schemaBaseID = 200;


    static int schemaIDRange = 50;


    static int schemaMaxID = 250;

    public final static DmcAttributeInfo __alias = new DmcAttributeInfo("dmg", "alias", 206, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __configSuffix = new DmcAttributeInfo("dmg", "configSuffix", 202, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __genClass = new DmcAttributeInfo("dmg", "genClass", 209, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __genContext = new DmcAttributeInfo("dmg", "genContext", 208, "GenerationContext", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __genContextName = new DmcAttributeInfo("dmg", "genContextName", 207, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __genPackage = new DmcAttributeInfo("dmg", "genPackage", 203, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __generator = new DmcAttributeInfo("dmg", "generator", 200, "Generator", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __schemaToLoad = new DmcAttributeInfo("dmg", "schemaToLoad", 201, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __upperConstantName = new DmcAttributeInfo("dmg", "upperConstantName", 205, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_ActifactGenerator = new DmcTypeInfo("ActifactGenerator", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DmgConfig = new DmcTypeInfo("DmgConfig", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_GenerationContext = new DmcTypeInfo("GenerationContext", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Generator = new DmcTypeInfo("Generator", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_MethodGenerator = new DmcTypeInfo("MethodGenerator", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WrapperGenerator = new DmcTypeInfo("WrapperGenerator", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __ActifactGenerator = new DmcClassInfo("ActifactGenerator","org.dmd.dmg.generated.dmo.ActifactGeneratorDMO", 405, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __DmgConfig = new DmcClassInfo("DmgConfig","org.dmd.dmg.generated.dmo.DmgConfigDMO", 401, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __GenerationContext = new DmcClassInfo("GenerationContext","org.dmd.dmg.generated.dmo.GenerationContextDMO", 402, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,DmgDMSAG.__genContextName);
    public final static DmcClassInfo __MethodGenerator = new DmcClassInfo("MethodGenerator","org.dmd.dmg.generated.dmo.MethodGeneratorDMO", 404, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __WrapperGenerator = new DmcClassInfo("WrapperGenerator","org.dmd.dmg.generated.dmo.WrapperGeneratorDMO", 403, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);

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

        DmgDMSAGAMAP.initSmAp(_SmAp);

        DmgDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DmgDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


    }

    static  DmgDMSAG instance;

    protected DmgDMSAG (){
    }

    public synchronized static DmgDMSAG instance(){
        if (instance == null)
            instance = new DmgDMSAG();
        
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

