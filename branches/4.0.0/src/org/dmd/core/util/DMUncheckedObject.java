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
package org.dmd.core.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;


/**
 * The DmcUncheckedObject provides a way of representing a Dark Matter Object
 * that has (usually) been read from a file in Object Instance Format (OIF).
 */
public class DMUncheckedObject {

	// The construction class and any auxiliary classes associated with this object
	ArrayList<String> 					classes;

	// A map of the named attributes associated with this object
	TreeMap<String, NamedStringArray>	attributes;

	// The line number at which this object started in a file.
	int lineNumber;
	
	// The file from which this object was read
	String file;
	
	public DMUncheckedObject(){
		attributes 	= new TreeMap<String, NamedStringArray>();
		classes 	= new ArrayList<String>();
		lineNumber	= -1;
		file		= "UNKNOWN";
	}

	/**
	 * Constructs a new unchecked object of the specified class.
	 * @param cn The class name.
	 */
	public DMUncheckedObject(String cn){
		attributes 	= new TreeMap<String, NamedStringArray>();
		classes 	= new ArrayList<String>();
		lineNumber	= -1;
		file		= "UNKNOWN";
		classes.add(cn);
	}

	/**
	 * Creates a new DmcUncheckedObject.
	 * @param classNames The construction class and any auxiliary classes.
	 */
	public DMUncheckedObject(ArrayList<String> classNames, String fn, int ln){
		attributes 	= new TreeMap<String, NamedStringArray>();
		classes 	= new ArrayList<String>(classNames);
		lineNumber	= ln;
		file		= fn;
	}
	
	public int getLineNumber(){
		return(lineNumber);
	}
	
	public String getFile(){
		return(file);
	}
	
	public String getConstructionClass(){
		if(classes.size() == 0)
			throw(new IllegalStateException("Construction class not set on this object:\n" + this.toOIF()));
		
		return(classes.get(0));
	}
	
	public void addToClasses(String c){
		classes.add(c);
	}
	
	/**
	 * Removes the value for the specified attribute
	 * @param attribute the name of the attribute.
	 */
	public void rem(String attribute){
		attributes.remove(attribute);
	}

	/**
	 * Adds a new attribute value to the object.
	 * @param name  The attribute name
	 * @param value The attribute value
	 */
	public void addValue(String name, String value){
		NamedStringArray attr = attributes.get(name);
		
		if (attr == null){
			attr = new NamedStringArray(name);
			attributes.put(name, attr);
		}
		
		attr.add(value);
	}
		
	/**
	 * @return the object in Object Instance Format (OIF).
	 */
	public String toOIF(){
		int longest = 0;
		for(NamedStringArray nsa: attributes.values()){
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

		for(NamedStringArray nsa: attributes.values()){
			nsa.toOIF(padding, sb);
		}
		
		return(sb.toString());
	}

	/**
	 * A convenience function to retrieve the value of a single valued attribute from
	 * the object. The String is trimmed before being returned. If the attribute has 
	 * multiple values,  an exception is thrown.
	 * @param attrname
	 * @return The string value of the attribute or null if it's not found.
	 * @throws A ResultException if the attribute has multiple values.
	 */
	public String getSV(String attrname){
		NamedStringArray values = attributes.get(attrname);
		
		if (values == null)
			return(null);
		
		if (values.size() > 1)
			throw(new IllegalStateException("Used getSV() on a multi-valued attribute: " + attrname));
		
		return(values.get(0).trim());
	}


	public DMUncheckedObject getOneOfMe() {
		return(new DMUncheckedObject());
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

	public NamedStringArray get(String name) {
		return(attributes.get(name));
	}

}
