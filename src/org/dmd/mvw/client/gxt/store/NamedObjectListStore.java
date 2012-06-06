package org.dmd.mvw.client.gxt.store;

import java.util.HashMap;

import org.dmd.dmc.DmcObjectName;
import org.dmd.mvw.client.gxt.dmw.GxtNamedObjectWrapper;

import com.extjs.gxt.ui.client.store.ListStore;

/**
 * The NamedObjectListStore extends the basic GXT ListStore by providing keyed removal
 * of objects from the store based on the DmcObjectName.
 */
public class NamedObjectListStore<E extends GxtNamedObjectWrapper> extends ListStore<E>{

	HashMap<DmcObjectName,E>	objmap;
	
	/**
	 * Constructs a new NamedObjectListStore.
	 */
	public NamedObjectListStore(){
		objmap = new HashMap<DmcObjectName, E>();
	}
	
	/**
	 * Adds the specified object to the store. If an object with the same key had already
	 * existed, it is removed.
	 */
	@Override
	public void add(E obj){
		E existing = objmap.get(obj.getObjectName());
		
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
		E existing = objmap.get(key);
		
		if (existing != null){
			objmap.remove(existing.getObjectName());
			super.remove(existing);
		}
		
	}
}
