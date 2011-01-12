package org.dmd.features.extgwt.client.util;

import java.util.TreeMap;

import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;

/**
 * The HierarchicDataCache provides caching of objects that make use
 * of the DmoExtGWTTreeNode wrapper.
 */
public class HierarchicDataCache {

	@SuppressWarnings("unchecked")
	// Key: FQN
	TreeMap<String,DmoExtGWTTreeNode>	data;
	
	/**
	 * Constructs a new data cache.
	 */
	@SuppressWarnings("unchecked")
	public HierarchicDataCache(){
		data = new TreeMap<String, DmoExtGWTTreeNode>();
	}
	
	/**
	 * Returns the specified object if it's found.
	 * @param FQN the fully qualified name of the object.
	 * @return The hierarchic object.
	 */
	@SuppressWarnings("unchecked")
	public DmoExtGWTTreeNode find(String FQN){
		return(data.get(FQN));
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
