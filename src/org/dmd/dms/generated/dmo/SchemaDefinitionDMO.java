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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1391)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1351)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1352)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1371)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1363)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1382)


/**
 * This class is used to define a schema as a discrete, nameable entity.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1400)
 */
@SuppressWarnings("serial")
public class SchemaDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__schemaBaseID.id,MetaDMSAG.__schemaBaseID);
        _ImAp.put(MetaDMSAG.__schemaIDRange.id,MetaDMSAG.__schemaIDRange);
        _ImAp.put(MetaDMSAG.__schemaPackage.id,MetaDMSAG.__schemaPackage);
        _ImAp.put(MetaDMSAG.__actionDefList.id,MetaDMSAG.__actionDefList);
        _ImAp.put(MetaDMSAG.__attributeDefList.id,MetaDMSAG.__attributeDefList);
        _ImAp.put(MetaDMSAG.__attributeValidatorDefList.id,MetaDMSAG.__attributeValidatorDefList);
        _ImAp.put(MetaDMSAG.__classDefList.id,MetaDMSAG.__classDefList);
        _ImAp.put(MetaDMSAG.__complexTypeDefList.id,MetaDMSAG.__complexTypeDefList);
        _ImAp.put(MetaDMSAG.__createAttributeFactory.id,MetaDMSAG.__createAttributeFactory);
        _ImAp.put(MetaDMSAG.__defFiles.id,MetaDMSAG.__defFiles);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__dependsOn.id,MetaDMSAG.__dependsOn);
        _ImAp.put(MetaDMSAG.__dependsOnRef.id,MetaDMSAG.__dependsOnRef);
        _ImAp.put(MetaDMSAG.__dmwPackage.id,MetaDMSAG.__dmwPackage);
        _ImAp.put(MetaDMSAG.__dmwTypeToPackage.id,MetaDMSAG.__dmwTypeToPackage);
        _ImAp.put(MetaDMSAG.__enumDefList.id,MetaDMSAG.__enumDefList);
        _ImAp.put(MetaDMSAG.__extendedReferenceTypeDefList.id,MetaDMSAG.__extendedReferenceTypeDefList);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__generatedFileHeader.id,MetaDMSAG.__generatedFileHeader);
        _ImAp.put(MetaDMSAG.__internalTypeDefList.id,MetaDMSAG.__internalTypeDefList);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__objectValidatorDefList.id,MetaDMSAG.__objectValidatorDefList);
        _ImAp.put(MetaDMSAG.__ruleCategoryList.id,MetaDMSAG.__ruleCategoryList);
        _ImAp.put(MetaDMSAG.__ruleDefinitionList.id,MetaDMSAG.__ruleDefinitionList);
        _ImAp.put(MetaDMSAG.__schemaExtension.id,MetaDMSAG.__schemaExtension);
        _ImAp.put(MetaDMSAG.__sliceDefList.id,MetaDMSAG.__sliceDefList);
        _ImAp.put(MetaDMSAG.__typeDefList.id,MetaDMSAG.__typeDefList);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__schemaBaseID.name,MetaDMSAG.__schemaBaseID);
        _SmAp.put(MetaDMSAG.__schemaIDRange.name,MetaDMSAG.__schemaIDRange);
        _SmAp.put(MetaDMSAG.__schemaPackage.name,MetaDMSAG.__schemaPackage);
        _SmAp.put(MetaDMSAG.__actionDefList.name,MetaDMSAG.__actionDefList);
        _SmAp.put(MetaDMSAG.__attributeDefList.name,MetaDMSAG.__attributeDefList);
        _SmAp.put(MetaDMSAG.__attributeValidatorDefList.name,MetaDMSAG.__attributeValidatorDefList);
        _SmAp.put(MetaDMSAG.__classDefList.name,MetaDMSAG.__classDefList);
        _SmAp.put(MetaDMSAG.__complexTypeDefList.name,MetaDMSAG.__complexTypeDefList);
        _SmAp.put(MetaDMSAG.__createAttributeFactory.name,MetaDMSAG.__createAttributeFactory);
        _SmAp.put(MetaDMSAG.__defFiles.name,MetaDMSAG.__defFiles);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__dependsOn.name,MetaDMSAG.__dependsOn);
        _SmAp.put(MetaDMSAG.__dependsOnRef.name,MetaDMSAG.__dependsOnRef);
        _SmAp.put(MetaDMSAG.__dmwPackage.name,MetaDMSAG.__dmwPackage);
        _SmAp.put(MetaDMSAG.__dmwTypeToPackage.name,MetaDMSAG.__dmwTypeToPackage);
        _SmAp.put(MetaDMSAG.__enumDefList.name,MetaDMSAG.__enumDefList);
        _SmAp.put(MetaDMSAG.__extendedReferenceTypeDefList.name,MetaDMSAG.__extendedReferenceTypeDefList);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__generatedFileHeader.name,MetaDMSAG.__generatedFileHeader);
        _SmAp.put(MetaDMSAG.__internalTypeDefList.name,MetaDMSAG.__internalTypeDefList);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__objectValidatorDefList.name,MetaDMSAG.__objectValidatorDefList);
        _SmAp.put(MetaDMSAG.__ruleCategoryList.name,MetaDMSAG.__ruleCategoryList);
        _SmAp.put(MetaDMSAG.__ruleDefinitionList.name,MetaDMSAG.__ruleDefinitionList);
        _SmAp.put(MetaDMSAG.__schemaExtension.name,MetaDMSAG.__schemaExtension);
        _SmAp.put(MetaDMSAG.__sliceDefList.name,MetaDMSAG.__sliceDefList);
        _SmAp.put(MetaDMSAG.__typeDefList.name,MetaDMSAG.__typeDefList);
    }


    public SchemaDefinitionDMO(){
        super("SchemaDefinition");
    }

    public SchemaDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public SchemaDefinitionDMO getNew(){
        SchemaDefinitionDMO rc = new SchemaDefinitionDMO();
        return(rc);
    }

    @Override
    public SchemaDefinitionDMO getSlice(DmcSliceInfo info){
        SchemaDefinitionDMO rc = new SchemaDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
    public Integer getSchemaBaseID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__schemaBaseID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setSchemaBaseID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__schemaBaseID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__schemaBaseID);
        
        attr.set(value);
        set(MetaDMSAG.__schemaBaseID,attr);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
    public Integer getSchemaIDRange(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__schemaIDRange);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setSchemaIDRange(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__schemaIDRange);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__schemaIDRange);
        
        attr.set(value);
        set(MetaDMSAG.__schemaIDRange,attr);
    }

    /**
     * Indicates the package that this schema will be part of when its code is
     * generated using the dafutil tool.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
    public String getSchemaPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__schemaPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setSchemaPackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__schemaPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__schemaPackage);
        
        attr.set(value);
        set(MetaDMSAG.__schemaPackage,attr);
    }

    /**
     * A list of action definition references.
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<ActionDefinitionREF> getActionDefList(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) get(MetaDMSAG.__actionDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with DmcTypeActionDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addActionDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__actionDefList);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREFMV(MetaDMSAG.__actionDefList);
        
        attr.add(value);
        add(MetaDMSAG.__actionDefList,attr);
        return(attr);
    }

    /**
     * A list of attribute definition references.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<AttributeDefinitionREF> getAttributeDefList(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(MetaDMSAG.__attributeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addAttributeDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__attributeDefList);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__attributeDefList);
        
        attr.add(value);
        add(MetaDMSAG.__attributeDefList,attr);
        return(attr);
    }

    /**
     * A list of attribute validator definition references.
     * @return An Iterator of AttributeValidatorDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<AttributeValidatorDefinitionREF> getAttributeValidatorDefList(){
        DmcTypeAttributeValidatorDefinitionREFMV attr = (DmcTypeAttributeValidatorDefinitionREFMV) get(MetaDMSAG.__attributeValidatorDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attributeValidatorDefList value.
     * @param value A value compatible with DmcTypeAttributeValidatorDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addAttributeValidatorDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__attributeValidatorDefList);
        if (attr == null)
            attr = new DmcTypeAttributeValidatorDefinitionREFMV(MetaDMSAG.__attributeValidatorDefList);
        
        attr.add(value);
        add(MetaDMSAG.__attributeValidatorDefList,attr);
        return(attr);
    }

    /**
     * A list of class definition references.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<ClassDefinitionREF> getClassDefList(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(MetaDMSAG.__classDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addClassDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__classDefList);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(MetaDMSAG.__classDefList);
        
        attr.add(value);
        add(MetaDMSAG.__classDefList,attr);
        return(attr);
    }

    /**
     * A list of complex type definition references.
     * @return An Iterator of ComplexTypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<ComplexTypeDefinitionREF> getComplexTypeDefList(){
        DmcTypeComplexTypeDefinitionREFMV attr = (DmcTypeComplexTypeDefinitionREFMV) get(MetaDMSAG.__complexTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another complexTypeDefList value.
     * @param value A value compatible with DmcTypeComplexTypeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addComplexTypeDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__complexTypeDefList);
        if (attr == null)
            attr = new DmcTypeComplexTypeDefinitionREFMV(MetaDMSAG.__complexTypeDefList);
        
        attr.add(value);
        add(MetaDMSAG.__complexTypeDefList,attr);
        return(attr);
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for the creation of attributes taht can then be embedded in complex
     * objects and properly serialized/deserialized.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
    public Boolean getCreateAttributeFactory(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__createAttributeFactory);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets createAttributeFactory to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setCreateAttributeFactory(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__createAttributeFactory);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__createAttributeFactory);
        
        attr.set(value);
        set(MetaDMSAG.__createAttributeFactory,attr);
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1888)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addDefFiles(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__defFiles);
        
        attr.add(value);
        add(MetaDMSAG.__defFiles,attr);
        return(attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * A list of schema names.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1888)
    public Iterator<String> getDependsOn(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addDependsOn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOn);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__dependsOn);
        
        attr.add(value);
        add(MetaDMSAG.__dependsOn,attr);
        return(attr);
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute.
     * @return An Iterator of SchemaDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<SchemaDefinitionREF> getDependsOnRef(){
        DmcTypeSchemaDefinitionREFMV attr = (DmcTypeSchemaDefinitionREFMV) get(MetaDMSAG.__dependsOnRef);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addDependsOnRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnRef);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFMV(MetaDMSAG.__dependsOnRef);
        
        attr.add(value);
        add(MetaDMSAG.__dependsOnRef,attr);
        return(attr);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
    public String getDmwPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__dmwPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setDmwPackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwPackage);
        
        attr.set(value);
        set(MetaDMSAG.__dmwPackage,attr);
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1888)
    public Iterator<StringToString> getDmwTypeToPackage(){
        DmcTypeStringToStringMV attr = (DmcTypeStringToStringMV) get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dmwTypeToPackage value.
     * @param value A value compatible with DmcTypeStringToStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addDmwTypeToPackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            attr = new DmcTypeStringToStringMV(MetaDMSAG.__dmwTypeToPackage);
        
        attr.add(value);
        add(MetaDMSAG.__dmwTypeToPackage,attr);
        return(attr);
    }

    /**
     * A list of EnumDefinitions.
     * @return An Iterator of EnumDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<EnumDefinitionREF> getEnumDefList(){
        DmcTypeEnumDefinitionREFMV attr = (DmcTypeEnumDefinitionREFMV) get(MetaDMSAG.__enumDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with DmcTypeEnumDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addEnumDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumDefList);
        if (attr == null)
            attr = new DmcTypeEnumDefinitionREFMV(MetaDMSAG.__enumDefList);
        
        attr.add(value);
        add(MetaDMSAG.__enumDefList,attr);
        return(attr);
    }

    /**
     * A list of extended reference type definition references.
     * @return An Iterator of ExtendedReferenceTypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<ExtendedReferenceTypeDefinitionREF> getExtendedReferenceTypeDefList(){
        DmcTypeExtendedReferenceTypeDefinitionREFMV attr = (DmcTypeExtendedReferenceTypeDefinitionREFMV) get(MetaDMSAG.__extendedReferenceTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another extendedReferenceTypeDefList value.
     * @param value A value compatible with DmcTypeExtendedReferenceTypeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addExtendedReferenceTypeDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendedReferenceTypeDefList);
        if (attr == null)
            attr = new DmcTypeExtendedReferenceTypeDefinitionREFMV(MetaDMSAG.__extendedReferenceTypeDefList);
        
        attr.add(value);
        add(MetaDMSAG.__extendedReferenceTypeDefList,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
    public String getGeneratedFileHeader(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__generatedFileHeader);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__generatedFileHeader);
        
        attr.set(value);
        set(MetaDMSAG.__generatedFileHeader,attr);
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references.
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<TypeDefinitionREF> getInternalTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) get(MetaDMSAG.__internalTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addInternalTypeDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__internalTypeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFMV(MetaDMSAG.__internalTypeDefList);
        
        attr.add(value);
        add(MetaDMSAG.__internalTypeDefList,attr);
        return(attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1745)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1796)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * A list of object validator definition references.
     * @return An Iterator of ObjectValidatorDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<ObjectValidatorDefinitionREF> getObjectValidatorDefList(){
        DmcTypeObjectValidatorDefinitionREFMV attr = (DmcTypeObjectValidatorDefinitionREFMV) get(MetaDMSAG.__objectValidatorDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another objectValidatorDefList value.
     * @param value A value compatible with DmcTypeObjectValidatorDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addObjectValidatorDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__objectValidatorDefList);
        if (attr == null)
            attr = new DmcTypeObjectValidatorDefinitionREFMV(MetaDMSAG.__objectValidatorDefList);
        
        attr.add(value);
        add(MetaDMSAG.__objectValidatorDefList,attr);
        return(attr);
    }

    /**
     * The RuleCategories defined in a schema.
     * @return An Iterator of RuleCategoryDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<RuleCategoryREF> getRuleCategoryList(){
        DmcTypeRuleCategoryREFMV attr = (DmcTypeRuleCategoryREFMV) get(MetaDMSAG.__ruleCategoryList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleCategoryList value.
     * @param value A value compatible with DmcTypeRuleCategoryREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addRuleCategoryList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleCategoryList);
        if (attr == null)
            attr = new DmcTypeRuleCategoryREFMV(MetaDMSAG.__ruleCategoryList);
        
        attr.add(value);
        add(MetaDMSAG.__ruleCategoryList,attr);
        return(attr);
    }

    /**
     * The RuleDefinitions defined in a schema.
     * @return An Iterator of RuleDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<RuleDefinitionREF> getRuleDefinitionList(){
        DmcTypeRuleDefinitionREFMV attr = (DmcTypeRuleDefinitionREFMV) get(MetaDMSAG.__ruleDefinitionList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleDefinitionList value.
     * @param value A value compatible with DmcTypeRuleDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addRuleDefinitionList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleDefinitionList);
        if (attr == null)
            attr = new DmcTypeRuleDefinitionREFMV(MetaDMSAG.__ruleDefinitionList);
        
        attr.add(value);
        add(MetaDMSAG.__ruleDefinitionList,attr);
        return(attr);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1888)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addSchemaExtension(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__schemaExtension);
        
        attr.add(value);
        add(MetaDMSAG.__schemaExtension,attr);
        return(attr);
    }

    /**
     * A list of slice definition references.
     * @return An Iterator of SliceDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<SliceDefinitionREF> getSliceDefList(){
        DmcTypeSliceDefinitionREFMV attr = (DmcTypeSliceDefinitionREFMV) get(MetaDMSAG.__sliceDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another sliceDefList value.
     * @param value A value compatible with DmcTypeSliceDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addSliceDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__sliceDefList);
        if (attr == null)
            attr = new DmcTypeSliceDefinitionREFMV(MetaDMSAG.__sliceDefList);
        
        attr.add(value);
        add(MetaDMSAG.__sliceDefList,attr);
        return(attr);
    }

    /**
     * A list of type definition references.
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1882)
    public Iterator<TypeDefinitionREF> getTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) get(MetaDMSAG.__typeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1933)
    public DmcAttribute<?> addTypeDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__typeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFMV(MetaDMSAG.__typeDefList);
        
        attr.add(value);
        add(MetaDMSAG.__typeDefList,attr);
        return(attr);
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
