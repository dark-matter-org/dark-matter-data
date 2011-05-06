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
 * The FilterTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpEnumClass(MetaGenerator.java:471)
 */
public enum FilterTypeEnum
{
    /**
     * Indicates that no filter operation was specified.
     */
    NONE(0),

    /**
     *  Indicates that the rest of the filter ops that follow will be ANDed
     * together.
     */
    AND(1),

    /**
     *   Indicates that the rest of the filter ops that follow will be ORed
     * together.
     */
    OR(2),

    /**
     *   Performs a test for equality.
     */
    EQ(3),

    /**
     *   Performs a test for inequality.
     */
    NE(4),

    /**
     *   Performs a test for the presence of an attribute.
     */
    PR(5),

    /**
     *   Performs a test to see if an attribute is not present.
     */
    NP(6);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,FilterTypeEnum> lookup = new HashMap<Integer,FilterTypeEnum>();

    static {
        for(FilterTypeEnum s : EnumSet.allOf(FilterTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,FilterTypeEnum> lookupString = new HashMap<String, FilterTypeEnum>();

    static {
        for(FilterTypeEnum s : EnumSet.allOf(FilterTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private FilterTypeEnum(int i){
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
    public static FilterTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static FilterTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}