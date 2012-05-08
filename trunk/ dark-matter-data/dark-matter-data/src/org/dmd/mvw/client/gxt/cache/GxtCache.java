package org.dmd.mvw.client.gxt.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;
import org.dmd.mvw.client.gxt.dmw.GxtWrapperFactoryIF;
import org.dmd.mvw.client.gxt.dmw.GxtWrapperFactoryManager;

/**
 * The Cache class provides a centralized cache of data retrieved from the server.
 */
public class GxtCache implements DmcNameResolverIF {

	// Our map of name to wrapper object. All objects stored in the cache are named.
	HashMap<DmcObjectName,GxtWrapper>		objMap;
	
	// It's often useful to have access to collections of objects of the same type.
	// Components (generally controllers) will register interest in having a particular
	// set of objects tracked via an index. You can also listen for changes in a particular
	// index.
	HashMap<DmcClassInfo, IndexInfo>		indices;
	
	HashMap<DmcClassInfo, HierarchyInfo>	hierarchies;
	
	GxtWrapperFactoryManager	wrapperFactory;
	
	public GxtCache(){
		init();
		// Add ourselves as a name resolver
//		DmcOmni.instance().addResolver(this);
//		DmcOmni.instance().lazyResolution(true);
//		DmcOmni.instance().backRefTracking(true);
	}
	
	/**
	 * This method will wipe the existing data and any data in the indices. Any previously
	 * specified wrapper factories, indices or listeners to the indices remain intact.
	 */
	public void wipeData(){
		 for(IndexInfo info: indices.values()){
			 info.wipeData();
		 }
		objMap 			= new HashMap<DmcObjectName, GxtWrapper>();
	}
	
	void init(){
		objMap 			= new HashMap<DmcObjectName, GxtWrapper>();
		indices 		= new HashMap<DmcClassInfo, IndexInfo>();
		hierarchies 	= new HashMap<DmcClassInfo, HierarchyInfo>();
		wrapperFactory	= new GxtWrapperFactoryManager();
	}
	
	/**
	 * @param name the name of the object to be retrieved.
	 * @return the object if it exists in the cache.
	 */
	public GxtWrapper getObject(DmcObjectName name){
		return(objMap.get(name));
	}
	
	/**
	 * Adds the specified factory that can create GxtWrappers for a particular schema.
	 * @param factory the factory to be added.
	 */
	public void addWrapperFactory(GxtWrapperFactoryIF factory){
		wrapperFactory.addFactory(factory);
	}
	
	/**
	 * Resets the cache to be empty - generally called when we logout.
	 */
//	public void reset(){
//		objMap 	= null;
//		indices	= null;
//		init();
//	}
	
	public GxtWrapper find(DmcObjectName on){
		return(objMap.get(on));
	}
	
	public void addIndex(DmcClassInfo dci){
		if (indices.get(dci) == null)
			indices.put(dci, new IndexInfo(dci));
	}
	
	public HashMap<DmcObjectName,GxtWrapper> addIndexListener(DmcClassInfo dci, GxtCacheIndexListenerIF listener){
		IndexInfo info = indices.get(dci);
		
		if (info == null)
			throw(new IllegalStateException("Tried to register listener for non-existent index: " + dci.name));
		
		info.listeners.add(listener);
		
		return(info.objects);
	}
	
	public void removeIndexListener(DmcClassInfo dci, GxtCacheIndexListenerIF listener){
		IndexInfo info = indices.get(dci);
		
		if (info == null)
			throw(new IllegalStateException("Tried to register listener for non-existent index: " + dci.name));
		
		info.listeners.remove(listener);
	}
	
	public void addHierarchicIndex(DmcClassInfo dci){
		if (hierarchies.get(dci) == null){
			HierarchyInfo index = new HierarchyInfo(dci);
//			System.out.println("Cache - " + System.identityHashCode(this));
//			System.out.println("HierarchyInfo for " + dci.name + " created - " + System.identityHashCode(index));
			hierarchies.put(dci, index);
		}
	}
	
	/**
	 * 
	 * @param dci The class of object that is the root of the hierarchy.
	 * @param listener the listener.
	 * @return The root of the hierarchy is it's available and null otherwise.
	 */
	public GxtWrapper addHierarchyListener(DmcClassInfo dci, GxtCacheHierarchyListenerIF listener){
		HierarchyInfo info = hierarchies.get(dci);
		
//		System.out.println("Cache - " + System.identityHashCode(this));
		if (info == null)
			throw(new IllegalStateException("Tried to register hierarchy listener for non-existent index: " + dci.name));
		
		info.addListener(listener);
		
		return(info.root);
	}
	
