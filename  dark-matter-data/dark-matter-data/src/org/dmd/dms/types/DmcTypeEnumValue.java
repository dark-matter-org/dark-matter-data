package org.dmd.dms.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
public class DmcTypeEnumValue extends DmcAttribute<EnumValue> {

	protected EnumValue typeCheck(Object value) throws DmcValueException {
		EnumValue rc = null;
		
        if (value instanceof EnumValue){
            rc = (EnumValue)value;
        }
        else if (value instanceof String){
        	String v = (String)value;
        	
        	rc = new EnumValue(v);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with EnumValue expected."));
        }
        
        return(rc);
	}

	@Override
	public String getString() {
		if (sv == null){
			StringBuffer sb = new StringBuffer();
			for (EnumValue e : mv){
				sb.append(e + ", ");
			}
			return(sb.toString());
		}
		else{
			return(sv.toString());
		}
	}

}
