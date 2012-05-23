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
package org.dmd.dmp.server.servlet.base.plugins;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.NameContainer;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.CreateResponse;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.extended.DMPMessage;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.DeleteResponse;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.extended.SetResponse;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.base.cache.CacheIndexListener;
import org.dmd.dmp.server.servlet.base.cache.CacheListener;
import org.dmd.dmp.server.servlet.base.cache.CacheListenerManager;
import org.dmd.dmp.server.servlet.base.cache.CacheRegistration;
import org.dmd.dmp.server.servlet.base.cache.NameGeneratorIF;
import org.dmd.dmp.server.servlet.base.interfaces.DmpRequestProcessorIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dmw.DmwHierarchicObjectWrapper;
import org.dmd.dmw.DmwNamedObjectIndexer;
import org.dmd.dmw.DmwNamedObjectWrapper;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The BasicCachePlugin provides the implementation of a cache of objects that are
 * the focus of your data management application. The design of a cache is often quite
 * application specific, so the way that this cache works may not be suitable to your
 * needs; it is merely an example of how such a cache could work.
 * <p/>
 * The cache supports the basic CRUDE mechanism (not just CRUD - see the Dark Matter Data
 * Overview page - http://code.google.com/p/dark-matter-data/wiki/DMDOverview). The 'E'
 * stands for events.
 */
public class BasicCachePlugin extends DmpServletPlugin implements CacheIF, Runnable, DmcUncheckedOIFHandlerIF {
	
	static String PERSISTENCE_FILE = "persistedObjects.oif";
	
	// Unique identifiers for CacheListeners
    private long                             		nextListenerId = 1;

//    // Convenience handle to the schema as loaded by the plugin manager
//	SchemaManager									schema;
	
	// Our cache of objects
	TreeMap<DmcObjectName,DmwNamedObjectWrapper>	theCache;
	
	// The indexer maintains indices of objects on the basis of class type.
    private DmwNamedObjectIndexer					indexer = new DmwNamedObjectIndexer();

    private LinkedBlockingQueue<DMPMessage>			inputQueue;
    
    // Parser for our persisted objects
    private DmcUncheckedOIFParser					parser;
    
    // The factory used to create DMWs from objects read from file
    private DmwObjectFactory						factory;
    
    private RequestTrackerIF						requestTracker;
    
    private CacheListenerManager					listenerManager = new CacheListenerManager();
    
    private HashMap<DmcClassInfo,NameGeneratorIF>	nameGenerators = new HashMap<DmcClassInfo, NameGeneratorIF>();
    
    // A place to dump logs
    private Logger									logger = LoggerFactory.getLogger(getClass());
    
    // The thread in which we process Set, Create and Delete requests
    Thread											ourThread;

    public BasicCachePlugin(){
		super();
	}
    
    @Override
    public void preInit() throws ResultException {
    	DmcOmni.instance().backRefTracking(true);
    }
	
	@Override
	protected void init() throws ResultException {
//		schema		= pluginManager.getSchema();
		theCache	= new TreeMap<DmcObjectName, DmwNamedObjectWrapper>();
		inputQueue	= new LinkedBlockingQueue<DMPMessage>();
		
		parser		= new DmcUncheckedOIFParser(this);
//		factory 	= new DmwObjectFactory(pluginManager.getSchema());
		factory 	= new DmwObjectFactory(DmwOmni.instance().getSchema());
		
		// Bind the handlers for Set, Create and Delete Requests
		requestTracker = pluginManager.getRequestTracker();
		
		requestTracker.bindRequestProcessor(SetRequest.class, new DmpRequestProcessorIF() {
			
			public void processRequest(Request request) {
				queueSetRequest((SetRequest) request);
			}
			
			public boolean acceptRequest(Request request) {
				return true;
			}
		}
		);
		
		requestTracker.bindRequestProcessor(CreateRequest.class, new DmpRequestProcessorIF() {
			
			public void processRequest(Request request) {
				queueCreateRequest((CreateRequest) request);
			}
			
			public boolean acceptRequest(Request request) {
				return true;
			}
		}
		);
		
		requestTracker.bindRequestProcessor(DeleteRequest.class, new DmpRequestProcessorIF() {
			
			public void processRequest(Request request) {
				queueDeleteRequest((DeleteRequest) request);
			}
			
			public boolean acceptRequest(Request request) {
				return true;
			}
		}
		);
		
		loadPersistedObjects();    			
	}
	
	@Override
	public void start() throws ResultException, DmcValueException {
		ourThread = new Thread(this);
		ourThread.start();
	}
	
	@Override
	public void shutdown(){
		ourThread.interrupt();
	}
	
	void loadPersistedObjects() throws ResultException {
		File persisted = new File(PERSISTENCE_FILE);
		
		try {
			if (persisted.exists()){
				parser.parseFile(PERSISTENCE_FILE);
			}
			else{
				persisted.createNewFile();
			}
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// Runnable implementation
	
	@Override
	public void run() {
		
		while(true){
			DMPMessage message = null;
			try {
				// Grab the next message to be processed
				message = inputQueue.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (message instanceof SetRequest){
				processSetRequest((SetRequest) message);
			}
			else if (message instanceof CreateRequest){
				processCreateRequest((CreateRequest) message);
			}
			else if (message instanceof DeleteRequest){
				processDeleteRequest((DeleteRequest) message);
			}
			else if (message instanceof DMPEvent){
				// For now we're not handling events from other sources, but, in
				// the case where our web application is fronting another data
				// source or application, we may have to update our view of the
				// data with these events
				logger.error("We aren't handling foreign events for processing.\n\n" + ((DMPEvent)message).toOIF());
			}
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// OBJECT MODIFICATION HANDLING
	
	private void processSetRequest(SetRequest request){
		SetResponse response = null;
		DMPEvent event = null;
		
		if (request.isTrackingEnabled())
			logger.trace("Processing set request for: " + request.getTarget().getKeyAsString());
		
		DmwNamedObjectWrapper wrapper = theCache.get(request.getTarget().getName());
		
		if (wrapper == null){
			response = (SetResponse) request.getErrorResponse();
			response.setResponseText("Could not find object to modify: " + request.getTarget().getKeyAsString());
		}
		else{
			// TODO: validation
			
			try {
				// If anything changed in the object, applyModifier() returns true
				// and we create an event to report the changes
				if (wrapper.applyModifier(request.getModifyAttribute()))
					event = createModifyEvent(request,wrapper);
					
				response = request.getResponse();
				response.setLastResponse(true);
			} catch (Exception e) {
				response = (SetResponse) request.getErrorResponse();
				response.setResponseText("Modification failed for object: " + request.getTarget().getKeyAsString() + "\n" + e.toString());
				logger.error("Modification failed for object: " + request.getTarget().getKeyAsString() + "\n" + e.toString());
			}
			
		}
		
		// Fire back the response
		requestTracker.processResponse(response);

		if (event != null)
			forwardEvent(event);
	}
	
	///////////////////////////////////////////////////////////////////////////
	// OBJECT CREATION HANDLING
	
	private void processCreateRequest(CreateRequest request){
		CreateResponse 	response	= null;
		
		if (request.isTrackingEnabled())
			logger.trace("Processing create request for: " + request.getNewObject().getConstructionClassName());

		DmwNamedObjectWrapper wrapper = (DmwNamedObjectWrapper) request.getNewObjectWrapped();
		
		if (wrapper.getObjectName() == null){
			// The object doesn't have a name, we'll try to generate one for it
			synchronized (nameGenerators) {
				NameGeneratorIF ng = nameGenerators.get(wrapper.getConstructionClassInfo());
				if (ng == null){
					// Not good, we don't have a name generator, so we can't proceed
					response = (CreateResponse) request.getErrorResponse();
					response.setResponseText("No name generator was available for objects of type: " + wrapper.getConstructionClassName());
				}
				else{
					ng.createNameForObject(wrapper);
				}
			}
		}
		
		// We attempt to resolve references in the object, this includes its class
		// information and references to other objects
		try {
			wrapper.resolveReferences(this);
		} catch (DmcValueExceptionSet e) {
			response = (CreateResponse) request.getErrorResponse();
			response.setResponseText(e.toString());
		}
		
		// We add the object to the cache - if anything goes wrong, an error response will be returned
		response = addAndComplainIfNeeded(request, wrapper);
		
		if (response == null){
			// The response will have been instantiated if we have an error condition e.g. no name generator
			response = request.getResponse();
			response.addObjectList(wrapper.getDmcObject());
		}
		
		// Fire back the response
		requestTracker.processResponse(response);
		
		// Notify anyone who's interested
		sendEvent(DMPEventTypeEnum.CREATED, wrapper, request.getOriginatorID(), request.isTrackingEnabled(), request.isNotifyOriginator());
	}
	
	/**
	 * This method attempts to add the specified object to the cache. If all goes well,
	 * null is returned.
	 * @param request The request that makes this addition necessary.
	 * @param wrapper The newly created object.
	 * @return null if it worked and an error response if not.
	 */
	private CreateResponse addAndComplainIfNeeded(CreateRequest request, DmwNamedObjectWrapper wrapper){
		CreateResponse response = null;
		
		try {
			addObject(wrapper);
		} catch (ResultException e) {
			logger.error(e.toString());
			response = (CreateResponse) request.getErrorResponse();
			response.setResponseText(e.toString());
		}
		
		return(response);
	}
	
	///////////////////////////////////////////////////////////////////////////
	// OBJECT DELETION HANDLING
	
	private void processDeleteRequest(DeleteRequest request){
		LinkedList<DMPEvent> events = new LinkedList<DMPEvent>();
		
		// TODO: add code to handle tree deletion
		
		StringBuffer errors = null;
		for(NameContainer container: request.getTargetsIterable()){
			DmwNamedObjectWrapper wrapper = _delete(container.getName());
			
			if (wrapper == null){
				if (errors == null){
					errors = new StringBuffer();
					errors.append(container.getName().getNameString());
				}
				else
					errors.append(", " + container.getName().getNameString());
			}
			else{
				events.add(createEvent(DMPEventTypeEnum.DELETED, wrapper, request.getOriginatorID(), request.isTrackingEnabled(), request.isNotifyOriginator()));
			}
		}
		
		DeleteResponse response = null;
		
		if (errors == null){
			response = request.getResponse();
		}
		else{
			logger.error("Could not delete: " + errors.toString());
			
			response = (DeleteResponse) request.getErrorResponse();
			response.setResponseText("Could not delete: " + errors.toString());
		}
		
		// Fire back the response
		requestTracker.processResponse(response);
		
		// Notify anyone who's interested
		for(DMPEvent event: events)
			forwardEvent(event);
	}
	
	private DmwNamedObjectWrapper _delete(DmcObjectName name){
		synchronized (theCache) {
			DmwNamedObjectWrapper wrapper = theCache.remove(name);
			
			if (wrapper != null){
				indexer.deleteFromIndices(wrapper);
				
				if (name instanceof DmcHierarchicObjectName){
					DmwHierarchicObjectWrapper hwrapper = (DmwHierarchicObjectWrapper) wrapper;
					if (hwrapper.getParentComponent() != null)
						hwrapper.getParentComponent().removeSubcomponent(hwrapper);
				}
				
				wrapper.youAreDeleted();
			}
			
			return(wrapper);
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	private DMPEvent createEvent(DMPEventTypeEnum type, DmwNamedObjectWrapper wrapper, Integer originatorID, boolean track, boolean notifyOriginator){
        DMPEvent event = new DMPEvent(type, wrapper);
        if (originatorID != null)
        	event.setOriginatorID(originatorID);
        event.setNotifyOriginator(notifyOriginator);
        event.setTrackingEnabled(track);
		return(event);
	}
	
	private DMPEvent createModifyEvent(SetRequest request, DmwNamedObjectWrapper wrapper){
        DMPEvent event = new DMPEvent(request);
        if (request.getOriginatorID() != null)
        	event.setOriginatorID(request.getOriginatorID());
        event.setNotifyOriginator(request.isNotifyOriginator());
        event.setTrackingEnabled(request.isTrackingEnabled());
        event.setSourceObjectClass(wrapper.getConstructionClass());
		return(event);
	}
	
	private void sendEvent(DMPEventTypeEnum type, DmwNamedObjectWrapper wrapper, Integer originatorID, boolean track, boolean notifyOriginator){
        DMPEvent event = new DMPEvent(type, wrapper);
        if (originatorID != null)
        	event.setOriginatorID(originatorID);
        event.setNotifyOriginator(notifyOriginator);
        event.setTrackingEnabled(track);
		forwardEvent(event);
	}
	
	/**
	 * We query the cache listener manager for the listeners who are interested
	 * in the specified event and forward the event to them. Whether or not the event
	 * is actually sent will depend on the nature of the listener involved and
	 * whether or not slicing has been requested.
	 * @param event the event that may be forwarded.
	 */
	private void forwardEvent(DMPEvent event){
		for(CacheListener listener: listenerManager.getInterestedListeners(event)){
			listener.processCacheEvent(event);
		}
	}

	///////////////////////////////////////////////////////////////////////////
	// CacheIF implementation

	@Override
	public void addObject(DmwNamedObjectWrapper obj) throws ResultException {
		synchronized (theCache) {
			
			DmwNamedObjectWrapper existing = theCache.get(obj.getObjectName());
			
			if (existing != null){
				ResultException ex = new ResultException();
				ex.addError("Duplicate object name: " + obj.getObjectName());
				ex.result.lastResult().moreMessages("Existing:\n" + existing.toOIF());
				ex.result.lastResult().moreMessages("New:\n" + obj.toOIF());
				throw(ex);
			}
			
			if (obj.getConstructionClass().getIsNamedBy().getType().getIsHierarchicName()){
				DmcHierarchicObjectName hon = ((DmwHierarchicObjectWrapper)obj).getObjectName();
				DmcHierarchicObjectName pn = hon.getParentName();
				
				if (pn != null){
					DmwHierarchicObjectWrapper po = (DmwHierarchicObjectWrapper) theCache.get(pn);
					
					if(po == null){
						ResultException ex = new ResultException();
						ex.addError("Could not find parent object: " + po + " for object: " + hon);
						throw(ex);
					}
					
					if (obj.getConstructionClass().allowsParent(po.getConstructionClass())){
						po.addSubComponent((DmwHierarchicObjectWrapper) obj);
					}
					else{
						ResultException ex = new ResultException();
						ex.addError("Object of class: " + po.getConstructionClassName() + " is not a valid parent for object of class: " + obj.getConstructionClassName());
						throw(ex);
					}
				}
				
			}
			theCache.put(obj.getObjectName(), obj);
		
			indexer.addToIndices(obj);
		}
		
	}

	@Override
	public void dumpObjects(PrintStream ps) {
		for(DmwNamedObjectWrapper obj: theCache.values()){
			ps.println(obj.toOIF());
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	@Override
	public DmwNamedObjectWrapper get(DmcObjectName name) {
		synchronized (theCache) {
			return(theCache.get(name));
		}
	}

	@Override
	public Collection<DmwHierarchicObjectWrapper> getNext(DmcHierarchicObjectName name) {
		synchronized (theCache) {
			DmwHierarchicObjectWrapper root = (DmwHierarchicObjectWrapper) theCache.get(name);
			
			if (root == null)
				return(null);
			
			return(root.getSubComps());
		}
	}

	@Override
	public Collection<DmwHierarchicObjectWrapper> getAll(DmcHierarchicObjectName name) {
		synchronized (theCache) {
//			DmwHierarchicObjectWrapper root = (DmwHierarchicObjectWrapper) theCache.get(name);
//			
//			if (root == null)
//				return(null);
//			
//			return(null);
			throw(new IllegalStateException("Not implemented yet"));
		}
	}

	///////////////////////////////////////////////////////////////////////////

	@Override
	public void create(DmwNamedObjectWrapper obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAndNotify(DmwNamedObjectWrapper obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DmwNamedObjectWrapper obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DmcObjectName name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAndNotify(DmwNamedObjectWrapper obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAndNotify(DmcObjectName name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(DmwNamedObjectWrapper obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAndNotify(DmwNamedObjectWrapper obj) {
		// TODO Auto-generated method stub
		
	}
	
	///////////////////////////////////////////////////////////////////////////

	@Override
	public void maintainIndex(DmcClassInfo ci) {
		indexer.maintainIndex(ci);
	}
	
	@Override
	public boolean hasIndex(DmcClassInfo dci) {
		return(indexer.hasIndex(dci));
	}

	@Override
	public int getIndexSize(DmcClassInfo ci) {
		return(indexer.getIndexSize(ci));
	}

	@Override
	public Collection<DmwNamedObjectWrapper> getIndex(DmcClassInfo ci) {
		return(indexer.getIndex(ci));
	}

	///////////////////////////////////////////////////////////////////////////
	// DmcUncheckedOIFHandlerIF implementation

	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		DmwNamedObjectWrapper wrapper = null;
		
		try {
			wrapper = (DmwNamedObjectWrapper) factory.createWrapper(uco);
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		}
		catch (ResultException ex){
			ex.setLocationInfo(infile, lineNumber);
			throw(ex);
		}
		catch(DmcValueException e){
			ResultException ex = new ResultException();
			ex.addError(e.getMessage());
			if (e.getAttributeName() != null)
				ex.result.lastResult().moreMessages("Attribute: " + e.getAttributeName());
			ex.setLocationInfo(infile, lineNumber);
			throw(ex);
		}
	
		addObject(wrapper);
	}

	@Override
	public CacheRegistration register() {
		return( new CacheRegistration(this));
	}

	///////////////////////////////////////////////////////////////////////////
	// DmcNameResolverIF implementation
	
	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		DmcObject rc = null;
		DmwNamedObjectWrapper wrapper = theCache.get(name);
		
		// If we can't find the object in the cache, fall back to the schema
		if (wrapper == null)
			rc = DmwOmni.instance().findNamedDMO(name);
		else
			rc = wrapper.getDmcObject();
		
		return(rc);
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		DmcNamedObjectIF rc = theCache.get(name);
		
		// If we can't find the object in the cache, fall back to the schema
		if (rc == null)
			rc = DmwOmni.instance().findNamedObject(name);
		
		return(rc);
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
		return(findNamedObject(name));
	}
	
	////////////////////////////////////////////////////////////////////////////
	// Asynchronous operation processing

	@Override
	public void queueSetRequest(SetRequest request) {
		addToQueue(request);
	}

	@Override
	public void queueCreateRequest(CreateRequest request) {
		addToQueue(request);
	}

	@Override
	public void queueDeleteRequest(DeleteRequest request) {
		addToQueue(request);
	}

	@Override
	public void queueEvent(DMPEvent event) {
		addToQueue(event);
	}

	/**
	 * We add the specified message to our input queue. In our run() nethod,
	 * we pull messages from the queue when they're available and process them.
	 * @param msg the message to be queued.
	 */
    private void addToQueue(DMPMessage msg) {
        try
        {
            inputQueue.put(msg);
        }
        catch (Exception e)
        {
            logger.error("Caught Exception", e);
        }
    }

	///////////////////////////////////////////////////////////////////////////
	// Listener implementation

    /**
     *  Returns the next unique listener ID.
     */
	@Override
	public long getNextListenerID() {
		return(nextListenerId++);
	}
	
	/**
	 * 
	 */
	@Override
	public Collection<DmwNamedObjectWrapper> addListener(CacheListener listener){
		listenerManager.addListener(listener);
		
		if (listener instanceof CacheIndexListener){
			CacheIndexListener cil = (CacheIndexListener) listener;
			return(indexer.getIndex(cil.getClassInfo()));
		}
		else{
			throw(new IllegalStateException("Unknown cache listener type: " + listener.getClass().getName()));
		}
	}

	/**
	 * 
	 */
	@Override
	public void removeListener(CacheListener listener) {
		listenerManager.removeListener(listener);
	}
	
	///////////////////////////////////////////////////////////////////////////
	// Name generator support

	@Override
	public void addNameGenerator(NameGeneratorIF ng) {
		if (nameGenerators.get(ng.usedForClass()) == null){
			nameGenerators.put(ng.usedForClass(), ng);
			return;
		}
		
		throw(new IllegalStateException("Multiple name generators registered for class: " + ng.usedForClass().name));
	}

}
