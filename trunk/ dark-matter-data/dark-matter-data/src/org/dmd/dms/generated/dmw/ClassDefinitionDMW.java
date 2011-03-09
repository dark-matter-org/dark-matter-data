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
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:789)
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

    protected ClassDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
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
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
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
     * Indicates the abstract or structural class from which this class is
     * derived.
     */
    public ClassDefinition getDerivedFrom(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO.__derivedFrom);
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
     * Indicates the set of attributes that an instance of a class MUST have.
     * When accessed in Java, this is a set of references to AttributeDefinition
     * objects.
     * @return An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<AttributeDefinition> getMust(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREF) mycore.get(ClassDefinitionDMO.__must);
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
     * @return An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<AttributeDefinition> getMay(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREF) mycore.get(ClassDefinitionDMO.__may);
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
     * Indicates the attribute by which an object of some class is named. When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method will return the value of the isNamedBy attribute.
     */
    public AttributeDefinition getIsNamedBy(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) mycore.get(ClassDefinitionDMO.__isNamedBy);
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
     * This attribute can be used on AUXILIARY classes to give a hint about their
     * intended usage. For example, if you were extending schema definitions with
     * some or your  own attributes for some purpose, your auxliary class could
     * have intendedToExtend ClassDefinition.
     * @return An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getIntendedToExtend(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO.__intendedToExtend);
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

    /**
     * This is a hack for now to allow for the inclusion of an  interface on a
     * class; it should be the fully qualified name of the interface. The
     * interface shouldn't require any method implementations.
     */
    public String getUsesInterface(){
        return(mycore.getUsesInterface());
    }

    /**
     * Sets usesInterface to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setUsesInterface(Object value) throws DmcValueException {
        mycore.setUsesInterface(value);
    }

    /**
     * Indicates whether you want to use the generated DMW wrapper or the
     * extended wrapper you've created yourself.
     */
    public WrapperTypeEnum getUseWrapperType(){
        return(mycore.getUseWrapperType());
    }

    /**
     * Sets useWrapperType to the specified value.
     * @param value A value compatible with DmcTypeWrapperTypeEnum
     */
    public void setUseWrapperType(Object value) throws DmcValueException {
        mycore.setUseWrapperType(value);
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy.
     * @return An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getAllowedParents(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO.__allowedParents);
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
     * @return An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getAllowedChildren(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO.__allowedChildren);
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
     * Indicates the interface class which this class implements.
     * @return An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getImplements(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO.__implements);
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
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
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
     * Indicates the classes that are known to be derived from this class.
     * @return An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getDerivedClasses(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(ClassDefinitionDMO.__derivedClasses);
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
     * Indicates the set of actions that are supported by a class of objects.
     * @return An Iterator of ActionDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ActionDefinition> getActions(){
        DmcAttribute attr = (DmcTypeActionDefinitionREF) mycore.get(ClassDefinitionDMO.__actions);
        if (attr == null)
            return(null);

        ArrayList<ActionDefinition> refs = (ArrayList<ActionDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another actions value.
     * @param value A value compatible with ActionDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addActions(ActionDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addActions(value.getDmcObject());
        ArrayList<ActionDefinition> refs = (ArrayList<ActionDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ActionDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This is set automatically on ClassDefinitions as they are parsed.
     */
    public TypeDefinition getInternalTypeRef(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) mycore.get(ClassDefinitionDMO.__internalTypeRef);
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
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is generated for this class. The
     * class will always have DmcObject at the top of its derivation hierarchy.
     */
    public String getDmoImport(){
        return(mycore.getDmoImport());
    }

    /**
     * Sets dmoImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmoImport(Object value) throws DmcValueException {
        mycore.setDmoImport(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassDMO
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
     * This attribute indicates the full name of the generated Dark Matter
     * Wrapper (DMW) class (including package) that is wrapped by this class. The
     * class will always be a derived class of DmwWrapperBase.
     */
    public String getDmwImport(){
        return(mycore.getDmwImport());
    }

    /**
     * Sets dmwImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmwImport(Object value) throws DmcValueException {
        mycore.setDmwImport(value);
    }

    /**
     * This attribute indicates just the DMW class name, eg MyClassDMW
     */
    public String getDmwClass(){
        return(mycore.getDmwClass());
    }

    /**
     * Sets dmwClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmwClass(Object value) throws DmcValueException {
        mycore.setDmwClass(value);
    }

    /**
     * This attribute indicates the full name of the class that extends a DMW
     * class. Dark Matter Extended (DME).
     */
    public String getDmeImport(){
        return(mycore.getDmeImport());
    }

    /**
     * Sets dmeImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmeImport(Object value) throws DmcValueException {
        mycore.setDmeImport(value);
    }

    /**
     * This attribute indicates just the Dark Matter Extended (DME) class name.
     */
    public String getDmeClass(){
        return(mycore.getDmeClass());
    }

    /**
     * Sets dmeClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmeClass(Object value) throws DmcValueException {
        mycore.setDmeClass(value);
    }

    /**
     * This attribute indicates the full name of the DmcType class used to
     * reference a class. These types are auto generated and named
     * DmcType<classname>REF.
     */
    public String getDmtImport(){
        return(mycore.getDmtImport());
    }

    /**
     * Sets dmtImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmtImport(Object value) throws DmcValueException {
        mycore.setDmtImport(value);
    }

    /**
     * This attribute indicates just the DmcType class name.
     */
    public String getDmtClass(){
        return(mycore.getDmtClass());
    }

    /**
     * Sets dmtClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmtClass(Object value) throws DmcValueException {
        mycore.setDmtClass(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUXDMO
     */
    public String getDmoAuxClass(){
        return(mycore.getDmoAuxClass());
    }

    /**
     * Sets dmoAuxClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmoAuxClass(Object value) throws DmcValueException {
        mycore.setDmoAuxClass(value);
    }

    /**
     * This attribute indicates the full name of the MyClassAUXDMO class
     */
    public String getDmoAuxClassImport(){
        return(mycore.getDmoAuxClassImport());
    }

    /**
     * Sets dmoAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmoAuxClassImport(Object value) throws DmcValueException {
        mycore.setDmoAuxClassImport(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUX
     */
    public String getDmwAuxClass(){
        return(mycore.getDmwAuxClass());
    }

    /**
     * Sets dmwAuxClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmwAuxClass(Object value) throws DmcValueException {
        mycore.setDmwAuxClass(value);
    }

    /**
     * This attribute indicates the full name of the MyClassAUX class
     */
    public String getDmwAuxClassImport(){
        return(mycore.getDmwAuxClassImport());
    }

    /**
     * Sets dmwAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmwAuxClassImport(Object value) throws DmcValueException {
        mycore.setDmwAuxClassImport(value);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent.
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


}
