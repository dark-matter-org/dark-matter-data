package org.dmd.dmt.dsd.dsdb.shared.generated.dmo;

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
public class DsdBDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dsdB";


    static int schemaBaseID = -500100;


    static int schemaIDRange = 50;


    static int schemaMaxID = -500050;

    public final static DmcAttributeInfo __definedInModuleB = new DmcAttributeInfo("dsdB", "definedInModuleB", -500098, "ModuleB", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnModuleB = new DmcAttributeInfo("dsdB", "dependsOnModuleB", -500099, "ModuleB", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:172)
    public final static DmcTypeInfo __type_BConceptBase = new DmcTypeInfo("BConceptBase", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_BConceptX = new DmcTypeInfo("BConceptX", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ModuleB = new DmcTypeInfo("ModuleB", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:213)
    public final static DmcClassInfo __BConceptBase = new DmcClassInfo("BConceptBase","org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptBaseDMO", -500098, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __BConceptX = new DmcClassInfo("BConceptX","org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptXDMO", -500097, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__BConceptBase,MetaDMSAG.__name);
    public final static DmcClassInfo __ModuleB = new DmcClassInfo("ModuleB","org.dmd.dmt.dsd.dsdb.shared.generated.dmo.ModuleBDMO", -500099, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__BConceptBase,MetaDMSAG.__name);

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

        DsdBDMSAGAMAP.initSmAp(_SmAp);

        DsdBDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:296)
    static {


        __BConceptBase.addMust(MetaDMSAG.__name);
        __BConceptBase.addMust(MetaDMSAG.__dotName);
        __BConceptBase.addMust(__definedInModuleB);

        __BConceptX.addMust(MetaDMSAG.__name);

        __ModuleB.addMust(MetaDMSAG.__name);
        __ModuleB.addMay(MetaDMSAG.__description);
        __ModuleB.addMay(__dependsOnModuleB);
        __ModuleB.addMay(DsdADMSAG.__dependsOnModuleA);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:340)
    static {


    }

    static  DsdBDMSAG instance;

    protected DsdBDMSAG (){
    }

    public synchronized static DsdBDMSAG instance(){
        if (instance == null)
            instance = new DsdBDMSAG();
        
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

