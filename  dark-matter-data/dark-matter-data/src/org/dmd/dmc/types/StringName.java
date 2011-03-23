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
 * The StringName provides the simplest form of naming an object i.e. just a String.
 */
@SuppressWarnings("serial")
public class StringName implements DmcObjectNameIF, Serializable {
	
	String name;
	
	public StringName(){

	}
	
	public StringName(String n){
		name = n;
	}

	@Override
	public String getNameString() {
		return(name);
	}
	
	public void setNameString(String n) throws DmcValueException {
		name = n;
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof StringName)
			return(name.equals(((StringName)obj).name));
		if (obj instanceof DmcObjectNameIF)
			return(name.equals(((DmcObjectNameIF)obj).getNameString()));
		return(false);
	}
	
	@Override
	public int hashCode(){
		return(name.hashCode());
	}

	@Override
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
//		DebugInfo.debug("write: " + name + "*");
		dos.writeUTF(name);
	}

	@Override
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name = dis.readUTF();
//		DebugInfo.debug("read: " + name + "*");
	}

	@Override
	public int compareTo(DmcObjectNameIF o) {
		if (o instanceof StringName){
			return(name.compareTo(((StringName)o).name));
		}
		return(name.compareTo(o.getNameString()));
	}

	@Override
	public String toString(){
		return(name);
	}

	@Override
	public Object getKey() {
		return(name);
	}

	@Override
	public String getKeyAsString() {
		return(name);
	}
	
}
