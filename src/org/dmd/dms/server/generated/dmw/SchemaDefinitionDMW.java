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
import java.util.*;                                  // To support access functions - (DmwFormatter.java:75)
import org.dmd.core.*;                               // Basic dark-matter infrastructure - (DmwFormatter.java:77)
import org.dmd.core.feedback.*;                      // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:83)
import org.dmd.dms.server.extended.*;                // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:79)
import org.dmd.dms.shared.generated.dmo.*;           // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:80)
import org.dmd.dms.shared.generated.enums.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:81)
import org.dmd.dms.shared.generated.types.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:82)
import org.dmd.dms.shared.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dmw.*;                                // Base wrapper capabilities - (DmwFormatter.java:78)

/**
 * This class is used to define a schema as a discrete, nameable entity. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public abstract class SchemaDefinitionDMW extends org.dmd.dms.server.extended.DmsDefinition {

    private SchemaDefinitionDMO mycore;

    protected SchemaDefinitionDMW() {
        super(new SchemaDefinitionDMO());
        mycore = (SchemaDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected SchemaDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (SchemaDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected SchemaDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (SchemaDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  SchemaDefinitionDMO getDMO() {
        return(mycore);
    }

    protected SchemaDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected SchemaDefinitionDMW(String mn) throws DMFeedbackSet {
        super(new SchemaDefinitionDMO());
        mycore = (SchemaDefinitionDMO) core;
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setName(Object value) throws DMFeedbackSet {
        mycore.setName(value);
    }

    /**
     * Indicates the package that a schema will be part of when its code is
     * generated using DMO generator tool. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getSchemaPackage(){
        return(mycore.getSchemaPackage());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setSchemaPackage(Object value) throws DMFeedbackSet {
        mycore.setSchemaPackage(value);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Integer getSchemaBaseID(){
        return(mycore.getSchemaBaseID());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setSchemaBaseID(Object value) throws DMFeedbackSet {
        mycore.setSchemaBaseID(value);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Integer getSchemaIDRange(){
        return(mycore.getSchemaIDRange());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setSchemaIDRange(Object value) throws DMFeedbackSet {
        mycore.setSchemaIDRange(value);
    }

    /**
     * A list of schema names. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public StringIterableDMW getDependsOnIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__dependsOn);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addDependsOn(Object value) throws DMFeedbackSet {
        mycore.addDependsOn(value);
    }

    /**
     * Returns the number of dependsOn values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDependsOnSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependsOn);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dependsOn has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDependsOnHasValue(){
        return(getDependsOnSize() > 0);
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public StringIterableDMW getDefFilesIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addDefFiles(Object value) throws DMFeedbackSet {
        mycore.addDefFiles(value);
    }

    /**
     * Returns the number of defFiles values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDefFilesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if defFiles has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDefFilesHasValue(){
        return(getDefFilesSize() > 0);
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getGeneratedFileHeader(){
        return(mycore.getGeneratedFileHeader());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setGeneratedFileHeader(Object value) throws DMFeedbackSet {
        mycore.setGeneratedFileHeader(value);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getDmwPackage(){
        return(mycore.getDmwPackage());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setDmwPackage(Object value) throws DMFeedbackSet {
        mycore.setDmwPackage(value);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public StringIterableDMW getSchemaExtensionIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addSchemaExtension(Object value) throws DMFeedbackSet {
        mycore.addSchemaExtension(value);
    }

    /**
     * Returns the number of schemaExtension values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getSchemaExtensionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if schemaExtension has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getSchemaExtensionHasValue(){
        return(getSchemaExtensionSize() > 0);
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for the creation of attributes taht can then be embedded in complex
     * objects and properly serialized/deserialized. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getCreateAttributeFactory(){
        return(mycore.getCreateAttributeFactory());
    }

    /**
     * Sets createAttributeFactory to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setCreateAttributeFactory(Object value) throws DMFeedbackSet {
        mycore.setCreateAttributeFactory(value);
    }

    /**
     * The dmwTypeToPackage attribute is used to indicate alternative generation
     * packages for the Dark Matter Wrapper (DMW) code generation mechanisms. For
     * instance, if we  want to generate GXT wrappers for use with Sencha's GXT
     * model classes, we could specify dmwTypeToPackage gxt com.example.client.
     * Each of schemas that's loaded for generation would have to have this same
     * attribute specified so that, if there were derived classes across schemas,
     * the appropriate wrapper derivations could be determined. See the
     * ClassDefintion.adjustClass() method to see how this is used. 
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public StringToStringIterableDMW getDmwTypeToPackageIterable(){
        DmcTypeStringToStringMV attr = (DmcTypeStringToStringMV) mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(StringToStringIterableDMW.emptyList);

        return(new StringToStringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dmwTypeToPackage value.
     * @param value A value compatible with DmcTypeStringToStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addDmwTypeToPackage(Object value) throws DMFeedbackSet {
        mycore.addDmwTypeToPackage(value);
    }

    /**
     * Returns the number of dmwTypeToPackage values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDmwTypeToPackageSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dmwTypeToPackage has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDmwTypeToPackageHasValue(){
        return(getDmwTypeToPackageSize() > 0);
    }

    /**
     * A list of class definition references. 
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public ClassDefinitionIterableDMW getClassDefList(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) mycore.get(MetaDMSAG.__classDefList);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addClassDefList(ClassDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addClassDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of classDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getClassDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__classDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if classDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getClassDefListHasValue(){
        return(getClassDefListSize() > 0);
    }

    /**
     * A list of type definition references. 
     * @return An Iterator of TypeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public TypeDefinitionIterableDMW getTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) mycore.get(MetaDMSAG.__typeDefList);
        if (attr == null)
            return(TypeDefinitionIterableDMW.emptyList);

        return(new TypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with TypeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addTypeDefList(TypeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of typeDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__typeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if typeDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getTypeDefListHasValue(){
        return(getTypeDefListSize() > 0);
    }

    /**
     * A list of complex type definition references. 
     * @return An Iterator of ComplexTypeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public ComplexTypeDefinitionIterableDMW getComplexTypeDefList(){
        DmcTypeComplexTypeDefinitionREFMV attr = (DmcTypeComplexTypeDefinitionREFMV) mycore.get(MetaDMSAG.__complexTypeDefList);
        if (attr == null)
            return(ComplexTypeDefinitionIterableDMW.emptyList);

        return(new ComplexTypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another complexTypeDefList value.
     * @param value A value compatible with ComplexTypeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addComplexTypeDefList(ComplexTypeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addComplexTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of complexTypeDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getComplexTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__complexTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if complexTypeDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getComplexTypeDefListHasValue(){
        return(getComplexTypeDefListSize() > 0);
    }

    /**
     * A list of extended reference type definition references. 
     * @return An Iterator of ExtendedReferenceTypeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public ExtendedReferenceTypeDefinitionIterableDMW getExtendedReferenceTypeDefList(){
        DmcTypeExtendedReferenceTypeDefinitionREFMV attr = (DmcTypeExtendedReferenceTypeDefinitionREFMV) mycore.get(MetaDMSAG.__extendedReferenceTypeDefList);
        if (attr == null)
            return(ExtendedReferenceTypeDefinitionIterableDMW.emptyList);

        return(new ExtendedReferenceTypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another extendedReferenceTypeDefList value.
     * @param value A value compatible with ExtendedReferenceTypeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addExtendedReferenceTypeDefList(ExtendedReferenceTypeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addExtendedReferenceTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of extendedReferenceTypeDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getExtendedReferenceTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__extendedReferenceTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if extendedReferenceTypeDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getExtendedReferenceTypeDefListHasValue(){
        return(getExtendedReferenceTypeDefListSize() > 0);
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references. 
     * @return An Iterator of TypeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public TypeDefinitionIterableDMW getInternalTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) mycore.get(MetaDMSAG.__internalTypeDefList);
        if (attr == null)
            return(TypeDefinitionIterableDMW.emptyList);

        return(new TypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with TypeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addInternalTypeDefList(TypeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addInternalTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of internalTypeDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getInternalTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__internalTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if internalTypeDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getInternalTypeDefListHasValue(){
        return(getInternalTypeDefListSize() > 0);
    }

    /**
     * A list of attribute definition references. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public AttributeDefinitionIterableDMW getAttributeDefList(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__attributeDefList);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addAttributeDefList(AttributeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addAttributeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of attributeDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getAttributeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__attributeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if attributeDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getAttributeDefListHasValue(){
        return(getAttributeDefListSize() > 0);
    }

    /**
     * A list of action definition references. 
     * @return An Iterator of ActionDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public ActionDefinitionIterableDMW getActionDefList(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) mycore.get(MetaDMSAG.__actionDefList);
        if (attr == null)
            return(ActionDefinitionIterableDMW.emptyList);

        return(new ActionDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with ActionDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addActionDefList(ActionDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addActionDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of actionDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getActionDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__actionDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if actionDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getActionDefListHasValue(){
        return(getActionDefListSize() > 0);
    }

    /**
     * A list of EnumDefinitions. 
     * @return An Iterator of EnumDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public EnumDefinitionIterableDMW getEnumDefList(){
        DmcTypeEnumDefinitionREFMV attr = (DmcTypeEnumDefinitionREFMV) mycore.get(MetaDMSAG.__enumDefList);
        if (attr == null)
            return(EnumDefinitionIterableDMW.emptyList);

        return(new EnumDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with EnumDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addEnumDefList(EnumDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addEnumDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of enumDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getEnumDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__enumDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if enumDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getEnumDefListHasValue(){
        return(getEnumDefListSize() > 0);
    }

    /**
     * A list of slice definition references. 
     * @return An Iterator of SliceDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public SliceDefinitionIterableDMW getSliceDefList(){
        DmcTypeSliceDefinitionREFMV attr = (DmcTypeSliceDefinitionREFMV) mycore.get(MetaDMSAG.__sliceDefList);
        if (attr == null)
            return(SliceDefinitionIterableDMW.emptyList);

        return(new SliceDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another sliceDefList value.
     * @param value A value compatible with SliceDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addSliceDefList(SliceDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addSliceDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of sliceDefList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getSliceDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__sliceDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if sliceDefList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getSliceDefListHasValue(){
        return(getSliceDefListSize() > 0);
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute. 
     * @return An Iterator of SchemaDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public SchemaDefinitionIterableDMW getDependsOnRef(){
        DmcTypeSchemaDefinitionREFMV attr = (DmcTypeSchemaDefinitionREFMV) mycore.get(MetaDMSAG.__dependsOnRef);
        if (attr == null)
            return(SchemaDefinitionIterableDMW.emptyList);

        return(new SchemaDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with SchemaDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addDependsOnRef(SchemaDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addDependsOnRef(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of dependsOnRef values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDependsOnRefSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependsOnRef);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dependsOnRef has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDependsOnRefHasValue(){
        return(getDependsOnRefSize() > 0);
    }

    /**
     * The RuleCategories defined in a schema. 
     * @return An Iterator of RuleCategory objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public RuleCategoryIterableDMW getRuleCategoryList(){
        DmcTypeRuleCategoryREFMV attr = (DmcTypeRuleCategoryREFMV) mycore.get(MetaDMSAG.__ruleCategoryList);
        if (attr == null)
            return(RuleCategoryIterableDMW.emptyList);

        return(new RuleCategoryIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleCategoryList value.
     * @param value A value compatible with RuleCategory
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addRuleCategoryList(RuleCategory value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addRuleCategoryList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of ruleCategoryList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getRuleCategoryListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleCategoryList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if ruleCategoryList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getRuleCategoryListHasValue(){
        return(getRuleCategoryListSize() > 0);
    }

    /**
     * The RuleDefinitions defined in a schema. 
     * @return An Iterator of RuleDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public RuleDefinitionIterableDMW getRuleDefinitionList(){
        DmcTypeRuleDefinitionREFMV attr = (DmcTypeRuleDefinitionREFMV) mycore.get(MetaDMSAG.__ruleDefinitionList);
        if (attr == null)
            return(RuleDefinitionIterableDMW.emptyList);

        return(new RuleDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleDefinitionList value.
     * @param value A value compatible with RuleDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addRuleDefinitionList(RuleDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addRuleDefinitionList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of ruleDefinitionList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getRuleDefinitionListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleDefinitionList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if ruleDefinitionList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getRuleDefinitionListHasValue(){
        return(getRuleDefinitionListSize() > 0);
    }

    /**
     * The RuleData defined in a schema. 
     * @return An Iterator of RuleData objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public RuleDataIterableDMW getRuleDataList(){
        DmcTypeRuleDataREFMV attr = (DmcTypeRuleDataREFMV) mycore.get(MetaDMSAG.__ruleDataList);
        if (attr == null)
            return(RuleDataIterableDMW.emptyList);

        return(new RuleDataIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleDataList value.
     * @param value A value compatible with RuleData
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addRuleDataList(RuleData value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addRuleDataList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of ruleDataList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getRuleDataListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleDataList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if ruleDataList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getRuleDataListHasValue(){
        return(getRuleDataListSize() > 0);
    }

    /**
     * The set of DSDefinitionModules defined in a schema. 
     * @return An Iterator of DSDefinitionModule objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public DSDefinitionModuleIterableDMW getDsdModuleList(){
        DmcTypeDSDefinitionModuleREFMV attr = (DmcTypeDSDefinitionModuleREFMV) mycore.get(MetaDMSAG.__dsdModuleList);
        if (attr == null)
            return(DSDefinitionModuleIterableDMW.emptyList);

        return(new DSDefinitionModuleIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dsdModuleList value.
     * @param value A value compatible with DSDefinitionModule
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addDsdModuleList(DSDefinitionModule value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addDsdModuleList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of dsdModuleList values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDsdModuleListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dsdModuleList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dsdModuleList has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDsdModuleListHasValue(){
        return(getDsdModuleListSize() > 0);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:927)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmsModuleREF ref = ((SchemaDefinitionDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}
