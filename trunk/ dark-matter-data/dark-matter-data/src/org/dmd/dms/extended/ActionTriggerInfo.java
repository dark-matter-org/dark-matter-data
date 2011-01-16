package org.dmd.dms.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.ActionTriggerInfoDMO;

/**
 * The ActionTriggerInfo class simply provides a common base for the bundle
 * of information required to remotely trigger an action on an object. 
 * Derivatives of this class are generated as part of the DMO generation
 * process and have action specific interfaces to handle the paramters 
 * required by an action.
 * <P>
 * This mechanism is a replacement for the concept that ActionRequests were
 * EXTENSIBLE objects. This way, the user can ask an object for the 
 * ActionTriggerInfo (ATI) for a particular action and have a well defined
 * interface to specify the parameters for the action.
 */

@SuppressWarnings("serial")
public class ActionTriggerInfo extends ActionTriggerInfoDMO {

	protected ActionTriggerInfo(String oc, String an){
		super(oc);
		try {
			setName(an);
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getActionName(){
		return(getName());
	}
}
