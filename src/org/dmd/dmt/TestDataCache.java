package org.dmd.dmt;

import java.util.HashMap;

import org.dmd.dmc.DmcCacheIF;
import org.dmd.dmc.DmcContainerIF;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;

public class TestDataCache implements DmcNameResolverIF, DmcCacheIF {
	
	HashMap<DmcObjectName,DmcNamedObjectIF>	data;
	
	public TestDataCache(){
		data = new HashMap<DmcObjectName, DmcNamedObjectIF>();
		
	}
	
	public void add(DmcNamedObjectIF obj){
		data.put(obj.getObjectName(), obj);
	}
	
	@SuppressWarnings("unlikely-arg-type")
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
	public DmcObject findNamedDMO(DmcObjectName name){
		DmcNamedObjectIF obj = data.get(name);
		if (obj == null)
			return(null);
		
		if (obj instanceof DmcObject)
			return (DmcObject) (obj);
		
		return(((DmcContainerIF)obj).getDmcObject());
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		DmcNamedObjectIF obj = data.get(name);
		if (obj == null)
			return(null);
		return (obj);
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
		return(findNamedObject(name));
	}

	// DmcCacheIF
	
	@Override
	public void applyModification(DmcNamedObjectIF referringObject, DmcTypeModifier mods) throws DmcValueExceptionSet, DmcValueException {
		System.out.println("TestDataCache.applyModification() ");
		DmcObject target = (DmcObject) referringObject;
		
		SetRequestDMO request = new SetRequestDMO();
		request.setTarget(referringObject.getObjectName());
		request.add(mods.getAttributeInfo(), mods);
		
		System.out.println(request.toOIF());
		
		System.out.println("Before:\n" + target.toOIF(15) + "\n");
		
		target.applyModifier(mods);
		
		System.out.println("After:\n" + target.toOIF(15) + "\n");
		
	}

}
