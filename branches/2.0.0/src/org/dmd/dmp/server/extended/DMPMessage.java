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
package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmp.server.generated.dmw.DMPMessageDMW;
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;
import org.dmd.dms.ClassDefinition;

/**
 * This set of extended wrappers is meant for use on the server side of things
 * when you're using the Dark Matter Protocol in a GWT RPC context. The base 
 * DMPMessage includes a mechanism to bundle the original HttpServletRequest
 * object with the message so that it is available for downstream processing
 * if required.
 */
abstract public class DMPMessage extends DMPMessageDMW {
	
	protected DMPMessage(){
		super();
	}
	
	// The original request associated with this message
	protected HttpServletRequest request;

//	protected DMPMessage(DmcObject obj) {
//		super(obj);
//	}

	protected DMPMessage(DMPMessageDMO obj, ClassDefinition cd) {
		super(obj,cd);
	}

//	protected DMPMessage(DmcObject obj, HttpServletRequest req){
//		super(obj);
//	}
	
//	/**
//	 * Sets the original servlet request associated with this message.
//	 * @param req The request.
//	 */
//	public void setServletRequest(HttpServletRequest req){
//		request = req;
//	}
	
	/**
	 * @return The original servlet request associated with this message.
	 */
	public HttpServletRequest getServletRequest(){
		return(request);
	}
	
	/**
	 * @return the last request ID value.
	 */
	public Integer getLastRequestID(){
		if (getRequestIDHasValue()){
			return(getDMO().getNthRequestID(getRequestIDSize()-1));
		}
		return(null);
	}
	
	/**
	 * Removes the last request ID value.
	 * @return the value that was removed.
	 */
	public Integer removeLastRequestID(){
		if (getRequestIDHasValue()){
			Integer last = getDMO().getNthRequestID(getRequestIDSize()-1);
			delRequestID(last);
			return(last);
		}
		return(null);
	}
	

}
