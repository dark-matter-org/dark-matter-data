package org.dmd.dmc.presentation;

import org.dmd.dmc.DmcObject;



/**
 * The DmcPresentationIF is generally implemented by widgets that present attribute values
 * in some form that may allow for editting/alteration by the user. Such presentations 
 * usually have a variety of common characteristics e.g. labels, tool tips, an indication
 * that the value is mandatory/option etc.
 * <p />
 * Whatever presentation mechanism you use must be bound to the attribute that it's
 * presenting, and this is achieved through the DmcAdapterIF. Each defined type has a
 * generated adapter that implements the DmcAdapterIF (generated.types.adapters). The adapter
 * has standard mechanisms to hold an existing attribute from a DMO and allow the presenter
 * to make modifications to the value(s) in the adapter derivation. When edits are finished,
 * the adapter can determine the modifications that have been made and add them to a 
 * DmcTypeModifierMV which can sent for processing via a Dark Matter Protocol SetRequest.
 * <p />
 * Finally, the presentation's "readiness" can be tracked by a component that implements
 * the DmcPresentationTrackerIF interface. Exactly what "readiness" is is implementation specific,
 * but is often related to whether or not the presentation contains a permissible value,
 * whether it's a mandatory value and value has been provided etc. The tracker can then 
 * do things like enabling/disabling buttons, other anything else that depends on a
 * set of presentations being "ready".
 */
public interface DmcPresentationIF {
	
	/**
	 * Sets the label to be associated with this presentation.
	 * @param label
	 */
	public void setLabel(String label);
	
	/**
	 * @return The label of this presentation component.
	 */
	public String getLabel();
	
	/**
	 * Sets the tool tip to be associated with this presentation.
	 * @param tooltip
	 */
	public void setToolTip(String tooltip);
	
	/**
	 * Sets an indication of whether or not the attribute being presented is mandatory
	 * or not. This value may change during the lifetime of a presentation.
	 * @param mandatory true if it's mandatory and false otherwise.
	 */
	public void setMandatory(boolean mandatory);
	
	/**
	 * Sets whether or not the presentation is edittable.
	 * @param readonly true if we're read only and false otherwise.
	 */
	public void setReadOnly(boolean readonly);
	
	/**
	 * Sets the adapter associated with the attribute being displayed. The existing value
	 * of the adapter may be null, but the adapter is always an instance of the type of
	 * attribute being presented. 
	 * @param adapter the adapter.
	 */
	public void setAdapter(DmcAdapterIF adapter);

	/**
	 * @return the adapter.
	 */
	public DmcAdapterIF getAdapter();
	
	/**
	 * @return true if you're in a state of "readiness".
	 */
	public boolean isReady();
	
	/**
	 * This allows a DmcPresentationTrackerIF implementor to trigger validation on
	 * all of its bindings and have them indicate if they're ready or not ready. The
	 * exact mechanism of checking validity is implementation specific.
	 * @return true if the binding is valid and false otherwise
	 */
	public boolean isValid();
	
	/**
	 * Sets the tracker that keeps tabs on whether or not all presentation components
	 * are in a ready state. Your presentation implementation should call the tracker's
	 * isReady() or isNotReady() methods when its readiness state changes.
	 * @param t The tracker component.
	 * @param id A uniquely assigned identifier that you must return via the getID() method.
	 */
	public void setTracker(DmcPresentationTrackerIF t, int id);
	
	/**
	 * @return the identifier that was assigned when setTracker() was called.
	 */
	public int getID();
	
	/**
	 * When this method is called, the presentation should have its adapter resetToExisting()
	 * and display the original value. This supports things like being able to cancel a set
	 * of modifications.
	 */
	public void resetToExisting();
	
	/**
	 * This aspect is more tricky than it might first appear. Although the adapter has a
	 * valueChanged() method on it that could be used by a DmcPresentationTrackerIF component,
	 * that method can't take into account changes in the presentation state that are 
	 * caused by partial user input. For example, if you decide to present a multi-valued
	 * attribute as a comma separated set of values, and the user enters a comma at
	 * the end of your input component, the presentation has changed (and change listeners
	 * would be interested - for example to enable a Cancel button). However, because the input
	 * is only partial, you haven't altered the underlying adapter value.
	 * <p />
	 * So, this method should indicate whether or not the presentation has outwardly changed
	 * in any way.
	 * @return true if there have been any user interaction and false otherwise
	 */
	public boolean valueChanged();
	
	/**
	 * This method is used to set the state of the value presentation to enable or disable editting.
	 * @param flag true to enable editing and false otherwise
	 */
	public void setEnabled(boolean flag);
	
	/**
	 * For multi-valued attributes that have a specified index (indexed attributes), the attribute
	 * should be thought of as containing a predetermined number of slots that can either empty 
	 * (null) or have a value of the associated type. When a form binding is generated for an
	 * indexed attribute, it actually creates a separate editor instance for each possible index.
	 * When the editor (the component that implements the DmcPresentationIF interface) is initialized,
	 * it will be told which index of the attribute it is responsible for displaying/editting.
	 * @param index
	 */
	public void setValueIndex(int index);
	
	/**
	 * In cases where validation depends on relationships between attributes in an object,
	 * it's useful to have access to the object.
	 * @param dmo The associated DMO.
	 */
	public void setDMO(DmcObject dmo);
	
	/**
	 * @return the object previously set via setDMO.
	 */
	public DmcObject getDMO();
	
}
