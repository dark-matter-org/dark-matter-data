package org.dmd.dmv.shared.generated.dmo;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dmc.rules.RuleIF;
// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:635)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:611)
import org.dmd.dms.generated.enums.ClassTypeEnum;                     // Have class definitions - (DmoCompactSchemaFormatter.java:603)
import org.dmd.dms.generated.enums.DataTypeEnum;                      // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:604)
import org.dmd.dms.generated.enums.ValueTypeEnum;                     // Have attribute definitions - (DmoCompactSchemaFormatter.java:626)
import org.dmd.dmv.shared.extended.rulesdmo.InitRule;                 // To support instantiations of InitRule - (DmoCompactSchemaFormatter.java:632)
import org.dmd.dmv.shared.extended.rulesdmo.IntegerRangeRule;         // To support instantiations of IntegerRangeRule - (DmoCompactSchemaFormatter.java:632)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:98)
public class DmvDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmv";


    static int schemaBaseID = -480000;


    static int schemaIDRange = 50;


    static int schemaMaxID = -479950;

    public final static DmcAttributeInfo __irrMaximum = new DmcAttributeInfo("irrMaximum", -479998, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __irrMinimum = new DmcAttributeInfo("irrMinimum", -479999, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcClassInfo __InitRuleData = new DmcClassInfo("InitRuleData", -959999, ClassTypeEnum.EXTENSIBLE, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);
    public final static DmcClassInfo __IntegerRangeRuleData = new DmcClassInfo("IntegerRangeRuleData", -959998, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,MetaDMSAG.__RuleData,null);


    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _RmAp = new ArrayList<RuleIF>();

        _SmAp.put(__irrMaximum.id,__irrMaximum);
        _SmAp.put(__irrMinimum.id,__irrMinimum);
        _CmAp.put(__InitRuleData.id,__InitRuleData);
        _CmAp.put(__IntegerRangeRuleData.id,__IntegerRangeRuleData);

        __InitRuleData.addMust(MetaDMSAG.__ruleName);
        __InitRuleData.addMust(MetaDMSAG.__ruleTitle);
        __InitRuleData.addMay(MetaDMSAG.__description);

        __IntegerRangeRuleData.addMust(MetaDMSAG.__ruleName);
        __IntegerRangeRuleData.addMust(MetaDMSAG.__ruleTitle);
        __IntegerRangeRuleData.addMust(__irrMinimum);
        __IntegerRangeRuleData.addMust(__irrMaximum);
        __IntegerRangeRuleData.addMay(MetaDMSAG.__description);

        @SuppressWarnings("unused")
        InitRule InitRuleInstance = new InitRule(new InitRuleDataDMO());
        @SuppressWarnings("unused")
        IntegerRangeRule IntegerRangeRuleInstance = new IntegerRangeRule(new IntegerRangeRuleDataDMO());

    }

    static  DmvDMSAG instance;

    protected DmvDMSAG (){
    }

    public synchronized static DmvDMSAG instance(){
        if (instance == null)
            instance = new DmvDMSAG();
        
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


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

