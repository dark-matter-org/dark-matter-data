package org.dmd.dmc.presentation;

/**
 * The DmcChangeListenerIF interface should be implemented by components that are 
 * interested in listening to "change" indications from a DmcPresentationTrackerIF.
 * This is subtly different than listening to the "readiness" state, in that it indicates
 * only if changes have been made, not that the changes are valid.
 */
public interface DmcChangeListenerIF {

	public void isChanged(boolean ready);
}
