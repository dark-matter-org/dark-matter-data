package org.dmd.dmw;

import java.util.Iterator;

import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;

/**
 * The DmcContainerIterator provides common functionality for casting the values
 * returned from a collection of DMOs references to the type of the wrapper
 * class that contains them. At the DMO level, multi-valued object references
 * are references to DMOs. However, if a DMO is wrapped, it will have accessed to 
 * the object that wraps it via its getContainer() method. This class makes use
 * of that method to accessed the Dark Matter Wrapper instance that wraps the DMO
 * and passes it back, cast to the correct wrapper type.
 * <P>
 * As a note, this mechanism COULD NOT BE USED with objects in a GWT environment
 * since the java.util.Iterable interface is NOT SUPPORTED by the JRE emulation
 * mechanisms. That's why this class is here and not in org.dmd.dmc.
 * @param <CAST> The type of the container that wraps the DMOs in multi-valued attribute
 * @param <DMO>  The type of the Dark Matter Object stored in the attribute.
 */
public class DmwContainerIterator<CAST,REF extends DmcNamedObjectREF<?>> implements Iterable<CAST>, Iterator<CAST> {
	
	Iterator<REF> it;
	
	// Empty list constructor
	protected DmwContainerIterator(){
		it = null;
	}
	
	protected DmwContainerIterator(Iterator<REF> i){
		it = i;
	}
	
	public boolean hasNext(){
		if (it == null)
			return(false);
		
		return(it.hasNext());
	}

	@SuppressWarnings("unchecked")
	public CAST getNext(){
		if (it == null)
			throw(new IllegalStateException("Trying to getNext() on an empty DmcContainerIterator"));
		
		REF ref = it.next();
		DmcObject obj = (DmcObject) ref.getObject();
		return((CAST) obj.getContainer());
	}

	@Override
	public Iterator<CAST> iterator() {
		return(this);
	}

	@Override
	public CAST next() {
		return(getNext());
	}

	@Override
	public void remove() {
		throw(new IllegalStateException("Cannot remove from a DmcContainerIterator."));
	}

}
