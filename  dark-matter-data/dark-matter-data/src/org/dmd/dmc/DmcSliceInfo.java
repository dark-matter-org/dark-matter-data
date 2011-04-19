package org.dmd.dmc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The DmcSliceInfo class provides a common base for generated information
 * about the attributes that form a "slice" of an object. Derivatives of this
 * class are generated from SliceDefinitions defined in a schema.
 */
public class DmcSliceInfo {

	String name;
	
	ArrayList<Integer>	attrIDs;
	
	protected DmcSliceInfo(){
		
	}
	
	Iterator<Integer> getIDs(){
		return(attrIDs.iterator());
	}
	
	public String getName(){
		return(name);
	}
}
