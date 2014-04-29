package org.dmd.core;

import java.io.Serializable;

import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

/**
 * The DmcFilter provides a common base class for the implementation of code that can
 * determine whether or not a particular Dark Matter Object meets a set of criteria.
 * Due to the fact that there are so many different ways to specify filters or matching
 * criteria or queries, the interface to a filter is very simplistic at this level.
 * However, having a common filter interface means that cache implementations don't
 * have to understand the internal workings of the filter.
 */
@SuppressWarnings("serial")
abstract public class DmcFilter implements Serializable {

	public DmcFilter(){
		
	}
	
	/**
	 * Applies the filter logic to the object.
	 * @param obj The object to be tested.
	 * @return true if the object matches the criteria
	 */
	abstract public boolean objectMatches(DmcObject obj);
	
	/**
	 * Regardless of how you implement your filtering mechanisms, you must be able to represent
	 * the filter as a String and parse it from that String. This method forces you to implement
	 * a string format.
	 * @return the String form of the filter.
	 */
	abstract public String getFilterString();
	
	/**
	 * @return a clone of the DmcFilter derivative.
	 */
	abstract public DmcFilter cloneIt();
	
	/**
	 * @return just the name of the name class e.g. ClassFilter, AttributeFilter etc.
	 */
	abstract public String getFilterClass();

	/**
     * The filter values must be individually serializable.
     * @param dos The output stream.
     * @throws Exception
     */
	abstract public void serializeIt(DmcOutputStreamIF dos) throws Exception;
	
    /**
     * Likewise, they must also be individually deserializable.
     * @param dis The input stream.
     * @throws Exception
     */
	abstract public void deserializeIt(DmcInputStreamIF dis) throws Exception;
	
	/**
	 * Return the filter as a String.
	 */
	public String toString(){
		return(getFilterString());
	}
}
