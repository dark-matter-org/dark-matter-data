package org.dmd.mvw.client.mvwmenus.base;

import org.dmd.dmc.DmcClassInfo;

/**
 * 
 */
abstract public class MvwPopupMenu extends MvwMenu {
	
	DmcClassInfo	_forClass;

	protected MvwPopupMenu(String n, DmcClassInfo forClass) {
		super(n);
		_forClass = forClass;
	}
	
	public DmcClassInfo getForClass(){
		return(_forClass);
	}

}
