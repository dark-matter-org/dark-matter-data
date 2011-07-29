package org.dmd.mvw.client.gxtforms.implementation;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;

import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

public class GxtTextField extends TextField<String> implements DmcPresentationIF {
	
	final GxtTextField			instance;
	boolean 					mandatory;
	DmcAdapterIF				adapter;
	DmcPresentationTrackerIF	tracker;
	
	DmcAttribute<?>				attribute;
	Listener<FieldEvent>		listener;

	public GxtTextField(){
		instance = this;
		mandatory = false;
		getImages().setInvalid(AbstractImagePrototype.create(GxtFormsResources.resources.blank16x16()));
//		getImages().setInvalid(AbstractImagePrototype.create(GxtFormsResources.resources.required()));
		
		invalidStyle = "";
		
		listener = new Listener<FieldEvent>(){
			
			@Override
			public void handleEvent(FieldEvent be) {
//				if (be.getType() == Events.Change){
//					System.out.println("OLD: " + be.getOldValue());
//					System.out.println("NEW: " + be.getValue());
//					
//					try {
//						if (getValue().length() == 0)
//							adapter.setEmpty();
//						else
//							attribute.set(getValue());
//					} catch (DmcValueException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				if (be.getType() == Events.KeyPress){
//					System.out.println("Key press");
//					if (getValue() == null){
//						getImages().setInvalid(AbstractImagePrototype.create(GxtFormsResources.resources.required()));
//						System.out.println("value was null");
//					}
//					else{
//						if (getValue().length() == 0){
//							System.out.println("value was null");
//							adapter.setEmpty();
//							getImages().setInvalid(AbstractImagePrototype.create(GxtFormsResources.resources.required()));
//							
//						}
//						else{
//							
//						}
//					}
//					System.out.println("Key press");
//				}
				
				if (be.getType() == Events.KeyUp){
					if (getValue() == null){
						System.out.println("value is null");
					}
					else{
						
						if (isValid())
							System.out.println("value is valid");
						else
							System.out.println("value is invalid");
					}
					
					if (isValid())
						tracker.isReady(instance);
					else
						tracker.isNotReady(instance);
					
				}
				
			}
			
		};
		
		addListener(Events.KeyUp, listener);
		
		setAutoValidate(true);
	}

	@Override
	public void setAdapter(DmcAdapterIF adapter) {
		this.adapter 	= adapter;
		attribute 		= (DmcAttribute<?>) adapter;
		
		if (attribute.getSV() != null)
			setValue(attribute.getSV().toString());
	}

	@Override
	public void setLabel(String label) {
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
	public boolean isReady() {
		if(isValid())
			return true;
		return(false);
	}

	@Override
	public void setTracker(DmcPresentationTrackerIF t) {
		tracker = t;
	}

	@Override
	public boolean valueChanged() {
		// TODO Auto-generated method stub
		return false;
	}
		
}
