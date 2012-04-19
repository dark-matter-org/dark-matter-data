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
package org.dmd.dmp.server.servlet.base;

import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.servlet.base.cache.CacheRegistration;

/**
 * The EventHandlerIF interface is implemented by entities that want to register
 * with an EventBusIF for DMPEvent notification.
 */
public interface EventHandlerIF {
	
	public CacheRegistration getCacheRegistration();

	public void handleEvent(DMPEvent event);
}
