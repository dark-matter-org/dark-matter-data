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
 * The ClassTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpEnumClass(MetaGenerator.java:397)
 */
public enum ClassTypeEnum
{
    /**
     * Unknown value.
     */
    UNKNOWN(0),

    /**
     * An abstract class is one that provides a base class for a set of related
     * derived classes, but which can't be instantiated by itself.
     */
    ABSTRACT(1),

    /**
     * A structural class is a class that can be instantiated by itself.
     */
    STRUCTURAL(2),

    /**
     * An auxiliary class is basically a collection of additional attributes that
     * can be added to an instance of a STRUCTURAL class; an AUXILIARY class
     * can't be instantiated on its own.
     */
    AUXILIARY(3),

    /**
     * An extensible class is basically a free-form class that allows ANY
     * attribute to be set on it.
     */
    EXTENSIBLE(4),

    /**
     * An interface class provides an interface for a set of implementing classes.
     */
    INTERFACE(5);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,ClassTypeEnum> lookup = new HashMap<Integer,ClassTypeEnum>();

    static {
        for(ClassTypeEnum s : EnumSet.allOf(ClassTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,ClassTypeEnum> lookupString = new HashMap<String, ClassTypeEnum>();

    static {
        for(ClassTypeEnum s : EnumSet.allOf(ClassTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private ClassTypeEnum(int i){
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
    public static ClassTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static ClassTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}