//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.templates.shared.generated.types.adapters;

import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.templates.shared.generated.types.DmcTypeSectionREFMAP;

@SuppressWarnings("serial")
// org.dmd.dms.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:59)
// Called from: org.dmd.dms.util.AdapterFormatter.dumpAdapterMAP(AdapterFormatter.java:24)
public class SectionREFMAPAdapter extends DmcTypeSectionREFMAP implements DmcAdapterIF {

    transient DmcTypeSectionREFMAP existingValue;

    public SectionREFMAPAdapter(DmcAttributeInfo ai){
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
    		value = existingValue.getMVCopy();
    }

    public void setExisting(DmcAttribute<?> attr) {
    	existingValue = (DmcTypeSectionREFMAP) attr;
    	if (existingValue != null)
    		value = existingValue.getMVCopy();
    }

    public boolean valueChanged(){
    	   return(valueChangedMV(existingValue, this));
    }

    public void addMods(DmcTypeModifierMV mods){
    	   addModsMV(mods, existingValue, this);
    }

    public DmcAttribute<?> getExisting() {
    	   return(existingValue);
    }

    public Object getValue() {
    	   return(value);
    }

}

