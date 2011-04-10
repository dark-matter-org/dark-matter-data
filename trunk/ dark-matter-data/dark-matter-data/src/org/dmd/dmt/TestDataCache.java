package org.dmd.dmt;

import java.util.HashMap;

import org.dmd.dmc.DmcCacheIF;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeModifier;

public class TestDataCache implements DmcNameResolverIF, DmcCacheIF {
	
	HashMap<DmcObjectNameIF,DmcNamedObjectIF>	data;
	
	public TestDataCache(){
		data = new HashMap<DmcObjectNameIF, DmcNamedObjectIF>();
		
	}
	
	public void add(DmcNamedObjectIF obj){
		data.put(obj.getObjectName(), obj);
	}
	
	public boolean delete(DmcObjectNameIF objname){
		DmcObject obj = (DmcObject) data.get(objname);
		
		if (obj == null)
			return(false);
		
		obj.youAreDeleted();
		
		data.remove(objname);
		
		return(true);
	}

	// DmcNameResolverIF
	
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

	// DmcCacheIF
	
	@Override
	public void applyModification(DmcNamedObjectIF referringObject, DmcTypeModifier mods) throws DmcValueExceptionSet, DmcValueException {
		System.out.println("TestDataCache.applyModification() ");
		DmcObject target = (DmcObject) referringObject;
		
		System.out.println("Before:\n" + target.toOIF(15) + "\n");
		
		target.applyModifier(mods);
		
		System.out.println("After:\n" + target.toOIF(15) + "\n");
		
	}

}
