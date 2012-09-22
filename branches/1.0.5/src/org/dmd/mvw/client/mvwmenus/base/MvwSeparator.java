package org.dmd.mvw.client.mvwmenus.base;


/**
 * The MvwSeparator is base for separator elements.
 */
abstract public class MvwSeparator extends MvwItem  {

	protected MvwSeparator(String itemName, String menuOrder, String addToMenu, boolean dynamic) {
		super(itemName, menuOrder, addToMenu, dynamic);
	}

	@Override
	public void initialize() {
		// Nothing to do
	}

}
