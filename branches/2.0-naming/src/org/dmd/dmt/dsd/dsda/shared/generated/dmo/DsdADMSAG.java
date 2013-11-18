package org.dmd.dmt.dsd.dsda.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1060)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:994)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:993)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:995)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:996)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:997)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1013)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1001)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1002)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1007)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1028)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:133)
public class DsdADMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dsdA";


    static int schemaBaseID = -500050;


    static int schemaIDRange = 50;


    static int schemaMaxID = -500000;

    public final static DmcAttributeInfo __definedInModuleA = new DmcAttributeInfo("dsdA", "definedInModuleA", -500048, "ModuleA", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnModuleA = new DmcAttributeInfo("dsdA", "dependsOnModuleA", -500049, "ModuleA", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:172)
    public final static DmcTypeInfo __type_AConceptBase = new DmcTypeInfo("AConceptBase", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_AConceptX = new DmcTypeInfo("AConceptX", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ModuleA = new DmcTypeInfo("ModuleA", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:213)
    public final static DmcClassInfo __AConceptBase = new DmcClassInfo("AConceptBase","org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO", -500048, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __AConceptX = new DmcClassInfo("AConceptX","org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptXDMO", -500047, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AConceptBase,MetaDMSAG.__name);
    public final static DmcClassInfo __ModuleA = new DmcClassInfo("ModuleA","org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO", -500049, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AConceptBase,MetaDMSAG.__name);

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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:296)
    static {


        __AConceptBase.addMust(MetaDMSAG.__name);
        __AConceptBase.addMust(MetaDMSAG.__dotName);
        __AConceptBase.addMust(__definedInModuleA);

        __AConceptX.addMust(MetaDMSAG.__name);

        __ModuleA.addMust(MetaDMSAG.__name);
        __ModuleA.addMay(MetaDMSAG.__description);
        __ModuleA.addMay(__dependsOnModuleA);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:340)
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

