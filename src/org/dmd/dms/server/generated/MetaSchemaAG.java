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
package org.dmd.dms.server.generated;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpMetaSchemaAG(MetaSchemaFormatter.java:65)
import org.dmd.core.feedback.DMFeedbackSet;         // To handle potential value exceptions. - (MetaSchemaFormatter.java:56)
import org.dmd.dms.server.extended.*;               // Access to meta schema extended classes - (MetaSchemaFormatter.java:57)
import org.dmd.dms.shared.generated.dmo.*;          // Access to meta schema DMOs - (MetaSchemaFormatter.java:58)



/**
  * This class creates the basic definitions that allow for the definition of schemas.
  * Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpMetaSchemaAG(MetaSchemaFormatter.java:69)
  */
abstract public class MetaSchemaAG extends SchemaDefinition {
    public static SchemaDefinition    _metaSchema;

    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpStaticDefinitions(MetaSchemaFormatter.java:130)
    public static ClassDefinition     _ActionTriggerInfo;
    public static ClassDefinition     _DSDefinition;
    public static ClassDefinition     _DmsDefinition;
    public static ClassDefinition     _DSDefinitionModule;
    public static ClassDefinition     _ClassDefinition;
    public static ClassDefinition     _EnumDefinition;
    public static ClassDefinition     _TypeDefinition;
    public static ClassDefinition     _ComplexTypeDefinition;
    public static ClassDefinition     _ExtendedReferenceTypeDefinition;
    public static ClassDefinition     _AttributeDefinition;
    public static ClassDefinition     _SliceDefinition;
    public static ClassDefinition     _ActionDefinition;
    public static ClassDefinition     _SchemaDefinition;
    public static ClassDefinition     _RuleCategory;
    public static ClassDefinition     _RuleDefinition;
    public static ClassDefinition     _RuleData;
    public static ClassDefinition     _Dependency;
    public static ClassDefinition     _DependencyImplementation;
    public static ClassDefinition     _RunContext;
    public static ClassDefinition     _Concinnity;

    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpStaticDefinitions(MetaSchemaFormatter.java:137)
    public static EnumDefinition      _ClassTypeEnum;
    public static EnumDefinition      _ModifyTypeEnum;
    public static EnumDefinition      _OperationalContextEnum;
    public static EnumDefinition      _RuleTypeEnum;
    public static EnumDefinition      _DataTypeEnum;
    public static EnumDefinition      _ValueTypeEnum;
    public static EnumDefinition      _BaseTypeEnum;
    public static EnumDefinition      _FilterTypeEnum;
    public static EnumDefinition      _DebugEnum;
    public static EnumDefinition      _WrapperTypeEnum;
    public static EnumDefinition      _OriginalTypeEnum;

    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpStaticDefinitions(MetaSchemaFormatter.java:143)
    public static TypeDefinition      _String;
    public static TypeDefinition      _DmcObject;
    public static TypeDefinition      _ClassInfoRef;
    public static TypeDefinition      _NameContainer;
    public static TypeDefinition      _FilterContainer;
    public static TypeDefinition      _AttributeID;
    public static TypeDefinition      _Integer;
    public static TypeDefinition      _Float;
    public static TypeDefinition      _Double;
    public static TypeDefinition      _Long;
    public static TypeDefinition      _Short;
    public static TypeDefinition      _Byte;
    public static TypeDefinition      _Date;
    public static TypeDefinition      _Boolean;
    public static TypeDefinition      _EnumValue;
    public static TypeDefinition      _Modifier;
    public static TypeDefinition      _StringName;
    public static TypeDefinition      _DefinitionName;
    public static TypeDefinition      _CamelCaseName;
    public static TypeDefinition      _RuleName;
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpStaticDefinitions(MetaSchemaFormatter.java:157)
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
    public static AttributeDefinition _msgKey;
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
    public static AttributeDefinition _ruleParam;
    public static AttributeDefinition _preserveNewlines;
    public static AttributeDefinition _msgParam;
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
    public static AttributeDefinition _example;
    public static AttributeDefinition _namingAttribute;
    public static AttributeDefinition _attachToClass;
    public static AttributeDefinition _dependsOn;
    public static AttributeDefinition _dependsOnRef;
    public static AttributeDefinition _defFiles;
    public static AttributeDefinition _enumInt;
    public static AttributeDefinition _enumString;
    public static AttributeDefinition _isGetAction;
    public static AttributeDefinition _obsoleteVersion;
    public static AttributeDefinition _file;
    public static AttributeDefinition _lineNumber;
    public static AttributeDefinition _maySendProgress;
    public static AttributeDefinition _internallyGenerated;
    public static AttributeDefinition _secure;
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
    public static AttributeDefinition _extendedClass;
    public static AttributeDefinition _dotName;
    public static AttributeDefinition _altType;
    public static AttributeDefinition _altTypeImport;
    public static AttributeDefinition _selectAttribute;
    public static AttributeDefinition _sliceDefList;
    public static AttributeDefinition _requiredPart;
    public static AttributeDefinition _optionalPart;
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
    public static AttributeDefinition _immediateHalt;
    public static AttributeDefinition _ruleTitle;
    public static AttributeDefinition _ruleCategory;
    public static AttributeDefinition _ruleCategoryID;
    public static AttributeDefinition _isExtensible;
    public static AttributeDefinition _ruleCategoryList;
    public static AttributeDefinition _ruleDefinitionList;
    public static AttributeDefinition _ruleDefinition;
    public static AttributeDefinition _dependency;
    public static AttributeDefinition _dependencies;
    public static AttributeDefinition _instantiation;
    public static AttributeDefinition _runContext;
    public static AttributeDefinition _useInterface;
    public static AttributeDefinition _classInfoFromParam;
    public static AttributeDefinition _ruleImport;
    public static AttributeDefinition _ruleName;
    public static AttributeDefinition _applyToClass;
    public static AttributeDefinition _attributeInfoFromParam;
    public static AttributeDefinition _ruleDataList;
    public static AttributeDefinition _applyToAttribute;
    public static AttributeDefinition _isDSDefinition;
    public static AttributeDefinition _stringName;
    public static AttributeDefinition _fileExtension;
    public static AttributeDefinition _moduleClassName;
    public static AttributeDefinition _baseDefinition;
    public static AttributeDefinition _moduleDependenceAttribute;
    public static AttributeDefinition _refersToDefsFromDSD;
    public static AttributeDefinition _definedInModuleAttribute;
    public static AttributeDefinition _dsdModuleDefinition;
    public static AttributeDefinition _dsdModuleList;
    public static AttributeDefinition _sortName;
    public static AttributeDefinition _supportDynamicSchemaLoading;
    public static AttributeDefinition _loadSchemaClass;
    public static AttributeDefinition _requiredBaseModule;
    public static AttributeDefinition _partOfDefinitionModule;
    public static AttributeDefinition _relatedToConcept;
    public static AttributeDefinition _tags;
    public static AttributeDefinition _nvp;
    public static AttributeDefinition _weakReference;
    public static AttributeDefinition _optimize;
    public static AttributeDefinition _version;
    public static AttributeDefinition _skip;
    public static AttributeDefinition _obsolete;
    public static AttributeDefinition _why;
    public static AttributeDefinition _comment;
    public static AttributeDefinition _hint;
    public static AttributeDefinition _question;
    public static AttributeDefinition _codeComment;
    public static AttributeDefinition _objectClass;

    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpStaticDefinitions(MetaSchemaFormatter.java:163)
    public static ComplexTypeDefinition _Part;
    public static ComplexTypeDefinition _NameValuePair;
    public static ComplexTypeDefinition _SchemaAndReason;
    public static ComplexTypeDefinition _Example;
    public static ComplexTypeDefinition _Optimize;
    public static ComplexTypeDefinition _DmwTypeToWrapperType;
    public static ComplexTypeDefinition _RuleParam;

    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpStaticDefinitions(MetaSchemaFormatter.java:168)
    public static RuleCategory        _Initialization;
    public static RuleCategory        _ObjectValidation;
    public static RuleCategory        _AttributeValidation;
    public static RuleCategory        _AttributeValidationWithResolver;
    public static RuleCategory        _UCOValidation;

