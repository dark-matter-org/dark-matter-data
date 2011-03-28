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
package org.dmd.features.extgwt.examples.modules.client.features.exsecurity.extended;

import org.dmd.dmp.shared.generated.dmo.EventDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo.UserDMO;
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
	protected void handleSecUserUpdate(DMPEventTypeEnum etype, UserDMO obj) {
		// TODO Auto-generated method stub
		
	}


}
