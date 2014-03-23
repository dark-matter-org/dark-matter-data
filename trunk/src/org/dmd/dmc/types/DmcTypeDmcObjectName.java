package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeDmcObjectName<VALUE extends DmcObjectName> extends DmcAttribute<VALUE> implements Serializable {

	public DmcTypeDmcObjectName(){
		
	}
	
	protected DmcTypeDmcObjectName(DmcAttributeInfo ai){
		super(ai);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected VALUE cloneValue(VALUE original) {
		return (VALUE) (original.cloneIt());
	}

	@SuppressWarnings("unchecked")
	@Override
	public VALUE deserializeValue(DmcInputStreamIF dis) throws Exception {
		VALUE rc = (VALUE) dis.getNameValueInstance();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, VALUE value) throws Exception {
		value.serializeIt(dos);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected VALUE typeCheck(Object value) throws DmcValueException {
		if (value instanceof DmcObjectName)
			return((VALUE)value);
		throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmcObjectName expected."));
	}


}
