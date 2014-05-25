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
package org.dmd.dms.server.generated.dmw;


// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:105)
import java.util.*;                                     // To support access functions - (DmwFormatter.java:75)
import org.dmd.core.*;                                  // Basic dark-matter infrastructure - (DmwFormatter.java:77)
import org.dmd.core.feedback.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:83)
import org.dmd.core.interfaces.DmcDefinitionIF;         // Because this is a DS definition - (DmwFormatter.java:91)
import org.dmd.dms.server.extended.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:79)
import org.dmd.dms.shared.generated.dmo.*;              // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:80)
import org.dmd.dms.shared.generated.enums.*;            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:81)
import org.dmd.dms.shared.generated.types.*;            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:82)
import org.dmd.dms.shared.types.*;                      // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dmw.*;                                   // Base wrapper capabilities - (DmwFormatter.java:78)

/**
 * This class provides the basic mechanism to define new classes for a
 * schema. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public class ClassDefinitionDMW extends org.dmd.dms.server.extended.DmsDefinition implements DmcDefinitionIF  {

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

    protected ClassDefinitionDMW(String mn) throws DMFeedbackSet {
        super(new ClassDefinitionDMO());
        mycore = (ClassDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * How a name is composed will depend on the context in which it used. For
     * instance, the names of definitions specified as part of a dark-matter
     * schema will conform to conventions of naming classes and or attributes in
     * Java. <p/> The generated documentation for a set of Domain Specific
     * Language (DSL) concepts will indicate the rules that apply to a name in
     * that DSL. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setName(Object value) throws DMFeedbackSet {
        mycore.setName(value);
    }

    /**
     * This attribute indicates the type of a class definition. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public ClassTypeEnum getClassType(){
        return(mycore.getClassType());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setClassType(Object value) throws DMFeedbackSet {
        mycore.setClassType(value);
    }

    /**
     * Dark-matter identifiers facilitate the compact serialization of
     * dark-matter objects (DMOs); see the serializeIt() and deserializeIt()
     * methods of the DmcObject. <p/> This mechanism also allows for compact
     * transport of dark-matter objects when used with Google Web Toolkit (GWT)
     * RPC mechanisms. When objects are passed back and forth via RPC, the
     * dark-matter identifiers are used instead of the string-based attribute
     * names, which are usually much more lengthy. This optimization is
     * transparently supported by the  DmcObject; you don't need to worry about
     * how it's achieved. <p/> However, if you're curious, have a look at the
     * Compact Schema documentation. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmdID(Object value) throws DMFeedbackSet {
        mycore.setDmdID(value);
    }

    /**
     * The detailed description of some concept definition. The description is
     * multi-valued and is used in the generation of documentation. By
     * convention, it should follow XHTML guidelines in terms of its content. 
     * <p/> Also by convention, the first element of the description should be a
     * short, simple indication of the concept that is suitable for inclusion as
     * a code comment; this is primarily used in dark-matter schema (DMS)
     * specifications since dark-matter object (DMO) and dark-matter wrapper
     * (DMW) Java code is generated from these specifications. <p/> When defining
     * your own Domain Specific Languages (DSLs), feel free to follow whatever
     * conventions make sense for your purposes. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:328)
    public StringIterableDMW getDescriptionIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:341)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DMFeedbackSet e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:396)
    public void addDescription(Object value) throws DMFeedbackSet {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if description has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getDescriptionHasValue(){
        return(getDescriptionSize() > 0);
    }

    /**
     * Indicates the abstract or structural class from which this class is
     * derived. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:180)
    public void setDerivedFrom(ClassDefinition value) throws DMFeedbackSet {
        mycore.setDerivedFrom(value.getDmcObject());
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addMust(AttributeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addMust(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of must values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getMustSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if must has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getMustHasValue(){
        return(getMustSize() > 0);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addMay(AttributeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addMay(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of may values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getMaySize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if may has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getMayHasValue(){
        return(getMaySize() > 0);
    }

    /**
     * Indicates the attribute by which an object of some class is named. When
     * this attribute is supplied in a ClassDefinition, the generated DMO class
     * will indicate that it implements the DmcNamedObjectIF and its
     * getObjectName() method will return the value of the isNamedBy attribute. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:180)
    public void setIsNamedBy(AttributeDefinition value) throws DMFeedbackSet {
        mycore.setIsNamedBy(value.getDmcObject());
    }

    /**
     * This attribute indicates the full name of the class (including package)
     * that should be instantiated when an instance of an object is created via
     * the DmdClassDef.newInstance() function. The class must be a derived class
     * of DmdGenericObject. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getJavaClass(){
        return(mycore.getJavaClass());
    }

    /**
     * Sets javaClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setJavaClass(Object value) throws DMFeedbackSet {
        mycore.setJavaClass(value);
    }

    /**
     * This attribute can be used on AUXILIARY classes to give a hint about their
     * intended usage. For example, if you were extending schema definitions with
     * some or your  own attributes for some purpose, your auxiliary class could
     * have intendedToExtend ClassDefinition. 
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addIntendedToExtend(ClassDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addIntendedToExtend(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of intendedToExtend values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getIntendedToExtendSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__intendedToExtend);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if intendedToExtend has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getIntendedToExtendHasValue(){
        return(getIntendedToExtendSize() > 0);
    }

    /**
     * This is a hack for now to allow for the inclusion of an  interface on a
     * class; it should be the fully qualified name of the interface. The
     * interface shouldn't require any method implementations. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getUsesInterface(){
        return(mycore.getUsesInterface());
    }

    /**
     * Sets usesInterface to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setUsesInterface(Object value) throws DMFeedbackSet {
        mycore.setUsesInterface(value);
    }

    /**
     * Indicates whether you want to use the generated DMW wrapper or the
     * extended wrapper you've created yourself. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public WrapperTypeEnum getUseWrapperType(){
        return(mycore.getUseWrapperType());
    }

    /**
     * Sets useWrapperType to the specified value.
     * @param value A value compatible with DmcTypeWrapperTypeEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setUseWrapperType(Object value) throws DMFeedbackSet {
        mycore.setUseWrapperType(value);
    }

    /**
     * The dmwWrapperType is used to indicate whether or not you want extended
     * wrappers when the wrappers are generated for an object in a particular
     * generation context. 
     * @return An Iterator of DmwTypeToWrapperType objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:328)
    public DmwTypeToWrapperTypeIterableDMW getDmwWrapperTypeIterable(){
        DmcTypeDmwTypeToWrapperTypeMV attr = (DmcTypeDmwTypeToWrapperTypeMV) mycore.get(MetaDMSAG.__dmwWrapperType);
        if (attr == null)
            return(DmwTypeToWrapperTypeIterableDMW.emptyList);

        return(new DmwTypeToWrapperTypeIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dmwWrapperType value.
     * @param value A value compatible with DmcTypeDmwTypeToWrapperTypeMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:396)
    public void addDmwWrapperType(Object value) throws DMFeedbackSet {
        mycore.addDmwWrapperType(value);
    }

    /**
     * Returns the number of dmwWrapperType values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getDmwWrapperTypeSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dmwWrapperType);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dmwWrapperType has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getDmwWrapperTypeHasValue(){
        return(getDmwWrapperTypeSize() > 0);
    }

    /**
     * Indicates the classes of object that may be parents of the current class
     * when objects are created in an instance hierarchy. 
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addAllowedParents(ClassDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addAllowedParents(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of allowedParents values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getAllowedParentsSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__allowedParents);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if allowedParents has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getAllowedParentsHasValue(){
        return(getAllowedParentsSize() > 0);
    }

    /**
     * The subpackage beneath extended where generated code will be written. This
     * allows for a hierarchic package structure for the classes generated by the
     * dmg and mvc generator utilities. The structure can contain other
     * subpackages etc x.y.z but should not start or end with a period. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getSubpackage(){
        return(mycore.getSubpackage());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setSubpackage(Object value) throws DMFeedbackSet {
        mycore.setSubpackage(value);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public DataTypeEnum getDataType(){
        return(mycore.getDataType());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDataType(Object value) throws DMFeedbackSet {
        mycore.setDataType(value);
    }

    /**
     * Indicates if a class of objects supports back reference tracking or not.
     * The default is that all objects support it, however, in places like the
     * Dark Matter Protocol, we don't want to track references in the messages. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Boolean getSupportsBackrefTracking(){
        return(mycore.getSupportsBackrefTracking());
    }

    /**
     * Sets supportsBackrefTracking to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setSupportsBackrefTracking(Object value) throws DMFeedbackSet {
        mycore.setSupportsBackrefTracking(value);
    }

    /**
     * The excludeFromContext attribute is used to indicate that a class of
     * object (and all of its derivatives) should be excluded from the wrapper
     * generation for the specified context. An example usage is in the Dark
     * Matter Protocol where we don't want to generate wrappers for the message
     * objects in a GXT context. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:328)
    public StringIterableDMW getExcludeFromContextIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__excludeFromContext);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another excludeFromContext value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:396)
    public void addExcludeFromContext(Object value) throws DMFeedbackSet {
        mycore.addExcludeFromContext(value);
    }

    /**
     * Returns the number of excludeFromContext values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getExcludeFromContextSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__excludeFromContext);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if excludeFromContext has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getExcludeFromContextHasValue(){
        return(getExcludeFromContextSize() > 0);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs). 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getAbbrev(){
        return(mycore.getAbbrev());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setAbbrev(Object value) throws DMFeedbackSet {
        mycore.setAbbrev(value);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getObsoleteVersion(){
        return(mycore.getObsoleteVersion());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setObsoleteVersion(Object value) throws DMFeedbackSet {
        mycore.setObsoleteVersion(value);
    }

    /**
     * Indicates if the class defined by a ClassDefinition and its derivatives
     * are part of a domain specific set of definitions. For instance, the
     * definitions associated with the meta schema are considered a set of domain
     * specific definitions for defining data objects; the dark-matter Model View
     * Whatever (MVW) definitions describe a set of domain specific concepts for
     * defining aspects of a GWT application. <p/> A domain specific definition
     * must be named by name and must have dotName as an attribute because the 
     * generated class will implement the DmcDefinitionIF which assumes that
     * these attributes exist. This interface allows these definitions to be
     * managed as part of a set of definitions. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Boolean getIsDSDefinition(){
        return(mycore.getIsDSDefinition());
    }

    /**
     * Sets isDSDefinition to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setIsDSDefinition(Object value) throws DMFeedbackSet {
        mycore.setIsDSDefinition(value);
    }

    /**
     * For classes that defined as part of a definition module, this indicates
     * the module they belong to. This allows for generation of a standard method
     * to get the name of the module from which they were loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public DSDefinitionModule getPartOfDefinitionModule(){
        DmcTypeDSDefinitionModuleREFSV attr = (DmcTypeDSDefinitionModuleREFSV) mycore.get(MetaDMSAG.__partOfDefinitionModule);
        if (attr == null)
            return(null);
        DSDefinitionModuleDMO obj = attr.getSV().getObject();
        return((DSDefinitionModule)obj.getContainer());
    }

    /**
     * Sets partOfDefinitionModule to the specified value.
     * @param value A value compatible with DSDefinitionModule
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:180)
    public void setPartOfDefinitionModule(DSDefinitionModule value) throws DMFeedbackSet {
        mycore.setPartOfDefinitionModule(value.getDmcObject());
    }

    /**
     * Indicates if a definition may be generated internally as a result of the
     * existence of another kind of definition. This is fairly complicated stuff
     * that has to do with the way in which object name resolution is performed
     * using DmcDefinitionSets. For instance we generate internal TypeDefinitions
     * for ClassDefinitions, EnumDefinitions etc. so that they may be referred to
     * as types in attribute definitions. When definitions are added to the
     * generated ModuleDefinitionManager for a DSL, they are added up the
     * derivation hierarchy to allow for type based matching of a reference to an
     * object. This is tricky. <p/> You may have an attribute called classRef
     * that has a type of ClassDefinition. If you have ClassDefinition for  Book,
     * an instance of the classRef attribute may be set to Book. <p/> You may
     * have an attribute called typeRef that has a type of TypeDefinition. You
     * may also set typeRef to the value Book. <p/> This is because Book can be
     * either a reference to a ClassDefinition or its internally generated
     * TypeDefinition. When object resolution is performed, the type of the
     * attribute is used to determine what kind of thing we're looking for
     * (context is everything). For the classRef attribute, we will take the name
     * of the value - Book - and append the type of the attribute, -
     * ClassDefinition - to come up with the DotName of the object we're trying
     * to resolve, in this case Book.ClassDefinition (this is the name-type
     * representation of a definition object name). Side Note: If you happend to
     * have a Book class in different dark-matter schemas, that's not a problem,
     * because we can, based on usage context, determine which definition from
     * which schema should be used (this is a whole other discussion). <p/> If
     * we're trying to resolve the typeRef attribute, the DotName will be
     * Book.TypeDefinition. <p/> This attribute comes in to play when generating
     * code for the ModuleDefinitionManager beacsue, although we add the
     * definitions up the definition derivation chain, we don't what to try and
     * add internally generated definitions to the DmcDefinitionSet for the base
     * definition e.g. DmsDefinition. This is because it would cause a name clash
     * at that level. At the top level definition, we not be able to distinguish
     * between the class definition and its intenally generated type because
     * their fully qualified names would both appear as
     * schema.Book.DmsDefinition. For that reason, we don't add internally
     * generated definitions to the base definition set and having this flag on
     * definitions that may be generated internally allows us to do checking in
     * the ModuledefinitionManager. <p/> I know. Clear as mud, but hopefully, you
     * never have to look at this because the tricky bits have been dealt with! 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Boolean getMayBeInternallyGenerated(){
        return(mycore.getMayBeInternallyGenerated());
    }

    /**
     * Sets mayBeInternallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setMayBeInternallyGenerated(Object value) throws DMFeedbackSet {
        mycore.setMayBeInternallyGenerated(value);
    }

    /**
     * This flag indicates if the associated definition was internally generated.
     * This is the case for TypeDefinitions generated for ClassDefinitions and
     * EnumDefinitions that allow for references to these objects. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Boolean getInternallyGenerated(){
        return(mycore.getInternallyGenerated());
    }

    /**
     * Sets internallyGenerated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setInternallyGenerated(Object value) throws DMFeedbackSet {
        mycore.setInternallyGenerated(value);
    }

    /**
     * The RuleDefinition that resulted in the creation of an internally
     * generated ClassDefinition. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:180)
    public void setRuleDefinition(RuleDefinition value) throws DMFeedbackSet {
        mycore.setRuleDefinition(value.getDmcObject());
    }

    /**
     * The DSDefinitionModule that resulted in the creation of an internally
     * generated ClassDefinition. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public DSDefinitionModule getDsdModuleDefinition(){
        DmcTypeDSDefinitionModuleREFSV attr = (DmcTypeDSDefinitionModuleREFSV) mycore.get(MetaDMSAG.__dsdModuleDefinition);
        if (attr == null)
            return(null);
        DSDefinitionModuleDMO obj = attr.getSV().getObject();
        return((DSDefinitionModule)obj.getContainer());
    }

    /**
     * Sets dsdModuleDefinition to the specified value.
     * @param value A value compatible with DSDefinitionModule
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:180)
    public void setDsdModuleDefinition(DSDefinitionModule value) throws DMFeedbackSet {
        mycore.setDsdModuleDefinition(value.getDmcObject());
    }

    /**
     * Indicates the classes that are known to be derived from a class. 
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addDerivedClasses(ClassDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addDerivedClasses(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of derivedClasses values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getDerivedClassesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__derivedClasses);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if derivedClasses has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getDerivedClassesHasValue(){
        return(getDerivedClassesSize() > 0);
    }

    /**
     * Indicates the set of actions that are supported by a class of objects. 
     * @return An Iterator of ActionDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addActions(ActionDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addActions(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of actions values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getActionsSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__actions);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if actions has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getActionsHasValue(){
        return(getActionsSize() > 0);
    }

    /**
     * Indicates the internal type that's generated for all ClassDefinitions.
     * This is set automatically on ClassDefinitions as they are parsed. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:180)
    public void setInternalTypeRef(TypeDefinition value) throws DMFeedbackSet {
        mycore.setInternalTypeRef(value.getDmcObject());
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter Object
     * (DMO) class (including package) that is generated for this class. The
     * class will always have DmcObject at the top of its derivation hierarchy. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmoImport(){
        return(mycore.getDmoImport());
    }

    /**
     * Sets dmoImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmoImport(Object value) throws DMFeedbackSet {
        mycore.setDmoImport(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassDMO 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmoClass(){
        return(mycore.getDmoClass());
    }

    /**
     * Sets dmoClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmoClass(Object value) throws DMFeedbackSet {
        mycore.setDmoClass(value);
    }

    /**
     * This attribute indicates the full name of the generated Dark Matter
     * Wrapper (DMW) class (including package) that is wrapped by this class. The
     * class will always be a derived class of DmwWrapperBase. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmwImport(){
        return(mycore.getDmwImport());
    }

    /**
     * Sets dmwImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmwImport(Object value) throws DMFeedbackSet {
        mycore.setDmwImport(value);
    }

    /**
     * This attribute indicates just the DMW class name, eg MyClassDMW 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmwClass(){
        return(mycore.getDmwClass());
    }

    /**
     * Sets dmwClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmwClass(Object value) throws DMFeedbackSet {
        mycore.setDmwClass(value);
    }

    /**
     * This attribute indicates the full name of the class that extends a DMW
     * class. Dark Matter Extended (DME). 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmeImport(){
        return(mycore.getDmeImport());
    }

    /**
     * Sets dmeImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmeImport(Object value) throws DMFeedbackSet {
        mycore.setDmeImport(value);
    }

    /**
     * This attribute indicates just the Dark Matter Extended (DME) class name. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmeClass(){
        return(mycore.getDmeClass());
    }

    /**
     * Sets dmeClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmeClass(Object value) throws DMFeedbackSet {
        mycore.setDmeClass(value);
    }

    /**
     * This attribute indicates the full name of the DmcType class used to
     * reference a class. These types are auto generated and named
     * DmcType<classname>REF. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmtImport(){
        return(mycore.getDmtImport());
    }

    /**
     * Sets dmtImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmtImport(Object value) throws DMFeedbackSet {
        mycore.setDmtImport(value);
    }

    /**
     * This attribute indicates the full name of the class used to reference a
     * class. These types are auto generated and named <classname>REF. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmtREFImport(){
        return(mycore.getDmtREFImport());
    }

    /**
     * Sets dmtREFImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmtREFImport(Object value) throws DMFeedbackSet {
        mycore.setDmtREFImport(value);
    }

    /**
     * This attribute indicates just the DmcType class name. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmtClass(){
        return(mycore.getDmtClass());
    }

    /**
     * Sets dmtClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmtClass(Object value) throws DMFeedbackSet {
        mycore.setDmtClass(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUXDMO 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmoAuxClass(){
        return(mycore.getDmoAuxClass());
    }

    /**
     * Sets dmoAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmoAuxClass(Object value) throws DMFeedbackSet {
        mycore.setDmoAuxClass(value);
    }

    /**
     * This attribute indicates the full name of the MyClassAUXDMO class 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmoAuxClassImport(){
        return(mycore.getDmoAuxClassImport());
    }

    /**
     * Sets dmoAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmoAuxClassImport(Object value) throws DMFeedbackSet {
        mycore.setDmoAuxClassImport(value);
    }

    /**
     * This attribute indicates just the DMO class name e.g. MyClassAUX 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmwAuxClass(){
        return(mycore.getDmwAuxClass());
    }

    /**
     * Sets dmwAuxClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmwAuxClass(Object value) throws DMFeedbackSet {
        mycore.setDmwAuxClass(value);
    }

    /**
     * This attribute indicates the full name of the MyClassAUX class 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmwAuxClassImport(){
        return(mycore.getDmwAuxClassImport());
    }

    /**
     * Sets dmwAuxClassImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmwAuxClassImport(Object value) throws DMFeedbackSet {
        mycore.setDmwAuxClassImport(value);
    }

    /**
     * This attribute indicates the full name of the DmcContainerIterator 
     * derived class that allows us to iterate over a set of object references
     * and get back the DMW wrapper object instead of the DMO. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmwIteratorImport(){
        return(mycore.getDmwIteratorImport());
    }

    /**
     * Sets dmwIteratorImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmwIteratorImport(Object value) throws DMFeedbackSet {
        mycore.setDmwIteratorImport(value);
    }

    /**
     * This attribute indicates just the DmcContainerIterator name for a class of
     * object. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmwIteratorClass(){
        return(mycore.getDmwIteratorClass());
    }

    /**
     * Sets dmwIteratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmwIteratorClass(Object value) throws DMFeedbackSet {
        mycore.setDmwIteratorClass(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:271)

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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:946)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmsModuleREF ref = ((ClassDefinitionDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}
