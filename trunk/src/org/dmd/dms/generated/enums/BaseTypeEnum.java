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
package org.dmd.dms.generated.enums;

import java.util.*;

/**
 * The BaseTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpEnumClass(MetaGenerator.java:516)
 */
public enum BaseTypeEnum
{
    /**
     * Indicates a primitive data type such as Integer, String, long or a
     * generated complex type.
     */
    PRIMITIVE(0),

    /**
     * Indicates a named object reference.
     */
    NAMEDREF(1),

    /**
     * Indicates an unnamed object reference.
     */
    UNNAMEDREF(2),

    /**
     * Indicates an extended reference.
     */
    EXTENDEDREF(3),

    /**
     * Indicates a type that has a defined key type.
     */
    KEYED(4);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,BaseTypeEnum> lookup = new HashMap<Integer,BaseTypeEnum>();

    static {
        for(BaseTypeEnum s : EnumSet.allOf(BaseTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,BaseTypeEnum> lookupString = new HashMap<String, BaseTypeEnum>();

    static {
        for(BaseTypeEnum s : EnumSet.allOf(BaseTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private BaseTypeEnum(int i){
        ival = i;
    }

    /**
     * Returns the value of this enum value as an int.
     */
    public int intValue(){
        return(ival);
    }

    /**
     * Returns the enum value of the specified int or null if it's not valid.
     */
    public static BaseTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static BaseTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}