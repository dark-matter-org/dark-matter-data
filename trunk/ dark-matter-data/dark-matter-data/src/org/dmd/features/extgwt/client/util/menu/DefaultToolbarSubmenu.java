package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.menu.Menu;

public class DefaultToolbarSubmenu extends SubmenuInstance {

	Button 	component;
	Menu	menu;
	
	public DefaultToolbarSubmenu(String n, String o, String atm, String label) {
		super(n, o, atm);
		component 	= new Button(label);
		menu 		= new Menu();
	}

	@Override
	public Component getComponent() {
		return(component);
	}

	@Override
	public void initialize() {
		component.setMenu(menu);
	}

	@Override
	public void addToMenuContainer(MenuSubItemIF msi) {
		menu.add(msi.getComponent());
	}

	@Override
	public Component getMenu() {
		return(component);
	}

	@Override
	public void removeFromMenuContainer(MenuSubItemIF msi) {
		menu.remove(msi.getComponent());
	}

}