	public void removeHierarchyListener(DmcClassInfo dci, GxtCacheHierarchyListenerIF listener){
		HierarchyInfo info = hierarchies.get(dci);
		
		if (info == null)
			throw(new IllegalStateException("Tried to register listener for non-existent hierarchic index: " + dci.name));
		
		info.listeners.remove(listener);
	}
	
	public void hierarchyFetchComplete(DmcClassInfo dci, GxtWrapper root){
		HierarchyInfo info = hierarchies.get(dci);
		
		if (info == null)
			throw(new IllegalStateException("Tried to mark hierarchy complete for non-existent index: " + dci.name));
		
		info.loadComplete(root);
	}
	
	public HashMap<DmcObjectName,GxtWrapper> getIndex(DmcClassInfo dci){
		IndexInfo info = indices.get(dci);
		if (info == null)
			return(null);
		return(info.objects);
	}
	
	public GxtWrapper addObject(DmcObject obj){
		GxtWrapper rc = addObjectInternal(obj);
		
		IndexInfo info = indices.get(obj.getConstructionClassInfo());
		if (info != null){
			for(GxtCacheIndexListenerIF listener: info.listeners)
				listener.objectAdded(info.classInfo, rc, null);
		}
		
		return(rc);
	}
	
	private GxtWrapper addObjectInternal(DmcObject obj){
		// Attempt to wrap the object for use with GXT
		GxtWrapper rc = wrapperFactory.wrapObject(obj);
					
		DmcObjectName on = ((DmcNamedObjectIF)obj).getObjectName();
		
		if (objMap.get(on) != null)
			throw(new IllegalStateException("Objects should only be retrieved by one component. Duplicate retrieval of: " + on + " (" + obj.getConstructionClassName() + ")"));
		
		objMap.put( ((DmcNamedObjectIF)obj).getObjectName(),rc);
		
		// NOTE: for now, we're only doing an exact match on object type for the indices.
		IndexInfo info = indices.get(obj.getConstructionClassInfo());
		if (info != null)
			info.objects.put(on, rc);
		
//		// And now we try to hook objects into the hierarchy
//		if (rc instanceof HierarchicMo){
//			HierarchicMo hmo = (HierarchicMo) rc;
//			DmcHierarchicObjectName pn = hmo.getHierarchicObjectName().getParentName();
//			HierarchicMo parent = (HierarchicMo) find(pn);
//			
//			if (parent != null)
//				parent.addChild(hmo);
//		}
		
		return(rc);
	}
	
	public GxtWrapper handleHierarchyEvent(DmcClassInfo dci, DMPEventDMO event){
		GxtWrapper rc = handleEvent(event);
		
		HierarchyInfo info = hierarchies.get(dci);
		
		if (info == null)
			throw(new IllegalStateException("Tried to mark hierarchy complete for non-existent index: " + dci.name));
		
		info.notifyListeners(rc, event);
		
		return(rc);
	}
	
