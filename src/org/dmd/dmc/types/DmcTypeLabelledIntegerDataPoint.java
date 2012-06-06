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
package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeLabelledIntegerDataPoint extends DmcAttribute<LabelledIntegerDataPoint> implements Serializable  {

	public DmcTypeLabelledIntegerDataPoint(){
		super();
	}
	
	public DmcTypeLabelledIntegerDataPoint(DmcAttributeInfo ai){
		super(ai);
	}
	
	@Override
	public LabelledIntegerDataPoint typeCheck(Object value) throws DmcValueException {
		LabelledIntegerDataPoint rc = null;
		
        if (value instanceof LabelledIntegerDataPoint){
            rc = (LabelledIntegerDataPoint)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new LabelledIntegerDataPoint(v);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with IntegerDataPoint expected."));
        }
        
        return(rc);
	}

	@Override
	public LabelledIntegerDataPoint cloneValue(LabelledIntegerDataPoint original) {
		return(new LabelledIntegerDataPoint(original));
	}

	////////////////////////////////////////////////////////////////////////////////
	// Serialization

	@Override
	public void serializeValue(DmcOutputStreamIF dos, LabelledIntegerDataPoint value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public LabelledIntegerDataPoint deserializeValue(DmcInputStreamIF dis) throws Exception {
		LabelledIntegerDataPoint rc = new LabelledIntegerDataPoint();
		rc.deserializeIt(dis);
		return(rc);
	}


}
