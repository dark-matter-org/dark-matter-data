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
package org.dmd.dmc;


/**
 * The DmcObjectValidator class defines a base class for validation logic that deals
 * with an entire in a full Java operational context; it is not meant to validate objects
 * in a restricted operational context, such as a GWT client. 
 * <P>
 * The DmcObjectValidator works in conjunction with ObjectValidatorDefinitions in Dark Matter
 * Schema.
 */
abstract public class DmcObjectValidator {

	/**
	 * Implementing classes must override this function to perform whatever validation logic
	 * they require.
	 * @param obj the object to be validated.
	 * @throws DmcValueException
	 */
	abstract public void validate(DmcObject obj) throws DmcValueExceptionSet;
	
	abstract public String getName();

}
