//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
  * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:442)
  */
abstract public class MetaSchemaAG extends SchemaDefinition {
    public static SchemaDefinition    _metaSchema;

    public static ClassDefinition     _DmwWrapper;
    public static ClassDefinition     _DmsDefinition;
    public static ClassDefinition     _ClassDefinition;
    public static ClassDefinition     _EnumDefinition;
    public static ClassDefinition     _TypeDefinition;
    public static ClassDefinition     _AttributeDefinition;
    public static ClassDefinition     _ActionDefinition;
    public static ClassDefinition     _SchemaDefinition;

    public static EnumDefinition      _ClassTypeEnum;
    public static EnumDefinition      _ModifyTypeEnum;
    public static EnumDefinition      _DataTypeEnum;
    public static EnumDefinition      _FilterTypeEnum;
    public static EnumDefinition      _DebugEnum;
    public static EnumDefinition      _WrapperTypeEnum;

    public static TypeDefinition      _String;
    public static TypeDefinition      _DmcObject;
    public static TypeDefinition      _Integer;
    public static TypeDefinition      _Float;
    public static TypeDefinition      _Double;
    public static TypeDefinition      _Long;
    public static TypeDefinition      _Date;
    public static TypeDefinition      _Boolean;
    public static TypeDefinition      _EnumValue;
    public static TypeDefinition      _Modifier;
    public static TypeDefinition      _ActionDefinitionReference;
    public static TypeDefinition      _AttributeDefinitionReference;
    public static TypeDefinition      _ClassDefinitionReference;
    public static TypeDefinition      _DmsDefinitionReference;
    public static TypeDefinition      _EnumDefinitionReference;
    public static TypeDefinition      _SchemaDefinitionReference;
    public static TypeDefinition      _TypeDefinitionReference;
    public static TypeDefinition      _ClassTypeEnumReference;
    public static TypeDefinition      _DataTypeEnumReference;
    public static TypeDefinition      _DebugEnumReference;
    public static TypeDefinition      _FilterTypeEnumReference;
    public static TypeDefinition      _ModifyTypeEnumReference;
    public static TypeDefinition      _WrapperTypeEnumReference;

    public static AttributeDefinition _name;
    public static AttributeDefinition _typeClassName;
    public static AttributeDefinition _wrapperClassName;
    public static AttributeDefinition _nullReturnValue;
    public static AttributeDefinition _primitiveType;
    public static AttributeDefinition _abbrev;
    public static AttributeDefinition _classType;
    public static AttributeDefinition _dataType;
    public static AttributeDefinition _isMultiValued;
    public static AttributeDefinition _isRefType;
    public static AttributeDefinition _isSchemaRtype;
    public static AttributeDefinition _isEnumType;
    public static AttributeDefinition _isDefaultValue;
    public static AttributeDefinition _description;
    public static AttributeDefinition _type;
    public static AttributeDefinition _internalTypeRef;
    public static AttributeDefinition _derivedFrom;
    public static AttributeDefinition _intendedToExtend;
    public static AttributeDefinition _implements;
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
    public static AttributeDefinition _allowedChildren;
    public static AttributeDefinition _namingAttribute;
    public static AttributeDefinition _FQN;
    public static AttributeDefinition _parentFQN;
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
    public static AttributeDefinition _schemaExtension;
    public static AttributeDefinition _objectClass;

