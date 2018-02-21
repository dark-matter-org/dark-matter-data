//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmc.util;

/**
 * The UcoFeedbackIF allows various rules associated with DmcUncheckedObjects to provide
 * feedback to other components. The exact nature of the feedback will depend on the type
 * of rule.
 * @author peter.strong
 *
 */
public interface UcoFeedbackIF {

	/**
	 * Sends feedback somewhere. How the somewhere deals with it, is none of our concern.
	 * @param feedback yadda yadda
	 */
	public void sendFeedback(DmcUncheckedObject feedback);
}
