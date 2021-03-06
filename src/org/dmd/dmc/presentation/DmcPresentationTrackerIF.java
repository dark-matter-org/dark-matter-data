package org.dmd.dmc.presentation;

/**
 * The DmcPresentationTrackerIF defines a component that is responsible for tracking
 * the status of a component that implements the DmcPresentationIF. Generally,
 * components that implement this interface 
 */
public interface DmcPresentationTrackerIF {
	
	/**
	 * Adds the specified presentation implementation to the tracker. The tracker
	 * should also set itself on the presentation by calling its setTracker() method.
	 * @param dpi
	 */
	public void track(DmcPresentationIF dpi);
	
	/**
	 * Adds a listener that's interested in the tracker's state of readiness.
	 * @param listener
	 */
	public void addReadyListener(DmcReadyListenerIF listener);

	/**
	 * Adds a listener that's interested in whether anything has changed.
	 * @param listener
	 */
	public void addChangeListener(DmcChangeListenerIF listener);

	/**
	 * Adds a listener that's interested in any value change in a presenter.
	 * @param listener
	 */
	public void addValueChangeListener(DmcValueChangeListenerIF listener);

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
	
	/**
	 * Calling this method will call the reset method on all presentations; this will
	 * cause them all to display their original values.
	 */
	public void reset();
	
	/**
	 * Sets whether the tracker is in debug mode or not.
	 * @param d true for debug.
	 */
	public void debug(boolean d);
	
	/**
	 * @return the tracker's debug state.
	 */
	public boolean debug();
	
	/**
	 * Log the specified debug message.
	 * @param message the message to be logged.
	 */
	public void debug(String message);
	
	/**
	 * When a form is first rendered, it's often convenient to force validation on
	 * all of the fields so that they can display whether or not they're mandatory i.e.
	 * that they require a value. Calling this method will call isValid() on all 
	 * DmcPresentationIF implementers being tracked.
	 */
	public void validateAll();
	
	// NOTE: dropped this for now because of indexed attributes - multiple presentations
	// will wind up feeding off the same attribute.
//	/**
//	 * In some cases, it's necessary for presentations to interact e.g. altering a combo box
//	 * may necessitate alterring the enabled/visibility state of other components. Since all
//	 * presentations are available via the tracker, this interface lets you find a presentation
//	 * based on the attribute it's displaying.
//	 * @param ai the attribute info of the presentation you want
//	 * @return the presentation whose adapter matches the attribute info
//	 */
//	public DmcPresentationIF getPresentation(DmcAttributeInfo ai);
	
}
