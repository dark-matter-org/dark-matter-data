//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2018 dark-matter-data committers
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
package org.dmd.dmc.types;

/**
 * The LongVar class provides for the storage of a integer value that can be
 * changed. This allows for a reference to an integer to be passed and alterred.
 * It also allows for the alteration of an integer value object without having
 * to create a new Long.
 */

public class LongVar implements Comparable<Object> {

    private long   val;

    /**
      * Creates a new integer with a val of 0.
      */
    public LongVar() {
        val = 0;
    }

    /**
      * Creates a new integer with the specified value.
      */
    public LongVar(long i) {
        val = i;
    }

    /**
      * Creates a new integer with the specified value.
      */
    public LongVar(Long i) {
        val = i.longValue();
    }

    /**
     * Compares this object to another LongVar.
     */
    public int compareTo(LongVar i){
        long anotherVal = i.val;
        return (val<anotherVal ? -1 : (val==anotherVal ? 0 : 1));
    }

    /**
     * Compares this object with the specified object for order.
     */
    public int compareTo(Object o){
	    return compareTo((LongVar)o);
    }

    /**
     * Creates a deep copy of this object.
     */
    public LongVar copy(){
        return(new LongVar(val));
    }

    /**
      * Sets the value to the specified int value.
      */
    public boolean set(long i){
        val = i;
        return(true);
    }

    /**
     * Sets the value to he specified Long value.
     */
   public boolean set(Long i){
       val = i.longValue();
       return(true);
   }

   /**
    * Sets the value to he specified Long value.
    */
  public boolean set(String i){
      val = Long.parseLong(i);
      return(true);
  }

    /**
      * Returns the value of the LongVar.
      */
    public long longValue(){
        return(val);
    }

    /**
      * Returns the value of the LongVar.
      */
    public String toString(){
        return(Long.toString(val));
    }

    /**
     * Overrides the Object.hashCode().
     */
    public int hashCode(){
        return(Long.hashCode(val));
    }

    /**
     * Implements the equals operation.
     */
    public boolean equals(Object obj) {
        if (obj == null)
            return(false);

        if (obj instanceof LongVar) {
            return val == ((LongVar)obj).longValue();
        }
        return false;
    }

    /**
     * Checks if the object is an LongVar that equals the test value and
     * returns true if so. If the object is null or not an LongVar, we return
     * false.
     */
    static public boolean equals(int testVal, Object obj) {
        if (obj == null)
            return(false);

        if (obj instanceof LongVar) {
            return (testVal == ((LongVar)obj).val);
        }
        return false;
    }

}
 
