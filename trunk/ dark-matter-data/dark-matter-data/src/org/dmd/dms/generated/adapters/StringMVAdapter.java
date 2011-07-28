package org.dmd.dms.generated.adapters;

import java.util.Collections;

import org.dmd.dmc.DmcAdapterIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dms.generated.types.DmcTypeStringMV;

@SuppressWarnings("serial")
public class StringMVAdapter extends DmcTypeStringMV implements DmcAdapterIF {
	
	DmcTypeStringMV	existingValue;
	
	public StringMVAdapter(DmcAttributeInfo ai){
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
		existingValue = (DmcTypeStringMV) attr;
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

}
