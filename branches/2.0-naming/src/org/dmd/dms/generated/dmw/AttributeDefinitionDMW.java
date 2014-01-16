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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dmw.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;
import org.dmd.dmc.definitions.DmcDefinitionIF;

/**
 * This class is used to define attributes to be used\n as part of a class
 * definition. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1631)
 */
@SuppressWarnings("unused")
public class AttributeDefinitionDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

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

    protected AttributeDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (AttributeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  AttributeDefinitionDMO getDMO() {
        return(mycore);
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
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the type of an attribute. The value is the name of any\n
     * previously defined TypeDefinition, ClassDefinition, EnumDefinition or
     * ComplexTypeDefinition. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public TypeDefinition getType(){
        DmcTypeTypeDefinitionREFSV attr = (DmcTypeTypeDefinitionREFSV) mycore.get(MetaDMSAG.__type);
        if (attr == null)
            return(null);
        TypeDefinitionDMO obj = attr.getSV().getObject();
        return((TypeDefinition)obj.getContainer());
    }

    /**
     * Sets type to the specified value.
     * @param value A value compatible with TypeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2435)
    public void setType(TypeDefinition value) throws DmcValueException {
        mycore.setType(value.getDmcObject());
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2579)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2593)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2659)
    public void addDescription(Object value) throws DmcValueException {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2672)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * This attribute indicates the cardinality and storage mechanism for an\n
     * attribute. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public ValueTypeEnum getValueType(){
        return(mycore.getValueType());
    }

    /**
     * Sets valueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setValueType(Object value) throws DmcValueException {
        mycore.setValueType(value);
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when\n an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined\n to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to\n provide a default value for non-existent attribute values. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public String getNullReturnValue(){
        return(mycore.getNullReturnValue());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setNullReturnValue(Object value) throws DmcValueException {
        mycore.setNullReturnValue(value);
    }

    /**
     * This attribute stores an abbreviated form of the name of an attribute or
     * class. This\n concept is borrowed from directory technology where
     * shortened name forms are often\n used as part of distinguished names
     * (DNs). 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public String getAbbrev(){
        return(mycore.getAbbrev());
    }

    /**
     * Sets abbrev to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setAbbrev(Object value) throws DmcValueException {
        mycore.setAbbrev(value);
    }

    /**
     * This indicates the version at which something became obsolete.\n Generally
     * speaking you shouldn't ever delete definitions for products that have\n
     * been released to the field, this may break backwards compatibility.
     * Instead, you\n should mark them as obsolete. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public String getObsoleteVersion(){
        return(mycore.getObsoleteVersion());
    }

    /**
     * Sets obsoleteVersion to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setObsoleteVersion(Object value) throws DmcValueException {
        mycore.setObsoleteVersion(value);
    }

    /**
     * This attribute indicates whether or not the attribute should\n be
     * encrypted before being transported over the wire or stored in a file or\n
     * repository 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public Boolean getSecure(){
        return(mycore.getSecure());
    }

    /**
     * Sets secure to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setSecure(Object value) throws DmcValueException {
        mycore.setSecure(value);
    }

    /**
     * This attribute indicates the persistence characteristics of an attribute
     * or\n class of object. How this information is used is application
     * dependent. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public DataTypeEnum getDataType(){
        return(mycore.getDataType());
    }

    /**
     * Sets dataType to the specified value.
     * @param value A value compatible with DmcTypeDataTypeEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setDataType(Object value) throws DmcValueException {
        mycore.setDataType(value);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes.\n This is used as part of the serialization mechanisms
     * built into Dark Matter Objects. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setDmdID(Object value) throws DmcValueException {
        mycore.setDmdID(value);
    }

    /**
     * This attribute indicates the generic arguments to be supplied in the\n use
     * of a class in an autogenerated Iterable. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public String getGenericArgs(){
        return(mycore.getGenericArgs());
    }

    /**
     * Sets genericArgs to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setGenericArgs(Object value) throws DmcValueException {
        mycore.setGenericArgs(value);
    }

    /**
     * Indicates the import required to support a genericArgs specification i.e.
     * if you're\n not specifying something like <?>, an additional import may be
     * required. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public String getGenericArgsImport(){
        return(mycore.getGenericArgsImport());
    }

    /**
     * Sets genericArgsImport to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setGenericArgsImport(Object value) throws DmcValueException {
        mycore.setGenericArgsImport(value);
    }

    /**
     * The designatedNameAttribute flag is used to identify the attribute\n
     * designated as the standard wrapper for names of a particular type. One,
     * and only one,\n attribute definition can be the designatedNameAttribute
     * for a TypeDefinition that has\n isNameType true. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public Boolean getDesignatedNameAttribute(){
        return(mycore.getDesignatedNameAttribute());
    }

    /**
     * Sets designatedNameAttribute to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setDesignatedNameAttribute(Object value) throws DmcValueException {
        mycore.setDesignatedNameAttribute(value);
    }

    /**
     * The designatedFilterAttribute flag is used to identify the attribute\n
     * designated as the standard wrapper for filters of a particular type. \n
     * One, and only one, attribute definition can be the
     * designatedFilterAttribute for a \n TypeDefinition that is identified as
     * isFilterType. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public Boolean getDesignatedFilterAttribute(){
        return(mycore.getDesignatedFilterAttribute());
    }

    /**
     * Sets designatedFilterAttribute to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setDesignatedFilterAttribute(Object value) throws DmcValueException {
        mycore.setDesignatedFilterAttribute(value);
    }

    /**
     * Indicates if an attribute is used and set within the Dark Matter Data\n
     * code generation mechanisms. In the documentation generation code,
     * attributes marked as\n internalUse WILL NOT be displayed unless you set
     * the -internalUse flag is indicated. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public Boolean getInternalUse(){
        return(mycore.getInternalUse());
    }

    /**
     * Sets internalUse to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setInternalUse(Object value) throws DmcValueException {
        mycore.setInternalUse(value);
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public Integer getIndexSize(){
        return(mycore.getIndexSize());
    }

    /**
     * Sets indexSize to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setIndexSize(Object value) throws DmcValueException {
        mycore.setIndexSize(value);
    }

    /**
     * Indicates that newline characters should be preserved when an\n attribute
     * is parsed by the DmcUncheckedOIFParser. This is useful for certain
     * attributes\n when newlines are required to properly format the contents of
     * the attribute at\n a later time. For example, the description attribute is
     * later dumped as part of \n HTML documentation and, if the newlines are
     * stripped, it won't be properly formatted. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2375)
    public Boolean getPreserveNewlines(){
        return(mycore.getPreserveNewlines());
    }

    /**
     * Sets preserveNewlines to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2448)
    public void setPreserveNewlines(Object value) throws DmcValueException {
        mycore.setPreserveNewlines(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1792)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
