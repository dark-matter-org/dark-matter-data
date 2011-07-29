package org.dmd.dmc;

/**
 * The DmcReadyListenerIF interface should be implemented by components that are 
 * interested in listening to "ready" indications from a DmcPresentationTrackerIF.
 */
public interface DmcReadyListenerIF {

	public void isReady(boolean ready);
}
