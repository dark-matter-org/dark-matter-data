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

import com.google.gwt.user.client.ui.Widget;

/**
 * The TriggerIF interface is implemented by objects that can act as a
 * trigger point for an action. A trigger point can be enabled and disabled
 * depending on the behaviour of the action it fronts.
 */
public interface TriggerIF {

	/**
	 * Enables the trigger component.
	 */
	public void enable();
	
	/**
	 * Disables the trigger component.
	 */
	public void disable();
	
	/**
	 * @return The widget that's acting as a trigger.
	 */
	public Widget getWidget();
}
