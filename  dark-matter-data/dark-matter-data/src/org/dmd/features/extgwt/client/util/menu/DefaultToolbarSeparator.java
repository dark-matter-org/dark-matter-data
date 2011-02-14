package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.toolbar.SeparatorToolItem;

public class DefaultToolbarSeparator implements MenuSubItemIF {

	SeparatorToolItem	component;
	String name;
	String menuOrder;
	String addToMenu;
	
	/**
	 * Constructs a toolbar separator.
	 * @param n     The MVC name of the item.
	 * @param o     The menu order of the item.
	 * @param atm   The add to menu name.
	 */
	public DefaultToolbarSeparator(String n, String o, String atm) {
		component = new SeparatorToolItem();
		name 		= n;
		menuOrder 	= o;
		addToMenu   = atm;
	}

	////////////////////////////////////////////////////////////////////////////////
	// MenuSubItemIF implementation

	@Override
	public String getMenuOrder() {
		return(menuOrder);
	}

	@Override
	public String getName() {
		return(name);
	}
	
	@Override
	public String getAddToMenu(){
		return(addToMenu);
	}
	
	@Override
	public Component getComponent() {
		return(component);
	}

	@Override
	public void initialize() {

	}

}
