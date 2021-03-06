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
 * <p/>
 * You might wonder in what circumstances you would have names that overlap. By their
 * very nature, names are usually chosen to be unique; and that's fine, as along as
 * you know before hand what names are going to be created. This mechanism is
 * primarily used for managing definitions that have been created by different
 * authors and, at some later point, used together for some reason. Flat, string
 * based names are convenient, but in cases where the same name has been given to
 * different components in different definition sets, you have to be able to distinguish
 * between them. So, definitions are named by DefinitionName, but also have a DotName
 * that provides a fully qualified name for a definition.
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
     * @return the named object
     * @throws DmcValueException if values are incorrect
     */
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException;

}
 
