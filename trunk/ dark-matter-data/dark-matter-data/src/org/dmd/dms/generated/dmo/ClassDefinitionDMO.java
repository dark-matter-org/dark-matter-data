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

/**
 * This class provides the basic mechanism to define new classes for a schema.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1069)
 */
@SuppressWarnings({"serial"})
public class ClassDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

     public ClassDefinitionDMO(){
         super("ClassDefinition");
     }

     public ClassDefinitionDMO(String oc){
         super(oc);
     }

    @Override
    public ClassDefinitionDMO getOneOfMe(){
        ClassDefinitionDMO rc = new ClassDefinitionDMO();
        return(rc);
    }

     public final static String _name = "name";
     public final static String _description = "description";
     public final static String _classType = "classType";
     public final static String _derivedFrom = "derivedFrom";
     public final static String _must = "must";
     public final static String _may = "may";
     public final static String _isNamedBy = "isNamedBy";
     public final static String _javaClass = "javaClass";
     public final static String _intendedToExtend = "intendedToExtend";
     public final static String _usesInterface = "usesInterface";
     public final static String _useWrapperType = "useWrapperType";
     public final static String _allowedParents = "allowedParents";
     public final static String _allowedChildren = "allowedChildren";
     public final static String _implements = "implements";
     public final static String _abbrev = "abbrev";
     public final static String _obsoleteVersion = "obsoleteVersion";
     public final static String _isTransportable = "isTransportable";
     public final static String _derivedClasses = "derivedClasses";
     public final static String _actions = "actions";
     public final static String _internalTypeRef = "internalTypeRef";
     public final static String _dmoImport = "dmoImport";
     public final static String _dmoClass = "dmoClass";
     public final static String _dmwImport = "dmwImport";
     public final static String _dmwClass = "dmwClass";
     public final static String _dmeImport = "dmeImport";
     public final static String _dmeClass = "dmeClass";
     public final static String _dmtImport = "dmtImport";
     public final static String _dmtClass = "dmtClass";
     public final static String _dmoAuxClass = "dmoAuxClass";
     public final static String _dmoAuxClassImport = "dmoAuxClassImport";
     public final static String _dmwAuxClass = "dmwAuxClass";
     public final static String _dmwAuxClassImport = "dmwAuxClassImport";
     public final static String _dataType = "dataType";


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
     * This attribute indicates the type of a class definition.
     */
    public ClassTypeEnum getClassType(){
        DmcTypeClassTypeEnum attr = (DmcTypeClassTypeEnum) get(_classType);
        if (attr == null)
            return(ClassTypeEnum.UNKNOWN);

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
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
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
     * @return An Iterator of AttributeDefinitionDMO objects.
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
     * This attribute can be used on AUXILIARY classes to give a hint about their
     * intended usage. For example, if you were extending schema definitions with
     * some or your  own attributes for some purpose, your auxliary class could
     * have intendedToExtend ClassDefinition.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getIntendedToExtend(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_intendedToExtend);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another intendedToExtend value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addIntendedToExtend(Object value) throws DmcValueException {
        DmcAttribute attr = get(_intendedToExtend);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(_intendedToExtend,attr);
        return(attr);
    }

    /**
     * This is a hack for now to allow for the inclusion of an  interface on a
     * class; it should be the fully qualified name of the interface. The
     * interface shouldn't require any method implementations.
     */
    public String getUsesInterface(){
        DmcTypeString attr = (DmcTypeString) get(_usesInterface);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets usesInterface to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUsesInterface(Object value) throws DmcValueException {
        DmcAttribute attr = get(_usesInterface);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_usesInterface,attr);
    }

    /**
     * Indicates whether you want to use the generated DMW wrapper or the
     * extended wrapper you've created yourself.
     */
    public WrapperTypeEnum getUseWrapperType(){
        DmcTypeWrapperTypeEnum attr = (DmcTypeWrapperTypeEnum) get(_useWrapperType);
        if (attr == null)
            return(WrapperTypeEnum.BASE);

        return(attr.getSV());
    }

    /**
     * Sets useWrapperType to the specified value.
     * @param value A value compatible with DmcTypeWrapperTypeEnum
     */
    @SuppressWarnings("unchecked")
    public void setUseWrapperType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_useWrapperType);
        if (attr == null)
            attr = new DmcTypeWrapperTypeEnum();
        
        attr.set(value);
        set(_useWrapperType,attr);
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy.
     * @return An Iterator of ClassDefinitionDMO objects.
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
     * @return An Iterator of ClassDefinitionDMO objects.
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
     * Indicates the interface class which this class implements.
     * @return An Iterator of ClassDefinitionDMO objects.
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
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
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
     * Indicates the classes that are known to be derived from this class.
     * @return An Iterator of ClassDefinitionDMO objects.
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
     * Indicates the set of actions that are supported by a class of objects.
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    public Iterator<ActionDefinitionREF> getActions(){
        DmcTypeActionDefinitionREF attr = (DmcTypeActionDefinitionREF) get(_actions);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actions value.
     * @param value A value compatible with DmcTypeActionDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addActions(Object value) throws DmcValueException {
        DmcAttribute attr = get(_actions);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREF();
        
        attr.add(value);
        add(_actions,attr);
        return(attr);
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

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is generated for this class. The
     * class will always have DmcObject at the top of its derivation hierarchy.
     */
    public String getDmoImport(){
        DmcTypeString attr = (DmcTypeString) get(_dmoImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmoImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmoImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmoImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassDMO
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
     * This attribute indicates the full name of the generated Dark Matter
     * Wrapper (DMW) class (including package) that is wrapped by this class. The
     * class will always be a derived class of DmwWrapperBase.
     */
    public String getDmwImport(){
        DmcTypeString attr = (DmcTypeString) get(_dmwImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmwImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmwImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmwImport,attr);
    }

    /**
     * This attribute indicates just the DMW class name, eg MyClassDMW
     */
    public String getDmwClass(){
        DmcTypeString attr = (DmcTypeString) get(_dmwClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmwClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmwClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmwClass,attr);
    }

    /**
     * This attribute indicates the full name of the class that extends a DMW
     * class. Dark Matter Extended (DME).
     */
    public String getDmeImport(){
        DmcTypeString attr = (DmcTypeString) get(_dmeImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmeImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmeImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmeImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmeImport,attr);
    }

    /**
     * This attribute indicates just the Dark Matter Extended (DME) class name.
     */
    public String getDmeClass(){
        DmcTypeString attr = (DmcTypeString) get(_dmeClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmeClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmeClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmeClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmeClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcType class used to
     * reference a class. These types are auto generated and named
     * DmcType<classname>REF.
     */
    public String getDmtImport(){
        DmcTypeString attr = (DmcTypeString) get(_dmtImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmtImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmtImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmtImport,attr);
    }

    /**
     * This attribute indicates just the DmcType class name.
     */
    public String getDmtClass(){
        DmcTypeString attr = (DmcTypeString) get(_dmtClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmtClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmtClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmtClass,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUXDMO
     */
    public String getDmoAuxClass(){
        DmcTypeString attr = (DmcTypeString) get(_dmoAuxClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoAuxClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmoAuxClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmoAuxClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmoAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUXDMO class
     */
    public String getDmoAuxClassImport(){
        DmcTypeString attr = (DmcTypeString) get(_dmoAuxClassImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmoAuxClassImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmoAuxClassImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmoAuxClassImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUX
     */
    public String getDmwAuxClass(){
        DmcTypeString attr = (DmcTypeString) get(_dmwAuxClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwAuxClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmwAuxClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmwAuxClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmwAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUX class
     */
    public String getDmwAuxClassImport(){
        DmcTypeString attr = (DmcTypeString) get(_dmwAuxClassImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDmwAuxClassImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmwAuxClassImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_dmwAuxClassImport,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent.
     */
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnum attr = (DmcTypeDataTypeEnum) get(_dataType);
        if (attr == null)
            return(DataTypeEnum.TRANSIENT);

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


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public String getObjectName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }

}
