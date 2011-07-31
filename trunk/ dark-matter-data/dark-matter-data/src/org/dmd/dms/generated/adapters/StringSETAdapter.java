package org.dmd.dms.generated.adapters;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dms.generated.types.DmcTypeStringSET;

@SuppressWarnings("serial")
public class StringSETAdapter extends DmcTypeStringSET implements DmcAdapterIF {
	
	DmcTypeStringSET	existingValue;
	
	public StringSETAdapter(DmcAttributeInfo ai){
		attrInfo = ai;
	}

	public void setEmpty(){
		value = null;
	}
	
	public boolean hasValue(){
		if (value == null)
			return(false);
		return(true);
	}
	
	@Override
	public void resetToExisting() {
		if (existingValue == null)
			value = null;
		else
			value = existingValue.getMVCopy();
	}

	@Override
	public void setExisting(DmcAttribute<?> attr) {
		existingValue = (DmcTypeStringSET) attr;
		if (existingValue != null)
			value = existingValue.getMVCopy();
	}

	public boolean valueChanged(){
		return(valueChangedMV(existingValue, this));
	}
	
	public void addMods(DmcTypeModifierMV mods){
		addModsMV(mods, existingValue, this);
	}

	@Override
	public Object getValue() {
		return(value);
	}

	@Override
	public DmcAttribute<?> getExisting() {
		// TODO Auto-generated method stub
		return null;
	}

}
