package org.dmd.mvw.client.mvwforms.interfaces;

import org.dmd.dmc.DmcAttribute;

public interface FieldInstanceIF {
	
	public void setLabel(String label);
	
	public void setToolTip(String tooltip);
	
	public void setMandatory(boolean mandatory);
	
	public void setValue(DmcAttribute<?> value);

}
