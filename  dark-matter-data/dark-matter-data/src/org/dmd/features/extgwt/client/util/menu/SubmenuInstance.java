package org.dmd.features.extgwt.client.util.menu;

public abstract class SubmenuInstance extends MenuInstance implements MenuSubItemIF {

	String name;
	String menuOrder;
	String addToMenu;
	
	protected SubmenuInstance(String n, String o, String atm) {
		super(n);
		name = n;
		menuOrder = o;
		addToMenu = atm;
	}
	
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
	

}
