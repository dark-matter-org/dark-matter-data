package org.dmd.dmp.server.servlet.base.cache;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The CacheListenerManager maintains collections of the various types of cache
 * listeners. The manager maintains weak references to the various listeners in
 * order to prevent memory leaks associated with listeners that are no longer
 * active because of things like timed out sessions.
 */
public class CacheListenerManager {
	
	// Listeners for all cache events
	ListenerSet	fullListeners	= new ListenerSet();
	
	
	
	public CacheListenerManager(){
		
		
	}

	
	/**
	 * The ListenerSet maintains a set of weak references to listeners.
	 */
	private class ListenerSet {
		
		LinkedList<WeakReference<CacheListener>>	listeners;
		
        void add(CacheListener listener)
        {
            synchronized (this)
            {
                listeners.add(new WeakReference<CacheListener>(listener));
            }
        }

        
		/**
		 * @return the listeners in this set with any garbage collected listeners removed.
		 */
        Collection<CacheListener> getListeners() {
            synchronized (this)
            {
                LinkedList<CacheListener> listenersToNotify = new LinkedList<CacheListener>();
                if (listeners == null) return listenersToNotify;
                Iterator<WeakReference<CacheListener>> listenerIt = listeners.iterator();
                while (listenerIt.hasNext())
                {
                    WeakReference<CacheListener> ref = listenerIt.next();
                    CacheListener listener = ref.get();
                    if (listener == null)
                    {
                        listenerIt.remove();
                        continue;
                    }
                    listenersToNotify.add(listener);
                }
                return listenersToNotify;
            }
        }
        
        /**
         * Removes the specified listener from the set.
         * @param listener the listener to remove.
         */
        void remove(CacheListener listener){
            synchronized (this)
            {
                Iterator<WeakReference<CacheListener>> refIt = listeners.iterator();
                while (refIt.hasNext())
                {
                	CacheListener test = refIt.next().get();
                    if (test == listener)
                    {
                        refIt.remove();
                        break;
                    }
                }
            }
        }


        /**
         * @return true if there are no valid listeners in this set.
         */
        boolean isEmpty(){
            synchronized (this)
            {
                return listeners.isEmpty();
            }
        }
	}
	
//	private class ClassListenerSet extends ListenerSet
}
