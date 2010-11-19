package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;

abstract public class PopupMenuInstance extends MenuInstance {

	// The fully qualified name of the 
	String forClass;
	
	/**
	 * Constructs a new popup menu.
	 * @param n  the mvc menu name.
	 * @param fc The fully qualified DMO class name.
	 */
	protected PopupMenuInstance(String n, String fc) {
		super(n);
		forClass = fc;
	}
	
	public String getForClass(){
		return(forClass);
	}

	abstract public void addToMenuContainer(MenuSubItemIF msi);

	abstract public Component getMenu();

}
