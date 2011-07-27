package org.dmd.dmc;

/**
 * The DmcPresentationIF is generally implemented by 
 */
public interface DmcPresentationIF {
	
	public void setLabel(String label);
	
	public void setToolTip(String tooltip);
	
	public void setMandatory(boolean mandatory);
	
	public void setAdapter(DmcAdapterIF adapter);


}
