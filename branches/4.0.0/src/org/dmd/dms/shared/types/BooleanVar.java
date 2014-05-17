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
package org.dmd.dms.shared.types;

import org.dmd.core.feedback.DMFeedbackSet;

/**
 * The BooleanVar class provides for the storage of a boolean value that can be
 * changed. This allows for a reference to a boolean to be passed and alterred.
 * It also allows for the alteration of a boolean value object without having
 * to create a new Boolean.
 */

public class BooleanVar {

    private boolean   val;

    /**
      * Creates a new BooleanVar with a value of false.
      */
    public BooleanVar() {
        val = false;
    }

    /**
      * Creates a new BooleanVar with the specified value.
      */
    public BooleanVar(boolean v) {
        val = v;
    }

    /**
      * Creates a new BooleanVar with the specified value.
     * @throws DMFeedbackSet 
      */
    public BooleanVar(String v) throws DMFeedbackSet {
        this.set(v);
    }

    /**
     * Creates a deep copy of this object.
     */
    public BooleanVar copy(){
        return(new BooleanVar(val));
    }

    /**
      * Sets the value as specified.
      */
    public void set(boolean v){
        val = v;
    }

    /**
      * Sets the value to true if the string is "true" and to false otherwise.
      */
    public boolean set(String s) throws DMFeedbackSet {
        if (s.equalsIgnoreCase("true"))
            val = true;
        else if (s.equalsIgnoreCase("false"))
            val = false;
        else{
        	throw(new DMFeedbackSet("Invalid boolean value: " + s));
        }
        return(true);
    }

    /**
      * Return the variable's value.
      */
    public boolean booleanValue(){
        return(val);
    }

    /**
      * Return the variable's value as a String.
      */
    public String toString(){
        if (val)
            return(new String("true"));
        else
            return(new String("false"));
    }

    /**
     * Checks if the object is a BooleanVar that equals the test value and
     * returns true if so. If the object is null and the test value if false,
     * we return true i.e. the non-existence of the flag object equates to false.
     * <P>
     * If the object is not a BooleanVar, we return false.
     */
    static public boolean equals(boolean testVal, Object obj){
        if (obj == null){
            if (testVal == false)
                return(true);
            else
                return(false);
        }

        if (obj instanceof BooleanVar){
            return(testVal == ((BooleanVar)obj).val);
        }

        return(false);
    }

    /**
     * Checks if the object is a BooleanVar that equals the test value and
     * returns true if so. If the object is null or not a BooleanVar, we return
     * false.
     */
    public boolean equals(Object obj){
        if (obj == null)
            return(false);

        if (obj instanceof BooleanVar){
            return(val == ((BooleanVar)obj).val);
        }

        return(false);
    }
}

