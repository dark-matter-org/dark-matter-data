//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012-2021 dark-matter-data committers
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


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1641)
import java.util.*;                           // To support access functions - (MetaGenerator.java:1614)
import org.dmd.dmc.*;                         // Basic dark-matter infrastructure - (MetaGenerator.java:1616)
import org.dmd.dmc.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1622)
import org.dmd.dms.generated.dmo.*;           // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)
import org.dmd.dms.generated.enums.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1619)
import org.dmd.dms.generated.types.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1620)
import org.dmd.dmw.*;                         // Base wrapper capabilities - (MetaGenerator.java:1617)
import org.dmd.util.exceptions.*;             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1621)

/**
 * This class is used to define a schema as a discrete, nameable entity. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1649)
 */
@SuppressWarnings("unused")
public abstract class SchemaDefinitionDMW extends org.dmd.dms.DmsDefinition {

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

    @Override
    public void setDmcObject(DmcObject obj) {
        core   = obj;
        mycore = (SchemaDefinitionDMO) obj;
        obj.setContainer(this);
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
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     * @return the DefinitionName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the package that a schema will be part of when its code\n is
     * generated using DMO generator tool. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public String getSchemaPackage(){
        return(mycore.getSchemaPackage());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setSchemaPackage(Object value) throws DmcValueException {
        mycore.setSchemaPackage(value);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value\n associated with the AttributeDefinitions defined by the schema.
     * This allows for easy rebasing of\n identifier values if required. 
     * @return the Integer
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public Integer getSchemaBaseID(){
        return(mycore.getSchemaBaseID());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setSchemaBaseID(Object value) throws DmcValueException {
        mycore.setSchemaBaseID(value);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide\n immediate feedback if you exceed the given ID range for
     * your schema. 
     * @return the Integer
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public Integer getSchemaIDRange(){
        return(mycore.getSchemaIDRange());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setSchemaIDRange(Object value) throws DmcValueException {
        mycore.setSchemaIDRange(value);
    }

    /**
     * A list of schema names. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2593)
    public Iterator<String> getDependsOn(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeStringMV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public void addDependsOn(Object value) throws DmcValueException {
        mycore.addDependsOn(value);
    }

    /**
     * @return the number of dependsOn values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getDependsOnSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependsOn);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of files that contain the class, attribute and type definitions\n
     * that comprise a schema. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2593)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeStringMV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public void addDefFiles(Object value) throws DmcValueException {
        mycore.addDefFiles(value);
    }

    /**
     * @return the number of defFiles values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getDefFilesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The name of file that coresides with the schema.dms file that\n contains a
     * common header to be applied to all generated code. For instance, you\n
     * might want a common licensing comment at the top of your generated files. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public String getGeneratedFileHeader(){
        return(mycore.getGeneratedFileHeader());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        mycore.setGeneratedFileHeader(value);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes \n
     * were generated for this schema. This is used when we're generating derived
     * wrapper\n classes. 
     * @return the String
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public String getDmwPackage(){
        return(mycore.getDmwPackage());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setDmwPackage(Object value) throws DmcValueException {
        mycore.setDmwPackage(value);
    }

    /**
     * The fully qualified name of a class that extends the schema management\n
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement\n the SchemaExtensionIF. 
     * @return the String
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2593)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public void addSchemaExtension(Object value) throws DmcValueException {
        mycore.addSchemaExtension(value);
    }

    /**
     * @return the number of schemaExtension values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getSchemaExtensionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation\n utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for\n the creation of attributes taht can then be embedded in complex
     * objects and properly\n serialized/deserialized. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public Boolean getCreateAttributeFactory(){
        return(mycore.getCreateAttributeFactory());
    }

    /**
     * Sets createAttributeFactory to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setCreateAttributeFactory(Object value) throws DmcValueException {
        mycore.setCreateAttributeFactory(value);
    }

    /**
     * The dmwTypeToPackage attribute is used to indicate alternative
     * generation\n packages for the Dark Matter Wrapper (DMW) code generation
     * mechanisms. For instance, if we \n want to generate GXT wrappers for use
     * with Sencha's GXT model classes, we could specify\n dmwTypeToPackage gxt
     * com.example.client. Each of schemas that's loaded for generation would\n
     * have to have this same attribute specified so that, if there were derived
     * classes across\n schemas, the appropriate wrapper derivations could be
     * determined. See the ClassDefintion.adjustClass()\n method to see how this
     * is used. 
     * @return the StringToString
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2593)
    public Iterator<StringToString> getDmwTypeToPackage(){
        DmcTypeStringToStringMV attr = (DmcTypeStringToStringMV) mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dmwTypeToPackage value.
     * @param value A value compatible with DmcTypeStringToStringMV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2665)
    public void addDmwTypeToPackage(Object value) throws DmcValueException {
        mycore.addDmwTypeToPackage(value);
    }

    /**
     * @return the number of dmwTypeToPackage values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getDmwTypeToPackageSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of class definition references. 
     * @return the ClassDefinition
     * @return An Iterator of ClassDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public ClassDefinitionIterableDMW getClassDefList(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) mycore.get(MetaDMSAG.__classDefList);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with ClassDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addClassDefList(ClassDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addClassDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of classDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getClassDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__classDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of type definition references. 
     * @return the TypeDefinition
     * @return An Iterator of TypeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public TypeDefinitionIterableDMW getTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) mycore.get(MetaDMSAG.__typeDefList);
        if (attr == null)
            return(TypeDefinitionIterableDMW.emptyList);

        return(new TypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with TypeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addTypeDefList(TypeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of typeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__typeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of complex type definition references. 
     * @return the ComplexTypeDefinition
     * @return An Iterator of ComplexTypeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public ComplexTypeDefinitionIterableDMW getComplexTypeDefList(){
        DmcTypeComplexTypeDefinitionREFMV attr = (DmcTypeComplexTypeDefinitionREFMV) mycore.get(MetaDMSAG.__complexTypeDefList);
        if (attr == null)
            return(ComplexTypeDefinitionIterableDMW.emptyList);

        return(new ComplexTypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another complexTypeDefList value.
     * @param value A value compatible with ComplexTypeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addComplexTypeDefList(ComplexTypeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addComplexTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of complexTypeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getComplexTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__complexTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of extended reference type definition references. 
     * @return the ExtendedReferenceTypeDefinition
     * @return An Iterator of ExtendedReferenceTypeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public ExtendedReferenceTypeDefinitionIterableDMW getExtendedReferenceTypeDefList(){
        DmcTypeExtendedReferenceTypeDefinitionREFMV attr = (DmcTypeExtendedReferenceTypeDefinitionREFMV) mycore.get(MetaDMSAG.__extendedReferenceTypeDefList);
        if (attr == null)
            return(ExtendedReferenceTypeDefinitionIterableDMW.emptyList);

        return(new ExtendedReferenceTypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another extendedReferenceTypeDefList value.
     * @param value A value compatible with ExtendedReferenceTypeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addExtendedReferenceTypeDefList(ExtendedReferenceTypeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addExtendedReferenceTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of extendedReferenceTypeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getExtendedReferenceTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__extendedReferenceTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of type definitions that were generated internally to represent\n
     * enums and object references. 
     * @return the TypeDefinition
     * @return An Iterator of TypeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public TypeDefinitionIterableDMW getInternalTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) mycore.get(MetaDMSAG.__internalTypeDefList);
        if (attr == null)
            return(TypeDefinitionIterableDMW.emptyList);

        return(new TypeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with TypeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addInternalTypeDefList(TypeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addInternalTypeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of internalTypeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getInternalTypeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__internalTypeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of attribute definition references. 
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getAttributeDefList(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__attributeDefList);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with AttributeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addAttributeDefList(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addAttributeDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of attributeDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getAttributeDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__attributeDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of action definition references. 
     * @return the ActionDefinition
     * @return An Iterator of ActionDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public ActionDefinitionIterableDMW getActionDefList(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) mycore.get(MetaDMSAG.__actionDefList);
        if (attr == null)
            return(ActionDefinitionIterableDMW.emptyList);

        return(new ActionDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with ActionDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addActionDefList(ActionDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addActionDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of actionDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getActionDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__actionDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of EnumDefinitions. 
     * @return the EnumDefinition
     * @return An Iterator of EnumDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public EnumDefinitionIterableDMW getEnumDefList(){
        DmcTypeEnumDefinitionREFMV attr = (DmcTypeEnumDefinitionREFMV) mycore.get(MetaDMSAG.__enumDefList);
        if (attr == null)
            return(EnumDefinitionIterableDMW.emptyList);

        return(new EnumDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with EnumDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addEnumDefList(EnumDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addEnumDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of enumDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getEnumDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__enumDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of slice definition references. 
     * @return the SliceDefinition
     * @return An Iterator of SliceDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public SliceDefinitionIterableDMW getSliceDefList(){
        DmcTypeSliceDefinitionREFMV attr = (DmcTypeSliceDefinitionREFMV) mycore.get(MetaDMSAG.__sliceDefList);
        if (attr == null)
            return(SliceDefinitionIterableDMW.emptyList);

        return(new SliceDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another sliceDefList value.
     * @param value A value compatible with SliceDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addSliceDefList(SliceDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addSliceDefList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of sliceDefList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getSliceDefListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__sliceDefList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn\n attribute. 
     * @return the SchemaDefinition
     * @return An Iterator of SchemaDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public SchemaDefinitionIterableDMW getDependsOnRef(){
        DmcTypeSchemaDefinitionREFMV attr = (DmcTypeSchemaDefinitionREFMV) mycore.get(MetaDMSAG.__dependsOnRef);
        if (attr == null)
            return(SchemaDefinitionIterableDMW.emptyList);

        return(new SchemaDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with SchemaDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addDependsOnRef(SchemaDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDependsOnRef(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of dependsOnRef values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getDependsOnRefSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependsOnRef);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The RuleCategories defined in a schema. 
     * @return the RuleCategory
     * @return An Iterator of RuleCategory objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public RuleCategoryIterableDMW getRuleCategoryList(){
        DmcTypeRuleCategoryREFMV attr = (DmcTypeRuleCategoryREFMV) mycore.get(MetaDMSAG.__ruleCategoryList);
        if (attr == null)
            return(RuleCategoryIterableDMW.emptyList);

        return(new RuleCategoryIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleCategoryList value.
     * @param value A value compatible with RuleCategory
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addRuleCategoryList(RuleCategory value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addRuleCategoryList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of ruleCategoryList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getRuleCategoryListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleCategoryList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The RuleDefinitions defined in a schema. 
     * @return the RuleDefinition
     * @return An Iterator of RuleDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public RuleDefinitionIterableDMW getRuleDefinitionList(){
        DmcTypeRuleDefinitionREFMV attr = (DmcTypeRuleDefinitionREFMV) mycore.get(MetaDMSAG.__ruleDefinitionList);
        if (attr == null)
            return(RuleDefinitionIterableDMW.emptyList);

        return(new RuleDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleDefinitionList value.
     * @param value A value compatible with RuleDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addRuleDefinitionList(RuleDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addRuleDefinitionList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of ruleDefinitionList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getRuleDefinitionListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleDefinitionList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The RuleData defined in a schema. 
     * @return the RuleData
     * @return An Iterator of RuleData objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public RuleDataIterableDMW getRuleDataList(){
        DmcTypeRuleDataREFMV attr = (DmcTypeRuleDataREFMV) mycore.get(MetaDMSAG.__ruleDataList);
        if (attr == null)
            return(RuleDataIterableDMW.emptyList);

        return(new RuleDataIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleDataList value.
     * @param value A value compatible with RuleData
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addRuleDataList(RuleData value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addRuleDataList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of ruleDataList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getRuleDataListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleDataList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The set of DSDefinitionModules defined in a schema. 
     * @return the DSDefinitionModule
     * @return An Iterator of DSDefinitionModule objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public DSDefinitionModuleIterableDMW getDsdModuleList(){
        DmcTypeDSDefinitionModuleREFMV attr = (DmcTypeDSDefinitionModuleREFMV) mycore.get(MetaDMSAG.__dsdModuleList);
        if (attr == null)
            return(DSDefinitionModuleIterableDMW.emptyList);

        return(new DSDefinitionModuleIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dsdModuleList value.
     * @param value A value compatible with DSDefinitionModule
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addDsdModuleList(DSDefinitionModule value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDsdModuleList(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of dsdModuleList values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getDsdModuleListSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dsdModuleList);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1816)

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
