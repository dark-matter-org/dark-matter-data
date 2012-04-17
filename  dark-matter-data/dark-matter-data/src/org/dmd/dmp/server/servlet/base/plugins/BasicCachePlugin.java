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
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.extended.CreateRequest;
import org.dmd.dmp.server.extended.DeleteRequest;
import org.dmd.dmp.server.extended.GetRequest;
import org.dmd.dmp.server.extended.GetResponse;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.SetRequest;
import org.dmd.dmp.server.servlet.base.DmpCacheRegistration;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;
import org.dmd.dmp.server.servlet.base.interfaces.DmpRequestProcessorIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwHierarchicObjectWrapper;
import org.dmd.dmw.DmwNamedObjectIndexer;
import org.dmd.dmw.DmwNamedObjectWrapper;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;

public class BasicCachePlugin extends DmpServletPlugin implements CacheIF, Runnable, DmcUncheckedOIFHandlerIF {
	
	static String PERSISTENCE_FILE = "persistedObjects.oif";
	
	// Convenience handle to the schema as loaded by the plugin manager
	SchemaManager									schema;
	
	// Our cache of objects
	TreeMap<DmcObjectName,DmwNamedObjectWrapper>	theCache;
	
	// The indexer maintains indices of objects on the basis of class type.
    private DmwNamedObjectIndexer					indexer = new DmwNamedObjectIndexer();

    private LinkedBlockingQueue<Object>				inputQueue = new LinkedBlockingQueue<Object>();
    
    // Parser for our persisted objects
    private DmcUncheckedOIFParser					parser;
    
    // The factory used to create DMWs from objects read from file
    private DmwObjectFactory						factory;

    public BasicCachePlugin(){
		super();
	}
    
    @Override
    public void preInit() throws ResultException {

    }
	
	@Override
	protected void init() throws ResultException {
		schema		= pluginManager.getSchema();
		theCache	= new TreeMap<DmcObjectName, DmwNamedObjectWrapper>();
		inputQueue	= new LinkedBlockingQueue<Object>();
		
		parser		= new DmcUncheckedOIFParser(this);
		factory 	= new DmwObjectFactory(pluginManager.getSchema());
		
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
		
		loadPersistedObjects();    			
	}
	
	@Override
	public void start() throws ResultException, DmcValueException {
		
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
		// TODO Auto-generated method stub
		
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
	public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
		return(findNamedObject(name));
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

	@Override
	public void maintainIndex(DmcClassInfo ci) {
		indexer.maintainIndex(ci);
	}
	
	@Override
	public int getIndexSize(DmcClassInfo ci) {
		return(indexer.getIndexSize(ci));
	}

	@Override
	public Iterator<DmwNamedObjectWrapper> getIndex(DmcClassInfo ci) {
		return(indexer.getIndex(ci));
	}

	///////////////////////////////////////////////////////////////////////////

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
	public DmpCacheRegistration register() {
		return( new DmpCacheRegistration(this));
	}

}
