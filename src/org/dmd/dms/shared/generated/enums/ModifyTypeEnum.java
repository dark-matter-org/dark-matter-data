package org.dmd.dms.shared.generated.enums;

import java.util.*;

/**
 * The ModifyTypeEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.meta.EnumFormatter.dumpEnumClass(EnumFormatter.java:65)
 */
public enum ModifyTypeEnum
{
    /**
     */
    NONE(0),

    /**
     */
    ADD(1),

    /**
     */
    DEL(2),

    /**
     */
    SET(3),

    /**
     */
    REM(4),

    /**
     */
    NTH(5);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,ModifyTypeEnum> lookup = new HashMap<Integer,ModifyTypeEnum>();

    static {
        for(ModifyTypeEnum s : EnumSet.allOf(ModifyTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,ModifyTypeEnum> lookupString = new HashMap<String, ModifyTypeEnum>();

    static {
        for(ModifyTypeEnum s : EnumSet.allOf(ModifyTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private ModifyTypeEnum(int i){
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
    public static ModifyTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static ModifyTypeEnum get(String str) {
        return(lookupString.get(str));
    }

}