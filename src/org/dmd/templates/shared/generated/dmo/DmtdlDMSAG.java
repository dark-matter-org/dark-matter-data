package org.dmd.templates.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1237)
import java.util.ArrayList;                                                                 // For storage of schema info - (DmoCompactSchemaFormatter.java:1152)
import java.util.HashMap;                                                                   // For storage of schema info - (DmoCompactSchemaFormatter.java:1151)
import java.util.Iterator;                                                                  // For access of schema info - (DmoCompactSchemaFormatter.java:1153)
import org.dmd.dmc.*;                                                                       // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1154)
import org.dmd.dmc.rules.RuleIF;                                                            // For rule info - (DmoCompactSchemaFormatter.java:1155)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                 // Base class from MetaDMSAG - (DmoCompactSchemaFormatter.java:1190)
import org.dmd.dms.generated.enums.ClassTypeEnum;                                           // Have class definitions - (DmoCompactSchemaFormatter.java:1159)
import org.dmd.dms.generated.enums.DataTypeEnum;                                            // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1160)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                                        // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1165)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                           // Have attribute definitions - (DmoCompactSchemaFormatter.java:1205)
import org.dmd.dmv.shared.extended.rulesdmo.OnlyOneOfTheseAttributesAllowedRule;            // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1231)
import org.dmd.dmv.shared.extended.rulesdmo.PatternMatchRule;                               // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1231)
import org.dmd.dmv.shared.extended.rulesdmo.ValueLengthRule;                                // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1231)
import org.dmd.dmv.shared.generated.dmo.OnlyOneOfTheseAttributesAllowedRuleDataDMO;         // To instantiate OnlyOneOfTheseAttributesAllowedRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO;                            // To instantiate PatternMatchRuleData rule data - (DmoCompactSchemaFormatter.java:1230)
import org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO;                             // To instantiate ValueLengthRuleData rule data - (DmoCompactSchemaFormatter.java:1230)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DmtdlDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmtdl";


    static int schemaBaseID = -478600;


    static int schemaIDRange = 50;


    static int schemaMaxID = -478550;

    public final static DmcAttributeInfo __commentFormat = new DmcAttributeInfo("dmtdl", "commentFormat", -478583, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __contains = new DmcAttributeInfo("dmtdl", "contains", -478594, "Contains", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __debugOn = new DmcAttributeInfo("dmtdl", "debugOn", -478582, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __definedInTdlModule = new DmcAttributeInfo("dmtdl", "definedInTdlModule", -478599, "TdlModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnTdlModule = new DmcAttributeInfo("dmtdl", "dependsOnTdlModule", -478598, "TdlModule", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __endsWith = new DmcAttributeInfo("dmtdl", "endsWith", -478591, "Section", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __endsWithText = new DmcAttributeInfo("dmtdl", "endsWithText", -478590, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __format = new DmcAttributeInfo("dmtdl", "format", -478596, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hasTemplate = new DmcAttributeInfo("dmtdl", "hasTemplate", -478586, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __insertMarker = new DmcAttributeInfo("dmtdl", "insertMarker", -478597, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __maxFastAddValues = new DmcAttributeInfo("dmtdl", "maxFastAddValues", -478584, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __package = new DmcAttributeInfo("dmtdl", "package", -478587, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __startsWith = new DmcAttributeInfo("dmtdl", "startsWith", -478593, "Section", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __startsWithText = new DmcAttributeInfo("dmtdl", "startsWithText", -478592, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __targetObjectClass = new DmcAttributeInfo("dmtdl", "targetObjectClass", -478580, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __templateFile = new DmcAttributeInfo("dmtdl", "templateFile", -478588, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __templateFileSuffix = new DmcAttributeInfo("dmtdl", "templateFileSuffix", -478585, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __usesSection = new DmcAttributeInfo("dmtdl", "usesSection", -478581, "Section", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __usesTemplate = new DmcAttributeInfo("dmtdl", "usesTemplate", -478595, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __value = new DmcAttributeInfo("dmtdl", "value", -478589, "Value", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_CardinalityEnum = new DmcTypeInfo("CardinalityEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ContainedElement = new DmcTypeInfo("ContainedElement", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Contains = new DmcTypeInfo("Contains", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_ExtensionHook = new DmcTypeInfo("ExtensionHook", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Section = new DmcTypeInfo("Section", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TdlDefinition = new DmcTypeInfo("TdlDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TdlModule = new DmcTypeInfo("TdlModule", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Template = new DmcTypeInfo("Template", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TextualArtifact = new DmcTypeInfo("TextualArtifact", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Value = new DmcTypeInfo("Value", OriginalTypeEnum.COMPLEXTYPE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __TdlDefinition = new DmcClassInfo("TdlDefinition","org.dmd.templates.shared.generated.dmo.TdlDefinitionDMO", -957198, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ContainedElement = new DmcClassInfo("ContainedElement","org.dmd.templates.shared.generated.dmo.ContainedElementDMO", -957197, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__TdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ExtensionHook = new DmcClassInfo("ExtensionHook","org.dmd.templates.shared.generated.dmo.ExtensionHookDMO", -957194, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ContainedElement,MetaDMSAG.__name);
    public final static DmcClassInfo __Section = new DmcClassInfo("Section","org.dmd.templates.shared.generated.dmo.SectionDMO", -957196, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ContainedElement,MetaDMSAG.__name);
    public final static DmcClassInfo __TdlModule = new DmcClassInfo("TdlModule","org.dmd.templates.shared.generated.dmo.TdlModuleDMO", -957199, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__TdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __TextualArtifact = new DmcClassInfo("TextualArtifact","org.dmd.templates.shared.generated.dmo.TextualArtifactDMO", -957195, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__TdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __Template = new DmcClassInfo("Template","org.dmd.templates.shared.generated.dmo.TemplateDMO", -957193, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:261)
    public final static PatternMatchRule __dmtdlCommentFormat;
    public final static OnlyOneOfTheseAttributesAllowedRule __dmtdlEndsWith;
    public final static ValueLengthRule __dmtdlInsertMarkerLength;
    public final static OnlyOneOfTheseAttributesAllowedRule __dmtdlStartsWith;
    public final static PatternMatchRule __dmtdlTargetObjectClass;

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

        DmtdlDMSAGAMAP.initSmAp(_SmAp);

        DmtdlDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DmtdlDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:391)
        try{
            PatternMatchRuleDataDMO _dmtdlCommentFormatData = new PatternMatchRuleDataDMO();
            _dmtdlCommentFormatData      .setMatchesPattern(".*::comment::.*");
            _dmtdlCommentFormatData      .setRuleName("dmtdlCommentFormat");
            _dmtdlCommentFormatData      .setFile("/src/org/dmd/templates/shared/dmdconfig/attributes.dmd");
            _dmtdlCommentFormatData      .setRuleTitle("The commentFormat must contain the value insertion ::comment::");
            _dmtdlCommentFormatData      .setLineNumber("155");
            _dmtdlCommentFormatData      .setApplyToAttribute("commentFormat");
            _dmtdlCommentFormatData      .setDefinedIn("dmtdl");

            __dmtdlCommentFormat = new PatternMatchRule(_dmtdlCommentFormatData);

            _RmAp.add(__dmtdlCommentFormat);

            OnlyOneOfTheseAttributesAllowedRuleDataDMO _dmtdlEndsWithData = new OnlyOneOfTheseAttributesAllowedRuleDataDMO();
            _dmtdlEndsWithData           .addOnePossibility("endsWith");
            _dmtdlEndsWithData           .addOnePossibility("endsWithText");
            _dmtdlEndsWithData           .setRuleName("dmtdlEndsWith");
            _dmtdlEndsWithData           .setApplyToClass("Section");
            _dmtdlEndsWithData           .setFile("/src/org/dmd/templates/shared/dmdconfig/classes.dmd");
            _dmtdlEndsWithData           .setRuleTitle("A Section can only endWith another Section or with a static piece of text.");
            _dmtdlEndsWithData           .setLineNumber("78");
            _dmtdlEndsWithData           .setDefinedIn("dmtdl");

            __dmtdlEndsWith = new OnlyOneOfTheseAttributesAllowedRule(_dmtdlEndsWithData);

            _RmAp.add(__dmtdlEndsWith);

            ValueLengthRuleDataDMO _dmtdlInsertMarkerLengthData = new ValueLengthRuleDataDMO();
            _dmtdlInsertMarkerLengthData .setMaxLength("3");
            _dmtdlInsertMarkerLengthData .setMinLength("2");
            _dmtdlInsertMarkerLengthData .setRuleName("dmtdlInsertMarkerLength");
            _dmtdlInsertMarkerLengthData .setFile("/src/org/dmd/templates/shared/dmdconfig/attributes.dmd");
            _dmtdlInsertMarkerLengthData .setRuleTitle("The insert marker must be 2 - 3 characters long.");
            _dmtdlInsertMarkerLengthData .setLineNumber("33");
            _dmtdlInsertMarkerLengthData .setApplyToAttribute("insertMarker");
            _dmtdlInsertMarkerLengthData .setDefinedIn("dmtdl");

            __dmtdlInsertMarkerLength = new ValueLengthRule(_dmtdlInsertMarkerLengthData);

            _RmAp.add(__dmtdlInsertMarkerLength);

            OnlyOneOfTheseAttributesAllowedRuleDataDMO _dmtdlStartsWithData = new OnlyOneOfTheseAttributesAllowedRuleDataDMO();
            _dmtdlStartsWithData         .addOnePossibility("startsWith");
            _dmtdlStartsWithData         .addOnePossibility("startsWithText");
            _dmtdlStartsWithData         .setRuleName("dmtdlStartsWith");
            _dmtdlStartsWithData         .setApplyToClass("Section");
            _dmtdlStartsWithData         .setFile("/src/org/dmd/templates/shared/dmdconfig/classes.dmd");
            _dmtdlStartsWithData         .setRuleTitle("A Section can only startWith another Section or with a static piece of text.");
            _dmtdlStartsWithData         .setLineNumber("59");
            _dmtdlStartsWithData         .setDefinedIn("dmtdl");

            __dmtdlStartsWith = new OnlyOneOfTheseAttributesAllowedRule(_dmtdlStartsWithData);

            _RmAp.add(__dmtdlStartsWith);

            PatternMatchRuleDataDMO _dmtdlTargetObjectClassData = new PatternMatchRuleDataDMO();
            _dmtdlTargetObjectClassData  .setMatchesPattern("([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*");
            _dmtdlTargetObjectClassData  .setRuleName("dmtdlTargetObjectClass");
            _dmtdlTargetObjectClassData  .setFile("/src/org/dmd/templates/shared/dmdconfig/attributes.dmd");
            _dmtdlTargetObjectClassData  .setRuleTitle("The targetObjectClass must be a valid, fully qualified, Java class name.");
            _dmtdlTargetObjectClassData  .setLineNumber("190");
            _dmtdlTargetObjectClassData  .setApplyToAttribute("targetObjectClass");
            _dmtdlTargetObjectClassData  .setDefinedIn("dmtdl");

            __dmtdlTargetObjectClass = new PatternMatchRule(_dmtdlTargetObjectClassData);

            _RmAp.add(__dmtdlTargetObjectClass);

        } catch(DmcValueException ex){
            throw(new IllegalStateException(ex));
        }

    }

    static  DmtdlDMSAG instance;

    protected DmtdlDMSAG (){
    }

    public synchronized static DmtdlDMSAG instance(){
        if (instance == null)
            instance = new DmtdlDMSAG();
        
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

