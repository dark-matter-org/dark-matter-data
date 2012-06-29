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


/**
 * The CacheRegistration serves to uniquely identify all entities that operate
 * against the data cache. It is usually associated with a validated client session.
 * <p/>
 * When a client sends a LoginRequest, the LoginResponse will contain the originatorID
 * associated with this registration. Using this ID, the client is able to determine
 * whether or not events it's receiving were caused by its actions or those of other
 * clients, which can be useful in generating warnings etc. For example, if you're
 * in the middle of editting an object and you receive an event to indicate that it
 * has been modified by someone else, you can present a warning.
 * <p/>
 * You can have a look at the org.dmd.mvw.client.mvwcomms.extended.CommsController
 * class for a concrete example of how the originatorID is used.
 */
public class CacheRegistration {

	private static int 		nextRegistrantID = 1;
	private final CacheIF	cache;
	private	int				ID;
	
	/**
	 * Instantiates a new registration against the specified cache.
	 * @param c the cache.
	 */
	public CacheRegistration(CacheIF c){
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
