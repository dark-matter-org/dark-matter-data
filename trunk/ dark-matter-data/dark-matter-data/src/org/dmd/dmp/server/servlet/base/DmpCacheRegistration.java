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

import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;

/**
 * The DmpCacheRegistration serves to uniquely identify all entities that operate
 * against the data cache.
 */
public class DmpCacheRegistration {

	private static int 		nextRegistrantID = 1;
	private final CacheIF	cache;
	private	int				ID;
	
	/**
	 * Instantiates a new registration against the specified cache.
	 * @param c the cache.
	 */
	public DmpCacheRegistration(CacheIF c){
		cache = c;
		initRegistrantID();
	}
	
	/**
	 * @return the unique ID for this registration.
	 */
	public int getID(){
		return(ID);
	}
	
	/**
	 * @return the cache associated with this registration.
	 */
	public CacheIF getCache(){
		return(cache);
	}
	
	/**
	 * Initializes the ID to the next available value.
	 */
    private synchronized void initRegistrantID()
    {
        ID = nextRegistrantID;
        nextRegistrantID++;
    }

}
