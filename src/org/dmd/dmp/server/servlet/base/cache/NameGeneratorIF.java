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
package org.dmd.dmp.server.servlet.base.cache;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmw.DmwNamedObjectWrapper;

/**
 * The NameGeneratorIF interface defines a component that create a unique
 * name (or key) for named object. Name generators will usually be registered
 * with the cache by various plugins based on their associated schemas.
 * <p/>
 * Only one generator may be registered per class of object.
 */
public interface NameGeneratorIF {

	public DmcClassInfo usedForClass();
	
	public void createNameForObject(DmwNamedObjectWrapper object);
}
