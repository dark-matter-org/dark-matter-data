package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeClassFilter is used to perform matches against objects based on their class
 * or auxiliary classes.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeClassFilter extends DmcTypeDmcFilter<ClassFilter> implements Serializable {
	
	public DmcTypeClassFilter(){
		
	}
	
	public DmcTypeClassFilter(DmcAttributeInfo ai){
		super(ai);
	}

	@Override
	public ClassFilter cloneValue(ClassFilter original) {
		return(new ClassFilter(original));
	}

	@Override
	public ClassFilter deserializeValue(DmcInputStreamIF dis) throws Exception {
		ClassFilter rc = new ClassFilter();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, ClassFilter value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public ClassFilter typeCheck(Object value) throws DmcValueException {
		ClassFilter rc = null;
		
		if (value instanceof ClassFilter)
			rc = (ClassFilter) value;
		else if (value instanceof DmcClassInfo){
			rc = new ClassFilter((DmcClassInfo)value);
		}
		else if (value instanceof String){
			DmcClassInfo info = DmcOmni.instance().getClassInfo((String)value);
			if (info == null)
				throw(new DmcValueException("Unknown class passed to ClassFilter: " + value.toString()));
			rc = new ClassFilter(info);
		}
		else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ClassFilter/DmcClassInfo/String expected."));
		}
		
		return(rc);
	}

}
