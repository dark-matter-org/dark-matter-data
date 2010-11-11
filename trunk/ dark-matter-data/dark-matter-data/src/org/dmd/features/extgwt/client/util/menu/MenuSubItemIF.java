package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;

public interface MenuSubItemIF {

	/**
	 * @return The name of the MVC definition for this item.
	 */
	public String getName();
	
	/**
	 * @return The name of the menu to which this item should be added.
	 */
	public String getAddToMenu();
	
	/**
	 * @return The lexicographic order for this item.
	 */
	public String getMenuOrder();
	
	/**
	 * Implementing classes must overload this method to initialize their Component.
	 */
	public void initialize();
	
	/**
	 * @return The component that's appropriate for the type of menu where this item is placed.
	 */
	public Component getComponent();

}
