package org.dmd.mvw.client.mvwmenus.base;

import com.google.gwt.resources.client.ImageResource;

/**
 * The MvwMenuFactory defines a component that can can instantiate MvwMenus
 * and MvwMenuItems based on parameters defined in a Model View Whatever
 * configuration file. The menu factory should be extended when you want
 * a menu structure based on a particular widget set.
 */
abstract public class MvwMenuFactory {

	/**
	 * This method should be overloaded to instantiate the type of menu specified.
	 * The various menu types are defined as part of a MenuImplementationConfig
	 * in whatever module is implementing the menu functionality. 
	 * @param menuType The menu type. 
	 * @param menuName The unique name of the menu.
	 * @return an appropriate menu implementation.
	 */
	abstract public MvwMenu createMenu(String menuType, String menuName);
	
	/**
	 * This method should be overloaded to instantiate the type of submenu specified.
	 * The various submenu types are defined as part of a MenuImplementationConfig
	 * in whatever module is implementing the menu functionality. 
	 * @param menuType The menu type. 
	 * @param itemName   The unique name of the item.
	 * @param menuOrder  The item's place within the menu.
	 * @param addToMenu  The menu to which it should be added.
	 * @param dynamic    Whether or not the item is dynamic.
	 * @param label      The display label for the submenu or null if this is just an image button.
	 * @param image      The image for the submenu, or null if no image is to be displayed.
	 * @return an appropriate submenu implementation.
	 */
	abstract public MvwMenu createSubMenu(String menuType, String itemName, String menuOrder, String addToMenu, boolean dynamic, String label, ImageResource image);

	/**
	 * This method should be overloaded to instantiate the specified type of menu item.
	 * This various item types are defined as part of a MenuImplementationConfig
	 * in whatever module is implementing the menu functionality. 
	 * @param itemType   The item type.
	 * @param itemName   The unique name of the item.
	 * @param menuOrder  The item's place within the menu.
	 * @param addToMenu  The menu to which it should be added.
	 * @param dynamic    Whether or not the item is dynamic.
	 * @param actionName The name of the action to be triggered.
	 * @param label      The display label for the item or null if this is just an image button.
	 * @param image      The image for the item, or null if no image is to be displayed.
	 * @return an appropriate menu item implementation
	 */
	abstract public MvwMenuItem createMenuItem(String itemType, String itemName, String menuOrder, String addToMenu, boolean dynamic, String actionName, String label, ImageResource image);
	
	/**
	 * This method should be overloaded to instantiate the specified type of separator.
	 * This various item types are defined as part of a MenuImplementationConfig
	 * in whatever module is implementing the menu functionality. 
	 * @param separatorType The separator type.
	 * @param itemName      The unique name of the item.
	 * @param menuOrder     The item's place within the menu.
	 * @param addToMenu     The menu to which it should be added.
	 * @param dynamic       Whether or not the item is dynamic.
	 * @return an appropriate menu separator implementation.
	 */
	abstract public MvwSeparator createSeparator(String separatorType, String itemName, String menuOrder, String addToMenu, boolean dynamic);
	
	
}
