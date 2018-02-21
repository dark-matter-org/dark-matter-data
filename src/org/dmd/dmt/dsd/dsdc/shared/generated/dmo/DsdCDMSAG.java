package org.dmd.dmt.dsd.dsdc.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1088)
import java.util.ArrayList;                                         // For storage of schema info - (DmoCompactSchemaFormatter.java:1022)
import java.util.HashMap;                                           // For storage of schema info - (DmoCompactSchemaFormatter.java:1021)
import java.util.Iterator;                                          // For access of schema info - (DmoCompactSchemaFormatter.java:1023)
import org.dmd.dmc.*;                                               // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1024)
import org.dmd.dmc.rules.RuleIF;                                    // For rule info - (DmoCompactSchemaFormatter.java:1025)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1041)
import org.dmd.dms.generated.enums.ClassTypeEnum;                   // Have class definitions - (DmoCompactSchemaFormatter.java:1029)
import org.dmd.dms.generated.enums.DataTypeEnum;                    // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1030)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1035)
import org.dmd.dms.generated.enums.ValueTypeEnum;                   // Have attribute definitions - (DmoCompactSchemaFormatter.java:1056)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;         // Optional attribute from DsdADMSAG - (DmoCompactSchemaFormatter.java:1045)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.DsdBDMSAG;         // Optional attribute from DsdBDMSAG - (DmoCompactSchemaFormatter.java:1045)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:138)
public class DsdCDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dsdC";


    static int schemaBaseID = -500150;


    static int schemaIDRange = 50;


    static int schemaMaxID = -500100;

    public final static DmcAttributeInfo __definedInModuleC = new DmcAttributeInfo("dsdC", "definedInModuleC", -500148, "ModuleC", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnModuleC = new DmcAttributeInfo("dsdC", "dependsOnModuleC", -500149, "ModuleC", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:184)
    public final static DmcTypeInfo __type_CConceptBase = new DmcTypeInfo("CConceptBase", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_CConceptX = new DmcTypeInfo("CConceptX", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ModuleC = new DmcTypeInfo("ModuleC", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:225)
    public final static DmcClassInfo __CConceptBase = new DmcClassInfo("CConceptBase","org.dmd.dmt.dsd.dsdc.shared.generated.dmo.CConceptBaseDMO", -1000298, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __CConceptX = new DmcClassInfo("CConceptX","org.dmd.dmt.dsd.dsdc.shared.generated.dmo.CConceptXDMO", -1000297, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__CConceptBase,MetaDMSAG.__name);
    public final static DmcClassInfo __ModuleC = new DmcClassInfo("ModuleC","org.dmd.dmt.dsd.dsdc.shared.generated.dmo.ModuleCDMO", -1000299, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__CConceptBase,MetaDMSAG.__name);

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

        DsdCDMSAGAMAP.initSmAp(_SmAp);

        DsdCDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:308)
    static {


        __CConceptBase.addMust(__definedInModuleC);
        __CConceptBase.addMust(MetaDMSAG.__dotName);
        __CConceptBase.addMust(MetaDMSAG.__name);
        __CConceptBase.addMay(MetaDMSAG.__comment);
        __CConceptBase.addMay(MetaDMSAG.__definedIn);
        __CConceptBase.addMay(MetaDMSAG.__description);
        __CConceptBase.addMay(MetaDMSAG.__dotName);
        __CConceptBase.addMay(MetaDMSAG.__example);
        __CConceptBase.addMay(MetaDMSAG.__file);
        __CConceptBase.addMay(MetaDMSAG.__hint);
        __CConceptBase.addMay(MetaDMSAG.__lineNumber);
        __CConceptBase.addMay(MetaDMSAG.__nvp);
        __CConceptBase.addMay(MetaDMSAG.__obsolete);
        __CConceptBase.addMay(MetaDMSAG.__optimize);
        __CConceptBase.addMay(MetaDMSAG.__question);
        __CConceptBase.addMay(MetaDMSAG.__relationship);
        __CConceptBase.addMay(MetaDMSAG.__searchable);
        __CConceptBase.addMay(MetaDMSAG.__skip);
        __CConceptBase.addMay(MetaDMSAG.__sortName);
        __CConceptBase.addMay(MetaDMSAG.__tags);
        __CConceptBase.addMay(MetaDMSAG.__version);
        __CConceptBase.addMay(MetaDMSAG.__why);

        __CConceptX.addMust(__definedInModuleC);
        __CConceptX.addMust(MetaDMSAG.__dotName);
        __CConceptX.addMust(MetaDMSAG.__name);
        __CConceptX.addMay(MetaDMSAG.__comment);
        __CConceptX.addMay(MetaDMSAG.__definedIn);
        __CConceptX.addMay(MetaDMSAG.__description);
        __CConceptX.addMay(MetaDMSAG.__dotName);
        __CConceptX.addMay(MetaDMSAG.__example);
        __CConceptX.addMay(MetaDMSAG.__file);
        __CConceptX.addMay(MetaDMSAG.__hint);
        __CConceptX.addMay(MetaDMSAG.__lineNumber);
        __CConceptX.addMay(MetaDMSAG.__nvp);
        __CConceptX.addMay(MetaDMSAG.__obsolete);
        __CConceptX.addMay(MetaDMSAG.__optimize);
        __CConceptX.addMay(MetaDMSAG.__question);
        __CConceptX.addMay(MetaDMSAG.__relationship);
        __CConceptX.addMay(MetaDMSAG.__searchable);
        __CConceptX.addMay(MetaDMSAG.__skip);
        __CConceptX.addMay(MetaDMSAG.__sortName);
        __CConceptX.addMay(MetaDMSAG.__tags);
        __CConceptX.addMay(MetaDMSAG.__version);
        __CConceptX.addMay(MetaDMSAG.__why);

        __ModuleC.addMust(__definedInModuleC);
        __ModuleC.addMust(MetaDMSAG.__dotName);
        __ModuleC.addMust(MetaDMSAG.__name);
        __ModuleC.addMay(MetaDMSAG.__comment);
        __ModuleC.addMay(MetaDMSAG.__defFiles);
        __ModuleC.addMay(MetaDMSAG.__definedIn);
        __ModuleC.addMay(DsdADMSAG.__dependsOnModuleA);
        __ModuleC.addMay(DsdBDMSAG.__dependsOnModuleB);
        __ModuleC.addMay(__dependsOnModuleC);
        __ModuleC.addMay(MetaDMSAG.__description);
        __ModuleC.addMay(MetaDMSAG.__dotName);
        __ModuleC.addMay(MetaDMSAG.__example);
        __ModuleC.addMay(MetaDMSAG.__file);
        __ModuleC.addMay(MetaDMSAG.__hint);
        __ModuleC.addMay(MetaDMSAG.__lineNumber);
        __ModuleC.addMay(MetaDMSAG.__nvp);
        __ModuleC.addMay(MetaDMSAG.__obsolete);
        __ModuleC.addMay(MetaDMSAG.__optimize);
        __ModuleC.addMay(MetaDMSAG.__question);
        __ModuleC.addMay(MetaDMSAG.__relationship);
        __ModuleC.addMay(MetaDMSAG.__searchable);
        __ModuleC.addMay(MetaDMSAG.__skip);
        __ModuleC.addMay(MetaDMSAG.__sortName);
        __ModuleC.addMay(MetaDMSAG.__tags);
        __ModuleC.addMay(MetaDMSAG.__version);
        __ModuleC.addMay(MetaDMSAG.__why);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:360)
    static {


    }

    static  DsdCDMSAG instance;

    protected DsdCDMSAG (){
    }

    public synchronized static DsdCDMSAG instance(){
        if (instance == null)
            instance = new DsdCDMSAG();
        
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

