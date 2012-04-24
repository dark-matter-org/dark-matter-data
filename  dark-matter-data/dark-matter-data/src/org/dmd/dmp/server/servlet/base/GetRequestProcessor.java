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
package org.dmd.dmp.server.servlet.base;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmp.server.DmpPipeIF;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.DMPMessage;
import org.dmd.dmp.server.extended.DenotifyRequest;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.extended.Response;
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.base.cache.CacheIndexListener;
import org.dmd.dmp.server.servlet.base.cache.CacheListener;
import org.dmd.dmp.server.servlet.base.cache.CacheRegistration;
import org.dmd.dmp.server.servlet.base.interfaces.DmpEventHandlerIF;
import org.dmd.dms.ClassDefinition;
import org.dmd.dmw.DmwNamedObjectWrapper;
import org.dmd.dmw.DmwOmni;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The GetRequestProcessor is designed to asynchronously return a set of objects
 * from the cache in such a way that, if events are requested for the objects,
 * the client's view of the objects will always be in sync with the state of
 * the objects in the cache. 
 */
public class GetRequestProcessor implements DmpEventHandlerIF {
	
	// Our cache registration from our associated session
	private CacheRegistration				cacheRegistration;
	
	// Convenience handle to the cache
	private CacheIF							cache;
	
	// Handle to the pipe (session) via which responses/events are sent
	private WeakReference<DmpPipeIF> 		pipeRef;
	
	// The listeners that have been registered against the cache as a result
	// of specifying the registerForEvents attribute in a GetRequest. If the
	// client wishes to stop listening for events associated with a set of 
	// retrieved objects, they will send a DenotifyRequest with the listenerID
	// that was returned in the GetResponse for the object(s) in question.
	// Key: long - listenerID
	// Value: The cache listener
    private HashMap<Long, CacheListener>	listeners;
	
    private Logger                 			logger = LoggerFactory.getLogger(getClass());

    public GetRequestProcessor(DmpPipeIF pipe, CacheRegistration dcr){
		cacheRegistration 	= dcr;
		cache 				= cacheRegistration.getCache();
		pipeRef 			= new WeakReference<DmpPipeIF>(pipe);
		listeners			= new HashMap<Long, CacheListener>();
	}
	
	/**
	 * Processes a GetRequest. The two main forms of requests handled at present are
	 * requests for a particular object (the request has a target value) and requests
	 * for a set of objects of the same class i.e. an index of a particular class.
	 * <p/>
	 * The concept of object retrieval is also tied to event notification, or can be
	 * if you want to be notified of changes to the objects (or slices thereof) that
	 * you have requested. If the registerForEvents attribute is set to true, the client
	 * will be registered to receive event notifications of any subsequent changes to
	 * the objects that were retrieved.
	 * <p/>
	 * If the request doesn't conform to the allowed formats, an error response is sent.
	 * @param request the request to be processed.
	 */
	public void processRequest(GetRequest request){
		if (request.getTargetsHasValue()){
			
		}
		else if (request.getFilter() != null){
			processClassIndexRequest(request);
		}
		else{
			Response response = request.getErrorResponse();
			response.setResponseText("Unsupported form of GetRequest");
			response.setLastResponse(true);
			sendMessage(response);
		}
	}
	
	public void processRequest(DenotifyRequest request){
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// 
	
	/**
	 * We're handling requests of the form:
	 * <p/>
	 * <pre>
	 * GetRequest
	 * 
	 * </pre>
	 */
	private void processClassIndexRequest(GetRequest request){
		try {
			ClassDefinition cd = DmwOmni.instance().getSchema().cdef(request.getFilter());
			if (cd == null){
				// If we don't recognize the class, we can't proceed
				Response response = request.getErrorResponse();
				response.setResponseText("Unknown class: " + request.getFilter());
				response.setLastResponse(true);
				sendMessage(response);
				logger.error("Unknown class in GetRequest\n" + request.toOIF());
				return;
			}
			
			DmcClassInfo dci = cd.getConstructionClassInfo();

			logger.trace("Retrieving objects from class index: " + dci.name);

			synchronized(this){
            	// The set of objects we're sending back
            	Collection<DmwNamedObjectWrapper> objects = null;
            	
    			// Establish the blocking factor i.e. how many objects we'll send back
    			// in a single response. 
                Integer bf = request.getBlockingFactor();
                int blockingFactor = bf == null ? -1 : bf < 10 ? -1 : bf;
                
                // The response container
                GetResponse response = request.getResponse();
				
				if (request.isRegisterForEvents()){
					// The client wants events for the objects - we'll wind up adding a listener
					// to the cache of the appropriate type.
					CacheListener listener = null;
					
					if (request.getSliceInfo() == null){
						listener = new CacheIndexListener(cacheRegistration, this, dci);
						logger.trace("Registered cache index listener with ID: " + listener.getListenerID());
					}
					else{
						
					}
					listeners.put(listener.getListenerID(), listener);
					response.setListenerID(listener.getListenerID());
					objects = listener.activateAndRetrieve();
				}
				else{
					objects = cache.getIndex(dci);
				}
				
				for(DmwNamedObjectWrapper object: objects){
					response.addObjectList(object);
					if (response.getObjectListSize() == blockingFactor){
						response.setLastResponse(false);
						sendMessage(response);
						response = request.getResponse();
					}
				}
				sendMessage(response);
			}
				
		}
		catch(Exception ex){
			
		}
	}
	
    private void sendMessage(DMPMessage msg)
    {
    	synchronized(this){
	        DmpPipeIF pipe = pipeRef.get();
	        if (pipe == null) return;
	        pipe.sendMessage(msg);
    	}
    }

	///////////////////////////////////////////////////////////////////////////
	// DmpEventHandlerIF implementation

	@Override
	public void handleEvent(DMPEvent event) {
		sendMessage(event);
	}
	

}
