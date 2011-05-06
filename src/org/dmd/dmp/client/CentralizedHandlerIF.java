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
package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

/**
 * The CentralizedHandlerIF interface allows you to coordinate handling of requests
 * and their responses through a centralized communications manager. When creating
 * the callback for a particular type of request, simply use the constructor that
 * takes this interface as argument. The implementing class will be notified as 
 * requests complete or if they fail.
 */
public interface CentralizedHandlerIF {

	public void requestComplete(RequestDMO request, ResponseDMO response);
	
	public void requestFailed(Throwable caught, RequestDMO request);
}
