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
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * This class is used to define a schema as a discrete, nameable entity.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1019)
 */
@SuppressWarnings({"unused", "serial"})
public class SchemaDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

     public final static String _name = "name";
     public final static String _description = "description";
     public final static String _genDirPrefix = "genDirPrefix";
     public final static String _genPackagePrefix = "genPackagePrefix";
     public final static String _classDefList = "classDefList";
     public final static String _typeDefList = "typeDefList";
     public final static String _internalTypeDefList = "internalTypeDefList";
     public final static String _attributeDefList = "attributeDefList";
     public final static String _actionDefList = "actionDefList";
     public final static String _enumDefList = "enumDefList";
     public final static String _dependsOn = "dependsOn";
     public final static String _dependsOnRef = "dependsOnRef";
     public final static String _defFiles = "defFiles";
     public final static String _schemaPackage = "schemaPackage";
     public final static String _generatedFileHeader = "generatedFileHeader";


     public String getConstructionClassName(){
         return("SchemaDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(_description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(_description);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_description,attr);
    }

    /**
     * The name of the directory where generated source for something should be
     * dumped. This name will be relative to the Eclipse project in which you are
     * running dmdgenerator utility. For example src/com/dmc/dmd - and the
     * generated code would be created in src/com/dmc/dmd/generated
     */
    public String getGenDirPrefix(){
        DmcTypeString attr = (DmcTypeString) get(_genDirPrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genDirPrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setGenDirPrefix(Object value) throws DmcValueException {
        DmcAttribute attr = get(_genDirPrefix);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_genDirPrefix,attr);
    }

    /**
     * The package where generated source for something should be dumped. For
     * example, org.dmd.dms - and the generated package would look like
     * org.dmd.dmd.generated.enums
     */
    public String getGenPackagePrefix(){
        DmcTypeString attr = (DmcTypeString) get(_genPackagePrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genPackagePrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setGenPackagePrefix(Object value) throws DmcValueException {
        DmcAttribute attr = get(_genPackagePrefix);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_genPackagePrefix,attr);
    }

    /**
     * A list of class definition references.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getClassDefList(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_classDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addClassDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_classDefList);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(_classDefList,attr);
        return(attr);
    }

    /**
     * A list of type definition references.
     * @returns An Iterator of TypeDefinitionDMO objects.
     */
    public Iterator<TypeDefinitionREF> getTypeDefList(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) get(_typeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addTypeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_typeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREF();
        
        attr.add(value);
        add(_typeDefList,attr);
        return(attr);
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references.
     * @returns An Iterator of TypeDefinitionDMO objects.
     */
    public Iterator<TypeDefinitionREF> getInternalTypeDefList(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) get(_internalTypeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addInternalTypeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_internalTypeDefList);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREF();
        
        attr.add(value);
        add(_internalTypeDefList,attr);
        return(attr);
    }

    /**
     * A list of attribute definition references.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getAttributeDefList(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) get(_attributeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAttributeDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_attributeDefList);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREF();
        
        attr.add(value);
        add(_attributeDefList,attr);
        return(attr);
    }

    /**
     * A list of action definition references.
     * @returns An Iterator of ActionDefinitionDMO objects.
     */
    public Iterator<ActionDefinitionREF> getActionDefList(){
        DmcTypeActionDefinitionREF attr = (DmcTypeActionDefinitionREF) get(_actionDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with DmcTypeActionDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addActionDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_actionDefList);
        if (attr == null)
            attr = new DmcTypeActionDefinitionREF();
        
        attr.add(value);
        add(_actionDefList,attr);
        return(attr);
    }

    /**
     * A list of EnumDefinitions.
     * @returns An Iterator of EnumDefinitionDMO objects.
     */
    public Iterator<EnumDefinitionREF> getEnumDefList(){
        DmcTypeEnumDefinitionREF attr = (DmcTypeEnumDefinitionREF) get(_enumDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with DmcTypeEnumDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addEnumDefList(Object value) throws DmcValueException {
        DmcAttribute attr = get(_enumDefList);
        if (attr == null)
            attr = new DmcTypeEnumDefinitionREF();
        
        attr.add(value);
        add(_enumDefList,attr);
        return(attr);
    }

    /**
     * A list of schema names. Schemas are stored in a file/directory structure
     * based on the name of the schema i.e. schema_name/schema_name.imd
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDependsOn(){
        DmcTypeString attr = (DmcTypeString) get(_dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDependsOn(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dependsOn);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(_dependsOn,attr);
        return(attr);
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute.
     * @returns An Iterator of SchemaDefinitionDMO objects.
     */
    public Iterator<SchemaDefinitionREF> getDependsOnRef(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) get(_dependsOnRef);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDependsOnRef(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dependsOnRef);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREF();
        
        attr.add(value);
        add(_dependsOnRef,attr);
        return(attr);
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema.
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDefFiles(){
        DmcTypeString attr = (DmcTypeString) get(_defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefFiles(Object value) throws DmcValueException {
        DmcAttribute attr = get(_defFiles);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(_defFiles,attr);
        return(attr);
    }

    /**
     * Indicates the package that this schema will be part of when its code is
     * generated using the dafutil tool.
     */
    public String getSchemaPackage(){
        DmcTypeString attr = (DmcTypeString) get(_schemaPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setSchemaPackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(_schemaPackage);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_schemaPackage,attr);
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files.
     */
    public String getGeneratedFileHeader(){
        DmcTypeString attr = (DmcTypeString) get(_generatedFileHeader);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        DmcAttribute attr = get(_generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_generatedFileHeader,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public String getObjectName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }

}
