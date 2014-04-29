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
package org.dmd.core.rules;

/**
 * The RuleKey provides a common basis for accessing collections of rules.
 * It forces derived classes to override hashCode() and equals().
 */
public abstract class RuleKey implements Comparable<RuleKey>{

	abstract public int hashCode();
	
	abstract public boolean equals(Object obj);
	
	abstract public String toString();

	@Override
	public int compareTo(RuleKey o) {
		return(toString().compareTo(o.toString()));
	}
}
