package org.dmd.features.extgwt.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;
import org.dmd.features.extgwt.generated.dmw.MvcMenuDMW;

public class MvcMenu extends MvcMenuDMW {

	protected MvcMenu(MvcMenuDMO obj, ClassDefinition cd) {
		super(obj, cd);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Returns the import for the default implementation of the menu type.
	 * This should be overridden in derived classes.
	 * @return
	 */
	public String getDefaultImport(){
		return(null);
	}
	
	/**
	 * Returns the class for the default implementation of the menu type.
	 * This should be overridden in derived classes.
	 * @return
	 */
	public String getDefaultClass(){
		return(null);
	}
	
	/**
	 * Returns the code for the instantiation of a local variable for this menu.
	 * @return
	 */
	public String getInstantiation(){
		return(null);
	}
	
}
