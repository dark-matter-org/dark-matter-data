//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
import java.util.Iterator;

import org.dmd.core.DmcAttribute;
import org.dmd.core.feedback.DMFeedback;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;
import org.dmd.core.schema.DmcAttributeInfo;

@SuppressWarnings("serial")
abstract public class DmcTypeModifier extends DmcAttribute<Modifier> implements Serializable {
	
	public DmcTypeModifier(){
		
	}

	public DmcTypeModifier(DmcAttributeInfo ai){
		super(ai);
	}
		
    ////////////////////////////////////////////////////////////////////////////////
    // DmcAttribute abstract overrides

	public Modifier typeCheck(Object value) throws DMFeedbackSet {
		Modifier rc = null;
		
        if (value instanceof Modifier){
            rc = (Modifier)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new Modifier(v);
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with Modifier expected."));
        }
        
        return(rc);
	}

	@Override
	public Modifier cloneValue(Modifier original) {
		return(new Modifier(original));
	}

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    /**
     * Write a Modifier.
     * @param dos The output stream.
     * @param value The value to be serialized.
     * @throws Exception
     */
    public void serializeValue(DmcOutputStreamIF dos, Modifier value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Read a Modifier.
     * @param dis the input stream.
     * @return A value read from the input stream.
     * @throws Exception
     */
    public Modifier deserializeValue(DmcInputStreamIF dis) throws Exception {
    	Modifier rc = new Modifier();
        rc.deserializeIt(dis);
        return(rc);
    }

	/**
	 * This method checks all modifications to ensure that they are resolved. Any modification
	 * that isn't resolved is added to the exception set.
	 * @throws DmcValueExceptionSet  
	 */
	public void resolved() throws DMFeedbackSet {
		DMFeedbackSet ex = null;
		
		Iterator<Modifier>	mods = getMV();
		if (mods != null){
			while(mods.hasNext()){
				Modifier mod = mods.next();
				if (!mod.isResolved()){
					if (ex == null)
						ex = new DMFeedbackSet();
					ex.add(new DMFeedback("The value for the " + mod.operation + " modification on the " + mod.attributeName + " attribute is not resolved."));
				}
			}
		}
		
		if (ex != null)
			throw (ex);
	}
    
}
