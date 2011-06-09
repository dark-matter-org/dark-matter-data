package org.dmd.dmp.server.servlet.base.plugins;

import java.io.PrintStream;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.CreateResponse;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.DeleteResponse;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.extended.SetResponse;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;
import org.dmd.dmp.server.servlet.base.interfaces.DmpRequestProcessorIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwHierarchicObjectWrapper;
import org.dmd.dmw.DmwNamedObjectWrapper;
import org.dmd.util.exceptions.ResultException;

public class BasicCachePlugin extends DmpServletPlugin implements CacheIF, Runnable {
	
	// Convenience handle to the schema as loaded by the plugin manager
	SchemaManager									schema;
	
	// Our cache of objects
	TreeMap<DmcObjectName,DmwNamedObjectWrapper>	theCache;
	
    private LinkedBlockingQueue<Object>				inputQueue = new LinkedBlockingQueue<Object>();

    public BasicCachePlugin(){
		super();
	}
	
	@Override
	protected void init() throws ResultException {
		schema	= pluginManager.getSchema();
		theCache	= new TreeMap<DmcObjectName, DmwNamedObjectWrapper>();
		
		
		// Bind the handlers for Set, Create and Delete Requests
		RequestTrackerIF	rt = pluginManager.getRequestTracker();
		
		rt.bindRequestProcessor(SetRequest.class, new DmpRequestProcessorIF() {
			
			public void processRequest(Request request) {
				queueSetRequest((SetRequest) request);
			}
			
			public boolean acceptRequest(Request request) {
				return true;
			}
		}
		);
		
		rt.bindRequestProcessor(CreateRequest.class, new DmpRequestProcessorIF() {
			
			public void processRequest(Request request) {
				queueCreateRequest((CreateRequest) request);
			}
			
			public boolean acceptRequest(Request request) {
				return true;
			}
		}
		);
		
		rt.bindRequestProcessor(DeleteRequest.class, new DmpRequestProcessorIF() {
			
			public void processRequest(Request request) {
				queueDeleteRequest((DeleteRequest) request);
			}
			
			public boolean acceptRequest(Request request) {
				return true;
			}
		}
		);
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// Runnable implementation
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	///////////////////////////////////////////////////////////////////////////
	// CacheIF implementation

	@Override
	public void addObject(DmwNamedObjectWrapper obj) throws ResultException {
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
	}

	@Override
	public void dumpObjects(PrintStream ps) {
		for(DmwNamedObjectWrapper obj: theCache.values()){
			ps.println(obj.toOIF());
		}
		
	}
	
	private void queueCreateRequest(CreateRequest request) {
		// TODO Auto-generated method stub
		
	}

	private void queueDeleteRequest(DeleteRequest request) {
		// TODO Auto-generated method stub
		
	}

	private void queueSetRequest(SetRequest request) {
		// TODO Auto-generated method stub
		
	}


	
	///////////////////////////////////////////////////////////////////////////
	// DmcNameResolverIF
	
	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		DmwNamedObjectWrapper obj = theCache.get(name);
		if (obj == null)
			return(null);
		return(obj.getDmcObject());
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		return(theCache.get(name));
	}

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
	public void get(GetRequest request, GetResponse response) {
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

	
}
