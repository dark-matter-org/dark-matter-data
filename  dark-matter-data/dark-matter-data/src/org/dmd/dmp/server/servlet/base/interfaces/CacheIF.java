package org.dmd.dmp.server.servlet.base.interfaces;

import java.io.PrintStream;

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
import org.dmd.dmw.DmwNamedObjectWrapper;
import org.dmd.util.exceptions.ResultException;

/**
 * The CacheIF defines an entity that manages a collection of Dark Matter Objects.
 * The cache provides notification of creates, deletes and modifications associated
 * with the objects it manages. Generally speaking, a cache implementation will
 * be run in a separate thread and change requests will be queued for servicing in
 * the order in which they arrive. 
 */
public interface CacheIF extends DmcNameResolverIF {

//	/**
//	 * Handles a GetRequest from a client. 
//	 * @param request The GetRequest.
//	 * @return A GetResponse. If this is NOT the final response for this request, the
//	 * response should have its lastResponse flag set to false.
//	 */
//	public GetResponse get(GetRequest request);
//	
//	/**
//	 * Handles a SetRequest from a client. The cache should call fireModifiedEvent()
//	 * on its injected EventBusIF.
//	 * @param request The request.
//	 * @return a SetResponse indicating if the operation was successful or not.
//	 */
//	public SetResponse set(SetRequest request);
//	
//	/**
//	 * This interface is used by entities within the server that want to modify
//	 * an object. The object passed in MUST have a modifier associated with it e.g.
//	 * it is a modification recorder with a series of modifications in it. The cache
//	 * should call fireModifiedEvent() on its injected EventBusIF.
//	 * @param object
//	 * @return The modified object if all went well.
//	 */
//	public DmcObject set(DmcObject object) throws DmcValueExceptionSet;
//	
//	/**
//	 * Handles a CreateRequest from a client. The cache should call fireCreateEvent()
//	 * on its injected EventBusIF.
//	 * @param request the create request.
//	 * @return a CreateResponse indicating if the operation was successful or not.
//	 */
//	public CreateResponse create(CreateRequest request);
//	
//	/**
//	 * This interface is used by entities within the server that want to create
//	 * a new object. The cache should call fireCreateEvent() on its injected EventBusIF.
//	 * @param object the object to be created.
//	 * @return the newly created object. This may have had its name set by the cache.
//	 * @throws DmcValueExceptionSet
//	 */
//	public DmcObject create(DmcObject object) throws DmcValueExceptionSet;
//	
//	/**
//	 * Handles a DeleteRequest from a client. The cache should call fireDeleteEvent() on
//	 * its injected EventBusIF.
//	 * @param request the delete request.
//	 * @return a DeleteResponse indicating if the operation was sucessful or not.
//	 */
//	public DeleteResponse delete(DeleteRequest request);
//	
//	/**
//	 * This interface is used by entities within the server that want to delete
//	 * an object. The cache should call fireDeleteEvent() on its injected EventMnagerIF.
//	 * @param name the name of the object to be deleted.
//	 */
//	public void delete(DmcObjectName name);
	
	/**
	 * This method is used to add a new object to the cache during the initialization
	 * phase of the plugins. The object is added to either flat name space or the hierarchic
	 * namespace, depending on whether the name is hierarchic or not.
	 * @param obj
	 */
	public void addObject(DmwNamedObjectWrapper obj) throws ResultException;
	
	/**
	 * 
	 * @param request
	 */
	public void queueCreateRequest(CreateRequest request);
	
	public void queueDeleteRequest(DeleteRequest request);
	
	public void queueSetRequest(SetRequest request);
	
	public void dumpObjects(PrintStream ps);
}
