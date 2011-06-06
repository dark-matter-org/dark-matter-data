//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;
import org.dmd.dms.generated.dmo.DmwWrapperDMO;
import org.dmd.dms.generated.dmw.DmwWrapperDMW;
import org.dmd.dms.generated.types.ClassDefinitionREF;

public class DmwWrapper extends DmwWrapperDMW {

	protected DmwWrapper(){
		
	}
	
	/**
	 * Constructs a new DmsDefinition for use with the meta schema.
	 */
	protected DmwWrapper(DmcObject obj){
		super(obj);
	}
	
	protected DmwWrapper(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
		if (cd != null){
			// Now that the objectClass is stored in the DmcObject as a DmcTypeClassDefinitionREF, we
			// just "resolve" the reference to point to this ClassDefinition
			DmwWrapperDMO dmo = (DmwWrapperDMO) obj;
			Iterator<ClassDefinitionREF> ocl = dmo.getObjectClass();
			if (ocl != null){
				ClassDefinitionREF cdr = ocl.next();
				if (cdr != null){
					cdr.setObject((ClassDefinitionDMO) cd.getDmcObject());
				}
			}
		}
	}

	/**
	 * Adds the specified auxiliary class to the object.
	 * @param cd The auxiliary class definition.
	 * @throws DmcValueException
	 */
	public void addAux(ClassDefinition cd) throws DmcValueException {
		ClassDefinitionREF cdr = new ClassDefinitionREF(cd.getDMO());
		core.addAux(cdr);
	}

	/**
	 * Removes the specified auxiliary class from the object.
	 * @param cd The auxiliary class definition.
	 */
	public void removeAux(ClassDefinition cd) {
		core.removeAux(cd.getName().getNameString());
	}

	/**
	 * Determines if the specified class is in our objectClass list.
	 * @param cd The class definition.
	 * @return true if the definition is there.
	 */
	public boolean hasAux(ClassDefinition cd) {
		return(core.hasAux(cd.getName().getNameString()));
	}

}
