package org.dmd.dmg.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
public class DmcTypeGenerator extends DmcAttribute<Generator> {

	@Override
	public String getString() {
		return(getSV().getGeneratorClassName());
	}

	@Override
	protected Generator typeCheck(Object value) throws DmcValueException {
		Generator rc = null;
		
		if (value instanceof Generator)
			rc = (Generator) value;
		else if (value instanceof String){
			rc = new Generator((String)value);
		}
		else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Generator expected."));

		}
		
		return(rc);
	}

}
