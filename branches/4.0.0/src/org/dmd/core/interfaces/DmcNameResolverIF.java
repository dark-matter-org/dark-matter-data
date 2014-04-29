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
package org.dmd.core.interfaces;

import org.dmd.core.DmcObject;
import org.dmd.core.DmcObjectName;

/**
 * The DmcNameResolverIF interface defines an entity that maintains a name mapping for a set
 * of DmcNameObjectIF instances and can find those instances based on a DmcObjectName.
 */

public interface DmcNameResolverIF {

    /**
     * Finds a named object based on its name.
     */
    public DmcNamedObjectIF findNamedObject(DmcObjectName name);
    
    /**
     * Finds a named object based on its name and indicates the attribute via which
     * the reference is being made. This method is used via the DmcObject and is primarily
     * intended to handle the situation where we must resolve internal type definitions
     * as opposed to class definitions. This is due to the fact that we create internal
     * type definitions for classes that have the same name as the associated classes.
     */
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID);
    
    /**
     * Finds a DMO based on its name.
     * @param name
     * @return A dark-matter object.
     */
    public DmcObject findNamedDMO(DmcObjectName name);

}
 
