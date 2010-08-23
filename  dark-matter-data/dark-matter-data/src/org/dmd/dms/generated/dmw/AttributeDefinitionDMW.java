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
 * This class is used to define attributes to be used as part of a class
 * definition.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDefClasses(MetaGenerator.java:797)
 */
@SuppressWarnings("unused")
public class AttributeDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private AttributeDefinitionDMO mycore;

    protected AttributeDefinitionDMW() {
        super(new AttributeDefinitionDMO());
        mycore = (AttributeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected AttributeDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (AttributeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<AttributeDefinition>());
    }

    protected AttributeDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected AttributeDefinitionDMW(String mn) throws DmcValueException {
        super(new AttributeDefinitionDMO());
        mycore = (AttributeDefinitionDMO) core;
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
     * Indicates the type of an attribute. The value is the name of any
     * previously defined DmdTypeDef definition. When accessed in Java, this is a
     * reference to a DmdTypeDef object.
     */
    public TypeDefinition getType(){
        DmcTypeTypeDefinitionREF attr = (DmcTypeTypeDefinitionREF) mycore.get(AttributeDefinitionDMO._type);
        if (attr == null)
            return(null);
        TypeDefinitionDMO obj = attr.getSV().getObject();
        return((TypeDefinition)obj.getContainer());
    }

    /**
     * Sets type to the specified value.
     * @param value A value compatible with TypeDefinition
     */
    public void setType(TypeDefinition value) throws DmcValueException {
        mycore.setType(value.getDmcObject());
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
     * This flag is set to true to indicate that an attribute is multi-valued.
     */
    public Boolean getIsMultiValued(){
        return(mycore.getIsMultiValued());
    }

    /**
     * Sets isMultiValued to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setIsMultiValued(Object value) throws DmcValueException {
        mycore.setIsMultiValued(value);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This concept is borrowed from directory technology where shortened
     * name forms are often used as part of distinguished names (DNs).
     */
    public String getAbbrev(){
        return(mycore.getAbbrev());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setAbbrev(Object value) throws DmcValueException {
        mycore.setAbbrev(value);
    }

    /**
     * The label attribute is used to specify a string that can be used as a
     * label when a value is displayed in a UI or webpage.
     */
    public String getLabel(){
        return(mycore.getLabel());
    }

    /**
     * Sets label to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setLabel(Object value) throws DmcValueException {
        mycore.setLabel(value);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute.
     * If this attribute is set to PERSISTENT, you must also specify the
     * reposName attribute.
     */
    public DataTypeEnum getDataType(){
        return(mycore.getDataType());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnum
     */
    public void setDataType(Object value) throws DmcValueException {
        mycore.setDataType(value);
    }

    /**
     * This attribute indicates the name of an attribute or class when it is
     * stored in a repository and added to that repository's schema. Generally
     * speaking, we will always use the standard ef prefix for all attribute and
     * class names. Like all other name values, this one must be globally unique.
     */
    public String getReposName(){
        return(mycore.getReposName());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setReposName(Object value) throws DmcValueException {
        mycore.setReposName(value);
    }

    /**
     * This attribute indicates the object identifier of an attribute or class
     * when it is stored in a repository.
     */
    public String getReposOid(){
        return(mycore.getReposOid());
    }

    /**
     * Sets reposOid to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setReposOid(Object value) throws DmcValueException {
        mycore.setReposOid(value);
    }

    /**
     * Indicates the class that is allowed in an object reference type. This is
     * used in both type definitions and (if the type is OBJREF) in attributes
     * definitions.
     */
    public ClassDefinition getAllowedClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) mycore.get(AttributeDefinitionDMO._allowedClass);
        if (attr == null)
            return(null);
        ClassDefinitionDMO obj = attr.getSV().getObject();
        return((ClassDefinition)obj.getContainer());
    }

    /**
     * Sets allowedClass to the specified value.
     * @param value A value compatible with ClassDefinition
     */
    public void setAllowedClass(ClassDefinition value) throws DmcValueException {
        mycore.setAllowedClass(value.getDmcObject());
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
        return(mycore.getSuppressAttrEvent());
    }

    /**
     * Sets suppressAttrEvent to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setSuppressAttrEvent(Object value) throws DmcValueException {
        mycore.setSuppressAttrEvent(value);
    }

    /**
     * This indicates the S load (in service load) level at which this entity
     * introduced. This defaults to S1.0-010.
     */
    public String getAddedVersion(){
        return(mycore.getAddedVersion());
    }

    /**
     * Sets addedVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setAddedVersion(Object value) throws DmcValueException {
        mycore.setAddedVersion(value);
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
        return(mycore.getObsoleteVersion());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setObsoleteVersion(Object value) throws DmcValueException {
        mycore.setObsoleteVersion(value);
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
        return(mycore.getAllowDuplicates());
    }

    /**
     * Sets allowDuplicates to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setAllowDuplicates(Object value) throws DmcValueException {
        mycore.setAllowDuplicates(value);
    }

    /**
     * This attribute indicates whether or not the attribute should be encrypted
     * before being transported over the wire or stored in a file or repository
     */
    public Boolean getSecure(){
        return(mycore.getSecure());
    }

    /**
     * Sets secure to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    public void setSecure(Object value) throws DmcValueException {
        mycore.setSecure(value);
    }


}
