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
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;
import org.dmd.dmp.shared.generated.dmo.NotifyRequestDMO;
import org.dmd.dmp.shared.generated.dmo.NotifyResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The asynchronous counterpart of <code>DMPService</code>.
 */
public interface DMPServiceAsync {
  
	void login(LoginRequestDMO loginRequest, AsyncCallback<LoginResponseDMO> callback);

	void logout(LogoutRequestDMO logoutRequest, AsyncCallback<LogoutResponseDMO> callback);

	void get(GetRequestDMO getRequest, AsyncCallback<GetResponseDMO> callback);

	void set(SetRequestDMO getRequest, AsyncCallback<SetResponseDMO> callback);

	void create(CreateRequestDMO getRequest, AsyncCallback<CreateResponseDMO> callback);

	void delete(DeleteRequestDMO getRequest, AsyncCallback<DeleteResponseDMO> callback);

	void action(ActionRequestDMO actionRequest, AsyncCallback<ActionResponseDMO> callback);

	void notify(NotifyRequestDMO notifyRequest, AsyncCallback<NotifyResponseDMO> callback);

	void denotify(DenotifyRequestDMO denotifyRequest, AsyncCallback<DenotifyResponseDMO> callback);

}
