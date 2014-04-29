package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.DmcOmni;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.schema.DmcClassInfo;

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
	public ClassFilter typeCheck(Object value) throws DMFeedbackSet {
		ClassFilter rc = null;
		
		if (value instanceof ClassFilter)
			rc = (ClassFilter) value;
		else if (value instanceof DmcClassInfo){
			rc = new ClassFilter((DmcClassInfo)value);
		}
		else if (value instanceof String){
			DmcClassInfo info = DmcOmni.instance().getClassInfo((String)value);
			if (info == null)
				throw(new DMFeedbackSet("Unknown class passed to ClassFilter: " + value.toString()));
			rc = new ClassFilter(info);
		}
		else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with ClassFilter/DmcClassInfo/String expected."));
		}
		
		return(rc);
	}

}
