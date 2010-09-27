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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeString;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;


/**
 * The DmcParsedObject extends the basic DmcObject with some useful information
 * and functions when used in the context of reading Object Instance Format (OIF)
 * data from a file. 
 */
@SuppressWarnings("serial")
public class DmcUncheckedObject extends DmcObject {

	/**
	 * The classes of this object.
	 * <P>
	 * A list of Strings that indicate the construction class and any auxiliary
	 * classes of this object.
	 */
	public ArrayList<String> classes;

	// The line number at which this object started in a file.
	public int lineNumber;

	/**
	 * Creates a new DmcParsedObject.
	 * @param classNames An array of Strings that define the structural class of the
	 *                   object followed by any auxiliary classes.
	 * @throws DmcValueException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@SuppressWarnings("unchecked")
	public DmcUncheckedObject(ArrayList<String> classNames, int ln){
		classes = new ArrayList<String>(classNames);
//        try {
//        	DmcAttribute attr = new DmcTypeString();
//			for(String oc : classNames){
//				attr.add(oc);
//			}
//			add(_ocl,attr);
//		} catch (DmcValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		for(String cl : classNames){
//			try {
//				this.add("objClass", DmcString.class, cl);
//			} catch (InstantiationException e) {
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				e.printStackTrace();
//			} catch (DmcValueException e) {
//				e.printStackTrace();
//			}
//		}
		lineNumber = ln;
	}

	/**
	 * Adds a new attribute value to the object.
	 * @param name  The attribute name
	 * @param value The attribute value
	 * @throws DmcValueException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@SuppressWarnings("unchecked")
	public void addValue(String name, String value){
		try {
			DmcAttribute attr = get(name);
			
			if (attr == null)
				attr = new DmcTypeString();
			
			attr.add(value);
			
			this.add(name,attr);
		} catch (DmcValueException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the object in Object Instance Format (OIF).
	 * @return The String representation of the object.
	 */
	@SuppressWarnings("unchecked")
	public String toOIF(PrintfFormat format){
		StringBuffer	sb = new StringBuffer();
		DmcTypeString classes = (DmcTypeString) this.get("objClass");
		
		// Dump the construction class and any auxiliary classes
		if (classes != null){
			Iterator<String> cls = classes.getMV();
			while(cls.hasNext()){
				sb.append(cls.next());
				if (cls.hasNext())
					sb.append(" ");
			}
			sb.append("\n");
		}
		
		// Dump the attribute values
		Iterator<String> it = attributes.keySet().iterator();
		while(it.hasNext()){
			DmcTypeString attr = (DmcTypeString) attributes.get(it.next());
			
			Iterator atIT = attr.getMV();
			while(atIT.hasNext()){
				sb.append(format.sprintf(attr.getName()));
				sb.append(atIT.next() + "\n");
			}
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
		DmcTypeString values = (DmcTypeString) attributes.get(attrname);
		
		if (values == null)
			return(null);
		
		if (values.getMVSize() > 1){
			ResultException ex = new ResultException();
			ex.addErrorWithStack("Used getSV() on a multi-valued attribute: " + attrname, DebugInfo.getCurrentStack());
			
			throw(ex);
		}
		
		return(values.getMVnth(0).trim());
	}

}
