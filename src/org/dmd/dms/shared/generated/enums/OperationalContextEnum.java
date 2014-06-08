package org.dmd.dms.shared.generated.enums;

import java.util.*;

/**
 * The OperationalContextEnum enumeration.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.meta.EnumFormatter.dumpEnumClass(EnumFormatter.java:65)
 */
public enum OperationalContextEnum
{
    /**
     * Indicates that the component follows basic Dark Matter Object rules which
     */
    DMO(0),

    /**
     * indicates that the component operates in a ful Java environment; no
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