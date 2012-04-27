package org.dmd.dmw;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcObjectName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The DmwNamedObjectIndexer will maintain indices for named objects based on object class.
 * This is a useful utility mechanism for things like caches that may want to allow for the 
 * retrieval of objects of a particular class.
 * <p/>
 * The indexer allows for the creation of indices for both concrete and abstract classes.
 * <p/>
 * If indices have been added for a base class and for classes derived from it, adding an
 * object to the indexer will result in its inclusion in multiple indices. So be careful about
 * which indices you add and how you use them.
 * <p/>
 * Update operations against the indexer are thread safe.
 */
public class DmwNamedObjectIndexer {

    private HashMap<DmcClassInfo, HashMap<DmcObjectName, DmwNamedObjectWrapper>> indices;

    private Logger	logger = LoggerFactory.getLogger(getClass());

    /**
     * Constructs a new indexer.
     */
    public DmwNamedObjectIndexer(){
		indices = new HashMap<DmcClassInfo, HashMap<DmcObjectName,DmwNamedObjectWrapper>>();
	}
    
    /**
     * @param dci The class for which you're checking.
     * @return true if there's an index for the class and false otherwise.
     */
    public boolean hasIndex(DmcClassInfo dci){
		synchronized (indices) {
			HashMap<DmcObjectName, DmwNamedObjectWrapper> index = indices.get(dci);
			if (index == null)
				return(false);
			return(true);
		}
    }
    
    /**
     * @param ci The class for which you want the index size.
     * @return The size of the index or 0 if no objects of that type exist.
     */
    public int getIndexSize(DmcClassInfo ci){
		synchronized (indices) {
			HashMap<DmcObjectName, DmwNamedObjectWrapper> index = indices.get(ci);
			
			if (index == null)
				return(0);
			
			return(index.size());
		}
    }
    
    /**
     * @param ci The class for which you want the index.
     * @return An iterator over the set of objects in the index. It will be an empty iterator
     * if there are no objects of the specified type.
     */
    @SuppressWarnings("unchecked")
	public Collection<DmwNamedObjectWrapper> getIndex(DmcClassInfo ci){
		synchronized (indices) {
			LinkedList<DmwNamedObjectWrapper> values = new LinkedList<DmwNamedObjectWrapper>();
			
			HashMap<DmcObjectName, DmwNamedObjectWrapper> index = indices.get(ci);
			
			if (index == null)
				return(((List<DmwNamedObjectWrapper>) Collections.EMPTY_LIST));
			else{
				for(DmwNamedObjectWrapper value: index.values())
					values.add(value);
			}
			
			return (values);
		}
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
			
			logger.trace("Added indexing for class: " + ci.name);
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
				if (index != null){
					index.put(obj.getObjectName(),obj);
					logger.trace("Object: " + obj.getObjectName().getNameString() + " added to index for class: " + currentClass.name);
				}
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
				if (index != null){
					index.remove(obj.getObjectName());
					logger.trace("Object: " + obj.getObjectName().getNameString() + " removed from index for class: " + currentClass.name);
				}
				currentClass = currentClass.derivedFrom;
			}
		}
	}

    
}
