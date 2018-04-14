package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.ActionCancelRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ActionCancelResponseDMO;
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

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The asynchronous counterpart of <code>DMPService</code>.
 */
public interface DMPServiceAsync {
	
	/**
	 * Allows for sending a request for data from the server before the user has authenticated.
	 * This is useful for populating login screens with server specific info.
	 * @param preathRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void preauth(PreAuthRequestDMO preathRequest, AsyncCallback<PreAuthResponseDMO> callback);
  
	/**
	 * Performs the login operation. 
	 * @param loginRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void login(LoginRequestDMO loginRequest, AsyncCallback<LoginResponseDMO> callback);

	/**
	 * Performs the logout of a user.
	 * @param logoutRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void logout(LogoutRequestDMO logoutRequest, AsyncCallback<LogoutResponseDMO> callback);

	/**
	 * Retrieves one or more objects from the server and may register for event notifications.
	 * @param getRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void get(GetRequestDMO getRequest, AsyncCallback<GetResponseDMO> callback);

	/**
	 * Alters an existing named object.
	 * @param setRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void set(SetRequestDMO setRequest, AsyncCallback<SetResponseDMO> callback);

	/**
	 * Creates a new object.
	 * @param createRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void create(CreateRequestDMO createRequest, AsyncCallback<CreateResponseDMO> callback);

	/**
	 * Deletes an existing named object.
	 * @param deleteRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void delete(DeleteRequestDMO deleteRequest, AsyncCallback<DeleteResponseDMO> callback);

	/**
	 * Performs some application specific action.
	 * @param actionRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void action(ActionRequestDMO actionRequest, AsyncCallback<ActionResponseDMO> callback);

	/**
	 * Cancels a running action.
	 * @param actionCancelRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void actionCancel(ActionCancelRequestDMO actionCancelRequest, AsyncCallback<ActionCancelResponseDMO> callback);

	/**
	 * Allows for registration of interest in events associated with objects.
	 * @param notifyRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void notify(NotifyRequestDMO notifyRequest, AsyncCallback<NotifyResponseDMO> callback);

	/**
	 * Deregisters for event notification.
	 * @param denotifyRequest The request.
	 * @param callback The callback to handle the response.
	 */
	void denotify(DenotifyRequestDMO denotifyRequest, AsyncCallback<DenotifyResponseDMO> callback);

	/**
	 * Allows for the processing of application specific requests.
	 * @param request The request.
	 * @param callback The callback to handle the response.
	 */
	void otherRequest(RequestDMO request, AsyncCallback<ResponseDMO> callback);

}
