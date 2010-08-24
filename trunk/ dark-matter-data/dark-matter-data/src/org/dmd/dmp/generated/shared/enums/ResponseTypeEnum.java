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
package org.dmd.dmp.generated.shared.enums;

import java.util.*;

/**
 * The ResponseTypeEnum indicates the type of a response.
 * 
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:80)
 */
public enum ResponseTypeEnum
{
    /**
     * An unknown type of response; shouldn't happen.
     */
    UNKNOWN(0),

    /**
     * Indicates that the request was successful.
     */
    SUCCESS(1),

    /**
     * Indicates that the request was sucessful but that there were warnings
     * generated and that there is some descriptive text that indicates what
     * happened.
     */
    WARNING(2),

    /**
     * Indicates that the request failed and that there is some descriptive text
     * that indicates what happened.
     */
    ERROR(3),

    /**
     * Indicates that the request is proceeding and that this is a textual update
     * on the progress of the request.
     */
    PROGRESSTEXT(4),

    /**
     * Indicates that the request is proceeding and that this is the percentage
     * of the processing that's complete.
     */
    PROGRESSPERCENT(5);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,ResponseTypeEnum> lookup = new HashMap<Integer,ResponseTypeEnum>();

    static {
        for(ResponseTypeEnum s : EnumSet.allOf(ResponseTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,ResponseTypeEnum> lookupString = new HashMap<String, ResponseTypeEnum>();

    static {
        for(ResponseTypeEnum s : EnumSet.allOf(ResponseTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private ResponseTypeEnum(int i){
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
    public static ResponseTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static ResponseTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}