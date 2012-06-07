package org.dmd.dmc.presentation;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
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
	
	public DmcAttribute<?> getExisting();
	
	public void resetToExisting();
	
	public void addMods(DmcTypeModifierMV mods);
	
	public DmcAttributeInfo getAttributeInfo();
}
