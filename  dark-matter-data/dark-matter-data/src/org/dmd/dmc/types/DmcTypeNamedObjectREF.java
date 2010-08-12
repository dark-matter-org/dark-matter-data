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
package org.dmd.dmc.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;

/**
 * The DmcTypeNamedObjectREF is a base type from which all references to named objects
 * are derived. This whole business is a bit complicated, but the intent is to hide
 * this complexity when you're using Dark Matter Objects (DMOs) and Dark Matter Wrappers (DMWs)
 * <P>
 * When an attribute refers to an object, how you access the object will depend on the
 * context in which you're accessing it. In some cases, you'll want to deal with the
 * raw DMO, for example in a GWT client in a browser. But, when you're dealing with the
 * object on the server side of the equation, you'll probably want to deal with the
 * wrapped object via its DMW (which has additional behaviour and functionality).
 * <P>
 * For single valued attributes, this is straight forward - the complexity comes with
 * multi-valued attributes and providing an iterator over the set of values. For an
 * object reference attribute Y that refers to objects of DMOClassX, the DMO provides
 * an access function as follows: Iterator(DMOClassX) DMO.getY(). However, if the
 * referenced class has a wrapper, we will want to have an access function that looks like:
 * Iterator(DMWClassX) DMW.getY(). 
 * <P>
 * To create the appropriate Iterator, we can either store an array of DMOs and create
 * the DMW Iterator on the fly, or, we can store a separate (mirror) array of DMWs
 * along with the DMOs.
 * <P>
 * It's not clear at the moment which approach is better - it comes down to the classic
 * time versus space argument. For now, we're going with the overhead of some additional
 * space and storing the mirrored arrays, one for the DMOs and another for the DMWs.
 * This implementation can easily be changed.
 *
 */
@SuppressWarnings("serial")
public class DmcTypeNamedObjectREF<DMO extends DmcNamedObjectIF> extends DmcAttribute<DMO> {
	
	/**
	 * Constructs a new object reference attribute.
	 */
	public DmcTypeNamedObjectREF(){
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected DMO typeCheck(Object value) throws DmcValueException {
		
		if (value instanceof DmcNamedObjectIF){
			return (DMO) (value);
		}
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmcNamedObjectIF expected."));
        }
		
	}
	
	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (DMO d : mv){
				sb.append(d.getName() + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.getName());
		}

	}
	
	
}
