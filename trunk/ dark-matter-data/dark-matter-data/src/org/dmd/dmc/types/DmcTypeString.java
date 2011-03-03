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
package org.dmd.dmc.types;

import java.util.ArrayList;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
public class DmcTypeString extends DmcAttribute<String> {
	
	/**
	 * Constructs a new String attribute.
	 */
	public DmcTypeString(){
	}
	
//	/**
//	 * Constructs a new String attribute.
//	 */
//	public DmcTypeString(DmcAttributeInfo ai){
//		super(ai);
//	}
	
	@Override
	protected String typeCheck(Object value) throws DmcValueException {
		return(value.toString());
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (String d : mv){
				sb.append(d + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}

	}

	@Override
	protected String cloneValue(String original) {
		return(new String(original));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeString());
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
	
	@Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	if (sv == null){
			for (String d : mv){
				dos.writeUTF(d);
			}
    	}
    	else{
    		dos.writeUTF(sv);
    	}
    }
	
	@Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
    	sv = new String(dis.readUTF());
    }

	@Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
		if (mv == null)
			mv = new ArrayList<String>();
		
    	mv.add(new String(dis.readUTF()));
    }



    
}
