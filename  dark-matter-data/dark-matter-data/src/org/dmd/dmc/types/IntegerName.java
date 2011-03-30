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
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The IntegerName provides another simple form of naming an object i.e. just a Integer ID.
 */
@SuppressWarnings("serial")
public class IntegerName implements DmcObjectNameIF, Serializable {
	
	public final static String className = "IntegerName";
	
	Integer name;
	
	public IntegerName(){
		
	}
	
	public IntegerName(Integer n){
		name = n;
	}

	@Override
	public String getNameString() {
		return(name.toString());
	}

	@Override
	public String toString() {
		return(name.toString());
	}

	@Override
	public void setNameString(String n) throws DmcValueException {
    	try{
    		name = Integer.valueOf(n);
    	}
    	catch(NumberFormatException e){
    		throw(new DmcValueException("Invalid IntegerName value: " + n));
    	}
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof IntegerName)
			return(name.equals(((IntegerName)obj).name));
		else if (obj instanceof DmcObjectNameIF)
			return(name.toString().equals(((DmcObjectNameIF)obj).getNameString()));
		return(false);
	}
	
	@Override
	public int hashCode(){
		return(name.hashCode());
	}

	@Override
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name = dis.readInt();
	}

	@Override
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(name);
	}

	@Override
	public int compareTo(DmcObjectNameIF o) {
		if (o instanceof IntegerName){
			return(name.compareTo(((IntegerName)o).name));
		}
		return(name.toString().compareTo(o.getNameString()));
	}

	@Override
	public Object getKey() {
		return(name);
	}

	@Override
	public String getKeyAsString() {
		return(name.toString());
	}

	@Override
	public String getNameClass() {
		return(className);
	}
}
