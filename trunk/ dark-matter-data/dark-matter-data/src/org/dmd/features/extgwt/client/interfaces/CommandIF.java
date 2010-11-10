package org.dmd.features.extgwt.client.interfaces;

import com.extjs.gxt.ui.client.event.ComponentEvent;

/**
 * The CommandIF interface defines an object that can respond to the triggering
 * of a menu item.
 */
public interface CommandIF {

	public void execute(ComponentEvent ce);
	
	
}
