package org.dmd.dmc.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObjectNameAttribute;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeStringName class provides support for simple, String based names for objects.
 */
@SuppressWarnings("serial")
public class DmcTypeStringName extends DmcObjectNameAttribute<StringName> {
	
	public DmcTypeStringName(){
		
	}

	@Override
	protected StringName cloneValue(StringName original) {
		return(new StringName(original.name));
	}

	@Override
	public void deserializeMV(DmcInputStreamIF dos) throws Exception {
		
	}

	@Override
	public void deserializeSV(DmcInputStreamIF dos) throws Exception {
		
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeStringName());
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void serializeType(DmcOutputStreamIF dos) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected StringName typeCheck(Object value) throws DmcValueException {
		// TODO Auto-generated method stub
		return null;
	}

}
