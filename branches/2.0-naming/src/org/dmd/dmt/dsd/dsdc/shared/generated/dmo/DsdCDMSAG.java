package org.dmd.dmt.dsd.dsdc.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1060)
import java.util.ArrayList;                                         // For storage of schema info - (DmoCompactSchemaFormatter.java:994)
import java.util.HashMap;                                           // For storage of schema info - (DmoCompactSchemaFormatter.java:993)
import java.util.Iterator;                                          // For access of schema info - (DmoCompactSchemaFormatter.java:995)
import org.dmd.dmc.*;                                               // Basic DMC stuff - (DmoCompactSchemaFormatter.java:996)
import org.dmd.dmc.rules.RuleIF;                                    // For rule info - (DmoCompactSchemaFormatter.java:997)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1013)
import org.dmd.dms.generated.enums.ClassTypeEnum;                   // Have class definitions - (DmoCompactSchemaFormatter.java:1001)
import org.dmd.dms.generated.enums.DataTypeEnum;                    // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1002)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1007)
import org.dmd.dms.generated.enums.ValueTypeEnum;                   // Have attribute definitions - (DmoCompactSchemaFormatter.java:1028)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;         // Optional attribute from DsdADMSAG - (DmoCompactSchemaFormatter.java:1017)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:133)
public class DsdCDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dsdC";


    static int schemaBaseID = -500150;


    static int schemaIDRange = 50;


    static int schemaMaxID = -500100;

    public final static DmcAttributeInfo __definedInModuleC = new DmcAttributeInfo("dsdC", "definedInModuleC", -500148, "ModuleC", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnModuleC = new DmcAttributeInfo("dsdC", "dependsOnModuleC", -500149, "ModuleC", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:172)
    public final static DmcTypeInfo __type_CConceptBase = new DmcTypeInfo("CConceptBase", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_CConceptX = new DmcTypeInfo("CConceptX", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ModuleC = new DmcTypeInfo("ModuleC", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:213)
    public final static DmcClassInfo __CConceptBase = new DmcClassInfo("CConceptBase","org.dmd.dmt.dsd.dsdc.shared.generated.dmo.CConceptBaseDMO", -500148, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __CConceptX = new DmcClassInfo("CConceptX","org.dmd.dmt.dsd.dsdc.shared.generated.dmo.CConceptXDMO", -500147, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__CConceptBase,MetaDMSAG.__name);
    public final static DmcClassInfo __ModuleC = new DmcClassInfo("ModuleC","org.dmd.dmt.dsd.dsdc.shared.generated.dmo.ModuleCDMO", -500149, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);

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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:296)
    static {


        __CConceptBase.addMust(MetaDMSAG.__name);
        __CConceptBase.addMust(MetaDMSAG.__dotName);
        __CConceptBase.addMust(__definedInModuleC);

        __CConceptX.addMust(MetaDMSAG.__name);

        __ModuleC.addMust(MetaDMSAG.__name);
        __ModuleC.addMay(MetaDMSAG.__description);
        __ModuleC.addMay(__dependsOnModuleC);
        __ModuleC.addMay(DsdADMSAG.__dependsOnModuleA);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:340)
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

