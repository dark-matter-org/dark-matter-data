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
 * This interface provides a standard mechanism to access a String-based name
 * for an object as well as its construction class.
 * <P>
 * This class is used in conjunction with the ImdObjRef class to implement the
 * ImdTypeObjRef generic attribute.
 */

public interface DmcNamedObjectIF {

    /**
     * Returns the full name of an object.
     *
     * @return String
     */
    public String getName();

//    /**
//     * Returns the construction class of the object.
//     */
//    public String  getConstructionClassName();

}
