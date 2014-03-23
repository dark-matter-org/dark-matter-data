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
 * The NameTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpEnumClass(MetaGenerator.java:567)
 */
public enum NameTypeEnum
{
    /**
     * An abstract name class
     */
    ABSTRACT(0),

    /**
     * A structural name class is an actual name implementation.
     */
    STRUCTURAL(1);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,NameTypeEnum> lookup = new HashMap<Integer,NameTypeEnum>();

    static {
        for(NameTypeEnum s : EnumSet.allOf(NameTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,NameTypeEnum> lookupString = new HashMap<String, NameTypeEnum>();

    static {
        for(NameTypeEnum s : EnumSet.allOf(NameTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private NameTypeEnum(int i){
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
    public static NameTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static NameTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}