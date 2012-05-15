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
package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcSliceInfo;
import org.dmd.dmc.types.NameContainer;
import org.dmd.dmp.server.generated.dmw.GetRequestDMW;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;

public class GetRequest extends GetRequestDMW {
	
	DmcSliceInfo	sliceInfo;

	public GetRequest(){
		super();
		sliceInfo = null;
	}
	/**
	 * Constructs a new GetRequest with the specified HTTP originating request.
	 * @param obj The request from a web client.
	 * @param req The request context.
	 */
	public GetRequest(GetRequestDMO obj, HttpServletRequest req) {
		super(obj);
		request 	= req;
		sliceInfo 	= null;
	}
	
	/**
	 * Returns a properly populated GetResponse. This will also set the DmcSliceInfo
	 * on the response so that the response can "slice" the attributes that are sent
	 * back as part of the response object. See the GetResponse.addObjectList() method
	 * for more of the magic that takes place when dealing with slices.
	 * @return a response prefilled with standard values.
	 */
	public GetResponse getResponse(){
		GetResponse response = new GetResponse();
		
		fillStandard(response);
		
		// Reflect back whether we want to cache the response
		response.setCacheResponse(isCacheResponse());
		
		if (getSlice() != null){
			if (sliceInfo == null)
				sliceInfo = DmcOmni.instance().getSliceInfo(getSlice());
			
			response.sliceInfo = sliceInfo;
		}
		
		if (getTargetsHasValue()){
			for(NameContainer nc: getTargetsIterable()){
				response.addTargets(nc);
			}
		}
		
		return(response);
	}
	
	/**
	 * Returns a properly populated error response.
	 */
	@Override
	public Response getErrorResponse(){
		GetResponse response = new GetResponse();
		fillError(response);
		return(response);
	}
	
	/**
	 * Sets the slice info for this request.
	 * @param dsi the slice info.
	 */
	public void setSliceInfo(DmcSliceInfo dsi){
		setSlice(dsi.getName());
	}

	/**
	 * @return the slice info if there's any available.
	 */
	public DmcSliceInfo getSliceInfo(){
		if (sliceInfo == null){
			if (getSlice() != null)
				sliceInfo = DmcOmni.instance().getSliceInfo(getSlice());
		}
		return(sliceInfo);
	}
}
