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
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOutputStreamIF;


/**
 * The NameContainer is designed to hold a typed DmcObjectName value. This allows
 * for the transport of individually identified name name values in things like the 
 * the Dark Matter Protocol GetRequest. 
 */
@SuppressWarnings("serial")
public class NameContainer implements Serializable {

	DmcTypeDmcObjectName<?>	name;
	
	public NameContainer(){
		name = null;
	}
	
	public NameContainer(DmcTypeDmcObjectName<?> n){
		name = n;
	}
	
	public DmcObjectName getName(){
		if (name == null)
			return(null);
		
		return(name.getSV());
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		name.serializeIt(dos);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name =  (DmcTypeDmcObjectName<?>) dis.getAttributeInstance();
		name.deserializeIt(dis);
	}

	public NameContainer cloneIt() {
		NameContainer rc = new NameContainer();
		rc.name = name;
		return(rc);
	}

	public String toString(){
		return(name.getName() + " " + name.getSV().toString());
	}

}
