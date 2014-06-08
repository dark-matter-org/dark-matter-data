package org.dmd.dms.shared.generated.enums;

import java.util.*;

/**
 * The ValueTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.meta.EnumFormatter.dumpEnumClass(EnumFormatter.java:65)
 */
public enum ValueTypeEnum
{
    /**
     */
    SINGLE(0),

    /**
     */
    MULTI(1),

    /**
     * Indicates that the attribute values implement the DmcMappedAttributeIF
     */
    HASHMAPPED(2),

    /**
     * Indicates that the attribute values implement the DmcMappedAttributeIF
     */
    TREEMAPPED(3),

    /**
     */
    HASHSET(4),

    /**
     */
    TREESET(5);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,ValueTypeEnum> lookup = new HashMap<Integer,ValueTypeEnum>();

    static {
        for(ValueTypeEnum s : EnumSet.allOf(ValueTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,ValueTypeEnum> lookupString = new HashMap<String, ValueTypeEnum>();

    static {
        for(ValueTypeEnum s : EnumSet.allOf(ValueTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private ValueTypeEnum(int i){
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
    public static ValueTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static ValueTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}