	public GxtWrapper handleEvent(DMPEventDMO event){
		GxtWrapper rc = null;
		IndexInfo info = null;
		
		switch(event.getEventTypeDMP()){
		case CREATED:
			rc = addObjectInternal(event.getSourceObject());
			try {
				rc.getDmcObject().resolveReferencesExceptClass(this);
			} catch (DmcValueExceptionSet e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			info = indices.get(rc.getDmcObject().getConstructionClassInfo());
			if (info != null){
				for(GxtCacheIndexListenerIF listener: info.listeners)
					listener.objectAdded(info.classInfo, rc, event);
			}
			break;
		case DELETED:
			rc = deleteObjectInternal(event.getSource().getName());
			
			if (rc != null){
				info = indices.get(rc.getDmcObject().getConstructionClassInfo());
				if (info != null){
					for(GxtCacheIndexListenerIF listener: info.listeners)
						listener.objectDeleted(info.classInfo, rc, event);
				}
			}
			break;
		case MODIFIED:
			rc = objMap.get(event.getSource().getName());
			
			if (rc != null){
				try{
					rc.applyModifierFromEvent(event);
					
					rc.getDmcObject().resolveReferencesExceptClass(this);
					
					info = indices.get(rc.getDmcObject().getConstructionClassInfo());
					if (info != null){
						for(GxtCacheIndexListenerIF listener: info.listeners)
							listener.objectModified(info.classInfo, rc, event);
					}
				}catch (DmcValueExceptionSet e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		}
		
		return(rc);
	}
	
//	public GxtWrapper deleteObject(DmcObjectName on){
//		GxtWrapper rc = deleteObjectInternal(on);
//		
//		if (rc != null){
//			IndexInfo info = indices.get(rc.getDmcObject().getConstructionClassInfo());
//			if (info != null){
//				for(GxtCacheIndexListenerIF listener: info.listeners)
//					listener.objectDeleted(info.classInfo, rc, null);
//			}
//		}
//		
//		return(rc);
//	}
	
	private GxtWrapper deleteObjectInternal(DmcObjectName on){
		GxtWrapper rc = objMap.get(on);
		
		if (rc == null){
			
		}
		else{
			// Clean up references
			rc.getDmcObject().youAreDeleted();
			
			// TODO: need a generic way to handle hierarchic objects
			
//			if (rc instanceof HierarchicMo){
//				HierarchicMo hmo = (HierarchicMo) rc;
//				if (hmo.getParent() != null){
//					hmo.getParent().removeChild(hmo);
//				}
//			}
			
			objMap.remove(on);
			
			IndexInfo info = indices.get(rc.getDmcObject().getConstructionClassInfo());
			if (info != null)
				info.objects.remove(on);
		}
		
		return(rc);
	}
	
	public String getInfo(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("Cache:\n");
		sb.append("  Objects: " + objMap.size() + "\n");
		sb.append("  Indices: " + indices.size() + "\n");
		if (indices.size() > 0){
			for(DmcClassInfo dci: indices.keySet()){
				IndexInfo info = indices.get(dci);
				sb.append("    " + info.classInfo.name + ": " + info.objects.size() + "\n");
			}
		}
		
		return(sb.toString());
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	class IndexInfo {
		DmcClassInfo						classInfo;
		HashMap<DmcObjectName,GxtWrapper> 	objects;
		LinkedList<GxtCacheIndexListenerIF>	listeners;
		
		public IndexInfo(DmcClassInfo ci) {
			classInfo	= ci;
			objects 	= new HashMap<DmcObjectName, GxtWrapper>();
			listeners 	= new LinkedList<GxtCacheIndexListenerIF>();
		}
		
		void wipeData(){
			objects = new HashMap<DmcObjectName, GxtWrapper>();
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	class HierarchyInfo {
		DmcClassInfo							classInfo;
		HashMap<DmcObjectName,GxtWrapper> 		objects;
		ArrayList<GxtCacheHierarchyListenerIF>		listeners;
		boolean									loadComplete;
		GxtWrapper								root;
		
		HierarchyInfo(DmcClassInfo ci) {
			classInfo	= ci;
			objects 	= new HashMap<DmcObjectName, GxtWrapper>();
			listeners 	= new ArrayList<GxtCacheHierarchyListenerIF>();
			loadComplete = false;
		}
		
		void addListener(GxtCacheHierarchyListenerIF listener){
//			System.out.println("HierarchyInfo.addListener() - " + System.identityHashCode(this));
			listeners.add(listener);
		}
		
		void loadComplete(GxtWrapper r){
//			System.out.println("\n\n*** Cache.HierarchyInfo " + classInfo.name + " load complete - " + System.identityHashCode(this) + "\n\n");
			
			loadComplete = true;
			root = r;
			for(GxtCacheHierarchyListenerIF listener: listeners){
				listener.hierarchyAvailable(classInfo, root);
			}
		}
		
		void notifyListeners(GxtWrapper gxt, DMPEventDMO event){
			for(GxtCacheHierarchyListenerIF listener: listeners){
				switch(event.getEventTypeDMP()){
				case CREATED:
					listener.hierarchyObjectAdded(classInfo, gxt, event);
					break;
				case DELETED:
					listener.hierarchyObjectDeleted(classInfo, gxt, event);
					break;
				case MODIFIED:
					listener.hierarchyObjectModified(classInfo, gxt, event);
					break;
				}
			}
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public void performInitialResolution(){
		System.out.println("Objects to resolve: " + objMap.size());
		int i = 1;
		
		for (GxtWrapper wrapper: objMap.values()){
			DmcNamedObjectIF obj = (DmcNamedObjectIF) wrapper.getDmcObject();
			try {
				System.out.println("Resolving (" + i + "): " + obj.getObjectName().getNameString() + " " + wrapper.getClass().getName());
				i++;
				if (wrapper.getDmcObject().getConstructionClassName().equals("PepConfigProfile"))
					System.out.println("HERE HERE");
				
				wrapper.getDmcObject().resolveReferencesExceptClass(this);
			} catch (DmcValueExceptionSet e) {
				System.out.println(e.toString());
			}
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	// DmcNameResolverIF implementation

	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		GxtWrapper wrapper = objMap.get(name);
		
		if (wrapper == null){
			return(null);
		}
		
		return(wrapper.getDmcObject());
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		System.out.println("Finding: " + name.getNameString());
		
		GxtWrapper wrapper = objMap.get(name);
		
		if (wrapper == null)
			return(null);
		
		return (DmcNamedObjectIF) (wrapper.getDmcObject());
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
		return(findNamedObject(name));
	}
}
