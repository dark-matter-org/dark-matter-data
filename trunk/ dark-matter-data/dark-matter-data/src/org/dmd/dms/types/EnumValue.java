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
		
		int space1 = v.indexOf(" ");
		int space2 = v.indexOf(" ", space1+1);
		
		if ( (space1 == -1) || (space2 == -1) ){
			throw(new DmcValueException("Incorrect number of tokens for EnumValue.set(): " + v));
		}
		
		try {
			id = Integer.valueOf(v.substring(0,space1));
		} catch (NumberFormatException e) {
			throw(new DmcValueException("Invalid enum integer value: " + v.substring(space1) + "\n" + e));
		}
		
		String tmp = v.substring(space1+1,space2);
		if (Character.isLetter(tmp.charAt(0))){
			name = tmp.toUpperCase();
		}
		else{
			throw(new DmcValueException("Enum value name must start with a character: " + v.substring(space1+1,space2)));
		}
		
		description = v.substring(space2+1);
	}
	
	/**
	 * Returns the EnumValue in its string representation.
	 */
	public String toString(){
		return(id + " " + name + " " + description);
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

	
}
