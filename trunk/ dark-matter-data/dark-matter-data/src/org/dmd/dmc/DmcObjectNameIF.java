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
package org.dmd.dmc;

public interface DmcObjectNameIF {
	
    /**
     * Return the name of the object as a String. Regardless of how the name is
     * internally represented, it must have a String representation.
     * @return The name of the object.
     */
    public String getNameString();

    /**
     * Implementors should check to see if the object if of the same type. If so,
     * use whatever comparison strategy applies to your name. If not, fall back to 
     * a String comparison.
     * @param obj The comparison object.
     * @return True if the names match.
     */
    public boolean equals(Object obj);
    
    /**
     * Returns the hash code for this name.
     * @return An int hash code.
     */
    public int hashCode();

	
}
