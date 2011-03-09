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
package org.dmd.features.extgwt.client.widget.grid;

import java.util.TreeMap;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dms.generated.dmo.DmwWrapperDMO;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;

import com.extjs.gxt.ui.client.store.ListStore;

/**
 * The DmdGridStore provides the backing store for a DmdGrid. The objects stored are
 * generated wrapper objects derived from DmoExtGWTWrapperBase and should implement
 * the DmcNamedObjectIF interface. This allows for easy deletion of named objects
 * from the store. 
 * @author peter
 *
 */
public class DmdGridStore extends ListStore<DmoExtGWTWrapperBase<DmwWrapperDMO>> {

	TreeMap<String, DmoExtGWTWrapperBase<DmwWrapperDMO>> objMap;

	public DmdGridStore(){
		objMap = new TreeMap<String, DmoExtGWTWrapperBase<DmwWrapperDMO>>();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void add(DmoExtGWTWrapperBase obj){
		
		if (obj instanceof DmcNamedObjectIF){
			objMap.put(((DmcNamedObjectIF)obj).getObjectName().getNameString(), obj);
		}

		super.add(obj);
	}
	
	/**
	 * Deletes the named object if it exists.
	 * @param objName
	 */
	public void delete(String objName){
		DmoExtGWTWrapperBase<DmwWrapperDMO> obj  = objMap.get(objName);
		
		if (obj != null){
			objMap.remove(objName);
			super.remove(obj);
		}
	}
	
	/**
	 * Returns the named object if it exists.
	 * @param objName
	 * @return
	 */
	public DmoExtGWTWrapperBase<DmwWrapperDMO> get(String objName){
		return(objMap.get(objName));
	}
}
