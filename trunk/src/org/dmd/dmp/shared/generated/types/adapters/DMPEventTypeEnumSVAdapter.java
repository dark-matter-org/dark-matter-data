package org.dmd.dmp.shared.generated.types.adapters;

import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmp.shared.generated.types.DmcTypeDMPEventTypeEnumSV;

@SuppressWarnings("serial")
// org.dmd.dms.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:50)
// Called from: org.dmd.dms.util.AdapterFormatter.dumpAdapterSV(AdapterFormatter.java:12)
public class DMPEventTypeEnumSVAdapter extends DmcTypeDMPEventTypeEnumSV implements DmcAdapterIF {

    transient DmcTypeDMPEventTypeEnumSV existingValue;

    public DMPEventTypeEnumSVAdapter(DmcAttributeInfo ai){
    	   super(ai);
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
    	existingValue = (DmcTypeDMPEventTypeEnumSV) attr;
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
    public DmcAttribute<?> getExisting() {
    	   return(existingValue);
    }

    @Override
    public Object getValue() {
    	   return(value);
    }

}
