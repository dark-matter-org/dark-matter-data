package org.dmd.dms.generated.dmo;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.dms.generated.enums.OriginalTypeEnum;
import org.dmd.dms.generated.types.*;
import org.dmd.dmc.rules.RuleIF;


// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:769)
public class MetaDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "meta";


    static int schemaBaseID = 0;


    static int schemaIDRange = 200;


    static int schemaMaxID = 200;

// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:791)
    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("meta","FQN",84,"FullyQualifiedName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __abbrev = new DmcAttributeInfo("meta","abbrev",9,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __actionDefList = new DmcAttributeInfo("meta","actionDefList",60,"ActionDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __actions = new DmcAttributeInfo("meta","actions",32,"ActionDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __allowedParents = new DmcAttributeInfo("meta","allowedParents",62,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __altType = new DmcAttributeInfo("meta","altType",108,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __altTypeImport = new DmcAttributeInfo("meta","altTypeImport",109,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __applyToAttribute = new DmcAttributeInfo("meta","applyToAttribute",157,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __applyToClass = new DmcAttributeInfo("meta","applyToClass",154,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __attachToClass = new DmcAttributeInfo("meta","attachToClass",65,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __attributeDefList = new DmcAttributeInfo("meta","attributeDefList",59,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __attributeInfoFromParam = new DmcAttributeInfo("meta","attributeInfoFromParam",155,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __baseDefinition = new DmcAttributeInfo("meta","baseDefinition",164,"DSDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __baseType = new DmcAttributeInfo("meta","baseType",135,"BaseTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("meta","camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __classDefList = new DmcAttributeInfo("meta","classDefList",55,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __classFilter = new DmcAttributeInfo("meta","classFilter",128,"ClassFilter",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __classInfoFromParam = new DmcAttributeInfo("meta","classInfoFromParam",151,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __classType = new DmcAttributeInfo("meta","classType",10,"ClassTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __comment = new DmcAttributeInfo("meta","comment",185,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __complexTypeDefList = new DmcAttributeInfo("meta","complexTypeDefList",117,"ComplexTypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __createAttributeFactory = new DmcAttributeInfo("meta","createAttributeFactory",89,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __createIndex = new DmcAttributeInfo("meta","createIndex",190,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dataType = new DmcAttributeInfo("meta","dataType",11,"DataTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __defFiles = new DmcAttributeInfo("meta","defFiles",68,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __definedIn = new DmcAttributeInfo("meta","definedIn",61,"SchemaDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __definedInModuleAttribute = new DmcAttributeInfo("meta","definedInModuleAttribute",167,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dependencies = new DmcAttributeInfo("meta","dependencies",147,"Dependency",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dependency = new DmcAttributeInfo("meta","dependency",146,"Dependency",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dependsOn = new DmcAttributeInfo("meta","dependsOn",66,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dependsOnRef = new DmcAttributeInfo("meta","dependsOnRef",67,"SchemaDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dependsOnSchema = new DmcAttributeInfo("meta","dependsOnSchema",120,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __derivedClasses = new DmcAttributeInfo("meta","derivedClasses",25,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __derivedFrom = new DmcAttributeInfo("meta","derivedFrom",21,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("meta","description",18,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __designatedFilterAttribute = new DmcAttributeInfo("meta","designatedFilterAttribute",126,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __designatedNameAttribute = new DmcAttributeInfo("meta","designatedNameAttribute",102,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmdID = new DmcAttributeInfo("meta","dmdID",3,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmeClass = new DmcAttributeInfo("meta","dmeClass",44,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmeImport = new DmcAttributeInfo("meta","dmeImport",43,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmoAuxClass = new DmcAttributeInfo("meta","dmoAuxClass",37,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmoAuxClassImport = new DmcAttributeInfo("meta","dmoAuxClassImport",38,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmoClass = new DmcAttributeInfo("meta","dmoClass",36,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmoFromModule = new DmcAttributeInfo("meta","dmoFromModule",191,"String",ValueTypeEnum.SINGLE,DataTypeEnum.NONPERSISTENT,0,false);
    public final static DmcAttributeInfo __dmoImport = new DmcAttributeInfo("meta","dmoImport",35,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmtClass = new DmcAttributeInfo("meta","dmtClass",46,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmtImport = new DmcAttributeInfo("meta","dmtImport",45,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmtREFImport = new DmcAttributeInfo("meta","dmtREFImport",93,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwAuxClass = new DmcAttributeInfo("meta","dmwAuxClass",39,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwAuxClassImport = new DmcAttributeInfo("meta","dmwAuxClassImport",40,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwClass = new DmcAttributeInfo("meta","dmwClass",42,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwImport = new DmcAttributeInfo("meta","dmwImport",41,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwIteratorClass = new DmcAttributeInfo("meta","dmwIteratorClass",92,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwIteratorImport = new DmcAttributeInfo("meta","dmwIteratorImport",91,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwPackage = new DmcAttributeInfo("meta","dmwPackage",54,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwTypeToPackage = new DmcAttributeInfo("meta","dmwTypeToPackage",123,"StringToString",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dmwWrapperType = new DmcAttributeInfo("meta","dmwWrapperType",124,"DmwTypeToWrapperType",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dotName = new DmcAttributeInfo("meta","dotName",107,"DotName",ValueTypeEnum.SINGLE,DataTypeEnum.NONPERSISTENT,0,false);
    public final static DmcAttributeInfo __dsdModuleDefinition = new DmcAttributeInfo("meta","dsdModuleDefinition",168,"DSDefinitionModule",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __dsdModuleList = new DmcAttributeInfo("meta","dsdModuleList",169,"DSDefinitionModule",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __enumDefList = new DmcAttributeInfo("meta","enumDefList",58,"EnumDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __enumInt = new DmcAttributeInfo("meta","enumInt",69,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __enumName = new DmcAttributeInfo("meta","enumName",99,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __enumString = new DmcAttributeInfo("meta","enumString",70,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __enumValue = new DmcAttributeInfo("meta","enumValue",33,"EnumValue",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __example = new DmcAttributeInfo("meta","example",63,"Example",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __excludeFromContext = new DmcAttributeInfo("meta","excludeFromContext",130,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __extendedClass = new DmcAttributeInfo("meta","extendedClass",106,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __extendedReferenceClass = new DmcAttributeInfo("meta","extendedReferenceClass",131,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __extendedReferenceTypeDefList = new DmcAttributeInfo("meta","extendedReferenceTypeDefList",132,"ExtendedReferenceTypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __extendsInterface = new DmcAttributeInfo("meta","extendsInterface",119,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __field = new DmcAttributeInfo("meta","field",105,"Field",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __fieldSeparator = new DmcAttributeInfo("meta","fieldSeparator",104,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("meta","file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.NONPERSISTENT,0,false);
    public final static DmcAttributeInfo __fileExtension = new DmcAttributeInfo("meta","fileExtension",161,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __filterAttributeDef = new DmcAttributeInfo("meta","filterAttributeDef",127,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __generatedFileHeader = new DmcAttributeInfo("meta","generatedFileHeader",81,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __genericArgs = new DmcAttributeInfo("meta","genericArgs",94,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __genericArgsImport = new DmcAttributeInfo("meta","genericArgsImport",98,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __getMethod = new DmcAttributeInfo("meta","getMethod",49,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __getType = new DmcAttributeInfo("meta","getType",48,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __helperClassName = new DmcAttributeInfo("meta","helperClassName",47,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __hint = new DmcAttributeInfo("meta","hint",186,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __immediateHalt = new DmcAttributeInfo("meta","immediateHalt",137,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __indexSize = new DmcAttributeInfo("meta","indexSize",129,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __instantiation = new DmcAttributeInfo("meta","instantiation",148,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __integerName = new DmcAttributeInfo("meta","integerName",100,"IntegerName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __intendedToExtend = new DmcAttributeInfo("meta","intendedToExtend",22,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __internalTypeDefList = new DmcAttributeInfo("meta","internalTypeDefList",57,"TypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __internalTypeRef = new DmcAttributeInfo("meta","internalTypeRef",20,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __internalUse = new DmcAttributeInfo("meta","internalUse",122,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __internallyGenerated = new DmcAttributeInfo("meta","internallyGenerated",77,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isDSDefinition = new DmcAttributeInfo("meta","isDSDefinition",158,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isDefaultValue = new DmcAttributeInfo("meta","isDefaultValue",17,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isEnumType = new DmcAttributeInfo("meta","isEnumType",16,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isExtendedRefType = new DmcAttributeInfo("meta","isExtendedRefType",133,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isExtensible = new DmcAttributeInfo("meta","isExtensible",142,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isFilterType = new DmcAttributeInfo("meta","isFilterType",125,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isGetAction = new DmcAttributeInfo("meta","isGetAction",72,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isHierarchicName = new DmcAttributeInfo("meta","isHierarchicName",121,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isNameType = new DmcAttributeInfo("meta","isNameType",95,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isNamedBy = new DmcAttributeInfo("meta","isNamedBy",80,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isRefType = new DmcAttributeInfo("meta","isRefType",14,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __isSchemaRtype = new DmcAttributeInfo("meta","isSchemaRtype",15,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __javaClass = new DmcAttributeInfo("meta","javaClass",34,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __keyClass = new DmcAttributeInfo("meta","keyClass",96,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __keyImport = new DmcAttributeInfo("meta","keyImport",97,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("meta","lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.NONPERSISTENT,0,false);
    public final static DmcAttributeInfo __loadSchemaClass = new DmcAttributeInfo("meta","loadSchemaClass",173,"SchemaAndReason",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __longName = new DmcAttributeInfo("meta","longName",134,"LongName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __may = new DmcAttributeInfo("meta","may",27,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __mayParm = new DmcAttributeInfo("meta","mayParm",29,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __mayReturn = new DmcAttributeInfo("meta","mayReturn",31,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __maySendProgress = new DmcAttributeInfo("meta","maySendProgress",76,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __modify = new DmcAttributeInfo("meta","modify",85,"Modifier",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __moduleClassName = new DmcAttributeInfo("meta","moduleClassName",163,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __moduleDependenceAttribute = new DmcAttributeInfo("meta","moduleDependenceAttribute",165,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __msgKey = new DmcAttributeInfo("meta","msgKey",23,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __msgParam = new DmcAttributeInfo("meta","msgParam",52,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __must = new DmcAttributeInfo("meta","must",26,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __mustParm = new DmcAttributeInfo("meta","mustParm",28,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __mustReturn = new DmcAttributeInfo("meta","mustReturn",30,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("meta","name",2,"DefinitionName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __nameAttributeDef = new DmcAttributeInfo("meta","nameAttributeDef",90,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __namingAttribute = new DmcAttributeInfo("meta","namingAttribute",64,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __nullReturnValue = new DmcAttributeInfo("meta","nullReturnValue",7,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __numericOrBoolean = new DmcAttributeInfo("meta","numericOrBoolean",193,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __nvp = new DmcAttributeInfo("meta","nvp",178,"NameValuePair",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("meta","objectClass",1,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __obsolete = new DmcAttributeInfo("meta","obsolete",183,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __obsoleteVersion = new DmcAttributeInfo("meta","obsoleteVersion",73,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __opContext = new DmcAttributeInfo("meta","opContext",115,"OperationalContextEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __optimize = new DmcAttributeInfo("meta","optimize",180,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __optionalPart = new DmcAttributeInfo("meta","optionalPart",114,"Part",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __originalClass = new DmcAttributeInfo("meta","originalClass",83,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __partOfDefinitionModule = new DmcAttributeInfo("meta","partOfDefinitionModule",175,"DSDefinitionModule",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __preserveNewlines = new DmcAttributeInfo("meta","preserveNewlines",51,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __primitiveType = new DmcAttributeInfo("meta","primitiveType",8,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __question = new DmcAttributeInfo("meta","question",187,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __refersToDefsFromDSD = new DmcAttributeInfo("meta","refersToDefsFromDSD",166,"DSDefinitionModule",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __relatedToConcept = new DmcAttributeInfo("meta","relatedToConcept",176,"Concinnity",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __relationship = new DmcAttributeInfo("meta","relationship",189,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __requiredBaseModule = new DmcAttributeInfo("meta","requiredBaseModule",174,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __requiredPart = new DmcAttributeInfo("meta","requiredPart",112,"Part",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleCategory = new DmcAttributeInfo("meta","ruleCategory",139,"RuleCategory",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleCategoryID = new DmcAttributeInfo("meta","ruleCategoryID",140,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleCategoryList = new DmcAttributeInfo("meta","ruleCategoryList",143,"RuleCategory",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleDataList = new DmcAttributeInfo("meta","ruleDataList",156,"RuleData",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleDefinition = new DmcAttributeInfo("meta","ruleDefinition",145,"RuleDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleDefinitionList = new DmcAttributeInfo("meta","ruleDefinitionList",144,"RuleDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleImport = new DmcAttributeInfo("meta","ruleImport",152,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleName = new DmcAttributeInfo("meta","ruleName",153,"RuleName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleParam = new DmcAttributeInfo("meta","ruleParam",50,"RuleParam",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("meta","ruleTitle",138,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __ruleType = new DmcAttributeInfo("meta","ruleType",136,"RuleTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __runContext = new DmcAttributeInfo("meta","runContext",149,"RunContext",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __schemaBaseID = new DmcAttributeInfo("meta","schemaBaseID",86,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __schemaExtension = new DmcAttributeInfo("meta","schemaExtension",4,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __schemaIDRange = new DmcAttributeInfo("meta","schemaIDRange",87,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __schemaPackage = new DmcAttributeInfo("meta","schemaPackage",53,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __searchable = new DmcAttributeInfo("meta","searchable",188,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __secure = new DmcAttributeInfo("meta","secure",78,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __selectAttribute = new DmcAttributeInfo("meta","selectAttribute",110,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __skip = new DmcAttributeInfo("meta","skip",182,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __sliceDefList = new DmcAttributeInfo("meta","sliceDefList",111,"SliceDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __sortName = new DmcAttributeInfo("meta","sortName",170,"DotName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __stringName = new DmcAttributeInfo("meta","stringName",160,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __subpackage = new DmcAttributeInfo("meta","subpackage",88,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __supportDynamicSchemaLoading = new DmcAttributeInfo("meta","supportDynamicSchemaLoading",172,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __supportsBackrefTracking = new DmcAttributeInfo("meta","supportsBackrefTracking",118,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __tags = new DmcAttributeInfo("meta","tags",177,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __type = new DmcAttributeInfo("meta","type",19,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __typeClassName = new DmcAttributeInfo("meta","typeClassName",5,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __typeDefList = new DmcAttributeInfo("meta","typeDefList",56,"TypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __useInterface = new DmcAttributeInfo("meta","useInterface",150,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __useWrapperType = new DmcAttributeInfo("meta","useWrapperType",82,"WrapperTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __usesInterface = new DmcAttributeInfo("meta","usesInterface",24,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __usesWrapperInterface = new DmcAttributeInfo("meta","usesWrapperInterface",192,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("meta","uuidName",101,"UUIDName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __valueType = new DmcAttributeInfo("meta","valueType",12,"ValueTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __version = new DmcAttributeInfo("meta","version",181,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __weakReference = new DmcAttributeInfo("meta","weakReference",179,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);
    public final static DmcAttributeInfo __why = new DmcAttributeInfo("meta","why",184,"Concinnity",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,true);
    public final static DmcAttributeInfo __wrapperClassName = new DmcAttributeInfo("meta","wrapperClassName",6,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,0,false);

// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:817)
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
    public final static DmcTypeInfo __type_Concinnity = new DmcTypeInfo("Concinnity", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DSDefinitionModule = new DmcTypeInfo("DSDefinitionModule", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DSDefinition = new DmcTypeInfo("DSDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DataTypeEnumREF = new DmcTypeInfo("DataTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Date = new DmcTypeInfo("Date", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_DebugEnumREF = new DmcTypeInfo("DebugEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_DefinitionName = new DmcTypeInfo("DefinitionName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_DependencyImplementation = new DmcTypeInfo("DependencyImplementation", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Dependency = new DmcTypeInfo("Dependency", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DmcObject = new DmcTypeInfo("DmcObject", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_DmsDefinition = new DmcTypeInfo("DmsDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DmwTypeToWrapperType = new DmcTypeInfo("DmwTypeToWrapperType", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_DotName = new DmcTypeInfo("DotName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_Double = new DmcTypeInfo("Double", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_EnumDefinition = new DmcTypeInfo("EnumDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_EnumValue = new DmcTypeInfo("EnumValue", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_Example = new DmcTypeInfo("Example", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_ExtendedReferenceTypeDefinition = new DmcTypeInfo("ExtendedReferenceTypeDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Field = new DmcTypeInfo("Field", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_FilterContainer = new DmcTypeInfo("FilterContainer", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_FilterTypeEnumREF = new DmcTypeInfo("FilterTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Float = new DmcTypeInfo("Float", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_FullyQualifiedName = new DmcTypeInfo("FullyQualifiedName", OriginalTypeEnum.NAMETYPE);
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
    public final static DmcTypeInfo __type_NameValuePair = new DmcTypeInfo("NameValuePair", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_OperationalContextEnumREF = new DmcTypeInfo("OperationalContextEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Optimize = new DmcTypeInfo("Optimize", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_OriginalTypeEnumREF = new DmcTypeInfo("OriginalTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Part = new DmcTypeInfo("Part", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_RuleCategory = new DmcTypeInfo("RuleCategory", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RuleData = new DmcTypeInfo("RuleData", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RuleDefinition = new DmcTypeInfo("RuleDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RuleName = new DmcTypeInfo("RuleName", OriginalTypeEnum.NAMETYPE);
    public final static DmcTypeInfo __type_RuleParam = new DmcTypeInfo("RuleParam", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_RuleTypeEnumREF = new DmcTypeInfo("RuleTypeEnumREF", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_RunContext = new DmcTypeInfo("RunContext", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SchemaAndReason = new DmcTypeInfo("SchemaAndReason", OriginalTypeEnum.COMPLEXTYPE);
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
// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:851)

    public final static DmcClassInfo __ActionTriggerInfo = new DmcClassInfo("ActionTriggerInfo","org.dmd.dms.generated.dmo.ActionTriggerInfoDMO",14,ClassTypeEnum.ABSTRACT,DataTypeEnum.PERSISTENT,null,null);
    public final static DmcClassInfo __DSDefinition = new DmcClassInfo("DSDefinition","org.dmd.dms.generated.dmo.DSDefinitionDMO",1,ClassTypeEnum.ABSTRACT,DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);
    public final static DmcClassInfo __Concinnity = new DmcClassInfo("Concinnity","org.dmd.dms.generated.dmo.ConcinnityDMO",42,ClassTypeEnum.ABSTRACT,DataTypeEnum.PERSISTENT,__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __DmsDefinition = new DmcClassInfo("DmsDefinition","org.dmd.dms.generated.dmo.DmsDefinitionDMO",2,ClassTypeEnum.ABSTRACT,DataTypeEnum.PERSISTENT,__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ActionDefinition = new DmcClassInfo("ActionDefinition","org.dmd.dms.generated.dmo.ActionDefinitionDMO",11,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __AttributeDefinition = new DmcClassInfo("AttributeDefinition","org.dmd.dms.generated.dmo.AttributeDefinitionDMO",9,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ClassDefinition = new DmcClassInfo("ClassDefinition","org.dmd.dms.generated.dmo.ClassDefinitionDMO",4,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ComplexTypeDefinition = new DmcClassInfo("ComplexTypeDefinition","org.dmd.dms.generated.dmo.ComplexTypeDefinitionDMO",7,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ExtendedReferenceTypeDefinition = new DmcClassInfo("ExtendedReferenceTypeDefinition","org.dmd.dms.generated.dmo.ExtendedReferenceTypeDefinitionDMO",8,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__ComplexTypeDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __DSDefinitionModule = new DmcClassInfo("DSDefinitionModule","org.dmd.dms.generated.dmo.DSDefinitionModuleDMO",3,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __Dependency = new DmcClassInfo("Dependency","org.dmd.dms.generated.dmo.DependencyDMO",18,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __DependencyImplementation = new DmcClassInfo("DependencyImplementation","org.dmd.dms.generated.dmo.DependencyImplementationDMO",19,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __EnumDefinition = new DmcClassInfo("EnumDefinition","org.dmd.dms.generated.dmo.EnumDefinitionDMO",5,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __RuleCategory = new DmcClassInfo("RuleCategory","org.dmd.dms.generated.dmo.RuleCategoryDMO",15,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __RuleDefinition = new DmcClassInfo("RuleDefinition","org.dmd.dms.generated.dmo.RuleDefinitionDMO",16,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __RunContext = new DmcClassInfo("RunContext","org.dmd.dms.generated.dmo.DependencyDMO",20,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __SchemaDefinition = new DmcClassInfo("SchemaDefinition","org.dmd.dms.generated.dmo.SchemaDefinitionDMO",12,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __SliceDefinition = new DmcClassInfo("SliceDefinition","org.dmd.dms.generated.dmo.SliceDefinitionDMO",10,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __TypeDefinition = new DmcClassInfo("TypeDefinition","org.dmd.dms.generated.dmo.TypeDefinitionDMO",6,ClassTypeEnum.STRUCTURAL,DataTypeEnum.PERSISTENT,__DmsDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __RuleData = new DmcClassInfo("RuleData","org.dmd.dms.generated.dmo.RuleDataDMO",17,ClassTypeEnum.ABSTRACT,DataTypeEnum.PERSISTENT,null,MetaDMSAG.__ruleName);

// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:861)

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
        _SmAp.put(__baseDefinition.id,__baseDefinition);
        _SmAp.put(__baseType.id,__baseType);
        _SmAp.put(__camelCaseName.id,__camelCaseName);
        _SmAp.put(__classDefList.id,__classDefList);
        _SmAp.put(__classFilter.id,__classFilter);
        _SmAp.put(__classInfoFromParam.id,__classInfoFromParam);
        _SmAp.put(__classType.id,__classType);
        _SmAp.put(__comment.id,__comment);
        _SmAp.put(__complexTypeDefList.id,__complexTypeDefList);
        _SmAp.put(__createAttributeFactory.id,__createAttributeFactory);
        _SmAp.put(__createIndex.id,__createIndex);
        _SmAp.put(__dataType.id,__dataType);
        _SmAp.put(__defFiles.id,__defFiles);
        _SmAp.put(__definedIn.id,__definedIn);
        _SmAp.put(__definedInModuleAttribute.id,__definedInModuleAttribute);
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
        _SmAp.put(__dmoFromModule.id,__dmoFromModule);
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
        _SmAp.put(__dsdModuleDefinition.id,__dsdModuleDefinition);
        _SmAp.put(__dsdModuleList.id,__dsdModuleList);
        _SmAp.put(__enumDefList.id,__enumDefList);
        _SmAp.put(__enumInt.id,__enumInt);
        _SmAp.put(__enumName.id,__enumName);
        _SmAp.put(__enumString.id,__enumString);
        _SmAp.put(__enumValue.id,__enumValue);
        _SmAp.put(__example.id,__example);
        _SmAp.put(__excludeFromContext.id,__excludeFromContext);
        _SmAp.put(__extendedClass.id,__extendedClass);
        _SmAp.put(__extendedReferenceClass.id,__extendedReferenceClass);
        _SmAp.put(__extendedReferenceTypeDefList.id,__extendedReferenceTypeDefList);
        _SmAp.put(__extendsInterface.id,__extendsInterface);
        _SmAp.put(__field.id,__field);
        _SmAp.put(__fieldSeparator.id,__fieldSeparator);
        _SmAp.put(__file.id,__file);
        _SmAp.put(__fileExtension.id,__fileExtension);
        _SmAp.put(__filterAttributeDef.id,__filterAttributeDef);
        _SmAp.put(__generatedFileHeader.id,__generatedFileHeader);
        _SmAp.put(__genericArgs.id,__genericArgs);
        _SmAp.put(__genericArgsImport.id,__genericArgsImport);
        _SmAp.put(__getMethod.id,__getMethod);
        _SmAp.put(__getType.id,__getType);
        _SmAp.put(__helperClassName.id,__helperClassName);
        _SmAp.put(__hint.id,__hint);
        _SmAp.put(__immediateHalt.id,__immediateHalt);
        _SmAp.put(__indexSize.id,__indexSize);
        _SmAp.put(__instantiation.id,__instantiation);
        _SmAp.put(__integerName.id,__integerName);
        _SmAp.put(__intendedToExtend.id,__intendedToExtend);
        _SmAp.put(__internalTypeDefList.id,__internalTypeDefList);
        _SmAp.put(__internalTypeRef.id,__internalTypeRef);
        _SmAp.put(__internalUse.id,__internalUse);
        _SmAp.put(__internallyGenerated.id,__internallyGenerated);
        _SmAp.put(__isDSDefinition.id,__isDSDefinition);
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
        _SmAp.put(__loadSchemaClass.id,__loadSchemaClass);
        _SmAp.put(__longName.id,__longName);
        _SmAp.put(__may.id,__may);
        _SmAp.put(__mayParm.id,__mayParm);
        _SmAp.put(__mayReturn.id,__mayReturn);
        _SmAp.put(__maySendProgress.id,__maySendProgress);
        _SmAp.put(__modify.id,__modify);
        _SmAp.put(__moduleClassName.id,__moduleClassName);
        _SmAp.put(__moduleDependenceAttribute.id,__moduleDependenceAttribute);
        _SmAp.put(__msgKey.id,__msgKey);
        _SmAp.put(__msgParam.id,__msgParam);
        _SmAp.put(__must.id,__must);
        _SmAp.put(__mustParm.id,__mustParm);
        _SmAp.put(__mustReturn.id,__mustReturn);
        _SmAp.put(__name.id,__name);
        _SmAp.put(__nameAttributeDef.id,__nameAttributeDef);
        _SmAp.put(__namingAttribute.id,__namingAttribute);
        _SmAp.put(__nullReturnValue.id,__nullReturnValue);
        _SmAp.put(__numericOrBoolean.id,__numericOrBoolean);
        _SmAp.put(__nvp.id,__nvp);
        _SmAp.put(__objectClass.id,__objectClass);
        _SmAp.put(__obsolete.id,__obsolete);
        _SmAp.put(__obsoleteVersion.id,__obsoleteVersion);
        _SmAp.put(__opContext.id,__opContext);
        _SmAp.put(__optimize.id,__optimize);
        _SmAp.put(__optionalPart.id,__optionalPart);
        _SmAp.put(__originalClass.id,__originalClass);
        _SmAp.put(__partOfDefinitionModule.id,__partOfDefinitionModule);
        _SmAp.put(__preserveNewlines.id,__preserveNewlines);
        _SmAp.put(__primitiveType.id,__primitiveType);
        _SmAp.put(__question.id,__question);
        _SmAp.put(__refersToDefsFromDSD.id,__refersToDefsFromDSD);
        _SmAp.put(__relatedToConcept.id,__relatedToConcept);
        _SmAp.put(__relationship.id,__relationship);
        _SmAp.put(__requiredBaseModule.id,__requiredBaseModule);
        _SmAp.put(__requiredPart.id,__requiredPart);
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
        _SmAp.put(__searchable.id,__searchable);
        _SmAp.put(__secure.id,__secure);
        _SmAp.put(__selectAttribute.id,__selectAttribute);
        _SmAp.put(__skip.id,__skip);
        _SmAp.put(__sliceDefList.id,__sliceDefList);
        _SmAp.put(__sortName.id,__sortName);
        _SmAp.put(__stringName.id,__stringName);
        _SmAp.put(__subpackage.id,__subpackage);
        _SmAp.put(__supportDynamicSchemaLoading.id,__supportDynamicSchemaLoading);
        _SmAp.put(__supportsBackrefTracking.id,__supportsBackrefTracking);
        _SmAp.put(__tags.id,__tags);
        _SmAp.put(__type.id,__type);
        _SmAp.put(__typeClassName.id,__typeClassName);
        _SmAp.put(__typeDefList.id,__typeDefList);
        _SmAp.put(__useInterface.id,__useInterface);
        _SmAp.put(__useWrapperType.id,__useWrapperType);
        _SmAp.put(__usesInterface.id,__usesInterface);
        _SmAp.put(__usesWrapperInterface.id,__usesWrapperInterface);
        _SmAp.put(__uuidName.id,__uuidName);
        _SmAp.put(__valueType.id,__valueType);
        _SmAp.put(__version.id,__version);
        _SmAp.put(__weakReference.id,__weakReference);
        _SmAp.put(__why.id,__why);
        _SmAp.put(__wrapperClassName.id,__wrapperClassName);
        _CmAp.put(__ActionDefinition.id,__ActionDefinition);
        _CmAp.put(__ActionTriggerInfo.id,__ActionTriggerInfo);
        _CmAp.put(__AttributeDefinition.id,__AttributeDefinition);
        _CmAp.put(__ClassDefinition.id,__ClassDefinition);
        _CmAp.put(__ComplexTypeDefinition.id,__ComplexTypeDefinition);
        _CmAp.put(__Concinnity.id,__Concinnity);
        _CmAp.put(__DSDefinition.id,__DSDefinition);
        _CmAp.put(__DSDefinitionModule.id,__DSDefinitionModule);
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
        __ActionDefinition.addMay(__comment);
        __ActionDefinition.addMay(__definedIn);
        __ActionDefinition.addMay(__description);
        __ActionDefinition.addMay(__dmoFromModule);
        __ActionDefinition.addMay(__dotName);
        __ActionDefinition.addMay(__example);
        __ActionDefinition.addMay(__file);
        __ActionDefinition.addMay(__hint);
        __ActionDefinition.addMay(__isGetAction);
        __ActionDefinition.addMay(__lineNumber);
        __ActionDefinition.addMay(__mayParm);
        __ActionDefinition.addMay(__mayReturn);
        __ActionDefinition.addMay(__maySendProgress);
        __ActionDefinition.addMay(__mustParm);
        __ActionDefinition.addMay(__mustReturn);
        __ActionDefinition.addMay(__nvp);
        __ActionDefinition.addMay(__obsolete);
        __ActionDefinition.addMay(__obsoleteVersion);
        __ActionDefinition.addMay(__optimize);
        __ActionDefinition.addMay(__question);
        __ActionDefinition.addMay(__relatedToConcept);
        __ActionDefinition.addMay(__relationship);
        __ActionDefinition.addMay(__searchable);
        __ActionDefinition.addMay(__skip);
        __ActionDefinition.addMay(__sortName);
        __ActionDefinition.addMay(__tags);
        __ActionDefinition.addMay(__version);
        __ActionDefinition.addMay(__why);

        __ActionTriggerInfo.addMust(__name);

        __AttributeDefinition.addMust(__name);
        __AttributeDefinition.addMust(__type);
        __AttributeDefinition.addMay(__abbrev);
        __AttributeDefinition.addMay(__comment);
        __AttributeDefinition.addMay(__dataType);
        __AttributeDefinition.addMay(__definedIn);
        __AttributeDefinition.addMay(__description);
        __AttributeDefinition.addMay(__designatedFilterAttribute);
        __AttributeDefinition.addMay(__designatedNameAttribute);
        __AttributeDefinition.addMay(__dmdID);
        __AttributeDefinition.addMay(__dmoFromModule);
        __AttributeDefinition.addMay(__dotName);
        __AttributeDefinition.addMay(__example);
        __AttributeDefinition.addMay(__file);
        __AttributeDefinition.addMay(__genericArgs);
        __AttributeDefinition.addMay(__genericArgsImport);
        __AttributeDefinition.addMay(__hint);
        __AttributeDefinition.addMay(__indexSize);
        __AttributeDefinition.addMay(__internalUse);
        __AttributeDefinition.addMay(__lineNumber);
        __AttributeDefinition.addMay(__nullReturnValue);
        __AttributeDefinition.addMay(__nvp);
        __AttributeDefinition.addMay(__obsolete);
        __AttributeDefinition.addMay(__obsoleteVersion);
        __AttributeDefinition.addMay(__optimize);
        __AttributeDefinition.addMay(__preserveNewlines);
        __AttributeDefinition.addMay(__question);
        __AttributeDefinition.addMay(__relatedToConcept);
        __AttributeDefinition.addMay(__relationship);
        __AttributeDefinition.addMay(__searchable);
        __AttributeDefinition.addMay(__secure);
        __AttributeDefinition.addMay(__skip);
        __AttributeDefinition.addMay(__sortName);
        __AttributeDefinition.addMay(__tags);
        __AttributeDefinition.addMay(__valueType);
        __AttributeDefinition.addMay(__version);
        __AttributeDefinition.addMay(__weakReference);
        __AttributeDefinition.addMay(__why);

        __ClassDefinition.addMust(__classType);
        __ClassDefinition.addMust(__dmdID);
        __ClassDefinition.addMust(__name);
        __ClassDefinition.addMay(__abbrev);
        __ClassDefinition.addMay(__actions);
        __ClassDefinition.addMay(__allowedParents);
        __ClassDefinition.addMay(__comment);
        __ClassDefinition.addMay(__createIndex);
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
        __ClassDefinition.addMay(__dmoFromModule);
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
        __ClassDefinition.addMay(__dotName);
        __ClassDefinition.addMay(__dsdModuleDefinition);
        __ClassDefinition.addMay(__example);
        __ClassDefinition.addMay(__excludeFromContext);
        __ClassDefinition.addMay(__file);
        __ClassDefinition.addMay(__hint);
        __ClassDefinition.addMay(__intendedToExtend);
        __ClassDefinition.addMay(__internalTypeRef);
        __ClassDefinition.addMay(__internallyGenerated);
        __ClassDefinition.addMay(__isDSDefinition);
        __ClassDefinition.addMay(__isNamedBy);
        __ClassDefinition.addMay(__javaClass);
        __ClassDefinition.addMay(__lineNumber);
        __ClassDefinition.addMay(__may);
        __ClassDefinition.addMay(__must);
        __ClassDefinition.addMay(__nvp);
        __ClassDefinition.addMay(__obsolete);
        __ClassDefinition.addMay(__obsoleteVersion);
        __ClassDefinition.addMay(__optimize);
        __ClassDefinition.addMay(__partOfDefinitionModule);
        __ClassDefinition.addMay(__question);
        __ClassDefinition.addMay(__relatedToConcept);
        __ClassDefinition.addMay(__relationship);
        __ClassDefinition.addMay(__ruleDefinition);
        __ClassDefinition.addMay(__searchable);
        __ClassDefinition.addMay(__skip);
        __ClassDefinition.addMay(__sortName);
        __ClassDefinition.addMay(__subpackage);
        __ClassDefinition.addMay(__supportsBackrefTracking);
        __ClassDefinition.addMay(__tags);
        __ClassDefinition.addMay(__useWrapperType);
        __ClassDefinition.addMay(__usesInterface);
        __ClassDefinition.addMay(__usesWrapperInterface);
        __ClassDefinition.addMay(__version);
        __ClassDefinition.addMay(__why);

        __ComplexTypeDefinition.addMust(__name);
        __ComplexTypeDefinition.addMay(__comment);
        __ComplexTypeDefinition.addMay(__definedIn);
        __ComplexTypeDefinition.addMay(__description);
        __ComplexTypeDefinition.addMay(__dmoFromModule);
        __ComplexTypeDefinition.addMay(__dotName);
        __ComplexTypeDefinition.addMay(__example);
        __ComplexTypeDefinition.addMay(__extendedClass);
        __ComplexTypeDefinition.addMay(__field);
        __ComplexTypeDefinition.addMay(__fieldSeparator);
        __ComplexTypeDefinition.addMay(__file);
        __ComplexTypeDefinition.addMay(__hint);
        __ComplexTypeDefinition.addMay(__lineNumber);
        __ComplexTypeDefinition.addMay(__nvp);
        __ComplexTypeDefinition.addMay(__obsolete);
        __ComplexTypeDefinition.addMay(__optimize);
        __ComplexTypeDefinition.addMay(__optionalPart);
        __ComplexTypeDefinition.addMay(__question);
        __ComplexTypeDefinition.addMay(__relatedToConcept);
        __ComplexTypeDefinition.addMay(__relationship);
        __ComplexTypeDefinition.addMay(__requiredPart);
        __ComplexTypeDefinition.addMay(__searchable);
        __ComplexTypeDefinition.addMay(__skip);
        __ComplexTypeDefinition.addMay(__sortName);
        __ComplexTypeDefinition.addMay(__tags);
        __ComplexTypeDefinition.addMay(__version);
        __ComplexTypeDefinition.addMay(__why);

        __Concinnity.addMust(__name);
        __Concinnity.addMay(__comment);
        __Concinnity.addMay(__definedIn);
        __Concinnity.addMay(__description);
        __Concinnity.addMay(__dmoFromModule);
        __Concinnity.addMay(__dotName);
        __Concinnity.addMay(__example);
        __Concinnity.addMay(__file);
        __Concinnity.addMay(__hint);
        __Concinnity.addMay(__lineNumber);
        __Concinnity.addMay(__nvp);
        __Concinnity.addMay(__obsolete);
        __Concinnity.addMay(__optimize);
        __Concinnity.addMay(__question);
        __Concinnity.addMay(__relationship);
        __Concinnity.addMay(__searchable);
        __Concinnity.addMay(__skip);
        __Concinnity.addMay(__sortName);
        __Concinnity.addMay(__tags);
        __Concinnity.addMay(__version);
        __Concinnity.addMay(__why);

        __DSDefinition.addMust(__name);
        __DSDefinition.addMay(__comment);
        __DSDefinition.addMay(__definedIn);
        __DSDefinition.addMay(__description);
        __DSDefinition.addMay(__dmoFromModule);
        __DSDefinition.addMay(__dotName);
        __DSDefinition.addMay(__example);
        __DSDefinition.addMay(__file);
        __DSDefinition.addMay(__hint);
        __DSDefinition.addMay(__lineNumber);
        __DSDefinition.addMay(__nvp);
        __DSDefinition.addMay(__obsolete);
        __DSDefinition.addMay(__optimize);
        __DSDefinition.addMay(__question);
        __DSDefinition.addMay(__relationship);
        __DSDefinition.addMay(__searchable);
        __DSDefinition.addMay(__skip);
        __DSDefinition.addMay(__sortName);
        __DSDefinition.addMay(__tags);
        __DSDefinition.addMay(__version);
        __DSDefinition.addMay(__why);

        __DSDefinitionModule.addMust(__baseDefinition);
        __DSDefinitionModule.addMust(__dmdID);
        __DSDefinitionModule.addMust(__fileExtension);
        __DSDefinitionModule.addMust(__moduleClassName);
        __DSDefinitionModule.addMust(__moduleDependenceAttribute);
        __DSDefinitionModule.addMust(__name);
        __DSDefinitionModule.addMay(__comment);
        __DSDefinitionModule.addMay(__definedIn);
        __DSDefinitionModule.addMay(__definedInModuleAttribute);
        __DSDefinitionModule.addMay(__description);
        __DSDefinitionModule.addMay(__dmoFromModule);
        __DSDefinitionModule.addMay(__dotName);
        __DSDefinitionModule.addMay(__example);
        __DSDefinitionModule.addMay(__file);
        __DSDefinitionModule.addMay(__hint);
        __DSDefinitionModule.addMay(__lineNumber);
        __DSDefinitionModule.addMay(__may);
        __DSDefinitionModule.addMay(__must);
        __DSDefinitionModule.addMay(__nvp);
        __DSDefinitionModule.addMay(__obsolete);
        __DSDefinitionModule.addMay(__optimize);
        __DSDefinitionModule.addMay(__question);
        __DSDefinitionModule.addMay(__refersToDefsFromDSD);
        __DSDefinitionModule.addMay(__relatedToConcept);
        __DSDefinitionModule.addMay(__relationship);
        __DSDefinitionModule.addMay(__requiredBaseModule);
        __DSDefinitionModule.addMay(__searchable);
        __DSDefinitionModule.addMay(__skip);
        __DSDefinitionModule.addMay(__sortName);
        __DSDefinitionModule.addMay(__supportDynamicSchemaLoading);
        __DSDefinitionModule.addMay(__tags);
        __DSDefinitionModule.addMay(__version);
        __DSDefinitionModule.addMay(__why);

        __Dependency.addMust(__name);
        __Dependency.addMust(__useInterface);
        __Dependency.addMay(__comment);
        __Dependency.addMay(__definedIn);
        __Dependency.addMay(__dependencies);
        __Dependency.addMay(__description);
        __Dependency.addMay(__dmoFromModule);
        __Dependency.addMay(__dotName);
        __Dependency.addMay(__example);
        __Dependency.addMay(__file);
        __Dependency.addMay(__hint);
        __Dependency.addMay(__instantiation);
        __Dependency.addMay(__lineNumber);
        __Dependency.addMay(__nvp);
        __Dependency.addMay(__obsolete);
        __Dependency.addMay(__optimize);
        __Dependency.addMay(__question);
        __Dependency.addMay(__relatedToConcept);
        __Dependency.addMay(__relationship);
        __Dependency.addMay(__searchable);
        __Dependency.addMay(__skip);
        __Dependency.addMay(__sortName);
        __Dependency.addMay(__tags);
        __Dependency.addMay(__version);
        __Dependency.addMay(__why);

        __DependencyImplementation.addMust(__dependency);
        __DependencyImplementation.addMust(__instantiation);
        __DependencyImplementation.addMust(__name);
        __DependencyImplementation.addMust(__runContext);
        __DependencyImplementation.addMay(__comment);
        __DependencyImplementation.addMay(__definedIn);
        __DependencyImplementation.addMay(__description);
        __DependencyImplementation.addMay(__dmoFromModule);
        __DependencyImplementation.addMay(__dotName);
        __DependencyImplementation.addMay(__example);
        __DependencyImplementation.addMay(__file);
        __DependencyImplementation.addMay(__hint);
        __DependencyImplementation.addMay(__lineNumber);
        __DependencyImplementation.addMay(__nvp);
        __DependencyImplementation.addMay(__obsolete);
        __DependencyImplementation.addMay(__optimize);
        __DependencyImplementation.addMay(__question);
        __DependencyImplementation.addMay(__relatedToConcept);
        __DependencyImplementation.addMay(__relationship);
        __DependencyImplementation.addMay(__searchable);
        __DependencyImplementation.addMay(__skip);
        __DependencyImplementation.addMay(__sortName);
        __DependencyImplementation.addMay(__tags);
        __DependencyImplementation.addMay(__version);
        __DependencyImplementation.addMay(__why);

        __DmsDefinition.addMust(__name);
        __DmsDefinition.addMay(__comment);
        __DmsDefinition.addMay(__definedIn);
        __DmsDefinition.addMay(__description);
        __DmsDefinition.addMay(__dmoFromModule);
        __DmsDefinition.addMay(__dotName);
        __DmsDefinition.addMay(__example);
        __DmsDefinition.addMay(__file);
        __DmsDefinition.addMay(__hint);
        __DmsDefinition.addMay(__lineNumber);
        __DmsDefinition.addMay(__nvp);
        __DmsDefinition.addMay(__obsolete);
        __DmsDefinition.addMay(__optimize);
        __DmsDefinition.addMay(__question);
        __DmsDefinition.addMay(__relatedToConcept);
        __DmsDefinition.addMay(__relationship);
        __DmsDefinition.addMay(__searchable);
        __DmsDefinition.addMay(__skip);
        __DmsDefinition.addMay(__sortName);
        __DmsDefinition.addMay(__tags);
        __DmsDefinition.addMay(__version);
        __DmsDefinition.addMay(__why);

        __EnumDefinition.addMust(__enumValue);
        __EnumDefinition.addMust(__name);
        __EnumDefinition.addMay(__comment);
        __EnumDefinition.addMay(__definedIn);
        __EnumDefinition.addMay(__description);
        __EnumDefinition.addMay(__dmoFromModule);
        __EnumDefinition.addMay(__dotName);
        __EnumDefinition.addMay(__example);
        __EnumDefinition.addMay(__file);
        __EnumDefinition.addMay(__hint);
        __EnumDefinition.addMay(__lineNumber);
        __EnumDefinition.addMay(__nullReturnValue);
        __EnumDefinition.addMay(__nvp);
        __EnumDefinition.addMay(__obsolete);
        __EnumDefinition.addMay(__optimize);
        __EnumDefinition.addMay(__question);
        __EnumDefinition.addMay(__relatedToConcept);
        __EnumDefinition.addMay(__relationship);
        __EnumDefinition.addMay(__searchable);
        __EnumDefinition.addMay(__skip);
        __EnumDefinition.addMay(__sortName);
        __EnumDefinition.addMay(__tags);
        __EnumDefinition.addMay(__version);
        __EnumDefinition.addMay(__why);

        __ExtendedReferenceTypeDefinition.addMust(__extendedReferenceClass);
        __ExtendedReferenceTypeDefinition.addMust(__name);
        __ExtendedReferenceTypeDefinition.addMay(__comment);
        __ExtendedReferenceTypeDefinition.addMay(__definedIn);
        __ExtendedReferenceTypeDefinition.addMay(__description);
        __ExtendedReferenceTypeDefinition.addMay(__dmoFromModule);
        __ExtendedReferenceTypeDefinition.addMay(__dotName);
        __ExtendedReferenceTypeDefinition.addMay(__example);
        __ExtendedReferenceTypeDefinition.addMay(__extendedClass);
        __ExtendedReferenceTypeDefinition.addMay(__field);
        __ExtendedReferenceTypeDefinition.addMay(__fieldSeparator);
        __ExtendedReferenceTypeDefinition.addMay(__file);
        __ExtendedReferenceTypeDefinition.addMay(__hint);
        __ExtendedReferenceTypeDefinition.addMay(__lineNumber);
        __ExtendedReferenceTypeDefinition.addMay(__nvp);
        __ExtendedReferenceTypeDefinition.addMay(__obsolete);
        __ExtendedReferenceTypeDefinition.addMay(__optimize);
        __ExtendedReferenceTypeDefinition.addMay(__optionalPart);
        __ExtendedReferenceTypeDefinition.addMay(__question);
        __ExtendedReferenceTypeDefinition.addMay(__relatedToConcept);
        __ExtendedReferenceTypeDefinition.addMay(__relationship);
        __ExtendedReferenceTypeDefinition.addMay(__requiredPart);
        __ExtendedReferenceTypeDefinition.addMay(__searchable);
        __ExtendedReferenceTypeDefinition.addMay(__skip);
        __ExtendedReferenceTypeDefinition.addMay(__sortName);
        __ExtendedReferenceTypeDefinition.addMay(__tags);
        __ExtendedReferenceTypeDefinition.addMay(__version);
        __ExtendedReferenceTypeDefinition.addMay(__why);

        __RuleCategory.addMust(__classInfoFromParam);
        __RuleCategory.addMust(__name);
        __RuleCategory.addMust(__opContext);
        __RuleCategory.addMust(__ruleCategoryID);
        __RuleCategory.addMust(__ruleParam);
        __RuleCategory.addMust(__ruleType);
        __RuleCategory.addMay(__attributeInfoFromParam);
        __RuleCategory.addMay(__comment);
        __RuleCategory.addMay(__definedIn);
        __RuleCategory.addMay(__description);
        __RuleCategory.addMay(__dmoFromModule);
        __RuleCategory.addMay(__dotName);
        __RuleCategory.addMay(__example);
        __RuleCategory.addMay(__file);
        __RuleCategory.addMay(__hint);
        __RuleCategory.addMay(__lineNumber);
        __RuleCategory.addMay(__nvp);
        __RuleCategory.addMay(__obsolete);
        __RuleCategory.addMay(__optimize);
        __RuleCategory.addMay(__question);
        __RuleCategory.addMay(__relatedToConcept);
        __RuleCategory.addMay(__relationship);
        __RuleCategory.addMay(__ruleImport);
        __RuleCategory.addMay(__searchable);
        __RuleCategory.addMay(__skip);
        __RuleCategory.addMay(__sortName);
        __RuleCategory.addMay(__tags);
        __RuleCategory.addMay(__version);
        __RuleCategory.addMay(__why);

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

        __RuleDefinition.addMust(__dmdID);
        __RuleDefinition.addMust(__name);
        __RuleDefinition.addMust(__ruleCategory);
        __RuleDefinition.addMay(__comment);
        __RuleDefinition.addMay(__definedIn);
        __RuleDefinition.addMay(__dependency);
        __RuleDefinition.addMay(__description);
        __RuleDefinition.addMay(__dmoFromModule);
        __RuleDefinition.addMay(__dotName);
        __RuleDefinition.addMay(__example);
        __RuleDefinition.addMay(__file);
        __RuleDefinition.addMay(__hint);
        __RuleDefinition.addMay(__isExtensible);
        __RuleDefinition.addMay(__lineNumber);
        __RuleDefinition.addMay(__may);
        __RuleDefinition.addMay(__must);
        __RuleDefinition.addMay(__nvp);
        __RuleDefinition.addMay(__obsolete);
        __RuleDefinition.addMay(__optimize);
        __RuleDefinition.addMay(__question);
        __RuleDefinition.addMay(__relatedToConcept);
        __RuleDefinition.addMay(__relationship);
        __RuleDefinition.addMay(__searchable);
        __RuleDefinition.addMay(__skip);
        __RuleDefinition.addMay(__sortName);
        __RuleDefinition.addMay(__tags);
        __RuleDefinition.addMay(__version);
        __RuleDefinition.addMay(__why);

        __RunContext.addMust(__dependencies);
        __RunContext.addMust(__name);
        __RunContext.addMay(__comment);
        __RunContext.addMay(__definedIn);
        __RunContext.addMay(__description);
        __RunContext.addMay(__dmoFromModule);
        __RunContext.addMay(__dotName);
        __RunContext.addMay(__example);
        __RunContext.addMay(__file);
        __RunContext.addMay(__hint);
        __RunContext.addMay(__lineNumber);
        __RunContext.addMay(__nvp);
        __RunContext.addMay(__obsolete);
        __RunContext.addMay(__optimize);
        __RunContext.addMay(__question);
        __RunContext.addMay(__relatedToConcept);
        __RunContext.addMay(__relationship);
        __RunContext.addMay(__searchable);
        __RunContext.addMay(__skip);
        __RunContext.addMay(__sortName);
        __RunContext.addMay(__tags);
        __RunContext.addMay(__version);
        __RunContext.addMay(__why);

        __SchemaDefinition.addMust(__name);
        __SchemaDefinition.addMust(__schemaBaseID);
        __SchemaDefinition.addMust(__schemaIDRange);
        __SchemaDefinition.addMust(__schemaPackage);
        __SchemaDefinition.addMay(__actionDefList);
        __SchemaDefinition.addMay(__attributeDefList);
        __SchemaDefinition.addMay(__classDefList);
        __SchemaDefinition.addMay(__comment);
        __SchemaDefinition.addMay(__complexTypeDefList);
        __SchemaDefinition.addMay(__createAttributeFactory);
        __SchemaDefinition.addMay(__defFiles);
        __SchemaDefinition.addMay(__definedIn);
        __SchemaDefinition.addMay(__dependsOn);
        __SchemaDefinition.addMay(__dependsOnRef);
        __SchemaDefinition.addMay(__description);
        __SchemaDefinition.addMay(__dmoFromModule);
        __SchemaDefinition.addMay(__dmwPackage);
        __SchemaDefinition.addMay(__dmwTypeToPackage);
        __SchemaDefinition.addMay(__dotName);
        __SchemaDefinition.addMay(__dsdModuleList);
        __SchemaDefinition.addMay(__enumDefList);
        __SchemaDefinition.addMay(__example);
        __SchemaDefinition.addMay(__extendedReferenceTypeDefList);
        __SchemaDefinition.addMay(__file);
        __SchemaDefinition.addMay(__generatedFileHeader);
        __SchemaDefinition.addMay(__hint);
        __SchemaDefinition.addMay(__internalTypeDefList);
        __SchemaDefinition.addMay(__lineNumber);
        __SchemaDefinition.addMay(__nvp);
        __SchemaDefinition.addMay(__obsolete);
        __SchemaDefinition.addMay(__optimize);
        __SchemaDefinition.addMay(__question);
        __SchemaDefinition.addMay(__relatedToConcept);
        __SchemaDefinition.addMay(__relationship);
        __SchemaDefinition.addMay(__ruleCategoryList);
        __SchemaDefinition.addMay(__ruleDataList);
        __SchemaDefinition.addMay(__ruleDefinitionList);
        __SchemaDefinition.addMay(__schemaExtension);
        __SchemaDefinition.addMay(__searchable);
        __SchemaDefinition.addMay(__skip);
        __SchemaDefinition.addMay(__sliceDefList);
        __SchemaDefinition.addMay(__sortName);
        __SchemaDefinition.addMay(__tags);
        __SchemaDefinition.addMay(__typeDefList);
        __SchemaDefinition.addMay(__version);
        __SchemaDefinition.addMay(__why);

        __SliceDefinition.addMust(__name);
        __SliceDefinition.addMust(__selectAttribute);
        __SliceDefinition.addMay(__comment);
        __SliceDefinition.addMay(__definedIn);
        __SliceDefinition.addMay(__description);
        __SliceDefinition.addMay(__dmoFromModule);
        __SliceDefinition.addMay(__dotName);
        __SliceDefinition.addMay(__example);
        __SliceDefinition.addMay(__file);
        __SliceDefinition.addMay(__hint);
        __SliceDefinition.addMay(__lineNumber);
        __SliceDefinition.addMay(__nvp);
        __SliceDefinition.addMay(__obsolete);
        __SliceDefinition.addMay(__optimize);
        __SliceDefinition.addMay(__question);
        __SliceDefinition.addMay(__relatedToConcept);
        __SliceDefinition.addMay(__relationship);
        __SliceDefinition.addMay(__searchable);
        __SliceDefinition.addMay(__skip);
        __SliceDefinition.addMay(__sortName);
        __SliceDefinition.addMay(__tags);
        __SliceDefinition.addMay(__version);
        __SliceDefinition.addMay(__why);

        __TypeDefinition.addMust(__name);
        __TypeDefinition.addMust(__typeClassName);
        __TypeDefinition.addMay(__altType);
        __TypeDefinition.addMay(__altTypeImport);
        __TypeDefinition.addMay(__comment);
        __TypeDefinition.addMay(__definedIn);
        __TypeDefinition.addMay(__description);
        __TypeDefinition.addMay(__dmoFromModule);
        __TypeDefinition.addMay(__dmwIteratorClass);
        __TypeDefinition.addMay(__dmwIteratorImport);
        __TypeDefinition.addMay(__dotName);
        __TypeDefinition.addMay(__enumName);
        __TypeDefinition.addMay(__example);
        __TypeDefinition.addMay(__file);
        __TypeDefinition.addMay(__filterAttributeDef);
        __TypeDefinition.addMay(__genericArgs);
        __TypeDefinition.addMay(__helperClassName);
        __TypeDefinition.addMay(__hint);
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
        __TypeDefinition.addMay(__numericOrBoolean);
        __TypeDefinition.addMay(__nvp);
        __TypeDefinition.addMay(__obsolete);
        __TypeDefinition.addMay(__optimize);
        __TypeDefinition.addMay(__originalClass);
        __TypeDefinition.addMay(__primitiveType);
        __TypeDefinition.addMay(__question);
        __TypeDefinition.addMay(__relatedToConcept);
        __TypeDefinition.addMay(__relationship);
        __TypeDefinition.addMay(__searchable);
        __TypeDefinition.addMay(__skip);
        __TypeDefinition.addMay(__sortName);
        __TypeDefinition.addMay(__tags);
        __TypeDefinition.addMay(__version);
        __TypeDefinition.addMay(__why);
        __TypeDefinition.addMay(__wrapperClassName);

        _NmAp.put(DmcTypeCamelCaseNameSTATIC.instance.getNameClass(),DmcTypeCamelCaseNameSTATIC.instance);
        _NmAp.put(DmcTypeDefinitionNameSTATIC.instance.getNameClass(),DmcTypeDefinitionNameSTATIC.instance);
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

