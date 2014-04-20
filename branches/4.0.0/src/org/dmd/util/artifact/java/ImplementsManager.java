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
package org.dmd.util.artifact.java;

import java.util.TreeSet;

/**
 * The ImplementsManager maintains a set of interfaces to be implemented by a class.
 */
public class ImplementsManager {

	TreeSet<String>	requiredInterfaces = new TreeSet<String>();
	
	public ImplementsManager(){
		
	}
	
	public void addImplements(String i){
		requiredInterfaces.add(i);
	}
	
	/**
	 * @return the implements statement followed by the required interfaces
	 */
	public String getFormattedImplementations(){
		
		if (requiredInterfaces.size() == 0)
			return("");
		
		StringBuffer sb = new StringBuffer();
		
		for(String s: requiredInterfaces){
			if (sb.length() == 0)
				sb.append(s);
			else
				sb.append(", " + s);
		}
		
		return("implements " + sb.toString() + " ");
	}
}
