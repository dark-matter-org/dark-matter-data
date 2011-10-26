package org.dmd.mvw.client.gxtforms.implementation;

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
	
	final GxtTextField			instance;
	boolean 					mandatory;
	DmcAdapterIF				adapter;
	DmcPresentationTrackerIF	tracker;
	
	// A convenience handle to the adapter cast to an attribute
	DmcAttribute<?>				attribute;
	
	// This is only set if we're handling an indexed attribute, otherwise it's -1
	int							attrIndex;

	Listener<FieldEvent>		listener;
	
	DmcObject					DMO;

	public GxtTextField(){
		instance = this;
		attrIndex = -1;

		listener = new Listener<FieldEvent>(){
			
			@Override
			public void handleEvent(FieldEvent be) {
				
				if (be.getType() == Events.KeyUp){
					if (attrIndex >= 0){
						if (getValue() == null){
							try {
								attribute.setMVnth(attrIndex, null);
								READY();
								System.out.println("GxtTextField: setMVnth " + attrIndex + " null READY");
									
							} catch (DmcValueException e) {
								throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): null",e));
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
									READY();
									System.out.println("GxtTextField: updating value: " + getValue() + " READY");
								} catch (DmcValueException e) {
									throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on set(): " + getValue(),e));
								}
							}
							else{
								NOTREADY();
								System.out.println("GxtTextField: invalid value: " + getValue() + " NOT READY");
							}
						}
					}
					
										
				} // key up
				
			}
			
		};
		
		addListener(Events.KeyUp, listener);
		
		setAutoValidate(true);
		
	}
	
	void READY(){
		if (tracker != null)
			tracker.isReady(instance);
	}
	
	void NOTREADY(){
		if (tracker != null)
			tracker.isNotReady(instance);
	}

	@Override
	public void setAdapter(DmcAdapterIF adapter) {
		this.adapter 	= adapter;
		attribute 		= (DmcAttribute<?>) adapter;
		setDisplayValue();
	}
	
	void setDisplayValue(){
		if (attribute.getAttributeInfo().indexSize == 0){
			if (attribute.getSV() != null)
				setValue(attribute.getSV().toString());
		}
		else{
			Object val = attribute.getMVnth(attrIndex);
			if (val == null)
				setValue(null);
			else
				setValue(attribute.getMVnth(attrIndex).toString());
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
	}

	@Override
	public DmcAdapterIF getAdapter() {
		return(adapter);
	}

	@Override
	public boolean isReady(){
		// At this stage, we may or may not have been rendered. If we're not rendered, the
		// isValid() will always be false, and that's not what we want. If we have a validator,
		// we will call it directly.
		if (mandatory && (getValue() == null)){
			System.out.println(attribute.getName() + " is mandatory but has no value FALSE");
			return(false);
		}
		
		if (getValidator() == null){
			System.out.println(attribute.getName() + " has no validator, anything goes TRUE");
			return(true);
		}
		
		if (!rendered){
			if (getValidator().validate(this, getValue()) == null){
				System.out.println(attribute.getName() + " is not rendered, but validation ok TRUE");
				return(true);
			}
			System.out.println(attribute.getName() + " is not rendered, but validation failed FALSE");
			return(false);
		}
			
		
		System.out.println(attribute.getName() + " isValid() = " + isValid());
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
	public boolean valueChanged() {
		return(adapter.valueChanged());
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
