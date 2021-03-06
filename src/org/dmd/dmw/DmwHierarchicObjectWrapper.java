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
package org.dmd.dmw;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcObject;
import org.dmd.dms.ClassDefinition;

/**
 * The DmwHierarchicObjectWrapper extends the named object wrapper to indicate that the
 * wrapped object is hierarchically named. This class also provides standardized mechanisms
 * for arranging the objects in a traversable hierarchy i.e. so that you can easily access
 * the named children of an object or an object's parent. This is especially handy when 
 * used in conjunction with a caching mechanism.
 */
abstract public class DmwHierarchicObjectWrapper extends DmwNamedObjectWrapper {

	private WeakReference<DmwHierarchicObjectWrapper> 									parentRef;
	private TreeMap<DmcHierarchicObjectName, WeakReference<DmwHierarchicObjectWrapper>> childRefs;
	
	protected DmwHierarchicObjectWrapper(){
		super();
		parentRef	= null;
		childRefs	= null;
	}
	
	protected DmwHierarchicObjectWrapper(DmcObject obj){
		super(obj);
		parentRef	= null;
		childRefs	= null;
	}
	
	protected DmwHierarchicObjectWrapper(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
		parentRef	= null;
		childRefs	= null;
	}
	
	public abstract DmcHierarchicObjectName getObjectName();
	
	/**
	 * @return The name of this component's parent or null if it has no parent.
	 */
	public DmcHierarchicObjectName getParentName(){
		return(getObjectName().getParentName());
	}
	
	/**
	 * @return The parent of this object or null if it hasn't been set.
	 */
	public DmwHierarchicObjectWrapper getParentComponent(){
		synchronized(this){
			if (parentRef == null)
				return(null);
			DmwHierarchicObjectWrapper parent = parentRef.get();
			if (parent == null)
				parentRef = null;
			return(parent);
		}
	}
	
	/**
	 * Sets the parent of this component.
	 * @param p The parent object.
	 * @return The previous parent if one had been set and null otherwise.
	 */
	protected DmwHierarchicObjectWrapper setParentComponent(DmwHierarchicObjectWrapper p){
		DmwHierarchicObjectWrapper current = getParentComponent();
		
		synchronized(this){
			parentRef = new WeakReference<DmwHierarchicObjectWrapper>(p);
		}
		
		return(current);
	}
	
	/**
	 * Adds a child to this node. 
	 * @param subcomp 
	 * @return If a child of the same name already existed, we return it; otherwise we return null.
	 */
	public DmwHierarchicObjectWrapper addSubComponent(DmwHierarchicObjectWrapper subcomp){
		WeakReference<DmwHierarchicObjectWrapper> existing = null;
		
		if (childRefs == null)
			childRefs = new TreeMap<DmcHierarchicObjectName, WeakReference<DmwHierarchicObjectWrapper>>();
		
		existing = childRefs.put(subcomp.getObjectName(), new WeakReference<DmwHierarchicObjectWrapper>(subcomp));
		
		if (existing == null)
			return(null);
		
		return(existing.get());
	}
	
	/**
	 * Removes the specified subcomponent.
	 * @param subcomp the subcomponent to be removed.
	 */
	public void removeSubcomponent(DmwHierarchicObjectWrapper subcomp){
		if (childRefs == null)
			throw(new IllegalStateException("Tried to remove a subcomponent from an object with no subcomponents."));
		
		childRefs.remove(subcomp.getObjectName());
	}
	
	@SuppressWarnings("unchecked")
	public <E extends DmwHierarchicObjectWrapper> E getChild(DmcHierarchicObjectName name){
		synchronized(this){
			WeakReference<DmwHierarchicObjectWrapper> childRef = childRefs.get(name);
			if (childRef == null)
				return(null);
			DmwHierarchicObjectWrapper child = childRef.get();
			if (child == null){
				childRefs.remove(name);
				return(null);
			}
			return (E) (child);
		}
	}
	
	/**
	 * @return The children of this component.
	 */
	public Collection<DmwHierarchicObjectWrapper> getSubComps(){
		
		synchronized(this){
			if (childRefs == null)
				return(Collections.emptyList());
			
			LinkedList<DmwHierarchicObjectWrapper> children = new LinkedList<DmwHierarchicObjectWrapper>();
			
			// Hold on to the keys of any non-existent elements so we can clean them up
			LinkedList<DmcHierarchicObjectName> deadKeys = new LinkedList<DmcHierarchicObjectName>();
			
			for(Entry<DmcHierarchicObjectName, WeakReference<DmwHierarchicObjectWrapper>> entry: childRefs.entrySet()){
				DmwHierarchicObjectWrapper child = entry.getValue().get();
				if (child == null)
					deadKeys.add(entry.getKey());
				else
					children.add(child);
			}
			for(DmcHierarchicObjectName deadKey: deadKeys)
				childRefs.remove(deadKey);
			
			return(children);
		}
		
	}

	
	/**
	 * @param <E> The type of the children.
	 * @param clazz the class of the children required.
	 * @return the children of the specified class.
	 */
	@SuppressWarnings("unchecked")
	public <E extends DmwHierarchicObjectWrapper> Collection<E> getSubComps(Class<E> clazz){
		LinkedList<E> children = new LinkedList<E>();
		
		synchronized(this){
			if (childRefs == null)
				return(children);
			
			// Hold on to the keys of any non-existent elements so we can clean them up
			LinkedList<DmcHierarchicObjectName> deadKeys = new LinkedList<DmcHierarchicObjectName>();
			
			for(Entry<DmcHierarchicObjectName, WeakReference<DmwHierarchicObjectWrapper>> entry: childRefs.entrySet()){
				DmwHierarchicObjectWrapper child = entry.getValue().get();
				if (child == null)
					deadKeys.add(entry.getKey());
				else if (child.getClass().equals(clazz))
					children.add((E) child);
			}
			for(DmcHierarchicObjectName deadKey: deadKeys)
				childRefs.remove(deadKey);
		}
		
		return(children);
	}
	
}
