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
package org.dmd.dmv.server.extended;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dmv.server.generated.dmw.RuleDMW;
import org.dmd.dmv.shared.generated.dmo.RuleDMO;

public abstract class Rule extends RuleDMW {

	protected Rule(RuleDMO obj, ClassDefinition cd) {
		super(obj, cd);
	}

	/**
	 * Derived classes must overload this method to perform validation logic
	 * against the specified object.
	 * @param schema The current set of loaded schemas.
	 * @param obj    The object to be validated.
	 */
	public abstract void applyRule(SchemaManager schema, DmcObject obj) throws DmcValueExceptionSet;

	/**
	 * Derived classes must overload this method to perform validation logic
	 * against the specific modification that applies to the attribute for which
	 * the rule is defined.
	 * @param schema
	 * @param obj
	 * @param modifier
	 */
	public abstract void applyRule(SchemaManager schema, DmcObject obj, DmcTypeModifier modifier) throws DmcValueExceptionSet;
}
