//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.core.interfaces;

import org.dmd.core.interfaces.DmcNamedObjectIF;
import org.dmd.dms.shared.types.DotName;
import org.dmd.dms.shared.types.DefinitionName;

/**
 * The DmcDefinitionIF interface provides a common interface for definitions
 * that are used in modelling a system or set of concepts. Primarily, this
 * interface provides standard mechanisms to identify a definition in both
 * flat and hierarchic name spaces and to provide an indication of the source
 * of the definition.
 */
public interface DmcDefinitionIF {

	public DefinitionName getName();
	
	/**
	 * @return the fully qualified dot name of the definition. This is usually
	 * of the form module.defname.type.
	 */
	public DotName getDotName();
	
	/**
	 * @return the partially qualified name of a definition that has the form defname.type
	 */
//	public DotName getNameAndTypeName();
	
	public String toOIF();
	
	public DmcNamedObjectIF getDefinedIn();
	
	
}
