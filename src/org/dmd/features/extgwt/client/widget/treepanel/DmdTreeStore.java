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
package org.dmd.features.extgwt.client.widget.treepanel;

import java.util.TreeMap;

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.StringName;
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;
import org.dmd.features.extgwt.client.util.DmoExtGWTTreeKeyProvider;
import org.dmd.features.extgwt.client.util.DmoExtGWTTreeModelComparer;

import com.extjs.gxt.ui.client.store.TreeStore;

/**
 * The DmdTreeStore provides some convenience mechanisms in conjunction with the 
 * DmoExtGWTTreeNode wrapper objects. 
 */
public class DmdTreeStore extends TreeStore<DmoExtGWTTreeNode<HierarchicObjectDMO>> {

	// We maintain a map by FQN so that we can easily add objects to the hierarchy
	TreeMap<DmcHierarchicObjectName,DmoExtGWTTreeNode<HierarchicObjectDMO>> objMap;
	
	StringName nameKey;
	
	public DmdTreeStore(){
		super();
		this.setKeyProvider(new DmoExtGWTTreeKeyProvider());
		this.setModelComparer(new DmoExtGWTTreeModelComparer());
		objMap = new TreeMap<DmcHierarchicObjectName, DmoExtGWTTreeNode<HierarchicObjectDMO>>();
		nameKey = new StringName();
	}
	
	@SuppressWarnings("unchecked")
	public void add(DmoExtGWTTreeNode node){
		
		if (node.getParentFQN() == null){
			// This is a root node
			super.add(node,false);
		}
		else{
			DmoExtGWTTreeNode parent = objMap.get(node.getParentFQN());
			if (parent == null){
				super.add(node,false);
			}
			else{
				super.add(parent, node, false);
			}
		}
		
		objMap.put(node.getFQN(), node);
	}
	
	/**
	 * Deletes the object with the specified FQN.
	 * @param fqn The fully qualified name of the object.
	 */
	@SuppressWarnings("unchecked")
	public void delete(String fqn){
		try {
			nameKey.setNameString(fqn);
		} catch (DmcValueException e) {
			e.printStackTrace();
		}
		DmoExtGWTTreeNode existing = objMap.get(nameKey);
		
		if (existing != null){
			objMap.remove(nameKey);
			
			super.remove(existing);
		}
	}
	
	/**
	 * Returns the object with the specified FQN if it exists.
	 * @param fqn
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public DmoExtGWTTreeNode get(String fqn){
		try {
			nameKey.setNameString(fqn);
		} catch (DmcValueException e) {
			e.printStackTrace();
		}
		return(objMap.get(nameKey));
	}
}
