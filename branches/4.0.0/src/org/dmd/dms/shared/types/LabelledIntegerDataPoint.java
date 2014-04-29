//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import java.io.Serializable;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcMappedAttributeIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

/**
 * The LabelledDataPoint class allows for the representation of a single data point
 * with a string label value and an integer value. An example would be "Apple Inc. 543".
 * The label may have spaces, as long as the integer value is the final token.
 * <P>
 * This type is convenient for use in pie charts.
 */
@SuppressWarnings("serial")
public class LabelledIntegerDataPoint implements DmcMappedAttributeIF, Serializable {

	// The label
	String 	label;
	
	// The value
	int 	value;
	
	public LabelledIntegerDataPoint(){
		label = null;
		value = 0;
	}
	 
	public LabelledIntegerDataPoint(LabelledIntegerDataPoint original){
		label = original.label;
		value = original.value;
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception{
		dos.writeUTF(label);
		dos.writeInt(value);
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception{
		label = dis.readUTF();
		value = dis.readInt();
	}
	 
	/**
	 * Constructs a new labelled data point.
	 * @param v The string representation of the value.
	 * @throws DMFeedbackSet
	 */
	public LabelledIntegerDataPoint(String v) throws DMFeedbackSet {
		set(v);
	}
	
	public void set(String val) throws DMFeedbackSet {
		if (val == null){
			throw(new DMFeedbackSet("null value passed to LabelledDataPoint.set()"));
		}
		
		String v = val.trim();
		int lastSpace = v.lastIndexOf(" ");
		
		if (lastSpace == -1){
			throw(new DMFeedbackSet("Incorrect number of tokens for an LabelledDataPoint: " + v));
		}
		
		label = v.substring(0,lastSpace).trim();
		
		try{
			value = Integer.parseInt(v.substring(lastSpace+1));
		}
		catch(NumberFormatException ex){
			throw(new DMFeedbackSet("Invalid integer value for an LabelledDataPoint: " + v.substring(lastSpace+1)));
		}
	}
	
	public String getLabel(){
		return(label);
	}
	
	public int getValue(){
		return(value);
	}
	
	@Override
	public String toString(){
		return(label + " " + value);
	}
	
	@Override
	public boolean equals(Object v){
		if (v instanceof LabelledIntegerDataPoint){
			if (label.equals(((LabelledIntegerDataPoint) v).label)){
				if (value == ((LabelledIntegerDataPoint) v).value){
					return(true);
				}
			}
		}
		return(false);
	}

	@Override
	public Object getKey() {
		return(label);
	}

	@Override
	public String getKeyAsString() {
		return(label);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		if (obj instanceof LabelledIntegerDataPoint){
			LabelledIntegerDataPoint other = (LabelledIntegerDataPoint) obj;
			
			if (label.equals(other.label))
				if (value == other.value)
					return(true);
		}
		return false;
	}
}
