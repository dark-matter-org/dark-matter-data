package org.dmd.dmt.shared.generated.enums;

import java.util.*;

import org.dmd.dmc.DmcEnumIF;

/**
 * The DmtTestEnum is used for testing operations on eneumerated types
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:100)
 */
public enum DmtTestEnum implements DmcEnumIF
{
    TEST1(0,"First test."),

    TEST2(1,"Second test."),

    TEST3(2,"Third test.");

    // Maps our integer value to the enumeration value
    private static final Map<Integer,DmtTestEnum> lookup = new HashMap<Integer,DmtTestEnum>();

    static {
        for(DmtTestEnum s : EnumSet.allOf(DmtTestEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,DmtTestEnum> lookupString = new HashMap<String, DmtTestEnum>();

    static {
        for(DmtTestEnum s : EnumSet.allOf(DmtTestEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    // Our current display value as a String
    private String dval;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private DmtTestEnum(int i, String d){
        ival = i;
        dval = d;
    }

    /**
     * Returns the value of this enum value as an int.
     */
    public int intValue(){
        return(ival);
    }

    /**
     * Returns the display value of this enum value as a String.
     */
    public String displayValue(){
        return(dval);
    }

    /**
     * Returns the enum value of the specified int or null if it's not valid.
     */
    public static DmtTestEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static DmtTestEnum get(String str) {
        return(lookupString.get(str));
    }

}