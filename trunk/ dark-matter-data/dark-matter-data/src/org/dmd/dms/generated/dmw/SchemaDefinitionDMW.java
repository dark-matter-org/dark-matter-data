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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDefClasses(MetaGenerator.java:808)
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

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<SchemaDefinition>());
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
    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value) throws DmcValueException {
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
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
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
    public void setSchemaPackage(Object value) throws DmcValueException {
        mycore.setSchemaPackage(value);
    }

    /**
     * A list of schema names.
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
    @SuppressWarnings("unchecked")
    public DmcAttribute addDependsOn(Object value) throws DmcValueException {
        return(mycore.addDependsOn(value));
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
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefFiles(Object value) throws DmcValueException {
        return(mycore.addDefFiles(value));
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files.
     */
    public String getGeneratedFileHeader(){
        return(mycore.getGeneratedFileHeader());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        mycore.setGeneratedFileHeader(value);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes.
     */
    public String getDmwPackage(){
        return(mycore.getDmwPackage());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDmwPackage(Object value) throws DmcValueException {
        mycore.setDmwPackage(value);
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
    public DmcAttribute addClassDefList(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addClassDefList(value.getDmcObject());
        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ClassDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
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
    public DmcAttribute addTypeDefList(TypeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addTypeDefList(value.getDmcObject());
        ArrayList<TypeDefinition> refs = (ArrayList<TypeDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<TypeDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * A list of type definitions that were generated internally to represent
     * enums and object references.
     * @returns An Iterator of TypeDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<TypeDefinition> getInternalTypeDefList(){
        DmcAttribute attr = (DmcTypeTypeDefinitionREF) mycore.get(SchemaDefinitionDMO._internalTypeDefList);
        if (attr == null)
            return(null);

        ArrayList<TypeDefinition> refs = (ArrayList<TypeDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another internalTypeDefList value.
     * @param value A value compatible with TypeDefinition
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addInternalTypeDefList(TypeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addInternalTypeDefList(value.getDmcObject());
        ArrayList<TypeDefinition> refs = (ArrayList<TypeDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<TypeDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
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
    public DmcAttribute addAttributeDefList(AttributeDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addAttributeDefList(value.getDmcObject());
        ArrayList<AttributeDefinition> refs = (ArrayList<AttributeDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<AttributeDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
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
    public DmcAttribute addActionDefList(ActionDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addActionDefList(value.getDmcObject());
        ArrayList<ActionDefinition> refs = (ArrayList<ActionDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<ActionDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
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
    public DmcAttribute addEnumDefList(EnumDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addEnumDefList(value.getDmcObject());
        ArrayList<EnumDefinition> refs = (ArrayList<EnumDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<EnumDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
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
    public DmcAttribute addDependsOnRef(SchemaDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addDependsOnRef(value.getDmcObject());
        ArrayList<SchemaDefinition> refs = (ArrayList<SchemaDefinition>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<SchemaDefinition>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }


}
