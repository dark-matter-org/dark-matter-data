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
package org.dmd.dmc.types;

/**
 * The IntegerVar class provides for the storage of a integer value that can be
 * changed. This allows for a reference to an integer to be passed and alterred.
 * It also allows for the alteration of an integer value object without having
 * to create a new Integer.
 */

public class IntegerVar implements Comparable<Object> {

    private int   val;

    /**
      * Creates a new integer with a val of 0.
      */
    public IntegerVar() {
        val = 0;
    }

    /**
      * Creates a new integer with the specified value.
      */
    public IntegerVar(int i) {
        val = i;
    }

    /**
      * Creates a new integer with the specified value.
      */
    public IntegerVar(Integer i) {
        val = i.intValue();
    }

    /**
     * Compares this object to another IntegerVar.
     */
    public int compareTo(IntegerVar i){
        int anotherVal = i.val;
        return (val<anotherVal ? -1 : (val==anotherVal ? 0 : 1));
    }

    /**
     * Compares this object with the specified object for order.
     */
    public int compareTo(Object o){
	    return compareTo((IntegerVar)o);
    }

    /**
     * Creates a deep copy of this object.
     */
    public IntegerVar copy(){
        return(new IntegerVar(val));
    }

    /**
      * Sets the value to the specified int value.
      */
    public boolean set(int i){
        val = i;
        return(true);
    }

    /**
     * Sets the value to he specified Integer value.
     */
   public boolean set(Integer i){
       val = i.intValue();
       return(true);
   }

   /**
    * Sets the value to he specified Integer value.
    */
  public boolean set(String i){
      val = Integer.parseInt(i);
      return(true);
  }

    /**
      * Returns the value of the IntegerVar.
      */
    public int intValue(){
        return(val);
    }

    /**
      * Returns the value of the IntegerVar.
      */
    public String toString(){
        return(Integer.toString(val));
    }

    /**
     * Overrides the Object.hashCode(). Uses the same mechanism as Integer i.e.
     * just returns the value.
     */
    public int hashCode(){
        return(val);
    }

    /**
     * Implements the equals operation.
     */
    public boolean equals(Object obj) {
        if (obj == null)
            return(false);

        if (obj instanceof IntegerVar) {
            return val == ((IntegerVar)obj).intValue();
        }
        return false;
    }

    /**
     * Checks if the object is an IntegerVar that equals the test value and
     * returns true if so. If the object is null or not an IntegerVar, we return
     * false.
     */
    static public boolean equals(int testVal, Object obj) {
        if (obj == null)
            return(false);

        if (obj instanceof IntegerVar) {
            return (testVal == ((IntegerVar)obj).val);
        }
        return false;
    }

}
 
