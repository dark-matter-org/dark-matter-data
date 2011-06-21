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
 * The OperationalContextEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpEnumClass(MetaGenerator.java:494)
 */
public enum OperationalContextEnum
{
    /**
     *       Indicates that the component follows basic Dark Matter Object rules
     * which likewise conform to GWT JRE Emulation.
     */
    DMO(0),

    /**
     *  indicates that the component operates in a ful Java environment; no
     * restrictions.
     */
    FULLJAVA(1);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,OperationalContextEnum> lookup = new HashMap<Integer,OperationalContextEnum>();

    static {
        for(OperationalContextEnum s : EnumSet.allOf(OperationalContextEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,OperationalContextEnum> lookupString = new HashMap<String, OperationalContextEnum>();

    static {
        for(OperationalContextEnum s : EnumSet.allOf(OperationalContextEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private OperationalContextEnum(int i){
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
    public static OperationalContextEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static OperationalContextEnum get(String str) {
        return(lookupString.get(str));
    }

}