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

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.util.DMUncheckedObject;

/**
 * This interface defines objects that can process DmcUncheckedObject after
 * their creation.
 * @author Peter Strong
 * @version 1.0
 */
public interface DMUncheckedObjectHandlerIF {

    /**
     * Process the object as required.
     * @param obj        The object to be handled.
     * @param infile     Name of the file from which the object was loaded.
     * @param lineNumber The line in the file where the object ended.
     * @throws DMFeedbackSet
     */
    public void handleObject(DMUncheckedObject obj, String infile, int lineNumber) throws DMFeedbackSet;

}
 
