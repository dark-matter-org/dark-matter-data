package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeRequestTypeWithOptions  extends DmcHashedAttribute<RequestTypeWithOptions> implements Serializable {

	public DmcTypeRequestTypeWithOptions(){
		
	}
	
	public DmcTypeRequestTypeWithOptions(DmcAttributeInfo ai){
		super(ai);
	}

	@Override
	public RequestTypeWithOptions cloneValue(RequestTypeWithOptions original) {
		return(new RequestTypeWithOptions(original));
	}

	@Override
	public RequestTypeWithOptions deserializeValue(DmcInputStreamIF dis) throws Exception {
		RequestTypeWithOptions rc = new RequestTypeWithOptions();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, RequestTypeWithOptions value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public RequestTypeWithOptions typeCheck(Object value) throws DmcValueException {
		if (value instanceof RequestTypeWithOptions)
			return((RequestTypeWithOptions)value);
		if (value instanceof String)
			return(new RequestTypeWithOptions((String)value));
		throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with RequestTypeWithOptions or String expected."));
	}
	
	

}
