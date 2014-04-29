//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.DmcAttribute;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

@SuppressWarnings("serial")
abstract public class DmcTypeTimeDoubleDataPoint extends DmcAttribute<TimeDoubleDataPoint> implements Serializable {

	public DmcTypeTimeDoubleDataPoint(){
		super();
	}
	
	public DmcTypeTimeDoubleDataPoint(DmcAttributeInfo ai){
		super(ai);
	}
	
	@Override
	public TimeDoubleDataPoint typeCheck(Object value) throws DMFeedbackSet {
		TimeDoubleDataPoint rc = null;
		
        if (value instanceof TimeDoubleDataPoint){
            rc = (TimeDoubleDataPoint)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new TimeDoubleDataPoint(v);
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with TimeDataPoint expected."));
        }
        
        return(rc);
	}

	@Override
	public TimeDoubleDataPoint cloneValue(TimeDoubleDataPoint original) {
		return(new TimeDoubleDataPoint(original));
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization

	@Override
	public void serializeValue(DmcOutputStreamIF dos, TimeDoubleDataPoint value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public TimeDoubleDataPoint deserializeValue(DmcInputStreamIF dis) throws Exception {
		TimeDoubleDataPoint rc = new TimeDoubleDataPoint();
		rc.deserializeIt(dis);
		return(rc);
	}


}
