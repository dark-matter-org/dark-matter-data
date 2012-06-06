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
package org.dmd.features.extgwt.client;

import java.util.ArrayList;

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;


/**
 * The DmoExtGWTTreeNode extends the basic ExtGWTWrapperBase to provide access to fully qualified
 * names for objects. This supports creating hierarchies of object instances. Originally, the
 * class implemented the GXT TreeModel, but it turns out that GXT automatically wraps Model objects
 * with a TreeModel class when they're added to a TreeStore, so there was no need duplicate the functionality
 * here.
 * <P>
 * However, this class does provide a basic mechanism for creating a hierarchy of objects based on the FQN.
 */
public class DmoExtGWTTreeNode<DMO extends HierarchicObjectDMO> extends DmoExtGWTWrapperBase<DMO> {

	DmoExtGWTTreeNode<DMO>				parent;
	@SuppressWarnings("unchecked")
	ArrayList<DmoExtGWTTreeNode> 	children;
	
	protected DmoExtGWTTreeNode(){
//		children = new ArrayList<ModelData>();
	}
	
	protected DmoExtGWTTreeNode(HierarchicObjectDMO obj){
		super(obj);
//		children = new ArrayList<ModelData>();
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Convenience functions to access the core
	
	public DmcHierarchicObjectName getFQN(){
		return(core.getFQN());
	}

	public DmcHierarchicObjectName getParentFQN(){
		return(core.getFQN().getParentName());
	}

	@SuppressWarnings("unchecked")
	public void addChild(DmoExtGWTTreeNode c){
		if (children == null)
			children = new ArrayList<DmoExtGWTTreeNode>();
		
		children.add(c);
		c.parent = this;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<DmoExtGWTTreeNode> getChildren(){
		return(children);
	}

	@SuppressWarnings("unchecked")
	public void removeChild(DmoExtGWTTreeNode c){
		if (children.remove(c)){
			c.parent = null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public DmoExtGWTTreeNode getParentObject(){
		return(parent);
	}
	
	
}
