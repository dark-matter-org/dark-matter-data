//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.core.schema;

import org.dmd.dms.shared.generated.enums.OriginalTypeEnum;



/**
 * The DmcTypeInfo class provides information about the types that have been defined
 * as part of a schema. Types are not limited to TypeDefinitions, they also include
 * internally defined types that represent ClassDefinitions, Enums, ComplexTypes and
 * ExtendedRefTypes.
 */
public class DmcTypeInfo {

	final public String name;
	
	final public OriginalTypeEnum originalType;
	
	/**
	 * Constructs a new DmcTypeInfo.
	 * @param n the unique name of the type.
	 */
	public DmcTypeInfo(String n, OriginalTypeEnum btn){
		name = n;
		originalType = btn;
	}
	
	
}
