package org.dmd.dmg.generated.types.adapters;

import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmg.generated.types.DmcTypeGeneratorSV;

@SuppressWarnings("serial")
// org.dmd.dms.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:50)
// Called from: org.dmd.dms.util.AdapterFormatter.dumpAdapterSV(AdapterFormatter.java:12)
public class GeneratorSVAdapter extends DmcTypeGeneratorSV implements DmcAdapterIF {

    DmcTypeGeneratorSV existingValue;

    public GeneratorSVAdapter(DmcAttributeInfo ai){
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
    		value = existingValue.getSVCopy();
    }

    @Override
    public void setExisting(DmcAttribute<?> attr) {
    	existingValue = (DmcTypeGeneratorSV) attr;
    	if (existingValue != null)
    		value = existingValue.getSVCopy();
    }

    @Override
    public boolean valueChanged(){
    	   return(valueChangedSV(existingValue, this));
    }

    @Override
    public void addMods(DmcTypeModifierMV mods){
    	   addModsSV(mods, existingValue, this);
    }

    @Override
    public Object getValue() {
    	   return(value);
    }

}

