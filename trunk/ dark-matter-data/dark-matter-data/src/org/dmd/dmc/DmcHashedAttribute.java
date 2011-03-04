package org.dmd.dmc;

/**
 * The DmcHashedAttribute serves as the base for multi-valued attributes that can be stored
 * and accessed via a Map, either a HashMap, or a TreeMap. This derivation merely ensures that
 * the underlying values implement the DmcMappedAttributeIF interface.
 * <P>
 * Also, hashed attributes are inherently multi-valued. The set() mechanism is disabled and will
 * throw an exception if you try to use it on a hashed attribute. You may only use the add() and
 * del() functions on a hashed attribute.
 */
@SuppressWarnings("serial")
public abstract class DmcHashedAttribute<E extends DmcMappedAttributeIF> extends DmcAttribute<E> {

	@Override
	public void set(Object value) throws DmcValueException {
		throw(new DmcValueException(getName(), "A hashed attribute doesn't suport the set() method."));
	}
	
}
