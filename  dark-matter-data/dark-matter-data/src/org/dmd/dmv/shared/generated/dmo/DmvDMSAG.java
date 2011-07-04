package org.dmd.dmv.shared.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:506)
import org.dmd.dms.generated.dmo.MetaDMSAG;               // MetaDMSAG
import org.dmd.dms.generated.enums.ClassTypeEnum;         // Have class definitions
import org.dmd.dms.generated.enums.DataTypeEnum;          // Have class/attribute definitions
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Have attribute definitions



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:95)
public class DmvDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmv";

    public final static DmcClassInfo __Rule = new DmcClassInfo("Rule", 301, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null);
    public final static DmcClassInfo __AttributeRule = new DmcClassInfo("AttributeRule", 302, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__Rule);
    public final static DmcClassInfo __IntegerRangeRule = new DmcClassInfo("IntegerRangeRule", 306, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__AttributeRule);
    public final static DmcClassInfo __ClassRule = new DmcClassInfo("ClassRule", 303, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__Rule);
    public final static DmcClassInfo __MayRule = new DmcClassInfo("MayRule", 305, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ClassRule);
    public final static DmcClassInfo __MustRule = new DmcClassInfo("MustRule", 304, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ClassRule);
    public final static DmcAttributeInfo __applyToAttribute = new DmcAttributeInfo("applyToAttribute", 303, "AttributeDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __applyToClass = new DmcAttributeInfo("applyToClass", 302, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __loadedFrom = new DmcAttributeInfo("loadedFrom", 301, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("ruleTitle", 300, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);


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

        _SmAp.put(__applyToAttribute.id,__applyToAttribute);
        _SmAp.put(__applyToClass.id,__applyToClass);
        _SmAp.put(__loadedFrom.id,__loadedFrom);
        _SmAp.put(__ruleTitle.id,__ruleTitle);
        _CmAp.put(__AttributeRule.id,__AttributeRule);
        _CmAp.put(__ClassRule.id,__ClassRule);
        _CmAp.put(__IntegerRangeRule.id,__IntegerRangeRule);
        _CmAp.put(__MayRule.id,__MayRule);
        _CmAp.put(__MustRule.id,__MustRule);
        _CmAp.put(__Rule.id,__Rule);

        __Rule.addMust(MetaDMSAG.__name);
        __Rule.addMust(__ruleTitle);

        __AttributeRule.addMust(__applyToAttribute);

        __ClassRule.addMay(__applyToClass);

        __MustRule.addMust(__ruleTitle);

        __MayRule.addMust(__ruleTitle);

        __IntegerRangeRule.addMust(__ruleTitle);


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


}

