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
package org.dmd.dmp.server.servlet.base.interfaces;

import java.io.PrintStream;
import java.util.Iterator;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.CreateResponse;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.DeleteResponse;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.extended.SetResponse;
import org.dmd.dmp.server.servlet.base.DmpCacheRegistration;
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
	 * If you are going to perform operations against a cache, you will need a 
	 * unique registration against that cache.
	 * @return a registration against the cache.
	 */
	public DmpCacheRegistration register();
	
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
	// Asynchronous operation processing
	
	/**
	 * Queues a SetRequest for processing in the order in which it arrived.
	 * @param request the request to be processed
	 */
	public void queueSetRequest(SetRequest request);
	
	/**
	 * Queues a CreateRequest for processing in the order in which it arrived.
	 * @param request the request to be processed
	 */
	public void queueCreateRequest(CreateRequest request);
	
	/**
	 * Queues a DeleteRequest for processing in the order in which it arrived.
	 * @param request the request to be processed
	 */
	public void queueDeleteRequest(DeleteRequest request);
	
	/**
	 * Queues an event from a remote source for processing by the cache. This is
	 * required in cases where the web server is acting has a front for one or more
	 * other data sources.
	 * @param request the request to be processed
	 */
	public void queueEvent(DMPEvent event);
	
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
	
	public int getIndexSize(DmcClassInfo ci);
	
	public Iterator<DmwNamedObjectWrapper> getIndex(DmcClassInfo ci);
}
