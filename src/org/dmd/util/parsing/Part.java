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

import java.util.TreeSet;

public class Part {
	
	private static enum TypeE {
		OTHER,
		DIGIT,
		SPACE,
		TAB,
		ALPHA
	}
	
	TypeE type;
	
	char  	value		= 0;
	
	boolean alphaNum	= false;
	boolean upper		= false;
	boolean lower		= false;
	
	// As we consume other parts of the pattern, we maintain all values so 
	// that we can perform other inference e.g. if all we see are letters
	// a-f we might be dealing with hex
	TreeSet<String>		allValues = new TreeSet<String>();
	int		length		= 1;

	public Part(char c, boolean collapseAlphaNumeric){
		value = c;
		
		allValues.add(new String(c + ""));
		if (Character.isAlphabetic(c)){
			type = TypeE.ALPHA;
			if (Character.isUpperCase(c))
				upper = true;
			else
				lower = true;
			if (collapseAlphaNumeric)
				alphaNum = true;
		}
		else if (Character.isDigit(c)){
			type = TypeE.DIGIT;
			if (collapseAlphaNumeric)
				alphaNum = true;
		}
		else if (c == ' ')
			type = TypeE.SPACE;
		else if (c == '\t')
			type = TypeE.TAB;
		else{
			type = TypeE.OTHER;
		}
	}
	
	/**
	 * If the type of the Part passed in matches our type, we consume it, meaning that it becomes
	 * part of this Part. Our length increases and we add the value as part of the overall set of values
	 * that this part may have.
	 * @param p the next part in a sequence of parts
	 * @param collapseAlphaNumeric letters and digits will be considered equivalent so they will be gathered
	 * together into a single token
	 * @return true if we match type with the Part passed in
	 */
	public boolean consume(Part p){
		boolean rc = false;
		
		if (p.type == type){
			rc = true;
		}
		else if (alphaNum && p.alphaNum){
			rc = true;
		}
		
		if (rc){
			if (type == TypeE.OTHER){
				if (value == p.value){
					// We'll only consume if our values match
					length++;
				}
				else
					rc = false;
			}
			else{
				length++;
				allValues.add(new String(p + ""));
				
				if (p.upper)
					upper = true;
				if (p.lower)
					lower = true;
			}
		}

		return(rc);
	}
	
	public boolean matches(Part p, boolean strict){
		if (strict){
			if (length != p.length)
				return(false);
		}
			
		if (alphaNum && p.alphaNum){
			return(true);
		}
		else{
			if (type == p.type){
				
				// OTHER indicates distinct characters that we can't collapse
				if (type == TypeE.OTHER){
					if (value == p.value){
						// We will always be strict with other characters
						if (length == p.length)
							return(true);
						else
							return(false);
					}
					else
						return(false);
				}
				else
					return(true);
			}
		}
		return(false);
	}
	
	public String toString(boolean strict){
		StringBuffer sb = new StringBuffer();
		
		String lengthInfo = "*";
		if (strict)
			lengthInfo = length + "";
		
		if (alphaNum)
			sb.append("ALPHANUM (" + lengthInfo + ")  ");
		else if (type == TypeE.ALPHA)
			sb.append("ALPHA (" + lengthInfo + ")  ");
		else if (type == TypeE.DIGIT)
			sb.append("DIGIT (" + lengthInfo + ")  ");
		else if (type == TypeE.SPACE)
			sb.append("SPACE (" + lengthInfo + ")  ");
		else if (type == TypeE.TAB)
			sb.append("TAB (" + lengthInfo + ")  ");
		else{
			sb.append(value + " (" + length + ")  ");
		}
		
		return(sb.toString());
	}
}
