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

/**
 * The DmcAttributeValidator class serves as a common base class for all attribute level
 * validators. It works hand in hand with the AttributeValidatorDefinition in Dark Matter
 * Schema.
 * <P>
 * DmcAttributeValidators come in two basic flavors, FULLJAVA or GWT, as indicated by the
 * OperationalContextEnum. When you implement validators, you must follow the rules of your
 * operational context.
 */
abstract public class DmcAttributeValidator {

	abstract public void validate(DmcObject obj, DmcAttribute<?> attr) throws DmcValueException;
	
	abstract public String getName();
}