    public MetaSchemaAG() throws DMFeedbackSet {

        super("meta");

        // We only ever want to initialize the schema once, so check
        // to see if we've initialized the first class definition
        if (_metaSchema == null){
            _metaSchema = this;
            staticRefName = new String("MetaSchema._");

            this.addDescription("The meta schema defines the elements used to define schemas.");
            this.setDotName("meta.SchemaDefinition");
            this.setSchemaPackage("org.dmd.dms");
            this.setDmwPackage("org.dmd.dms");
            this.setSchemaBaseID(0);
            this.setSchemaIDRange(200);
            initClasses();
            initAttributes();
            initTypes();
            initEnums();
            initRuleCategories();
            initComplexTypes();
        }
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpInitClasses(MetaSchemaFormatter.java:183)
    private void initClasses() throws DMFeedbackSet {

        ClassDefinitionDMO _ActionTriggerInfoOBJ = new ClassDefinitionDMO();
        _ActionTriggerInfo = new ClassDefinition(_ActionTriggerInfoOBJ,MetaDMSAG.__ActionTriggerInfo);
        _ActionTriggerInfoOBJ.setClassType("ABSTRACT");
        _ActionTriggerInfoOBJ.addDescription("The ActionTriggerInfo class simply provides a common base for the bundle of information required to remotely trigger an action on an object.  Derivatives of this class are generated as part of the DMO generation process and have action specific interfaces to handle the parameters  required by an ActionDefinition. <p/> This mechanism is a replacement for the concept that ActionRequests were EXTENSIBLE objects. This way, the user can ask an object for the  ActionTriggerInfo (ATI) for a particular action and have a well defined interface to specify the parameters for the action.");
        _ActionTriggerInfoOBJ.setDmdID("14");
        _ActionTriggerInfoOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.ActionTriggerInfoDMO");
        _ActionTriggerInfoOBJ.setJavaClass("org.dmd.dms.extended.ActionTriggerInfo");
        _ActionTriggerInfoOBJ.addMust("meta.name");
        _ActionTriggerInfoOBJ.setName("ActionTriggerInfo");
        _ActionTriggerInfo.setDefinedIn(this);
        addClassDefList(_ActionTriggerInfo);

        ClassDefinitionDMO _DSDefinitionOBJ = new ClassDefinitionDMO();
        _DSDefinition = new ClassDefinition(_DSDefinitionOBJ,MetaDMSAG.__DSDefinition);
        _DSDefinitionOBJ.setClassType("ABSTRACT");
        _DSDefinitionOBJ.addDescription("The domain specific definition (DSDefinition) forms the basis for all definitions that use dark-matter as their basis. The initial dark-matter mechanisms were focussed only on  schema for data objects, but, as the project developed, other, domain specific sets of definitions were added. Eventually, a pattern emerged in terms of these various sets of definitions and some additional higher order concepts were introduced to make the creation of new, domain specific definition sets easier and to allow them to build on and use each others' definitions in a  coherent manner. <p/> For instance, the Model View Whatever (MVW) framework, builds on the dark-matter schema  concepts and introduces definitions that align with the Google Web Toolkit (GWT) conceptual model of the elements that comprise GWT applications and the various relationships that exist between them. The infrastructure needed to parse, manage and use those definitions to generate code and documentation are very similar to those used in the base dark-matter schema mechanisms, but they had to be hand built for the domain. <p/> Other kinds of domain specific definitions started to emerge, Google Protocol Buffer (GPB), Simple Network Management Protocol (SNMP) etc. Having to build the infrastructure for these  definitions each time was tedious and, in the spirit of the rest of dark-matter, lent themselves to being defined, generated and extended to make the process the easier. <p/> Likewise, the code generation mechanisms originally employed have evolved and the more generic concept of artifact generation, based on definition sets, was introduced to allow for more rapid creation of utilities that generate code or documentation or other types of specifications.");
        _DSDefinitionOBJ.setDmdID("1");
        _DSDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.DSDefinitionDMO");
        _DSDefinitionOBJ.setIsNamedBy("meta.name");
        _DSDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.DSDefinition");
        _DSDefinitionOBJ.addMay("meta.description");
        _DSDefinitionOBJ.addMay("meta.comment");
        _DSDefinitionOBJ.addMay("meta.question");
        _DSDefinitionOBJ.addMay("meta.example");
        _DSDefinitionOBJ.addMay("meta.hint");
        _DSDefinitionOBJ.addMay("meta.sortName");
        _DSDefinitionOBJ.addMay("meta.tags");
        _DSDefinitionOBJ.addMay("meta.nvp");
        _DSDefinitionOBJ.addMay("meta.optimize");
        _DSDefinitionOBJ.addMay("meta.version");
        _DSDefinitionOBJ.addMay("meta.skip");
        _DSDefinitionOBJ.addMay("meta.obsolete");
        _DSDefinitionOBJ.addMay("meta.why");
        _DSDefinitionOBJ.addMay("meta.definedIn");
        _DSDefinitionOBJ.addMay("meta.file");
        _DSDefinitionOBJ.addMay("meta.lineNumber");
        _DSDefinitionOBJ.addMay("meta.dotName");
        _DSDefinitionOBJ.addMust("meta.name");
        _DSDefinitionOBJ.setName("DSDefinition");
        _DSDefinitionOBJ.setUseWrapperType("EXTENDED");
        _DSDefinition.setDefinedIn(this);
        addClassDefList(_DSDefinition);

        ClassDefinitionDMO _DmsDefinitionOBJ = new ClassDefinitionDMO();
        _DmsDefinition = new ClassDefinition(_DmsDefinitionOBJ,MetaDMSAG.__DmsDefinition);
        _DmsDefinitionOBJ.setClassType("ABSTRACT");
        _DmsDefinitionOBJ.setDerivedFrom("meta.DSDefinition");
        _DmsDefinitionOBJ.addDescription("The DmsDefinition class provides a common base for all dark-matter schema (DMS) definition classes.");
        _DmsDefinitionOBJ.setDmdID("2");
        _DmsDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.DmsDefinitionDMO");
        _DmsDefinitionOBJ.setIsNamedBy("meta.name");
        _DmsDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.DmsDefinition");
        _DmsDefinitionOBJ.addMay("meta.relatedToConcept");
        _DmsDefinitionOBJ.addMay("meta.codeComment");
        _DmsDefinitionOBJ.addMust("meta.name");
        _DmsDefinitionOBJ.setName("DmsDefinition");
        _DmsDefinitionOBJ.setUseWrapperType("EXTENDED");
        _DmsDefinition.setDefinedIn(this);
        addClassDefList(_DmsDefinition);

        ClassDefinitionDMO _DSDefinitionModuleOBJ = new ClassDefinitionDMO();
        _DSDefinitionModule = new ClassDefinition(_DSDefinitionModuleOBJ,MetaDMSAG.__DSDefinitionModule);
        _DSDefinitionModuleOBJ.setClassType("STRUCTURAL");
        _DSDefinitionModuleOBJ.setDerivedFrom("meta.DmsDefinition");
        _DSDefinitionModuleOBJ.addDescription("The DSDefinitionModule is a definition that defines a collection of definitions and provides a basis for the generation of various artifacts that allow for parsing and management of that set of definitions. <p/> The specific of a definition module will result in the generation of a ClassDefinition for the specified module type and thus, the dmdID associated with it must be unique across the set of classes that comprise the definitions encompassed by the module. <p/> The ClassDefinition will be named by name and will have the may and must attributes specified as part of the DSDefinitionModule.");
        _DSDefinitionModuleOBJ.setDmdID("3");
        _DSDefinitionModuleOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.DSDefinitionModuleDMO");
        _DSDefinitionModuleOBJ.setIsNamedBy("meta.name");
        _DSDefinitionModuleOBJ.setJavaClass("org.dmd.dms.server.extended.DSDefinitionModule");
        _DSDefinitionModuleOBJ.addMay("meta.refersToDefsFromDSD");
        _DSDefinitionModuleOBJ.addMay("meta.definedInModuleAttribute");
        _DSDefinitionModuleOBJ.addMay("meta.may");
        _DSDefinitionModuleOBJ.addMay("meta.must");
        _DSDefinitionModuleOBJ.addMay("meta.supportDynamicSchemaLoading");
        _DSDefinitionModuleOBJ.addMay("meta.requiredBaseModule");
        _DSDefinitionModuleOBJ.addMay("meta.definedIn");
        _DSDefinitionModuleOBJ.addMust("meta.name");
        _DSDefinitionModuleOBJ.addMust("meta.fileExtension");
        _DSDefinitionModuleOBJ.addMust("meta.dmdID");
        _DSDefinitionModuleOBJ.addMust("meta.moduleClassName");
        _DSDefinitionModuleOBJ.addMust("meta.moduleDependenceAttribute");
        _DSDefinitionModuleOBJ.addMust("meta.baseDefinition");
        _DSDefinitionModuleOBJ.setName("DSDefinitionModule");
        _DSDefinitionModuleOBJ.setUseWrapperType("EXTENDED");
        _DSDefinitionModule.setDefinedIn(this);
        addClassDefList(_DSDefinitionModule);

        ClassDefinitionDMO _ClassDefinitionOBJ = new ClassDefinitionDMO();
        _ClassDefinition = new ClassDefinition(_ClassDefinitionOBJ,MetaDMSAG.__ClassDefinition);
        _ClassDefinitionOBJ.setClassType("STRUCTURAL");
        _ClassDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _ClassDefinitionOBJ.addDescription("This class provides the basic mechanism to define new classes for a schema.");
        _ClassDefinitionOBJ.setDmdID("4");
        _ClassDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.ClassDefinitionDMO");
        _ClassDefinitionOBJ.setIsDSDefinition("true");
        _ClassDefinitionOBJ.setIsNamedBy("meta.name");
        _ClassDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.ClassDefinition");
        _ClassDefinitionOBJ.addMay("meta.description");
        _ClassDefinitionOBJ.addMay("meta.derivedFrom");
        _ClassDefinitionOBJ.addMay("meta.must");
        _ClassDefinitionOBJ.addMay("meta.may");
        _ClassDefinitionOBJ.addMay("meta.isNamedBy");
        _ClassDefinitionOBJ.addMay("meta.javaClass");
        _ClassDefinitionOBJ.addMay("meta.intendedToExtend");
        _ClassDefinitionOBJ.addMay("meta.usesInterface");
        _ClassDefinitionOBJ.addMay("meta.useWrapperType");
        _ClassDefinitionOBJ.addMay("meta.dmwWrapperType");
        _ClassDefinitionOBJ.addMay("meta.allowedParents");
        _ClassDefinitionOBJ.addMay("meta.subpackage");
        _ClassDefinitionOBJ.addMay("meta.dataType");
        _ClassDefinitionOBJ.addMay("meta.supportsBackrefTracking");
        _ClassDefinitionOBJ.addMay("meta.excludeFromContext");
        _ClassDefinitionOBJ.addMay("meta.abbrev");
        _ClassDefinitionOBJ.addMay("meta.obsoleteVersion");
        _ClassDefinitionOBJ.addMay("meta.isDSDefinition");
        _ClassDefinitionOBJ.addMay("meta.partOfDefinitionModule");
        _ClassDefinitionOBJ.addMay("meta.internallyGenerated");
        _ClassDefinitionOBJ.addMay("meta.ruleDefinition");
        _ClassDefinitionOBJ.addMay("meta.dsdModuleDefinition");
        _ClassDefinitionOBJ.addMay("meta.derivedClasses");
        _ClassDefinitionOBJ.addMay("meta.actions");
        _ClassDefinitionOBJ.addMay("meta.internalTypeRef");
        _ClassDefinitionOBJ.addMay("meta.dmoImport");
        _ClassDefinitionOBJ.addMay("meta.dmoClass");
        _ClassDefinitionOBJ.addMay("meta.dmwImport");
        _ClassDefinitionOBJ.addMay("meta.dmwClass");
        _ClassDefinitionOBJ.addMay("meta.dmeImport");
        _ClassDefinitionOBJ.addMay("meta.dmeClass");
        _ClassDefinitionOBJ.addMay("meta.dmtImport");
        _ClassDefinitionOBJ.addMay("meta.dmtREFImport");
        _ClassDefinitionOBJ.addMay("meta.dmtClass");
        _ClassDefinitionOBJ.addMay("meta.dmoAuxClass");
        _ClassDefinitionOBJ.addMay("meta.dmoAuxClassImport");
        _ClassDefinitionOBJ.addMay("meta.dmwAuxClass");
        _ClassDefinitionOBJ.addMay("meta.dmwAuxClassImport");
        _ClassDefinitionOBJ.addMay("meta.dmwIteratorImport");
        _ClassDefinitionOBJ.addMay("meta.dmwIteratorClass");
        _ClassDefinitionOBJ.addMust("meta.name");
        _ClassDefinitionOBJ.addMust("meta.classType");
        _ClassDefinitionOBJ.addMust("meta.dmdID");
        _ClassDefinitionOBJ.setName("ClassDefinition");
        _ClassDefinitionOBJ.setUseWrapperType("EXTENDED");
        _ClassDefinition.setDefinedIn(this);
        addClassDefList(_ClassDefinition);

        ClassDefinitionDMO _EnumDefinitionOBJ = new ClassDefinitionDMO();
        _EnumDefinition = new ClassDefinition(_EnumDefinitionOBJ,MetaDMSAG.__EnumDefinition);
        _EnumDefinitionOBJ.setClassType("STRUCTURAL");
        _EnumDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _EnumDefinitionOBJ.addDescription("The EnumDefinition allows for the definition of real Java enums that provide inherent mapping of the string and integer values of the enum into actual enum values. Once defined, EnumDefinitions can be used where ever you would use a TypeDefinition name i.e. they can be used in the type attribute of AttributeDefinitions.");
        _EnumDefinitionOBJ.setDmdID("5");
        _EnumDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.EnumDefinitionDMO");
        _EnumDefinitionOBJ.setIsDSDefinition("true");
        _EnumDefinitionOBJ.setIsNamedBy("meta.name");
        _EnumDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.EnumDefinition");
        _EnumDefinitionOBJ.addMay("meta.description");
        _EnumDefinitionOBJ.addMay("meta.nullReturnValue");
        _EnumDefinitionOBJ.addMust("meta.name");
        _EnumDefinitionOBJ.addMust("meta.enumValue");
        _EnumDefinitionOBJ.setName("EnumDefinition");
        _EnumDefinitionOBJ.setUseWrapperType("EXTENDED");
        _EnumDefinition.setDefinedIn(this);
        addClassDefList(_EnumDefinition);

        ClassDefinitionDMO _TypeDefinitionOBJ = new ClassDefinitionDMO();
        _TypeDefinition = new ClassDefinition(_TypeDefinitionOBJ,MetaDMSAG.__TypeDefinition);
        _TypeDefinitionOBJ.setClassType("STRUCTURAL");
        _TypeDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _TypeDefinitionOBJ.addDescription("The <code> TypeDefinition </code> is used to define the types of attributes that can be used as the basis for attribute values. The name of the type definition should be the same as the actual Java class that is used to store the value of an attribute e.g. the name of the type used to store strings is String. The <code> typeClassName </code> is the fully qualified name of the class derived from <code>DmcAttribute</code> that stores this type of value; they are always, by convention, named <code>DmcTypeXXX</code>. <p/> <code> TypeDefinitions </code> are automatically generated internally for <code>ClassDefinitions</code>,  <code>ComplexTypeDefinitions</code>, <code>ExtendedReferenceTypeDefinitions</code> and <code>EnumDefinitions</code> so that these objects can be referred to via the <code>type</code> attribute of <code> AttributeDefinitions</code>. These definitions are marked as <code> internallyGenerated </code>. <p/> The simplest <code> TypeDefinition </code> would look something like: <pre> TypeDefinition name           String typeClassName  org.dmd.dmc.types.DmcTypeString description    Provides support for String values. </pre> This form would be used for attribute types whose base type originates in <code> java.lang</code>. The dark-matter base types include: Boolean, Byte, Double, Float, Integer, Long, Short and String. <p/> <code>TypeDefinitions</code> also support the concept of specifying a <code> nullReturnValue </code> for the entire type i.e. whenever an attribute of the specified type is accessed, it will return that value when the attribute doesn't exist in the object. An example of this is the <code> Boolean </code> type: <pre> TypeDefinition name            Boolean typeClassName   org.dmd.dmc.types.DmcTypeBoolean nullReturnValue false description     Provides support for Boolean values. This type makes use of the                 nullReturnValue flag so that, even if there is no                 value for an attribute of this type, a value of false will                 be returned. </pre> <p/> The next most common form of <code> TypeDefinition </code> adds the <code> primitiveType </code> attribute. This is required for code generation so that we can import the appropriate type for use in the various getter/setter methods. An example would be the <code> Date </code> type. <pre> TypeDefinition name           Date typeClassName  org.dmd.dmc.types.DmcTypeDate primitiveType  java.util.Date description    Provides support for Date values. </pre> Another common form of <code>TypeDefinition</code> is the definition of a name type. Object naming is a fundamental aspect of DMOs, with all object names being based on the <code>DmcObjectName</code>. Flagging a type as being a name type also implies the definition of a designated naming attribute associated with the type. This mechanism allows for the transport of names that are self describing in terms of their implementation type. This feature supports the <code>NameContainer</code> type that allows any name to be transported in things like dark-matter protocol <code>GetRequest</code>. An example of a naming type would be: <pre> TypeDefinition name           CamelCaseName typeClassName  org.dmd.dmc.types.DmcTypeCamelCaseName primitiveType  org.dmd.dmc.types.CamelCaseName isNameType     true description    The CamelCaseName is a string based name that must start with                an alpha character which is followed by a mix of alphanumerics. </pre> And its associated designated naming attribute would be: <pre> AttributeDefinition name                     camelCaseName dmdID                    116 type                     CamelCaseName designatedNameAttribute  true description              The camelCaseName attribute is used to store a single camelCase                          format name for something. The name starts with a single letter                          and can be followed by a mix of letters and numbers. No spaces or                           other characters are allowed. </pre> The last form of type definition is one that includes some additional information to provide a convenient, alternate interface for the generation of member functions associated with a container type; this concept is pretty much limited to the meta-schema, so it is unlikely that non-contributors to dark-matter will make use of this concept. However, here is an example: <pre> TypeDefinition name           NameContainer typeClassName  org.dmd.dmc.types.DmcTypeNameContainer primitiveType  org.dmd.dmc.types.NameContainer altType        DmcObjectName altTypeImport  org.dmd.dmc.DmcObjectName description    The NameContainer type allows for the storage of object names of different types... </pre>");
        _TypeDefinitionOBJ.setDmdID("6");
        _TypeDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.TypeDefinitionDMO");
        _TypeDefinitionOBJ.setIsDSDefinition("true");
        _TypeDefinitionOBJ.setIsNamedBy("meta.name");
        _TypeDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.TypeDefinition");
        _TypeDefinitionOBJ.addMay("meta.description");
        _TypeDefinitionOBJ.addMay("meta.primitiveType");
        _TypeDefinitionOBJ.addMay("meta.nullReturnValue");
        _TypeDefinitionOBJ.addMay("meta.altType");
        _TypeDefinitionOBJ.addMay("meta.altTypeImport");
        _TypeDefinitionOBJ.addMay("meta.keyClass");
        _TypeDefinitionOBJ.addMay("meta.keyImport");
        _TypeDefinitionOBJ.addMay("meta.wrapperClassName");
        _TypeDefinitionOBJ.addMay("meta.internallyGenerated");
        _TypeDefinitionOBJ.addMay("meta.helperClassName");
        _TypeDefinitionOBJ.addMay("meta.dmwIteratorImport");
        _TypeDefinitionOBJ.addMay("meta.dmwIteratorClass");
        _TypeDefinitionOBJ.addMay("meta.isEnumType");
        _TypeDefinitionOBJ.addMay("meta.isNameType");
        _TypeDefinitionOBJ.addMay("meta.isHierarchicName");
        _TypeDefinitionOBJ.addMay("meta.isFilterType");
        _TypeDefinitionOBJ.addMay("meta.isExtendedRefType");
        _TypeDefinitionOBJ.addMay("meta.isRefType");
        _TypeDefinitionOBJ.addMay("meta.enumName");
        _TypeDefinitionOBJ.addMay("meta.originalClass");
        _TypeDefinitionOBJ.addMay("meta.nameAttributeDef");
        _TypeDefinitionOBJ.addMay("meta.filterAttributeDef");
        _TypeDefinitionOBJ.addMay("meta.genericArgs");
        _TypeDefinitionOBJ.addMust("meta.name");
        _TypeDefinitionOBJ.addMust("meta.typeClassName");
        _TypeDefinitionOBJ.setName("TypeDefinition");
        _TypeDefinitionOBJ.setUseWrapperType("EXTENDED");
        _TypeDefinition.setDefinedIn(this);
        addClassDefList(_TypeDefinition);

        ClassDefinitionDMO _ComplexTypeDefinitionOBJ = new ClassDefinitionDMO();
        _ComplexTypeDefinition = new ClassDefinition(_ComplexTypeDefinitionOBJ,MetaDMSAG.__ComplexTypeDefinition);
        _ComplexTypeDefinitionOBJ.setClassType("STRUCTURAL");
        _ComplexTypeDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _ComplexTypeDefinitionOBJ.addDescription("The ComplexTypeDefinition provides a mechanism for defining the structure of a complex type composed of other types. From this definition, a new DmcType is generated that has all of the required methods automatically defined. <p/> An example definition is the RuleParam: <pre> ComplexTypeDefinition name			RuleParam fieldSeparator : field String importStatement The import for the type of parameter field String genericArgs     The generic arguments associated with this parameter field String name            The name of the parameter field String description     A description of the parameter description The RuleParam type is used to succintly describe a parameter  to be supplied to a rule when it is executed. </pre> In this case, the type has four fields, all of String type. An example of the String format of the field might be: <pre> org.dmc.DmcObject::obj:The object to be validated</pre> In this case, the generic args field isn't available and will be the empty string. When a field seperator is specified, all fields are, more or less optional, but the underlying type must be able to handle the empty string as a valid value. This wouldn't work with Integer. <p/> If no field separator is specified, the separator is assumed to be whitespace and additional whitespace is consumed during the parsing.");
        _ComplexTypeDefinitionOBJ.setDmdID("7");
        _ComplexTypeDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.ComplexTypeDefinitionDMO");
        _ComplexTypeDefinitionOBJ.setIsDSDefinition("true");
        _ComplexTypeDefinitionOBJ.setIsNamedBy("meta.name");
        _ComplexTypeDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.ComplexTypeDefinition");
        _ComplexTypeDefinitionOBJ.addMay("meta.requiredPart");
        _ComplexTypeDefinitionOBJ.addMay("meta.optionalPart");
        _ComplexTypeDefinitionOBJ.addMay("meta.fieldSeparator");
        _ComplexTypeDefinitionOBJ.addMay("meta.extendedClass");
        _ComplexTypeDefinitionOBJ.addMay("meta.description");
        _ComplexTypeDefinitionOBJ.addMust("meta.name");
        _ComplexTypeDefinitionOBJ.setName("ComplexTypeDefinition");
        _ComplexTypeDefinitionOBJ.setUseWrapperType("EXTENDED");
        _ComplexTypeDefinition.setDefinedIn(this);
        addClassDefList(_ComplexTypeDefinition);

        ClassDefinitionDMO _ExtendedReferenceTypeDefinitionOBJ = new ClassDefinitionDMO();
        _ExtendedReferenceTypeDefinition = new ClassDefinition(_ExtendedReferenceTypeDefinitionOBJ,MetaDMSAG.__ExtendedReferenceTypeDefinition);
        _ExtendedReferenceTypeDefinitionOBJ.setClassType("STRUCTURAL");
        _ExtendedReferenceTypeDefinitionOBJ.setDerivedFrom("meta.ComplexTypeDefinition");
        _ExtendedReferenceTypeDefinitionOBJ.addDescription("The ExtendedReferenceTypeDefinition provides a mechanism for extending  the automatically generated named object reference attribute types with additional information. This can be seen as adding additional information to the relationship between two objects.");
        _ExtendedReferenceTypeDefinitionOBJ.setDmdID("8");
        _ExtendedReferenceTypeDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.ExtendedReferenceTypeDefinitionDMO");
        _ExtendedReferenceTypeDefinitionOBJ.setIsDSDefinition("true");
        _ExtendedReferenceTypeDefinitionOBJ.setIsNamedBy("meta.name");
        _ExtendedReferenceTypeDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition");
        _ExtendedReferenceTypeDefinitionOBJ.addMust("meta.name");
        _ExtendedReferenceTypeDefinitionOBJ.addMust("meta.extendedReferenceClass");
        _ExtendedReferenceTypeDefinitionOBJ.setName("ExtendedReferenceTypeDefinition");
        _ExtendedReferenceTypeDefinitionOBJ.setUseWrapperType("EXTENDED");
        _ExtendedReferenceTypeDefinition.setDefinedIn(this);
        addClassDefList(_ExtendedReferenceTypeDefinition);

        ClassDefinitionDMO _AttributeDefinitionOBJ = new ClassDefinitionDMO();
        _AttributeDefinition = new ClassDefinition(_AttributeDefinitionOBJ,MetaDMSAG.__AttributeDefinition);
        _AttributeDefinitionOBJ.setClassType("STRUCTURAL");
        _AttributeDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _AttributeDefinitionOBJ.addDescription("This class is used to define attributes to be used as part of a class definition.");
        _AttributeDefinitionOBJ.setDmdID("9");
        _AttributeDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.AttributeDefinitionDMO");
        _AttributeDefinitionOBJ.setIsDSDefinition("true");
        _AttributeDefinitionOBJ.setIsNamedBy("meta.name");
        _AttributeDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.AttributeDefinition");
        _AttributeDefinitionOBJ.addMay("meta.description");
        _AttributeDefinitionOBJ.addMay("meta.valueType");
        _AttributeDefinitionOBJ.addMay("meta.nullReturnValue");
        _AttributeDefinitionOBJ.addMay("meta.abbrev");
        _AttributeDefinitionOBJ.addMay("meta.obsoleteVersion");
        _AttributeDefinitionOBJ.addMay("meta.secure");
        _AttributeDefinitionOBJ.addMay("meta.dataType");
        _AttributeDefinitionOBJ.addMay("meta.dmdID");
        _AttributeDefinitionOBJ.addMay("meta.genericArgs");
        _AttributeDefinitionOBJ.addMay("meta.genericArgsImport");
        _AttributeDefinitionOBJ.addMay("meta.designatedNameAttribute");
        _AttributeDefinitionOBJ.addMay("meta.designatedFilterAttribute");
        _AttributeDefinitionOBJ.addMay("meta.internalUse");
        _AttributeDefinitionOBJ.addMay("meta.indexSize");
        _AttributeDefinitionOBJ.addMay("meta.preserveNewlines");
        _AttributeDefinitionOBJ.addMay("meta.weakReference");
        _AttributeDefinitionOBJ.addMust("meta.name");
        _AttributeDefinitionOBJ.addMust("meta.type");
        _AttributeDefinitionOBJ.setName("AttributeDefinition");
        _AttributeDefinitionOBJ.setUseWrapperType("EXTENDED");
        _AttributeDefinition.setDefinedIn(this);
        addClassDefList(_AttributeDefinition);

        ClassDefinitionDMO _SliceDefinitionOBJ = new ClassDefinitionDMO();
        _SliceDefinition = new ClassDefinition(_SliceDefinitionOBJ,MetaDMSAG.__SliceDefinition);
        _SliceDefinitionOBJ.setClassType("STRUCTURAL");
        _SliceDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _SliceDefinitionOBJ.addDescription("The SliceDefinition class is used to define a named set of attributes that are used to retrieve a slice of an object i.e. an abbreviated set of values. These are used in the generation of static, named DmcSliceInfo instances.");
        _SliceDefinitionOBJ.setDmdID("10");
        _SliceDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.SliceDefinitionDMO");
        _SliceDefinitionOBJ.setIsDSDefinition("true");
        _SliceDefinitionOBJ.setIsNamedBy("meta.name");
        _SliceDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.SliceDefinition");
        _SliceDefinitionOBJ.addMay("meta.description");
        _SliceDefinitionOBJ.addMust("meta.name");
        _SliceDefinitionOBJ.addMust("meta.selectAttribute");
        _SliceDefinitionOBJ.setName("SliceDefinition");
        _SliceDefinitionOBJ.setUseWrapperType("EXTENDED");
        _SliceDefinition.setDefinedIn(this);
        addClassDefList(_SliceDefinition);

        ClassDefinitionDMO _ActionDefinitionOBJ = new ClassDefinitionDMO();
        _ActionDefinition = new ClassDefinition(_ActionDefinitionOBJ,MetaDMSAG.__ActionDefinition);
        _ActionDefinitionOBJ.setClassType("STRUCTURAL");
        _ActionDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _ActionDefinitionOBJ.addDescription("This class is used to define the actions that may be triggered on an object.");
        _ActionDefinitionOBJ.setDmdID("11");
        _ActionDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.ActionDefinitionDMO");
        _ActionDefinitionOBJ.setIsDSDefinition("true");
        _ActionDefinitionOBJ.setIsNamedBy("meta.name");
        _ActionDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.ActionDefinition");
        _ActionDefinitionOBJ.addMay("meta.description");
        _ActionDefinitionOBJ.addMay("meta.mustParm");
        _ActionDefinitionOBJ.addMay("meta.mayParm");
        _ActionDefinitionOBJ.addMay("meta.mustReturn");
        _ActionDefinitionOBJ.addMay("meta.mayReturn");
        _ActionDefinitionOBJ.addMay("meta.attachToClass");
        _ActionDefinitionOBJ.addMay("meta.isGetAction");
        _ActionDefinitionOBJ.addMay("meta.obsoleteVersion");
        _ActionDefinitionOBJ.addMay("meta.maySendProgress");
        _ActionDefinitionOBJ.addMust("meta.name");
        _ActionDefinitionOBJ.setName("ActionDefinition");
        _ActionDefinitionOBJ.setUseWrapperType("EXTENDED");
        _ActionDefinition.setDefinedIn(this);
        addClassDefList(_ActionDefinition);

        ClassDefinitionDMO _SchemaDefinitionOBJ = new ClassDefinitionDMO();
        _SchemaDefinition = new ClassDefinition(_SchemaDefinitionOBJ,MetaDMSAG.__SchemaDefinition);
        _SchemaDefinitionOBJ.setClassType("STRUCTURAL");
        _SchemaDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _SchemaDefinitionOBJ.addDescription("This class is used to define a schema as a discrete, nameable entity.");
        _SchemaDefinitionOBJ.setDmdID("12");
        _SchemaDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.SchemaDefinitionDMO");
        _SchemaDefinitionOBJ.setIsNamedBy("meta.name");
        _SchemaDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.SchemaDefinition");
        _SchemaDefinitionOBJ.addMay("meta.dependsOn");
        _SchemaDefinitionOBJ.addMay("meta.defFiles");
        _SchemaDefinitionOBJ.addMay("meta.generatedFileHeader");
        _SchemaDefinitionOBJ.addMay("meta.dmwPackage");
        _SchemaDefinitionOBJ.addMay("meta.schemaExtension");
        _SchemaDefinitionOBJ.addMay("meta.createAttributeFactory");
        _SchemaDefinitionOBJ.addMay("meta.dmwTypeToPackage");
        _SchemaDefinitionOBJ.addMay("meta.classDefList");
        _SchemaDefinitionOBJ.addMay("meta.typeDefList");
        _SchemaDefinitionOBJ.addMay("meta.complexTypeDefList");
        _SchemaDefinitionOBJ.addMay("meta.extendedReferenceTypeDefList");
        _SchemaDefinitionOBJ.addMay("meta.internalTypeDefList");
        _SchemaDefinitionOBJ.addMay("meta.attributeDefList");
        _SchemaDefinitionOBJ.addMay("meta.actionDefList");
        _SchemaDefinitionOBJ.addMay("meta.enumDefList");
        _SchemaDefinitionOBJ.addMay("meta.sliceDefList");
        _SchemaDefinitionOBJ.addMay("meta.dependsOnRef");
        _SchemaDefinitionOBJ.addMay("meta.ruleCategoryList");
        _SchemaDefinitionOBJ.addMay("meta.ruleDefinitionList");
        _SchemaDefinitionOBJ.addMay("meta.ruleDataList");
        _SchemaDefinitionOBJ.addMay("meta.dsdModuleList");
        _SchemaDefinitionOBJ.addMust("meta.name");
        _SchemaDefinitionOBJ.addMust("meta.schemaPackage");
        _SchemaDefinitionOBJ.addMust("meta.schemaBaseID");
        _SchemaDefinitionOBJ.addMust("meta.schemaIDRange");
        _SchemaDefinitionOBJ.setName("SchemaDefinition");
        _SchemaDefinitionOBJ.setUseWrapperType("EXTENDED");
        _SchemaDefinition.setDefinedIn(this);
        addClassDefList(_SchemaDefinition);

        ClassDefinitionDMO _RuleCategoryOBJ = new ClassDefinitionDMO();
        _RuleCategory = new ClassDefinition(_RuleCategoryOBJ,MetaDMSAG.__RuleCategory);
        _RuleCategoryOBJ.setClassType("STRUCTURAL");
        _RuleCategoryOBJ.setDerivedFrom("meta.DmsDefinition");
        _RuleCategoryOBJ.addDescription("The RuleCategory allows for the definition of categories of rules to be applied to various objects and indicates the expected interface to be implemented by a rule instance. A RuleDefinition may belong to multiple categories.  <p/> RuleCategories fall into two broad types, ATTRIBUTE and CLASS level, as specified via the ruleType attribute. When a RuleDefinition belongs to an ATTRIBUTE level category, its instances will have a mandatory applyToAttribute attribute. Both ATTRIBUTE and CLASS level RuleDefinitions have an optional applyToClass attribute by default. <p/> Specifying a RuleCategory will cause the generation of several artifacts including: <ul> <li> a category interface: this interface will be created based on the ruleParam values and will be implemented by RuleDefinitions that are part of the category </li> a rule collection: this is a category specific collection of rules that organize the rule instances in this category. </ul> Exactly how a RuleCategory applies rule instances is category specific and this behaviour should be part of the description of a rule category. <p/> For CLASS level rules, you must specify the classInfoFromParam attribute to indicate how to  get the DmcClassInfo from whatever object you are passing to the rule. For ATTRIBUTE level rules, you must specify both attributeInfoFromParam and classInfoFromParam.");
        _RuleCategoryOBJ.setDmdID("15");
        _RuleCategoryOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.RuleCategoryDMO");
        _RuleCategoryOBJ.setIsDSDefinition("true");
        _RuleCategoryOBJ.setIsNamedBy("meta.name");
        _RuleCategoryOBJ.setJavaClass("org.dmd.dms.server.extended.RuleCategory");
        _RuleCategoryOBJ.addMay("meta.ruleImport");
        _RuleCategoryOBJ.addMay("meta.attributeInfoFromParam");
        _RuleCategoryOBJ.addMust("meta.name");
        _RuleCategoryOBJ.addMust("meta.opContext");
        _RuleCategoryOBJ.addMust("meta.ruleCategoryID");
        _RuleCategoryOBJ.addMust("meta.ruleType");
        _RuleCategoryOBJ.addMust("meta.ruleParam");
        _RuleCategoryOBJ.addMust("meta.classInfoFromParam");
        _RuleCategoryOBJ.setName("RuleCategory");
        _RuleCategoryOBJ.setUseWrapperType("EXTENDED");
        _RuleCategory.setDefinedIn(this);
        addClassDefList(_RuleCategory);

        ClassDefinitionDMO _RuleDefinitionOBJ = new ClassDefinitionDMO();
        _RuleDefinition = new ClassDefinition(_RuleDefinitionOBJ,MetaDMSAG.__RuleDefinition);
        _RuleDefinitionOBJ.setClassType("STRUCTURAL");
        _RuleDefinitionOBJ.setDerivedFrom("meta.DmsDefinition");
        _RuleDefinitionOBJ.addDescription("The RuleDefinition allows for the definition of rules that can be applied to attributes or classes. Rules are not just for validation, they can be applied to objects at different times in an object's life cycle e.g.  the InitRule can initialize a set of attributes to known values. <p/> RuleDefinitions will result in the generation of ClassDefinitions that define the  DMOs that will carry the parameters associated with the rule and the expectation that you will define an implementation class for the rule that derives from an abstract BaseImpl (base implementation) of the rule that provides common rule infrastructure and appropriate abstract methods that must be filled in. <p/> RuleDefinitions and ClassDefinitions share the same dmdID space and the IDs must be unique. This is because each RuleDefinition results in the creation of a  ClassDefinition for the DMO part of the rule that carries the rule parameters.");
        _RuleDefinitionOBJ.setDmdID("16");
        _RuleDefinitionOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.RuleDefinitionDMO");
        _RuleDefinitionOBJ.setIsDSDefinition("true");
        _RuleDefinitionOBJ.setIsNamedBy("meta.name");
        _RuleDefinitionOBJ.setJavaClass("org.dmd.dms.server.extended.RuleDefinition");
        _RuleDefinitionOBJ.addMay("meta.must");
        _RuleDefinitionOBJ.addMay("meta.may");
        _RuleDefinitionOBJ.addMay("meta.isExtensible");
        _RuleDefinitionOBJ.addMay("meta.dependency");
        _RuleDefinitionOBJ.addMust("meta.name");
        _RuleDefinitionOBJ.addMust("meta.ruleCategory");
        _RuleDefinitionOBJ.addMust("meta.dmdID");
        _RuleDefinitionOBJ.setName("RuleDefinition");
        _RuleDefinitionOBJ.setUseWrapperType("EXTENDED");
        _RuleDefinition.setDefinedIn(this);
        addClassDefList(_RuleDefinition);

        ClassDefinitionDMO _RuleDataOBJ = new ClassDefinitionDMO();
        _RuleData = new ClassDefinition(_RuleDataOBJ,MetaDMSAG.__RuleData);
        _RuleDataOBJ.setClassType("ABSTRACT");
        _RuleDataOBJ.addDescription("The RuleData class serves as a common base for all ClassDefinitions that are generated internally to represent the data associated with RuleDefinitions.");
        _RuleDataOBJ.setDmdID("17");
        _RuleDataOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.RuleDataDMO");
        _RuleDataOBJ.setIsNamedBy("meta.ruleName");
        _RuleDataOBJ.setJavaClass("org.dmd.dms.server.extended.RuleData");
        _RuleDataOBJ.addMay("meta.description");
        _RuleDataOBJ.addMay("meta.definedIn");
        _RuleDataOBJ.addMay("meta.file");
        _RuleDataOBJ.addMay("meta.lineNumber");
        _RuleDataOBJ.addMay("meta.applyToClass");
        _RuleDataOBJ.addMay("meta.immediateHalt");
        _RuleDataOBJ.addMay("meta.msgKey");
        _RuleDataOBJ.addMay("meta.msgParam");
        _RuleDataOBJ.addMust("meta.ruleTitle");
        _RuleDataOBJ.addMust("meta.ruleName");
        _RuleDataOBJ.setName("RuleData");
        _RuleDataOBJ.setUseWrapperType("EXTENDED");
        _RuleData.setDefinedIn(this);
        addClassDefList(_RuleData);

        ClassDefinitionDMO _DependencyOBJ = new ClassDefinitionDMO();
        _Dependency = new ClassDefinition(_DependencyOBJ,MetaDMSAG.__Dependency);
        _DependencyOBJ.setClassType("STRUCTURAL");
        _DependencyOBJ.setDerivedFrom("meta.DmsDefinition");
        _DependencyOBJ.addDescription("The Dependency class allows for the definition of a named dependency on something; usually an interface. In the current schema mechanisms, the only place that this mechanism is used is in the specification of RuleDefinitions. Rule instances are created by injecting RuleData into a rule implementation. If the rule implementation has dependencies on other objects, those dependencies are specified via references to Dependencies. <p/> A Dependency can be referred to via a RunContext definition which directs the generation of code that can instantiate the required object instances. Satisfying a Dependency relies on there being a DependencyImplementation that indicates how to instantiate the object that implements the interface defined by the dependency. <p/> If a Dependency specifies an instantiation, this is considered the default mechanism to fulfill the dependency. Other DependencyImplementations may be specified that override the specified instantiation in particular contexts.");
        _DependencyOBJ.setDmdID("18");
        _DependencyOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.DependencyDMO");
        _DependencyOBJ.setIsDSDefinition("true");
        _DependencyOBJ.setIsNamedBy("meta.name");
        _DependencyOBJ.setJavaClass("org.dmd.dms.server.extended.Dependency");
        _DependencyOBJ.addMay("meta.dependencies");
        _DependencyOBJ.addMay("meta.instantiation");
        _DependencyOBJ.addMust("meta.name");
        _DependencyOBJ.addMust("meta.useInterface");
        _DependencyOBJ.setName("Dependency");
        _DependencyOBJ.setUseWrapperType("EXTENDED");
        _Dependency.setDefinedIn(this);
        addClassDefList(_Dependency);

        ClassDefinitionDMO _DependencyImplementationOBJ = new ClassDefinitionDMO();
        _DependencyImplementation = new ClassDefinition(_DependencyImplementationOBJ,MetaDMSAG.__DependencyImplementation);
        _DependencyImplementationOBJ.setClassType("STRUCTURAL");
        _DependencyImplementationOBJ.setDerivedFrom("meta.DmsDefinition");
        _DependencyImplementationOBJ.addDescription("The DependencyImplementation allows you to fulfill a defined Dependency. When a RunContext is specified, it will indicate a set of dependencies. For each of the specified dependencies, there must be at least one related DependencyImplementation, otherwise, we have no way to fulfill the dependency.");
        _DependencyImplementationOBJ.setDmdID("19");
        _DependencyImplementationOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.DependencyImplementationDMO");
        _DependencyImplementationOBJ.setIsDSDefinition("true");
        _DependencyImplementationOBJ.setIsNamedBy("meta.name");
        _DependencyImplementationOBJ.setJavaClass("org.dmd.dms.server.extended.DependencyImplementation");
        _DependencyImplementationOBJ.addMay("meta.description");
        _DependencyImplementationOBJ.addMust("meta.name");
        _DependencyImplementationOBJ.addMust("meta.dependency");
        _DependencyImplementationOBJ.addMust("meta.runContext");
        _DependencyImplementationOBJ.addMust("meta.instantiation");
        _DependencyImplementationOBJ.setName("DependencyImplementation");
        _DependencyImplementationOBJ.setUseWrapperType("EXTENDED");
        _DependencyImplementation.setDefinedIn(this);
        addClassDefList(_DependencyImplementation);

        ClassDefinitionDMO _RunContextOBJ = new ClassDefinitionDMO();
        _RunContext = new ClassDefinition(_RunContextOBJ,MetaDMSAG.__RunContext);
        _RunContextOBJ.setClassType("STRUCTURAL");
        _RunContextOBJ.setDerivedFrom("meta.DmsDefinition");
        _RunContextOBJ.setDmdID("20");
        _RunContextOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.DependencyDMO");
        _RunContextOBJ.setIsDSDefinition("true");
        _RunContextOBJ.setIsNamedBy("meta.name");
        _RunContextOBJ.setJavaClass("org.dmd.dms.server.extended.Dependency");
        _RunContextOBJ.addMay("meta.description");
        _RunContextOBJ.addMust("meta.name");
        _RunContextOBJ.addMust("meta.dependencies");
        _RunContextOBJ.setName("RunContext");
        _RunContextOBJ.setUseWrapperType("EXTENDED");
        _RunContext.setDefinedIn(this);
        addClassDefList(_RunContext);

        ClassDefinitionDMO _ConcinnityOBJ = new ClassDefinitionDMO();
        _Concinnity = new ClassDefinition(_ConcinnityOBJ,MetaDMSAG.__Concinnity);
        _ConcinnityOBJ.setClassType("ABSTRACT");
        _ConcinnityOBJ.setDerivedFrom("meta.DSDefinition");
        _ConcinnityOBJ.addDescription("When concinnity was conceived, it was conceived as a way of binding knowledge across different domains. As the newer approach to generating Domain Specific Definitions arose, it became easier to create DSLs for different domains and I wanted concinnity to make use of those mechanisms. However, to do that would have required significant changes to the meta schema generator and a great deal of hacking. I wanted to be able to refer to concinnity aspects from schema as well, so the compromise is to place the base class for Concinnity in the meta schema (so that reference attributes may refer to it).  <p/> Mechanisms exist to prevent any class other than ConcinnityDefinition from deriving directly from Concinnity, so you can be guaranteed that down casting a Concinnity reference will yield a ConcinnityDefinition.");
        _ConcinnityOBJ.setDmdID("42");
        _ConcinnityOBJ.setDmoImport("org.dmd.dms.shared.generated.dmo.ConcinnityDMO");
        _ConcinnityOBJ.setIsNamedBy("meta.name");
        _ConcinnityOBJ.setJavaClass("org.dmd.dms.server.extended.Concinnity");
        _ConcinnityOBJ.addMust("meta.name");
        _ConcinnityOBJ.setName("Concinnity");
        _ConcinnityOBJ.setUseWrapperType("EXTENDED");
        _Concinnity.setDefinedIn(this);
        addClassDefList(_Concinnity);

    }
    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpInitAttributes(MetaSchemaFormatter.java:204)
    private void initAttributes() throws DMFeedbackSet {

        AttributeDefinitionDMO _FQNOBJ = new AttributeDefinitionDMO();
        _FQN = new AttributeDefinition(_FQNOBJ);
        _FQNOBJ.addDescription("The fully qualified name of a hierarchic object. The exact form of the fqn is application specific.");
        _FQNOBJ.setDesignatedNameAttribute("true");
        _FQNOBJ.setDmdID("84");
        _FQNOBJ.setName("FQN");
        _FQNOBJ.setType("meta.FullyQualifiedName");
        _FQN.setDefinedIn(this);
        addAttributeDefList(_FQN);

        AttributeDefinitionDMO _abbrevOBJ = new AttributeDefinitionDMO();
        _abbrev = new AttributeDefinition(_abbrevOBJ);
        _abbrevOBJ.addDescription("This attribute stores an abbreviated form of the name of an attribute or class. This concept is borrowed from directory technology where shortened name forms are often used as part of distinguished names (DNs).");
        _abbrevOBJ.setDmdID("9");
        _abbrevOBJ.setName("abbrev");
        _abbrevOBJ.setType("meta.String");
        _abbrev.setDefinedIn(this);
        addAttributeDefList(_abbrev);

        AttributeDefinitionDMO _actionDefListOBJ = new AttributeDefinitionDMO();
        _actionDefList = new AttributeDefinition(_actionDefListOBJ);
        _actionDefListOBJ.addDescription("A list of action definition references.");
        _actionDefListOBJ.setDmdID("60");
        _actionDefListOBJ.setInternalUse("true");
        _actionDefListOBJ.setName("actionDefList");
        _actionDefListOBJ.setType("meta.ActionDefinition");
        _actionDefListOBJ.setValueType("MULTI");
        _actionDefList.setDefinedIn(this);
        addAttributeDefList(_actionDefList);

        AttributeDefinitionDMO _actionsOBJ = new AttributeDefinitionDMO();
        _actions = new AttributeDefinition(_actionsOBJ);
        _actionsOBJ.addDescription("Indicates the set of actions that are supported by a class of objects.");
        _actionsOBJ.setDmdID("32");
        _actionsOBJ.setName("actions");
        _actionsOBJ.setType("meta.ActionDefinition");
        _actionsOBJ.setValueType("MULTI");
        _actions.setDefinedIn(this);
        addAttributeDefList(_actions);

        AttributeDefinitionDMO _allowedParentsOBJ = new AttributeDefinitionDMO();
        _allowedParents = new AttributeDefinition(_allowedParentsOBJ);
        _allowedParentsOBJ.addDescription("Indicates the classes of object that may be parents of the current class when objects are created in an instance hierarchy.");
        _allowedParentsOBJ.setDmdID("62");
        _allowedParentsOBJ.setName("allowedParents");
        _allowedParentsOBJ.setType("meta.ClassDefinition");
        _allowedParentsOBJ.setValueType("MULTI");
        _allowedParents.setDefinedIn(this);
        addAttributeDefList(_allowedParents);

        AttributeDefinitionDMO _altTypeOBJ = new AttributeDefinitionDMO();
        _altType = new AttributeDefinition(_altTypeOBJ);
        _altTypeOBJ.addDescription("The altType indicates an alternate type for a value. For instance when dealing with NameContainers, the value interface is obviously NameContainer, but the secret sauce of NameContainers is that they also take any DmcObjectName derivative. Specifying the altType on the NameContainer TypeDefinition allows for generation of  the DmcObjectName interface as well.");
        _altTypeOBJ.setDmdID("108");
        _altTypeOBJ.setName("altType");
        _altTypeOBJ.setType("meta.String");
        _altType.setDefinedIn(this);
        addAttributeDefList(_altType);

        AttributeDefinitionDMO _altTypeImportOBJ = new AttributeDefinitionDMO();
        _altTypeImport = new AttributeDefinition(_altTypeImportOBJ);
        _altTypeImportOBJ.addDescription("An additional import (if required) by the altType attribute value.");
        _altTypeImportOBJ.setDmdID("109");
        _altTypeImportOBJ.setName("altTypeImport");
        _altTypeImportOBJ.setType("meta.String");
        _altTypeImport.setDefinedIn(this);
        addAttributeDefList(_altTypeImport);

        AttributeDefinitionDMO _applyToAttributeOBJ = new AttributeDefinitionDMO();
        _applyToAttribute = new AttributeDefinition(_applyToAttributeOBJ);
        _applyToAttributeOBJ.addDescription("Indicates the attribute to which an ATTRIBUTE type rule is applied.");
        _applyToAttributeOBJ.setDmdID("157");
        _applyToAttributeOBJ.setName("applyToAttribute");
        _applyToAttributeOBJ.setType("meta.AttributeDefinition");
        _applyToAttribute.setDefinedIn(this);
        addAttributeDefList(_applyToAttribute);

        AttributeDefinitionDMO _applyToClassOBJ = new AttributeDefinitionDMO();
        _applyToClass = new AttributeDefinition(_applyToClassOBJ);
        _applyToClassOBJ.addDescription("The class to which a rule should be applied.");
        _applyToClassOBJ.setDmdID("154");
        _applyToClassOBJ.setName("applyToClass");
        _applyToClassOBJ.setType("meta.ClassDefinition");
        _applyToClass.setDefinedIn(this);
        addAttributeDefList(_applyToClass);

        AttributeDefinitionDMO _attachToClassOBJ = new AttributeDefinitionDMO();
        _attachToClass = new AttributeDefinition(_attachToClassOBJ);
        _attachToClassOBJ.addDescription("Indicates the classes of object to which an action is to be attached. This mechanism allows for the extension of a class's behaviour without having to alter the schema of the class involved. This can be viewed as the auxiliary class equivalent for behaviour.");
        _attachToClassOBJ.setDmdID("65");
        _attachToClassOBJ.setName("attachToClass");
        _attachToClassOBJ.setType("meta.ClassDefinition");
        _attachToClassOBJ.setValueType("MULTI");
        _attachToClass.setDefinedIn(this);
        addAttributeDefList(_attachToClass);

        AttributeDefinitionDMO _attributeDefListOBJ = new AttributeDefinitionDMO();
        _attributeDefList = new AttributeDefinition(_attributeDefListOBJ);
        _attributeDefListOBJ.addDescription("A list of attribute definition references.");
        _attributeDefListOBJ.setDmdID("59");
        _attributeDefListOBJ.setInternalUse("true");
        _attributeDefListOBJ.setName("attributeDefList");
        _attributeDefListOBJ.setType("meta.AttributeDefinition");
        _attributeDefListOBJ.setValueType("MULTI");
        _attributeDefList.setDefinedIn(this);
        addAttributeDefList(_attributeDefList);

        AttributeDefinitionDMO _attributeInfoFromParamOBJ = new AttributeDefinitionDMO();
        _attributeInfoFromParam = new AttributeDefinition(_attributeInfoFromParamOBJ);
        _attributeInfoFromParamOBJ.addDescription("Indicates how the DmcAttributeInfo should be extracted from one of the ruleParam values associated with a RuleCategory. If additional classes are required to support this access, you can specify ruleImport values as appropriate.");
        _attributeInfoFromParamOBJ.setDmdID("155");
        _attributeInfoFromParamOBJ.setName("attributeInfoFromParam");
        _attributeInfoFromParamOBJ.setType("meta.String");
        _attributeInfoFromParam.setDefinedIn(this);
        addAttributeDefList(_attributeInfoFromParam);

        AttributeDefinitionDMO _baseDefinitionOBJ = new AttributeDefinitionDMO();
        _baseDefinition = new AttributeDefinition(_baseDefinitionOBJ);
        _baseDefinitionOBJ.addDescription("A reference to the DSDefinition derived class that is the base class for a  set of definition classes.");
        _baseDefinitionOBJ.setDmdID("164");
        _baseDefinitionOBJ.setName("baseDefinition");
        _baseDefinitionOBJ.setType("meta.DSDefinition");
        _baseDefinition.setDefinedIn(this);
        addAttributeDefList(_baseDefinition);

        AttributeDefinitionDMO _baseTypeOBJ = new AttributeDefinitionDMO();
        _baseType = new AttributeDefinition(_baseTypeOBJ);
        _baseTypeOBJ.addDescription("The broad base type of the data.");
        _baseTypeOBJ.setDmdID("135");
        _baseTypeOBJ.setName("baseType");
        _baseTypeOBJ.setType("meta.BaseTypeEnum");
        _baseType.setDefinedIn(this);
        addAttributeDefList(_baseType);

        AttributeDefinitionDMO _camelCaseNameOBJ = new AttributeDefinitionDMO();
        _camelCaseName = new AttributeDefinition(_camelCaseNameOBJ);
        _camelCaseNameOBJ.addDescription("The camelCaseName attribute is used to store a single camelCase format name for something. The name starts with a single letter and can be followed by a mix of letters and numbers. No spaces or  other characters are allowed.");
        _camelCaseNameOBJ.setDesignatedNameAttribute("true");
        _camelCaseNameOBJ.setDmdID("116");
        _camelCaseNameOBJ.setName("camelCaseName");
        _camelCaseNameOBJ.setType("meta.CamelCaseName");
        _camelCaseName.setDefinedIn(this);
        addAttributeDefList(_camelCaseName);

        AttributeDefinitionDMO _classDefListOBJ = new AttributeDefinitionDMO();
        _classDefList = new AttributeDefinition(_classDefListOBJ);
        _classDefListOBJ.addDescription("A list of class definition references.");
        _classDefListOBJ.setDmdID("55");
        _classDefListOBJ.setInternalUse("true");
        _classDefListOBJ.setName("classDefList");
        _classDefListOBJ.setType("meta.ClassDefinition");
        _classDefListOBJ.setValueType("MULTI");
        _classDefList.setDefinedIn(this);
        addAttributeDefList(_classDefList);

        AttributeDefinitionDMO _classFilterOBJ = new AttributeDefinitionDMO();
        _classFilter = new AttributeDefinition(_classFilterOBJ);
        _classFilterOBJ.addDescription("The classFilter is used to performing matching of objects based on their class or auxiliary classes.");
        _classFilterOBJ.setDesignatedFilterAttribute("true");
        _classFilterOBJ.setDmdID("128");
        _classFilterOBJ.setName("classFilter");
        _classFilterOBJ.setType("meta.ClassFilter");
        _classFilter.setDefinedIn(this);
        addAttributeDefList(_classFilter);

        AttributeDefinitionDMO _classInfoFromParamOBJ = new AttributeDefinitionDMO();
        _classInfoFromParam = new AttributeDefinition(_classInfoFromParamOBJ);
        _classInfoFromParamOBJ.addDescription("Indicates how the DmcClassInfo should be extracted from one of the ruleParam values associated with a RuleCategory. If additional classes are required to support this access, you can specify ruleImport values as appropriate.");
        _classInfoFromParamOBJ.setDmdID("151");
        _classInfoFromParamOBJ.setName("classInfoFromParam");
        _classInfoFromParamOBJ.setType("meta.String");
        _classInfoFromParam.setDefinedIn(this);
        addAttributeDefList(_classInfoFromParam);

        AttributeDefinitionDMO _classTypeOBJ = new AttributeDefinitionDMO();
        _classType = new AttributeDefinition(_classTypeOBJ);
        _classTypeOBJ.addDescription("This attribute indicates the type of a class definition.");
        _classTypeOBJ.setDmdID("10");
        _classTypeOBJ.setName("classType");
        _classTypeOBJ.setType("meta.ClassTypeEnum");
        _classType.setDefinedIn(this);
        addAttributeDefList(_classType);

        AttributeDefinitionDMO _codeCommentOBJ = new AttributeDefinitionDMO();
        _codeComment = new AttributeDefinition(_codeCommentOBJ);
        _codeCommentOBJ.addDescription("A brief comment that will be included in generated code to give users a basic idea of what the purpose of something like an attribute or class or type is for. For more long winded explanations, you should use the description attribute whose contents are used as the basis for HTML based documentation. <p/> By convention, generated HTML will have the code comments followed by the description followed by any examples you've provided.");
        _codeCommentOBJ.setDmdID("188");
        _codeCommentOBJ.setName("codeComment");
        _codeCommentOBJ.setType("meta.String");
        _codeCommentOBJ.setValueType("MULTI");
        _codeComment.setDefinedIn(this);
        addAttributeDefList(_codeComment);

        AttributeDefinitionDMO _commentOBJ = new AttributeDefinitionDMO();
        _comment = new AttributeDefinition(_commentOBJ);
        _commentOBJ.addDescription("A comment or note associated with the definition of something. For code that's generated from a definition, comments may be added to the code, as opposed to  descriptions which are meant to assist in generating documentation. In the end, it's up to the designer of a DSL to determine how comments are used.");
        _commentOBJ.setDmdID("185");
        _commentOBJ.setName("comment");
        _commentOBJ.setType("meta.String");
        _commentOBJ.setValueType("MULTI");
        _comment.setDefinedIn(this);
        addAttributeDefList(_comment);

        AttributeDefinitionDMO _complexTypeDefListOBJ = new AttributeDefinitionDMO();
        _complexTypeDefList = new AttributeDefinition(_complexTypeDefListOBJ);
        _complexTypeDefListOBJ.addDescription("A list of complex type definition references.");
        _complexTypeDefListOBJ.setDmdID("117");
        _complexTypeDefListOBJ.setInternalUse("true");
        _complexTypeDefListOBJ.setName("complexTypeDefList");
        _complexTypeDefListOBJ.setType("meta.ComplexTypeDefinition");
        _complexTypeDefListOBJ.setValueType("MULTI");
        _complexTypeDefList.setDefinedIn(this);
        addAttributeDefList(_complexTypeDefList);

        AttributeDefinitionDMO _createAttributeFactoryOBJ = new AttributeDefinitionDMO();
        _createAttributeFactory = new AttributeDefinition(_createAttributeFactoryOBJ);
        _createAttributeFactoryOBJ.addDescription("When specified as true on a SchemaDefinition, the DMO generation utility will create a free standing AttributeFactory for the schema. This allows for the creation of attributes taht can then be embedded in complex objects and properly serialized/deserialized.");
        _createAttributeFactoryOBJ.setDmdID("89");
        _createAttributeFactoryOBJ.setName("createAttributeFactory");
        _createAttributeFactoryOBJ.setType("meta.Boolean");
        _createAttributeFactory.setDefinedIn(this);
        addAttributeDefList(_createAttributeFactory);

        AttributeDefinitionDMO _dataTypeOBJ = new AttributeDefinitionDMO();
        _dataType = new AttributeDefinition(_dataTypeOBJ);
        _dataTypeOBJ.addDescription("This attribute indicates the persistence characteristics of an attribute or class of object. How this information is used is application dependent.");
        _dataTypeOBJ.setDmdID("11");
        _dataTypeOBJ.setName("dataType");
        _dataTypeOBJ.setType("meta.DataTypeEnum");
        _dataType.setDefinedIn(this);
        addAttributeDefList(_dataType);

        AttributeDefinitionDMO _defFilesOBJ = new AttributeDefinitionDMO();
        _defFiles = new AttributeDefinition(_defFilesOBJ);
        _defFilesOBJ.addDescription("A list of files that contain the class, attribute and type definitions that comprise a schema.");
        _defFilesOBJ.setDmdID("68");
        _defFilesOBJ.setName("defFiles");
        _defFilesOBJ.setType("meta.String");
        _defFilesOBJ.setValueType("MULTI");
        _defFiles.setDefinedIn(this);
        addAttributeDefList(_defFiles);

        AttributeDefinitionDMO _definedInOBJ = new AttributeDefinitionDMO();
        _definedIn = new AttributeDefinition(_definedInOBJ);
        _definedInOBJ.addDescription("Indicates the schema in which a type, attribute or class is defined.");
        _definedInOBJ.setDmdID("61");
        _definedInOBJ.setInternalUse("true");
        _definedInOBJ.setName("definedIn");
        _definedInOBJ.setType("meta.SchemaDefinition");
        _definedIn.setDefinedIn(this);
        addAttributeDefList(_definedIn);

        AttributeDefinitionDMO _definedInModuleAttributeOBJ = new AttributeDefinitionDMO();
        _definedInModuleAttribute = new AttributeDefinition(_definedInModuleAttributeOBJ);
        _definedInModuleAttributeOBJ.addDescription("The name of the attribute that will be set on all definitions associated with a DSD to indicate the module from which a definition was loaded.");
        _definedInModuleAttributeOBJ.setDmdID("167");
        _definedInModuleAttributeOBJ.setName("definedInModuleAttribute");
        _definedInModuleAttributeOBJ.setType("meta.AttributeDefinition");
        _definedInModuleAttribute.setDefinedIn(this);
        addAttributeDefList(_definedInModuleAttribute);

        AttributeDefinitionDMO _dependenciesOBJ = new AttributeDefinitionDMO();
        _dependencies = new AttributeDefinition(_dependenciesOBJ);
        _dependenciesOBJ.addDescription("A set of references to Dependencies.");
        _dependenciesOBJ.setDmdID("147");
        _dependenciesOBJ.setName("dependencies");
        _dependenciesOBJ.setType("meta.Dependency");
        _dependenciesOBJ.setValueType("MULTI");
        _dependencies.setDefinedIn(this);
        addAttributeDefList(_dependencies);

        AttributeDefinitionDMO _dependencyOBJ = new AttributeDefinitionDMO();
        _dependency = new AttributeDefinition(_dependencyOBJ);
        _dependencyOBJ.addDescription("A reference to a single Dependency.");
        _dependencyOBJ.setDmdID("146");
        _dependencyOBJ.setName("dependency");
        _dependencyOBJ.setType("meta.Dependency");
        _dependency.setDefinedIn(this);
        addAttributeDefList(_dependency);

        AttributeDefinitionDMO _dependsOnOBJ = new AttributeDefinitionDMO();
        _dependsOn = new AttributeDefinition(_dependsOnOBJ);
        _dependsOnOBJ.addDescription("A list of schema names.");
        _dependsOnOBJ.setDmdID("66");
        _dependsOnOBJ.setName("dependsOn");
        _dependsOnOBJ.setType("meta.String");
        _dependsOnOBJ.setValueType("MULTI");
        _dependsOn.setDefinedIn(this);
        addAttributeDefList(_dependsOn);

        AttributeDefinitionDMO _dependsOnRefOBJ = new AttributeDefinitionDMO();
        _dependsOnRef = new AttributeDefinition(_dependsOnRefOBJ);
        _dependsOnRefOBJ.addDescription("A list of schema references that are based on the contents of the dependsOn attribute.");
        _dependsOnRefOBJ.setDmdID("67");
        _dependsOnRefOBJ.setInternalUse("true");
        _dependsOnRefOBJ.setName("dependsOnRef");
        _dependsOnRefOBJ.setType("meta.SchemaDefinition");
        _dependsOnRefOBJ.setValueType("MULTI");
        _dependsOnRef.setDefinedIn(this);
        addAttributeDefList(_dependsOnRef);

        AttributeDefinitionDMO _dependsOnSchemaOBJ = new AttributeDefinitionDMO();
        _dependsOnSchema = new AttributeDefinition(_dependsOnSchemaOBJ);
        _dependsOnSchemaOBJ.addDescription("Indicates the schema(s) on which something depends.");
        _dependsOnSchemaOBJ.setDmdID("120");
        _dependsOnSchemaOBJ.setName("dependsOnSchema");
        _dependsOnSchemaOBJ.setType("meta.String");
        _dependsOnSchemaOBJ.setValueType("MULTI");
        _dependsOnSchema.setDefinedIn(this);
        addAttributeDefList(_dependsOnSchema);

        AttributeDefinitionDMO _derivedClassesOBJ = new AttributeDefinitionDMO();
        _derivedClasses = new AttributeDefinition(_derivedClassesOBJ);
        _derivedClassesOBJ.addDescription("Indicates the classes that are known to be derived from a class.");
        _derivedClassesOBJ.setDmdID("25");
        _derivedClassesOBJ.setInternalUse("true");
        _derivedClassesOBJ.setName("derivedClasses");
        _derivedClassesOBJ.setType("meta.ClassDefinition");
        _derivedClassesOBJ.setValueType("MULTI");
        _derivedClasses.setDefinedIn(this);
        addAttributeDefList(_derivedClasses);

        AttributeDefinitionDMO _derivedFromOBJ = new AttributeDefinitionDMO();
        _derivedFrom = new AttributeDefinition(_derivedFromOBJ);
        _derivedFromOBJ.addDescription("Indicates the abstract or structural class from which this class is derived.");
        _derivedFromOBJ.setDmdID("21");
        _derivedFromOBJ.setName("derivedFrom");
        _derivedFromOBJ.setType("meta.ClassDefinition");
        _derivedFrom.setDefinedIn(this);
        addAttributeDefList(_derivedFrom);

        AttributeDefinitionDMO _descriptionOBJ = new AttributeDefinitionDMO();
        _description = new AttributeDefinition(_descriptionOBJ);
        _descriptionOBJ.addDescription("The description attribute is used to provide descriptive documentation for schema related definitions. The text provided should conform to XHTML concepts since it will be dumped in the context of the generated HTML documentation.");
        _descriptionOBJ.setDmdID("18");
        _descriptionOBJ.setName("description");
        _descriptionOBJ.setPreserveNewlines("true");
        _descriptionOBJ.setType("meta.String");
        _descriptionOBJ.setValueType("MULTI");
        _description.setDefinedIn(this);
        addAttributeDefList(_description);

        AttributeDefinitionDMO _designatedFilterAttributeOBJ = new AttributeDefinitionDMO();
        _designatedFilterAttribute = new AttributeDefinition(_designatedFilterAttributeOBJ);
        _designatedFilterAttributeOBJ.addDescription("The designatedFilterAttribute flag is used to identify the attribute designated as the standard wrapper for filters of a particular type.  One, and only one, attribute definition can be the designatedFilterAttribute for a  TypeDefinition that is identified as isFilterType.");
        _designatedFilterAttributeOBJ.setDmdID("126");
        _designatedFilterAttributeOBJ.setName("designatedFilterAttribute");
        _designatedFilterAttributeOBJ.setType("meta.Boolean");
        _designatedFilterAttribute.setDefinedIn(this);
        addAttributeDefList(_designatedFilterAttribute);

        AttributeDefinitionDMO _designatedNameAttributeOBJ = new AttributeDefinitionDMO();
        _designatedNameAttribute = new AttributeDefinition(_designatedNameAttributeOBJ);
        _designatedNameAttributeOBJ.addDescription("The designatedNameAttribute flag is used to identify the attribute designated as the standard wrapper for names of a particular type. One, and only one, attribute definition can be the designatedNameAttribute for a TypeDefinition that has isNameType true.");
        _designatedNameAttributeOBJ.setDmdID("102");
        _designatedNameAttributeOBJ.setName("designatedNameAttribute");
        _designatedNameAttributeOBJ.setType("meta.Boolean");
        _designatedNameAttribute.setDefinedIn(this);
        addAttributeDefList(_designatedNameAttribute);

        AttributeDefinitionDMO _dmdIDOBJ = new AttributeDefinitionDMO();
        _dmdID = new AttributeDefinition(_dmdIDOBJ);
        _dmdIDOBJ.addCodeComment("The unique integer identifier associated with  a dark-matter schema class or attribute.");
        _dmdIDOBJ.addDescription("Dark-matter identifiers facilitate the compact serialization of dark-matter objects (DMOs); see the serializeIt() and deserializeIt() methods of the DmcObject. <p/> This mechanism also allows for compact transport of dark-matter objects when used with Google Web Toolkit (GWT) RPC mechanisms. When objects are passed back and forth via RPC, the dark-matter identifiers are used instead of the string-based attribute names, which are usually much more lengthy. This optimization is transparently supported by the  DmcObject; you don't need to worry about how it's achieved. <p/> However, if you're curious, have a look at the Compact Schema documentation.");
        _dmdIDOBJ.setDmdID("3");
        _dmdIDOBJ.setName("dmdID");
        _dmdIDOBJ.setType("meta.Integer");
        _dmdID.setDefinedIn(this);
        addAttributeDefList(_dmdID);

        AttributeDefinitionDMO _dmeClassOBJ = new AttributeDefinitionDMO();
        _dmeClass = new AttributeDefinition(_dmeClassOBJ);
        _dmeClassOBJ.addDescription("This attribute indicates just the Dark Matter Extended (DME) class name.");
        _dmeClassOBJ.setDmdID("44");
        _dmeClassOBJ.setInternalUse("true");
        _dmeClassOBJ.setName("dmeClass");
        _dmeClassOBJ.setType("meta.String");
        _dmeClass.setDefinedIn(this);
        addAttributeDefList(_dmeClass);

        AttributeDefinitionDMO _dmeImportOBJ = new AttributeDefinitionDMO();
        _dmeImport = new AttributeDefinition(_dmeImportOBJ);
        _dmeImportOBJ.addDescription("This attribute indicates the full name of the class that extends a DMW class. Dark Matter Extended (DME).");
        _dmeImportOBJ.setDmdID("43");
        _dmeImportOBJ.setInternalUse("true");
        _dmeImportOBJ.setName("dmeImport");
        _dmeImportOBJ.setType("meta.String");
        _dmeImport.setDefinedIn(this);
        addAttributeDefList(_dmeImport);

        AttributeDefinitionDMO _dmoAuxClassOBJ = new AttributeDefinitionDMO();
        _dmoAuxClass = new AttributeDefinition(_dmoAuxClassOBJ);
        _dmoAuxClassOBJ.addDescription("This attribute indicates just the DMO class name e.g. MyClassAUXDMO");
        _dmoAuxClassOBJ.setDmdID("37");
        _dmoAuxClassOBJ.setInternalUse("true");
        _dmoAuxClassOBJ.setName("dmoAuxClass");
        _dmoAuxClassOBJ.setType("meta.String");
        _dmoAuxClass.setDefinedIn(this);
        addAttributeDefList(_dmoAuxClass);

        AttributeDefinitionDMO _dmoAuxClassImportOBJ = new AttributeDefinitionDMO();
        _dmoAuxClassImport = new AttributeDefinition(_dmoAuxClassImportOBJ);
        _dmoAuxClassImportOBJ.addDescription("This attribute indicates the full name of the MyClassAUXDMO class");
        _dmoAuxClassImportOBJ.setDmdID("38");
        _dmoAuxClassImportOBJ.setInternalUse("true");
        _dmoAuxClassImportOBJ.setName("dmoAuxClassImport");
        _dmoAuxClassImportOBJ.setType("meta.String");
        _dmoAuxClassImport.setDefinedIn(this);
        addAttributeDefList(_dmoAuxClassImport);

        AttributeDefinitionDMO _dmoClassOBJ = new AttributeDefinitionDMO();
        _dmoClass = new AttributeDefinition(_dmoClassOBJ);
        _dmoClassOBJ.addDescription("This attribute indicates just the DMO class name e.g. MyClassDMO");
        _dmoClassOBJ.setDmdID("36");
        _dmoClassOBJ.setInternalUse("true");
        _dmoClassOBJ.setName("dmoClass");
        _dmoClassOBJ.setType("meta.String");
        _dmoClass.setDefinedIn(this);
        addAttributeDefList(_dmoClass);

        AttributeDefinitionDMO _dmoImportOBJ = new AttributeDefinitionDMO();
        _dmoImport = new AttributeDefinition(_dmoImportOBJ);
        _dmoImportOBJ.addDescription("This attribute indicates the full name of the generated Dark Matter Object (DMO) class (including package) that is generated for this class. The class will always have DmcObject at the top of its derivation hierarchy.");
        _dmoImportOBJ.setDmdID("35");
        _dmoImportOBJ.setInternalUse("true");
        _dmoImportOBJ.setName("dmoImport");
        _dmoImportOBJ.setType("meta.String");
        _dmoImport.setDefinedIn(this);
        addAttributeDefList(_dmoImport);

        AttributeDefinitionDMO _dmtClassOBJ = new AttributeDefinitionDMO();
        _dmtClass = new AttributeDefinition(_dmtClassOBJ);
        _dmtClassOBJ.addDescription("This attribute indicates just the DmcType class name.");
        _dmtClassOBJ.setDmdID("46");
        _dmtClassOBJ.setInternalUse("true");
        _dmtClassOBJ.setName("dmtClass");
        _dmtClassOBJ.setType("meta.String");
        _dmtClass.setDefinedIn(this);
        addAttributeDefList(_dmtClass);

        AttributeDefinitionDMO _dmtImportOBJ = new AttributeDefinitionDMO();
        _dmtImport = new AttributeDefinition(_dmtImportOBJ);
        _dmtImportOBJ.addDescription("This attribute indicates the full name of the DmcType class used to reference a class. These types are auto generated and named DmcType<classname>REF.");
        _dmtImportOBJ.setDmdID("45");
        _dmtImportOBJ.setInternalUse("true");
        _dmtImportOBJ.setName("dmtImport");
        _dmtImportOBJ.setType("meta.String");
        _dmtImport.setDefinedIn(this);
        addAttributeDefList(_dmtImport);

        AttributeDefinitionDMO _dmtREFImportOBJ = new AttributeDefinitionDMO();
        _dmtREFImport = new AttributeDefinition(_dmtREFImportOBJ);
        _dmtREFImportOBJ.addDescription("This attribute indicates the full name of the class used to reference a class. These types are auto generated and named <classname>REF.");
        _dmtREFImportOBJ.setDmdID("93");
        _dmtREFImportOBJ.setInternalUse("true");
        _dmtREFImportOBJ.setName("dmtREFImport");
        _dmtREFImportOBJ.setType("meta.String");
        _dmtREFImport.setDefinedIn(this);
        addAttributeDefList(_dmtREFImport);

        AttributeDefinitionDMO _dmwAuxClassOBJ = new AttributeDefinitionDMO();
        _dmwAuxClass = new AttributeDefinition(_dmwAuxClassOBJ);
        _dmwAuxClassOBJ.addDescription("This attribute indicates just the DMO class name e.g. MyClassAUX");
        _dmwAuxClassOBJ.setDmdID("39");
        _dmwAuxClassOBJ.setInternalUse("true");
        _dmwAuxClassOBJ.setName("dmwAuxClass");
        _dmwAuxClassOBJ.setType("meta.String");
        _dmwAuxClass.setDefinedIn(this);
        addAttributeDefList(_dmwAuxClass);

        AttributeDefinitionDMO _dmwAuxClassImportOBJ = new AttributeDefinitionDMO();
        _dmwAuxClassImport = new AttributeDefinition(_dmwAuxClassImportOBJ);
        _dmwAuxClassImportOBJ.addDescription("This attribute indicates the full name of the MyClassAUX class");
        _dmwAuxClassImportOBJ.setDmdID("40");
        _dmwAuxClassImportOBJ.setInternalUse("true");
        _dmwAuxClassImportOBJ.setName("dmwAuxClassImport");
        _dmwAuxClassImportOBJ.setType("meta.String");
        _dmwAuxClassImport.setDefinedIn(this);
        addAttributeDefList(_dmwAuxClassImport);

        AttributeDefinitionDMO _dmwClassOBJ = new AttributeDefinitionDMO();
        _dmwClass = new AttributeDefinition(_dmwClassOBJ);
        _dmwClassOBJ.addDescription("This attribute indicates just the DMW class name, eg MyClassDMW");
        _dmwClassOBJ.setDmdID("42");
        _dmwClassOBJ.setInternalUse("true");
        _dmwClassOBJ.setName("dmwClass");
        _dmwClassOBJ.setType("meta.String");
        _dmwClass.setDefinedIn(this);
        addAttributeDefList(_dmwClass);

        AttributeDefinitionDMO _dmwImportOBJ = new AttributeDefinitionDMO();
        _dmwImport = new AttributeDefinition(_dmwImportOBJ);
        _dmwImportOBJ.addDescription("This attribute indicates the full name of the generated Dark Matter Wrapper (DMW) class (including package) that is wrapped by this class. The class will always be a derived class of DmwWrapperBase.");
        _dmwImportOBJ.setDmdID("41");
        _dmwImportOBJ.setInternalUse("true");
        _dmwImportOBJ.setName("dmwImport");
        _dmwImportOBJ.setType("meta.String");
        _dmwImport.setDefinedIn(this);
        addAttributeDefList(_dmwImport);

        AttributeDefinitionDMO _dmwIteratorClassOBJ = new AttributeDefinitionDMO();
        _dmwIteratorClass = new AttributeDefinition(_dmwIteratorClassOBJ);
        _dmwIteratorClassOBJ.addDescription("This attribute indicates just the DmcContainerIterator name for a class of object.");
        _dmwIteratorClassOBJ.setDmdID("92");
        _dmwIteratorClassOBJ.setInternalUse("true");
        _dmwIteratorClassOBJ.setName("dmwIteratorClass");
        _dmwIteratorClassOBJ.setType("meta.String");
        _dmwIteratorClass.setDefinedIn(this);
        addAttributeDefList(_dmwIteratorClass);

        AttributeDefinitionDMO _dmwIteratorImportOBJ = new AttributeDefinitionDMO();
        _dmwIteratorImport = new AttributeDefinition(_dmwIteratorImportOBJ);
        _dmwIteratorImportOBJ.addDescription("This attribute indicates the full name of the DmcContainerIterator  derived class that allows us to iterate over a set of object references and get back the DMW wrapper object instead of the DMO.");
        _dmwIteratorImportOBJ.setDmdID("91");
        _dmwIteratorImportOBJ.setInternalUse("true");
        _dmwIteratorImportOBJ.setName("dmwIteratorImport");
        _dmwIteratorImportOBJ.setType("meta.String");
        _dmwIteratorImport.setDefinedIn(this);
        addAttributeDefList(_dmwIteratorImport);

        AttributeDefinitionDMO _dmwPackageOBJ = new AttributeDefinitionDMO();
        _dmwPackage = new AttributeDefinition(_dmwPackageOBJ);
        _dmwPackageOBJ.addDescription("Indicates the package where server related Dark Matter Wrapper classes  were generated for this schema. This is used when we're generating derived wrapper classes.");
        _dmwPackageOBJ.setDmdID("54");
        _dmwPackageOBJ.setName("dmwPackage");
        _dmwPackageOBJ.setType("meta.String");
        _dmwPackage.setDefinedIn(this);
        addAttributeDefList(_dmwPackage);

        AttributeDefinitionDMO _dmwTypeToPackageOBJ = new AttributeDefinitionDMO();
        _dmwTypeToPackage = new AttributeDefinition(_dmwTypeToPackageOBJ);
        _dmwTypeToPackageOBJ.addDescription("The dmwTypeToPackage attribute is used to indicate alternative generation packages for the Dark Matter Wrapper (DMW) code generation mechanisms. For instance, if we  want to generate GXT wrappers for use with Sencha's GXT model classes, we could specify dmwTypeToPackage gxt com.example.client. Each of schemas that's loaded for generation would have to have this same attribute specified so that, if there were derived classes across schemas, the appropriate wrapper derivations could be determined. See the ClassDefintion.adjustClass() method to see how this is used.");
        _dmwTypeToPackageOBJ.setDmdID("123");
        _dmwTypeToPackageOBJ.setName("dmwTypeToPackage");
        _dmwTypeToPackageOBJ.setType("meta.StringToString");
        _dmwTypeToPackageOBJ.setValueType("MULTI");
        _dmwTypeToPackage.setDefinedIn(this);
        addAttributeDefList(_dmwTypeToPackage);

        AttributeDefinitionDMO _dmwWrapperTypeOBJ = new AttributeDefinitionDMO();
        _dmwWrapperType = new AttributeDefinition(_dmwWrapperTypeOBJ);
        _dmwWrapperTypeOBJ.addDescription("The dmwWrapperType is used to indicate whether or not you want extended wrappers when the wrappers are generated for an object in a particular generation context.");
        _dmwWrapperTypeOBJ.setDmdID("124");
        _dmwWrapperTypeOBJ.setName("dmwWrapperType");
        _dmwWrapperTypeOBJ.setType("meta.DmwTypeToWrapperType");
        _dmwWrapperTypeOBJ.setValueType("MULTI");
        _dmwWrapperType.setDefinedIn(this);
        addAttributeDefList(_dmwWrapperType);

        AttributeDefinitionDMO _dotNameOBJ = new AttributeDefinitionDMO();
        _dotName = new AttributeDefinition(_dotNameOBJ);
        _dotNameOBJ.addDescription("The dotName attribute is used to store dot separated names.");
        _dotNameOBJ.setDesignatedNameAttribute("true");
        _dotNameOBJ.setDmdID("107");
        _dotNameOBJ.setName("dotName");
        _dotNameOBJ.setType("meta.DotName");
        _dotName.setDefinedIn(this);
        addAttributeDefList(_dotName);

        AttributeDefinitionDMO _dsdModuleDefinitionOBJ = new AttributeDefinitionDMO();
        _dsdModuleDefinition = new AttributeDefinition(_dsdModuleDefinitionOBJ);
        _dsdModuleDefinitionOBJ.addDescription("The DSDefinitionModule that resulted in the creation of an internally generated ClassDefinition.");
        _dsdModuleDefinitionOBJ.setDmdID("168");
        _dsdModuleDefinitionOBJ.setInternalUse("true");
        _dsdModuleDefinitionOBJ.setName("dsdModuleDefinition");
        _dsdModuleDefinitionOBJ.setType("meta.DSDefinitionModule");
        _dsdModuleDefinition.setDefinedIn(this);
        addAttributeDefList(_dsdModuleDefinition);

        AttributeDefinitionDMO _dsdModuleListOBJ = new AttributeDefinitionDMO();
        _dsdModuleList = new AttributeDefinition(_dsdModuleListOBJ);
        _dsdModuleListOBJ.addDescription("The set of DSDefinitionModules defined in a schema.");
        _dsdModuleListOBJ.setDmdID("169");
        _dsdModuleListOBJ.setName("dsdModuleList");
        _dsdModuleListOBJ.setType("meta.DSDefinitionModule");
        _dsdModuleListOBJ.setValueType("MULTI");
        _dsdModuleList.setDefinedIn(this);
        addAttributeDefList(_dsdModuleList);

        AttributeDefinitionDMO _enumDefListOBJ = new AttributeDefinitionDMO();
        _enumDefList = new AttributeDefinition(_enumDefListOBJ);
        _enumDefListOBJ.addDescription("A list of EnumDefinitions.");
        _enumDefListOBJ.setDmdID("58");
        _enumDefListOBJ.setInternalUse("true");
        _enumDefListOBJ.setName("enumDefList");
        _enumDefListOBJ.setType("meta.EnumDefinition");
        _enumDefListOBJ.setValueType("MULTI");
        _enumDefList.setDefinedIn(this);
        addAttributeDefList(_enumDefList);

        AttributeDefinitionDMO _enumIntOBJ = new AttributeDefinitionDMO();
        _enumInt = new AttributeDefinition(_enumIntOBJ);
        _enumIntOBJ.addDescription("The integer value associated with an enumeration value.");
        _enumIntOBJ.setDmdID("69");
        _enumIntOBJ.setName("enumInt");
        _enumIntOBJ.setType("meta.Integer");
        _enumInt.setDefinedIn(this);
        addAttributeDefList(_enumInt);

        AttributeDefinitionDMO _enumNameOBJ = new AttributeDefinitionDMO();
        _enumName = new AttributeDefinition(_enumNameOBJ);
        _enumNameOBJ.addDescription("The original name of an enum as referred to in the internally generated type for enums.");
        _enumNameOBJ.setDmdID("99");
        _enumNameOBJ.setInternalUse("true");
        _enumNameOBJ.setName("enumName");
        _enumNameOBJ.setType("meta.String");
        _enumName.setDefinedIn(this);
        addAttributeDefList(_enumName);

        AttributeDefinitionDMO _enumStringOBJ = new AttributeDefinitionDMO();
        _enumString = new AttributeDefinition(_enumStringOBJ);
        _enumStringOBJ.addDescription("The string value associated with an enumeration value.");
        _enumStringOBJ.setDmdID("70");
        _enumStringOBJ.setName("enumString");
        _enumStringOBJ.setType("meta.String");
        _enumString.setDefinedIn(this);
        addAttributeDefList(_enumString);

        AttributeDefinitionDMO _enumValueOBJ = new AttributeDefinitionDMO();
        _enumValue = new AttributeDefinition(_enumValueOBJ);
        _enumValueOBJ.addDescription("Indicates the set of enum values associated with an enumeration type definition.");
        _enumValueOBJ.setDmdID("33");
        _enumValueOBJ.setName("enumValue");
        _enumValueOBJ.setType("meta.EnumValue");
        _enumValueOBJ.setValueType("MULTI");
        _enumValue.setDefinedIn(this);
        addAttributeDefList(_enumValue);

        AttributeDefinitionDMO _exampleOBJ = new AttributeDefinitionDMO();
        _example = new AttributeDefinition(_exampleOBJ);
        _exampleOBJ.addDescription("The example attribute is used to provide additional examples of how some defined thing is to be used.");
        _exampleOBJ.setDmdID("63");
        _exampleOBJ.setName("example");
        _exampleOBJ.setPreserveNewlines("true");
        _exampleOBJ.setType("meta.Example");
        _exampleOBJ.setValueType("MULTI");
        _example.setDefinedIn(this);
        addAttributeDefList(_example);

        AttributeDefinitionDMO _excludeFromContextOBJ = new AttributeDefinitionDMO();
        _excludeFromContext = new AttributeDefinition(_excludeFromContextOBJ);
        _excludeFromContextOBJ.addDescription("The excludeFromContext attribute is used to indicate that a class of object (and all of its derivatives) should be excluded from the wrapper generation for the specified context. An example usage is in the Dark Matter Protocol where we don't want to generate wrappers for the message objects in a GXT context.");
        _excludeFromContextOBJ.setDmdID("130");
        _excludeFromContextOBJ.setName("excludeFromContext");
        _excludeFromContextOBJ.setType("meta.String");
        _excludeFromContextOBJ.setValueType("MULTI");
        _excludeFromContext.setDefinedIn(this);
        addAttributeDefList(_excludeFromContext);

        AttributeDefinitionDMO _extendedClassOBJ = new AttributeDefinitionDMO();
        _extendedClass = new AttributeDefinition(_extendedClassOBJ);
        _extendedClassOBJ.addDescription("The extendedClass indicates the fully qualified name of the class that is derived from the generated ComplexType to provide additional behaviour.");
        _extendedClassOBJ.setDmdID("106");
        _extendedClassOBJ.setName("extendedClass");
        _extendedClassOBJ.setType("meta.String");
        _extendedClass.setDefinedIn(this);
        addAttributeDefList(_extendedClass);

        AttributeDefinitionDMO _extendedReferenceClassOBJ = new AttributeDefinitionDMO();
        _extendedReferenceClass = new AttributeDefinition(_extendedReferenceClassOBJ);
        _extendedReferenceClassOBJ.addDescription("Indicates the class of object to which an  ExtendedReferenceTypeDefinition refers.");
        _extendedReferenceClassOBJ.setDmdID("131");
        _extendedReferenceClassOBJ.setName("extendedReferenceClass");
        _extendedReferenceClassOBJ.setType("meta.ClassDefinition");
        _extendedReferenceClass.setDefinedIn(this);
        addAttributeDefList(_extendedReferenceClass);

        AttributeDefinitionDMO _extendedReferenceTypeDefListOBJ = new AttributeDefinitionDMO();
        _extendedReferenceTypeDefList = new AttributeDefinition(_extendedReferenceTypeDefListOBJ);
        _extendedReferenceTypeDefListOBJ.addDescription("A list of extended reference type definition references.");
        _extendedReferenceTypeDefListOBJ.setDmdID("132");
        _extendedReferenceTypeDefListOBJ.setInternalUse("true");
        _extendedReferenceTypeDefListOBJ.setName("extendedReferenceTypeDefList");
        _extendedReferenceTypeDefListOBJ.setType("meta.ExtendedReferenceTypeDefinition");
        _extendedReferenceTypeDefListOBJ.setValueType("MULTI");
        _extendedReferenceTypeDefList.setDefinedIn(this);
        addAttributeDefList(_extendedReferenceTypeDefList);

        AttributeDefinitionDMO _extendsInterfaceOBJ = new AttributeDefinitionDMO();
        _extendsInterface = new AttributeDefinition(_extendsInterfaceOBJ);
        _extendsInterfaceOBJ.addDescription("Indicates the fully qualifed name of an interface that an interface extends.");
        _extendsInterfaceOBJ.setDmdID("119");
        _extendsInterfaceOBJ.setName("extendsInterface");
        _extendsInterfaceOBJ.setType("meta.String");
        _extendsInterfaceOBJ.setValueType("MULTI");
        _extendsInterface.setDefinedIn(this);
        addAttributeDefList(_extendsInterface);

        AttributeDefinitionDMO _fieldSeparatorOBJ = new AttributeDefinitionDMO();
        _fieldSeparator = new AttributeDefinition(_fieldSeparatorOBJ);
        _fieldSeparatorOBJ.addDescription("The fieldSeparator is used to indicate the separation character used when a ComplexType is represented as a String. If a fieldSeparator isn't specified, it is assumed to be a space.");
        _fieldSeparatorOBJ.setDmdID("104");
        _fieldSeparatorOBJ.setName("fieldSeparator");
        _fieldSeparatorOBJ.setType("meta.String");
        _fieldSeparator.setDefinedIn(this);
        addAttributeDefList(_fieldSeparator);

        AttributeDefinitionDMO _fileOBJ = new AttributeDefinitionDMO();
        _file = new AttributeDefinition(_fileOBJ);
        _fileOBJ.addDescription("Indicates the file from which a definition was loaded.");
        _fileOBJ.setDmdID("74");
        _fileOBJ.setInternalUse("true");
        _fileOBJ.setName("file");
        _fileOBJ.setType("meta.String");
        _file.setDefinedIn(this);
        addAttributeDefList(_file);

        AttributeDefinitionDMO _fileExtensionOBJ = new AttributeDefinitionDMO();
        _fileExtension = new AttributeDefinition(_fileExtensionOBJ);
        _fileExtensionOBJ.addDescription("Indicates the extension of files of a particular type.");
        _fileExtensionOBJ.setDmdID("161");
        _fileExtensionOBJ.setName("fileExtension");
        _fileExtensionOBJ.setType("meta.String");
        _fileExtension.setDefinedIn(this);
        addAttributeDefList(_fileExtension);

        AttributeDefinitionDMO _filterAttributeDefOBJ = new AttributeDefinitionDMO();
        _filterAttributeDef = new AttributeDefinition(_filterAttributeDefOBJ);
        _filterAttributeDefOBJ.addDescription("The filterAttributeDef is a reference to the attribute that is locked to a TypeDefinition that is flagged as filterType. This mechanism is used to create the correct type of DmcType[FILTERTYPE]SV derivative for a value of type DmcFilter.");
        _filterAttributeDefOBJ.setDmdID("127");
        _filterAttributeDefOBJ.setInternalUse("true");
        _filterAttributeDefOBJ.setName("filterAttributeDef");
        _filterAttributeDefOBJ.setType("meta.AttributeDefinition");
        _filterAttributeDef.setDefinedIn(this);
        addAttributeDefList(_filterAttributeDef);

        AttributeDefinitionDMO _generatedFileHeaderOBJ = new AttributeDefinitionDMO();
        _generatedFileHeader = new AttributeDefinition(_generatedFileHeaderOBJ);
        _generatedFileHeaderOBJ.addDescription("The name of file that coresides with the schema.dms file that contains a common header to be applied to all generated code. For instance, you might want a common licensing comment at the top of your generated files.");
        _generatedFileHeaderOBJ.setDmdID("81");
        _generatedFileHeaderOBJ.setName("generatedFileHeader");
        _generatedFileHeaderOBJ.setType("meta.String");
        _generatedFileHeader.setDefinedIn(this);
        addAttributeDefList(_generatedFileHeader);

        AttributeDefinitionDMO _genericArgsOBJ = new AttributeDefinitionDMO();
        _genericArgs = new AttributeDefinition(_genericArgsOBJ);
        _genericArgsOBJ.addDescription("This attribute indicates the generic arguments to be supplied in the use of a class in an autogenerated Iterable.");
        _genericArgsOBJ.setDmdID("94");
        _genericArgsOBJ.setName("genericArgs");
        _genericArgsOBJ.setType("meta.String");
        _genericArgs.setDefinedIn(this);
        addAttributeDefList(_genericArgs);

        AttributeDefinitionDMO _genericArgsImportOBJ = new AttributeDefinitionDMO();
        _genericArgsImport = new AttributeDefinition(_genericArgsImportOBJ);
        _genericArgsImportOBJ.addDescription("Indicates the import required to support a genericArgs specification i.e. if you're not specifying something like <?>, an additional import may be required.");
        _genericArgsImportOBJ.setDmdID("98");
        _genericArgsImportOBJ.setName("genericArgsImport");
        _genericArgsImportOBJ.setType("meta.String");
        _genericArgsImport.setDefinedIn(this);
        addAttributeDefList(_genericArgsImport);

        AttributeDefinitionDMO _getMethodOBJ = new AttributeDefinitionDMO();
        _getMethod = new AttributeDefinition(_getMethodOBJ);
        _getMethodOBJ.addDescription("If you want to return a value other than the native value class, use the appropriate getType and specify the method you need to call on the DmdValue derived class to return it.");
        _getMethodOBJ.setDmdID("49");
        _getMethodOBJ.setName("getMethod");
        _getMethodOBJ.setType("meta.String");
        _getMethod.setDefinedIn(this);
        addAttributeDefList(_getMethod);

        AttributeDefinitionDMO _getTypeOBJ = new AttributeDefinitionDMO();
        _getType = new AttributeDefinition(_getTypeOBJ);
        _getTypeOBJ.addDescription("Indicates the type of value that will be returned when an attribute value is returned for a type definition; a type definition defines only one get type. This must be a Java class reference and not a primitive type e.g. int.");
        _getTypeOBJ.setDmdID("48");
        _getTypeOBJ.setName("getType");
        _getTypeOBJ.setType("meta.String");
        _getType.setDefinedIn(this);
        addAttributeDefList(_getType);

        AttributeDefinitionDMO _helperClassNameOBJ = new AttributeDefinitionDMO();
        _helperClassName = new AttributeDefinition(_helperClassNameOBJ);
        _helperClassNameOBJ.addDescription("This attribute indicates the full name of the generated helper class for  object references i.e. if you had a ClassDefinition X, the framework generates a  types/XREF class which is subsequently used by the DmcTypeXREF class to store references to objects of the defined class.");
        _helperClassNameOBJ.setDmdID("47");
        _helperClassNameOBJ.setInternalUse("true");
        _helperClassNameOBJ.setName("helperClassName");
        _helperClassNameOBJ.setType("meta.String");
        _helperClassName.setDefinedIn(this);
        addAttributeDefList(_helperClassName);

        AttributeDefinitionDMO _hintOBJ = new AttributeDefinitionDMO();
        _hint = new AttributeDefinition(_hintOBJ);
        _hintOBJ.addDescription("A short description of something that can be dumped as one line summary of something. For longer explanations, use the description attribute.");
        _hintOBJ.setDmdID("186");
        _hintOBJ.setName("hint");
        _hintOBJ.setType("meta.String");
        _hint.setDefinedIn(this);
        addAttributeDefList(_hint);

        AttributeDefinitionDMO _immediateHaltOBJ = new AttributeDefinitionDMO();
        _immediateHalt = new AttributeDefinition(_immediateHaltOBJ);
        _immediateHaltOBJ.addDescription("The immediateHalt flag is used to indicate that no further rule processing should occur if a rule fails. It is an optional attribute on rule instance objects. In somes cases, there is no point in continuing with the application of a set  of rules, so this flag gives the option of halting further processing.");
        _immediateHaltOBJ.setDmdID("137");
        _immediateHaltOBJ.setName("immediateHalt");
        _immediateHaltOBJ.setType("meta.Boolean");
        _immediateHalt.setDefinedIn(this);
        addAttributeDefList(_immediateHalt);

        AttributeDefinitionDMO _indexSizeOBJ = new AttributeDefinitionDMO();
        _indexSize = new AttributeDefinition(_indexSizeOBJ);
        _indexSizeOBJ.addDescription("The indexSize is used in conjunction with the MULTI valueType to indicate that the attribute may have the specified number of values and is integer indexed. Indexed attributes may be thought of as having a predetermined number of slots into which values may be stored. When indexed, an attribute has values added to it using the setMVnth() interface, not the usual add() interface. If you attempt to use add() with an indexed attribute, an exception will be thrown.");
        _indexSizeOBJ.setDmdID("129");
        _indexSizeOBJ.setName("indexSize");
        _indexSizeOBJ.setType("meta.Integer");
        _indexSize.setDefinedIn(this);
        addAttributeDefList(_indexSize);

        AttributeDefinitionDMO _instantiationOBJ = new AttributeDefinitionDMO();
        _instantiation = new AttributeDefinition(_instantiationOBJ);
        _instantiationOBJ.addDescription("The instantiation attribute specifies how something is to be instantiated.");
        _instantiationOBJ.setDmdID("148");
        _instantiationOBJ.setName("instantiation");
        _instantiationOBJ.setType("meta.String");
        _instantiation.setDefinedIn(this);
        addAttributeDefList(_instantiation);

        AttributeDefinitionDMO _integerNameOBJ = new AttributeDefinitionDMO();
        _integerName = new AttributeDefinition(_integerNameOBJ);
        _integerNameOBJ.addDescription("The object name for objects uniquely identified with an integer.");
        _integerNameOBJ.setDesignatedNameAttribute("true");
        _integerNameOBJ.setDmdID("100");
        _integerNameOBJ.setName("integerName");
        _integerNameOBJ.setType("meta.IntegerName");
        _integerName.setDefinedIn(this);
        addAttributeDefList(_integerName);

        AttributeDefinitionDMO _intendedToExtendOBJ = new AttributeDefinitionDMO();
        _intendedToExtend = new AttributeDefinition(_intendedToExtendOBJ);
        _intendedToExtendOBJ.addDescription("This attribute can be used on AUXILIARY classes to give a hint about their intended usage. For example, if you were extending schema definitions with some or your  own attributes for some purpose, your auxiliary class could have intendedToExtend ClassDefinition.");
        _intendedToExtendOBJ.setDmdID("22");
        _intendedToExtendOBJ.setName("intendedToExtend");
        _intendedToExtendOBJ.setType("meta.ClassDefinition");
        _intendedToExtendOBJ.setValueType("MULTI");
        _intendedToExtend.setDefinedIn(this);
        addAttributeDefList(_intendedToExtend);

        AttributeDefinitionDMO _internalTypeDefListOBJ = new AttributeDefinitionDMO();
        _internalTypeDefList = new AttributeDefinition(_internalTypeDefListOBJ);
        _internalTypeDefListOBJ.addDescription("A list of type definitions that were generated internally to represent enums and object references.");
        _internalTypeDefListOBJ.setDmdID("57");
        _internalTypeDefListOBJ.setInternalUse("true");
        _internalTypeDefListOBJ.setName("internalTypeDefList");
        _internalTypeDefListOBJ.setType("meta.TypeDefinition");
        _internalTypeDefListOBJ.setValueType("MULTI");
        _internalTypeDefList.setDefinedIn(this);
        addAttributeDefList(_internalTypeDefList);

        AttributeDefinitionDMO _internalTypeRefOBJ = new AttributeDefinitionDMO();
        _internalTypeRef = new AttributeDefinition(_internalTypeRefOBJ);
        _internalTypeRefOBJ.addDescription("Indicates the internal type that's generated for all ClassDefinitions. This is set automatically on ClassDefinitions as they are parsed.");
        _internalTypeRefOBJ.setDmdID("20");
        _internalTypeRefOBJ.setInternalUse("true");
        _internalTypeRefOBJ.setName("internalTypeRef");
        _internalTypeRefOBJ.setType("meta.TypeDefinition");
        _internalTypeRef.setDefinedIn(this);
        addAttributeDefList(_internalTypeRef);

        AttributeDefinitionDMO _internalUseOBJ = new AttributeDefinitionDMO();
        _internalUse = new AttributeDefinition(_internalUseOBJ);
        _internalUseOBJ.addDescription("Indicates if an attribute is used and set within the Dark Matter Data code generation mechanisms. In the documentation generation code, attributes marked as internalUse WILL NOT be displayed unless you set the -internalUse flag is indicated.");
        _internalUseOBJ.setDmdID("122");
        _internalUseOBJ.setName("internalUse");
        _internalUseOBJ.setType("meta.Boolean");
        _internalUse.setDefinedIn(this);
        addAttributeDefList(_internalUse);

        AttributeDefinitionDMO _internallyGeneratedOBJ = new AttributeDefinitionDMO();
        _internallyGenerated = new AttributeDefinition(_internallyGeneratedOBJ);
        _internallyGeneratedOBJ.addDescription("This flag indicates if the associated definition was internally generated. This is the case for TypeDefinitions generated for ClassDefinitions and EnumDefinitions that allow for references to these objects.");
        _internallyGeneratedOBJ.setDmdID("77");
        _internallyGeneratedOBJ.setInternalUse("true");
        _internallyGeneratedOBJ.setName("internallyGenerated");
        _internallyGeneratedOBJ.setType("meta.Boolean");
        _internallyGenerated.setDefinedIn(this);
        addAttributeDefList(_internallyGenerated);

        AttributeDefinitionDMO _isDSDefinitionOBJ = new AttributeDefinitionDMO();
        _isDSDefinition = new AttributeDefinition(_isDSDefinitionOBJ);
        _isDSDefinitionOBJ.addDescription("Indicates if the class defined by a ClassDefinition and its derivatives are part of a domain specific set of definitions. For instance, the definitions associated with the meta schema are considered a set of domain specific definitions for defining data objects; the dark-matter Model View Whatever (MVW) definitions describe a set of domain specific concepts for defining aspects of a GWT application. <p/> A domain specific definition must be named by name and must have dotName as an attribute because the  generated class will implement the DmcDefinitionIF which assumes that these attributes exist. This interface allows these definitions to be managed as part of a set of definitions.");
        _isDSDefinitionOBJ.setDmdID("158");
        _isDSDefinitionOBJ.setName("isDSDefinition");
        _isDSDefinitionOBJ.setType("meta.Boolean");
        _isDSDefinition.setDefinedIn(this);
        addAttributeDefList(_isDSDefinition);

        AttributeDefinitionDMO _isDefaultValueOBJ = new AttributeDefinitionDMO();
        _isDefaultValue = new AttributeDefinition(_isDefaultValueOBJ);
        _isDefaultValueOBJ.addDescription("This flag is set to true to indicate the default value for a type (e.g. an enum).");
        _isDefaultValueOBJ.setDmdID("17");
        _isDefaultValueOBJ.setName("isDefaultValue");
        _isDefaultValueOBJ.setType("meta.Boolean");
        _isDefaultValue.setDefinedIn(this);
        addAttributeDefList(_isDefaultValue);

        AttributeDefinitionDMO _isEnumTypeOBJ = new AttributeDefinitionDMO();
        _isEnumType = new AttributeDefinition(_isEnumTypeOBJ);
        _isEnumTypeOBJ.addDescription("This flag is set to true for type definitions that define enumerations.");
        _isEnumTypeOBJ.setDmdID("16");
        _isEnumTypeOBJ.setInternalUse("true");
        _isEnumTypeOBJ.setName("isEnumType");
        _isEnumTypeOBJ.setType("meta.Boolean");
        _isEnumType.setDefinedIn(this);
        addAttributeDefList(_isEnumType);

        AttributeDefinitionDMO _isExtendedRefTypeOBJ = new AttributeDefinitionDMO();
        _isExtendedRefType = new AttributeDefinition(_isExtendedRefTypeOBJ);
        _isExtendedRefTypeOBJ.addDescription("This flag is used to indicate taht an internally generated type is an extended reference type.");
        _isExtendedRefTypeOBJ.setDmdID("133");
        _isExtendedRefTypeOBJ.setInternalUse("true");
        _isExtendedRefTypeOBJ.setName("isExtendedRefType");
        _isExtendedRefTypeOBJ.setType("meta.Boolean");
        _isExtendedRefType.setDefinedIn(this);
        addAttributeDefList(_isExtendedRefType);

        AttributeDefinitionDMO _isExtensibleOBJ = new AttributeDefinitionDMO();
        _isExtensible = new AttributeDefinition(_isExtensibleOBJ);
        _isExtensibleOBJ.addDescription("Indicates whether or not the ClassDefinition associated with a RuleDefinition has classType EXTENSIBLE or not. This mechanism is useful in situations where the exact set of attributes associated with a rule must be flexible. The best example is the InitRule where any set of attributes can be specified as value for the rule.");
        _isExtensibleOBJ.setDmdID("142");
        _isExtensibleOBJ.setName("isExtensible");
        _isExtensibleOBJ.setType("meta.Boolean");
        _isExtensible.setDefinedIn(this);
        addAttributeDefList(_isExtensible);

        AttributeDefinitionDMO _isFilterTypeOBJ = new AttributeDefinitionDMO();
        _isFilterType = new AttributeDefinition(_isFilterTypeOBJ);
        _isFilterTypeOBJ.addDescription("Indicates that a type is derived from DmcFilter.");
        _isFilterTypeOBJ.setDmdID("125");
        _isFilterTypeOBJ.setName("isFilterType");
        _isFilterTypeOBJ.setType("meta.Boolean");
        _isFilterType.setDefinedIn(this);
        addAttributeDefList(_isFilterType);

        AttributeDefinitionDMO _isGetActionOBJ = new AttributeDefinitionDMO();
        _isGetAction = new AttributeDefinition(_isGetActionOBJ);
        _isGetActionOBJ.addDescription("This flag indicates if an Action is merely a data retrieval (get) Action. Actions that are flagged with this attribute set to true will be executable even when the server is in a read-only mode because they don't actually alter data.");
        _isGetActionOBJ.setDmdID("72");
        _isGetActionOBJ.setName("isGetAction");
        _isGetActionOBJ.setType("meta.Boolean");
        _isGetAction.setDefinedIn(this);
        addAttributeDefList(_isGetAction);

        AttributeDefinitionDMO _isHierarchicNameOBJ = new AttributeDefinitionDMO();
        _isHierarchicName = new AttributeDefinition(_isHierarchicNameOBJ);
        _isHierarchicNameOBJ.addDescription("Indicates if a name type is for hierarchic objects.");
        _isHierarchicNameOBJ.setDmdID("121");
        _isHierarchicNameOBJ.setInternalUse("true");
        _isHierarchicNameOBJ.setName("isHierarchicName");
        _isHierarchicNameOBJ.setType("meta.Boolean");
        _isHierarchicName.setDefinedIn(this);
        addAttributeDefList(_isHierarchicName);

        AttributeDefinitionDMO _isNameTypeOBJ = new AttributeDefinitionDMO();
        _isNameType = new AttributeDefinition(_isNameTypeOBJ);
        _isNameTypeOBJ.addDescription("This attribute indicates if a defined type is used for naming purposes. This allows us to automatically add attributes of this type to the AttributeFactories.");
        _isNameTypeOBJ.setDmdID("95");
        _isNameTypeOBJ.setName("isNameType");
        _isNameTypeOBJ.setType("meta.Boolean");
        _isNameType.setDefinedIn(this);
        addAttributeDefList(_isNameType);

        AttributeDefinitionDMO _isNamedByOBJ = new AttributeDefinitionDMO();
        _isNamedBy = new AttributeDefinition(_isNamedByOBJ);
        _isNamedByOBJ.addDescription("Indicates the attribute by which an object of some class is named. When this attribute is supplied in a ClassDefinition, the generated DMO class will indicate that it implements the DmcNamedObjectIF and its getObjectName() method will return the value of the isNamedBy attribute.");
        _isNamedByOBJ.setDmdID("80");
        _isNamedByOBJ.setName("isNamedBy");
        _isNamedByOBJ.setType("meta.AttributeDefinition");
        _isNamedBy.setDefinedIn(this);
        addAttributeDefList(_isNamedBy);

        AttributeDefinitionDMO _isRefTypeOBJ = new AttributeDefinitionDMO();
        _isRefType = new AttributeDefinition(_isRefTypeOBJ);
        _isRefTypeOBJ.addDescription("This flag is set to true for type definitions that refer to other objects.");
        _isRefTypeOBJ.setDmdID("14");
        _isRefTypeOBJ.setInternalUse("true");
        _isRefTypeOBJ.setName("isRefType");
        _isRefTypeOBJ.setType("meta.Boolean");
        _isRefType.setDefinedIn(this);
        addAttributeDefList(_isRefType);

        AttributeDefinitionDMO _isSchemaRtypeOBJ = new AttributeDefinitionDMO();
        _isSchemaRtype = new AttributeDefinition(_isSchemaRtypeOBJ);
        _isSchemaRtypeOBJ.addDescription("This flag is set to true for type definitions that refer to other schema-related definitions.");
        _isSchemaRtypeOBJ.setDmdID("15");
        _isSchemaRtypeOBJ.setInternalUse("true");
        _isSchemaRtypeOBJ.setName("isSchemaRtype");
        _isSchemaRtypeOBJ.setType("meta.Boolean");
        _isSchemaRtype.setDefinedIn(this);
        addAttributeDefList(_isSchemaRtype);

        AttributeDefinitionDMO _javaClassOBJ = new AttributeDefinitionDMO();
        _javaClass = new AttributeDefinition(_javaClassOBJ);
        _javaClassOBJ.addDescription("This attribute indicates the full name of the class (including package) that should be instantiated when an instance of an object is created via the DmdClassDef.newInstance() function. The class must be a derived class of DmdGenericObject.");
        _javaClassOBJ.setDmdID("34");
        _javaClassOBJ.setInternalUse("true");
        _javaClassOBJ.setName("javaClass");
        _javaClassOBJ.setType("meta.String");
        _javaClass.setDefinedIn(this);
        addAttributeDefList(_javaClass);

        AttributeDefinitionDMO _keyClassOBJ = new AttributeDefinitionDMO();
        _keyClass = new AttributeDefinition(_keyClassOBJ);
        _keyClassOBJ.addDescription("This attribute indicates the class of the key used for types that support storage in a MAP.");
        _keyClassOBJ.setDmdID("96");
        _keyClassOBJ.setName("keyClass");
        _keyClassOBJ.setType("meta.String");
        _keyClass.setDefinedIn(this);
        addAttributeDefList(_keyClass);

        AttributeDefinitionDMO _keyImportOBJ = new AttributeDefinitionDMO();
        _keyImport = new AttributeDefinition(_keyImportOBJ);
        _keyImportOBJ.addDescription("Indicates the import for a keyClass. this is required if the keyClass is NOT a primitive java type e.g. Integer, String etc.");
        _keyImportOBJ.setDmdID("97");
        _keyImportOBJ.setName("keyImport");
        _keyImportOBJ.setType("meta.String");
        _keyImport.setDefinedIn(this);
        addAttributeDefList(_keyImport);

        AttributeDefinitionDMO _lineNumberOBJ = new AttributeDefinitionDMO();
        _lineNumber = new AttributeDefinition(_lineNumberOBJ);
        _lineNumberOBJ.addDescription("Indicates the line number of the file from which a definition was loaded.");
        _lineNumberOBJ.setDmdID("75");
        _lineNumberOBJ.setInternalUse("true");
        _lineNumberOBJ.setName("lineNumber");
        _lineNumberOBJ.setType("meta.Integer");
        _lineNumber.setDefinedIn(this);
        addAttributeDefList(_lineNumber);

        AttributeDefinitionDMO _loadSchemaClassOBJ = new AttributeDefinitionDMO();
        _loadSchemaClass = new AttributeDefinition(_loadSchemaClassOBJ);
        _loadSchemaClassOBJ.addDescription("The fully qualified name of a schema that is to  be loaded dynamically as part of module definition, along a description of why the schema is being loaded. This is generally used when auxiliary class information is used in conjunction with a set of domain specific definitions. <p/> An example would be org.dmd.gpb.tools.generation.generated.GpbauxtestSchemaAG \"Because we need the aux classes\"");
        _loadSchemaClassOBJ.setDmdID("173");
        _loadSchemaClassOBJ.setName("loadSchemaClass");
        _loadSchemaClassOBJ.setType("meta.SchemaAndReason");
        _loadSchemaClassOBJ.setValueType("MULTI");
        _loadSchemaClass.setDefinedIn(this);
        addAttributeDefList(_loadSchemaClass);

        AttributeDefinitionDMO _longNameOBJ = new AttributeDefinitionDMO();
        _longName = new AttributeDefinition(_longNameOBJ);
        _longNameOBJ.addDescription("The object name for objects uniquely identified with a long.");
        _longNameOBJ.setDesignatedNameAttribute("true");
        _longNameOBJ.setDmdID("134");
        _longNameOBJ.setName("longName");
        _longNameOBJ.setType("meta.LongName");
        _longName.setDefinedIn(this);
        addAttributeDefList(_longName);

        AttributeDefinitionDMO _mayOBJ = new AttributeDefinitionDMO();
        _may = new AttributeDefinition(_mayOBJ);
        _mayOBJ.addDescription("Indicates the set of attributes that an instance of a class MAY have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
        _mayOBJ.setDmdID("27");
        _mayOBJ.setName("may");
        _mayOBJ.setType("meta.AttributeDefinition");
        _mayOBJ.setValueType("MULTI");
        _may.setDefinedIn(this);
        addAttributeDefList(_may);

        AttributeDefinitionDMO _mayParmOBJ = new AttributeDefinitionDMO();
        _mayParm = new AttributeDefinition(_mayParmOBJ);
        _mayParmOBJ.addDescription("Indicates the set of parameters that an action MAY have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
        _mayParmOBJ.setDmdID("29");
        _mayParmOBJ.setName("mayParm");
        _mayParmOBJ.setType("meta.AttributeDefinition");
        _mayParmOBJ.setValueType("MULTI");
        _mayParm.setDefinedIn(this);
        addAttributeDefList(_mayParm);

        AttributeDefinitionDMO _mayReturnOBJ = new AttributeDefinitionDMO();
        _mayReturn = new AttributeDefinition(_mayReturnOBJ);
        _mayReturnOBJ.addDescription("Indicates the set of return vals that may be returned as part of a particular action response message.");
        _mayReturnOBJ.setDmdID("31");
        _mayReturnOBJ.setName("mayReturn");
        _mayReturnOBJ.setType("meta.AttributeDefinition");
        _mayReturnOBJ.setValueType("MULTI");
        _mayReturn.setDefinedIn(this);
        addAttributeDefList(_mayReturn);

        AttributeDefinitionDMO _maySendProgressOBJ = new AttributeDefinitionDMO();
        _maySendProgress = new AttributeDefinition(_maySendProgressOBJ);
        _maySendProgressOBJ.addDescription("This flag is used to indicate if a particular request might result in progress indications being sent. Although primarily intended as a documentation aspect, this flag is used within the TL1 subsystem to allow for the creation of a response handler for node requests that send progress text.");
        _maySendProgressOBJ.setDmdID("76");
        _maySendProgressOBJ.setName("maySendProgress");
        _maySendProgressOBJ.setType("meta.Boolean");
        _maySendProgress.setDefinedIn(this);
        addAttributeDefList(_maySendProgress);

        AttributeDefinitionDMO _modifyOBJ = new AttributeDefinitionDMO();
        _modify = new AttributeDefinition(_modifyOBJ);
        _modifyOBJ.addDescription("A set of modifications to an object.");
        _modifyOBJ.setDmdID("85");
        _modifyOBJ.setName("modify");
        _modifyOBJ.setType("meta.Modifier");
        _modifyOBJ.setValueType("MULTI");
        _modify.setDefinedIn(this);
        addAttributeDefList(_modify);

        AttributeDefinitionDMO _moduleClassNameOBJ = new AttributeDefinitionDMO();
        _moduleClassName = new AttributeDefinition(_moduleClassNameOBJ);
        _moduleClassNameOBJ.addDescription("The name of the class that will be generated as a result of a DSDefinitionModule definition.");
        _moduleClassNameOBJ.setDmdID("163");
        _moduleClassNameOBJ.setName("moduleClassName");
        _moduleClassNameOBJ.setType("meta.String");
        _moduleClassName.setDefinedIn(this);
        addAttributeDefList(_moduleClassName);

        AttributeDefinitionDMO _moduleDependenceAttributeOBJ = new AttributeDefinitionDMO();
        _moduleDependenceAttribute = new AttributeDefinition(_moduleDependenceAttributeOBJ);
        _moduleDependenceAttributeOBJ.addDescription("The name of the attribute in a DSDefinitionModule that indicates a dependence on another module of the same type. For example, in dark-matter schemas, the SchemaDefinition uses the dependsOn attribute to refer to oher schemas.");
        _moduleDependenceAttributeOBJ.setDmdID("165");
        _moduleDependenceAttributeOBJ.setName("moduleDependenceAttribute");
        _moduleDependenceAttributeOBJ.setType("meta.AttributeDefinition");
        _moduleDependenceAttribute.setDefinedIn(this);
        addAttributeDefList(_moduleDependenceAttribute);

        AttributeDefinitionDMO _msgKeyOBJ = new AttributeDefinitionDMO();
        _msgKey = new AttributeDefinition(_msgKeyOBJ);
        _msgKeyOBJ.addDescription("The msgKey may be specified on rule instances to indicate the key to be used to look up translated messages. This is primarily a GWT mechanism, but should be applicable in other contexts.");
        _msgKeyOBJ.setDmdID("23");
        _msgKeyOBJ.setName("msgKey");
        _msgKeyOBJ.setType("meta.String");
        _msgKey.setDefinedIn(this);
        addAttributeDefList(_msgKey);

        AttributeDefinitionDMO _msgParamOBJ = new AttributeDefinitionDMO();
        _msgParam = new AttributeDefinition(_msgParamOBJ);
        _msgParamOBJ.addDescription("The msgParam allows for the specification of parameters to be substituted into translated messages.");
        _msgParamOBJ.setDmdID("52");
        _msgParamOBJ.setName("msgParam");
        _msgParamOBJ.setType("meta.String");
        _msgParamOBJ.setValueType("MULTI");
        _msgParam.setDefinedIn(this);
        addAttributeDefList(_msgParam);

        AttributeDefinitionDMO _mustOBJ = new AttributeDefinitionDMO();
        _must = new AttributeDefinition(_mustOBJ);
        _mustOBJ.addDescription("Indicates the set of attributes that an instance of a class MUST have.");
        _mustOBJ.setDmdID("26");
        _mustOBJ.setName("must");
        _mustOBJ.setType("meta.AttributeDefinition");
        _mustOBJ.setValueType("MULTI");
        _must.setDefinedIn(this);
        addAttributeDefList(_must);

        AttributeDefinitionDMO _mustParmOBJ = new AttributeDefinitionDMO();
        _mustParm = new AttributeDefinition(_mustParmOBJ);
        _mustParmOBJ.addDescription("Indicates the set of parameters that an action MUST have. When accessed in Java, this is a set of references to AttributeDefinition objects.");
        _mustParmOBJ.setDmdID("28");
        _mustParmOBJ.setName("mustParm");
        _mustParmOBJ.setType("meta.AttributeDefinition");
        _mustParmOBJ.setValueType("MULTI");
        _mustParm.setDefinedIn(this);
        addAttributeDefList(_mustParm);

        AttributeDefinitionDMO _mustReturnOBJ = new AttributeDefinitionDMO();
        _mustReturn = new AttributeDefinition(_mustReturnOBJ);
        _mustReturnOBJ.addDescription("Indicates the set of return vals that must be returned as part of a particular action response message.");
        _mustReturnOBJ.setDmdID("30");
        _mustReturnOBJ.setName("mustReturn");
        _mustReturnOBJ.setType("meta.AttributeDefinition");
        _mustReturnOBJ.setValueType("MULTI");
        _mustReturn.setDefinedIn(this);
        addAttributeDefList(_mustReturn);

        AttributeDefinitionDMO _nameOBJ = new AttributeDefinitionDMO();
        _name = new AttributeDefinition(_nameOBJ);
        _nameOBJ.addCodeComment("The name of some defined concept that uniquely identifies it within a definition module.");
        _nameOBJ.addDescription("How a name is composed will depend on the context in which it used. For instance, the names of definitions specified as part of a dark-matter schema will conform to conventions of naming classes and or attributes in Java. <p/> The generated documentation for a set of Domain Specific Language (DSL) concepts will indicate the rules that apply to a name in that DSL.");
        _nameOBJ.setDesignatedNameAttribute("true");
        _nameOBJ.setDmdID("2");
        _nameOBJ.setName("name");
        _nameOBJ.setType("meta.DefinitionName");
        _name.setDefinedIn(this);
        addAttributeDefList(_name);

        AttributeDefinitionDMO _nameAttributeDefOBJ = new AttributeDefinitionDMO();
        _nameAttributeDef = new AttributeDefinition(_nameAttributeDefOBJ);
        _nameAttributeDefOBJ.addDescription("The nameAttributeDef is a reference to the attribute that is locked to a TypeDefinition. This mechanism is used to create the correct type of DmcType[NAMETYPE]* derivative for a value of type DmcObjectName.");
        _nameAttributeDefOBJ.setDmdID("90");
        _nameAttributeDefOBJ.setInternalUse("true");
        _nameAttributeDefOBJ.setName("nameAttributeDef");
        _nameAttributeDefOBJ.setType("meta.AttributeDefinition");
        _nameAttributeDef.setDefinedIn(this);
        addAttributeDefList(_nameAttributeDef);

        AttributeDefinitionDMO _namingAttributeOBJ = new AttributeDefinitionDMO();
        _namingAttribute = new AttributeDefinition(_namingAttributeOBJ);
        _namingAttributeOBJ.addDescription("This attribute indicates the attribute that is used to name an object instance. The exact manner in which the naming attribute is used is specific to the implementation of the HierarchicObject derived class. <p> For instance, the DotNamedObject simply uses the value of the naming attribute and separates the attribute values with periods e.g. grandparent.parent.child. <p> For LDAP objects when a hierarchic name is composed for an object, the class name plus the value of the naming attribute (type:value) is used to create the name of an object. It is best if the naming attribute value is created by the application; it shouldn't be based on any user configurable value.");
        _namingAttributeOBJ.setDmdID("64");
        _namingAttributeOBJ.setName("namingAttribute");
        _namingAttributeOBJ.setType("meta.AttributeDefinition");
        _namingAttribute.setDefinedIn(this);
        addAttributeDefList(_namingAttribute);

        AttributeDefinitionDMO _nullReturnValueOBJ = new AttributeDefinitionDMO();
        _nullReturnValue = new AttributeDefinition(_nullReturnValueOBJ);
        _nullReturnValueOBJ.addDescription("This attribute is used in TypeDefinitions to indicate the value that should be returned when an attribute of the specified type doesn't exist in the object. For example, Boolean values are defined to return false when they aren't actually set on an object. This just gives a convenient mechanism to provide a default value for non-existent attribute values.");
        _nullReturnValueOBJ.setDmdID("7");
        _nullReturnValueOBJ.setName("nullReturnValue");
        _nullReturnValueOBJ.setType("meta.String");
        _nullReturnValue.setDefinedIn(this);
        addAttributeDefList(_nullReturnValue);

        AttributeDefinitionDMO _nvpOBJ = new AttributeDefinitionDMO();
        _nvp = new AttributeDefinition(_nvpOBJ);
        _nvpOBJ.addDescription("A set of additional name value pairs that can be associated with an object.");
        _nvpOBJ.setDmdID("178");
        _nvpOBJ.setName("nvp");
        _nvpOBJ.setType("meta.NameValuePair");
        _nvpOBJ.setValueType("MULTI");
        _nvp.setDefinedIn(this);
        addAttributeDefList(_nvp);

        AttributeDefinitionDMO _objectClassOBJ = new AttributeDefinitionDMO();
        _objectClass = new AttributeDefinition(_objectClassOBJ);
        _objectClassOBJ.addDescription("Used to indicate the classes that an object instance supports.");
        _objectClassOBJ.setDmdID("1");
        _objectClassOBJ.setName("objectClass");
        _objectClassOBJ.setType("meta.ClassDefinition");
        _objectClassOBJ.setValueType("MULTI");
        _objectClass.setDefinedIn(this);
        addAttributeDefList(_objectClass);

        AttributeDefinitionDMO _obsoleteOBJ = new AttributeDefinitionDMO();
        _obsolete = new AttributeDefinition(_obsoleteOBJ);
        _obsoleteOBJ.addDescription("The version at which something became obsolete.");
        _obsoleteOBJ.setDmdID("183");
        _obsoleteOBJ.setName("obsolete");
        _obsoleteOBJ.setType("meta.String");
        _obsolete.setDefinedIn(this);
        addAttributeDefList(_obsolete);

        AttributeDefinitionDMO _obsoleteVersionOBJ = new AttributeDefinitionDMO();
        _obsoleteVersion = new AttributeDefinition(_obsoleteVersionOBJ);
        _obsoleteVersionOBJ.addDescription("This indicates the version at which something became obsolete. Generally speaking you shouldn't ever delete definitions for products that have been released to the field, this may break backwards compatibility. Instead, you should mark them as obsolete.");
        _obsoleteVersionOBJ.setDmdID("73");
        _obsoleteVersionOBJ.setName("obsoleteVersion");
        _obsoleteVersionOBJ.setType("meta.String");
        _obsoleteVersion.setDefinedIn(this);
        addAttributeDefList(_obsoleteVersion);

        AttributeDefinitionDMO _opContextOBJ = new AttributeDefinitionDMO();
        _opContext = new AttributeDefinition(_opContextOBJ);
        _opContextOBJ.addDescription("Indicates the operational context for some component e.g. object or attribute validators.");
        _opContextOBJ.setDmdID("115");
        _opContextOBJ.setName("opContext");
        _opContextOBJ.setType("meta.OperationalContextEnum");
        _opContext.setDefinedIn(this);
        addAttributeDefList(_opContext);

        AttributeDefinitionDMO _optimizeOBJ = new AttributeDefinitionDMO();
        _optimize = new AttributeDefinition(_optimizeOBJ);
        _optimizeOBJ.addDescription("Depending on what you're modelling, you often come across places where you can see an opportunity to optimize, streamline or improve something e.g. merging concepts together, representing something differently, adding a relationship - whatever. However, these ideas often get lost in the shuffle or, if you add them into an overall description of something, they don't stand out. <p/> Any dark-matter definition can be decorated with optimize notes. These notes provide");
        _optimizeOBJ.setDmdID("180");
        _optimizeOBJ.setName("optimize");
        _optimizeOBJ.setType("meta.String");
        _optimizeOBJ.setValueType("MULTI");
        _optimize.setDefinedIn(this);
        addAttributeDefList(_optimize);

        AttributeDefinitionDMO _optionalPartOBJ = new AttributeDefinitionDMO();
        _optionalPart = new AttributeDefinition(_optionalPartOBJ);
        _optionalPartOBJ.addDescription("Indicates an optional part of a complex type definition.");
        _optionalPartOBJ.setDmdID("114");
        _optionalPartOBJ.setName("optionalPart");
        _optionalPartOBJ.setType("meta.Part");
        _optionalPartOBJ.setValueType("MULTI");
        _optionalPart.setDefinedIn(this);
        addAttributeDefList(_optionalPart);

        AttributeDefinitionDMO _originalClassOBJ = new AttributeDefinitionDMO();
        _originalClass = new AttributeDefinition(_originalClassOBJ);
        _originalClassOBJ.addDescription("Refers to the class that an internally generated type represents.");
        _originalClassOBJ.setDmdID("83");
        _originalClassOBJ.setInternalUse("true");
        _originalClassOBJ.setName("originalClass");
        _originalClassOBJ.setType("meta.ClassDefinition");
        _originalClass.setDefinedIn(this);
        addAttributeDefList(_originalClass);

        AttributeDefinitionDMO _partOfDefinitionModuleOBJ = new AttributeDefinitionDMO();
        _partOfDefinitionModule = new AttributeDefinition(_partOfDefinitionModuleOBJ);
        _partOfDefinitionModuleOBJ.addDescription("For classes that defined as part of a definition module, this indicates the module they belong to. This allows for generation of a standard method to get the name of the module from which they were loaded.");
        _partOfDefinitionModuleOBJ.setDmdID("175");
        _partOfDefinitionModuleOBJ.setName("partOfDefinitionModule");
        _partOfDefinitionModuleOBJ.setType("meta.DSDefinitionModule");
        _partOfDefinitionModule.setDefinedIn(this);
        addAttributeDefList(_partOfDefinitionModule);

        AttributeDefinitionDMO _preserveNewlinesOBJ = new AttributeDefinitionDMO();
        _preserveNewlines = new AttributeDefinition(_preserveNewlinesOBJ);
        _preserveNewlinesOBJ.addDescription("Indicates that newline characters should be preserved when an attribute is parsed by the DmcUncheckedOIFParser. This is useful for certain attributes when newlines are required to properly format the contents of the attribute at a later time. For example, the description attribute is later dumped as part of  HTML documentation and, if the newlines are stripped, it won't be properly formatted.");
        _preserveNewlinesOBJ.setDmdID("51");
        _preserveNewlinesOBJ.setName("preserveNewlines");
        _preserveNewlinesOBJ.setType("meta.Boolean");
        _preserveNewlines.setDefinedIn(this);
        addAttributeDefList(_preserveNewlines);

        AttributeDefinitionDMO _primitiveTypeOBJ = new AttributeDefinitionDMO();
        _primitiveType = new AttributeDefinition(_primitiveTypeOBJ);
        _primitiveTypeOBJ.addDescription("The primitiveType indicates the underlying type of a DmcType.");
        _primitiveTypeOBJ.setDmdID("8");
        _primitiveTypeOBJ.setName("primitiveType");
        _primitiveTypeOBJ.setType("meta.String");
        _primitiveType.setDefinedIn(this);
        addAttributeDefList(_primitiveType);

        AttributeDefinitionDMO _questionOBJ = new AttributeDefinitionDMO();
        _question = new AttributeDefinition(_questionOBJ);
        _questionOBJ.addDescription("A question associated with the definition of something.");
        _questionOBJ.setDmdID("187");
        _questionOBJ.setName("question");
        _questionOBJ.setType("meta.String");
        _questionOBJ.setValueType("MULTI");
        _question.setDefinedIn(this);
        addAttributeDefList(_question);

        AttributeDefinitionDMO _refersToDefsFromDSDOBJ = new AttributeDefinitionDMO();
        _refersToDefsFromDSD = new AttributeDefinition(_refersToDefsFromDSDOBJ);
        _refersToDefsFromDSDOBJ.addDescription("A reference to another DSDefinitionModule from which the current module makes use of definitions. For instance, the Model View Whatever DSD includes references to schema related definitions. As a result of specifying this, the module class that's generated for the DSDefinitionModule will include the moduleDependenceAttribute of the module from which definitions are used. Likewise, the generated parser will be primed with the schema of the required definition module.");
        _refersToDefsFromDSDOBJ.setDmdID("166");
        _refersToDefsFromDSDOBJ.setName("refersToDefsFromDSD");
        _refersToDefsFromDSDOBJ.setType("meta.DSDefinitionModule");
        _refersToDefsFromDSDOBJ.setValueType("MULTI");
        _refersToDefsFromDSD.setDefinedIn(this);
        addAttributeDefList(_refersToDefsFromDSD);

        AttributeDefinitionDMO _relatedToConceptOBJ = new AttributeDefinitionDMO();
        _relatedToConcept = new AttributeDefinition(_relatedToConceptOBJ);
        _relatedToConceptOBJ.addDescription("Allows for references to base concepts that relate this definition to another definition in the Concinnity domain. This mechanism is only used in the domain of dark-matter schema definitions; other DSLs will allow for direct reference to Concinnity concepts.");
        _relatedToConceptOBJ.setDmdID("176");
        _relatedToConceptOBJ.setName("relatedToConcept");
        _relatedToConceptOBJ.setType("meta.Concinnity");
        _relatedToConceptOBJ.setValueType("MULTI");
        _relatedToConcept.setDefinedIn(this);
        addAttributeDefList(_relatedToConcept);

        AttributeDefinitionDMO _requiredBaseModuleOBJ = new AttributeDefinitionDMO();
        _requiredBaseModule = new AttributeDefinition(_requiredBaseModuleOBJ);
        _requiredBaseModuleOBJ.addDescription("A set of base module files that should be loaded before parsing of any other modules associated with the DSD being defined. For example, the dmdgpb (augmented Googoe Protocol Buffer specifications) DSD always requires that the gpbbase.gpb file is loaded because it defines the base types of the fields that comprise messages. By specifying gpbbase.gpb as a requiredBaseModule, the generated parsing coordinator will ensure that this module is loaded on start-up. <p/> You should specify just the name of the module file to be loaded, not the file extension. The file extension is assumed to be fileExtension associated with the DSD.");
        _requiredBaseModuleOBJ.setDmdID("174");
        _requiredBaseModuleOBJ.setName("requiredBaseModule");
        _requiredBaseModuleOBJ.setType("meta.String");
        _requiredBaseModuleOBJ.setValueType("MULTI");
        _requiredBaseModule.setDefinedIn(this);
        addAttributeDefList(_requiredBaseModule);

        AttributeDefinitionDMO _requiredPartOBJ = new AttributeDefinitionDMO();
        _requiredPart = new AttributeDefinition(_requiredPartOBJ);
        _requiredPartOBJ.addDescription("Indicates a required part of a complex type definition.");
        _requiredPartOBJ.setDmdID("112");
        _requiredPartOBJ.setName("requiredPart");
        _requiredPartOBJ.setType("meta.Part");
        _requiredPartOBJ.setValueType("MULTI");
        _requiredPart.setDefinedIn(this);
        addAttributeDefList(_requiredPart);

        AttributeDefinitionDMO _ruleCategoryOBJ = new AttributeDefinitionDMO();
        _ruleCategory = new AttributeDefinition(_ruleCategoryOBJ);
        _ruleCategoryOBJ.addDescription("The category of a rule.");
        _ruleCategoryOBJ.setDmdID("139");
        _ruleCategoryOBJ.setName("ruleCategory");
        _ruleCategoryOBJ.setType("meta.RuleCategory");
        _ruleCategoryOBJ.setValueType("MULTI");
        _ruleCategory.setDefinedIn(this);
        addAttributeDefList(_ruleCategory);

        AttributeDefinitionDMO _ruleCategoryIDOBJ = new AttributeDefinitionDMO();
        _ruleCategoryID = new AttributeDefinition(_ruleCategoryIDOBJ);
        _ruleCategoryIDOBJ.addDescription("The numeric ID of a rule category. Category IDs must be unique for all RuleDefinitions defined within a schema.");
        _ruleCategoryIDOBJ.setDmdID("140");
        _ruleCategoryIDOBJ.setName("ruleCategoryID");
        _ruleCategoryIDOBJ.setType("meta.Integer");
        _ruleCategoryID.setDefinedIn(this);
        addAttributeDefList(_ruleCategoryID);

        AttributeDefinitionDMO _ruleCategoryListOBJ = new AttributeDefinitionDMO();
        _ruleCategoryList = new AttributeDefinition(_ruleCategoryListOBJ);
        _ruleCategoryListOBJ.addDescription("The RuleCategories defined in a schema.");
        _ruleCategoryListOBJ.setDmdID("143");
        _ruleCategoryListOBJ.setName("ruleCategoryList");
        _ruleCategoryListOBJ.setType("meta.RuleCategory");
        _ruleCategoryListOBJ.setValueType("MULTI");
        _ruleCategoryList.setDefinedIn(this);
        addAttributeDefList(_ruleCategoryList);

        AttributeDefinitionDMO _ruleDataListOBJ = new AttributeDefinitionDMO();
        _ruleDataList = new AttributeDefinition(_ruleDataListOBJ);
        _ruleDataListOBJ.addDescription("The RuleData defined in a schema.");
        _ruleDataListOBJ.setDmdID("156");
        _ruleDataListOBJ.setName("ruleDataList");
        _ruleDataListOBJ.setType("meta.RuleData");
        _ruleDataListOBJ.setValueType("MULTI");
        _ruleDataList.setDefinedIn(this);
        addAttributeDefList(_ruleDataList);

        AttributeDefinitionDMO _ruleDefinitionOBJ = new AttributeDefinitionDMO();
        _ruleDefinition = new AttributeDefinition(_ruleDefinitionOBJ);
        _ruleDefinitionOBJ.addDescription("The RuleDefinition that resulted in the creation of an internally generated ClassDefinition.");
        _ruleDefinitionOBJ.setDmdID("145");
        _ruleDefinitionOBJ.setInternalUse("true");
        _ruleDefinitionOBJ.setName("ruleDefinition");
        _ruleDefinitionOBJ.setType("meta.RuleDefinition");
        _ruleDefinition.setDefinedIn(this);
        addAttributeDefList(_ruleDefinition);

        AttributeDefinitionDMO _ruleDefinitionListOBJ = new AttributeDefinitionDMO();
        _ruleDefinitionList = new AttributeDefinition(_ruleDefinitionListOBJ);
        _ruleDefinitionListOBJ.addDescription("The RuleDefinitions defined in a schema.");
        _ruleDefinitionListOBJ.setDmdID("144");
        _ruleDefinitionListOBJ.setName("ruleDefinitionList");
        _ruleDefinitionListOBJ.setType("meta.RuleDefinition");
        _ruleDefinitionListOBJ.setValueType("MULTI");
        _ruleDefinitionList.setDefinedIn(this);
        addAttributeDefList(_ruleDefinitionList);

        AttributeDefinitionDMO _ruleImportOBJ = new AttributeDefinitionDMO();
        _ruleImport = new AttributeDefinition(_ruleImportOBJ);
        _ruleImportOBJ.addDescription("An import required for generation of the rule collection associated with a RuleCategory.");
        _ruleImportOBJ.setDmdID("152");
        _ruleImportOBJ.setName("ruleImport");
        _ruleImportOBJ.setType("meta.String");
        _ruleImportOBJ.setValueType("MULTI");
        _ruleImport.setDefinedIn(this);
        addAttributeDefList(_ruleImport);

        AttributeDefinitionDMO _ruleNameOBJ = new AttributeDefinitionDMO();
        _ruleName = new AttributeDefinition(_ruleNameOBJ);
        _ruleNameOBJ.addDescription("The ruleName attribute is used to store a single camelCase format name for a rule. The name starts with a single letter and can be followed by a mix of letters and numbers. No spaces or  other characters are allowed.");
        _ruleNameOBJ.setDesignatedNameAttribute("true");
        _ruleNameOBJ.setDmdID("153");
        _ruleNameOBJ.setName("ruleName");
        _ruleNameOBJ.setType("meta.RuleName");
        _ruleName.setDefinedIn(this);
        addAttributeDefList(_ruleName);

        AttributeDefinitionDMO _ruleParamOBJ = new AttributeDefinitionDMO();
        _ruleParam = new AttributeDefinition(_ruleParamOBJ);
        _ruleParamOBJ.addDescription("A parameter to be supplied to a rule when it is executed.");
        _ruleParamOBJ.setDmdID("50");
        _ruleParamOBJ.setName("ruleParam");
        _ruleParamOBJ.setType("meta.RuleParam");
        _ruleParamOBJ.setValueType("MULTI");
        _ruleParam.setDefinedIn(this);
        addAttributeDefList(_ruleParam);

        AttributeDefinitionDMO _ruleTitleOBJ = new AttributeDefinitionDMO();
        _ruleTitle = new AttributeDefinition(_ruleTitleOBJ);
        _ruleTitleOBJ.addDescription("The title of a rule.");
        _ruleTitleOBJ.setDmdID("138");
        _ruleTitleOBJ.setName("ruleTitle");
        _ruleTitleOBJ.setType("meta.String");
        _ruleTitle.setDefinedIn(this);
        addAttributeDefList(_ruleTitle);

        AttributeDefinitionDMO _ruleTypeOBJ = new AttributeDefinitionDMO();
        _ruleType = new AttributeDefinition(_ruleTypeOBJ);
        _ruleTypeOBJ.addDescription("The type of a rule.");
        _ruleTypeOBJ.setDmdID("136");
        _ruleTypeOBJ.setName("ruleType");
        _ruleTypeOBJ.setType("meta.RuleTypeEnum");
        _ruleType.setDefinedIn(this);
        addAttributeDefList(_ruleType);

        AttributeDefinitionDMO _runContextOBJ = new AttributeDefinitionDMO();
        _runContext = new AttributeDefinition(_runContextOBJ);
        _runContextOBJ.addDescription("A reference to a RunContext.");
        _runContextOBJ.setDmdID("149");
        _runContextOBJ.setName("runContext");
        _runContextOBJ.setType("meta.RunContext");
        _runContext.setDefinedIn(this);
        addAttributeDefList(_runContext);

        AttributeDefinitionDMO _schemaBaseIDOBJ = new AttributeDefinitionDMO();
        _schemaBaseID = new AttributeDefinition(_schemaBaseIDOBJ);
        _schemaBaseIDOBJ.addDescription("The base identifier value for a schema. This value is added to each dmdID value associated with the AttributeDefinitions defined by the schema. This allows for easy rebasing of identifier values if required.");
        _schemaBaseIDOBJ.setDmdID("86");
        _schemaBaseIDOBJ.setName("schemaBaseID");
        _schemaBaseIDOBJ.setType("meta.Integer");
        _schemaBaseID.setDefinedIn(this);
        addAttributeDefList(_schemaBaseID);

        AttributeDefinitionDMO _schemaExtensionOBJ = new AttributeDefinitionDMO();
        _schemaExtension = new AttributeDefinition(_schemaExtensionOBJ);
        _schemaExtensionOBJ.addDescription("The fully qualified name of a class that extends the schema management capabilities of the SchemaManager. the class must have a zero arg constructor and implement the SchemaExtensionIF.");
        _schemaExtensionOBJ.setDmdID("4");
        _schemaExtensionOBJ.setName("schemaExtension");
        _schemaExtensionOBJ.setType("meta.String");
        _schemaExtensionOBJ.setValueType("MULTI");
        _schemaExtension.setDefinedIn(this);
        addAttributeDefList(_schemaExtension);

        AttributeDefinitionDMO _schemaIDRangeOBJ = new AttributeDefinitionDMO();
        _schemaIDRange = new AttributeDefinition(_schemaIDRangeOBJ);
        _schemaIDRangeOBJ.addDescription("The maximum number of attribute definitions in a particular schema. This will provide immediate feedback if you exceed the given ID range for your schema.");
        _schemaIDRangeOBJ.setDmdID("87");
        _schemaIDRangeOBJ.setName("schemaIDRange");
        _schemaIDRangeOBJ.setType("meta.Integer");
        _schemaIDRange.setDefinedIn(this);
        addAttributeDefList(_schemaIDRange);

        AttributeDefinitionDMO _schemaPackageOBJ = new AttributeDefinitionDMO();
        _schemaPackage = new AttributeDefinition(_schemaPackageOBJ);
        _schemaPackageOBJ.addDescription("Indicates the package that a schema will be part of when its code is generated using DMO generator tool.");
        _schemaPackageOBJ.setDmdID("53");
        _schemaPackageOBJ.setName("schemaPackage");
        _schemaPackageOBJ.setType("meta.String");
        _schemaPackage.setDefinedIn(this);
        addAttributeDefList(_schemaPackage);

        AttributeDefinitionDMO _secureOBJ = new AttributeDefinitionDMO();
        _secure = new AttributeDefinition(_secureOBJ);
        _secureOBJ.addDescription("This attribute indicates whether or not the attribute should be encrypted before being transported over the wire or stored in a file or repository");
        _secureOBJ.setDmdID("78");
        _secureOBJ.setName("secure");
        _secureOBJ.setType("meta.Boolean");
        _secure.setDefinedIn(this);
        addAttributeDefList(_secure);

        AttributeDefinitionDMO _selectAttributeOBJ = new AttributeDefinitionDMO();
        _selectAttribute = new AttributeDefinition(_selectAttributeOBJ);
        _selectAttributeOBJ.addDescription("The selectAttribute indicates an attribute to be used in the definition of a Slice.");
        _selectAttributeOBJ.setDmdID("110");
        _selectAttributeOBJ.setName("selectAttribute");
        _selectAttributeOBJ.setType("meta.AttributeDefinition");
        _selectAttributeOBJ.setValueType("MULTI");
        _selectAttribute.setDefinedIn(this);
        addAttributeDefList(_selectAttribute);

        AttributeDefinitionDMO _skipOBJ = new AttributeDefinitionDMO();
        _skip = new AttributeDefinition(_skipOBJ);
        _skipOBJ.addDescription("A version from which something should be excluded (even though it is included in later versions). This is an unusual situation, and should be approached with extreme caution!");
        _skipOBJ.setDmdID("182");
        _skipOBJ.setName("skip");
        _skipOBJ.setType("meta.String");
        _skipOBJ.setValueType("MULTI");
        _skip.setDefinedIn(this);
        addAttributeDefList(_skip);

        AttributeDefinitionDMO _sliceDefListOBJ = new AttributeDefinitionDMO();
        _sliceDefList = new AttributeDefinition(_sliceDefListOBJ);
        _sliceDefListOBJ.addDescription("A list of slice definition references.");
        _sliceDefListOBJ.setDmdID("111");
        _sliceDefListOBJ.setInternalUse("true");
        _sliceDefListOBJ.setName("sliceDefList");
        _sliceDefListOBJ.setType("meta.SliceDefinition");
        _sliceDefListOBJ.setValueType("MULTI");
        _sliceDefList.setDefinedIn(this);
        addAttributeDefList(_sliceDefList);

        AttributeDefinitionDMO _sortNameOBJ = new AttributeDefinitionDMO();
        _sortName = new AttributeDefinition(_sortNameOBJ);
        _sortNameOBJ.addDescription("The sortName is used in siutations where we need a name for storage of a definition that is globally unique but can be sorted on the basis of the definition name, not the module name. The dotName for a definition is module.definition...type, whereas the sortName would be definition...module.type. So, for things like documentation generation, the sortName provides a more  natural ordering.");
        _sortNameOBJ.setDmdID("170");
        _sortNameOBJ.setName("sortName");
        _sortNameOBJ.setType("meta.DotName");
        _sortName.setDefinedIn(this);
        addAttributeDefList(_sortName);

        AttributeDefinitionDMO _stringNameOBJ = new AttributeDefinitionDMO();
        _stringName = new AttributeDefinition(_stringNameOBJ);
        _stringNameOBJ.addDescription("The stringName attribute is used to store a simple name for something. It starts with a letter followed letters or numbers.");
        _stringNameOBJ.setDesignatedNameAttribute("true");
        _stringNameOBJ.setDmdID("160");
        _stringNameOBJ.setName("stringName");
        _stringNameOBJ.setType("meta.StringName");
        _stringName.setDefinedIn(this);
        addAttributeDefList(_stringName);

        AttributeDefinitionDMO _subpackageOBJ = new AttributeDefinitionDMO();
        _subpackage = new AttributeDefinition(_subpackageOBJ);
        _subpackageOBJ.addDescription("The subpackage beneath extended where generated code will be written. This allows for a hierarchic package structure for the classes generated by the dmg and mvc generator utilities. The structure can contain other subpackages etc x.y.z but should not start or end with a period.");
        _subpackageOBJ.setDmdID("88");
        _subpackageOBJ.setName("subpackage");
        _subpackageOBJ.setType("meta.String");
        _subpackage.setDefinedIn(this);
        addAttributeDefList(_subpackage);

        AttributeDefinitionDMO _supportDynamicSchemaLoadingOBJ = new AttributeDefinitionDMO();
        _supportDynamicSchemaLoading = new AttributeDefinition(_supportDynamicSchemaLoadingOBJ);
        _supportDynamicSchemaLoadingOBJ.addDescription("If this flag is set to true, the loadSchemaClass attribute will be added to the generated domain specific module definition class so that additional schemas (usually containg auxiliary classes) can be loaded dynamically. This allows the generated module parser to handle auxiliary information on the domain specific definitions.");
        _supportDynamicSchemaLoadingOBJ.setDmdID("172");
        _supportDynamicSchemaLoadingOBJ.setName("supportDynamicSchemaLoading");
        _supportDynamicSchemaLoadingOBJ.setType("meta.Boolean");
        _supportDynamicSchemaLoading.setDefinedIn(this);
        addAttributeDefList(_supportDynamicSchemaLoading);

        AttributeDefinitionDMO _supportsBackrefTrackingOBJ = new AttributeDefinitionDMO();
        _supportsBackrefTracking = new AttributeDefinition(_supportsBackrefTrackingOBJ);
        _supportsBackrefTrackingOBJ.addDescription("Indicates if a class of objects supports back reference tracking or not. The default is that all objects support it, however, in places like the Dark Matter Protocol, we don't want to track references in the messages.");
        _supportsBackrefTrackingOBJ.setDmdID("118");
        _supportsBackrefTrackingOBJ.setName("supportsBackrefTracking");
        _supportsBackrefTrackingOBJ.setNullReturnValue("true");
        _supportsBackrefTrackingOBJ.setType("meta.Boolean");
        _supportsBackrefTracking.setDefinedIn(this);
        addAttributeDefList(_supportsBackrefTracking);

        AttributeDefinitionDMO _tagsOBJ = new AttributeDefinitionDMO();
        _tags = new AttributeDefinition(_tagsOBJ);
        _tagsOBJ.addDescription("A collection of tags that can facilitate searching for definitions. The values are limited to a-zA-Z0-9 and the space character.");
        _tagsOBJ.setDmdID("177");
        _tagsOBJ.setName("tags");
        _tagsOBJ.setType("meta.String");
        _tagsOBJ.setValueType("TREESET");
        _tags.setDefinedIn(this);
        addAttributeDefList(_tags);

        AttributeDefinitionDMO _typeOBJ = new AttributeDefinitionDMO();
        _type = new AttributeDefinition(_typeOBJ);
        _typeOBJ.addDescription("Indicates the type of an attribute. The value is the name of any previously defined TypeDefinition, ClassDefinition, EnumDefinition or ComplexTypeDefinition.");
        _typeOBJ.setDmdID("19");
        _typeOBJ.setName("type");
        _typeOBJ.setType("meta.TypeDefinition");
        _type.setDefinedIn(this);
        addAttributeDefList(_type);

        AttributeDefinitionDMO _typeClassNameOBJ = new AttributeDefinitionDMO();
        _typeClassName = new AttributeDefinition(_typeClassNameOBJ);
        _typeClassNameOBJ.addDescription("This is the fully qualified name of the class derived from DmcAttribute that provides management of a particular type of attribute value. For instance, the type class that handles String attributes  is org.dmd.dms.shared.types.DmcTypeString");
        _typeClassNameOBJ.setDmdID("5");
        _typeClassNameOBJ.setName("typeClassName");
        _typeClassNameOBJ.setType("meta.String");
        _typeClassName.setDefinedIn(this);
        addAttributeDefList(_typeClassName);

        AttributeDefinitionDMO _typeDefListOBJ = new AttributeDefinitionDMO();
        _typeDefList = new AttributeDefinition(_typeDefListOBJ);
        _typeDefListOBJ.addDescription("A list of type definition references.");
        _typeDefListOBJ.setDmdID("56");
        _typeDefListOBJ.setInternalUse("true");
        _typeDefListOBJ.setName("typeDefList");
        _typeDefListOBJ.setType("meta.TypeDefinition");
        _typeDefListOBJ.setValueType("MULTI");
        _typeDefList.setDefinedIn(this);
        addAttributeDefList(_typeDefList);

        AttributeDefinitionDMO _useInterfaceOBJ = new AttributeDefinitionDMO();
        _useInterface = new AttributeDefinition(_useInterfaceOBJ);
        _useInterfaceOBJ.addDescription("The fully qualified name of a Java interface or base class that specifies a dependency.");
        _useInterfaceOBJ.setDmdID("150");
        _useInterfaceOBJ.setName("useInterface");
        _useInterfaceOBJ.setType("meta.String");
        _useInterface.setDefinedIn(this);
        addAttributeDefList(_useInterface);

        AttributeDefinitionDMO _useWrapperTypeOBJ = new AttributeDefinitionDMO();
        _useWrapperType = new AttributeDefinition(_useWrapperTypeOBJ);
        _useWrapperTypeOBJ.addDescription("Indicates whether you want to use the generated DMW wrapper or the extended wrapper you've created yourself.");
        _useWrapperTypeOBJ.setDmdID("82");
        _useWrapperTypeOBJ.setName("useWrapperType");
        _useWrapperTypeOBJ.setType("meta.WrapperTypeEnum");
        _useWrapperType.setDefinedIn(this);
        addAttributeDefList(_useWrapperType);

        AttributeDefinitionDMO _usesInterfaceOBJ = new AttributeDefinitionDMO();
        _usesInterface = new AttributeDefinition(_usesInterfaceOBJ);
        _usesInterfaceOBJ.addDescription("This is a hack for now to allow for the inclusion of an  interface on a class; it should be the fully qualified name of the interface. The interface shouldn't require any method implementations.");
        _usesInterfaceOBJ.setDmdID("24");
        _usesInterfaceOBJ.setName("usesInterface");
        _usesInterfaceOBJ.setType("meta.String");
        _usesInterface.setDefinedIn(this);
        addAttributeDefList(_usesInterface);

        AttributeDefinitionDMO _uuidNameOBJ = new AttributeDefinitionDMO();
        _uuidName = new AttributeDefinition(_uuidNameOBJ);
        _uuidNameOBJ.addDescription("The object name for objects uniquely identified with a UUID.");
        _uuidNameOBJ.setDesignatedNameAttribute("true");
        _uuidNameOBJ.setDmdID("101");
        _uuidNameOBJ.setName("uuidName");
        _uuidNameOBJ.setType("meta.UUIDName");
        _uuidName.setDefinedIn(this);
        addAttributeDefList(_uuidName);

        AttributeDefinitionDMO _valueTypeOBJ = new AttributeDefinitionDMO();
        _valueType = new AttributeDefinition(_valueTypeOBJ);
        _valueTypeOBJ.addDescription("This attribute indicates the cardinality and storage mechanism for an attribute.");
        _valueTypeOBJ.setDmdID("12");
        _valueTypeOBJ.setName("valueType");
        _valueTypeOBJ.setType("meta.ValueTypeEnum");
        _valueType.setDefinedIn(this);
        addAttributeDefList(_valueType);

        AttributeDefinitionDMO _versionOBJ = new AttributeDefinitionDMO();
        _version = new AttributeDefinition(_versionOBJ);
        _versionOBJ.addDescription("The version at which something was introduced. Version names are assumed to be lexicographically sortable i.e. the name of a version must have a nautral sort order that increases.");
        _versionOBJ.setDmdID("181");
        _versionOBJ.setName("version");
        _versionOBJ.setType("meta.String");
        _version.setDefinedIn(this);
        addAttributeDefList(_version);

        AttributeDefinitionDMO _weakReferenceOBJ = new AttributeDefinitionDMO();
        _weakReference = new AttributeDefinition(_weakReferenceOBJ);
        _weakReferenceOBJ.addDescription("A flag to indicate that a reference attribute is weak i.e.  if the object can't be resolved, no exception is thrown.");
        _weakReferenceOBJ.setDmdID("179");
        _weakReferenceOBJ.setName("weakReference");
        _weakReferenceOBJ.setType("meta.Boolean");
        _weakReference.setDefinedIn(this);
        addAttributeDefList(_weakReference);

        AttributeDefinitionDMO _whyOBJ = new AttributeDefinitionDMO();
        _why = new AttributeDefinition(_whyOBJ);
        _whyOBJ.addDescription("An indication of why something was added to a specification or a system. This might be a reference to a requirement or feature concept. How this is used will depend on context. Due to the fact that it is a weak reference, you may also just put in free form text, since it will simply be treated as an unresolved reference.");
        _whyOBJ.setDmdID("184");
        _whyOBJ.setName("why");
        _whyOBJ.setType("meta.Concinnity");
        _whyOBJ.setWeakReference("true");
        _why.setDefinedIn(this);
        addAttributeDefList(_why);

        AttributeDefinitionDMO _wrapperClassNameOBJ = new AttributeDefinitionDMO();
        _wrapperClassName = new AttributeDefinition(_wrapperClassNameOBJ);
        _wrapperClassNameOBJ.addDescription("This is the fully qualified name of the wrapper class derived from DmcWrapperBase that wraps a DMO. This is used when generating object reference classes associated with ClassDefinitions This actually aligns to the javaClass of the ClassDefinition for which we're generating the reference classes.");
        _wrapperClassNameOBJ.setDmdID("6");
        _wrapperClassNameOBJ.setInternalUse("true");
        _wrapperClassNameOBJ.setName("wrapperClassName");
        _wrapperClassNameOBJ.setType("meta.String");
        _wrapperClassName.setDefinedIn(this);
        addAttributeDefList(_wrapperClassName);

    }
    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpInitTypes(MetaSchemaFormatter.java:223)
    private void initTypes() throws DMFeedbackSet {

        TypeDefinitionDMO _AttributeIDOBJ = new TypeDefinitionDMO();
        _AttributeID = new TypeDefinition(_AttributeIDOBJ);
        _AttributeIDOBJ.setAltType("DmcAttributeInfo");
        _AttributeIDOBJ.setAltTypeImport("org.dmd.core.DmcAttributeInfo");
        _AttributeIDOBJ.addDescription("The AttributeID type allows for the storage of unique attribute identifiers. Currently this is only used in the dark-matter protocol attributeSelector attribute.");
        _AttributeIDOBJ.setName("AttributeID");
        _AttributeIDOBJ.setPrimitiveType("org.dmd.dms.shared.types.AttributeID");
        _AttributeIDOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeAttributeID");
        _AttributeID.setDefinedIn(this);
        addTypeDefList(_AttributeID);

        TypeDefinitionDMO _BooleanOBJ = new TypeDefinitionDMO();
        _Boolean = new TypeDefinition(_BooleanOBJ);
        _BooleanOBJ.addDescription("Provides support for Boolean values. This type makes use of the <code> nullReturnValue </code> flag so that, even if there is no value for an attribute of this type, a value of false will be returned.");
        _BooleanOBJ.setName("Boolean");
        _BooleanOBJ.setNullReturnValue("false");
        _BooleanOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeBoolean");
        _Boolean.setDefinedIn(this);
        addTypeDefList(_Boolean);

        TypeDefinitionDMO _ByteOBJ = new TypeDefinitionDMO();
        _Byte = new TypeDefinition(_ByteOBJ);
        _ByteOBJ.addDescription("Provides support for Byte values.");
        _ByteOBJ.setName("Byte");
        _ByteOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeByte");
        _Byte.setDefinedIn(this);
        addTypeDefList(_Byte);

        TypeDefinitionDMO _CamelCaseNameOBJ = new TypeDefinitionDMO();
        _CamelCaseName = new TypeDefinition(_CamelCaseNameOBJ);
        _CamelCaseNameOBJ.addDescription("The CamelCaseName is a string based name that must start with an alpha character which is followed by a mix of alphanumerics.");
        _CamelCaseNameOBJ.setIsNameType("true");
        _CamelCaseNameOBJ.setName("CamelCaseName");
        _CamelCaseNameOBJ.setNameAttributeDef("meta.camelCaseName");
        _CamelCaseNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.CamelCaseName");
        _CamelCaseNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeCamelCaseName");
        _CamelCaseName.setDefinedIn(this);
        addTypeDefList(_CamelCaseName);

        TypeDefinitionDMO _ClassFilterOBJ = new TypeDefinitionDMO();
        _ClassFilter = new TypeDefinition(_ClassFilterOBJ);
        _ClassFilterOBJ.addDescription("The ClassFilter is used to perform matches against objects based on their class or auxiliary classes.");
        _ClassFilterOBJ.setFilterAttributeDef("meta.classFilter");
        _ClassFilterOBJ.setIsFilterType("true");
        _ClassFilterOBJ.setName("ClassFilter");
        _ClassFilterOBJ.setPrimitiveType("org.dmd.dms.shared.types.ClassFilter");
        _ClassFilterOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeClassFilter");
        _ClassFilter.setDefinedIn(this);
        addTypeDefList(_ClassFilter);

        TypeDefinitionDMO _ClassInfoRefOBJ = new TypeDefinitionDMO();
        _ClassInfoRef = new TypeDefinition(_ClassInfoRefOBJ);
        _ClassInfoRefOBJ.addDescription("The ClassInfoRef type allows for the representation of class information  via the Dark Matter ID associated with a ClassDefinition. It provides transient access to the static DmcClassInfo from the generated DMSAG, regardless of the environment in which it exists.");
        _ClassInfoRefOBJ.setName("ClassInfoRef");
        _ClassInfoRefOBJ.setPrimitiveType("org.dmd.dms.shared.types.ClassInfoRef");
        _ClassInfoRefOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeClassInfoRef");
        _ClassInfoRef.setDefinedIn(this);
        addTypeDefList(_ClassInfoRef);

        TypeDefinitionDMO _DateOBJ = new TypeDefinitionDMO();
        _Date = new TypeDefinition(_DateOBJ);
        _DateOBJ.addDescription("Provides support for Date values.");
        _DateOBJ.setName("Date");
        _DateOBJ.setPrimitiveType("java.util.Date");
        _DateOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeDate");
        _Date.setDefinedIn(this);
        addTypeDefList(_Date);

        TypeDefinitionDMO _DefinitionNameOBJ = new TypeDefinitionDMO();
        _DefinitionName = new TypeDefinition(_DefinitionNameOBJ);
        _DefinitionNameOBJ.addDescription("The DefinitionName provides naming of dark-matter definitions.");
        _DefinitionNameOBJ.setIsNameType("true");
        _DefinitionNameOBJ.setName("DefinitionName");
        _DefinitionNameOBJ.setNameAttributeDef("meta.name");
        _DefinitionNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.DefinitionName");
        _DefinitionNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeDefinitionName");
        _DefinitionName.setDefinedIn(this);
        addTypeDefList(_DefinitionName);

        TypeDefinitionDMO _DmcObjectOBJ = new TypeDefinitionDMO();
        _DmcObject = new TypeDefinition(_DmcObjectOBJ);
        _DmcObjectOBJ.addDescription("The DmcObject type allows for the storage of raw DmcObjects.");
        _DmcObjectOBJ.setName("DmcObject");
        _DmcObjectOBJ.setPrimitiveType("org.dmd.core.DmcObject");
        _DmcObjectOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeDmcObject");
        _DmcObject.setDefinedIn(this);
        addTypeDefList(_DmcObject);

        TypeDefinitionDMO _DotNameOBJ = new TypeDefinitionDMO();
        _DotName = new TypeDefinition(_DotNameOBJ);
        _DotNameOBJ.addDescription("The DotName provides standard mechanisms to deal with hierarchic names composed of strings interspersed with periods (dots) to separate the name elements. For example a dot name might be one.two.three");
        _DotNameOBJ.setIsHierarchicName("true");
        _DotNameOBJ.setIsNameType("true");
        _DotNameOBJ.setName("DotName");
        _DotNameOBJ.setNameAttributeDef("meta.dotName");
        _DotNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.DotName");
        _DotNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeDotName");
        _DotName.setDefinedIn(this);
        addTypeDefList(_DotName);

        TypeDefinitionDMO _DoubleOBJ = new TypeDefinitionDMO();
        _Double = new TypeDefinition(_DoubleOBJ);
        _DoubleOBJ.addDescription("Provides support for Double values.");
        _DoubleOBJ.setName("Double");
        _DoubleOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeDouble");
        _Double.setDefinedIn(this);
        addTypeDefList(_Double);

        TypeDefinitionDMO _EnumValueOBJ = new TypeDefinitionDMO();
        _EnumValue = new TypeDefinition(_EnumValueOBJ);
        _EnumValueOBJ.addDescription("The EnumValue type is used to store the definition of one enumerated value that comprises part of an overall EnumDefinition. <p/> The value of an EnumValue is comprised of at least three tokens and possibly a label: <pre> [enum integer value] [enum value name] [enum description] <: label> </pre> For example: <pre> 0 ABSTRACT Here is the definition of abstract. : Abstract </pre> Within an EnumDefinition, each EnumValue must have a unique integer identifier and a unique value name. <p/> The enum value name is automatically set to uppercase, even if it is specified in lower or mixed case.");
        _EnumValueOBJ.setName("EnumValue");
        _EnumValueOBJ.setPrimitiveType("org.dmd.dms.shared.types.EnumValue");
        _EnumValueOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeEnumValue");
        _EnumValue.setDefinedIn(this);
        addTypeDefList(_EnumValue);

        TypeDefinitionDMO _FilterContainerOBJ = new TypeDefinitionDMO();
        _FilterContainer = new TypeDefinition(_FilterContainerOBJ);
        _FilterContainerOBJ.setAltType("DmcFilter");
        _FilterContainerOBJ.setAltTypeImport("org.dmd.core.DmcFilter");
        _FilterContainerOBJ.addDescription("The FilterContainer type allows for the storage of object filters of different types.");
        _FilterContainerOBJ.setName("FilterContainer");
        _FilterContainerOBJ.setPrimitiveType("org.dmd.dms.shared.types.FilterContainer");
        _FilterContainerOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeFilterContainer");
        _FilterContainer.setDefinedIn(this);
        addTypeDefList(_FilterContainer);

        TypeDefinitionDMO _FloatOBJ = new TypeDefinitionDMO();
        _Float = new TypeDefinition(_FloatOBJ);
        _FloatOBJ.addDescription("Provides support for Float values.");
        _FloatOBJ.setName("Float");
        _FloatOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeFloat");
        _Float.setDefinedIn(this);
        addTypeDefList(_Float);

        TypeDefinitionDMO _FullyQualifiedNameOBJ = new TypeDefinitionDMO();
        _FullyQualifiedName = new TypeDefinition(_FullyQualifiedNameOBJ);
        _FullyQualifiedNameOBJ.setIsNameType("true");
        _FullyQualifiedNameOBJ.setName("FullyQualifiedName");
        _FullyQualifiedNameOBJ.setNameAttributeDef("meta.FQN");
        _FullyQualifiedNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.FullyQualifiedName");
        _FullyQualifiedNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeFullyQualifiedName");
        _FullyQualifiedName.setDefinedIn(this);
        addTypeDefList(_FullyQualifiedName);

        TypeDefinitionDMO _IntegerOBJ = new TypeDefinitionDMO();
        _Integer = new TypeDefinition(_IntegerOBJ);
        _IntegerOBJ.addDescription("Provides support for Integer values.");
        _IntegerOBJ.setName("Integer");
        _IntegerOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeInteger");
        _Integer.setDefinedIn(this);
        addTypeDefList(_Integer);

        TypeDefinitionDMO _IntegerNameOBJ = new TypeDefinitionDMO();
        _IntegerName = new TypeDefinition(_IntegerNameOBJ);
        _IntegerNameOBJ.addDescription("An IntegerName provides the means to uniquely identify an object using an integer value.");
        _IntegerNameOBJ.setIsNameType("true");
        _IntegerNameOBJ.setName("IntegerName");
        _IntegerNameOBJ.setNameAttributeDef("meta.integerName");
        _IntegerNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.IntegerName");
        _IntegerNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeIntegerName");
        _IntegerName.setDefinedIn(this);
        addTypeDefList(_IntegerName);

        TypeDefinitionDMO _IntegerToBooleanOBJ = new TypeDefinitionDMO();
        _IntegerToBoolean = new TypeDefinition(_IntegerToBooleanOBJ);
        _IntegerToBooleanOBJ.addDescription("Provides support for hashed integer to Boolean values.");
        _IntegerToBooleanOBJ.setKeyClass("Integer");
        _IntegerToBooleanOBJ.setName("IntegerToBoolean");
        _IntegerToBooleanOBJ.setPrimitiveType("org.dmd.dms.shared.types.IntegerToBoolean");
        _IntegerToBooleanOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeIntegerToBoolean");
        _IntegerToBoolean.setDefinedIn(this);
        addTypeDefList(_IntegerToBoolean);

        TypeDefinitionDMO _IntegerToStringOBJ = new TypeDefinitionDMO();
        _IntegerToString = new TypeDefinition(_IntegerToStringOBJ);
        _IntegerToStringOBJ.addDescription("Provides support for hashed integer to string values.");
        _IntegerToStringOBJ.setKeyClass("Integer");
        _IntegerToStringOBJ.setName("IntegerToString");
        _IntegerToStringOBJ.setPrimitiveType("org.dmd.dms.shared.types.IntegerToString");
        _IntegerToStringOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeIntegerToString");
        _IntegerToString.setDefinedIn(this);
        addTypeDefList(_IntegerToString);

        TypeDefinitionDMO _IntegerToUUIDLiteOBJ = new TypeDefinitionDMO();
        _IntegerToUUIDLite = new TypeDefinition(_IntegerToUUIDLiteOBJ);
        _IntegerToUUIDLiteOBJ.addDescription("Provides support for hashed integer to UUIDLite values.");
        _IntegerToUUIDLiteOBJ.setKeyClass("Integer");
        _IntegerToUUIDLiteOBJ.setName("IntegerToUUIDLite");
        _IntegerToUUIDLiteOBJ.setPrimitiveType("org.dmd.dms.shared.types.IntegerToUUIDLite");
        _IntegerToUUIDLiteOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeIntegerToUUIDLite");
        _IntegerToUUIDLite.setDefinedIn(this);
        addTypeDefList(_IntegerToUUIDLite);

        TypeDefinitionDMO _LabelledIntegerDataPointOBJ = new TypeDefinitionDMO();
        _LabelledIntegerDataPoint = new TypeDefinition(_LabelledIntegerDataPointOBJ);
        _LabelledIntegerDataPointOBJ.addDescription("Represents a single, labelled Integer data point. Generally used for pie chart data.");
        _LabelledIntegerDataPointOBJ.setName("LabelledIntegerDataPoint");
        _LabelledIntegerDataPointOBJ.setPrimitiveType("org.dmd.dms.shared.types.LabelledIntegerDataPoint");
        _LabelledIntegerDataPointOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeLabelledIntegerDataPoint");
        _LabelledIntegerDataPoint.setDefinedIn(this);
        addTypeDefList(_LabelledIntegerDataPoint);

        TypeDefinitionDMO _LongOBJ = new TypeDefinitionDMO();
        _Long = new TypeDefinition(_LongOBJ);
        _LongOBJ.addDescription("Provides support for Long values.");
        _LongOBJ.setName("Long");
        _LongOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeLong");
        _Long.setDefinedIn(this);
        addTypeDefList(_Long);

        TypeDefinitionDMO _LongNameOBJ = new TypeDefinitionDMO();
        _LongName = new TypeDefinition(_LongNameOBJ);
        _LongNameOBJ.addDescription("A LongName provides the means to uniquely identify an object using a long value.");
        _LongNameOBJ.setIsNameType("true");
        _LongNameOBJ.setName("LongName");
        _LongNameOBJ.setNameAttributeDef("meta.longName");
        _LongNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.LongName");
        _LongNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeLongName");
        _LongName.setDefinedIn(this);
        addTypeDefList(_LongName);

        TypeDefinitionDMO _ModifierOBJ = new TypeDefinitionDMO();
        _Modifier = new TypeDefinition(_ModifierOBJ);
        _ModifierOBJ.addDescription("The Modifier type is used to represent modification operations on a DmcObject. Any modification to an object can be represented by a Modifier. The string representation of a modification can take the following forms: <ul> <li> &ltattribute name&gt ADD &ltvalue&gt</li> <li> &ltattribute name&gt DEL &ltvalue&gt</li> <li> &ltattribute name&gt SET &ltvalue&gt</li> <li> &ltattribute name&gt NTH &ltindex&gt &ltvalue&gt</li> <li> &ltattribute name&gt NTH &ltindex&gt</li> <li> &ltattribute name&gt REM </li> </ul>");
        _ModifierOBJ.setName("Modifier");
        _ModifierOBJ.setPrimitiveType("org.dmd.dms.shared.types.Modifier");
        _ModifierOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeModifier");
        _Modifier.setDefinedIn(this);
        addTypeDefList(_Modifier);

        TypeDefinitionDMO _NameContainerOBJ = new TypeDefinitionDMO();
        _NameContainer = new TypeDefinition(_NameContainerOBJ);
        _NameContainerOBJ.setAltType("DmcObjectName");
        _NameContainerOBJ.setAltTypeImport("org.dmd.core.DmcObjectName");
        _NameContainerOBJ.addDescription("The NameContainer type allows for the storage of object names of different types. This mechanism is required because the naming mechanisms associated with dark-matter allow for different ways of naming objects. When the name of something is transported, it has to be  self describing i.e. the type of the naming attribute must be known so that the appropriate  name type can be instantiated. An example of this comes from the Dark Matter Protocol.  The targets attribute is defined as a NameContainer. An instance of targets might appear as follows: <pre> targets uuidName 809408a7-f00b-448c-beb6-00337e83acc4 </pre> As you can see, the attribute name is <code>targets</code> and the value is <code> uuidName 809408a7-f00b-448c-beb6-00337e83acc4</code>. The <code>uuidName</code> attribute is the <code> designatedNameAttribute </code> for the <code> UUIDName </code> type. So, when parsing/deserializing a name container, we always know the underlying type of the name. <p/> This approach makes dark-matter name handling completely extensible. <p/> A similar approach is taken to filter specifications via the FilterContainer.");
        _NameContainerOBJ.setName("NameContainer");
        _NameContainerOBJ.setPrimitiveType("org.dmd.dms.shared.types.NameContainer");
        _NameContainerOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeNameContainer");
        _NameContainer.setDefinedIn(this);
        addTypeDefList(_NameContainer);

        TypeDefinitionDMO _RuleNameOBJ = new TypeDefinitionDMO();
        _RuleName = new TypeDefinition(_RuleNameOBJ);
        _RuleNameOBJ.addDescription("The RuleName is a string based name that must start with an alpha character which is followed by a mix of alphanumerics.");
        _RuleNameOBJ.setIsNameType("true");
        _RuleNameOBJ.setName("RuleName");
        _RuleNameOBJ.setNameAttributeDef("meta.ruleName");
        _RuleNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.RuleName");
        _RuleNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeRuleName");
        _RuleName.setDefinedIn(this);
        addTypeDefList(_RuleName);

        TypeDefinitionDMO _ShortOBJ = new TypeDefinitionDMO();
        _Short = new TypeDefinition(_ShortOBJ);
        _ShortOBJ.addDescription("Provides support for Short values.");
        _ShortOBJ.setName("Short");
        _ShortOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeShort");
        _Short.setDefinedIn(this);
        addTypeDefList(_Short);

        TypeDefinitionDMO _StringOBJ = new TypeDefinitionDMO();
        _String = new TypeDefinition(_StringOBJ);
        _StringOBJ.addDescription("Provides support for String values.");
        _StringOBJ.setName("String");
        _StringOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeString");
        _String.setDefinedIn(this);
        addTypeDefList(_String);

        TypeDefinitionDMO _StringNameOBJ = new TypeDefinitionDMO();
        _StringName = new TypeDefinition(_StringNameOBJ);
        _StringNameOBJ.addDescription("The StringName is the simplest naming mechanism available; it's just a String.");
        _StringNameOBJ.setIsNameType("true");
        _StringNameOBJ.setName("StringName");
        _StringNameOBJ.setNameAttributeDef("meta.stringName");
        _StringNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.StringName");
        _StringNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeStringName");
        _StringName.setDefinedIn(this);
        addTypeDefList(_StringName);

        TypeDefinitionDMO _StringToStringOBJ = new TypeDefinitionDMO();
        _StringToString = new TypeDefinition(_StringToStringOBJ);
        _StringToStringOBJ.addDescription("Provides support for hashed string to string values.");
        _StringToStringOBJ.setKeyClass("String");
        _StringToStringOBJ.setName("StringToString");
        _StringToStringOBJ.setPrimitiveType("org.dmd.dms.shared.types.StringToString");
        _StringToStringOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeStringToString");
        _StringToString.setDefinedIn(this);
        addTypeDefList(_StringToString);

        TypeDefinitionDMO _TimeDoubleDataPointOBJ = new TypeDefinitionDMO();
        _TimeDoubleDataPoint = new TypeDefinition(_TimeDoubleDataPointOBJ);
        _TimeDoubleDataPointOBJ.addDescription("Represents a single Double data point at a moment in time. Generally used for line or column chart data.");
        _TimeDoubleDataPointOBJ.setName("TimeDoubleDataPoint");
        _TimeDoubleDataPointOBJ.setPrimitiveType("org.dmd.dms.shared.types.TimeDoubleDataPoint");
        _TimeDoubleDataPointOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeTimeDoubleDataPoint");
        _TimeDoubleDataPoint.setDefinedIn(this);
        addTypeDefList(_TimeDoubleDataPoint);

        TypeDefinitionDMO _UUIDLiteOBJ = new TypeDefinitionDMO();
        _UUIDLite = new TypeDefinition(_UUIDLiteOBJ);
        _UUIDLiteOBJ.addDescription("The UUIDLite provides support for UUIDs in GWT environments; a full UUID implementation is not supported by the GWT JRE Emulation mechanisms. It holds two long values that represent a complete java.util.UUID as generated within the server environment. The methods to parse a UUID from a String and present it as a String are taken from the java.util.UUID class.");
        _UUIDLiteOBJ.setName("UUIDLite");
        _UUIDLiteOBJ.setPrimitiveType("org.dmd.dms.shared.types.UUIDLite");
        _UUIDLiteOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeUUIDLite");
        _UUIDLite.setDefinedIn(this);
        addTypeDefList(_UUIDLite);

        TypeDefinitionDMO _UUIDNameOBJ = new TypeDefinitionDMO();
        _UUIDName = new TypeDefinition(_UUIDNameOBJ);
        _UUIDNameOBJ.addDescription("The UUIDName allows for the naming of objects based on the GWT compatible UUIDLite type.");
        _UUIDNameOBJ.setIsNameType("true");
        _UUIDNameOBJ.setName("UUIDName");
        _UUIDNameOBJ.setNameAttributeDef("meta.uuidName");
        _UUIDNameOBJ.setPrimitiveType("org.dmd.dms.shared.types.UUIDName");
        _UUIDNameOBJ.setTypeClassName("org.dmd.dms.shared.types.DmcTypeUUIDName");
        _UUIDName.setDefinedIn(this);
        addTypeDefList(_UUIDName);

    }
    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpInitEnums(MetaSchemaFormatter.java:247)
    private void initEnums() throws DMFeedbackSet {

        EnumDefinitionDMO _BaseTypeEnumOBJ = new EnumDefinitionDMO();
        _BaseTypeEnum = new EnumDefinition(_BaseTypeEnumOBJ);
        _BaseTypeEnumOBJ.addDescription("The BaseTypeEnum indicates the broad category of data types for which  a MethodGenerator component is intended. The matrix defined by combining the ValueType and BaseTypeEnums indicates all the combinations of method types required for a particular type of data in code generation context.");
        _BaseTypeEnumOBJ.addEnumValue("0 PRIMITIVE 	Indicates a primitive data type such as Integer, String, long or a generated complex type.");
        _BaseTypeEnumOBJ.addEnumValue("1 NAMEDREF		Indicates a named object reference.");
        _BaseTypeEnumOBJ.addEnumValue("2 UNNAMEDREF 	Indicates an unnamed object reference.");
        _BaseTypeEnumOBJ.addEnumValue("3 EXTENDEDREF 	Indicates an extended reference.");
        _BaseTypeEnumOBJ.addEnumValue("4 KEYED			Indicates a type that has a defined key type.");
        _BaseTypeEnumOBJ.setName("BaseTypeEnum");
        _BaseTypeEnumOBJ.setNullReturnValue("BaseTypeEnum.PRIMITIVE");
        _BaseTypeEnum.setDefinedIn(this);
        addEnumDefList(_BaseTypeEnum);

        EnumDefinitionDMO _ClassTypeEnumOBJ = new EnumDefinitionDMO();
        _ClassTypeEnum = new EnumDefinition(_ClassTypeEnumOBJ);
        _ClassTypeEnumOBJ.addDescription("The ClassTypeEnum enumeration indicates the types of classes that can be defined; some of these definitions are borrowed from LDAP directory parlance. See the individual enum value definitions for details.");
        _ClassTypeEnumOBJ.addEnumValue("0 UNKNOWN		Unknown value.");
        _ClassTypeEnumOBJ.addEnumValue("1 ABSTRACT		An abstract class is one that provides a base class for a set of related derived classes, but which can't be instantiated by itself.");
        _ClassTypeEnumOBJ.addEnumValue("2 STRUCTURAL	A structural class is a class that can be instantiated by itself.");
        _ClassTypeEnumOBJ.addEnumValue("3 AUXILIARY 	An auxiliary class is basically a collection of additional attributes that can be added to an instance of a STRUCTURAL class; an AUXILIARY class can't be instantiated on its own.");
        _ClassTypeEnumOBJ.addEnumValue("4 EXTENSIBLE 	An extensible class is basically a free-form class that allows ANY attribute to be set on it.");
        _ClassTypeEnumOBJ.addEnumValue("5 INTERFACE		An interface class provides an interface for a set of implementing classes.");
        _ClassTypeEnumOBJ.setName("ClassTypeEnum");
        _ClassTypeEnumOBJ.setNullReturnValue("ClassTypeEnum.UNKNOWN");
        _ClassTypeEnum.setDefinedIn(this);
        addEnumDefList(_ClassTypeEnum);

        EnumDefinitionDMO _DataTypeEnumOBJ = new EnumDefinitionDMO();
        _DataTypeEnum = new EnumDefinition(_DataTypeEnumOBJ);
        _DataTypeEnumOBJ.addDescription("The DataTypeEnum relates to how attributes/classes are dealt with by various persistence mechanism. No inherent behaviour is defined at this level.");
        _DataTypeEnumOBJ.addEnumValue("0 UNKNOWN Indicates that we can't determine the data type.");
        _DataTypeEnumOBJ.addEnumValue("1 TRANSIENT Indicates that the data is transient i.e. it exists within the application context in which it is used, but is not persisted across application invocations and is not serialized in communications with other systems.");
        _DataTypeEnumOBJ.addEnumValue("2 PERSISTENT Indicates that the data is meant to be persistent. What persistence mechanism is used is application dependent.");
        _DataTypeEnumOBJ.addEnumValue("3 NONPERSISTENT Indicates that the data is used within your system and  transmitted to remote systems but is not persisted.");
        _DataTypeEnumOBJ.setName("DataTypeEnum");
        _DataTypeEnumOBJ.setNullReturnValue("DataTypeEnum.PERSISTENT");
        _DataTypeEnum.setDefinedIn(this);
        addEnumDefList(_DataTypeEnum);

        EnumDefinitionDMO _DebugEnumOBJ = new EnumDefinitionDMO();
        _DebugEnum = new EnumDefinition(_DebugEnumOBJ);
        _DebugEnumOBJ.addDescription("The DebugEnum indicates the various levels of detailed logging that can be enabled in the DMC framework.");
        _DebugEnumOBJ.addEnumValue("0 NONE Unknown value.");
        _DebugEnumOBJ.addEnumValue("1 FILTER Allows fine control over printing of debug messages associated with filtering operations.");
        _DebugEnumOBJ.addEnumValue("2 SCHEMA Allows fine control over printing of debug messages associated with schema loading operations.");
        _DebugEnumOBJ.setName("DebugEnum");
        _DebugEnumOBJ.setNullReturnValue("DebugEnum.NONE");
        _DebugEnum.setDefinedIn(this);
        addEnumDefList(_DebugEnum);

        EnumDefinitionDMO _FilterTypeEnumOBJ = new EnumDefinitionDMO();
        _FilterTypeEnum = new EnumDefinition(_FilterTypeEnumOBJ);
        _FilterTypeEnumOBJ.addDescription("The FilterTypeEnum enumeration indicates the types of filter operations that can be carried out on the attributes of an object.");
        _FilterTypeEnumOBJ.addEnumValue("0 NONE Indicates that no filter operation was specified.");
        _FilterTypeEnumOBJ.addEnumValue("1 AND  Indicates that the rest of the filter ops that follow will be ANDed together.");
        _FilterTypeEnumOBJ.addEnumValue("2 OR   Indicates that the rest of the filter ops that follow will be ORed together.");
        _FilterTypeEnumOBJ.addEnumValue("3 EQ   Performs a test for equality.");
        _FilterTypeEnumOBJ.addEnumValue("4 NE   Performs a test for inequality.");
        _FilterTypeEnumOBJ.addEnumValue("5 PR   Performs a test for the presence of an attribute.");
        _FilterTypeEnumOBJ.addEnumValue("6 NP   Performs a test to see if an attribute is not present.");
        _FilterTypeEnumOBJ.setName("FilterTypeEnum");
        _FilterTypeEnumOBJ.setNullReturnValue("FilterTypeEnum.NONE");
        _FilterTypeEnum.setDefinedIn(this);
        addEnumDefList(_FilterTypeEnum);

        EnumDefinitionDMO _ModifyTypeEnumOBJ = new EnumDefinitionDMO();
        _ModifyTypeEnum = new EnumDefinition(_ModifyTypeEnumOBJ);
        _ModifyTypeEnumOBJ.addDescription("The ModifyTypeEnum indicates the types of modification operations that can be carried out on the attributes of an object.");
        _ModifyTypeEnumOBJ.addEnumValue("0 NONE Indicates that no modify operation was specified.");
        _ModifyTypeEnumOBJ.addEnumValue("1 ADD  The ADD operation adds a new value to a multi-valued attribute.");
        _ModifyTypeEnumOBJ.addEnumValue("2 DEL  The DEL operation removes a value from a multi-valued attribute.");
        _ModifyTypeEnumOBJ.addEnumValue("3 SET  The SET operation sets a new value for a single-valued attribute.");
        _ModifyTypeEnumOBJ.addEnumValue("4 REM  The REM operation removes the entire attribute from the object.");
        _ModifyTypeEnumOBJ.addEnumValue("5 NTH  The NTH operation sets the value at the specified index.");
        _ModifyTypeEnumOBJ.setName("ModifyTypeEnum");
        _ModifyTypeEnumOBJ.setNullReturnValue("ModifyTypeEnum.NONE");
        _ModifyTypeEnum.setDefinedIn(this);
        addEnumDefList(_ModifyTypeEnum);

        EnumDefinitionDMO _OperationalContextEnumOBJ = new EnumDefinitionDMO();
        _OperationalContextEnum = new EnumDefinition(_OperationalContextEnumOBJ);
        _OperationalContextEnumOBJ.addDescription("The OperationalContextEnum indicates various types of operational contexts in which some component can operate.");
        _OperationalContextEnumOBJ.addEnumValue("0 DMO       Indicates that the component follows basic Dark Matter Object rules which likewise conform to GWT JRE Emulation.");
        _OperationalContextEnumOBJ.addEnumValue("1 FULLJAVA  indicates that the component operates in a ful Java environment; no restrictions.");
        _OperationalContextEnumOBJ.setName("OperationalContextEnum");
        _OperationalContextEnumOBJ.setNullReturnValue("OperationalContextEnum.DMO");
        _OperationalContextEnum.setDefinedIn(this);
        addEnumDefList(_OperationalContextEnum);

        EnumDefinitionDMO _OriginalTypeEnumOBJ = new EnumDefinitionDMO();
        _OriginalTypeEnum = new EnumDefinition(_OriginalTypeEnumOBJ);
        _OriginalTypeEnumOBJ.addDescription("The OriginalTypeEnum indicates the source of type, whether explicitly defined or implicitly defined and generated as an internal type.");
        _OriginalTypeEnumOBJ.addEnumValue("0 TYPE The type is actually a type!.");
        _OriginalTypeEnumOBJ.addEnumValue("1 ENUM The type is an enum.");
        _OriginalTypeEnumOBJ.addEnumValue("2 OBJECT The type is the internally generated one to represent an unnamed object.");
        _OriginalTypeEnumOBJ.addEnumValue("3 REFERENCE The type is the internally generated one to represent a reference to a named object.");
        _OriginalTypeEnumOBJ.addEnumValue("4 EXTREF The type is an extended reference type.");
        _OriginalTypeEnumOBJ.addEnumValue("5 COMPLEXTYPE The is a complex type.");
        _OriginalTypeEnumOBJ.addEnumValue("6 NAMETYPE The type is a name type.");
        _OriginalTypeEnumOBJ.setName("OriginalTypeEnum");
        _OriginalTypeEnumOBJ.setNullReturnValue("OriginalTypeEnum.TYPE");
        _OriginalTypeEnum.setDefinedIn(this);
        addEnumDefList(_OriginalTypeEnum);

        EnumDefinitionDMO _RuleTypeEnumOBJ = new EnumDefinitionDMO();
        _RuleTypeEnum = new EnumDefinition(_RuleTypeEnumOBJ);
        _RuleTypeEnumOBJ.addDescription("The RuleTypeEnum indicates the level at which a rule is applied. An ATTRIBUTE rule is applied at the attribute level and must have the applyToAttribute attribute and may have the applyToClass attribute to limit its scope to particular classes. A CLASS level rule will be applied to an entire object and will have the applyToClass attribute unless it is defined as GLOBAL.");
        _RuleTypeEnumOBJ.addEnumValue("0 ATTRIBUTE Indicates that this is an attribute level rule.");
        _RuleTypeEnumOBJ.addEnumValue("1 CLASS     Indicates that this is a class level rule.");
        _RuleTypeEnumOBJ.setName("RuleTypeEnum");
        _RuleTypeEnumOBJ.setNullReturnValue("RuleTypeEnum.ATTRIBUTE");
        _RuleTypeEnum.setDefinedIn(this);
        addEnumDefList(_RuleTypeEnum);

        EnumDefinitionDMO _ValueTypeEnumOBJ = new EnumDefinitionDMO();
        _ValueTypeEnum = new EnumDefinition(_ValueTypeEnumOBJ);
        _ValueTypeEnumOBJ.addDescription("The ValueTypeEnum indicates the cardinality of an attribute as well as the type of Map to be used if the attribute is keyed. This is an extension to original concept of single-valued versus multi-valued. Hashsets are also supported.");
        _ValueTypeEnumOBJ.addEnumValue("0 SINGLE Indicates that the attribute is single-valued.");
        _ValueTypeEnumOBJ.addEnumValue("1 MULTI Indicates that the attribute is multi-valued.");
        _ValueTypeEnumOBJ.addEnumValue("2 HASHMAPPED Indicates that the attribute values implement the DmcMappedAttributeIF interface and are stored in a HashMap.");
        _ValueTypeEnumOBJ.addEnumValue("3 TREEMAPPED Indicates that the attribute values implement the DmcMappedAttributeIF interface and are stored in a TreeMap.");
        _ValueTypeEnumOBJ.addEnumValue("4 HASHSET Indicates that the attribute values are stored in a HashSet.");
        _ValueTypeEnumOBJ.addEnumValue("5 TREESET Indicates that the attribute values are stored in a TreeSet.");
        _ValueTypeEnumOBJ.setName("ValueTypeEnum");
        _ValueTypeEnumOBJ.setNullReturnValue("ValueTypeEnum.SINGLE");
        _ValueTypeEnum.setDefinedIn(this);
        addEnumDefList(_ValueTypeEnum);

        EnumDefinitionDMO _WrapperTypeEnumOBJ = new EnumDefinitionDMO();
        _WrapperTypeEnum = new EnumDefinition(_WrapperTypeEnumOBJ);
        _WrapperTypeEnumOBJ.addDescription("The WrapperTypeEnum indicates which wrapper class you want instantiated when a class of object is recognized during parsing or when an object is pulled from a repository.");
        _WrapperTypeEnumOBJ.addEnumValue("0 NONE Unknown value.");
        _WrapperTypeEnumOBJ.addEnumValue("1 BASE Indicates that you just want to use the generated DMW class.");
        _WrapperTypeEnumOBJ.addEnumValue("2 EXTENDED Indicates that you want to use your own extended class.");
        _WrapperTypeEnumOBJ.setName("WrapperTypeEnum");
        _WrapperTypeEnumOBJ.setNullReturnValue("WrapperTypeEnum.BASE");
        _WrapperTypeEnum.setDefinedIn(this);
        addEnumDefList(_WrapperTypeEnum);

    }
    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpInitRuleCategories(MetaSchemaFormatter.java:266)
    private void initRuleCategories() throws DMFeedbackSet {

        RuleCategoryDMO _AttributeValidationOBJ = new RuleCategoryDMO();
        _AttributeValidation = new RuleCategory(_AttributeValidationOBJ);
        _AttributeValidationOBJ.setAttributeInfoFromParam("attribute.getAttributeInfo()");
        _AttributeValidationOBJ.setClassInfoFromParam("obj.getConstructionClassInfo()");
        _AttributeValidationOBJ.addDescription("Rules in this category are used to validate individual attributes.");
        _AttributeValidationOBJ.setName("AttributeValidation");
        _AttributeValidationOBJ.setOpContext("DMO");
        _AttributeValidationOBJ.setRuleCategoryID("3");
        _AttributeValidationOBJ.addRuleParam("org.dmd.dmc.DmcObject::obj:The object in which the attribute exists");
        _AttributeValidationOBJ.addRuleParam("org.dmd.dmc.DmcAttribute:<?>:attribute:The attribute to be validated");
        _AttributeValidationOBJ.setRuleType("ATTRIBUTE");
        _AttributeValidation.setDefinedIn(this);
        addRuleCategoryList(_AttributeValidation);

        RuleCategoryDMO _AttributeValidationWithResolverOBJ = new RuleCategoryDMO();
        _AttributeValidationWithResolver = new RuleCategory(_AttributeValidationWithResolverOBJ);
        _AttributeValidationWithResolverOBJ.setAttributeInfoFromParam("attribute.getAttributeInfo()");
        _AttributeValidationWithResolverOBJ.setClassInfoFromParam("obj.getConstructionClassInfo()");
        _AttributeValidationWithResolverOBJ.addDescription("Rules in this category are used to validate individual attributes, but may require information that can be accessed from a given namespace provided by the name resolver. <p> For now, we've a way around having this category - see ReferencedAttributeTypeRule, but we may have to return to this mechanism.");
        _AttributeValidationWithResolverOBJ.setName("AttributeValidationWithResolver");
        _AttributeValidationWithResolverOBJ.setOpContext("DMO");
        _AttributeValidationWithResolverOBJ.setRuleCategoryID("4");
        _AttributeValidationWithResolverOBJ.addRuleParam("org.dmd.dmc.DmcObject::obj:The object in which the attribute exists");
        _AttributeValidationWithResolverOBJ.addRuleParam("org.dmd.dmc.DmcAttribute:<?>:attribute:The attribute to be validated");
        _AttributeValidationWithResolverOBJ.addRuleParam("org.dmd.dmc.DmcUniqueNameResolverIF::resolver:The name resolver");
        _AttributeValidationWithResolverOBJ.setRuleType("ATTRIBUTE");
        _AttributeValidationWithResolver.setDefinedIn(this);
        addRuleCategoryList(_AttributeValidationWithResolver);

        RuleCategoryDMO _InitializationOBJ = new RuleCategoryDMO();
        _Initialization = new RuleCategory(_InitializationOBJ);
        _InitializationOBJ.setClassInfoFromParam("obj.getConstructionClassInfo()");
        _InitializationOBJ.addDescription("Rules in this category are used to initialize objects to a known state after creation. <p/> Execution will be performed from the bottom of the derivation hierarchy to the top i.e. we look for rules for the construction class of the object being initialized and then move up the derivation hierarchy looking for rules associated with the base classes.");
        _InitializationOBJ.setName("Initialization");
        _InitializationOBJ.setOpContext("DMO");
        _InitializationOBJ.setRuleCategoryID("1");
        _InitializationOBJ.addRuleParam("org.dmd.dmc.DmcObject: :obj:The object to be initialized");
        _InitializationOBJ.setRuleType("CLASS");
        _Initialization.setDefinedIn(this);
        addRuleCategoryList(_Initialization);

        RuleCategoryDMO _ObjectValidationOBJ = new RuleCategoryDMO();
        _ObjectValidation = new RuleCategory(_ObjectValidationOBJ);
        _ObjectValidationOBJ.setClassInfoFromParam("obj.getConstructionClassInfo()");
        _ObjectValidationOBJ.addDescription("Rules in this category are used to validate a complete object. This would include objects read from Object Instance Files, objects in CreateRequests (after Initialization rules have been applied).");
        _ObjectValidationOBJ.setName("ObjectValidation");
        _ObjectValidationOBJ.setOpContext("DMO");
        _ObjectValidationOBJ.setRuleCategoryID("2");
        _ObjectValidationOBJ.addRuleParam("org.dmd.dmc.DmcObject: :obj:The object to be validated");
        _ObjectValidationOBJ.setRuleType("CLASS");
        _ObjectValidation.setDefinedIn(this);
        addRuleCategoryList(_ObjectValidation);

        RuleCategoryDMO _UCOValidationOBJ = new RuleCategoryDMO();
        _UCOValidation = new RuleCategory(_UCOValidationOBJ);
        _UCOValidationOBJ.setClassInfoFromParam("DmcOmni.instance().getClassInfo(obj.getConstructionClass())");
        _UCOValidationOBJ.addDescription("Rules in this category are used to validate DmcUncheckedObjects (UCOs) which are basically just collections of attribute/value pairs.");
        _UCOValidationOBJ.setName("UCOValidation");
        _UCOValidationOBJ.setOpContext("DMO");
        _UCOValidationOBJ.setRuleCategoryID("6");
        _UCOValidationOBJ.addRuleImport("org.dmd.dmc.DmcOmni");
        _UCOValidationOBJ.addRuleParam("org.dmd.dmc.util.DmcUncheckedObject: :obj:The object to be validated:");
        _UCOValidationOBJ.setRuleType("CLASS");
        _UCOValidation.setDefinedIn(this);
        addRuleCategoryList(_UCOValidation);

    }
    // Generated from: org.dmd.dms.tools.generation.meta.MetaSchemaFormatter.dumpInitComplexTypes(MetaSchemaFormatter.java:285)
    private void initComplexTypes() throws DMFeedbackSet {

        ComplexTypeDefinitionDMO _DmwTypeToWrapperTypeOBJ = new ComplexTypeDefinitionDMO();
        _DmwTypeToWrapperType = new ComplexTypeDefinition(_DmwTypeToWrapperTypeOBJ);
        _DmwTypeToWrapperTypeOBJ.addDescription("The DmwTypeToWrapperType complex type is used as the type of the dmwWrapperType attribute which is used to indicate the type of wrappers to generate for a class in a particular generation context.");
        _DmwTypeToWrapperTypeOBJ.setName("DmwTypeToWrapperType");
        _DmwTypeToWrapperTypeOBJ.addRequiredPart("String          dmwType     \"The Dark Matter Wrapper type\"");
        _DmwTypeToWrapperTypeOBJ.addRequiredPart("WrapperTypeEnum wrapperType \"The type of wrapper to be used in this context\"");
        _DmwTypeToWrapperType.setDefinedIn(this);
        addComplexTypeDefList(_DmwTypeToWrapperType);

        ComplexTypeDefinitionDMO _ExampleOBJ = new ComplexTypeDefinitionDMO();
        _Example = new ComplexTypeDefinition(_ExampleOBJ);
        _ExampleOBJ.addDescription("If you want to get rid of the &#92;n use: .replaceAll(\"&#92;&#92;&#92;&#92;n\",\"&#92;&#92;&#92;n\")");
        _ExampleOBJ.setFieldSeparator(":");
        _ExampleOBJ.setName("Example");
        _ExampleOBJ.addRequiredPart("String			type		\"The type of the example - this is just a single token string that gives a hint to your example formatter of what to do with the content\"");
        _ExampleOBJ.addRequiredPart("String			title		\"A title for the example - this doesn't have to be used by your example formatter\"");
        _ExampleOBJ.addRequiredPart("String			content		\"The textual content of the example - this can be anything you want\" greedy=true");
        _Example.setDefinedIn(this);
        addComplexTypeDefList(_Example);

        ComplexTypeDefinitionDMO _NameValuePairOBJ = new ComplexTypeDefinitionDMO();
        _NameValuePair = new ComplexTypeDefinition(_NameValuePairOBJ);
        _NameValuePairOBJ.addDescription("The NameValuePair type provides a general extensibility mechanism for DMOs by allowing for the addition of name value pairs to an object. This is a quick and dirty alternative to using auxiliary classes to extend an object especially the DSDefinition object that provides a common base class for all domain specific definitions.");
        _NameValuePairOBJ.setName("NameValuePair");
        _NameValuePairOBJ.addRequiredPart("String			name		\"The name of the value\"");
        _NameValuePairOBJ.addRequiredPart("String			value		\"The value\" quoted=true");
        _NameValuePair.setDefinedIn(this);
        addComplexTypeDefList(_NameValuePair);

        ComplexTypeDefinitionDMO _OptimizeOBJ = new ComplexTypeDefinitionDMO();
        _Optimize = new ComplexTypeDefinition(_OptimizeOBJ);
        _OptimizeOBJ.addDescription("Allows for capture of optimization notes.");
        _OptimizeOBJ.addExample("code : Specifying an Optimization/Improvement :  <pre> optimize We could improve compression if we indicated the blah, blah, blah who=\"Me\" when=\"release 5\" why=\"reduce bandwidth charges\" </pre>");
        _OptimizeOBJ.setFieldSeparator(":");
        _OptimizeOBJ.setName("Optimize");
        _OptimizeOBJ.addOptionalPart("String			who		\"Who made the suggestion\" quoted=true");
        _OptimizeOBJ.addOptionalPart("String			when	\"A suggested timeframe for the change\" quoted=true");
        _OptimizeOBJ.addOptionalPart("Concinnity		why		\"A suggested timeframe for the change\" weakref=true multivalued=true");
        _OptimizeOBJ.addRequiredPart("String			what	\"A description of the change to be made\"");
        _Optimize.setDefinedIn(this);
        addComplexTypeDefList(_Optimize);

        ComplexTypeDefinitionDMO _PartOBJ = new ComplexTypeDefinitionDMO();
        _Part = new ComplexTypeDefinition(_PartOBJ);
        _PartOBJ.addDescription("The Part complex type is used to describe the Parts of a ComplexTypeDefinition.");
        _PartOBJ.setName("Part");
        _PartOBJ.addOptionalPart("Boolean			quoted 		\"Indicates if the Part allows for a quoted value or if it's intended to be a single token\"");
        _PartOBJ.addOptionalPart("Boolean			multivalued	\"Indicates if the Part is multivalued. This can be specified on any optionalPart but can only be used on a requiredPart if it's the only part in the ComplexTypeDefinition\"");
        _PartOBJ.addOptionalPart("Boolean			weakref		\"Indicates that a reference type is weak i.e. that no exception will be thrown if the reference can't be resolved - this is only applicable to optional Parts.\"");
        _PartOBJ.addOptionalPart("Boolean			greedy		\"This flag can only be used on a Part composed of requiredParts and only on the last requiredPart. It is not compatible with other flags such as quoted, multivalued or weakref. It allows for a set of required parts followed by chunk of text that extends to the end of the attribute value.\"");
        _PartOBJ.addRequiredPart("TypeDefinition	type        \"The type of the Part\"");
        _PartOBJ.addRequiredPart("String			name        \"The name of the Part\"");
        _PartOBJ.addRequiredPart("String			description \"The description of the Part\"  quoted=true");
        _Part.setDefinedIn(this);
        addComplexTypeDefList(_Part);

        ComplexTypeDefinitionDMO _RuleParamOBJ = new ComplexTypeDefinitionDMO();
        _RuleParam = new ComplexTypeDefinition(_RuleParamOBJ);
        _RuleParamOBJ.addDescription("The RuleParam type is used to succintly describe a parameter to be supplied to a rule when it is executed.");
        _RuleParamOBJ.setFieldSeparator(":");
        _RuleParamOBJ.setName("RuleParam");
        _RuleParamOBJ.addRequiredPart("String         importStatement \"The import for the type of parameter\"");
        _RuleParamOBJ.addRequiredPart("String         genericArgs     \"The generic arguments associated with this parameter\"");
        _RuleParamOBJ.addRequiredPart("String         name            \"The name of the parameter\"");
        _RuleParamOBJ.addRequiredPart("String         description     \"A description of the parameter\"");
        _RuleParam.setDefinedIn(this);
        addComplexTypeDefList(_RuleParam);

        ComplexTypeDefinitionDMO _SchemaAndReasonOBJ = new ComplexTypeDefinitionDMO();
        _SchemaAndReason = new ComplexTypeDefinition(_SchemaAndReasonOBJ);
        _SchemaAndReasonOBJ.addDescription("The SchemaAndReason type is used when schemas are loaded dynamically by some piece of software. For documentation purposes, it's useful to know why the schema is being loaded, since the class name may not informative enough.");
        _SchemaAndReasonOBJ.setName("SchemaAndReason");
        _SchemaAndReasonOBJ.addRequiredPart("String			schema		\"The fully qualified name of the schema to load\"");
        _SchemaAndReasonOBJ.addRequiredPart("String			hint		\"A hint as to why the schema is required\" quoted=true");
        _SchemaAndReason.setDefinedIn(this);
        addComplexTypeDefList(_SchemaAndReason);

    }
}
