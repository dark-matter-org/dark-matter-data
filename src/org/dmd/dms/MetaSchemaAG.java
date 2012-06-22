//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.*;

/**
  * This class creates the basic definitions that allow for the definition of schemas.
  * Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:704)
  */
abstract public class MetaSchemaAG extends SchemaDefinition {
    public static SchemaDefinition    _metaSchema;

    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:711)
    public static ClassDefinition     _AllowedAttributesRuleInstance;
    public static ClassDefinition     _InitRuleInstance;
    public static ClassDefinition     _ActionTriggerInfo;
    public static ClassDefinition     _DmsDefinition;
    public static ClassDefinition     _ClassDefinition;
    public static ClassDefinition     _EnumDefinition;
    public static ClassDefinition     _TypeDefinition;
    public static ClassDefinition     _ComplexTypeDefinition;
    public static ClassDefinition     _ExtendedReferenceTypeDefinition;
    public static ClassDefinition     _AttributeDefinition;
    public static ClassDefinition     _SliceDefinition;
    public static ClassDefinition     _ObjectValidatorDefinition;
    public static ClassDefinition     _AttributeValidatorDefinition;
    public static ClassDefinition     _ActionDefinition;
    public static ClassDefinition     _SchemaDefinition;
    public static ClassDefinition     _RuleCategory;
    public static ClassDefinition     _RuleDefinition;

    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:717)
    public static EnumDefinition      _ClassTypeEnum;
    public static EnumDefinition      _ModifyTypeEnum;
    public static EnumDefinition      _OperationalContextEnum;
    public static EnumDefinition      _RuleTypeEnum;
    public static EnumDefinition      _RuleScopeEnum;
    public static EnumDefinition      _DataTypeEnum;
    public static EnumDefinition      _ValueTypeEnum;
    public static EnumDefinition      _BaseTypeEnum;
    public static EnumDefinition      _ModificationControlEnum;
    public static EnumDefinition      _FilterTypeEnum;
    public static EnumDefinition      _DebugEnum;
    public static EnumDefinition      _WrapperTypeEnum;

    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:722)
    public static TypeDefinition      _String;
    public static TypeDefinition      _DmcObject;
    public static TypeDefinition      _ClassInfoRef;
    public static TypeDefinition      _DmcAttribute;
    public static TypeDefinition      _NameContainer;
    public static TypeDefinition      _FilterContainer;
    public static TypeDefinition      _AttributeID;
    public static TypeDefinition      _Integer;
    public static TypeDefinition      _Float;
    public static TypeDefinition      _Double;
    public static TypeDefinition      _Long;
    public static TypeDefinition      _Date;
    public static TypeDefinition      _Boolean;
    public static TypeDefinition      _EnumValue;
    public static TypeDefinition      _Modifier;
    public static TypeDefinition      _StringName;
    public static TypeDefinition      _CamelCaseName;
    public static TypeDefinition      _IntegerName;
    public static TypeDefinition      _LongName;
    public static TypeDefinition      _DotName;
    public static TypeDefinition      _ClassFilter;
    public static TypeDefinition      _IntegerToString;
    public static TypeDefinition      _StringToString;
    public static TypeDefinition      _UUIDLite;
    public static TypeDefinition      _UUIDName;
    public static TypeDefinition      _IntegerToBoolean;
    public static TypeDefinition      _IntegerToUUIDLite;
    public static TypeDefinition      _FullyQualifiedName;
    public static TypeDefinition      _LabelledIntegerDataPoint;
    public static TypeDefinition      _TimeDoubleDataPoint;
    public static TypeDefinition      _DmwTypeToWrapperType;
    public static TypeDefinition      _Field;
    public static TypeDefinition      _ActionDefinitionREF;
    public static TypeDefinition      _AttributeDefinitionREF;
    public static TypeDefinition      _AttributeValidatorDefinitionREF;
    public static TypeDefinition      _ClassDefinitionREF;
    public static TypeDefinition      _ComplexTypeDefinitionREF;
    public static TypeDefinition      _DmsDefinitionREF;
    public static TypeDefinition      _EnumDefinitionREF;
    public static TypeDefinition      _ExtendedReferenceTypeDefinitionREF;
    public static TypeDefinition      _ObjectValidatorDefinitionREF;
    public static TypeDefinition      _RuleCategoryREF;
    public static TypeDefinition      _RuleDefinitionREF;
    public static TypeDefinition      _SchemaDefinitionREF;
    public static TypeDefinition      _SliceDefinitionREF;
    public static TypeDefinition      _TypeDefinitionREF;
    public static TypeDefinition      _BaseTypeEnumREF;
    public static TypeDefinition      _ClassTypeEnumREF;
    public static TypeDefinition      _DataTypeEnumREF;
    public static TypeDefinition      _DebugEnumREF;
    public static TypeDefinition      _FilterTypeEnumREF;
    public static TypeDefinition      _ModificationControlEnumREF;
    public static TypeDefinition      _ModifyTypeEnumREF;
    public static TypeDefinition      _OperationalContextEnumREF;
    public static TypeDefinition      _RuleScopeEnumREF;
    public static TypeDefinition      _RuleTypeEnumREF;
    public static TypeDefinition      _ValueTypeEnumREF;
    public static TypeDefinition      _WrapperTypeEnumREF;

    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:727)
    public static AttributeDefinition _name;
    public static AttributeDefinition _dmdID;
    public static AttributeDefinition _schemaExtension;
    public static AttributeDefinition _typeClassName;
    public static AttributeDefinition _wrapperClassName;
    public static AttributeDefinition _nullReturnValue;
    public static AttributeDefinition _primitiveType;
    public static AttributeDefinition _abbrev;
    public static AttributeDefinition _classType;
    public static AttributeDefinition _dataType;
    public static AttributeDefinition _valueType;
    public static AttributeDefinition _isRefType;
    public static AttributeDefinition _isSchemaRtype;
    public static AttributeDefinition _isEnumType;
    public static AttributeDefinition _isDefaultValue;
    public static AttributeDefinition _description;
    public static AttributeDefinition _type;
    public static AttributeDefinition _internalTypeRef;
    public static AttributeDefinition _derivedFrom;
    public static AttributeDefinition _intendedToExtend;
    public static AttributeDefinition _usesInterface;
    public static AttributeDefinition _derivedClasses;
    public static AttributeDefinition _must;
    public static AttributeDefinition _may;
    public static AttributeDefinition _mustParm;
    public static AttributeDefinition _mayParm;
    public static AttributeDefinition _mustReturn;
    public static AttributeDefinition _mayReturn;
    public static AttributeDefinition _actions;
    public static AttributeDefinition _enumValue;
    public static AttributeDefinition _javaClass;
    public static AttributeDefinition _dmoImport;
    public static AttributeDefinition _dmoClass;
    public static AttributeDefinition _dmoAuxClass;
    public static AttributeDefinition _dmoAuxClassImport;
    public static AttributeDefinition _dmwAuxClass;
    public static AttributeDefinition _dmwAuxClassImport;
    public static AttributeDefinition _dmwImport;
    public static AttributeDefinition _dmwClass;
    public static AttributeDefinition _dmeImport;
    public static AttributeDefinition _dmeClass;
    public static AttributeDefinition _dmtImport;
    public static AttributeDefinition _dmtClass;
    public static AttributeDefinition _helperClassName;
    public static AttributeDefinition _getType;
    public static AttributeDefinition _getMethod;
    public static AttributeDefinition _setType;
    public static AttributeDefinition _valueClass;
    public static AttributeDefinition _javaPackage;
    public static AttributeDefinition _schemaPackage;
    public static AttributeDefinition _dmwPackage;
    public static AttributeDefinition _classDefList;
    public static AttributeDefinition _typeDefList;
    public static AttributeDefinition _internalTypeDefList;
    public static AttributeDefinition _enumDefList;
    public static AttributeDefinition _attributeDefList;
    public static AttributeDefinition _actionDefList;
    public static AttributeDefinition _definedIn;
    public static AttributeDefinition _allowedParents;
    public static AttributeDefinition _namingAttribute;
    public static AttributeDefinition _attachToClass;
    public static AttributeDefinition _dependsOn;
    public static AttributeDefinition _dependsOnRef;
    public static AttributeDefinition _defFiles;
    public static AttributeDefinition _enumInt;
    public static AttributeDefinition _enumString;
    public static AttributeDefinition _blockWhenLocked;
    public static AttributeDefinition _isGetAction;
    public static AttributeDefinition _obsoleteVersion;
    public static AttributeDefinition _file;
    public static AttributeDefinition _lineNumber;
    public static AttributeDefinition _maySendProgress;
    public static AttributeDefinition _internallyGenerated;
    public static AttributeDefinition _secure;
    public static AttributeDefinition _isTransportable;
    public static AttributeDefinition _isNamedBy;
    public static AttributeDefinition _generatedFileHeader;
    public static AttributeDefinition _useWrapperType;
    public static AttributeDefinition _originalClass;
    public static AttributeDefinition _FQN;
    public static AttributeDefinition _modify;
    public static AttributeDefinition _schemaBaseID;
    public static AttributeDefinition _schemaIDRange;
    public static AttributeDefinition _subpackage;
    public static AttributeDefinition _createAttributeFactory;
    public static AttributeDefinition _nameAttributeDef;
    public static AttributeDefinition _dmwIteratorImport;
    public static AttributeDefinition _dmwIteratorClass;
    public static AttributeDefinition _dmtREFImport;
    public static AttributeDefinition _genericArgs;
    public static AttributeDefinition _isNameType;
    public static AttributeDefinition _keyClass;
    public static AttributeDefinition _keyImport;
    public static AttributeDefinition _genericArgsImport;
    public static AttributeDefinition _enumName;
    public static AttributeDefinition _integerName;
    public static AttributeDefinition _uuidName;
    public static AttributeDefinition _designatedNameAttribute;
    public static AttributeDefinition _fieldSeparator;
    public static AttributeDefinition _field;
    public static AttributeDefinition _extendedClass;
    public static AttributeDefinition _dotName;
    public static AttributeDefinition _altType;
    public static AttributeDefinition _altTypeImport;
    public static AttributeDefinition _selectAttribute;
    public static AttributeDefinition _sliceDefList;
    public static AttributeDefinition _validatorClass;
    public static AttributeDefinition _objectValidatorDefList;
    public static AttributeDefinition _attributeValidatorDefList;
    public static AttributeDefinition _opContext;
    public static AttributeDefinition _camelCaseName;
    public static AttributeDefinition _complexTypeDefList;
    public static AttributeDefinition _supportsBackrefTracking;
    public static AttributeDefinition _extendsInterface;
    public static AttributeDefinition _dependsOnSchema;
    public static AttributeDefinition _isHierarchicName;
    public static AttributeDefinition _internalUse;
    public static AttributeDefinition _dmwTypeToPackage;
    public static AttributeDefinition _dmwWrapperType;
    public static AttributeDefinition _isFilterType;
    public static AttributeDefinition _designatedFilterAttribute;
    public static AttributeDefinition _filterAttributeDef;
    public static AttributeDefinition _classFilter;
    public static AttributeDefinition _indexSize;
    public static AttributeDefinition _excludeFromContext;
    public static AttributeDefinition _extendedReferenceClass;
    public static AttributeDefinition _extendedReferenceTypeDefList;
    public static AttributeDefinition _isExtendedRefType;
    public static AttributeDefinition _longName;
    public static AttributeDefinition _baseType;
    public static AttributeDefinition _ruleType;
    public static AttributeDefinition _ruleScope;
    public static AttributeDefinition _ruleTitle;
    public static AttributeDefinition _ruleCategory;
    public static AttributeDefinition _ruleCategoryID;
    public static AttributeDefinition _ruleInterface;
    public static AttributeDefinition _isExtensible;
    public static AttributeDefinition _ruleCategoryList;
    public static AttributeDefinition _ruleDefinitionList;
    public static AttributeDefinition _ruleDefinition;
    public static AttributeDefinition _objectClass;

    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:732)
    public static RuleCategory        _Initialization;
    public static RuleCategory        _ObjectValidation;
    public static RuleCategory        _ModifierValidation;

    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:737)
    public static RuleDefinition      _AllowedAttributesRule;
    public static RuleDefinition      _InitRule;

    public MetaSchemaAG() throws DmcValueException {

        super("meta");

        staticRefName = new String("MetaSchema._");

        // We only ever want to initialize the schema once, so check
        // to see if we've initialized the first class definition
        if (_metaSchema == null){
            try{
            _metaSchema = this;
            // Create the class definitions
            // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:763)
            _AllowedAttributesRuleInstance= new ClassDefinition("AllowedAttributesRuleInstance");
            _InitRuleInstance            = new ClassDefinition("InitRuleInstance");
            _ActionTriggerInfo           = new ClassDefinition("ActionTriggerInfo");
            _DmsDefinition               = new ClassDefinition("DmsDefinition");
            _ClassDefinition             = new ClassDefinition("ClassDefinition");
            _EnumDefinition              = new ClassDefinition("EnumDefinition");
            _TypeDefinition              = new ClassDefinition("TypeDefinition");
            _ComplexTypeDefinition       = new ClassDefinition("ComplexTypeDefinition");
            _ExtendedReferenceTypeDefinition= new ClassDefinition("ExtendedReferenceTypeDefinition");
            _AttributeDefinition         = new ClassDefinition("AttributeDefinition");
            _SliceDefinition             = new ClassDefinition("SliceDefinition");
            _ObjectValidatorDefinition   = new ClassDefinition("ObjectValidatorDefinition");
            _AttributeValidatorDefinition= new ClassDefinition("AttributeValidatorDefinition");
            _ActionDefinition            = new ClassDefinition("ActionDefinition");
            _SchemaDefinition            = new ClassDefinition("SchemaDefinition");
            _RuleCategory                = new ClassDefinition("RuleCategory");
            _RuleDefinition              = new ClassDefinition("RuleDefinition");

            // Create the enum definitions
            // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:773)
            _ClassTypeEnum               = new EnumDefinition("ClassTypeEnum");
            _ModifyTypeEnum              = new EnumDefinition("ModifyTypeEnum");
            _OperationalContextEnum      = new EnumDefinition("OperationalContextEnum");
            _RuleTypeEnum                = new EnumDefinition("RuleTypeEnum");
            _RuleScopeEnum               = new EnumDefinition("RuleScopeEnum");
            _DataTypeEnum                = new EnumDefinition("DataTypeEnum");
            _ValueTypeEnum               = new EnumDefinition("ValueTypeEnum");
            _BaseTypeEnum                = new EnumDefinition("BaseTypeEnum");
            _ModificationControlEnum     = new EnumDefinition("ModificationControlEnum");
            _FilterTypeEnum              = new EnumDefinition("FilterTypeEnum");
            _DebugEnum                   = new EnumDefinition("DebugEnum");
            _WrapperTypeEnum             = new EnumDefinition("WrapperTypeEnum");

            // Create the type definitions
            // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:783)
            _String                      = new TypeDefinition("String", org.dmd.dmc.types.DmcTypeString.class);
            _DmcObject                   = new TypeDefinition("DmcObject", org.dmd.dmc.types.DmcTypeDmcObject.class);
            _ClassInfoRef                = new TypeDefinition("ClassInfoRef", org.dmd.dmc.types.DmcTypeClassInfoRef.class);
            _DmcAttribute                = new TypeDefinition("DmcAttribute", org.dmd.dmc.types.DmcTypeDmcAttribute.class);
            _NameContainer               = new TypeDefinition("NameContainer", org.dmd.dmc.types.DmcTypeNameContainer.class);
            _FilterContainer             = new TypeDefinition("FilterContainer", org.dmd.dmc.types.DmcTypeFilterContainer.class);
            _AttributeID                 = new TypeDefinition("AttributeID", org.dmd.dmc.types.DmcTypeAttributeID.class);
            _Integer                     = new TypeDefinition("Integer", org.dmd.dmc.types.DmcTypeInteger.class);
            _Float                       = new TypeDefinition("Float", org.dmd.dmc.types.DmcTypeFloat.class);
            _Double                      = new TypeDefinition("Double", org.dmd.dmc.types.DmcTypeDouble.class);
            _Long                        = new TypeDefinition("Long", org.dmd.dmc.types.DmcTypeLong.class);
            _Date                        = new TypeDefinition("Date", org.dmd.dmc.types.DmcTypeDate.class);
            _Boolean                     = new TypeDefinition("Boolean", org.dmd.dmc.types.DmcTypeBoolean.class);
            _EnumValue                   = new TypeDefinition("EnumValue", org.dmd.dms.types.DmcTypeEnumValue.class);
            _Modifier                    = new TypeDefinition("Modifier", org.dmd.dmc.types.DmcTypeModifier.class);
            _StringName                  = new TypeDefinition("StringName", org.dmd.dmc.types.DmcTypeStringName.class);
            _CamelCaseName               = new TypeDefinition("CamelCaseName", org.dmd.dmc.types.DmcTypeCamelCaseName.class);
            _IntegerName                 = new TypeDefinition("IntegerName", org.dmd.dmc.types.DmcTypeIntegerName.class);
            _LongName                    = new TypeDefinition("LongName", org.dmd.dmc.types.DmcTypeLongName.class);
            _DotName                     = new TypeDefinition("DotName", org.dmd.dmc.types.DmcTypeDotName.class);
            _ClassFilter                 = new TypeDefinition("ClassFilter", org.dmd.dmc.types.DmcTypeClassFilter.class);
            _IntegerToString             = new TypeDefinition("IntegerToString", org.dmd.dmc.types.DmcTypeIntegerToString.class);
            _StringToString              = new TypeDefinition("StringToString", org.dmd.dmc.types.DmcTypeStringToString.class);
            _UUIDLite                    = new TypeDefinition("UUIDLite", org.dmd.dmc.types.DmcTypeUUIDLite.class);
            _UUIDName                    = new TypeDefinition("UUIDName", org.dmd.dmc.types.DmcTypeUUIDName.class);
            _IntegerToBoolean            = new TypeDefinition("IntegerToBoolean", org.dmd.dmc.types.DmcTypeIntegerToBoolean.class);
            _IntegerToUUIDLite           = new TypeDefinition("IntegerToUUIDLite", org.dmd.dmc.types.DmcTypeIntegerToUUIDLite.class);
            _FullyQualifiedName          = new TypeDefinition("FullyQualifiedName", org.dmd.dmc.types.DmcTypeFullyQualifiedName.class);
            _LabelledIntegerDataPoint    = new TypeDefinition("LabelledIntegerDataPoint", org.dmd.dmc.types.DmcTypeLabelledIntegerDataPoint.class);
            _TimeDoubleDataPoint         = new TypeDefinition("TimeDoubleDataPoint", org.dmd.dmc.types.DmcTypeTimeDoubleDataPoint.class);
            _DmwTypeToWrapperType        = new TypeDefinition("DmwTypeToWrapperType", org.dmd.dms.generated.types.DmcTypeDmwTypeToWrapperType.class);
            _Field                       = new TypeDefinition("Field", org.dmd.dms.generated.types.DmcTypeField.class);
            _ActionDefinitionREF         = new TypeDefinition("ActionDefinitionREF", org.dmd.dms.generated.types.DmcTypeActionDefinitionREF.class, org.dmd.dms.ActionDefinition.class);
            _AttributeDefinitionREF      = new TypeDefinition("AttributeDefinitionREF", org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREF.class, org.dmd.dms.AttributeDefinition.class);
            _AttributeValidatorDefinitionREF= new TypeDefinition("AttributeValidatorDefinitionREF", org.dmd.dms.generated.types.DmcTypeAttributeValidatorDefinitionREF.class, org.dmd.dms.AttributeValidatorDefinition.class);
            _ClassDefinitionREF          = new TypeDefinition("ClassDefinitionREF", org.dmd.dms.generated.types.DmcTypeClassDefinitionREF.class, org.dmd.dms.ClassDefinition.class);
            _ComplexTypeDefinitionREF    = new TypeDefinition("ComplexTypeDefinitionREF", org.dmd.dms.generated.types.DmcTypeComplexTypeDefinitionREF.class, org.dmd.dms.ComplexTypeDefinition.class);
            _DmsDefinitionREF            = new TypeDefinition("DmsDefinitionREF", org.dmd.dms.generated.types.DmcTypeDmsDefinitionREF.class, org.dmd.dms.DmsDefinition.class);
            _EnumDefinitionREF           = new TypeDefinition("EnumDefinitionREF", org.dmd.dms.generated.types.DmcTypeEnumDefinitionREF.class, org.dmd.dms.EnumDefinition.class);
            _ExtendedReferenceTypeDefinitionREF= new TypeDefinition("ExtendedReferenceTypeDefinitionREF", org.dmd.dms.generated.types.DmcTypeExtendedReferenceTypeDefinitionREF.class, org.dmd.dms.ExtendedReferenceTypeDefinition.class);
            _ObjectValidatorDefinitionREF= new TypeDefinition("ObjectValidatorDefinitionREF", org.dmd.dms.generated.types.DmcTypeObjectValidatorDefinitionREF.class, org.dmd.dms.ObjectValidatorDefinition.class);
            _RuleCategoryREF             = new TypeDefinition("RuleCategoryREF", org.dmd.dms.generated.types.DmcTypeRuleCategoryREF.class, org.dmd.dms.RuleCategory.class);
            _RuleDefinitionREF           = new TypeDefinition("RuleDefinitionREF", org.dmd.dms.generated.types.DmcTypeRuleDefinitionREF.class, org.dmd.dms.RuleDefinition.class);
            _SchemaDefinitionREF         = new TypeDefinition("SchemaDefinitionREF", org.dmd.dms.generated.types.DmcTypeSchemaDefinitionREF.class, org.dmd.dms.SchemaDefinition.class);
            _SliceDefinitionREF          = new TypeDefinition("SliceDefinitionREF", org.dmd.dms.generated.types.DmcTypeSliceDefinitionREF.class, org.dmd.dms.SliceDefinition.class);
            _TypeDefinitionREF           = new TypeDefinition("TypeDefinitionREF", org.dmd.dms.generated.types.DmcTypeTypeDefinitionREF.class, org.dmd.dms.TypeDefinition.class);
            _BaseTypeEnumREF             = new TypeDefinition("BaseTypeEnum", org.dmd.dms.generated.types.DmcTypeBaseTypeEnum.class);
            _ClassTypeEnumREF            = new TypeDefinition("ClassTypeEnum", org.dmd.dms.generated.types.DmcTypeClassTypeEnum.class);
            _DataTypeEnumREF             = new TypeDefinition("DataTypeEnum", org.dmd.dms.generated.types.DmcTypeDataTypeEnum.class);
            _DebugEnumREF                = new TypeDefinition("DebugEnum", org.dmd.dms.generated.types.DmcTypeDebugEnum.class);
            _FilterTypeEnumREF           = new TypeDefinition("FilterTypeEnum", org.dmd.dms.generated.types.DmcTypeFilterTypeEnum.class);
            _ModificationControlEnumREF  = new TypeDefinition("ModificationControlEnum", org.dmd.dms.generated.types.DmcTypeModificationControlEnum.class);
            _ModifyTypeEnumREF           = new TypeDefinition("ModifyTypeEnum", org.dmd.dms.generated.types.DmcTypeModifyTypeEnum.class);
            _OperationalContextEnumREF   = new TypeDefinition("OperationalContextEnum", org.dmd.dms.generated.types.DmcTypeOperationalContextEnum.class);
            _RuleScopeEnumREF            = new TypeDefinition("RuleScopeEnum", org.dmd.dms.generated.types.DmcTypeRuleScopeEnum.class);
            _RuleTypeEnumREF             = new TypeDefinition("RuleTypeEnum", org.dmd.dms.generated.types.DmcTypeRuleTypeEnum.class);
            _ValueTypeEnumREF            = new TypeDefinition("ValueTypeEnum", org.dmd.dms.generated.types.DmcTypeValueTypeEnum.class);
            _WrapperTypeEnumREF          = new TypeDefinition("WrapperTypeEnum", org.dmd.dms.generated.types.DmcTypeWrapperTypeEnum.class);

            // Create the attribute definitions
            // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:810)
            _name                        = new AttributeDefinition("name", _StringName);
            _dmdID                       = new AttributeDefinition("dmdID", _Integer);
            _schemaExtension             = new AttributeDefinition("schemaExtension", _String);
            _typeClassName               = new AttributeDefinition("typeClassName", _String);
            _wrapperClassName            = new AttributeDefinition("wrapperClassName", _String);
            _nullReturnValue             = new AttributeDefinition("nullReturnValue", _String);
            _primitiveType               = new AttributeDefinition("primitiveType", _String);
            _abbrev                      = new AttributeDefinition("abbrev", _String);
            _classType                   = new AttributeDefinition("classType", _ClassTypeEnumREF);
            _dataType                    = new AttributeDefinition("dataType", _DataTypeEnumREF);
            _valueType                   = new AttributeDefinition("valueType", _ValueTypeEnumREF);
            _isRefType                   = new AttributeDefinition("isRefType", _Boolean);
            _isSchemaRtype               = new AttributeDefinition("isSchemaRtype", _Boolean);
            _isEnumType                  = new AttributeDefinition("isEnumType", _Boolean);
            _isDefaultValue              = new AttributeDefinition("isDefaultValue", _Boolean);
            _description                 = new AttributeDefinition("description", _String);
            _type                        = new AttributeDefinition("type", _TypeDefinitionREF);
            _internalTypeRef             = new AttributeDefinition("internalTypeRef", _TypeDefinitionREF);
            _derivedFrom                 = new AttributeDefinition("derivedFrom", _ClassDefinitionREF);
            _intendedToExtend            = new AttributeDefinition("intendedToExtend", _ClassDefinitionREF);
            _usesInterface               = new AttributeDefinition("usesInterface", _String);
            _derivedClasses              = new AttributeDefinition("derivedClasses", _ClassDefinitionREF);
            _must                        = new AttributeDefinition("must", _AttributeDefinitionREF);
            _may                         = new AttributeDefinition("may", _AttributeDefinitionREF);
            _mustParm                    = new AttributeDefinition("mustParm", _AttributeDefinitionREF);
            _mayParm                     = new AttributeDefinition("mayParm", _AttributeDefinitionREF);
            _mustReturn                  = new AttributeDefinition("mustReturn", _AttributeDefinitionREF);
            _mayReturn                   = new AttributeDefinition("mayReturn", _AttributeDefinitionREF);
            _actions                     = new AttributeDefinition("actions", _ActionDefinitionREF);
            _enumValue                   = new AttributeDefinition("enumValue", _EnumValue);
            _javaClass                   = new AttributeDefinition("javaClass", _String);
            _dmoImport                   = new AttributeDefinition("dmoImport", _String);
            _dmoClass                    = new AttributeDefinition("dmoClass", _String);
            _dmoAuxClass                 = new AttributeDefinition("dmoAuxClass", _String);
            _dmoAuxClassImport           = new AttributeDefinition("dmoAuxClassImport", _String);
            _dmwAuxClass                 = new AttributeDefinition("dmwAuxClass", _String);
            _dmwAuxClassImport           = new AttributeDefinition("dmwAuxClassImport", _String);
            _dmwImport                   = new AttributeDefinition("dmwImport", _String);
            _dmwClass                    = new AttributeDefinition("dmwClass", _String);
            _dmeImport                   = new AttributeDefinition("dmeImport", _String);
            _dmeClass                    = new AttributeDefinition("dmeClass", _String);
            _dmtImport                   = new AttributeDefinition("dmtImport", _String);
            _dmtClass                    = new AttributeDefinition("dmtClass", _String);
            _helperClassName             = new AttributeDefinition("helperClassName", _String);
            _getType                     = new AttributeDefinition("getType", _String);
            _getMethod                   = new AttributeDefinition("getMethod", _String);
            _setType                     = new AttributeDefinition("setType", _String);
            _valueClass                  = new AttributeDefinition("valueClass", _String);
            _javaPackage                 = new AttributeDefinition("javaPackage", _String);
            _schemaPackage               = new AttributeDefinition("schemaPackage", _String);
            _dmwPackage                  = new AttributeDefinition("dmwPackage", _String);
            _classDefList                = new AttributeDefinition("classDefList", _ClassDefinitionREF);
            _typeDefList                 = new AttributeDefinition("typeDefList", _TypeDefinitionREF);
            _internalTypeDefList         = new AttributeDefinition("internalTypeDefList", _TypeDefinitionREF);
            _enumDefList                 = new AttributeDefinition("enumDefList", _EnumDefinitionREF);
            _attributeDefList            = new AttributeDefinition("attributeDefList", _AttributeDefinitionREF);
            _actionDefList               = new AttributeDefinition("actionDefList", _ActionDefinitionREF);
            _definedIn                   = new AttributeDefinition("definedIn", _SchemaDefinitionREF);
            _allowedParents              = new AttributeDefinition("allowedParents", _ClassDefinitionREF);
            _namingAttribute             = new AttributeDefinition("namingAttribute", _AttributeDefinitionREF);
            _attachToClass               = new AttributeDefinition("attachToClass", _ClassDefinitionREF);
            _dependsOn                   = new AttributeDefinition("dependsOn", _String);
            _dependsOnRef                = new AttributeDefinition("dependsOnRef", _SchemaDefinitionREF);
            _defFiles                    = new AttributeDefinition("defFiles", _String);
            _enumInt                     = new AttributeDefinition("enumInt", _Integer);
            _enumString                  = new AttributeDefinition("enumString", _String);
            _blockWhenLocked             = new AttributeDefinition("blockWhenLocked", _Boolean);
            _isGetAction                 = new AttributeDefinition("isGetAction", _Boolean);
            _obsoleteVersion             = new AttributeDefinition("obsoleteVersion", _String);
            _file                        = new AttributeDefinition("file", _String);
            _lineNumber                  = new AttributeDefinition("lineNumber", _Integer);
            _maySendProgress             = new AttributeDefinition("maySendProgress", _Boolean);
            _internallyGenerated         = new AttributeDefinition("internallyGenerated", _Boolean);
            _secure                      = new AttributeDefinition("secure", _Boolean);
            _isTransportable             = new AttributeDefinition("isTransportable", _Boolean);
            _isNamedBy                   = new AttributeDefinition("isNamedBy", _AttributeDefinitionREF);
            _generatedFileHeader         = new AttributeDefinition("generatedFileHeader", _String);
            _useWrapperType              = new AttributeDefinition("useWrapperType", _WrapperTypeEnumREF);
            _originalClass               = new AttributeDefinition("originalClass", _ClassDefinitionREF);
            _FQN                         = new AttributeDefinition("FQN", _FullyQualifiedName);
            _modify                      = new AttributeDefinition("modify", _Modifier);
            _schemaBaseID                = new AttributeDefinition("schemaBaseID", _Integer);
            _schemaIDRange               = new AttributeDefinition("schemaIDRange", _Integer);
            _subpackage                  = new AttributeDefinition("subpackage", _String);
            _createAttributeFactory      = new AttributeDefinition("createAttributeFactory", _Boolean);
            _nameAttributeDef            = new AttributeDefinition("nameAttributeDef", _AttributeDefinitionREF);
            _dmwIteratorImport           = new AttributeDefinition("dmwIteratorImport", _String);
            _dmwIteratorClass            = new AttributeDefinition("dmwIteratorClass", _String);
            _dmtREFImport                = new AttributeDefinition("dmtREFImport", _String);
            _genericArgs                 = new AttributeDefinition("genericArgs", _String);
            _isNameType                  = new AttributeDefinition("isNameType", _Boolean);
            _keyClass                    = new AttributeDefinition("keyClass", _String);
            _keyImport                   = new AttributeDefinition("keyImport", _String);
            _genericArgsImport           = new AttributeDefinition("genericArgsImport", _String);
            _enumName                    = new AttributeDefinition("enumName", _String);
            _integerName                 = new AttributeDefinition("integerName", _IntegerName);
            _uuidName                    = new AttributeDefinition("uuidName", _UUIDName);
            _designatedNameAttribute     = new AttributeDefinition("designatedNameAttribute", _Boolean);
            _fieldSeparator              = new AttributeDefinition("fieldSeparator", _String);
            _field                       = new AttributeDefinition("field", _Field);
            _extendedClass               = new AttributeDefinition("extendedClass", _String);
            _dotName                     = new AttributeDefinition("dotName", _DotName);
            _altType                     = new AttributeDefinition("altType", _String);
            _altTypeImport               = new AttributeDefinition("altTypeImport", _String);
            _selectAttribute             = new AttributeDefinition("selectAttribute", _AttributeDefinitionREF);
            _sliceDefList                = new AttributeDefinition("sliceDefList", _SliceDefinitionREF);
            _validatorClass              = new AttributeDefinition("validatorClass", _String);
            _objectValidatorDefList      = new AttributeDefinition("objectValidatorDefList", _ObjectValidatorDefinitionREF);
            _attributeValidatorDefList   = new AttributeDefinition("attributeValidatorDefList", _AttributeValidatorDefinitionREF);
            _opContext                   = new AttributeDefinition("opContext", _OperationalContextEnumREF);
            _camelCaseName               = new AttributeDefinition("camelCaseName", _CamelCaseName);
            _complexTypeDefList          = new AttributeDefinition("complexTypeDefList", _ComplexTypeDefinitionREF);
            _supportsBackrefTracking     = new AttributeDefinition("supportsBackrefTracking", _Boolean);
            _extendsInterface            = new AttributeDefinition("extendsInterface", _String);
            _dependsOnSchema             = new AttributeDefinition("dependsOnSchema", _String);
            _isHierarchicName            = new AttributeDefinition("isHierarchicName", _Boolean);
            _internalUse                 = new AttributeDefinition("internalUse", _Boolean);
            _dmwTypeToPackage            = new AttributeDefinition("dmwTypeToPackage", _StringToString);
            _dmwWrapperType              = new AttributeDefinition("dmwWrapperType", _DmwTypeToWrapperType);
            _isFilterType                = new AttributeDefinition("isFilterType", _Boolean);
            _designatedFilterAttribute   = new AttributeDefinition("designatedFilterAttribute", _Boolean);
            _filterAttributeDef          = new AttributeDefinition("filterAttributeDef", _AttributeDefinitionREF);
            _classFilter                 = new AttributeDefinition("classFilter", _ClassFilter);
            _indexSize                   = new AttributeDefinition("indexSize", _Integer);
            _excludeFromContext          = new AttributeDefinition("excludeFromContext", _String);
            _extendedReferenceClass      = new AttributeDefinition("extendedReferenceClass", _ClassDefinitionREF);
            _extendedReferenceTypeDefList= new AttributeDefinition("extendedReferenceTypeDefList", _ExtendedReferenceTypeDefinitionREF);
            _isExtendedRefType           = new AttributeDefinition("isExtendedRefType", _Boolean);
            _longName                    = new AttributeDefinition("longName", _LongName);
            _baseType                    = new AttributeDefinition("baseType", _BaseTypeEnumREF);
            _ruleType                    = new AttributeDefinition("ruleType", _RuleTypeEnumREF);
            _ruleScope                   = new AttributeDefinition("ruleScope", _RuleScopeEnumREF);
            _ruleTitle                   = new AttributeDefinition("ruleTitle", _String);
            _ruleCategory                = new AttributeDefinition("ruleCategory", _RuleCategoryREF);
            _ruleCategoryID              = new AttributeDefinition("ruleCategoryID", _Integer);
            _ruleInterface               = new AttributeDefinition("ruleInterface", _String);
            _isExtensible                = new AttributeDefinition("isExtensible", _Boolean);
            _ruleCategoryList            = new AttributeDefinition("ruleCategoryList", _RuleCategoryREF);
            _ruleDefinitionList          = new AttributeDefinition("ruleDefinitionList", _RuleDefinitionREF);
            _ruleDefinition              = new AttributeDefinition("ruleDefinition", _RuleDefinitionREF);
            _objectClass                 = new AttributeDefinition("objectClass", _ClassDefinitionREF);

            // Create the rule category definitions
            // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:834)
            _Initialization              = new RuleCategory("Initialization");
            _ObjectValidation            = new RuleCategory("ObjectValidation");
            _ModifierValidation          = new RuleCategory("ModifierValidation");

            // Create the rule definitions
            // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:843)
            _AllowedAttributesRule       = new RuleDefinition("AllowedAttributesRule");
            _InitRule                    = new RuleDefinition("InitRule");

            // Set attribute values on all objects
            // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:859)
            _ActionDefinitionREF         .setDescription("This is an internally generated type to allow references to ActionDefinition objects.");
            _ActionDefinitionREF         .setInternallyGenerated("true");
            _ActionDefinitionREF         .setIsRefType("true");
            _ActionDefinitionREF         .setName("ActionDefinitionREF");
            _ActionDefinitionREF         .setOriginalClass(_ActionDefinition);
            _ActionDefinitionREF         .setTypeClassName("org.dmd.dms.generated.types.DmcTypeActionDefinitionREF");
            _ActionDefinitionREF         .setWrapperClassName("org.dmd.dms.ActionDefinition");
            _ActionDefinitionREF         .setDefinedIn(this);

            _AttributeDefinitionREF      .setDescription("This is an internally generated type to allow references to AttributeDefinition objects.");
            _AttributeDefinitionREF      .setInternallyGenerated("true");
            _AttributeDefinitionREF      .setIsRefType("true");
            _AttributeDefinitionREF      .setName("AttributeDefinitionREF");
            _AttributeDefinitionREF      .setOriginalClass(_AttributeDefinition);
            _AttributeDefinitionREF      .setTypeClassName("org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREF");
            _AttributeDefinitionREF      .setWrapperClassName("org.dmd.dms.AttributeDefinition");
            _AttributeDefinitionREF      .setDefinedIn(this);

            _AttributeID                 .setAltType("DmcAttributeInfo");
            _AttributeID                 .setAltTypeImport("org.dmd.dmc.DmcAttributeInfo");
            _AttributeID                 .setDescription("The AttributeID type allows for the storage of unique attribute identifiers.");
            _AttributeID                 .setName("AttributeID");
            _AttributeID                 .setPrimitiveType("org.dmd.dmc.types.AttributeID");
            _AttributeID                 .setTypeClassName("org.dmd.dmc.types.DmcTypeAttributeID");
            _AttributeID                 .setDefinedIn(this);

            _AttributeValidatorDefinitionREF.setDescription("This is an internally generated type to allow references to AttributeValidatorDefinition objects.");
            _AttributeValidatorDefinitionREF.setInternallyGenerated("true");
            _AttributeValidatorDefinitionREF.setIsRefType("true");
            _AttributeValidatorDefinitionREF.setName("AttributeValidatorDefinitionREF");
            _AttributeValidatorDefinitionREF.setOriginalClass(_AttributeValidatorDefinition);
            _AttributeValidatorDefinitionREF.setTypeClassName("org.dmd.dms.generated.types.DmcTypeAttributeValidatorDefinitionREF");
            _AttributeValidatorDefinitionREF.setWrapperClassName("org.dmd.dms.AttributeValidatorDefinition");
            _AttributeValidatorDefinitionREF.setDefinedIn(this);

            _BaseTypeEnumREF             .setDescription("This is an internally generated type to allow references to BaseTypeEnum objects.");
            _BaseTypeEnumREF             .setEnumName("BaseTypeEnum");
            _BaseTypeEnumREF             .setInternallyGenerated("true");
            _BaseTypeEnumREF             .setIsEnumType("true");
            _BaseTypeEnumREF             .setName("BaseTypeEnum");
            _BaseTypeEnumREF             .setPrimitiveType("org.dmd.dms.generated.enums.BaseTypeEnum");
            _BaseTypeEnumREF             .setTypeClassName("org.dmd.dms.generated.types.DmcTypeBaseTypeEnum");
            _BaseTypeEnumREF             .setDefinedIn(this);

            _Boolean                     .setDescription("Provides support for Boolean values. This type makes use of the nullReturnValue flag so that, even if there is no value for an attribute of this type, a value of false will be returned.");
            _Boolean                     .setName("Boolean");
            _Boolean                     .setNullReturnValue("false");
            _Boolean                     .setTypeClassName("org.dmd.dmc.types.DmcTypeBoolean");
            _Boolean                     .setDefinedIn(this);

            _CamelCaseName               .setDescription("The CamelCaseName is a string based name that must start with an alpha character which is followed by a mix of alphanumerics.");
            _CamelCaseName               .setIsNameType("true");
            _CamelCaseName               .setName("CamelCaseName");
            _CamelCaseName               .setPrimitiveType("org.dmd.dmc.types.CamelCaseName");
            _CamelCaseName               .setTypeClassName("org.dmd.dmc.types.DmcTypeCamelCaseName");
            _CamelCaseName               .setDefinedIn(this);

            _ClassDefinitionREF          .setDescription("This is an internally generated type to allow references to ClassDefinition objects.");
            _ClassDefinitionREF          .setInternallyGenerated("true");
            _ClassDefinitionREF          .setIsRefType("true");
            _ClassDefinitionREF          .setName("ClassDefinitionREF");
            _ClassDefinitionREF          .setOriginalClass(_ClassDefinition);
            _ClassDefinitionREF          .setTypeClassName("org.dmd.dms.generated.types.DmcTypeClassDefinitionREF");
            _ClassDefinitionREF          .setWrapperClassName("org.dmd.dms.ClassDefinition");
            _ClassDefinitionREF          .setDefinedIn(this);

            _ClassFilter                 .setDescription("The ClassFilter is used to perform matches against objects based on their class or auxiliary classes.");
            _ClassFilter                 .setIsFilterType("true");
            _ClassFilter                 .setName("ClassFilter");
            _ClassFilter                 .setPrimitiveType("org.dmd.dmc.types.ClassFilter");
            _ClassFilter                 .setTypeClassName("org.dmd.dmc.types.DmcTypeClassFilter");
            _ClassFilter                 .setDefinedIn(this);

            _ClassInfoRef                .setDescription("The ClassInfoRef type allows for the representation of class information  via the Dark Matter ID associated with a ClassDefinition. It provides transient access to the static DmcClassInfo from the generated DMSAG, regardless of the environment in which it exists.");
            _ClassInfoRef                .setName("ClassInfoRef");
            _ClassInfoRef                .setPrimitiveType("org.dmd.dmc.types.ClassInfoRef");
            _ClassInfoRef                .setTypeClassName("org.dmd.dmc.types.DmcTypeClassInfoRef");
            _ClassInfoRef                .setDefinedIn(this);

            _ClassTypeEnumREF            .setDescription("This is an internally generated type to allow references to ClassTypeEnum objects.");
            _ClassTypeEnumREF            .setEnumName("ClassTypeEnum");
            _ClassTypeEnumREF            .setInternallyGenerated("true");
            _ClassTypeEnumREF            .setIsEnumType("true");
            _ClassTypeEnumREF            .setName("ClassTypeEnum");
            _ClassTypeEnumREF            .setPrimitiveType("org.dmd.dms.generated.enums.ClassTypeEnum");
            _ClassTypeEnumREF            .setTypeClassName("org.dmd.dms.generated.types.DmcTypeClassTypeEnum");
            _ClassTypeEnumREF            .setDefinedIn(this);

            _ComplexTypeDefinitionREF    .setDescription("This is an internally generated type to allow references to ComplexTypeDefinition objects.");
            _ComplexTypeDefinitionREF    .setInternallyGenerated("true");
            _ComplexTypeDefinitionREF    .setIsRefType("true");
            _ComplexTypeDefinitionREF    .setName("ComplexTypeDefinitionREF");
            _ComplexTypeDefinitionREF    .setOriginalClass(_ComplexTypeDefinition);
            _ComplexTypeDefinitionREF    .setTypeClassName("org.dmd.dms.generated.types.DmcTypeComplexTypeDefinitionREF");
            _ComplexTypeDefinitionREF    .setWrapperClassName("org.dmd.dms.ComplexTypeDefinition");
            _ComplexTypeDefinitionREF    .setDefinedIn(this);

            _DataTypeEnumREF             .setDescription("This is an internally generated type to allow references to DataTypeEnum objects.");
            _DataTypeEnumREF             .setEnumName("DataTypeEnum");
            _DataTypeEnumREF             .setInternallyGenerated("true");
            _DataTypeEnumREF             .setIsEnumType("true");
            _DataTypeEnumREF             .setName("DataTypeEnum");
            _DataTypeEnumREF             .setPrimitiveType("org.dmd.dms.generated.enums.DataTypeEnum");
            _DataTypeEnumREF             .setTypeClassName("org.dmd.dms.generated.types.DmcTypeDataTypeEnum");
            _DataTypeEnumREF             .setDefinedIn(this);

            _Date                        .setDescription("Provide support for Date values.");
            _Date                        .setName("Date");
            _Date                        .setPrimitiveType("java.util.Date");
            _Date                        .setTypeClassName("org.dmd.dmc.types.DmcTypeDate");
            _Date                        .setDefinedIn(this);

            _DebugEnumREF                .setDescription("This is an internally generated type to allow references to DebugEnum objects.");
            _DebugEnumREF                .setEnumName("DebugEnum");
            _DebugEnumREF                .setInternallyGenerated("true");
            _DebugEnumREF                .setIsEnumType("true");
            _DebugEnumREF                .setName("DebugEnum");
            _DebugEnumREF                .setPrimitiveType("org.dmd.dms.generated.enums.DebugEnum");
            _DebugEnumREF                .setTypeClassName("org.dmd.dms.generated.types.DmcTypeDebugEnum");
            _DebugEnumREF                .setDefinedIn(this);

            _DmcAttribute                .setDescription("The DmcAttribute type allows for the storage of other attributes in an attribute. Yikes!");
            _DmcAttribute                .setGenericArgs("<?>");
            _DmcAttribute                .setName("DmcAttribute");
            _DmcAttribute                .setPrimitiveType("org.dmd.dmc.DmcAttribute");
            _DmcAttribute                .setTypeClassName("org.dmd.dmc.types.DmcTypeDmcAttribute");
            _DmcAttribute                .setDefinedIn(this);

            _DmcObject                   .setDescription("The DmcObject type allows for the storage of raw DmcObjects.");
            _DmcObject                   .setName("DmcObject");
            _DmcObject                   .setPrimitiveType("org.dmd.dmc.DmcObject");
            _DmcObject                   .setTypeClassName("org.dmd.dmc.types.DmcTypeDmcObject");
            _DmcObject                   .setDefinedIn(this);

            _DmsDefinitionREF            .setDescription("This is an internally generated type to allow references to DmsDefinition objects.");
            _DmsDefinitionREF            .setInternallyGenerated("true");
            _DmsDefinitionREF            .setIsRefType("true");
            _DmsDefinitionREF            .setName("DmsDefinitionREF");
            _DmsDefinitionREF            .setOriginalClass(_DmsDefinition);
            _DmsDefinitionREF            .setTypeClassName("org.dmd.dms.generated.types.DmcTypeDmsDefinitionREF");
            _DmsDefinitionREF            .setWrapperClassName("org.dmd.dms.DmsDefinition");
            _DmsDefinitionREF            .setDefinedIn(this);

            _DmwTypeToWrapperType        .setDescription("This is an internally generated type to represent complex type DmwTypeToWrapperType.");
            _DmwTypeToWrapperType        .setInternallyGenerated("true");
            _DmwTypeToWrapperType        .setName("DmwTypeToWrapperType");
            _DmwTypeToWrapperType        .setPrimitiveType("org.dmd.dms.generated.types.DmwTypeToWrapperType");
            _DmwTypeToWrapperType        .setTypeClassName("org.dmd.dms.generated.types.DmcTypeDmwTypeToWrapperType");
            _DmwTypeToWrapperType        .setDefinedIn(this);

            _DotName                     .setDescription("The DotName provides standard mechanisms to deal with hierarchic names composed of strings interspersed with periods (dots) to separate the name elements. For example a dot name might be one.two.three");
            _DotName                     .setIsHierarchicName("true");
            _DotName                     .setIsNameType("true");
            _DotName                     .setName("DotName");
            _DotName                     .setPrimitiveType("org.dmd.dmc.types.DotName");
            _DotName                     .setTypeClassName("org.dmd.dmc.types.DmcTypeDotName");
            _DotName                     .setDefinedIn(this);

            _Double                      .setDescription("Provide support for Double values.");
            _Double                      .setName("Double");
            _Double                      .setTypeClassName("org.dmd.dmc.types.DmcTypeDouble");
            _Double                      .setDefinedIn(this);

            _EnumDefinitionREF           .setDescription("This is an internally generated type to allow references to EnumDefinition objects.");
            _EnumDefinitionREF           .setInternallyGenerated("true");
            _EnumDefinitionREF           .setIsRefType("true");
            _EnumDefinitionREF           .setName("EnumDefinitionREF");
            _EnumDefinitionREF           .setOriginalClass(_EnumDefinition);
            _EnumDefinitionREF           .setTypeClassName("org.dmd.dms.generated.types.DmcTypeEnumDefinitionREF");
            _EnumDefinitionREF           .setWrapperClassName("org.dmd.dms.EnumDefinition");
            _EnumDefinitionREF           .setDefinedIn(this);

            _EnumValue                   .setDescription("The EnumValue type is used to store the definition of one enumerated value that comprises part of an overall EnumDefinition. <p/> The value of an EnumValue is comprised of at least three tokens and possibly a label: <br/> [enum integer value] [enum value name] [enum description] &lt: label&gt <br/> For example: 0 ABSTRACT Here is the definition of abstract. : Abstract <p/> Within an EnumDefinition, each EnumValue must have a unique integer identifier and a unique value name. <p/> The enum value name is automatically set to uppercase, even if it is specified in lower or mixed case.");
            _EnumValue                   .setName("EnumValue");
            _EnumValue                   .setPrimitiveType("org.dmd.dms.types.EnumValue");
            _EnumValue                   .setTypeClassName("org.dmd.dms.types.DmcTypeEnumValue");
            _EnumValue                   .setDefinedIn(this);

            _ExtendedReferenceTypeDefinitionREF.setDescription("This is an internally generated type to allow references to ExtendedReferenceTypeDefinition objects.");
            _ExtendedReferenceTypeDefinitionREF.setInternallyGenerated("true");
            _ExtendedReferenceTypeDefinitionREF.setIsRefType("true");
            _ExtendedReferenceTypeDefinitionREF.setName("ExtendedReferenceTypeDefinitionREF");
            _ExtendedReferenceTypeDefinitionREF.setOriginalClass(_ExtendedReferenceTypeDefinition);
            _ExtendedReferenceTypeDefinitionREF.setTypeClassName("org.dmd.dms.generated.types.DmcTypeExtendedReferenceTypeDefinitionREF");
            _ExtendedReferenceTypeDefinitionREF.setWrapperClassName("org.dmd.dms.ExtendedReferenceTypeDefinition");
            _ExtendedReferenceTypeDefinitionREF.setDefinedIn(this);

            _Field                       .setDescription("This is an internally generated type to represent complex type Field.");
            _Field                       .setInternallyGenerated("true");
            _Field                       .setName("Field");
            _Field                       .setPrimitiveType("org.dmd.dms.generated.types.Field");
            _Field                       .setTypeClassName("org.dmd.dms.generated.types.DmcTypeField");
            _Field                       .setDefinedIn(this);

            _FilterContainer             .setAltType("DmcFilter");
            _FilterContainer             .setAltTypeImport("org.dmd.dmc.DmcFilter");
            _FilterContainer             .setDescription("The FilterContainer type allows for the storage of object filters of different types.");
            _FilterContainer             .setName("FilterContainer");
            _FilterContainer             .setPrimitiveType("org.dmd.dmc.types.FilterContainer");
            _FilterContainer             .setTypeClassName("org.dmd.dmc.types.DmcTypeFilterContainer");
            _FilterContainer             .setDefinedIn(this);

            _FilterTypeEnumREF           .setDescription("This is an internally generated type to allow references to FilterTypeEnum objects.");
            _FilterTypeEnumREF           .setEnumName("FilterTypeEnum");
            _FilterTypeEnumREF           .setInternallyGenerated("true");
            _FilterTypeEnumREF           .setIsEnumType("true");
            _FilterTypeEnumREF           .setName("FilterTypeEnum");
            _FilterTypeEnumREF           .setPrimitiveType("org.dmd.dms.generated.enums.FilterTypeEnum");
            _FilterTypeEnumREF           .setTypeClassName("org.dmd.dms.generated.types.DmcTypeFilterTypeEnum");
            _FilterTypeEnumREF           .setDefinedIn(this);

            _Float                       .setDescription("Provide support for Float values.");
            _Float                       .setName("Float");
            _Float                       .setTypeClassName("org.dmd.dmc.types.DmcTypeFloat");
            _Float                       .setDefinedIn(this);

            _FullyQualifiedName          .setIsNameType("true");
            _FullyQualifiedName          .setName("FullyQualifiedName");
            _FullyQualifiedName          .setPrimitiveType("org.dmd.dmc.types.FullyQualifiedName");
            _FullyQualifiedName          .setTypeClassName("org.dmd.dmc.types.DmcTypeFullyQualifiedName");
            _FullyQualifiedName          .setDefinedIn(this);

            _Integer                     .setDescription("Provides support for Integer values.");
            _Integer                     .setName("Integer");
            _Integer                     .setTypeClassName("org.dmd.dmc.types.DmcTypeInteger");
            _Integer                     .setDefinedIn(this);

            _IntegerName                 .setDescription("An IntegerName provides the means to uniquely identify an object using an integer value.");
            _IntegerName                 .setIsNameType("true");
            _IntegerName                 .setName("IntegerName");
            _IntegerName                 .setPrimitiveType("org.dmd.dmc.types.IntegerName");
            _IntegerName                 .setTypeClassName("org.dmd.dmc.types.DmcTypeIntegerName");
            _IntegerName                 .setDefinedIn(this);

            _IntegerToBoolean            .setDescription("Provides support for hashed integer to Boolean values.");
            _IntegerToBoolean            .setKeyClass("Integer");
            _IntegerToBoolean            .setName("IntegerToBoolean");
            _IntegerToBoolean            .setPrimitiveType("org.dmd.dmc.types.IntegerToBoolean");
            _IntegerToBoolean            .setTypeClassName("org.dmd.dmc.types.DmcTypeIntegerToBoolean");
            _IntegerToBoolean            .setDefinedIn(this);

            _IntegerToString             .setDescription("Provides support for hashed integer to string values.");
            _IntegerToString             .setKeyClass("Integer");
            _IntegerToString             .setName("IntegerToString");
            _IntegerToString             .setPrimitiveType("org.dmd.dmc.types.IntegerToString");
            _IntegerToString             .setTypeClassName("org.dmd.dmc.types.DmcTypeIntegerToString");
            _IntegerToString             .setDefinedIn(this);

            _IntegerToUUIDLite           .setDescription("Provides support for hashed integer to UUIDLite values.");
            _IntegerToUUIDLite           .setKeyClass("Integer");
            _IntegerToUUIDLite           .setName("IntegerToUUIDLite");
            _IntegerToUUIDLite           .setPrimitiveType("org.dmd.dmc.types.IntegerToUUIDLite");
            _IntegerToUUIDLite           .setTypeClassName("org.dmd.dmc.types.DmcTypeIntegerToUUIDLite");
            _IntegerToUUIDLite           .setDefinedIn(this);

            _LabelledIntegerDataPoint    .setDescription("Represents a single, labelled Integer data point. Generally used for pie chart data.");
            _LabelledIntegerDataPoint    .setName("LabelledIntegerDataPoint");
            _LabelledIntegerDataPoint    .setPrimitiveType("org.dmd.dmc.types.LabelledIntegerDataPoint");
            _LabelledIntegerDataPoint    .setTypeClassName("org.dmd.dmc.types.DmcTypeLabelledIntegerDataPoint");
            _LabelledIntegerDataPoint    .setDefinedIn(this);

            _Long                        .setDescription("Provide support for Long values.");
            _Long                        .setName("Long");
            _Long                        .setTypeClassName("org.dmd.dmc.types.DmcTypeLong");
            _Long                        .setDefinedIn(this);

            _LongName                    .setDescription("A LongName provides the means to uniquely identify an object using a long value.");
            _LongName                    .setIsNameType("true");
            _LongName                    .setName("LongName");
            _LongName                    .setPrimitiveType("org.dmd.dmc.types.LongName");
            _LongName                    .setTypeClassName("org.dmd.dmc.types.DmcTypeLongName");
            _LongName                    .setDefinedIn(this);

            _ModificationControlEnumREF  .setDescription("This is an internally generated type to allow references to ModificationControlEnum objects.");
            _ModificationControlEnumREF  .setEnumName("ModificationControlEnum");
            _ModificationControlEnumREF  .setInternallyGenerated("true");
            _ModificationControlEnumREF  .setIsEnumType("true");
            _ModificationControlEnumREF  .setName("ModificationControlEnum");
            _ModificationControlEnumREF  .setPrimitiveType("org.dmd.dms.generated.enums.ModificationControlEnum");
            _ModificationControlEnumREF  .setTypeClassName("org.dmd.dms.generated.types.DmcTypeModificationControlEnum");
            _ModificationControlEnumREF  .setDefinedIn(this);

            _Modifier                    .setDescription("The Modifier type is used to represent modification operations on a DmcObject. Any modification to an object can be represented by a Modifier. The string representation of a modification can take the following forms: <ul> <li> &ltattribute name&gt ADD &ltvalue&gt</li> <li> &ltattribute name&gt DEL &ltvalue&gt</li> <li> &ltattribute name&gt SET &ltvalue&gt</li> <li> &ltattribute name&gt NTH &ltindex&gt &ltvalue&gt</li> <li> &ltattribute name&gt NTH &ltindex&gt</li> <li> &ltattribute name&gt REM </li> </ul>");
            _Modifier                    .setName("Modifier");
            _Modifier                    .setPrimitiveType("org.dmd.dmc.types.Modifier");
            _Modifier                    .setTypeClassName("org.dmd.dmc.types.DmcTypeModifier");
            _Modifier                    .setDefinedIn(this);

            _ModifyTypeEnumREF           .setDescription("This is an internally generated type to allow references to ModifyTypeEnum objects.");
            _ModifyTypeEnumREF           .setEnumName("ModifyTypeEnum");
            _ModifyTypeEnumREF           .setInternallyGenerated("true");
            _ModifyTypeEnumREF           .setIsEnumType("true");
            _ModifyTypeEnumREF           .setName("ModifyTypeEnum");
            _ModifyTypeEnumREF           .setPrimitiveType("org.dmd.dms.generated.enums.ModifyTypeEnum");
            _ModifyTypeEnumREF           .setTypeClassName("org.dmd.dms.generated.types.DmcTypeModifyTypeEnum");
            _ModifyTypeEnumREF           .setDefinedIn(this);

            _NameContainer               .setAltType("DmcObjectName");
            _NameContainer               .setAltTypeImport("org.dmd.dmc.DmcObjectName");
            _NameContainer               .setDescription("The NameContainer type allows for the storage of object names of different types. This mechanism is required because the naming mechanisms associated with dark-matter allow for different ways of naming objects. When the name of something is transported, it has to be  self describing i.e. the type of the naming attribute must be known so that the appropriate  name type can be instantiated. An example of this comes from the Dark Matter Protocol.  The targets attribute is defined as a NameContainer. An instance of targets might appear as follows: <pre> targets uuidName 809408a7-f00b-448c-beb6-00337e83acc4 </pre> As you can see, the attribute name is targets and the value is uuidName 809408a7-f00b-448c-beb6-00337e83acc4. The uuidName attribute is the designatedNameAttribute for the UUIDName type. So, when parsing/deserializing a name container, we always know the underlying type of the name. <p/> This approach makes dark-matter name handling completely extensible. <p/> A similar approach is taken to filter specifications via the FilterContainer.");
            _NameContainer               .setName("NameContainer");
            _NameContainer               .setPrimitiveType("org.dmd.dmc.types.NameContainer");
            _NameContainer               .setTypeClassName("org.dmd.dmc.types.DmcTypeNameContainer");
            _NameContainer               .setDefinedIn(this);

            _ObjectValidatorDefinitionREF.setDescription("This is an internally generated type to allow references to ObjectValidatorDefinition objects.");
            _ObjectValidatorDefinitionREF.setInternallyGenerated("true");
            _ObjectValidatorDefinitionREF.setIsRefType("true");
            _ObjectValidatorDefinitionREF.setName("ObjectValidatorDefinitionREF");
            _ObjectValidatorDefinitionREF.setOriginalClass(_ObjectValidatorDefinition);
            _ObjectValidatorDefinitionREF.setTypeClassName("org.dmd.dms.generated.types.DmcTypeObjectValidatorDefinitionREF");
            _ObjectValidatorDefinitionREF.setWrapperClassName("org.dmd.dms.ObjectValidatorDefinition");
            _ObjectValidatorDefinitionREF.setDefinedIn(this);

            _OperationalContextEnumREF   .setDescription("This is an internally generated type to allow references to OperationalContextEnum objects.");
            _OperationalContextEnumREF   .setEnumName("OperationalContextEnum");
            _OperationalContextEnumREF   .setInternallyGenerated("true");
            _OperationalContextEnumREF   .setIsEnumType("true");
            _OperationalContextEnumREF   .setName("OperationalContextEnum");
            _OperationalContextEnumREF   .setPrimitiveType("org.dmd.dms.generated.enums.OperationalContextEnum");
            _OperationalContextEnumREF   .setTypeClassName("org.dmd.dms.generated.types.DmcTypeOperationalContextEnum");
            _OperationalContextEnumREF   .setDefinedIn(this);

            _RuleCategoryREF             .setDescription("This is an internally generated type to allow references to RuleCategory objects.");
            _RuleCategoryREF             .setInternallyGenerated("true");
            _RuleCategoryREF             .setIsRefType("true");
            _RuleCategoryREF             .setName("RuleCategoryREF");
            _RuleCategoryREF             .setOriginalClass(_RuleCategory);
            _RuleCategoryREF             .setTypeClassName("org.dmd.dms.generated.types.DmcTypeRuleCategoryREF");
            _RuleCategoryREF             .setWrapperClassName("org.dmd.dms.RuleCategory");
            _RuleCategoryREF             .setDefinedIn(this);

            _RuleDefinitionREF           .setDescription("This is an internally generated type to allow references to RuleDefinition objects.");
            _RuleDefinitionREF           .setInternallyGenerated("true");
            _RuleDefinitionREF           .setIsRefType("true");
            _RuleDefinitionREF           .setName("RuleDefinitionREF");
            _RuleDefinitionREF           .setOriginalClass(_RuleDefinition);
            _RuleDefinitionREF           .setTypeClassName("org.dmd.dms.generated.types.DmcTypeRuleDefinitionREF");
            _RuleDefinitionREF           .setWrapperClassName("org.dmd.dms.RuleDefinition");
            _RuleDefinitionREF           .setDefinedIn(this);

            _RuleScopeEnumREF            .setDescription("This is an internally generated type to allow references to RuleScopeEnum objects.");
            _RuleScopeEnumREF            .setEnumName("RuleScopeEnum");
            _RuleScopeEnumREF            .setInternallyGenerated("true");
            _RuleScopeEnumREF            .setIsEnumType("true");
            _RuleScopeEnumREF            .setName("RuleScopeEnum");
            _RuleScopeEnumREF            .setPrimitiveType("org.dmd.dms.generated.enums.RuleScopeEnum");
            _RuleScopeEnumREF            .setTypeClassName("org.dmd.dms.generated.types.DmcTypeRuleScopeEnum");
            _RuleScopeEnumREF            .setDefinedIn(this);

            _RuleTypeEnumREF             .setDescription("This is an internally generated type to allow references to RuleTypeEnum objects.");
            _RuleTypeEnumREF             .setEnumName("RuleTypeEnum");
            _RuleTypeEnumREF             .setInternallyGenerated("true");
            _RuleTypeEnumREF             .setIsEnumType("true");
            _RuleTypeEnumREF             .setName("RuleTypeEnum");
            _RuleTypeEnumREF             .setPrimitiveType("org.dmd.dms.generated.enums.RuleTypeEnum");
            _RuleTypeEnumREF             .setTypeClassName("org.dmd.dms.generated.types.DmcTypeRuleTypeEnum");
            _RuleTypeEnumREF             .setDefinedIn(this);

            _SchemaDefinitionREF         .setDescription("This is an internally generated type to allow references to SchemaDefinition objects.");
            _SchemaDefinitionREF         .setInternallyGenerated("true");
            _SchemaDefinitionREF         .setIsRefType("true");
            _SchemaDefinitionREF         .setName("SchemaDefinitionREF");
            _SchemaDefinitionREF         .setOriginalClass(_SchemaDefinition);
            _SchemaDefinitionREF         .setTypeClassName("org.dmd.dms.generated.types.DmcTypeSchemaDefinitionREF");
            _SchemaDefinitionREF         .setWrapperClassName("org.dmd.dms.SchemaDefinition");
            _SchemaDefinitionREF         .setDefinedIn(this);

            _SliceDefinitionREF          .setDescription("This is an internally generated type to allow references to SliceDefinition objects.");
            _SliceDefinitionREF          .setInternallyGenerated("true");
            _SliceDefinitionREF          .setIsRefType("true");
            _SliceDefinitionREF          .setName("SliceDefinitionREF");
            _SliceDefinitionREF          .setOriginalClass(_SliceDefinition);
            _SliceDefinitionREF          .setTypeClassName("org.dmd.dms.generated.types.DmcTypeSliceDefinitionREF");
            _SliceDefinitionREF          .setWrapperClassName("org.dmd.dms.SliceDefinition");
            _SliceDefinitionREF          .setDefinedIn(this);

            _String                      .setDescription("Provides support for String values.");
            _String                      .setName("String");
            _String                      .setTypeClassName("org.dmd.dmc.types.DmcTypeString");
            _String                      .setDefinedIn(this);

            _StringName                  .setDescription("The StringName is the simplest naming mechanism available; it's just a String.");
            _StringName                  .setIsNameType("true");
            _StringName                  .setName("StringName");
            _StringName                  .setPrimitiveType("org.dmd.dmc.types.StringName");
            _StringName                  .setTypeClassName("org.dmd.dmc.types.DmcTypeStringName");
            _StringName                  .setDefinedIn(this);

            _StringToString              .setDescription("Provides support for hashed string to string values.");
            _StringToString              .setKeyClass("String");
            _StringToString              .setName("StringToString");
            _StringToString              .setPrimitiveType("org.dmd.dmc.types.StringToString");
            _StringToString              .setTypeClassName("org.dmd.dmc.types.DmcTypeStringToString");
            _StringToString              .setDefinedIn(this);

            _TimeDoubleDataPoint         .setDescription("Represents a single Double data point at a moment in time. Generally used for line or column chart data.");
            _TimeDoubleDataPoint         .setName("TimeDoubleDataPoint");
            _TimeDoubleDataPoint         .setPrimitiveType("org.dmd.dmc.types.TimeDoubleDataPoint");
            _TimeDoubleDataPoint         .setTypeClassName("org.dmd.dmc.types.DmcTypeTimeDoubleDataPoint");
            _TimeDoubleDataPoint         .setDefinedIn(this);

            _TypeDefinitionREF           .setDescription("This is an internally generated type to allow references to TypeDefinition objects.");
            _TypeDefinitionREF           .setInternallyGenerated("true");
            _TypeDefinitionREF           .setIsRefType("true");
            _TypeDefinitionREF           .setName("TypeDefinitionREF");
            _TypeDefinitionREF           .setOriginalClass(_TypeDefinition);
            _TypeDefinitionREF           .setTypeClassName("org.dmd.dms.generated.types.DmcTypeTypeDefinitionREF");
            _TypeDefinitionREF           .setWrapperClassName("org.dmd.dms.TypeDefinition");
            _TypeDefinitionREF           .setDefinedIn(this);

            _UUIDLite                    .setDescription("The UUIDLite provides support for UUIDs in GWT environments; a full UUID implementation is not supported by the GWT JRE Emulation mechanisms. It holds two long values that represent a complete java.util.UUID as generated within the server environment. The methods to parse a UUID from a String and present it as a String are taken from the java.util.UUID class.");
            _UUIDLite                    .setName("UUIDLite");
            _UUIDLite                    .setPrimitiveType("org.dmd.dmc.types.UUIDLite");
            _UUIDLite                    .setTypeClassName("org.dmd.dmc.types.DmcTypeUUIDLite");
            _UUIDLite                    .setDefinedIn(this);

            _UUIDName                    .setDescription("The UUIDName allows for the naming of objects based on the GWT compatible UUIDLite type.");
            _UUIDName                    .setIsNameType("true");
            _UUIDName                    .setName("UUIDName");
            _UUIDName                    .setPrimitiveType("org.dmd.dmc.types.UUIDName");
            _UUIDName                    .setTypeClassName("org.dmd.dmc.types.DmcTypeUUIDName");
            _UUIDName                    .setDefinedIn(this);

            _ValueTypeEnumREF            .setDescription("This is an internally generated type to allow references to ValueTypeEnum objects.");
            _ValueTypeEnumREF            .setEnumName("ValueTypeEnum");
            _ValueTypeEnumREF            .setInternallyGenerated("true");
            _ValueTypeEnumREF            .setIsEnumType("true");
            _ValueTypeEnumREF            .setName("ValueTypeEnum");
            _ValueTypeEnumREF            .setPrimitiveType("org.dmd.dms.generated.enums.ValueTypeEnum");
            _ValueTypeEnumREF            .setTypeClassName("org.dmd.dms.generated.types.DmcTypeValueTypeEnum");
            _ValueTypeEnumREF            .setDefinedIn(this);

            _WrapperTypeEnumREF          .setDescription("This is an internally generated type to allow references to WrapperTypeEnum objects.");
            _WrapperTypeEnumREF          .setEnumName("WrapperTypeEnum");
            _WrapperTypeEnumREF          .setInternallyGenerated("true");
            _WrapperTypeEnumREF          .setIsEnumType("true");
            _WrapperTypeEnumREF          .setName("WrapperTypeEnum");
            _WrapperTypeEnumREF          .setPrimitiveType("org.dmd.dms.generated.enums.WrapperTypeEnum");
            _WrapperTypeEnumREF          .setTypeClassName("org.dmd.dms.generated.types.DmcTypeWrapperTypeEnum");
            _WrapperTypeEnumREF          .setDefinedIn(this);

            _BaseTypeEnum                .setDescription("The BaseTypeEnum indicates the broad category of data types for which  a MethodGenerator component is intended. The matrix defined by combining the ValueType and BaseTypeEnums indicates all the combinations of method types required for a particular type of data in code generation context.");
            _BaseTypeEnum                .addEnumValue("0 PRIMITIVE 	Indicates a primitive data type such as Integer, String, long or a generated complex type.");
            _BaseTypeEnum                .addEnumValue("1 NAMEDREF		Indicates a named object reference.");
            _BaseTypeEnum                .addEnumValue("2 UNNAMEDREF 	Indicates an unnamed object reference.");
            _BaseTypeEnum                .addEnumValue("3 EXTENDEDREF 	Indicates an extended reference.");
            _BaseTypeEnum                .addEnumValue("4 KEYED			Indicates a type that has a defined key type.");
            _BaseTypeEnum                .setName("BaseTypeEnum");
            _BaseTypeEnum                .setNullReturnValue("BaseTypeEnum.PRIMITIVE");
            _BaseTypeEnum                .setDefinedIn(this);

            _ClassTypeEnum               .setDescription("The ClassTypeEnum enumeration indicates the types of classes that can be defined; some of these definitions are borrowed from LDAP directory parlance. See the individual enum value definitions for details.");
            _ClassTypeEnum               .addEnumValue("0 UNKNOWN		Unknown value.");
            _ClassTypeEnum               .addEnumValue("1 ABSTRACT		An abstract class is one that provides a base class for a set of related derived classes, but which can't be instantiated by itself.");
            _ClassTypeEnum               .addEnumValue("2 STRUCTURAL	A structural class is a class that can be instantiated by itself.");
            _ClassTypeEnum               .addEnumValue("3 AUXILIARY 	An auxiliary class is basically a collection of additional attributes that can be added to an instance of a STRUCTURAL class; an AUXILIARY class can't be instantiated on its own.");
            _ClassTypeEnum               .addEnumValue("4 EXTENSIBLE 	An extensible class is basically a free-form class that allows ANY attribute to be set on it.");
            _ClassTypeEnum               .addEnumValue("5 INTERFACE		An interface class provides an interface for a set of implementing classes.");
            _ClassTypeEnum               .setName("ClassTypeEnum");
            _ClassTypeEnum               .setNullReturnValue("ClassTypeEnum.UNKNOWN");
            _ClassTypeEnum               .setDefinedIn(this);

            _DataTypeEnum                .setDescription("The DataTypeEnum relates to how attributes/classes are dealt with by various persistence mechanism. No inherent behaviour is defined at this level.");
            _DataTypeEnum                .addEnumValue("0 UNKNOWN Indicates that we can't determine the data type.");
            _DataTypeEnum                .addEnumValue("1 TRANSIENT Indicates that the data is transient i.e. it exists within the application context in which it is used, but is not persisted across application invocations and is not serialized in communications with other systems.");
            _DataTypeEnum                .addEnumValue("2 PERSISTENT Indicates that the data is meant to be persistent. What persistence mechanism is used is application dependent.");
            _DataTypeEnum                .addEnumValue("3 NONPERSISTENT Indicates that the data is used within your system and  transmitted to remote systems but is not persisted.");
            _DataTypeEnum                .setName("DataTypeEnum");
            _DataTypeEnum                .setNullReturnValue("DataTypeEnum.PERSISTENT");
            _DataTypeEnum                .setDefinedIn(this);

            _DebugEnum                   .setDescription("The DebugEnum indicates the various levels of detailed logging that can be enabled in the DMC framework.");
            _DebugEnum                   .addEnumValue("0 NONE Unknown value.");
            _DebugEnum                   .addEnumValue("1 FILTER Allows fine control over printing of debug messages associated with filtering operations.");
            _DebugEnum                   .addEnumValue("2 SCHEMA Allows fine control over printing of debug messages associated with schema loading operations.");
            _DebugEnum                   .setName("DebugEnum");
            _DebugEnum                   .setNullReturnValue("DebugEnum.NONE");
            _DebugEnum                   .setDefinedIn(this);

            _FilterTypeEnum              .setDescription("The FilterTypeEnum enumeration indicates the types of filter operations that can be carried out on the attributes of an object.");
            _FilterTypeEnum              .addEnumValue("0 NONE Indicates that no filter operation was specified.");
            _FilterTypeEnum              .addEnumValue("1 AND  Indicates that the rest of the filter ops that follow will be ANDed together.");
            _FilterTypeEnum              .addEnumValue("2 OR   Indicates that the rest of the filter ops that follow will be ORed together.");
            _FilterTypeEnum              .addEnumValue("3 EQ   Performs a test for equality.");
            _FilterTypeEnum              .addEnumValue("4 NE   Performs a test for inequality.");
            _FilterTypeEnum              .addEnumValue("5 PR   Performs a test for the presence of an attribute.");
            _FilterTypeEnum              .addEnumValue("6 NP   Performs a test to see if an attribute is not present.");
            _FilterTypeEnum              .setName("FilterTypeEnum");
            _FilterTypeEnum              .setNullReturnValue("FilterTypeEnum.NONE");
            _FilterTypeEnum              .setDefinedIn(this);

            _ModificationControlEnum     .setDescription("The ModificationControlEnum indicates");
            _ModificationControlEnum     .addEnumValue("0 SINGLE Indicates that the attribute is single-valued.");
            _ModificationControlEnum     .setName("ModificationControlEnum");
            _ModificationControlEnum     .setNullReturnValue("ValueTypeEnum.SINGLE");
            _ModificationControlEnum     .setDefinedIn(this);

            _ModifyTypeEnum              .setDescription("The ModifyTypeEnum indicates the types of modification operations that can be carried out on the attributes of an object.");
            _ModifyTypeEnum              .addEnumValue("0 NONE Indicates that no modify operation was specified.");
            _ModifyTypeEnum              .addEnumValue("1 ADD  The ADD operation adds a new value to a multi-valued attribute.");
            _ModifyTypeEnum              .addEnumValue("2 DEL  The DEL operation removes a value from a multi-valued attribute.");
            _ModifyTypeEnum              .addEnumValue("3 SET  The SET operation sets a new value for a single-valued attribute.");
            _ModifyTypeEnum              .addEnumValue("4 REM  The REM operation removes the entire attribute from the object.");
            _ModifyTypeEnum              .addEnumValue("5 NTH  The NTH operation sets the value at the specified index.");
            _ModifyTypeEnum              .setName("ModifyTypeEnum");
            _ModifyTypeEnum              .setNullReturnValue("ModifyTypeEnum.NONE");
            _ModifyTypeEnum              .setDefinedIn(this);

            _OperationalContextEnum      .setDescription("The OperationalContextEnum indicates various types of operational contexts in which some component can operate.");
            _OperationalContextEnum      .addEnumValue("0 DMO       Indicates that the component follows basic Dark Matter Object rules which likewise conform to GWT JRE Emulation.");
            _OperationalContextEnum      .addEnumValue("1 FULLJAVA  indicates that the component operates in a ful Java environment; no restrictions.");
            _OperationalContextEnum      .setName("OperationalContextEnum");
            _OperationalContextEnum      .setNullReturnValue("OperationalContextEnum.DMO");
            _OperationalContextEnum      .setDefinedIn(this);

            _RuleScopeEnum               .setDescription("The RuleScopeEnum indicates the scope at which a rule is applied.  When the DMO for a rule is generated, the scope, in conjunction with the RuleTypeEnum will determine some additional attributes that will be added to the DMO class definition. <table> <tr> <td> ATTRIBUTE </td> <td> PERCLASS      </td> <td> applyToClass   </td> </tr> <tr> <td> ATTRIBUTE </td> <td> ACROSSCLASSES </td> <td> applyToClasses </td> </tr> <tr> <td> ATTRIBUTE </td> <td> GLOBAL        </td> <td> [nothing]      </td> </tr> <tr> <td> CLASS     </td> <td> PERCLASS      </td> <td> applyToClass   </td> </tr> <tr> <td> CLASS     </td> <td> ACROSSCLASSES </td> <td> applyToClasses </td> </tr> <tr> <td> CLASS     </td> <td> GLOBAL        </td> <td> [nothing]      </td> </tr> </table>");
            _RuleScopeEnum               .addEnumValue("0 PERCLASS 		Indicates the rule is applied within the scope of a class.");
            _RuleScopeEnum               .addEnumValue("1 ACROSSCLASSES Indicates the rule is applied across several classes.");
            _RuleScopeEnum               .addEnumValue("2 GLOBAL		Indicates the rule is global in scope.");
            _RuleScopeEnum               .setName("RuleScopeEnum");
            _RuleScopeEnum               .setNullReturnValue("RuleScopeEnum.PERCLASS");
            _RuleScopeEnum               .setDefinedIn(this);

            _RuleTypeEnum                .setDescription("The RuleTypeEnum indicates the level at which a rule is applied.");
            _RuleTypeEnum                .addEnumValue("0 ATTRIBUTE Indicates that this is an attribute level rule.");
            _RuleTypeEnum                .addEnumValue("1 CLASS     Indicates that this is a class level rule.");
            _RuleTypeEnum                .setName("RuleTypeEnum");
            _RuleTypeEnum                .setNullReturnValue("RuleTypeEnum.ATTRIBUTE");
            _RuleTypeEnum                .setDefinedIn(this);

            _ValueTypeEnum               .setDescription("The ValueTypeEnum indicates the cardinality of an attribute as well as the type of Map to be used if the attribute is keyed. This is an extension to original concept of single-valued versus multi-valued. Hashsets are also supported.");
            _ValueTypeEnum               .addEnumValue("0 SINGLE Indicates that the attribute is single-valued.");
            _ValueTypeEnum               .addEnumValue("1 MULTI Indicates that the attribute is multi-valued.");
            _ValueTypeEnum               .addEnumValue("2 HASHMAPPED Indicates that the attribute values implement the DmcMappedAttributeIF interface and are stored in a HashMap.");
            _ValueTypeEnum               .addEnumValue("3 TREEMAPPED Indicates that the attribute values implement the DmcMappedAttributeIF interface and are stored in a TreeMap.");
            _ValueTypeEnum               .addEnumValue("4 HASHSET Indicates that the attribute values are stored in a HashSet.");
            _ValueTypeEnum               .addEnumValue("5 TREESET Indicates that the attribute values are stored in a TreeSet.");
            _ValueTypeEnum               .addEnumValue("6 INDEXED Indicates that the attribute is multi-valued and indexed i.e. it has predefined slots for a fix number of values.");
            _ValueTypeEnum               .setName("ValueTypeEnum");
            _ValueTypeEnum               .setNullReturnValue("ValueTypeEnum.SINGLE");
            _ValueTypeEnum               .setDefinedIn(this);

            _WrapperTypeEnum             .setDescription("The WrapperTypeEnum indicates which wrapper class you want instantiated when a class of object is recognized during parsing or when an object is pulled from a repository.");
            _WrapperTypeEnum             .addEnumValue("0 NONE Unknown value.");
            _WrapperTypeEnum             .addEnumValue("1 BASE Indicates that you just want to use the generated DMW class.");
            _WrapperTypeEnum             .addEnumValue("2 EXTENDED Indicates that you want to use your own extended class.");
            _WrapperTypeEnum             .setName("WrapperTypeEnum");
            _WrapperTypeEnum             .setNullReturnValue("WrapperTypeEnum.BASE");
            _WrapperTypeEnum             .setDefinedIn(this);

            _FQN                         .setDescription("The fully qualified name of a hierarchic object. The exact form of the fqn is application specific.");
            _FQN                         .setDesignatedNameAttribute("true");
            _FQN                         .setDmdID("84");
            _FQN                         .setName("FQN");
            _FQN                         .setType(_FullyQualifiedName);
            _FQN                         .setDefinedIn(this);

            _abbrev                      .setDescription("This attribute stores an abbreviated form of the name of an attribute or class. This concept is borrowed from directory technology where shortened name forms are often used as part of distinguished names (DNs).");
            _abbrev                      .setDmdID("9");
            _abbrev                      .setName("abbrev");
            _abbrev                      .setType(_String);
            _abbrev                      .setDefinedIn(this);

            _actionDefList               .setDescription("A list of action definition references.");
            _actionDefList               .setDmdID("60");
            _actionDefList               .setInternalUse("true");
            _actionDefList               .setName("actionDefList");
            _actionDefList               .setType(_ActionDefinitionREF);
            _actionDefList               .setValueType(ValueTypeEnum.MULTI);
            _actionDefList               .setDefinedIn(this);

            _actions                     .setDescription("Indicates the set of actions that are supported by a class of objects.");
            _actions                     .setDmdID("32");
            _actions                     .setName("actions");
            _actions                     .setType(_ActionDefinitionREF);
            _actions                     .setValueType(ValueTypeEnum.MULTI);
            _actions                     .setDefinedIn(this);

            _allowedParents              .setDescription("Indicates the classes of object that may be parents of the current class when objects are created in an instance hierarchy.");
            _allowedParents              .setDmdID("62");
            _allowedParents              .setName("allowedParents");
            _allowedParents              .setType(_ClassDefinitionREF);
            _allowedParents              .setValueType(ValueTypeEnum.MULTI);
            _allowedParents              .setDefinedIn(this);

            _altType                     .setDescription("The altType indicates an alternate type for a value. For instance when dealing with NameContainers, the value interface is obviously NameContainer, but the secret sauce of NameContainers is that they also take any DmcObjectName derivative. Specifying the altType on the NameContainer TypeDefinition allows for generation of  the DmcObjectName interface as well.");
            _altType                     .setDmdID("108");
            _altType                     .setName("altType");
            _altType                     .setType(_String);
            _altType                     .setDefinedIn(this);

            _altTypeImport               .setDescription("An additional import (if required) by the altType attribute value.");
            _altTypeImport               .setDmdID("109");
            _altTypeImport               .setName("altTypeImport");
            _altTypeImport               .setType(_String);
            _altTypeImport               .setDefinedIn(this);

            _attachToClass               .setDescription("Indicates the classes of object to which an action is to be attached. This mechanism allows for the extension of a class's behaviour without having to alter the schema of the class involved. This can be viewed as the auxiliary class equivalent for behaviour.");
            _attachToClass               .setDmdID("65");
            _attachToClass               .setName("attachToClass");
            _attachToClass               .setType(_ClassDefinitionREF);
            _attachToClass               .setValueType(ValueTypeEnum.MULTI);
            _attachToClass               .setDefinedIn(this);

            _attributeDefList            .setDescription("A list of attribute definition references.");
            _attributeDefList            .setDmdID("59");
            _attributeDefList            .setInternalUse("true");
            _attributeDefList            .setName("attributeDefList");
            _attributeDefList            .setType(_AttributeDefinitionREF);
            _attributeDefList            .setValueType(ValueTypeEnum.MULTI);
            _attributeDefList            .setDefinedIn(this);

            _attributeValidatorDefList   .setDescription("A list of attribute validator definition references.");
            _attributeValidatorDefList   .setDmdID("114");
            _attributeValidatorDefList   .setInternalUse("true");
            _attributeValidatorDefList   .setName("attributeValidatorDefList");
            _attributeValidatorDefList   .setType(_AttributeValidatorDefinitionREF);
            _attributeValidatorDefList   .setValueType(ValueTypeEnum.MULTI);
            _attributeValidatorDefList   .setDefinedIn(this);

            _baseType                    .setDescription("The broad base type of the data.");
            _baseType                    .setDmdID("135");
            _baseType                    .setName("baseType");
            _baseType                    .setType(_BaseTypeEnumREF);
            _baseType                    .setDefinedIn(this);

            _blockWhenLocked             .setDescription("This flag indicates whether or not an Action will be blocked from proceeding if there is a DAF lock on the object against which the action is performed. The default is to block all incoming actions against a locked object. By setting this flag to false, you can allow an action to proceed.");
            _blockWhenLocked             .setDmdID("71");
            _blockWhenLocked             .setName("blockWhenLocked");
            _blockWhenLocked             .setType(_Boolean);
            _blockWhenLocked             .setDefinedIn(this);

            _camelCaseName               .setDescription("The camelCaseName attribute is used to store a single camelCase format name for something. The name starts with a single letter and can be followed by a mix of letters and numbers. No spaces or  other characters are allowed.");
            _camelCaseName               .setDesignatedNameAttribute("true");
            _camelCaseName               .setDmdID("116");
            _camelCaseName               .setName("camelCaseName");
            _camelCaseName               .setType(_CamelCaseName);
            _camelCaseName               .setDefinedIn(this);

            _classDefList                .setDescription("A list of class definition references.");
            _classDefList                .setDmdID("55");
            _classDefList                .setInternalUse("true");
            _classDefList                .setName("classDefList");
            _classDefList                .setType(_ClassDefinitionREF);
            _classDefList                .setValueType(ValueTypeEnum.MULTI);
            _classDefList                .setDefinedIn(this);

            _classFilter                 .setDescription("The classFilter is used to performing matching of objects based on their class or auxiliary classes.");
            _classFilter                 .setDesignatedFilterAttribute("true");
            _classFilter                 .setDmdID("128");
            _classFilter                 .setName("classFilter");
            _classFilter                 .setType(_ClassFilter);
            _classFilter                 .setDefinedIn(this);

            _classType                   .setDescription("This attribute indicates the type of a class definition.");
            _classType                   .setDmdID("10");
            _classType                   .setName("classType");
            _classType                   .setType(_ClassTypeEnumREF);
            _classType                   .setDefinedIn(this);

            _complexTypeDefList          .setDescription("A list of complex type definition references.");
            _complexTypeDefList          .setDmdID("117");
            _complexTypeDefList          .setInternalUse("true");
            _complexTypeDefList          .setName("complexTypeDefList");
            _complexTypeDefList          .setType(_ComplexTypeDefinitionREF);
            _complexTypeDefList          .setValueType(ValueTypeEnum.MULTI);
            _complexTypeDefList          .setDefinedIn(this);

            _createAttributeFactory      .setDescription("When specified as true on a SchemaDefinition, the DMO generation utility will create a free standing AttributeFactory for the schema. This allows for the creation of attributes taht can then be embedded in complex objects and properly serialized/deserialized.");
            _createAttributeFactory      .setDmdID("89");
            _createAttributeFactory      .setName("createAttributeFactory");
            _createAttributeFactory      .setType(_Boolean);
            _createAttributeFactory      .setDefinedIn(this);

            _dataType                    .setDescription("This attribute indicates the persistence characteristics of an attribute or class of object. How this information is used is application dependent.");
            _dataType                    .setDmdID("11");
            _dataType                    .setName("dataType");
            _dataType                    .setType(_DataTypeEnumREF);
            _dataType                    .setDefinedIn(this);

            _defFiles                    .setDescription("A list of files that contain the class, attribute and type definitions that comprise a schema.");
            _defFiles                    .setDmdID("68");
            _defFiles                    .setName("defFiles");
            _defFiles                    .setType(_String);
            _defFiles                    .setValueType(ValueTypeEnum.MULTI);
            _defFiles                    .setDefinedIn(this);

            _definedIn                   .setDescription("Indicates the schema in which a type, attribute or class is defined.");
            _definedIn                   .setDmdID("61");
            _definedIn                   .setInternalUse("true");
            _definedIn                   .setName("definedIn");
            _definedIn                   .setType(_SchemaDefinitionREF);
            _definedIn                   .setDefinedIn(this);

            _dependsOn                   .setDescription("A list of schema names.");
            _dependsOn                   .setDmdID("66");
            _dependsOn                   .setName("dependsOn");
            _dependsOn                   .setType(_String);
            _dependsOn                   .setValueType(ValueTypeEnum.MULTI);
            _dependsOn                   .setDefinedIn(this);

            _dependsOnRef                .setDescription("A list of schema references that are based on the contents of the dependsOn attribute.");
            _dependsOnRef                .setDmdID("67");
            _dependsOnRef                .setInternalUse("true");
            _dependsOnRef                .setName("dependsOnRef");
            _dependsOnRef                .setType(_SchemaDefinitionREF);
            _dependsOnRef                .setValueType(ValueTypeEnum.MULTI);
            _dependsOnRef                .setDefinedIn(this);

            _dependsOnSchema             .setDescription("Indicates the schema(s) on which something depends.");
            _dependsOnSchema             .setDmdID("120");
            _dependsOnSchema             .setName("dependsOnSchema");
            _dependsOnSchema             .setType(_String);
            _dependsOnSchema             .setValueType(ValueTypeEnum.MULTI);
            _dependsOnSchema             .setDefinedIn(this);

            _derivedClasses              .setDescription("Indicates the classes that are known to be derived from this class.");
            _derivedClasses              .setDmdID("25");
            _derivedClasses              .setName("derivedClasses");
            _derivedClasses              .setType(_ClassDefinitionREF);
            _derivedClasses              .setValueType(ValueTypeEnum.MULTI);
            _derivedClasses              .setDefinedIn(this);

            _derivedFrom                 .setDescription("Indicates the abstract or structural class from which this class is derived.");
            _derivedFrom                 .setDmdID("21");
            _derivedFrom                 .setName("derivedFrom");
            _derivedFrom                 .setType(_ClassDefinitionREF);
            _derivedFrom                 .setDefinedIn(this);

            _description                 .setDescription("The description attribute is used to provide descriptive documentation for schema related definitions. The description is of type XHMTLString which is basically an XML formatted fragment that conforms to the XHTML 1.0 specification. For more information, see the DmdTypeDef for XHTMLString.");
            _description                 .setDmdID("18");
            _description                 .setName("description");
            _description                 .setType(_String);
            _description                 .setDefinedIn(this);

            _designatedFilterAttribute   .setDescription("The designatedFilterAttribute flag is used to identify the attribute designated as the standard wrapper for filters of a particular type.  One, and only one, attribute definition can be the designatedFilterAttribute for a  TypeDefinition that is identified as isFilterType.");
            _designatedFilterAttribute   .setDmdID("126");
            _designatedFilterAttribute   .setName("designatedFilterAttribute");
            _designatedFilterAttribute   .setType(_Boolean);
            _designatedFilterAttribute   .setDefinedIn(this);

            _designatedNameAttribute     .setDescription("The designatedNameAttribute flag is used to identify the attribute designated as the standard wrapper for names of a particular type. One, and only one, attribute definition can be the designatedNameAttribute for a TypeDefinition that has isNameType true.");
            _designatedNameAttribute     .setDmdID("102");
            _designatedNameAttribute     .setName("designatedNameAttribute");
            _designatedNameAttribute     .setType(_Boolean);
            _designatedNameAttribute     .setDefinedIn(this);

            _dmdID                       .setDescription("The dmdID attribute is used to store a unique Dark Matter Definition ID for attributes. This is used as part of the serialization mechanisms built into Dark Matter Objects.");
            _dmdID                       .setDmdID("3");
            _dmdID                       .setName("dmdID");
            _dmdID                       .setType(_Integer);
            _dmdID                       .setDefinedIn(this);

            _dmeClass                    .setDescription("This attribute indicates just the Dark Matter Extended (DME) class name.");
            _dmeClass                    .setDmdID("44");
            _dmeClass                    .setInternalUse("true");
            _dmeClass                    .setName("dmeClass");
            _dmeClass                    .setType(_String);
            _dmeClass                    .setDefinedIn(this);

            _dmeImport                   .setDescription("This attribute indicates the full name of the class that extends a DMW class. Dark Matter Extended (DME).");
            _dmeImport                   .setDmdID("43");
            _dmeImport                   .setInternalUse("true");
            _dmeImport                   .setName("dmeImport");
            _dmeImport                   .setType(_String);
            _dmeImport                   .setDefinedIn(this);

            _dmoAuxClass                 .setDescription("This attribute indicates just the DMO class name e.g. MyClassAUXDMO");
            _dmoAuxClass                 .setDmdID("37");
            _dmoAuxClass                 .setInternalUse("true");
            _dmoAuxClass                 .setName("dmoAuxClass");
            _dmoAuxClass                 .setType(_String);
            _dmoAuxClass                 .setDefinedIn(this);

            _dmoAuxClassImport           .setDescription("This attribute indicates the full name of the MyClassAUXDMO class");
            _dmoAuxClassImport           .setDmdID("38");
            _dmoAuxClassImport           .setInternalUse("true");
            _dmoAuxClassImport           .setName("dmoAuxClassImport");
            _dmoAuxClassImport           .setType(_String);
            _dmoAuxClassImport           .setDefinedIn(this);

            _dmoClass                    .setDescription("This attribute indicates just the DMO class name e.g. MyClassDMO");
            _dmoClass                    .setDmdID("36");
            _dmoClass                    .setInternalUse("true");
            _dmoClass                    .setName("dmoClass");
            _dmoClass                    .setType(_String);
            _dmoClass                    .setDefinedIn(this);

            _dmoImport                   .setDescription("This attribute indicates the full name of the generated Dark Matter Object (DMO) class (including package) that is generated for this class. The class will always have DmcObject at the top of its derivation hierarchy.");
            _dmoImport                   .setDmdID("35");
            _dmoImport                   .setInternalUse("true");
            _dmoImport                   .setName("dmoImport");
            _dmoImport                   .setType(_String);
            _dmoImport                   .setDefinedIn(this);

            _dmtClass                    .setDescription("This attribute indicates just the DmcType class name.");
            _dmtClass                    .setDmdID("46");
            _dmtClass                    .setInternalUse("true");
            _dmtClass                    .setName("dmtClass");
            _dmtClass                    .setType(_String);
            _dmtClass                    .setDefinedIn(this);

            _dmtImport                   .setDescription("This attribute indicates the full name of the DmcType class used to reference a class. These types are auto generated and named DmcType<classname>REF.");
            _dmtImport                   .setDmdID("45");
            _dmtImport                   .setInternalUse("true");
            _dmtImport                   .setName("dmtImport");
            _dmtImport                   .setType(_String);
            _dmtImport                   .setDefinedIn(this);

            _dmtREFImport                .setDescription("This attribute indicates the full name of the class used to reference a class. These types are auto generated and named <classname>REF.");
            _dmtREFImport                .setDmdID("93");
            _dmtREFImport                .setInternalUse("true");
            _dmtREFImport                .setName("dmtREFImport");
            _dmtREFImport                .setType(_String);
            _dmtREFImport                .setDefinedIn(this);

            _dmwAuxClass                 .setDescription("This attribute indicates just the DMO class name e.g. MyClassAUX");
            _dmwAuxClass                 .setDmdID("39");
            _dmwAuxClass                 .setInternalUse("true");
            _dmwAuxClass                 .setName("dmwAuxClass");
            _dmwAuxClass                 .setType(_String);
            _dmwAuxClass                 .setDefinedIn(this);

            _dmwAuxClassImport           .setDescription("This attribute indicates the full name of the MyClassAUX class");
            _dmwAuxClassImport           .setDmdID("40");
            _dmwAuxClassImport           .setInternalUse("true");
            _dmwAuxClassImport           .setName("dmwAuxClassImport");
            _dmwAuxClassImport           .setType(_String);
            _dmwAuxClassImport           .setDefinedIn(this);

            _dmwClass                    .setDescription("This attribute indicates just the DMW class name, eg MyClassDMW");
            _dmwClass                    .setDmdID("42");
            _dmwClass                    .setInternalUse("true");
            _dmwClass                    .setName("dmwClass");
            _dmwClass                    .setType(_String);
            _dmwClass                    .setDefinedIn(this);

            _dmwImport                   .setDescription("This attribute indicates the full name of the generated Dark Matter Wrapper (DMW) class (including package) that is wrapped by this class. The class will always be a derived class of DmwWrapperBase.");
            _dmwImport                   .setDmdID("41");
            _dmwImport                   .setInternalUse("true");
            _dmwImport                   .setName("dmwImport");
            _dmwImport                   .setType(_String);
            _dmwImport                   .setDefinedIn(this);

            _dmwIteratorClass            .setDescription("This attribute indicates just the DmcContainerIterator name for a class of object.");
            _dmwIteratorClass            .setDmdID("92");
            _dmwIteratorClass            .setInternalUse("true");
            _dmwIteratorClass            .setName("dmwIteratorClass");
            _dmwIteratorClass            .setType(_String);
            _dmwIteratorClass            .setDefinedIn(this);

            _dmwIteratorImport           .setDescription("This attribute indicates the full name of the DmcContainerIterator  derived class that allows us to iterate over a set of object references and get back the DMW wrapper object instead of the DMO.");
            _dmwIteratorImport           .setDmdID("91");
            _dmwIteratorImport           .setInternalUse("true");
            _dmwIteratorImport           .setName("dmwIteratorImport");
            _dmwIteratorImport           .setType(_String);
            _dmwIteratorImport           .setDefinedIn(this);

            _dmwPackage                  .setDescription("Indicates the package where server related Dark Matter Wrapper classes  were generated for this schema. This is used when we're generating derived wrapper classes.");
            _dmwPackage                  .setDmdID("54");
            _dmwPackage                  .setName("dmwPackage");
            _dmwPackage                  .setType(_String);
            _dmwPackage                  .setDefinedIn(this);

            _dmwTypeToPackage            .setDescription("The dmwTypeToPackage attribute is used to indicate alternative generation packages for the Dark Matter Wrapper (DMW) code generation mechanisms. For instance, if we  want to generate GXT wrappers for use with Sencha's GXT model classes, we could specify dmwTypeToPackage gxt com.example.client. Each of schemas that's loaded for generation would have to have this same attribute specified so that, if there were derived classes across schemas, the appropriate wrapper derivations could be determined. See the ClassDefintion.adjustClass() method to see how this is used.");
            _dmwTypeToPackage            .setDmdID("123");
            _dmwTypeToPackage            .setName("dmwTypeToPackage");
            _dmwTypeToPackage            .setType(_StringToString);
            _dmwTypeToPackage            .setValueType(ValueTypeEnum.MULTI);
            _dmwTypeToPackage            .setDefinedIn(this);

            _dmwWrapperType              .setDescription("The dmwWrapperType is used to indicate whether or not you want extended wrappers when the wrappers are generated for an object in a particular generation context.");
            _dmwWrapperType              .setDmdID("124");
            _dmwWrapperType              .setName("dmwWrapperType");
            _dmwWrapperType              .setType(_DmwTypeToWrapperType);
            _dmwWrapperType              .setValueType(ValueTypeEnum.MULTI);
            _dmwWrapperType              .setDefinedIn(this);

            _dotName                     .setDescription("The dotName attribute is used to store dot separated names.");
            _dotName                     .setDesignatedNameAttribute("true");
            _dotName                     .setDmdID("107");
            _dotName                     .setName("dotName");
            _dotName                     .setType(_DotName);
            _dotName                     .setDefinedIn(this);

            _enumDefList                 .setDescription("A list of EnumDefinitions.");
            _enumDefList                 .setDmdID("58");
            _enumDefList                 .setInternalUse("true");
            _enumDefList                 .setName("enumDefList");
            _enumDefList                 .setType(_EnumDefinitionREF);
            _enumDefList                 .setValueType(ValueTypeEnum.MULTI);
            _enumDefList                 .setDefinedIn(this);

            _enumInt                     .setDescription("The integer value associated with an enumeration value.");
            _enumInt                     .setDmdID("69");
            _enumInt                     .setName("enumInt");
            _enumInt                     .setType(_Integer);
            _enumInt                     .setDefinedIn(this);

            _enumName                    .setDescription("The original name of an enum as referred to in the internally generated type for enums.");
            _enumName                    .setDmdID("99");
            _enumName                    .setName("enumName");
            _enumName                    .setType(_String);
            _enumName                    .setDefinedIn(this);

            _enumString                  .setDescription("The string value associated with an enumeration value.");
            _enumString                  .setDmdID("70");
            _enumString                  .setName("enumString");
            _enumString                  .setType(_String);
            _enumString                  .setDefinedIn(this);

            _enumValue                   .setDescription("Indicates the set of enum values associated with an enumeration type definition.");
            _enumValue                   .setDmdID("33");
            _enumValue                   .setName("enumValue");
            _enumValue                   .setType(_EnumValue);
            _enumValue                   .setValueType(ValueTypeEnum.MULTI);
            _enumValue                   .setDefinedIn(this);

            _excludeFromContext          .setDescription("The excludeFromContext attribute is used to indicate that a class of object (and all of its derivatives) should be excluded from the wrapper generation for the specified context. An example usage is in the Dark Matter Protocol where we don't want to generate wrappers for the message objects in a GXT context.");
            _excludeFromContext          .setDmdID("130");
            _excludeFromContext          .setName("excludeFromContext");
            _excludeFromContext          .setType(_String);
            _excludeFromContext          .setValueType(ValueTypeEnum.MULTI);
            _excludeFromContext          .setDefinedIn(this);

            _extendedClass               .setDescription("The extendedClass indicates the fully qualified name of the class that is derived from the generated ComplexType to provide additional behaviour.");
            _extendedClass               .setDmdID("106");
            _extendedClass               .setName("extendedClass");
            _extendedClass               .setType(_String);
            _extendedClass               .setDefinedIn(this);

            _extendedReferenceClass      .setDescription("Indicates the class of object to which an  ExtendedReferenceTypeDefinition refers.");
            _extendedReferenceClass      .setDmdID("131");
            _extendedReferenceClass      .setName("extendedReferenceClass");
            _extendedReferenceClass      .setType(_ClassDefinitionREF);
            _extendedReferenceClass      .setDefinedIn(this);

            _extendedReferenceTypeDefList.setDescription("A list of extended reference type definition references.");
            _extendedReferenceTypeDefList.setDmdID("132");
            _extendedReferenceTypeDefList.setInternalUse("true");
            _extendedReferenceTypeDefList.setName("extendedReferenceTypeDefList");
            _extendedReferenceTypeDefList.setType(_ExtendedReferenceTypeDefinitionREF);
            _extendedReferenceTypeDefList.setValueType(ValueTypeEnum.MULTI);
            _extendedReferenceTypeDefList.setDefinedIn(this);

            _extendsInterface            .setDescription("Indicates the fully qualifed name of an interface that an interface extends.");
            _extendsInterface            .setDmdID("119");
            _extendsInterface            .setName("extendsInterface");
            _extendsInterface            .setType(_String);
            _extendsInterface            .setValueType(ValueTypeEnum.MULTI);
            _extendsInterface            .setDefinedIn(this);

            _field                       .setDescription("The field indicates a type and name for a field in a ComplexType.");
            _field                       .setDmdID("105");
            _field                       .setName("field");
            _field                       .setType(_Field);
            _field                       .setValueType(ValueTypeEnum.MULTI);
            _field                       .setDefinedIn(this);

            _fieldSeparator              .setDescription("The fieldSeparator is used to indicate the separation character used when a ComplexType is represented as a String. If a fieldSeparator isn't specified, it is assumed to be a space.");
            _fieldSeparator              .setDmdID("104");
            _fieldSeparator              .setName("fieldSeparator");
            _fieldSeparator              .setType(_String);
            _fieldSeparator              .setDefinedIn(this);

            _file                        .setDescription("Indicates the file from which a definition was loaded.");
            _file                        .setDmdID("74");
            _file                        .setInternalUse("true");
            _file                        .setName("file");
            _file                        .setType(_String);
            _file                        .setDefinedIn(this);

            _filterAttributeDef          .setDescription("The filterAttributeDef is a reference to the attribute that is locked to a TypeDefinition that is flagged as filterType. This mechanism is used to create the correct type of DmcType[FILTERTYPE]SV derivative for a value of type DmcFilter.");
            _filterAttributeDef          .setDmdID("127");
            _filterAttributeDef          .setName("filterAttributeDef");
            _filterAttributeDef          .setType(_AttributeDefinitionREF);
            _filterAttributeDef          .setDefinedIn(this);

            _generatedFileHeader         .setDescription("The name of file that coresides with the schema.dms file that contains a common header to be applied to all generated code. For instance, you might want a common licensing comment at the top of your generated files.");
            _generatedFileHeader         .setDmdID("81");
            _generatedFileHeader         .setName("generatedFileHeader");
            _generatedFileHeader         .setType(_String);
            _generatedFileHeader         .setDefinedIn(this);

            _genericArgs                 .setDescription("This attribute indicates the generic arguments to be supplied in the use of a class in an autogenerated Iterable.");
            _genericArgs                 .setDmdID("94");
            _genericArgs                 .setName("genericArgs");
            _genericArgs                 .setType(_String);
            _genericArgs                 .setDefinedIn(this);

            _genericArgsImport           .setDescription("Indicates the import required to support a genericArgs specification i.e. if you're not specifying something like <?>, an additional import may be required.");
            _genericArgsImport           .setDmdID("98");
            _genericArgsImport           .setName("genericArgsImport");
            _genericArgsImport           .setType(_String);
            _genericArgsImport           .setDefinedIn(this);

            _getMethod                   .setDescription("If you want to return a value other than the native value class, use the appropriate getType and specify the method you need to call on the DmdValue derived class to return it.");
            _getMethod                   .setDmdID("49");
            _getMethod                   .setName("getMethod");
            _getMethod                   .setType(_String);
            _getMethod                   .setDefinedIn(this);

            _getType                     .setDescription("Indicates the type of value that will be returned when an attribute value is returned for a type definition; a type definition defines only one get type. This must be a Java class reference and not a primitive type e.g. int.");
            _getType                     .setDmdID("48");
            _getType                     .setName("getType");
            _getType                     .setType(_String);
            _getType                     .setDefinedIn(this);

            _helperClassName             .setDescription("This attribute indicates the full name of the generated helper class for  object references i.e. if you had a ClassDefinition X, the framework generates a  types/XREF class which is subsequently used by the DmcTypeXREF class to store references to objects of the defined class.");
            _helperClassName             .setDmdID("47");
            _helperClassName             .setInternalUse("true");
            _helperClassName             .setName("helperClassName");
            _helperClassName             .setType(_String);
            _helperClassName             .setDefinedIn(this);

            _indexSize                   .setDescription("The indexSize is used in conjunction with the MULTI valueType to indicate that the attribute may have the specified number of values and is integer indexed. Indexed attributes may be thought of as having a predetermined number of slots into which values may be stored. When indexed, an attribute has values added to it using the setMVnth() interface, not the usual add() interface. If you attempt to use add() with an indexed attribute, an exception will be thrown.");
            _indexSize                   .setDmdID("129");
            _indexSize                   .setName("indexSize");
            _indexSize                   .setType(_Integer);
            _indexSize                   .setDefinedIn(this);

            _integerName                 .setDescription("The object name for objects uniquely identified with an integer.");
            _integerName                 .setDesignatedNameAttribute("true");
            _integerName                 .setDmdID("100");
            _integerName                 .setName("integerName");
            _integerName                 .setType(_IntegerName);
            _integerName                 .setDefinedIn(this);

            _intendedToExtend            .setDescription("This attribute can be used on AUXILIARY classes to give a hint about their intended usage. For example, if you were extending schema definitions with some or your  own attributes for some purpose, your auxliary class could have intendedToExtend ClassDefinition.");
            _intendedToExtend            .setDmdID("22");
            _intendedToExtend            .setName("intendedToExtend");
            _intendedToExtend            .setType(_ClassDefinitionREF);
            _intendedToExtend            .setValueType(ValueTypeEnum.MULTI);
            _intendedToExtend            .setDefinedIn(this);

            _internalTypeDefList         .setDescription("A list of type definitions that were generated internally to represent enums and object references.");
            _internalTypeDefList         .setDmdID("57");
            _internalTypeDefList         .setInternalUse("true");
            _internalTypeDefList         .setName("internalTypeDefList");
            _internalTypeDefList         .setType(_TypeDefinitionREF);
            _internalTypeDefList         .setValueType(ValueTypeEnum.MULTI);
            _internalTypeDefList         .setDefinedIn(this);

            _internalTypeRef             .setDescription("Indicates the internal type that's generated for all ClassDefinitions. This is set automatically on ClassDefinitions as they are parsed.");
            _internalTypeRef             .setDmdID("20");
            _internalTypeRef             .setInternalUse("true");
            _internalTypeRef             .setName("internalTypeRef");
            _internalTypeRef             .setType(_TypeDefinitionREF);
            _internalTypeRef             .setDefinedIn(this);

            _internalUse                 .setDescription("Indicates if an attribute is used and set within the Dark Matter Data code generation mechanisms. In the documentation generation code, attributes marked as internalUse WILL NOT be displayed unless you set the -internalUse flag is indicated.");
            _internalUse                 .setDmdID("122");
            _internalUse                 .setName("internalUse");
            _internalUse                 .setType(_Boolean);
            _internalUse                 .setDefinedIn(this);

            _internallyGenerated         .setDescription("This flag indicates if the associated definition was internally generated. This is the case for TypeDefinitions generated for ClassDefinitions and EnumDefinitions that allow for references to these objects.");
            _internallyGenerated         .setDmdID("77");
            _internallyGenerated         .setInternalUse("true");
            _internallyGenerated         .setName("internallyGenerated");
            _internallyGenerated         .setType(_Boolean);
            _internallyGenerated         .setDefinedIn(this);

            _isDefaultValue              .setDescription("This flag is set to true to indicate the default value for a type (e.g. an enum).");
            _isDefaultValue              .setDmdID("17");
            _isDefaultValue              .setName("isDefaultValue");
            _isDefaultValue              .setType(_Boolean);
            _isDefaultValue              .setDefinedIn(this);

            _isEnumType                  .setDescription("This flag is set to true for type definitions that define eneumerations.");
            _isEnumType                  .setDmdID("16");
            _isEnumType                  .setInternalUse("true");
            _isEnumType                  .setName("isEnumType");
            _isEnumType                  .setType(_Boolean);
            _isEnumType                  .setDefinedIn(this);

            _isExtendedRefType           .setDescription("This flag is used to indicate taht an internally generated type is an extended reference type.");
            _isExtendedRefType           .setDmdID("133");
            _isExtendedRefType           .setInternalUse("true");
            _isExtendedRefType           .setName("isExtendedRefType");
            _isExtendedRefType           .setType(_Boolean);
            _isExtendedRefType           .setDefinedIn(this);

            _isExtensible                .setDescription("Indicates whether or not the ClassDefinition associated with a RuleDefinition has classType EXTENSIBLE or not. This mechanism is useful in situations where the exact set of attributes associated with a rule must be flexible. The best example is the InitRule where any set of attributes can be specified as value for the rule.");
            _isExtensible                .setDmdID("142");
            _isExtensible                .setName("isExtensible");
            _isExtensible                .setType(_Boolean);
            _isExtensible                .setDefinedIn(this);

            _isFilterType                .setDescription("Indicates that a type is derived from DmcFilter.");
            _isFilterType                .setDmdID("125");
            _isFilterType                .setName("isFilterType");
            _isFilterType                .setType(_Boolean);
            _isFilterType                .setDefinedIn(this);

            _isGetAction                 .setDescription("This flag indicates if an Action is merely a data retrieval (get) Action. Actions that are flagged with this attribute set to true will be executable even when the server is in a read-only mode because they don't actually alter data. One example of this is the getAllowedOperations() action on the SecurityBranch.");
            _isGetAction                 .setDmdID("72");
            _isGetAction                 .setName("isGetAction");
            _isGetAction                 .setType(_Boolean);
            _isGetAction                 .setDefinedIn(this);

            _isHierarchicName            .setDescription("Indicates if a name type is for hierarchic objects.");
            _isHierarchicName            .setDmdID("121");
            _isHierarchicName            .setInternalUse("true");
            _isHierarchicName            .setName("isHierarchicName");
            _isHierarchicName            .setType(_Boolean);
            _isHierarchicName            .setDefinedIn(this);

            _isNameType                  .setDescription("This attribute indicates if a defined type is used for naming purposes. This allows us to automatically add attributes of this type to the AttributeFactories.");
            _isNameType                  .setDmdID("95");
            _isNameType                  .setName("isNameType");
            _isNameType                  .setType(_Boolean);
            _isNameType                  .setDefinedIn(this);

            _isNamedBy                   .setDescription("Indicates the attribute by which an object of some class is named. When this attribute is supplied in a ClassDefinition, the generated DMO class will indicate that it implements the DmcNamedObjectIF and its getObjectName() method will return the value of the isNamedBy attribute.");
            _isNamedBy                   .setDmdID("80");
            _isNamedBy                   .setName("isNamedBy");
            _isNamedBy                   .setType(_AttributeDefinitionREF);
            _isNamedBy                   .setDefinedIn(this);

            _isRefType                   .setDescription("This flag is set to true for type definitions that refer to other objects.");
            _isRefType                   .setDmdID("14");
            _isRefType                   .setInternalUse("true");
            _isRefType                   .setName("isRefType");
            _isRefType                   .setType(_Boolean);
            _isRefType                   .setDefinedIn(this);

            _isSchemaRtype               .setDescription("This flag is set to true for type definitions that refer to other schema-related definitions.");
            _isSchemaRtype               .setDmdID("15");
            _isSchemaRtype               .setInternalUse("true");
            _isSchemaRtype               .setName("isSchemaRtype");
            _isSchemaRtype               .setType(_Boolean);
            _isSchemaRtype               .setDefinedIn(this);

            _isTransportable             .setDescription("This attribute indicates whether or not the object defined by a ClassDefinition is meant to be transportable across an RPC interface when object reference attributes refer to it. If set to true, the class will automatically have its reference type use the DmcNameObjectTransportableREF as its base. Otherwise, it will use DmcNameObjectNotransportableREF.");
            _isTransportable             .setDmdID("79");
            _isTransportable             .setInternalUse("true");
            _isTransportable             .setName("isTransportable");
            _isTransportable             .setType(_Boolean);
            _isTransportable             .setDefinedIn(this);

            _javaClass                   .setDescription("This attribute indicates the full name of the class (including package) that should be instantiated when an instance of an object is created via the DmdClassDef.newInstance() function. The class must be a derived class of DmdGenericObject.");
            _javaClass                   .setDmdID("34");
            _javaClass                   .setInternalUse("true");
            _javaClass                   .setName("javaClass");
            _javaClass                   .setType(_String);
            _javaClass                   .setDefinedIn(this);

            _javaPackage                 .setDescription("The package to be imported when using a particular value type.");
            _javaPackage                 .setDmdID("52");
            _javaPackage                 .setName("javaPackage");
            _javaPackage                 .setType(_String);
            _javaPackage                 .setDefinedIn(this);

            _keyClass                    .setDescription("This attribute indicates the class of the key used for types that support storage in a MAP.");
            _keyClass                    .setDmdID("96");
            _keyClass                    .setName("keyClass");
            _keyClass                    .setType(_String);
            _keyClass                    .setDefinedIn(this);

            _keyImport                   .setDescription("Indicates the import for a keyClass. this is required if the keyClass is NOT a primitive java type e.g. Integer, String etc.");
            _keyImport                   .setDmdID("97");
            _keyImport                   .setName("keyImport");
            _keyImport                   .setType(_String);
            _keyImport                   .setDefinedIn(this);

            _lineNumber                  .setDescription("Indicates the line number of the file from which a definition was loaded.");
            _lineNumber                  .setDmdID("75");
            _lineNumber                  .setInternalUse("true");
            _lineNumber                  .setName("lineNumber");
            _lineNumber                  .setType(_Integer);
            _lineNumber                  .setDefinedIn(this);

            _longName                    .setDescription("The object name for objects uniquely identified with a long.");
            _longName                    .setDesignatedNameAttribute("true");
            _longName                    .setDmdID("134");
            _longName                    .setName("longName");
            _longName                    .setType(_LongName);
            _longName                    .setDefinedIn(this);

            _may                         .setDescription("Indicates the set of attributes that an instance of a class MAY have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
            _may                         .setDmdID("27");
            _may                         .setName("may");
            _may                         .setType(_AttributeDefinitionREF);
            _may                         .setValueType(ValueTypeEnum.MULTI);
            _may                         .setDefinedIn(this);

            _mayParm                     .setDescription("Indicates the set of parameters that an action MAY have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
            _mayParm                     .setDmdID("29");
            _mayParm                     .setName("mayParm");
            _mayParm                     .setType(_AttributeDefinitionREF);
            _mayParm                     .setValueType(ValueTypeEnum.MULTI);
            _mayParm                     .setDefinedIn(this);

            _mayReturn                   .setDescription("Indicates the set of return vals that may be returned as part of a particular action response message.");
            _mayReturn                   .setDmdID("31");
            _mayReturn                   .setName("mayReturn");
            _mayReturn                   .setType(_AttributeDefinitionREF);
            _mayReturn                   .setValueType(ValueTypeEnum.MULTI);
            _mayReturn                   .setDefinedIn(this);

            _maySendProgress             .setDescription("This flag is used to indicate if a particular request might result in progress indications being sent. Although primarily intended as a documentation aspect, this flag is used within the TL1 subsystem to allow for the creation of a response handler for node requests that send progress text.");
            _maySendProgress             .setDmdID("76");
            _maySendProgress             .setName("maySendProgress");
            _maySendProgress             .setType(_Boolean);
            _maySendProgress             .setDefinedIn(this);

            _modify                      .setDescription("A set of modifications to an object.");
            _modify                      .setDmdID("85");
            _modify                      .setName("modify");
            _modify                      .setType(_Modifier);
            _modify                      .setValueType(ValueTypeEnum.MULTI);
            _modify                      .setDefinedIn(this);

            _must                        .setDescription("Indicates the set of attributes that an instance of a class MUST have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
            _must                        .setDmdID("26");
            _must                        .setName("must");
            _must                        .setType(_AttributeDefinitionREF);
            _must                        .setValueType(ValueTypeEnum.MULTI);
            _must                        .setDefinedIn(this);

            _mustParm                    .setDescription("Indicates the set of parameters that an action MUST have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
            _mustParm                    .setDmdID("28");
            _mustParm                    .setName("mustParm");
            _mustParm                    .setType(_AttributeDefinitionREF);
            _mustParm                    .setValueType(ValueTypeEnum.MULTI);
            _mustParm                    .setDefinedIn(this);

            _mustReturn                  .setDescription("Indicates the set of return vals that must be returned as part of a particular action response message.");
            _mustReturn                  .setDmdID("30");
            _mustReturn                  .setName("mustReturn");
            _mustReturn                  .setType(_AttributeDefinitionREF);
            _mustReturn                  .setValueType(ValueTypeEnum.MULTI);
            _mustReturn                  .setDefinedIn(this);

            _name                        .setDescription("The name attribute is used to store a single string token that represents a unique name for an object. A name should be composed of characters in the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All names must start with a character.");
            _name                        .setDesignatedNameAttribute("true");
            _name                        .setDmdID("2");
            _name                        .setName("name");
            _name                        .setType(_StringName);
            _name                        .setDefinedIn(this);

            _nameAttributeDef            .setDescription("The nameAttributeDef is a reference to the attribute that is locked to a TypeDefinition. This mechanism is used to create the correct type of DmcType[NAMETYPE]* derivative for a value of type DmcObjectName.");
            _nameAttributeDef            .setDmdID("90");
            _nameAttributeDef            .setName("nameAttributeDef");
            _nameAttributeDef            .setType(_AttributeDefinitionREF);
            _nameAttributeDef            .setDefinedIn(this);

            _namingAttribute             .setDescription("This attribute indicates the attribute that is used to name an object instance. The exact manner in which the naming attribute is used is specific to the implementation of the HierarchicObject derived class. <p> For instance, the DotNamedObject simply uses the value of the naming attribute and separates the attribute values with periods e.g. grandparent.parent.child. <p> For LDAP objects when a hierarchic name is composed for an object, the class name plus the value of the naming attribute (type:value) is used to create the name of an object. It is best if the naming attribute value is created by the application; it shouldn't be based on any user configurable value.");
            _namingAttribute             .setDmdID("64");
            _namingAttribute             .setName("namingAttribute");
            _namingAttribute             .setType(_AttributeDefinitionREF);
            _namingAttribute             .setDefinedIn(this);

            _nullReturnValue             .setDescription("This attribute is used in TypeDefinitions to indicate the value that should be returned when an attribute of the specified type doesn't exist in the object. For example, Boolean values are defined to return false when they aren't actually set on an object. This just gives a convenient mechanism to provide a default value for non-existent attribute values.");
            _nullReturnValue             .setDmdID("7");
            _nullReturnValue             .setName("nullReturnValue");
            _nullReturnValue             .setType(_String);
            _nullReturnValue             .setDefinedIn(this);

            _objectClass                 .setDescription("Used to indicate the classes that an object instance supports.");
            _objectClass                 .setDmdID("1");
            _objectClass                 .setName("objectClass");
            _objectClass                 .setType(_ClassDefinitionREF);
            _objectClass                 .setValueType(ValueTypeEnum.MULTI);
            _objectClass                 .setDefinedIn(this);

            _objectValidatorDefList      .setDescription("A list of object validator definition references.");
            _objectValidatorDefList      .setDmdID("113");
            _objectValidatorDefList      .setInternalUse("true");
            _objectValidatorDefList      .setName("objectValidatorDefList");
            _objectValidatorDefList      .setType(_ObjectValidatorDefinitionREF);
            _objectValidatorDefList      .setValueType(ValueTypeEnum.MULTI);
            _objectValidatorDefList      .setDefinedIn(this);

            _obsoleteVersion             .setDescription("This indicates the version at which something became obsolete. Generally speaking you shouldn't ever delete definitions for products that have been released to the field, this may break backwards compatibility. Instead, you should mark them as obsolete.");
            _obsoleteVersion             .setDmdID("73");
            _obsoleteVersion             .setName("obsoleteVersion");
            _obsoleteVersion             .setType(_String);
            _obsoleteVersion             .setDefinedIn(this);

            _opContext                   .setDescription("Indicates the operational context for some component e.g. object or attribute validators.");
            _opContext                   .setDmdID("115");
            _opContext                   .setName("opContext");
            _opContext                   .setType(_OperationalContextEnumREF);
            _opContext                   .setDefinedIn(this);

            _originalClass               .setDescription("Refers to the class that an internally generated type represents.");
            _originalClass               .setDmdID("83");
            _originalClass               .setInternalUse("true");
            _originalClass               .setName("originalClass");
            _originalClass               .setType(_ClassDefinitionREF);
            _originalClass               .setDefinedIn(this);

            _primitiveType               .setDescription("The primitiveType indicates the underlying type of a DmcType.");
            _primitiveType               .setDmdID("8");
            _primitiveType               .setName("primitiveType");
            _primitiveType               .setType(_String);
            _primitiveType               .setDefinedIn(this);

            _ruleCategory                .setDescription("The category of a rule.");
            _ruleCategory                .setDmdID("139");
            _ruleCategory                .setName("ruleCategory");
            _ruleCategory                .setType(_RuleCategoryREF);
            _ruleCategory                .setValueType(ValueTypeEnum.MULTI);
            _ruleCategory                .setDefinedIn(this);

            _ruleCategoryID              .setDescription("The numeric ID of a rule category.");
            _ruleCategoryID              .setDmdID("140");
            _ruleCategoryID              .setName("ruleCategoryID");
            _ruleCategoryID              .setType(_Integer);
            _ruleCategoryID              .setDefinedIn(this);

            _ruleCategoryList            .setDescription("The RuleCategories defined in a schema.");
            _ruleCategoryList            .setDmdID("143");
            _ruleCategoryList            .setName("ruleCategoryList");
            _ruleCategoryList            .setType(_RuleCategoryREF);
            _ruleCategoryList            .setValueType(ValueTypeEnum.MULTI);
            _ruleCategoryList            .setDefinedIn(this);

            _ruleDefinition              .setDescription("The RuleDefinition that resulted in the creation of an internally generated ClassDefinition.");
            _ruleDefinition              .setDmdID("145");
            _ruleDefinition              .setName("ruleDefinition");
            _ruleDefinition              .setType(_RuleDefinitionREF);
            _ruleDefinition              .setDefinedIn(this);

            _ruleDefinitionList          .setDescription("The RuleDefinitions defined in a schema.");
            _ruleDefinitionList          .setDmdID("144");
            _ruleDefinitionList          .setName("ruleDefinitionList");
            _ruleDefinitionList          .setType(_RuleDefinitionREF);
            _ruleDefinitionList          .setValueType(ValueTypeEnum.MULTI);
            _ruleDefinitionList          .setDefinedIn(this);

            _ruleInterface               .setDescription("The fully qualified name of the interface to be implemented by rules of a particular category.");
            _ruleInterface               .setDmdID("141");
            _ruleInterface               .setName("ruleInterface");
            _ruleInterface               .setType(_String);
            _ruleInterface               .setDefinedIn(this);

            _ruleScope                   .setDescription("The scope of a rule.");
            _ruleScope                   .setDmdID("137");
            _ruleScope                   .setName("ruleScope");
            _ruleScope                   .setType(_RuleScopeEnumREF);
            _ruleScope                   .setDefinedIn(this);

            _ruleTitle                   .setDescription("The title of a rule.");
            _ruleTitle                   .setDmdID("138");
            _ruleTitle                   .setName("ruleTitle");
            _ruleTitle                   .setType(_String);
            _ruleTitle                   .setDefinedIn(this);

            _ruleType                    .setDescription("The type of a rule.");
            _ruleType                    .setDmdID("136");
            _ruleType                    .setName("ruleType");
            _ruleType                    .setType(_RuleTypeEnumREF);
            _ruleType                    .setDefinedIn(this);

            _schemaBaseID                .setDescription("The base identifier value for a schema. This value is added to each dmdID value associated with the AttributeDefinitions defined by the schema. This allows for easy rebasing of identifier values if required.");
            _schemaBaseID                .setDmdID("86");
            _schemaBaseID                .setName("schemaBaseID");
            _schemaBaseID                .setType(_Integer);
            _schemaBaseID                .setDefinedIn(this);

            _schemaExtension             .setDescription("The fully qualified name of a class that extends the schema management capabilities of the SchemaManager. the class must have a zero arg constructor and implement the SchemaExtensionIF.");
            _schemaExtension             .setDmdID("4");
            _schemaExtension             .setName("schemaExtension");
            _schemaExtension             .setType(_String);
            _schemaExtension             .setValueType(ValueTypeEnum.MULTI);
            _schemaExtension             .setDefinedIn(this);

            _schemaIDRange               .setDescription("The maximum number of attribute definitions in a particular schema. This will provide immediate feedback if you exceed the given ID range for your schema.");
            _schemaIDRange               .setDmdID("87");
            _schemaIDRange               .setName("schemaIDRange");
            _schemaIDRange               .setType(_Integer);
            _schemaIDRange               .setDefinedIn(this);

            _schemaPackage               .setDescription("Indicates the package that this schema will be part of when its code is generated using the dafutil tool.");
            _schemaPackage               .setDmdID("53");
            _schemaPackage               .setName("schemaPackage");
            _schemaPackage               .setType(_String);
            _schemaPackage               .setDefinedIn(this);

            _secure                      .setDescription("This attribute indicates whether or not the attribute should be encrypted before being transported over the wire or stored in a file or repository");
            _secure                      .setDmdID("78");
            _secure                      .setName("secure");
            _secure                      .setType(_Boolean);
            _secure                      .setDefinedIn(this);

            _selectAttribute             .setDescription("The selectAttribute indicates an attribute to be used in the definition of a Slice.");
            _selectAttribute             .setDmdID("110");
            _selectAttribute             .setName("selectAttribute");
            _selectAttribute             .setType(_AttributeDefinitionREF);
            _selectAttribute             .setValueType(ValueTypeEnum.MULTI);
            _selectAttribute             .setDefinedIn(this);

            _setType                     .setDescription("Indicates the set interfaces that can be supported by a particular type. The createmeta tool uses this attribute to generate all possible set interfaces for the DmdGenericAttribute.");
            _setType                     .setDmdID("50");
            _setType                     .setName("setType");
            _setType                     .setType(_String);
            _setType                     .setValueType(ValueTypeEnum.MULTI);
            _setType                     .setDefinedIn(this);

            _sliceDefList                .setDescription("A list of slice definition references.");
            _sliceDefList                .setDmdID("111");
            _sliceDefList                .setInternalUse("true");
            _sliceDefList                .setName("sliceDefList");
            _sliceDefList                .setType(_SliceDefinitionREF);
            _sliceDefList                .setValueType(ValueTypeEnum.MULTI);
            _sliceDefList                .setDefinedIn(this);

            _subpackage                  .setDescription("The subpackage beneath extended where generated code will be written. This allows for a hierarchic package structure for the classes generated by the dmg and mvc generator utilities. The structure can contain other subpackages etc x.y.z but should not start or end with a period.");
            _subpackage                  .setDmdID("88");
            _subpackage                  .setName("subpackage");
            _subpackage                  .setType(_String);
            _subpackage                  .setDefinedIn(this);

            _supportsBackrefTracking     .setDescription("Indicates if a class of objects supports back reference tracking or not. The default is that all objects support it, however, in places like the Dark Matter Protocol, we don't want to track references in the messages.");
            _supportsBackrefTracking     .setDmdID("118");
            _supportsBackrefTracking     .setName("supportsBackrefTracking");
            _supportsBackrefTracking     .setNullReturnValue("true");
            _supportsBackrefTracking     .setType(_Boolean);
            _supportsBackrefTracking     .setDefinedIn(this);

            _type                        .setDescription("Indicates the type of an attribute. The value is the name of any previously defined DmdTypeDef definition. When accessed in Java, this is a reference to a DmdTypeDef object.");
            _type                        .setDmdID("19");
            _type                        .setName("type");
            _type                        .setType(_TypeDefinitionREF);
            _type                        .setDefinedIn(this);

            _typeClassName               .setDescription("This is the fully qualified name of the class derived from DmcAttribute that provides management of a particular type of attribute value. For instance, the type class that handles String attributes  is org.dmd.dmc.types.DmcTypeString");
            _typeClassName               .setDmdID("5");
            _typeClassName               .setName("typeClassName");
            _typeClassName               .setType(_String);
            _typeClassName               .setDefinedIn(this);

            _typeDefList                 .setDescription("A list of type definition references.");
            _typeDefList                 .setDmdID("56");
            _typeDefList                 .setInternalUse("true");
            _typeDefList                 .setName("typeDefList");
            _typeDefList                 .setType(_TypeDefinitionREF);
            _typeDefList                 .setValueType(ValueTypeEnum.MULTI);
            _typeDefList                 .setDefinedIn(this);

            _useWrapperType              .setDescription("Indicates whether you want to use the generated DMW wrapper or the extended wrapper you've created yourself.");
            _useWrapperType              .setDmdID("82");
            _useWrapperType              .setName("useWrapperType");
            _useWrapperType              .setType(_WrapperTypeEnumREF);
            _useWrapperType              .setDefinedIn(this);

            _usesInterface               .setDescription("This is a hack for now to allow for the inclusion of an  interface on a class; it should be the fully qualified name of the interface. The interface shouldn't require any method implementations.");
            _usesInterface               .setDmdID("24");
            _usesInterface               .setName("usesInterface");
            _usesInterface               .setType(_String);
            _usesInterface               .setDefinedIn(this);

            _uuidName                    .setDescription("The object name for objects uniquely identified with a UUID.");
            _uuidName                    .setDesignatedNameAttribute("true");
            _uuidName                    .setDmdID("101");
            _uuidName                    .setName("uuidName");
            _uuidName                    .setType(_UUIDName);
            _uuidName                    .setDefinedIn(this);

            _validatorClass              .setDescription("The fully qualified name of an object or attribute validator class.");
            _validatorClass              .setDmdID("112");
            _validatorClass              .setName("validatorClass");
            _validatorClass              .setType(_String);
            _validatorClass              .setDefinedIn(this);

            _valueClass                  .setDescription("The package to be imported when using the values of a particular type definition.");
            _valueClass                  .setDmdID("51");
            _valueClass                  .setName("valueClass");
            _valueClass                  .setType(_String);
            _valueClass                  .setDefinedIn(this);

            _valueType                   .setDescription("This attribute indicates the cardinality and storage mechanism for an attribute.");
            _valueType                   .setDmdID("12");
            _valueType                   .setName("valueType");
            _valueType                   .setType(_ValueTypeEnumREF);
            _valueType                   .setDefinedIn(this);

            _wrapperClassName            .setDescription("This is the fully qualified name of the wrapper class derived from DmcWrapperBase that wraps a DMO. This is used when generating object reference classes associated with ClassDefinitions This actually aligns to the javaClass of the ClassDefinition for which we're generating the reference classes.");
            _wrapperClassName            .setDmdID("6");
            _wrapperClassName            .setInternalUse("true");
            _wrapperClassName            .setName("wrapperClassName");
            _wrapperClassName            .setType(_String);
            _wrapperClassName            .setDefinedIn(this);

            _ActionDefinition            .setClassType(ClassTypeEnum.STRUCTURAL);
            _ActionDefinition            .setDerivedFrom(_DmsDefinition);
            _ActionDefinition            .setDescription("This class is used to define the actions that may be triggered on an object.");
            _ActionDefinition            .setDmdID("11");
            _ActionDefinition            .setDmoImport("org.dmd.dms.generated.dmo.ActionDefinitionDMO");
            _ActionDefinition            .setIsNamedBy(_name);
            _ActionDefinition            .setJavaClass("org.dmd.dms.ActionDefinition");
            _ActionDefinition            .addMay(_description);
            _ActionDefinition            .addMay(_mustParm);
            _ActionDefinition            .addMay(_mayParm);
            _ActionDefinition            .addMay(_mustReturn);
            _ActionDefinition            .addMay(_mayReturn);
            _ActionDefinition            .addMay(_attachToClass);
            _ActionDefinition            .addMay(_blockWhenLocked);
            _ActionDefinition            .addMay(_isGetAction);
            _ActionDefinition            .addMay(_obsoleteVersion);
            _ActionDefinition            .addMay(_maySendProgress);
            _ActionDefinition            .addMust(_name);
            _ActionDefinition            .setName("ActionDefinition");
            _ActionDefinition            .setDefinedIn(this);

            _ActionTriggerInfo           .setClassType(ClassTypeEnum.ABSTRACT);
            _ActionTriggerInfo           .setDescription("The ActionTriggerInfo class simply provides a common base for the bundle of information required to remotely trigger an action on an object.  Derivatives of this class are generated as part of the DMO generation process and have action specific interfaces to handle the parameters  required by an action. <P> This mechanism is a replacement for the concept that ActionRequests were EXTENSIBLE objects. This way, the user can ask an object for the  ActionTriggerInfo (ATI) for a particular action and have a well defined interface to specify the parameters for the action.");
            _ActionTriggerInfo           .setDmdID("14");
            _ActionTriggerInfo           .setDmoImport("org.dmd.dms.generated.dmo.ActionTriggerInfoDMO");
            _ActionTriggerInfo           .setJavaClass("org.dmd.dms.extended.ActionTriggerInfo");
            _ActionTriggerInfo           .addMust(_name);
            _ActionTriggerInfo           .setName("ActionTriggerInfo");
            _ActionTriggerInfo           .setDefinedIn(this);

            _AllowedAttributesRuleInstance.setClassType(ClassTypeEnum.STRUCTURAL);
            _AllowedAttributesRuleInstance.setDmdID("20");
            _AllowedAttributesRuleInstance.setDmoImport("org.dmd.dms.generated.dmo.AllowedAttributesRuleInstanceDMO");
            _AllowedAttributesRuleInstance.setInternallyGenerated("true");
            _AllowedAttributesRuleInstance.setJavaClass("org.dmd.dms.generated.dmo.AllowedAttributesRuleInstanceDMO");
            _AllowedAttributesRuleInstance.addMay(_description);
            _AllowedAttributesRuleInstance.addMust(_ruleTitle);
            _AllowedAttributesRuleInstance.setName("AllowedAttributesRuleInstance");
            _AllowedAttributesRuleInstance.setRuleDefinition(_AllowedAttributesRule);
            _AllowedAttributesRuleInstance.setDefinedIn(this);

            _AttributeDefinition         .setClassType(ClassTypeEnum.STRUCTURAL);
            _AttributeDefinition         .setDerivedFrom(_DmsDefinition);
            _AttributeDefinition         .setDescription("This class is used to define attributes to be used as part of a class definition.");
            _AttributeDefinition         .setDmdID("7");
            _AttributeDefinition         .setDmoImport("org.dmd.dms.generated.dmo.AttributeDefinitionDMO");
            _AttributeDefinition         .setIsNamedBy(_name);
            _AttributeDefinition         .setJavaClass("org.dmd.dms.AttributeDefinition");
            _AttributeDefinition         .addMay(_description);
            _AttributeDefinition         .addMay(_valueType);
            _AttributeDefinition         .addMay(_nullReturnValue);
            _AttributeDefinition         .addMay(_abbrev);
            _AttributeDefinition         .addMay(_obsoleteVersion);
            _AttributeDefinition         .addMay(_secure);
            _AttributeDefinition         .addMay(_dataType);
            _AttributeDefinition         .addMay(_dmdID);
            _AttributeDefinition         .addMay(_genericArgs);
            _AttributeDefinition         .addMay(_genericArgsImport);
            _AttributeDefinition         .addMay(_designatedNameAttribute);
            _AttributeDefinition         .addMay(_designatedFilterAttribute);
            _AttributeDefinition         .addMay(_internalUse);
            _AttributeDefinition         .addMay(_indexSize);
            _AttributeDefinition         .addMust(_name);
            _AttributeDefinition         .addMust(_type);
            _AttributeDefinition         .setName("AttributeDefinition");
            _AttributeDefinition         .setDefinedIn(this);

            _AttributeValidatorDefinition.setClassType(ClassTypeEnum.STRUCTURAL);
            _AttributeValidatorDefinition.setDerivedFrom(_DmsDefinition);
            _AttributeValidatorDefinition.setDescription("The AttributeValidatorDefinition allows for the the definition of attribute level validation logic.");
            _AttributeValidatorDefinition.setDmdID("10");
            _AttributeValidatorDefinition.setDmoImport("org.dmd.dms.generated.dmo.AttributeValidatorDefinitionDMO");
            _AttributeValidatorDefinition.setIsNamedBy(_name);
            _AttributeValidatorDefinition.setJavaClass("org.dmd.dms.AttributeValidatorDefinition");
            _AttributeValidatorDefinition.addMay(_opContext);
            _AttributeValidatorDefinition.addMay(_description);
            _AttributeValidatorDefinition.addMust(_name);
            _AttributeValidatorDefinition.addMust(_validatorClass);
            _AttributeValidatorDefinition.setName("AttributeValidatorDefinition");
            _AttributeValidatorDefinition.setDefinedIn(this);

            _ClassDefinition             .setClassType(ClassTypeEnum.STRUCTURAL);
            _ClassDefinition             .setDerivedFrom(_DmsDefinition);
            _ClassDefinition             .setDescription("This class provides the basic mechanism to define new classes for a schema.");
            _ClassDefinition             .setDmdID("2");
            _ClassDefinition             .setDmoImport("org.dmd.dms.generated.dmo.ClassDefinitionDMO");
            _ClassDefinition             .setIsNamedBy(_name);
            _ClassDefinition             .setJavaClass("org.dmd.dms.ClassDefinition");
            _ClassDefinition             .addMay(_description);
            _ClassDefinition             .addMay(_derivedFrom);
            _ClassDefinition             .addMay(_must);
            _ClassDefinition             .addMay(_may);
            _ClassDefinition             .addMay(_isNamedBy);
            _ClassDefinition             .addMay(_javaClass);
            _ClassDefinition             .addMay(_intendedToExtend);
            _ClassDefinition             .addMay(_usesInterface);
            _ClassDefinition             .addMay(_useWrapperType);
            _ClassDefinition             .addMay(_dmwWrapperType);
            _ClassDefinition             .addMay(_allowedParents);
            _ClassDefinition             .addMay(_subpackage);
            _ClassDefinition             .addMay(_dataType);
            _ClassDefinition             .addMay(_supportsBackrefTracking);
            _ClassDefinition             .addMay(_excludeFromContext);
            _ClassDefinition             .addMay(_abbrev);
            _ClassDefinition             .addMay(_obsoleteVersion);
            _ClassDefinition             .addMay(_isTransportable);
            _ClassDefinition             .addMay(_internallyGenerated);
            _ClassDefinition             .addMay(_ruleDefinition);
            _ClassDefinition             .addMay(_derivedClasses);
            _ClassDefinition             .addMay(_actions);
            _ClassDefinition             .addMay(_internalTypeRef);
            _ClassDefinition             .addMay(_dmoImport);
            _ClassDefinition             .addMay(_dmoClass);
            _ClassDefinition             .addMay(_dmwImport);
            _ClassDefinition             .addMay(_dmwClass);
            _ClassDefinition             .addMay(_dmeImport);
            _ClassDefinition             .addMay(_dmeClass);
            _ClassDefinition             .addMay(_dmtImport);
            _ClassDefinition             .addMay(_dmtREFImport);
            _ClassDefinition             .addMay(_dmtClass);
            _ClassDefinition             .addMay(_dmoAuxClass);
            _ClassDefinition             .addMay(_dmoAuxClassImport);
            _ClassDefinition             .addMay(_dmwAuxClass);
            _ClassDefinition             .addMay(_dmwAuxClassImport);
            _ClassDefinition             .addMay(_dmwIteratorImport);
            _ClassDefinition             .addMay(_dmwIteratorClass);
            _ClassDefinition             .addMust(_name);
            _ClassDefinition             .addMust(_classType);
            _ClassDefinition             .addMust(_dmdID);
            _ClassDefinition             .setName("ClassDefinition");
            _ClassDefinition             .setDefinedIn(this);

            _ComplexTypeDefinition       .setClassType(ClassTypeEnum.STRUCTURAL);
            _ComplexTypeDefinition       .setDerivedFrom(_DmsDefinition);
            _ComplexTypeDefinition       .setDescription("The ComplexTypeDefinition provides a mechanism for defining the structure of a complex type composed of other types. From this definition, a new DmcType is generated that has all of the required methods automatically defined.");
            _ComplexTypeDefinition       .setDmdID("5");
            _ComplexTypeDefinition       .setDmoImport("org.dmd.dms.generated.dmo.ComplexTypeDefinitionDMO");
            _ComplexTypeDefinition       .setIsNamedBy(_name);
            _ComplexTypeDefinition       .setJavaClass("org.dmd.dms.ComplexTypeDefinition");
            _ComplexTypeDefinition       .addMay(_fieldSeparator);
            _ComplexTypeDefinition       .addMay(_extendedClass);
            _ComplexTypeDefinition       .addMay(_description);
            _ComplexTypeDefinition       .addMust(_name);
            _ComplexTypeDefinition       .addMust(_field);
            _ComplexTypeDefinition       .setName("ComplexTypeDefinition");
            _ComplexTypeDefinition       .setDefinedIn(this);

            _DmsDefinition               .setClassType(ClassTypeEnum.ABSTRACT);
            _DmsDefinition               .setDescription("The DmsDefinition class provides a common base for all definition classes.");
            _DmsDefinition               .setDmdID("1");
            _DmsDefinition               .setDmoImport("org.dmd.dms.generated.dmo.DmsDefinitionDMO");
            _DmsDefinition               .setIsNamedBy(_name);
            _DmsDefinition               .setJavaClass("org.dmd.dms.DmsDefinition");
            _DmsDefinition               .addMay(_definedIn);
            _DmsDefinition               .addMay(_file);
            _DmsDefinition               .addMay(_lineNumber);
            _DmsDefinition               .addMust(_name);
            _DmsDefinition               .setName("DmsDefinition");
            _DmsDefinition               .setDefinedIn(this);

            _EnumDefinition              .setClassType(ClassTypeEnum.STRUCTURAL);
            _EnumDefinition              .setDerivedFrom(_DmsDefinition);
            _EnumDefinition              .setDescription("The EnumDefinition allows for the definition of real Java enums that provide inherent mapping of the string and integer values of the enum into actual enum values. Once defined, EnumDefinitions can be used where ever you would use a TypeDefinition name i.e. they can be used in the type attribute of AttributeDefinitions.");
            _EnumDefinition              .setDmdID("3");
            _EnumDefinition              .setDmoImport("org.dmd.dms.generated.dmo.EnumDefinitionDMO");
            _EnumDefinition              .setIsNamedBy(_name);
            _EnumDefinition              .setJavaClass("org.dmd.dms.EnumDefinition");
            _EnumDefinition              .addMay(_description);
            _EnumDefinition              .addMay(_nullReturnValue);
            _EnumDefinition              .addMust(_name);
            _EnumDefinition              .addMust(_enumValue);
            _EnumDefinition              .setName("EnumDefinition");
            _EnumDefinition              .setDefinedIn(this);

            _ExtendedReferenceTypeDefinition.setClassType(ClassTypeEnum.STRUCTURAL);
            _ExtendedReferenceTypeDefinition.setDerivedFrom(_ComplexTypeDefinition);
            _ExtendedReferenceTypeDefinition.setDescription("The ExtendedReferenceTypeDefinition provides a mechanism for extending  the automatically generated named object reference attribute types with additional information. This can be seen as adding additional information to the relationship between two objects.");
            _ExtendedReferenceTypeDefinition.setDmdID("6");
            _ExtendedReferenceTypeDefinition.setDmoImport("org.dmd.dms.generated.dmo.ExtendedReferenceTypeDefinitionDMO");
            _ExtendedReferenceTypeDefinition.setIsNamedBy(_name);
            _ExtendedReferenceTypeDefinition.setJavaClass("org.dmd.dms.ExtendedReferenceTypeDefinition");
            _ExtendedReferenceTypeDefinition.addMust(_name);
            _ExtendedReferenceTypeDefinition.addMust(_extendedReferenceClass);
            _ExtendedReferenceTypeDefinition.setName("ExtendedReferenceTypeDefinition");
            _ExtendedReferenceTypeDefinition.setDefinedIn(this);

            _InitRuleInstance            .setClassType(ClassTypeEnum.EXTENSIBLE);
            _InitRuleInstance            .setDmdID("21");
            _InitRuleInstance            .setDmoImport("org.dmd.dms.generated.dmo.InitRuleInstanceDMO");
            _InitRuleInstance            .setInternallyGenerated("true");
            _InitRuleInstance            .setJavaClass("org.dmd.dms.generated.dmo.InitRuleInstanceDMO");
            _InitRuleInstance            .addMay(_description);
            _InitRuleInstance            .addMust(_ruleTitle);
            _InitRuleInstance            .setName("InitRuleInstance");
            _InitRuleInstance            .setRuleDefinition(_InitRule);
            _InitRuleInstance            .setDefinedIn(this);

            _ObjectValidatorDefinition   .setClassType(ClassTypeEnum.STRUCTURAL);
            _ObjectValidatorDefinition   .setDerivedFrom(_DmsDefinition);
            _ObjectValidatorDefinition   .setDescription("The ObjectValidatorDefinition allows for the the definition of object level validation logic.");
            _ObjectValidatorDefinition   .setDmdID("9");
            _ObjectValidatorDefinition   .setDmoImport("org.dmd.dms.generated.dmo.ObjectValidatorDefinitionDMO");
            _ObjectValidatorDefinition   .setIsNamedBy(_name);
            _ObjectValidatorDefinition   .setJavaClass("org.dmd.dms.ObjectValidatorDefinition");
            _ObjectValidatorDefinition   .addMay(_opContext);
            _ObjectValidatorDefinition   .addMay(_description);
            _ObjectValidatorDefinition   .addMust(_name);
            _ObjectValidatorDefinition   .addMust(_validatorClass);
            _ObjectValidatorDefinition   .setName("ObjectValidatorDefinition");
            _ObjectValidatorDefinition   .setDefinedIn(this);

            _RuleCategory                .setClassType(ClassTypeEnum.STRUCTURAL);
            _RuleCategory                .setDerivedFrom(_DmsDefinition);
            _RuleCategory                .setDescription("The RuleCategory allows for the definition of categories of rules to be applied to various objects and indicates the expected interface to be implemented by a rule instance. A RuleDefinition may belong to multiple categories. The basic RuleManager provides interfaces to trigger the RuleCategories defined as part of the meta schema. If you add other rule categories, you would derive from the RuleManager to add the additional methods required");
            _RuleCategory                .setDmdID("15");
            _RuleCategory                .setDmoImport("org.dmd.dms.generated.dmo.RuleCategoryDMO");
            _RuleCategory                .setIsNamedBy(_name);
            _RuleCategory                .setJavaClass("org.dmd.dms.RuleCategory");
            _RuleCategory                .addMust(_name);
            _RuleCategory                .addMust(_ruleCategoryID);
            _RuleCategory                .addMust(_ruleInterface);
            _RuleCategory                .addMust(_description);
            _RuleCategory                .setName("RuleCategory");
            _RuleCategory                .setDefinedIn(this);

            _RuleDefinition              .setClassType(ClassTypeEnum.STRUCTURAL);
            _RuleDefinition              .setDerivedFrom(_DmsDefinition);
            _RuleDefinition              .setDescription("The RuleDefinition allows for the definition of rules that can be applied to attributes or classes in different operational contexts. Rules are not just for validation, they can be applied to objects at different times in an object's life cycle e.g. the InitRule can initialize a set of attributes to known values. <p/> RuleDefinitions will result in the generation of ClassDefinitions that define the  DMOs that will carry the parameters associated with the rule and expectation that you will define an implementation class for the rule that derives from an abstract BaseImpl (base implementation) of the rule that provides common rule infrastructure and appropriate abstract methods that must be filled in. <p/> RuleDefinitions and ClassDefinitions share the same dmdID space and the IDs must be unique. This is because each RuleDefinition results in the creation of a  ClassDefinition for the DMO part of the rule that carries the rule parameters.");
            _RuleDefinition              .setDmdID("16");
            _RuleDefinition              .setDmoImport("org.dmd.dms.generated.dmo.RuleDefinitionDMO");
            _RuleDefinition              .setIsNamedBy(_name);
            _RuleDefinition              .setJavaClass("org.dmd.dms.RuleDefinition");
            _RuleDefinition              .addMay(_must);
            _RuleDefinition              .addMay(_may);
            _RuleDefinition              .addMay(_isExtensible);
            _RuleDefinition              .addMust(_name);
            _RuleDefinition              .addMust(_opContext);
            _RuleDefinition              .addMust(_ruleType);
            _RuleDefinition              .addMust(_ruleScope);
            _RuleDefinition              .addMust(_ruleCategory);
            _RuleDefinition              .addMust(_dmdID);
            _RuleDefinition              .addMust(_description);
            _RuleDefinition              .setName("RuleDefinition");
            _RuleDefinition              .setDefinedIn(this);

            _SchemaDefinition            .setClassType(ClassTypeEnum.STRUCTURAL);
            _SchemaDefinition            .setDerivedFrom(_DmsDefinition);
            _SchemaDefinition            .setDescription("This class is used to define a schema as a discrete, nameable entity.");
            _SchemaDefinition            .setDmdID("12");
            _SchemaDefinition            .setDmoImport("org.dmd.dms.generated.dmo.SchemaDefinitionDMO");
            _SchemaDefinition            .setIsNamedBy(_name);
            _SchemaDefinition            .setJavaClass("org.dmd.dms.SchemaDefinition");
            _SchemaDefinition            .addMay(_dependsOn);
            _SchemaDefinition            .addMay(_defFiles);
            _SchemaDefinition            .addMay(_generatedFileHeader);
            _SchemaDefinition            .addMay(_dmwPackage);
            _SchemaDefinition            .addMay(_schemaExtension);
            _SchemaDefinition            .addMay(_createAttributeFactory);
            _SchemaDefinition            .addMay(_dmwTypeToPackage);
            _SchemaDefinition            .addMay(_classDefList);
            _SchemaDefinition            .addMay(_typeDefList);
            _SchemaDefinition            .addMay(_complexTypeDefList);
            _SchemaDefinition            .addMay(_extendedReferenceTypeDefList);
            _SchemaDefinition            .addMay(_internalTypeDefList);
            _SchemaDefinition            .addMay(_attributeDefList);
            _SchemaDefinition            .addMay(_actionDefList);
            _SchemaDefinition            .addMay(_enumDefList);
            _SchemaDefinition            .addMay(_sliceDefList);
            _SchemaDefinition            .addMay(_objectValidatorDefList);
            _SchemaDefinition            .addMay(_attributeValidatorDefList);
            _SchemaDefinition            .addMay(_dependsOnRef);
            _SchemaDefinition            .addMay(_ruleCategoryList);
            _SchemaDefinition            .addMay(_ruleDefinitionList);
            _SchemaDefinition            .addMust(_name);
            _SchemaDefinition            .addMust(_description);
            _SchemaDefinition            .addMust(_schemaPackage);
            _SchemaDefinition            .addMust(_schemaBaseID);
            _SchemaDefinition            .addMust(_schemaIDRange);
            _SchemaDefinition            .setName("SchemaDefinition");
            _SchemaDefinition            .setDefinedIn(this);

            _SliceDefinition             .setClassType(ClassTypeEnum.STRUCTURAL);
            _SliceDefinition             .setDerivedFrom(_DmsDefinition);
            _SliceDefinition             .setDescription("The SliceDefinition class is used to define a named set of attributes that are used to retrieve a slice of an object i.e. an abbreviated set of values. These are used in the generation of static, named DmcSliceInfo instances.");
            _SliceDefinition             .setDmdID("8");
            _SliceDefinition             .setDmoImport("org.dmd.dms.generated.dmo.SliceDefinitionDMO");
            _SliceDefinition             .setIsNamedBy(_name);
            _SliceDefinition             .setJavaClass("org.dmd.dms.SliceDefinition");
            _SliceDefinition             .addMay(_description);
            _SliceDefinition             .addMust(_name);
            _SliceDefinition             .addMust(_selectAttribute);
            _SliceDefinition             .setName("SliceDefinition");
            _SliceDefinition             .setDefinedIn(this);

            _TypeDefinition              .setClassType(ClassTypeEnum.STRUCTURAL);
            _TypeDefinition              .setDerivedFrom(_DmsDefinition);
            _TypeDefinition              .setDescription("The TypeDefinition is used to define the types of attributes that can be used as the basis for attribute values. The name of the type definition should be the same as the actual Java class that is used to store the value of an attribute e.g. the name of the type used to store strings is String. The typeClassName is the fully qualified name of the class derived from DmcAttribute that stores this type of value; they are always, by conventional, named DmcTypeXXX. <P> TypeDefinitions are automatically generated internally for ClassDefinitions and EnumDefinitions so that these objects can be referred to via the type attribute of AttributeDefinitions. These definitions are marked as internallyGenerated.");
            _TypeDefinition              .setDmdID("4");
            _TypeDefinition              .setDmoImport("org.dmd.dms.generated.dmo.TypeDefinitionDMO");
            _TypeDefinition              .setIsNamedBy(_name);
            _TypeDefinition              .setJavaClass("org.dmd.dms.TypeDefinition");
            _TypeDefinition              .addMay(_description);
            _TypeDefinition              .addMay(_nullReturnValue);
            _TypeDefinition              .addMay(_wrapperClassName);
            _TypeDefinition              .addMay(_primitiveType);
            _TypeDefinition              .addMay(_internallyGenerated);
            _TypeDefinition              .addMay(_isEnumType);
            _TypeDefinition              .addMay(_enumName);
            _TypeDefinition              .addMay(_isRefType);
            _TypeDefinition              .addMay(_helperClassName);
            _TypeDefinition              .addMay(_originalClass);
            _TypeDefinition              .addMay(_dmwIteratorImport);
            _TypeDefinition              .addMay(_dmwIteratorClass);
            _TypeDefinition              .addMay(_genericArgs);
            _TypeDefinition              .addMay(_isNameType);
            _TypeDefinition              .addMay(_isFilterType);
            _TypeDefinition              .addMay(_isHierarchicName);
            _TypeDefinition              .addMay(_keyClass);
            _TypeDefinition              .addMay(_keyImport);
            _TypeDefinition              .addMay(_nameAttributeDef);
            _TypeDefinition              .addMay(_filterAttributeDef);
            _TypeDefinition              .addMay(_altType);
            _TypeDefinition              .addMay(_altTypeImport);
            _TypeDefinition              .addMay(_isExtendedRefType);
            _TypeDefinition              .addMust(_name);
            _TypeDefinition              .addMust(_typeClassName);
            _TypeDefinition              .setName("TypeDefinition");
            _TypeDefinition              .setDefinedIn(this);

            _Initialization              .setDescription("Rules in this category are used to initialize objects to a known state after creation.");
            _Initialization              .setName("Initialization");
            _Initialization              .setRuleCategoryID("1");
            _Initialization              .setRuleInterface("org.dmd.dms.shared.interfaces.InitializationIF");
            _Initialization              .setDefinedIn(this);

            _ModifierValidation          .setDescription("Rules in this category are used to valid modifications that are about to be applied to an object.");
            _ModifierValidation          .setName("ModifierValidation");
            _ModifierValidation          .setRuleCategoryID("3");
            _ModifierValidation          .setRuleInterface("org.dmd.dms.shared.interfaces.ModifierValidationIF");
            _ModifierValidation          .setDefinedIn(this);

            _ObjectValidation            .setDescription("Rules in this category are used to validate a complete object. This would include objects read from Object Instance Files, objects in CreateRequests (after Initialization rules have been applied).");
            _ObjectValidation            .setName("ObjectValidation");
            _ObjectValidation            .setRuleCategoryID("2");
            _ObjectValidation            .setRuleInterface("org.dmd.dms.shared.interfaces.ObjectValidationIF");
            _ObjectValidation            .setDefinedIn(this);

            _AllowedAttributesRule       .setDescription("The AllowedAttributesRule will determine whether or not the  attributes of a DMO conform to the must/may specification of its class definition. For class of type EXTENSIBLE only the must have attributes are checked.");
            _AllowedAttributesRule       .setDmdID("20");
            _AllowedAttributesRule       .setName("AllowedAttributesRule");
            _AllowedAttributesRule       .setOpContext(OperationalContextEnum.DMO);
            _AllowedAttributesRule       .addRuleCategory(_ObjectValidation);
            _AllowedAttributesRule       .addRuleCategory(_ModifierValidation);
            _AllowedAttributesRule       .setRuleScope(RuleScopeEnum.GLOBAL);
            _AllowedAttributesRule       .setRuleType(RuleTypeEnum.CLASS);
            _AllowedAttributesRule       .setDefinedIn(this);

            _InitRule                    .setDescription("The InitRule allows you to specify attribute values for a  newly created object or an object read from file or received in a CreateRequest (for instance). The InitRule will only set the values of attributes that are missing from the object; existing attributes are not alterred. An example usage might be: <p/> <pre> InitRule ruleTitle    Initialize the X class applyToClass X attributeA   some value attributeB   42 attributeC   something attributeC   something else </pre>");
            _InitRule                    .setDmdID("21");
            _InitRule                    .setIsExtensible("true");
            _InitRule                    .setName("InitRule");
            _InitRule                    .setOpContext(OperationalContextEnum.DMO);
            _InitRule                    .addRuleCategory(_Initialization);
            _InitRule                    .setRuleScope(RuleScopeEnum.PERCLASS);
            _InitRule                    .setRuleType(RuleTypeEnum.CLASS);
            _InitRule                    .setDefinedIn(this);

        // Add the definitions to the schema object
        // Generated from: org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:875)
            this.addClassDefList(_AllowedAttributesRuleInstance);
            this.addClassDefList(_InitRuleInstance);
            this.addClassDefList(_ActionTriggerInfo);
            this.addClassDefList(_DmsDefinition);
            this.addClassDefList(_ClassDefinition);
            this.addClassDefList(_EnumDefinition);
            this.addClassDefList(_TypeDefinition);
            this.addClassDefList(_ComplexTypeDefinition);
            this.addClassDefList(_ExtendedReferenceTypeDefinition);
            this.addClassDefList(_AttributeDefinition);
            this.addClassDefList(_SliceDefinition);
            this.addClassDefList(_ObjectValidatorDefinition);
            this.addClassDefList(_AttributeValidatorDefinition);
            this.addClassDefList(_ActionDefinition);
            this.addClassDefList(_SchemaDefinition);
            this.addClassDefList(_RuleCategory);
            this.addClassDefList(_RuleDefinition);
            this.addEnumDefList(_ClassTypeEnum);
            this.addEnumDefList(_ModifyTypeEnum);
            this.addEnumDefList(_OperationalContextEnum);
            this.addEnumDefList(_RuleTypeEnum);
            this.addEnumDefList(_RuleScopeEnum);
            this.addEnumDefList(_DataTypeEnum);
            this.addEnumDefList(_ValueTypeEnum);
            this.addEnumDefList(_BaseTypeEnum);
            this.addEnumDefList(_ModificationControlEnum);
            this.addEnumDefList(_FilterTypeEnum);
            this.addEnumDefList(_DebugEnum);
            this.addEnumDefList(_WrapperTypeEnum);
            this.addTypeDefList(_String);
            this.addTypeDefList(_DmcObject);
            this.addTypeDefList(_ClassInfoRef);
            this.addTypeDefList(_DmcAttribute);
            this.addTypeDefList(_NameContainer);
            this.addTypeDefList(_FilterContainer);
            this.addTypeDefList(_AttributeID);
            this.addTypeDefList(_Integer);
            this.addTypeDefList(_Float);
            this.addTypeDefList(_Double);
            this.addTypeDefList(_Long);
            this.addTypeDefList(_Date);
            this.addTypeDefList(_Boolean);
            this.addTypeDefList(_EnumValue);
            this.addTypeDefList(_Modifier);
            this.addTypeDefList(_StringName);
            this.addTypeDefList(_CamelCaseName);
            this.addTypeDefList(_IntegerName);
            this.addTypeDefList(_LongName);
            this.addTypeDefList(_DotName);
            this.addTypeDefList(_ClassFilter);
            this.addTypeDefList(_IntegerToString);
            this.addTypeDefList(_StringToString);
            this.addTypeDefList(_UUIDLite);
            this.addTypeDefList(_UUIDName);
            this.addTypeDefList(_IntegerToBoolean);
            this.addTypeDefList(_IntegerToUUIDLite);
            this.addTypeDefList(_FullyQualifiedName);
            this.addTypeDefList(_LabelledIntegerDataPoint);
            this.addTypeDefList(_TimeDoubleDataPoint);
            this.addTypeDefList(_DmwTypeToWrapperType);
            this.addTypeDefList(_Field);
            this.addTypeDefList(_ActionDefinitionREF);
            this.addTypeDefList(_AttributeDefinitionREF);
            this.addTypeDefList(_AttributeValidatorDefinitionREF);
            this.addTypeDefList(_ClassDefinitionREF);
            this.addTypeDefList(_ComplexTypeDefinitionREF);
            this.addTypeDefList(_DmsDefinitionREF);
            this.addTypeDefList(_EnumDefinitionREF);
            this.addTypeDefList(_ExtendedReferenceTypeDefinitionREF);
            this.addTypeDefList(_ObjectValidatorDefinitionREF);
            this.addTypeDefList(_RuleCategoryREF);
            this.addTypeDefList(_RuleDefinitionREF);
            this.addTypeDefList(_SchemaDefinitionREF);
            this.addTypeDefList(_SliceDefinitionREF);
            this.addTypeDefList(_TypeDefinitionREF);
            this.addTypeDefList(_BaseTypeEnumREF);
            this.addTypeDefList(_ClassTypeEnumREF);
            this.addTypeDefList(_DataTypeEnumREF);
            this.addTypeDefList(_DebugEnumREF);
            this.addTypeDefList(_FilterTypeEnumREF);
            this.addTypeDefList(_ModificationControlEnumREF);
            this.addTypeDefList(_ModifyTypeEnumREF);
            this.addTypeDefList(_OperationalContextEnumREF);
            this.addTypeDefList(_RuleScopeEnumREF);
            this.addTypeDefList(_RuleTypeEnumREF);
            this.addTypeDefList(_ValueTypeEnumREF);
            this.addTypeDefList(_WrapperTypeEnumREF);
            this.addAttributeDefList(_name);
            this.addAttributeDefList(_dmdID);
            this.addAttributeDefList(_schemaExtension);
            this.addAttributeDefList(_typeClassName);
            this.addAttributeDefList(_wrapperClassName);
            this.addAttributeDefList(_nullReturnValue);
            this.addAttributeDefList(_primitiveType);
            this.addAttributeDefList(_abbrev);
            this.addAttributeDefList(_classType);
            this.addAttributeDefList(_dataType);
            this.addAttributeDefList(_valueType);
            this.addAttributeDefList(_isRefType);
            this.addAttributeDefList(_isSchemaRtype);
            this.addAttributeDefList(_isEnumType);
            this.addAttributeDefList(_isDefaultValue);
            this.addAttributeDefList(_description);
            this.addAttributeDefList(_type);
            this.addAttributeDefList(_internalTypeRef);
            this.addAttributeDefList(_derivedFrom);
            this.addAttributeDefList(_intendedToExtend);
            this.addAttributeDefList(_usesInterface);
            this.addAttributeDefList(_derivedClasses);
            this.addAttributeDefList(_must);
            this.addAttributeDefList(_may);
            this.addAttributeDefList(_mustParm);
            this.addAttributeDefList(_mayParm);
            this.addAttributeDefList(_mustReturn);
            this.addAttributeDefList(_mayReturn);
            this.addAttributeDefList(_actions);
            this.addAttributeDefList(_enumValue);
            this.addAttributeDefList(_javaClass);
            this.addAttributeDefList(_dmoImport);
            this.addAttributeDefList(_dmoClass);
            this.addAttributeDefList(_dmoAuxClass);
            this.addAttributeDefList(_dmoAuxClassImport);
            this.addAttributeDefList(_dmwAuxClass);
            this.addAttributeDefList(_dmwAuxClassImport);
            this.addAttributeDefList(_dmwImport);
            this.addAttributeDefList(_dmwClass);
            this.addAttributeDefList(_dmeImport);
            this.addAttributeDefList(_dmeClass);
            this.addAttributeDefList(_dmtImport);
            this.addAttributeDefList(_dmtClass);
            this.addAttributeDefList(_helperClassName);
            this.addAttributeDefList(_getType);
            this.addAttributeDefList(_getMethod);
            this.addAttributeDefList(_setType);
            this.addAttributeDefList(_valueClass);
            this.addAttributeDefList(_javaPackage);
            this.addAttributeDefList(_schemaPackage);
            this.addAttributeDefList(_dmwPackage);
            this.addAttributeDefList(_classDefList);
            this.addAttributeDefList(_typeDefList);
            this.addAttributeDefList(_internalTypeDefList);
            this.addAttributeDefList(_enumDefList);
            this.addAttributeDefList(_attributeDefList);
            this.addAttributeDefList(_actionDefList);
            this.addAttributeDefList(_definedIn);
            this.addAttributeDefList(_allowedParents);
            this.addAttributeDefList(_namingAttribute);
            this.addAttributeDefList(_attachToClass);
            this.addAttributeDefList(_dependsOn);
            this.addAttributeDefList(_dependsOnRef);
            this.addAttributeDefList(_defFiles);
            this.addAttributeDefList(_enumInt);
            this.addAttributeDefList(_enumString);
            this.addAttributeDefList(_blockWhenLocked);
            this.addAttributeDefList(_isGetAction);
            this.addAttributeDefList(_obsoleteVersion);
            this.addAttributeDefList(_file);
            this.addAttributeDefList(_lineNumber);
            this.addAttributeDefList(_maySendProgress);
            this.addAttributeDefList(_internallyGenerated);
            this.addAttributeDefList(_secure);
            this.addAttributeDefList(_isTransportable);
            this.addAttributeDefList(_isNamedBy);
            this.addAttributeDefList(_generatedFileHeader);
            this.addAttributeDefList(_useWrapperType);
            this.addAttributeDefList(_originalClass);
            this.addAttributeDefList(_FQN);
            this.addAttributeDefList(_modify);
            this.addAttributeDefList(_schemaBaseID);
            this.addAttributeDefList(_schemaIDRange);
            this.addAttributeDefList(_subpackage);
            this.addAttributeDefList(_createAttributeFactory);
            this.addAttributeDefList(_nameAttributeDef);
            this.addAttributeDefList(_dmwIteratorImport);
            this.addAttributeDefList(_dmwIteratorClass);
            this.addAttributeDefList(_dmtREFImport);
            this.addAttributeDefList(_genericArgs);
            this.addAttributeDefList(_isNameType);
            this.addAttributeDefList(_keyClass);
            this.addAttributeDefList(_keyImport);
            this.addAttributeDefList(_genericArgsImport);
            this.addAttributeDefList(_enumName);
            this.addAttributeDefList(_integerName);
            this.addAttributeDefList(_uuidName);
            this.addAttributeDefList(_designatedNameAttribute);
            this.addAttributeDefList(_fieldSeparator);
            this.addAttributeDefList(_field);
            this.addAttributeDefList(_extendedClass);
            this.addAttributeDefList(_dotName);
            this.addAttributeDefList(_altType);
            this.addAttributeDefList(_altTypeImport);
            this.addAttributeDefList(_selectAttribute);
            this.addAttributeDefList(_sliceDefList);
            this.addAttributeDefList(_validatorClass);
            this.addAttributeDefList(_objectValidatorDefList);
            this.addAttributeDefList(_attributeValidatorDefList);
            this.addAttributeDefList(_opContext);
            this.addAttributeDefList(_camelCaseName);
            this.addAttributeDefList(_complexTypeDefList);
            this.addAttributeDefList(_supportsBackrefTracking);
            this.addAttributeDefList(_extendsInterface);
            this.addAttributeDefList(_dependsOnSchema);
            this.addAttributeDefList(_isHierarchicName);
            this.addAttributeDefList(_internalUse);
            this.addAttributeDefList(_dmwTypeToPackage);
            this.addAttributeDefList(_dmwWrapperType);
            this.addAttributeDefList(_isFilterType);
            this.addAttributeDefList(_designatedFilterAttribute);
            this.addAttributeDefList(_filterAttributeDef);
            this.addAttributeDefList(_classFilter);
            this.addAttributeDefList(_indexSize);
            this.addAttributeDefList(_excludeFromContext);
            this.addAttributeDefList(_extendedReferenceClass);
            this.addAttributeDefList(_extendedReferenceTypeDefList);
            this.addAttributeDefList(_isExtendedRefType);
            this.addAttributeDefList(_longName);
            this.addAttributeDefList(_baseType);
            this.addAttributeDefList(_ruleType);
            this.addAttributeDefList(_ruleScope);
            this.addAttributeDefList(_ruleTitle);
            this.addAttributeDefList(_ruleCategory);
            this.addAttributeDefList(_ruleCategoryID);
            this.addAttributeDefList(_ruleInterface);
            this.addAttributeDefList(_isExtensible);
            this.addAttributeDefList(_ruleCategoryList);
            this.addAttributeDefList(_ruleDefinitionList);
            this.addAttributeDefList(_ruleDefinition);
            this.addAttributeDefList(_objectClass);
            this.addRuleCategoryList(_Initialization);
            this.addRuleCategoryList(_ObjectValidation);
            this.addRuleCategoryList(_ModifierValidation);
            this.addRuleDefinitionList(_AllowedAttributesRule);
            this.addRuleDefinitionList(_InitRule);
            this.setName("meta");
            this.setDescription("The meta schema defines the elements used to define schemas.");
            this.setSchemaPackage("org.dmd.dms");
            this.setDmwPackage("org.dmd.dms");
            this.setSchemaBaseID(0);
            this.setSchemaIDRange(200);
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }

    }

}

