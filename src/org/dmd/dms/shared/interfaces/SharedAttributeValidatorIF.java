package org.dmd.dms.shared.interfaces;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;

/**
 * The SharedAttributeValidatorIF interface defines a validation class that can be used
 * on both client and server. Classes that implement this interface can be used
 * to provide validation logic as part of a schema specification.
 */
public interface SharedAttributeValidatorIF {

	@SuppressWarnings("unchecked")
	public void validate(DmcAttribute attr) throws DmcValueException;
	
}
