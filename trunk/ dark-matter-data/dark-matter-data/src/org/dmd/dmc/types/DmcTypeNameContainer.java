package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeNameContainer extends DmcAttribute<NameContainer> implements Serializable {

	public DmcTypeNameContainer(){
		
	}
	
	public DmcTypeNameContainer(DmcAttributeInfo ai){
		super(ai);
	}
	
	@Override
	protected NameContainer typeCheck(Object value) throws DmcValueException {
		if (value instanceof NameContainer)
			return((NameContainer)value);
        throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with NameContainer expected."));
	}


	@Override
	protected NameContainer cloneValue(NameContainer original) {
		return (original.cloneIt());
	}
	@Override
	public void serializeValue(DmcOutputStreamIF dos, NameContainer value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public NameContainer deserializeValue(DmcInputStreamIF dis) throws Exception {
		NameContainer rc = new NameContainer();
		rc.deserializeIt(dis);
		return(rc);
	}

}
