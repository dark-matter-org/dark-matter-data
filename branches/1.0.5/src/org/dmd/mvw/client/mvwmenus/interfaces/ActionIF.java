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
package org.dmd.mvw.client.mvwmenus.interfaces;

/**
 * The ActionIF interface defines an object that can respond to the triggering
 * of a menu item, button or other UI component.
 */
public interface ActionIF {

	/**
	 * Executes the action.
	 * @param ti The trigger that's calling for the execution of the action.
	 * @param widgetEvent The event that triggered the action. This is implementation specific.
	 */
	public void execute(TriggerIF ti, Object widgetEvent);
	
//	/**
//	 * The action must determine the whether or not its associated triggers 
//	 * should be enabled or disabled depending on the current execution context.
//	 * Exactly what the execution context is will depend on the action. This
//	 * method will be called by the MenuController when it's setting the context
//	 * menu on a component.
//	 */
//	public void enableCheck();
	
	public void addTrigger(TriggerIF t);
	
	public void removeTrigger(TriggerIF t);
}
