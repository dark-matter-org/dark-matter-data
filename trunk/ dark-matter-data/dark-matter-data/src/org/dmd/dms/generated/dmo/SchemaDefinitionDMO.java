//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * This class is used to define a schema as a discrete, nameable entity.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1036)
 */
@SuppressWarnings("serial")
public class SchemaDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __schemaPackage = new DmcAttributeInfo("schemaPackage",53,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __schemaBaseID = new DmcAttributeInfo("schemaBaseID",86,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __schemaIDRange = new DmcAttributeInfo("schemaIDRange",87,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dependsOn = new DmcAttributeInfo("dependsOn",66,"String",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __defFiles = new DmcAttributeInfo("defFiles",68,"String",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __generatedFileHeader = new DmcAttributeInfo("generatedFileHeader",81,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmwPackage = new DmcAttributeInfo("dmwPackage",54,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __schemaExtension = new DmcAttributeInfo("schemaExtension",4,"String",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __createAttributeFactory = new DmcAttributeInfo("createAttributeFactory",89,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __classDefList = new DmcAttributeInfo("classDefList",55,"ClassDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __typeDefList = new DmcAttributeInfo("typeDefList",56,"TypeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __internalTypeDefList = new DmcAttributeInfo("internalTypeDefList",57,"TypeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __attributeDefList = new DmcAttributeInfo("attributeDefList",59,"AttributeDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __actionDefList = new DmcAttributeInfo("actionDefList",60,"ActionDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __enumDefList = new DmcAttributeInfo("enumDefList",58,"EnumDefinition",ValueTypeEnum.MULTI,true);
    public final static DmcAttributeInfo __dependsOnRef = new DmcAttributeInfo("dependsOnRef",67,"SchemaDefinition",ValueTypeEnum.MULTI,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__schemaPackage.id,__schemaPackage);
        _ImAp.put(__schemaBaseID.id,__schemaBaseID);
        _ImAp.put(__schemaIDRange.id,__schemaIDRange);
        _ImAp.put(__dependsOn.id,__dependsOn);
        _ImAp.put(__defFiles.id,__defFiles);
        _ImAp.put(__generatedFileHeader.id,__generatedFileHeader);
        _ImAp.put(__dmwPackage.id,__dmwPackage);
        _ImAp.put(__schemaExtension.id,__schemaExtension);
        _ImAp.put(__createAttributeFactory.id,__createAttributeFactory);
        _ImAp.put(__classDefList.id,__classDefList);
        _ImAp.put(__typeDefList.id,__typeDefList);
        _ImAp.put(__internalTypeDefList.id,__internalTypeDefList);
        _ImAp.put(__attributeDefList.id,__attributeDefList);
        _ImAp.put(__actionDefList.id,__actionDefList);
        _ImAp.put(__enumDefList.id,__enumDefList);
        _ImAp.put(__dependsOnRef.id,__dependsOnRef);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__schemaPackage.name,__schemaPackage);
        _SmAp.put(__schemaBaseID.name,__schemaBaseID);
        _SmAp.put(__schemaIDRange.name,__schemaIDRange);
        _SmAp.put(__dependsOn.name,__dependsOn);
        _SmAp.put(__defFiles.name,__defFiles);
        _SmAp.put(__generatedFileHeader.name,__generatedFileHeader);
        _SmAp.put(__dmwPackage.name,__dmwPackage);
        _SmAp.put(__schemaExtension.name,__schemaExtension);
        _SmAp.put(__createAttributeFactory.name,__createAttributeFactory);
        _SmAp.put(__classDefList.name,__classDefList);
        _SmAp.put(__typeDefList.name,__typeDefList);
        _SmAp.put(__internalTypeDefList.name,__internalTypeDefList);
        _SmAp.put(__attributeDefList.name,__attributeDefList);
        _SmAp.put(__actionDefList.name,__actionDefList);
        _SmAp.put(__enumDefList.name,__enumDefList);
        _SmAp.put(__dependsOnRef.name,__dependsOnRef);
    }


    public SchemaDefinitionDMO(){
        super("SchemaDefinition",_ImAp,_SmAp);
    }

    public SchemaDefinitionDMO(String oc){
        super(oc);
    }

    public SchemaDefinitionDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    @Override
    public SchemaDefinitionDMO getOneOfMe(){
        SchemaDefinitionDMO rc = new SchemaDefinitionDMO();
        return(rc);
    }

     public String getConstructionClassName(){
         return("SchemaDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1316)
    public StringName getName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1362)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1316)
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1362)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeString(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Indicates the package that this schema will be part of when its code is
     * generated using the dafutil tool.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1316)
    public String getSchemaPackage(){
        DmcTypeString attr = (DmcTypeString) get(__schemaPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1362)
    @SuppressWarnings("unchecked")
    public void setSchemaPackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(__schemaPackage);
        if (attr == null)
            attr = new DmcTypeString(__schemaPackage);
        
        attr.set(value);
        set(__schemaPackage,attr);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1316)
    public Integer getSchemaBaseID(){
        DmcTypeInteger attr = (DmcTypeInteger) get(__schemaBaseID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1362)
    @SuppressWarnings("unchecked")
    public void setSchemaBaseID(Object value) throws DmcValueException {
        DmcAttribute attr = get(__schemaBaseID);
        if (attr == null)
            attr = new DmcTypeInteger(__schemaBaseID);
        
        attr.set(value);
        set(__schemaBaseID,attr);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1316)
    public Integer getSchemaIDRange(){
        DmcTypeInteger attr = (DmcTypeInteger) get(__schemaIDRange);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1362)
    @SuppressWarnings("unchecked")
    public void setSchemaIDRange(Object value) throws DmcValueException {
        DmcAttribute attr = get(__schemaIDRange);
        if (attr == null)
            attr = new DmcTypeInteger(__schemaIDRange);
        
        attr.set(value);
        set(__schemaIDRange,attr);
    }

    /**
     * A list of schema names.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1452)
    public Iterator<String> getDependsOn(){
        DmcTypeString attr = (DmcTypeString) get(__dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addDependsOn(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dependsOn);
        if (attr == null)
            attr = new DmcTypeString(__dependsOn);
        
        attr.add(value);
        add(__dependsOn,attr);
        return(attr);
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1452)
    public Iterator<String> getDefFiles(){
        DmcTypeString attr = (DmcTypeString) get(__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addDefFiles(Object value) throws DmcValueException {
        DmcAttribute attr = get(__defFiles);
        if (attr == null)
            attr = new DmcTypeString(__defFiles);
        
        attr.add(value);
        add(__defFiles,attr);
        return(attr);
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1316)
    public String getGeneratedFileHeader(){
        DmcTypeString attr = (DmcTypeString) get(__generatedFileHeader);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1362)
    @SuppressWarnings("unchecked")
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        DmcAttribute attr = get(__generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeString(__generatedFileHeader);
        
        attr.set(value);
        set(__generatedFileHeader,attr);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1316)
    public String getDmwPackage(){
        DmcTypeString attr = (DmcTypeString) get(__dmwPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1362)
    @SuppressWarnings("unchecked")
    public void setDmwPackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmwPackage);
        if (attr == null)
            attr = new DmcTypeString(__dmwPackage);
        
        attr.set(value);
        set(__dmwPackage,attr);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1452)
    public Iterator<String> getSchemaExtension(){
        DmcTypeString attr = (DmcTypeString) get(__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addSchemaExtension(Object value) throws DmcValueException {
        DmcAttribute attr = get(__schemaExtension);
        if (attr == null)
            attr = new DmcTypeString(__schemaExtension);
        
        attr.add(value);
        add(__schemaExtension,attr);
        return(attr);
    }

    /**
     * When specified as true on a SchemaDefinition, the DMO generation utility
     * will create a free standing AttributeFactory for the schema. This allows
     * for the creation of attributes taht can then be embedded in complex
     * objects and properly serialized/deserialized.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1316)
    public Boolean getCreateAttributeFactory(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__createAttributeFactory);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets createAttributeFactory to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1362)
    @SuppressWarnings("unchecked")
    public void setCreateAttributeFactory(Object value) throws DmcValueException {
        DmcAttribute attr = get(__createAttributeFactory);
        if (attr == null)
            attr = new DmcTypeBoolean(__createAttributeFactory);
        
        attr.set(value);
        set(__createAttributeFactory,attr);
    }

    /**
     * A list of class definition references.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1446)
    public Iterator<ClassDefinitionREF> getClassDefList(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(__classDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addClassDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__classDefList);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF(__classDefList);
        
        attr.add(value);
        add(__classDefList,attr);
        return(attr);
    }

    /**
     * A list of type definition references.
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1446)
    public Iterator<TypeDefinitionREF> getTypeDefList(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) get(__typeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addTypeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__typeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREF(__typeDefList);
        
        attr.add(value);
        add(__typeDefList,attr);
        return(attr);
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references.
     * @return An Iterator of TypeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1446)
    public Iterator<TypeDefinitionREF> getInternalTypeDefList(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) get(__internalTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addInternalTypeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__internalTypeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREF(__internalTypeDefList);
        
        attr.add(value);
        add(__internalTypeDefList,attr);
        return(attr);
    }

    /**
     * A list of attribute definition references.
     * @return An Iterator of AttributeDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1446)
    public Iterator<AttributeDefinitionREF> getAttributeDefList(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(__attributeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addAttributeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__attributeDefList);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF(__attributeDefList);
        
        attr.add(value);
        add(__attributeDefList,attr);
        return(attr);
    }

    /**
     * A list of action definition references.
     * @return An Iterator of ActionDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1446)
    public Iterator<ActionDefinitionREF> getActionDefList(){
        DmcTypeActionDefinitionREF attr = (DmcTypeActionDefinitionREF) get(__actionDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with DmcTypeActionDefinitionREF
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addActionDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__actionDefList);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREF(__actionDefList);
        
        attr.add(value);
        add(__actionDefList,attr);
        return(attr);
    }

    /**
     * A list of EnumDefinitions.
     * @return An Iterator of EnumDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1446)
    public Iterator<EnumDefinitionREF> getEnumDefList(){
        DmcTypeEnumDefinitionREF attr = (DmcTypeEnumDefinitionREF) get(__enumDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with DmcTypeEnumDefinitionREF
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addEnumDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(__enumDefList);
        if (attr == null)
            attr = new DmcTypeEnumDefinitionREF(__enumDefList);
        
        attr.add(value);
        add(__enumDefList,attr);
        return(attr);
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute.
     * @return An Iterator of SchemaDefinitionDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1446)
    public Iterator<SchemaDefinitionREF> getDependsOnRef(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) get(__dependsOnRef);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREF
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1501)
    public DmcAttribute addDependsOnRef(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dependsOnRef);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREF(__dependsOnRef);
        
        attr.add(value);
        add(__dependsOnRef,attr);
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
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);
        return(attr);
    }

}
