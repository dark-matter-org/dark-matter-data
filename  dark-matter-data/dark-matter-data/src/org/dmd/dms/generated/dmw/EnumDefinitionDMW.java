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
import org.dmd.dms.types.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * The EnumDefinition allows for the definition of real Java enums that
 * provide inherent mapping of the string and integer values of the enum into
 * actual enum values. Once defined, EnumDefinitions can be used where ever
 * you would use a TypeDefinition name i.e. they can be used in the type
 * attribute of AttributeDefinitions.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDefClasses(MetaGenerator.java:797)
 */
@SuppressWarnings("unused")
public class EnumDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private EnumDefinitionDMO mycore;

    protected EnumDefinitionDMW() {
        super(new EnumDefinitionDMO());
        mycore = (EnumDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected EnumDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (EnumDefinitionDMO) core;
        mycore.setContainer(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<EnumDefinition>());
    }

    protected EnumDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected EnumDefinitionDMW(String mn) throws DmcValueException {
        super(new EnumDefinitionDMO());
        mycore = (EnumDefinitionDMO) core;
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
     * Indicates the set of enum values associated with an enumeration type
     * definition.
     * @returns An Iterator of EnumValue objects.
     */
    public Iterator<EnumValue> getEnumValue(){
        DmcTypeEnumValue attr = (DmcTypeEnumValue) mycore.get(EnumDefinitionDMO._enumValue);
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
        return(mycore.addEnumValue(value));
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


}
