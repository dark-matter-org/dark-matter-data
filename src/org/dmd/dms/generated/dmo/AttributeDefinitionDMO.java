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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1938)
import java.io.Serializable;                            // Serializable marker interface - (MetaGenerator.java:1887)
import java.util.*;                                     // Attribute info support - (MetaGenerator.java:1889)
import org.dmd.dmc.*;                                   // Dark matter core - (MetaGenerator.java:1911)
import org.dmd.dmc.definitions.DmcDefinitionIF;         // This is a domain specific definition - (MetaGenerator.java:1924)
import org.dmd.dmc.types.*;                             // Basic type access - (MetaGenerator.java:1901)
import org.dmd.dms.generated.enums.*;                   // Has enum attributes - (MetaGenerator.java:1933)
import org.dmd.dms.generated.types.*;                   // Generated type access - (MetaGenerator.java:1927)



/**
 * This class is used to define attributes to be used\n as part of a class
 * definition. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1948)
 */
@SuppressWarnings("serial")
public class AttributeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable, DmcDefinitionIF {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__name.id,MetaDMSAG.__name);
        _ImAp.put(MetaDMSAG.__type.id,MetaDMSAG.__type);
        _ImAp.put(MetaDMSAG.__abbrev.id,MetaDMSAG.__abbrev);
        _ImAp.put(MetaDMSAG.__dataType.id,MetaDMSAG.__dataType);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__designatedFilterAttribute.id,MetaDMSAG.__designatedFilterAttribute);
        _ImAp.put(MetaDMSAG.__designatedNameAttribute.id,MetaDMSAG.__designatedNameAttribute);
        _ImAp.put(MetaDMSAG.__dmdID.id,MetaDMSAG.__dmdID);
        _ImAp.put(MetaDMSAG.__dotName.id,MetaDMSAG.__dotName);
        _ImAp.put(MetaDMSAG.__example.id,MetaDMSAG.__example);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__genericArgs.id,MetaDMSAG.__genericArgs);
        _ImAp.put(MetaDMSAG.__genericArgsImport.id,MetaDMSAG.__genericArgsImport);
        _ImAp.put(MetaDMSAG.__indexSize.id,MetaDMSAG.__indexSize);
        _ImAp.put(MetaDMSAG.__internalUse.id,MetaDMSAG.__internalUse);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__nullReturnValue.id,MetaDMSAG.__nullReturnValue);
        _ImAp.put(MetaDMSAG.__nvp.id,MetaDMSAG.__nvp);
        _ImAp.put(MetaDMSAG.__obsoleteVersion.id,MetaDMSAG.__obsoleteVersion);
        _ImAp.put(MetaDMSAG.__optimize.id,MetaDMSAG.__optimize);
        _ImAp.put(MetaDMSAG.__preserveNewlines.id,MetaDMSAG.__preserveNewlines);
        _ImAp.put(MetaDMSAG.__relatedToConcept.id,MetaDMSAG.__relatedToConcept);
        _ImAp.put(MetaDMSAG.__secure.id,MetaDMSAG.__secure);
        _ImAp.put(MetaDMSAG.__sortName.id,MetaDMSAG.__sortName);
        _ImAp.put(MetaDMSAG.__tags.id,MetaDMSAG.__tags);
        _ImAp.put(MetaDMSAG.__valueType.id,MetaDMSAG.__valueType);
        _ImAp.put(MetaDMSAG.__weakReference.id,MetaDMSAG.__weakReference);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__name.name,MetaDMSAG.__name);
        _SmAp.put(MetaDMSAG.__type.name,MetaDMSAG.__type);
        _SmAp.put(MetaDMSAG.__abbrev.name,MetaDMSAG.__abbrev);
        _SmAp.put(MetaDMSAG.__dataType.name,MetaDMSAG.__dataType);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__designatedFilterAttribute.name,MetaDMSAG.__designatedFilterAttribute);
        _SmAp.put(MetaDMSAG.__designatedNameAttribute.name,MetaDMSAG.__designatedNameAttribute);
        _SmAp.put(MetaDMSAG.__dmdID.name,MetaDMSAG.__dmdID);
        _SmAp.put(MetaDMSAG.__dotName.name,MetaDMSAG.__dotName);
        _SmAp.put(MetaDMSAG.__example.name,MetaDMSAG.__example);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__genericArgs.name,MetaDMSAG.__genericArgs);
        _SmAp.put(MetaDMSAG.__genericArgsImport.name,MetaDMSAG.__genericArgsImport);
        _SmAp.put(MetaDMSAG.__indexSize.name,MetaDMSAG.__indexSize);
        _SmAp.put(MetaDMSAG.__internalUse.name,MetaDMSAG.__internalUse);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__nullReturnValue.name,MetaDMSAG.__nullReturnValue);
        _SmAp.put(MetaDMSAG.__nvp.name,MetaDMSAG.__nvp);
        _SmAp.put(MetaDMSAG.__obsoleteVersion.name,MetaDMSAG.__obsoleteVersion);
        _SmAp.put(MetaDMSAG.__optimize.name,MetaDMSAG.__optimize);
        _SmAp.put(MetaDMSAG.__preserveNewlines.name,MetaDMSAG.__preserveNewlines);
        _SmAp.put(MetaDMSAG.__relatedToConcept.name,MetaDMSAG.__relatedToConcept);
        _SmAp.put(MetaDMSAG.__secure.name,MetaDMSAG.__secure);
        _SmAp.put(MetaDMSAG.__sortName.name,MetaDMSAG.__sortName);
        _SmAp.put(MetaDMSAG.__tags.name,MetaDMSAG.__tags);
        _SmAp.put(MetaDMSAG.__valueType.name,MetaDMSAG.__valueType);
        _SmAp.put(MetaDMSAG.__weakReference.name,MetaDMSAG.__weakReference);
    }


    public AttributeDefinitionDMO(){
        super("AttributeDefinition");
    }

    public AttributeDefinitionDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public AttributeDefinitionDMO getNew(){
        AttributeDefinitionDMO rc = new AttributeDefinitionDMO();
        return(rc);
    }

    @Override
    public AttributeDefinitionDMO getSlice(DmcSliceInfo info){
        AttributeDefinitionDMO rc = new AttributeDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Indicates the type of an attribute. The value is the name of any\n
     * previously defined TypeDefinition, ClassDefinition, EnumDefinition or
     * ComplexTypeDefinition. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public TypeDefinitionREF getType(){
        DmcTypeTypeDefinitionREFSV attr = (DmcTypeTypeDefinitionREFSV) get(MetaDMSAG.__type);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets type to the specified value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__type);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFSV(MetaDMSAG.__type);
        
        attr.set(value);
        set(MetaDMSAG.__type,attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This\n concept is borrowed from directory technology where
     * shortened name forms are often\n used as part of distinguished names
     * (DNs). 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public String getAbbrev(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setAbbrev(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__abbrev);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__abbrev);
        
        attr.set(value);
        set(MetaDMSAG.__abbrev,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or\n class of object. How this information is used is application
     * dependent. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnumSV attr = (DmcTypeDataTypeEnumSV) get(MetaDMSAG.__dataType);
        if (attr == null)
            return(DataTypeEnum.PERSISTENT);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setDataType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnumSV(MetaDMSAG.__dataType);
        
        attr.set(value);
        set(MetaDMSAG.__dataType,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2557)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        attr.add(value);
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * The designatedFilterAttribute flag is used to identify the attribute\n
     * designated as the standard wrapper for filters of a particular type. \n
     * One, and only one, attribute definition can be the
     * designatedFilterAttribute for a \n TypeDefinition that is identified as
     * isFilterType. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public Boolean getDesignatedFilterAttribute(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__designatedFilterAttribute);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets designatedFilterAttribute to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setDesignatedFilterAttribute(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__designatedFilterAttribute);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__designatedFilterAttribute);
        
        attr.set(value);
        set(MetaDMSAG.__designatedFilterAttribute,attr);
    }

    /**
     * The designatedNameAttribute flag is used to identify the attribute\n
     * designated as the standard wrapper for names of a particular type. One,
     * and only one,\n attribute definition can be the designatedNameAttribute
     * for a TypeDefinition that has\n isNameType true. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public Boolean getDesignatedNameAttribute(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__designatedNameAttribute);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets designatedNameAttribute to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setDesignatedNameAttribute(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__designatedNameAttribute);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__designatedNameAttribute);
        
        attr.set(value);
        set(MetaDMSAG.__designatedNameAttribute,attr);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes.\n This is used as part of the serialization mechanisms
     * built into Dark Matter Objects. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public Integer getDmdID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setDmdID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dmdID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__dmdID);
        
        attr.set(value);
        set(MetaDMSAG.__dmdID,attr);
    }

    /**
     * The dotName attribute is used to store dot separated names. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * The example attribute is used to provide additional\n examples of how some
     * defined thing is to be used. 
     * @return An Iterator of Example objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<Example> getExample(){
        DmcTypeExampleMV attr = (DmcTypeExampleMV) get(MetaDMSAG.__example);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another example value.
     * @param value A value compatible with DmcTypeExampleMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addExample(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__example);
        if (attr == null)
            attr = new DmcTypeExampleMV(MetaDMSAG.__example);
        
        attr.add(value);
        add(MetaDMSAG.__example,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the\n use
     * of a class in an autogenerated Iterable. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public String getGenericArgs(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__genericArgs);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setGenericArgs(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__genericArgs);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__genericArgs);
        
        attr.set(value);
        set(MetaDMSAG.__genericArgs,attr);
    }

    /**
     * Indicates the import required to support a genericArgs specification i.e.
     * if you're\n not specifying something like <?>, an additional import may be
     * required. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public String getGenericArgsImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__genericArgsImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genericArgsImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setGenericArgsImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__genericArgsImport);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__genericArgsImport);
        
        attr.set(value);
        set(MetaDMSAG.__genericArgsImport,attr);
    }

    /**
     * The indexSize is used in conjunction with the MULTI valueType to\n
     * indicate that the attribute may have the specified number of values and is
     * integer indexed.\n Indexed attributes may be thought of as having a
     * predetermined number of slots into which\n values may be stored. When
     * indexed, an attribute has values added to it using the setMVnth()\n
     * interface, not the usual add() interface. If you attempt to use add() with
     * an indexed attribute,\n an exception will be thrown. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public Integer getIndexSize(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__indexSize);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets indexSize to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setIndexSize(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__indexSize);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__indexSize);
        
        attr.set(value);
        set(MetaDMSAG.__indexSize,attr);
    }

    /**
     * Indicates if an attribute is used and set within the Dark Matter Data\n
     * code generation mechanisms. In the documentation generation code,
     * attributes marked as\n internalUse WILL NOT be displayed unless you set
     * the -internalUse flag is indicated. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public Boolean getInternalUse(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__internalUse);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets internalUse to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setInternalUse(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__internalUse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__internalUse);
        
        attr.set(value);
        set(MetaDMSAG.__internalUse,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when\n an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined\n to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to\n provide a default value for non-existent attribute values. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public String getNullReturnValue(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__nullReturnValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setNullReturnValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nullReturnValue);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__nullReturnValue);
        
        attr.set(value);
        set(MetaDMSAG.__nullReturnValue,attr);
    }

    /**
     * A set of additional name value pairs that can be associated with an
     * object. 
     * @return An Iterator of NameValuePair objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addNvp(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__nvp);
        if (attr == null)
            attr = new DmcTypeNameValuePairMV(MetaDMSAG.__nvp);
        
        attr.add(value);
        add(MetaDMSAG.__nvp,attr);
        return(attr);
    }

    /**
     * This indicates the version at which something became obsolete.\n Generally
     * speaking you shouldn't ever delete definitions for products that have\n
     * been released to the field, this may break backwards compatibility.
     * Instead, you\n should mark them as obsolete. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public String getObsoleteVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__obsoleteVersion);
        
        attr.set(value);
        set(MetaDMSAG.__obsoleteVersion,attr);
    }

    /**
     * Depending on what you're modelling, you often come across\n places where
     * you can see an opportunity to optimize, streamline or improve something
     * e.g. merging\n concepts together, representing something differently,
     * adding a relationship - whatever.\n However, these ideas often get lost in
     * the shuffle or, if you add them into an overall\n description of
     * something, they don't stand out.\n <p/>\n Any dark-matter definition can
     * be decorated with optimize notes. These notes provide 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
    public Iterator<String> getOptimize(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__optimize);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another optimize value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addOptimize(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__optimize);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__optimize);
        
        attr.add(value);
        add(MetaDMSAG.__optimize,attr);
        return(attr);
    }

    /**
     * Indicates that newline characters should be preserved when an\n attribute
     * is parsed by the DmcUncheckedOIFParser. This is useful for certain
     * attributes\n when newlines are required to properly format the contents of
     * the attribute at\n a later time. For example, the description attribute is
     * later dumped as part of \n HTML documentation and, if the newlines are
     * stripped, it won't be properly formatted. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public Boolean getPreserveNewlines(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__preserveNewlines);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets preserveNewlines to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setPreserveNewlines(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__preserveNewlines);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__preserveNewlines);
        
        attr.set(value);
        set(MetaDMSAG.__preserveNewlines,attr);
    }

    /**
     * Allows for references to base concepts that relate this\n definition to
     * another definition in the Concinnity domain. This mechanism is only used\n
     * in the domain of dark-matter schema definitions; other DSLs will allow for
     * direct\n reference to Concinnity concepts. 
     * @return An Iterator of ConcinnityDMO objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2535)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addRelatedToConcept(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            attr = new DmcTypeConcinnityREFMV(MetaDMSAG.__relatedToConcept);
        
        attr.add(value);
        add(MetaDMSAG.__relatedToConcept,attr);
        return(attr);
    }

    /**
     * This attribute indicates whether or not the attribute should\n be
     * encrypted before being transported over the wire or stored in a file or\n
     * repository 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public Boolean getSecure(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__secure);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets secure to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setSecure(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__secure);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__secure);
        
        attr.set(value);
        set(MetaDMSAG.__secure,attr);
    }

    /**
     * The sortName is used in siutations where we need a name\n for storage of a
     * definition that is globally unique but can be sorted on the basis\n of the
     * definition name, not the module name. The dotName for a definition is\n
     * module.definition...type, whereas the sortName would be
     * definition...module.type.\n So, for things like documentation generation,
     * the sortName provides a more \n natural ordering. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2542)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2647)
    public DmcAttribute<?> addTags(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__tags);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__tags);
        
        attr.add(value);
        add(MetaDMSAG.__tags,attr);
        return(attr);
    }

    /**
     * This attribute indicates the cardinality and storage mechanism for an\n
     * attribute. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public ValueTypeEnum getValueType(){
        DmcTypeValueTypeEnumSV attr = (DmcTypeValueTypeEnumSV) get(MetaDMSAG.__valueType);
        if (attr == null)
            return(ValueTypeEnum.SINGLE);

        return(attr.getSV());
    }

    /**
     * Sets valueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setValueType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__valueType);
        if (attr == null)
            attr = new DmcTypeValueTypeEnumSV(MetaDMSAG.__valueType);
        
        attr.set(value);
        set(MetaDMSAG.__valueType,attr);
    }

    /**
     * A flag to indicate that a reference attribute is weak i.e. \n if the
     * object can't be resolved, no exception is thrown. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2340)
    public Boolean getWeakReference(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__weakReference);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets weakReference to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2432)
    public void setWeakReference(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__weakReference);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__weakReference);
        
        attr.set(value);
        set(MetaDMSAG.__weakReference,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:2131)

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
