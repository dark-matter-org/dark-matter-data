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
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.types.DmcTypeModifierMV;

/**
 * The ModifierValidationIF interface must be implemented by rules that are part
 * of the ModiferValidation RuleCategory.
 */
public interface ModifierValidationIF {

	/**
	 * Classes that implement this interface should determine whether or not the specified modification
	 * is legal in the context of the specified object and, potentially, on the basis of the other
	 * modifications being performed in the same operation.
	 * @param obj the being modified.
	 * @param mods the complete set of operations being performed.
	 * @param mod the particular modification to be validated.
	 * @throws DmcRuleExceptionSet
	 */
	public void validate(DmcObject obj, DmcTypeModifierMV mods, Modifier mod) throws DmcRuleExceptionSet;
}
