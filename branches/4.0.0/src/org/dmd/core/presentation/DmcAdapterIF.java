package org.dmd.core.presentation;

import org.dmd.core.DmcAttribute;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;

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
