package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeRequestWithOptions  extends DmcHashedAttribute<RequestWithOptions> implements Serializable {

	public DmcTypeRequestWithOptions(){
		
	}
	
	public DmcTypeRequestWithOptions(DmcAttributeInfo ai){
		super(ai);
	}

	@Override
	public RequestWithOptions cloneValue(RequestWithOptions original) {
		return(new RequestWithOptions(original));
	}

	@Override
	public RequestWithOptions deserializeValue(DmcInputStreamIF dis) throws Exception {
		RequestWithOptions rc = new RequestWithOptions();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, RequestWithOptions value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public RequestWithOptions typeCheck(Object value) throws DmcValueException {
		if (value instanceof RequestWithOptions)
			return((RequestWithOptions)value);
		if (value instanceof String)
			return(new RequestWithOptions((String)value));
		throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with RequestWithOptions or String expected."));
	}
	
	

}
