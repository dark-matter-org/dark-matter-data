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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDefClasses(MetaGenerator.java:792)
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

    protected SchemaDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected SchemaDefinitionDMW(String mn) {
        super(new SchemaDefinitionDMO());
        mycore = (SchemaDefinitionDMO) core;
        mycore.setContainer(this);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value){
        mycore.setName(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDescription(Object value){
        mycore.setDescription(value);
    }

    /**
     * The name of the directory where generated source for something should be
     * dumped. This name will be relative to the Eclipse project in which you are
     * running dmdgenerator utility. For example src/com/dmc/dmd - and the
     * generated code would be created in src/com/dmc/dmd/generated
     */
    public String getGenDirPrefix(){
        return(mycore.getGenDirPrefix());
    }

    /**
     * Sets genDirPrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setGenDirPrefix(Object value){
        mycore.setGenDirPrefix(value);
    }

    /**
     * The package where generated source for something should be dumped. For
     * example, org.dmd.dms - and the generated package would look like
     * org.dmd.dmd.generated.enums
     */
    public String getGenPackagePrefix(){
        return(mycore.getGenPackagePrefix());
    }

    /**
     * Sets genPackagePrefix to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setGenPackagePrefix(Object value){
        mycore.setGenPackagePrefix(value);
    }

    /**
     * A list of class definition references.
     * @returns An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getClassDefList(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(SchemaDefinitionDMO._classDefList);
        if (attr == null)
            return(null);

        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another classDefList value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    public void addClassDefList(ClassDefinition value){
        try{
            DmcAttribute attr = mycore.add(SchemaDefinitionDMO._classDefList, DmcTypeClassDefinitionREF.class, value.getDmcObject());
            ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();
            
            if (refs == null){
                refs = new ArrayList<ClassDefinition>();
                attr.setAuxData(refs);
            }
            refs.add(value);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of type definition references.
     * @returns An Iterator of TypeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<TypeDefinition> getTypeDefList(){
        DmcAttribute attr = (DmcTypeTypeDefinitionREF) mycore.get(SchemaDefinitionDMO._typeDefList);
        if (attr == null)
            return(null);

        ArrayList<TypeDefinition> refs = (ArrayList<TypeDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another typeDefList value.
     * @param value A value compatible with TypeDefinition
     */
    @SuppressWarnings("unchecked")
    public void addTypeDefList(TypeDefinition value){
        try{
            DmcAttribute attr = mycore.add(SchemaDefinitionDMO._typeDefList, DmcTypeTypeDefinitionREF.class, value.getDmcObject());
            ArrayList<TypeDefinition> refs = (ArrayList<TypeDefinition>) attr.getAuxData();
            
            if (refs == null){
                refs = new ArrayList<TypeDefinition>();
                attr.setAuxData(refs);
            }
            refs.add(value);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of attribute definition references.
     * @returns An Iterator of AttributeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<AttributeDefinition> getAttributeDefList(){
        DmcAttribute attr = (DmcTypeAttributeDefinitionREF) mycore.get(SchemaDefinitionDMO._attributeDefList);
        if (attr == null)
            return(null);

        ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another attributeDefList value.
     * @param value A value compatible with AttributeDefinition
     */
    @SuppressWarnings("unchecked")
    public void addAttributeDefList(AttributeDefinition value){
        try{
            DmcAttribute attr = mycore.add(SchemaDefinitionDMO._attributeDefList, DmcTypeAttributeDefinitionREF.class, value.getDmcObject());
            ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();
            
            if (refs == null){
                refs = new ArrayList<AttributeDefinition>();
                attr.setAuxData(refs);
            }
            refs.add(value);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of action definition references.
     * @returns An Iterator of ActionDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ActionDefinition> getActionDefList(){
        DmcAttribute attr = (DmcTypeActionDefinitionREF) mycore.get(SchemaDefinitionDMO._actionDefList);
        if (attr == null)
            return(null);

        ArrayList<ActionDefinition> refs = (ArrayList<ActionDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another actionDefList value.
     * @param value A value compatible with ActionDefinition
     */
    @SuppressWarnings("unchecked")
    public void addActionDefList(ActionDefinition value){
        try{
            DmcAttribute attr = mycore.add(SchemaDefinitionDMO._actionDefList, DmcTypeActionDefinitionREF.class, value.getDmcObject());
            ArrayList<ActionDefinition> refs = (ArrayList<ActionDefinition>) attr.getAuxData();
            
            if (refs == null){
                refs = new ArrayList<ActionDefinition>();
                attr.setAuxData(refs);
            }
            refs.add(value);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of EnumDefinitions.
     * @returns An Iterator of EnumDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<EnumDefinition> getEnumDefList(){
        DmcAttribute attr = (DmcTypeEnumDefinitionREF) mycore.get(SchemaDefinitionDMO._enumDefList);
        if (attr == null)
            return(null);

        ArrayList<EnumDefinition> refs = (ArrayList<EnumDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another enumDefList value.
     * @param value A value compatible with EnumDefinition
     */
    @SuppressWarnings("unchecked")
    public void addEnumDefList(EnumDefinition value){
        try{
            DmcAttribute attr = mycore.add(SchemaDefinitionDMO._enumDefList, DmcTypeEnumDefinitionREF.class, value.getDmcObject());
            ArrayList<EnumDefinition> refs = (ArrayList<EnumDefinition>) attr.getAuxData();
            
            if (refs == null){
                refs = new ArrayList<EnumDefinition>();
                attr.setAuxData(refs);
            }
            refs.add(value);
            
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
        DmcTypeString attr = (DmcTypeString) mycore.get(SchemaDefinitionDMO._dependsOn);
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
            mycore.add(SchemaDefinitionDMO._dependsOn, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * A list of schema references that are based on the contents of the
     * dependsOn attribute.
     * @returns An Iterator of SchemaDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<SchemaDefinition> getDependsOnRef(){
        DmcAttribute attr = (DmcTypeSchemaDefinitionREF) mycore.get(SchemaDefinitionDMO._dependsOnRef);
        if (attr == null)
            return(null);

        ArrayList<SchemaDefinition> refs = (ArrayList<SchemaDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another dependsOnRef value.
     * @param value A value compatible with SchemaDefinition
     */
    @SuppressWarnings("unchecked")
    public void addDependsOnRef(SchemaDefinition value){
        try{
            DmcAttribute attr = mycore.add(SchemaDefinitionDMO._dependsOnRef, DmcTypeSchemaDefinitionREF.class, value.getDmcObject());
            ArrayList<SchemaDefinition> refs = (ArrayList<SchemaDefinition>) attr.getAuxData();
            
            if (refs == null){
                refs = new ArrayList<SchemaDefinition>();
                attr.setAuxData(refs);
            }
            refs.add(value);
            
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
        DmcTypeString attr = (DmcTypeString) mycore.get(SchemaDefinitionDMO._defFiles);
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
            mycore.add(SchemaDefinitionDMO._defFiles, DmcTypeString.class, value);
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
        return(mycore.getSchemaPackage());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setSchemaPackage(Object value){
        mycore.setSchemaPackage(value);
    }


}
