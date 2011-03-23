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
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcBoolean type is meant to store Boolean values. The set/add interfaces
 * will accept Boolean objects, String objects with "true" or "false",
 * regardless of case of the characters, or Integer objects where 0 maps to
 * false and everything else to true.
 */
@SuppressWarnings("serial")
public class DmcTypeBoolean extends DmcAttribute<Boolean> {
	
	/**
	 * Constructs a new Boolean attribute.
	 */
	public DmcTypeBoolean(){
	}
	
	public DmcTypeBoolean(DmcAttributeInfo ai){
		super(ai);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcAttribute abstract overrides

	protected Boolean typeCheck(Object value) throws DmcValueException {
		Boolean rc = null;
		
        if (value instanceof Boolean){
            rc = (Boolean)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	if (v.toLowerCase().equals("true"))
        		rc = new Boolean(true);
        	else if (v.toLowerCase().equals("false"))
        		rc = new Boolean(false);
        	else{
        		throw(new DmcValueException("Invalid Boolean value: " + v));
        	}
        }
        else if (value instanceof Integer){
        	Integer v = (Integer)value;
        	
        	if (v == 0)
        		rc = new Boolean(false);
        	else
        		rc = new Boolean(true);
        	
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Boolean expected."));
        }
        
        return(rc);
	}

	@Override
	protected Boolean cloneValue(Boolean original) {
		return(new Boolean(original));
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
    
	/**
	 * Write a Boolean.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
	 */
    public void serializeValue(DmcOutputStreamIF dos, Boolean value) throws Exception {
    	dos.writeBoolean(value);
    }

    /**
     * Read a Boolean.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public Boolean deserializeValue(DmcInputStreamIF dis) throws Exception {
    	return(new Boolean(dis.readBoolean()));
    }

    
    
	////////////////////////////////////////////////////////////////////////////////
	// OBSOLETE
	
	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (Boolean b : mv){
				sb.append(b + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}
	}
	
	@Override
	protected DmcAttribute<?> getOneOfMe() {
		return(new DmcTypeBoolean());
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
	
	@Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	if (sv == null){
			for (Boolean d : mv){
				dos.writeBoolean(d);
			}
    	}
    	else{
    		dos.writeBoolean(sv.booleanValue());
    	}
    }
	
	@Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
    	sv = new Boolean(dis.readBoolean());
    }

	@Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
		if (mv == null)
			mv = new ArrayList<Boolean>();
    
    	mv.add(new Boolean(dis.readBoolean()));
    }


}
