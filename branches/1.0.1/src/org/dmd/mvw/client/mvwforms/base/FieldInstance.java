package org.dmd.mvw.client.mvwforms.base;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;

/**
 * The FieldInstance provides a common base for the presentation, editting and determination
 * of changes to an attribute associated with a Dark Matter Object (DMO). No assumptions are
 * made about how the field is presented i.e. what type of widgets are used; that is up to
 * whoever creates the form implementation for a particular widget set. At this level, we are
 * only concerned with providing a consistent interface to a "field".
 * <p />
 * The decision was made to define the various classes associated with form binding as
 * orthogonal to those related to presentation so that common functionality for a particular
 * implementation of forms could be encapsulated in base classes that had nothing to do
 * with the widgets i.e. the widgets are wrapped by the field implementations. This approach
 * gives the best flexibility and reduction in duplicate code.
 */
abstract public class FieldInstance {
	
	// The attribute definition
	DmcAttributeInfo	attrinfo;
	
	// This is the current value of the attribute as retrieved from the DMO. If the attribute
	// doesn't exist, this will be null. This version of the attribute is not available in
	// derived classes; all changes must be made via the newValue.
	DmcAttribute<?>	currentValue;
	
	protected DmcAttribute<?>	newValue;
	
	/**
	 * 
	 * @param ai
	 * @param label
	 * @param tooltip
	 * @param mandatory
	 */
	protected FieldInstance(DmcAttributeInfo ai, String label, String tooltip, boolean mandatory){
		attrinfo = ai;
	}
	
	/**
	 * This method is called after the field is constructed by the generated code that creates
	 * the FieldInstance. THIS METHOD SHOULD NOT BE CALLED IN OTHER CIRCUMSTANCES! 
	 */
	public void setNewValueHolder(){
		
	}

	/**
	 * Sets the value to be displayed in this field. Exactly how this is done is
	 * implementation specific.
	 * @param value The attribute to be displayed.
	 */
	abstract public void setValue(DmcAttribute<?> value);
	
}
