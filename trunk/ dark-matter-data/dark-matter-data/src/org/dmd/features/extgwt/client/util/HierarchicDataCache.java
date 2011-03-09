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
package org.dmd.features.extgwt.client.util;

import java.util.TreeMap;

import org.dmd.dmc.types.StringName;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;

/**
 * The HierarchicDataCache provides caching of objects that make use
 * of the DmoExtGWTTreeNode wrapper.
 */
public class HierarchicDataCache {

	@SuppressWarnings("unchecked")
	// Key: FQN
	TreeMap<StringName,DmoExtGWTTreeNode>	data;
	
	StringName nameKey;
	
	/**
	 * Constructs a new data cache.
	 */
	@SuppressWarnings("unchecked")
	public HierarchicDataCache(){
		data = new TreeMap<StringName, DmoExtGWTTreeNode>();
		nameKey = new StringName();
	}
	
	/**
	 * Returns the specified object if it's found.
	 * @param FQN the fully qualified name of the object.
	 * @return The hierarchic object.
	 */
	@SuppressWarnings("unchecked")
	public DmoExtGWTTreeNode find(String FQN){
		nameKey.setNameString(FQN);
		return(data.get(nameKey));
	}
	
	/**
	 * Adds the specified object to the cache. If the object's parent is already
	 * in the cache, the object will be added to it as a child and the object will
	 * have its parent value set.
	 * @param obj The object to be added.
	 */
	@SuppressWarnings("unchecked")
	public void addObject(DmoExtGWTTreeNode obj){
		DmoExtGWTTreeNode parent = data.get(obj.getParentFQN());
		
		if (parent != null)
			parent.addChild(obj);

		data.put(obj.getFQN(), obj);
	}
	
	/**
	 * Removes the object with the specified name form the cache and removes it
	 * from its parent if it has one.
	 * @param FQN
	 */
	@SuppressWarnings("unchecked")
	public void deleteObject(String FQN){
		DmoExtGWTTreeNode obj = data.get(FQN);
		
		if (obj != null){
			if (obj.getParentObject() != null){
				obj.getParentObject().removeChild(obj);
			}
			data.remove(FQN);
		}
	}
	
	
}
