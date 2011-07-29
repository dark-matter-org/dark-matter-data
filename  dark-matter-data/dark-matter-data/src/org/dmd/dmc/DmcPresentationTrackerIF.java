package org.dmd.dmc;

/**
 * The DmcPresentationTrackerIF defines a component that is responsible for tracking
 * the status of a component that implements the DmcPresentationIF. Generally,
 * components that implement this interface 
 */
public interface DmcPresentationTrackerIF {
	
	/**
	 * Adds the specified presentation implementation to the tracker.
	 * @param dpi
	 */
	public void track(DmcPresentationIF dpi);
	
	/**
	 * Adds a listener that's interested in the tracker's state of readiness.
	 * @param listener
	 */
	public void addListener(DmcReadyListenerIF listener);

	/**
	 * Indicates that the presentation component is "ready". Exactly what "ready" means
	 * is implementation specific.
	 * @param dpi
	 */
	public void isReady(DmcPresentationIF dpi);
	
	/**
	 * Indicates that the presentation component is "not ready". Exactly what "not ready" means
	 * is implementation specific.
	 * @param dpi
	 */
	public void isNotReady(DmcPresentationIF dpi);
	
	/**
	 * Calling this method will cause the tracker to query all of its presentation implementations
	 * to determine their current state.
	 */
	public void startTracking();
}
