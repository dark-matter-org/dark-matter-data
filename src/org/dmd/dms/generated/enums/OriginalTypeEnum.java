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
package org.dmd.dms.generated.enums;

import java.util.*;

/**
 * The OriginalTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpEnumClass(MetaGenerator.java:991)
 */
public enum OriginalTypeEnum
{
    /**
     * The type is actually a type!.
     */
    TYPE(0),

    /**
     * The type is an enum.
     */
    ENUM(1),

    /**
     * The type is the internally generated one to represent an unnamed object.
     */
    OBJECT(2),

    /**
     * The type is the internally generated one to represent a reference to a
     * named object.
     */
    REFERENCE(3),

    /**
     * The type is an extended reference type.
     */
    EXTREF(4),

    /**
     * The is a complex type.
     */
    COMPLEXTYPE(5),

    /**
     * The type is a name type.
     */
    NAMETYPE(6);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,OriginalTypeEnum> lookup = new HashMap<Integer,OriginalTypeEnum>();

    static {
        for(OriginalTypeEnum s : EnumSet.allOf(OriginalTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,OriginalTypeEnum> lookupString = new HashMap<String, OriginalTypeEnum>();

    static {
        for(OriginalTypeEnum s : EnumSet.allOf(OriginalTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private OriginalTypeEnum(int i){
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
    public static OriginalTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static OriginalTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}