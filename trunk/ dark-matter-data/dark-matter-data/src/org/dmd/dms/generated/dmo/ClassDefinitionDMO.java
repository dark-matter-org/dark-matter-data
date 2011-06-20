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
import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * This class provides the basic mechanism to define new classes for a schema.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1204)
 */
@SuppressWarnings("serial")
public class ClassDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__classType.id,MetaDMSAG.__classType);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__abbrev.id,MetaDMSAG.__abbrev);
        _ImAp.put(MetaDMSAG.__actions.id,MetaDMSAG.__actions);
        _ImAp.put(MetaDMSAG.__allowedParents.id,MetaDMSAG.__allowedParents);
        _ImAp.put(MetaDMSAG.__dataType.id,MetaDMSAG.__dataType);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__derivedClasses.id,MetaDMSAG.__derivedClasses);
        _ImAp.put(MetaDMSAG.__derivedFrom.id,MetaDMSAG.__derivedFrom);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dmdID.id,MetaDMSAG.__dmdID);
        _ImAp.put(MetaDMSAG.__dmeClass.id,MetaDMSAG.__dmeClass);
        _ImAp.put(MetaDMSAG.__dmeImport.id,MetaDMSAG.__dmeImport);
        _ImAp.put(MetaDMSAG.__dmoAuxClass.id,MetaDMSAG.__dmoAuxClass);
        _ImAp.put(MetaDMSAG.__dmoAuxClassImport.id,MetaDMSAG.__dmoAuxClassImport);
        _ImAp.put(MetaDMSAG.__dmoClass.id,MetaDMSAG.__dmoClass);
        _ImAp.put(MetaDMSAG.__dmoImport.id,MetaDMSAG.__dmoImport);
        _ImAp.put(MetaDMSAG.__dmtClass.id,MetaDMSAG.__dmtClass);
        _ImAp.put(MetaDMSAG.__dmtImport.id,MetaDMSAG.__dmtImport);
        _ImAp.put(MetaDMSAG.__dmtREFImport.id,MetaDMSAG.__dmtREFImport);
        _ImAp.put(MetaDMSAG.__dmwAuxClass.id,MetaDMSAG.__dmwAuxClass);
        _ImAp.put(MetaDMSAG.__dmwAuxClassImport.id,MetaDMSAG.__dmwAuxClassImport);
        _ImAp.put(MetaDMSAG.__dmwClass.id,MetaDMSAG.__dmwClass);
        _ImAp.put(MetaDMSAG.__dmwImport.id,MetaDMSAG.__dmwImport);
        _ImAp.put(MetaDMSAG.__dmwIteratorClass.id,MetaDMSAG.__dmwIteratorClass);
        _ImAp.put(MetaDMSAG.__dmwIteratorImport.id,MetaDMSAG.__dmwIteratorImport);
        _ImAp.put(MetaDMSAG.__dmwWrapperType.id,MetaDMSAG.__dmwWrapperType);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__intendedToExtend.id,MetaDMSAG.__intendedToExtend);
        _ImAp.put(MetaDMSAG.__internalTypeRef.id,MetaDMSAG.__internalTypeRef);
        _ImAp.put(MetaDMSAG.__isNamedBy.id,MetaDMSAG.__isNamedBy);
        _ImAp.put(MetaDMSAG.__isTransportable.id,MetaDMSAG.__isTransportable);
        _ImAp.put(MetaDMSAG.__javaClass.id,MetaDMSAG.__javaClass);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__may.id,MetaDMSAG.__may);
        _ImAp.put(MetaDMSAG.__must.id,MetaDMSAG.__must);
        _ImAp.put(MetaDMSAG.__obsoleteVersion.id,MetaDMSAG.__obsoleteVersion);
        _ImAp.put(MetaDMSAG.__subpackage.id,MetaDMSAG.__subpackage);
        _ImAp.put(MetaDMSAG.__supportsBackrefTracking.id,MetaDMSAG.__supportsBackrefTracking);
        _ImAp.put(MetaDMSAG.__useWrapperType.id,MetaDMSAG.__useWrapperType);
        _ImAp.put(MetaDMSAG.__usesInterface.id,MetaDMSAG.__usesInterface);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__classType.name,MetaDMSAG.__classType);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__abbrev.name,MetaDMSAG.__abbrev);
        _SmAp.put(MetaDMSAG.__actions.name,MetaDMSAG.__actions);
        _SmAp.put(MetaDMSAG.__allowedParents.name,MetaDMSAG.__allowedParents);
        _SmAp.put(MetaDMSAG.__dataType.name,MetaDMSAG.__dataType);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__derivedClasses.name,MetaDMSAG.__derivedClasses);
        _SmAp.put(MetaDMSAG.__derivedFrom.name,MetaDMSAG.__derivedFrom);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dmdID.name,MetaDMSAG.__dmdID);
        _SmAp.put(MetaDMSAG.__dmeClass.name,MetaDMSAG.__dmeClass);
        _SmAp.put(MetaDMSAG.__dmeImport.name,MetaDMSAG.__dmeImport);
        _SmAp.put(MetaDMSAG.__dmoAuxClass.name,MetaDMSAG.__dmoAuxClass);
        _SmAp.put(MetaDMSAG.__dmoAuxClassImport.name,MetaDMSAG.__dmoAuxClassImport);
        _SmAp.put(MetaDMSAG.__dmoClass.name,MetaDMSAG.__dmoClass);
        _SmAp.put(MetaDMSAG.__dmoImport.name,MetaDMSAG.__dmoImport);
        _SmAp.put(MetaDMSAG.__dmtClass.name,MetaDMSAG.__dmtClass);
        _SmAp.put(MetaDMSAG.__dmtImport.name,MetaDMSAG.__dmtImport);
        _SmAp.put(MetaDMSAG.__dmtREFImport.name,MetaDMSAG.__dmtREFImport);
        _SmAp.put(MetaDMSAG.__dmwAuxClass.name,MetaDMSAG.__dmwAuxClass);
        _SmAp.put(MetaDMSAG.__dmwAuxClassImport.name,MetaDMSAG.__dmwAuxClassImport);
        _SmAp.put(MetaDMSAG.__dmwClass.name,MetaDMSAG.__dmwClass);
        _SmAp.put(MetaDMSAG.__dmwImport.name,MetaDMSAG.__dmwImport);
        _SmAp.put(MetaDMSAG.__dmwIteratorClass.name,MetaDMSAG.__dmwIteratorClass);
        _SmAp.put(MetaDMSAG.__dmwIteratorImport.name,MetaDMSAG.__dmwIteratorImport);
        _SmAp.put(MetaDMSAG.__dmwWrapperType.name,MetaDMSAG.__dmwWrapperType);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__intendedToExtend.name,MetaDMSAG.__intendedToExtend);
        _SmAp.put(MetaDMSAG.__internalTypeRef.name,MetaDMSAG.__internalTypeRef);
        _SmAp.put(MetaDMSAG.__isNamedBy.name,MetaDMSAG.__isNamedBy);
        _SmAp.put(MetaDMSAG.__isTransportable.name,MetaDMSAG.__isTransportable);
        _SmAp.put(MetaDMSAG.__javaClass.name,MetaDMSAG.__javaClass);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__may.name,MetaDMSAG.__may);
        _SmAp.put(MetaDMSAG.__must.name,MetaDMSAG.__must);
        _SmAp.put(MetaDMSAG.__obsoleteVersion.name,MetaDMSAG.__obsoleteVersion);
        _SmAp.put(MetaDMSAG.__subpackage.name,MetaDMSAG.__subpackage);
        _SmAp.put(MetaDMSAG.__supportsBackrefTracking.name,MetaDMSAG.__supportsBackrefTracking);
        _SmAp.put(MetaDMSAG.__useWrapperType.name,MetaDMSAG.__useWrapperType);
        _SmAp.put(MetaDMSAG.__usesInterface.name,MetaDMSAG.__usesInterface);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
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

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public ClassDefinitionDMO getNew(){
        ClassDefinitionDMO rc = new ClassDefinitionDMO();
        return(rc);
    }

    @Override
    public ClassDefinitionDMO getSlice(DmcSliceInfo info){
        ClassDefinitionDMO rc = new ClassDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * This attribute indicates the type of a class definition.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public ClassTypeEnum getClassType(){
        DmcTypeClassTypeEnumSV attr = (DmcTypeClassTypeEnumSV) get(MetaDMSAG.__classType);
        if (attr == null)
            return(ClassTypeEnum.UNKNOWN);

        return(attr.getSV());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setClassType(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__classType);
        if (attr == null)
            attr = new DmcTypeClassTypeEnumSV(MetaDMSAG.__classType);
        
        attr.set(value);
        set(MetaDMSAG.__classType,attr);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getAbbrev(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setAbbrev(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__abbrev);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__abbrev);
        
        attr.set(value);
        set(MetaDMSAG.__abbrev,attr);
    }

    /**
     * Indicates the set of actions that are supported by a class of objects.
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1712)
    public Iterator<ActionDefinitionREF> getActions(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) get(MetaDMSAG.__actions);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actions value.
     * @param value A value compatible with DmcTypeActionDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1762)
    public DmcAttribute addActions(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__actions);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREFMV(MetaDMSAG.__actions);
        
        attr.add(value);
        add(MetaDMSAG.__actions,attr);
        return(attr);
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1712)
    public Iterator<ClassDefinitionREF> getAllowedParents(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaDMSAG.__allowedParents);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another allowedParents value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1762)
    public DmcAttribute addAllowedParents(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__allowedParents);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaDMSAG.__allowedParents);
        
        attr.add(value);
        add(MetaDMSAG.__allowedParents,attr);
        return(attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnumSV attr = (DmcTypeDataTypeEnumSV) get(MetaDMSAG.__dataType);
        if (attr == null)
            return(DataTypeEnum.PERSISTENT);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDataType(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnumSV(MetaDMSAG.__dataType);
        
        attr.set(value);
        set(MetaDMSAG.__dataType,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * Indicates the classes that are known to be derived from this class.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1712)
    public Iterator<ClassDefinitionREF> getDerivedClasses(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaDMSAG.__derivedClasses);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another derivedClasses value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1762)
    public DmcAttribute addDerivedClasses(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__derivedClasses);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaDMSAG.__derivedClasses);
        
        attr.add(value);
        add(MetaDMSAG.__derivedClasses,attr);
        return(attr);
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public ClassDefinitionREF getDerivedFrom(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MetaDMSAG.__derivedFrom);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets derivedFrom to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDerivedFrom(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__derivedFrom);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MetaDMSAG.__derivedFrom);
        
        attr.set(value);
        set(MetaDMSAG.__derivedFrom,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes. This is used as part of the serialization mechanisms built
     * into Dark Matter Objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public Integer getDmdID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmdID(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmdID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__dmdID);
        
        attr.set(value);
        set(MetaDMSAG.__dmdID,attr);
    }

    /**
     * This attribute indicates just the Dark Matter Extended (DME) class name.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmeClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmeClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmeClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmeClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmeClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmeClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmeClass,attr);
    }

    /**
     * This attribute indicates the full name of the class that extends a DMW
     * class. Dark Matter Extended (DME).
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmeImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmeImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmeImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmeImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmeImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmeImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmeImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUXDMO
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmoAuxClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoAuxClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmoAuxClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmoAuxClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoAuxClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmoAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUXDMO class
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmoAuxClassImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoAuxClassImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmoAuxClassImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmoAuxClassImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoAuxClassImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmoAuxClassImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassDMO
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmoClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmoClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmoClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmoClass,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is generated for this class. The
     * class will always have DmcObject at the top of its derivation hierarchy.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmoImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmoImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmoImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmoImport,attr);
    }

    /**
     * This attribute indicates just the DmcType class name.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmtClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmtClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmtClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmtClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmtClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmtClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcType class used to
     * reference a class. These types are auto generated and named
     * DmcType<classname>REF.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmtImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmtImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmtImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmtImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmtImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmtImport,attr);
    }

    /**
     * This attribute indicates the full name of the class used to reference a
     * class. These types are auto generated and named <classname>REF.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmtREFImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmtREFImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtREFImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmtREFImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmtREFImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmtREFImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmtREFImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUX
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmwAuxClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwAuxClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmwAuxClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmwAuxClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwAuxClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmwAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUX class
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmwAuxClassImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwAuxClassImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmwAuxClassImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmwAuxClassImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwAuxClassImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmwAuxClassImport,attr);
    }

    /**
     * This attribute indicates just the DMW class name, eg MyClassDMW
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmwClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmwClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmwClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmwClass,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter
     * Wrapper (DMW) class (including package) that is wrapped by this class. The
     * class will always be a derived class of DmwWrapperBase.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmwImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmwImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmwImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmwImport,attr);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a class of
     * object.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmwIteratorClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwIteratorClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmwIteratorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwIteratorClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmwIteratorClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator 
     * derived class that allows us to iterate over a set of object references
     * and get back the DMW wrapper object instead of the DMO.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getDmwIteratorImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwIteratorImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmwIteratorImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwIteratorImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmwIteratorImport,attr);
    }

    /**
     * The dmwWrapperType is used to indicate whether or not you want extended
     * wrappers when the wrappers are generated for an object in a particular
     * generation context.
     * @return An Iterator of DmwTypeToWrapperType objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1718)
    public Iterator<DmwTypeToWrapperType> getDmwWrapperType(){
        DmcTypeDmwTypeToWrapperTypeMV attr = (DmcTypeDmwTypeToWrapperTypeMV) get(MetaDMSAG.__dmwWrapperType);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dmwWrapperType value.
     * @param value A value compatible with DmcTypeDmwTypeToWrapperTypeMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1762)
    public DmcAttribute addDmwWrapperType(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__dmwWrapperType);
        if (attr == null)
            attr = new DmcTypeDmwTypeToWrapperTypeMV(MetaDMSAG.__dmwWrapperType);
        
        attr.add(value);
        add(MetaDMSAG.__dmwWrapperType,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * This attribute can be used on AUXILIARY classes to give a hint about their
     * intended usage. For example, if you were extending schema definitions with
     * some or your  own attributes for some purpose, your auxliary class could
     * have intendedToExtend ClassDefinition.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1712)
    public Iterator<ClassDefinitionREF> getIntendedToExtend(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaDMSAG.__intendedToExtend);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another intendedToExtend value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1762)
    public DmcAttribute addIntendedToExtend(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__intendedToExtend);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaDMSAG.__intendedToExtend);
        
        attr.add(value);
        add(MetaDMSAG.__intendedToExtend,attr);
        return(attr);
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This is set automatically on ClassDefinitions as they are parsed.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public TypeDefinitionREF getInternalTypeRef(){
        DmcTypeTypeDefinitionREFSV attr = (DmcTypeTypeDefinitionREFSV) get(MetaDMSAG.__internalTypeRef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets internalTypeRef to the specified value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setInternalTypeRef(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__internalTypeRef);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFSV(MetaDMSAG.__internalTypeRef);
        
        attr.set(value);
        set(MetaDMSAG.__internalTypeRef,attr);
    }

    /**
     * Indicates the attribute by which an object of some class is named. When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method will return the value of the isNamedBy attribute.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public AttributeDefinitionREF getIsNamedBy(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__isNamedBy);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets isNamedBy to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setIsNamedBy(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__isNamedBy);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__isNamedBy);
        
        attr.set(value);
        set(MetaDMSAG.__isNamedBy,attr);
    }

    /**
     * This attribute indicates whether or not the object defined by a
     * ClassDefinition is meant to be transportable across an RPC interface when
     * object reference attributes refer to it. If set to true, the class will
     * automatically have its reference type use the
     * DmcNameObjectTransportableREF as its base. Otherwise, it will use
     * DmcNameObjectNotransportableREF.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public Boolean getIsTransportable(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isTransportable);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isTransportable to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setIsTransportable(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__isTransportable);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isTransportable);
        
        attr.set(value);
        set(MetaDMSAG.__isTransportable,attr);
    }

    /**
     * This attribute indicates the full name of the class (including package)
     * that should be instantiated when an instance of an object is created via
     * the DmdClassDef.newInstance() function. The class must be a derived class
     * of DmdGenericObject.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getJavaClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__javaClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets javaClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setJavaClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__javaClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__javaClass);
        
        attr.set(value);
        set(MetaDMSAG.__javaClass,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1712)
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__may);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1762)
    public DmcAttribute addMay(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__may);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__may);
        
        attr.add(value);
        add(MetaDMSAG.__may,attr);
        return(attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1712)
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__must);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1762)
    public DmcAttribute addMust(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__must);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__must);
        
        attr.add(value);
        add(MetaDMSAG.__must,attr);
        return(attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getObsoleteVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__obsoleteVersion);
        
        attr.set(value);
        set(MetaDMSAG.__obsoleteVersion,attr);
    }

    /**
     * The subpackage beneath extended where generated code will be written. This
     * allows for a hierarchic package structure for the classes generated by the
     * dmg and mvc generator utilities. The structure can contain other
     * subpackages etc x.y.z but should not start or end with a period.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getSubpackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__subpackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setSubpackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__subpackage);
        
        attr.set(value);
        set(MetaDMSAG.__subpackage,attr);
    }

    /**
     * Indicates if a class of objects supports back reference tracking or not.
     * The default is that all objects support it, however, in places like the
     * Dark Matter Protocol, we don't want to track references in the messages.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public Boolean getSupportsBackrefTracking(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__supportsBackrefTracking);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets supportsBackrefTracking to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setSupportsBackrefTracking(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__supportsBackrefTracking);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__supportsBackrefTracking);
        
        attr.set(value);
        set(MetaDMSAG.__supportsBackrefTracking,attr);
    }

    /**
     * Indicates whether you want to use the generated DMW wrapper or the
     * extended wrapper you've created yourself.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public WrapperTypeEnum getUseWrapperType(){
        DmcTypeWrapperTypeEnumSV attr = (DmcTypeWrapperTypeEnumSV) get(MetaDMSAG.__useWrapperType);
        if (attr == null)
            return(WrapperTypeEnum.BASE);

        return(attr.getSV());
    }

    /**
     * Sets useWrapperType to the specified value.
     * @param value A value compatible with DmcTypeWrapperTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setUseWrapperType(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__useWrapperType);
        if (attr == null)
            attr = new DmcTypeWrapperTypeEnumSV(MetaDMSAG.__useWrapperType);
        
        attr.set(value);
        set(MetaDMSAG.__useWrapperType,attr);
    }

    /**
     * This is a hack for now to allow for the inclusion of an  interface on a
     * class; it should be the fully qualified name of the interface. The
     * interface shouldn't require any method implementations.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1575)
    public String getUsesInterface(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__usesInterface);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets usesInterface to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1626)
    @SuppressWarnings("unchecked")
    public void setUsesInterface(Object value) throws DmcValueException {
        DmcAttribute attr = get(MetaDMSAG.__usesInterface);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__usesInterface);
        
        attr.set(value);
        set(MetaDMSAG.__usesInterface,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
