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
package org.dmd.dmc.validators;

import java.util.Iterator;
import java.util.Map;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectValidator;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The AttributeSetValidator will verify that an object has all of its "must" attributes
 * and that it only contains attributes that are allowable based on its ClassDefinition in
 * the Dark Matter Schema.
 */
public class AttributeSetValidator extends DmcObjectValidator {
	
	final static String name = "AttributeSet";
	
	public AttributeSetValidator(){
		
	}

	@Override
	public void validate(DmcObject obj) throws DmcValueExceptionSet {
		DmcValueExceptionSet exceptions = null;
		
		// Cycle through the attribute definitions associated with the object
		// and verify that any that are NOT optional, exist in the object.
		Map<Integer,DmcAttributeInfo> mai = obj.getIdToAttrInfo();
		if (mai != null){
			Iterator<DmcAttributeInfo> it = mai.values().iterator();
			while(it.hasNext()){
				DmcAttributeInfo ai = it.next();
				if (ai.mandatory){
					if (obj.get(ai.id) == null){
						if (exceptions == null)
							exceptions = new DmcValueExceptionSet();
						exceptions.add(new DmcValueException("Mandatory attribute is missing: " + ai.name));
					}
				}
			}
		}
		
		// And now, cycle through the attributes of the object and verify that
		// they are allowed
		Iterator<DmcAttribute<?>> attrs = obj.getAttributes().values().iterator();
		while(attrs.hasNext()){
			DmcAttribute<?> attr = attrs.next();
			if (attr.getID() == DmcObject.__objectClass.id){
				// TODO: hang on to this so that we can access the auxiliary classes
				// to query them if required
			}
			else{
				if (obj.getIdToAttrInfo().get(attr.getID()) == null){
DebugInfo.debug("Attribute: " + attr.getName() + " is not valid for an object of class: " + obj.getConstructionClassName());
//					if (exceptions == null)
//						exceptions = new DmcValueExceptionSet();
//					exceptions.add(new DmcValueException("Attribute: " + attr.getName() + " is not valid for an object of class: " + obj.getConstructionClassName()));
				}
			}
		}
		
		if (exceptions != null)
			throw(exceptions);
	}

	@Override
	public String getName() {
		return(name);
	}

}
