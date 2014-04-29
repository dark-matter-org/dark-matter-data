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
package org.dmd.core.interfaces;

import org.dmd.core.DmcAttribute;
import org.dmd.core.DmcObject;
import org.dmd.core.DmcObjectName;

/**
 * The DmcLoggerIF defines an entity that can handle logging functionality to
 * report problems from deep within the Dark Matter Framework. Due to the fact
 * that the operational environment for Dark Matter is quite varied, there's
 * no guarantee as to what type of logging interface is available and this 
 * interface just lets you plugin whatever logging mechanism you want.
 *
 */
public interface DmcLoggerIF {

	/**
	 * This method is called by the lazy resolution mechanisms if the logDeadReferences
	 * option has been selected on DmcOmni (
	 * @param referrer
	 * @param viaAttribute
	 * @param referenceTo
	 */
	public void logDeadReference(DmcObject referrer, DmcAttribute<?> viaAttribute, DmcObjectName referenceTo);
}
