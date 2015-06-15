package org.dmd.dms.generated.dmo;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dmc.rules.RuleIF;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:581)
import org.dmd.dms.generated.types.DmcTypeBaseTypeEnumSTATIC;                   // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeBooleanSTATIC;                        // To handle default values for a standard type - (DmoCompactSchemaFormatter.java:546)
import org.dmd.dms.generated.types.DmcTypeClassTypeEnumSTATIC;                  // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeDataTypeEnumSTATIC;                   // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeDebugEnumSTATIC;                      // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeFilterTypeEnumSTATIC;                 // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeModifyTypeEnumSTATIC;                 // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeOperationalContextEnumSTATIC;         // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeOriginalTypeEnumSTATIC;               // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeRuleTypeEnumSTATIC;                   // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeValueTypeEnumSTATIC;                  // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)
import org.dmd.dms.generated.types.DmcTypeWrapperTypeEnumSTATIC;                // To handle default values for an enumerated type - (DmoCompactSchemaFormatter.java:568)

// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:604)
public class MetaDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "meta";


    static int schemaBaseID = 0;


    static int schemaIDRange = 200;


    static int schemaMaxID = 200;

// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:626)
    public final static Boolean __nrvBoolean;
    public final static BaseTypeEnum __nrvBaseTypeEnum;
    public final static ClassTypeEnum __nrvClassTypeEnum;
    public final static DataTypeEnum __nrvDataTypeEnum;
    public final static DebugEnum __nrvDebugEnum;
    public final static FilterTypeEnum __nrvFilterTypeEnum;
    public final static ModifyTypeEnum __nrvModifyTypeEnum;
    public final static OperationalContextEnum __nrvOperationalContextEnum;
    public final static OriginalTypeEnum __nrvOriginalTypeEnum;
    public final static RuleTypeEnum __nrvRuleTypeEnum;
    public final static ValueTypeEnum __nrvValueTypeEnum;
    public final static WrapperTypeEnum __nrvWrapperTypeEnum;

    static {
        try {
        __nrvBoolean = DmcTypeBooleanSTATIC.instance.typeCheck("false");
        __nrvBaseTypeEnum = DmcTypeBaseTypeEnumSTATIC.instance.typeCheck("PRIMITIVE");
        __nrvClassTypeEnum = DmcTypeClassTypeEnumSTATIC.instance.typeCheck("UNKNOWN");
        __nrvDataTypeEnum = DmcTypeDataTypeEnumSTATIC.instance.typeCheck("PERSISTENT");
        __nrvDebugEnum = DmcTypeDebugEnumSTATIC.instance.typeCheck("NONE");
        __nrvFilterTypeEnum = DmcTypeFilterTypeEnumSTATIC.instance.typeCheck("NONE");
        __nrvModifyTypeEnum = DmcTypeModifyTypeEnumSTATIC.instance.typeCheck("NONE");
        __nrvOperationalContextEnum = DmcTypeOperationalContextEnumSTATIC.instance.typeCheck("DMO");
        __nrvOriginalTypeEnum = DmcTypeOriginalTypeEnumSTATIC.instance.typeCheck("TYPE");
        __nrvRuleTypeEnum = DmcTypeRuleTypeEnumSTATIC.instance.typeCheck("ATTRIBUTE");
        __nrvValueTypeEnum = DmcTypeValueTypeEnumSTATIC.instance.typeCheck("SINGLE");
        __nrvWrapperTypeEnum = DmcTypeWrapperTypeEnumSTATIC.instance.typeCheck("BASE");
        } catch  (DmcValueException e) {
            throw(new IllegalStateException(e));
        }
    }

// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:633)
    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"FullyQualifiedName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __abbrev = new DmcAttributeInfo("abbrev",9,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __actionDefList = new DmcAttributeInfo("actionDefList",60,"ActionDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __actions = new DmcAttributeInfo("actions",32,"ActionDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __allowedParents = new DmcAttributeInfo("allowedParents",62,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __altType = new DmcAttributeInfo("altType",108,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __altTypeImport = new DmcAttributeInfo("altTypeImport",109,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __applyToAttribute = new DmcAttributeInfo("applyToAttribute",157,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __applyToClass = new DmcAttributeInfo("applyToClass",154,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __attachToClass = new DmcAttributeInfo("attachToClass",65,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __attributeDefList = new DmcAttributeInfo("attributeDefList",59,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __attributeInfoFromParam = new DmcAttributeInfo("attributeInfoFromParam",155,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __baseType = new DmcAttributeInfo("baseType",135,"BaseTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __classDefList = new DmcAttributeInfo("classDefList",55,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __classFilter = new DmcAttributeInfo("classFilter",128,"ClassFilter",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __classInfoFromParam = new DmcAttributeInfo("classInfoFromParam",151,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __classType = new DmcAttributeInfo("classType",10,"ClassTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __complexTypeDefList = new DmcAttributeInfo("complexTypeDefList",117,"ComplexTypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __createAttributeFactory = new DmcAttributeInfo("createAttributeFactory",89,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dataType = new DmcAttributeInfo("dataType",11,"DataTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defFiles = new DmcAttributeInfo("defFiles",68,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definedIn = new DmcAttributeInfo("definedIn",61,"SchemaDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependencies = new DmcAttributeInfo("dependencies",147,"Dependency",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependency = new DmcAttributeInfo("dependency",146,"Dependency",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOn = new DmcAttributeInfo("dependsOn",66,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnRef = new DmcAttributeInfo("dependsOnRef",67,"SchemaDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnSchema = new DmcAttributeInfo("dependsOnSchema",120,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __derivedClasses = new DmcAttributeInfo("derivedClasses",25,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __derivedFrom = new DmcAttributeInfo("derivedFrom",21,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __designatedFilterAttribute = new DmcAttributeInfo("designatedFilterAttribute",126,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __designatedNameAttribute = new DmcAttributeInfo("designatedNameAttribute",102,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmdID = new DmcAttributeInfo("dmdID",3,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmeClass = new DmcAttributeInfo("dmeClass",44,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmeImport = new DmcAttributeInfo("dmeImport",43,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmoAuxClass = new DmcAttributeInfo("dmoAuxClass",37,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmoAuxClassImport = new DmcAttributeInfo("dmoAuxClassImport",38,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmoClass = new DmcAttributeInfo("dmoClass",36,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmoImport = new DmcAttributeInfo("dmoImport",35,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmtClass = new DmcAttributeInfo("dmtClass",46,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmtImport = new DmcAttributeInfo("dmtImport",45,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmtREFImport = new DmcAttributeInfo("dmtREFImport",93,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwAuxClass = new DmcAttributeInfo("dmwAuxClass",39,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwAuxClassImport = new DmcAttributeInfo("dmwAuxClassImport",40,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwClass = new DmcAttributeInfo("dmwClass",42,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwImport = new DmcAttributeInfo("dmwImport",41,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwIteratorClass = new DmcAttributeInfo("dmwIteratorClass",92,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwIteratorImport = new DmcAttributeInfo("dmwIteratorImport",91,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwPackage = new DmcAttributeInfo("dmwPackage",54,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwTypeToPackage = new DmcAttributeInfo("dmwTypeToPackage",123,"StringToString",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dmwWrapperType = new DmcAttributeInfo("dmwWrapperType",124,"DmwTypeToWrapperType",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dotName = new DmcAttributeInfo("dotName",107,"DotName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __enumDefList = new DmcAttributeInfo("enumDefList",58,"EnumDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __enumInt = new DmcAttributeInfo("enumInt",69,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __enumName = new DmcAttributeInfo("enumName",99,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __enumString = new DmcAttributeInfo("enumString",70,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __enumValue = new DmcAttributeInfo("enumValue",33,"EnumValue",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __excludeFromContext = new DmcAttributeInfo("excludeFromContext",130,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __extendedClass = new DmcAttributeInfo("extendedClass",106,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __extendedReferenceClass = new DmcAttributeInfo("extendedReferenceClass",131,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __extendedReferenceTypeDefList = new DmcAttributeInfo("extendedReferenceTypeDefList",132,"ExtendedReferenceTypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __extendsInterface = new DmcAttributeInfo("extendsInterface",119,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __field = new DmcAttributeInfo("field",105,"Field",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __fieldSeparator = new DmcAttributeInfo("fieldSeparator",104,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __filterAttributeDef = new DmcAttributeInfo("filterAttributeDef",127,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __generatedFileHeader = new DmcAttributeInfo("generatedFileHeader",81,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __genericArgs = new DmcAttributeInfo("genericArgs",94,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __genericArgsImport = new DmcAttributeInfo("genericArgsImport",98,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __getMethod = new DmcAttributeInfo("getMethod",49,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __getType = new DmcAttributeInfo("getType",48,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __helperClassName = new DmcAttributeInfo("helperClassName",47,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __immediateHalt = new DmcAttributeInfo("immediateHalt",137,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __indexSize = new DmcAttributeInfo("indexSize",129,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __instantiation = new DmcAttributeInfo("instantiation",148,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __integerName = new DmcAttributeInfo("integerName",100,"IntegerName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __intendedToExtend = new DmcAttributeInfo("intendedToExtend",22,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __internalTypeDefList = new DmcAttributeInfo("internalTypeDefList",57,"TypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __internalTypeRef = new DmcAttributeInfo("internalTypeRef",20,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __internalUse = new DmcAttributeInfo("internalUse",122,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __internallyGenerated = new DmcAttributeInfo("internallyGenerated",77,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isDefaultValue = new DmcAttributeInfo("isDefaultValue",17,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isEnumType = new DmcAttributeInfo("isEnumType",16,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isExtendedRefType = new DmcAttributeInfo("isExtendedRefType",133,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isExtensible = new DmcAttributeInfo("isExtensible",142,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isFilterType = new DmcAttributeInfo("isFilterType",125,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isGetAction = new DmcAttributeInfo("isGetAction",72,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isHierarchicName = new DmcAttributeInfo("isHierarchicName",121,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isNameType = new DmcAttributeInfo("isNameType",95,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isNamedBy = new DmcAttributeInfo("isNamedBy",80,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isRefType = new DmcAttributeInfo("isRefType",14,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __isSchemaRtype = new DmcAttributeInfo("isSchemaRtype",15,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __javaClass = new DmcAttributeInfo("javaClass",34,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __keyClass = new DmcAttributeInfo("keyClass",96,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __keyImport = new DmcAttributeInfo("keyImport",97,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __longName = new DmcAttributeInfo("longName",134,"LongName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __may = new DmcAttributeInfo("may",27,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mayParm = new DmcAttributeInfo("mayParm",29,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mayReturn = new DmcAttributeInfo("mayReturn",31,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __maySendProgress = new DmcAttributeInfo("maySendProgress",76,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __modify = new DmcAttributeInfo("modify",85,"Modifier",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __msgKey = new DmcAttributeInfo("msgKey",23,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __msgParam = new DmcAttributeInfo("msgParam",52,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __must = new DmcAttributeInfo("must",26,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mustParm = new DmcAttributeInfo("mustParm",28,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mustReturn = new DmcAttributeInfo("mustReturn",30,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nameAttributeDef = new DmcAttributeInfo("nameAttributeDef",90,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __namingAttribute = new DmcAttributeInfo("namingAttribute",64,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nullReturnValue = new DmcAttributeInfo("nullReturnValue",7,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __nvp = new DmcAttributeInfo("nvp",178,"NameValuePair",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("objectClass",1,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __obsoleteVersion = new DmcAttributeInfo("obsoleteVersion",73,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __opContext = new DmcAttributeInfo("opContext",115,"OperationalContextEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __originalClass = new DmcAttributeInfo("originalClass",83,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __preserveNewlines = new DmcAttributeInfo("preserveNewlines",51,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __primitiveType = new DmcAttributeInfo("primitiveType",8,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleCategory = new DmcAttributeInfo("ruleCategory",139,"RuleCategory",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleCategoryID = new DmcAttributeInfo("ruleCategoryID",140,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleCategoryList = new DmcAttributeInfo("ruleCategoryList",143,"RuleCategory",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleDataList = new DmcAttributeInfo("ruleDataList",156,"RuleData",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleDefinition = new DmcAttributeInfo("ruleDefinition",145,"RuleDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleDefinitionList = new DmcAttributeInfo("ruleDefinitionList",144,"RuleDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleImport = new DmcAttributeInfo("ruleImport",152,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleName = new DmcAttributeInfo("ruleName",153,"RuleName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleParam = new DmcAttributeInfo("ruleParam",50,"RuleParam",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("ruleTitle",138,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __ruleType = new DmcAttributeInfo("ruleType",136,"RuleTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __runContext = new DmcAttributeInfo("runContext",149,"RunContext",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __schemaBaseID = new DmcAttributeInfo("schemaBaseID",86,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __schemaExtension = new DmcAttributeInfo("schemaExtension",4,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __schemaIDRange = new DmcAttributeInfo("schemaIDRange",87,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __schemaPackage = new DmcAttributeInfo("schemaPackage",53,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __secure = new DmcAttributeInfo("secure",78,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __selectAttribute = new DmcAttributeInfo("selectAttribute",110,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sliceDefList = new DmcAttributeInfo("sliceDefList",111,"SliceDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __subpackage = new DmcAttributeInfo("subpackage",88,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __supportsBackrefTracking = new DmcAttributeInfo("supportsBackrefTracking",118,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __type = new DmcAttributeInfo("type",19,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __typeClassName = new DmcAttributeInfo("typeClassName",5,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __typeDefList = new DmcAttributeInfo("typeDefList",56,"TypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useInterface = new DmcAttributeInfo("useInterface",150,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useWrapperType = new DmcAttributeInfo("useWrapperType",82,"WrapperTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __usesInterface = new DmcAttributeInfo("usesInterface",24,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("uuidName",101,"UUIDName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __valueType = new DmcAttributeInfo("valueType",12,"ValueTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __wrapperClassName = new DmcAttributeInfo("wrapperClassName",6,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:646)
    public final static DmcTypeInfo __type_ActionDefinition = new DmcTypeInfo("ActionDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_AttributeDefinition = new DmcTypeInfo("AttributeDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_AttributeID = new DmcTypeInfo("AttributeID", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_BaseTypeEnumREF = new DmcTypeInfo("BaseTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Boolean = new DmcTypeInfo("Boolean", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_Byte = new DmcTypeInfo("Byte", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_CamelCaseName = new DmcTypeInfo("CamelCaseName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_ClassDefinition = new DmcTypeInfo("ClassDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ClassFilter = new DmcTypeInfo("ClassFilter", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_ClassInfoRef = new DmcTypeInfo("ClassInfoRef", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_ClassTypeEnumREF = new DmcTypeInfo("ClassTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ComplexTypeDefinition = new DmcTypeInfo("ComplexTypeDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DataTypeEnumREF = new DmcTypeInfo("DataTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Date = new DmcTypeInfo("Date", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_DebugEnumREF = new DmcTypeInfo("DebugEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_DependencyImplementation = new DmcTypeInfo("DependencyImplementation", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Dependency = new DmcTypeInfo("Dependency", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DmcObject = new DmcTypeInfo("DmcObject", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_DmsDefinition = new DmcTypeInfo("DmsDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DmwTypeToWrapperType = new DmcTypeInfo("DmwTypeToWrapperType", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DotName = new DmcTypeInfo("DotName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_Double = new DmcTypeInfo("Double", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_EnumDefinition = new DmcTypeInfo("EnumDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_EnumValue = new DmcTypeInfo("EnumValue", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_ExtendedReferenceTypeDefinition = new DmcTypeInfo("ExtendedReferenceTypeDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Field = new DmcTypeInfo("Field", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_FilterContainer = new DmcTypeInfo("FilterContainer", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_FilterTypeEnumREF = new DmcTypeInfo("FilterTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Float = new DmcTypeInfo("Float", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_FullyQualifiedName = new DmcTypeInfo("FullyQualifiedName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_GPBField = new DmcTypeInfo("GPBField", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_GPBFieldTypeEnumREF = new DmcTypeInfo("GPBFieldTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_GPBScalarTypeEnumREF = new DmcTypeInfo("GPBScalarTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Integer = new DmcTypeInfo("Integer", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_IntegerName = new DmcTypeInfo("IntegerName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_IntegerToBoolean = new DmcTypeInfo("IntegerToBoolean", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_IntegerToString = new DmcTypeInfo("IntegerToString", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_IntegerToUUIDLite = new DmcTypeInfo("IntegerToUUIDLite", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_LabelledIntegerDataPoint = new DmcTypeInfo("LabelledIntegerDataPoint", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_Long = new DmcTypeInfo("Long", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_LongName = new DmcTypeInfo("LongName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_Modifier = new DmcTypeInfo("Modifier", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_ModifyTypeEnumREF = new DmcTypeInfo("ModifyTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_NameContainer = new DmcTypeInfo("NameContainer", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_NameValuePair = new DmcTypeInfo("NameValuePair", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_OperationalContextEnumREF = new DmcTypeInfo("OperationalContextEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_OriginalTypeEnumREF = new DmcTypeInfo("OriginalTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_RuleCategory = new DmcTypeInfo("RuleCategory", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RuleData = new DmcTypeInfo("RuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RuleDefinition = new DmcTypeInfo("RuleDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RuleName = new DmcTypeInfo("RuleName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_RuleParam = new DmcTypeInfo("RuleParam", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_RuleTypeEnumREF = new DmcTypeInfo("RuleTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_RunContext = new DmcTypeInfo("RunContext", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SchemaDefinition = new DmcTypeInfo("SchemaDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Short = new DmcTypeInfo("Short", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_SliceDefinition = new DmcTypeInfo("SliceDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_String = new DmcTypeInfo("String", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_StringName = new DmcTypeInfo("StringName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_StringToString = new DmcTypeInfo("StringToString", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_TimeDoubleDataPoint = new DmcTypeInfo("TimeDoubleDataPoint", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_TypeDefinition = new DmcTypeInfo("TypeDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UUIDLite = new DmcTypeInfo("UUIDLite", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_UUIDName = new DmcTypeInfo("UUIDName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_ValueTypeEnumREF = new DmcTypeInfo("ValueTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_WrapperTypeEnumREF = new DmcTypeInfo("WrapperTypeEnumREF", OriginalTypeEnum.ENUM);
// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:680)

    public final static DmcClassInfo __ActionTriggerInfo = new DmcClassInfo("ActionTriggerInfo","org.dmd.dms.generated.dmo.ActionTriggerInfoDMO",14,ClassTypeEnum.ABSTRACT,DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __DmsDefinition = new DmcClassInfo("DmsDefinition","org.dmd.dms.generated.dmo.DmsDefinitionDMO",1,ClassTypeEnum.ABSTRACT,DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __ActionDefinition = new DmcClassInfo("ActionDefinition","org.dmd.dms.generated.dmo.ActionDefinitionDMO",11,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __AttributeDefinition = new DmcClassInfo("AttributeDefinition","org.dmd.dms.generated.dmo.AttributeDefinitionDMO",7,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ClassDefinition = new DmcClassInfo("ClassDefinition","org.dmd.dms.generated.dmo.ClassDefinitionDMO",2,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ComplexTypeDefinition = new DmcClassInfo("ComplexTypeDefinition","org.dmd.dms.generated.dmo.ComplexTypeDefinitionDMO",5,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ExtendedReferenceTypeDefinition = new DmcClassInfo("ExtendedReferenceTypeDefinition","org.dmd.dms.generated.dmo.ExtendedReferenceTypeDefinitionDMO",6,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__ComplexTypeDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __Dependency = new DmcClassInfo("Dependency","org.dmd.dms.generated.dmo.DependencyDMO",18,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __DependencyImplementation = new DmcClassInfo("DependencyImplementation","org.dmd.dms.generated.dmo.DependencyImplementationDMO",19,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __EnumDefinition = new DmcClassInfo("EnumDefinition","org.dmd.dms.generated.dmo.EnumDefinitionDMO",3,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __RuleCategory = new DmcClassInfo("RuleCategory","org.dmd.dms.generated.dmo.RuleCategoryDMO",15,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __RuleDefinition = new DmcClassInfo("RuleDefinition","org.dmd.dms.generated.dmo.RuleDefinitionDMO",16,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __RunContext = new DmcClassInfo("RunContext","org.dmd.dms.generated.dmo.DependencyDMO",20,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __SchemaDefinition = new DmcClassInfo("SchemaDefinition","org.dmd.dms.generated.dmo.SchemaDefinitionDMO",12,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __SliceDefinition = new DmcClassInfo("SliceDefinition","org.dmd.dms.generated.dmo.SliceDefinitionDMO",8,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __TypeDefinition = new DmcClassInfo("TypeDefinition","org.dmd.dms.generated.dmo.TypeDefinitionDMO",4,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __RuleData = new DmcClassInfo("RuleData","org.dmd.dms.generated.dmo.RuleDataDMO",17,ClassTypeEnum.ABSTRACT,DataTypeEnum.PERSISTENT,null,MetaDMSAG.__ruleName);

// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:690)

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

        _SmAp.put(__FQN.id,__FQN);
        _SmAp.put(__abbrev.id,__abbrev);
        _SmAp.put(__actionDefList.id,__actionDefList);
        _SmAp.put(__actions.id,__actions);
        _SmAp.put(__allowedParents.id,__allowedParents);
        _SmAp.put(__altType.id,__altType);
        _SmAp.put(__altTypeImport.id,__altTypeImport);
        _SmAp.put(__applyToAttribute.id,__applyToAttribute);
        _SmAp.put(__applyToClass.id,__applyToClass);
        _SmAp.put(__attachToClass.id,__attachToClass);
        _SmAp.put(__attributeDefList.id,__attributeDefList);
        _SmAp.put(__attributeInfoFromParam.id,__attributeInfoFromParam);
        _SmAp.put(__baseType.id,__baseType);
        _SmAp.put(__camelCaseName.id,__camelCaseName);
        _SmAp.put(__classDefList.id,__classDefList);
        _SmAp.put(__classFilter.id,__classFilter);
        _SmAp.put(__classInfoFromParam.id,__classInfoFromParam);
        _SmAp.put(__classType.id,__classType);
        _SmAp.put(__complexTypeDefList.id,__complexTypeDefList);
        _SmAp.put(__createAttributeFactory.id,__createAttributeFactory);
        _SmAp.put(__dataType.id,__dataType);
        _SmAp.put(__defFiles.id,__defFiles);
        _SmAp.put(__definedIn.id,__definedIn);
        _SmAp.put(__dependencies.id,__dependencies);
        _SmAp.put(__dependency.id,__dependency);
        _SmAp.put(__dependsOn.id,__dependsOn);
        _SmAp.put(__dependsOnRef.id,__dependsOnRef);
        _SmAp.put(__dependsOnSchema.id,__dependsOnSchema);
        _SmAp.put(__derivedClasses.id,__derivedClasses);
        _SmAp.put(__derivedFrom.id,__derivedFrom);
        _SmAp.put(__description.id,__description);
        _SmAp.put(__designatedFilterAttribute.id,__designatedFilterAttribute);
        _SmAp.put(__designatedNameAttribute.id,__designatedNameAttribute);
        _SmAp.put(__dmdID.id,__dmdID);
        _SmAp.put(__dmeClass.id,__dmeClass);
        _SmAp.put(__dmeImport.id,__dmeImport);
        _SmAp.put(__dmoAuxClass.id,__dmoAuxClass);
        _SmAp.put(__dmoAuxClassImport.id,__dmoAuxClassImport);
        _SmAp.put(__dmoClass.id,__dmoClass);
        _SmAp.put(__dmoImport.id,__dmoImport);
        _SmAp.put(__dmtClass.id,__dmtClass);
        _SmAp.put(__dmtImport.id,__dmtImport);
        _SmAp.put(__dmtREFImport.id,__dmtREFImport);
        _SmAp.put(__dmwAuxClass.id,__dmwAuxClass);
        _SmAp.put(__dmwAuxClassImport.id,__dmwAuxClassImport);
        _SmAp.put(__dmwClass.id,__dmwClass);
        _SmAp.put(__dmwImport.id,__dmwImport);
        _SmAp.put(__dmwIteratorClass.id,__dmwIteratorClass);
        _SmAp.put(__dmwIteratorImport.id,__dmwIteratorImport);
        _SmAp.put(__dmwPackage.id,__dmwPackage);
        _SmAp.put(__dmwTypeToPackage.id,__dmwTypeToPackage);
        _SmAp.put(__dmwWrapperType.id,__dmwWrapperType);
        _SmAp.put(__dotName.id,__dotName);
        _SmAp.put(__enumDefList.id,__enumDefList);
        _SmAp.put(__enumInt.id,__enumInt);
        _SmAp.put(__enumName.id,__enumName);
        _SmAp.put(__enumString.id,__enumString);
        _SmAp.put(__enumValue.id,__enumValue);
        _SmAp.put(__excludeFromContext.id,__excludeFromContext);
        _SmAp.put(__extendedClass.id,__extendedClass);
        _SmAp.put(__extendedReferenceClass.id,__extendedReferenceClass);
        _SmAp.put(__extendedReferenceTypeDefList.id,__extendedReferenceTypeDefList);
        _SmAp.put(__extendsInterface.id,__extendsInterface);
        _SmAp.put(__field.id,__field);
        _SmAp.put(__fieldSeparator.id,__fieldSeparator);
        _SmAp.put(__file.id,__file);
        _SmAp.put(__filterAttributeDef.id,__filterAttributeDef);
        _SmAp.put(__generatedFileHeader.id,__generatedFileHeader);
        _SmAp.put(__genericArgs.id,__genericArgs);
        _SmAp.put(__genericArgsImport.id,__genericArgsImport);
        _SmAp.put(__getMethod.id,__getMethod);
        _SmAp.put(__getType.id,__getType);
        _SmAp.put(__helperClassName.id,__helperClassName);
        _SmAp.put(__immediateHalt.id,__immediateHalt);
        _SmAp.put(__indexSize.id,__indexSize);
        _SmAp.put(__instantiation.id,__instantiation);
        _SmAp.put(__integerName.id,__integerName);
        _SmAp.put(__intendedToExtend.id,__intendedToExtend);
        _SmAp.put(__internalTypeDefList.id,__internalTypeDefList);
        _SmAp.put(__internalTypeRef.id,__internalTypeRef);
        _SmAp.put(__internalUse.id,__internalUse);
        _SmAp.put(__internallyGenerated.id,__internallyGenerated);
        _SmAp.put(__isDefaultValue.id,__isDefaultValue);
        _SmAp.put(__isEnumType.id,__isEnumType);
        _SmAp.put(__isExtendedRefType.id,__isExtendedRefType);
        _SmAp.put(__isExtensible.id,__isExtensible);
        _SmAp.put(__isFilterType.id,__isFilterType);
        _SmAp.put(__isGetAction.id,__isGetAction);
        _SmAp.put(__isHierarchicName.id,__isHierarchicName);
        _SmAp.put(__isNameType.id,__isNameType);
        _SmAp.put(__isNamedBy.id,__isNamedBy);
        _SmAp.put(__isRefType.id,__isRefType);
        _SmAp.put(__isSchemaRtype.id,__isSchemaRtype);
        _SmAp.put(__javaClass.id,__javaClass);
        _SmAp.put(__keyClass.id,__keyClass);
        _SmAp.put(__keyImport.id,__keyImport);
        _SmAp.put(__lineNumber.id,__lineNumber);
        _SmAp.put(__longName.id,__longName);
        _SmAp.put(__may.id,__may);
        _SmAp.put(__mayParm.id,__mayParm);
        _SmAp.put(__mayReturn.id,__mayReturn);
        _SmAp.put(__maySendProgress.id,__maySendProgress);
        _SmAp.put(__modify.id,__modify);
        _SmAp.put(__msgKey.id,__msgKey);
        _SmAp.put(__msgParam.id,__msgParam);
        _SmAp.put(__must.id,__must);
        _SmAp.put(__mustParm.id,__mustParm);
        _SmAp.put(__mustReturn.id,__mustReturn);
        _SmAp.put(__name.id,__name);
        _SmAp.put(__nameAttributeDef.id,__nameAttributeDef);
        _SmAp.put(__namingAttribute.id,__namingAttribute);
        _SmAp.put(__nullReturnValue.id,__nullReturnValue);
        _SmAp.put(__nvp.id,__nvp);
        _SmAp.put(__objectClass.id,__objectClass);
        _SmAp.put(__obsoleteVersion.id,__obsoleteVersion);
        _SmAp.put(__opContext.id,__opContext);
        _SmAp.put(__originalClass.id,__originalClass);
        _SmAp.put(__preserveNewlines.id,__preserveNewlines);
        _SmAp.put(__primitiveType.id,__primitiveType);
        _SmAp.put(__ruleCategory.id,__ruleCategory);
        _SmAp.put(__ruleCategoryID.id,__ruleCategoryID);
        _SmAp.put(__ruleCategoryList.id,__ruleCategoryList);
        _SmAp.put(__ruleDataList.id,__ruleDataList);
        _SmAp.put(__ruleDefinition.id,__ruleDefinition);
        _SmAp.put(__ruleDefinitionList.id,__ruleDefinitionList);
        _SmAp.put(__ruleImport.id,__ruleImport);
        _SmAp.put(__ruleName.id,__ruleName);
        _SmAp.put(__ruleParam.id,__ruleParam);
        _SmAp.put(__ruleTitle.id,__ruleTitle);
        _SmAp.put(__ruleType.id,__ruleType);
        _SmAp.put(__runContext.id,__runContext);
        _SmAp.put(__schemaBaseID.id,__schemaBaseID);
        _SmAp.put(__schemaExtension.id,__schemaExtension);
        _SmAp.put(__schemaIDRange.id,__schemaIDRange);
        _SmAp.put(__schemaPackage.id,__schemaPackage);
        _SmAp.put(__secure.id,__secure);
        _SmAp.put(__selectAttribute.id,__selectAttribute);
        _SmAp.put(__sliceDefList.id,__sliceDefList);
        _SmAp.put(__subpackage.id,__subpackage);
        _SmAp.put(__supportsBackrefTracking.id,__supportsBackrefTracking);
        _SmAp.put(__type.id,__type);
        _SmAp.put(__typeClassName.id,__typeClassName);
        _SmAp.put(__typeDefList.id,__typeDefList);
        _SmAp.put(__useInterface.id,__useInterface);
        _SmAp.put(__useWrapperType.id,__useWrapperType);
        _SmAp.put(__usesInterface.id,__usesInterface);
        _SmAp.put(__uuidName.id,__uuidName);
        _SmAp.put(__valueType.id,__valueType);
        _SmAp.put(__wrapperClassName.id,__wrapperClassName);
        _CmAp.put(__ActionDefinition.id,__ActionDefinition);
        _CmAp.put(__ActionTriggerInfo.id,__ActionTriggerInfo);
        _CmAp.put(__AttributeDefinition.id,__AttributeDefinition);
        _CmAp.put(__ClassDefinition.id,__ClassDefinition);
        _CmAp.put(__ComplexTypeDefinition.id,__ComplexTypeDefinition);
        _CmAp.put(__Dependency.id,__Dependency);
        _CmAp.put(__DependencyImplementation.id,__DependencyImplementation);
        _CmAp.put(__DmsDefinition.id,__DmsDefinition);
        _CmAp.put(__EnumDefinition.id,__EnumDefinition);
        _CmAp.put(__ExtendedReferenceTypeDefinition.id,__ExtendedReferenceTypeDefinition);
        _CmAp.put(__RuleCategory.id,__RuleCategory);
        _CmAp.put(__RuleData.id,__RuleData);
        _CmAp.put(__RuleDefinition.id,__RuleDefinition);
        _CmAp.put(__RunContext.id,__RunContext);
        _CmAp.put(__SchemaDefinition.id,__SchemaDefinition);
        _CmAp.put(__SliceDefinition.id,__SliceDefinition);
        _CmAp.put(__TypeDefinition.id,__TypeDefinition);

        __ActionDefinition.addMust(__name);
        __ActionDefinition.addMay(__attachToClass);
        __ActionDefinition.addMay(__definedIn);
        __ActionDefinition.addMay(__description);
        __ActionDefinition.addMay(__file);
        __ActionDefinition.addMay(__isGetAction);
        __ActionDefinition.addMay(__lineNumber);
        __ActionDefinition.addMay(__mayParm);
        __ActionDefinition.addMay(__mayReturn);
        __ActionDefinition.addMay(__maySendProgress);
        __ActionDefinition.addMay(__mustParm);
        __ActionDefinition.addMay(__mustReturn);
        __ActionDefinition.addMay(__obsoleteVersion);

        __ActionTriggerInfo.addMust(__name);

        __AttributeDefinition.addMust(__name);
        __AttributeDefinition.addMust(__type);
        __AttributeDefinition.addMay(__abbrev);
        __AttributeDefinition.addMay(__dataType);
        __AttributeDefinition.addMay(__definedIn);
        __AttributeDefinition.addMay(__description);
        __AttributeDefinition.addMay(__designatedFilterAttribute);
        __AttributeDefinition.addMay(__designatedNameAttribute);
        __AttributeDefinition.addMay(__dmdID);
        __AttributeDefinition.addMay(__file);
        __AttributeDefinition.addMay(__genericArgs);
        __AttributeDefinition.addMay(__genericArgsImport);
        __AttributeDefinition.addMay(__indexSize);
        __AttributeDefinition.addMay(__internalUse);
        __AttributeDefinition.addMay(__lineNumber);
        __AttributeDefinition.addMay(__nullReturnValue);
        __AttributeDefinition.addMay(__obsoleteVersion);
        __AttributeDefinition.addMay(__preserveNewlines);
        __AttributeDefinition.addMay(__secure);
        __AttributeDefinition.addMay(__valueType);

        __ClassDefinition.addMust(__classType);
        __ClassDefinition.addMust(__dmdID);
        __ClassDefinition.addMust(__name);
        __ClassDefinition.addMay(__abbrev);
        __ClassDefinition.addMay(__actions);
        __ClassDefinition.addMay(__allowedParents);
        __ClassDefinition.addMay(__dataType);
        __ClassDefinition.addMay(__definedIn);
        __ClassDefinition.addMay(__derivedClasses);
        __ClassDefinition.addMay(__derivedFrom);
        __ClassDefinition.addMay(__description);
        __ClassDefinition.addMay(__dmeClass);
        __ClassDefinition.addMay(__dmeImport);
        __ClassDefinition.addMay(__dmoAuxClass);
        __ClassDefinition.addMay(__dmoAuxClassImport);
        __ClassDefinition.addMay(__dmoClass);
        __ClassDefinition.addMay(__dmoImport);
        __ClassDefinition.addMay(__dmtClass);
        __ClassDefinition.addMay(__dmtImport);
        __ClassDefinition.addMay(__dmtREFImport);
        __ClassDefinition.addMay(__dmwAuxClass);
        __ClassDefinition.addMay(__dmwAuxClassImport);
        __ClassDefinition.addMay(__dmwClass);
        __ClassDefinition.addMay(__dmwImport);
        __ClassDefinition.addMay(__dmwIteratorClass);
        __ClassDefinition.addMay(__dmwIteratorImport);
        __ClassDefinition.addMay(__dmwWrapperType);
        __ClassDefinition.addMay(__excludeFromContext);
        __ClassDefinition.addMay(__file);
        __ClassDefinition.addMay(__intendedToExtend);
        __ClassDefinition.addMay(__internalTypeRef);
        __ClassDefinition.addMay(__internallyGenerated);
        __ClassDefinition.addMay(__isNamedBy);
        __ClassDefinition.addMay(__javaClass);
        __ClassDefinition.addMay(__lineNumber);
        __ClassDefinition.addMay(__may);
        __ClassDefinition.addMay(__must);
        __ClassDefinition.addMay(__obsoleteVersion);
        __ClassDefinition.addMay(__ruleDefinition);
        __ClassDefinition.addMay(__subpackage);
        __ClassDefinition.addMay(__supportsBackrefTracking);
        __ClassDefinition.addMay(__useWrapperType);
        __ClassDefinition.addMay(__usesInterface);

        __ComplexTypeDefinition.addMust(__field);
        __ComplexTypeDefinition.addMust(__name);
        __ComplexTypeDefinition.addMay(__definedIn);
        __ComplexTypeDefinition.addMay(__description);
        __ComplexTypeDefinition.addMay(__extendedClass);
        __ComplexTypeDefinition.addMay(__fieldSeparator);
        __ComplexTypeDefinition.addMay(__file);
        __ComplexTypeDefinition.addMay(__lineNumber);

        __Dependency.addMust(__name);
        __Dependency.addMust(__useInterface);
        __Dependency.addMay(__definedIn);
        __Dependency.addMay(__dependencies);
        __Dependency.addMay(__file);
        __Dependency.addMay(__instantiation);
        __Dependency.addMay(__lineNumber);

        __DependencyImplementation.addMust(__dependency);
        __DependencyImplementation.addMust(__instantiation);
        __DependencyImplementation.addMust(__name);
        __DependencyImplementation.addMust(__runContext);
        __DependencyImplementation.addMay(__definedIn);
        __DependencyImplementation.addMay(__description);
        __DependencyImplementation.addMay(__file);
        __DependencyImplementation.addMay(__lineNumber);

        __DmsDefinition.addMust(__name);
        __DmsDefinition.addMay(__definedIn);
        __DmsDefinition.addMay(__file);
        __DmsDefinition.addMay(__lineNumber);

        __EnumDefinition.addMust(__enumValue);
        __EnumDefinition.addMust(__name);
        __EnumDefinition.addMay(__definedIn);
        __EnumDefinition.addMay(__description);
        __EnumDefinition.addMay(__file);
        __EnumDefinition.addMay(__lineNumber);
        __EnumDefinition.addMay(__nullReturnValue);

        __ExtendedReferenceTypeDefinition.addMust(__extendedReferenceClass);
        __ExtendedReferenceTypeDefinition.addMust(__field);
        __ExtendedReferenceTypeDefinition.addMust(__name);
        __ExtendedReferenceTypeDefinition.addMay(__definedIn);
        __ExtendedReferenceTypeDefinition.addMay(__description);
        __ExtendedReferenceTypeDefinition.addMay(__extendedClass);
        __ExtendedReferenceTypeDefinition.addMay(__fieldSeparator);
        __ExtendedReferenceTypeDefinition.addMay(__file);
        __ExtendedReferenceTypeDefinition.addMay(__lineNumber);

        __RuleCategory.addMust(__classInfoFromParam);
        __RuleCategory.addMust(__description);
        __RuleCategory.addMust(__name);
        __RuleCategory.addMust(__opContext);
        __RuleCategory.addMust(__ruleCategoryID);
        __RuleCategory.addMust(__ruleParam);
        __RuleCategory.addMust(__ruleType);
        __RuleCategory.addMay(__attributeInfoFromParam);
        __RuleCategory.addMay(__definedIn);
        __RuleCategory.addMay(__file);
        __RuleCategory.addMay(__lineNumber);
        __RuleCategory.addMay(__ruleImport);

        __RuleData.addMust(__ruleName);
        __RuleData.addMust(__ruleTitle);
        __RuleData.addMay(__applyToClass);
        __RuleData.addMay(__definedIn);
        __RuleData.addMay(__description);
        __RuleData.addMay(__file);
        __RuleData.addMay(__immediateHalt);
        __RuleData.addMay(__lineNumber);
        __RuleData.addMay(__msgKey);
        __RuleData.addMay(__msgParam);

        __RuleDefinition.addMust(__description);
        __RuleDefinition.addMust(__dmdID);
        __RuleDefinition.addMust(__name);
        __RuleDefinition.addMust(__ruleCategory);
        __RuleDefinition.addMay(__definedIn);
        __RuleDefinition.addMay(__dependency);
        __RuleDefinition.addMay(__file);
        __RuleDefinition.addMay(__isExtensible);
        __RuleDefinition.addMay(__lineNumber);
        __RuleDefinition.addMay(__may);
        __RuleDefinition.addMay(__must);

        __RunContext.addMust(__dependencies);
        __RunContext.addMust(__name);
        __RunContext.addMay(__definedIn);
        __RunContext.addMay(__description);
        __RunContext.addMay(__file);
        __RunContext.addMay(__lineNumber);

        __SchemaDefinition.addMust(__description);
        __SchemaDefinition.addMust(__name);
        __SchemaDefinition.addMust(__schemaBaseID);
        __SchemaDefinition.addMust(__schemaIDRange);
        __SchemaDefinition.addMust(__schemaPackage);
        __SchemaDefinition.addMay(__actionDefList);
        __SchemaDefinition.addMay(__attributeDefList);
        __SchemaDefinition.addMay(__classDefList);
        __SchemaDefinition.addMay(__complexTypeDefList);
        __SchemaDefinition.addMay(__createAttributeFactory);
        __SchemaDefinition.addMay(__defFiles);
        __SchemaDefinition.addMay(__definedIn);
        __SchemaDefinition.addMay(__dependsOn);
        __SchemaDefinition.addMay(__dependsOnRef);
        __SchemaDefinition.addMay(__dmwPackage);
        __SchemaDefinition.addMay(__dmwTypeToPackage);
        __SchemaDefinition.addMay(__enumDefList);
        __SchemaDefinition.addMay(__extendedReferenceTypeDefList);
        __SchemaDefinition.addMay(__file);
        __SchemaDefinition.addMay(__generatedFileHeader);
        __SchemaDefinition.addMay(__internalTypeDefList);
        __SchemaDefinition.addMay(__lineNumber);
        __SchemaDefinition.addMay(__ruleCategoryList);
        __SchemaDefinition.addMay(__ruleDataList);
        __SchemaDefinition.addMay(__ruleDefinitionList);
        __SchemaDefinition.addMay(__schemaExtension);
        __SchemaDefinition.addMay(__sliceDefList);
        __SchemaDefinition.addMay(__typeDefList);

        __SliceDefinition.addMust(__name);
        __SliceDefinition.addMust(__selectAttribute);
        __SliceDefinition.addMay(__definedIn);
        __SliceDefinition.addMay(__description);
        __SliceDefinition.addMay(__file);
        __SliceDefinition.addMay(__lineNumber);

        __TypeDefinition.addMust(__name);
        __TypeDefinition.addMust(__typeClassName);
        __TypeDefinition.addMay(__altType);
        __TypeDefinition.addMay(__altTypeImport);
        __TypeDefinition.addMay(__definedIn);
        __TypeDefinition.addMay(__description);
        __TypeDefinition.addMay(__dmwIteratorClass);
        __TypeDefinition.addMay(__dmwIteratorImport);
        __TypeDefinition.addMay(__enumName);
        __TypeDefinition.addMay(__file);
        __TypeDefinition.addMay(__filterAttributeDef);
        __TypeDefinition.addMay(__genericArgs);
        __TypeDefinition.addMay(__helperClassName);
        __TypeDefinition.addMay(__internallyGenerated);
        __TypeDefinition.addMay(__isEnumType);
        __TypeDefinition.addMay(__isExtendedRefType);
        __TypeDefinition.addMay(__isFilterType);
        __TypeDefinition.addMay(__isHierarchicName);
        __TypeDefinition.addMay(__isNameType);
        __TypeDefinition.addMay(__isRefType);
        __TypeDefinition.addMay(__keyClass);
        __TypeDefinition.addMay(__keyImport);
        __TypeDefinition.addMay(__lineNumber);
        __TypeDefinition.addMay(__nameAttributeDef);
        __TypeDefinition.addMay(__nullReturnValue);
        __TypeDefinition.addMay(__originalClass);
        __TypeDefinition.addMay(__primitiveType);
        __TypeDefinition.addMay(__wrapperClassName);

        _NmAp.put(DmcTypeCamelCaseNameSTATIC.instance.getNameClass(),DmcTypeCamelCaseNameSTATIC.instance);
        _NmAp.put(DmcTypeDotNameSTATIC.instance.getNameClass(),DmcTypeDotNameSTATIC.instance);
        _NmAp.put(DmcTypeFullyQualifiedNameSTATIC.instance.getNameClass(),DmcTypeFullyQualifiedNameSTATIC.instance);
        _NmAp.put(DmcTypeIntegerNameSTATIC.instance.getNameClass(),DmcTypeIntegerNameSTATIC.instance);
        _NmAp.put(DmcTypeLongNameSTATIC.instance.getNameClass(),DmcTypeLongNameSTATIC.instance);
        _NmAp.put(DmcTypeRuleNameSTATIC.instance.getNameClass(),DmcTypeRuleNameSTATIC.instance);
        _NmAp.put(DmcTypeStringNameSTATIC.instance.getNameClass(),DmcTypeStringNameSTATIC.instance);
        _NmAp.put(DmcTypeUUIDNameSTATIC.instance.getNameClass(),DmcTypeUUIDNameSTATIC.instance);
        _FmAp.put(DmcTypeClassFilterSTATIC.instance.getFilterClass(),DmcTypeClassFilterSTATIC.instance);

    }

    static  MetaDMSAG instance;

    protected MetaDMSAG (){
    }

    public synchronized static MetaDMSAG instance(){
        if (instance == null)
            instance = new MetaDMSAG();
        
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

