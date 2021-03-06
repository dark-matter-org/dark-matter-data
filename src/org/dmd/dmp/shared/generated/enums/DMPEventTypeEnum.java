//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010-2021 dark-matter-data committers
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
package org.dmd.dmp.shared.generated.enums;

import java.util.*;

import org.dmd.dmc.DmcEnumIF;

/**
 * The ObjectEventEnum indicates the type of operation that caused \n an
 * object event to be generated.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:100)
 */
public enum DMPEventTypeEnum implements DmcEnumIF
{
    CREATED(0,"Indicates that an object was created."),

    DELETED(1,"Indicates that an object was deleted."),

    MODIFIED(2,"Indicates that an object was modified."),

    LOADED(3,"Indicates that an object has been loaded in the cache.");

    // Maps our integer value to the enumeration value
    private static final Map<Integer,DMPEventTypeEnum> lookup = new HashMap<Integer,DMPEventTypeEnum>();

    static {
        for(DMPEventTypeEnum s : EnumSet.allOf(DMPEventTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,DMPEventTypeEnum> lookupString = new HashMap<String, DMPEventTypeEnum>();

    static {
        for(DMPEventTypeEnum s : EnumSet.allOf(DMPEventTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    // Our current display value as a String
    private String dval;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private DMPEventTypeEnum(int i, String d){
        ival = i;
        dval = d;
    }

    /**
     * Returns the value of this enum value as an int.
     */
    public int intValue(){
        return(ival);
    }

    /**
     * Returns the display value of this enum value as a String.
     */
    public String displayValue(){
        return(dval);
    }

    /**
     * Returns the enum value of the specified int or null if it's not valid.
     */
    public static DMPEventTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static DMPEventTypeEnum get(String str) {
        return(lookupString.get(str.toUpperCase()));
    }

}