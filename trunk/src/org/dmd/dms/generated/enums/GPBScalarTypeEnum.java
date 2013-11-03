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
 * The GPBScalarTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpEnumClass(MetaGenerator.java:961)
 */
public enum GPBScalarTypeEnum
{
    /**
     * Java double - C++ double.
     */
    DOUBLE(0),

    /**
     * Java float - C++ float.
     */
    FLOAT(1),

    /**
     * Java int - C++ int32. Uses variable-length encoding. Inefficient for
     * encoding negative numbers - if your field is likely to have negative
     * values, use sint32 instead.
     */
    INT32(2),

    /**
     * Java long - C++ int64. Uses variable-length encoding. Inefficient for
     * encoding negative numbers - if your field is likely to have negative
     * values, use sint64 instead.
     */
    INT64(3),

    /**
     * Java int - C++ uint32. Uses variable-length encoding. In Java, unsigned
     * 32-bit integers are represented using their signed counterparts, with the
     * top bit simply being stored in the sign bit.
     */
    UINT32(4),

    /**
     * Java long - C++ uint64. Uses variable-length encoding. In Java, unsigned
     * 64-bit integers are represented using their signed counterparts, with the
     * top bit simply being stored in the sign bit.
     */
    UINT64(5),

    /**
     * Java int - C++ int32. Uses variable-length encoding. Signed int value.
     * These more efficiently encode negative numbers than regular int32s.
     */
    SINT32(6),

    /**
     * Java long - C++ int64. Uses variable-length encoding. Signed int value.
     * These more efficiently encode negative numbers than regular int64s.
     */
    SINT64(7),

    /**
     * Java int - C++ uint32. Always four bytes. More efficient than uint32 if
     * values are often greater than 2^28.
     */
    FIXED32(8),

    /**
     * Java long - C++ uint64. Always eight bytes. More efficient than uint64 if
     * values are often greater than 2^56.
     */
    FIXED64(9),

    /**
     * Java int - C++ int32. Always four bytes.
     */
    SFIXED32(10),

    /**
     * Java long - C++ int64. Always eight bytes.
     */
    SFIXED64(11),

    /**
     * Java boolean - C++ bool.
     */
    BOOL(12),

    /**
     * Java String - C++ string. A string must always contain UTF-8 encoded or
     * 7-bit ASCII text.
     */
    STRING(13),

    /**
     * Java ByteString - C++ string. May contain any arbitrary sequence of bytes.
     */
    BYTES(14);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,GPBScalarTypeEnum> lookup = new HashMap<Integer,GPBScalarTypeEnum>();

    static {
        for(GPBScalarTypeEnum s : EnumSet.allOf(GPBScalarTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,GPBScalarTypeEnum> lookupString = new HashMap<String, GPBScalarTypeEnum>();

    static {
        for(GPBScalarTypeEnum s : EnumSet.allOf(GPBScalarTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private GPBScalarTypeEnum(int i){
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
    public static GPBScalarTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static GPBScalarTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}