package org.dmd.dmt.shared.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeDmcObjectName;

@SuppressWarnings("serial")
abstract public class DmcTypeDmtStringName extends DmcTypeDmcObjectName<DmtStringName> {
	
	public DmcTypeDmtStringName(){
		
	}

	public DmcTypeDmtStringName(DmcAttributeInfo ai){
		super(ai);
	}

	@Override
	protected DmtStringName typeCheck(Object value) throws DmcValueException {
		if (value instanceof DmtStringName)
			return((DmtStringName)value);
		if (value instanceof String)
			return(new DmtStringName((String)value));
		throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmtStringName expected."));
	}

	@Override
	protected DmtStringName cloneValue(DmtStringName original) {
		return (DmtStringName) (original.cloneIt());
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, DmtStringName value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public DmtStringName deserializeValue(DmcInputStreamIF dis) throws Exception {
		DmtStringName rc = new DmtStringName();
		rc.deserializeIt(dis);
		return(rc);
	}


}
