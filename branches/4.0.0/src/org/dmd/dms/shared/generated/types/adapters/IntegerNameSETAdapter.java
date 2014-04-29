package org.dmd.dms.shared.generated.types.adapters;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:62)
import org.dmd.core.DmcAttribute;                                        //  - (AdapterFormatter.java:52)
import org.dmd.core.presentation.DmcAdapterIF;                           //  - (AdapterFormatter.java:51)
import org.dmd.core.schema.DmcAttributeInfo;                             //  - (AdapterFormatter.java:53)
import org.dmd.dms.shared.generated.types.DmcTypeIntegerNameSET;         //  - (AdapterFormatter.java:60)
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;             //  - (AdapterFormatter.java:54)


@SuppressWarnings("serial")
// org.dmd.dms.tools.generation.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:65)
// Called from: org.dmd.dms.tools.generation.util.AdapterFormatter.dumpAdapterSET(AdapterFormatter.java:22)
public class IntegerNameSETAdapter extends DmcTypeIntegerNameSET implements DmcAdapterIF {

    transient DmcTypeIntegerNameSET existingValue;

    public IntegerNameSETAdapter(DmcAttributeInfo ai){
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
    		value = existingValue.getMVCopy();
    }

    @Override
    public void setExisting(DmcAttribute<?> attr) {
    	existingValue = (DmcTypeIntegerNameSET) attr;
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
    public DmcAttribute<?> getExisting() {
    	   return(existingValue);
    }

    @Override
    public Object getValue() {
    	   return(value);
    }

}

