package org.dmd.dmc;

import java.util.HashSet;
import java.util.Iterator;

/**
 * The DmcSliceInfo class provides a common base for generated information
 * about the attributes that form a "slice" of an object. Derivatives of this
 * class are generated from SliceDefinitions defined in a schema.
 */
public class DmcSliceInfo {

	String name;
	
	HashSet<Integer>	attrIDs;
	
	/**
	 * Constructs a new DmcSliceInfo.
	 * @param n the unique name of the slice.
	 */
	public DmcSliceInfo(String n){
		attrIDs = new HashSet<Integer>();
		name = n;
	}
	
	Iterator<Integer> getIDs(){
		return(attrIDs.iterator());
	}
	
	public String getName(){
		return(name);
	}
	
	/**
	 * Adds an ID to the slice.
	 * @param id the id to add.
	 */
	public void addAttributeID(int id){
		attrIDs.add(id);
	}
	
	/**
	 * @param id the id to check
	 * @return true if the id is in the slice.
	 */
	public boolean contains(int id){
		return(attrIDs.contains(id));
	}
}
