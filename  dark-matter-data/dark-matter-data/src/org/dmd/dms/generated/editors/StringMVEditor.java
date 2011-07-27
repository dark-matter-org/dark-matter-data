package org.dmd.dms.generated.editors;

import java.util.Collections;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dms.generated.types.DmcTypeStringMV;

@SuppressWarnings("serial")
public class StringMVEditor extends DmcTypeStringMV {
	
	DmcTypeStringMV	existingValue;
	
	public StringMVEditor(DmcTypeStringMV ev){
		existingValue = ev;
		if (existingValue != null)
			value = existingValue.getMVCopy();
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
			value = existingValue.getMVCopy();
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
				if (attrInfo.indexSize == 0){
					if (existingValue.getMVSize() != getMVSize())
						rc = true;
					else{
						for(int i=0; i<getMVSize(); i++){
							if (!existingValue.contains(getMVnth(i))){
								rc = true;
								break;
							}
						}
					}
				}
				else{
					for(int i=0; i<attrInfo.indexSize; i++){
						Object existing = existingValue.getMVnth(i);
						Object current  = getMVnth(i);
						
						if (existing == null){
							if (current != null){
								rc = true;
								break;
							}
						}
						else{
							if (current == null){
								rc = true;
								break;
							}
							else{
								if (!existing.equals(current))
									rc = true;
							}
						}
					}
				}
					
			}
		}
		
		return(rc);
	}
	
	public void addMods(DmcTypeModifierMV mods){
		try {
			if (existingValue == null){
				if (value != null){
					if (attrInfo.indexSize == 0){
						for(int i=0; i<getMVSize(); i++){
							DmcAttribute<?> mod = getNew();
							mod.add(getMVnth(i));
							mods.add(new Modifier(ModifyTypeEnum.ADD, mod));
						}
					}
					else{
						for(int i=0; i<getMVSize(); i++){
							if (getMVnth(i) != null){
								DmcAttribute<?> mod = getNew();
								mod.add(getMVnth(i));
								mods.add(new Modifier(ModifyTypeEnum.ADD, mod));
							}
						}
					}
					mods.add(new Modifier(ModifyTypeEnum.SET, this));
				}
			}
			else{
				if (value == null)
					mods.add(new Modifier(ModifyTypeEnum.REM, attrInfo));
				else{
					// Have to determine the delta
//					mods.add(new Modifier(ModifyTypeEnum.SET, this));
				}
			}
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Changes to the Modifier shouldn't throw an exception.", e));
		}
	}

}
