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
package org.dmd.dmc.conversion;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcInputStreamIF;

/**
 * The AttributeReadInterceptor allows for the insertion of attribute level
 * data conversion. For instance, let's say you have an attribute that changes type from
 * one version of the schema to another. When converting the existing data, you have
 * to read the attribute as the original type and store it as the new type. 
 */
public interface AttributeReadInterceptor {

	/**
	 * Derived classes should perform whatever conversion logic is required
	 * on the specified attribute.
	 * <p/>
	 * For instance if the attribute changed from a float to a double, you would
	 * want to read a float from the input stream and write it into the attribute
	 * (making it a double). 
	 * <p/>
	 * Exactly what you do in this process will be dictated by the schema changes you've made.
	 * <p/>
	 * It is expected that you will read all data from the input stream that is associated
	 * with the attribute in question, whether it is single or multi-valued. So, obviously,
	 * you should be familiar with the serializeValue()/deserializeValue() functions associated
	 * with the the DmcType??? data type in question.
	 * <p/>
	 * For multi-valued attributes, the next piece of data in the input stream will be
	 * the number of values that need to be deserialized. Have a look at DmcAttribute.deserializeIt()
	 * to see how this is done.
	 * @param dis the input stream.
	 * @param attr the attribute container that was constructed at the current version
	 * of the schema.
	 */
	abstract public void handleAttribute(DmcInputStreamIF dis, DmcAttribute<?> attr) throws Exception;
}
