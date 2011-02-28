//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmg.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.util.exceptions.ResultException;

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

	@Override
	protected Generator cloneValue(Generator original) {
		return(new Generator(original));
	}

	@SuppressWarnings("unchecked")
	@Override
	protected DmcAttribute getOneOfMe() {
		return(new DmcTypeGenerator());
	}

	@Override
	public void deserializeMV(DmcInputStreamIF dos) throws ResultException {
		throw(new ResultException("The DmcTypeGenerator object is not intended for serialization!"));
	}

	@Override
	public void deserializeSV(DmcInputStreamIF dos) throws ResultException {
		throw(new ResultException("The DmcTypeGenerator object is not intended for serialization!"));
	}

	@Override
	public void serializeType(DmcOutputStreamIF dos) throws ResultException {
		throw(new ResultException("The DmcTypeGenerator object is not intended for serialization!"));
	}

}
