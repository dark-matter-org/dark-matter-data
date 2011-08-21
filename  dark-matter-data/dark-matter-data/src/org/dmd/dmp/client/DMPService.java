package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;
import org.dmd.dmp.shared.generated.dmo.CreateResponseDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;
import org.dmd.dmp.shared.generated.dmo.DenotifyRequestDMO;
import org.dmd.dmp.shared.generated.dmo.DenotifyResponseDMO;
import org.dmd.dmp.shared.generated.dmo.GetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LoginResponseDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO;
import org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO;
import org.dmd.dmp.shared.generated.dmo.PreAuthRequestDMO;
import org.dmd.dmp.shared.generated.dmo.PreAuthResponseDMO;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO;
import org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the Dark Matter Protocol RPC service.
 */
@RemoteServiceRelativePath("DMP")
public interface DMPService extends RemoteService {
	
	PreAuthResponseDMO preauth(PreAuthRequestDMO request);

	LoginResponseDMO login(LoginRequestDMO loginRequest);
	  
	LogoutResponseDMO logout(LogoutRequestDMO logoutRequest);
	  
	GetResponseDMO get(GetRequestDMO getRequest);

	SetResponseDMO set(SetRequestDMO setRequest);

	CreateResponseDMO create(CreateRequestDMO createRequest);

	DeleteResponseDMO delete(DeleteRequestDMO deleteRequest);

	ActionResponseDMO action(ActionRequestDMO actionRequest);

	NotifyResponseDMO notify(NotifyRequestDMO notifyRequest);

	DenotifyResponseDMO	denotify(DenotifyRequestDMO notifyRequest);

	ResponseDMO otherRequest(RequestDMO request);
  
}
