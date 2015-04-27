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
package org.dmd.dmc.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import org.dmd.dmc.DmcValueException;


/**
 * The DmcUncheckedObject provides a way of representing a Dark Matter Object
 * that has been (usually) read from a file in Object Instance Format (OIF).
 */
public class DmcUncheckedObjectNEW {

//	public final static String _ocl = "ocl";
		
//	PrintfFormat	format;

	protected TreeMap<String, NamedValueArray>	attributes;

	/**
	 * The classes of this object.
	 * <P>
	 * A list of Strings that indicate the construction class and any auxiliary
	 * classes of this object.
	 */
	public ArrayList<String> classes;

	// The line number at which this object started in a file.
	public int lineNumber;
	
	public DmcUncheckedObjectNEW(){
		attributes = new TreeMap<String, NamedValueArray>();
		classes = new ArrayList<String>();
//		format = new PrintfFormat("%-15s");
	}

	/**
	 * Creates a new DmcUncheckedObject.
	 * @param classNames An array of Strings that define the structural class of the
	 *                   object followed by any auxiliary classes.
	 * @throws DmcValueException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public DmcUncheckedObjectNEW(ArrayList<String> classNames, int ln){
		attributes = new TreeMap<String, NamedValueArray>();
		classes = new ArrayList<String>(classNames);
//		format = new PrintfFormat("%-15s");
		lineNumber = ln;
	}
	
	public String getConstructionClass(){
		if(classes.size() == 0)
			throw(new IllegalStateException("Construction class not set on this object:\n" + this.toOIF()));
		
		return(classes.get(0));
	}
	
	public void addToClasses(String c){
//		addValue(_ocl,c);
		classes.add(c);
	}
	
	/**
	 * Removes the value for the specified attribute
	 * @param attribute
	 */
	public void rem(String attribute){
		attributes.remove(attribute);
	}

	/**
	 * Adds a new attribute value to the object.
	 * @param name  The attribute name
	 * @param value The attribute value
	 */
	public void addValue(String name, AttributeValueIF value){
		NamedValueArray attr = attributes.get(name);
		
		if (attr == null){
			attr = new NamedValueArray(name);
			attributes.put(name, attr);
		}
		
		attr.add(value);
	}
		
	public String toOIF(){
		int longest = 0;
		for(NamedValueArray nsa: attributes.values()){
			if (nsa.getName().length() > longest)
				longest = nsa.getName().length();
		}
		return toOIF(longest + 2);
	}

	/**
	 * Returns the object in Object Instance Format (OIF).
	 * @return The String representation of the object.
	 */
	private String toOIF(int padding){
		StringBuffer	sb = new StringBuffer();
		
		for(String str : classes){
			sb.append(str + " ");
		}
		sb.append("\n");

		for(NamedValueArray nsa: attributes.values()){
			nsa.toOIF(padding, sb);
		}
		
		return(sb.toString());
	}
	


	/**
	 * A convenience function to retrieve the value of a single valued attribute from
	 * the object. The String is trimmed before being returned. If the attribute has 
	 * multiple values,  isn't a string value or has mixed input, an IllegalStateException
	 * is thrown.
	 * @param attrname
	 * @return The string value of the attribute or null if it's not found.
	 * @throws A ResultException if the attribute has multiple values.
	 */
	public String getSVString(String attrname){
		NamedValueArray values = attributes.get(attrname);
		
		if (values == null)
			return(null);
		
		if (!values.strings())
			throw(new IllegalStateException("Used getSVString() on a UcoObject attribute: " + attrname));
			
		if (values.mixed())
			throw(new IllegalStateException("Used getSVString() on a MIXED INPUT attribute: " + attrname));			
		
		if (values.size() > 1)
			throw(new IllegalStateException("Used getSVString() on a multi-valued attribute: " + attrname));
		
		return(((StringValue)values.get(0)).getValue().trim());
	}


	public DmcUncheckedObjectNEW getOneOfMe() {
		return(new DmcUncheckedObjectNEW());
	}

	public Iterator<String> getAttributeNames() {
		return(attributes.keySet().iterator());
	}

    /**
     * Adds the specified auxiliary class name to the object.
     * @param cd The auxiliary class name.
     */
    public void addAux(String cd){
    	classes.add(cd);
    }

	public NamedValueArray get(String name) {
		return(attributes.get(name));
	}

}
