package org.dmd.features.extgwt.client.util.menu;

import org.dmd.features.extgwt.client.interfaces.TriggerIF;
import org.dmd.features.extgwt.client.util.Action;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;

/**
 * The ItemSelectionListener provides a default handler for menu selection events that trigger an action.
 */
public class ItemSelectionListener<E extends ComponentEvent> extends SelectionListener<E> {
	
	TriggerIF 	trigger;
	Action		action;

	public ItemSelectionListener(TriggerIF t, Action a){
		trigger = t;
		action = a;
	}
	
	@Override
	public void componentSelected(E ce) {
		action.execute(trigger,ce);
	}

}
