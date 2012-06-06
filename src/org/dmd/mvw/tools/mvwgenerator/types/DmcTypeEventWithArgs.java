package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeEventWithArgs  extends DmcHashedAttribute<EventWithArgs> implements Serializable {

	public DmcTypeEventWithArgs(){
		
	}
	
	public DmcTypeEventWithArgs(DmcAttributeInfo ai){
		super(ai);
	}

	@Override
	public EventWithArgs cloneValue(EventWithArgs original) {
		return(new EventWithArgs(original));
	}

	@Override
	public EventWithArgs deserializeValue(DmcInputStreamIF dis) throws Exception {
		EventWithArgs rc = new EventWithArgs();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, EventWithArgs value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public EventWithArgs typeCheck(Object value) throws DmcValueException {
		if (value instanceof EventWithArgs)
			return((EventWithArgs)value);
		if (value instanceof String)
			return(new EventWithArgs((String)value));
		throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with EventWithArgs or String expected."));
	}
	
	

}
