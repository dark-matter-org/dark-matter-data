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
import java.io.Serializable;                            // Serializable marker interface - (MetaGenerator.java:1884)
import java.util.*;                                     // Attribute info support - (MetaGenerator.java:1886)
import org.dmd.dmc.*;                                   // Dark matter core - (MetaGenerator.java:1908)
import org.dmd.dmc.definitions.DmcDefinitionIF;         // This is a domain specific definition - (MetaGenerator.java:1921)
import org.dmd.dmc.types.*;                             // Basic type access - (MetaGenerator.java:1898)
import org.dmd.dms.generated.types.*;                   // Generated type access - (MetaGenerator.java:1924)



/**
 * The ExtendedReferenceTypeDefinition provides a mechanism for extending \n
 * the automatically generated named object reference attribute types with
 * additional\n information. This can be seen as adding additional
 * information to the relationship\n between two objects. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1945)
 */
@SuppressWarnings("serial")
public class ExtendedReferenceTypeDefinitionDMO extends org.dmd.dms.generated.dmo.ComplexTypeDefinitionDMO implements Serializable, DmcDefinitionIF {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__extendedReferenceClass.id,MetaDMSAG.__extendedReferenceClass);
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__exampleUsage.id,MetaDMSAG.__exampleUsage);
        _ImAp.put(MetaDMSAG.__extendedClass.id,MetaDMSAG.__extendedClass);
        _ImAp.put(MetaDMSAG.__field.id,MetaDMSAG.__field);
        _ImAp.put(MetaDMSAG.__fieldSeparator.id,MetaDMSAG.__fieldSeparator);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__nvp.id,MetaDMSAG.__nvp);
        _ImAp.put(MetaDMSAG.__optionalPart.id,MetaDMSAG.__optionalPart);
        _ImAp.put(MetaDMSAG.__relatedToConcept.id,MetaDMSAG.__relatedToConcept);
        _ImAp.put(MetaDMSAG.__requiredPart.id,MetaDMSAG.__requiredPart);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__extendedReferenceClass.name,MetaDMSAG.__extendedReferenceClass);
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__exampleUsage.name,MetaDMSAG.__exampleUsage);
        _SmAp.put(MetaDMSAG.__extendedClass.name,MetaDMSAG.__extendedClass);
        _SmAp.put(MetaDMSAG.__field.name,MetaDMSAG.__field);
        _SmAp.put(MetaDMSAG.__fieldSeparator.name,MetaDMSAG.__fieldSeparator);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__nvp.name,MetaDMSAG.__nvp);
        _SmAp.put(MetaDMSAG.__optionalPart.name,MetaDMSAG.__optionalPart);
        _SmAp.put(MetaDMSAG.__relatedToConcept.name,MetaDMSAG.__relatedToConcept);
        _SmAp.put(MetaDMSAG.__requiredPart.name,MetaDMSAG.__requiredPart);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
    }


    public ExtendedReferenceTypeDefinitionDMO(){
        super("ExtendedReferenceTypeDefinition");
    }

    public ExtendedReferenceTypeDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ExtendedReferenceTypeDefinitionDMO getNew(){
        ExtendedReferenceTypeDefinitionDMO rc = new ExtendedReferenceTypeDefinitionDMO();
        return(rc);
    }

    @Override
    public ExtendedReferenceTypeDefinitionDMO getSlice(DmcSliceInfo info){
        ExtendedReferenceTypeDefinitionDMO rc = new ExtendedReferenceTypeDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * Indicates the class of object to which an \n
     * ExtendedReferenceTypeDefinition refers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
    public ClassDefinitionREF getExtendedReferenceClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MetaDMSAG.__extendedReferenceClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets extendedReferenceClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setExtendedReferenceClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendedReferenceClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MetaDMSAG.__extendedReferenceClass);
        
        attr.set(value);
        set(MetaDMSAG.__extendedReferenceClass,attr);
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
     * The extendedClass indicates the fully qualified name of the class\n that
     * is derived from the generated ComplexType to provide additional behaviour. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
    public void setExtendedClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendedClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__extendedClass);
        
        attr.set(value);
        set(MetaDMSAG.__extendedClass,attr);
    }

    /**
     * The field indicates a type and name for a field in a ComplexType. 
     * @return An Iterator of Field objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addField(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__field);
        if (attr == null)
            attr = new DmcTypeFieldMV(MetaDMSAG.__field);
        
        attr.add(value);
        add(MetaDMSAG.__field,attr);
        return(attr);
    }

    /**
     * The fieldSeparator is used to indicate the separation character used\n
     * when a ComplexType is represented as a String. If a fieldSeparator isn't
     * specified, it is\n assumed to be a space. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2334)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2426)
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
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
    public Iterator<NameValuePair> getNvp(){
        DmcTypeNameValuePairMV attr = (DmcTypeNameValuePairMV) get(MetaDMSAG.__nvp);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another nvp value.
     * @param value A value compatible with DmcTypeNameValuePairMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addNvp(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nvp);
        if (attr == null)
            attr = new DmcTypeNameValuePairMV(MetaDMSAG.__nvp);
        
        attr.add(value);
        add(MetaDMSAG.__nvp,attr);
        return(attr);
    }

    /**
     * Indicates an optional part of a complex type definition. 
     * @return An Iterator of Part objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
    public Iterator<Part> getOptionalPart(){
        DmcTypePartMV attr = (DmcTypePartMV) get(MetaDMSAG.__optionalPart);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another optionalPart value.
     * @param value A value compatible with DmcTypePartMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addOptionalPart(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__optionalPart);
        if (attr == null)
            attr = new DmcTypePartMV(MetaDMSAG.__optionalPart);
        
        attr.add(value);
        add(MetaDMSAG.__optionalPart,attr);
        return(attr);
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
     * Indicates a required part of a complex type definition. 
     * @return An Iterator of Part objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2531)
    public Iterator<Part> getRequiredPart(){
        DmcTypePartMV attr = (DmcTypePartMV) get(MetaDMSAG.__requiredPart);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another requiredPart value.
     * @param value A value compatible with DmcTypePartMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2636)
    public DmcAttribute<?> addRequiredPart(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__requiredPart);
        if (attr == null)
            attr = new DmcTypePartMV(MetaDMSAG.__requiredPart);
        
        attr.add(value);
        add(MetaDMSAG.__requiredPart,attr);
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
