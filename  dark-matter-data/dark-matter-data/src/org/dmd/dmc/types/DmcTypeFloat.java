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
 * The DmcFloat type is meant to store Float values. The set/add interfaces
 * will accept Float objects and String objects that represent valid Floats.
 */
@SuppressWarnings("serial")
public class DmcTypeFloat extends DmcAttribute<Float> {
	
	/**
	 * Constructs a new Float attribute.
	 */
	public DmcTypeFloat(){
	}
	
	public DmcTypeFloat(DmcAttributeInfo ai){
		super(ai);
	}
	
	protected Float typeCheck(Object value) throws DmcValueException {
		Float rc = null;
		
        if (value instanceof Float){
            rc = (Float)value;
        }
        else if (value instanceof Integer){
            rc = (Float)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	try{
        		rc = Float.valueOf(v);
        	}
        	catch(NumberFormatException e){
        		throw(new DmcValueException("Invalid Float value: " + v));
        	}
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Float expected."));
        }
        
        return(rc);
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (Float d : mv){
				sb.append(d + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}
	}

	@Override
	protected Float cloneValue(Float original) {
		return(new Float(original));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeFloat());
	}

	
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
	
	@Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	if (sv == null){
			for (Float d : mv){
				dos.writeFloat(d);
			}
    	}
    	else{
    		dos.writeFloat(sv);
    	}
    }
	
	@Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
    	sv = new Float(dis.readFloat());
    }

	@Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
		if (mv == null)
			mv = new ArrayList<Float>();
		
    	mv.add(new Float(dis.readFloat()));
    }


}
