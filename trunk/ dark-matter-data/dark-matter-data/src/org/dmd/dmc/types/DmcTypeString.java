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
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
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
	
	public DmcTypeString(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	protected String typeCheck(Object value) throws DmcValueException {
		return(value.toString());
	}

	@Override
	protected String cloneValue(String original) {
		return(new String(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a String.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, String value) throws Exception {
        dos.writeUTF(value);
    }

    /**
     * Read a String.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public String deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(new String(dis.readUTF()));
    }

    
    
    ////////////////////////////////////////////////////////////////////////////////
    // OBSOLETE
    
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
	protected DmcAttribute<?> getOneOfMe() {
		return(new DmcTypeString());
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
	
	@Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
		switch(attrInfo.valueType){
		case SINGLE:
			dos.writeUTF(sv);
			break;
		case MULTI:
			for(String s: mv)
				dos.writeUTF(s);
			break;
		case HASHMAPPED:
		case TREEMAPPED:
			for(String s: map.values())
				dos.writeUTF(s);
			break;
		case HASHSET:
		case TREESET:
			for(String s: set)
				dos.writeUTF(s);
			break;
		}
    }
	
	@Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
    	sv = new String(dis.readUTF());
    }

	@Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
		switch(attrInfo.valueType){
		case SINGLE:
			throw(new IllegalStateException("deserializeMV() called on a SINGLE attribute."));
		case MULTI:
			if (mv == null)
				mv = new ArrayList<String>();
			mv.add(new String(dis.readUTF()));
			break;
		case HASHMAPPED:
			if (map == null)
				map = new HashMap<Object, String>();
		case TREEMAPPED:
			if (map == null)
				map = new TreeMap<Object, String>();
			String v = new String(dis.readUTF());
			map.put(v, v);
			break;
		case HASHSET:
			if (set == null)
				set = new HashSet<String>();
			set.add(new String(dis.readUTF()));
			break;
		case TREESET:
			if (set == null)
				set = new TreeSet<String>();
			set.add(new String(dis.readUTF()));
			break;
		}
    }



    
}
