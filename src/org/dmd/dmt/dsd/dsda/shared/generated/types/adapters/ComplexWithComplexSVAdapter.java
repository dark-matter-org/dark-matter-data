package org.dmd.dmt.dsd.dsda.shared.generated.types.adapters;

import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmt.dsd.dsda.shared.generated.types.DmcTypeComplexWithComplexSV;

@SuppressWarnings("serial")
// org.dmd.dms.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:59)
// Called from: org.dmd.dms.util.AdapterFormatter.dumpAdapterSV(AdapterFormatter.java:12)
public class ComplexWithComplexSVAdapter extends DmcTypeComplexWithComplexSV implements DmcAdapterIF {

    transient DmcTypeComplexWithComplexSV existingValue;

    public ComplexWithComplexSVAdapter(DmcAttributeInfo ai){
    	   super(ai);
    }

    public void setEmpty(){
    	   value = null;
    }

    public boolean hasValue(){
    	   if (value == null)
    		   return(false);
    	   return(true);
    }

    public void resetToExisting() {
    	if (existingValue == null)
    		value = null;
    	else
    		value = existingValue.getSVCopy();
    }

    public void setExisting(DmcAttribute<?> attr) {
    	existingValue = (DmcTypeComplexWithComplexSV) attr;
    	if (existingValue != null)
    		value = existingValue.getSVCopy();
    }

    public boolean valueChanged(){
    	   return(valueChangedSV(existingValue, this));
    }

    public void addMods(DmcTypeModifierMV mods){
    	   addModsSV(mods, existingValue, this);
    }

    public DmcAttribute<?> getExisting() {
    	   return(existingValue);
    }

    public Object getValue() {
    	   return(value);
    }

}

