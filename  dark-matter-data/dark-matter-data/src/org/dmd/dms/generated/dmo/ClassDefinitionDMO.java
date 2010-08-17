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
        DmcTypeString attr = (DmcTypeString) attributes.get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value){
        try{
            set(_name, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDescription(Object value){
        try{
            set(_description, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This attribute indicates the full name of the class (including package)
     * that should be instantiated when an instance of an object is created via
     * the DmdClassDef.newInstance() function. The class must be a derived class
     * of DmdGenericObject.
     */
    public String getJavaClass(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_javaClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets javaClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setJavaClass(Object value){
        try{
            set(_javaClass, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is wrapped by this class. The class
     * will always be a derived class of DmcObject.
     */
    public String getDmoClass(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_dmoClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmoClass(Object value){
        try{
            set(_dmoClass, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This attribute indicates the attribute that is used to name an object
     * instance. When a hierarchic name is composed for an object, the class name
     * plus the value of the naming attribute (type:value) is used to create the
     * name of an object.
     */
    public AttributeDefinitionREF getNamingAttribute(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) attributes.get(_namingAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets namingAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    public void setNamingAttribute(Object value){
        try{
            set(_namingAttribute, DmcTypeAttributeDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the attribute by which an object of some class is named. When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method will return the value of the isNamedBy attribute.
     */
    public AttributeDefinitionREF getIsNamedBy(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) attributes.get(_isNamedBy);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets isNamedBy to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    public void setIsNamedBy(Object value){
        try{
            set(_isNamedBy, DmcTypeAttributeDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This attribute indicates the type of a class definition.
     */
    public ClassTypeEnum getClassType(){
        DmcTypeClassTypeEnum attr = (DmcTypeClassTypeEnum) attributes.get(_classType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnum
     */
    public void setClassType(Object value){
        try{
            set(_classType, DmcTypeClassTypeEnum.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * The package to be used when a Java class is generated from a schema
     * definition. Note: the autogenerated code will be place in the generated
     * subdirectory beneath this package. For example, if you specify com.foo.bar
     * as the codePackage. Your code will be generated in com.foo.bar.generated.
     */
    public String getCodePackage(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_codePackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets codePackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setCodePackage(Object value){
        try{
            set(_codePackage, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) attributes.get(_must);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    public void addMust(Object value){
        try{
            add(_must, DmcTypeAttributeDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) attributes.get(_may);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    public void addMay(Object value){
        try{
            add(_may, DmcTypeAttributeDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * The label attribute is used to specify a string that can be used as a
     * label when a value is displayed in a UI or webpage.
     */
    public String getLabel(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_label);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets label to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setLabel(Object value){
        try{
            set(_label, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived.
     */
    public ClassDefinitionREF getDerivedFrom(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) attributes.get(_derivedFrom);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets derivedFrom to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    public void setDerivedFrom(Object value){
        try{
            set(_derivedFrom, DmcTypeClassDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the interface class which this class implements.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getImplements(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) attributes.get(_implements);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another implements value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    public void addImplements(Object value){
        try{
            add(_implements, DmcTypeClassDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) attributes.get(_definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREF
     */
    public void setDefinedIn(Object value){
        try{
            set(_definedIn, DmcTypeSchemaDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the set of actions that are supported by a class of objects.
     * @returns An Iterator of ActionDefinitionDMO objects.
     */
    public Iterator<ActionDefinitionREF> getAction(){
        DmcTypeActionDefinitionREF attr = (DmcTypeActionDefinitionREF) attributes.get(_action);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another action value.
     * @param value A value compatible with DmcTypeActionDefinitionREF
     */
    public void addAction(Object value){
        try{
            add(_action, DmcTypeActionDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    public String getAbbrev(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setAbbrev(Object value){
        try{
            set(_abbrev, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute.
     * If this attribute is set to PERSISTENT, you must also specify the
     * reposName attribute.
     */
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnum attr = (DmcTypeDataTypeEnum) attributes.get(_dataType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnum
     */
    public void setDataType(Object value){
        try{
            set(_dataType, DmcTypeDataTypeEnum.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This attribute indicates the name of an attribute or class when it is
     * stored in a repository and added to that repository's schema. Generally
     * speaking, we will always use the standard ef prefix for all attribute and
     * class names. Like all other name values, this one must be globally unique.
     */
    public String getReposName(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_reposName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setReposName(Object value){
        try{
            set(_reposName, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This attribute indicates the object identifier of an attribute or class
     * when it is stored in a repository.
     */
    public String getReposOid(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_reposOid);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposOid to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setReposOid(Object value){
        try{
            set(_reposOid, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This flag indicates that you want a wrapper class generated for a
     * STRUCTURAL class. This is useful when objects are sent back to a client as
     * part of an extensible class e.g. an Event or a Get request. The client can
     * use the wrapper to wrap the extensible class and access attributes in a
     * convenient manner.
     */
    public Boolean getCreateWrapper(){
        DmcTypeBoolean attr = (DmcTypeBoolean) attributes.get(_createWrapper);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets createWrapper to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setCreateWrapper(Object value){
        try{
            set(_createWrapper, DmcTypeBoolean.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getAllowedParents(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) attributes.get(_allowedParents);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another allowedParents value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    public void addAllowedParents(Object value){
        try{
            add(_allowedParents, DmcTypeClassDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the classes of object that may be children of the current class
     * when objects are created in an instance hierarchy.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getAllowedChildren(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) attributes.get(_allowedChildren);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another allowedChildren value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    public void addAllowedChildren(Object value){
        try{
            add(_allowedChildren, DmcTypeClassDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the classes that are known to be derived from this class.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getDerivedClasses(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) attributes.get(_derivedClasses);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another derivedClasses value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    public void addDerivedClasses(Object value){
        try{
            add(_derivedClasses, DmcTypeClassDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This flag indicates if the entire contents of an object should be sent in
     * a create event. If set to true, the DAF create event will have all the
     * attributes of the newly created object included. This potentially reduces
     * the number of get requests that are received for objects such as alarms.
     */
    public Boolean getSendWhenCreated(){
        DmcTypeBoolean attr = (DmcTypeBoolean) attributes.get(_sendWhenCreated);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets sendWhenCreated to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setSendWhenCreated(Object value){
        try{
            set(_sendWhenCreated, DmcTypeBoolean.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This indicates the S load (in service load) level at which this entity
     * introduced. This defaults to S1.0-010.
     */
    public String getAddedVersion(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_addedVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addedVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setAddedVersion(Object value){
        try{
            set(_addedVersion, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
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
        DmcTypeString attr = (DmcTypeString) attributes.get(_obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setObsoleteVersion(Object value){
        try{
            set(_obsoleteVersion, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
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
        DmcTypeBoolean attr = (DmcTypeBoolean) attributes.get(_enumAlternative);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets enumAlternative to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setEnumAlternative(Object value){
        try{
            set(_enumAlternative, DmcTypeBoolean.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }


}
