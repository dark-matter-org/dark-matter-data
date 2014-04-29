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

import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcMappedAttributeIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

/**
 * The IntegerToBoolean class provides the basis for an attribute that maps an Integer to a Boolean value.
 * It is used by the DmcHashedAttribute derivative, DmcTypeIntegerToBoolean.
 *
 */
@SuppressWarnings("serial")
public class IntegerToBoolean implements DmcMappedAttributeIF, Serializable {
	
	Integer	key;
	Boolean	value;
	
	public IntegerToBoolean(){
		key = null;
		value = null;
	}

	public IntegerToBoolean(Integer k){
		key = k;
		value = false;
	}

	public IntegerToBoolean(Integer k, Boolean v){
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
		
		return(key.toString() + " " + value);
	}
	
	public Integer getKeyAsInteger(){
		return(key);
	}
	
	public Boolean getValue(){
		return(value);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(key);
		dos.writeBoolean(value);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		key = dis.readInt();
		value = dis.readBoolean();
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof IntegerToBoolean)
			return(valuesAreEqual((IntegerToBoolean)obj));
		return(false);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj){
		boolean rc = false;
		if (obj instanceof IntegerToBoolean){
			IntegerToBoolean other = (IntegerToBoolean) obj;
	        if (key != other.getKeyAsInteger().intValue())
	        	rc = false;
	        else
	        	rc = value.equals(other.value);
		}
		return(rc);
	}

}
