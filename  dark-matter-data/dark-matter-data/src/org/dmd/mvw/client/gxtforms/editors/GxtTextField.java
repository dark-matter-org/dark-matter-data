package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;

import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.form.TextField;

public class GxtTextField extends TextField<String> implements DmcPresentationIF {
	
	// Our Unique ID assigned by the tracker
	int							ID;
	
	// Whether or not we're mandatory
	boolean 					mandatory;
	
	// Our attribute value adapter that also contains the original value (if any)
	DmcAdapterIF				adapter;
	
	// A convenience handle to the adapter cast to an attribute
	DmcAttribute<?>				attribute;
	
	// The thing that may be tracking our state of readiness
	DmcPresentationTrackerIF	tracker;
	
	// This is only set if we're handling an indexed attribute, otherwise it's -1
	int							attrIndex;

	// Listener for changes in our field value - we actually listen to all key up events
	Listener<FieldEvent>		listener;
	
	// We hang on to our initial value in case we have the situation where we are marked
	// as invalid (because of a validator). If we're invalid, we won't alter the adapter
	// and thus we have to determine ourselves if our value has changed so that we can
	// correctly answer the tracker through the valueChanged() method.
	String						initialValue;

	DmcObject					DMO;

	public GxtTextField(){
		attrIndex = -1;
		
		setLabelStyle(LabelStyle.style);

		listener = new Listener<FieldEvent>(){
			@Override
			public void handleEvent(FieldEvent be) {
				
				if (be.getType() == Events.KeyUp){
					if (attrIndex >= 0){
						if (getValue() == null){
							if (isValid()){
								try {
									attribute.setMVnth(attrIndex, null);
									READY();
//									System.out.println("GxtTextField: setMVnth " + attrIndex + " null READY");
										
								} catch (DmcValueException e) {
									throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): null",e));
								}								
							}
							else {
								NOTREADY();
							}
						}
						else{
							if (isValid()){
								try {
									attribute.setMVnth(attrIndex, getValue());
									READY();
									System.out.println("GxtTextField: setMVnth " + attrIndex + " " + getValue() + " READY");
								} catch (DmcValueException e) {
									throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): " + getValue(),e));
								}
							}
							else{
								NOTREADY();
								System.out.println("GxtTextField: invalid value: " + attrIndex + " " + getValue() + " NOT READY");
							}
						}
					}
					else{
						if (getValue() == null){
							if (isValid()){
								adapter.setEmpty();
								READY();
							}
							else
								NOTREADY();
						}
						else{
							if (isValid()){
								try {
									attribute.set(getValue());
//									System.out.println("GxtTextField: value in attribute: " + attribute.getSV());
									READY();
//									System.out.println("GxtTextField: updating value: " + getValue() + " READY");
								} catch (DmcValueException e) {
									throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on set(): " + getValue(),e));
								}
							}
							else{
								NOTREADY();
//								System.out.println("GxtTextField: invalid value: " + getValue() + " NOT READY");
							}
						}
					}
				} // key up
			} // handleEvent
		};
		
		addListener(Events.KeyUp, listener);
		
		setAutoValidate(true);
		
	}
	
	void READY(){
		if (tracker != null)
			tracker.isReady(this);
	}
	
	void NOTREADY(){
		if (tracker != null)
			tracker.isNotReady(this);
	}

	@Override
	public void setAdapter(DmcAdapterIF adapter) {
		this.adapter 	= adapter;
		attribute 		= (DmcAttribute<?>) adapter;
		setDisplayValue();
	}
	
	void setDisplayValue(){
		if (attribute.getAttributeInfo().indexSize == 0){
			if (attribute.getSV() == null){
				setValue(null);
				initialValue = null;
			}
			else{
				setValue(attribute.getSV().toString());
				initialValue = getValue();
			}
		}
		else{
			Object val = attribute.getMVnth(attrIndex);
			if (val == null){
				setValue(null);
				initialValue = null;
			}
			else{
				setValue(attribute.getMVnth(attrIndex).toString());
				initialValue = getValue();
			}
		}
		
	}

	@Override
	public void setLabel(String label) {
		if (attrIndex >= 0){
			int display = attrIndex+1;
			setFieldLabel(label + " " + display);
		}
		else
			setFieldLabel(label);
	}

	@Override
	public void setMandatory(boolean m) {
		mandatory = m;
		if (mandatory)
			setAllowBlank(false);
		else
			setAllowBlank(true);
		
		boolean v = isValid();
		if (v)
			READY();
		else
			NOTREADY();
	}

	@Override
	public DmcAdapterIF getAdapter() {
		return(adapter);
	}

	@Override
	public boolean isReady(){
		// If we're disabled, assume we're "ready" - this prevents problems with fields that are marked
		// as mandatory but their enable/disable state is controlled by, perhaps, a checkbox. While they
		// are disabled, that don't affect the tracker's ready state.
		if (!super.isEnabled())
			return(true);
		
		// At this stage, we may or may not have been rendered. If we're not rendered, the
		// isValid() will always be false, and that's not what we want. If we have a validator,
		// we will call it directly.
		if (mandatory && (getValue() == null)){
//			System.out.println(attribute.getName() + " is mandatory but has no value FALSE");
			return(false);
		}
		
		if (getValidator() == null){
//			System.out.println(attribute.getName() + " has no validator, anything goes TRUE");
			return(true);
		}
		
		if (!rendered){
			if (getValidator().validate(this, getValue()) == null){
				DEBUG(attribute.getName() + " is not rendered, but validation ok TRUE");
				return(true);
			}
			DEBUG(attribute.getName() + " is not rendered, but validation failed FALSE");
			return(false);
		}
			
		DEBUG(attribute.getName() + " isValid() = " + isValid() +"\n");
		
		if(isValid())
			return true;
		
		return(false);
	}

	@Override
	public void setTracker(DmcPresentationTrackerIF t, int id) {
		tracker = t;
		ID = id;
	}
	
	@Override
	public void setReadOnly(boolean readonly){
		// NOTE: had to overload this because the x-form-readonly style is missing and the
		// field still appears editable but won't accept user input, which is confusing
		if (readonly)
			setEnabled(false);
		else
			setEnabled(true);
	}

	@Override
	public boolean valueChanged(){
		// If we're disabled, don't take our changed state into account
		if (!super.isEnabled())
			return(false);
		
		boolean rc = adapter.valueChanged();
		if (rc)
			return(rc);
		
		if (getValue() == null){
			if (initialValue != null)
				rc = true;
		}
		else{
			if (initialValue == null)
				rc = true;
			else if (!getValue().equals(initialValue))
				rc = true;
		}
			
		return(rc);
	}

	@Override
	public void setValueIndex(int index) {
		attrIndex = index;
	}

	@Override
	public int getID() {
		return(ID);
	}

	@Override
	public void resetToExisting() {
		adapter.resetToExisting();
		setDisplayValue();
	}
	
	/**
	 * We override this to clear any outstanding invalid flags on the field when it is disabled.
	 * Otherwise, the invalid stuff remains even when the field is disabled.
	 */
	@Override
	public void setEnabled(boolean enabled){
		super.setEnabled(enabled);
		if (enabled){
			isValid();
		}
		else{
			clearInvalid();
			READY();
		}
	}
	
	/**
	 * We've overridden this to allow for altering whether or not a field is mandatory on the fly.
	 * When you change the mandatory state, call isValid() and we'll let the tracker know if we're
	 * ready or not.
	 */
	@Override
	public boolean isValid(){
		boolean rc = super.isValid();
		
		if (rc)
			READY();
		else
			NOTREADY();
		
		return(rc);
	}
	
	void DEBUG(String msg){
		if (tracker.debug())
			System.out.println(msg);
	}
	
	@Override
	public String getLabel() {
		return(getFieldLabel());
	}
		
	@Override
	public void setDMO(DmcObject dmo) {
		DMO = dmo;
	}

	@Override
	public DmcObject getDMO() {
		return(DMO);
	}
		

}
