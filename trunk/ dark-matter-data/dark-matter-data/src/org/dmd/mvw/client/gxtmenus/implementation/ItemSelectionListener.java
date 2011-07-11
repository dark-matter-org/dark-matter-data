//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.mvw.client.gxtmenus.implementation;

import org.dmd.mvw.client.mvwmenus.base.Action;
import org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;

/**
 * The ItemSelectionListener provides a default handler for menu selection events that trigger an action.
 */
public class ItemSelectionListener<E extends ComponentEvent> extends SelectionListener<E> {
	
	TriggerIF 	trigger;
	Action		action;

	public ItemSelectionListener(TriggerIF t, Action a){
		trigger = t;
		action = a;
	}
	
	@Override
	public void componentSelected(E ce) {
		action.execute(trigger,ce);
	}

}
