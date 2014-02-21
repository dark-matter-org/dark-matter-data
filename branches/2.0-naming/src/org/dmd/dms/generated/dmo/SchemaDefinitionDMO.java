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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1935)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1884)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1886)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1908)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1898)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1924)



/**
 * This class is used to define a schema as a discrete, nameable entity. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1945)
 */
@SuppressWarnings("serial")
public class SchemaDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__schemaBaseID.id,MetaDMSAG.__schemaBaseID);
        _ImAp.put(MetaDMSAG.__schemaIDRange.id,MetaDMSAG.__schemaIDRange);
        _ImAp.put(MetaDMSAG.__schemaPackage.id,MetaDMSAG.__schemaPackage);
        _ImAp.put(MetaDMSAG.__actionDefList.id,MetaDMSAG.__actionDefList);
        _ImAp.put(MetaDMSAG.__attributeDefList.id,MetaDMSAG.__attributeDefList);
        _ImAp.put(MetaDMSAG.__classDefList.id,MetaDMSAG.__classDefList);
        _ImAp.put(MetaDMSAG.__complexTypeDefList.id,MetaDMSAG.__complexTypeDefList);
        _ImAp.put(MetaDMSAG.__createAttributeFactory.id,MetaDMSAG.__createAttributeFactory);
        _ImAp.put(MetaDMSAG.__defFiles.id,MetaDMSAG.__defFiles);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__dependsOn.id,MetaDMSAG.__dependsOn);
        _ImAp.put(MetaDMSAG.__dependsOnRef.id,MetaDMSAG.__dependsOnRef);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dmwPackage.id,MetaDMSAG.__dmwPackage);
        _ImAp.put(MetaDMSAG.__dmwTypeToPackage.id,MetaDMSAG.__dmwTypeToPackage);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__dsdModuleList.id,MetaDMSAG.__dsdModuleList);
        _ImAp.put(MetaDMSAG.__enumDefList.id,MetaDMSAG.__enumDefList);
        _ImAp.put(MetaDMSAG.__exampleUsage.id,MetaDMSAG.__exampleUsage);
        _ImAp.put(MetaDMSAG.__extendedReferenceTypeDefList.id,MetaDMSAG.__extendedReferenceTypeDefList);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__generatedFileHeader.id,MetaDMSAG.__generatedFileHeader);
        _ImAp.put(MetaDMSAG.__internalTypeDefList.id,MetaDMSAG.__internalTypeDefList);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__relatedToConcept.id,MetaDMSAG.__relatedToConcept);
        _ImAp.put(MetaDMSAG.__ruleCategoryList.id,MetaDMSAG.__ruleCategoryList);
        _ImAp.put(MetaDMSAG.__ruleDataList.id,MetaDMSAG.__ruleDataList);
        _ImAp.put(MetaDMSAG.__ruleDefinitionList.id,MetaDMSAG.__ruleDefinitionList);
        _ImAp.put(MetaDMSAG.__schemaExtension.id,MetaDMSAG.__schemaExtension);
        _ImAp.put(MetaDMSAG.__sliceDefList.id,MetaDMSAG.__sliceDefList);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);
        _ImAp.put(MetaDMSAG.__typeDefList.id,MetaDMSAG.__typeDefList);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__schemaBaseID.name,MetaDMSAG.__schemaBaseID);
        _SmAp.put(MetaDMSAG.__schemaIDRange.name,MetaDMSAG.__schemaIDRange);
        _SmAp.put(MetaDMSAG.__schemaPackage.name,MetaDMSAG.__schemaPackage);
        _SmAp.put(MetaDMSAG.__actionDefList.name,MetaDMSAG.__actionDefList);
        _SmAp.put(MetaDMSAG.__attributeDefList.name,MetaDMSAG.__attributeDefList);
        _SmAp.put(MetaDMSAG.__classDefList.name,MetaDMSAG.__classDefList);
        _SmAp.put(MetaDMSAG.__complexTypeDefList.name,MetaDMSAG.__complexTypeDefList);
        _SmAp.put(MetaDMSAG.__createAttributeFactory.name,MetaDMSAG.__createAttributeFactory);
        _SmAp.put(MetaDMSAG.__defFiles.name,MetaDMSAG.__defFiles);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__dependsOn.name,MetaDMSAG.__dependsOn);
        _SmAp.put(MetaDMSAG.__dependsOnRef.name,MetaDMSAG.__dependsOnRef);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dmwPackage.name,MetaDMSAG.__dmwPackage);
        _SmAp.put(MetaDMSAG.__dmwTypeToPackage.name,MetaDMSAG.__dmwTypeToPackage);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__dsdModuleList.name,MetaDMSAG.__dsdModuleList);
        _SmAp.put(MetaDMSAG.__enumDefList.name,MetaDMSAG.__enumDefList);
        _SmAp.put(MetaDMSAG.__exampleUsage.name,MetaDMSAG.__exampleUsage);
        _SmAp.put(MetaDMSAG.__extendedReferenceTypeDefList.name,MetaDMSAG.__extendedReferenceTypeDefList);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__generatedFileHeader.name,MetaDMSAG.__generatedFileHeader);
        _SmAp.put(MetaDMSAG.__internalTypeDefList.name,MetaDMSAG.__internalTypeDefList);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__relatedToConcept.name,MetaDMSAG.__relatedToConcept);
        _SmAp.put(MetaDMSAG.__ruleCategoryList.name,MetaDMSAG.__ruleCategoryList);
        _SmAp.put(MetaDMSAG.__ruleDataList.name,MetaDMSAG.__ruleDataList);
        _SmAp.put(MetaDMSAG.__ruleDefinitionList.name,MetaDMSAG.__ruleDefinitionList);
        _SmAp.put(MetaDMSAG.__schemaExtension.name,MetaDMSAG.__schemaExtension);
        _SmAp.put(MetaDMSAG.__sliceDefList.name,MetaDMSAG.__sliceDefList);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
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
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value\n associated with the AttributeDefinitions defined by the schema.
     * This allows for easy rebasing of\n identifier values if required. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setSchemaBaseID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__schemaBaseID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__schemaBaseID);
        
        attr.set(value);
        set(MetaDMSAG.__schemaBaseID,attr);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide\n immediate feedback if you exceed the given ID range for
     * your schema. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setSchemaIDRange(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__schemaIDRange);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__schemaIDRange);
        
        attr.set(value);
        set(MetaDMSAG.__schemaIDRange,attr);
    }

    /**
     * Indicates the package that a schema will be part of when its code\n is
     * generated using DMO generator tool. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addAttributeDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__attributeDefList);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(MetaDMSAG.__attributeDefList);
        
        attr.add(value);
        add(MetaDMSAG.__attributeDefList,attr);
        return(attr);
    }

    /**
     * A list of class definition references. 
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addComplexTypeDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__complexTypeDefList);
        if (attr == null)
            attr = new DmcTypeComplexTypeDefinitionREFMV(MetaDMSAG.__complexTypeDefList);
        
        attr.add(value);
        add(MetaDMSAG.__complexTypeDefList,attr);
        return(attr);
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation\n utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for\n the creation of attributes taht can then be embedded in complex
     * objects and properly\n serialized/deserialized. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setCreateAttributeFactory(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__createAttributeFactory);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__createAttributeFactory);
        
        attr.set(value);
        set(MetaDMSAG.__createAttributeFactory,attr);
    }

    /**
     * A list of files that contain the class, attribute and type definitions\n
     * that comprise a schema. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
     * dependsOn\n attribute. 
     * @return An Iterator of SchemaDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addDependsOnRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnRef);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFMV(MetaDMSAG.__dependsOnRef);
        
        attr.add(value);
        add(MetaDMSAG.__dependsOnRef,attr);
        return(attr);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2546)
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
     * Indicates the package where server related Dark Matter Wrapper classes \n
     * were generated for this schema. This is used when we're generating derived
     * wrapper\n classes. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setDmwPackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__dmwPackage);
        
        attr.set(value);
        set(MetaDMSAG.__dmwPackage,attr);
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
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addDmwTypeToPackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            attr = new DmcTypeStringToStringMV(MetaDMSAG.__dmwTypeToPackage);
        
        attr.add(value);
        add(MetaDMSAG.__dmwTypeToPackage,attr);
        return(attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * The set of DSDefinitionModules defined in a schema. 
     * @return An Iterator of DSDefinitionModuleDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
    public Iterator<DSDefinitionModuleREF> getDsdModuleList(){
        DmcTypeDSDefinitionModuleREFMV attr = (DmcTypeDSDefinitionModuleREFMV) get(MetaDMSAG.__dsdModuleList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dsdModuleList value.
     * @param value A value compatible with DmcTypeDSDefinitionModuleREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addDsdModuleList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dsdModuleList);
        if (attr == null)
            attr = new DmcTypeDSDefinitionModuleREFMV(MetaDMSAG.__dsdModuleList);
        
        attr.add(value);
        add(MetaDMSAG.__dsdModuleList,attr);
        return(attr);
    }

    /**
     * A list of EnumDefinitions. 
     * @return An Iterator of EnumDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addEnumDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumDefList);
        if (attr == null)
            attr = new DmcTypeEnumDefinitionREFMV(MetaDMSAG.__enumDefList);
        
        attr.add(value);
        add(MetaDMSAG.__enumDefList,attr);
        return(attr);
    }

    /**
     * The exampleUsage attribute is used to provide additional\n examples of how
     * some defined thing is to be used. The convention for this field\n is to
     * provide a title for the example followed by a colon. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
    public Iterator<String> getExampleUsage(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__exampleUsage);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2546)
    public Iterator<String> getExampleUsageWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__exampleUsage);
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
     * Adds another exampleUsage value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addExampleUsage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__exampleUsage);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__exampleUsage);
        
        attr.add(value);
        add(MetaDMSAG.__exampleUsage,attr);
        return(attr);
    }

    /**
     * A list of extended reference type definition references. 
     * @return An Iterator of ExtendedReferenceTypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * The name of file that coresides with the schema.dms file that\n contains a
     * common header to be applied to all generated code. For instance, you\n
     * might want a common licensing comment at the top of your generated files. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__generatedFileHeader);
        
        attr.set(value);
        set(MetaDMSAG.__generatedFileHeader,attr);
    }

    /**
     * A list of type definitions that were generated internally to represent\n
     * enums and object references. 
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Allows for references to base concepts that relate this\n definition to
     * another definition in the Concinnity domain. This mechanism is only used\n
     * in the domain of dark-matter schema definitions; other DSLs will allow for
     * direct\n reference to Concinnity concepts. 
     * @return An Iterator of ConcinnityDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
    public Iterator<ConcinnityREF> getRelatedToConcept(){
        DmcTypeConcinnityREFMV attr = (DmcTypeConcinnityREFMV) get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another relatedToConcept value.
     * @param value A value compatible with DmcTypeConcinnityREFMV
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
     * The RuleCategories defined in a schema. 
     * @return An Iterator of RuleCategoryDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addRuleCategoryList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleCategoryList);
        if (attr == null)
            attr = new DmcTypeRuleCategoryREFMV(MetaDMSAG.__ruleCategoryList);
        
        attr.add(value);
        add(MetaDMSAG.__ruleCategoryList,attr);
        return(attr);
    }

    /**
     * The RuleData defined in a schema. 
     * @return An Iterator of RuleDataDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
    public Iterator<RuleDataREF> getRuleDataList(){
        DmcTypeRuleDataREFMV attr = (DmcTypeRuleDataREFMV) get(MetaDMSAG.__ruleDataList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another ruleDataList value.
     * @param value A value compatible with DmcTypeRuleDataREFMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addRuleDataList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleDataList);
        if (attr == null)
            attr = new DmcTypeRuleDataREFMV(MetaDMSAG.__ruleDataList);
        
        attr.add(value);
        add(MetaDMSAG.__ruleDataList,attr);
        return(attr);
    }

    /**
     * The RuleDefinitions defined in a schema. 
     * @return An Iterator of RuleDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addRuleDefinitionList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleDefinitionList);
        if (attr == null)
            attr = new DmcTypeRuleDefinitionREFMV(MetaDMSAG.__ruleDefinitionList);
        
        attr.add(value);
        add(MetaDMSAG.__ruleDefinitionList,attr);
        return(attr);
    }

    /**
     * The fully qualified name of a class that extends the schema management\n
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement\n the SchemaExtensionIF. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addSliceDefList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__sliceDefList);
        if (attr == null)
            attr = new DmcTypeSliceDefinitionREFMV(MetaDMSAG.__sliceDefList);
        
        attr.add(value);
        add(MetaDMSAG.__sliceDefList,attr);
        return(attr);
    }

    /**
     * The sortName is used in siutations where we need a name\n for storage of a
     * definition that is globally unique but can be sorted on the basis\n of the
     * definition name, not the module name. The dotName for a definition is\n
     * module.definition...type, whereas the sortName would be
     * definition...module.type.\n So, for things like documentation generation,
     * the sortName provides a more \n natural ordering. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
    public DotName getSortName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__sortName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sortName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setSortName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__sortName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__sortName);
        
        attr.set(value);
        set(MetaDMSAG.__sortName,attr);
    }

    /**
     * A collection of tags that can facilitate searching for\n definitions. The
     * values are limited to a-zA-Z0-9 and the space character. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
    public Iterator<String> getTags(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__tags);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another tags value.
     * @param value A value compatible with DmcTypeStringMV
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
     * A list of type definition references. 
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2524)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
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
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2128)

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
