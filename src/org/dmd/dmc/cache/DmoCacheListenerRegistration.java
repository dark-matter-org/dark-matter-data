package org.dmd.dmc.cache;

/**
 * The DmoCacheListenerRegistration provides a unique identification for components
 * that register to listen to cache changes and must be used to deregister the
 * listener if it is no longer interested in receiving notifications.
 */
public class DmoCacheListenerRegistration implements Comparable<DmoCacheListenerRegistration>{

	private static int 						nextRegistrantID = 1;
	private	int								ID;
	final private DmoCacheIndexListenerIF	listener;

	/**
	 * Instantiates a new registration.
	 */
	public DmoCacheListenerRegistration(DmoCacheIndexListenerIF	listener) {
		initRegistrantID();
		this.listener = listener;
	}
	
	/**
	 * @return the unique ID for this registration.
	 */
	public int getID(){
		return(ID);
	}
	
	/**
	 * @return the listener associated with this registration.
	 */
	public DmoCacheIndexListenerIF listener() {
		return(listener);
	}

	/**
	 * Initializes the ID to the next available value.
	 */
    private synchronized void initRegistrantID()
    {
        ID = nextRegistrantID;
        nextRegistrantID++;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof DmoCacheListenerRegistration) {
    		return(ID == ((DmoCacheListenerRegistration)obj).ID);
    	}
    	return super.equals(obj);
    }

	@Override
	public int compareTo(DmoCacheListenerRegistration o) {
		return (ID - o.ID);
	}

	@Override
	public int hashCode(){
		return(ID);
	}

}
