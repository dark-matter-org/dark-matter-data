package org.dmd.mvw.client.gxtforms.implementation;

import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.dmc.presentation.DmcReadyListenerIF;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.button.Button;

public class GxtApplyButton extends Button implements DmcReadyListenerIF  {
	
	Listener<ButtonEvent>		listener;
	DmcPresentationTrackerIF	tracker;
	
	public GxtApplyButton(String label, DmcPresentationTrackerIF t){
		super(label);
		
		tracker = t;
		tracker.addReadyListener(this);
		
		listener = new Listener<ButtonEvent>() {

			@Override
			public void handleEvent(ButtonEvent be) {
				if (be.getType() == Events.Select)
					System.out.println("Button pressed");
				if (be.getType() == Events.Render){
					System.out.println("Button rendered");
					tracker.startTracking();
				}
			}
		};
		
		addListener(Events.Select, listener);
		addListener(Events.Render, listener);
	}

	@Override
	public void isReady(boolean ready) {
		System.out.println("Tracking button isReady() " + ready);
		setEnabled(ready);
	}

}
