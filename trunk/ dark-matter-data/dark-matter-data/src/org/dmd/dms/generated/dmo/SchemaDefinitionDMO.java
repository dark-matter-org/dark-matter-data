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
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * This class is used to define a schema as a discrete, nameable entity.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1017)
 */
@SuppressWarnings({"unused", "serial"})
public class SchemaDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

     public final static String _name = "name";
     public final static String _description = "description";
     public final static String _genDirPrefix = "genDirPrefix";
     public final static String _genPackagePrefix = "genPackagePrefix";
     public final static String _classDefList = "classDefList";
     public final static String _typeDefList = "typeDefList";
     public final static String _attributeDefList = "attributeDefList";
     public final static String _actionDefList = "actionDefList";
     public final static String _enumDefList = "enumDefList";
     public final static String _dependsOn = "dependsOn";
     public final static String _dependsOnRef = "dependsOnRef";
     public final static String _defFiles = "defFiles";
     public final static String _schemaPackage = "schemaPackage";


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
        DmcTypeString attr = (DmcTypeString) attributes.get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value){
        try{
            set(_name, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDescription(Object value){
        try{
            set(_description, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * The name of the directory where generated source for something should be
     * dumped. This name will be relative to the Eclipse project in which you are
     * running dmdgenerator utility. For example src/com/dmc/dmd - and the
     * generated code would be created in src/com/dmc/dmd/generated
     */
    public String getGenDirPrefix(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_genDirPrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genDirPrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setGenDirPrefix(Object value){
        try{
            set(_genDirPrefix, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * The package where generated source for something should be dumped. For
     * example, org.dmd.dms - and the generated package would look like
     * org.dmd.dmd.generated.enums
     */
    public String getGenPackagePrefix(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_genPackagePrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genPackagePrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setGenPackagePrefix(Object value){
        try{
            set(_genPackagePrefix, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of class definition references.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getClassDefList(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) attributes.get(_classDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    public void addClassDefList(Object value){
        try{
            add(_classDefList, DmcTypeClassDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of type definition references.
     * @returns An Iterator of TypeDefinitionDMO objects.
     */
    public Iterator<TypeDefinitionREF> getTypeDefList(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) attributes.get(_typeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with DmcTypeTypeDefinitionREF
     */
    public void addTypeDefList(Object value){
        try{
            add(_typeDefList, DmcTypeTypeDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of attribute definition references.
     * @returns An Iterator of AttributeDefinitionDMO objects.
     */
    public Iterator<AttributeDefinitionREF> getAttributeDefList(){
        DmcTypeAttributeDefinitionREF attr = (DmcTypeAttributeDefinitionREF) attributes.get(_attributeDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREF
     */
    public void addAttributeDefList(Object value){
        try{
            add(_attributeDefList, DmcTypeAttributeDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of action definition references.
     * @returns An Iterator of ActionDefinitionDMO objects.
     */
    public Iterator<ActionDefinitionREF> getActionDefList(){
        DmcTypeActionDefinitionREF attr = (DmcTypeActionDefinitionREF) attributes.get(_actionDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with DmcTypeActionDefinitionREF
     */
    public void addActionDefList(Object value){
        try{
            add(_actionDefList, DmcTypeActionDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of EnumDefinitions.
     * @returns An Iterator of EnumDefinitionDMO objects.
     */
    public Iterator<EnumDefinitionREF> getEnumDefList(){
        DmcTypeEnumDefinitionREF attr = (DmcTypeEnumDefinitionREF) attributes.get(_enumDefList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with DmcTypeEnumDefinitionREF
     */
    public void addEnumDefList(Object value){
        try{
            add(_enumDefList, DmcTypeEnumDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of schema names. Schemas are stored in a file/directory structure
     * based on the name of the schema i.e. schema_name/schema_name.imd
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDependsOn(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_dependsOn);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with DmcTypeString
     */
    public void addDependsOn(Object value){
        try{
            add(_dependsOn, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute.
     * @returns An Iterator of SchemaDefinitionDMO objects.
     */
    public Iterator<SchemaDefinitionREF> getDependsOnRef(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) attributes.get(_dependsOnRef);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREF
     */
    public void addDependsOnRef(Object value){
        try{
            add(_dependsOnRef, DmcTypeSchemaDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema.
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getDefFiles(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_defFiles);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeString
     */
    public void addDefFiles(Object value){
        try{
            add(_defFiles, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the package that this schema will be part of when its code is
     * generated using the dafutil tool.
     */
    public String getSchemaPackage(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_schemaPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setSchemaPackage(Object value){
        try{
            set(_schemaPackage, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }


}
