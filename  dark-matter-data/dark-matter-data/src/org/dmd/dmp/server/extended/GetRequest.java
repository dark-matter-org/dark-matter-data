package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcSliceInfo;
import org.dmd.dmc.DmcValueException;
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
	 * on the response so that the response can "slice" the attributes taht are sent
	 * back as part of the response object. See the GetResponse.addObjectList() method
	 * for more of the magic that takes place when dealing with slices.
	 * @return
	 * @throws DmcValueException
	 */
	public GetResponse getResponse() throws DmcValueException {
		GetResponse response = new GetResponse();
		
		fillStandard(response);
		
		// Reflect back whether we want to cache the response
		response.setCacheResponse(isCacheResponse());
		
		if (getSlice() != null){
			if (sliceInfo == null)
				sliceInfo = DmcOmni.instance().getSliceInfo(getSlice());
			
			response.sliceInfo = sliceInfo;
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
