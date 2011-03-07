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

import org.dmd.dmc.DmcObjectNameIF;

/**
 * The StringName provide the simplest form of naming an object i.e. just a String.
 */
public class StringName implements DmcObjectNameIF {
	
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

	@Override
	public boolean equals(Object obj){
		return(name.equals(obj));
	}
	
	@Override
	public int hashCode(){
		return(name.hashCode());
	}
}
