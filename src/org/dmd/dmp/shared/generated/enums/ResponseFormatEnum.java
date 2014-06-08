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
package org.dmd.dmp.shared.generated.enums;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.dmogen.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:67)
import java.util.*;                               // To supporting mapping of enum values - (DmoEnumFormatter.java:65)
import org.dmd.core.interfaces.DmcEnumIF;         // Standard interface for enums - (DmoEnumFormatter.java:64)



/**
 * The ResponseFormatEnum indicates how JSON responses are to be formatted.
 * <P>
 * Generated from the dmp schema at version null
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.tools.generation.dmogen.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:75)
 */
public enum ResponseFormatEnum implements DmcEnumIF
{
    STANDARD(0,"Indicates that the responses should be in standard flat format."),

    DOM(1,"Indicates that the response should be in DOM format i.e. the hierarchic structure of the data should be reflected by indenting children in subarrays beneath an object.");

    // Maps our integer value to the enumeration value
    private static final Map<Integer,ResponseFormatEnum> lookup = new HashMap<Integer,ResponseFormatEnum>();

    static {
        for(ResponseFormatEnum s : EnumSet.allOf(ResponseFormatEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,ResponseFormatEnum> lookupString = new HashMap<String, ResponseFormatEnum>();

    static {
        for(ResponseFormatEnum s : EnumSet.allOf(ResponseFormatEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    // Our current display value as a String
    private String dval;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private ResponseFormatEnum(int i, String d){
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
    public static ResponseFormatEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static ResponseFormatEnum get(String str) {
        return(lookupString.get(str.toUpperCase()));
    }

}