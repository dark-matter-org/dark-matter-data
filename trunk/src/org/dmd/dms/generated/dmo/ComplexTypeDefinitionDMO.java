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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1835)
import java.io.Serializable;                  // Serializable marker interface - (MetaGenerator.java:1788)
import java.util.*;                           // Attribute info support - (MetaGenerator.java:1790)
import org.dmd.dmc.*;                         // Dark matter core - (MetaGenerator.java:1812)
import org.dmd.dmc.types.*;                   // Basic type access - (MetaGenerator.java:1802)
import org.dmd.dms.generated.types.*;         // Generated type access - (MetaGenerator.java:1824)


/**
 * The ComplexTypeDefinition provides a mechanism for defining the structure
 * of
 a complex type composed of other types. From this definition, a new
 * DmcType is generated that
 has all of the required methods automatically
 * defined.
 <p/>
 An example definition is the RuleParam:
 <pre>

 * ComplexTypeDefinition
 name			RuleParam
 fieldSeparator :
 field String
 * importStatement The import for the type of parameter
 field String
 * genericArgs     The generic arguments associated with this parameter

 * field String name            The name of the parameter
 field String
 * description     A description of the parameter
 description The RuleParam
 * type is used to succintly describe a parameter
  to be supplied to a rule
 * when it is executed.
 </pre>
 In this case, the type has four fields, all
 * of String type. An example of the String
 format of the field might be:
 * org.dmc.DmcObject::obj:The object to be validated. In this
 case, the
 * generic args field isn't available and will be the empty string. When a
 * field
 seperator is specified, all fields are, more or less optional, but
 * the underlying type
 must be able to handle the empty string as a valid
 * value. This wouldn't work with Integer.
 <p/>
 If no field separator is
 * specified, the separator is assumed to be whitespace and additional

 * whitespace is consumed during the parsing.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1845)
 */
@SuppressWarnings("serial")
public class ComplexTypeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__field.id,MetaDMSAG.__field);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__extendedClass.id,MetaDMSAG.__extendedClass);
        _ImAp.put(MetaDMSAG.__fieldSeparator.id,MetaDMSAG.__fieldSeparator);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__field.name,MetaDMSAG.__field);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__extendedClass.name,MetaDMSAG.__extendedClass);
        _SmAp.put(MetaDMSAG.__fieldSeparator.name,MetaDMSAG.__fieldSeparator);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
    }


    public ComplexTypeDefinitionDMO(){
        super("ComplexTypeDefinition");
    }

    public ComplexTypeDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ComplexTypeDefinitionDMO getNew(){
        ComplexTypeDefinitionDMO rc = new ComplexTypeDefinitionDMO();
        return(rc);
    }

    @Override
    public ComplexTypeDefinitionDMO getSlice(DmcSliceInfo info){
        ComplexTypeDefinitionDMO rc = new ComplexTypeDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The field indicates a type and name for a field in a ComplexType.
     * @return An Iterator of Field objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2389)
    public Iterator<Field> getField(){
        DmcTypeFieldMV attr = (DmcTypeFieldMV) get(MetaDMSAG.__field);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another field value.
     * @param value A value compatible with DmcTypeFieldMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2444)
    public DmcAttribute<?> addField(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__field);
        if (attr == null)
            attr = new DmcTypeFieldMV(MetaDMSAG.__field);
        
        attr.add(value);
        add(MetaDMSAG.__field,attr);
        return(attr);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name
 for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace
 characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
    }

    /**
     * The description attribute is used to provide descriptive
 documentation
     * for schema related definitions. The text provided should conform
 to XHTML
     * concepts since it will be dumped in the context of the generated HTML

     * documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * The extendedClass indicates the fully qualified name of the class
 that is
     * derived from the generated ComplexType to provide additional behaviour.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
    public String getExtendedClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__extendedClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets extendedClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setExtendedClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendedClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__extendedClass);
        
        attr.set(value);
        set(MetaDMSAG.__extendedClass,attr);
    }

    /**
     * The fieldSeparator is used to indicate the separation character used
 when
     * a ComplexType is represented as a String. If a fieldSeparator isn't
     * specified, it is
 assumed to be a space.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
    public String getFieldSeparator(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__fieldSeparator);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets fieldSeparator to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setFieldSeparator(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__fieldSeparator);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__fieldSeparator);
        
        attr.set(value);
        set(MetaDMSAG.__fieldSeparator,attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2227)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2284)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
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