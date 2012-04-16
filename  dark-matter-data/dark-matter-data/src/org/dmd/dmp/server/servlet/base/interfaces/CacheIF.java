package org.dmd.dmp.server.servlet.base.interfaces;

import java.io.PrintStream;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.CreateResponse;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.DeleteResponse;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.extended.SetResponse;
import org.dmd.dms.ClassDefinition;
import org.dmd.dmw.DmwNamedObjectWrapper;
import org.dmd.util.exceptions.ResultException;

/**
 * The CacheIF defines an entity that manages a collection of named Dark Matter Objects.
 * The cache provides notification of creates, deletes and modifications associated
 * with the objects it manages. Generally speaking, a cache implementation will
 * be run in a separate thread and change requests will be queued for servicing in
 * the order in which they arrive.
 * <P>
 * The interface methods are broken down into the following areas:
 * <ul>
 * <li> Direct access methods: these methods are used internally by plugins to directly
 * manipulate the contents of the cache.
 * </li>
 * </ul>
 */
public interface CacheIF extends DmcNameResolverIF {
	
	/**
	 * This method is used to add a new object to the cache during the initialization
	 * phase of the plugins. The object is added to either flat name space or the hierarchic
	 * namespace, depending on whether the name is hierarchic or not.
	 * @param obj
	 */
	public void addObject(DmwNamedObjectWrapper obj) throws ResultException;
	
	///////////////////////////////////////////////////////////////////////////
	// Direct access methods
	
	public void create(DmwNamedObjectWrapper obj);
	
	public void createAndNotify(DmwNamedObjectWrapper obj);
	
	public void delete(DmwNamedObjectWrapper obj);
	
	public void deleteAndNotify(DmwNamedObjectWrapper obj);
	
	public void delete(DmcObjectName name);
	
	public void deleteAndNotify(DmcObjectName name);
	
	public void set(DmwNamedObjectWrapper obj);
	
	public void setAndNotify(DmwNamedObjectWrapper obj);
	
	////////////////////////////////////////////////////////////////////////////
	// Object retrieval and event registration
	
	public void get(GetRequest request, GetResponse response);
		
	///////////////////////////////////////////////////////////////////////////
	// Utility mechanisms
	
	/**
	 * Dumps all cached objects to the specified PrintStream.
	 */
	public void dumpObjects(PrintStream ps);
	
	/**
	 * Indexing is a generally useful mechanism that allows for rapid access to
	 * objects of a particular type. This method should be overloaded to add an
	 * index for the specified class. This mechanism should work for both concrete
	 * and abstract classes since it is easy to determine if a DMO is an instance
	 * of a particular base class using the DmcClassInfo.isInstanceOf() method.
	 * @param cd The class info of the class from the DMSAG
	 */
	public void maintainIndex(DmcClassInfo cd);
}
