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
package org.dmd.dms.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1947)
import java.io.Serializable;                            // Serializable marker interface - (MetaGenerator.java:1896)
import java.util.*;                                     // Attribute info support - (MetaGenerator.java:1898)
import org.dmd.dmc.*;                                   // Dark matter core - (MetaGenerator.java:1920)
import org.dmd.dmc.definitions.DmcDefinitionIF;         // This is a domain specific definition - (MetaGenerator.java:1933)
import org.dmd.dmc.types.*;                             // Basic type access - (MetaGenerator.java:1910)
import org.dmd.dms.generated.enums.*;                   // Has enum attributes - (MetaGenerator.java:1942)
import org.dmd.dms.generated.types.*;                   // Generated type access - (MetaGenerator.java:1936)



/**
 * This class provides the basic mechanism to define new classes for a
 * schema. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1957)
 */
@SuppressWarnings("serial")
public class ClassDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable, DmcDefinitionIF {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__classType.id,MetaDMSAG.__classType);
        _ImAp.put(MetaDMSAG.__dmdID.id,MetaDMSAG.__dmdID);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__abbrev.id,MetaDMSAG.__abbrev);
        _ImAp.put(MetaDMSAG.__actions.id,MetaDMSAG.__actions);
        _ImAp.put(MetaDMSAG.__allowedParents.id,MetaDMSAG.__allowedParents);
        _ImAp.put(MetaDMSAG.__comment.id,MetaDMSAG.__comment);
        _ImAp.put(MetaDMSAG.__createIndex.id,MetaDMSAG.__createIndex);
        _ImAp.put(MetaDMSAG.__dataType.id,MetaDMSAG.__dataType);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__derivedClasses.id,MetaDMSAG.__derivedClasses);
        _ImAp.put(MetaDMSAG.__derivedFrom.id,MetaDMSAG.__derivedFrom);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dmeClass.id,MetaDMSAG.__dmeClass);
        _ImAp.put(MetaDMSAG.__dmeImport.id,MetaDMSAG.__dmeImport);
        _ImAp.put(MetaDMSAG.__dmoAuxClass.id,MetaDMSAG.__dmoAuxClass);
        _ImAp.put(MetaDMSAG.__dmoAuxClassImport.id,MetaDMSAG.__dmoAuxClassImport);
        _ImAp.put(MetaDMSAG.__dmoClass.id,MetaDMSAG.__dmoClass);
        _ImAp.put(MetaDMSAG.__dmoFromModule.id,MetaDMSAG.__dmoFromModule);
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
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__dsdModuleDefinition.id,MetaDMSAG.__dsdModuleDefinition);
        _ImAp.put(MetaDMSAG.__example.id,MetaDMSAG.__example);
        _ImAp.put(MetaDMSAG.__excludeFromContext.id,MetaDMSAG.__excludeFromContext);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__hint.id,MetaDMSAG.__hint);
        _ImAp.put(MetaDMSAG.__intendedToExtend.id,MetaDMSAG.__intendedToExtend);
        _ImAp.put(MetaDMSAG.__internalTypeRef.id,MetaDMSAG.__internalTypeRef);
        _ImAp.put(MetaDMSAG.__internallyGenerated.id,MetaDMSAG.__internallyGenerated);
        _ImAp.put(MetaDMSAG.__isDSDefinition.id,MetaDMSAG.__isDSDefinition);
        _ImAp.put(MetaDMSAG.__isNamedBy.id,MetaDMSAG.__isNamedBy);
        _ImAp.put(MetaDMSAG.__javaClass.id,MetaDMSAG.__javaClass);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__may.id,MetaDMSAG.__may);
        _ImAp.put(MetaDMSAG.__must.id,MetaDMSAG.__must);
        _ImAp.put(MetaDMSAG.__nvp.id,MetaDMSAG.__nvp);
        _ImAp.put(MetaDMSAG.__obsolete.id,MetaDMSAG.__obsolete);
        _ImAp.put(MetaDMSAG.__obsoleteVersion.id,MetaDMSAG.__obsoleteVersion);
        _ImAp.put(MetaDMSAG.__optimize.id,MetaDMSAG.__optimize);
        _ImAp.put(MetaDMSAG.__partOfDefinitionModule.id,MetaDMSAG.__partOfDefinitionModule);
        _ImAp.put(MetaDMSAG.__question.id,MetaDMSAG.__question);
        _ImAp.put(MetaDMSAG.__relatedToConcept.id,MetaDMSAG.__relatedToConcept);
        _ImAp.put(MetaDMSAG.__relationship.id,MetaDMSAG.__relationship);
        _ImAp.put(MetaDMSAG.__ruleDefinition.id,MetaDMSAG.__ruleDefinition);
        _ImAp.put(MetaDMSAG.__searchable.id,MetaDMSAG.__searchable);
        _ImAp.put(MetaDMSAG.__skip.id,MetaDMSAG.__skip);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__subpackage.id,MetaDMSAG.__subpackage);
        _ImAp.put(MetaDMSAG.__supportsBackrefTracking.id,MetaDMSAG.__supportsBackrefTracking);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);
        _ImAp.put(MetaDMSAG.__useWrapperType.id,MetaDMSAG.__useWrapperType);
        _ImAp.put(MetaDMSAG.__usesInterface.id,MetaDMSAG.__usesInterface);
        _ImAp.put(MetaDMSAG.__usesWrapperInterface.id,MetaDMSAG.__usesWrapperInterface);
        _ImAp.put(MetaDMSAG.__version.id,MetaDMSAG.__version);
        _ImAp.put(MetaDMSAG.__why.id,MetaDMSAG.__why);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__classType.name,MetaDMSAG.__classType);
        _SmAp.put(MetaDMSAG.__dmdID.name,MetaDMSAG.__dmdID);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__abbrev.name,MetaDMSAG.__abbrev);
        _SmAp.put(MetaDMSAG.__actions.name,MetaDMSAG.__actions);
        _SmAp.put(MetaDMSAG.__allowedParents.name,MetaDMSAG.__allowedParents);
        _SmAp.put(MetaDMSAG.__comment.name,MetaDMSAG.__comment);
        _SmAp.put(MetaDMSAG.__createIndex.name,MetaDMSAG.__createIndex);
        _SmAp.put(MetaDMSAG.__dataType.name,MetaDMSAG.__dataType);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__derivedClasses.name,MetaDMSAG.__derivedClasses);
        _SmAp.put(MetaDMSAG.__derivedFrom.name,MetaDMSAG.__derivedFrom);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dmeClass.name,MetaDMSAG.__dmeClass);
        _SmAp.put(MetaDMSAG.__dmeImport.name,MetaDMSAG.__dmeImport);
        _SmAp.put(MetaDMSAG.__dmoAuxClass.name,MetaDMSAG.__dmoAuxClass);
        _SmAp.put(MetaDMSAG.__dmoAuxClassImport.name,MetaDMSAG.__dmoAuxClassImport);
        _SmAp.put(MetaDMSAG.__dmoClass.name,MetaDMSAG.__dmoClass);
        _SmAp.put(MetaDMSAG.__dmoFromModule.name,MetaDMSAG.__dmoFromModule);
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
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__dsdModuleDefinition.name,MetaDMSAG.__dsdModuleDefinition);
        _SmAp.put(MetaDMSAG.__example.name,MetaDMSAG.__example);
        _SmAp.put(MetaDMSAG.__excludeFromContext.name,MetaDMSAG.__excludeFromContext);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__hint.name,MetaDMSAG.__hint);
        _SmAp.put(MetaDMSAG.__intendedToExtend.name,MetaDMSAG.__intendedToExtend);
        _SmAp.put(MetaDMSAG.__internalTypeRef.name,MetaDMSAG.__internalTypeRef);
        _SmAp.put(MetaDMSAG.__internallyGenerated.name,MetaDMSAG.__internallyGenerated);
        _SmAp.put(MetaDMSAG.__isDSDefinition.name,MetaDMSAG.__isDSDefinition);
        _SmAp.put(MetaDMSAG.__isNamedBy.name,MetaDMSAG.__isNamedBy);
        _SmAp.put(MetaDMSAG.__javaClass.name,MetaDMSAG.__javaClass);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__may.name,MetaDMSAG.__may);
        _SmAp.put(MetaDMSAG.__must.name,MetaDMSAG.__must);
        _SmAp.put(MetaDMSAG.__nvp.name,MetaDMSAG.__nvp);
        _SmAp.put(MetaDMSAG.__obsolete.name,MetaDMSAG.__obsolete);
        _SmAp.put(MetaDMSAG.__obsoleteVersion.name,MetaDMSAG.__obsoleteVersion);
        _SmAp.put(MetaDMSAG.__optimize.name,MetaDMSAG.__optimize);
        _SmAp.put(MetaDMSAG.__partOfDefinitionModule.name,MetaDMSAG.__partOfDefinitionModule);
        _SmAp.put(MetaDMSAG.__question.name,MetaDMSAG.__question);
        _SmAp.put(MetaDMSAG.__relatedToConcept.name,MetaDMSAG.__relatedToConcept);
        _SmAp.put(MetaDMSAG.__relationship.name,MetaDMSAG.__relationship);
        _SmAp.put(MetaDMSAG.__ruleDefinition.name,MetaDMSAG.__ruleDefinition);
        _SmAp.put(MetaDMSAG.__searchable.name,MetaDMSAG.__searchable);
        _SmAp.put(MetaDMSAG.__skip.name,MetaDMSAG.__skip);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__subpackage.name,MetaDMSAG.__subpackage);
        _SmAp.put(MetaDMSAG.__supportsBackrefTracking.name,MetaDMSAG.__supportsBackrefTracking);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
        _SmAp.put(MetaDMSAG.__useWrapperType.name,MetaDMSAG.__useWrapperType);
        _SmAp.put(MetaDMSAG.__usesInterface.name,MetaDMSAG.__usesInterface);
        _SmAp.put(MetaDMSAG.__usesWrapperInterface.name,MetaDMSAG.__usesWrapperInterface);
        _SmAp.put(MetaDMSAG.__version.name,MetaDMSAG.__version);
        _SmAp.put(MetaDMSAG.__why.name,MetaDMSAG.__why);
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

    @Override
    public ClassDefinitionDMO getSlice(DmcSliceInfo info){
        ClassDefinitionDMO rc = new ClassDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * This attribute indicates the type of a class definition. 
     * @return the ClassTypeEnum
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public ClassTypeEnum getClassType(){
        DmcTypeClassTypeEnumSV attr = (DmcTypeClassTypeEnumSV) get(MetaDMSAG.__classType);
        if (attr == null)
            return(ClassTypeEnum.UNKNOWN);

        return(attr.getSV());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnumSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setClassType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__classType);
        if (attr == null)
            attr = new DmcTypeClassTypeEnumSV(MetaDMSAG.__classType);
        
        attr.set(value);
        set(MetaDMSAG.__classType,attr);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes.\n This is used as part of the serialization mechanisms
     * built into Dark Matter Objects. 
     * @return the Integer
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Integer getDmdID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmdID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmdID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__dmdID);
        
        attr.set(value);
        set(MetaDMSAG.__dmdID,attr);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     * @return the DefinitionName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This\n concept is borrowed from directory technology where
     * shortened name forms are often\n used as part of distinguished names
     * (DNs). 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getAbbrev(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setAbbrev(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__abbrev);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__abbrev);
        
        attr.set(value);
        set(MetaDMSAG.__abbrev,attr);
    }

    /**
     * Indicates the set of actions that are supported by a class of objects. 
     * @return the ActionDefinition
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<ActionDefinitionREF> getActions(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) get(MetaDMSAG.__actions);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actions value.
     * @param value A value compatible with DmcTypeActionDefinitionREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addActions(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__actions);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREFMV(MetaDMSAG.__actions);
        
        attr.add(value);
        add(MetaDMSAG.__actions,attr);
        return(attr);
    }

    /**
     * Indicates the classes of object that may be parents of the\n current class
     * when objects are created in an instance hierarchy. 
     * @return the ClassDefinition
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<ClassDefinitionREF> getAllowedParents(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaDMSAG.__allowedParents);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another allowedParents value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addAllowedParents(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__allowedParents);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaDMSAG.__allowedParents);
        
        attr.add(value);
        add(MetaDMSAG.__allowedParents,attr);
        return(attr);
    }

    /**
     * A comment or note associated with the definition of something. For\n code
     * that's generated from a definition, comments may be added to the code, as
     * opposed to \n descriptions which are meant to assist in generating
     * documentation. In the end, it's up to\n the designer of a DSL to determine
     * how comments are used. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getComment(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__comment);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another comment value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addComment(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__comment);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__comment);
        
        attr.add(value);
        add(MetaDMSAG.__comment,attr);
        return(attr);
    }

    /**
     * A flag to indicate if you want your data repository to create an index for
     * a named object. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Boolean getCreateIndex(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__createIndex);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets createIndex to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setCreateIndex(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__createIndex);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__createIndex);
        
        attr.set(value);
        set(MetaDMSAG.__createIndex,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or\n class of object. How this information is used is application
     * dependent. 
     * @return the DataTypeEnum
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnumSV attr = (DmcTypeDataTypeEnumSV) get(MetaDMSAG.__dataType);
        if (attr == null)
            return(DataTypeEnum.PERSISTENT);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDataType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnumSV(MetaDMSAG.__dataType);
        
        attr.set(value);
        set(MetaDMSAG.__dataType,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     * @return the SchemaDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * Indicates the classes that are known to be derived from a class. 
     * @return the ClassDefinition
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<ClassDefinitionREF> getDerivedClasses(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaDMSAG.__derivedClasses);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another derivedClasses value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addDerivedClasses(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__derivedClasses);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaDMSAG.__derivedClasses);
        
        attr.add(value);
        add(MetaDMSAG.__derivedClasses,attr);
        return(attr);
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived. 
     * @return the ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public ClassDefinitionREF getDerivedFrom(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MetaDMSAG.__derivedFrom);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets derivedFrom to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDerivedFrom(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__derivedFrom);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MetaDMSAG.__derivedFrom);
        
        attr.set(value);
        set(MetaDMSAG.__derivedFrom,attr);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2556)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DmcValueException e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        attr.add(value);
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * This attribute indicates just the Dark Matter Extended (DME) class name. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmeClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmeClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmeClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmeClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmeClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmeClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmeClass,attr);
    }

    /**
     * This attribute indicates the full name of the class that extends a DMW
     * class.\n Dark Matter Extended (DME). 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmeImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmeImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmeImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmeImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmeImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmeImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmeImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUXDMO 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmoAuxClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoAuxClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmoAuxClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmoAuxClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoAuxClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmoAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUXDMO class 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmoAuxClassImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoAuxClassImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmoAuxClassImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmoAuxClassImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoAuxClassImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmoAuxClassImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassDMO 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmoClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmoClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmoClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmoClass,attr);
    }

    /**
     * A bit of a hack to allow for creation of fully qualified dot names\n in
     * the DMODefinitionSet that's used for caching definitions in GWT. On the
     * DMW side, this\n is taken care of by overloading the
     * getNameOfModuleWhereThisCameFrom() to access the \n getDefinedInModule
     * attribute and getting the name of the module. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmoFromModule(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoFromModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoFromModule to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmoFromModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmoFromModule);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoFromModule);
        
        attr.set(value);
        set(MetaDMSAG.__dmoFromModule,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO)\n class (including package) that is generated for this class. The
     * class will always have DmcObject\n at the top of its derivation hierarchy. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmoImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmoImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmoImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmoImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmoImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmoImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmoImport,attr);
    }

    /**
     * This attribute indicates just the DmcType class name. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmtClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmtClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmtClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmtClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmtClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmtClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcType class used to
     * reference\n a class. These types are auto generated and named
     * DmcType<classname>REF. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmtImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmtImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmtImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmtImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmtImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmtImport,attr);
    }

    /**
     * This attribute indicates the full name of the class used to reference\n a
     * class. These types are auto generated and named <classname>REF. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmtREFImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmtREFImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtREFImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmtREFImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmtREFImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmtREFImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmtREFImport,attr);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUX 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmwAuxClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwAuxClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmwAuxClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwAuxClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwAuxClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmwAuxClass,attr);
    }

    /**
     * This attribute indicates the full name of the MyClassAUX class 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmwAuxClassImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwAuxClassImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmwAuxClassImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwAuxClassImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwAuxClassImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmwAuxClassImport,attr);
    }

    /**
     * This attribute indicates just the DMW class name, eg MyClassDMW 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmwClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmwClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmwClass,attr);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter
     * Wrapper (DMW)\n class (including package) that is wrapped by this class.
     * The class will always be a derived class of\n DmwWrapperBase. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmwImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmwImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmwImport,attr);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a\n class
     * of object. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmwIteratorClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwIteratorClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwIteratorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwIteratorClass);
        
        attr.set(value);
        set(MetaDMSAG.__dmwIteratorClass,attr);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator \n
     * derived class that allows us to iterate over a set of object references
     * and get back\n the DMW wrapper object instead of the DMO. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getDmwIteratorImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwIteratorImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwIteratorImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwIteratorImport);
        
        attr.set(value);
        set(MetaDMSAG.__dmwIteratorImport,attr);
    }

    /**
     * The dmwWrapperType is used to indicate whether or not you want extended
     * wrappers\n when the wrappers are generated for an object in a particular
     * generation context. 
     * @return the DmwTypeToWrapperType
     * @return An Iterator of DmwTypeToWrapperType objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<DmwTypeToWrapperType> getDmwWrapperType(){
        DmcTypeDmwTypeToWrapperTypeMV attr = (DmcTypeDmwTypeToWrapperTypeMV) get(MetaDMSAG.__dmwWrapperType);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dmwWrapperType value.
     * @param value A value compatible with DmcTypeDmwTypeToWrapperTypeMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addDmwWrapperType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwWrapperType);
        if (attr == null)
            attr = new DmcTypeDmwTypeToWrapperTypeMV(MetaDMSAG.__dmwWrapperType);
        
        attr.add(value);
        add(MetaDMSAG.__dmwWrapperType,attr);
        return(attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     * @return the DotName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * The DSDefinitionModule that resulted in the creation of an\n internally
     * generated ClassDefinition. 
     * @return the DSDefinitionModule
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DSDefinitionModuleREF getDsdModuleDefinition(){
        DmcTypeDSDefinitionModuleREFSV attr = (DmcTypeDSDefinitionModuleREFSV) get(MetaDMSAG.__dsdModuleDefinition);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dsdModuleDefinition to the specified value.
     * @param value A value compatible with DmcTypeDSDefinitionModuleREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setDsdModuleDefinition(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dsdModuleDefinition);
        if (attr == null)
            attr = new DmcTypeDSDefinitionModuleREFSV(MetaDMSAG.__dsdModuleDefinition);
        
        attr.set(value);
        set(MetaDMSAG.__dsdModuleDefinition,attr);
    }

    /**
     * The example attribute is used to provide additional\n examples of how some
     * defined thing is to be used. 
     * @return the Example
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<Example> getExample(){
        DmcTypeExampleMV attr = (DmcTypeExampleMV) get(MetaDMSAG.__example);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another example value.
     * @param value A value compatible with DmcTypeExampleMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addExample(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__example);
        if (attr == null)
            attr = new DmcTypeExampleMV(MetaDMSAG.__example);
        
        attr.add(value);
        add(MetaDMSAG.__example,attr);
        return(attr);
    }

    /**
     * The excludeFromContext attribute is used to indicate that\n a class of
     * object (and all of its derivatives) should be excluded from the wrapper\n
     * generation for the specified context. An example usage is in the Dark
     * Matter Protocol\n where we don't want to generate wrappers for the message
     * objects in a GXT context. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getExcludeFromContext(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__excludeFromContext);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another excludeFromContext value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addExcludeFromContext(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__excludeFromContext);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__excludeFromContext);
        
        attr.add(value);
        add(MetaDMSAG.__excludeFromContext,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * A short description of something that can be dumped as one line summary of
     * something.\n For longer explanations, use the description attribute. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getHint(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__hint);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets hint to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setHint(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__hint);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__hint);
        
        attr.set(value);
        set(MetaDMSAG.__hint,attr);
    }

    /**
     * This attribute can be used on AUXILIARY classes to give a hint about
     * their\n intended usage. For example, if you were extending schema
     * definitions with some or your \n own attributes for some purpose, your
     * auxiliary class could have intendedToExtend ClassDefinition. 
     * @return the ClassDefinition
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<ClassDefinitionREF> getIntendedToExtend(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaDMSAG.__intendedToExtend);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another intendedToExtend value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addIntendedToExtend(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__intendedToExtend);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaDMSAG.__intendedToExtend);
        
        attr.add(value);
        add(MetaDMSAG.__intendedToExtend,attr);
        return(attr);
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This\n is set automatically on ClassDefinitions as they are parsed. 
     * @return the TypeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public TypeDefinitionREF getInternalTypeRef(){
        DmcTypeTypeDefinitionREFSV attr = (DmcTypeTypeDefinitionREFSV) get(MetaDMSAG.__internalTypeRef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets internalTypeRef to the specified value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setInternalTypeRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__internalTypeRef);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFSV(MetaDMSAG.__internalTypeRef);
        
        attr.set(value);
        set(MetaDMSAG.__internalTypeRef,attr);
    }

    /**
     * This flag indicates if the associated definition was internally
     * generated.\n This is the case for TypeDefinitions generated for
     * ClassDefinitions and EnumDefinitions\n that allow for references to these
     * objects. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Boolean getInternallyGenerated(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__internallyGenerated);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setInternallyGenerated(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__internallyGenerated);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__internallyGenerated);
        
        attr.set(value);
        set(MetaDMSAG.__internallyGenerated,attr);
    }

    /**
     * Indicates if the class defined by a ClassDefinition and its derivatives
     * are part\n of a domain specific set of definitions. For instance, the
     * definitions associated with the meta schema are\n considered a set of
     * domain specific definitions for defining data objects; the dark-matter
     * Model View\n Whatever (MVW) definitions describe a set of domain specific
     * concepts for defining aspects of a GWT\n application.\n <p>\n A domain
     * specific definition must be named by name and must have dotName as an
     * attribute because the \n generated class will implement the
     * DmcDefinitionIF which assumes that these attributes exist. This\n
     * interface allows these definitions to be managed as part of a set of
     * definitions. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Boolean getIsDSDefinition(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__isDSDefinition);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isDSDefinition to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setIsDSDefinition(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isDSDefinition);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__isDSDefinition);
        
        attr.set(value);
        set(MetaDMSAG.__isDSDefinition,attr);
    }

    /**
     * Indicates the attribute by which an object of some class is named.\n When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will\n indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method\n will return the value of the isNamedBy attribute. 
     * @return the AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public AttributeDefinitionREF getIsNamedBy(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(MetaDMSAG.__isNamedBy);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets isNamedBy to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setIsNamedBy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__isNamedBy);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(MetaDMSAG.__isNamedBy);
        
        attr.set(value);
        set(MetaDMSAG.__isNamedBy,attr);
    }

    /**
     * This attribute indicates the full name of the class (including package)\n
     * that should be instantiated when an instance of an object is created via
     * the\n DmdClassDef.newInstance() function. The class must be a derived
     * class of\n DmdGenericObject. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getJavaClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__javaClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets javaClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setJavaClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__javaClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__javaClass);
        
        attr.set(value);
        set(MetaDMSAG.__javaClass,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     * @return the Integer
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY\n have.
     * When accessed in Java, this is a set of references to
     * AttributeDefinition\n objects. 
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<AttributeDefinitionREF> getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__may);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another may value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addMay(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__may);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__may);
        
        attr.add(value);
        add(MetaDMSAG.__may,attr);
        return(attr);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have. 
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<AttributeDefinitionREF> getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__must);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another must value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addMust(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__must);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__must);
        
        attr.add(value);
        add(MetaDMSAG.__must,attr);
        return(attr);
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return the NameValuePair
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<NameValuePair> getNvp(){
        DmcTypeNameValuePairMV attr = (DmcTypeNameValuePairMV) get(MetaDMSAG.__nvp);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with DmcTypeNameValuePairMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addNvp(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nvp);
        if (attr == null)
            attr = new DmcTypeNameValuePairMV(MetaDMSAG.__nvp);
        
        attr.add(value);
        add(MetaDMSAG.__nvp,attr);
        return(attr);
    }

    /**
     * The version at which something became obsolete. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getObsolete(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__obsolete);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsolete to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setObsolete(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__obsolete);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__obsolete);
        
        attr.set(value);
        set(MetaDMSAG.__obsolete,attr);
    }

    /**
     * This indicates the version at which something became obsolete.\n Generally
     * speaking you shouldn't ever delete definitions for products that have\n
     * been released to the field, this may break backwards compatibility.
     * Instead, you\n should mark them as obsolete. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getObsoleteVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__obsoleteVersion);
        
        attr.set(value);
        set(MetaDMSAG.__obsoleteVersion,attr);
    }

    /**
     * Depending on what you're modelling, you often come across\n places where
     * you can see an opportunity to optimize, streamline or improve something
     * e.g. merging\n concepts together, representing something differently,
     * adding a relationship - whatever.\n However, these ideas often get lost in
     * the shuffle or, if you add them into an overall\n description of
     * something, they don't stand out.\n <p>\n Any dark-matter definition can be
     * decorated with optimize notes. These notes provide 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getOptimize(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__optimize);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another optimize value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addOptimize(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__optimize);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__optimize);
        
        attr.add(value);
        add(MetaDMSAG.__optimize,attr);
        return(attr);
    }

    /**
     * For classes that defined as part of a definition module,\n this indicates
     * the module they belong to. This allows for generation of a standard\n
     * method to get the name of the module from which they were loaded. 
     * @return the DSDefinitionModule
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DSDefinitionModuleREF getPartOfDefinitionModule(){
        DmcTypeDSDefinitionModuleREFSV attr = (DmcTypeDSDefinitionModuleREFSV) get(MetaDMSAG.__partOfDefinitionModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets partOfDefinitionModule to the specified value.
     * @param value A value compatible with DmcTypeDSDefinitionModuleREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setPartOfDefinitionModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__partOfDefinitionModule);
        if (attr == null)
            attr = new DmcTypeDSDefinitionModuleREFSV(MetaDMSAG.__partOfDefinitionModule);
        
        attr.set(value);
        set(MetaDMSAG.__partOfDefinitionModule,attr);
    }

    /**
     * A question associated with the definition of something. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getQuestion(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__question);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another question value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addQuestion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__question);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__question);
        
        attr.add(value);
        add(MetaDMSAG.__question,attr);
        return(attr);
    }

    /**
     * Allows for references to base concepts that relate this\n definition to
     * another definition in the Concinnity domain. This mechanism is only used\n
     * in the domain of dark-matter schema definitions; other DSLs will allow for
     * direct\n reference to Concinnity concepts. 
     * @return the Concinnity
     * @return An Iterator of ConcinnityDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2537)
    public Iterator<ConcinnityREF> getRelatedToConcept(){
        DmcTypeConcinnityREFMV attr = (DmcTypeConcinnityREFMV) get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another relatedToConcept value.
     * @param value A value compatible with DmcTypeConcinnityREFMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addRelatedToConcept(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            attr = new DmcTypeConcinnityREFMV(MetaDMSAG.__relatedToConcept);
        
        attr.add(value);
        add(MetaDMSAG.__relatedToConcept,attr);
        return(attr);
    }

    /**
     * The name of the relationship established via a reference to some other
     * named object.\n <p>\n This is a minor hack to allow creation of named
     * relationships in graph databases. Eventually, relationships\n will become
     * first class objects to which you can refer. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getRelationship(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__relationship);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets relationship to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setRelationship(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__relationship);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__relationship);
        
        attr.set(value);
        set(MetaDMSAG.__relationship,attr);
    }

    /**
     * The RuleDefinition that resulted in the creation of an\n internally
     * generated ClassDefinition. 
     * @return the RuleDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public RuleDefinitionREF getRuleDefinition(){
        DmcTypeRuleDefinitionREFSV attr = (DmcTypeRuleDefinitionREFSV) get(MetaDMSAG.__ruleDefinition);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleDefinition to the specified value.
     * @param value A value compatible with DmcTypeRuleDefinitionREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setRuleDefinition(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleDefinition);
        if (attr == null)
            attr = new DmcTypeRuleDefinitionREFSV(MetaDMSAG.__ruleDefinition);
        
        attr.set(value);
        set(MetaDMSAG.__ruleDefinition,attr);
    }

    /**
     * Indicates if something is searchable. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Boolean getSearchable(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__searchable);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets searchable to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setSearchable(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__searchable);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__searchable);
        
        attr.set(value);
        set(MetaDMSAG.__searchable,attr);
    }

    /**
     * A version from which something should be excluded (even though it is
     * included\n in later versions). This is an unusual situation, and should be
     * approached with extreme caution! 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getSkip(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__skip);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another skip value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addSkip(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__skip);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__skip);
        
        attr.add(value);
        add(MetaDMSAG.__skip,attr);
        return(attr);
    }

    /**
     * The sortName is used in siutations where we need a name\n for storage of a
     * definition that is globally unique but can be sorted on the basis\n of the
     * definition name, not the module name. The dotName for a definition is\n
     * module.definition...type, whereas the sortName would be
     * definition...module.type.\n So, for things like documentation generation,
     * the sortName provides a more \n natural ordering. 
     * @return the DotName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public DotName getSortName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__sortName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sortName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setSortName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__sortName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__sortName);
        
        attr.set(value);
        set(MetaDMSAG.__sortName,attr);
    }

    /**
     * The subpackage beneath extended where generated code will be written.
     * This\n allows for a hierarchic package structure for the classes generated
     * by the dmg and mvc generator\n utilities. The structure can contain other
     * subpackages etc x.y.z but should not start or end\n with a period. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getSubpackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__subpackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setSubpackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__subpackage);
        
        attr.set(value);
        set(MetaDMSAG.__subpackage,attr);
    }

    /**
     * Indicates if a class of objects supports back reference tracking or not.
     * The\n default is that all objects support it, however, in places like the
     * Dark Matter Protocol, we\n don't want to track references in the messages. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public Boolean getSupportsBackrefTracking(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__supportsBackrefTracking);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets supportsBackrefTracking to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setSupportsBackrefTracking(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__supportsBackrefTracking);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__supportsBackrefTracking);
        
        attr.set(value);
        set(MetaDMSAG.__supportsBackrefTracking,attr);
    }

    /**
     * A collection of tags that can facilitate searching for\n definitions. The
     * values are limited to a-zA-Z0-9 and the space character. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getTags(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__tags);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another tags value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addTags(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__tags);
        
        attr.add(value);
        add(MetaDMSAG.__tags,attr);
        return(attr);
    }

    /**
     * Indicates whether you want to use the generated DMW wrapper\n or the
     * extended wrapper you've created yourself. 
     * @return the WrapperTypeEnum
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public WrapperTypeEnum getUseWrapperType(){
        DmcTypeWrapperTypeEnumSV attr = (DmcTypeWrapperTypeEnumSV) get(MetaDMSAG.__useWrapperType);
        if (attr == null)
            return(WrapperTypeEnum.BASE);

        return(attr.getSV());
    }

    /**
     * Sets useWrapperType to the specified value.
     * @param value A value compatible with DmcTypeWrapperTypeEnumSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setUseWrapperType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__useWrapperType);
        if (attr == null)
            attr = new DmcTypeWrapperTypeEnumSV(MetaDMSAG.__useWrapperType);
        
        attr.set(value);
        set(MetaDMSAG.__useWrapperType,attr);
    }

    /**
     * This is a hack for now to allow for the inclusion of an \n interface on a
     * class; it should be the fully qualified name of the interface.\n The
     * interface shouldn't require any method implementations. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getUsesInterface(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__usesInterface);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets usesInterface to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setUsesInterface(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__usesInterface);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__usesInterface);
        
        attr.set(value);
        set(MetaDMSAG.__usesInterface,attr);
    }

    /**
     * The fully qualified name of a Java interface that should\n be implemented
     * on an extended wrapper class. This is a useful mechanism to specify\n
     * common functionality across a set of classes that, otherwise, may not have
     * anything in\n common i.e. they aren't in the same derivation hierarchy.\n
     * </p>\n This results in an implements statement being added to the
     * DmwWrapper derivative. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getUsesWrapperInterface(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__usesWrapperInterface);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another usesWrapperInterface value.
     * @param value A value compatible with DmcTypeStringMV
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addUsesWrapperInterface(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__usesWrapperInterface);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__usesWrapperInterface);
        
        attr.add(value);
        add(MetaDMSAG.__usesWrapperInterface,attr);
        return(attr);
    }

    /**
     * The version at which something was introduced. Version names\n are assumed
     * to be lexicographically sortable i.e. the name of a version must have a
     * nautral\n sort order that increases. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public String getVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__version);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets version to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setVersion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__version);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__version);
        
        attr.set(value);
        set(MetaDMSAG.__version,attr);
    }

    /**
     * An indication of why something was added to a specification or a system.\n
     * This might be a reference to a requirement or feature concept. How this is
     * used will depend on context.\n Due to the fact that it is a weak
     * reference, you may also just put in free form text, since it\n will simply
     * be treated as an unresolved reference. 
     * @return the Concinnity
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2351)
    public ConcinnityREF getWhy(){
        DmcTypeConcinnityREFSV attr = (DmcTypeConcinnityREFSV) get(MetaDMSAG.__why);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets why to the specified value.
     * @param value A value compatible with DmcTypeConcinnityREFSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2443)
    public void setWhy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__why);
        if (attr == null)
            attr = new DmcTypeConcinnityREFSV(MetaDMSAG.__why);
        
        attr.set(value);
        set(MetaDMSAG.__why,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2142)

    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public DefinitionName getObjectName(){
        DmcTypeDefinitionName attr = (DmcTypeDefinitionName) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeDefinitionName) get(MetaDMSAG.__name);
        return(attr);
    }

}
