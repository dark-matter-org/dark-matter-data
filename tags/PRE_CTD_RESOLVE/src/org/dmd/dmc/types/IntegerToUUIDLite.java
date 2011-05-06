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
 * The IntegerToString class provides the basis for an attribute that maps an Integer to a String value.
 * It is used by the DmcHashedAttribute derivative, DmcTypeIntegerToString.
 *
 */
@SuppressWarnings("serial")
public class IntegerToUUIDLite implements DmcMappedAttributeIF, Serializable {
	
	Integer		key;
	UUIDLite	value;
	
	public IntegerToUUIDLite(){
		key 	= null;
		value 	= null;
	}

	public IntegerToUUIDLite(Integer k){
		key 	= k;
		value 	= new UUIDLite();
	}

	public IntegerToUUIDLite(Integer k, UUIDLite v){
		key 	= k;
		value 	= v;
	}

	@Override
	public Object getKey() {
		return(key);
	}

	@Override
	public String getKeyAsString() {
		if (key == null)
			return("null");
		return(key.toString());
	}

	@Override
	public String toString(){
		if (key == null){
			if (value == null)
				return("null null");
			return("null " + value);
		}
		if (value == null)
			return(key.toString() + " null");
		
		return(key.toString() + " " + value.toString());
	}
	
	public Integer getKeyAsInteger(){
		return(key);
	}
	
	public UUIDLite getValue(){
		return(value);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(key);
		dos.writeUTF(value.toString());
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		key = dis.readInt();
		value = new UUIDLite(dis.readUTF());
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj){
		boolean rc = false;
		if (obj instanceof IntegerToUUIDLite){
			IntegerToUUIDLite other = (IntegerToUUIDLite) obj;
			rc = value.equals(other.value);
		}
		return(rc);
	}

}
