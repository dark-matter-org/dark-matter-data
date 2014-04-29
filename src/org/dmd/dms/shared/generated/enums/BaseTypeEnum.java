package org.dmd.dms.shared.generated.enums;

import java.util.*;

/**
 * The BaseTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.generation.meta.EnumFormatter.dumpEnumClass(EnumFormatter.java:65)
 */
public enum BaseTypeEnum
{
    /**
     * Indicates a primitive data type such as Integer, String, long or a
     */
    PRIMITIVE(0),

    /**
     */
    NAMEDREF(1),

    /**
     */
    UNNAMEDREF(2),

    /**
     */
    EXTENDEDREF(3),

    /**
     */
    KEYED(4);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,BaseTypeEnum> lookup = new HashMap<Integer,BaseTypeEnum>();

    static {
        for(BaseTypeEnum s : EnumSet.allOf(BaseTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,BaseTypeEnum> lookupString = new HashMap<String, BaseTypeEnum>();

    static {
        for(BaseTypeEnum s : EnumSet.allOf(BaseTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private BaseTypeEnum(int i){
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
    public static BaseTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static BaseTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}