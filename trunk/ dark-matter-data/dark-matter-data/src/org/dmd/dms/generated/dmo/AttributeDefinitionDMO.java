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
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * This class is used to define attributes to be used as part of a class
 * definition.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1111)
 */
@SuppressWarnings("serial")
public class AttributeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __type = new DmcAttributeInfo("type",19,"TypeDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __valueType = new DmcAttributeInfo("valueType",12,"ValueTypeEnum",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __nullReturnValue = new DmcAttributeInfo("nullReturnValue",7,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __abbrev = new DmcAttributeInfo("abbrev",9,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __obsoleteVersion = new DmcAttributeInfo("obsoleteVersion",73,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __secure = new DmcAttributeInfo("secure",78,"Boolean",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dataType = new DmcAttributeInfo("dataType",11,"DataTypeEnum",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __dmdID = new DmcAttributeInfo("dmdID",3,"Integer",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __genericArgs = new DmcAttributeInfo("genericArgs",94,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __genericArgsImport = new DmcAttributeInfo("genericArgsImport",98,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __designatedNameAttribute = new DmcAttributeInfo("designatedNameAttribute",102,"Boolean",ValueTypeEnum.SINGLE,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__type.id,__type);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__valueType.id,__valueType);
        _ImAp.put(__nullReturnValue.id,__nullReturnValue);
        _ImAp.put(__abbrev.id,__abbrev);
        _ImAp.put(__obsoleteVersion.id,__obsoleteVersion);
        _ImAp.put(__secure.id,__secure);
        _ImAp.put(__dataType.id,__dataType);
        _ImAp.put(__dmdID.id,__dmdID);
        _ImAp.put(__genericArgs.id,__genericArgs);
        _ImAp.put(__genericArgsImport.id,__genericArgsImport);
        _ImAp.put(__designatedNameAttribute.id,__designatedNameAttribute);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__type.name,__type);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__valueType.name,__valueType);
        _SmAp.put(__nullReturnValue.name,__nullReturnValue);
        _SmAp.put(__abbrev.name,__abbrev);
        _SmAp.put(__obsoleteVersion.name,__obsoleteVersion);
        _SmAp.put(__secure.name,__secure);
        _SmAp.put(__dataType.name,__dataType);
        _SmAp.put(__dmdID.name,__dmdID);
        _SmAp.put(__genericArgs.name,__genericArgs);
        _SmAp.put(__genericArgsImport.name,__genericArgsImport);
        _SmAp.put(__designatedNameAttribute.name,__designatedNameAttribute);
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

     public String getConstructionClassName(){
         return("AttributeDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Indicates the type of an attribute. The value is the name of any
     * previously defined DmdTypeDef definition. When accessed in Java, this is a
     * reference to a DmdTypeDef object.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public TypeDefinitionREF getType(){
        DmcTypeTypeDefinitionREFSV attr = (DmcTypeTypeDefinitionREFSV) get(__type);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets type to the specified value.
     * @param value A value compatible with DmcTypeTypeDefinitionREFSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__type);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREFSV(__type);
        
        attr.set(value);
        set(__type,attr);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * This attribute indicates the cardinality and storage mechanism for an
     * attribute.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public ValueTypeEnum getValueType(){
        DmcTypeValueTypeEnumSV attr = (DmcTypeValueTypeEnumSV) get(__valueType);
        if (attr == null)
            return(ValueTypeEnum.SINGLE);

        return(attr.getSV());
    }

    /**
     * Sets valueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setValueType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__valueType);
        if (attr == null)
            attr = new DmcTypeValueTypeEnumSV(__valueType);
        
        attr.set(value);
        set(__valueType,attr);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to provide a default value for non-existent attribute values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getNullReturnValue(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__nullReturnValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setNullReturnValue(Object value) throws DmcValueException {
        DmcAttribute attr = get(__nullReturnValue);
        if (attr == null)
            attr = new DmcTypeStringSV(__nullReturnValue);
        
        attr.set(value);
        set(__nullReturnValue,attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getAbbrev(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setAbbrev(Object value) throws DmcValueException {
        DmcAttribute attr = get(__abbrev);
        if (attr == null)
            attr = new DmcTypeStringSV(__abbrev);
        
        attr.set(value);
        set(__abbrev,attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getObsoleteVersion(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(__obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeStringSV(__obsoleteVersion);
        
        attr.set(value);
        set(__obsoleteVersion,attr);
    }

    /**
     * This attribute indicates whether or not the attribute should be encrypted
     * before being transported over the wire or stored in a file or repository
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public Boolean getSecure(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__secure);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets secure to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setSecure(Object value) throws DmcValueException {
        DmcAttribute attr = get(__secure);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__secure);
        
        attr.set(value);
        set(__secure,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnumSV attr = (DmcTypeDataTypeEnumSV) get(__dataType);
        if (attr == null)
            return(DataTypeEnum.PERSISTENT);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDataType(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnumSV(__dataType);
        
        attr.set(value);
        set(__dataType,attr);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes. This is used as part of the serialization mechanisms built
     * into Dark Matter Objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public Integer getDmdID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDmdID(Object value) throws DmcValueException {
        DmcAttribute attr = get(__dmdID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__dmdID);
        
        attr.set(value);
        set(__dmdID,attr);
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the use
     * of a class in an autogenerated Iterable.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getGenericArgs(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__genericArgs);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setGenericArgs(Object value) throws DmcValueException {
        DmcAttribute attr = get(__genericArgs);
        if (attr == null)
            attr = new DmcTypeStringSV(__genericArgs);
        
        attr.set(value);
        set(__genericArgs,attr);
    }

    /**
     * Indicates the import required to support a genericArgs specification i.e.
     * if you're not specifying something like <?>, an additional import may be
     * required.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public String getGenericArgsImport(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__genericArgsImport);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genericArgsImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setGenericArgsImport(Object value) throws DmcValueException {
        DmcAttribute attr = get(__genericArgsImport);
        if (attr == null)
            attr = new DmcTypeStringSV(__genericArgsImport);
        
        attr.set(value);
        set(__genericArgsImport,attr);
    }

    /**
     * The designatedNameAttribute flag is used to identify the attribute
     * designated as the standard wrapper for names of a particular STRUCTURAL
     * nameType.  One, and only one, attribute definition can be the
     * designatedNameAttribute for a  TypeDefinition that is identified as a
     * STRUCTURAL nameType.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1400)
    public Boolean getDesignatedNameAttribute(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__designatedNameAttribute);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets designatedNameAttribute to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1446)
    @SuppressWarnings("unchecked")
    public void setDesignatedNameAttribute(Object value) throws DmcValueException {
        DmcAttribute attr = get(__designatedNameAttribute);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__designatedNameAttribute);
        
        attr.set(value);
        set(__designatedNameAttribute,attr);
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
