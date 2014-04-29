package org.dmd.dms.shared.generated.enums;

import java.util.*;

/**
 * The ClassTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.generation.meta.EnumFormatter.dumpEnumClass(EnumFormatter.java:65)
 */
public enum ClassTypeEnum
{
    /**
     */
    UNKNOWN(0),

    /**
     * An abstract class is one that provides a base class for a set of related
     */
    ABSTRACT(1),

    /**
     */
    STRUCTURAL(2),

    /**
     * An auxiliary class is basically a collection of additional attributes that
     * can be added to an instance of a STRUCTURAL class; an AUXILIARY class
     */
    AUXILIARY(3),

    /**
     * An extensible class is basically a free-form class that allows ANY
     */
    EXTENSIBLE(4),

    /**
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