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
package org.dmd.dms.generated.dmo;

import java.io.Serializable;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * This class is used to define a schema as a discrete, nameable entity.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1178)
 */
@SuppressWarnings("serial")
public class SchemaDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;

    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __schemaBaseID = new DmcAttributeInfo("schemaBaseID",86,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __schemaIDRange = new DmcAttributeInfo("schemaIDRange",87,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __schemaPackage = new DmcAttributeInfo("schemaPackage",53,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    public final static DmcAttributeInfo __actionDefList = new DmcAttributeInfo("actionDefList",60,"ActionDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __attributeDefList = new DmcAttributeInfo("attributeDefList",59,"AttributeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __attributeValidatorDefList = new DmcAttributeInfo("attributeValidatorDefList",114,"AttributeValidatorDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __classDefList = new DmcAttributeInfo("classDefList",55,"ClassDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __complexTypeDefList = new DmcAttributeInfo("complexTypeDefList",117,"ComplexTypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __createAttributeFactory = new DmcAttributeInfo("createAttributeFactory",89,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __defFiles = new DmcAttributeInfo("defFiles",68,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __definedIn = new DmcAttributeInfo("definedIn",61,"SchemaDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __dependsOn = new DmcAttributeInfo("dependsOn",66,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __dependsOnRef = new DmcAttributeInfo("dependsOnRef",67,"SchemaDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __dmwPackage = new DmcAttributeInfo("dmwPackage",54,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __enumDefList = new DmcAttributeInfo("enumDefList",58,"EnumDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __generatedFileHeader = new DmcAttributeInfo("generatedFileHeader",81,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __internalTypeDefList = new DmcAttributeInfo("internalTypeDefList",57,"TypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __objectValidatorDefList = new DmcAttributeInfo("objectValidatorDefList",113,"ObjectValidatorDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __schemaExtension = new DmcAttributeInfo("schemaExtension",4,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sliceDefList = new DmcAttributeInfo("sliceDefList",111,"SliceDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __typeDefList = new DmcAttributeInfo("typeDefList",56,"TypeDefinition",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__description.id,__description);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__schemaBaseID.id,__schemaBaseID);
        _ImAp.put(__schemaIDRange.id,__schemaIDRange);
        _ImAp.put(__schemaPackage.id,__schemaPackage);
        _ImAp.put(__actionDefList.id,__actionDefList);
        _ImAp.put(__attributeDefList.id,__attributeDefList);
        _ImAp.put(__attributeValidatorDefList.id,__attributeValidatorDefList);
        _ImAp.put(__classDefList.id,__classDefList);
        _ImAp.put(__complexTypeDefList.id,__complexTypeDefList);
        _ImAp.put(__createAttributeFactory.id,__createAttributeFactory);
        _ImAp.put(__defFiles.id,__defFiles);
        _ImAp.put(__definedIn.id,__definedIn);
        _ImAp.put(__dependsOn.id,__dependsOn);
        _ImAp.put(__dependsOnRef.id,__dependsOnRef);
        _ImAp.put(__dmwPackage.id,__dmwPackage);
        _ImAp.put(__enumDefList.id,__enumDefList);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__generatedFileHeader.id,__generatedFileHeader);
        _ImAp.put(__internalTypeDefList.id,__internalTypeDefList);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__objectValidatorDefList.id,__objectValidatorDefList);
        _ImAp.put(__schemaExtension.id,__schemaExtension);
        _ImAp.put(__sliceDefList.id,__sliceDefList);
        _ImAp.put(__typeDefList.id,__typeDefList);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__description.name,__description);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__schemaBaseID.name,__schemaBaseID);
        _SmAp.put(__schemaIDRange.name,__schemaIDRange);
        _SmAp.put(__schemaPackage.name,__schemaPackage);
        _SmAp.put(__actionDefList.name,__actionDefList);
        _SmAp.put(__attributeDefList.name,__attributeDefList);
        _SmAp.put(__attributeValidatorDefList.name,__attributeValidatorDefList);
        _SmAp.put(__classDefList.name,__classDefList);
        _SmAp.put(__complexTypeDefList.name,__complexTypeDefList);
        _SmAp.put(__createAttributeFactory.name,__createAttributeFactory);
        _SmAp.put(__defFiles.name,__defFiles);
        _SmAp.put(__definedIn.name,__definedIn);
        _SmAp.put(__dependsOn.name,__dependsOn);
        _SmAp.put(__dependsOnRef.name,__dependsOnRef);
        _SmAp.put(__dmwPackage.name,__dmwPackage);
        _SmAp.put(__enumDefList.name,__enumDefList);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__generatedFileHeader.name,__generatedFileHeader);
        _SmAp.put(__internalTypeDefList.name,__internalTypeDefList);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__objectValidatorDefList.name,__objectValidatorDefList);
        _SmAp.put(__schemaExtension.name,__schemaExtension);
        _SmAp.put(__sliceDefList.name,__sliceDefList);
        _SmAp.put(__typeDefList.name,__typeDefList);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
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

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public Integer getSchemaBaseID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__schemaBaseID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setSchemaBaseID(Object value) throws DmcValueException {
        DmcAttribute attr = get(__schemaBaseID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__schemaBaseID);
        
        attr.set(value);
        set(__schemaBaseID,attr);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public Integer getSchemaIDRange(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__schemaIDRange);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setSchemaIDRange(Object value) throws DmcValueException {
        DmcAttribute attr = get(__schemaIDRange);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__schemaIDRange);
        
        attr.set(value);
        set(__schemaIDRange,attr);
    }

    /**
     * Indicates the package that this schema will be part of when its code is
     * generated using the dafutil tool.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public String getSchemaPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__schemaPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setSchemaPackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(__schemaPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__schemaPackage);
        
        attr.set(value);
        set(__schemaPackage,attr);
    }

    /**
     * A list of action definition references.
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<ActionDefinitionREF> getActionDefList(){
        DmcTypeActionDefinitionREFMV attr = (DmcTypeActionDefinitionREFMV) get(__actionDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with DmcTypeActionDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addActionDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__actionDefList);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREFMV(__actionDefList);
        
        attr.add(value);
        add(__actionDefList,attr);
        return(attr);
    }

    /**
     * A list of attribute definition references.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<AttributeDefinitionREF> getAttributeDefList(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) get(__attributeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addAttributeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__attributeDefList);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFMV(__attributeDefList);
        
        attr.add(value);
        add(__attributeDefList,attr);
        return(attr);
    }

    /**
     * A list of attribute validator definition references.
     * @return An Iterator of AttributeValidatorDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<AttributeValidatorDefinitionREF> getAttributeValidatorDefList(){
        DmcTypeAttributeValidatorDefinitionREFMV attr = (DmcTypeAttributeValidatorDefinitionREFMV) get(__attributeValidatorDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attributeValidatorDefList value.
     * @param value A value compatible with DmcTypeAttributeValidatorDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addAttributeValidatorDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__attributeValidatorDefList);
        if (attr == null)
            attr = new DmcTypeAttributeValidatorDefinitionREFMV(__attributeValidatorDefList);
        
        attr.add(value);
        add(__attributeValidatorDefList,attr);
        return(attr);
    }

    /**
     * A list of class definition references.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<ClassDefinitionREF> getClassDefList(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__classDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addClassDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__classDefList);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__classDefList);
        
        attr.add(value);
        add(__classDefList,attr);
        return(attr);
    }

    /**
     * A list of complex type definition references.
     * @return An Iterator of ComplexTypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<ComplexTypeDefinitionREF> getComplexTypeDefList(){
        DmcTypeComplexTypeDefinitionREFMV attr = (DmcTypeComplexTypeDefinitionREFMV) get(__complexTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another complexTypeDefList value.
     * @param value A value compatible with DmcTypeComplexTypeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addComplexTypeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__complexTypeDefList);
        if (attr == null)
            attr = new DmcTypeComplexTypeDefinitionREFMV(__complexTypeDefList);
        
        attr.add(value);
        add(__complexTypeDefList,attr);
        return(attr);
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for the creation of attributes taht can then be embedded in complex
     * objects and properly serialized/deserialized.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public Boolean getCreateAttributeFactory(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__createAttributeFactory);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets createAttributeFactory to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setCreateAttributeFactory(Object value) throws DmcValueException {
        DmcAttribute attr = get(__createAttributeFactory);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__createAttributeFactory);
        
        attr.set(value);
        set(__createAttributeFactory,attr);
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1687)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeStringMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addDefFiles(Object value) throws DmcValueException {
        DmcAttribute attr = get(__defFiles);
        if (attr == null)
            attr = new DmcTypeStringMV(__defFiles);
        
        attr.add(value);
        add(__defFiles,attr);
        return(attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute attr = get(__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(__definedIn);
        
        attr.set(value);
        set(__definedIn,attr);
    }

    /**
     * A list of schema names.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1687)
    public Iterator<String> getDependsOn(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeStringMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addDependsOn(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dependsOn);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOn);
        
        attr.add(value);
        add(__dependsOn,attr);
        return(attr);
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute.
     * @return An Iterator of SchemaDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<SchemaDefinitionREF> getDependsOnRef(){
        DmcTypeSchemaDefinitionREFMV attr = (DmcTypeSchemaDefinitionREFMV) get(__dependsOnRef);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addDependsOnRef(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dependsOnRef);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFMV(__dependsOnRef);
        
        attr.add(value);
        add(__dependsOnRef,attr);
        return(attr);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public String getDmwPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__dmwPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setDmwPackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__dmwPackage);
        
        attr.set(value);
        set(__dmwPackage,attr);
    }

    /**
     * A list of EnumDefinitions.
     * @return An Iterator of EnumDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<EnumDefinitionREF> getEnumDefList(){
        DmcTypeEnumDefinitionREFMV attr = (DmcTypeEnumDefinitionREFMV) get(__enumDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with DmcTypeEnumDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addEnumDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__enumDefList);
        if (attr == null)
            attr = new DmcTypeEnumDefinitionREFMV(__enumDefList);
        
        attr.add(value);
        add(__enumDefList,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute attr = get(__file);
        if (attr == null)
            attr = new DmcTypeStringSV(__file);
        
        attr.set(value);
        set(__file,attr);
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public String getGeneratedFileHeader(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__generatedFileHeader);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        DmcAttribute attr = get(__generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeStringSV(__generatedFileHeader);
        
        attr.set(value);
        set(__generatedFileHeader,attr);
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references.
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<TypeDefinitionREF> getInternalTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) get(__internalTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addInternalTypeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__internalTypeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFMV(__internalTypeDefList);
        
        attr.add(value);
        add(__internalTypeDefList,attr);
        return(attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1549)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1595)
    @SuppressWarnings("unchecked")
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute attr = get(__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__lineNumber);
        
        attr.set(value);
        set(__lineNumber,attr);
    }

    /**
     * A list of object validator definition references.
     * @return An Iterator of ObjectValidatorDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<ObjectValidatorDefinitionREF> getObjectValidatorDefList(){
        DmcTypeObjectValidatorDefinitionREFMV attr = (DmcTypeObjectValidatorDefinitionREFMV) get(__objectValidatorDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another objectValidatorDefList value.
     * @param value A value compatible with DmcTypeObjectValidatorDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addObjectValidatorDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__objectValidatorDefList);
        if (attr == null)
            attr = new DmcTypeObjectValidatorDefinitionREFMV(__objectValidatorDefList);
        
        attr.add(value);
        add(__objectValidatorDefList,attr);
        return(attr);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1687)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addSchemaExtension(Object value) throws DmcValueException {
        DmcAttribute attr = get(__schemaExtension);
        if (attr == null)
            attr = new DmcTypeStringMV(__schemaExtension);
        
        attr.add(value);
        add(__schemaExtension,attr);
        return(attr);
    }

    /**
     * A list of slice definition references.
     * @return An Iterator of SliceDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<SliceDefinitionREF> getSliceDefList(){
        DmcTypeSliceDefinitionREFMV attr = (DmcTypeSliceDefinitionREFMV) get(__sliceDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another sliceDefList value.
     * @param value A value compatible with DmcTypeSliceDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addSliceDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__sliceDefList);
        if (attr == null)
            attr = new DmcTypeSliceDefinitionREFMV(__sliceDefList);
        
        attr.add(value);
        add(__sliceDefList,attr);
        return(attr);
    }

    /**
     * A list of type definition references.
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1681)
    public Iterator<TypeDefinitionREF> getTypeDefList(){
        DmcTypeTypeDefinitionREFMV attr = (DmcTypeTypeDefinitionREFMV) get(__typeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1731)
    public DmcAttribute addTypeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__typeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFMV(__typeDefList);
        
        attr.add(value);
        add(__typeDefList,attr);
        return(attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public StringName getObjectName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The name attribute.
     */
    @Override
    public DmcTypeStringName getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
