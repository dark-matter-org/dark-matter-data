package org.dmd.dms.shared.generated.types.adapters;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:62)
import org.dmd.core.DmcAttribute;                                            //  - (AdapterFormatter.java:52)
import org.dmd.core.presentation.DmcAdapterIF;                               //  - (AdapterFormatter.java:51)
import org.dmd.core.schema.DmcAttributeInfo;                                 //  - (AdapterFormatter.java:53)
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;                 //  - (AdapterFormatter.java:54)
import org.dmd.dms.shared.generated.types.DmcTypeOriginalTypeEnumSV;         //  - (AdapterFormatter.java:60)


@SuppressWarnings("serial")
// org.dmd.dms.tools.generation.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:65)
// Called from: org.dmd.dms.tools.generation.util.AdapterFormatter.dumpAdapterSV(AdapterFormatter.java:14)
public class OriginalTypeEnumSVAdapter extends DmcTypeOriginalTypeEnumSV implements DmcAdapterIF {

    transient DmcTypeOriginalTypeEnumSV existingValue;

    public OriginalTypeEnumSVAdapter(DmcAttributeInfo ai){
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
    	existingValue = (DmcTypeOriginalTypeEnumSV) attr;
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

