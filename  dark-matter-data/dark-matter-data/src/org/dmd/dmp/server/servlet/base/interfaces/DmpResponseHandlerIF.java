//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dmp.server.servlet.base.interfaces;

import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.extended.Response;

/**
 * The ResponseHandlerIF interface defines a component that can handle the 
 * response that results when a RequestProcessorIF has finished its processing.
 */
public interface DmpResponseHandlerIF {

	/**
	 * This is called when a response is ready for handling. This method may be
	 * called multiple times, depending on the nature of the original request.
	 * @param request the original request.
	 * @param response the resulting response.
	 */
	public void handleResponse(Request request, Response response);
}
