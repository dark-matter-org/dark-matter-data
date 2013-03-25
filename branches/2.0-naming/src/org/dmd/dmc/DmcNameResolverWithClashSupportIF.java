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
package org.dmd.dmc;

/**
 * The DmcNameResolverWithClashSupportIF interface defines an entity that maintains
 * a name mapping for a set of DmcNameObjectIF instances and can find those instances
 * based on a DmcObjectName. This type of name resolver also allows for the names
 * of objects to overlap and, potentially, be resolved by a clash resolver.
 */

public interface DmcNameResolverWithClashSupportIF extends DmcNameResolverIF {

    /**
     * Finds a named object based on its name and indicates the attribute via which
     * the reference is being made. This method is used in cases where the name space
     * used by the name resolver allows for clashes and you specify a clash resolver that
     * may be able to resolve the clash based on the context in which the resolution
     * is taking place. This is especially useful in domain specific definition sets,
     * for example dark-matter schema, or Model View Whatever (MVW) specifications
     * where you need to have naming independence so that the specs can be developed
     * without coordination between development groups. If the groups decide to
     * merge or use each other's definitions, we don't want to have name collisions.
     * @param object the object that we're resolving
     * @param name the name of the object being referred to
     * @param resolver the entity that may resolve clashes if they occur
     * @param ai the attribute being resolved
     */
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueExceptionSet;

}
 
