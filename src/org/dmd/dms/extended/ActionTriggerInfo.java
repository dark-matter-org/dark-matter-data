//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms.extended;

import java.io.Serializable;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
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
public class ActionTriggerInfo extends ActionTriggerInfoDMO implements Serializable {

	protected ActionTriggerInfo(String oc, String an){
		super(oc);
		try {
			setName(an);
		} catch (DmcValueException e) {
			e.printStackTrace();
		}
		
	}
		
	public String getActionName(){
		return(getName().getNameString());
	}
	
	public void checkParams() throws DmcValueExceptionSet {
		throw(new IllegalStateException("This should have been overloaded in the generated derived class"));
	}
	
	public boolean isInstanceOf(DmcObject object) {
		throw(new IllegalStateException("This should have been overloaded in the generated derived class"));
	}
}
