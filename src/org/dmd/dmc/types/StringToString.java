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
package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;

/**
 * The StringToString class provides the basis for an attribute that maps a String to another String value.
 * It is used by the DmcHashedAttribute derivative, DmcTypeStringToString.
 *
 */
@SuppressWarnings("serial")
public class StringToString implements DmcMappedAttributeIF, Serializable {
	
	String	key;
	String	value;
	
	public StringToString(){
		key 	= null;
		value 	= null;
	}
	
	public StringToString(String k){
		key 	= k;
		value 	= "";
	}

	public StringToString(String k, String v){
		key = k;
		value = v;
	}

	@Override
	public Object getKey() {
		return(key);
	}

	@Override
	public String getKeyAsString() {
		if (key == null)
			return("null");
		return(key);
	}

	@Override
	public String toString(){
		if (key == null){
			if (value == null)
				return("null null");
			return("null " + value);
		}
		if (value == null)
			return(key + " null");
		
		return(key + " " + value);
	}
	
//	public Integer getKeyAsInteger(){
//		return(key);
//	}
	
	public String getValue(){
		return(value);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(key);
		dos.writeUTF(value);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		key = dis.readUTF();
		value = dis.readUTF();
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof StringToString)
			return(valuesAreEqual((StringToString)obj));
		return(false);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj){
		boolean rc = false;
		if (obj instanceof StringToString){
			StringToString other = (StringToString) obj;
			if (key.equals(other.key))
				rc = value.equals(other.value);
			else
				rc = false;
		}
		return(rc);
	}
}
