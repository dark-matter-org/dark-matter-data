package org.dmd.dmt.shared.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
public class DmcTypeKeyedType extends DmcAttribute<KeyedType> implements Serializable {
	
	public DmcTypeKeyedType(){
		
	}
	
	public DmcTypeKeyedType(DmcAttributeInfo ai){
		super(ai);
	}

	///////////////////////////////////////////////////////////////////////////
	// DmcAttribute implementation
	
	@Override
	protected KeyedType typeCheck(Object value) throws DmcValueException {
		KeyedType rc = null;
		
		if (value instanceof KeyedType){
			rc = (KeyedType) value;
		}
		else if (value instanceof String){
			
		}
		
		return(rc);
	}

	@Override
	protected KeyedType cloneValue(KeyedType original) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, KeyedType value)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public KeyedType deserializeValue(DmcInputStreamIF dis) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected DmcAttribute<?> getNew() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DmcAttribute<KeyedType> cloneIt() {
		// TODO Auto-generated method stub
		return null;
	}

}
