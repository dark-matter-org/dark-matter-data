package org.dmd.features.extgwt.client.util;

import java.util.ArrayList;

import org.dmd.features.extgwt.client.interfaces.ActionIF;
import org.dmd.features.extgwt.client.interfaces.TriggerIF;

/**
 * The Action class provides some base functionality for Actions.
 */
public abstract class Action implements ActionIF {
	
	ArrayList<TriggerIF> triggers;
	
	// The name of the action from the MvcAction definition
	String name;

	public Action(String n){
		name = n;
	}
	
	@Override
	public void addTrigger(TriggerIF t) {
		if(triggers == null)
			triggers = new ArrayList<TriggerIF>();
		triggers.add(t);
	}

	@Override
	public void removeTrigger(TriggerIF t) {
		if (triggers == null)
			return;
		
		triggers.remove(t);
	}

	public String getName(){
		return(name);
	}
	
	/**
	 * Sets the state of all associated triggers to be enabled or disabled.
	 * @param f True for enable and false for disabled.
	 */
	protected void setEnabled(boolean f){
		for(TriggerIF t: triggers){
			if (f)
				t.enable();
			else
				t.disable();
		}
	}
}
