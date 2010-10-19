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
package org.dmd.dmc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The DmcAttribute is an abstract base class from which all attribute values
 * associated with Dark Matter Core Objects must be derived. The class is parameterized
 * to allow for easy "wrapping" of existing Java types. The only caveat for the
 * types being wrapped is that they must be serializable. You need only implement the
 * typeCheck() function in your derived class and you're good to go.
 * <P>
 * The DmcAttribute merely provides a mechanism for constructing name/value pairs
 * for single and multi-valued attributes. There are three primary interfaces on
 * a DmcAttribute: set() - sets the value of a single-valued attribute - add(), del() -
 * add and delete values from multi-valued attributes. To completely remove
 * an attribute value from an object, the DmcObject.rem() function is called.
 * <P>
 * The DmcAttribute and it's derivatives are generally not used directly; their 
 * functionality is usually hidden by a wrapper class designed for use in the context
 * where the data payload of a DmcObject is being used. At the wrapper level,
 * you will continue to use the underlying Java types that comprise the class
 * in question.
 */
@SuppressWarnings("serial")
abstract public class DmcAttribute<E> implements Serializable, Comparable<String> {

	// The name of this attribute. Again, at this level, it doesn't matter what
	// this is and there is no concept of object validity.
	private String 				name;
	
	// Additional data used by wrapper classes. This data is local to whatever context
	// in which the attribute is used and thus IS NOT SERIALIZED.
	transient private Object 	auxData;
	
	// Holder for single valued attributes
	protected E					sv;
	
	// Holder for multi-valued attributes
	protected ArrayList<E>		mv;
	
	/**
	 * Constructs a new attribute value holder.
	 */
	public DmcAttribute(){
		sv = null;
		mv = null;
	}
	
	/**
	 * Sets auxiliary data on this attribute. The content of any auxiliary data is
	 * based on the usage context and is transient from a serialization perspective.
	 * @param obj Your auxiliary data.
	 */
	public void setAuxData(Object obj){
		auxData = obj;
	}
	
	/**
	 * Returns any auxiliary data previously set on the attribute.
	 * @return Your auxiliary data.
	 */
	public Object getAuxData(){
		return(auxData);
	}
	
	/**
	 * Sets the name of this attribute. This must be called through DmcAttributeMediator by
	 * its derived classes.
	 * @param name The name of the attribute.
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The name of this attribute.
	 */
	public String getName(){
		return(name);
	}
	
    /**
     * Compares this object with the specified object for order.
     */
    public int compareTo(String o){
        return(getName().compareTo(o));
    }

    /**
     * Returns this attribute in Object Instance Format (OIF) which is basically the attribute
     * name followed by the string representation of the value of the attribute. For multi-valued
     * attributes, each value is dumped on a separate line, prepended with its name.
     */
	public void toOIF(StringBuffer sb) {
		if (sv != null){
			if (sv instanceof DmcNamedObjectIF)
				sb.append(name + " " + ((DmcNamedObjectIF)sv).getObjectName() + "\n");
			else
				sb.append(name + " " + sv + "\n");
		}
		if (mv != null){
			for(E value : mv){
				if (value instanceof DmcNamedObjectIF)
					sb.append(name + " " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
				else
					sb.append(name + " " + value + "\n");
			}
		}
	}
	
    /**
     * Returns this attribute in Object Instance Format (OIF) which is basically the attribute
     * name followed by the string representation of the value of the attribute. For multi-valued
     * attributes, each value is dumped on a separate line, prepended with its name.
	 * @param sb The string buffer to which we append the attribute values
	 * @param padding The amount of padding to provide for the "left-justified" attribute name.  
	 */
	public void toOIF(StringBuffer sb, int padding) {
		if (sv != null){
			addNameWithPadding(name,padding,sb);
			if (sv instanceof DmcNamedObjectIF)
				sb.append(" " + ((DmcNamedObjectIF)sv).getObjectName() + "\n");
			else
				sb.append(" " + sv + "\n");
		}
		if (mv != null){
			for(E value : mv){
				addNameWithPadding(name,padding,sb);
				if (value instanceof DmcNamedObjectIF)
					sb.append(" " + ((DmcNamedObjectIF)value).getObjectName() + "\n");
				else
					sb.append(" " + value + "\n");
			}
		}
	}
	
	/**
	 * Adds the attribute name and pads it with the required number of spaces. If the name is
	 * longer than the padding, we do nothing.
	 * @param attrName The name of the attribute.
	 * @param padding  The amount of padding.
	 * @param sb       The buffer where we're building the output.
	 */
	private void addNameWithPadding(String attrName, int padding, StringBuffer sb){
		sb.append(attrName);
		if (attrName.length() < padding){
			for(int i=attrName.length(); i<padding; i++)
				sb.append(" ");
		}
	}
	
	/**
	 * Sets the value of a single-valued attribute.
	 * @param value The value to be set
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	public void set(Object value) throws DmcValueException {
		if (value == null)
			return;
		
		sv = typeCheck(value);
		mv = null;		
	}
	
	/**
	 * Returns the single-valued attribute value.
	 * @return E
	 */
	public E getSV(){
		return(sv);
	}
	
	/**
	 * Adds the specified value to a multi-valued attribute.
	 * @param value The value to be added
	 * @throws DmcValueException if the value is not compatible with the underlying type.
	 */
	public void add(Object value) throws DmcValueException {
		if (value == null)
			return;
		
		sv = null;
		if (mv == null)
			mv = new ArrayList<E>();
		
		mv.add(typeCheck(value));
	}
	
	/**
	 * Derived classes must overload this method to determine if the value passed
	 * in conforms with their type criteria.
	 * @param value
	 * @return E
	 * @throws DmcValueException
	 */
	abstract protected E typeCheck(Object value) throws DmcValueException;
	
	/**
	 * Removes a value from a multi-valued attribute.
	 * @param v The value to be removed.
	 */
	public void del(Object v){
		if (v == null)
			return;
		
		if (mv == null)
			return;
			
		mv.remove(v);
	}
	
	/**
	 * Returns an Iterator over a multi-valued attribute's values.
	 * @return Iterator<E>
	 */
	public Iterator<E> getMV(){
		if (mv == null)
			return(null);
		
		return(mv.iterator());
	}

	/**
	 * For a multi-valued attribute, this returns the number of values in the attribute.
	 * If the attribute is single-valued, 0 is returned.
	 * @return the number of values.
	 */
	public int getMVSize(){
		if (mv == null)
			return(0);
		
		return(mv.size());
	}
	
	/**
	 * A convenience function to return the nth value from a multi-valued attribute.
	 * @param index The value index.
	 * @return E
	 */
	public E getMVnth(int index){
		return(mv.get(index));
	}
	
	/**
	 * Returns the string representation of this attribute.
	 */
	public String toString(){
		return(getString());
	}
	
	/**
	 * This method must be overloaded to return the appropriate String representation of the value
	 * for this type of attribute.
	 * @return The String form of the value.
	 */
	abstract public String getString();

	/**
	 * If we have a multi-valued attribute, we checked to see it it contains the specified value.
	 * @param obj The object we're looking for.
	 * @return true if the object is contained by the attribute.
	 */
	public boolean contains(Object obj){
		if (mv == null)
			return(false);
		return(mv.contains(obj));
	}
}
