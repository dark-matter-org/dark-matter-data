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
package org.dmd.dms;

import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.EnumDefinitionDMO;
import org.dmd.dms.generated.dmw.EnumDefinitionDMW;
import org.dmd.dms.types.EnumValue;

public class EnumDefinition extends EnumDefinitionDMW {

    /**
     * Default constructor.
     */
    public EnumDefinition(){
    	super(new EnumDefinitionDMO(),MetaSchemaAG._EnumDefinition);
    }
    
    public EnumDefinition(EnumDefinitionDMO obj){
    	super(obj);
    }
    
	protected EnumDefinition(String mn) throws DmcValueException {
		super(mn);
	}
	
	public EnumValue getEnumValue(String valueName){
		EnumValue rc = null;
		
		Iterator<EnumValue> values = getEnumValue();
		while(values.hasNext()){
			EnumValue value = values.next();
			if (value.getName().equals(valueName)){
				rc = value;
				break;
			}
		}
		return(rc);
	}

}

