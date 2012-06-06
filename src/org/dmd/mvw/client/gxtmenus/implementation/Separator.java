package org.dmd.mvw.client.gxtmenus.implementation;

import org.dmd.mvw.client.mvwmenus.base.MvwSeparator;

import com.extjs.gxt.ui.client.widget.toolbar.SeparatorToolItem;
import com.google.gwt.user.client.ui.Widget;

public class Separator extends MvwSeparator {

	SeparatorToolItem separator;
	
	public Separator(String itemName, String menuOrder, String addToMenu, boolean dynamic) {
		super(itemName, menuOrder, addToMenu, dynamic);
		separator = new SeparatorToolItem();
	}

	@Override
	public Widget getWidget() {
		return(separator);
	}

}
