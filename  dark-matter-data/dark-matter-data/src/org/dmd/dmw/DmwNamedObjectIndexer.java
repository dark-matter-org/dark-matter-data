package org.dmd.dmw;

import java.util.HashMap;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcObjectName;

/**
 * The DmwNamedObjectIndexer will maintain indices for named objects based on object class.
 * This is a useful utility mechanism for things like caches that may want to allow for the 
 * retrieval of objects of a particular class.
 * <p/>
 * The indexer allows for the creation of indices for both concrete and abstract classes.
 * <p/>
 * If indices have been added for a base class and for classes derived from it, adding an
 * object to the indexer will result in its inclusion multiple indices. So be careful about
 * which indices you add and how you use them.
 * <p/>
 * Update operations against the indexer are thread safe.
 */
public class DmwNamedObjectIndexer {

    private HashMap<DmcClassInfo, HashMap<DmcObjectName, DmwNamedObjectWrapper>> indices;

    public DmwNamedObjectIndexer(){
		indices = new HashMap<DmcClassInfo, HashMap<DmcObjectName,DmwNamedObjectWrapper>>();
	}
    
    /**
     * Indicates that an index should be maintained for the specified class of object. All
     * objects of the specified class or classes derived from it will be added to the index.
     * @param ci The class information.
     */
	public void maintainIndex(DmcClassInfo ci) {
		HashMap<DmcObjectName, DmwNamedObjectWrapper> index = null;
		synchronized (indices) {
			index = indices.get(ci);
			
			if (index != null)
				return;
			
			index = new HashMap<DmcObjectName, DmwNamedObjectWrapper>();
			indices.put(ci, index);
		}
		
	}
    
	/**
	 * This method will add the specified object to the appropriate indices based
	 * on its DmcClassInfo. This applies not just for its construction class but
	 * also for any classes from which it is derived.
	 * @param obj The object to be added.
	 */
	public void addToIndices(DmwNamedObjectWrapper obj){
		synchronized (indices) {
			DmcClassInfo currentClass = obj.getConstructionClassInfo();
			HashMap<DmcObjectName, DmwNamedObjectWrapper> index = null;
			
			while(currentClass != null){
				index = indices.get(currentClass);
				if (index != null)
					index.put(obj.getObjectName(),obj);
				currentClass = currentClass.derivedFrom;
			}
		}
	}
	
	/**
	 * This method will remove the specified object from all indices to which it
	 * had been previously added.
	 * @param obj
	 */
	public void deleteFromIndices(DmwNamedObjectWrapper obj){
		synchronized (indices) {
			DmcClassInfo currentClass = obj.getConstructionClassInfo();
			HashMap<DmcObjectName, DmwNamedObjectWrapper> index = null;
			
			while(currentClass != null){
				index = indices.get(currentClass);
				if (index != null)
					index.remove(obj.getObjectName());
				currentClass = currentClass.derivedFrom;
			}
		}
	}

    
}
