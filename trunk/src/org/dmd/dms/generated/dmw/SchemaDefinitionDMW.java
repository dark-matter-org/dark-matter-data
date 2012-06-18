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

/**
 * This class is used to define a schema as a discrete, nameable entity.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1077)
 */
@SuppressWarnings("unused")
public class SchemaDefinitionDMW extends org.dmd.dms.DmsDefinition {

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

    protected SchemaDefinitionDMW(String mn) throws DmcValueException {
        super(new SchemaDefinitionDMO());
        mycore = (SchemaDefinitionDMO) core;
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Indicates the package that this schema will be part of when its code is
     * generated using the dafutil tool.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public String getSchemaPackage(){
        return(mycore.getSchemaPackage());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setSchemaPackage(Object value) throws DmcValueException {
        mycore.setSchemaPackage(value);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public Integer getSchemaBaseID(){
        return(mycore.getSchemaBaseID());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setSchemaBaseID(Object value) throws DmcValueException {
        mycore.setSchemaBaseID(value);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public Integer getSchemaIDRange(){
        return(mycore.getSchemaIDRange());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setSchemaIDRange(Object value) throws DmcValueException {
        mycore.setSchemaIDRange(value);
    }

    /**
     * A list of schema names.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1866)
    public Iterator<String> getDependsOn(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1913)
    public DmcAttribute<?> addDependsOn(Object value) throws DmcValueException {
        return(mycore.addDependsOn(value));
    }

    /**
     * Returns the number of dependsOn values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getDependsOnSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependsOn);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1866)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1913)
    public DmcAttribute<?> addDefFiles(Object value) throws DmcValueException {
        return(mycore.addDefFiles(value));
    }

    /**
     * Returns the number of defFiles values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getDefFilesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public String getGeneratedFileHeader(){
        return(mycore.getGeneratedFileHeader());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        mycore.setGeneratedFileHeader(value);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public String getDmwPackage(){
        return(mycore.getDmwPackage());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setDmwPackage(Object value) throws DmcValueException {
        mycore.setDmwPackage(value);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1866)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1913)
    public DmcAttribute<?> addSchemaExtension(Object value) throws DmcValueException {
        return(mycore.addSchemaExtension(value));
    }

    /**
     * Returns the number of schemaExtension values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getSchemaExtensionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for the creation of attributes taht can then be embedded in complex
     * objects and properly serialized/deserialized.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public Boolean getCreateAttributeFactory(){
        return(mycore.getCreateAttributeFactory());
    }

    /**
     * Sets createAttributeFactory to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setCreateAttributeFactory(Object value) throws DmcValueException {
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1866)
    public Iterator<StringToString> getDmwTypeToPackage(){
        DmcTypeStringToStringMV attr = (DmcTypeStringToStringMV) mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dmwTypeToPackage value.
     * @param value A value compatible with DmcTypeStringToStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1913)
    public DmcAttribute<?> addDmwTypeToPackage(Object value) throws DmcValueException {
        return(mycore.addDmwTypeToPackage(value));
    }

    /**
     * Returns the number of dmwTypeToPackage values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getDmwTypeToPackageSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of class definition references.
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addClassDefList(ClassDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addClassDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of classDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getClassDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__classDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of type definition references.
     * @return An Iterator of TypeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addTypeDefList(TypeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of typeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__typeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of complex type definition references.
     * @return An Iterator of ComplexTypeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addComplexTypeDefList(ComplexTypeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addComplexTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of complexTypeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getComplexTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__complexTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of extended reference type definition references.
     * @return An Iterator of ExtendedReferenceTypeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addExtendedReferenceTypeDefList(ExtendedReferenceTypeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addExtendedReferenceTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of extendedReferenceTypeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getExtendedReferenceTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__extendedReferenceTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references.
     * @return An Iterator of TypeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addInternalTypeDefList(TypeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addInternalTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of internalTypeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getInternalTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__internalTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of attribute definition references.
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addAttributeDefList(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addAttributeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of attributeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getAttributeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__attributeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of action definition references.
     * @return An Iterator of ActionDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addActionDefList(ActionDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addActionDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of actionDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getActionDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__actionDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of EnumDefinitions.
     * @return An Iterator of EnumDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addEnumDefList(EnumDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addEnumDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of enumDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getEnumDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__enumDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of slice definition references.
     * @return An Iterator of SliceDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addSliceDefList(SliceDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addSliceDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of sliceDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getSliceDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__sliceDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of object validator definition references.
     * @return An Iterator of ObjectValidatorDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
    public ObjectValidatorDefinitionIterableDMW getObjectValidatorDefList(){
        DmcTypeObjectValidatorDefinitionREFMV attr = (DmcTypeObjectValidatorDefinitionREFMV) mycore.get(MetaDMSAG.__objectValidatorDefList);
        if (attr == null)
            return(ObjectValidatorDefinitionIterableDMW.emptyList);

        return(new ObjectValidatorDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another objectValidatorDefList value.
     * @param value A value compatible with ObjectValidatorDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addObjectValidatorDefList(ObjectValidatorDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addObjectValidatorDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of objectValidatorDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getObjectValidatorDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__objectValidatorDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of attribute validator definition references.
     * @return An Iterator of AttributeValidatorDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
    public AttributeValidatorDefinitionIterableDMW getAttributeValidatorDefList(){
        DmcTypeAttributeValidatorDefinitionREFMV attr = (DmcTypeAttributeValidatorDefinitionREFMV) mycore.get(MetaDMSAG.__attributeValidatorDefList);
        if (attr == null)
            return(AttributeValidatorDefinitionIterableDMW.emptyList);

        return(new AttributeValidatorDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another attributeValidatorDefList value.
     * @param value A value compatible with AttributeValidatorDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addAttributeValidatorDefList(AttributeValidatorDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addAttributeValidatorDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of attributeValidatorDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getAttributeValidatorDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__attributeValidatorDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute.
     * @return An Iterator of SchemaDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1853)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1901)
    public DmcAttribute<?> addDependsOnRef(SchemaDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDependsOnRef(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of dependsOnRef values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getDependsOnRefSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependsOnRef);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    public StringName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
