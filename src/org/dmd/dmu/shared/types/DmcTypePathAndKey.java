package org.dmd.dmu.shared.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypePathAndKey extends DmcAttribute<PathAndKey> implements Serializable {

	public DmcTypePathAndKey() {
		
	}
	public DmcTypePathAndKey(DmcAttributeInfo ai) {
		super(ai);
	}

	@Override
	public PathAndKey typeCheck(Object value) throws DmcValueException {
		PathAndKey rc = null;
		
		if (value instanceof PathAndKey)
			rc = (PathAndKey) value;
		else if (value instanceof String)
			rc = new PathAndKey((String) value);
		else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with PathAndKey or String expected."));

		return(rc);
	}

	@Override
	public PathAndKey cloneValue(PathAndKey original) {
		return(new PathAndKey(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization

	@Override
	public void serializeValue(DmcOutputStreamIF dos, PathAndKey value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public PathAndKey deserializeValue(DmcInputStreamIF dis) throws Exception {
		PathAndKey rc = new PathAndKey();
		rc.deserializeIt(dis);
		return(rc);
	}

}
