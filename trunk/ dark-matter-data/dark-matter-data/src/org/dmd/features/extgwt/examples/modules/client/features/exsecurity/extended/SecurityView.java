package org.dmd.features.extgwt.examples.modules.client.features.exsecurity.extended;

import org.dmd.dmp.shared.generated.dmo.EventDMO;
import org.dmd.dmp.shared.generated.enums.EventTypeEnum;
import org.dmd.features.extgwt.examples.modules.client.features.exsecurity.generated.dmo.UserDMO;
import org.dmd.features.extgwt.examples.modules.client.features.exsecurity.generated.mvc.SecurityViewMVC;

import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.mvc.Controller;

public class SecurityView extends SecurityViewMVC {

	public SecurityView(Controller controller) {
		super(controller);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleCommonInitEvent(AppEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleServerEvent(EventDMO event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void handleMvcInitEventFrameworkEvent(AppEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void handleSecUserUpdate(EventTypeEnum etype, UserDMO obj) {
		// TODO Auto-generated method stub
		
	}


}
