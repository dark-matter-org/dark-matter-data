package org.dmd.dmc;

/**
 * The DmcListenerManagerIF interface defines an entity that can manage a set of 
 * attribute change listeners and notify them of changes to an object.
 */
public interface DmcListenerManagerIF {
	
	/**
	 * Adds an attribute change listener.
	 * @param listener
	 */
	public void addAttributeChangeListener(DmcAttributeChangeListenerIF listener);
	
	/**
	 * Removes an attribute change listener.
	 * @param listener
	 */
	public void removeAttributeChangeListener(DmcAttributeChangeListenerIF listener);

	/**
	 * This method is called by DmcContainer classes once they have instantiated the appropriate
	 * value holder for an attribute value to be set on an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param container The container being modified.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param value     The new value for the single-valued attribute.
	 */
	public void updateObjectSet(DmcContainerIF container, String an, Object existing, Object newvalue);
	
	/**
	 * This method is called by DmcContainer classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funnelling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param container The container being modified.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param value     The new value being added.
	 */
	public void updateObjectAdd(DmcContainerIF container, String an, Object existing, Object newvalue);
	
	/**
	 * This method is called by DmcContainer classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param container The container being modified.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param value     The value being deleted from the multi-valued attribute.
	 */
	public void updateObjectDel(DmcContainerIF container, String an, Object existing, Object newvalue);
	
	/**
	 * This method is called by DmcContainer classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param container The container being modified.
	 * @param an        The name of the attribute being removed from the object.
	 * @param existing  The existing value, or null if there wasn't one.
	 */
	public void updateObjectRem(DmcContainerIF container, String an, Object existing);

}
