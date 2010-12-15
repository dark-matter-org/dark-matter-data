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
