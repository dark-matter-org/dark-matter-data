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
import org.dmd.dms.types.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * The EnumDefinition allows for the definition of real Java enums that
 * provide inherent mapping of the string and integer values of the enum into
 * actual enum values. Once defined, EnumDefinitions can be used where ever
 * you would use a TypeDefinition name i.e. they can be used in the type
 * attribute of AttributeDefinitions.
 * @author Auto Generated
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1059)
 */
@SuppressWarnings({"unused", "serial"})
public class EnumDefinitionDMO extends org.dmd.dms.generated.dmo.DmsDefinitionDMO {

     public EnumDefinitionDMO(){
         super("EnumDefinition");
     }

     public EnumDefinitionDMO(String oc){
         super(oc);
     }

    @Override
    public EnumDefinitionDMO getOneOfMe(){
        EnumDefinitionDMO rc = new EnumDefinitionDMO();
        return(rc);
    }

     public final static String _name = "name";
     public final static String _enumValue = "enumValue";
     public final static String _description = "description";
     public final static String _nullReturnValue = "nullReturnValue";


     public String getConstructionClassName(){
         return("EnumDefinition");
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
     * Indicates the set of enum values associated with an enumeration type
     * definition.
     * @return An Iterator of EnumValue objects.
     */
    public Iterator<EnumValue> getEnumValue(){
        DmcTypeEnumValue attr = (DmcTypeEnumValue) get(_enumValue);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another enumValue value.
     * @param value A value compatible with DmcTypeEnumValue
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addEnumValue(Object value) throws DmcValueException {
        DmcAttribute attr = get(_enumValue);
        if (attr == null)
            attr = new DmcTypeEnumValue();
        
        attr.add(value);
        add(_enumValue,attr);
        return(attr);
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
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to provide a default value for non-existent attribute values.
     */
    public String getNullReturnValue(){
        DmcTypeString attr = (DmcTypeString) get(_nullReturnValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setNullReturnValue(Object value) throws DmcValueException {
        DmcAttribute attr = get(_nullReturnValue);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_nullReturnValue,attr);
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