    public MetaSchemaAG() throws DmcValueException {

        super("metaSchema");

        staticRefName = new String("MetaSchema._");

        // We only ever want to initialize the schema once, so check
        // to see if we've initialized the first class definition
        if (_metaSchema == null){
            try{
            // Create the class definitions
            // Generated from:  org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:483)
            _DmwWrapper                  = new ClassDefinition("DmwWrapper");
            _DmsDefinition               = new ClassDefinition("DmsDefinition");
            _ClassDefinition             = new ClassDefinition("ClassDefinition");
            _EnumDefinition              = new ClassDefinition("EnumDefinition");
            _TypeDefinition              = new ClassDefinition("TypeDefinition");
            _AttributeDefinition         = new ClassDefinition("AttributeDefinition");
            _ActionDefinition            = new ClassDefinition("ActionDefinition");
            _SchemaDefinition            = new ClassDefinition("SchemaDefinition");

            // Create the enum definitions
            // Generated from:  org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:493)
            _ClassTypeEnum               = new EnumDefinition("ClassTypeEnum");
            _ModifyTypeEnum              = new EnumDefinition("ModifyTypeEnum");
            _DataTypeEnum                = new EnumDefinition("DataTypeEnum");
            _FilterTypeEnum              = new EnumDefinition("FilterTypeEnum");
            _DebugEnum                   = new EnumDefinition("DebugEnum");
            _WrapperTypeEnum             = new EnumDefinition("WrapperTypeEnum");

            // Create the type definitions
            // Generated from:  org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:503)
            _String                      = new TypeDefinition("String", org.dmd.dmc.types.DmcTypeString.class);
            _DmcObject                   = new TypeDefinition("DmcObject", org.dmd.dmc.types.DmcTypeDmcObject.class);
            _Integer                     = new TypeDefinition("Integer", org.dmd.dmc.types.DmcTypeInteger.class);
            _Float                       = new TypeDefinition("Float", org.dmd.dmc.types.DmcTypeFloat.class);
            _Double                      = new TypeDefinition("Double", org.dmd.dmc.types.DmcTypeDouble.class);
            _Long                        = new TypeDefinition("Long", org.dmd.dmc.types.DmcTypeLong.class);
            _Date                        = new TypeDefinition("Date", org.dmd.dmc.types.DmcTypeDate.class);
            _Boolean                     = new TypeDefinition("Boolean", org.dmd.dmc.types.DmcTypeBoolean.class);
            _EnumValue                   = new TypeDefinition("EnumValue", org.dmd.dms.types.DmcTypeEnumValue.class);
            _Modifier                    = new TypeDefinition("Modifier", org.dmd.dmc.types.DmcTypeModifier.class);
            _ActionDefinitionReference   = new TypeDefinition("ActionDefinitionReference", org.dmd.dms.generated.types.DmcTypeActionDefinitionREF.class, org.dmd.dms.ActionDefinition.class);
            _AttributeDefinitionReference= new TypeDefinition("AttributeDefinitionReference", org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREF.class, org.dmd.dms.AttributeDefinition.class);
            _ClassDefinitionReference    = new TypeDefinition("ClassDefinitionReference", org.dmd.dms.generated.types.DmcTypeClassDefinitionREF.class, org.dmd.dms.ClassDefinition.class);
            _DmsDefinitionReference      = new TypeDefinition("DmsDefinitionReference", org.dmd.dms.generated.types.DmcTypeDmsDefinitionREF.class, org.dmd.dms.DmsDefinition.class);
            _EnumDefinitionReference     = new TypeDefinition("EnumDefinitionReference", org.dmd.dms.generated.types.DmcTypeEnumDefinitionREF.class, org.dmd.dms.EnumDefinition.class);
            _SchemaDefinitionReference   = new TypeDefinition("SchemaDefinitionReference", org.dmd.dms.generated.types.DmcTypeSchemaDefinitionREF.class, org.dmd.dms.SchemaDefinition.class);
            _TypeDefinitionReference     = new TypeDefinition("TypeDefinitionReference", org.dmd.dms.generated.types.DmcTypeTypeDefinitionREF.class, org.dmd.dms.TypeDefinition.class);
            _ClassTypeEnumReference      = new TypeDefinition("ClassTypeEnumReference", org.dmd.dms.generated.types.DmcTypeClassTypeEnum.class);
            _DataTypeEnumReference       = new TypeDefinition("DataTypeEnumReference", org.dmd.dms.generated.types.DmcTypeDataTypeEnum.class);
            _DebugEnumReference          = new TypeDefinition("DebugEnumReference", org.dmd.dms.generated.types.DmcTypeDebugEnum.class);
            _FilterTypeEnumReference     = new TypeDefinition("FilterTypeEnumReference", org.dmd.dms.generated.types.DmcTypeFilterTypeEnum.class);
            _ModifyTypeEnumReference     = new TypeDefinition("ModifyTypeEnumReference", org.dmd.dms.generated.types.DmcTypeModifyTypeEnum.class);
            _WrapperTypeEnumReference    = new TypeDefinition("WrapperTypeEnumReference", org.dmd.dms.generated.types.DmcTypeWrapperTypeEnum.class);

            // Create the attribute definitions
            // Generated from:  org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:524)
            _name                        = new AttributeDefinition("name", _String);
            _typeClassName               = new AttributeDefinition("typeClassName", _String);
            _wrapperClassName            = new AttributeDefinition("wrapperClassName", _String);
            _nullReturnValue             = new AttributeDefinition("nullReturnValue", _String);
            _primitiveType               = new AttributeDefinition("primitiveType", _String);
            _abbrev                      = new AttributeDefinition("abbrev", _String);
            _classType                   = new AttributeDefinition("classType", _ClassTypeEnumReference);
            _dataType                    = new AttributeDefinition("dataType", _DataTypeEnumReference);
            _isMultiValued               = new AttributeDefinition("isMultiValued", _Boolean);
            _isRefType                   = new AttributeDefinition("isRefType", _Boolean);
            _isSchemaRtype               = new AttributeDefinition("isSchemaRtype", _Boolean);
            _isEnumType                  = new AttributeDefinition("isEnumType", _Boolean);
            _isDefaultValue              = new AttributeDefinition("isDefaultValue", _Boolean);
            _description                 = new AttributeDefinition("description", _String);
            _type                        = new AttributeDefinition("type", _TypeDefinitionReference);
            _internalTypeRef             = new AttributeDefinition("internalTypeRef", _TypeDefinitionReference);
            _derivedFrom                 = new AttributeDefinition("derivedFrom", _ClassDefinitionReference);
            _intendedToExtend            = new AttributeDefinition("intendedToExtend", _ClassDefinitionReference);
            _implements                  = new AttributeDefinition("implements", _ClassDefinitionReference);
            _usesInterface               = new AttributeDefinition("usesInterface", _String);
            _derivedClasses              = new AttributeDefinition("derivedClasses", _ClassDefinitionReference);
            _must                        = new AttributeDefinition("must", _AttributeDefinitionReference);
            _may                         = new AttributeDefinition("may", _AttributeDefinitionReference);
            _mustParm                    = new AttributeDefinition("mustParm", _AttributeDefinitionReference);
            _mayParm                     = new AttributeDefinition("mayParm", _AttributeDefinitionReference);
            _mustReturn                  = new AttributeDefinition("mustReturn", _AttributeDefinitionReference);
            _mayReturn                   = new AttributeDefinition("mayReturn", _AttributeDefinitionReference);
            _actions                     = new AttributeDefinition("actions", _ActionDefinitionReference);
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
            _classDefList                = new AttributeDefinition("classDefList", _ClassDefinitionReference);
            _typeDefList                 = new AttributeDefinition("typeDefList", _TypeDefinitionReference);
            _internalTypeDefList         = new AttributeDefinition("internalTypeDefList", _TypeDefinitionReference);
            _enumDefList                 = new AttributeDefinition("enumDefList", _EnumDefinitionReference);
            _attributeDefList            = new AttributeDefinition("attributeDefList", _AttributeDefinitionReference);
            _actionDefList               = new AttributeDefinition("actionDefList", _ActionDefinitionReference);
            _definedIn                   = new AttributeDefinition("definedIn", _SchemaDefinitionReference);
            _allowedParents              = new AttributeDefinition("allowedParents", _ClassDefinitionReference);
            _allowedChildren             = new AttributeDefinition("allowedChildren", _ClassDefinitionReference);
            _namingAttribute             = new AttributeDefinition("namingAttribute", _AttributeDefinitionReference);
            _FQN                         = new AttributeDefinition("FQN", _String);
            _parentFQN                   = new AttributeDefinition("parentFQN", _String);
            _attachToClass               = new AttributeDefinition("attachToClass", _ClassDefinitionReference);
            _dependsOn                   = new AttributeDefinition("dependsOn", _String);
            _dependsOnRef                = new AttributeDefinition("dependsOnRef", _SchemaDefinitionReference);
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
            _isNamedBy                   = new AttributeDefinition("isNamedBy", _AttributeDefinitionReference);
            _generatedFileHeader         = new AttributeDefinition("generatedFileHeader", _String);
            _useWrapperType              = new AttributeDefinition("useWrapperType", _WrapperTypeEnumReference);
            _originalClass               = new AttributeDefinition("originalClass", _ClassDefinitionReference);
            _schemaExtension             = new AttributeDefinition("schemaExtension", _String);
            _objectClass                 = new AttributeDefinition("objectClass", _ClassDefinitionReference);

            // Set attribute values on all objects
            // Generated from:  org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:559)
            _ActionDefinitionReference   .addObjectClass(_TypeDefinition);
            _ActionDefinitionReference   .setDescription("This is an internally generated type to allow references to ActionDefinition objects.");
            _ActionDefinitionReference   .setInternallyGenerated("true");
            _ActionDefinitionReference   .setIsRefType("true");
            _ActionDefinitionReference   .setName("ActionDefinitionReference");
            _ActionDefinitionReference   .setOriginalClass(_ActionDefinition);
            _ActionDefinitionReference   .setTypeClassName("org.dmd.dms.generated.types.DmcTypeActionDefinitionREF");
            _ActionDefinitionReference   .setWrapperClassName("org.dmd.dms.ActionDefinition");
            _ActionDefinitionReference   .setDefinedIn(this);

            _AttributeDefinitionReference.addObjectClass(_TypeDefinition);
            _AttributeDefinitionReference.setDescription("This is an internally generated type to allow references to AttributeDefinition objects.");
            _AttributeDefinitionReference.setInternallyGenerated("true");
            _AttributeDefinitionReference.setIsRefType("true");
            _AttributeDefinitionReference.setName("AttributeDefinitionReference");
            _AttributeDefinitionReference.setOriginalClass(_AttributeDefinition);
            _AttributeDefinitionReference.setTypeClassName("org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREF");
            _AttributeDefinitionReference.setWrapperClassName("org.dmd.dms.AttributeDefinition");
            _AttributeDefinitionReference.setDefinedIn(this);

            _Boolean                     .addObjectClass(_TypeDefinition);
            _Boolean                     .setDescription("Provides support for Boolean values. This type makes use of the nullReturnValue flag so that, even if there is no value for an attribute of this type, a value of false will be returned.");
            _Boolean                     .setName("Boolean");
            _Boolean                     .setNullReturnValue("false");
            _Boolean                     .setTypeClassName("org.dmd.dmc.types.DmcTypeBoolean");
            _Boolean                     .setDefinedIn(this);

            _ClassDefinitionReference    .addObjectClass(_TypeDefinition);
            _ClassDefinitionReference    .setDescription("This is an internally generated type to allow references to ClassDefinition objects.");
            _ClassDefinitionReference    .setInternallyGenerated("true");
            _ClassDefinitionReference    .setIsRefType("true");
            _ClassDefinitionReference    .setName("ClassDefinitionReference");
            _ClassDefinitionReference    .setOriginalClass(_ClassDefinition);
            _ClassDefinitionReference    .setTypeClassName("org.dmd.dms.generated.types.DmcTypeClassDefinitionREF");
            _ClassDefinitionReference    .setWrapperClassName("org.dmd.dms.ClassDefinition");
            _ClassDefinitionReference    .setDefinedIn(this);

            _ClassTypeEnumReference      .addObjectClass(_TypeDefinition);
            _ClassTypeEnumReference      .setDescription("This is an internally generated type to allow references to ClassTypeEnum objects.");
            _ClassTypeEnumReference      .setInternallyGenerated("true");
            _ClassTypeEnumReference      .setIsEnumType("true");
            _ClassTypeEnumReference      .setName("ClassTypeEnumReference");
            _ClassTypeEnumReference      .setTypeClassName("org.dmd.dms.generated.types.DmcTypeClassTypeEnum");
            _ClassTypeEnumReference      .setDefinedIn(this);

            _DataTypeEnumReference       .addObjectClass(_TypeDefinition);
            _DataTypeEnumReference       .setDescription("This is an internally generated type to allow references to DataTypeEnum objects.");
            _DataTypeEnumReference       .setInternallyGenerated("true");
            _DataTypeEnumReference       .setIsEnumType("true");
            _DataTypeEnumReference       .setName("DataTypeEnumReference");
            _DataTypeEnumReference       .setTypeClassName("org.dmd.dms.generated.types.DmcTypeDataTypeEnum");
            _DataTypeEnumReference       .setDefinedIn(this);

            _Date                        .addObjectClass(_TypeDefinition);
            _Date                        .setDescription("Provide support for Date values.");
            _Date                        .setName("Date");
            _Date                        .setPrimitiveType("java.util.Date");
            _Date                        .setTypeClassName("org.dmd.dmc.types.DmcTypeDate");
            _Date                        .setDefinedIn(this);

            _DebugEnumReference          .addObjectClass(_TypeDefinition);
            _DebugEnumReference          .setDescription("This is an internally generated type to allow references to DebugEnum objects.");
            _DebugEnumReference          .setInternallyGenerated("true");
            _DebugEnumReference          .setIsEnumType("true");
            _DebugEnumReference          .setName("DebugEnumReference");
            _DebugEnumReference          .setTypeClassName("org.dmd.dms.generated.types.DmcTypeDebugEnum");
            _DebugEnumReference          .setDefinedIn(this);

            _DmcObject                   .addObjectClass(_TypeDefinition);
            _DmcObject                   .setDescription("The DmcObject type allows for the storage of raw DmcObjects.");
            _DmcObject                   .setName("DmcObject");
            _DmcObject                   .setPrimitiveType("org.dmd.dmc.DmcObject");
            _DmcObject                   .setTypeClassName("org.dmd.dmc.types.DmcTypeDmcObject");
            _DmcObject                   .setDefinedIn(this);

            _DmsDefinitionReference      .addObjectClass(_TypeDefinition);
            _DmsDefinitionReference      .setDescription("This is an internally generated type to allow references to DmsDefinition objects.");
            _DmsDefinitionReference      .setInternallyGenerated("true");
            _DmsDefinitionReference      .setIsRefType("true");
            _DmsDefinitionReference      .setName("DmsDefinitionReference");
            _DmsDefinitionReference      .setOriginalClass(_DmsDefinition);
            _DmsDefinitionReference      .setTypeClassName("org.dmd.dms.generated.types.DmcTypeDmsDefinitionREF");
            _DmsDefinitionReference      .setWrapperClassName("org.dmd.dms.DmsDefinition");
            _DmsDefinitionReference      .setDefinedIn(this);

            _Double                      .addObjectClass(_TypeDefinition);
            _Double                      .setDescription("Provide support for Double values.");
            _Double                      .setName("Double");
            _Double                      .setTypeClassName("org.dmd.dmc.types.DmcTypeDouble");
            _Double                      .setDefinedIn(this);

            _EnumDefinitionReference     .addObjectClass(_TypeDefinition);
            _EnumDefinitionReference     .setDescription("This is an internally generated type to allow references to EnumDefinition objects.");
            _EnumDefinitionReference     .setInternallyGenerated("true");
            _EnumDefinitionReference     .setIsRefType("true");
            _EnumDefinitionReference     .setName("EnumDefinitionReference");
            _EnumDefinitionReference     .setOriginalClass(_EnumDefinition);
            _EnumDefinitionReference     .setTypeClassName("org.dmd.dms.generated.types.DmcTypeEnumDefinitionREF");
            _EnumDefinitionReference     .setWrapperClassName("org.dmd.dms.EnumDefinition");
            _EnumDefinitionReference     .setDefinedIn(this);

            _EnumValue                   .addObjectClass(_TypeDefinition);
            _EnumValue                   .setName("EnumValue");
            _EnumValue                   .setTypeClassName("org.dmd.dms.types.DmcTypeEnumValue");
            _EnumValue                   .setDefinedIn(this);

            _FilterTypeEnumReference     .addObjectClass(_TypeDefinition);
            _FilterTypeEnumReference     .setDescription("This is an internally generated type to allow references to FilterTypeEnum objects.");
            _FilterTypeEnumReference     .setInternallyGenerated("true");
            _FilterTypeEnumReference     .setIsEnumType("true");
            _FilterTypeEnumReference     .setName("FilterTypeEnumReference");
            _FilterTypeEnumReference     .setTypeClassName("org.dmd.dms.generated.types.DmcTypeFilterTypeEnum");
            _FilterTypeEnumReference     .setDefinedIn(this);

            _Float                       .addObjectClass(_TypeDefinition);
            _Float                       .setDescription("Provide support for Float values.");
            _Float                       .setName("Float");
            _Float                       .setTypeClassName("org.dmd.dmc.types.DmcTypeFloat");
            _Float                       .setDefinedIn(this);

            _Integer                     .addObjectClass(_TypeDefinition);
            _Integer                     .setDescription("Provides support for Integer values.");
            _Integer                     .setName("Integer");
            _Integer                     .setTypeClassName("org.dmd.dmc.types.DmcTypeInteger");
            _Integer                     .setDefinedIn(this);

            _Long                        .addObjectClass(_TypeDefinition);
            _Long                        .setDescription("Provide support for Long values.");
            _Long                        .setName("Long");
            _Long                        .setTypeClassName("org.dmd.dmc.types.DmcTypeLong");
            _Long                        .setDefinedIn(this);

            _Modifier                    .addObjectClass(_TypeDefinition);
            _Modifier                    .setName("Modifier");
            _Modifier                    .setPrimitiveType("org.dmd.dmc.types.Modifier");
            _Modifier                    .setTypeClassName("org.dmd.dmc.types.DmcTypeModifier");
            _Modifier                    .setDefinedIn(this);

            _ModifyTypeEnumReference     .addObjectClass(_TypeDefinition);
            _ModifyTypeEnumReference     .setDescription("This is an internally generated type to allow references to ModifyTypeEnum objects.");
            _ModifyTypeEnumReference     .setInternallyGenerated("true");
            _ModifyTypeEnumReference     .setIsEnumType("true");
            _ModifyTypeEnumReference     .setName("ModifyTypeEnumReference");
            _ModifyTypeEnumReference     .setTypeClassName("org.dmd.dms.generated.types.DmcTypeModifyTypeEnum");
            _ModifyTypeEnumReference     .setDefinedIn(this);

            _SchemaDefinitionReference   .addObjectClass(_TypeDefinition);
            _SchemaDefinitionReference   .setDescription("This is an internally generated type to allow references to SchemaDefinition objects.");
            _SchemaDefinitionReference   .setInternallyGenerated("true");
            _SchemaDefinitionReference   .setIsRefType("true");
            _SchemaDefinitionReference   .setName("SchemaDefinitionReference");
            _SchemaDefinitionReference   .setOriginalClass(_SchemaDefinition);
            _SchemaDefinitionReference   .setTypeClassName("org.dmd.dms.generated.types.DmcTypeSchemaDefinitionREF");
            _SchemaDefinitionReference   .setWrapperClassName("org.dmd.dms.SchemaDefinition");
            _SchemaDefinitionReference   .setDefinedIn(this);

            _String                      .addObjectClass(_TypeDefinition);
            _String                      .setDescription("Provides support for String values.");
            _String                      .setName("String");
            _String                      .setTypeClassName("org.dmd.dmc.types.DmcTypeString");
            _String                      .setDefinedIn(this);

            _TypeDefinitionReference     .addObjectClass(_TypeDefinition);
            _TypeDefinitionReference     .setDescription("This is an internally generated type to allow references to TypeDefinition objects.");
            _TypeDefinitionReference     .setInternallyGenerated("true");
            _TypeDefinitionReference     .setIsRefType("true");
            _TypeDefinitionReference     .setName("TypeDefinitionReference");
            _TypeDefinitionReference     .setOriginalClass(_TypeDefinition);
            _TypeDefinitionReference     .setTypeClassName("org.dmd.dms.generated.types.DmcTypeTypeDefinitionREF");
            _TypeDefinitionReference     .setWrapperClassName("org.dmd.dms.TypeDefinition");
            _TypeDefinitionReference     .setDefinedIn(this);

            _WrapperTypeEnumReference    .addObjectClass(_TypeDefinition);
            _WrapperTypeEnumReference    .setDescription("This is an internally generated type to allow references to WrapperTypeEnum objects.");
            _WrapperTypeEnumReference    .setInternallyGenerated("true");
            _WrapperTypeEnumReference    .setIsEnumType("true");
            _WrapperTypeEnumReference    .setName("WrapperTypeEnumReference");
            _WrapperTypeEnumReference    .setTypeClassName("org.dmd.dms.generated.types.DmcTypeWrapperTypeEnum");
            _WrapperTypeEnumReference    .setDefinedIn(this);

            _ClassTypeEnum               .addObjectClass(_EnumDefinition);
            _ClassTypeEnum               .setDescription("The ClassTypeEnum enumeration indicates the types of classes that can be defined; these definitions are borrowed from LDAP directory parlance. See the individual enum value definitions for details.");
            _ClassTypeEnum               .addEnumValue("0 UNKNOWN Unknown value.");
            _ClassTypeEnum               .addEnumValue("1 ABSTRACT An abstract class is one that provides a base class for a set of related derived classes, but which can't be instantiated by itself.");
            _ClassTypeEnum               .addEnumValue("2 STRUCTURAL A structural class is a class that can be instantiated by itself.");
            _ClassTypeEnum               .addEnumValue("3 AUXILIARY An auxiliary class is basically a collection of additional attributes that can be added to an instance of a STRUCTURAL class; an AUXILIARY class can't be instantiated on its own.");
            _ClassTypeEnum               .addEnumValue("4 EXTENSIBLE An extensible class is basically a free-form class that allows ANY attribute to be set on it.");
            _ClassTypeEnum               .addEnumValue("5 INTERFACE An interface class provides an interface for a set of implementing classes.");
            _ClassTypeEnum               .setName("ClassTypeEnum");
            _ClassTypeEnum               .setNullReturnValue("ClassTypeEnum.UNKNOWN");
            _ClassTypeEnum               .setDefinedIn(this);

            _DataTypeEnum                .addObjectClass(_EnumDefinition);
            _DataTypeEnum                .setDescription("The DataTypeEnum relates to how attributes/classes are dealt with by various persistence mechanism. No inherent behaviour is defined at this level.");
            _DataTypeEnum                .addEnumValue("0 TRANSIENT Indicates that the data is transient i.e. it exists within the application context in which it is used, but is not persisted across application invocations.");
            _DataTypeEnum                .addEnumValue("1 PERSISTENT Indicates that the data is meant to be persistent. What persistence mechanism is used is application dependent.");
            _DataTypeEnum                .setName("DataTypeEnum");
            _DataTypeEnum                .setNullReturnValue("DataTypeEnum.TRANSIENT");
            _DataTypeEnum                .setDefinedIn(this);

            _DebugEnum                   .addObjectClass(_EnumDefinition);
            _DebugEnum                   .setDescription("The DebugEnum indicates the various levels of detailed logging that can be enabled in the DMC framework.");
            _DebugEnum                   .addEnumValue("0 NONE Unknown value.");
            _DebugEnum                   .addEnumValue("1 FILTER Allows fine control over printing of debug messages associated with filtering operations.");
            _DebugEnum                   .addEnumValue("2 SCHEMA Allows fine control over printing of debug messages associated with schema loading operations.");
            _DebugEnum                   .setName("DebugEnum");
            _DebugEnum                   .setNullReturnValue("DebugEnum.NONE");
            _DebugEnum                   .setDefinedIn(this);

            _FilterTypeEnum              .addObjectClass(_EnumDefinition);
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

            _ModifyTypeEnum              .addObjectClass(_EnumDefinition);
            _ModifyTypeEnum              .setDescription("The ModifyTypeEnum indicates the types of modification operations that can be carried out on the attributes of an object.");
            _ModifyTypeEnum              .addEnumValue("0 NONE Indicates that no modify operation was specified.");
            _ModifyTypeEnum              .addEnumValue("1 ADD  The ADD operation adds a new value to a multi-valued attribute.");
            _ModifyTypeEnum              .addEnumValue("2 DEL  The DEL operation removes a value from a multi-valued attribute.");
            _ModifyTypeEnum              .addEnumValue("3 SET  The SET operation sets a new value for a single-valued attribute.");
            _ModifyTypeEnum              .addEnumValue("4 REM  The REM operation removes the entire attribute from the object.");
            _ModifyTypeEnum              .setName("ModifyTypeEnum");
            _ModifyTypeEnum              .setNullReturnValue("ModifyTypeEnum.NONE");
            _ModifyTypeEnum              .setDefinedIn(this);

            _WrapperTypeEnum             .addObjectClass(_EnumDefinition);
            _WrapperTypeEnum             .setDescription("The WrapperTypeEnum indicates which wrapper class you want instantiated when a class of object is recognized during parsing or when an object is pulled from a repository.");
            _WrapperTypeEnum             .addEnumValue("0 NONE Unknown value.");
            _WrapperTypeEnum             .addEnumValue("1 BASE Indicates that you just want to use the generated DMW class.");
            _WrapperTypeEnum             .addEnumValue("2 EXTENDED Indicates that you want to use your own extended class.");
            _WrapperTypeEnum             .setName("WrapperTypeEnum");
            _WrapperTypeEnum             .setNullReturnValue("WrapperTypeEnum.BASE");
            _WrapperTypeEnum             .setDefinedIn(this);

            _FQN                         .addObjectClass(_AttributeDefinition);
            _FQN                         .setDescription("The fully qualified name of a hierarchic object. The exact form of the fqn is application specific.");
            _FQN                         .setName("FQN");
            _FQN                         .setType(_String);
            _FQN                         .setDefinedIn(this);

            _abbrev                      .addObjectClass(_AttributeDefinition);
            _abbrev                      .setDescription("This attribute stores an abbreviated form of the name of an attribute or class. This concept is borrowed from directory technology where shortened name forms are often used as part of distinguished names (DNs).");
            _abbrev                      .setName("abbrev");
            _abbrev                      .setType(_String);
            _abbrev                      .setDefinedIn(this);

            _actionDefList               .addObjectClass(_AttributeDefinition);
            _actionDefList               .setDescription("A list of action definition references.");
            _actionDefList               .setIsMultiValued("true");
            _actionDefList               .setName("actionDefList");
            _actionDefList               .setType(_ActionDefinitionReference);
            _actionDefList               .setDefinedIn(this);

            _actions                     .addObjectClass(_AttributeDefinition);
            _actions                     .setDescription("Indicates the set of actions that are supported by a class of objects.");
            _actions                     .setIsMultiValued("true");
            _actions                     .setName("actions");
            _actions                     .setType(_ActionDefinitionReference);
            _actions                     .setDefinedIn(this);

            _allowedChildren             .addObjectClass(_AttributeDefinition);
            _allowedChildren             .setDescription("Indicates the classes of object that may be children of the current class when objects are created in an instance hierarchy.");
            _allowedChildren             .setIsMultiValued("true");
            _allowedChildren             .setName("allowedChildren");
            _allowedChildren             .setType(_ClassDefinitionReference);
            _allowedChildren             .setDefinedIn(this);

            _allowedParents              .addObjectClass(_AttributeDefinition);
            _allowedParents              .setDescription("Indicates the classes of object that may be parents of the current class when objects are created in an instance hierarchy.");
            _allowedParents              .setIsMultiValued("true");
            _allowedParents              .setName("allowedParents");
            _allowedParents              .setType(_ClassDefinitionReference);
            _allowedParents              .setDefinedIn(this);

            _attachToClass               .addObjectClass(_AttributeDefinition);
            _attachToClass               .setDescription("Indicates the classes of object to which an action is to be attached. This mechanism allows for the extension of a class's behaviour without having to alter the schema of the class involved. This can be viewed as the auxiliary class equivalent for behaviour.");
            _attachToClass               .setIsMultiValued("true");
            _attachToClass               .setName("attachToClass");
            _attachToClass               .setType(_ClassDefinitionReference);
            _attachToClass               .setDefinedIn(this);

            _attributeDefList            .addObjectClass(_AttributeDefinition);
            _attributeDefList            .setDescription("A list of attribute definition references.");
            _attributeDefList            .setIsMultiValued("true");
            _attributeDefList            .setName("attributeDefList");
            _attributeDefList            .setType(_AttributeDefinitionReference);
            _attributeDefList            .setDefinedIn(this);

            _blockWhenLocked             .addObjectClass(_AttributeDefinition);
            _blockWhenLocked             .setDescription("This flag indicates whether or not an Action will be blocked from proceeding if there is a DAF lock on the object against which the action is performed. The default is to block all incoming actions against a locked object. By setting this flag to false, you can allow an action to proceed.");
            _blockWhenLocked             .setName("blockWhenLocked");
            _blockWhenLocked             .setType(_Boolean);
            _blockWhenLocked             .setDefinedIn(this);

            _classDefList                .addObjectClass(_AttributeDefinition);
            _classDefList                .setDescription("A list of class definition references.");
            _classDefList                .setIsMultiValued("true");
            _classDefList                .setName("classDefList");
            _classDefList                .setType(_ClassDefinitionReference);
            _classDefList                .setDefinedIn(this);

            _classType                   .addObjectClass(_AttributeDefinition);
            _classType                   .setDescription("This attribute indicates the type of a class definition.");
            _classType                   .setName("classType");
            _classType                   .setType(_ClassTypeEnumReference);
            _classType                   .setDefinedIn(this);

            _dataType                    .addObjectClass(_AttributeDefinition);
            _dataType                    .setDescription("This attribute indicates the persistence characteristics of an attribute or class of object. How this information is used is application dependent.");
            _dataType                    .setName("dataType");
            _dataType                    .setType(_DataTypeEnumReference);
            _dataType                    .setDefinedIn(this);

            _defFiles                    .addObjectClass(_AttributeDefinition);
            _defFiles                    .setDescription("A list of files that contain the class, attribute and type definitions that comprise a schema.");
            _defFiles                    .setIsMultiValued("true");
            _defFiles                    .setName("defFiles");
            _defFiles                    .setType(_String);
            _defFiles                    .setDefinedIn(this);

            _definedIn                   .addObjectClass(_AttributeDefinition);
            _definedIn                   .setDescription("Indicates the schema in which a type, attribute or class is defined.");
            _definedIn                   .setName("definedIn");
            _definedIn                   .setType(_SchemaDefinitionReference);
            _definedIn                   .setDefinedIn(this);

            _dependsOn                   .addObjectClass(_AttributeDefinition);
            _dependsOn                   .setDescription("A list of schema names.");
            _dependsOn                   .setIsMultiValued("true");
            _dependsOn                   .setName("dependsOn");
            _dependsOn                   .setType(_String);
            _dependsOn                   .setDefinedIn(this);

            _dependsOnRef                .addObjectClass(_AttributeDefinition);
            _dependsOnRef                .setDescription("A list of schema references that are based on the contents of the dependsOn attribute.");
            _dependsOnRef                .setIsMultiValued("true");
            _dependsOnRef                .setName("dependsOnRef");
            _dependsOnRef                .setType(_SchemaDefinitionReference);
            _dependsOnRef                .setDefinedIn(this);

            _derivedClasses              .addObjectClass(_AttributeDefinition);
            _derivedClasses              .setDescription("Indicates the classes that are known to be derived from this class.");
            _derivedClasses              .setIsMultiValued("true");
            _derivedClasses              .setName("derivedClasses");
            _derivedClasses              .setType(_ClassDefinitionReference);
            _derivedClasses              .setDefinedIn(this);

            _derivedFrom                 .addObjectClass(_AttributeDefinition);
            _derivedFrom                 .setDescription("Indicates the abstract or structural class from which this class is derived.");
            _derivedFrom                 .setName("derivedFrom");
            _derivedFrom                 .setType(_ClassDefinitionReference);
            _derivedFrom                 .setDefinedIn(this);

            _description                 .addObjectClass(_AttributeDefinition);
            _description                 .setDescription("The description attribute is used to provide descriptive documentation for schema related definitions. The description is of type XHMTLString which is basically an XML formatted fragment that conforms to the XHTML 1.0 specification. For more information, see the DmdTypeDef for XHTMLString.");
            _description                 .setName("description");
            _description                 .setType(_String);
            _description                 .setDefinedIn(this);

            _dmeClass                    .addObjectClass(_AttributeDefinition);
            _dmeClass                    .setDescription("This attribute indicates just the Dark Matter Extended (DME) class name.");
            _dmeClass                    .setName("dmeClass");
            _dmeClass                    .setType(_String);
            _dmeClass                    .setDefinedIn(this);

            _dmeImport                   .addObjectClass(_AttributeDefinition);
            _dmeImport                   .setDescription("This attribute indicates the full name of the class that extends a DMW class. Dark Matter Extended (DME).");
            _dmeImport                   .setName("dmeImport");
            _dmeImport                   .setType(_String);
            _dmeImport                   .setDefinedIn(this);

            _dmoAuxClass                 .addObjectClass(_AttributeDefinition);
            _dmoAuxClass                 .setDescription("This attribute indicates just the DMO class name e.g. MyClassAUXDMO");
            _dmoAuxClass                 .setName("dmoAuxClass");
            _dmoAuxClass                 .setType(_String);
            _dmoAuxClass                 .setDefinedIn(this);

            _dmoAuxClassImport           .addObjectClass(_AttributeDefinition);
            _dmoAuxClassImport           .setDescription("This attribute indicates the full name of the MyClassAUXDMO class");
            _dmoAuxClassImport           .setName("dmoAuxClassImport");
            _dmoAuxClassImport           .setType(_String);
            _dmoAuxClassImport           .setDefinedIn(this);

            _dmoClass                    .addObjectClass(_AttributeDefinition);
            _dmoClass                    .setDescription("This attribute indicates just the DMO class name e.g. MyClassDMO");
            _dmoClass                    .setName("dmoClass");
            _dmoClass                    .setType(_String);
            _dmoClass                    .setDefinedIn(this);

            _dmoImport                   .addObjectClass(_AttributeDefinition);
            _dmoImport                   .setDescription("This attribute indicates the full name of the generated Dark Matter Object (DMO) class (including package) that is generated for this class. The class will always have DmcObject at the top of its derivation hierarchy.");
            _dmoImport                   .setName("dmoImport");
            _dmoImport                   .setType(_String);
            _dmoImport                   .setDefinedIn(this);

            _dmtClass                    .addObjectClass(_AttributeDefinition);
            _dmtClass                    .setDescription("This attribute indicates just the DmcType class name.");
            _dmtClass                    .setName("dmtClass");
            _dmtClass                    .setType(_String);
            _dmtClass                    .setDefinedIn(this);

            _dmtImport                   .addObjectClass(_AttributeDefinition);
            _dmtImport                   .setDescription("This attribute indicates the full name of the DmcType class used to reference a class. These types are auto generated and named DmcType<classname>REF.");
            _dmtImport                   .setName("dmtImport");
            _dmtImport                   .setType(_String);
            _dmtImport                   .setDefinedIn(this);

            _dmwAuxClass                 .addObjectClass(_AttributeDefinition);
            _dmwAuxClass                 .setDescription("This attribute indicates just the DMO class name e.g. MyClassAUX");
            _dmwAuxClass                 .setName("dmwAuxClass");
            _dmwAuxClass                 .setType(_String);
            _dmwAuxClass                 .setDefinedIn(this);

            _dmwAuxClassImport           .addObjectClass(_AttributeDefinition);
            _dmwAuxClassImport           .setDescription("This attribute indicates the full name of the MyClassAUX class");
            _dmwAuxClassImport           .setName("dmwAuxClassImport");
            _dmwAuxClassImport           .setType(_String);
            _dmwAuxClassImport           .setDefinedIn(this);

            _dmwClass                    .addObjectClass(_AttributeDefinition);
            _dmwClass                    .setDescription("This attribute indicates just the DMW class name, eg MyClassDMW");
            _dmwClass                    .setName("dmwClass");
            _dmwClass                    .setType(_String);
            _dmwClass                    .setDefinedIn(this);

            _dmwImport                   .addObjectClass(_AttributeDefinition);
            _dmwImport                   .setDescription("This attribute indicates the full name of the generated Dark Matter Wrapper (DMW) class (including package) that is wrapped by this class. The class will always be a derived class of DmwWrapperBase.");
            _dmwImport                   .setName("dmwImport");
            _dmwImport                   .setType(_String);
            _dmwImport                   .setDefinedIn(this);

            _dmwPackage                  .addObjectClass(_AttributeDefinition);
            _dmwPackage                  .setDescription("Indicates the package where server related Dark Matter Wrapper classes  were generated for this schema. This is used when we're generating derived wrapper classes.");
            _dmwPackage                  .setName("dmwPackage");
            _dmwPackage                  .setType(_String);
            _dmwPackage                  .setDefinedIn(this);

            _enumDefList                 .addObjectClass(_AttributeDefinition);
            _enumDefList                 .setDescription("A list of EnumDefinitions.");
            _enumDefList                 .setIsMultiValued("true");
            _enumDefList                 .setName("enumDefList");
            _enumDefList                 .setType(_EnumDefinitionReference);
            _enumDefList                 .setDefinedIn(this);

            _enumInt                     .addObjectClass(_AttributeDefinition);
            _enumInt                     .setDescription("The integer value associated with an enumeration value.");
            _enumInt                     .setName("enumInt");
            _enumInt                     .setType(_Integer);
            _enumInt                     .setDefinedIn(this);

            _enumString                  .addObjectClass(_AttributeDefinition);
            _enumString                  .setDescription("The string value associated with an enumeration value.");
            _enumString                  .setName("enumString");
            _enumString                  .setType(_String);
            _enumString                  .setDefinedIn(this);

            _enumValue                   .addObjectClass(_AttributeDefinition);
            _enumValue                   .setDescription("Indicates the set of enum values associated with an enumeration type definition.");
            _enumValue                   .setIsMultiValued("true");
            _enumValue                   .setName("enumValue");
            _enumValue                   .setType(_EnumValue);
            _enumValue                   .setDefinedIn(this);

            _file                        .addObjectClass(_AttributeDefinition);
            _file                        .setDescription("Indicates the file from which a definition was loaded.");
            _file                        .setName("file");
            _file                        .setType(_String);
            _file                        .setDefinedIn(this);

            _generatedFileHeader         .addObjectClass(_AttributeDefinition);
            _generatedFileHeader         .setDescription("The name of file that coresides with the schema.dms file that contains a common header to be applied to all generated code. For instance, you might want a common licensing comment at the top of your generated files.");
            _generatedFileHeader         .setName("generatedFileHeader");
            _generatedFileHeader         .setType(_String);
            _generatedFileHeader         .setDefinedIn(this);

            _getMethod                   .addObjectClass(_AttributeDefinition);
            _getMethod                   .setDescription("If you want to return a value other than the native value class, use the appropriate getType and specify the method you need to call on the DmdValue derived class to return it.");
            _getMethod                   .setName("getMethod");
            _getMethod                   .setType(_String);
            _getMethod                   .setDefinedIn(this);

            _getType                     .addObjectClass(_AttributeDefinition);
            _getType                     .setDescription("Indicates the type of value that will be returned when an attribute value is returned for a type definition; a type definition defines only one get type. This must be a Java class reference and not a primitive type e.g. int.");
            _getType                     .setName("getType");
            _getType                     .setType(_String);
            _getType                     .setDefinedIn(this);

            _helperClassName             .addObjectClass(_AttributeDefinition);
            _helperClassName             .setDescription("This attribute indicates the full name of the generated helper class for  object references i.e. if you had a ClassDefinition X, the framework generates a  types/XREF class which is subsequently used by the DmcTypeXREF class to store references to objects of the defined class.");
            _helperClassName             .setName("helperClassName");
            _helperClassName             .setType(_String);
            _helperClassName             .setDefinedIn(this);

            _implements                  .addObjectClass(_AttributeDefinition);
            _implements                  .setDescription("Indicates the interface class which this class implements.");
            _implements                  .setIsMultiValued("true");
            _implements                  .setName("implements");
            _implements                  .setType(_ClassDefinitionReference);
            _implements                  .setDefinedIn(this);

            _intendedToExtend            .addObjectClass(_AttributeDefinition);
            _intendedToExtend            .setDescription("This attribute can be used on AUXILIARY classes to give a hint about their intended usage. For example, if you were extending schema definitions with some or your  own attributes for some purpose, your auxliary class could have intendedToExtend ClassDefinition.");
            _intendedToExtend            .setIsMultiValued("true");
            _intendedToExtend            .setName("intendedToExtend");
            _intendedToExtend            .setType(_ClassDefinitionReference);
            _intendedToExtend            .setDefinedIn(this);

            _internalTypeDefList         .addObjectClass(_AttributeDefinition);
            _internalTypeDefList         .setDescription("A list of type definitions that were generated internally to represent enums and object references.");
            _internalTypeDefList         .setIsMultiValued("true");
            _internalTypeDefList         .setName("internalTypeDefList");
            _internalTypeDefList         .setType(_TypeDefinitionReference);
            _internalTypeDefList         .setDefinedIn(this);

            _internalTypeRef             .addObjectClass(_AttributeDefinition);
            _internalTypeRef             .setDescription("Indicates the internal type that's generated for all ClassDefinitions. This is set automatically on ClassDefinitions as they are parsed.");
            _internalTypeRef             .setName("internalTypeRef");
            _internalTypeRef             .setType(_TypeDefinitionReference);
            _internalTypeRef             .setDefinedIn(this);

            _internallyGenerated         .addObjectClass(_AttributeDefinition);
            _internallyGenerated         .setDescription("This flag indicates if the associated definition was internally generated. This is the case for TypeDefinitions generated for ClassDefinitions and EnumDefinitions that allow for references to these objects.");
            _internallyGenerated         .setName("internallyGenerated");
            _internallyGenerated         .setType(_Boolean);
            _internallyGenerated         .setDefinedIn(this);

            _isDefaultValue              .addObjectClass(_AttributeDefinition);
            _isDefaultValue              .setDescription("This flag is set to true to indicate the default value for a type (e.g. an enum).");
            _isDefaultValue              .setName("isDefaultValue");
            _isDefaultValue              .setType(_Boolean);
            _isDefaultValue              .setDefinedIn(this);

            _isEnumType                  .addObjectClass(_AttributeDefinition);
            _isEnumType                  .setDescription("This flag is set to true for type definitions that define eneumerations.");
            _isEnumType                  .setName("isEnumType");
            _isEnumType                  .setType(_Boolean);
            _isEnumType                  .setDefinedIn(this);

            _isGetAction                 .addObjectClass(_AttributeDefinition);
            _isGetAction                 .setDescription("This flag indicates if an Action is merely a data retrieval (get) Action. Actions that are flagged with this attribute set to true will be executable even when the server is in a read-only mode because they don't actually alter data. One example of this is the getAllowedOperations() action on the SecurityBranch.");
            _isGetAction                 .setName("isGetAction");
            _isGetAction                 .setType(_Boolean);
            _isGetAction                 .setDefinedIn(this);

            _isMultiValued               .addObjectClass(_AttributeDefinition);
            _isMultiValued               .setDescription("This flag is set to true to indicate that an attribute is multi-valued.");
            _isMultiValued               .setName("isMultiValued");
            _isMultiValued               .setType(_Boolean);
            _isMultiValued               .setDefinedIn(this);

            _isNamedBy                   .addObjectClass(_AttributeDefinition);
            _isNamedBy                   .setDescription("Indicates the attribute by which an object of some class is named. When this attribute is supplied in a ClassDefinition, the generated DMO class will indicate that it implements the DmcNamedObjectIF and its getObjectName() method will return the value of the isNamedBy attribute.");
            _isNamedBy                   .setName("isNamedBy");
            _isNamedBy                   .setType(_AttributeDefinitionReference);
            _isNamedBy                   .setDefinedIn(this);

            _isRefType                   .addObjectClass(_AttributeDefinition);
            _isRefType                   .setDescription("This flag is set to true for type definitions that refer to other objects.");
            _isRefType                   .setName("isRefType");
            _isRefType                   .setType(_Boolean);
            _isRefType                   .setDefinedIn(this);

            _isSchemaRtype               .addObjectClass(_AttributeDefinition);
            _isSchemaRtype               .setDescription("This flag is set to true for type definitions that refer to other schema-related definitions.");
            _isSchemaRtype               .setName("isSchemaRtype");
            _isSchemaRtype               .setType(_Boolean);
            _isSchemaRtype               .setDefinedIn(this);

            _isTransportable             .addObjectClass(_AttributeDefinition);
            _isTransportable             .setDescription("This attribute indicates whether or not the object defined by a ClassDefinition is meant to be transportable across an RPC interface when object reference attributes refer to it. If set to true, the class will automatically have its reference type use the DmcNameObjectTransportableREF as its base. Otherwise, it will use DmcNameObjectNotransportableREF.");
            _isTransportable             .setName("isTransportable");
            _isTransportable             .setType(_Boolean);
            _isTransportable             .setDefinedIn(this);

            _javaClass                   .addObjectClass(_AttributeDefinition);
            _javaClass                   .setDescription("This attribute indicates the full name of the class (including package) that should be instantiated when an instance of an object is created via the DmdClassDef.newInstance() function. The class must be a derived class of DmdGenericObject.");
            _javaClass                   .setName("javaClass");
            _javaClass                   .setType(_String);
            _javaClass                   .setDefinedIn(this);

            _javaPackage                 .addObjectClass(_AttributeDefinition);
            _javaPackage                 .setDescription("The package to be imported when using a particular value type.");
            _javaPackage                 .setName("javaPackage");
            _javaPackage                 .setType(_String);
            _javaPackage                 .setDefinedIn(this);

            _lineNumber                  .addObjectClass(_AttributeDefinition);
            _lineNumber                  .setDescription("Indicates the line number of the file from which a definition was loaded.");
            _lineNumber                  .setName("lineNumber");
            _lineNumber                  .setType(_Integer);
            _lineNumber                  .setDefinedIn(this);

            _may                         .addObjectClass(_AttributeDefinition);
            _may                         .setDescription("Indicates the set of attributes that an instance of a class MAY have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
            _may                         .setIsMultiValued("true");
            _may                         .setName("may");
            _may                         .setType(_AttributeDefinitionReference);
            _may                         .setDefinedIn(this);

            _mayParm                     .addObjectClass(_AttributeDefinition);
            _mayParm                     .setDescription("Indicates the set of parameters that an action MAY have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
            _mayParm                     .setIsMultiValued("true");
            _mayParm                     .setName("mayParm");
            _mayParm                     .setType(_AttributeDefinitionReference);
            _mayParm                     .setDefinedIn(this);

            _mayReturn                   .addObjectClass(_AttributeDefinition);
            _mayReturn                   .setDescription("Indicates the set of return vals that may be returned as part of a particular action response message.");
            _mayReturn                   .setIsMultiValued("true");
            _mayReturn                   .setName("mayReturn");
            _mayReturn                   .setType(_AttributeDefinitionReference);
            _mayReturn                   .setDefinedIn(this);

            _maySendProgress             .addObjectClass(_AttributeDefinition);
            _maySendProgress             .setDescription("This flag is used to indicate if a particular request might result in progress indications being sent. Although primarily intended as a documentation aspect, this flag is used within the TL1 subsystem to allow for the creation of a response handler for node requests that send progress text.");
            _maySendProgress             .setName("maySendProgress");
            _maySendProgress             .setType(_Boolean);
            _maySendProgress             .setDefinedIn(this);

            _must                        .addObjectClass(_AttributeDefinition);
            _must                        .setDescription("Indicates the set of attributes that an instance of a class MUST have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
            _must                        .setIsMultiValued("true");
            _must                        .setName("must");
            _must                        .setType(_AttributeDefinitionReference);
            _must                        .setDefinedIn(this);

            _mustParm                    .addObjectClass(_AttributeDefinition);
            _mustParm                    .setDescription("Indicates the set of parameters that an action MUST have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
            _mustParm                    .setIsMultiValued("true");
            _mustParm                    .setName("mustParm");
            _mustParm                    .setType(_AttributeDefinitionReference);
            _mustParm                    .setDefinedIn(this);

            _mustReturn                  .addObjectClass(_AttributeDefinition);
            _mustReturn                  .setDescription("Indicates the set of return vals that must be returned as part of a particular action response message.");
            _mustReturn                  .setIsMultiValued("true");
            _mustReturn                  .setName("mustReturn");
            _mustReturn                  .setType(_AttributeDefinitionReference);
            _mustReturn                  .setDefinedIn(this);

            _name                        .addObjectClass(_AttributeDefinition);
            _name                        .setDescription("The name attribute is used to store a single string token that represents a unique name for an object. A name should be composed of characters in the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All names must start with a character.");
            _name                        .setName("name");
            _name                        .setType(_String);
            _name                        .setDefinedIn(this);

            _namingAttribute             .addObjectClass(_AttributeDefinition);
            _namingAttribute             .setDescription("This attribute indicates the attribute that is used to name an object instance. The exact manner in which the naming attribute is used is specific to the implementation of the HierarchicObject derived class. <p> For instance, the DotNamedObject simply uses the value of the naming attribute and separates the attribute values with periods e.g. grandparent.parent.child. <p> For LDAP objects when a hierarchic name is composed for an object, the class name plus the value of the naming attribute (type:value) is used to create the name of an object. It is best if the naming attribute value is created by the application; it shouldn't be based on any user configurable value.");
            _namingAttribute             .setName("namingAttribute");
            _namingAttribute             .setType(_AttributeDefinitionReference);
            _namingAttribute             .setDefinedIn(this);

            _nullReturnValue             .addObjectClass(_AttributeDefinition);
            _nullReturnValue             .setDescription("This attribute is used in TypeDefinitions to indicate the value that should be returned when an attribute of the specified type doesn't exist in the object. For example, Boolean values are defined to return false when they aren't actually set on an object. This just gives a convenient mechanism to provide a default value for non-existent attribute values.");
            _nullReturnValue             .setName("nullReturnValue");
            _nullReturnValue             .setType(_String);
            _nullReturnValue             .setDefinedIn(this);

            _objectClass                 .addObjectClass(_AttributeDefinition);
            _objectClass                 .setDescription("Used to indicate the classes that an object instance supports.");
            _objectClass                 .setIsMultiValued("true");
            _objectClass                 .setName("objectClass");
            _objectClass                 .setType(_ClassDefinitionReference);
            _objectClass                 .setDefinedIn(this);

            _obsoleteVersion             .addObjectClass(_AttributeDefinition);
            _obsoleteVersion             .setDescription("This indicates the version at which something became obsolete. Generally speaking you shouldn't ever delete definitions for products that have been released to the field, this may break backwards compatibility. Instead, you should mark them as obsolete.");
            _obsoleteVersion             .setName("obsoleteVersion");
            _obsoleteVersion             .setType(_String);
            _obsoleteVersion             .setDefinedIn(this);

            _originalClass               .addObjectClass(_AttributeDefinition);
            _originalClass               .setDescription("Refers to the class that an internally generated type represents.");
            _originalClass               .setName("originalClass");
            _originalClass               .setType(_ClassDefinitionReference);
            _originalClass               .setDefinedIn(this);

            _parentFQN                   .addObjectClass(_AttributeDefinition);
            _parentFQN                   .setDescription("The name of a hierarchic object's parent.");
            _parentFQN                   .setName("parentFQN");
            _parentFQN                   .setType(_String);
            _parentFQN                   .setDefinedIn(this);

            _primitiveType               .addObjectClass(_AttributeDefinition);
            _primitiveType               .setDescription("The primitiveType indicates the underlying type of a DmcType.");
            _primitiveType               .setName("primitiveType");
            _primitiveType               .setType(_String);
            _primitiveType               .setDefinedIn(this);

            _schemaExtension             .addObjectClass(_AttributeDefinition);
            _schemaExtension             .setDescription("The fully qualified name of a class that extends the schema management capabilities of the SchemaManager. the class must have a zero arg constructor and implement the SchemaExtensionIF.");
            _schemaExtension             .setIsMultiValued("true");
            _schemaExtension             .setName("schemaExtension");
            _schemaExtension             .setType(_String);
            _schemaExtension             .setDefinedIn(this);

            _schemaPackage               .addObjectClass(_AttributeDefinition);
            _schemaPackage               .setDescription("Indicates the package that this schema will be part of when its code is generated using the dafutil tool.");
            _schemaPackage               .setName("schemaPackage");
            _schemaPackage               .setType(_String);
            _schemaPackage               .setDefinedIn(this);

            _secure                      .addObjectClass(_AttributeDefinition);
            _secure                      .setDescription("This attribute indicates whether or not the attribute should be encrypted before being transported over the wire or stored in a file or repository");
            _secure                      .setName("secure");
            _secure                      .setType(_Boolean);
            _secure                      .setDefinedIn(this);

            _setType                     .addObjectClass(_AttributeDefinition);
            _setType                     .setDescription("Indicates the set interfaces that can be supported by a particular type. The createmeta tool uses this attribute to generate all possible set interfaces for the DmdGenericAttribute.");
            _setType                     .setIsMultiValued("true");
            _setType                     .setName("setType");
            _setType                     .setType(_String);
            _setType                     .setDefinedIn(this);

            _type                        .addObjectClass(_AttributeDefinition);
            _type                        .setDescription("Indicates the type of an attribute. The value is the name of any previously defined DmdTypeDef definition. When accessed in Java, this is a reference to a DmdTypeDef object.");
            _type                        .setName("type");
            _type                        .setType(_TypeDefinitionReference);
            _type                        .setDefinedIn(this);

            _typeClassName               .addObjectClass(_AttributeDefinition);
            _typeClassName               .setDescription("This is the fully qualified name of the class derived from DmcAttribute that provides management of a particular type of attribute value. For instance, the type class that handles String attributes  is org.dmd.dmc.types.DmcTypeString");
            _typeClassName               .setName("typeClassName");
            _typeClassName               .setType(_String);
            _typeClassName               .setDefinedIn(this);

            _typeDefList                 .addObjectClass(_AttributeDefinition);
            _typeDefList                 .setDescription("A list of type definition references.");
            _typeDefList                 .setIsMultiValued("true");
            _typeDefList                 .setName("typeDefList");
            _typeDefList                 .setType(_TypeDefinitionReference);
            _typeDefList                 .setDefinedIn(this);

            _useWrapperType              .addObjectClass(_AttributeDefinition);
            _useWrapperType              .setDescription("Indicates whether you want to use the generated DMW wrapper or the extended wrapper you've created yourself.");
            _useWrapperType              .setName("useWrapperType");
            _useWrapperType              .setType(_WrapperTypeEnumReference);
            _useWrapperType              .setDefinedIn(this);

            _usesInterface               .addObjectClass(_AttributeDefinition);
            _usesInterface               .setDescription("This is a hack for now to allow for the inclusion of an  interface on a class; it should be the fully qualified name of the interface. The interface shouldn't require any method implementations.");
            _usesInterface               .setName("usesInterface");
            _usesInterface               .setType(_String);
            _usesInterface               .setDefinedIn(this);

            _valueClass                  .addObjectClass(_AttributeDefinition);
            _valueClass                  .setDescription("The package to be imported when using the values of a particular type definition.");
            _valueClass                  .setName("valueClass");
            _valueClass                  .setType(_String);
            _valueClass                  .setDefinedIn(this);

            _wrapperClassName            .addObjectClass(_AttributeDefinition);
            _wrapperClassName            .setDescription("This is the fully qualified name of the wrapper class derived from DmcWrapperBase that wraps a DMO. This is used when generating object reference classes associated with ClassDefinitions This actually aligns to the javaClass of the ClassDefinition for which we're generating the reference classes.");
            _wrapperClassName            .setName("wrapperClassName");
            _wrapperClassName            .setType(_String);
            _wrapperClassName            .setDefinedIn(this);

            _ActionDefinition            .addObjectClass(_ClassDefinition);
            _ActionDefinition            .setClassType(ClassTypeEnum.STRUCTURAL);
            _ActionDefinition            .setDerivedFrom(_DmsDefinition);
            _ActionDefinition            .setDescription("This class is used to define the actions that may be triggered on an object.");
            _ActionDefinition            .setDmoImport("org.dmd.dms.generated.dmo.ActionDefinitionDMO");
            _ActionDefinition            .setIsNamedBy(_name);
            _ActionDefinition            .setJavaClass("org.dmd.dms.ActionDefinition");
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
            _ActionDefinition            .addMust(_description);
            _ActionDefinition            .setName("ActionDefinition");
            _ActionDefinition            .setDefinedIn(this);

            _AttributeDefinition         .addObjectClass(_ClassDefinition);
            _AttributeDefinition         .setClassType(ClassTypeEnum.STRUCTURAL);
            _AttributeDefinition         .setDerivedFrom(_DmsDefinition);
            _AttributeDefinition         .setDescription("This class is used to define attributes to be used as part of a class definition.");
            _AttributeDefinition         .setDmoImport("org.dmd.dms.generated.dmo.AttributeDefinitionDMO");
            _AttributeDefinition         .setIsNamedBy(_name);
            _AttributeDefinition         .setJavaClass("org.dmd.dms.AttributeDefinition");
            _AttributeDefinition         .addMay(_isMultiValued);
            _AttributeDefinition         .addMay(_abbrev);
            _AttributeDefinition         .addMay(_obsoleteVersion);
            _AttributeDefinition         .addMay(_secure);
            _AttributeDefinition         .addMay(_dataType);
            _AttributeDefinition         .addMust(_name);
            _AttributeDefinition         .addMust(_type);
            _AttributeDefinition         .addMust(_description);
            _AttributeDefinition         .setName("AttributeDefinition");
            _AttributeDefinition         .setDefinedIn(this);

            _ClassDefinition             .addObjectClass(_ClassDefinition);
            _ClassDefinition             .setClassType(ClassTypeEnum.STRUCTURAL);
            _ClassDefinition             .setDerivedFrom(_DmsDefinition);
            _ClassDefinition             .setDescription("This class provides the basic mechanism to define new classes for a schema.");
            _ClassDefinition             .setDmoImport("org.dmd.dms.generated.dmo.ClassDefinitionDMO");
            _ClassDefinition             .setIsNamedBy(_name);
            _ClassDefinition             .setJavaClass("org.dmd.dms.ClassDefinition");
            _ClassDefinition             .addMay(_derivedFrom);
            _ClassDefinition             .addMay(_must);
            _ClassDefinition             .addMay(_may);
            _ClassDefinition             .addMay(_isNamedBy);
            _ClassDefinition             .addMay(_javaClass);
            _ClassDefinition             .addMay(_intendedToExtend);
            _ClassDefinition             .addMay(_usesInterface);
            _ClassDefinition             .addMay(_useWrapperType);
            _ClassDefinition             .addMay(_allowedParents);
            _ClassDefinition             .addMay(_allowedChildren);
            _ClassDefinition             .addMay(_implements);
            _ClassDefinition             .addMay(_abbrev);
            _ClassDefinition             .addMay(_obsoleteVersion);
            _ClassDefinition             .addMay(_isTransportable);
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
            _ClassDefinition             .addMay(_dmtClass);
            _ClassDefinition             .addMay(_dmoAuxClass);
            _ClassDefinition             .addMay(_dmoAuxClassImport);
            _ClassDefinition             .addMay(_dmwAuxClass);
            _ClassDefinition             .addMay(_dmwAuxClassImport);
            _ClassDefinition             .addMay(_dataType);
            _ClassDefinition             .addMust(_name);
            _ClassDefinition             .addMust(_description);
            _ClassDefinition             .addMust(_classType);
            _ClassDefinition             .setName("ClassDefinition");
            _ClassDefinition             .setDefinedIn(this);

            _DmsDefinition               .addObjectClass(_ClassDefinition);
            _DmsDefinition               .setClassType(ClassTypeEnum.ABSTRACT);
            _DmsDefinition               .setDerivedFrom(_DmwWrapper);
            _DmsDefinition               .setDescription("The DmsDefinition class provides a common base for all definition classes.");
            _DmsDefinition               .setDmoImport("org.dmd.dms.generated.dmo.DmsDefinitionDMO");
            _DmsDefinition               .setIsNamedBy(_name);
            _DmsDefinition               .setJavaClass("org.dmd.dms.DmsDefinition");
            _DmsDefinition               .addMay(_definedIn);
            _DmsDefinition               .addMay(_file);
            _DmsDefinition               .addMay(_lineNumber);
            _DmsDefinition               .addMust(_name);
            _DmsDefinition               .setName("DmsDefinition");
            _DmsDefinition               .setDefinedIn(this);

            _DmwWrapper                  .addObjectClass(_ClassDefinition);
            _DmwWrapper                  .setClassType(ClassTypeEnum.ABSTRACT);
            _DmwWrapper                  .setDescription("The DmwWrapper class is the basis for all server-side objects that wrapper Dark Matter Obects and extend them with behaviour");
            _DmwWrapper                  .setDmoImport("org.dmd.dms.generated.dmo.DmwWrapperDMO");
            _DmwWrapper                  .setJavaClass("org.dmd.dms.DmwWrapper");
            _DmwWrapper                  .addMust(_objectClass);
            _DmwWrapper                  .setName("DmwWrapper");
            _DmwWrapper                  .setDefinedIn(this);

            _EnumDefinition              .addObjectClass(_ClassDefinition);
            _EnumDefinition              .setClassType(ClassTypeEnum.STRUCTURAL);
            _EnumDefinition              .setDerivedFrom(_DmsDefinition);
            _EnumDefinition              .setDescription("The EnumDefinition allows for the definition of real Java enums that provide inherent mapping of the string and integer values of the enum into actual enum values. Once defined, EnumDefinitions can be used where ever you would use a TypeDefinition name i.e. they can be used in the type attribute of AttributeDefinitions.");
            _EnumDefinition              .setDmoImport("org.dmd.dms.generated.dmo.EnumDefinitionDMO");
            _EnumDefinition              .setIsNamedBy(_name);
            _EnumDefinition              .setJavaClass("org.dmd.dms.EnumDefinition");
            _EnumDefinition              .addMay(_description);
            _EnumDefinition              .addMay(_nullReturnValue);
            _EnumDefinition              .addMust(_name);
            _EnumDefinition              .addMust(_enumValue);
            _EnumDefinition              .setName("EnumDefinition");
            _EnumDefinition              .setDefinedIn(this);

            _SchemaDefinition            .addObjectClass(_ClassDefinition);
            _SchemaDefinition            .setClassType(ClassTypeEnum.STRUCTURAL);
            _SchemaDefinition            .setDerivedFrom(_DmsDefinition);
            _SchemaDefinition            .setDescription("This class is used to define a schema as a discrete, nameable entity.");
            _SchemaDefinition            .setDmoImport("org.dmd.dms.generated.dmo.SchemaDefinitionDMO");
            _SchemaDefinition            .setIsNamedBy(_name);
            _SchemaDefinition            .setJavaClass("org.dmd.dms.SchemaDefinition");
            _SchemaDefinition            .addMay(_dependsOn);
            _SchemaDefinition            .addMay(_defFiles);
            _SchemaDefinition            .addMay(_generatedFileHeader);
            _SchemaDefinition            .addMay(_dmwPackage);
            _SchemaDefinition            .addMay(_schemaExtension);
            _SchemaDefinition            .addMay(_classDefList);
            _SchemaDefinition            .addMay(_typeDefList);
            _SchemaDefinition            .addMay(_internalTypeDefList);
            _SchemaDefinition            .addMay(_attributeDefList);
            _SchemaDefinition            .addMay(_actionDefList);
            _SchemaDefinition            .addMay(_enumDefList);
            _SchemaDefinition            .addMay(_dependsOnRef);
            _SchemaDefinition            .addMust(_name);
            _SchemaDefinition            .addMust(_description);
            _SchemaDefinition            .addMust(_schemaPackage);
            _SchemaDefinition            .setName("SchemaDefinition");
            _SchemaDefinition            .setDefinedIn(this);

            _TypeDefinition              .addObjectClass(_ClassDefinition);
            _TypeDefinition              .setClassType(ClassTypeEnum.STRUCTURAL);
            _TypeDefinition              .setDerivedFrom(_DmsDefinition);
            _TypeDefinition              .setDescription("The TypeDefinition is used to define the types of attributes that can be used as the basis for attribute values. The name of the type definition should be the same as the actual Java class that is used to store the value of an attribute e.g. the name of the type used to store strings is String. The typeClassName is the fully qualified name of the class derived from DmcAttribute that stores this type of value; they are always, by conventional, named DmcTypeXXX. <P> TypeDefinitions are automatically generated internally for ClassDefinitions and EnumDefinitions so that these objects can be referred to via the type attribute of AttributeDefinitions. These definitions are marked as internallyGenerated.");
            _TypeDefinition              .setDmoImport("org.dmd.dms.generated.dmo.TypeDefinitionDMO");
            _TypeDefinition              .setIsNamedBy(_name);
            _TypeDefinition              .setJavaClass("org.dmd.dms.TypeDefinition");
            _TypeDefinition              .addMay(_nullReturnValue);
            _TypeDefinition              .addMay(_wrapperClassName);
            _TypeDefinition              .addMay(_primitiveType);
            _TypeDefinition              .addMay(_internallyGenerated);
            _TypeDefinition              .addMay(_isEnumType);
            _TypeDefinition              .addMay(_isRefType);
            _TypeDefinition              .addMay(_helperClassName);
            _TypeDefinition              .addMay(_originalClass);
            _TypeDefinition              .addMust(_name);
            _TypeDefinition              .addMust(_typeClassName);
            _TypeDefinition              .addMust(_description);
            _TypeDefinition              .setName("TypeDefinition");
            _TypeDefinition              .setDefinedIn(this);

        // Add the definitions to the schema object
        // Generated from:  org.dmd.dms.meta.MetaGenerator.dumpMetaSchema(MetaGenerator.java:571)
            this.addClassDefList(_DmwWrapper);
            this.addClassDefList(_DmsDefinition);
            this.addClassDefList(_ClassDefinition);
            this.addClassDefList(_EnumDefinition);
            this.addClassDefList(_TypeDefinition);
            this.addClassDefList(_AttributeDefinition);
            this.addClassDefList(_ActionDefinition);
            this.addClassDefList(_SchemaDefinition);
            this.addEnumDefList(_ClassTypeEnum);
            this.addEnumDefList(_ModifyTypeEnum);
            this.addEnumDefList(_DataTypeEnum);
            this.addEnumDefList(_FilterTypeEnum);
            this.addEnumDefList(_DebugEnum);
            this.addEnumDefList(_WrapperTypeEnum);
            this.addTypeDefList(_String);
            this.addTypeDefList(_DmcObject);
            this.addTypeDefList(_Integer);
            this.addTypeDefList(_Float);
            this.addTypeDefList(_Double);
            this.addTypeDefList(_Long);
            this.addTypeDefList(_Date);
            this.addTypeDefList(_Boolean);
            this.addTypeDefList(_EnumValue);
            this.addTypeDefList(_Modifier);
            this.addTypeDefList(_ActionDefinitionReference);
            this.addTypeDefList(_AttributeDefinitionReference);
            this.addTypeDefList(_ClassDefinitionReference);
            this.addTypeDefList(_DmsDefinitionReference);
            this.addTypeDefList(_EnumDefinitionReference);
            this.addTypeDefList(_SchemaDefinitionReference);
            this.addTypeDefList(_TypeDefinitionReference);
            this.addTypeDefList(_ClassTypeEnumReference);
            this.addTypeDefList(_DataTypeEnumReference);
            this.addTypeDefList(_DebugEnumReference);
            this.addTypeDefList(_FilterTypeEnumReference);
            this.addTypeDefList(_ModifyTypeEnumReference);
            this.addTypeDefList(_WrapperTypeEnumReference);
            this.addAttributeDefList(_name);
            this.addAttributeDefList(_typeClassName);
            this.addAttributeDefList(_wrapperClassName);
            this.addAttributeDefList(_nullReturnValue);
            this.addAttributeDefList(_primitiveType);
            this.addAttributeDefList(_abbrev);
            this.addAttributeDefList(_classType);
            this.addAttributeDefList(_dataType);
            this.addAttributeDefList(_isMultiValued);
            this.addAttributeDefList(_isRefType);
            this.addAttributeDefList(_isSchemaRtype);
            this.addAttributeDefList(_isEnumType);
            this.addAttributeDefList(_isDefaultValue);
            this.addAttributeDefList(_description);
            this.addAttributeDefList(_type);
            this.addAttributeDefList(_internalTypeRef);
            this.addAttributeDefList(_derivedFrom);
            this.addAttributeDefList(_intendedToExtend);
            this.addAttributeDefList(_implements);
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
            this.addAttributeDefList(_allowedChildren);
            this.addAttributeDefList(_namingAttribute);
            this.addAttributeDefList(_FQN);
            this.addAttributeDefList(_parentFQN);
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
            this.addAttributeDefList(_schemaExtension);
            this.addAttributeDefList(_objectClass);
            this.setName("metaSchema");
            this.setDescription("The metaSchema schema defines the elements used to define schemas.");
            this.setSchemaPackage("org.dmd.dms");
            this.setDmwPackage("org.dmd.dms");
            this.addObjectClass(_SchemaDefinition);
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }

    }

}

