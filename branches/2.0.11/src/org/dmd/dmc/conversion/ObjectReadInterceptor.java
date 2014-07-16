//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dmc.conversion;

import org.dmd.dmc.DmcObject;

/**
 * The ObjectReadInterceptor is used in conjunction with DmoDeserializers or DmwDeserializers
 * to apply data conversions to a complete object once it has been deserialized.
 */
public interface ObjectReadInterceptor {

	/**
	 * Implementing classes should overload this method to perform whatever manipulation
	 * is required. This might involve removing attributes, initializing attributes, whatever.
	 * @param object
	 */
	abstract public void handleObject(DmcObject object);
}
