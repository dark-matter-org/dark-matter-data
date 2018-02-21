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
package org.dmd.dmc.util;

public class JSONUtil {

	static public String escape(String value){
		String rc = value;
		
		if (rc.contains("\\"))
			rc = rc.replace("\\", "\\\\");
    	if (rc.contains("\\\\n"))
			rc = rc.replace("\\\\n", "\\n");
		if (rc.contains("\t"))
			rc = rc.replace("\t", "\\t");
		if (rc.contains("\""))
			rc = rc.replace("\"", "\\\"");
		
		return(rc);
	}
}
