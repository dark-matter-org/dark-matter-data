package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeGetWithOptions  extends DmcHashedAttribute<GetWithOptions> implements Serializable {

	public DmcTypeGetWithOptions(){
		
	}
	
	public DmcTypeGetWithOptions(DmcAttributeInfo ai){
		super(ai);
	}

	@Override
	public GetWithOptions cloneValue(GetWithOptions original) {
		return(new GetWithOptions(original));
	}

	@Override
	public GetWithOptions deserializeValue(DmcInputStreamIF dis) throws Exception {
		GetWithOptions rc = new GetWithOptions();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, GetWithOptions value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public GetWithOptions typeCheck(Object value) throws DmcValueException {
		if (value instanceof GetWithOptions)
			return((GetWithOptions)value);
		if (value instanceof String)
			return(new GetWithOptions((String)value));
		throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GetWithOptions or String expected."));
	}
	
	

}
