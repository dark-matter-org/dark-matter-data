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
package org.dmd.dms.types;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;


/**
 * The EnumValue class is used to store the definition of one enumerated value
 * that comprises part of an overall EnumDefinition.
 * <P>
 * The value of an EnumValue is comprised of at least three tokens:
 * [enum integer value] [enum value name] [enum description]
 * For example: 0 ABSTRACT Here is the definition of abstract.
 * <P>
 * Within an EnumDefinition, each EnumValue must have a unique integer identifier
 * and a unique value name.
 * <P>
 * The enum value name is automatically set to uppercase, even if it is specified
 * in lower or mixed case.
 */
public class EnumValue {
	
	// The numeric id of the enum value
	Integer id;
	
	// The name of the enumeration value in uppercase
	String 	name;

	// A brief description of the enumeration value
	String 	description;
	
	// A label that may be used in user interfaces
	String label;
	
	/**
	 * Constructs a new EnumValue.
	 */
	public EnumValue(){
		
	}
	
	/**
	 * Constructs a new EnumValue.
	 */
	public EnumValue(EnumValue original){
		id = original.id;
		name = original.name;
		description = original.description;
		label = original.label;
	}
	
	/**
	 * Constructs a new EnumValue with the specified value.
	 */
	public EnumValue(String v) throws DmcValueException {
		this.set(v);
	}
	
	/**
	 * Sets the value of the EnumValue. 
	 * @param v The enum value.
	 * @throws ResultException If the specified string doesn't match the appropriate
	 * value format.
	 */
	public void set(String v) throws DmcValueException {
		if (v == null){
			throw(new DmcValueException("null value passed to EnumValue.set()"));
		}
		
		String value = v.replaceAll("\t", " ").trim();
		
		int space = value.indexOf(" ");
		if (space == -1)
			throw(new DmcValueException("Missing enum value name: " + value + " - value should be of the form: int enum_val_name [description] <: label>"));
		
		try {
			id = Integer.valueOf(value.substring(0,space));
		} catch (NumberFormatException e) {
			throw(new DmcValueException("Invalid enum integer value: " + value + "\n" + e));
		}
		
		String remainder = value.substring(space+1).trim();
		space = remainder.indexOf(" ");
		
		if (space == -1)
			throw(new DmcValueException("Missing enum description: " + value + " - value should be of the form: int enum_val_name [description] <: label>"));
		
		String tmp = remainder.substring(0,space);
		if (Character.isLetter(tmp.charAt(0))){
			name = tmp.toUpperCase();
		}
		else{
			throw(new DmcValueException("Enum value name must start with a character: " + tmp));
		}
		
		remainder = remainder.substring(space+1).trim();
		int colon = remainder.indexOf(":");
		
		if (colon == -1){
			description = remainder.trim();
		}
		else{
			description = remainder.substring(0,colon).trim();
			
			if ( (colon+1) == remainder.length()){
				throw(new DmcValueException("Missing label value: " + value + " - value should be of the form: int enum_val_name [description] <: label>"));
			}
			
			label = remainder.substring(colon+1).trim();
		}
		
		
		
//		int space1 = value.indexOf(" ");
//		int space2 = value.indexOf(" ", space1+1);
//		
//		if ( (space1 == -1) || (space2 == -1) ){
//			throw(new DmcValueException("Incorrect number of tokens for EnumValue.set(): " + value));
//		}
//		
//		try {
//			id = Integer.valueOf(value.substring(0,space1));
//		} catch (NumberFormatException e) {
//			throw(new DmcValueException("Invalid enum integer value: " + value.substring(space1) + "\n" + e));
//		}
//		
//		String tmp = value.substring(space1+1,space2);
//		if (Character.isLetter(tmp.charAt(0))){
//			name = tmp.toUpperCase();
//		}
//		else{
//			throw(new DmcValueException("Enum value name must start with a character: " + value.substring(space1+1,space2)));
//		}
//		
//		description = value.substring(space2+1);
	}
	
	/**
	 * Returns the EnumValue in its string representation.
	 */
	public String toString(){
		if (label == null)
			return(id + " " + name + " " + description);
		else
			return(id + " " + name + " " + description + " : " + label);
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(id);
		dos.writeUTF(name);
		dos.writeUTF(description);
		dos.writeUTF(label);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		id 			= dis.readInt();
		name 		= dis.readUTF();
		description = dis.readUTF();
		label 		= dis.readUTF();
	}


}
