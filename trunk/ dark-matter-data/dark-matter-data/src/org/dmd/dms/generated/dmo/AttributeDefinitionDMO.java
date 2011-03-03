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
 * This class is used to define attributes to be used as part of a class
 * definition.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1069)
 */
@SuppressWarnings({"unused", "serial"})
public class AttributeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

    public final static String _name = "name";
    public final static String _type = "type";
    public final static String _description = "description";
    public final static String _isMultiValued = "isMultiValued";
    public final static String _attrType = "attrType";
    public final static String _abbrev = "abbrev";
    public final static String _obsoleteVersion = "obsoleteVersion";
    public final static String _secure = "secure";
    public final static String _dataType = "dataType";
    public final static String _dmdID = "dmdID";


    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",1,"String",false,false);
    public final static DmcAttributeInfo __type = new DmcAttributeInfo("type",2,"TypeDefinition",false,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",3,"String",false,false);
    public final static DmcAttributeInfo __isMultiValued = new DmcAttributeInfo("isMultiValued",4,"Boolean",false,true);
    public final static DmcAttributeInfo __attrType = new DmcAttributeInfo("attrType",5,"AttributeTypeEnum",false,true);
    public final static DmcAttributeInfo __abbrev = new DmcAttributeInfo("abbrev",6,"String",false,true);
    public final static DmcAttributeInfo __obsoleteVersion = new DmcAttributeInfo("obsoleteVersion",7,"String",false,true);
    public final static DmcAttributeInfo __secure = new DmcAttributeInfo("secure",8,"Boolean",false,true);
    public final static DmcAttributeInfo __dataType = new DmcAttributeInfo("dataType",9,"DataTypeEnum",false,true);
    public final static DmcAttributeInfo __dmdID = new DmcAttributeInfo("dmdID",10,"Integer",false,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__type.id,__type);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__isMultiValued.id,__isMultiValued);
        _ImAp.put(__attrType.id,__attrType);
        _ImAp.put(__abbrev.id,__abbrev);
        _ImAp.put(__obsoleteVersion.id,__obsoleteVersion);
        _ImAp.put(__secure.id,__secure);
        _ImAp.put(__dataType.id,__dataType);
        _ImAp.put(__dmdID.id,__dmdID);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__type.name,__type);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__isMultiValued.name,__isMultiValued);
        _SmAp.put(__attrType.name,__attrType);
        _SmAp.put(__abbrev.name,__abbrev);
        _SmAp.put(__obsoleteVersion.name,__obsoleteVersion);
        _SmAp.put(__secure.name,__secure);
        _SmAp.put(__dataType.name,__dataType);
        _SmAp.put(__dmdID.name,__dmdID);
    }


    public AttributeDefinitionDMO(){
        super("AttributeDefinition",_ImAp,_SmAp);
    }

    public AttributeDefinitionDMO(String oc){
        super(oc);
    }

    public AttributeDefinitionDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    @Override
    public AttributeDefinitionDMO getOneOfMe(){
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
     * Indicates the type of an attribute. The value is the name of any
     * previously defined DmdTypeDef definition. When accessed in Java, this is a
     * reference to a DmdTypeDef object.
     */
    public TypeDefinitionREF getType(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) get(_type);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets type to the specified value.
     * @param value A value compatible with DmcTypeTypeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_type);
        if (attr == null)
            attr = new DmcTypeTypeDefinitionREF();
        
        attr.set(value);
        set(_type,attr);
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
     * This flag is set to true to indicate that an attribute is multi-valued.
     */
    public Boolean getIsMultiValued(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_isMultiValued);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isMultiValued to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setIsMultiValued(Object value) throws DmcValueException {
        DmcAttribute attr = get(_isMultiValued);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_isMultiValued,attr);
    }

    /**
     * This attribute indicates the cardinality and storage mechanism for an
     * attribute.
     */
    public AttributeTypeEnum getAttrType(){
        DmcTypeAttributeTypeEnum attr = (DmcTypeAttributeTypeEnum) get(_attrType);
        if (attr == null)
            return(AttributeTypeEnum.SINGLE);

        return(attr.getSV());
    }

    /**
     * Sets attrType to the specified value.
     * @param value A value compatible with DmcTypeAttributeTypeEnum
     */
    @SuppressWarnings("unchecked")
    public void setAttrType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_attrType);
        if (attr == null)
            attr = new DmcTypeAttributeTypeEnum();
        
        attr.set(value);
        set(_attrType,attr);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    public String getAbbrev(){
        DmcTypeString attr = (DmcTypeString) get(_abbrev);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setAbbrev(Object value) throws DmcValueException {
        DmcAttribute attr = get(_abbrev);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_abbrev,attr);
    }

    /**
     * This indicates the version at which something became obsolete. Generally
     * speaking you shouldn't ever delete definitions for products that have been
     * released to the field, this may break backwards compatibility. Instead,
     * you should mark them as obsolete.
     */
    public String getObsoleteVersion(){
        DmcTypeString attr = (DmcTypeString) get(_obsoleteVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setObsoleteVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(_obsoleteVersion);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_obsoleteVersion,attr);
    }

    /**
     * This attribute indicates whether or not the attribute should be encrypted
     * before being transported over the wire or stored in a file or repository
     */
    public Boolean getSecure(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_secure);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets secure to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setSecure(Object value) throws DmcValueException {
        DmcAttribute attr = get(_secure);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_secure,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or class of object. How this information is used is application dependent.
     */
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnum attr = (DmcTypeDataTypeEnum) get(_dataType);
        if (attr == null)
            return(DataTypeEnum.TRANSIENT);

        return(attr.getSV());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnum
     */
    @SuppressWarnings("unchecked")
    public void setDataType(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dataType);
        if (attr == null)
            attr = new DmcTypeDataTypeEnum();
        
        attr.set(value);
        set(_dataType,attr);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes. This is used as part of the serialization mechanisms built
     * into Dark Matter Objects.
     */
    public Integer getDmdID(){
        DmcTypeInteger attr = (DmcTypeInteger) get(_dmdID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    @SuppressWarnings("unchecked")
    public void setDmdID(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dmdID);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(_dmdID,attr);
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
