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
package org.dmd.core.presentation;

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.DmcObject;

/**
 * The DmcBinding is implemented by the generated form bindings that are
 * part of the Model View Whatever framework. This interface is required to
 * allow access to the values of other attributes being displayed in a form
 * for rules that perform checking across attributes in an object.
 */
abstract public class DmcBinding<OBJ extends DmcObject> {
	
	protected OBJ dmo;
	
	protected DmcPresentationTrackerIF	tracker;
	
	public DmcBinding(){
		
	}

	public OBJ getObject(){
		return(dmo);
	}
	
	abstract public DmcAdapterIF getAdapter(DmcAttributeInfo attr);
	
	public void setTracker(DmcPresentationTrackerIF t){
		tracker = t;
	}
	
	abstract public void setEnabledAll(boolean enabled);
	
}
