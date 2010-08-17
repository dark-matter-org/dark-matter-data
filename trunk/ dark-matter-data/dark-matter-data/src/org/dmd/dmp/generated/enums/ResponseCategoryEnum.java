package org.dmd.dmp.generated.enums;

import java.util.*;

/**
 * The ResponseCategoryEnum indicates the category of an error response.
 * 
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:71)
 */
public enum ResponseCategoryEnum
{
    /**
     * An uncategorized response.
     */
    UNKNOWN(0),

    /**
     * A response related to software.
     */
    SOFTWARE(1),

    /**
     * A response related to security.
     */
    SECURITY(2),

    /**
     * A response related to the repository.
     */
    REPOSITORY(3),

    /**
     * A response related to communication.
     */
    COMMS(4),

    /**
     * A response related to an operation.
     */
    OPERATIONAL(5);

    // Maps our integer value to the enumeration value
    private static final Map<Integer,ResponseCategoryEnum> lookup = new HashMap<Integer,ResponseCategoryEnum>();

    static {
        for(ResponseCategoryEnum s : EnumSet.allOf(ResponseCategoryEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,ResponseCategoryEnum> lookupString = new HashMap<String, ResponseCategoryEnum>();

    static {
        for(ResponseCategoryEnum s : EnumSet.allOf(ResponseCategoryEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private ResponseCategoryEnum(int i){
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
    public static ResponseCategoryEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static ResponseCategoryEnum get(String str) {
        return(lookupString.get(str));
    }

}