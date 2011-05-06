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
 * The DataTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpEnumClass(MetaGenerator.java:472)
 */
public enum DataTypeEnum
{
    /**
     * Indicates that the data is transient i.e. it exists within the application
     * context in which it is used, but is not persisted across application
     * invocations and is not serialized in communications with other systems.
     */
    TRANSIENT(0),

    /**
     * Indicates that the data is meant to be persistent. What persistence
     * mechanism is used is application dependent.
     */
    PERSISTENT(1),

    /**
     * Indicates that the data is used within your system and  transmitted to
     * remote systems but is not persisted.
     */
    NONPERSISTENT(2);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,DataTypeEnum> lookup = new HashMap<Integer,DataTypeEnum>();

    static {
        for(DataTypeEnum s : EnumSet.allOf(DataTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,DataTypeEnum> lookupString = new HashMap<String, DataTypeEnum>();

    static {
        for(DataTypeEnum s : EnumSet.allOf(DataTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private DataTypeEnum(int i){
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
    public static DataTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static DataTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}