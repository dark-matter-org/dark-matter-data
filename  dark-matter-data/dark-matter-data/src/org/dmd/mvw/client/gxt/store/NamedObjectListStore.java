package org.dmd.mvw.client.gxt.store;

import java.util.HashMap;

import org.dmd.dmc.DmcObjectName;
import org.dmd.mvw.client.gxt.dmw.GxtNamedObjectWrapper;

import com.extjs.gxt.ui.client.store.ListStore;

/**
 * The NamedObjectListStore extends the basic GXT ListStore by providing keyed removal
 * of objects from the store based on the object name.
 */
public class NamedObjectListStore extends ListStore<GxtNamedObjectWrapper>{

	HashMap<DmcObjectName,GxtNamedObjectWrapper>	objmap;
	
	/**
	 * Constructs a new NamedObjectListStore.
	 */
	public NamedObjectListStore(){
		objmap = new HashMap<DmcObjectName, GxtNamedObjectWrapper>();
	}
	
	/**
	 * Adds the specified object to the store. If an object with the same key had already
	 * existed, it is removed.
	 */
	@Override
	public void add(GxtNamedObjectWrapper obj){
		GxtNamedObjectWrapper existing = objmap.get(obj.getObjectName());
		
		if (existing != null){
			objmap.remove(existing.getObjectName());
			super.remove(existing);
		}
		
		objmap.put(obj.getObjectName(), obj);
		super.add(obj);
	}
	
	/**
	 * Deletes the object with the specified name.
	 * @param key
	 */
	public void delete(DmcObjectName key){
		GxtNamedObjectWrapper existing = objmap.get(key);
		
		if (existing != null){
			objmap.remove(existing.getObjectName());
			super.remove(existing);
		}
		
	}
}
