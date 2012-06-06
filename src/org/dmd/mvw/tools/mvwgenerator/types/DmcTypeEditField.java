package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeEditField  extends DmcHashedAttribute<EditField> implements Serializable {

	public DmcTypeEditField(){
		
	}
	
	public DmcTypeEditField(DmcAttributeInfo ai){
		super(ai);
	}

	@Override
	public EditField cloneValue(EditField original) {
		return(new EditField(original));
	}

	@Override
	public EditField deserializeValue(DmcInputStreamIF dis) throws Exception {
		EditField rc = new EditField();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, EditField value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public EditField typeCheck(Object value) throws DmcValueException {
		if (value instanceof EditField)
			return((EditField)value);
		if (value instanceof String)
			return(new EditField((String)value));
		throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with EditField or String expected."));
	}
	
	

}
