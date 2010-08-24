package org.dmd.features.extgwt.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
public class DmcTypeRegistryItem extends DmcAttribute<RegistryItem> {

	protected RegistryItem typeCheck(Object value) throws DmcValueException {
		RegistryItem rc = null;
		
        if (value instanceof RegistryItem){
            rc = (RegistryItem)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new RegistryItem(v);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with RegistryValue expected."));
        }
        
        return(rc);
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (RegistryItem e : mv){
				sb.append(e + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}
	}

}
