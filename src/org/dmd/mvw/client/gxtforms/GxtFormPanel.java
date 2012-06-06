package org.dmd.mvw.client.gxtforms;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.form.FormPanel;

/**
 * The GxtFormPanel provides some additional features beyond the base FormPanel,
 * including immediate validation of fields so that mandatory fields are visible
 * at first rendering.
 */
public class GxtFormPanel extends FormPanel {
	
	Listener<ComponentEvent>	listener;
	
	public GxtFormPanel(){
		listener = new Listener<ComponentEvent>() {
			@Override
			public void handleEvent(ComponentEvent event) {
				if (event.getType() == Events.Render)
					isValid();
			}
		};
		
		addListener(Events.Render, listener);

	}

}
