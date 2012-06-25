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
package org.dmd.dms.shared.interfaces;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleExceptionSet;

/**
 * The ObjectValidationIF interface must be implemented by rules that are part
 * of the ObjectValidation RuleCategory.
 */
public interface ObjectValidationIF {

	/**
	 * Implementors of this interface must overload this method to perform whatever
	 * validation logic is required. If the object fails to pass the validation a
	 * DmcRuleExceptionSet should be thrown.
	 * @param obj the object to be validated.
	 * @throws DmcRuleExceptionSet
	 */
	public void validate(DmcObject obj) throws DmcRuleExceptionSet;
}
