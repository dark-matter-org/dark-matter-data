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
 * This class is used to define a schema as a discrete, nameable entity.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:830)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }

    /**
     * Indicates the package that this schema will be part of when its code is
     * generated using the dafutil tool.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public String getSchemaPackage(){
        return(mycore.getSchemaPackage());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setSchemaPackage(Object value) throws DmcValueException {
        mycore.setSchemaPackage(value);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public Integer getSchemaBaseID(){
        return(mycore.getSchemaBaseID());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setSchemaBaseID(Object value) throws DmcValueException {
        mycore.setSchemaBaseID(value);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public Integer getSchemaIDRange(){
        return(mycore.getSchemaIDRange());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setSchemaIDRange(Object value) throws DmcValueException {
        mycore.setSchemaIDRange(value);
    }

    /**
     * A list of schema names.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1498)
    public Iterator<String> getDependsOn(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(SchemaDefinitionDMO.__dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeStringMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1545)
    public DmcAttribute addDependsOn(Object value) throws DmcValueException {
        return(mycore.addDependsOn(value));
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1498)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(SchemaDefinitionDMO.__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeStringMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1545)
    public DmcAttribute addDefFiles(Object value) throws DmcValueException {
        return(mycore.addDefFiles(value));
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public String getGeneratedFileHeader(){
        return(mycore.getGeneratedFileHeader());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        mycore.setGeneratedFileHeader(value);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public String getDmwPackage(){
        return(mycore.getDmwPackage());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setDmwPackage(Object value) throws DmcValueException {
        mycore.setDmwPackage(value);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1498)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(SchemaDefinitionDMO.__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1545)
    public DmcAttribute addSchemaExtension(Object value) throws DmcValueException {
        return(mycore.addSchemaExtension(value));
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for the creation of attributes taht can then be embedded in complex
     * objects and properly serialized/deserialized.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1354)
    public Boolean getCreateAttributeFactory(){
        return(mycore.getCreateAttributeFactory());
    }

    /**
     * Sets createAttributeFactory to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1406)
    public void setCreateAttributeFactory(Object value) throws DmcValueException {
        mycore.setCreateAttributeFactory(value);
    }

    /**
     * A list of class definition references.
     * @return An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1486)
    public ClassDefinitionIterableDMW getClassDefList(){
        DmcAttribute attr = (DmcTypeClassDefinitionREFMV) mycore.get(SchemaDefinitionDMO.__classDefList);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1533)
    public DmcAttribute addClassDefList(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addClassDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * A list of type definition references.
     * @return An Iterator of TypeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1486)
    public TypeDefinitionIterableDMW getTypeDefList(){
        DmcAttribute attr = (DmcTypeTypeDefinitionREFMV) mycore.get(SchemaDefinitionDMO.__typeDefList);
        if (attr == null)
            return(TypeDefinitionIterableDMW.emptyList);

        return(new TypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with TypeDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1533)
    public DmcAttribute addTypeDefList(TypeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references.
     * @return An Iterator of TypeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1486)
    public TypeDefinitionIterableDMW getInternalTypeDefList(){
        DmcAttribute attr = (DmcTypeTypeDefinitionREFMV) mycore.get(SchemaDefinitionDMO.__internalTypeDefList);
        if (attr == null)
            return(TypeDefinitionIterableDMW.emptyList);

        return(new TypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with TypeDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1533)
    public DmcAttribute addInternalTypeDefList(TypeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addInternalTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * A list of attribute definition references.
     * @return An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1486)
    public AttributeDefinitionIterableDMW getAttributeDefList(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(SchemaDefinitionDMO.__attributeDefList);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with AttributeDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1533)
    public DmcAttribute addAttributeDefList(AttributeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addAttributeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * A list of action definition references.
     * @return An Iterator of ActionDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1486)
    public ActionDefinitionIterableDMW getActionDefList(){
        DmcAttribute attr = (DmcTypeActionDefinitionREFMV) mycore.get(SchemaDefinitionDMO.__actionDefList);
        if (attr == null)
            return(ActionDefinitionIterableDMW.emptyList);

        return(new ActionDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with ActionDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1533)
    public DmcAttribute addActionDefList(ActionDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addActionDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * A list of EnumDefinitions.
     * @return An Iterator of EnumDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1486)
    public EnumDefinitionIterableDMW getEnumDefList(){
        DmcAttribute attr = (DmcTypeEnumDefinitionREFMV) mycore.get(SchemaDefinitionDMO.__enumDefList);
        if (attr == null)
            return(EnumDefinitionIterableDMW.emptyList);

        return(new EnumDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with EnumDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1533)
    public DmcAttribute addEnumDefList(EnumDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addEnumDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute.
     * @return An Iterator of SchemaDefinition objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1486)
    public SchemaDefinitionIterableDMW getDependsOnRef(){
        DmcAttribute attr = (DmcTypeSchemaDefinitionREFMV) mycore.get(SchemaDefinitionDMO.__dependsOnRef);
        if (attr == null)
            return(SchemaDefinitionIterableDMW.emptyList);

        return(new SchemaDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with SchemaDefinition
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1533)
    public DmcAttribute addDependsOnRef(SchemaDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addDependsOnRef(value.getDmcObject());
        return(attr);
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
