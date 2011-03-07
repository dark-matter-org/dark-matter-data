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
package org.dmd.dmv.server.extended;


import java.util.Iterator;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dmv.server.generated.dmw.MustRuleDMW;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The MustRule verifies that an object has all of its mandatory attributes.
 */
public class MustRule extends MustRuleDMW {

	@Override
	public void applyRule(SchemaManager schema, DmcObject obj) throws DmcValueExceptionSet {
		String constructionClass = obj.getConstructionClassName();
		DmcValueExceptionSet ex	= null;
		
		if (constructionClass == null){
			ex = new DmcValueExceptionSet();
			ex.add(new DmcValueException("Object has no construction class defined."));
			throw(ex);
		}
		
		ClassDefinition cd = schema.cdef(constructionClass);
		
		if (cd == null){
			ex = new DmcValueExceptionSet();
			ex.add(new DmcValueException("Unknown object class: " + constructionClass));
			throw(ex);
		}
		
		while(true){
			Iterator<AttributeDefinition> must = cd.getMust();
			if (must != null){
				while(must.hasNext()){
					AttributeDefinition ad = must.next();
					
					if (ad.getName().equals("objectClass"))
						continue;
					
//DebugInfo.debug("must attribute: " + ad.getName());
					
					if (obj.get(ad.getName()) == null){
						if (ex == null)
							ex = new DmcValueExceptionSet();
						
						ex.add(new DmcValueException(ad.getName(),"Missing mandatory attribute for class " + cd.getName()));
					}
				}
			}
			
			// Continue up the derivation hierarchy and stop when we get to the top
			cd = cd.getDerivedFrom();
			if (cd == null)
				break;
		}
		
		if (ex != null)
			throw(ex);
	}

	@Override
	public void applyRule(SchemaManager schema, DmcObject obj, DmcTypeModifier modifier) throws DmcValueExceptionSet {
		// TODO Auto-generated method stub
		
	}

}
