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
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.generated.enums.ModifyTypeEnum;

@SuppressWarnings("serial")
public class DmcTypeModifier extends DmcAttribute<Modification> {
	
	public DmcTypeModifier(){
		
	}

	public DmcTypeModifier(DmcAttributeInfo ai){
		super(ai);
	}
		
	protected Modification typeCheck(Object value) throws DmcValueException {
		Modification rc = null;
		
        if (value instanceof Modification){
            rc = (Modification)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new Modification(v);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Modifier expected."));
        }
        
        return(rc);
	}

	@Override
	public String getString() {
		if (sv == null){
			if (mv == null)
				return("");
			
			StringBuffer sb = new StringBuffer();
			for (Modification e : mv){
				sb.append(e + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}
	}

	@Override
	protected Modification cloneValue(Modification original) {
		return(new Modification(original));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeModifier());
	}
	
	/**
	 * This method checks all modifications to ensure that they are resolved. Any modification
	 * that isn't resolved is added to the exception set.
	 * @throws DmcValueExceptionSet  
	 */
	public void resolved() throws DmcValueExceptionSet {
		DmcValueExceptionSet ex = null;
		
		for(Modification mod : mv){
			if (!mod.isResolved()){
				if (ex == null)
					ex = new DmcValueExceptionSet();
				ex.add(new DmcValueException("The value for the " + mod.operation + " modification on the " + mod.attributeName + " attribute is not resolved."));
			}
		}
		
		if (ex != null)
			throw (ex);
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization
	
	@Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	if (sv == null){
			for (Modification d : mv){
				dos.writeShort(d.operation.intValue());
				dos.writeUTF(d.attributeName);
				dos.writeUTF(d.value);
			}
    	}
    	else{
			dos.writeShort(sv.operation.intValue());
			dos.writeUTF(sv.attributeName);
			dos.writeUTF(sv.value);
    	}
    }
	
	@Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
		sv = new Modification();
		sv.operation = ModifyTypeEnum.get(dis.readShort());
		sv.attributeName = dis.readUTF();
		sv.value = dis.readUTF();
    }

	@Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
		if (mv == null)
			mv = new ArrayList<Modification>();
		
		Modification mod = new Modification();
		mod.operation = ModifyTypeEnum.get(dis.readShort());
		mod.attributeName = dis.readUTF();
		mod.value = dis.readUTF();
    	mv.add(mod);
    }

}
