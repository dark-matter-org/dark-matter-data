package org.dmd.mvw.client.gxtforms.implementation;

import org.dmd.dmc.presentation.DmcChangeListenerIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.button.Button;

public class GxtCancelButton extends Button implements DmcChangeListenerIF {
	
	Listener<ButtonEvent>		listener;
	DmcPresentationTrackerIF	tracker;
	
	public GxtCancelButton(String label, DmcPresentationTrackerIF t){
		super(label);
		
		tracker = t;
		
		listener = new Listener<ButtonEvent>() {

			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select)
					tracker.reset();
			}
		};
		
		addListener(Events.Select, listener);
		
		tracker.addChangeListener(this);
		
		setEnabled(false);
	}

	@Override
	public void isChanged(boolean changed) {
		System.out.println("Cancel button isChanged() " + changed);
		setEnabled(changed);
	}

}
