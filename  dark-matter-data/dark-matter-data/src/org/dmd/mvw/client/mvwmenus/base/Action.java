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
package org.dmd.mvw.client.mvwmenus.base;

import java.util.ArrayList;

import org.dmd.mvw.client.mvwmenus.interfaces.ActionIF;
import org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF;

/**
 * The Action class provides some base functionality for Actions.
 */
public abstract class Action implements ActionIF {
	
	ArrayList<TriggerIF> triggers;
	
	// The name of the action from the MvcAction definition
	String name;

	public Action(String n){
		name = n;
	}
	
	@Override
	public void addTrigger(TriggerIF t) {
		if(triggers == null)
			triggers = new ArrayList<TriggerIF>();
		triggers.add(t);
	}

	@Override
	public void removeTrigger(TriggerIF t) {
		if (triggers == null)
			return;
		
		triggers.remove(t);
	}

	public String getName(){
		return(name);
	}
	
	/**
	 * Sets the state of all associated triggers to be enabled or disabled.
	 * @param f True for enable and false for disabled.
	 */
	public void setEnabled(boolean f){
		if (triggers != null){
			for(TriggerIF t: triggers){
				if (f)
					t.enable();
				else
					t.disable();
			}
		}
	}
}
