package org.dmd.dms.generated.editors;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dms.generated.types.DmcTypeStringSV;

@SuppressWarnings("serial")
public class StringSVEditor extends DmcTypeStringSV {
	
	DmcTypeStringSV	existingValue;
	
	public StringSVEditor(DmcTypeStringSV ev){
		existingValue = ev;
		if (existingValue != null)
			value = existingValue.getSVCopy();
	}
	
	public void setEmpty(){
		value = null;
	}
	
	public boolean hasValue(){
		if (value == null)
			return(false);
		return(true);
	}
	
	public void reset(){
		if (existingValue == null)
			value = null;
		else
			value = existingValue.getSVCopy();
	}
	
	public boolean valueChanged(){
		boolean rc = false;
		
		if (existingValue == null){
			if (value != null)
				rc = true;
		}
		else{
			if (value == null)
				rc = true;
			else{
				if (!existingValue.getSV().equals(value))
					rc = true;
			}
		}
		
		return(rc);
	}
	
	public void addMods(DmcTypeModifierMV mods){
		try {
			if (existingValue == null){
				if (value != null)
					mods.add(new Modifier(ModifyTypeEnum.SET, this));
			}
			else{
				if (value == null)
					mods.add(new Modifier(ModifyTypeEnum.REM, attrInfo));
				else
					mods.add(new Modifier(ModifyTypeEnum.SET, this));
			}
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
		}
	}

}
