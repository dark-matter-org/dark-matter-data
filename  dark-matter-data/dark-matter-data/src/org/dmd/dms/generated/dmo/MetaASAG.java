package org.dmd.dms.generated.dmo;

import java.util.HashMap;
import java.util.Iterator;
import org.dmd.dmc.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.types.*;


// Generated from: org.dmd.dms.util.DmoAttributeSchemaFormatter.dumpSchema(DmoAttributeSchemaFormatter.java:170)
public class MetaASAG implements DmcAttributeSchemaIF {


    static String schemaName = "meta";

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"FullyQualifiedName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __abbrev = new DmcAttributeInfo("abbrev",9,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __actionDefList = new DmcAttributeInfo("actionDefList",60,"ActionDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __actions = new DmcAttributeInfo("actions",32,"ActionDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __allowedChildren = new DmcAttributeInfo("allowedChildren",63,"ClassDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __allowedParents = new DmcAttributeInfo("allowedParents",62,"ClassDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __altType = new DmcAttributeInfo("altType",108,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __altTypeImport = new DmcAttributeInfo("altTypeImport",109,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __attachToClass = new DmcAttributeInfo("attachToClass",65,"ClassDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __attributeDefList = new DmcAttributeInfo("attributeDefList",59,"AttributeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __attributeValidatorDefList = new DmcAttributeInfo("attributeValidatorDefList",114,"AttributeValidatorDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __blockWhenLocked = new DmcAttributeInfo("blockWhenLocked",71,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __classDefList = new DmcAttributeInfo("classDefList",55,"ClassDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __classType = new DmcAttributeInfo("classType",10,"ClassTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __complexTypeDefList = new DmcAttributeInfo("complexTypeDefList",117,"ComplexTypeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __createAttributeFactory = new DmcAttributeInfo("createAttributeFactory",89,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dataType = new DmcAttributeInfo("dataType",11,"DataTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __defFiles = new DmcAttributeInfo("defFiles",68,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __definedIn = new DmcAttributeInfo("definedIn",61,"SchemaDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dependsOn = new DmcAttributeInfo("dependsOn",66,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __dependsOnRef = new DmcAttributeInfo("dependsOnRef",67,"SchemaDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __derivedClasses = new DmcAttributeInfo("derivedClasses",25,"ClassDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __derivedFrom = new DmcAttributeInfo("derivedFrom",21,"ClassDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __designatedNameAttribute = new DmcAttributeInfo("designatedNameAttribute",102,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmdID = new DmcAttributeInfo("dmdID",3,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmeClass = new DmcAttributeInfo("dmeClass",44,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmeImport = new DmcAttributeInfo("dmeImport",43,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmoAuxClass = new DmcAttributeInfo("dmoAuxClass",37,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmoAuxClassImport = new DmcAttributeInfo("dmoAuxClassImport",38,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmoClass = new DmcAttributeInfo("dmoClass",36,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmoImport = new DmcAttributeInfo("dmoImport",35,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmtClass = new DmcAttributeInfo("dmtClass",46,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmtImport = new DmcAttributeInfo("dmtImport",45,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmtREFImport = new DmcAttributeInfo("dmtREFImport",93,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmwAuxClass = new DmcAttributeInfo("dmwAuxClass",39,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmwAuxClassImport = new DmcAttributeInfo("dmwAuxClassImport",40,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmwClass = new DmcAttributeInfo("dmwClass",42,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmwImport = new DmcAttributeInfo("dmwImport",41,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmwIteratorClass = new DmcAttributeInfo("dmwIteratorClass",92,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmwIteratorImport = new DmcAttributeInfo("dmwIteratorImport",91,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dmwPackage = new DmcAttributeInfo("dmwPackage",54,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dotName = new DmcAttributeInfo("dotName",107,"DotName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __enumDefList = new DmcAttributeInfo("enumDefList",58,"EnumDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __enumInt = new DmcAttributeInfo("enumInt",69,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __enumName = new DmcAttributeInfo("enumName",99,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __enumString = new DmcAttributeInfo("enumString",70,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __enumValue = new DmcAttributeInfo("enumValue",33,"EnumValue",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __extendedClass = new DmcAttributeInfo("extendedClass",106,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __extendsInterface = new DmcAttributeInfo("extendsInterface",119,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __field = new DmcAttributeInfo("field",105,"Field",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __fieldSeparator = new DmcAttributeInfo("fieldSeparator",104,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __generatedFileHeader = new DmcAttributeInfo("generatedFileHeader",81,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __genericArgs = new DmcAttributeInfo("genericArgs",94,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __genericArgsImport = new DmcAttributeInfo("genericArgsImport",98,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __getMethod = new DmcAttributeInfo("getMethod",49,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __getType = new DmcAttributeInfo("getType",48,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __helperClassName = new DmcAttributeInfo("helperClassName",47,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __implements = new DmcAttributeInfo("implements",23,"ClassDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __integerName = new DmcAttributeInfo("integerName",100,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __intendedToExtend = new DmcAttributeInfo("intendedToExtend",22,"ClassDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __internalTypeDefList = new DmcAttributeInfo("internalTypeDefList",57,"TypeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __internalTypeRef = new DmcAttributeInfo("internalTypeRef",20,"TypeDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __internallyGenerated = new DmcAttributeInfo("internallyGenerated",77,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isDefaultValue = new DmcAttributeInfo("isDefaultValue",17,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isEnumType = new DmcAttributeInfo("isEnumType",16,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isGetAction = new DmcAttributeInfo("isGetAction",72,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isNameType = new DmcAttributeInfo("isNameType",95,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isNamedBy = new DmcAttributeInfo("isNamedBy",80,"AttributeDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isRefType = new DmcAttributeInfo("isRefType",14,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isSchemaRtype = new DmcAttributeInfo("isSchemaRtype",15,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isTransportable = new DmcAttributeInfo("isTransportable",79,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __javaClass = new DmcAttributeInfo("javaClass",34,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __javaPackage = new DmcAttributeInfo("javaPackage",52,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __keyClass = new DmcAttributeInfo("keyClass",96,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __keyImport = new DmcAttributeInfo("keyImport",97,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __may = new DmcAttributeInfo("may",27,"AttributeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mayParm = new DmcAttributeInfo("mayParm",29,"AttributeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mayReturn = new DmcAttributeInfo("mayReturn",31,"AttributeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __maySendProgress = new DmcAttributeInfo("maySendProgress",76,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __must = new DmcAttributeInfo("must",26,"AttributeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mustParm = new DmcAttributeInfo("mustParm",28,"AttributeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __mustReturn = new DmcAttributeInfo("mustReturn",30,"AttributeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __nameAttributeDef = new DmcAttributeInfo("nameAttributeDef",90,"AttributeDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __nameType = new DmcAttributeInfo("nameType",103,"NameTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __namingAttribute = new DmcAttributeInfo("namingAttribute",64,"AttributeDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __nullReturnValue = new DmcAttributeInfo("nullReturnValue",7,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("objectClass",1,"ClassDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __objectValidatorDefList = new DmcAttributeInfo("objectValidatorDefList",113,"ObjectValidatorDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __obsoleteVersion = new DmcAttributeInfo("obsoleteVersion",73,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __opContext = new DmcAttributeInfo("opContext",115,"OperationalContextEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __originalClass = new DmcAttributeInfo("originalClass",83,"ClassDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __primitiveType = new DmcAttributeInfo("primitiveType",8,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __schemaBaseID = new DmcAttributeInfo("schemaBaseID",86,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __schemaExtension = new DmcAttributeInfo("schemaExtension",4,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __schemaIDRange = new DmcAttributeInfo("schemaIDRange",87,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __schemaPackage = new DmcAttributeInfo("schemaPackage",53,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __secure = new DmcAttributeInfo("secure",78,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __selectAttribute = new DmcAttributeInfo("selectAttribute",110,"AttributeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __setType = new DmcAttributeInfo("setType",50,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __sliceDefList = new DmcAttributeInfo("sliceDefList",111,"SliceDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __subpackage = new DmcAttributeInfo("subpackage",88,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __supportsBackrefTracking = new DmcAttributeInfo("supportsBackrefTracking",118,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __type = new DmcAttributeInfo("type",19,"TypeDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __typeClassName = new DmcAttributeInfo("typeClassName",5,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __typeDefList = new DmcAttributeInfo("typeDefList",56,"TypeDefinition",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __useWrapperType = new DmcAttributeInfo("useWrapperType",82,"WrapperTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __usesInterface = new DmcAttributeInfo("usesInterface",24,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __uuidName = new DmcAttributeInfo("uuidName",101,"UUIDName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __validatorClass = new DmcAttributeInfo("validatorClass",112,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __valueClass = new DmcAttributeInfo("valueClass",51,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __valueType = new DmcAttributeInfo("valueType",12,"ValueTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __wrapperClassName = new DmcAttributeInfo("wrapperClassName",6,"String",ValueTypeEnum.SINGLE,false);

    static  HashMap<Integer ,DmcAttributeInfo> _SmAp;

    static  HashMap<String ,DmcNameBuilderIF> _NmAp;

    static  HashMap<String ,DmcSliceInfo> _SImAp;

    static {
        _SmAp = new HashMap<Integer ,DmcAttributeInfo>();

        _NmAp = new HashMap<String ,DmcNameBuilderIF>();

        _SImAp = new HashMap<String ,DmcSliceInfo>();

        _SmAp.put(__FQN.id,__FQN);
        _SmAp.put(__abbrev.id,__abbrev);
        _SmAp.put(__actionDefList.id,__actionDefList);
        _SmAp.put(__actions.id,__actions);
        _SmAp.put(__allowedChildren.id,__allowedChildren);
        _SmAp.put(__allowedParents.id,__allowedParents);
        _SmAp.put(__altType.id,__altType);
        _SmAp.put(__altTypeImport.id,__altTypeImport);
        _SmAp.put(__attachToClass.id,__attachToClass);
        _SmAp.put(__attributeDefList.id,__attributeDefList);
        _SmAp.put(__attributeValidatorDefList.id,__attributeValidatorDefList);
        _SmAp.put(__blockWhenLocked.id,__blockWhenLocked);
        _SmAp.put(__camelCaseName.id,__camelCaseName);
        _SmAp.put(__classDefList.id,__classDefList);
        _SmAp.put(__classType.id,__classType);
        _SmAp.put(__complexTypeDefList.id,__complexTypeDefList);
        _SmAp.put(__createAttributeFactory.id,__createAttributeFactory);
        _SmAp.put(__dataType.id,__dataType);
        _SmAp.put(__defFiles.id,__defFiles);
        _SmAp.put(__definedIn.id,__definedIn);
        _SmAp.put(__dependsOn.id,__dependsOn);
        _SmAp.put(__dependsOnRef.id,__dependsOnRef);
        _SmAp.put(__derivedClasses.id,__derivedClasses);
        _SmAp.put(__derivedFrom.id,__derivedFrom);
        _SmAp.put(__description.id,__description);
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
        _SmAp.put(__dotName.id,__dotName);
        _SmAp.put(__enumDefList.id,__enumDefList);
        _SmAp.put(__enumInt.id,__enumInt);
        _SmAp.put(__enumName.id,__enumName);
        _SmAp.put(__enumString.id,__enumString);
        _SmAp.put(__enumValue.id,__enumValue);
        _SmAp.put(__extendedClass.id,__extendedClass);
        _SmAp.put(__extendsInterface.id,__extendsInterface);
        _SmAp.put(__field.id,__field);
        _SmAp.put(__fieldSeparator.id,__fieldSeparator);
        _SmAp.put(__file.id,__file);
        _SmAp.put(__generatedFileHeader.id,__generatedFileHeader);
        _SmAp.put(__genericArgs.id,__genericArgs);
        _SmAp.put(__genericArgsImport.id,__genericArgsImport);
        _SmAp.put(__getMethod.id,__getMethod);
        _SmAp.put(__getType.id,__getType);
        _SmAp.put(__helperClassName.id,__helperClassName);
        _SmAp.put(__implements.id,__implements);
        _SmAp.put(__integerName.id,__integerName);
        _SmAp.put(__intendedToExtend.id,__intendedToExtend);
        _SmAp.put(__internalTypeDefList.id,__internalTypeDefList);
        _SmAp.put(__internalTypeRef.id,__internalTypeRef);
        _SmAp.put(__internallyGenerated.id,__internallyGenerated);
        _SmAp.put(__isDefaultValue.id,__isDefaultValue);
        _SmAp.put(__isEnumType.id,__isEnumType);
        _SmAp.put(__isGetAction.id,__isGetAction);
        _SmAp.put(__isNameType.id,__isNameType);
        _SmAp.put(__isNamedBy.id,__isNamedBy);
        _SmAp.put(__isRefType.id,__isRefType);
        _SmAp.put(__isSchemaRtype.id,__isSchemaRtype);
        _SmAp.put(__isTransportable.id,__isTransportable);
        _SmAp.put(__javaClass.id,__javaClass);
        _SmAp.put(__javaPackage.id,__javaPackage);
        _SmAp.put(__keyClass.id,__keyClass);
        _SmAp.put(__keyImport.id,__keyImport);
        _SmAp.put(__lineNumber.id,__lineNumber);
        _SmAp.put(__may.id,__may);
        _SmAp.put(__mayParm.id,__mayParm);
        _SmAp.put(__mayReturn.id,__mayReturn);
        _SmAp.put(__maySendProgress.id,__maySendProgress);
        _SmAp.put(__must.id,__must);
        _SmAp.put(__mustParm.id,__mustParm);
        _SmAp.put(__mustReturn.id,__mustReturn);
        _SmAp.put(__name.id,__name);
        _SmAp.put(__nameAttributeDef.id,__nameAttributeDef);
        _SmAp.put(__nameType.id,__nameType);
        _SmAp.put(__namingAttribute.id,__namingAttribute);
        _SmAp.put(__nullReturnValue.id,__nullReturnValue);
        _SmAp.put(__objectClass.id,__objectClass);
        _SmAp.put(__objectValidatorDefList.id,__objectValidatorDefList);
        _SmAp.put(__obsoleteVersion.id,__obsoleteVersion);
        _SmAp.put(__opContext.id,__opContext);
        _SmAp.put(__originalClass.id,__originalClass);
        _SmAp.put(__primitiveType.id,__primitiveType);
        _SmAp.put(__schemaBaseID.id,__schemaBaseID);
        _SmAp.put(__schemaExtension.id,__schemaExtension);
        _SmAp.put(__schemaIDRange.id,__schemaIDRange);
        _SmAp.put(__schemaPackage.id,__schemaPackage);
        _SmAp.put(__secure.id,__secure);
        _SmAp.put(__selectAttribute.id,__selectAttribute);
        _SmAp.put(__setType.id,__setType);
        _SmAp.put(__sliceDefList.id,__sliceDefList);
        _SmAp.put(__subpackage.id,__subpackage);
        _SmAp.put(__supportsBackrefTracking.id,__supportsBackrefTracking);
        _SmAp.put(__type.id,__type);
        _SmAp.put(__typeClassName.id,__typeClassName);
        _SmAp.put(__typeDefList.id,__typeDefList);
        _SmAp.put(__useWrapperType.id,__useWrapperType);
        _SmAp.put(__usesInterface.id,__usesInterface);
        _SmAp.put(__uuidName.id,__uuidName);
        _SmAp.put(__validatorClass.id,__validatorClass);
        _SmAp.put(__valueClass.id,__valueClass);
        _SmAp.put(__valueType.id,__valueType);
        _SmAp.put(__wrapperClassName.id,__wrapperClassName);
        _NmAp.put(DmcTypeCamelCaseNameSTATIC.instance.getNameClass(),DmcTypeCamelCaseNameSTATIC.instance);
        _NmAp.put(DmcTypeDotNameSTATIC.instance.getNameClass(),DmcTypeDotNameSTATIC.instance);
        _NmAp.put(DmcTypeFullyQualifiedNameSTATIC.instance.getNameClass(),DmcTypeFullyQualifiedNameSTATIC.instance);
        _NmAp.put(DmcTypeIntegerNameSTATIC.instance.getNameClass(),DmcTypeIntegerNameSTATIC.instance);
        _NmAp.put(DmcTypeStringNameSTATIC.instance.getNameClass(),DmcTypeStringNameSTATIC.instance);
        _NmAp.put(DmcTypeUUIDNameSTATIC.instance.getNameClass(),DmcTypeUUIDNameSTATIC.instance);

    }

    static  MetaASAG instance;

    protected MetaASAG (){
    }

    public static MetaASAG instance(){
        if (instance == null)
            instance = new MetaASAG();
        return(instance);
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


}

