package org.dmd.dmc;

import org.dmd.dms.generated.types.DmcTypeModifierMV;

/**
 * The DmcAdapterIF is implemented by generated classes that support the
 * modification of attribute values via user interfaces. 
 */
public interface DmcAdapterIF {

	public void setEmpty();
	
	public boolean hasValue();
	
	public Object getValue();
	
	public boolean valueChanged();
	
	public void setExisting(DmcAttribute<?> attr);
	
	public void resetToExisting();
	
	public void addMods(DmcTypeModifierMV mods);
}
