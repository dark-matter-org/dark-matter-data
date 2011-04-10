package org.dmd.dmc;

import org.dmd.dmc.types.DmcTypeModifier;

/**
 * The DmcCacheIF should be implemented by entities that handle the controlled modification
 * of Dark Matter Objects. It is not unusual to have a single entity implement the DmcNameResolverIF
 * and the DmcCacheIF, although the interfaces are separated because some types of objects, for example
 * schema objects, may be resolvable by name, but not modifiable.
 * <P>
 * In it's current form, this interface is intended for use in conjunction with the DmcOmni backref
 * tracking mechanisms. If backref tracking has been activated, you may also register a DmcCacheIF
 * with the DmcOmni so that when the cache deletes an object with backrefs (via the youAreDeleted()
 * method), the object will call on the cache to apply the backref modifiers to the associated
 * referring objects. If no DmcCacheIF is available, the object with the backrefs will apply
 * the backref modifiers directly to referring objects. 
 * <P>
 * By allowing for the intervention of a DmcCacheIF implementor, we allow for events to be generated
 * for the changes being made to the object references attributes in question. At the Dark Matter Core
 * level, however, there is no concept of events and thus no way to know how you'd like to be informed
 * when references are removed.
 */
public interface DmcCacheIF {

	/**
	 * Implementors should apply the specified modification to the referring object.
	 * @param referringObject The object that had referenced the deleted object.
	 * @param mods The modification that will remove the reference from the reference attribute.
	 * @throws DmcValueException 
	 * @throws DmcValueExceptionSet 
	 */
	public void applyModification(DmcNamedObjectIF referringObject, DmcTypeModifier mods) throws DmcValueExceptionSet, DmcValueException;
}
