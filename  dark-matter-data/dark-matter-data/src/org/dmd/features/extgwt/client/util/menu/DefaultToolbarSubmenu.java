package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.button.Button;

public class DefaultToolbarSubmenu extends SubmenuInstance {

	Button component;
	
	public DefaultToolbarSubmenu(String n, String o, String atm, String label) {
		super(n, o, atm);
	}

	@Override
	public Component getComponent() {
		return(component);
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addToMenuContainer(MenuSubItemIF msi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getMenu() {
		// TODO Auto-generated method stub
		return null;
	}


}
