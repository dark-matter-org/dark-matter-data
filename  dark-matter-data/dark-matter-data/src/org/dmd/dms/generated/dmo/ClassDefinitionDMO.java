//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import java.io.Serializable;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * This class provides the basic mechanism to define new classes for a schema.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1111)
 */
@SuppressWarnings("serial")
public class ClassDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
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
    public final static DmcAttributeInfo __subpackage = new DmcAttributeInfo("subpackage",88,"String",ValueTypeEnum.SINGLE,true);
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
    public final static DmcAttributeInfo __dmtREFImport = new DmcAttributeInfo("dmtREFImport",93,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmtClass = new DmcAttributeInfo("dmtClass",46,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmoAuxClass = new DmcAttributeInfo("dmoAuxClass",37,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmoAuxClassImport = new DmcAttributeInfo("dmoAuxClassImport",38,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwAuxClass = new DmcAttributeInfo("dmwAuxClass",39,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwAuxClassImport = new DmcAttributeInfo("dmwAuxClassImport",40,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dataType = new DmcAttributeInfo("dataType",11,"DataTypeEnum",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwIteratorImport = new DmcAttributeInfo("dmwIteratorImport",91,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwIteratorClass = new DmcAttributeInfo("dmwIteratorClass",92,"String",ValueTypeEnum.SINGLE,true);

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
        _ImAp.put(__subpackage.id,__subpackage);
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
        _ImAp.put(__dmtREFImport.id,__dmtREFImport);
        _ImAp.put(__dmtClass.id,__dmtClass);
        _ImAp.put(__dmoAuxClass.id,__dmoAuxClass);
        _ImAp.put(__dmoAuxClassImport.id,__dmoAuxClassImport);
        _ImAp.put(__dmwAuxClass.id,__dmwAuxClass);
        _ImAp.put(__dmwAuxClassImport.id,__dmwAuxClassImport);
        _ImAp.put(__dataType.id,__dataType);
        _ImAp.put(__dmwIteratorImport.id,__dmwIteratorImport);
        _ImAp.put(__dmwIteratorClass.id,__dmwIteratorClass);

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
        _SmAp.put(__subpackage.name,__subpackage);
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
        _SmAp.put(__dmtREFImport.name,__dmtREFImport);
        _SmAp.put(__dmtClass.name,__dmtClass);
        _SmAp.put(__dmoAuxClass.name,__dmoAuxClass);
        _SmAp.put(__dmoAuxClassImport.name,__dmoAuxClassImport);
        _SmAp.put(__dmwAuxClass.name,__dmwAuxClass);
        _SmAp.put(__dmwAuxClassImport.name,__dmwAuxClassImport);
        _SmAp.put(__dataType.name,__dataType);
        _SmAp.put(__dmwIteratorImport.name,__dmwIteratorImport);
        _SmAp.put(__dmwIteratorClass.name,__dmwIteratorClass);
    }


    public ClassDefinitionDMO(){
        super("ClassDefinition");
    }

    public ClassDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ClassDefinitionDMO getNew(){
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * This attribute indicates the type of a class definition.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public ClassTypeEnum getClassType(){
        DmcTypeClassTypeEnumSV attr = (DmcTypeClassTypeEnumSV) get(__classType);
        if (attr == null)
            return(ClassTypeEnum.UNKNOWN);

        return(attr.getSV());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setClassType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__classType);
        if (attr == null)
            attr = new DmcTypeClassTypeEnumSV(__classType);
        
        attr.set(value);
        set(__classType,attr);
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public ClassDefinitionREF getDerivedFrom(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(__derivedFrom);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets derivedFrom to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDerivedFrom(Object value) throws DmcValueException {
        DmcAttribute attr = get(__derivedFrom);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(__derivedFrom);
        
        attr.set(value);
        set(__derivedFrom,attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1532)
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(__must);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1582)
    public DmcAttribute addMust(Object value) throws DmcValueException {
        DmcAttribute attr = get(__must);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(__must);
        
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1532)
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(__may);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1582)
    public DmcAttribute addMay(Object value) throws DmcValueException {
        DmcAttribute attr = get(__may);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(__may);
        
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public AttributeDefinitionREF getIsNamedBy(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(__isNamedBy);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets isNamedBy to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setIsNamedBy(Object value) throws DmcValueException {
        DmcAttribute attr = get(__isNamedBy);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(__isNamedBy);
        
        attr.set(value);
        set(__isNamedBy,attr);
    }

    /**
     * This attribute indicates the full name of the class (including package)
     * that should be instantiated when an instance of an object is created via
     * the DmdClassDef.newInstance() function. The class must be a derived class
     * of DmdGenericObject.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getJavaClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__javaClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets javaClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setJavaClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__javaClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__javaClass);
        
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1532)
    public Iterator<ClassDefinitionREF> getIntendedToExtend(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__intendedToExtend);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another intendedToExtend value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1582)
    public DmcAttribute addIntendedToExtend(Object value) throws DmcValueException {
        DmcAttribute attr = get(__intendedToExtend);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__intendedToExtend);
        
        attr.add(value);
        add(__intendedToExtend,attr);
        return(attr);
    }

    /**
     * This is a hack for now to allow for the inclusion of an  interface on a
     * class; it should be the fully qualified name of the interface. The
     * interface shouldn't require any method implementations.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getUsesInterface(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__usesInterface);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets usesInterface to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setUsesInterface(Object value) throws DmcValueException {
        DmcAttribute attr = get(__usesInterface);
        if (attr == null)
            attr = new DmcTypeStringSV(__usesInterface);
        
        attr.set(value);
        set(__usesInterface,attr);
    }

    /**
     * Indicates whether you want to use the generated DMW wrapper or the
     * extended wrapper you've created yourself.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public WrapperTypeEnum getUseWrapperType(){
        DmcTypeWrapperTypeEnumSV attr = (DmcTypeWrapperTypeEnumSV) get(__useWrapperType);
        if (attr == null)
            return(WrapperTypeEnum.BASE);

        return(attr.getSV());
    }

    /**
     * Sets useWrapperType to the specified value.
     * @param value A value compatible with DmcTypeWrapperTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setUseWrapperType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__useWrapperType);
        if (attr == null)
            attr = new DmcTypeWrapperTypeEnumSV(__useWrapperType);
        
        attr.set(value);
        set(__useWrapperType,attr);
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1532)
    public Iterator<ClassDefinitionREF> getAllowedParents(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__allowedParents);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another allowedParents value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1582)
    public DmcAttribute addAllowedParents(Object value) throws DmcValueException {
        DmcAttribute attr = get(__allowedParents);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__allowedParents);
        
        attr.add(value);
        add(__allowedParents,attr);
        return(attr);
    }

    /**
     * Indicates the classes of object that may be children of the current class
     * when objects are created in an instance hierarchy.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1532)
    public Iterator<ClassDefinitionREF> getAllowedChildren(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__allowedChildren);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another allowedChildren value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1582)
    public DmcAttribute addAllowedChildren(Object value) throws DmcValueException {
        DmcAttribute attr = get(__allowedChildren);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__allowedChildren);
        
        attr.add(value);
        add(__allowedChildren,attr);
        return(attr);
    }

    /**
     * The subpackage beneath extended where generated code will be written. This
     * allows for a hierarchic package structure for the classes generated by the
     * dmg and mvc generator utilities. The structure can contain other
     * subpackages etc x.y.z but should not start or end with a period.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getSubpackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__subpackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setSubpackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__subpackage);
        
        attr.set(value);
        set(__subpackage,attr);
    }

    /**
     * Indicates the interface class which this class implements.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1532)
    public Iterator<ClassDefinitionREF> getImplements(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__implements);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another implements value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1582)
    public DmcAttribute addImplements(Object value) throws DmcValueException {
        DmcAttribute attr = get(__implements);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__implements);
        
        attr.add(value);
        add(__implements,attr);
        return(attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getAbbrev(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setAbbrev(Object value) throws DmcValueException {
        DmcAttribute attr = get(__abbrev);
        if (attr == null)
            attr = new DmcTypeStringSV(__abbrev);
        
        attr.set(value);
        set(__abbrev,attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getObsoleteVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(__obsoleteVersion);
        
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public Boolean getIsTransportable(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__isTransportable);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isTransportable to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setIsTransportable(Object value) throws DmcValueException {
        DmcAttribute attr = get(__isTransportable);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isTransportable);
        
        attr.set(value);
        set(__isTransportable,attr);
    }

    /**
     * Indicates the classes that are known to be derived from this class.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1532)
    public Iterator<ClassDefinitionREF> getDerivedClasses(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__derivedClasses);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another derivedClasses value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1582)
    public DmcAttribute addDerivedClasses(Object value) throws DmcValueException {
        DmcAttribute attr = get(__derivedClasses);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__derivedClasses);
        
        attr.add(value);
        add(__derivedClasses,attr);
        return(attr);
    }

    /**
     * Indicates the set of actions that are supported by a class of objects.
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1532)
    public Iterator<ActionDefinitionREF> getActions(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) get(__actions);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actions value.
     * @param value A value compatible with DmcTypeActionDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1582)
    public DmcAttribute addActions(Object value) throws DmcValueException {
        DmcAttribute attr = get(__actions);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREFMV(__actions);
        
        attr.add(value);
        add(__actions,attr);
        return(attr);
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This is set automatically on ClassDefinitions as they are parsed.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public TypeDefinitionREF getInternalTypeRef(){
        DmcTypeTypeDefinitionREFSV attr = (DmcTypeTypeDefinitionREFSV) get(__internalTypeRef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets internalTypeRef to the specified value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setInternalTypeRef(Object value) throws DmcValueException {
        DmcAttribute attr = get(__internalTypeRef);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFSV(__internalTypeRef);
        
        attr.set(value);
        set(__internalTypeRef,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is generated for this class. The
     * class will always have DmcObject at the top of its derivation hierarchy.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmoImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmoImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmoImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmoImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmoImport);
        
        attr.set(value);
        set(__dmoImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassDMO
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmoClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmoClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmoClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmoClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmoClass);
        
        attr.set(value);
        set(__dmoClass,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter
     * Wrapper (DMW) class (including package) that is wrapped by this class. The
     * class will always be a derived class of DmwWrapperBase.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmwImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmwImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwImport);
        
        attr.set(value);
        set(__dmwImport,attr);
    }

    /**
     * This attribute indicates just the DMW class name, eg MyClassDMW
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmwClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmwClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwClass);
        
        attr.set(value);
        set(__dmwClass,attr);
    }

    /**
     * This attribute indicates the full name of the class that extends a DMW
     * class. Dark Matter Extended (DME).
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmeImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmeImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmeImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmeImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmeImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmeImport);
        
        attr.set(value);
        set(__dmeImport,attr);
    }

    /**
     * This attribute indicates just the Dark Matter Extended (DME) class name.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmeClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmeClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmeClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmeClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmeClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmeClass);
        
        attr.set(value);
        set(__dmeClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcType class used to
     * reference a class. These types are auto generated and named
     * DmcType<classname>REF.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmtImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmtImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmtImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmtImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmtImport);
        
        attr.set(value);
        set(__dmtImport,attr);
    }

    /**
     * This attribute indicates the full name of the class used to reference a
     * class. These types are auto generated and named <classname>REF.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmtREFImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmtREFImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtREFImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmtREFImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmtREFImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmtREFImport);
        
        attr.set(value);
        set(__dmtREFImport,attr);
    }

    /**
     * This attribute indicates just the DmcType class name.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmtClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmtClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmtClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmtClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmtClass);
        
        attr.set(value);
        set(__dmtClass,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUXDMO
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmoAuxClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmoAuxClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmoAuxClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmoAuxClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmoAuxClass);
        
        attr.set(value);
        set(__dmoAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUXDMO class
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmoAuxClassImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmoAuxClassImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmoAuxClassImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmoAuxClassImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmoAuxClassImport);
        
        attr.set(value);
        set(__dmoAuxClassImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUX
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmwAuxClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwAuxClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmwAuxClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwAuxClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwAuxClass);
        
        attr.set(value);
        set(__dmwAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUX class
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmwAuxClassImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwAuxClassImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmwAuxClassImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwAuxClassImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwAuxClassImport);
        
        attr.set(value);
        set(__dmwAuxClassImport,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnumSV attr = (DmcTypeDataTypeEnumSV) get(__dataType);
        if (attr == null)
            return(DataTypeEnum.PERSISTENT);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDataType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnumSV(__dataType);
        
        attr.set(value);
        set(__dataType,attr);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator 
     * derived class that allows us to iterate over a set of object references
     * and get back the DMW wrapper object instead of the DMO.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmwIteratorImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwIteratorImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwIteratorImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwIteratorImport);
        
        attr.set(value);
        set(__dmwIteratorImport,attr);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a class of
     * object.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getDmwIteratorClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwIteratorClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwIteratorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwIteratorClass);
        
        attr.set(value);
        set(__dmwIteratorClass,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
