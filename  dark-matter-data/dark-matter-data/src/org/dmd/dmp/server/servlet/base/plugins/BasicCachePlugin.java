package org.dmd.dmp.server.servlet.base.plugins;

import java.util.TreeMap;

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
import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;

public class BasicCachePlugin extends DmpServletPlugin implements CacheIF {
	
	TreeMap<DmcObjectName,DmcObject>	cache;

	public BasicCachePlugin(){
		super();
		cache = new TreeMap<DmcObjectName, DmcObject>();
	}

	@Override
	public CreateResponse create(CreateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DmcObject create(DmcObject object) throws DmcValueExceptionSet {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeleteResponse delete(DeleteRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(DmcObjectName name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GetResponse get(GetRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetResponse set(SetRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DmcObject set(DmcObject object) throws DmcValueExceptionSet {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
