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

import java.util.Collection;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmw.DmwNamedObjectWrapper;

/**
 * The ClassIndexListener allows you to listen for events associated with a particular
 * class of object; the cache must have been configured to maintain an index for the
 * specified class.
 */
public abstract class ClassIndexListener extends CacheListener {
	
	// The class for which we're listening for events
	DmcClassInfo classInfo;

	public ClassIndexListener(CacheRegistration reg, DmcClassInfo dci) {
		super(reg);
		classInfo = dci;
	}
	
	public DmcClassInfo getClassInfo(){
		return(classInfo);
	}

	@Override
	public Collection<DmwNamedObjectWrapper> activateAndRetrieve() {
		return null;
	}


}
