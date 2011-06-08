package org.dmd.dmp.server.servlet.base.plugins;

import java.io.PrintStream;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcNamedObjectIF;
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
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.HierarchicNode;
import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwHierarchicObjectWrapper;
import org.dmd.dmw.DmwNamedObjectWrapper;
import org.dmd.util.exceptions.ResultException;

public class BasicCachePlugin extends DmpServletPlugin implements CacheIF {
	
	SchemaManager									schema;
	
	TreeMap<DmcObjectName,DmwNamedObjectWrapper>	objects;
	
	public BasicCachePlugin(){
		super();
	}
	
	@Override
	protected void init() throws ResultException {
		schema	= getPluginManager().getSchema();
		objects	= new TreeMap<DmcObjectName, DmwNamedObjectWrapper>();
	}

	@Override
	public void addObject(DmwNamedObjectWrapper obj) throws ResultException {
		DmwNamedObjectWrapper existing = objects.get(obj.getObjectName());
		
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
				DmwHierarchicObjectWrapper po = (DmwHierarchicObjectWrapper) objects.get(pn);
				
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
		objects.put(obj.getObjectName(), obj);
	}

	@Override
	public void dumpObjects(PrintStream ps) {
		for(DmwNamedObjectWrapper obj: objects.values()){
			ps.println(obj.toOIF());
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// DmcNameResolverIF
	
	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		DmwNamedObjectWrapper obj = objects.get(name);
		if (obj == null)
			return(null);
		return(obj.getDmcObject());
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		return(objects.get(name));
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
	public void queueCreateRequest(CreateRequest request,
			CreateResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void queueDeleteRequest(DeleteRequest request,
			DeleteResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void queueSetRequest(SetRequest request, SetResponse response) {
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
