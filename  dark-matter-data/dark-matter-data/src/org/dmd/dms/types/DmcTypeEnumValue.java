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
package org.dmd.dms.types;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.util.exceptions.ResultException;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
public class DmcTypeEnumValue extends DmcAttribute<EnumValue> {

	public DmcTypeEnumValue(){
		
	}
	
	protected EnumValue typeCheck(Object value) throws DmcValueException {
		EnumValue rc = null;
		
        if (value instanceof EnumValue){
            rc = (EnumValue)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new EnumValue(v);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with EnumValue expected."));
        }
        
        return(rc);
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (EnumValue e : mv){
				sb.append(e + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}
	}

	@Override
	protected EnumValue cloneValue(EnumValue original) {
		return(new EnumValue(original));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeEnumValue());
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Serialization
	
	@Override
    public void serializeType(DmcOutputStreamIF dos) throws ResultException {
    	if (sv == null){
			for (EnumValue d : mv){
				dos.writeInt(d.id);
				dos.writeUTF(d.name);
				dos.writeUTF(d.description);
			}
    	}
    	else{
			dos.writeInt(sv.id);
			dos.writeUTF(sv.name);
			dos.writeUTF(sv.description);
    	}
    }
	
	@Override
    public void deserializeSV(DmcInputStreamIF dis) throws ResultException {
		sv = new EnumValue();
		sv.id = dis.readInt();
		sv.name = dis.readUTF();
		sv.description = dis.readUTF();
    }

	@Override
    public void deserializeMV(DmcInputStreamIF dis) throws ResultException {
		EnumValue ev = new EnumValue();
		ev.id = dis.readInt();
		ev.name = dis.readUTF();
		ev.description = dis.readUTF();
    	mv.add(ev);
    }


}
