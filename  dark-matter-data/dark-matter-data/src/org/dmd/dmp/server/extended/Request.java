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

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.RequestDMW;
import org.dmd.dmp.shared.generated.dmo.RequestDMO;
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.dms.ClassDefinition;

abstract public class Request extends RequestDMW {

//	protected Request(DmcObject obj) {
//		super(obj);
//	}
	
	protected Request(RequestDMO obj, ClassDefinition cd) {
		super(obj,cd);
	}
	
	/**
	 * A convenience function to fill standard values in newly created response.
	 * @param response The response subclass.
	 * @throws DmcValueException
	 */
	protected void fillStandard(Response response) throws DmcValueException {
		response.setRequestID(getRequestID());
		response.setResponseType(ResponseTypeEnum.SUCCESS);
	}

}
