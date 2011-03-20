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
package org.dmd.util.parsing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeString;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;


/**
 * The DmcUncheckedObject extends the basic DmcObject with some useful information
 * and functions when used in the context of reading Object Instance Format (OIF)
 * data from a file. 
 */
public class DmcUncheckedObject {

	public final static String _ocl = "ocl";
		
	PrintfFormat	format;

	protected TreeMap<String, NamedStringArray>	attributes;

	/**
	 * The classes of this object.
	 * <P>
	 * A list of Strings that indicate the construction class and any auxiliary
	 * classes of this object.
	 */
	public ArrayList<String> classes;

	// The line number at which this object started in a file.
	public int lineNumber;
	
	public DmcUncheckedObject(){
		attributes = new TreeMap<String, NamedStringArray>();
		classes = new ArrayList<String>();
		format = new PrintfFormat("%-15s");
	}

	/**
	 * Creates a new DmcUncheckedObject.
	 * @param classNames An array of Strings that define the structural class of the
	 *                   object followed by any auxiliary classes.
	 * @throws DmcValueException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public DmcUncheckedObject(ArrayList<String> classNames, int ln){
		attributes = new TreeMap<String, NamedStringArray>();
		classes = new ArrayList<String>(classNames);
		format = new PrintfFormat("%-15s");
		lineNumber = ln;
	}
	
	public void addToClasses(String c){
		addValue(_ocl,c);
		classes.add(c);
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
		
	public String toOIF(){
		return toOIF(15);
	}

	/**
	 * Returns the object in Object Instance Format (OIF).
	 * @return The String representation of the object.
	 */
	public String toOIF(int padding){
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
	 * multiple values,  
	 * @param attrname
	 * @return The string value of the attribute or null if it's not found.
	 * @throws A ResultException if the attribute has multiple values.
	 */
	public String getSV(String attrname) throws ResultException {
		NamedStringArray values = attributes.get(attrname);
		
		if (values == null)
			return(null);
		
		if (values.size() > 1){
			ResultException ex = new ResultException();
			ex.addErrorWithStack("Used getSV() on a multi-valued attribute: " + attrname, DebugInfo.getCurrentStack());
			
			throw(ex);
		}
		
		return(values.get(0).trim());
	}


	public DmcUncheckedObject getOneOfMe() {
		return(new DmcUncheckedObject());
	}

	public Iterator<String> getAttributeNames() {
		return(attributes.keySet().iterator());
	}

    /**
     * Adds the specified auxiliary class name to the object.
     * @param cd The auxiliary class name.
     * @throws DmcValueException  
     */
    public void addAux(String cd) throws DmcValueException {
		NamedStringArray ocl = attributes.get(_ocl);

		if (ocl != null)
			ocl.add(cd);
    }

	public NamedStringArray get(String name) {
		return(attributes.get(name));
	}

}
