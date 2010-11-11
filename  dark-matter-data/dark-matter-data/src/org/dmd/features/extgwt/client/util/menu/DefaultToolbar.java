package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;

public class DefaultToolbar extends MenuInstance {

	ToolBar menu;
	
	public DefaultToolbar(String n){
		super(n);
		menu = new ToolBar();
	}
	
	@Override
	public Component getMenu() {
		return menu;
	}

	@Override
	public void addToMenuContainer(MenuSubItemIF msi) {
		menu.add(msi.getComponent());
	}

}
