package org.dmd.dmc;

/**
 * The DmcFilter provides a common base class for the implementation of code that can
 * determine whether or not a particular Dark Matter Object meets a set of criteria.
 * Due to the fact that there are so many different ways to specify filters or matching
 * criteria or queries, the interface to a filter is very simplistic at this level.
 * However, having a common filter interface means that cache implementations don't
 * have to understand the internal workings of the filter.
 */
abstract public class DmcFilter {

	/**
	 * Applies the filter logic to the object.
	 * @param obj The object to be tested.
	 * @return true if the object matches the criteria
	 */
	abstract public boolean objectMatches(DmcObject obj);
	
}
