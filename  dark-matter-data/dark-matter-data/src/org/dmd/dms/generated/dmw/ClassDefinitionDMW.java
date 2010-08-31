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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * This class provides the basic mechanism to define new classes for a schema.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDefClasses(MetaGenerator.java:797)
 */
@SuppressWarnings("unused")
public class ClassDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private ClassDefinitionDMO mycore;

    protected ClassDefinitionDMW() {
        super(new ClassDefinitionDMO());
        mycore = (ClassDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ClassDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (ClassDefinitionDMO) core;
        mycore.setContainer(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<ClassDefinition>());
    }

    protected ClassDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected ClassDefinitionDMW(String mn) throws DmcValueException {
        super(new ClassDefinitionDMO());
        mycore = (ClassDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * This attribute indicates the full name of the class (including package)
     * that should be instantiated when an instance of an object is created via
     * the DmdClassDef.newInstance() function. The class must be a derived class
     * of DmdGenericObject.
     */
    public String getJavaClass(){
        return(mycore.getJavaClass());
    }

    /**
     * Sets javaClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setJavaClass(Object value) throws DmcValueException {
        mycore.setJavaClass(value);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is wrapped by this class. The class
     * will always be a derived class of DmcObject.
     */
    public String getDmoClass(){
        return(mycore.getDmoClass());
    }

    /**
     * Sets dmoClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmoClass(Object value) throws DmcValueException {
        mycore.setDmoClass(value);
    }

    /**
     * This attribute indicates the attribute that is used to name an object
     * instance. When a hierarchic name is composed for an object, the class name
     * plus the value of the naming attribute (type:value) is used to create the
     * name of an object.
     */
    public AttributeDefinition getNamingAttribute(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) mycore.get(ClassDefinitionDMO._namingAttribute);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets namingAttribute to the specified value.
     * @param value A value compatible with AttributeDefinition
     */
    public void setNamingAttribute(AttributeDefinition value) throws DmcValueException {
        mycore.setNamingAttribute(value.getDmcObject());
    }

    /**
     * Indicates the attribute by which an object of some class is named. When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method will return the value of the isNamedBy attribute.
     */
    public AttributeDefinition getIsNamedBy(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) mycore.get(ClassDefinitionDMO._isNamedBy);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets isNamedBy to the specified value.
     * @param value A value compatible with AttributeDefinition
     */
    public void setIsNamedBy(AttributeDefinition value) throws DmcValueException {
        mycore.setIsNamedBy(value.getDmcObject());
    }

    /**
     * This attribute indicates the type of a class definition.
     */
    public ClassTypeEnum getClassType(){
        return(mycore.getClassType());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnum
     */
    public void setClassType(Object value) throws DmcValueException {
        mycore.setClassType(value);
    }

    /**
     * The package to be used when a Java class is generated from a schema
     * definition. Note: the autogenerated code will be place in the generated
     * subdirectory beneath this package. For example, if you specify com.foo.bar
     * as the codePackage. Your code will be generated in com.foo.bar.generated.
     */
    public String getCodePackage(){
        return(mycore.getCodePackage());
    }

    /**
     * Sets codePackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setCodePackage(Object value) throws DmcValueException {
        mycore.setCodePackage(value);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @returns An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<AttributeDefinition> getMust(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREF) mycore.get(ClassDefinitionDMO._must);
        if (attr == null)
            return(null);

        ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with AttributeDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMust(AttributeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addMust(value.getDmcObject());
        ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<AttributeDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @returns An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<AttributeDefinition> getMay(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREF) mycore.get(ClassDefinitionDMO._may);
        if (attr == null)
            return(null);

        ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with AttributeDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMay(AttributeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addMay(value.getDmcObject());
        ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<AttributeDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * The label attribute is used to specify a string that can be used as a
     * label when a value is displayed in a UI or webpage.
     */
    public String getLabel(){
        return(mycore.getLabel());
    }

    /**
     * Sets label to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setLabel(Object value) throws DmcValueException {
        mycore.setLabel(value);
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived.
     */
    public ClassDefinition getDerivedFrom(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO._derivedFrom);
        if (attr == null)
            return(null);
        ClassDefinitionDMO obj = attr.getSV().getObject();
        return((ClassDefinition)obj.getContainer());
    }

    /**
     * Sets derivedFrom to the specified value.
     * @param value A value compatible with ClassDefinition
     */
    public void setDerivedFrom(ClassDefinition value) throws DmcValueException {
        mycore.setDerivedFrom(value.getDmcObject());
    }

    /**
     * Indicates the interface class which this class implements.
     * @returns An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getImplements(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO._implements);
        if (attr == null)
            return(null);

        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another implements value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addImplements(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addImplements(value.getDmcObject());
        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ClassDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    public SchemaDefinition getDefinedIn(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) mycore.get(ClassDefinitionDMO._definedIn);
        if (attr == null)
            return(null);
        SchemaDefinitionDMO obj = attr.getSV().getObject();
        return((SchemaDefinition)obj.getContainer());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with SchemaDefinition
     */
    public void setDefinedIn(SchemaDefinition value) throws DmcValueException {
        mycore.setDefinedIn(value.getDmcObject());
    }

    /**
     * Indicates the set of actions that are supported by a class of objects.
     * @returns An Iterator of ActionDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ActionDefinition> getAction(){
        DmcAttribute attr = (DmcTypeActionDefinitionREF) mycore.get(ClassDefinitionDMO._action);
        if (attr == null)
            return(null);

        ArrayList<ActionDefinition> refs = (ArrayList<ActionDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another action value.
     * @param value A value compatible with ActionDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAction(ActionDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addAction(value.getDmcObject());
        ArrayList<ActionDefinition> refs = (ArrayList<ActionDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ActionDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    public String getAbbrev(){
        return(mycore.getAbbrev());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setAbbrev(Object value) throws DmcValueException {
        mycore.setAbbrev(value);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute.
     * If this attribute is set to PERSISTENT, you must also specify the
     * reposName attribute.
     */
    public DataTypeEnum getDataType(){
        return(mycore.getDataType());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnum
     */
    public void setDataType(Object value) throws DmcValueException {
        mycore.setDataType(value);
    }

    /**
     * This attribute indicates the name of an attribute or class when it is
     * stored in a repository and added to that repository's schema. Generally
     * speaking, we will always use the standard ef prefix for all attribute and
     * class names. Like all other name values, this one must be globally unique.
     */
    public String getReposName(){
        return(mycore.getReposName());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setReposName(Object value) throws DmcValueException {
        mycore.setReposName(value);
    }

    /**
     * This attribute indicates the object identifier of an attribute or class
     * when it is stored in a repository.
     */
    public String getReposOid(){
        return(mycore.getReposOid());
    }

    /**
     * Sets reposOid to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setReposOid(Object value) throws DmcValueException {
        mycore.setReposOid(value);
    }

    /**
     * This flag indicates that you want a wrapper class generated for a
     * STRUCTURAL class. This is useful when objects are sent back to a client as
     * part of an extensible class e.g. an Event or a Get request. The client can
     * use the wrapper to wrap the extensible class and access attributes in a
     * convenient manner.
     */
    public Boolean getCreateWrapper(){
        return(mycore.getCreateWrapper());
    }

    /**
     * Sets createWrapper to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setCreateWrapper(Object value) throws DmcValueException {
        mycore.setCreateWrapper(value);
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy.
     * @returns An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getAllowedParents(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO._allowedParents);
        if (attr == null)
            return(null);

        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another allowedParents value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAllowedParents(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addAllowedParents(value.getDmcObject());
        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ClassDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Indicates the classes of object that may be children of the current class
     * when objects are created in an instance hierarchy.
     * @returns An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getAllowedChildren(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO._allowedChildren);
        if (attr == null)
            return(null);

        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another allowedChildren value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAllowedChildren(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addAllowedChildren(value.getDmcObject());
        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ClassDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Indicates the classes that are known to be derived from this class.
     * @returns An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getDerivedClasses(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO._derivedClasses);
        if (attr == null)
            return(null);

        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another derivedClasses value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDerivedClasses(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addDerivedClasses(value.getDmcObject());
        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ClassDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * This flag indicates if the entire contents of an object should be sent in
     * a create event. If set to true, the DAF create event will have all the
     * attributes of the newly created object included. This potentially reduces
     * the number of get requests that are received for objects such as alarms.
     */
    public Boolean getSendWhenCreated(){
        return(mycore.getSendWhenCreated());
    }

    /**
     * Sets sendWhenCreated to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setSendWhenCreated(Object value) throws DmcValueException {
        mycore.setSendWhenCreated(value);
    }

    /**
     * This indicates the S load (in service load) level at which this entity
     * introduced. This defaults to S1.0-010.
     */
    public String getAddedVersion(){
        return(mycore.getAddedVersion());
    }

    /**
     * Sets addedVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setAddedVersion(Object value) throws DmcValueException {
        mycore.setAddedVersion(value);
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
        return(mycore.getObsoleteVersion());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setObsoleteVersion(Object value) throws DmcValueException {
        mycore.setObsoleteVersion(value);
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
        return(mycore.getEnumAlternative());
    }

    /**
     * Sets enumAlternative to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setEnumAlternative(Object value) throws DmcValueException {
        mycore.setEnumAlternative(value);
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
        return(mycore.getIsTransportable());
    }

    /**
     * Sets isTransportable to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setIsTransportable(Object value) throws DmcValueException {
        mycore.setIsTransportable(value);
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This is set automatically on ClassDefinitions as they are parsed.
     */
    public TypeDefinition getInternalTypeRef(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) mycore.get(ClassDefinitionDMO._internalTypeRef);
        if (attr == null)
            return(null);
        TypeDefinitionDMO obj = attr.getSV().getObject();
        return((TypeDefinition)obj.getContainer());
    }

    /**
     * Sets internalTypeRef to the specified value.
     * @param value A value compatible with TypeDefinition
     */
    public void setInternalTypeRef(TypeDefinition value) throws DmcValueException {
        mycore.setInternalTypeRef(value.getDmcObject());
    }

    /**
     * This attribute can be used on AUXILIARY classes to give a hint about their
     * intended usage. For example, if you were extending schema definitions with
     * some or your  own attributes for some purpose, your auxliary class could
     * have intendedToExtend ClassDefinition.
     * @returns An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getIntendedToExtend(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO._intendedToExtend);
        if (attr == null)
            return(null);

        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another intendedToExtend value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addIntendedToExtend(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addIntendedToExtend(value.getDmcObject());
        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ClassDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }


}
