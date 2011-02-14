package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.button.ToggleButton;

public class DefaultToolbarItem extends MenuItemInstance {

	ToggleButton	component;
	
	/**
	 * Constructs a simple toolbar button.
	 * @param n     The MVC name of the item.
	 * @param o     The menu order of the item.
	 * @param an    The name of the action to be triggered.
	 * @param atm   The add to menu name.
	 * @param label The label for the item
	 */
	public DefaultToolbarItem(String n, String o, String an, String atm, String label) {
		super(n, o, an, atm);
		component = new ToggleButton(label);
	}

	@Override
	public Component getComponent() {
		return(component);
	}

	@Override
	public void initialize() {
		component.addSelectionListener(new ItemSelectionListener<ButtonEvent>(this, action));

	}

}
