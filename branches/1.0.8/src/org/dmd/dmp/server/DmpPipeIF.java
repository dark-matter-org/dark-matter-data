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
package org.dmd.dmp.server;

import org.dmd.dmp.server.extended.DMPMessage;

/**
 * The DmpPipeIF defines an entity that can send a Dark Matter Protocol
 * message. This is often implemented by connection/session classes that
 * handle the routing of asynchronous responses/events back to something
 * that's interested e.g. a client of some type.
 */
public interface DmpPipeIF
{
	/**
     * This method is called when we want to send asynchronous info back to the UI.
     * The message is either a DmpEvent or a Response derivative, however, from the point
     * of view of our event pipe, they are all events (since DMPMessageDMO actually 
     * implements the marker interface: de.novanic.eventservice.client.event.Event
	 * @param msg the message or event.
	 */
    public void sendMessage(DMPMessage msg);
    
    /**
     * Implementors should overload this method to return a meaningful name
     * for the connection associated with this pipe.
     * @return A name that may be useful in logging etc.
     */
    public String getName();
}
