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
package org.dmd.dms.generated.dmo;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * This class provides the basic mechanism to define new classes for a schema.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1017)
 */
@SuppressWarnings({"unused", "serial"})
public class ClassDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

     public final static String _name = "name";
     public final static String _description = "description";
     public final static String _javaClass = "javaClass";
     public final static String _dmoClass = "dmoClass";
     public final static String _namingAttribute = "namingAttribute";
     public final static String _isNamedBy = "isNamedBy";
     public final static String _classType = "classType";
     public final static String _codePackage = "codePackage";
     public final static String _must = "must";
     public final static String _may = "may";
     public final static String _label = "label";
     public final static String _derivedFrom = "derivedFrom";
     public final static String _implements = "implements";
     public final static String _definedIn = "definedIn";
     public final static String _action = "action";
     public final static String _abbrev = "abbrev";
     public final static String _dataType = "dataType";
     public final static String _reposName = "reposName";
     public final static String _reposOid = "reposOid";
     public final static String _createWrapper = "createWrapper";
     public final static String _allowedParents = "allowedParents";
     public final static String _allowedChildren = "allowedChildren";
     public final static String _derivedClasses = "derivedClasses";
     public final static String _sendWhenCreated = "sendWhenCreated";
     public final static String _addedVersion = "addedVersion";
     public final static String _obsoleteVersion = "obsoleteVersion";
     public final static String _enumAlternative = "enumAlternative";
     public final static String _isTransportable = "isTransportable";
     public final static String _internalTypeRef = "internalTypeRef";


     public String getConstructionClassName(){
         return("ClassDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(_description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(_description);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_description,attr);
    }

    /**
     * This attribute indicates the full name of the class (including package)
     * that should be instantiated when an instance of an object is created via
     * the DmdClassDef.newInstance() function. The class must be a derived class
     * of DmdGenericObject.
     */
    public String getJavaClass(){
        DmcTypeString attr = (DmcTypeString) get(_javaClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets javaClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setJavaClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_javaClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_javaClass,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is wrapped by this class. The class
     * will always be a derived class of DmcObject.
     */
    public String getDmoClass(){
        DmcTypeString attr = (DmcTypeString) get(_dmoClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmoClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmoClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmoClass,attr);
    }

    /**
     * This attribute indicates the attribute that is used to name an object
     * instance. When a hierarchic name is composed for an object, the class name
     * plus the value of the naming attribute (type:value) is used to create the
     * name of an object.
     */
    public AttributeDefinitionREF getNamingAttribute(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_namingAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets namingAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setNamingAttribute(Object value) throws DmcValueException {
        DmcAttribute attr = get(_namingAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.set(value);
        set(_namingAttribute,attr);
    }

    /**
     * Indicates the attribute by which an object of some class is named. When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method will return the value of the isNamedBy attribute.
     */
    public AttributeDefinitionREF getIsNamedBy(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_isNamedBy);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets isNamedBy to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setIsNamedBy(Object value) throws DmcValueException {
        DmcAttribute attr = get(_isNamedBy);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.set(value);
        set(_isNamedBy,attr);
    }

    /**
     * This attribute indicates the type of a class definition.
     */
    public ClassTypeEnum getClassType(){
        DmcTypeClassTypeEnum attr = (DmcTypeClassTypeEnum) get(_classType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnum
     */
    @SuppressWarnings("unchecked")
    public void setClassType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_classType);
        if (attr == null)
            attr = new DmcTypeClassTypeEnum();
        
        attr.set(value);
        set(_classType,attr);
    }

    /**
     * The package to be used when a Java class is generated from a schema
     * definition. Note: the autogenerated code will be place in the generated
     * subdirectory beneath this package. For example, if you specify com.foo.bar
     * as the codePackage. Your code will be generated in com.foo.bar.generated.
     */
    public String getCodePackage(){
        DmcTypeString attr = (DmcTypeString) get(_codePackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets codePackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setCodePackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(_codePackage);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_codePackage,attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_must);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMust(Object value) throws DmcValueException {
        DmcAttribute attr = get(_must);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(_must,attr);
        return(attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_may);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMay(Object value) throws DmcValueException {
        DmcAttribute attr = get(_may);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(_may,attr);
        return(attr);
    }

    /**
     * The label attribute is used to specify a string that can be used as a
     * label when a value is displayed in a UI or webpage.
     */
    public String getLabel(){
        DmcTypeString attr = (DmcTypeString) get(_label);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets label to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setLabel(Object value) throws DmcValueException {
        DmcAttribute attr = get(_label);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_label,attr);
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived.
     */
    public ClassDefinitionREF getDerivedFrom(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_derivedFrom);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets derivedFrom to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setDerivedFrom(Object value) throws DmcValueException {
        DmcAttribute attr = get(_derivedFrom);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.set(value);
        set(_derivedFrom,attr);
    }

    /**
     * Indicates the interface class which this class implements.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getImplements(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_implements);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another implements value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addImplements(Object value) throws DmcValueException {
        DmcAttribute attr = get(_implements);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(_implements,attr);
        return(attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) get(_definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute attr = get(_definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREF();
        
        attr.set(value);
        set(_definedIn,attr);
    }

    /**
     * Indicates the set of actions that are supported by a class of objects.
     * @returns An Iterator of ActionDefinitionDMO objects.
     */
    public Iterator<ActionDefinitionREF> getAction(){
        DmcTypeActionDefinitionREF attr = (DmcTypeActionDefinitionREF) get(_action);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another action value.
     * @param value A value compatible with DmcTypeActionDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAction(Object value) throws DmcValueException {
        DmcAttribute attr = get(_action);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREF();
        
        attr.add(value);
        add(_action,attr);
        return(attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    public String getAbbrev(){
        DmcTypeString attr = (DmcTypeString) get(_abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setAbbrev(Object value) throws DmcValueException {
        DmcAttribute attr = get(_abbrev);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_abbrev,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute.
     * If this attribute is set to PERSISTENT, you must also specify the
     * reposName attribute.
     */
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnum attr = (DmcTypeDataTypeEnum) get(_dataType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnum
     */
    @SuppressWarnings("unchecked")
    public void setDataType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnum();
        
        attr.set(value);
        set(_dataType,attr);
    }

    /**
     * This attribute indicates the name of an attribute or class when it is
     * stored in a repository and added to that repository's schema. Generally
     * speaking, we will always use the standard ef prefix for all attribute and
     * class names. Like all other name values, this one must be globally unique.
     */
    public String getReposName(){
        DmcTypeString attr = (DmcTypeString) get(_reposName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setReposName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_reposName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_reposName,attr);
    }

    /**
     * This attribute indicates the object identifier of an attribute or class
     * when it is stored in a repository.
     */
    public String getReposOid(){
        DmcTypeString attr = (DmcTypeString) get(_reposOid);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposOid to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setReposOid(Object value) throws DmcValueException {
        DmcAttribute attr = get(_reposOid);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_reposOid,attr);
    }

    /**
     * This flag indicates that you want a wrapper class generated for a
     * STRUCTURAL class. This is useful when objects are sent back to a client as
     * part of an extensible class e.g. an Event or a Get request. The client can
     * use the wrapper to wrap the extensible class and access attributes in a
     * convenient manner.
     */
    public Boolean getCreateWrapper(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_createWrapper);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets createWrapper to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setCreateWrapper(Object value) throws DmcValueException {
        DmcAttribute attr = get(_createWrapper);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_createWrapper,attr);
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getAllowedParents(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_allowedParents);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another allowedParents value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAllowedParents(Object value) throws DmcValueException {
        DmcAttribute attr = get(_allowedParents);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(_allowedParents,attr);
        return(attr);
    }

    /**
     * Indicates the classes of object that may be children of the current class
     * when objects are created in an instance hierarchy.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getAllowedChildren(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_allowedChildren);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another allowedChildren value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAllowedChildren(Object value) throws DmcValueException {
        DmcAttribute attr = get(_allowedChildren);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(_allowedChildren,attr);
        return(attr);
    }

    /**
     * Indicates the classes that are known to be derived from this class.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getDerivedClasses(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_derivedClasses);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another derivedClasses value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDerivedClasses(Object value) throws DmcValueException {
        DmcAttribute attr = get(_derivedClasses);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(_derivedClasses,attr);
        return(attr);
    }

    /**
     * This flag indicates if the entire contents of an object should be sent in
     * a create event. If set to true, the DAF create event will have all the
     * attributes of the newly created object included. This potentially reduces
     * the number of get requests that are received for objects such as alarms.
     */
    public Boolean getSendWhenCreated(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_sendWhenCreated);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets sendWhenCreated to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setSendWhenCreated(Object value) throws DmcValueException {
        DmcAttribute attr = get(_sendWhenCreated);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_sendWhenCreated,attr);
    }

    /**
     * This indicates the S load (in service load) level at which this entity
     * introduced. This defaults to S1.0-010.
     */
    public String getAddedVersion(){
        DmcTypeString attr = (DmcTypeString) get(_addedVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addedVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setAddedVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(_addedVersion);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_addedVersion,attr);
    }

    /**
     * This indicates the S load (in service load) level at which this entity
     * became obsolete. So, if the current version in the field is S1.0-010 and
     * you are now obsoleting an attribute, this field would specify S1.0-011.
     * <P> This attribute (when set to true) indicates that a schema definition
     * is obsolete and shouldn't be used in subsequent releases of the code. This
     * supports the general concept that we never delete attributes or classes,
     * we obsolete them. This makes the job of migration from release to release
     * easier.
     */
    public String getObsoleteVersion(){
        DmcTypeString attr = (DmcTypeString) get(_obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(_obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_obsoleteVersion,attr);
    }

    /**
     * Indicates if an auxiliary class is being used to decorate an
     * DmdEnumValueDef with an alternative to the primary string value for the
     * enum val. Sounds tricky! It is a little. <P> Let's say you want to map a
     * variety of different strings to mean the same thing when used in the
     * context of an enum value e.g. in TL1, they allow dashes - in enum values,
     * we don't (because we generate code from this stuff). Anyway, you can
     * define an auxiliary class that will allow you to add a TL1 equivalent
     * string to an enum value definition. When the code is generated for the
     * enum, it will allow for the use of that alternative string when setting
     * the value of the enumerated attribute. Likewise, there is a method on the
     * DmdGenericAttribute that will allow you to retrieve the equivalent enum
     * value for a particular EnumAlternative.
     */
    public Boolean getEnumAlternative(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_enumAlternative);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets enumAlternative to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setEnumAlternative(Object value) throws DmcValueException {
        DmcAttribute attr = get(_enumAlternative);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_enumAlternative,attr);
    }

    /**
     * This attribute indicates whether or not the object defined by a
     * ClassDefinition is meant to be transportable across an RPC interface when
     * object reference attributes refer to it. If set to true, the class will
     * automatically have its reference type use the
     * DmcNameObjectTransportableREF as its base. Otherwise, it will use
     * DmcNameObjectNotransportableREF.
     */
    public Boolean getIsTransportable(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_isTransportable);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isTransportable to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setIsTransportable(Object value) throws DmcValueException {
        DmcAttribute attr = get(_isTransportable);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_isTransportable,attr);
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This is set automatically on ClassDefinitions as they are parsed.
     */
    public TypeDefinitionREF getInternalTypeRef(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) get(_internalTypeRef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets internalTypeRef to the specified value.
     * @param value A value compatible with DmcTypeTypeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setInternalTypeRef(Object value) throws DmcValueException {
        DmcAttribute attr = get(_internalTypeRef);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREF();
        
        attr.set(value);
        set(_internalTypeRef,attr);
    }


}
