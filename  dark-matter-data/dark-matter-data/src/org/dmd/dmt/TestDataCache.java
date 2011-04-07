package org.dmd.dmt;

import java.util.HashMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectNameIF;

public class TestDataCache implements DmcNameResolverIF {
	
	HashMap<DmcObjectNameIF,DmcNamedObjectIF>	data;
	
	public TestDataCache(){
		data = new HashMap<DmcObjectNameIF, DmcNamedObjectIF>();
		
	}
	
	public void add(DmcNamedObjectIF obj){
		data.put(obj.getObjectName(), obj);
	}

	@Override
	public DmcObject findNamedDMO(DmcObjectNameIF name) {
		DmcNamedObjectIF obj = data.get(name);
		if (obj == null)
			return(null);
		return (DmcObject) (obj);
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectNameIF name) {
		DmcNamedObjectIF obj = data.get(name);
		if (obj == null)
			return(null);
		return (obj);
	}

}
