package org.dmd.dmt.dsd.dsda.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1088)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:1022)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:1021)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:1023)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1024)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1025)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1041)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1029)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1030)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1035)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1056)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:138)
public class DsdADMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dsdA";


    static int schemaBaseID = -500050;


    static int schemaIDRange = 50;


    static int schemaMaxID = -500000;

    public final static DmcAttributeInfo __definedInModuleA = new DmcAttributeInfo("dsdA", "definedInModuleA", -500048, "ModuleA", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnModuleA = new DmcAttributeInfo("dsdA", "dependsOnModuleA", -500049, "ModuleA", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:184)
    public final static DmcTypeInfo __type_ABConceptX = new DmcTypeInfo("ABConceptX", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_AConceptBase = new DmcTypeInfo("AConceptBase", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_AConceptX = new DmcTypeInfo("AConceptX", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ModuleA = new DmcTypeInfo("ModuleA", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:225)
    public final static DmcClassInfo __AConceptBase = new DmcClassInfo("AConceptBase","org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO", -1000098, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __AConceptX = new DmcClassInfo("AConceptX","org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptXDMO", -1000097, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AConceptBase,MetaDMSAG.__name);
    public final static DmcClassInfo __ABConceptX = new DmcClassInfo("ABConceptX","org.dmd.dmt.dsd.dsda.shared.generated.dmo.ABConceptXDMO", -1000096, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AConceptX,MetaDMSAG.__name);
    public final static DmcClassInfo __ModuleA = new DmcClassInfo("ModuleA","org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO", -1000099, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AConceptBase,MetaDMSAG.__name);

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

        DsdADMSAGAMAP.initSmAp(_SmAp);

        DsdADMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:308)
    static {


        __AConceptBase.addMust(__definedInModuleA);
        __AConceptBase.addMust(MetaDMSAG.__dotName);
        __AConceptBase.addMust(MetaDMSAG.__name);
        __AConceptBase.addMay(MetaDMSAG.__comment);
        __AConceptBase.addMay(MetaDMSAG.__definedIn);
        __AConceptBase.addMay(MetaDMSAG.__description);
        __AConceptBase.addMay(MetaDMSAG.__dotName);
        __AConceptBase.addMay(MetaDMSAG.__example);
        __AConceptBase.addMay(MetaDMSAG.__file);
        __AConceptBase.addMay(MetaDMSAG.__hint);
        __AConceptBase.addMay(MetaDMSAG.__lineNumber);
        __AConceptBase.addMay(MetaDMSAG.__nvp);
        __AConceptBase.addMay(MetaDMSAG.__obsolete);
        __AConceptBase.addMay(MetaDMSAG.__optimize);
        __AConceptBase.addMay(MetaDMSAG.__question);
        __AConceptBase.addMay(MetaDMSAG.__relationship);
        __AConceptBase.addMay(MetaDMSAG.__searchable);
        __AConceptBase.addMay(MetaDMSAG.__skip);
        __AConceptBase.addMay(MetaDMSAG.__sortName);
        __AConceptBase.addMay(MetaDMSAG.__tags);
        __AConceptBase.addMay(MetaDMSAG.__version);
        __AConceptBase.addMay(MetaDMSAG.__why);

        __AConceptX.addMust(__definedInModuleA);
        __AConceptX.addMust(MetaDMSAG.__dotName);
        __AConceptX.addMust(MetaDMSAG.__name);
        __AConceptX.addMay(MetaDMSAG.__comment);
        __AConceptX.addMay(MetaDMSAG.__definedIn);
        __AConceptX.addMay(MetaDMSAG.__description);
        __AConceptX.addMay(MetaDMSAG.__dotName);
        __AConceptX.addMay(MetaDMSAG.__example);
        __AConceptX.addMay(MetaDMSAG.__file);
        __AConceptX.addMay(MetaDMSAG.__hint);
        __AConceptX.addMay(MetaDMSAG.__lineNumber);
        __AConceptX.addMay(MetaDMSAG.__nvp);
        __AConceptX.addMay(MetaDMSAG.__obsolete);
        __AConceptX.addMay(MetaDMSAG.__optimize);
        __AConceptX.addMay(MetaDMSAG.__question);
        __AConceptX.addMay(MetaDMSAG.__relationship);
        __AConceptX.addMay(MetaDMSAG.__searchable);
        __AConceptX.addMay(MetaDMSAG.__skip);
        __AConceptX.addMay(MetaDMSAG.__sortName);
        __AConceptX.addMay(MetaDMSAG.__tags);
        __AConceptX.addMay(MetaDMSAG.__version);
        __AConceptX.addMay(MetaDMSAG.__why);

        __ABConceptX.addMust(__definedInModuleA);
        __ABConceptX.addMust(MetaDMSAG.__dotName);
        __ABConceptX.addMust(MetaDMSAG.__name);
        __ABConceptX.addMay(MetaDMSAG.__comment);
        __ABConceptX.addMay(MetaDMSAG.__definedIn);
        __ABConceptX.addMay(MetaDMSAG.__description);
        __ABConceptX.addMay(MetaDMSAG.__dotName);
        __ABConceptX.addMay(MetaDMSAG.__example);
        __ABConceptX.addMay(MetaDMSAG.__file);
        __ABConceptX.addMay(MetaDMSAG.__hint);
        __ABConceptX.addMay(MetaDMSAG.__lineNumber);
        __ABConceptX.addMay(MetaDMSAG.__nvp);
        __ABConceptX.addMay(MetaDMSAG.__obsolete);
        __ABConceptX.addMay(MetaDMSAG.__optimize);
        __ABConceptX.addMay(MetaDMSAG.__question);
        __ABConceptX.addMay(MetaDMSAG.__relationship);
        __ABConceptX.addMay(MetaDMSAG.__searchable);
        __ABConceptX.addMay(MetaDMSAG.__skip);
        __ABConceptX.addMay(MetaDMSAG.__sortName);
        __ABConceptX.addMay(MetaDMSAG.__tags);
        __ABConceptX.addMay(MetaDMSAG.__version);
        __ABConceptX.addMay(MetaDMSAG.__why);

        __ModuleA.addMust(__definedInModuleA);
        __ModuleA.addMust(MetaDMSAG.__dotName);
        __ModuleA.addMust(MetaDMSAG.__name);
        __ModuleA.addMay(MetaDMSAG.__comment);
        __ModuleA.addMay(MetaDMSAG.__defFiles);
        __ModuleA.addMay(MetaDMSAG.__definedIn);
        __ModuleA.addMay(__dependsOnModuleA);
        __ModuleA.addMay(MetaDMSAG.__description);
        __ModuleA.addMay(MetaDMSAG.__dotName);
        __ModuleA.addMay(MetaDMSAG.__example);
        __ModuleA.addMay(MetaDMSAG.__file);
        __ModuleA.addMay(MetaDMSAG.__hint);
        __ModuleA.addMay(MetaDMSAG.__lineNumber);
        __ModuleA.addMay(MetaDMSAG.__nvp);
        __ModuleA.addMay(MetaDMSAG.__obsolete);
        __ModuleA.addMay(MetaDMSAG.__optimize);
        __ModuleA.addMay(MetaDMSAG.__question);
        __ModuleA.addMay(MetaDMSAG.__relationship);
        __ModuleA.addMay(MetaDMSAG.__searchable);
        __ModuleA.addMay(MetaDMSAG.__skip);
        __ModuleA.addMay(MetaDMSAG.__sortName);
        __ModuleA.addMay(MetaDMSAG.__tags);
        __ModuleA.addMay(MetaDMSAG.__version);
        __ModuleA.addMay(MetaDMSAG.__why);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:360)
    static {


    }

    static  DsdADMSAG instance;

    protected DsdADMSAG (){
    }

    public synchronized static DsdADMSAG instance(){
        if (instance == null)
            instance = new DsdADMSAG();
        
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

