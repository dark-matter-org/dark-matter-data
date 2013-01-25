package org.dmd.dmg.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:860)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:794)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:793)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:795)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:796)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:797)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Optional attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:817)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:801)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:802)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:807)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:828)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:124)
public class DmgDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmg";


    static int schemaBaseID = 200;


    static int schemaIDRange = 50;


    static int schemaMaxID = 250;

    public final static DmcAttributeInfo __alias = new DmcAttributeInfo("alias", 206, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __configSuffix = new DmcAttributeInfo("configSuffix", 202, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __genClass = new DmcAttributeInfo("genClass", 209, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __genContext = new DmcAttributeInfo("genContext", 208, "GenerationContext", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __genContextName = new DmcAttributeInfo("genContextName", 207, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __genPackage = new DmcAttributeInfo("genPackage", 203, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __generator = new DmcAttributeInfo("generator", 200, "Generator", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __schemaToLoad = new DmcAttributeInfo("schemaToLoad", 201, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __upperConstantName = new DmcAttributeInfo("upperConstantName", 205, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:162)
    public final static DmcTypeInfo __type_ActifactGenerator = new DmcTypeInfo("ActifactGenerator", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DmgConfig = new DmcTypeInfo("DmgConfig", OriginalTypeEnum.OBJECT);
    public final static DmcTypeInfo __type_GenerationContext = new DmcTypeInfo("GenerationContext", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Generator = new DmcTypeInfo("Generator", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_MethodGenerator = new DmcTypeInfo("MethodGenerator", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WrapperGenerator = new DmcTypeInfo("WrapperGenerator", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:203)
    public final static DmcClassInfo __ActifactGenerator = new DmcClassInfo("ActifactGenerator","org.dmd.dmg.generated.dmo.ActifactGeneratorDMO", 205, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __DmgConfig = new DmcClassInfo("DmgConfig","org.dmd.dmg.generated.dmo.DmgConfigDMO", 201, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __GenerationContext = new DmcClassInfo("GenerationContext","org.dmd.dmg.generated.dmo.GenerationContextDMO", 202, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,DmgDMSAG.__genContextName);
    public final static DmcClassInfo __MethodGenerator = new DmcClassInfo("MethodGenerator","org.dmd.dmg.generated.dmo.MethodGeneratorDMO", 204, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __WrapperGenerator = new DmcClassInfo("WrapperGenerator","org.dmd.dmg.generated.dmo.WrapperGeneratorDMO", 203, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);

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

        _SmAp.put(__alias.id,__alias);
        _SmAp.put(__configSuffix.id,__configSuffix);
        _SmAp.put(__genClass.id,__genClass);
        _SmAp.put(__genContext.id,__genContext);
        _SmAp.put(__genContextName.id,__genContextName);
        _SmAp.put(__genPackage.id,__genPackage);
        _SmAp.put(__generator.id,__generator);
        _SmAp.put(__schemaToLoad.id,__schemaToLoad);
        _SmAp.put(__upperConstantName.id,__upperConstantName);
        _CmAp.put(__ActifactGenerator.id,__ActifactGenerator);
        _CmAp.put(__DmgConfig.id,__DmgConfig);
        _CmAp.put(__GenerationContext.id,__GenerationContext);
        _CmAp.put(__MethodGenerator.id,__MethodGenerator);
        _CmAp.put(__WrapperGenerator.id,__WrapperGenerator);

        __DmgConfig.addMust(__generator);
        __DmgConfig.addMust(__genPackage);
        __DmgConfig.addMay(__schemaToLoad);
        __DmgConfig.addMay(__configSuffix);
        __DmgConfig.addMay(MetaDMSAG.__description);
        __DmgConfig.addMay(MetaDMSAG.__generatedFileHeader);

        __GenerationContext.addMust(__genContextName);

        __WrapperGenerator.addMust(MetaDMSAG.__name);
        __WrapperGenerator.addMust(__genContext);
        __WrapperGenerator.addMust(MetaDMSAG.__classType);
        __WrapperGenerator.addMust(__genClass);

        __MethodGenerator.addMust(MetaDMSAG.__name);
        __MethodGenerator.addMust(__genContext);
        __MethodGenerator.addMust(MetaDMSAG.__valueType);
        __MethodGenerator.addMust(MetaDMSAG.__baseType);
        __MethodGenerator.addMust(__genClass);

        __ActifactGenerator.addMust(MetaDMSAG.__name);
        __ActifactGenerator.addMust(__genClass);


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

