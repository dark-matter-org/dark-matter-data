package org.dmd.dmc;

import java.util.Iterator;


/**
 * The DmcDMOValidatorCollectionIF defines a collections validators that operate in the DMO
 * Operational Context i.e. they conform to the GWT JRE Emulation environment rules.
 */
public interface DmcDMOValidatorCollectionIF {

	public Iterator<DmcObjectValidator> getObjectValidators();
	
	public Iterator<DmcAttributeValidator>	getAttributeValidators();
}
