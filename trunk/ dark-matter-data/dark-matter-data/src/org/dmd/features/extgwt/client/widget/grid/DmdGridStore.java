package org.dmd.features.extgwt.client.widget.grid;

import java.util.TreeMap;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dms.generated.dmo.DmwWrapperDMO;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;

import com.extjs.gxt.ui.client.store.ListStore;

/**
 * The DmdGridStore provides the backing store for a DmdGrid. The objects stored are
 * generated wrapper objects derived from DmoExtGWTWrapperBase and should implement
 * the DmcNamedObjectIF interface. This allows for easy deletion of named objects
 * from the store. 
 * @author peter
 *
 */
public class DmdGridStore extends ListStore<DmoExtGWTWrapperBase<DmwWrapperDMO>> {

	TreeMap<String, DmoExtGWTWrapperBase<DmwWrapperDMO>> objMap;

	public DmdGridStore(){
		objMap = new TreeMap<String, DmoExtGWTWrapperBase<DmwWrapperDMO>>();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void add(DmoExtGWTWrapperBase obj){
		
		if (obj instanceof DmcNamedObjectIF){
			objMap.put(((DmcNamedObjectIF)obj).getObjectName(), obj);
		}

		super.add(obj);
	}
	
	/**
	 * Deletes the named object if it exists.
	 * @param objName
	 */
	public void delete(String objName){
		DmoExtGWTWrapperBase<DmwWrapperDMO> obj  = objMap.get(objName);
		
		if (obj != null){
			objMap.remove(objName);
			super.remove(obj);
		}
	}
	
	/**
	 * Returns the named object if it exists.
	 * @param objName
	 * @return
	 */
	public DmoExtGWTWrapperBase<DmwWrapperDMO> get(String objName){
		return(objMap.get(objName));
	}
}
