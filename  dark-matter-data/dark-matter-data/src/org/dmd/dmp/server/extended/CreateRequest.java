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

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.CreateRequestDMW;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dms.DmwWrapper;
import org.dmd.dmw.DmwOmni;

public class CreateRequest extends CreateRequestDMW {
	
	/**
	 * Constructs a new CreateRequest.
	 */
	public CreateRequest(){
		super();
	}
	
	/**
	 * Constructs a new CreateRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public CreateRequest(CreateRequestDMO obj, HttpServletRequest req){
		super(obj);
		request = req;
	}
	
	/**
	 * Constructs a new CreateRequest and sets the newObj to be the object you
	 * are passing in.
	 */
	public CreateRequest(DmcObject newobj){
		super();
		setNewObject(newobj);
	}
	
	/**
	 * Constructs a new CreateRequest.
	 */
	public CreateRequest(DmwWrapper newobj){
		super();
		setNewObject(newobj.getDmcObject());
	}
	
	/**
	 * Fills in standard information from the request back into the response.
	 * @return A new craete response.
	 * @throws DmcValueException
	 */
	public CreateResponse getResponse(){
		CreateResponse response = new CreateResponse();
		
		fillStandard(response);
		
		return(response);
	}
	
	/**
	 * Allows you to set the newly created object using a wrapper.
	 * @param value A wrapped DMO.
	 */
    public void setNewObject(DmwWrapper value){
        setNewObject(value.getDmcObject());
    }

	@Override
	public Response getErrorResponse(){
		CreateResponse response = new CreateResponse();
		fillError(response);
		return(response);
	}
	
	/**
	 * If the new object has generated/extended DMW code, this method will return the 
	 * DMO wrapped in its associated DMW object.
	 * @return The wrapped DMO.
	 */
	public DmwWrapper getNewObjectWrapped(){
		if (getNewObject() == null)
			return(null);
		return(DmwOmni.instance().wrapIt(getNewObject()));
	}

}
