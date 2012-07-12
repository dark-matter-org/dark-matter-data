package org.dmd.dms.shared.interfaces;

import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.util.DmcUncheckedObject;

/**
 * The UCOValidationIF interface is implemented by rules that perform validation of
 * DmcUncheckedObjects that are read from Object Instance Format (OIF) files.
 */
public interface UCOValidationIF {

	/**
	 * Implementors of this interface must overload this method to perform whatever
	 * validation logic is required. If the object fails to pass the validation a
	 * DmcRuleExceptionSet should be thrown.
	 * @param obj the object to be validated.
	 * @throws DmcRuleExceptionSet
	 */
	public void validate(DmcUncheckedObject obj) throws DmcRuleExceptionSet;

}
