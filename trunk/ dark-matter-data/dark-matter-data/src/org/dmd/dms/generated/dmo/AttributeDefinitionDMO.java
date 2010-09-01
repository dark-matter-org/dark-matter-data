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
 * This class is used to define attributes to be used as part of a class
 * definition.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1027)
 */
@SuppressWarnings({"unused", "serial"})
public class AttributeDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

     public final static String _name = "name";
     public final static String _type = "type";
     public final static String _description = "description";
     public final static String _isMultiValued = "isMultiValued";
     public final static String _abbrev = "abbrev";
     public final static String _label = "label";
     public final static String _dataType = "dataType";
     public final static String _reposOid = "reposOid";
     public final static String _allowedClass = "allowedClass";
     public final static String _suppressAttrEvent = "suppressAttrEvent";
     public final static String _addedVersion = "addedVersion";
     public final static String _obsoleteVersion = "obsoleteVersion";
     public final static String _allowDuplicates = "allowDuplicates";
     public final static String _secure = "secure";


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
     * The label attribute is used to specify a string that can be used as a
     * label when a value is displayed in a UI or webpage.
     */
    public String getLabel(){
        DmcTypeString attr = (DmcTypeString) get(_label);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets label to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setLabel(Object value) throws DmcValueException {
        DmcAttribute attr = get(_label);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_label,attr);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute.
     * If this attribute is set to PERSISTENT, you must also specify the
     * reposName attribute.
     */
    public DataTypeEnum getDataType(){
        DmcTypeDataTypeEnum attr = (DmcTypeDataTypeEnum) get(_dataType);
        if (attr == null)
            return(null);

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
     * This attribute indicates the object identifier of an attribute or class
     * when it is stored in a repository.
     */
    public String getReposOid(){
        DmcTypeString attr = (DmcTypeString) get(_reposOid);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposOid to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setReposOid(Object value) throws DmcValueException {
        DmcAttribute attr = get(_reposOid);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_reposOid,attr);
    }

    /**
     * Indicates the class that is allowed in an object reference type. This is
     * used in both type definitions and (if the type is OBJREF) in attributes
     * definitions.
     */
    public ClassDefinitionREF getAllowedClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_allowedClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets allowedClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setAllowedClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_allowedClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.set(value);
        set(_allowedClass,attr);
    }

    /**
     * This flag provides finer granularity suppression support versus the
     * EventSuppression flag (which is used for entire classes of objects). In
     * certain cases, we have attributes that provide detailed state information
     * that isn't of any use to the end client because they rely on an aggregate
     * state. Sending changes in these detailed state attributes can cause severe
     * event processing load. <P> If this flag is set to true for all attributes
     * in a modify event, we won't send the event to our regular clients; we will
     * still send the event to enigma clients. This approach will prevent event
     * storms when we see certain state attributes changing very rapidly on the
     * 7200 (e.g. loss of lock, loss of signal).
     */
    public Boolean getSuppressAttrEvent(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_suppressAttrEvent);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets suppressAttrEvent to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setSuppressAttrEvent(Object value) throws DmcValueException {
        DmcAttribute attr = get(_suppressAttrEvent);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_suppressAttrEvent,attr);
    }

    /**
     * This indicates the S load (in service load) level at which this entity
     * introduced. This defaults to S1.0-010.
     */
    public String getAddedVersion(){
        DmcTypeString attr = (DmcTypeString) get(_addedVersion);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addedVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setAddedVersion(Object value) throws DmcValueException {
        DmcAttribute attr = get(_addedVersion);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_addedVersion,attr);
    }

    /**
     * This indicates the S load (in service load) level at which this entity
     * became obsolete. So, if the current version in the field is S1.0-010 and
     * you are now obsoleting an attribute, this field would specify S1.0-011.
     * <P> This attribute (when set to true) indicates that a schema definition
     * is obsolete and shouldn't be used in subsequent releases of the code. This
     * supports the general concept that we never delete attributes or classes,
     * we obsolete them. This makes the job of migration from release to release
     * easier.
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
     * This attribute can be set on a multi-valued attribute definition to
     * indicate that it allows duplicate entries; normally, only one copy of a
     * value can be stored in a multi-valued attribute. This restriction came
     * from the directory technology that we use. So, you shouldn't try to use
     * this flag on attributes that might be stored in the directory - the
     * directory won't allow the duplicates.
     */
    public Boolean getAllowDuplicates(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(_allowDuplicates);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets allowDuplicates to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setAllowDuplicates(Object value) throws DmcValueException {
        DmcAttribute attr = get(_allowDuplicates);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(_allowDuplicates,attr);
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
