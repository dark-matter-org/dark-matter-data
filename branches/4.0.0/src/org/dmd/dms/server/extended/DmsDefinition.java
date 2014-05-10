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
package org.dmd.dms.server.extended;

import org.dmd.core.interfaces.DmcNamedObjectIF;
import org.dmd.core.DmcObject;
import org.dmd.dms.shared.types.DefinitionName;
import org.dmd.dms.shared.generated.dmo.DmsDefinitionDMO;
import org.dmd.dms.server.generated.dmw.DmsDefinitionDMW;

/**
 * The DmsDefinition class is the base class from which all Dark Matter Schema (DMS)
 * objects are derived.
 */
public class DmsDefinition extends DmsDefinitionDMW implements DmcNamedObjectIF {
	
	// TODO THIS CAN PROBABLY BE ELIMINATED NOW!!!
	
	// This name is only used when creating definitions for use with the MetaSchema. It
	// is required in order to allow for the bootstrapping of the MetaSchema definitions
	// when ClassDefs and the objectClass AttributeDefinition are not yet instantiated
	// but still need to have a name in order to operate properly.
	protected String metaname;

	/**
	 * Constructs a new DmsDefinition for use with the meta schema.
	 */
	protected DmsDefinition(DmcObject obj){
		super(obj);
	}
	
	protected DmsDefinition(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	protected DmsDefinition(ClassDefinition cd){
		
	}
	
	/**
	 * @return the name of this definition.
	 */
	public DefinitionName getObjectName(){
		return( ((DmsDefinitionDMO)core).getObjectName());
//		if (metaname == null)
//			return( ((DmsDefinitionDMO)core).getObjectName());
//		else
//			return(metaname);
	}
	
//	/**
//	 * @return The construction class name of this definition.
//	 */
//	public String getConstructionClassName(){
//		return( ((DmsDefinitionDMO)core).getConstructionClassName() );
//	}

	////////////////////////////////////////////////////////////////////////////////
	// DmcContainerIF implementation
	
	@Override
	public DmcObject getDmcObject() {
		return core;
	}

	@Override
	public void setDmcObject(DmcObject obj) {
		core = obj;
	}

	////////////////////////////////////////////////////////////////////////////////
	// DmcNamedObjectIF implementation
	
//	@Override
//	public String getConstructionClassName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
