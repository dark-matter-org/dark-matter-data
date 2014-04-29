//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

/**
 * The DmcTypeRuleName class provides support for camelCase based names for rules.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeRuleName extends DmcTypeDmcObjectName<RuleName> implements Serializable {
	
	public DmcTypeRuleName(){
		
	}

	public DmcTypeRuleName(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	@Override
	public RuleName typeCheck(Object value) throws DMFeedbackSet {
		RuleName rc = null;
		
		if (value instanceof RuleName){
			rc = (RuleName) value;
		}
		else if (value instanceof String){
			rc =  new RuleName((String) value);
		}
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with RuleName or String expected."));
        }

		return rc;
	}

	@Override
	public RuleName cloneValue(RuleName original) {
		return(new RuleName(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a RuleName.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, RuleName value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a RuleName.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public RuleName deserializeValue(DmcInputStreamIF dis) throws Exception {
    	RuleName rc = new RuleName();
        rc.deserializeIt(dis);
        return(rc);
    }

}
