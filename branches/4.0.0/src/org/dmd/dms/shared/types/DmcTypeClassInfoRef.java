package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.DmcAttribute;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.schema.DmcClassInfo;

@SuppressWarnings("serial")
abstract public class DmcTypeClassInfoRef extends DmcAttribute<ClassInfoRef> implements Serializable {
	
	public DmcTypeClassInfoRef(){
		
	}
	
	public DmcTypeClassInfoRef(DmcAttributeInfo ai){
		super(ai);
	}
	
	@Override
	public DmcAttribute<ClassInfoRef> cloneIt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassInfoRef cloneValue(ClassInfoRef original) {
		return(new ClassInfoRef(original));
	}

	@Override
	public ClassInfoRef deserializeValue(DmcInputStreamIF dis) throws Exception {
		ClassInfoRef rc = new ClassInfoRef();
		rc.deserializeIt(dis);
		return(rc);
	}

//	@Override
//	protected DmcAttribute<?> getNew() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	protected String formatValue(ClassInfoRef value){
		return(value.info.name);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, ClassInfoRef value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public ClassInfoRef typeCheck(Object value) throws DMFeedbackSet {
		ClassInfoRef rc = null;
		
		if (value instanceof DmcClassInfo)
			rc = new ClassInfoRef((DmcClassInfo)value);
		else if (value instanceof ClassInfoRef)
			rc = (ClassInfoRef) value;
		else if (value instanceof String)
			rc = new ClassInfoRef((String)value);
		else if (value instanceof Integer)
			rc = new ClassInfoRef((Integer)value);
		else
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with DmcClassInfo/ClassInfoRef/String/Integer expected."));
		
		return(rc);
	}

}
