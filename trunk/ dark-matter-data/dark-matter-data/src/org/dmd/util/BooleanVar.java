package org.dmd.util;

import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultSet;

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
      */
    public BooleanVar(ResultSet rs, String v) {
        this.set(rs,v);
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
    public boolean set(ResultSet rs, String s){
        if (s.equalsIgnoreCase("true"))
            val = true;
        else if (s.equalsIgnoreCase("false"))
            val = false;
        else{
            rs.addResult(Result.ERROR,"Invalid boolean value.");
            return(false);
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

