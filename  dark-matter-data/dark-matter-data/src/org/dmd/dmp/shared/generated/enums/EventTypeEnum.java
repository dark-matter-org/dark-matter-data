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
package org.dmd.dmp.shared.generated.enums;

import java.util.*;

/**
 * The ObjectEventEnum indicates the type of operation that caused  an object
 * event to be generated.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:98)
 */
public enum EventTypeEnum
{
    /**
     * Indicates that an object was created.
     */
    CREATED(0),

    /**
     * Indicates that an object was deleted.
     */
    DELETED(1),

    /**
     * Indicates that an object was modified.
     */
    MODIFIED(2);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,EventTypeEnum> lookup = new HashMap<Integer,EventTypeEnum>();

    static {
        for(EventTypeEnum s : EnumSet.allOf(EventTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,EventTypeEnum> lookupString = new HashMap<String, EventTypeEnum>();

    static {
        for(EventTypeEnum s : EnumSet.allOf(EventTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private EventTypeEnum(int i){
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
    public static EventTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static EventTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}