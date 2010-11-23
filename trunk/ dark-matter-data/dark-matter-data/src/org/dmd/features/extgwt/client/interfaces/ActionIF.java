package org.dmd.features.extgwt.client.interfaces;

import com.extjs.gxt.ui.client.event.ComponentEvent;


/**
 * The ActionIF interface defines an object that can respond to the triggering
 * of a menu item, button or other UI component.
 */
public interface ActionIF {

	/**
	 * Executes the action.
	 * @param ti The trigger that's calling for the execution of the action.
	 */
	public void execute(TriggerIF ti, ComponentEvent ce);
	
	/**
	 * The action must determine the whether or not its associated triggers 
	 * should be enabled or disabled depending on the current execution context.
	 * Exactly what the execution context is will depend on the action. This
	 * method will be called by the MenuController when it's setting the context
	 * menu on a component.
	 */
	public void enableCheck();
	
	public void addTrigger(TriggerIF t);
	
	public void removeTrigger(TriggerIF t);
}
