package org.dmd.dmc;

import java.util.Iterator;

/**
 * The DmcContainerIterator provides common functionality for casting the values
 * returned from a collection of DMOs references to the 
 * @param <CAST> The type of the container that wraps the DMOs in multi-valued attribute
 * @param <DMO>  The type of the Dark Matter Object stored in the attribute.
 */
public class DmcContainerIterator<CAST,DMO extends DmcObject> {
	
	Iterator<DMO> it;
	
	public DmcContainerIterator(Iterator<DMO> i){
		it = i;
	}
	
	public boolean hasNext(){
		return(it.hasNext());
	}

	@SuppressWarnings("unchecked")
	public CAST getNext(){
		DMO dmo = it.next();
		return((CAST) dmo.getContainer());
	}
	
}
