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
package org.dmd.util.parsing;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.util.exceptions.*;

/**
 * This interface defines objects that can process DmcUncheckedObject after
 * their creation.
 * @author Peter Strong
 * @version 1.0
 */
public interface DmcUncheckedOIFHandlerIF {

    /**
     * Process the object as required.
     * @param obj The object to be handled.
     * @param infile Name of the file from which the object was loaded.
     * @param lineNumber TODO
     * @throws ResultException, DmcValueException 
     * @throws DmcValueExceptionSet 
     * @returns true if the processing was okay and false otherwise.
     */
    public void handleObject(DmcUncheckedObject obj, String infile, int lineNumber) throws ResultException, DmcValueException;

}
 
