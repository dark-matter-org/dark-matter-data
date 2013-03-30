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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dmw.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;
import org.dmd.dmc.definitions.DmcDefinitionIF;

/**
 * This class provides the basic mechanism to define new classes for a schema.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1573)
 */
@SuppressWarnings("unused")
public class ClassDefinitionDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

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

    public  ClassDefinitionDMO getDMO() {
        return(mycore);
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
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * This attribute indicates the type of a class definition.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public ClassTypeEnum getClassType(){
        return(mycore.getClassType());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setClassType(Object value) throws DmcValueException {
        mycore.setClassType(value);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes.\n This is used as part of the serialization mechanisms
     * built into Dark Matter Objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmdID(Object value) throws DmcValueException {
        mycore.setDmdID(value);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDescription(){
        return(mycore.getDescription());
    }

    public String getDescriptionWithNewlines(){
        return(mycore.getDescriptionWithNewlines());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public ClassDefinition getDerivedFrom(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) mycore.get(MetaDMSAG.__derivedFrom);
        if (attr == null)
            return(null);
        ClassDefinitionDMO obj = attr.getSV().getObject();
        return((ClassDefinition)obj.getContainer());
    }

    /**
     * Sets derivedFrom to the specified value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2381)
    public void setDerivedFrom(ClassDefinition value) throws DmcValueException {
        mycore.setDerivedFrom(value.getDmcObject());
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have.
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2482)
    public AttributeDefinitionIterableDMW getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another must value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2541)
    public DmcAttribute<?> addMust(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMust(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of must values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2567)
    public int getMustSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY\n have.
     * When accessed in Java, this is a set of references to
     * AttributeDefinition\n objects.
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2482)
    public AttributeDefinitionIterableDMW getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another may value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2541)
    public DmcAttribute<?> addMay(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMay(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of may values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2567)
    public int getMaySize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the attribute by which an object of some class is named.\n When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will\n indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method\n will return the value of the isNamedBy attribute.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public AttributeDefinition getIsNamedBy(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) mycore.get(MetaDMSAG.__isNamedBy);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets isNamedBy to the specified value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2381)
    public void setIsNamedBy(AttributeDefinition value) throws DmcValueException {
        mycore.setIsNamedBy(value.getDmcObject());
    }

    /**
     * This attribute indicates the full name of the class (including package)\n
     * that should be instantiated when an instance of an object is created via
     * the\n DmdClassDef.newInstance() function. The class must be a derived
     * class of\n DmdGenericObject.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getJavaClass(){
        return(mycore.getJavaClass());
    }

    /**
     * Sets javaClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setJavaClass(Object value) throws DmcValueException {
        mycore.setJavaClass(value);
    }

    /**
     * This attribute can be used on AUXILIARY classes to give a hint about
     * their\n intended usage. For example, if you were extending schema
     * definitions with some or your \n own attributes for some purpose, your
     * auxiliary class could have intendedToExtend ClassDefinition.
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2482)
    public ClassDefinitionIterableDMW getIntendedToExtend(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) mycore.get(MetaDMSAG.__intendedToExtend);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another intendedToExtend value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2541)
    public DmcAttribute<?> addIntendedToExtend(ClassDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addIntendedToExtend(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of intendedToExtend values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2567)
    public int getIntendedToExtendSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__intendedToExtend);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * This is a hack for now to allow for the inclusion of an \n interface on a
     * class; it should be the fully qualified name of the interface.\n The
     * interface shouldn't require any method implementations.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getUsesInterface(){
        return(mycore.getUsesInterface());
    }

    /**
     * Sets usesInterface to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setUsesInterface(Object value) throws DmcValueException {
        mycore.setUsesInterface(value);
    }

    /**
     * Indicates whether you want to use the generated DMW wrapper\n or the
     * extended wrapper you've created yourself.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public WrapperTypeEnum getUseWrapperType(){
        return(mycore.getUseWrapperType());
    }

    /**
     * Sets useWrapperType to the specified value.
     * @param value A value compatible with DmcTypeWrapperTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setUseWrapperType(Object value) throws DmcValueException {
        mycore.setUseWrapperType(value);
    }

    /**
     * The dmwWrapperType is used to indicate whether or not you want extended
     * wrappers\n when the wrappers are generated for an object in a particular
     * generation context.
     * @return An Iterator of DmwTypeToWrapperType objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2500)
    public Iterator<DmwTypeToWrapperType> getDmwWrapperType(){
        DmcTypeDmwTypeToWrapperTypeMV attr = (DmcTypeDmwTypeToWrapperTypeMV) mycore.get(MetaDMSAG.__dmwWrapperType);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dmwWrapperType value.
     * @param value A value compatible with DmcTypeDmwTypeToWrapperTypeMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2555)
    public DmcAttribute<?> addDmwWrapperType(Object value) throws DmcValueException {
        return(mycore.addDmwWrapperType(value));
    }

    /**
     * Returns the number of dmwWrapperType values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2567)
    public int getDmwWrapperTypeSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dmwWrapperType);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the classes of object that may be parents of the\n current class
     * when objects are created in an instance hierarchy.
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2482)
    public ClassDefinitionIterableDMW getAllowedParents(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) mycore.get(MetaDMSAG.__allowedParents);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another allowedParents value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2541)
    public DmcAttribute<?> addAllowedParents(ClassDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addAllowedParents(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of allowedParents values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2567)
    public int getAllowedParentsSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__allowedParents);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The subpackage beneath extended where generated code will be written.
     * This\n allows for a hierarchic package structure for the classes generated
     * by the dmg and mvc generator\n utilities. The structure can contain other
     * subpackages etc x.y.z but should not start or end\n with a period.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getSubpackage(){
        return(mycore.getSubpackage());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setSubpackage(Object value) throws DmcValueException {
        mycore.setSubpackage(value);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or\n class of object. How this information is used is application
     * dependent.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public DataTypeEnum getDataType(){
        return(mycore.getDataType());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDataType(Object value) throws DmcValueException {
        mycore.setDataType(value);
    }

    /**
     * Indicates if a class of objects supports back reference tracking or not.
     * The\n default is that all objects support it, however, in places like the
     * Dark Matter Protocol, we\n don't want to track references in the messages.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public Boolean getSupportsBackrefTracking(){
        return(mycore.getSupportsBackrefTracking());
    }

    /**
     * Sets supportsBackrefTracking to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setSupportsBackrefTracking(Object value) throws DmcValueException {
        mycore.setSupportsBackrefTracking(value);
    }

    /**
     * The excludeFromContext attribute is used to indicate that\n a class of
     * object (and all of its derivatives) should be excluded from the wrapper\n
     * generation for the specified context. An example usage is in the Dark
     * Matter Protocol\n where we don't want to generate wrappers for the message
     * objects in a GXT context.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2500)
    public Iterator<String> getExcludeFromContext(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__excludeFromContext);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another excludeFromContext value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2555)
    public DmcAttribute<?> addExcludeFromContext(Object value) throws DmcValueException {
        return(mycore.addExcludeFromContext(value));
    }

    /**
     * Returns the number of excludeFromContext values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2567)
    public int getExcludeFromContextSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__excludeFromContext);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This\n concept is borrowed from directory technology where
     * shortened name forms are often\n used as part of distinguished names (DNs).
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getAbbrev(){
        return(mycore.getAbbrev());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setAbbrev(Object value) throws DmcValueException {
        mycore.setAbbrev(value);
    }

    /**
     * This indicates the version at which something became obsolete.\n Generally
     * speaking you shouldn't ever delete definitions for products that have\n
     * been released to the field, this may break backwards compatibility.
     * Instead, you\n should mark them as obsolete.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getObsoleteVersion(){
        return(mycore.getObsoleteVersion());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setObsoleteVersion(Object value) throws DmcValueException {
        mycore.setObsoleteVersion(value);
    }

    /**
     * Indicates if the class defined by a ClassDefinition and its derivatives
     * are part\n of a domain specific set of definitions. For instance, the
     * definitions associated with the meta schema are\n considered a set of
     * domain specific definitions for defining data objects; the dark-matter
     * Model View\n Whatever (MVW) definitions describe a set of domain specific
     * concepts for defining aspects of a GWT\n application.\n <p/>\n A domain
     * specific definition must be named by name and must have dotName as an
     * attribute because the \n generated class will implement the
     * DmcDefinitionIF which assumes that these attributes exist. This\n
     * interface allows these definitions to be managed as part of a set of
     * definitions.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public Boolean getIsDSDefinition(){
        return(mycore.getIsDSDefinition());
    }

    /**
     * Sets isDSDefinition to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setIsDSDefinition(Object value) throws DmcValueException {
        mycore.setIsDSDefinition(value);
    }

    /**
     * Indicates if the class defined by a ClassDefinition is considered to be a
     * \n module-level entity in terms of a set of domain specific definitions.
     * The generated dark-matter wrapper\n for the class will indicate that it
     * implements the DmcModuleIF.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public Boolean getIsDSModule(){
        return(mycore.getIsDSModule());
    }

    /**
     * Sets isDSModule to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setIsDSModule(Object value) throws DmcValueException {
        mycore.setIsDSModule(value);
    }

    /**
     * This flag indicates if the associated definition was internally
     * generated.\n This is the case for TypeDefinitions generated for
     * ClassDefinitions and EnumDefinitions\n that allow for references to these
     * objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public Boolean getInternallyGenerated(){
        return(mycore.getInternallyGenerated());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setInternallyGenerated(Object value) throws DmcValueException {
        mycore.setInternallyGenerated(value);
    }

    /**
     * The RuleDefinition that resulted in the creation of an\n internally
     * generated ClassDefinition.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public RuleDefinition getRuleDefinition(){
        DmcTypeRuleDefinitionREFSV attr = (DmcTypeRuleDefinitionREFSV) mycore.get(MetaDMSAG.__ruleDefinition);
        if (attr == null)
            return(null);
        RuleDefinitionDMO obj = attr.getSV().getObject();
        return((RuleDefinition)obj.getContainer());
    }

    /**
     * Sets ruleDefinition to the specified value.
     * @param value A value compatible with RuleDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2381)
    public void setRuleDefinition(RuleDefinition value) throws DmcValueException {
        mycore.setRuleDefinition(value.getDmcObject());
    }

    /**
     * Indicates the classes that are known to be derived from a class.
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2482)
    public ClassDefinitionIterableDMW getDerivedClasses(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) mycore.get(MetaDMSAG.__derivedClasses);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another derivedClasses value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2541)
    public DmcAttribute<?> addDerivedClasses(ClassDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDerivedClasses(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of derivedClasses values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2567)
    public int getDerivedClassesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__derivedClasses);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of actions that are supported by a class of objects.
     * @return An Iterator of ActionDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2482)
    public ActionDefinitionIterableDMW getActions(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) mycore.get(MetaDMSAG.__actions);
        if (attr == null)
            return(ActionDefinitionIterableDMW.emptyList);

        return(new ActionDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another actions value.
     * @param value A value compatible with ActionDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2541)
    public DmcAttribute<?> addActions(ActionDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addActions(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of actions values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2567)
    public int getActionsSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__actions);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This\n is set automatically on ClassDefinitions as they are parsed.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public TypeDefinition getInternalTypeRef(){
        DmcTypeTypeDefinitionREFSV attr = (DmcTypeTypeDefinitionREFSV) mycore.get(MetaDMSAG.__internalTypeRef);
        if (attr == null)
            return(null);
        TypeDefinitionDMO obj = attr.getSV().getObject();
        return((TypeDefinition)obj.getContainer());
    }

    /**
     * Sets internalTypeRef to the specified value.
     * @param value A value compatible with TypeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2381)
    public void setInternalTypeRef(TypeDefinition value) throws DmcValueException {
        mycore.setInternalTypeRef(value.getDmcObject());
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO)\n class (including package) that is generated for this class. The
     * class will always have DmcObject\n at the top of its derivation hierarchy.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmoImport(){
        return(mycore.getDmoImport());
    }

    /**
     * Sets dmoImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmoImport(Object value) throws DmcValueException {
        mycore.setDmoImport(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassDMO
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmoClass(){
        return(mycore.getDmoClass());
    }

    /**
     * Sets dmoClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmoClass(Object value) throws DmcValueException {
        mycore.setDmoClass(value);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter
     * Wrapper (DMW)\n class (including package) that is wrapped by this class.
     * The class will always be a derived class of\n DmwWrapperBase.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmwImport(){
        return(mycore.getDmwImport());
    }

    /**
     * Sets dmwImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmwImport(Object value) throws DmcValueException {
        mycore.setDmwImport(value);
    }

    /**
     * This attribute indicates just the DMW class name, eg MyClassDMW
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmwClass(){
        return(mycore.getDmwClass());
    }

    /**
     * Sets dmwClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmwClass(Object value) throws DmcValueException {
        mycore.setDmwClass(value);
    }

    /**
     * This attribute indicates the full name of the class that extends a DMW
     * class.\n Dark Matter Extended (DME).
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmeImport(){
        return(mycore.getDmeImport());
    }

    /**
     * Sets dmeImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmeImport(Object value) throws DmcValueException {
        mycore.setDmeImport(value);
    }

    /**
     * This attribute indicates just the Dark Matter Extended (DME) class name.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmeClass(){
        return(mycore.getDmeClass());
    }

    /**
     * Sets dmeClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmeClass(Object value) throws DmcValueException {
        mycore.setDmeClass(value);
    }

    /**
     * This attribute indicates the full name of the DmcType class used to
     * reference\n a class. These types are auto generated and named
     * DmcType<classname>REF.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmtImport(){
        return(mycore.getDmtImport());
    }

    /**
     * Sets dmtImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmtImport(Object value) throws DmcValueException {
        mycore.setDmtImport(value);
    }

    /**
     * This attribute indicates the full name of the class used to reference\n a
     * class. These types are auto generated and named <classname>REF.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmtREFImport(){
        return(mycore.getDmtREFImport());
    }

    /**
     * Sets dmtREFImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmtREFImport(Object value) throws DmcValueException {
        mycore.setDmtREFImport(value);
    }

    /**
     * This attribute indicates just the DmcType class name.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmtClass(){
        return(mycore.getDmtClass());
    }

    /**
     * Sets dmtClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmtClass(Object value) throws DmcValueException {
        mycore.setDmtClass(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUXDMO
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmoAuxClass(){
        return(mycore.getDmoAuxClass());
    }

    /**
     * Sets dmoAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmoAuxClass(Object value) throws DmcValueException {
        mycore.setDmoAuxClass(value);
    }

    /**
     * This attribute indicates the full name of the MyClassAUXDMO class
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmoAuxClassImport(){
        return(mycore.getDmoAuxClassImport());
    }

    /**
     * Sets dmoAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmoAuxClassImport(Object value) throws DmcValueException {
        mycore.setDmoAuxClassImport(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUX
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmwAuxClass(){
        return(mycore.getDmwAuxClass());
    }

    /**
     * Sets dmwAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmwAuxClass(Object value) throws DmcValueException {
        mycore.setDmwAuxClass(value);
    }

    /**
     * This attribute indicates the full name of the MyClassAUX class
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmwAuxClassImport(){
        return(mycore.getDmwAuxClassImport());
    }

    /**
     * Sets dmwAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmwAuxClassImport(Object value) throws DmcValueException {
        mycore.setDmwAuxClassImport(value);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator \n
     * derived class that allows us to iterate over a set of object references
     * and get back\n the DMW wrapper object instead of the DMO.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmwIteratorImport(){
        return(mycore.getDmwIteratorImport());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmwIteratorImport(Object value) throws DmcValueException {
        mycore.setDmwIteratorImport(value);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a\n class
     * of object.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getDmwIteratorClass(){
        return(mycore.getDmwIteratorClass());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setDmwIteratorClass(Object value) throws DmcValueException {
        mycore.setDmwIteratorClass(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1736)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
