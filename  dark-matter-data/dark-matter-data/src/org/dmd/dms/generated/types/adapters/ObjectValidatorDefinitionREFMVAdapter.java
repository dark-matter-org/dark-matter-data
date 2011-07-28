package org.dmd.dms.generated.types.adapters;

import org.dmd.dmc.DmcAdapterIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dms.generated.types.DmcTypeObjectValidatorDefinitionREFMV;

@SuppressWarnings("serial")
public class ObjectValidatorDefinitionREFMVAdapter extends DmcTypeObjectValidatorDefinitionREFMV implements DmcAdapterIF {

    DmcTypeObjectValidatorDefinitionREFMV existingValue;

    public ObjectValidatorDefinitionREFMVAdapter(DmcAttributeInfo ai){
    	   attrInfo = ai;
    }

    @Override
    public void setEmpty(){
    	   value = null;
    }

    @Override
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
    	existingValue = (DmcTypeObjectValidatorDefinitionREFMV) attr;
    	if (existingValue != null)
    		value = existingValue.getMVCopy();
    }

    @Override
    public boolean valueChanged(){
    	   return(valueChangedMV(existingValue, this));
    }

    @Override
    public void addMods(DmcTypeModifierMV mods){
    	   addModsMV(mods, existingValue, this);
    }

    @Override
    public Object getValue() {
    	   return(value);
    }

}

