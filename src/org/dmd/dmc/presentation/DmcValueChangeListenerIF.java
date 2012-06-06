package org.dmd.dmc.presentation;

/**
 * The DmcValueChangeListenerIF interface should be implemented by components that are 
 * interested when a field's value is updated. Although you could register individual listeners
 * on each field, the Tracker is informed by any presenter when things have changed and
 * so it's easy to register a single listener to be informed when a presenter has changed.
 */
public interface DmcValueChangeListenerIF {

	public void valueUpdated(DmcPresentationIF p);
}
