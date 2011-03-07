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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1020)
 */
@SuppressWarnings({"serial"})
public class ClassDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __classType = new DmcAttributeInfo("classType",10,"ClassTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __derivedFrom = new DmcAttributeInfo("derivedFrom",21,"ClassDefinition",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __must = new DmcAttributeInfo("must",26,"AttributeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __may = new DmcAttributeInfo("may",27,"AttributeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __isNamedBy = new DmcAttributeInfo("isNamedBy",80,"AttributeDefinition",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __javaClass = new DmcAttributeInfo("javaClass",34,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __intendedToExtend = new DmcAttributeInfo("intendedToExtend",22,"ClassDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __usesInterface = new DmcAttributeInfo("usesInterface",24,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __useWrapperType = new DmcAttributeInfo("useWrapperType",82,"WrapperTypeEnum",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __allowedParents = new DmcAttributeInfo("allowedParents",62,"ClassDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __allowedChildren = new DmcAttributeInfo("allowedChildren",63,"ClassDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __implements = new DmcAttributeInfo("implements",23,"ClassDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __abbrev = new DmcAttributeInfo("abbrev",9,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __obsoleteVersion = new DmcAttributeInfo("obsoleteVersion",73,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __isTransportable = new DmcAttributeInfo("isTransportable",79,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __derivedClasses = new DmcAttributeInfo("derivedClasses",25,"ClassDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __actions = new DmcAttributeInfo("actions",32,"ActionDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __internalTypeRef = new DmcAttributeInfo("internalTypeRef",20,"TypeDefinition",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmoImport = new DmcAttributeInfo("dmoImport",35,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmoClass = new DmcAttributeInfo("dmoClass",36,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwImport = new DmcAttributeInfo("dmwImport",41,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwClass = new DmcAttributeInfo("dmwClass",42,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmeImport = new DmcAttributeInfo("dmeImport",43,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmeClass = new DmcAttributeInfo("dmeClass",44,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmtImport = new DmcAttributeInfo("dmtImport",45,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmtClass = new DmcAttributeInfo("dmtClass",46,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmoAuxClass = new DmcAttributeInfo("dmoAuxClass",37,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmoAuxClassImport = new DmcAttributeInfo("dmoAuxClassImport",38,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwAuxClass = new DmcAttributeInfo("dmwAuxClass",39,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwAuxClassImport = new DmcAttributeInfo("dmwAuxClassImport",40,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dataType = new DmcAttributeInfo("dataType",11,"DataTypeEnum",ValueTypeEnum.SINGLE,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__classType.id,__classType);
        _ImAp.put(__derivedFrom.id,__derivedFrom);
        _ImAp.put(__must.id,__must);
        _ImAp.put(__may.id,__may);
        _ImAp.put(__isNamedBy.id,__isNamedBy);
        _ImAp.put(__javaClass.id,__javaClass);
        _ImAp.put(__intendedToExtend.id,__intendedToExtend);
        _ImAp.put(__usesInterface.id,__usesInterface);
        _ImAp.put(__useWrapperType.id,__useWrapperType);
        _ImAp.put(__allowedParents.id,__allowedParents);
        _ImAp.put(__allowedChildren.id,__allowedChildren);
        _ImAp.put(__implements.id,__implements);
        _ImAp.put(__abbrev.id,__abbrev);
        _ImAp.put(__obsoleteVersion.id,__obsoleteVersion);
        _ImAp.put(__isTransportable.id,__isTransportable);
        _ImAp.put(__derivedClasses.id,__derivedClasses);
        _ImAp.put(__actions.id,__actions);
        _ImAp.put(__internalTypeRef.id,__internalTypeRef);
        _ImAp.put(__dmoImport.id,__dmoImport);
        _ImAp.put(__dmoClass.id,__dmoClass);
        _ImAp.put(__dmwImport.id,__dmwImport);
        _ImAp.put(__dmwClass.id,__dmwClass);
        _ImAp.put(__dmeImport.id,__dmeImport);
        _ImAp.put(__dmeClass.id,__dmeClass);
        _ImAp.put(__dmtImport.id,__dmtImport);
        _ImAp.put(__dmtClass.id,__dmtClass);
        _ImAp.put(__dmoAuxClass.id,__dmoAuxClass);
        _ImAp.put(__dmoAuxClassImport.id,__dmoAuxClassImport);
        _ImAp.put(__dmwAuxClass.id,__dmwAuxClass);
        _ImAp.put(__dmwAuxClassImport.id,__dmwAuxClassImport);
        _ImAp.put(__dataType.id,__dataType);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__classType.name,__classType);
        _SmAp.put(__derivedFrom.name,__derivedFrom);
        _SmAp.put(__must.name,__must);
        _SmAp.put(__may.name,__may);
        _SmAp.put(__isNamedBy.name,__isNamedBy);
        _SmAp.put(__javaClass.name,__javaClass);
        _SmAp.put(__intendedToExtend.name,__intendedToExtend);
        _SmAp.put(__usesInterface.name,__usesInterface);
        _SmAp.put(__useWrapperType.name,__useWrapperType);
        _SmAp.put(__allowedParents.name,__allowedParents);
        _SmAp.put(__allowedChildren.name,__allowedChildren);
        _SmAp.put(__implements.name,__implements);
        _SmAp.put(__abbrev.name,__abbrev);
        _SmAp.put(__obsoleteVersion.name,__obsoleteVersion);
        _SmAp.put(__isTransportable.name,__isTransportable);
        _SmAp.put(__derivedClasses.name,__derivedClasses);
        _SmAp.put(__actions.name,__actions);
        _SmAp.put(__internalTypeRef.name,__internalTypeRef);
        _SmAp.put(__dmoImport.name,__dmoImport);
        _SmAp.put(__dmoClass.name,__dmoClass);
        _SmAp.put(__dmwImport.name,__dmwImport);
        _SmAp.put(__dmwClass.name,__dmwClass);
        _SmAp.put(__dmeImport.name,__dmeImport);
        _SmAp.put(__dmeClass.name,__dmeClass);
        _SmAp.put(__dmtImport.name,__dmtImport);
        _SmAp.put(__dmtClass.name,__dmtClass);
        _SmAp.put(__dmoAuxClass.name,__dmoAuxClass);
        _SmAp.put(__dmoAuxClassImport.name,__dmoAuxClassImport);
        _SmAp.put(__dmwAuxClass.name,__dmwAuxClass);
        _SmAp.put(__dmwAuxClassImport.name,__dmwAuxClassImport);
        _SmAp.put(__dataType.name,__dataType);
    }


    public ClassDefinitionDMO(){
        super("ClassDefinition",_ImAp,_SmAp);
    }

    public ClassDefinitionDMO(String oc){
        super(oc);
    }

    public ClassDefinitionDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    @Override
    public ClassDefinitionDMO getOneOfMe(){
        ClassDefinitionDMO rc = new ClassDefinitionDMO();
        return(rc);
    }

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
        DmcTypeString attr = (DmcTypeString) get(__name);
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
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(__description);
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
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * This attribute indicates the type of a class definition.
     */
    public ClassTypeEnum getClassType(){
        DmcTypeClassTypeEnum attr = (DmcTypeClassTypeEnum) get(__classType);
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
        DmcAttribute attr = get(__classType);
        if (attr == null)
            attr = new DmcTypeClassTypeEnum();
        
        attr.set(value);
        set(__classType,attr);
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived.
     */
    public ClassDefinitionREF getDerivedFrom(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__derivedFrom);
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
        DmcAttribute attr = get(__derivedFrom);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.set(value);
        set(__derivedFrom,attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(__must);
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
        DmcAttribute attr = get(__must);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(__must,attr);
        return(attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(__may);
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
        DmcAttribute attr = get(__may);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(__may,attr);
        return(attr);
    }

    /**
     * Indicates the attribute by which an object of some class is named. When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method will return the value of the isNamedBy attribute.
     */
    public AttributeDefinitionREF getIsNamedBy(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(__isNamedBy);
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
        DmcAttribute attr = get(__isNamedBy);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.set(value);
        set(__isNamedBy,attr);
    }

    /**
     * This attribute indicates the full name of the class (including package)
     * that should be instantiated when an instance of an object is created via
     * the DmdClassDef.newInstance() function. The class must be a derived class
     * of DmdGenericObject.
     */
    public String getJavaClass(){
        DmcTypeString attr = (DmcTypeString) get(__javaClass);
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
        DmcAttribute attr = get(__javaClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__javaClass,attr);
    }

    /**
     * This attribute can be used on AUXILIARY classes to give a hint about their
     * intended usage. For example, if you were extending schema definitions with
     * some or your  own attributes for some purpose, your auxliary class could
     * have intendedToExtend ClassDefinition.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getIntendedToExtend(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__intendedToExtend);
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
        DmcAttribute attr = get(__intendedToExtend);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(__intendedToExtend,attr);
        return(attr);
    }

    /**
     * This is a hack for now to allow for the inclusion of an  interface on a
     * class; it should be the fully qualified name of the interface. The
     * interface shouldn't require any method implementations.
     */
    public String getUsesInterface(){
        DmcTypeString attr = (DmcTypeString) get(__usesInterface);
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
        DmcAttribute attr = get(__usesInterface);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__usesInterface,attr);
    }

    /**
     * Indicates whether you want to use the generated DMW wrapper or the
     * extended wrapper you've created yourself.
     */
    public WrapperTypeEnum getUseWrapperType(){
        DmcTypeWrapperTypeEnum attr = (DmcTypeWrapperTypeEnum) get(__useWrapperType);
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
        DmcAttribute attr = get(__useWrapperType);
        if (attr == null)
            attr = new DmcTypeWrapperTypeEnum();
        
        attr.set(value);
        set(__useWrapperType,attr);
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getAllowedParents(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__allowedParents);
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
        DmcAttribute attr = get(__allowedParents);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(__allowedParents,attr);
        return(attr);
    }

    /**
     * Indicates the classes of object that may be children of the current class
     * when objects are created in an instance hierarchy.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getAllowedChildren(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__allowedChildren);
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
        DmcAttribute attr = get(__allowedChildren);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(__allowedChildren,attr);
        return(attr);
    }

    /**
     * Indicates the interface class which this class implements.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getImplements(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__implements);
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
        DmcAttribute attr = get(__implements);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(__implements,attr);
        return(attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    public String getAbbrev(){
        DmcTypeString attr = (DmcTypeString) get(__abbrev);
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
        DmcAttribute attr = get(__abbrev);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__abbrev,attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    public String getObsoleteVersion(){
        DmcTypeString attr = (DmcTypeString) get(__obsoleteVersion);
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
        DmcAttribute attr = get(__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__obsoleteVersion,attr);
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
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__isTransportable);
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
        DmcAttribute attr = get(__isTransportable);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(__isTransportable,attr);
    }

    /**
     * Indicates the classes that are known to be derived from this class.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getDerivedClasses(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__derivedClasses);
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
        DmcAttribute attr = get(__derivedClasses);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(__derivedClasses,attr);
        return(attr);
    }

    /**
     * Indicates the set of actions that are supported by a class of objects.
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    public Iterator<ActionDefinitionREF> getActions(){
        DmcTypeActionDefinitionREF attr = (DmcTypeActionDefinitionREF) get(__actions);
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
        DmcAttribute attr = get(__actions);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREF();
        
        attr.add(value);
        add(__actions,attr);
        return(attr);
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This is set automatically on ClassDefinitions as they are parsed.
     */
    public TypeDefinitionREF getInternalTypeRef(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) get(__internalTypeRef);
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
        DmcAttribute attr = get(__internalTypeRef);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREF();
        
        attr.set(value);
        set(__internalTypeRef,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is generated for this class. The
     * class will always have DmcObject at the top of its derivation hierarchy.
     */
    public String getDmoImport(){
        DmcTypeString attr = (DmcTypeString) get(__dmoImport);
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
        DmcAttribute attr = get(__dmoImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmoImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassDMO
     */
    public String getDmoClass(){
        DmcTypeString attr = (DmcTypeString) get(__dmoClass);
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
        DmcAttribute attr = get(__dmoClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmoClass,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter
     * Wrapper (DMW) class (including package) that is wrapped by this class. The
     * class will always be a derived class of DmwWrapperBase.
     */
    public String getDmwImport(){
        DmcTypeString attr = (DmcTypeString) get(__dmwImport);
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
        DmcAttribute attr = get(__dmwImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmwImport,attr);
    }

    /**
     * This attribute indicates just the DMW class name, eg MyClassDMW
     */
    public String getDmwClass(){
        DmcTypeString attr = (DmcTypeString) get(__dmwClass);
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
        DmcAttribute attr = get(__dmwClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmwClass,attr);
    }

    /**
     * This attribute indicates the full name of the class that extends a DMW
     * class. Dark Matter Extended (DME).
     */
    public String getDmeImport(){
        DmcTypeString attr = (DmcTypeString) get(__dmeImport);
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
        DmcAttribute attr = get(__dmeImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmeImport,attr);
    }

    /**
     * This attribute indicates just the Dark Matter Extended (DME) class name.
     */
    public String getDmeClass(){
        DmcTypeString attr = (DmcTypeString) get(__dmeClass);
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
        DmcAttribute attr = get(__dmeClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmeClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcType class used to
     * reference a class. These types are auto generated and named
     * DmcType<classname>REF.
     */
    public String getDmtImport(){
        DmcTypeString attr = (DmcTypeString) get(__dmtImport);
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
        DmcAttribute attr = get(__dmtImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmtImport,attr);
    }

    /**
     * This attribute indicates just the DmcType class name.
     */
    public String getDmtClass(){
        DmcTypeString attr = (DmcTypeString) get(__dmtClass);
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
        DmcAttribute attr = get(__dmtClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmtClass,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUXDMO
     */
    public String getDmoAuxClass(){
        DmcTypeString attr = (DmcTypeString) get(__dmoAuxClass);
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
        DmcAttribute attr = get(__dmoAuxClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmoAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUXDMO class
     */
    public String getDmoAuxClassImport(){
        DmcTypeString attr = (DmcTypeString) get(__dmoAuxClassImport);
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
        DmcAttribute attr = get(__dmoAuxClassImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmoAuxClassImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUX
     */
    public String getDmwAuxClass(){
        DmcTypeString attr = (DmcTypeString) get(__dmwAuxClass);
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
        DmcAttribute attr = get(__dmwAuxClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmwAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUX class
     */
    public String getDmwAuxClassImport(){
        DmcTypeString attr = (DmcTypeString) get(__dmwAuxClassImport);
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
        DmcAttribute attr = get(__dmwAuxClassImport);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__dmwAuxClassImport,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent.
     */
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnum attr = (DmcTypeDataTypeEnum) get(__dataType);
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
        DmcAttribute attr = get(__dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnum();
        
        attr.set(value);
        set(__dataType,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public String getObjectName(){
        DmcTypeString attr = (DmcTypeString) get(__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }

}
