package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.DmcAttribute;
import org.dmd.core.DmcFilter;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.schema.DmcAttributeInfo;

@SuppressWarnings("serial")
abstract public class DmcTypeDmcFilter<VALUE extends DmcFilter> extends DmcAttribute<VALUE> implements Serializable {

	public DmcTypeDmcFilter(){
		
	}
	
	protected DmcTypeDmcFilter(DmcAttributeInfo ai){
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
		VALUE rc = (VALUE) dis.getFilterValueInstance();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, VALUE value) throws Exception {
		value.serializeIt(dos);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected VALUE typeCheck(Object value) throws DMFeedbackSet {
		if (value instanceof DmcFilter)
			return((VALUE)value);
		throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with DmcFilter expected."));
	}


}
