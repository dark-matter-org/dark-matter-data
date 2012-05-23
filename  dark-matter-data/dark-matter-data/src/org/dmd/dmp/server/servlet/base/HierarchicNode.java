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
package org.dmd.dmp.server.servlet.base;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcObject;

/**
 * The HierarachicNode class is used to hold Dark Matter Object's that
 * are named by hierarchic names in their appropriate parent/child relationships.
 */
public class HierarchicNode {
	
	// The parent of this node, or null if this is a top level node
	HierarchicNode				parent;
	
	// The object associated with this node.
	DmcHierarchicObjectName		name;
	DmcObject					object;
	
	TreeMap<DmcHierarchicObjectName,HierarchicNode> children;

	public HierarchicNode(DmcHierarchicObjectName n, DmcObject obj){
		parent		= null;
		name		= n;
		object 		= obj;
		children	= null;
	}
	
	public HierarchicNode(DmcHierarchicObjectName n, DmcObject obj, HierarchicNode p){
		parent		= p;
		name		= n;
		object 		= obj;
		children	= null;
	}
	
	public HierarchicNode addChild(DmcHierarchicObjectName name, DmcObject obj){
		HierarchicNode rc = new HierarchicNode(name, obj, this);
		if (children == null)
			children = new TreeMap<DmcHierarchicObjectName, HierarchicNode>();
		children.put(name, rc);
		return(rc);
	}
	
	public void deleteChild(DmcHierarchicObjectName name){
		children.remove(name);
	}
	
	@SuppressWarnings("unchecked")
	public Iterator<HierarchicNode> getChildren(){
		if (children == null)
			return( ((List<HierarchicNode>) Collections.EMPTY_LIST).iterator() );
		TreeMap<DmcHierarchicObjectName,HierarchicNode> clone = new TreeMap<DmcHierarchicObjectName,HierarchicNode>(children);
		return(clone.values().iterator());
	}
}
