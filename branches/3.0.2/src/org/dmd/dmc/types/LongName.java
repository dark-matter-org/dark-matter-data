//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The LongName provides another simple form of naming an object i.e. just a Long ID.
 */
@SuppressWarnings("serial")
public class LongName extends DmcObjectName implements DmcObjectNameIF, Serializable {
	
	public final static String className = "LongName";
	
	Long name;
	
	public LongName(){
		
	}
	
	public LongName(Long n){
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
    		name = Long.valueOf(n);
    	}
    	catch(NumberFormatException e){
    		throw(new DmcValueException("Invalid LongName value: " + n));
    	}
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof LongName)
			return(name.equals(((LongName)obj).name));
		return(false);
	}
	
	@Override
	public int hashCode(){
		return(name.hashCode());
	}

	@Override
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name = dis.readLong();
	}

	@Override
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeLong(name);
	}

	@Override
	public int compareTo(DmcObjectName o) {
		if (o instanceof LongName){
			return(name.compareTo(((LongName)o).name));
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
	
	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj){
		boolean rc = false;
		if (obj instanceof LongName){
			LongName other = (LongName) obj;
			rc = name.equals(other.name);
		}
		return(rc);
	}

	@Override
	public DmcObjectName cloneIt() {
		return(new LongName(name));
	}

	@Override
	public DmcObjectName getNew() {
		return(new LongName());
	}

	@Override
	public String getPresentationString() {
		return(name.toString());
	}

}
