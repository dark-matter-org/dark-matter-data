package org.dmd.features.extgwt.client.interfaces;

import com.extjs.gxt.ui.client.widget.Component;

/**
 * The TriggerIF interface is implemented by objects that can act as a
 * trigger point for an action. A trigger point can be enabled and disabled
 * depending on the behaviour of the action it fronts.
 */
public interface TriggerIF {

	/**
	 * Enables the trigger component.
	 */
	public void enable();
	
	/**
	 * Disables the trigger component.
	 */
	public void disable();
	
	/**
	 * @return The component that's acting as a trigger.
	 */
	public Component getComponent();
}
