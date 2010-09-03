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
package org.dmd.dmc;

/**
 * The DmcNamedObjectIF interface is implemented by objects that have a naming
 * mechanism (usually based on a unique identifier). The exact format and semantics
 * of the name are application specific.
 */

public interface DmcNamedObjectIF {

    /**
     * @return The name of the object.
     */
    public String getObjectName();

    /**
     * This method should check the type of the obj param and compare the name
     * of this object with the one passed as argument.
     * @param obj The comparison object.
     * @return True if the names match.
     */
    public boolean equals(Object obj);
}
