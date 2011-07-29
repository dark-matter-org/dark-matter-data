package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types.adapters;

import org.dmd.dmc.DmcAdapterIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.types.DmcTypeUserGroupREFSV;

@SuppressWarnings("serial")
// org.dmd.dms.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:51)
// Called from: org.dmd.dms.util.AdapterFormatter.dumpAdapterSV(AdapterFormatter.java:13)
public class UserGroupREFSVAdapter extends DmcTypeUserGroupREFSV implements DmcAdapterIF {

    DmcTypeUserGroupREFSV existingValue;

    public UserGroupREFSVAdapter(DmcAttributeInfo ai){
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
    	existingValue = (DmcTypeUserGroupREFSV) attr;
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

