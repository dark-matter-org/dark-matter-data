package org.dmd.dmp.server.dmpservletri;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.client.DMPService;
import org.dmd.dmp.server.servlet.base.CacheIF;
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;
import org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO;
import org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.ResultException;

import de.novanic.eventservice.service.RemoteEventServiceServlet;

/**
 * The DMPServlet is a reference implementation of a servlet that implements
 * the Dark Matter Protocol Service. The class is designed to run in two 
 * primary modes: standalone and extended.
 * <P>
 * If you wish to experiment with Dark Matter concepts, you can simply derive
 * your servlet from this class and specify just a SchemaManager as a constructor
 * argument; this provides the servlet with knowledge of the model you want to
 * support. Reference implementations of the required components will be used
 * to provide all service functionality.
 * <P>
 * When you want to 
 */
@SuppressWarnings("serial")
public class DMPServiceImpl extends RemoteEventServiceServlet implements DMPService {
	
	// The schema that indicates the types of DMO we manage
	SchemaManager	schema;
	
	// The cache that manages our DMO instances
	CacheIF			cache;
	
	// The 
	
	
	/**
	 * 
	 */
	protected DMPServiceImpl(){
		
	}
	
	///////////////////////////////////////////////////////////////////////////////
	// GenericServlet
	
	@Override
	public void init(){
		try {
			schema = new SchemaManager();
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void destroy(){
		
	}

	///////////////////////////////////////////////////////////////////////////////
	// DMPService
	
	@Override
	public ActionResponseDMO action(ActionRequestDMO actionRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateResponseDMO create(CreateRequestDMO createRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeleteResponseDMO delete(DeleteRequestDMO deleteRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetResponseDMO get(GetRequestDMO getRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginResponseDMO login(LoginRequestDMO loginRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogoutResponseDMO logout(LogoutRequestDMO logoutRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NotifyResponseDMO notify(NotifyRequestDMO notifyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetResponseDMO set(SetRequestDMO setRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
